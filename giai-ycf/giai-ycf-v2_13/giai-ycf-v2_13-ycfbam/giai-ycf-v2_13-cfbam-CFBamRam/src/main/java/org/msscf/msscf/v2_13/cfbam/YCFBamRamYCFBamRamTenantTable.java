
// Description: Java 11 in-memory RAM DbIO implementation for Tenant.

/*
 *	org.mssycf.mssycf.YCFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFSec 2.13 Security Services
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFSec.
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

package org.mssycf.mssycf.v2_13.ycfbam.YCFBamRam;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.*;

/*
 *	YCFBamRamTenantTable in-memory RAM DbIO implementation
 *	for Tenant.
 */
public class YCFBamRamTenantTable
	implements IYCFBamTenantTable
{
	private IYCFBamSchema schema;
	private Map< YCFSecTenantPKey,
				YCFSecTenantBuff > dictByPKey
		= new HashMap< YCFSecTenantPKey,
				YCFSecTenantBuff >();
	private Map< YCFSecTenantByClusterIdxKey,
				Map< YCFSecTenantPKey,
					YCFSecTenantBuff >> dictByClusterIdx
		= new HashMap< YCFSecTenantByClusterIdxKey,
				Map< YCFSecTenantPKey,
					YCFSecTenantBuff >>();
	private Map< YCFSecTenantByUNameIdxKey,
			YCFSecTenantBuff > dictByUNameIdx
		= new HashMap< YCFSecTenantByUNameIdxKey,
			YCFSecTenantBuff >();
	private Map< YCFBamRamTenantId32Gen,
				YCFBamRamTenantId32Gen > id32Generator
		= new HashMap< YCFBamRamTenantId32Gen,
				YCFBamRamTenantId32Gen >();
	private Map< YCFBamRamTenantId64Gen,
				YCFBamRamTenantId64Gen > id64Generator
		= new HashMap< YCFBamRamTenantId64Gen,
				YCFBamRamTenantId64Gen >();

	public YCFBamRamTenantTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	protected int generateNextId32( long argId,
		short argSliceId )
	{
		YCFBamRamTenantId32Gen key = new YCFBamRamTenantId32Gen();
		key.setRequiredId( argId );
		key.setRequiredSliceId( argSliceId );

		YCFBamRamTenantId32Gen useGen = id32Generator.get( key );
		if( useGen == null ) {
			id32Generator.put( key, key );
			useGen = key;
		}

		int retNext = useGen.getNextId();

		return( retNext );
	}

	protected long generateNextId64( long argId,
		short argSliceId )
	{
		YCFBamRamTenantId64Gen key = new YCFBamRamTenantId64Gen();
		key.setRequiredId( argId );
		key.setRequiredSliceId( argSliceId );

		YCFBamRamTenantId64Gen useGen = id64Generator.get( key );
		if( useGen == null ) {
			id64Generator.put( key, key );
			useGen = key;
		}

		long retNext = useGen.getNextId();

		return( retNext );
	}

	public int nextTSecGroupIdGen( YCFSecAuthorization Authorization,
		YCFSecTenantPKey pkey )
	{
		int retval = nextTSecGroupIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public int nextTSecGroupIdGen( YCFSecAuthorization Authorization,
		long argId )
	{
		int retNext = generateNextId32( argId,
			(short)117 );
		return( retNext );
	}

	public long nextTSecGrpIncIdGen( YCFSecAuthorization Authorization,
		YCFSecTenantPKey pkey )
	{
		long retval = nextTSecGrpIncIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public long nextTSecGrpIncIdGen( YCFSecAuthorization Authorization,
		long argId )
	{
		long retNext = generateNextId64( argId,
			(short)119 );
		return( retNext );
	}

	public long nextTSecGrpMembIdGen( YCFSecAuthorization Authorization,
		YCFSecTenantPKey pkey )
	{
		long retval = nextTSecGrpMembIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public long nextTSecGrpMembIdGen( YCFSecAuthorization Authorization,
		long argId )
	{
		long retNext = generateNextId64( argId,
			(short)118 );
		return( retNext );
	}

	public long nextLicenseIdGen( YCFSecAuthorization Authorization,
		YCFSecTenantPKey pkey )
	{
		long retval = nextLicenseIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public long nextLicenseIdGen( YCFSecAuthorization Authorization,
		long argId )
	{
		long retNext = generateNextId64( argId,
			(short)207 );
		return( retNext );
	}

	public long nextMajorVersionIdGen( YCFSecAuthorization Authorization,
		YCFSecTenantPKey pkey )
	{
		long retval = nextMajorVersionIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public long nextMajorVersionIdGen( YCFSecAuthorization Authorization,
		long argId )
	{
		long retNext = generateNextId64( argId,
			(short)205 );
		return( retNext );
	}

	public long nextMinorVersionIdGen( YCFSecAuthorization Authorization,
		YCFSecTenantPKey pkey )
	{
		long retval = nextMinorVersionIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public long nextMinorVersionIdGen( YCFSecAuthorization Authorization,
		long argId )
	{
		long retNext = generateNextId64( argId,
			(short)206 );
		return( retNext );
	}

	public long nextSubProjectIdGen( YCFSecAuthorization Authorization,
		YCFSecTenantPKey pkey )
	{
		long retval = nextSubProjectIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public long nextSubProjectIdGen( YCFSecAuthorization Authorization,
		long argId )
	{
		long retNext = generateNextId64( argId,
			(short)204 );
		return( retNext );
	}

	public long nextTldIdGen( YCFSecAuthorization Authorization,
		YCFSecTenantPKey pkey )
	{
		long retval = nextTldIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public long nextTldIdGen( YCFSecAuthorization Authorization,
		long argId )
	{
		long retNext = generateNextId64( argId,
			(short)200 );
		return( retNext );
	}

	public long nextTopDomainIdGen( YCFSecAuthorization Authorization,
		YCFSecTenantPKey pkey )
	{
		long retval = nextTopDomainIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public long nextTopDomainIdGen( YCFSecAuthorization Authorization,
		long argId )
	{
		long retNext = generateNextId64( argId,
			(short)201 );
		return( retNext );
	}

	public long nextTopProjectIdGen( YCFSecAuthorization Authorization,
		YCFSecTenantPKey pkey )
	{
		long retval = nextTopProjectIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public long nextTopProjectIdGen( YCFSecAuthorization Authorization,
		long argId )
	{
		long retNext = generateNextId64( argId,
			(short)203 );
		return( retNext );
	}

	public long nextChainIdGen( YCFSecAuthorization Authorization,
		YCFSecTenantPKey pkey )
	{
		long retval = nextChainIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public long nextChainIdGen( YCFSecAuthorization Authorization,
		long argId )
	{
		long retNext = generateNextId64( argId,
			(short)1006 );
		return( retNext );
	}

	public long nextEnumTagIdGen( YCFSecAuthorization Authorization,
		YCFSecTenantPKey pkey )
	{
		long retval = nextEnumTagIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public long nextEnumTagIdGen( YCFSecAuthorization Authorization,
		long argId )
	{
		long retNext = generateNextId64( argId,
			(short)1005 );
		return( retNext );
	}

	public long nextIndexColIdGen( YCFSecAuthorization Authorization,
		YCFSecTenantPKey pkey )
	{
		long retval = nextIndexColIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public long nextIndexColIdGen( YCFSecAuthorization Authorization,
		long argId )
	{
		long retNext = generateNextId64( argId,
			(short)1002 );
		return( retNext );
	}

	public long nextParamIdGen( YCFSecAuthorization Authorization,
		YCFSecTenantPKey pkey )
	{
		long retval = nextParamIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public long nextParamIdGen( YCFSecAuthorization Authorization,
		long argId )
	{
		long retNext = generateNextId64( argId,
			(short)1007 );
		return( retNext );
	}

	public long nextRelationColIdGen( YCFSecAuthorization Authorization,
		YCFSecTenantPKey pkey )
	{
		long retval = nextRelationColIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public long nextRelationColIdGen( YCFSecAuthorization Authorization,
		long argId )
	{
		long retNext = generateNextId64( argId,
			(short)1003 );
		return( retNext );
	}

	public long nextScopeIdGen( YCFSecAuthorization Authorization,
		YCFSecTenantPKey pkey )
	{
		long retval = nextScopeIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public long nextScopeIdGen( YCFSecAuthorization Authorization,
		long argId )
	{
		long retNext = generateNextId64( argId,
			(short)1001 );
		return( retNext );
	}

	public long nextValueIdGen( YCFSecAuthorization Authorization,
		YCFSecTenantPKey pkey )
	{
		long retval = nextValueIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public long nextValueIdGen( YCFSecAuthorization Authorization,
		long argId )
	{
		long retNext = generateNextId64( argId,
			(short)1004 );
		return( retNext );
	}

	public long nextRoleIdGen( YCFSecAuthorization Authorization,
		YCFSecTenantPKey pkey )
	{
		long retval = nextRoleIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public long nextRoleIdGen( YCFSecAuthorization Authorization,
		long argId )
	{
		long retNext = generateNextId64( argId,
			(short)1008 );
		return( retNext );
	}

	public long nextTweakIdGen( YCFSecAuthorization Authorization,
		YCFSecTenantPKey pkey )
	{
		long retval = nextTweakIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public long nextTweakIdGen( YCFSecAuthorization Authorization,
		long argId )
	{
		long retNext = generateNextId64( argId,
			(short)1009 );
		return( retNext );
	}

	public void createTenant( YCFSecAuthorization Authorization,
		YCFSecTenantBuff Buff )
	{
		final String S_ProcName = "createTenant";
		YCFSecTenantPKey pkey = schema.getFactoryTenant().newPKey();
		pkey.setRequiredId( schema.nextTenantIdGen() );
		Buff.setRequiredId( pkey.getRequiredId() );
		YCFSecTenantByClusterIdxKey keyClusterIdx = schema.getFactoryTenant().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFSecTenantByUNameIdxKey keyUNameIdx = schema.getFactoryTenant().newUNameIdxKey();
		keyUNameIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyUNameIdx.setRequiredTenantName( Buff.getRequiredTenantName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"TenantUNameIdx",
				keyUNameIdx );
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
						"TenantCluster",
						"Cluster",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFSecTenantPKey, YCFSecTenantBuff > subdictClusterIdx;
		if( dictByClusterIdx.containsKey( keyClusterIdx ) ) {
			subdictClusterIdx = dictByClusterIdx.get( keyClusterIdx );
		}
		else {
			subdictClusterIdx = new HashMap< YCFSecTenantPKey, YCFSecTenantBuff >();
			dictByClusterIdx.put( keyClusterIdx, subdictClusterIdx );
		}
		subdictClusterIdx.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

	}

	public YCFSecTenantBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecTenantPKey PKey )
	{
		final String S_ProcName = "YCFBamRamTenant.readDerived";
		YCFSecTenantPKey key = schema.getFactoryTenant().newPKey();
		key.setRequiredId( PKey.getRequiredId() );
		YCFSecTenantBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecTenantBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecTenantPKey PKey )
	{
		final String S_ProcName = "YCFBamRamTenant.readDerived";
		YCFSecTenantPKey key = schema.getFactoryTenant().newPKey();
		key.setRequiredId( PKey.getRequiredId() );
		YCFSecTenantBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecTenantBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamTenant.readAllDerived";
		YCFSecTenantBuff[] retList = new YCFSecTenantBuff[ dictByPKey.values().size() ];
		Iterator< YCFSecTenantBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFSecTenantBuff[] readDerivedByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFBamRamTenant.readDerivedByClusterIdx";
		YCFSecTenantByClusterIdxKey key = schema.getFactoryTenant().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );

		YCFSecTenantBuff[] recArray;
		if( dictByClusterIdx.containsKey( key ) ) {
			Map< YCFSecTenantPKey, YCFSecTenantBuff > subdictClusterIdx
				= dictByClusterIdx.get( key );
			recArray = new YCFSecTenantBuff[ subdictClusterIdx.size() ];
			Iterator< YCFSecTenantBuff > iter = subdictClusterIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecTenantPKey, YCFSecTenantBuff > subdictClusterIdx
				= new HashMap< YCFSecTenantPKey, YCFSecTenantBuff >();
			dictByClusterIdx.put( key, subdictClusterIdx );
			recArray = new YCFSecTenantBuff[0];
		}
		return( recArray );
	}

	public YCFSecTenantBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		String TenantName )
	{
		final String S_ProcName = "YCFBamRamTenant.readDerivedByUNameIdx";
		YCFSecTenantByUNameIdxKey key = schema.getFactoryTenant().newUNameIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredTenantName( TenantName );

		YCFSecTenantBuff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecTenantBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long Id )
	{
		final String S_ProcName = "YCFBamRamTenant.readDerivedByIdIdx() ";
		YCFSecTenantPKey key = schema.getFactoryTenant().newPKey();
		key.setRequiredId( Id );

		YCFSecTenantBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecTenantBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecTenantPKey PKey )
	{
		final String S_ProcName = "YCFBamRamTenant.readBuff";
		YCFSecTenantBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a015" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecTenantBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecTenantPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFSecTenantBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a015" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecTenantBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamTenant.readAllBuff";
		YCFSecTenantBuff buff;
		ArrayList<YCFSecTenantBuff> filteredList = new ArrayList<YCFSecTenantBuff>();
		YCFSecTenantBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a015" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFSecTenantBuff[0] ) );
	}

	/**
	 *	Read a page of all the specific Tenant buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific Tenant instances in the database accessible for the Authorization.
	 */
	public YCFSecTenantBuff[] pageAllBuff( YCFSecAuthorization Authorization,
		Long priorId )
	{
		final String S_ProcName = "pageAllBuff";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public YCFSecTenantBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long Id )
	{
		final String S_ProcName = "YCFBamRamTenant.readBuffByIdIdx() ";
		YCFSecTenantBuff buff = readDerivedByIdIdx( Authorization,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a015" ) ) {
			return( (YCFSecTenantBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecTenantBuff[] readBuffByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFBamRamTenant.readBuffByClusterIdx() ";
		YCFSecTenantBuff buff;
		ArrayList<YCFSecTenantBuff> filteredList = new ArrayList<YCFSecTenantBuff>();
		YCFSecTenantBuff[] buffList = readDerivedByClusterIdx( Authorization,
			ClusterId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a015" ) ) {
				filteredList.add( (YCFSecTenantBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecTenantBuff[0] ) );
	}

	public YCFSecTenantBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		String TenantName )
	{
		final String S_ProcName = "YCFBamRamTenant.readBuffByUNameIdx() ";
		YCFSecTenantBuff buff = readDerivedByUNameIdx( Authorization,
			ClusterId,
			TenantName );
		if( ( buff != null ) && buff.getClassCode().equals( "a015" ) ) {
			return( (YCFSecTenantBuff)buff );
		}
		else {
			return( null );
		}
	}

	/**
	 *	Read a page array of the specific Tenant buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The Tenant key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFSecTenantBuff[] pageBuffByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByClusterIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateTenant( YCFSecAuthorization Authorization,
		YCFSecTenantBuff Buff )
	{
		YCFSecTenantPKey pkey = schema.getFactoryTenant().newPKey();
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFSecTenantBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateTenant",
				"Existing record not found",
				"Tenant",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateTenant",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFSecTenantByClusterIdxKey existingKeyClusterIdx = schema.getFactoryTenant().newClusterIdxKey();
		existingKeyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFSecTenantByClusterIdxKey newKeyClusterIdx = schema.getFactoryTenant().newClusterIdxKey();
		newKeyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFSecTenantByUNameIdxKey existingKeyUNameIdx = schema.getFactoryTenant().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyUNameIdx.setRequiredTenantName( existing.getRequiredTenantName() );

		YCFSecTenantByUNameIdxKey newKeyUNameIdx = schema.getFactoryTenant().newUNameIdxKey();
		newKeyUNameIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyUNameIdx.setRequiredTenantName( Buff.getRequiredTenantName() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateTenant",
					"TenantUNameIdx",
					newKeyUNameIdx );
			}
		}

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableCluster().readDerivedByIdIdx( Authorization,
						Buff.getRequiredClusterId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateTenant",
						"Container",
						"TenantCluster",
						"Cluster",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFSecTenantPKey, YCFSecTenantBuff > subdict;

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
			subdict = new HashMap< YCFSecTenantPKey, YCFSecTenantBuff >();
			dictByClusterIdx.put( newKeyClusterIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

	}

	public void deleteTenant( YCFSecAuthorization Authorization,
		YCFSecTenantBuff Buff )
	{
		final String S_ProcName = "YCFBamRamTenantTable.deleteTenant() ";
		String classCode;
		YCFSecTenantPKey pkey = schema.getFactoryTenant().newPKey();
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFSecTenantBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteTenant",
				pkey );
		}
			YCFBamSchemaDefBuff buffClearTableRelationNarrowed;
			YCFBamSchemaDefBuff arrClearTableRelationNarrowed[] = schema.getTableSchemaDef().readDerivedByCTenantIdx( Authorization,
			existing.getRequiredId() );
			for( int idxClearTableRelationNarrowed = 0; idxClearTableRelationNarrowed < arrClearTableRelationNarrowed.length; idxClearTableRelationNarrowed++ ) {
				buffClearTableRelationNarrowed = arrClearTableRelationNarrowed[idxClearTableRelationNarrowed];
				YCFBamTableBuff buffTables;
				YCFBamTableBuff arrTables[] = schema.getTableTable().readDerivedBySchemaDefIdx( Authorization,
				buffClearTableRelationNarrowed.getRequiredTenantId(),
				buffClearTableRelationNarrowed.getRequiredId() );
				for( int idxTables = 0; idxTables < arrTables.length; idxTables++ ) {
					buffTables = arrTables[idxTables];
					YCFBamRelationBuff buffTableRelation;
					YCFBamRelationBuff arrTableRelation[] = schema.getTableRelation().readDerivedByRelTableIdx( Authorization,
						buffTables.getRequiredTenantId(),
						buffTables.getRequiredId() );
					for( int idxTableRelation = 0; idxTableRelation < arrTableRelation.length; idxTableRelation++ ) {
						buffTableRelation = arrTableRelation[idxTableRelation];
					{
						YCFBamRelationBuff editBuff = schema.getTableRelation().readDerivedByIdIdx( Authorization,
							buffTables.getRequiredTenantId(),
							buffTables.getRequiredId() );
						editBuff.setOptionalNarrowedTenantId( null );
						editBuff.setOptionalNarrowedId( null );
						classCode = editBuff.getClassCode();
						if( classCode.equals( "a838" ) ) {
							schema.getTableRelation().updateRelation( Authorization, editBuff );
						}
						else {
							new YCFLibUnsupportedClassException( getClass(),
								S_ProcName,
								"Unrecognized ClassCode \"" + classCode + "\"" );
						}
					}
				
					}
				}
			}
		YCFBamSchemaDefBuff buffDelTableChain;
		YCFBamSchemaDefBuff arrDelTableChain[] = schema.getTableSchemaDef().readDerivedByCTenantIdx( Authorization,
			existing.getRequiredId() );
		for( int idxDelTableChain = 0; idxDelTableChain < arrDelTableChain.length; idxDelTableChain++ ) {
			buffDelTableChain = arrDelTableChain[idxDelTableChain];
			YCFBamTableBuff buffTables;
			YCFBamTableBuff arrTables[] = schema.getTableTable().readDerivedBySchemaDefIdx( Authorization,
				buffDelTableChain.getRequiredTenantId(),
				buffDelTableChain.getRequiredId() );
			for( int idxTables = 0; idxTables < arrTables.length; idxTables++ ) {
				buffTables = arrTables[idxTables];
					schema.getTableChain().deleteChainByChainTableIdx( Authorization,
						buffTables.getRequiredTenantId(),
						buffTables.getRequiredId() );
			}
		}
		YCFBamSchemaDefBuff buffDelTableRelationCol;
		YCFBamSchemaDefBuff arrDelTableRelationCol[] = schema.getTableSchemaDef().readDerivedByCTenantIdx( Authorization,
			existing.getRequiredId() );
		for( int idxDelTableRelationCol = 0; idxDelTableRelationCol < arrDelTableRelationCol.length; idxDelTableRelationCol++ ) {
			buffDelTableRelationCol = arrDelTableRelationCol[idxDelTableRelationCol];
			YCFBamTableBuff buffTables;
			YCFBamTableBuff arrTables[] = schema.getTableTable().readDerivedBySchemaDefIdx( Authorization,
				buffDelTableRelationCol.getRequiredTenantId(),
				buffDelTableRelationCol.getRequiredId() );
			for( int idxTables = 0; idxTables < arrTables.length; idxTables++ ) {
				buffTables = arrTables[idxTables];
			YCFBamRelationBuff buffTableRelation;
			YCFBamRelationBuff arrTableRelation[] = schema.getTableRelation().readDerivedByRelTableIdx( Authorization,
					buffTables.getRequiredTenantId(),
					buffTables.getRequiredId() );
			for( int idxTableRelation = 0; idxTableRelation < arrTableRelation.length; idxTableRelation++ ) {
				buffTableRelation = arrTableRelation[idxTableRelation];
					schema.getTableRelationCol().deleteRelationColByRelationIdx( Authorization,
						buffTableRelation.getRequiredTenantId(),
						buffTableRelation.getRequiredId() );
			}
			}
		}
		YCFBamSchemaDefBuff buffDelTableRelation;
		YCFBamSchemaDefBuff arrDelTableRelation[] = schema.getTableSchemaDef().readDerivedByCTenantIdx( Authorization,
			existing.getRequiredId() );
		for( int idxDelTableRelation = 0; idxDelTableRelation < arrDelTableRelation.length; idxDelTableRelation++ ) {
			buffDelTableRelation = arrDelTableRelation[idxDelTableRelation];
			YCFBamTableBuff buffTables;
			YCFBamTableBuff arrTables[] = schema.getTableTable().readDerivedBySchemaDefIdx( Authorization,
				buffDelTableRelation.getRequiredTenantId(),
				buffDelTableRelation.getRequiredId() );
			for( int idxTables = 0; idxTables < arrTables.length; idxTables++ ) {
				buffTables = arrTables[idxTables];
					schema.getTableRelation().deleteRelationByRelTableIdx( Authorization,
						buffTables.getRequiredTenantId(),
						buffTables.getRequiredId() );
			}
		}
		YCFBamSchemaDefBuff buffDelTable;
		YCFBamSchemaDefBuff arrDelTable[] = schema.getTableSchemaDef().readDerivedByCTenantIdx( Authorization,
			existing.getRequiredId() );
		for( int idxDelTable = 0; idxDelTable < arrDelTable.length; idxDelTable++ ) {
			buffDelTable = arrDelTable[idxDelTable];
					schema.getTableTable().deleteTableBySchemaDefIdx( Authorization,
						buffDelTable.getRequiredTenantId(),
						buffDelTable.getRequiredId() );
		}
		YCFBamSchemaDefBuff buffDelTypeDef;
		YCFBamSchemaDefBuff arrDelTypeDef[] = schema.getTableSchemaDef().readDerivedByCTenantIdx( Authorization,
			existing.getRequiredId() );
		for( int idxDelTypeDef = 0; idxDelTypeDef < arrDelTypeDef.length; idxDelTypeDef++ ) {
			buffDelTypeDef = arrDelTypeDef[idxDelTypeDef];
					schema.getTableValue().deleteValueByScopeIdx( Authorization,
						buffDelTypeDef.getRequiredTenantId(),
						buffDelTypeDef.getRequiredId() );
		}
					schema.getTableSchemaDef().deleteSchemaDefByCTenantIdx( Authorization,
						existing.getRequiredId() );
					schema.getTableTld().deleteTldByTenantIdx( Authorization,
						existing.getRequiredId() );
		YCFSecTSecGroupBuff buffDelIncludedByGroup;
		YCFSecTSecGroupBuff arrDelIncludedByGroup[] = schema.getTableTSecGroup().readDerivedByTenantIdx( Authorization,
			existing.getRequiredId() );
		for( int idxDelIncludedByGroup = 0; idxDelIncludedByGroup < arrDelIncludedByGroup.length; idxDelIncludedByGroup++ ) {
			buffDelIncludedByGroup = arrDelIncludedByGroup[idxDelIncludedByGroup];
					schema.getTableTSecGrpInc().deleteTSecGrpIncByIncludeIdx( Authorization,
						buffDelIncludedByGroup.getRequiredTenantId(),
						buffDelIncludedByGroup.getRequiredTSecGroupId() );
		}
		YCFSecTSecGroupBuff buffDelGrpMembs;
		YCFSecTSecGroupBuff arrDelGrpMembs[] = schema.getTableTSecGroup().readDerivedByTenantIdx( Authorization,
			existing.getRequiredId() );
		for( int idxDelGrpMembs = 0; idxDelGrpMembs < arrDelGrpMembs.length; idxDelGrpMembs++ ) {
			buffDelGrpMembs = arrDelGrpMembs[idxDelGrpMembs];
					schema.getTableTSecGrpMemb().deleteTSecGrpMembByGroupIdx( Authorization,
						buffDelGrpMembs.getRequiredTenantId(),
						buffDelGrpMembs.getRequiredTSecGroupId() );
		}
		YCFSecTSecGroupBuff buffDelGrpIncs;
		YCFSecTSecGroupBuff arrDelGrpIncs[] = schema.getTableTSecGroup().readDerivedByTenantIdx( Authorization,
			existing.getRequiredId() );
		for( int idxDelGrpIncs = 0; idxDelGrpIncs < arrDelGrpIncs.length; idxDelGrpIncs++ ) {
			buffDelGrpIncs = arrDelGrpIncs[idxDelGrpIncs];
					schema.getTableTSecGrpInc().deleteTSecGrpIncByGroupIdx( Authorization,
						buffDelGrpIncs.getRequiredTenantId(),
						buffDelGrpIncs.getRequiredTSecGroupId() );
		}
					schema.getTableTSecGroup().deleteTSecGroupByTenantIdx( Authorization,
						existing.getRequiredId() );
		YCFSecTenantByClusterIdxKey keyClusterIdx = schema.getFactoryTenant().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFSecTenantByUNameIdxKey keyUNameIdx = schema.getFactoryTenant().newUNameIdxKey();
		keyUNameIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUNameIdx.setRequiredTenantName( existing.getRequiredTenantName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFSecTenantPKey, YCFSecTenantBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByClusterIdx.get( keyClusterIdx );
		subdict.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

	}
	public void deleteTenantByIdIdx( YCFSecAuthorization Authorization,
		long argId )
	{
		YCFSecTenantPKey key = schema.getFactoryTenant().newPKey();
		key.setRequiredId( argId );
		deleteTenantByIdIdx( Authorization, key );
	}

	public void deleteTenantByIdIdx( YCFSecAuthorization Authorization,
		YCFSecTenantPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFSecTenantBuff cur;
		LinkedList<YCFSecTenantBuff> matchSet = new LinkedList<YCFSecTenantBuff>();
		Iterator<YCFSecTenantBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecTenantBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTenant().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() );
			deleteTenant( Authorization, cur );
		}
	}

	public void deleteTenantByClusterIdx( YCFSecAuthorization Authorization,
		long argClusterId )
	{
		YCFSecTenantByClusterIdxKey key = schema.getFactoryTenant().newClusterIdxKey();
		key.setRequiredClusterId( argClusterId );
		deleteTenantByClusterIdx( Authorization, key );
	}

	public void deleteTenantByClusterIdx( YCFSecAuthorization Authorization,
		YCFSecTenantByClusterIdxKey argKey )
	{
		YCFSecTenantBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecTenantBuff> matchSet = new LinkedList<YCFSecTenantBuff>();
		Iterator<YCFSecTenantBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecTenantBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTenant().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() );
			deleteTenant( Authorization, cur );
		}
	}

	public void deleteTenantByUNameIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		String argTenantName )
	{
		YCFSecTenantByUNameIdxKey key = schema.getFactoryTenant().newUNameIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredTenantName( argTenantName );
		deleteTenantByUNameIdx( Authorization, key );
	}

	public void deleteTenantByUNameIdx( YCFSecAuthorization Authorization,
		YCFSecTenantByUNameIdxKey argKey )
	{
		YCFSecTenantBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecTenantBuff> matchSet = new LinkedList<YCFSecTenantBuff>();
		Iterator<YCFSecTenantBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecTenantBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTenant().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() );
			deleteTenant( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
