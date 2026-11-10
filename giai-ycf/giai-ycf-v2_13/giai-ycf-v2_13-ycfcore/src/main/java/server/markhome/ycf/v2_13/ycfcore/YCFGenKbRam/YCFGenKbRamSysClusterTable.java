
// Description: Java 11 in-memory RAM DbIO implementation for SysCluster.

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
 *	YCFGenKbRamSysClusterTable in-memory RAM DbIO implementation
 *	for SysCluster.
 */
public class YCFGenKbRamSysClusterTable
	implements IYCFGenKbSysClusterTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbSysClusterPKey,
				YCFGenKbSysClusterBuff > dictByPKey
		= new HashMap< YCFGenKbSysClusterPKey,
				YCFGenKbSysClusterBuff >();
	private Map< YCFGenKbSysClusterByClusterIdxKey,
				Map< YCFGenKbSysClusterPKey,
					YCFGenKbSysClusterBuff >> dictByClusterIdx
		= new HashMap< YCFGenKbSysClusterByClusterIdxKey,
				Map< YCFGenKbSysClusterPKey,
					YCFGenKbSysClusterBuff >>();

	public YCFGenKbRamSysClusterTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createSysCluster( YCFGenKbAuthorization Authorization,
		YCFGenKbSysClusterBuff Buff )
	{
		final String S_ProcName = "createSysCluster";
		YCFGenKbSysClusterPKey pkey = schema.getFactorySysCluster().newPKey();
		pkey.setRequiredSingletonId( Buff.getRequiredSingletonId() );
		Buff.setRequiredSingletonId( pkey.getRequiredSingletonId() );
		YCFGenKbSysClusterByClusterIdxKey keyClusterIdx = schema.getFactorySysCluster().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		// Validate foreign keys

		{
			boolean allNull = true;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableCluster().readDerivedByIdIdx( Authorization,
						Buff.getRequiredClusterId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"SysClusterCluster",
						"Cluster",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFGenKbSysClusterPKey, YCFGenKbSysClusterBuff > subdictClusterIdx;
		if( dictByClusterIdx.containsKey( keyClusterIdx ) ) {
			subdictClusterIdx = dictByClusterIdx.get( keyClusterIdx );
		}
		else {
			subdictClusterIdx = new HashMap< YCFGenKbSysClusterPKey, YCFGenKbSysClusterBuff >();
			dictByClusterIdx.put( keyClusterIdx, subdictClusterIdx );
		}
		subdictClusterIdx.put( pkey, Buff );

	}

	public YCFGenKbSysClusterBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSysClusterPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamSysCluster.readDerived";
		YCFGenKbSysClusterPKey key = schema.getFactorySysCluster().newPKey();
		key.setRequiredSingletonId( PKey.getRequiredSingletonId() );
		YCFGenKbSysClusterBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSysClusterBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSysClusterPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamSysCluster.readDerived";
		YCFGenKbSysClusterPKey key = schema.getFactorySysCluster().newPKey();
		key.setRequiredSingletonId( PKey.getRequiredSingletonId() );
		YCFGenKbSysClusterBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSysClusterBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamSysCluster.readAllDerived";
		YCFGenKbSysClusterBuff[] retList = new YCFGenKbSysClusterBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbSysClusterBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbSysClusterBuff[] readDerivedByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFGenKbRamSysCluster.readDerivedByClusterIdx";
		YCFGenKbSysClusterByClusterIdxKey key = schema.getFactorySysCluster().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );

		YCFGenKbSysClusterBuff[] recArray;
		if( dictByClusterIdx.containsKey( key ) ) {
			Map< YCFGenKbSysClusterPKey, YCFGenKbSysClusterBuff > subdictClusterIdx
				= dictByClusterIdx.get( key );
			recArray = new YCFGenKbSysClusterBuff[ subdictClusterIdx.size() ];
			Iterator< YCFGenKbSysClusterBuff > iter = subdictClusterIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbSysClusterPKey, YCFGenKbSysClusterBuff > subdictClusterIdx
				= new HashMap< YCFGenKbSysClusterPKey, YCFGenKbSysClusterBuff >();
			dictByClusterIdx.put( key, subdictClusterIdx );
			recArray = new YCFGenKbSysClusterBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbSysClusterBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
		int SingletonId )
	{
		final String S_ProcName = "YCFGenKbRamSysCluster.readDerivedByIdIdx() ";
		YCFGenKbSysClusterPKey key = schema.getFactorySysCluster().newPKey();
		key.setRequiredSingletonId( SingletonId );

		YCFGenKbSysClusterBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSysClusterBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSysClusterPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamSysCluster.readBuff";
		YCFGenKbSysClusterBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a90f" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSysClusterBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSysClusterPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbSysClusterBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a90f" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSysClusterBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamSysCluster.readAllBuff";
		YCFGenKbSysClusterBuff buff;
		ArrayList<YCFGenKbSysClusterBuff> filteredList = new ArrayList<YCFGenKbSysClusterBuff>();
		YCFGenKbSysClusterBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a90f" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSysClusterBuff[0] ) );
	}

	public YCFGenKbSysClusterBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
		int SingletonId )
	{
		final String S_ProcName = "YCFGenKbRamSysCluster.readBuffByIdIdx() ";
		YCFGenKbSysClusterBuff buff = readDerivedByIdIdx( Authorization,
			SingletonId );
		if( ( buff != null ) && buff.getClassCode().equals( "a90f" ) ) {
			return( (YCFGenKbSysClusterBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbSysClusterBuff[] readBuffByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFGenKbRamSysCluster.readBuffByClusterIdx() ";
		YCFGenKbSysClusterBuff buff;
		ArrayList<YCFGenKbSysClusterBuff> filteredList = new ArrayList<YCFGenKbSysClusterBuff>();
		YCFGenKbSysClusterBuff[] buffList = readDerivedByClusterIdx( Authorization,
			ClusterId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a90f" ) ) {
				filteredList.add( (YCFGenKbSysClusterBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSysClusterBuff[0] ) );
	}

	public void updateSysCluster( YCFGenKbAuthorization Authorization,
		YCFGenKbSysClusterBuff Buff )
	{
		YCFGenKbSysClusterPKey pkey = schema.getFactorySysCluster().newPKey();
		pkey.setRequiredSingletonId( Buff.getRequiredSingletonId() );
		YCFGenKbSysClusterBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateSysCluster",
				"Existing record not found",
				"SysCluster",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateSysCluster",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFGenKbSysClusterByClusterIdxKey existingKeyClusterIdx = schema.getFactorySysCluster().newClusterIdxKey();
		existingKeyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFGenKbSysClusterByClusterIdxKey newKeyClusterIdx = schema.getFactorySysCluster().newClusterIdxKey();
		newKeyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		// Check unique indexes

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableCluster().readDerivedByIdIdx( Authorization,
						Buff.getRequiredClusterId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateSysCluster",
						"Container",
						"SysClusterCluster",
						"Cluster",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFGenKbSysClusterPKey, YCFGenKbSysClusterBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByClusterIdx.get( existingKeyClusterIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByClusterIdx.containsKey( newKeyClusterIdx ) ) {
			subdict = dictByClusterIdx.get( newKeyClusterIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbSysClusterPKey, YCFGenKbSysClusterBuff >();
			dictByClusterIdx.put( newKeyClusterIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteSysCluster( YCFGenKbAuthorization Authorization,
		YCFGenKbSysClusterBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamSysClusterTable.deleteSysCluster() ";
		String classCode;
		YCFGenKbSysClusterPKey pkey = schema.getFactorySysCluster().newPKey();
		pkey.setRequiredSingletonId( Buff.getRequiredSingletonId() );
		YCFGenKbSysClusterBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteSysCluster",
				pkey );
		}
		YCFGenKbSysClusterByClusterIdxKey keyClusterIdx = schema.getFactorySysCluster().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFGenKbSysClusterPKey, YCFGenKbSysClusterBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByClusterIdx.get( keyClusterIdx );
		subdict.remove( pkey );

	}
	public void deleteSysClusterByIdIdx( YCFGenKbAuthorization Authorization,
		int argSingletonId )
	{
		YCFGenKbSysClusterPKey key = schema.getFactorySysCluster().newPKey();
		key.setRequiredSingletonId( argSingletonId );
		deleteSysClusterByIdIdx( Authorization, key );
	}

	public void deleteSysClusterByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSysClusterPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbSysClusterBuff cur;
		LinkedList<YCFGenKbSysClusterBuff> matchSet = new LinkedList<YCFGenKbSysClusterBuff>();
		Iterator<YCFGenKbSysClusterBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSysClusterBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSysCluster().readDerivedByIdIdx( Authorization,
				cur.getRequiredSingletonId() );
			deleteSysCluster( Authorization, cur );
		}
	}

	public void deleteSysClusterByClusterIdx( YCFGenKbAuthorization Authorization,
		long argClusterId )
	{
		YCFGenKbSysClusterByClusterIdxKey key = schema.getFactorySysCluster().newClusterIdxKey();
		key.setRequiredClusterId( argClusterId );
		deleteSysClusterByClusterIdx( Authorization, key );
	}

	public void deleteSysClusterByClusterIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSysClusterByClusterIdxKey argKey )
	{
		YCFGenKbSysClusterBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbSysClusterBuff> matchSet = new LinkedList<YCFGenKbSysClusterBuff>();
		Iterator<YCFGenKbSysClusterBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSysClusterBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSysCluster().readDerivedByIdIdx( Authorization,
				cur.getRequiredSingletonId() );
			deleteSysCluster( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
