
// Description: Java 11 in-memory RAM DbIO implementation for Cluster.

/*
 *	org.mssycf.mssycf.YCFSec
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

package org.mssycf.mssycf.v2_13.ycfsec.YCFSecRam;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;

/*
 *	YCFSecRamClusterTable in-memory RAM DbIO implementation
 *	for Cluster.
 */
public class YCFSecRamClusterTable
	implements IYCFSecClusterTable
{
	private IYCFSecSchema schema;
	private Map< YCFSecClusterPKey,
				YCFSecClusterBuff > dictByPKey
		= new HashMap< YCFSecClusterPKey,
				YCFSecClusterBuff >();
	private Map< YCFSecClusterByUDomNameIdxKey,
			YCFSecClusterBuff > dictByUDomNameIdx
		= new HashMap< YCFSecClusterByUDomNameIdxKey,
			YCFSecClusterBuff >();
	private Map< YCFSecClusterByUDescrIdxKey,
			YCFSecClusterBuff > dictByUDescrIdx
		= new HashMap< YCFSecClusterByUDescrIdxKey,
			YCFSecClusterBuff >();
	private Map< YCFSecRamClusterId32Gen,
				YCFSecRamClusterId32Gen > id32Generator
		= new HashMap< YCFSecRamClusterId32Gen,
				YCFSecRamClusterId32Gen >();
	private Map< YCFSecRamClusterId64Gen,
				YCFSecRamClusterId64Gen > id64Generator
		= new HashMap< YCFSecRamClusterId64Gen,
				YCFSecRamClusterId64Gen >();

	public YCFSecRamClusterTable( IYCFSecSchema argSchema ) {
		schema = argSchema;
	}

	protected int generateNextId32( long argId,
		short argSliceId )
	{
		YCFSecRamClusterId32Gen key = new YCFSecRamClusterId32Gen();
		key.setRequiredId( argId );
		key.setRequiredSliceId( argSliceId );

		YCFSecRamClusterId32Gen useGen = id32Generator.get( key );
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
		YCFSecRamClusterId64Gen key = new YCFSecRamClusterId64Gen();
		key.setRequiredId( argId );
		key.setRequiredSliceId( argSliceId );

		YCFSecRamClusterId64Gen useGen = id64Generator.get( key );
		if( useGen == null ) {
			id64Generator.put( key, key );
			useGen = key;
		}

		long retNext = useGen.getNextId();

		return( retNext );
	}

	public int nextSecAppIdGen( YCFSecAuthorization Authorization,
		YCFSecClusterPKey pkey )
	{
		int retval = nextSecAppIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public int nextSecAppIdGen( YCFSecAuthorization Authorization,
		long argId )
	{
		int retNext = generateNextId32( argId,
			(short)107 );
		return( retNext );
	}

	public int nextSecFormIdGen( YCFSecAuthorization Authorization,
		YCFSecClusterPKey pkey )
	{
		int retval = nextSecFormIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public int nextSecFormIdGen( YCFSecAuthorization Authorization,
		long argId )
	{
		int retNext = generateNextId32( argId,
			(short)108 );
		return( retNext );
	}

	public int nextSecGroupIdGen( YCFSecAuthorization Authorization,
		YCFSecClusterPKey pkey )
	{
		int retval = nextSecGroupIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public int nextSecGroupIdGen( YCFSecAuthorization Authorization,
		long argId )
	{
		int retNext = generateNextId32( argId,
			(short)109 );
		return( retNext );
	}

	public long nextHostNodeIdGen( YCFSecAuthorization Authorization,
		YCFSecClusterPKey pkey )
	{
		long retval = nextHostNodeIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public long nextHostNodeIdGen( YCFSecAuthorization Authorization,
		long argId )
	{
		long retNext = generateNextId64( argId,
			(short)116 );
		return( retNext );
	}

	public long nextSecGroupFormIdGen( YCFSecAuthorization Authorization,
		YCFSecClusterPKey pkey )
	{
		long retval = nextSecGroupFormIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public long nextSecGroupFormIdGen( YCFSecAuthorization Authorization,
		long argId )
	{
		long retNext = generateNextId64( argId,
			(short)112 );
		return( retNext );
	}

	public long nextSecGrpIncIdGen( YCFSecAuthorization Authorization,
		YCFSecClusterPKey pkey )
	{
		long retval = nextSecGrpIncIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public long nextSecGrpIncIdGen( YCFSecAuthorization Authorization,
		long argId )
	{
		long retNext = generateNextId64( argId,
			(short)111 );
		return( retNext );
	}

	public long nextSecGrpMembIdGen( YCFSecAuthorization Authorization,
		YCFSecClusterPKey pkey )
	{
		long retval = nextSecGrpMembIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public long nextSecGrpMembIdGen( YCFSecAuthorization Authorization,
		long argId )
	{
		long retNext = generateNextId64( argId,
			(short)110 );
		return( retNext );
	}

	public long nextServiceIdGen( YCFSecAuthorization Authorization,
		YCFSecClusterPKey pkey )
	{
		long retval = nextServiceIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public long nextServiceIdGen( YCFSecAuthorization Authorization,
		long argId )
	{
		long retNext = generateNextId64( argId,
			(short)115 );
		return( retNext );
	}

	public void createCluster( YCFSecAuthorization Authorization,
		YCFSecClusterBuff Buff )
	{
		final String S_ProcName = "createCluster";
		YCFSecClusterPKey pkey = schema.getFactoryCluster().newPKey();
		pkey.setRequiredId( schema.nextClusterIdGen() );
		Buff.setRequiredId( pkey.getRequiredId() );
		YCFSecClusterByUDomNameIdxKey keyUDomNameIdx = schema.getFactoryCluster().newUDomNameIdxKey();
		keyUDomNameIdx.setRequiredFullDomName( Buff.getRequiredFullDomName() );

		YCFSecClusterByUDescrIdxKey keyUDescrIdx = schema.getFactoryCluster().newUDescrIdxKey();
		keyUDescrIdx.setRequiredDescription( Buff.getRequiredDescription() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUDomNameIdx.containsKey( keyUDomNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"ClusterUDomNameIdx",
				keyUDomNameIdx );
		}

		if( dictByUDescrIdx.containsKey( keyUDescrIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"ClusterUDescrNameIdx",
				keyUDescrIdx );
		}

		// Validate foreign keys

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		dictByUDomNameIdx.put( keyUDomNameIdx, Buff );

		dictByUDescrIdx.put( keyUDescrIdx, Buff );

	}

	public YCFSecClusterBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecClusterPKey PKey )
	{
		final String S_ProcName = "YCFSecRamCluster.readDerived";
		YCFSecClusterPKey key = schema.getFactoryCluster().newPKey();
		key.setRequiredId( PKey.getRequiredId() );
		YCFSecClusterBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecClusterBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecClusterPKey PKey )
	{
		final String S_ProcName = "YCFSecRamCluster.readDerived";
		YCFSecClusterPKey key = schema.getFactoryCluster().newPKey();
		key.setRequiredId( PKey.getRequiredId() );
		YCFSecClusterBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecClusterBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFSecRamCluster.readAllDerived";
		YCFSecClusterBuff[] retList = new YCFSecClusterBuff[ dictByPKey.values().size() ];
		Iterator< YCFSecClusterBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFSecClusterBuff readDerivedByUDomNameIdx( YCFSecAuthorization Authorization,
		String FullDomName )
	{
		final String S_ProcName = "YCFSecRamCluster.readDerivedByUDomNameIdx";
		YCFSecClusterByUDomNameIdxKey key = schema.getFactoryCluster().newUDomNameIdxKey();
		key.setRequiredFullDomName( FullDomName );

		YCFSecClusterBuff buff;
		if( dictByUDomNameIdx.containsKey( key ) ) {
			buff = dictByUDomNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecClusterBuff readDerivedByUDescrIdx( YCFSecAuthorization Authorization,
		String Description )
	{
		final String S_ProcName = "YCFSecRamCluster.readDerivedByUDescrIdx";
		YCFSecClusterByUDescrIdxKey key = schema.getFactoryCluster().newUDescrIdxKey();
		key.setRequiredDescription( Description );

		YCFSecClusterBuff buff;
		if( dictByUDescrIdx.containsKey( key ) ) {
			buff = dictByUDescrIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecClusterBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long Id )
	{
		final String S_ProcName = "YCFSecRamCluster.readDerivedByIdIdx() ";
		YCFSecClusterPKey key = schema.getFactoryCluster().newPKey();
		key.setRequiredId( Id );

		YCFSecClusterBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecClusterBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecClusterPKey PKey )
	{
		final String S_ProcName = "YCFSecRamCluster.readBuff";
		YCFSecClusterBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a001" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecClusterBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecClusterPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFSecClusterBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a001" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecClusterBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFSecRamCluster.readAllBuff";
		YCFSecClusterBuff buff;
		ArrayList<YCFSecClusterBuff> filteredList = new ArrayList<YCFSecClusterBuff>();
		YCFSecClusterBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a001" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFSecClusterBuff[0] ) );
	}

	/**
	 *	Read a page of all the specific Cluster buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific Cluster instances in the database accessible for the Authorization.
	 */
	public YCFSecClusterBuff[] pageAllBuff( YCFSecAuthorization Authorization,
		Long priorId )
	{
		final String S_ProcName = "pageAllBuff";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public YCFSecClusterBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long Id )
	{
		final String S_ProcName = "YCFSecRamCluster.readBuffByIdIdx() ";
		YCFSecClusterBuff buff = readDerivedByIdIdx( Authorization,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a001" ) ) {
			return( (YCFSecClusterBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecClusterBuff readBuffByUDomNameIdx( YCFSecAuthorization Authorization,
		String FullDomName )
	{
		final String S_ProcName = "YCFSecRamCluster.readBuffByUDomNameIdx() ";
		YCFSecClusterBuff buff = readDerivedByUDomNameIdx( Authorization,
			FullDomName );
		if( ( buff != null ) && buff.getClassCode().equals( "a001" ) ) {
			return( (YCFSecClusterBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecClusterBuff readBuffByUDescrIdx( YCFSecAuthorization Authorization,
		String Description )
	{
		final String S_ProcName = "YCFSecRamCluster.readBuffByUDescrIdx() ";
		YCFSecClusterBuff buff = readDerivedByUDescrIdx( Authorization,
			Description );
		if( ( buff != null ) && buff.getClassCode().equals( "a001" ) ) {
			return( (YCFSecClusterBuff)buff );
		}
		else {
			return( null );
		}
	}

	public void updateCluster( YCFSecAuthorization Authorization,
		YCFSecClusterBuff Buff )
	{
		YCFSecClusterPKey pkey = schema.getFactoryCluster().newPKey();
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFSecClusterBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateCluster",
				"Existing record not found",
				"Cluster",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateCluster",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFSecClusterByUDomNameIdxKey existingKeyUDomNameIdx = schema.getFactoryCluster().newUDomNameIdxKey();
		existingKeyUDomNameIdx.setRequiredFullDomName( existing.getRequiredFullDomName() );

		YCFSecClusterByUDomNameIdxKey newKeyUDomNameIdx = schema.getFactoryCluster().newUDomNameIdxKey();
		newKeyUDomNameIdx.setRequiredFullDomName( Buff.getRequiredFullDomName() );

		YCFSecClusterByUDescrIdxKey existingKeyUDescrIdx = schema.getFactoryCluster().newUDescrIdxKey();
		existingKeyUDescrIdx.setRequiredDescription( existing.getRequiredDescription() );

		YCFSecClusterByUDescrIdxKey newKeyUDescrIdx = schema.getFactoryCluster().newUDescrIdxKey();
		newKeyUDescrIdx.setRequiredDescription( Buff.getRequiredDescription() );

		// Check unique indexes

		if( ! existingKeyUDomNameIdx.equals( newKeyUDomNameIdx ) ) {
			if( dictByUDomNameIdx.containsKey( newKeyUDomNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateCluster",
					"ClusterUDomNameIdx",
					newKeyUDomNameIdx );
			}
		}

		if( ! existingKeyUDescrIdx.equals( newKeyUDescrIdx ) ) {
			if( dictByUDescrIdx.containsKey( newKeyUDescrIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateCluster",
					"ClusterUDescrNameIdx",
					newKeyUDescrIdx );
			}
		}

		// Validate foreign keys

		// Update is valid

		Map< YCFSecClusterPKey, YCFSecClusterBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		dictByUDomNameIdx.remove( existingKeyUDomNameIdx );
		dictByUDomNameIdx.put( newKeyUDomNameIdx, Buff );

		dictByUDescrIdx.remove( existingKeyUDescrIdx );
		dictByUDescrIdx.put( newKeyUDescrIdx, Buff );

	}

	public void deleteCluster( YCFSecAuthorization Authorization,
		YCFSecClusterBuff Buff )
	{
		final String S_ProcName = "YCFSecRamClusterTable.deleteCluster() ";
		String classCode;
		YCFSecClusterPKey pkey = schema.getFactoryCluster().newPKey();
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFSecClusterBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteCluster",
				pkey );
		}
		YCFSecSecGroupBuff buffDelSecGroupForms;
		YCFSecSecGroupBuff arrDelSecGroupForms[] = schema.getTableSecGroup().readDerivedByClusterIdx( Authorization,
			existing.getRequiredId() );
		for( int idxDelSecGroupForms = 0; idxDelSecGroupForms < arrDelSecGroupForms.length; idxDelSecGroupForms++ ) {
			buffDelSecGroupForms = arrDelSecGroupForms[idxDelSecGroupForms];
					schema.getTableSecGroupForm().deleteSecGroupFormByGroupIdx( Authorization,
						buffDelSecGroupForms.getRequiredClusterId(),
						buffDelSecGroupForms.getRequiredSecGroupId() );
		}
		YCFSecSecGroupBuff buffDelSecGrpIncByGroup;
		YCFSecSecGroupBuff arrDelSecGrpIncByGroup[] = schema.getTableSecGroup().readDerivedByClusterIdx( Authorization,
			existing.getRequiredId() );
		for( int idxDelSecGrpIncByGroup = 0; idxDelSecGrpIncByGroup < arrDelSecGrpIncByGroup.length; idxDelSecGrpIncByGroup++ ) {
			buffDelSecGrpIncByGroup = arrDelSecGrpIncByGroup[idxDelSecGrpIncByGroup];
					schema.getTableSecGrpInc().deleteSecGrpIncByIncludeIdx( Authorization,
						buffDelSecGrpIncByGroup.getRequiredClusterId(),
						buffDelSecGrpIncByGroup.getRequiredSecGroupId() );
		}
		YCFSecSecGroupBuff buffDelSecGrpMembs;
		YCFSecSecGroupBuff arrDelSecGrpMembs[] = schema.getTableSecGroup().readDerivedByClusterIdx( Authorization,
			existing.getRequiredId() );
		for( int idxDelSecGrpMembs = 0; idxDelSecGrpMembs < arrDelSecGrpMembs.length; idxDelSecGrpMembs++ ) {
			buffDelSecGrpMembs = arrDelSecGrpMembs[idxDelSecGrpMembs];
					schema.getTableSecGrpMemb().deleteSecGrpMembByGroupIdx( Authorization,
						buffDelSecGrpMembs.getRequiredClusterId(),
						buffDelSecGrpMembs.getRequiredSecGroupId() );
		}
		YCFSecSecGroupBuff buffDelSecGrpIncs;
		YCFSecSecGroupBuff arrDelSecGrpIncs[] = schema.getTableSecGroup().readDerivedByClusterIdx( Authorization,
			existing.getRequiredId() );
		for( int idxDelSecGrpIncs = 0; idxDelSecGrpIncs < arrDelSecGrpIncs.length; idxDelSecGrpIncs++ ) {
			buffDelSecGrpIncs = arrDelSecGrpIncs[idxDelSecGrpIncs];
					schema.getTableSecGrpInc().deleteSecGrpIncByGroupIdx( Authorization,
						buffDelSecGrpIncs.getRequiredClusterId(),
						buffDelSecGrpIncs.getRequiredSecGroupId() );
		}
					schema.getTableSecGroup().deleteSecGroupByClusterIdx( Authorization,
						existing.getRequiredId() );
		YCFSecSecAppBuff buffDelSecAppForms;
		YCFSecSecAppBuff arrDelSecAppForms[] = schema.getTableSecApp().readDerivedByClusterIdx( Authorization,
			existing.getRequiredId() );
		for( int idxDelSecAppForms = 0; idxDelSecAppForms < arrDelSecAppForms.length; idxDelSecAppForms++ ) {
			buffDelSecAppForms = arrDelSecAppForms[idxDelSecAppForms];
					schema.getTableSecForm().deleteSecFormBySecAppIdx( Authorization,
						buffDelSecAppForms.getRequiredClusterId(),
						buffDelSecAppForms.getRequiredSecAppId() );
		}
					schema.getTableSecApp().deleteSecAppByClusterIdx( Authorization,
						existing.getRequiredId() );
					schema.getTableTenant().deleteTenantByClusterIdx( Authorization,
						existing.getRequiredId() );
					schema.getTableHostNode().deleteHostNodeByClusterIdx( Authorization,
						existing.getRequiredId() );
		YCFSecClusterByUDomNameIdxKey keyUDomNameIdx = schema.getFactoryCluster().newUDomNameIdxKey();
		keyUDomNameIdx.setRequiredFullDomName( existing.getRequiredFullDomName() );

		YCFSecClusterByUDescrIdxKey keyUDescrIdx = schema.getFactoryCluster().newUDescrIdxKey();
		keyUDescrIdx.setRequiredDescription( existing.getRequiredDescription() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFSecClusterPKey, YCFSecClusterBuff > subdict;

		dictByPKey.remove( pkey );

		dictByUDomNameIdx.remove( keyUDomNameIdx );

		dictByUDescrIdx.remove( keyUDescrIdx );

	}
	public void deleteClusterByIdIdx( YCFSecAuthorization Authorization,
		long argId )
	{
		YCFSecClusterPKey key = schema.getFactoryCluster().newPKey();
		key.setRequiredId( argId );
		deleteClusterByIdIdx( Authorization, key );
	}

	public void deleteClusterByIdIdx( YCFSecAuthorization Authorization,
		YCFSecClusterPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFSecClusterBuff cur;
		LinkedList<YCFSecClusterBuff> matchSet = new LinkedList<YCFSecClusterBuff>();
		Iterator<YCFSecClusterBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecClusterBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableCluster().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() );
			deleteCluster( Authorization, cur );
		}
	}

	public void deleteClusterByUDomNameIdx( YCFSecAuthorization Authorization,
		String argFullDomName )
	{
		YCFSecClusterByUDomNameIdxKey key = schema.getFactoryCluster().newUDomNameIdxKey();
		key.setRequiredFullDomName( argFullDomName );
		deleteClusterByUDomNameIdx( Authorization, key );
	}

	public void deleteClusterByUDomNameIdx( YCFSecAuthorization Authorization,
		YCFSecClusterByUDomNameIdxKey argKey )
	{
		YCFSecClusterBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecClusterBuff> matchSet = new LinkedList<YCFSecClusterBuff>();
		Iterator<YCFSecClusterBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecClusterBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableCluster().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() );
			deleteCluster( Authorization, cur );
		}
	}

	public void deleteClusterByUDescrIdx( YCFSecAuthorization Authorization,
		String argDescription )
	{
		YCFSecClusterByUDescrIdxKey key = schema.getFactoryCluster().newUDescrIdxKey();
		key.setRequiredDescription( argDescription );
		deleteClusterByUDescrIdx( Authorization, key );
	}

	public void deleteClusterByUDescrIdx( YCFSecAuthorization Authorization,
		YCFSecClusterByUDescrIdxKey argKey )
	{
		YCFSecClusterBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecClusterBuff> matchSet = new LinkedList<YCFSecClusterBuff>();
		Iterator<YCFSecClusterBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecClusterBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableCluster().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() );
			deleteCluster( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
