
// Description: Java 11 in-memory RAM DbIO implementation for TopProject.

/*
 *	org.mssycf.mssycf.YCFInt
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFInt 2.13 Internet Essentials
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFInt.
 *	
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	
 *	http://www.apache.org/licenses/LICENSE-2.0
 *	
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfint.YCFIntRam;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;

/*
 *	YCFIntRamTopProjectTable in-memory RAM DbIO implementation
 *	for TopProject.
 */
public class YCFIntRamTopProjectTable
	implements IYCFIntTopProjectTable
{
	private IYCFIntSchema schema;
	private Map< YCFIntTopProjectPKey,
				YCFIntTopProjectBuff > dictByPKey
		= new HashMap< YCFIntTopProjectPKey,
				YCFIntTopProjectBuff >();
	private Map< YCFIntTopProjectByTenantIdxKey,
				Map< YCFIntTopProjectPKey,
					YCFIntTopProjectBuff >> dictByTenantIdx
		= new HashMap< YCFIntTopProjectByTenantIdxKey,
				Map< YCFIntTopProjectPKey,
					YCFIntTopProjectBuff >>();
	private Map< YCFIntTopProjectByTopDomainIdxKey,
				Map< YCFIntTopProjectPKey,
					YCFIntTopProjectBuff >> dictByTopDomainIdx
		= new HashMap< YCFIntTopProjectByTopDomainIdxKey,
				Map< YCFIntTopProjectPKey,
					YCFIntTopProjectBuff >>();
	private Map< YCFIntTopProjectByNameIdxKey,
			YCFIntTopProjectBuff > dictByNameIdx
		= new HashMap< YCFIntTopProjectByNameIdxKey,
			YCFIntTopProjectBuff >();

	public YCFIntRamTopProjectTable( IYCFIntSchema argSchema ) {
		schema = argSchema;
	}

	public void createTopProject( YCFSecAuthorization Authorization,
		YCFIntTopProjectBuff Buff )
	{
		final String S_ProcName = "createTopProject";
		YCFIntTopProjectPKey pkey = schema.getFactoryTopProject().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( ((YCFIntRamTenantTable)schema.getTableTenant()).nextTopProjectIdGen( Authorization,
			Buff.getRequiredTenantId() ) );
		Buff.setRequiredTenantId( pkey.getRequiredTenantId() );
		Buff.setRequiredId( pkey.getRequiredId() );
		YCFIntTopProjectByTenantIdxKey keyTenantIdx = schema.getFactoryTopProject().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFIntTopProjectByTopDomainIdxKey keyTopDomainIdx = schema.getFactoryTopProject().newTopDomainIdxKey();
		keyTopDomainIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyTopDomainIdx.setRequiredTopDomainId( Buff.getRequiredTopDomainId() );

		YCFIntTopProjectByNameIdxKey keyNameIdx = schema.getFactoryTopProject().newNameIdxKey();
		keyNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyNameIdx.setRequiredTopDomainId( Buff.getRequiredTopDomainId() );
		keyNameIdx.setRequiredName( Buff.getRequiredName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByNameIdx.containsKey( keyNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"TopProjectNameIdx",
				keyNameIdx );
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
				if( null == schema.getTableTopDomain().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredTopDomainId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"ParentTopDomain",
						"TopDomain",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFIntTopProjectPKey, YCFIntTopProjectBuff > subdictTenantIdx;
		if( dictByTenantIdx.containsKey( keyTenantIdx ) ) {
			subdictTenantIdx = dictByTenantIdx.get( keyTenantIdx );
		}
		else {
			subdictTenantIdx = new HashMap< YCFIntTopProjectPKey, YCFIntTopProjectBuff >();
			dictByTenantIdx.put( keyTenantIdx, subdictTenantIdx );
		}
		subdictTenantIdx.put( pkey, Buff );

		Map< YCFIntTopProjectPKey, YCFIntTopProjectBuff > subdictTopDomainIdx;
		if( dictByTopDomainIdx.containsKey( keyTopDomainIdx ) ) {
			subdictTopDomainIdx = dictByTopDomainIdx.get( keyTopDomainIdx );
		}
		else {
			subdictTopDomainIdx = new HashMap< YCFIntTopProjectPKey, YCFIntTopProjectBuff >();
			dictByTopDomainIdx.put( keyTopDomainIdx, subdictTopDomainIdx );
		}
		subdictTopDomainIdx.put( pkey, Buff );

		dictByNameIdx.put( keyNameIdx, Buff );

	}

	public YCFIntTopProjectBuff readDerived( YCFSecAuthorization Authorization,
		YCFIntTopProjectPKey PKey )
	{
		final String S_ProcName = "YCFIntRamTopProject.readDerived";
		YCFIntTopProjectPKey key = schema.getFactoryTopProject().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFIntTopProjectBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntTopProjectBuff lockDerived( YCFSecAuthorization Authorization,
		YCFIntTopProjectPKey PKey )
	{
		final String S_ProcName = "YCFIntRamTopProject.readDerived";
		YCFIntTopProjectPKey key = schema.getFactoryTopProject().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFIntTopProjectBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntTopProjectBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFIntRamTopProject.readAllDerived";
		YCFIntTopProjectBuff[] retList = new YCFIntTopProjectBuff[ dictByPKey.values().size() ];
		Iterator< YCFIntTopProjectBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFIntTopProjectBuff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFIntRamTopProject.readDerivedByTenantIdx";
		YCFIntTopProjectByTenantIdxKey key = schema.getFactoryTopProject().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );

		YCFIntTopProjectBuff[] recArray;
		if( dictByTenantIdx.containsKey( key ) ) {
			Map< YCFIntTopProjectPKey, YCFIntTopProjectBuff > subdictTenantIdx
				= dictByTenantIdx.get( key );
			recArray = new YCFIntTopProjectBuff[ subdictTenantIdx.size() ];
			Iterator< YCFIntTopProjectBuff > iter = subdictTenantIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFIntTopProjectPKey, YCFIntTopProjectBuff > subdictTenantIdx
				= new HashMap< YCFIntTopProjectPKey, YCFIntTopProjectBuff >();
			dictByTenantIdx.put( key, subdictTenantIdx );
			recArray = new YCFIntTopProjectBuff[0];
		}
		return( recArray );
	}

	public YCFIntTopProjectBuff[] readDerivedByTopDomainIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TopDomainId )
	{
		final String S_ProcName = "YCFIntRamTopProject.readDerivedByTopDomainIdx";
		YCFIntTopProjectByTopDomainIdxKey key = schema.getFactoryTopProject().newTopDomainIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTopDomainId( TopDomainId );

		YCFIntTopProjectBuff[] recArray;
		if( dictByTopDomainIdx.containsKey( key ) ) {
			Map< YCFIntTopProjectPKey, YCFIntTopProjectBuff > subdictTopDomainIdx
				= dictByTopDomainIdx.get( key );
			recArray = new YCFIntTopProjectBuff[ subdictTopDomainIdx.size() ];
			Iterator< YCFIntTopProjectBuff > iter = subdictTopDomainIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFIntTopProjectPKey, YCFIntTopProjectBuff > subdictTopDomainIdx
				= new HashMap< YCFIntTopProjectPKey, YCFIntTopProjectBuff >();
			dictByTopDomainIdx.put( key, subdictTopDomainIdx );
			recArray = new YCFIntTopProjectBuff[0];
		}
		return( recArray );
	}

	public YCFIntTopProjectBuff readDerivedByNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TopDomainId,
		String Name )
	{
		final String S_ProcName = "YCFIntRamTopProject.readDerivedByNameIdx";
		YCFIntTopProjectByNameIdxKey key = schema.getFactoryTopProject().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTopDomainId( TopDomainId );
		key.setRequiredName( Name );

		YCFIntTopProjectBuff buff;
		if( dictByNameIdx.containsKey( key ) ) {
			buff = dictByNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntTopProjectBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFIntRamTopProject.readDerivedByIdIdx() ";
		YCFIntTopProjectPKey key = schema.getFactoryTopProject().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFIntTopProjectBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntTopProjectBuff readBuff( YCFSecAuthorization Authorization,
		YCFIntTopProjectPKey PKey )
	{
		final String S_ProcName = "YCFIntRamTopProject.readBuff";
		YCFIntTopProjectBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a108" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFIntTopProjectBuff lockBuff( YCFSecAuthorization Authorization,
		YCFIntTopProjectPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFIntTopProjectBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a108" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFIntTopProjectBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFIntRamTopProject.readAllBuff";
		YCFIntTopProjectBuff buff;
		ArrayList<YCFIntTopProjectBuff> filteredList = new ArrayList<YCFIntTopProjectBuff>();
		YCFIntTopProjectBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a108" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFIntTopProjectBuff[0] ) );
	}

	public YCFIntTopProjectBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFIntRamTopProject.readBuffByIdIdx() ";
		YCFIntTopProjectBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a108" ) ) {
			return( (YCFIntTopProjectBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFIntTopProjectBuff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFIntRamTopProject.readBuffByTenantIdx() ";
		YCFIntTopProjectBuff buff;
		ArrayList<YCFIntTopProjectBuff> filteredList = new ArrayList<YCFIntTopProjectBuff>();
		YCFIntTopProjectBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a108" ) ) {
				filteredList.add( (YCFIntTopProjectBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFIntTopProjectBuff[0] ) );
	}

	public YCFIntTopProjectBuff[] readBuffByTopDomainIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TopDomainId )
	{
		final String S_ProcName = "YCFIntRamTopProject.readBuffByTopDomainIdx() ";
		YCFIntTopProjectBuff buff;
		ArrayList<YCFIntTopProjectBuff> filteredList = new ArrayList<YCFIntTopProjectBuff>();
		YCFIntTopProjectBuff[] buffList = readDerivedByTopDomainIdx( Authorization,
			TenantId,
			TopDomainId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a108" ) ) {
				filteredList.add( (YCFIntTopProjectBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFIntTopProjectBuff[0] ) );
	}

	public YCFIntTopProjectBuff readBuffByNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TopDomainId,
		String Name )
	{
		final String S_ProcName = "YCFIntRamTopProject.readBuffByNameIdx() ";
		YCFIntTopProjectBuff buff = readDerivedByNameIdx( Authorization,
			TenantId,
			TopDomainId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a108" ) ) {
			return( (YCFIntTopProjectBuff)buff );
		}
		else {
			return( null );
		}
	}

	public void updateTopProject( YCFSecAuthorization Authorization,
		YCFIntTopProjectBuff Buff )
	{
		YCFIntTopProjectPKey pkey = schema.getFactoryTopProject().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFIntTopProjectBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateTopProject",
				"Existing record not found",
				"TopProject",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateTopProject",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFIntTopProjectByTenantIdxKey existingKeyTenantIdx = schema.getFactoryTopProject().newTenantIdxKey();
		existingKeyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFIntTopProjectByTenantIdxKey newKeyTenantIdx = schema.getFactoryTopProject().newTenantIdxKey();
		newKeyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFIntTopProjectByTopDomainIdxKey existingKeyTopDomainIdx = schema.getFactoryTopProject().newTopDomainIdxKey();
		existingKeyTopDomainIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyTopDomainIdx.setRequiredTopDomainId( existing.getRequiredTopDomainId() );

		YCFIntTopProjectByTopDomainIdxKey newKeyTopDomainIdx = schema.getFactoryTopProject().newTopDomainIdxKey();
		newKeyTopDomainIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyTopDomainIdx.setRequiredTopDomainId( Buff.getRequiredTopDomainId() );

		YCFIntTopProjectByNameIdxKey existingKeyNameIdx = schema.getFactoryTopProject().newNameIdxKey();
		existingKeyNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyNameIdx.setRequiredTopDomainId( existing.getRequiredTopDomainId() );
		existingKeyNameIdx.setRequiredName( existing.getRequiredName() );

		YCFIntTopProjectByNameIdxKey newKeyNameIdx = schema.getFactoryTopProject().newNameIdxKey();
		newKeyNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyNameIdx.setRequiredTopDomainId( Buff.getRequiredTopDomainId() );
		newKeyNameIdx.setRequiredName( Buff.getRequiredName() );

		// Check unique indexes

		if( ! existingKeyNameIdx.equals( newKeyNameIdx ) ) {
			if( dictByNameIdx.containsKey( newKeyNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateTopProject",
					"TopProjectNameIdx",
					newKeyNameIdx );
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
						"updateTopProject",
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
				if( null == schema.getTableTopDomain().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredTopDomainId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateTopProject",
						"Container",
						"ParentTopDomain",
						"TopDomain",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFIntTopProjectPKey, YCFIntTopProjectBuff > subdict;

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
			subdict = new HashMap< YCFIntTopProjectPKey, YCFIntTopProjectBuff >();
			dictByTenantIdx.put( newKeyTenantIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByTopDomainIdx.get( existingKeyTopDomainIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByTopDomainIdx.containsKey( newKeyTopDomainIdx ) ) {
			subdict = dictByTopDomainIdx.get( newKeyTopDomainIdx );
		}
		else {
			subdict = new HashMap< YCFIntTopProjectPKey, YCFIntTopProjectBuff >();
			dictByTopDomainIdx.put( newKeyTopDomainIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByNameIdx.remove( existingKeyNameIdx );
		dictByNameIdx.put( newKeyNameIdx, Buff );

	}

	public void deleteTopProject( YCFSecAuthorization Authorization,
		YCFIntTopProjectBuff Buff )
	{
		final String S_ProcName = "YCFIntRamTopProjectTable.deleteTopProject() ";
		String classCode;
		YCFIntTopProjectPKey pkey = schema.getFactoryTopProject().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFIntTopProjectBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteTopProject",
				pkey );
		}
					schema.getTableSubProject().deleteSubProjectByTopProjectIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		YCFIntTopProjectByTenantIdxKey keyTenantIdx = schema.getFactoryTopProject().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFIntTopProjectByTopDomainIdxKey keyTopDomainIdx = schema.getFactoryTopProject().newTopDomainIdxKey();
		keyTopDomainIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyTopDomainIdx.setRequiredTopDomainId( existing.getRequiredTopDomainId() );

		YCFIntTopProjectByNameIdxKey keyNameIdx = schema.getFactoryTopProject().newNameIdxKey();
		keyNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyNameIdx.setRequiredTopDomainId( existing.getRequiredTopDomainId() );
		keyNameIdx.setRequiredName( existing.getRequiredName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFIntTopProjectPKey, YCFIntTopProjectBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByTenantIdx.get( keyTenantIdx );
		subdict.remove( pkey );

		subdict = dictByTopDomainIdx.get( keyTopDomainIdx );
		subdict.remove( pkey );

		dictByNameIdx.remove( keyNameIdx );

	}
	public void deleteTopProjectByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFIntTopProjectPKey key = schema.getFactoryTopProject().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteTopProjectByIdIdx( Authorization, key );
	}

	public void deleteTopProjectByIdIdx( YCFSecAuthorization Authorization,
		YCFIntTopProjectPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFIntTopProjectBuff cur;
		LinkedList<YCFIntTopProjectBuff> matchSet = new LinkedList<YCFIntTopProjectBuff>();
		Iterator<YCFIntTopProjectBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFIntTopProjectBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTopProject().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteTopProject( Authorization, cur );
		}
	}

	public void deleteTopProjectByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFIntTopProjectByTenantIdxKey key = schema.getFactoryTopProject().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteTopProjectByTenantIdx( Authorization, key );
	}

	public void deleteTopProjectByTenantIdx( YCFSecAuthorization Authorization,
		YCFIntTopProjectByTenantIdxKey argKey )
	{
		YCFIntTopProjectBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFIntTopProjectBuff> matchSet = new LinkedList<YCFIntTopProjectBuff>();
		Iterator<YCFIntTopProjectBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFIntTopProjectBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTopProject().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteTopProject( Authorization, cur );
		}
	}

	public void deleteTopProjectByTopDomainIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTopDomainId )
	{
		YCFIntTopProjectByTopDomainIdxKey key = schema.getFactoryTopProject().newTopDomainIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTopDomainId( argTopDomainId );
		deleteTopProjectByTopDomainIdx( Authorization, key );
	}

	public void deleteTopProjectByTopDomainIdx( YCFSecAuthorization Authorization,
		YCFIntTopProjectByTopDomainIdxKey argKey )
	{
		YCFIntTopProjectBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFIntTopProjectBuff> matchSet = new LinkedList<YCFIntTopProjectBuff>();
		Iterator<YCFIntTopProjectBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFIntTopProjectBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTopProject().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteTopProject( Authorization, cur );
		}
	}

	public void deleteTopProjectByNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTopDomainId,
		String argName )
	{
		YCFIntTopProjectByNameIdxKey key = schema.getFactoryTopProject().newNameIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTopDomainId( argTopDomainId );
		key.setRequiredName( argName );
		deleteTopProjectByNameIdx( Authorization, key );
	}

	public void deleteTopProjectByNameIdx( YCFSecAuthorization Authorization,
		YCFIntTopProjectByNameIdxKey argKey )
	{
		YCFIntTopProjectBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFIntTopProjectBuff> matchSet = new LinkedList<YCFIntTopProjectBuff>();
		Iterator<YCFIntTopProjectBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFIntTopProjectBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTopProject().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteTopProject( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
