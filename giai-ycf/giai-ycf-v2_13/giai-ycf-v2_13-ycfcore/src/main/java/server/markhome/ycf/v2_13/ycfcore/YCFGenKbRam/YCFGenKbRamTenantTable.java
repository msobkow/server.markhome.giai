
// Description: Java 11 in-memory RAM DbIO implementation for Tenant.

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
 *	YCFGenKbRamTenantTable in-memory RAM DbIO implementation
 *	for Tenant.
 */
public class YCFGenKbRamTenantTable
	implements IYCFGenKbTenantTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbTenantPKey,
				YCFGenKbTenantBuff > dictByPKey
		= new HashMap< YCFGenKbTenantPKey,
				YCFGenKbTenantBuff >();
	private Map< YCFGenKbTenantByClusterIdxKey,
				Map< YCFGenKbTenantPKey,
					YCFGenKbTenantBuff >> dictByClusterIdx
		= new HashMap< YCFGenKbTenantByClusterIdxKey,
				Map< YCFGenKbTenantPKey,
					YCFGenKbTenantBuff >>();
	private Map< YCFGenKbTenantByUNameIdxKey,
			YCFGenKbTenantBuff > dictByUNameIdx
		= new HashMap< YCFGenKbTenantByUNameIdxKey,
			YCFGenKbTenantBuff >();
	private Map< YCFGenKbRamTenantId32Gen,
				YCFGenKbRamTenantId32Gen > id32Generator
		= new HashMap< YCFGenKbRamTenantId32Gen,
				YCFGenKbRamTenantId32Gen >();
	private Map< YCFGenKbRamTenantId64Gen,
				YCFGenKbRamTenantId64Gen > id64Generator
		= new HashMap< YCFGenKbRamTenantId64Gen,
				YCFGenKbRamTenantId64Gen >();

	public YCFGenKbRamTenantTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	protected int generateNextId32( long argId,
		short argSliceId )
	{
		YCFGenKbRamTenantId32Gen key = new YCFGenKbRamTenantId32Gen();
		key.setRequiredId( argId );
		key.setRequiredSliceId( argSliceId );

		YCFGenKbRamTenantId32Gen useGen = id32Generator.get( key );
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
		YCFGenKbRamTenantId64Gen key = new YCFGenKbRamTenantId64Gen();
		key.setRequiredId( argId );
		key.setRequiredSliceId( argSliceId );

		YCFGenKbRamTenantId64Gen useGen = id64Generator.get( key );
		if( useGen == null ) {
			id64Generator.put( key, key );
			useGen = key;
		}

		long retNext = useGen.getNextId();

		return( retNext );
	}

	public int nextTSecGroupIdGen( YCFGenKbAuthorization Authorization,
		YCFGenKbTenantPKey pkey )
	{
		int retval = nextTSecGroupIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public int nextTSecGroupIdGen( YCFGenKbAuthorization Authorization,
		long argId )
	{
		int retNext = generateNextId32( argId,
			(short)1018 );
		return( retNext );
	}

	public long nextTSecGrpIncIdGen( YCFGenKbAuthorization Authorization,
		YCFGenKbTenantPKey pkey )
	{
		long retval = nextTSecGrpIncIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public long nextTSecGrpIncIdGen( YCFGenKbAuthorization Authorization,
		long argId )
	{
		long retNext = generateNextId64( argId,
			(short)1019 );
		return( retNext );
	}

	public long nextTSecGrpMembIdGen( YCFGenKbAuthorization Authorization,
		YCFGenKbTenantPKey pkey )
	{
		long retval = nextTSecGrpMembIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public long nextTSecGrpMembIdGen( YCFGenKbAuthorization Authorization,
		long argId )
	{
		long retNext = generateNextId64( argId,
			(short)1020 );
		return( retNext );
	}

	public long nextGelCacheIdGen( YCFGenKbAuthorization Authorization,
		YCFGenKbTenantPKey pkey )
	{
		long retval = nextGelCacheIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public long nextGelCacheIdGen( YCFGenKbAuthorization Authorization,
		long argId )
	{
		long retNext = generateNextId64( argId,
			(short)1022 );
		return( retNext );
	}

	public long nextGelInstructionIdGen( YCFGenKbAuthorization Authorization,
		YCFGenKbTenantPKey pkey )
	{
		long retval = nextGelInstructionIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public long nextGelInstructionIdGen( YCFGenKbAuthorization Authorization,
		long argId )
	{
		long retNext = generateNextId64( argId,
			(short)1023 );
		return( retNext );
	}

	public long nextGenItemIdGen( YCFGenKbAuthorization Authorization,
		YCFGenKbTenantPKey pkey )
	{
		long retval = nextGenItemIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public long nextGenItemIdGen( YCFGenKbAuthorization Authorization,
		long argId )
	{
		long retNext = generateNextId64( argId,
			(short)1024 );
		return( retNext );
	}

	public long nextRuleCartIdGen( YCFGenKbAuthorization Authorization,
		YCFGenKbTenantPKey pkey )
	{
		long retval = nextRuleCartIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public long nextRuleCartIdGen( YCFGenKbAuthorization Authorization,
		long argId )
	{
		long retNext = generateNextId64( argId,
			(short)1025 );
		return( retNext );
	}

	public void createTenant( YCFGenKbAuthorization Authorization,
		YCFGenKbTenantBuff Buff )
	{
		final String S_ProcName = "createTenant";
		YCFGenKbTenantPKey pkey = schema.getFactoryTenant().newPKey();
		pkey.setRequiredId( schema.nextTenantIdGen() );
		Buff.setRequiredId( pkey.getRequiredId() );
		YCFGenKbTenantByClusterIdxKey keyClusterIdx = schema.getFactoryTenant().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFGenKbTenantByUNameIdxKey keyUNameIdx = schema.getFactoryTenant().newUNameIdxKey();
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

		Map< YCFGenKbTenantPKey, YCFGenKbTenantBuff > subdictClusterIdx;
		if( dictByClusterIdx.containsKey( keyClusterIdx ) ) {
			subdictClusterIdx = dictByClusterIdx.get( keyClusterIdx );
		}
		else {
			subdictClusterIdx = new HashMap< YCFGenKbTenantPKey, YCFGenKbTenantBuff >();
			dictByClusterIdx.put( keyClusterIdx, subdictClusterIdx );
		}
		subdictClusterIdx.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

	}

	public YCFGenKbTenantBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbTenantPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamTenant.readDerived";
		YCFGenKbTenantPKey key = schema.getFactoryTenant().newPKey();
		key.setRequiredId( PKey.getRequiredId() );
		YCFGenKbTenantBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbTenantBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbTenantPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamTenant.readDerived";
		YCFGenKbTenantPKey key = schema.getFactoryTenant().newPKey();
		key.setRequiredId( PKey.getRequiredId() );
		YCFGenKbTenantBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbTenantBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamTenant.readAllDerived";
		YCFGenKbTenantBuff[] retList = new YCFGenKbTenantBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbTenantBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbTenantBuff[] readDerivedByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFGenKbRamTenant.readDerivedByClusterIdx";
		YCFGenKbTenantByClusterIdxKey key = schema.getFactoryTenant().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );

		YCFGenKbTenantBuff[] recArray;
		if( dictByClusterIdx.containsKey( key ) ) {
			Map< YCFGenKbTenantPKey, YCFGenKbTenantBuff > subdictClusterIdx
				= dictByClusterIdx.get( key );
			recArray = new YCFGenKbTenantBuff[ subdictClusterIdx.size() ];
			Iterator< YCFGenKbTenantBuff > iter = subdictClusterIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbTenantPKey, YCFGenKbTenantBuff > subdictClusterIdx
				= new HashMap< YCFGenKbTenantPKey, YCFGenKbTenantBuff >();
			dictByClusterIdx.put( key, subdictClusterIdx );
			recArray = new YCFGenKbTenantBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbTenantBuff readDerivedByUNameIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		String TenantName )
	{
		final String S_ProcName = "YCFGenKbRamTenant.readDerivedByUNameIdx";
		YCFGenKbTenantByUNameIdxKey key = schema.getFactoryTenant().newUNameIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredTenantName( TenantName );

		YCFGenKbTenantBuff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbTenantBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
		long Id )
	{
		final String S_ProcName = "YCFGenKbRamTenant.readDerivedByIdIdx() ";
		YCFGenKbTenantPKey key = schema.getFactoryTenant().newPKey();
		key.setRequiredId( Id );

		YCFGenKbTenantBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbTenantBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbTenantPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamTenant.readBuff";
		YCFGenKbTenantBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a910" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbTenantBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbTenantPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbTenantBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a910" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbTenantBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamTenant.readAllBuff";
		YCFGenKbTenantBuff buff;
		ArrayList<YCFGenKbTenantBuff> filteredList = new ArrayList<YCFGenKbTenantBuff>();
		YCFGenKbTenantBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a910" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbTenantBuff[0] ) );
	}

	/**
	 *	Read a page of all the specific Tenant buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific Tenant instances in the database accessible for the Authorization.
	 */
	public YCFGenKbTenantBuff[] pageAllBuff( YCFGenKbAuthorization Authorization,
		Long priorId )
	{
		final String S_ProcName = "pageAllBuff";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public YCFGenKbTenantBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
		long Id )
	{
		final String S_ProcName = "YCFGenKbRamTenant.readBuffByIdIdx() ";
		YCFGenKbTenantBuff buff = readDerivedByIdIdx( Authorization,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a910" ) ) {
			return( (YCFGenKbTenantBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbTenantBuff[] readBuffByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFGenKbRamTenant.readBuffByClusterIdx() ";
		YCFGenKbTenantBuff buff;
		ArrayList<YCFGenKbTenantBuff> filteredList = new ArrayList<YCFGenKbTenantBuff>();
		YCFGenKbTenantBuff[] buffList = readDerivedByClusterIdx( Authorization,
			ClusterId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a910" ) ) {
				filteredList.add( (YCFGenKbTenantBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbTenantBuff[0] ) );
	}

	public YCFGenKbTenantBuff readBuffByUNameIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		String TenantName )
	{
		final String S_ProcName = "YCFGenKbRamTenant.readBuffByUNameIdx() ";
		YCFGenKbTenantBuff buff = readDerivedByUNameIdx( Authorization,
			ClusterId,
			TenantName );
		if( ( buff != null ) && buff.getClassCode().equals( "a910" ) ) {
			return( (YCFGenKbTenantBuff)buff );
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
	public YCFGenKbTenantBuff[] pageBuffByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByClusterIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateTenant( YCFGenKbAuthorization Authorization,
		YCFGenKbTenantBuff Buff )
	{
		YCFGenKbTenantPKey pkey = schema.getFactoryTenant().newPKey();
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFGenKbTenantBuff existing = dictByPKey.get( pkey );
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
		YCFGenKbTenantByClusterIdxKey existingKeyClusterIdx = schema.getFactoryTenant().newClusterIdxKey();
		existingKeyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFGenKbTenantByClusterIdxKey newKeyClusterIdx = schema.getFactoryTenant().newClusterIdxKey();
		newKeyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFGenKbTenantByUNameIdxKey existingKeyUNameIdx = schema.getFactoryTenant().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyUNameIdx.setRequiredTenantName( existing.getRequiredTenantName() );

		YCFGenKbTenantByUNameIdxKey newKeyUNameIdx = schema.getFactoryTenant().newUNameIdxKey();
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

		Map< YCFGenKbTenantPKey, YCFGenKbTenantBuff > subdict;

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
			subdict = new HashMap< YCFGenKbTenantPKey, YCFGenKbTenantBuff >();
			dictByClusterIdx.put( newKeyClusterIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

	}

	public void deleteTenant( YCFGenKbAuthorization Authorization,
		YCFGenKbTenantBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamTenantTable.deleteTenant() ";
		String classCode;
		YCFGenKbTenantPKey pkey = schema.getFactoryTenant().newPKey();
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFGenKbTenantBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteTenant",
				pkey );
		}
					schema.getTableRuleCart().deleteRuleCartByTenantIdx( Authorization,
						existing.getRequiredId() );
		YCFGenKbTSecGroupBuff buffDelIncludedByGroup;
		YCFGenKbTSecGroupBuff arrDelIncludedByGroup[] = schema.getTableTSecGroup().readDerivedByTenantIdx( Authorization,
			existing.getRequiredId() );
		for( int idxDelIncludedByGroup = 0; idxDelIncludedByGroup < arrDelIncludedByGroup.length; idxDelIncludedByGroup++ ) {
			buffDelIncludedByGroup = arrDelIncludedByGroup[idxDelIncludedByGroup];
					schema.getTableTSecGrpInc().deleteTSecGrpIncByIncludeIdx( Authorization,
						buffDelIncludedByGroup.getRequiredTenantId(),
						buffDelIncludedByGroup.getRequiredTSecGroupId() );
		}
		YCFGenKbTSecGroupBuff buffDelGrpMembs;
		YCFGenKbTSecGroupBuff arrDelGrpMembs[] = schema.getTableTSecGroup().readDerivedByTenantIdx( Authorization,
			existing.getRequiredId() );
		for( int idxDelGrpMembs = 0; idxDelGrpMembs < arrDelGrpMembs.length; idxDelGrpMembs++ ) {
			buffDelGrpMembs = arrDelGrpMembs[idxDelGrpMembs];
					schema.getTableTSecGrpMemb().deleteTSecGrpMembByGroupIdx( Authorization,
						buffDelGrpMembs.getRequiredTenantId(),
						buffDelGrpMembs.getRequiredTSecGroupId() );
		}
		YCFGenKbTSecGroupBuff buffDelGrpIncs;
		YCFGenKbTSecGroupBuff arrDelGrpIncs[] = schema.getTableTSecGroup().readDerivedByTenantIdx( Authorization,
			existing.getRequiredId() );
		for( int idxDelGrpIncs = 0; idxDelGrpIncs < arrDelGrpIncs.length; idxDelGrpIncs++ ) {
			buffDelGrpIncs = arrDelGrpIncs[idxDelGrpIncs];
					schema.getTableTSecGrpInc().deleteTSecGrpIncByGroupIdx( Authorization,
						buffDelGrpIncs.getRequiredTenantId(),
						buffDelGrpIncs.getRequiredTSecGroupId() );
		}
					schema.getTableTSecGroup().deleteTSecGroupByTenantIdx( Authorization,
						existing.getRequiredId() );
		YCFGenKbTenantByClusterIdxKey keyClusterIdx = schema.getFactoryTenant().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFGenKbTenantByUNameIdxKey keyUNameIdx = schema.getFactoryTenant().newUNameIdxKey();
		keyUNameIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUNameIdx.setRequiredTenantName( existing.getRequiredTenantName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFGenKbTenantPKey, YCFGenKbTenantBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByClusterIdx.get( keyClusterIdx );
		subdict.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

	}
	public void deleteTenantByIdIdx( YCFGenKbAuthorization Authorization,
		long argId )
	{
		YCFGenKbTenantPKey key = schema.getFactoryTenant().newPKey();
		key.setRequiredId( argId );
		deleteTenantByIdIdx( Authorization, key );
	}

	public void deleteTenantByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbTenantPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbTenantBuff cur;
		LinkedList<YCFGenKbTenantBuff> matchSet = new LinkedList<YCFGenKbTenantBuff>();
		Iterator<YCFGenKbTenantBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbTenantBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTenant().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() );
			deleteTenant( Authorization, cur );
		}
	}

	public void deleteTenantByClusterIdx( YCFGenKbAuthorization Authorization,
		long argClusterId )
	{
		YCFGenKbTenantByClusterIdxKey key = schema.getFactoryTenant().newClusterIdxKey();
		key.setRequiredClusterId( argClusterId );
		deleteTenantByClusterIdx( Authorization, key );
	}

	public void deleteTenantByClusterIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbTenantByClusterIdxKey argKey )
	{
		YCFGenKbTenantBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbTenantBuff> matchSet = new LinkedList<YCFGenKbTenantBuff>();
		Iterator<YCFGenKbTenantBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbTenantBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTenant().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() );
			deleteTenant( Authorization, cur );
		}
	}

	public void deleteTenantByUNameIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		String argTenantName )
	{
		YCFGenKbTenantByUNameIdxKey key = schema.getFactoryTenant().newUNameIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredTenantName( argTenantName );
		deleteTenantByUNameIdx( Authorization, key );
	}

	public void deleteTenantByUNameIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbTenantByUNameIdxKey argKey )
	{
		YCFGenKbTenantBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbTenantBuff> matchSet = new LinkedList<YCFGenKbTenantBuff>();
		Iterator<YCFGenKbTenantBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbTenantBuff> iterMatch = matchSet.iterator();
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
