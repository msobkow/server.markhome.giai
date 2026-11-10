
// Description: Java 11 in-memory RAM DbIO implementation for GelSpread.

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
 *	YCFGenKbRamGelSpreadTable in-memory RAM DbIO implementation
 *	for GelSpread.
 */
public class YCFGenKbRamGelSpreadTable
	implements IYCFGenKbGelSpreadTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbGelInstructionPKey,
				YCFGenKbGelSpreadBuff > dictByPKey
		= new HashMap< YCFGenKbGelInstructionPKey,
				YCFGenKbGelSpreadBuff >();
	private Map< YCFGenKbGelSpreadByBetweenIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelSpreadBuff >> dictByBetweenIdx
		= new HashMap< YCFGenKbGelSpreadByBetweenIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelSpreadBuff >>();
	private Map< YCFGenKbGelSpreadByBeforeIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelSpreadBuff >> dictByBeforeIdx
		= new HashMap< YCFGenKbGelSpreadByBeforeIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelSpreadBuff >>();
	private Map< YCFGenKbGelSpreadByFirstIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelSpreadBuff >> dictByFirstIdx
		= new HashMap< YCFGenKbGelSpreadByFirstIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelSpreadBuff >>();
	private Map< YCFGenKbGelSpreadByEachIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelSpreadBuff >> dictByEachIdx
		= new HashMap< YCFGenKbGelSpreadByEachIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelSpreadBuff >>();
	private Map< YCFGenKbGelSpreadByLastIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelSpreadBuff >> dictByLastIdx
		= new HashMap< YCFGenKbGelSpreadByLastIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelSpreadBuff >>();
	private Map< YCFGenKbGelSpreadByLoneIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelSpreadBuff >> dictByLoneIdx
		= new HashMap< YCFGenKbGelSpreadByLoneIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelSpreadBuff >>();
	private Map< YCFGenKbGelSpreadByEmptyIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelSpreadBuff >> dictByEmptyIdx
		= new HashMap< YCFGenKbGelSpreadByEmptyIdxKey,
				Map< YCFGenKbGelInstructionPKey,
					YCFGenKbGelSpreadBuff >>();

	public YCFGenKbRamGelSpreadTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createGelSpread( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSpreadBuff Buff )
	{
		final String S_ProcName = "createGelSpread";
		schema.getTableGelInstruction().createGelInstruction( Authorization,
			Buff );
		YCFGenKbGelInstructionPKey pkey = schema.getFactoryGelInstruction().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );
		pkey.setRequiredGelInstId( Buff.getRequiredGelInstId() );
		YCFGenKbGelSpreadByBetweenIdxKey keyBetweenIdx = schema.getFactoryGelSpread().newBetweenIdxKey();
		keyBetweenIdx.setOptionalExpandBetween( Buff.getOptionalExpandBetween() );

		YCFGenKbGelSpreadByBeforeIdxKey keyBeforeIdx = schema.getFactoryGelSpread().newBeforeIdxKey();
		keyBeforeIdx.setOptionalExpandBefore( Buff.getOptionalExpandBefore() );

		YCFGenKbGelSpreadByFirstIdxKey keyFirstIdx = schema.getFactoryGelSpread().newFirstIdxKey();
		keyFirstIdx.setOptionalExpandFirst( Buff.getOptionalExpandFirst() );

		YCFGenKbGelSpreadByEachIdxKey keyEachIdx = schema.getFactoryGelSpread().newEachIdxKey();
		keyEachIdx.setRequiredExpandEach( Buff.getRequiredExpandEach() );

		YCFGenKbGelSpreadByLastIdxKey keyLastIdx = schema.getFactoryGelSpread().newLastIdxKey();
		keyLastIdx.setOptionalExpandLast( Buff.getOptionalExpandLast() );

		YCFGenKbGelSpreadByLoneIdxKey keyLoneIdx = schema.getFactoryGelSpread().newLoneIdxKey();
		keyLoneIdx.setOptionalExpandLone( Buff.getOptionalExpandLone() );

		YCFGenKbGelSpreadByEmptyIdxKey keyEmptyIdx = schema.getFactoryGelSpread().newEmptyIdxKey();
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

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff > subdictBetweenIdx;
		if( dictByBetweenIdx.containsKey( keyBetweenIdx ) ) {
			subdictBetweenIdx = dictByBetweenIdx.get( keyBetweenIdx );
		}
		else {
			subdictBetweenIdx = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff >();
			dictByBetweenIdx.put( keyBetweenIdx, subdictBetweenIdx );
		}
		subdictBetweenIdx.put( pkey, Buff );

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff > subdictBeforeIdx;
		if( dictByBeforeIdx.containsKey( keyBeforeIdx ) ) {
			subdictBeforeIdx = dictByBeforeIdx.get( keyBeforeIdx );
		}
		else {
			subdictBeforeIdx = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff >();
			dictByBeforeIdx.put( keyBeforeIdx, subdictBeforeIdx );
		}
		subdictBeforeIdx.put( pkey, Buff );

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff > subdictFirstIdx;
		if( dictByFirstIdx.containsKey( keyFirstIdx ) ) {
			subdictFirstIdx = dictByFirstIdx.get( keyFirstIdx );
		}
		else {
			subdictFirstIdx = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff >();
			dictByFirstIdx.put( keyFirstIdx, subdictFirstIdx );
		}
		subdictFirstIdx.put( pkey, Buff );

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff > subdictEachIdx;
		if( dictByEachIdx.containsKey( keyEachIdx ) ) {
			subdictEachIdx = dictByEachIdx.get( keyEachIdx );
		}
		else {
			subdictEachIdx = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff >();
			dictByEachIdx.put( keyEachIdx, subdictEachIdx );
		}
		subdictEachIdx.put( pkey, Buff );

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff > subdictLastIdx;
		if( dictByLastIdx.containsKey( keyLastIdx ) ) {
			subdictLastIdx = dictByLastIdx.get( keyLastIdx );
		}
		else {
			subdictLastIdx = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff >();
			dictByLastIdx.put( keyLastIdx, subdictLastIdx );
		}
		subdictLastIdx.put( pkey, Buff );

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff > subdictLoneIdx;
		if( dictByLoneIdx.containsKey( keyLoneIdx ) ) {
			subdictLoneIdx = dictByLoneIdx.get( keyLoneIdx );
		}
		else {
			subdictLoneIdx = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff >();
			dictByLoneIdx.put( keyLoneIdx, subdictLoneIdx );
		}
		subdictLoneIdx.put( pkey, Buff );

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff > subdictEmptyIdx;
		if( dictByEmptyIdx.containsKey( keyEmptyIdx ) ) {
			subdictEmptyIdx = dictByEmptyIdx.get( keyEmptyIdx );
		}
		else {
			subdictEmptyIdx = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff >();
			dictByEmptyIdx.put( keyEmptyIdx, subdictEmptyIdx );
		}
		subdictEmptyIdx.put( pkey, Buff );

	}

	public YCFGenKbGelSpreadBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGelSpread.readDerived";
		YCFGenKbGelInstructionPKey key = schema.getFactoryGelInstruction().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredGelCacheId( PKey.getRequiredGelCacheId() );
		key.setRequiredGelInstId( PKey.getRequiredGelInstId() );
		YCFGenKbGelSpreadBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelSpreadBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGelSpread.readDerived";
		YCFGenKbGelInstructionPKey key = schema.getFactoryGelInstruction().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredGelCacheId( PKey.getRequiredGelCacheId() );
		key.setRequiredGelInstId( PKey.getRequiredGelInstId() );
		YCFGenKbGelSpreadBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelSpreadBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamGelSpread.readAllDerived";
		YCFGenKbGelSpreadBuff[] retList = new YCFGenKbGelSpreadBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbGelSpreadBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbGelSpreadBuff[] readDerivedByTenantIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGelSpreadBuff> filteredList = new ArrayList<YCFGenKbGelSpreadBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGelSpreadBuff ) ) {
					filteredList.add( (YCFGenKbGelSpreadBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGelSpreadBuff[0] ) );
		}
	}

	public YCFGenKbGelSpreadBuff[] readDerivedByGelCacheIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGelSpreadBuff> filteredList = new ArrayList<YCFGenKbGelSpreadBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGelSpreadBuff ) ) {
					filteredList.add( (YCFGenKbGelSpreadBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGelSpreadBuff[0] ) );
		}
	}

	public YCFGenKbGelSpreadBuff[] readDerivedByChainIdx( YCFGenKbAuthorization Authorization,
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
			ArrayList<YCFGenKbGelSpreadBuff> filteredList = new ArrayList<YCFGenKbGelSpreadBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFGenKbGelSpreadBuff ) ) {
					filteredList.add( (YCFGenKbGelSpreadBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFGenKbGelSpreadBuff[0] ) );
		}
	}

	public YCFGenKbGelSpreadBuff[] readDerivedByBetweenIdx( YCFGenKbAuthorization Authorization,
		String ExpandBetween )
	{
		final String S_ProcName = "YCFGenKbRamGelSpread.readDerivedByBetweenIdx";
		YCFGenKbGelSpreadByBetweenIdxKey key = schema.getFactoryGelSpread().newBetweenIdxKey();
		key.setOptionalExpandBetween( ExpandBetween );

		YCFGenKbGelSpreadBuff[] recArray;
		if( dictByBetweenIdx.containsKey( key ) ) {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff > subdictBetweenIdx
				= dictByBetweenIdx.get( key );
			recArray = new YCFGenKbGelSpreadBuff[ subdictBetweenIdx.size() ];
			Iterator< YCFGenKbGelSpreadBuff > iter = subdictBetweenIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff > subdictBetweenIdx
				= new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff >();
			dictByBetweenIdx.put( key, subdictBetweenIdx );
			recArray = new YCFGenKbGelSpreadBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGelSpreadBuff[] readDerivedByBeforeIdx( YCFGenKbAuthorization Authorization,
		String ExpandBefore )
	{
		final String S_ProcName = "YCFGenKbRamGelSpread.readDerivedByBeforeIdx";
		YCFGenKbGelSpreadByBeforeIdxKey key = schema.getFactoryGelSpread().newBeforeIdxKey();
		key.setOptionalExpandBefore( ExpandBefore );

		YCFGenKbGelSpreadBuff[] recArray;
		if( dictByBeforeIdx.containsKey( key ) ) {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff > subdictBeforeIdx
				= dictByBeforeIdx.get( key );
			recArray = new YCFGenKbGelSpreadBuff[ subdictBeforeIdx.size() ];
			Iterator< YCFGenKbGelSpreadBuff > iter = subdictBeforeIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff > subdictBeforeIdx
				= new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff >();
			dictByBeforeIdx.put( key, subdictBeforeIdx );
			recArray = new YCFGenKbGelSpreadBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGelSpreadBuff[] readDerivedByFirstIdx( YCFGenKbAuthorization Authorization,
		String ExpandFirst )
	{
		final String S_ProcName = "YCFGenKbRamGelSpread.readDerivedByFirstIdx";
		YCFGenKbGelSpreadByFirstIdxKey key = schema.getFactoryGelSpread().newFirstIdxKey();
		key.setOptionalExpandFirst( ExpandFirst );

		YCFGenKbGelSpreadBuff[] recArray;
		if( dictByFirstIdx.containsKey( key ) ) {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff > subdictFirstIdx
				= dictByFirstIdx.get( key );
			recArray = new YCFGenKbGelSpreadBuff[ subdictFirstIdx.size() ];
			Iterator< YCFGenKbGelSpreadBuff > iter = subdictFirstIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff > subdictFirstIdx
				= new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff >();
			dictByFirstIdx.put( key, subdictFirstIdx );
			recArray = new YCFGenKbGelSpreadBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGelSpreadBuff[] readDerivedByEachIdx( YCFGenKbAuthorization Authorization,
		String ExpandEach )
	{
		final String S_ProcName = "YCFGenKbRamGelSpread.readDerivedByEachIdx";
		YCFGenKbGelSpreadByEachIdxKey key = schema.getFactoryGelSpread().newEachIdxKey();
		key.setRequiredExpandEach( ExpandEach );

		YCFGenKbGelSpreadBuff[] recArray;
		if( dictByEachIdx.containsKey( key ) ) {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff > subdictEachIdx
				= dictByEachIdx.get( key );
			recArray = new YCFGenKbGelSpreadBuff[ subdictEachIdx.size() ];
			Iterator< YCFGenKbGelSpreadBuff > iter = subdictEachIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff > subdictEachIdx
				= new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff >();
			dictByEachIdx.put( key, subdictEachIdx );
			recArray = new YCFGenKbGelSpreadBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGelSpreadBuff[] readDerivedByLastIdx( YCFGenKbAuthorization Authorization,
		String ExpandLast )
	{
		final String S_ProcName = "YCFGenKbRamGelSpread.readDerivedByLastIdx";
		YCFGenKbGelSpreadByLastIdxKey key = schema.getFactoryGelSpread().newLastIdxKey();
		key.setOptionalExpandLast( ExpandLast );

		YCFGenKbGelSpreadBuff[] recArray;
		if( dictByLastIdx.containsKey( key ) ) {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff > subdictLastIdx
				= dictByLastIdx.get( key );
			recArray = new YCFGenKbGelSpreadBuff[ subdictLastIdx.size() ];
			Iterator< YCFGenKbGelSpreadBuff > iter = subdictLastIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff > subdictLastIdx
				= new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff >();
			dictByLastIdx.put( key, subdictLastIdx );
			recArray = new YCFGenKbGelSpreadBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGelSpreadBuff[] readDerivedByLoneIdx( YCFGenKbAuthorization Authorization,
		String ExpandLone )
	{
		final String S_ProcName = "YCFGenKbRamGelSpread.readDerivedByLoneIdx";
		YCFGenKbGelSpreadByLoneIdxKey key = schema.getFactoryGelSpread().newLoneIdxKey();
		key.setOptionalExpandLone( ExpandLone );

		YCFGenKbGelSpreadBuff[] recArray;
		if( dictByLoneIdx.containsKey( key ) ) {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff > subdictLoneIdx
				= dictByLoneIdx.get( key );
			recArray = new YCFGenKbGelSpreadBuff[ subdictLoneIdx.size() ];
			Iterator< YCFGenKbGelSpreadBuff > iter = subdictLoneIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff > subdictLoneIdx
				= new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff >();
			dictByLoneIdx.put( key, subdictLoneIdx );
			recArray = new YCFGenKbGelSpreadBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGelSpreadBuff[] readDerivedByEmptyIdx( YCFGenKbAuthorization Authorization,
		String ExpandEmpty )
	{
		final String S_ProcName = "YCFGenKbRamGelSpread.readDerivedByEmptyIdx";
		YCFGenKbGelSpreadByEmptyIdxKey key = schema.getFactoryGelSpread().newEmptyIdxKey();
		key.setOptionalExpandEmpty( ExpandEmpty );

		YCFGenKbGelSpreadBuff[] recArray;
		if( dictByEmptyIdx.containsKey( key ) ) {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff > subdictEmptyIdx
				= dictByEmptyIdx.get( key );
			recArray = new YCFGenKbGelSpreadBuff[ subdictEmptyIdx.size() ];
			Iterator< YCFGenKbGelSpreadBuff > iter = subdictEmptyIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff > subdictEmptyIdx
				= new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff >();
			dictByEmptyIdx.put( key, subdictEmptyIdx );
			recArray = new YCFGenKbGelSpreadBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGelSpreadBuff readDerivedByPIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readDerivedByPIdx() ";
		YCFGenKbGelInstructionPKey key = schema.getFactoryGelInstruction().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );
		key.setRequiredGelInstId( GelInstId );

		YCFGenKbGelSpreadBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelSpreadBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGelSpread.readBuff";
		YCFGenKbGelSpreadBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a918" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelSpreadBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbGelSpreadBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a918" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelSpreadBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamGelSpread.readAllBuff";
		YCFGenKbGelSpreadBuff buff;
		ArrayList<YCFGenKbGelSpreadBuff> filteredList = new ArrayList<YCFGenKbGelSpreadBuff>();
		YCFGenKbGelSpreadBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a918" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelSpreadBuff[0] ) );
	}

	public YCFGenKbGelSpreadBuff readBuffByPIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		long GelInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readBuffByPIdx() ";
		YCFGenKbGelSpreadBuff buff = readDerivedByPIdx( Authorization,
			TenantId,
			GelCacheId,
			GelInstId );
		if( ( buff != null ) && buff.getClassCode().equals( "a916" ) ) {
			return( (YCFGenKbGelSpreadBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbGelSpreadBuff[] readBuffByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readBuffByTenantIdx() ";
		YCFGenKbGelSpreadBuff buff;
		ArrayList<YCFGenKbGelSpreadBuff> filteredList = new ArrayList<YCFGenKbGelSpreadBuff>();
		YCFGenKbGelSpreadBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a916" ) ) {
				filteredList.add( (YCFGenKbGelSpreadBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelSpreadBuff[0] ) );
	}

	public YCFGenKbGelSpreadBuff[] readBuffByGelCacheIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readBuffByGelCacheIdx() ";
		YCFGenKbGelSpreadBuff buff;
		ArrayList<YCFGenKbGelSpreadBuff> filteredList = new ArrayList<YCFGenKbGelSpreadBuff>();
		YCFGenKbGelSpreadBuff[] buffList = readDerivedByGelCacheIdx( Authorization,
			TenantId,
			GelCacheId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a916" ) ) {
				filteredList.add( (YCFGenKbGelSpreadBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelSpreadBuff[0] ) );
	}

	public YCFGenKbGelSpreadBuff[] readBuffByChainIdx( YCFGenKbAuthorization Authorization,
		Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId )
	{
		final String S_ProcName = "YCFGenKbRamGelInstruction.readBuffByChainIdx() ";
		YCFGenKbGelSpreadBuff buff;
		ArrayList<YCFGenKbGelSpreadBuff> filteredList = new ArrayList<YCFGenKbGelSpreadBuff>();
		YCFGenKbGelSpreadBuff[] buffList = readDerivedByChainIdx( Authorization,
			ChainInstTenantId,
			ChainInstGelCacheId,
			ChainInstGelInstId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a916" ) ) {
				filteredList.add( (YCFGenKbGelSpreadBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelSpreadBuff[0] ) );
	}

	public YCFGenKbGelSpreadBuff[] readBuffByBetweenIdx( YCFGenKbAuthorization Authorization,
		String ExpandBetween )
	{
		final String S_ProcName = "YCFGenKbRamGelSpread.readBuffByBetweenIdx() ";
		YCFGenKbGelSpreadBuff buff;
		ArrayList<YCFGenKbGelSpreadBuff> filteredList = new ArrayList<YCFGenKbGelSpreadBuff>();
		YCFGenKbGelSpreadBuff[] buffList = readDerivedByBetweenIdx( Authorization,
			ExpandBetween );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a918" ) ) {
				filteredList.add( (YCFGenKbGelSpreadBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelSpreadBuff[0] ) );
	}

	public YCFGenKbGelSpreadBuff[] readBuffByBeforeIdx( YCFGenKbAuthorization Authorization,
		String ExpandBefore )
	{
		final String S_ProcName = "YCFGenKbRamGelSpread.readBuffByBeforeIdx() ";
		YCFGenKbGelSpreadBuff buff;
		ArrayList<YCFGenKbGelSpreadBuff> filteredList = new ArrayList<YCFGenKbGelSpreadBuff>();
		YCFGenKbGelSpreadBuff[] buffList = readDerivedByBeforeIdx( Authorization,
			ExpandBefore );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a918" ) ) {
				filteredList.add( (YCFGenKbGelSpreadBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelSpreadBuff[0] ) );
	}

	public YCFGenKbGelSpreadBuff[] readBuffByFirstIdx( YCFGenKbAuthorization Authorization,
		String ExpandFirst )
	{
		final String S_ProcName = "YCFGenKbRamGelSpread.readBuffByFirstIdx() ";
		YCFGenKbGelSpreadBuff buff;
		ArrayList<YCFGenKbGelSpreadBuff> filteredList = new ArrayList<YCFGenKbGelSpreadBuff>();
		YCFGenKbGelSpreadBuff[] buffList = readDerivedByFirstIdx( Authorization,
			ExpandFirst );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a918" ) ) {
				filteredList.add( (YCFGenKbGelSpreadBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelSpreadBuff[0] ) );
	}

	public YCFGenKbGelSpreadBuff[] readBuffByEachIdx( YCFGenKbAuthorization Authorization,
		String ExpandEach )
	{
		final String S_ProcName = "YCFGenKbRamGelSpread.readBuffByEachIdx() ";
		YCFGenKbGelSpreadBuff buff;
		ArrayList<YCFGenKbGelSpreadBuff> filteredList = new ArrayList<YCFGenKbGelSpreadBuff>();
		YCFGenKbGelSpreadBuff[] buffList = readDerivedByEachIdx( Authorization,
			ExpandEach );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a918" ) ) {
				filteredList.add( (YCFGenKbGelSpreadBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelSpreadBuff[0] ) );
	}

	public YCFGenKbGelSpreadBuff[] readBuffByLastIdx( YCFGenKbAuthorization Authorization,
		String ExpandLast )
	{
		final String S_ProcName = "YCFGenKbRamGelSpread.readBuffByLastIdx() ";
		YCFGenKbGelSpreadBuff buff;
		ArrayList<YCFGenKbGelSpreadBuff> filteredList = new ArrayList<YCFGenKbGelSpreadBuff>();
		YCFGenKbGelSpreadBuff[] buffList = readDerivedByLastIdx( Authorization,
			ExpandLast );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a918" ) ) {
				filteredList.add( (YCFGenKbGelSpreadBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelSpreadBuff[0] ) );
	}

	public YCFGenKbGelSpreadBuff[] readBuffByLoneIdx( YCFGenKbAuthorization Authorization,
		String ExpandLone )
	{
		final String S_ProcName = "YCFGenKbRamGelSpread.readBuffByLoneIdx() ";
		YCFGenKbGelSpreadBuff buff;
		ArrayList<YCFGenKbGelSpreadBuff> filteredList = new ArrayList<YCFGenKbGelSpreadBuff>();
		YCFGenKbGelSpreadBuff[] buffList = readDerivedByLoneIdx( Authorization,
			ExpandLone );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a918" ) ) {
				filteredList.add( (YCFGenKbGelSpreadBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelSpreadBuff[0] ) );
	}

	public YCFGenKbGelSpreadBuff[] readBuffByEmptyIdx( YCFGenKbAuthorization Authorization,
		String ExpandEmpty )
	{
		final String S_ProcName = "YCFGenKbRamGelSpread.readBuffByEmptyIdx() ";
		YCFGenKbGelSpreadBuff buff;
		ArrayList<YCFGenKbGelSpreadBuff> filteredList = new ArrayList<YCFGenKbGelSpreadBuff>();
		YCFGenKbGelSpreadBuff[] buffList = readDerivedByEmptyIdx( Authorization,
			ExpandEmpty );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a918" ) ) {
				filteredList.add( (YCFGenKbGelSpreadBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelSpreadBuff[0] ) );
	}

	/**
	 *	Read a page array of the specific GelSpread buffer instances identified by the duplicate key BetweenIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpandBetween	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGelSpreadBuff[] pageBuffByBetweenIdx( YCFGenKbAuthorization Authorization,
		String ExpandBetween,
		Long priorTenantId,
		Long priorGelCacheId,
		Long priorGelInstId )
	{
		final String S_ProcName = "pageBuffByBetweenIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific GelSpread buffer instances identified by the duplicate key BeforeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpandBefore	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGelSpreadBuff[] pageBuffByBeforeIdx( YCFGenKbAuthorization Authorization,
		String ExpandBefore,
		Long priorTenantId,
		Long priorGelCacheId,
		Long priorGelInstId )
	{
		final String S_ProcName = "pageBuffByBeforeIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific GelSpread buffer instances identified by the duplicate key FirstIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpandFirst	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGelSpreadBuff[] pageBuffByFirstIdx( YCFGenKbAuthorization Authorization,
		String ExpandFirst,
		Long priorTenantId,
		Long priorGelCacheId,
		Long priorGelInstId )
	{
		final String S_ProcName = "pageBuffByFirstIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific GelSpread buffer instances identified by the duplicate key EachIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpandEach	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGelSpreadBuff[] pageBuffByEachIdx( YCFGenKbAuthorization Authorization,
		String ExpandEach,
		Long priorTenantId,
		Long priorGelCacheId,
		Long priorGelInstId )
	{
		final String S_ProcName = "pageBuffByEachIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific GelSpread buffer instances identified by the duplicate key LastIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpandLast	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGelSpreadBuff[] pageBuffByLastIdx( YCFGenKbAuthorization Authorization,
		String ExpandLast,
		Long priorTenantId,
		Long priorGelCacheId,
		Long priorGelInstId )
	{
		final String S_ProcName = "pageBuffByLastIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific GelSpread buffer instances identified by the duplicate key LoneIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpandLone	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGelSpreadBuff[] pageBuffByLoneIdx( YCFGenKbAuthorization Authorization,
		String ExpandLone,
		Long priorTenantId,
		Long priorGelCacheId,
		Long priorGelInstId )
	{
		final String S_ProcName = "pageBuffByLoneIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific GelSpread buffer instances identified by the duplicate key EmptyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpandEmpty	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbGelSpreadBuff[] pageBuffByEmptyIdx( YCFGenKbAuthorization Authorization,
		String ExpandEmpty,
		Long priorTenantId,
		Long priorGelCacheId,
		Long priorGelInstId )
	{
		final String S_ProcName = "pageBuffByEmptyIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateGelSpread( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSpreadBuff Buff )
	{
		schema.getTableGelInstruction().updateGelInstruction( Authorization,
			Buff );
		YCFGenKbGelInstructionPKey pkey = schema.getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );
		pkey.setRequiredGelInstId( Buff.getRequiredGelInstId() );
		YCFGenKbGelSpreadBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateGelSpread",
				"Existing record not found",
				"GelSpread",
				pkey );
		}
		YCFGenKbGelSpreadByBetweenIdxKey existingKeyBetweenIdx = schema.getFactoryGelSpread().newBetweenIdxKey();
		existingKeyBetweenIdx.setOptionalExpandBetween( existing.getOptionalExpandBetween() );

		YCFGenKbGelSpreadByBetweenIdxKey newKeyBetweenIdx = schema.getFactoryGelSpread().newBetweenIdxKey();
		newKeyBetweenIdx.setOptionalExpandBetween( Buff.getOptionalExpandBetween() );

		YCFGenKbGelSpreadByBeforeIdxKey existingKeyBeforeIdx = schema.getFactoryGelSpread().newBeforeIdxKey();
		existingKeyBeforeIdx.setOptionalExpandBefore( existing.getOptionalExpandBefore() );

		YCFGenKbGelSpreadByBeforeIdxKey newKeyBeforeIdx = schema.getFactoryGelSpread().newBeforeIdxKey();
		newKeyBeforeIdx.setOptionalExpandBefore( Buff.getOptionalExpandBefore() );

		YCFGenKbGelSpreadByFirstIdxKey existingKeyFirstIdx = schema.getFactoryGelSpread().newFirstIdxKey();
		existingKeyFirstIdx.setOptionalExpandFirst( existing.getOptionalExpandFirst() );

		YCFGenKbGelSpreadByFirstIdxKey newKeyFirstIdx = schema.getFactoryGelSpread().newFirstIdxKey();
		newKeyFirstIdx.setOptionalExpandFirst( Buff.getOptionalExpandFirst() );

		YCFGenKbGelSpreadByEachIdxKey existingKeyEachIdx = schema.getFactoryGelSpread().newEachIdxKey();
		existingKeyEachIdx.setRequiredExpandEach( existing.getRequiredExpandEach() );

		YCFGenKbGelSpreadByEachIdxKey newKeyEachIdx = schema.getFactoryGelSpread().newEachIdxKey();
		newKeyEachIdx.setRequiredExpandEach( Buff.getRequiredExpandEach() );

		YCFGenKbGelSpreadByLastIdxKey existingKeyLastIdx = schema.getFactoryGelSpread().newLastIdxKey();
		existingKeyLastIdx.setOptionalExpandLast( existing.getOptionalExpandLast() );

		YCFGenKbGelSpreadByLastIdxKey newKeyLastIdx = schema.getFactoryGelSpread().newLastIdxKey();
		newKeyLastIdx.setOptionalExpandLast( Buff.getOptionalExpandLast() );

		YCFGenKbGelSpreadByLoneIdxKey existingKeyLoneIdx = schema.getFactoryGelSpread().newLoneIdxKey();
		existingKeyLoneIdx.setOptionalExpandLone( existing.getOptionalExpandLone() );

		YCFGenKbGelSpreadByLoneIdxKey newKeyLoneIdx = schema.getFactoryGelSpread().newLoneIdxKey();
		newKeyLoneIdx.setOptionalExpandLone( Buff.getOptionalExpandLone() );

		YCFGenKbGelSpreadByEmptyIdxKey existingKeyEmptyIdx = schema.getFactoryGelSpread().newEmptyIdxKey();
		existingKeyEmptyIdx.setOptionalExpandEmpty( existing.getOptionalExpandEmpty() );

		YCFGenKbGelSpreadByEmptyIdxKey newKeyEmptyIdx = schema.getFactoryGelSpread().newEmptyIdxKey();
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
						"updateGelSpread",
						"Superclass",
						"SuperClass",
						"GelInstruction",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByBetweenIdx.get( existingKeyBetweenIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByBetweenIdx.containsKey( newKeyBetweenIdx ) ) {
			subdict = dictByBetweenIdx.get( newKeyBetweenIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff >();
			dictByBetweenIdx.put( newKeyBetweenIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByBeforeIdx.get( existingKeyBeforeIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByBeforeIdx.containsKey( newKeyBeforeIdx ) ) {
			subdict = dictByBeforeIdx.get( newKeyBeforeIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff >();
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
			subdict = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff >();
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
			subdict = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff >();
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
			subdict = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff >();
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
			subdict = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff >();
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
			subdict = new HashMap< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff >();
			dictByEmptyIdx.put( newKeyEmptyIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteGelSpread( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSpreadBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamGelSpreadTable.deleteGelSpread() ";
		String classCode;
		YCFGenKbGelInstructionPKey pkey = schema.getFactoryGelInstruction().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );
		pkey.setRequiredGelInstId( Buff.getRequiredGelInstId() );
		YCFGenKbGelSpreadBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteGelSpread",
				pkey );
		}
		YCFGenKbGelSpreadByBetweenIdxKey keyBetweenIdx = schema.getFactoryGelSpread().newBetweenIdxKey();
		keyBetweenIdx.setOptionalExpandBetween( existing.getOptionalExpandBetween() );

		YCFGenKbGelSpreadByBeforeIdxKey keyBeforeIdx = schema.getFactoryGelSpread().newBeforeIdxKey();
		keyBeforeIdx.setOptionalExpandBefore( existing.getOptionalExpandBefore() );

		YCFGenKbGelSpreadByFirstIdxKey keyFirstIdx = schema.getFactoryGelSpread().newFirstIdxKey();
		keyFirstIdx.setOptionalExpandFirst( existing.getOptionalExpandFirst() );

		YCFGenKbGelSpreadByEachIdxKey keyEachIdx = schema.getFactoryGelSpread().newEachIdxKey();
		keyEachIdx.setRequiredExpandEach( existing.getRequiredExpandEach() );

		YCFGenKbGelSpreadByLastIdxKey keyLastIdx = schema.getFactoryGelSpread().newLastIdxKey();
		keyLastIdx.setOptionalExpandLast( existing.getOptionalExpandLast() );

		YCFGenKbGelSpreadByLoneIdxKey keyLoneIdx = schema.getFactoryGelSpread().newLoneIdxKey();
		keyLoneIdx.setOptionalExpandLone( existing.getOptionalExpandLone() );

		YCFGenKbGelSpreadByEmptyIdxKey keyEmptyIdx = schema.getFactoryGelSpread().newEmptyIdxKey();
		keyEmptyIdx.setOptionalExpandEmpty( existing.getOptionalExpandEmpty() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFGenKbGelInstructionPKey, YCFGenKbGelSpreadBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByBetweenIdx.get( keyBetweenIdx );
		subdict.remove( pkey );

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
	public void deleteGelSpreadByBetweenIdx( YCFGenKbAuthorization Authorization,
		String argExpandBetween )
	{
		YCFGenKbGelSpreadByBetweenIdxKey key = schema.getFactoryGelSpread().newBetweenIdxKey();
		key.setOptionalExpandBetween( argExpandBetween );
		deleteGelSpreadByBetweenIdx( Authorization, key );
	}

	public void deleteGelSpreadByBetweenIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSpreadByBetweenIdxKey argKey )
	{
		YCFGenKbGelSpreadBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalExpandBetween() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelSpreadBuff> matchSet = new LinkedList<YCFGenKbGelSpreadBuff>();
		Iterator<YCFGenKbGelSpreadBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelSpreadBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelSpread().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelSpread( Authorization, cur );
		}
	}

	public void deleteGelSpreadByBeforeIdx( YCFGenKbAuthorization Authorization,
		String argExpandBefore )
	{
		YCFGenKbGelSpreadByBeforeIdxKey key = schema.getFactoryGelSpread().newBeforeIdxKey();
		key.setOptionalExpandBefore( argExpandBefore );
		deleteGelSpreadByBeforeIdx( Authorization, key );
	}

	public void deleteGelSpreadByBeforeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSpreadByBeforeIdxKey argKey )
	{
		YCFGenKbGelSpreadBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalExpandBefore() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelSpreadBuff> matchSet = new LinkedList<YCFGenKbGelSpreadBuff>();
		Iterator<YCFGenKbGelSpreadBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelSpreadBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelSpread().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelSpread( Authorization, cur );
		}
	}

	public void deleteGelSpreadByFirstIdx( YCFGenKbAuthorization Authorization,
		String argExpandFirst )
	{
		YCFGenKbGelSpreadByFirstIdxKey key = schema.getFactoryGelSpread().newFirstIdxKey();
		key.setOptionalExpandFirst( argExpandFirst );
		deleteGelSpreadByFirstIdx( Authorization, key );
	}

	public void deleteGelSpreadByFirstIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSpreadByFirstIdxKey argKey )
	{
		YCFGenKbGelSpreadBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalExpandFirst() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelSpreadBuff> matchSet = new LinkedList<YCFGenKbGelSpreadBuff>();
		Iterator<YCFGenKbGelSpreadBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelSpreadBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelSpread().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelSpread( Authorization, cur );
		}
	}

	public void deleteGelSpreadByEachIdx( YCFGenKbAuthorization Authorization,
		String argExpandEach )
	{
		YCFGenKbGelSpreadByEachIdxKey key = schema.getFactoryGelSpread().newEachIdxKey();
		key.setRequiredExpandEach( argExpandEach );
		deleteGelSpreadByEachIdx( Authorization, key );
	}

	public void deleteGelSpreadByEachIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSpreadByEachIdxKey argKey )
	{
		YCFGenKbGelSpreadBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelSpreadBuff> matchSet = new LinkedList<YCFGenKbGelSpreadBuff>();
		Iterator<YCFGenKbGelSpreadBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelSpreadBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelSpread().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelSpread( Authorization, cur );
		}
	}

	public void deleteGelSpreadByLastIdx( YCFGenKbAuthorization Authorization,
		String argExpandLast )
	{
		YCFGenKbGelSpreadByLastIdxKey key = schema.getFactoryGelSpread().newLastIdxKey();
		key.setOptionalExpandLast( argExpandLast );
		deleteGelSpreadByLastIdx( Authorization, key );
	}

	public void deleteGelSpreadByLastIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSpreadByLastIdxKey argKey )
	{
		YCFGenKbGelSpreadBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalExpandLast() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelSpreadBuff> matchSet = new LinkedList<YCFGenKbGelSpreadBuff>();
		Iterator<YCFGenKbGelSpreadBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelSpreadBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelSpread().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelSpread( Authorization, cur );
		}
	}

	public void deleteGelSpreadByLoneIdx( YCFGenKbAuthorization Authorization,
		String argExpandLone )
	{
		YCFGenKbGelSpreadByLoneIdxKey key = schema.getFactoryGelSpread().newLoneIdxKey();
		key.setOptionalExpandLone( argExpandLone );
		deleteGelSpreadByLoneIdx( Authorization, key );
	}

	public void deleteGelSpreadByLoneIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSpreadByLoneIdxKey argKey )
	{
		YCFGenKbGelSpreadBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalExpandLone() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelSpreadBuff> matchSet = new LinkedList<YCFGenKbGelSpreadBuff>();
		Iterator<YCFGenKbGelSpreadBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelSpreadBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelSpread().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelSpread( Authorization, cur );
		}
	}

	public void deleteGelSpreadByEmptyIdx( YCFGenKbAuthorization Authorization,
		String argExpandEmpty )
	{
		YCFGenKbGelSpreadByEmptyIdxKey key = schema.getFactoryGelSpread().newEmptyIdxKey();
		key.setOptionalExpandEmpty( argExpandEmpty );
		deleteGelSpreadByEmptyIdx( Authorization, key );
	}

	public void deleteGelSpreadByEmptyIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSpreadByEmptyIdxKey argKey )
	{
		YCFGenKbGelSpreadBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalExpandEmpty() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelSpreadBuff> matchSet = new LinkedList<YCFGenKbGelSpreadBuff>();
		Iterator<YCFGenKbGelSpreadBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelSpreadBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelSpread().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelSpread( Authorization, cur );
		}
	}

	public void deleteGelSpreadByPIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argGelCacheId,
		long argGelInstId )
	{
		YCFGenKbGelInstructionPKey key = schema.getFactoryGelInstruction().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredGelCacheId( argGelCacheId );
		key.setRequiredGelInstId( argGelInstId );
		deleteGelSpreadByPIdx( Authorization, key );
	}

	public void deleteGelSpreadByPIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbGelSpreadBuff cur;
		LinkedList<YCFGenKbGelSpreadBuff> matchSet = new LinkedList<YCFGenKbGelSpreadBuff>();
		Iterator<YCFGenKbGelSpreadBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelSpreadBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelSpread().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelSpread( Authorization, cur );
		}
	}

	public void deleteGelSpreadByTenantIdx( YCFGenKbAuthorization Authorization,
		long argTenantId )
	{
		YCFGenKbGelInstructionByTenantIdxKey key = schema.getFactoryGelInstruction().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteGelSpreadByTenantIdx( Authorization, key );
	}

	public void deleteGelSpreadByTenantIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByTenantIdxKey argKey )
	{
		YCFGenKbGelSpreadBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelSpreadBuff> matchSet = new LinkedList<YCFGenKbGelSpreadBuff>();
		Iterator<YCFGenKbGelSpreadBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelSpreadBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelSpread().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelSpread( Authorization, cur );
		}
	}

	public void deleteGelSpreadByGelCacheIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argGelCacheId )
	{
		YCFGenKbGelInstructionByGelCacheIdxKey key = schema.getFactoryGelInstruction().newGelCacheIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredGelCacheId( argGelCacheId );
		deleteGelSpreadByGelCacheIdx( Authorization, key );
	}

	public void deleteGelSpreadByGelCacheIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByGelCacheIdxKey argKey )
	{
		YCFGenKbGelSpreadBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelSpreadBuff> matchSet = new LinkedList<YCFGenKbGelSpreadBuff>();
		Iterator<YCFGenKbGelSpreadBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelSpreadBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelSpread().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelSpread( Authorization, cur );
		}
	}

	public void deleteGelSpreadByChainIdx( YCFGenKbAuthorization Authorization,
		Long argChainInstTenantId,
		Long argChainInstGelCacheId,
		Long argChainInstGelInstId )
	{
		YCFGenKbGelInstructionByChainIdxKey key = schema.getFactoryGelInstruction().newChainIdxKey();
		key.setOptionalChainInstTenantId( argChainInstTenantId );
		key.setOptionalChainInstGelCacheId( argChainInstGelCacheId );
		key.setOptionalChainInstGelInstId( argChainInstGelInstId );
		deleteGelSpreadByChainIdx( Authorization, key );
	}

	public void deleteGelSpreadByChainIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByChainIdxKey argKey )
	{
		YCFGenKbGelSpreadBuff cur;
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
		LinkedList<YCFGenKbGelSpreadBuff> matchSet = new LinkedList<YCFGenKbGelSpreadBuff>();
		Iterator<YCFGenKbGelSpreadBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelSpreadBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelSpread().readDerivedByPIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId(),
				cur.getRequiredGelInstId() );
			deleteGelSpread( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
