
// Description: Java 11 in-memory RAM DbIO implementation for GelCache.

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
 *	YCFGenKbRamGelCacheTable in-memory RAM DbIO implementation
 *	for GelCache.
 */
public class YCFGenKbRamGelCacheTable
	implements IYCFGenKbGelCacheTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbGelCachePKey,
				YCFGenKbGelCacheBuff > dictByPKey
		= new HashMap< YCFGenKbGelCachePKey,
				YCFGenKbGelCacheBuff >();
	private Map< YCFGenKbGelCacheByTenantIdxKey,
				Map< YCFGenKbGelCachePKey,
					YCFGenKbGelCacheBuff >> dictByTenantIdx
		= new HashMap< YCFGenKbGelCacheByTenantIdxKey,
				Map< YCFGenKbGelCachePKey,
					YCFGenKbGelCacheBuff >>();
	private Map< YCFGenKbGelCacheByAltIdxKey,
			YCFGenKbGelCacheBuff > dictByAltIdx
		= new HashMap< YCFGenKbGelCacheByAltIdxKey,
			YCFGenKbGelCacheBuff >();

	public YCFGenKbRamGelCacheTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createGelCache( YCFGenKbAuthorization Authorization,
		YCFGenKbGelCacheBuff Buff )
	{
		final String S_ProcName = "createGelCache";
		YCFGenKbGelCachePKey pkey = schema.getFactoryGelCache().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredGelCacheId( ((YCFGenKbRamTenantTable)schema.getTableTenant()).nextGelCacheIdGen( Authorization,
			Buff.getRequiredTenantId() ) );
		Buff.setRequiredTenantId( pkey.getRequiredTenantId() );
		Buff.setRequiredGelCacheId( pkey.getRequiredGelCacheId() );
		YCFGenKbGelCacheByTenantIdxKey keyTenantIdx = schema.getFactoryGelCache().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFGenKbGelCacheByAltIdxKey keyAltIdx = schema.getFactoryGelCache().newAltIdxKey();
		keyAltIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyAltIdx.setRequiredCacheName( Buff.getRequiredCacheName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByAltIdx.containsKey( keyAltIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"GelCacheAltIdIdx",
				keyAltIdx );
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

		Map< YCFGenKbGelCachePKey, YCFGenKbGelCacheBuff > subdictTenantIdx;
		if( dictByTenantIdx.containsKey( keyTenantIdx ) ) {
			subdictTenantIdx = dictByTenantIdx.get( keyTenantIdx );
		}
		else {
			subdictTenantIdx = new HashMap< YCFGenKbGelCachePKey, YCFGenKbGelCacheBuff >();
			dictByTenantIdx.put( keyTenantIdx, subdictTenantIdx );
		}
		subdictTenantIdx.put( pkey, Buff );

		dictByAltIdx.put( keyAltIdx, Buff );

	}

	public YCFGenKbGelCacheBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGelCachePKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGelCache.readDerived";
		YCFGenKbGelCachePKey key = schema.getFactoryGelCache().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredGelCacheId( PKey.getRequiredGelCacheId() );
		YCFGenKbGelCacheBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelCacheBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGelCachePKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGelCache.readDerived";
		YCFGenKbGelCachePKey key = schema.getFactoryGelCache().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredGelCacheId( PKey.getRequiredGelCacheId() );
		YCFGenKbGelCacheBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelCacheBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamGelCache.readAllDerived";
		YCFGenKbGelCacheBuff[] retList = new YCFGenKbGelCacheBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbGelCacheBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbGelCacheBuff[] readDerivedByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFGenKbRamGelCache.readDerivedByTenantIdx";
		YCFGenKbGelCacheByTenantIdxKey key = schema.getFactoryGelCache().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );

		YCFGenKbGelCacheBuff[] recArray;
		if( dictByTenantIdx.containsKey( key ) ) {
			Map< YCFGenKbGelCachePKey, YCFGenKbGelCacheBuff > subdictTenantIdx
				= dictByTenantIdx.get( key );
			recArray = new YCFGenKbGelCacheBuff[ subdictTenantIdx.size() ];
			Iterator< YCFGenKbGelCacheBuff > iter = subdictTenantIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbGelCachePKey, YCFGenKbGelCacheBuff > subdictTenantIdx
				= new HashMap< YCFGenKbGelCachePKey, YCFGenKbGelCacheBuff >();
			dictByTenantIdx.put( key, subdictTenantIdx );
			recArray = new YCFGenKbGelCacheBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbGelCacheBuff readDerivedByAltIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		String CacheName )
	{
		final String S_ProcName = "YCFGenKbRamGelCache.readDerivedByAltIdx";
		YCFGenKbGelCacheByAltIdxKey key = schema.getFactoryGelCache().newAltIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCacheName( CacheName );

		YCFGenKbGelCacheBuff buff;
		if( dictByAltIdx.containsKey( key ) ) {
			buff = dictByAltIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelCacheBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "YCFGenKbRamGelCache.readDerivedByIdIdx() ";
		YCFGenKbGelCachePKey key = schema.getFactoryGelCache().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredGelCacheId( GelCacheId );

		YCFGenKbGelCacheBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelCacheBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGelCachePKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamGelCache.readBuff";
		YCFGenKbGelCacheBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a915" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelCacheBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGelCachePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbGelCacheBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a915" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbGelCacheBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamGelCache.readAllBuff";
		YCFGenKbGelCacheBuff buff;
		ArrayList<YCFGenKbGelCacheBuff> filteredList = new ArrayList<YCFGenKbGelCacheBuff>();
		YCFGenKbGelCacheBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a915" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelCacheBuff[0] ) );
	}

	public YCFGenKbGelCacheBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId )
	{
		final String S_ProcName = "YCFGenKbRamGelCache.readBuffByIdIdx() ";
		YCFGenKbGelCacheBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			GelCacheId );
		if( ( buff != null ) && buff.getClassCode().equals( "a915" ) ) {
			return( (YCFGenKbGelCacheBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbGelCacheBuff[] readBuffByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFGenKbRamGelCache.readBuffByTenantIdx() ";
		YCFGenKbGelCacheBuff buff;
		ArrayList<YCFGenKbGelCacheBuff> filteredList = new ArrayList<YCFGenKbGelCacheBuff>();
		YCFGenKbGelCacheBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a915" ) ) {
				filteredList.add( (YCFGenKbGelCacheBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbGelCacheBuff[0] ) );
	}

	public YCFGenKbGelCacheBuff readBuffByAltIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		String CacheName )
	{
		final String S_ProcName = "YCFGenKbRamGelCache.readBuffByAltIdx() ";
		YCFGenKbGelCacheBuff buff = readDerivedByAltIdx( Authorization,
			TenantId,
			CacheName );
		if( ( buff != null ) && buff.getClassCode().equals( "a915" ) ) {
			return( (YCFGenKbGelCacheBuff)buff );
		}
		else {
			return( null );
		}
	}

	public void updateGelCache( YCFGenKbAuthorization Authorization,
		YCFGenKbGelCacheBuff Buff )
	{
		YCFGenKbGelCachePKey pkey = schema.getFactoryGelCache().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );
		YCFGenKbGelCacheBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateGelCache",
				"Existing record not found",
				"GelCache",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateGelCache",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFGenKbGelCacheByTenantIdxKey existingKeyTenantIdx = schema.getFactoryGelCache().newTenantIdxKey();
		existingKeyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFGenKbGelCacheByTenantIdxKey newKeyTenantIdx = schema.getFactoryGelCache().newTenantIdxKey();
		newKeyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFGenKbGelCacheByAltIdxKey existingKeyAltIdx = schema.getFactoryGelCache().newAltIdxKey();
		existingKeyAltIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyAltIdx.setRequiredCacheName( existing.getRequiredCacheName() );

		YCFGenKbGelCacheByAltIdxKey newKeyAltIdx = schema.getFactoryGelCache().newAltIdxKey();
		newKeyAltIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyAltIdx.setRequiredCacheName( Buff.getRequiredCacheName() );

		// Check unique indexes

		if( ! existingKeyAltIdx.equals( newKeyAltIdx ) ) {
			if( dictByAltIdx.containsKey( newKeyAltIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateGelCache",
					"GelCacheAltIdIdx",
					newKeyAltIdx );
			}
		}

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableTenant().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateGelCache",
						"Owner",
						"Tenant",
						"Tenant",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFGenKbGelCachePKey, YCFGenKbGelCacheBuff > subdict;

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
			subdict = new HashMap< YCFGenKbGelCachePKey, YCFGenKbGelCacheBuff >();
			dictByTenantIdx.put( newKeyTenantIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByAltIdx.remove( existingKeyAltIdx );
		dictByAltIdx.put( newKeyAltIdx, Buff );

	}

	public void deleteGelCache( YCFGenKbAuthorization Authorization,
		YCFGenKbGelCacheBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamGelCacheTable.deleteGelCache() ";
		String classCode;
		YCFGenKbGelCachePKey pkey = schema.getFactoryGelCache().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredGelCacheId( Buff.getRequiredGelCacheId() );
		YCFGenKbGelCacheBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteGelCache",
				pkey );
		}
		YCFGenKbGelCacheByTenantIdxKey keyTenantIdx = schema.getFactoryGelCache().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFGenKbGelCacheByAltIdxKey keyAltIdx = schema.getFactoryGelCache().newAltIdxKey();
		keyAltIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyAltIdx.setRequiredCacheName( existing.getRequiredCacheName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFGenKbGelCachePKey, YCFGenKbGelCacheBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByTenantIdx.get( keyTenantIdx );
		subdict.remove( pkey );

		dictByAltIdx.remove( keyAltIdx );

	}
	public void deleteGelCacheByIdIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argGelCacheId )
	{
		YCFGenKbGelCachePKey key = schema.getFactoryGelCache().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredGelCacheId( argGelCacheId );
		deleteGelCacheByIdIdx( Authorization, key );
	}

	public void deleteGelCacheByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelCachePKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbGelCacheBuff cur;
		LinkedList<YCFGenKbGelCacheBuff> matchSet = new LinkedList<YCFGenKbGelCacheBuff>();
		Iterator<YCFGenKbGelCacheBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelCacheBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelCache().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId() );
			deleteGelCache( Authorization, cur );
		}
	}

	public void deleteGelCacheByTenantIdx( YCFGenKbAuthorization Authorization,
		long argTenantId )
	{
		YCFGenKbGelCacheByTenantIdxKey key = schema.getFactoryGelCache().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteGelCacheByTenantIdx( Authorization, key );
	}

	public void deleteGelCacheByTenantIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelCacheByTenantIdxKey argKey )
	{
		YCFGenKbGelCacheBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelCacheBuff> matchSet = new LinkedList<YCFGenKbGelCacheBuff>();
		Iterator<YCFGenKbGelCacheBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelCacheBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelCache().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId() );
			deleteGelCache( Authorization, cur );
		}
	}

	public void deleteGelCacheByAltIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		String argCacheName )
	{
		YCFGenKbGelCacheByAltIdxKey key = schema.getFactoryGelCache().newAltIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredCacheName( argCacheName );
		deleteGelCacheByAltIdx( Authorization, key );
	}

	public void deleteGelCacheByAltIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelCacheByAltIdxKey argKey )
	{
		YCFGenKbGelCacheBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbGelCacheBuff> matchSet = new LinkedList<YCFGenKbGelCacheBuff>();
		Iterator<YCFGenKbGelCacheBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbGelCacheBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableGelCache().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredGelCacheId() );
			deleteGelCache( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
