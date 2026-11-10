
// Description: Java 11 in-memory RAM DbIO implementation for Cluster.

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
 *	YCFGenKbRamClusterTable in-memory RAM DbIO implementation
 *	for Cluster.
 */
public class YCFGenKbRamClusterTable
	implements IYCFGenKbClusterTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbClusterPKey,
				YCFGenKbClusterBuff > dictByPKey
		= new HashMap< YCFGenKbClusterPKey,
				YCFGenKbClusterBuff >();
	private Map< YCFGenKbClusterByUDomNameIdxKey,
			YCFGenKbClusterBuff > dictByUDomNameIdx
		= new HashMap< YCFGenKbClusterByUDomNameIdxKey,
			YCFGenKbClusterBuff >();
	private Map< YCFGenKbClusterByUDescrIdxKey,
			YCFGenKbClusterBuff > dictByUDescrIdx
		= new HashMap< YCFGenKbClusterByUDescrIdxKey,
			YCFGenKbClusterBuff >();
	private Map< YCFGenKbRamClusterId32Gen,
				YCFGenKbRamClusterId32Gen > id32Generator
		= new HashMap< YCFGenKbRamClusterId32Gen,
				YCFGenKbRamClusterId32Gen >();
	private Map< YCFGenKbRamClusterId64Gen,
				YCFGenKbRamClusterId64Gen > id64Generator
		= new HashMap< YCFGenKbRamClusterId64Gen,
				YCFGenKbRamClusterId64Gen >();

	public YCFGenKbRamClusterTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	protected int generateNextId32( long argId,
		short argSliceId )
	{
		YCFGenKbRamClusterId32Gen key = new YCFGenKbRamClusterId32Gen();
		key.setRequiredId( argId );
		key.setRequiredSliceId( argSliceId );

		YCFGenKbRamClusterId32Gen useGen = id32Generator.get( key );
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
		YCFGenKbRamClusterId64Gen key = new YCFGenKbRamClusterId64Gen();
		key.setRequiredId( argId );
		key.setRequiredSliceId( argSliceId );

		YCFGenKbRamClusterId64Gen useGen = id64Generator.get( key );
		if( useGen == null ) {
			id64Generator.put( key, key );
			useGen = key;
		}

		long retNext = useGen.getNextId();

		return( retNext );
	}

	public int nextSecAppIdGen( YCFGenKbAuthorization Authorization,
		YCFGenKbClusterPKey pkey )
	{
		int retval = nextSecAppIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public int nextSecAppIdGen( YCFGenKbAuthorization Authorization,
		long argId )
	{
		int retNext = generateNextId32( argId,
			(short)1011 );
		return( retNext );
	}

	public int nextSecFormIdGen( YCFGenKbAuthorization Authorization,
		YCFGenKbClusterPKey pkey )
	{
		int retval = nextSecFormIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public int nextSecFormIdGen( YCFGenKbAuthorization Authorization,
		long argId )
	{
		int retNext = generateNextId32( argId,
			(short)1012 );
		return( retNext );
	}

	public int nextSecGroupIdGen( YCFGenKbAuthorization Authorization,
		YCFGenKbClusterPKey pkey )
	{
		int retval = nextSecGroupIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public int nextSecGroupIdGen( YCFGenKbAuthorization Authorization,
		long argId )
	{
		int retNext = generateNextId32( argId,
			(short)1014 );
		return( retNext );
	}

	public long nextHostNodeIdGen( YCFGenKbAuthorization Authorization,
		YCFGenKbClusterPKey pkey )
	{
		long retval = nextHostNodeIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public long nextHostNodeIdGen( YCFGenKbAuthorization Authorization,
		long argId )
	{
		long retNext = generateNextId64( argId,
			(short)1010 );
		return( retNext );
	}

	public long nextSecGroupFormIdGen( YCFGenKbAuthorization Authorization,
		YCFGenKbClusterPKey pkey )
	{
		long retval = nextSecGroupFormIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public long nextSecGroupFormIdGen( YCFGenKbAuthorization Authorization,
		long argId )
	{
		long retNext = generateNextId64( argId,
			(short)1013 );
		return( retNext );
	}

	public long nextSecGrpIncIdGen( YCFGenKbAuthorization Authorization,
		YCFGenKbClusterPKey pkey )
	{
		long retval = nextSecGrpIncIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public long nextSecGrpIncIdGen( YCFGenKbAuthorization Authorization,
		long argId )
	{
		long retNext = generateNextId64( argId,
			(short)1015 );
		return( retNext );
	}

	public long nextSecGrpMembIdGen( YCFGenKbAuthorization Authorization,
		YCFGenKbClusterPKey pkey )
	{
		long retval = nextSecGrpMembIdGen( Authorization,
			pkey.getRequiredId() );
		return( retval );
	}

	public long nextSecGrpMembIdGen( YCFGenKbAuthorization Authorization,
		long argId )
	{
		long retNext = generateNextId64( argId,
			(short)1016 );
		return( retNext );
	}

	public void createCluster( YCFGenKbAuthorization Authorization,
		YCFGenKbClusterBuff Buff )
	{
		final String S_ProcName = "createCluster";
		YCFGenKbClusterPKey pkey = schema.getFactoryCluster().newPKey();
		pkey.setRequiredId( schema.nextClusterIdGen() );
		Buff.setRequiredId( pkey.getRequiredId() );
		YCFGenKbClusterByUDomNameIdxKey keyUDomNameIdx = schema.getFactoryCluster().newUDomNameIdxKey();
		keyUDomNameIdx.setRequiredFullDomName( Buff.getRequiredFullDomName() );

		YCFGenKbClusterByUDescrIdxKey keyUDescrIdx = schema.getFactoryCluster().newUDescrIdxKey();
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

	public YCFGenKbClusterBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbClusterPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamCluster.readDerived";
		YCFGenKbClusterPKey key = schema.getFactoryCluster().newPKey();
		key.setRequiredId( PKey.getRequiredId() );
		YCFGenKbClusterBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbClusterBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbClusterPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamCluster.readDerived";
		YCFGenKbClusterPKey key = schema.getFactoryCluster().newPKey();
		key.setRequiredId( PKey.getRequiredId() );
		YCFGenKbClusterBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbClusterBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamCluster.readAllDerived";
		YCFGenKbClusterBuff[] retList = new YCFGenKbClusterBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbClusterBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbClusterBuff readDerivedByUDomNameIdx( YCFGenKbAuthorization Authorization,
		String FullDomName )
	{
		final String S_ProcName = "YCFGenKbRamCluster.readDerivedByUDomNameIdx";
		YCFGenKbClusterByUDomNameIdxKey key = schema.getFactoryCluster().newUDomNameIdxKey();
		key.setRequiredFullDomName( FullDomName );

		YCFGenKbClusterBuff buff;
		if( dictByUDomNameIdx.containsKey( key ) ) {
			buff = dictByUDomNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbClusterBuff readDerivedByUDescrIdx( YCFGenKbAuthorization Authorization,
		String Description )
	{
		final String S_ProcName = "YCFGenKbRamCluster.readDerivedByUDescrIdx";
		YCFGenKbClusterByUDescrIdxKey key = schema.getFactoryCluster().newUDescrIdxKey();
		key.setRequiredDescription( Description );

		YCFGenKbClusterBuff buff;
		if( dictByUDescrIdx.containsKey( key ) ) {
			buff = dictByUDescrIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbClusterBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
		long Id )
	{
		final String S_ProcName = "YCFGenKbRamCluster.readDerivedByIdIdx() ";
		YCFGenKbClusterPKey key = schema.getFactoryCluster().newPKey();
		key.setRequiredId( Id );

		YCFGenKbClusterBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbClusterBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbClusterPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamCluster.readBuff";
		YCFGenKbClusterBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a901" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbClusterBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbClusterPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbClusterBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a901" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbClusterBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamCluster.readAllBuff";
		YCFGenKbClusterBuff buff;
		ArrayList<YCFGenKbClusterBuff> filteredList = new ArrayList<YCFGenKbClusterBuff>();
		YCFGenKbClusterBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a901" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbClusterBuff[0] ) );
	}

	/**
	 *	Read a page of all the specific Cluster buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific Cluster instances in the database accessible for the Authorization.
	 */
	public YCFGenKbClusterBuff[] pageAllBuff( YCFGenKbAuthorization Authorization,
		Long priorId )
	{
		final String S_ProcName = "pageAllBuff";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public YCFGenKbClusterBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
		long Id )
	{
		final String S_ProcName = "YCFGenKbRamCluster.readBuffByIdIdx() ";
		YCFGenKbClusterBuff buff = readDerivedByIdIdx( Authorization,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a901" ) ) {
			return( (YCFGenKbClusterBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbClusterBuff readBuffByUDomNameIdx( YCFGenKbAuthorization Authorization,
		String FullDomName )
	{
		final String S_ProcName = "YCFGenKbRamCluster.readBuffByUDomNameIdx() ";
		YCFGenKbClusterBuff buff = readDerivedByUDomNameIdx( Authorization,
			FullDomName );
		if( ( buff != null ) && buff.getClassCode().equals( "a901" ) ) {
			return( (YCFGenKbClusterBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbClusterBuff readBuffByUDescrIdx( YCFGenKbAuthorization Authorization,
		String Description )
	{
		final String S_ProcName = "YCFGenKbRamCluster.readBuffByUDescrIdx() ";
		YCFGenKbClusterBuff buff = readDerivedByUDescrIdx( Authorization,
			Description );
		if( ( buff != null ) && buff.getClassCode().equals( "a901" ) ) {
			return( (YCFGenKbClusterBuff)buff );
		}
		else {
			return( null );
		}
	}

	public void updateCluster( YCFGenKbAuthorization Authorization,
		YCFGenKbClusterBuff Buff )
	{
		YCFGenKbClusterPKey pkey = schema.getFactoryCluster().newPKey();
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFGenKbClusterBuff existing = dictByPKey.get( pkey );
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
		YCFGenKbClusterByUDomNameIdxKey existingKeyUDomNameIdx = schema.getFactoryCluster().newUDomNameIdxKey();
		existingKeyUDomNameIdx.setRequiredFullDomName( existing.getRequiredFullDomName() );

		YCFGenKbClusterByUDomNameIdxKey newKeyUDomNameIdx = schema.getFactoryCluster().newUDomNameIdxKey();
		newKeyUDomNameIdx.setRequiredFullDomName( Buff.getRequiredFullDomName() );

		YCFGenKbClusterByUDescrIdxKey existingKeyUDescrIdx = schema.getFactoryCluster().newUDescrIdxKey();
		existingKeyUDescrIdx.setRequiredDescription( existing.getRequiredDescription() );

		YCFGenKbClusterByUDescrIdxKey newKeyUDescrIdx = schema.getFactoryCluster().newUDescrIdxKey();
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

		Map< YCFGenKbClusterPKey, YCFGenKbClusterBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		dictByUDomNameIdx.remove( existingKeyUDomNameIdx );
		dictByUDomNameIdx.put( newKeyUDomNameIdx, Buff );

		dictByUDescrIdx.remove( existingKeyUDescrIdx );
		dictByUDescrIdx.put( newKeyUDescrIdx, Buff );

	}

	public void deleteCluster( YCFGenKbAuthorization Authorization,
		YCFGenKbClusterBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamClusterTable.deleteCluster() ";
		String classCode;
		YCFGenKbClusterPKey pkey = schema.getFactoryCluster().newPKey();
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFGenKbClusterBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteCluster",
				pkey );
		}
		YCFGenKbSecGroupBuff buffDelSecGroupForms;
		YCFGenKbSecGroupBuff arrDelSecGroupForms[] = schema.getTableSecGroup().readDerivedByClusterIdx( Authorization,
			existing.getRequiredId() );
		for( int idxDelSecGroupForms = 0; idxDelSecGroupForms < arrDelSecGroupForms.length; idxDelSecGroupForms++ ) {
			buffDelSecGroupForms = arrDelSecGroupForms[idxDelSecGroupForms];
					schema.getTableSecGroupForm().deleteSecGroupFormByGroupIdx( Authorization,
						buffDelSecGroupForms.getRequiredClusterId(),
						buffDelSecGroupForms.getRequiredSecGroupId() );
		}
		YCFGenKbSecGroupBuff buffDelSecGrpIncByGroup;
		YCFGenKbSecGroupBuff arrDelSecGrpIncByGroup[] = schema.getTableSecGroup().readDerivedByClusterIdx( Authorization,
			existing.getRequiredId() );
		for( int idxDelSecGrpIncByGroup = 0; idxDelSecGrpIncByGroup < arrDelSecGrpIncByGroup.length; idxDelSecGrpIncByGroup++ ) {
			buffDelSecGrpIncByGroup = arrDelSecGrpIncByGroup[idxDelSecGrpIncByGroup];
					schema.getTableSecGrpInc().deleteSecGrpIncByIncludeIdx( Authorization,
						buffDelSecGrpIncByGroup.getRequiredClusterId(),
						buffDelSecGrpIncByGroup.getRequiredSecGroupId() );
		}
		YCFGenKbSecGroupBuff buffDelSecGrpMembs;
		YCFGenKbSecGroupBuff arrDelSecGrpMembs[] = schema.getTableSecGroup().readDerivedByClusterIdx( Authorization,
			existing.getRequiredId() );
		for( int idxDelSecGrpMembs = 0; idxDelSecGrpMembs < arrDelSecGrpMembs.length; idxDelSecGrpMembs++ ) {
			buffDelSecGrpMembs = arrDelSecGrpMembs[idxDelSecGrpMembs];
					schema.getTableSecGrpMemb().deleteSecGrpMembByGroupIdx( Authorization,
						buffDelSecGrpMembs.getRequiredClusterId(),
						buffDelSecGrpMembs.getRequiredSecGroupId() );
		}
		YCFGenKbSecGroupBuff buffDelSecGrpIncs;
		YCFGenKbSecGroupBuff arrDelSecGrpIncs[] = schema.getTableSecGroup().readDerivedByClusterIdx( Authorization,
			existing.getRequiredId() );
		for( int idxDelSecGrpIncs = 0; idxDelSecGrpIncs < arrDelSecGrpIncs.length; idxDelSecGrpIncs++ ) {
			buffDelSecGrpIncs = arrDelSecGrpIncs[idxDelSecGrpIncs];
					schema.getTableSecGrpInc().deleteSecGrpIncByGroupIdx( Authorization,
						buffDelSecGrpIncs.getRequiredClusterId(),
						buffDelSecGrpIncs.getRequiredSecGroupId() );
		}
					schema.getTableSecGroup().deleteSecGroupByClusterIdx( Authorization,
						existing.getRequiredId() );
		YCFGenKbSecAppBuff buffDelSecAppForms;
		YCFGenKbSecAppBuff arrDelSecAppForms[] = schema.getTableSecApp().readDerivedByClusterIdx( Authorization,
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
		YCFGenKbClusterByUDomNameIdxKey keyUDomNameIdx = schema.getFactoryCluster().newUDomNameIdxKey();
		keyUDomNameIdx.setRequiredFullDomName( existing.getRequiredFullDomName() );

		YCFGenKbClusterByUDescrIdxKey keyUDescrIdx = schema.getFactoryCluster().newUDescrIdxKey();
		keyUDescrIdx.setRequiredDescription( existing.getRequiredDescription() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFGenKbClusterPKey, YCFGenKbClusterBuff > subdict;

		dictByPKey.remove( pkey );

		dictByUDomNameIdx.remove( keyUDomNameIdx );

		dictByUDescrIdx.remove( keyUDescrIdx );

	}
	public void deleteClusterByIdIdx( YCFGenKbAuthorization Authorization,
		long argId )
	{
		YCFGenKbClusterPKey key = schema.getFactoryCluster().newPKey();
		key.setRequiredId( argId );
		deleteClusterByIdIdx( Authorization, key );
	}

	public void deleteClusterByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbClusterPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbClusterBuff cur;
		LinkedList<YCFGenKbClusterBuff> matchSet = new LinkedList<YCFGenKbClusterBuff>();
		Iterator<YCFGenKbClusterBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbClusterBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableCluster().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() );
			deleteCluster( Authorization, cur );
		}
	}

	public void deleteClusterByUDomNameIdx( YCFGenKbAuthorization Authorization,
		String argFullDomName )
	{
		YCFGenKbClusterByUDomNameIdxKey key = schema.getFactoryCluster().newUDomNameIdxKey();
		key.setRequiredFullDomName( argFullDomName );
		deleteClusterByUDomNameIdx( Authorization, key );
	}

	public void deleteClusterByUDomNameIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbClusterByUDomNameIdxKey argKey )
	{
		YCFGenKbClusterBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbClusterBuff> matchSet = new LinkedList<YCFGenKbClusterBuff>();
		Iterator<YCFGenKbClusterBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbClusterBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableCluster().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() );
			deleteCluster( Authorization, cur );
		}
	}

	public void deleteClusterByUDescrIdx( YCFGenKbAuthorization Authorization,
		String argDescription )
	{
		YCFGenKbClusterByUDescrIdxKey key = schema.getFactoryCluster().newUDescrIdxKey();
		key.setRequiredDescription( argDescription );
		deleteClusterByUDescrIdx( Authorization, key );
	}

	public void deleteClusterByUDescrIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbClusterByUDescrIdxKey argKey )
	{
		YCFGenKbClusterBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbClusterBuff> matchSet = new LinkedList<YCFGenKbClusterBuff>();
		Iterator<YCFGenKbClusterBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbClusterBuff> iterMatch = matchSet.iterator();
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
