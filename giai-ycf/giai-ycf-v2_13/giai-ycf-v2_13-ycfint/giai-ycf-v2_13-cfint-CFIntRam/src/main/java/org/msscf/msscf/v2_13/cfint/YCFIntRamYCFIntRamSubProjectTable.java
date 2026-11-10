
// Description: Java 11 in-memory RAM DbIO implementation for SubProject.

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
 *	YCFIntRamSubProjectTable in-memory RAM DbIO implementation
 *	for SubProject.
 */
public class YCFIntRamSubProjectTable
	implements IYCFIntSubProjectTable
{
	private IYCFIntSchema schema;
	private Map< YCFIntSubProjectPKey,
				YCFIntSubProjectBuff > dictByPKey
		= new HashMap< YCFIntSubProjectPKey,
				YCFIntSubProjectBuff >();
	private Map< YCFIntSubProjectByTenantIdxKey,
				Map< YCFIntSubProjectPKey,
					YCFIntSubProjectBuff >> dictByTenantIdx
		= new HashMap< YCFIntSubProjectByTenantIdxKey,
				Map< YCFIntSubProjectPKey,
					YCFIntSubProjectBuff >>();
	private Map< YCFIntSubProjectByTopProjectIdxKey,
				Map< YCFIntSubProjectPKey,
					YCFIntSubProjectBuff >> dictByTopProjectIdx
		= new HashMap< YCFIntSubProjectByTopProjectIdxKey,
				Map< YCFIntSubProjectPKey,
					YCFIntSubProjectBuff >>();
	private Map< YCFIntSubProjectByNameIdxKey,
			YCFIntSubProjectBuff > dictByNameIdx
		= new HashMap< YCFIntSubProjectByNameIdxKey,
			YCFIntSubProjectBuff >();

	public YCFIntRamSubProjectTable( IYCFIntSchema argSchema ) {
		schema = argSchema;
	}

	public void createSubProject( YCFSecAuthorization Authorization,
		YCFIntSubProjectBuff Buff )
	{
		final String S_ProcName = "createSubProject";
		YCFIntSubProjectPKey pkey = schema.getFactorySubProject().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( ((YCFIntRamTenantTable)schema.getTableTenant()).nextSubProjectIdGen( Authorization,
			Buff.getRequiredTenantId() ) );
		Buff.setRequiredTenantId( pkey.getRequiredTenantId() );
		Buff.setRequiredId( pkey.getRequiredId() );
		YCFIntSubProjectByTenantIdxKey keyTenantIdx = schema.getFactorySubProject().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFIntSubProjectByTopProjectIdxKey keyTopProjectIdx = schema.getFactorySubProject().newTopProjectIdxKey();
		keyTopProjectIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyTopProjectIdx.setRequiredTopProjectId( Buff.getRequiredTopProjectId() );

		YCFIntSubProjectByNameIdxKey keyNameIdx = schema.getFactorySubProject().newNameIdxKey();
		keyNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyNameIdx.setRequiredTopProjectId( Buff.getRequiredTopProjectId() );
		keyNameIdx.setRequiredName( Buff.getRequiredName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByNameIdx.containsKey( keyNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"SubProjectNameIdx",
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
				if( null == schema.getTableTopProject().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredTopProjectId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"ParentTopProject",
						"TopProject",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFIntSubProjectPKey, YCFIntSubProjectBuff > subdictTenantIdx;
		if( dictByTenantIdx.containsKey( keyTenantIdx ) ) {
			subdictTenantIdx = dictByTenantIdx.get( keyTenantIdx );
		}
		else {
			subdictTenantIdx = new HashMap< YCFIntSubProjectPKey, YCFIntSubProjectBuff >();
			dictByTenantIdx.put( keyTenantIdx, subdictTenantIdx );
		}
		subdictTenantIdx.put( pkey, Buff );

		Map< YCFIntSubProjectPKey, YCFIntSubProjectBuff > subdictTopProjectIdx;
		if( dictByTopProjectIdx.containsKey( keyTopProjectIdx ) ) {
			subdictTopProjectIdx = dictByTopProjectIdx.get( keyTopProjectIdx );
		}
		else {
			subdictTopProjectIdx = new HashMap< YCFIntSubProjectPKey, YCFIntSubProjectBuff >();
			dictByTopProjectIdx.put( keyTopProjectIdx, subdictTopProjectIdx );
		}
		subdictTopProjectIdx.put( pkey, Buff );

		dictByNameIdx.put( keyNameIdx, Buff );

	}

	public YCFIntSubProjectBuff readDerived( YCFSecAuthorization Authorization,
		YCFIntSubProjectPKey PKey )
	{
		final String S_ProcName = "YCFIntRamSubProject.readDerived";
		YCFIntSubProjectPKey key = schema.getFactorySubProject().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFIntSubProjectBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntSubProjectBuff lockDerived( YCFSecAuthorization Authorization,
		YCFIntSubProjectPKey PKey )
	{
		final String S_ProcName = "YCFIntRamSubProject.readDerived";
		YCFIntSubProjectPKey key = schema.getFactorySubProject().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFIntSubProjectBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntSubProjectBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFIntRamSubProject.readAllDerived";
		YCFIntSubProjectBuff[] retList = new YCFIntSubProjectBuff[ dictByPKey.values().size() ];
		Iterator< YCFIntSubProjectBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFIntSubProjectBuff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFIntRamSubProject.readDerivedByTenantIdx";
		YCFIntSubProjectByTenantIdxKey key = schema.getFactorySubProject().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );

		YCFIntSubProjectBuff[] recArray;
		if( dictByTenantIdx.containsKey( key ) ) {
			Map< YCFIntSubProjectPKey, YCFIntSubProjectBuff > subdictTenantIdx
				= dictByTenantIdx.get( key );
			recArray = new YCFIntSubProjectBuff[ subdictTenantIdx.size() ];
			Iterator< YCFIntSubProjectBuff > iter = subdictTenantIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFIntSubProjectPKey, YCFIntSubProjectBuff > subdictTenantIdx
				= new HashMap< YCFIntSubProjectPKey, YCFIntSubProjectBuff >();
			dictByTenantIdx.put( key, subdictTenantIdx );
			recArray = new YCFIntSubProjectBuff[0];
		}
		return( recArray );
	}

	public YCFIntSubProjectBuff[] readDerivedByTopProjectIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TopProjectId )
	{
		final String S_ProcName = "YCFIntRamSubProject.readDerivedByTopProjectIdx";
		YCFIntSubProjectByTopProjectIdxKey key = schema.getFactorySubProject().newTopProjectIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTopProjectId( TopProjectId );

		YCFIntSubProjectBuff[] recArray;
		if( dictByTopProjectIdx.containsKey( key ) ) {
			Map< YCFIntSubProjectPKey, YCFIntSubProjectBuff > subdictTopProjectIdx
				= dictByTopProjectIdx.get( key );
			recArray = new YCFIntSubProjectBuff[ subdictTopProjectIdx.size() ];
			Iterator< YCFIntSubProjectBuff > iter = subdictTopProjectIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFIntSubProjectPKey, YCFIntSubProjectBuff > subdictTopProjectIdx
				= new HashMap< YCFIntSubProjectPKey, YCFIntSubProjectBuff >();
			dictByTopProjectIdx.put( key, subdictTopProjectIdx );
			recArray = new YCFIntSubProjectBuff[0];
		}
		return( recArray );
	}

	public YCFIntSubProjectBuff readDerivedByNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TopProjectId,
		String Name )
	{
		final String S_ProcName = "YCFIntRamSubProject.readDerivedByNameIdx";
		YCFIntSubProjectByNameIdxKey key = schema.getFactorySubProject().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTopProjectId( TopProjectId );
		key.setRequiredName( Name );

		YCFIntSubProjectBuff buff;
		if( dictByNameIdx.containsKey( key ) ) {
			buff = dictByNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntSubProjectBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFIntRamSubProject.readDerivedByIdIdx() ";
		YCFIntSubProjectPKey key = schema.getFactorySubProject().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFIntSubProjectBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntSubProjectBuff readBuff( YCFSecAuthorization Authorization,
		YCFIntSubProjectPKey PKey )
	{
		final String S_ProcName = "YCFIntRamSubProject.readBuff";
		YCFIntSubProjectBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a105" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFIntSubProjectBuff lockBuff( YCFSecAuthorization Authorization,
		YCFIntSubProjectPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFIntSubProjectBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a105" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFIntSubProjectBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFIntRamSubProject.readAllBuff";
		YCFIntSubProjectBuff buff;
		ArrayList<YCFIntSubProjectBuff> filteredList = new ArrayList<YCFIntSubProjectBuff>();
		YCFIntSubProjectBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a105" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFIntSubProjectBuff[0] ) );
	}

	public YCFIntSubProjectBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFIntRamSubProject.readBuffByIdIdx() ";
		YCFIntSubProjectBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a105" ) ) {
			return( (YCFIntSubProjectBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFIntSubProjectBuff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFIntRamSubProject.readBuffByTenantIdx() ";
		YCFIntSubProjectBuff buff;
		ArrayList<YCFIntSubProjectBuff> filteredList = new ArrayList<YCFIntSubProjectBuff>();
		YCFIntSubProjectBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a105" ) ) {
				filteredList.add( (YCFIntSubProjectBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFIntSubProjectBuff[0] ) );
	}

	public YCFIntSubProjectBuff[] readBuffByTopProjectIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TopProjectId )
	{
		final String S_ProcName = "YCFIntRamSubProject.readBuffByTopProjectIdx() ";
		YCFIntSubProjectBuff buff;
		ArrayList<YCFIntSubProjectBuff> filteredList = new ArrayList<YCFIntSubProjectBuff>();
		YCFIntSubProjectBuff[] buffList = readDerivedByTopProjectIdx( Authorization,
			TenantId,
			TopProjectId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a105" ) ) {
				filteredList.add( (YCFIntSubProjectBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFIntSubProjectBuff[0] ) );
	}

	public YCFIntSubProjectBuff readBuffByNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TopProjectId,
		String Name )
	{
		final String S_ProcName = "YCFIntRamSubProject.readBuffByNameIdx() ";
		YCFIntSubProjectBuff buff = readDerivedByNameIdx( Authorization,
			TenantId,
			TopProjectId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a105" ) ) {
			return( (YCFIntSubProjectBuff)buff );
		}
		else {
			return( null );
		}
	}

	public void updateSubProject( YCFSecAuthorization Authorization,
		YCFIntSubProjectBuff Buff )
	{
		YCFIntSubProjectPKey pkey = schema.getFactorySubProject().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFIntSubProjectBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateSubProject",
				"Existing record not found",
				"SubProject",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateSubProject",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFIntSubProjectByTenantIdxKey existingKeyTenantIdx = schema.getFactorySubProject().newTenantIdxKey();
		existingKeyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFIntSubProjectByTenantIdxKey newKeyTenantIdx = schema.getFactorySubProject().newTenantIdxKey();
		newKeyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFIntSubProjectByTopProjectIdxKey existingKeyTopProjectIdx = schema.getFactorySubProject().newTopProjectIdxKey();
		existingKeyTopProjectIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyTopProjectIdx.setRequiredTopProjectId( existing.getRequiredTopProjectId() );

		YCFIntSubProjectByTopProjectIdxKey newKeyTopProjectIdx = schema.getFactorySubProject().newTopProjectIdxKey();
		newKeyTopProjectIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyTopProjectIdx.setRequiredTopProjectId( Buff.getRequiredTopProjectId() );

		YCFIntSubProjectByNameIdxKey existingKeyNameIdx = schema.getFactorySubProject().newNameIdxKey();
		existingKeyNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyNameIdx.setRequiredTopProjectId( existing.getRequiredTopProjectId() );
		existingKeyNameIdx.setRequiredName( existing.getRequiredName() );

		YCFIntSubProjectByNameIdxKey newKeyNameIdx = schema.getFactorySubProject().newNameIdxKey();
		newKeyNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyNameIdx.setRequiredTopProjectId( Buff.getRequiredTopProjectId() );
		newKeyNameIdx.setRequiredName( Buff.getRequiredName() );

		// Check unique indexes

		if( ! existingKeyNameIdx.equals( newKeyNameIdx ) ) {
			if( dictByNameIdx.containsKey( newKeyNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateSubProject",
					"SubProjectNameIdx",
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
						"updateSubProject",
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
				if( null == schema.getTableTopProject().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredTopProjectId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateSubProject",
						"Container",
						"ParentTopProject",
						"TopProject",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFIntSubProjectPKey, YCFIntSubProjectBuff > subdict;

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
			subdict = new HashMap< YCFIntSubProjectPKey, YCFIntSubProjectBuff >();
			dictByTenantIdx.put( newKeyTenantIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByTopProjectIdx.get( existingKeyTopProjectIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByTopProjectIdx.containsKey( newKeyTopProjectIdx ) ) {
			subdict = dictByTopProjectIdx.get( newKeyTopProjectIdx );
		}
		else {
			subdict = new HashMap< YCFIntSubProjectPKey, YCFIntSubProjectBuff >();
			dictByTopProjectIdx.put( newKeyTopProjectIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByNameIdx.remove( existingKeyNameIdx );
		dictByNameIdx.put( newKeyNameIdx, Buff );

	}

	public void deleteSubProject( YCFSecAuthorization Authorization,
		YCFIntSubProjectBuff Buff )
	{
		final String S_ProcName = "YCFIntRamSubProjectTable.deleteSubProject() ";
		String classCode;
		YCFIntSubProjectPKey pkey = schema.getFactorySubProject().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFIntSubProjectBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteSubProject",
				pkey );
		}
					schema.getTableMajorVersion().deleteMajorVersionBySubProjectIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		YCFIntSubProjectByTenantIdxKey keyTenantIdx = schema.getFactorySubProject().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFIntSubProjectByTopProjectIdxKey keyTopProjectIdx = schema.getFactorySubProject().newTopProjectIdxKey();
		keyTopProjectIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyTopProjectIdx.setRequiredTopProjectId( existing.getRequiredTopProjectId() );

		YCFIntSubProjectByNameIdxKey keyNameIdx = schema.getFactorySubProject().newNameIdxKey();
		keyNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyNameIdx.setRequiredTopProjectId( existing.getRequiredTopProjectId() );
		keyNameIdx.setRequiredName( existing.getRequiredName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFIntSubProjectPKey, YCFIntSubProjectBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByTenantIdx.get( keyTenantIdx );
		subdict.remove( pkey );

		subdict = dictByTopProjectIdx.get( keyTopProjectIdx );
		subdict.remove( pkey );

		dictByNameIdx.remove( keyNameIdx );

	}
	public void deleteSubProjectByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFIntSubProjectPKey key = schema.getFactorySubProject().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteSubProjectByIdIdx( Authorization, key );
	}

	public void deleteSubProjectByIdIdx( YCFSecAuthorization Authorization,
		YCFIntSubProjectPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFIntSubProjectBuff cur;
		LinkedList<YCFIntSubProjectBuff> matchSet = new LinkedList<YCFIntSubProjectBuff>();
		Iterator<YCFIntSubProjectBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFIntSubProjectBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSubProject().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSubProject( Authorization, cur );
		}
	}

	public void deleteSubProjectByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFIntSubProjectByTenantIdxKey key = schema.getFactorySubProject().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteSubProjectByTenantIdx( Authorization, key );
	}

	public void deleteSubProjectByTenantIdx( YCFSecAuthorization Authorization,
		YCFIntSubProjectByTenantIdxKey argKey )
	{
		YCFIntSubProjectBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFIntSubProjectBuff> matchSet = new LinkedList<YCFIntSubProjectBuff>();
		Iterator<YCFIntSubProjectBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFIntSubProjectBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSubProject().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSubProject( Authorization, cur );
		}
	}

	public void deleteSubProjectByTopProjectIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTopProjectId )
	{
		YCFIntSubProjectByTopProjectIdxKey key = schema.getFactorySubProject().newTopProjectIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTopProjectId( argTopProjectId );
		deleteSubProjectByTopProjectIdx( Authorization, key );
	}

	public void deleteSubProjectByTopProjectIdx( YCFSecAuthorization Authorization,
		YCFIntSubProjectByTopProjectIdxKey argKey )
	{
		YCFIntSubProjectBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFIntSubProjectBuff> matchSet = new LinkedList<YCFIntSubProjectBuff>();
		Iterator<YCFIntSubProjectBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFIntSubProjectBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSubProject().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSubProject( Authorization, cur );
		}
	}

	public void deleteSubProjectByNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTopProjectId,
		String argName )
	{
		YCFIntSubProjectByNameIdxKey key = schema.getFactorySubProject().newNameIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTopProjectId( argTopProjectId );
		key.setRequiredName( argName );
		deleteSubProjectByNameIdx( Authorization, key );
	}

	public void deleteSubProjectByNameIdx( YCFSecAuthorization Authorization,
		YCFIntSubProjectByNameIdxKey argKey )
	{
		YCFIntSubProjectBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFIntSubProjectBuff> matchSet = new LinkedList<YCFIntSubProjectBuff>();
		Iterator<YCFIntSubProjectBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFIntSubProjectBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSubProject().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSubProject( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
