
// Description: Java 11 in-memory RAM DbIO implementation for HostNode.

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
 *	YCFBamRamHostNodeTable in-memory RAM DbIO implementation
 *	for HostNode.
 */
public class YCFBamRamHostNodeTable
	implements IYCFBamHostNodeTable
{
	private IYCFBamSchema schema;
	private Map< YCFSecHostNodePKey,
				YCFSecHostNodeBuff > dictByPKey
		= new HashMap< YCFSecHostNodePKey,
				YCFSecHostNodeBuff >();
	private Map< YCFSecHostNodeByClusterIdxKey,
				Map< YCFSecHostNodePKey,
					YCFSecHostNodeBuff >> dictByClusterIdx
		= new HashMap< YCFSecHostNodeByClusterIdxKey,
				Map< YCFSecHostNodePKey,
					YCFSecHostNodeBuff >>();
	private Map< YCFSecHostNodeByUDescrIdxKey,
			YCFSecHostNodeBuff > dictByUDescrIdx
		= new HashMap< YCFSecHostNodeByUDescrIdxKey,
			YCFSecHostNodeBuff >();
	private Map< YCFSecHostNodeByHostNameIdxKey,
			YCFSecHostNodeBuff > dictByHostNameIdx
		= new HashMap< YCFSecHostNodeByHostNameIdxKey,
			YCFSecHostNodeBuff >();

	public YCFBamRamHostNodeTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createHostNode( YCFSecAuthorization Authorization,
		YCFSecHostNodeBuff Buff )
	{
		final String S_ProcName = "createHostNode";
		YCFSecHostNodePKey pkey = schema.getFactoryHostNode().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredHostNodeId( ((YCFBamRamClusterTable)schema.getTableCluster()).nextHostNodeIdGen( Authorization,
			Buff.getRequiredClusterId() ) );
		Buff.setRequiredClusterId( pkey.getRequiredClusterId() );
		Buff.setRequiredHostNodeId( pkey.getRequiredHostNodeId() );
		YCFSecHostNodeByClusterIdxKey keyClusterIdx = schema.getFactoryHostNode().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFSecHostNodeByUDescrIdxKey keyUDescrIdx = schema.getFactoryHostNode().newUDescrIdxKey();
		keyUDescrIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyUDescrIdx.setRequiredDescription( Buff.getRequiredDescription() );

		YCFSecHostNodeByHostNameIdxKey keyHostNameIdx = schema.getFactoryHostNode().newHostNameIdxKey();
		keyHostNameIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyHostNameIdx.setRequiredHostName( Buff.getRequiredHostName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUDescrIdx.containsKey( keyUDescrIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"HostNodeUDescrIdx",
				keyUDescrIdx );
		}

		if( dictByHostNameIdx.containsKey( keyHostNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"HostNodeUHostNameIdx",
				keyHostNameIdx );
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
						"HostNodeCluster",
						"Cluster",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFSecHostNodePKey, YCFSecHostNodeBuff > subdictClusterIdx;
		if( dictByClusterIdx.containsKey( keyClusterIdx ) ) {
			subdictClusterIdx = dictByClusterIdx.get( keyClusterIdx );
		}
		else {
			subdictClusterIdx = new HashMap< YCFSecHostNodePKey, YCFSecHostNodeBuff >();
			dictByClusterIdx.put( keyClusterIdx, subdictClusterIdx );
		}
		subdictClusterIdx.put( pkey, Buff );

		dictByUDescrIdx.put( keyUDescrIdx, Buff );

		dictByHostNameIdx.put( keyHostNameIdx, Buff );

	}

	public YCFSecHostNodeBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecHostNodePKey PKey )
	{
		final String S_ProcName = "YCFBamRamHostNode.readDerived";
		YCFSecHostNodePKey key = schema.getFactoryHostNode().newPKey();
		key.setRequiredClusterId( PKey.getRequiredClusterId() );
		key.setRequiredHostNodeId( PKey.getRequiredHostNodeId() );
		YCFSecHostNodeBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecHostNodeBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecHostNodePKey PKey )
	{
		final String S_ProcName = "YCFBamRamHostNode.readDerived";
		YCFSecHostNodePKey key = schema.getFactoryHostNode().newPKey();
		key.setRequiredClusterId( PKey.getRequiredClusterId() );
		key.setRequiredHostNodeId( PKey.getRequiredHostNodeId() );
		YCFSecHostNodeBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecHostNodeBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamHostNode.readAllDerived";
		YCFSecHostNodeBuff[] retList = new YCFSecHostNodeBuff[ dictByPKey.values().size() ];
		Iterator< YCFSecHostNodeBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFSecHostNodeBuff[] readDerivedByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFBamRamHostNode.readDerivedByClusterIdx";
		YCFSecHostNodeByClusterIdxKey key = schema.getFactoryHostNode().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );

		YCFSecHostNodeBuff[] recArray;
		if( dictByClusterIdx.containsKey( key ) ) {
			Map< YCFSecHostNodePKey, YCFSecHostNodeBuff > subdictClusterIdx
				= dictByClusterIdx.get( key );
			recArray = new YCFSecHostNodeBuff[ subdictClusterIdx.size() ];
			Iterator< YCFSecHostNodeBuff > iter = subdictClusterIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecHostNodePKey, YCFSecHostNodeBuff > subdictClusterIdx
				= new HashMap< YCFSecHostNodePKey, YCFSecHostNodeBuff >();
			dictByClusterIdx.put( key, subdictClusterIdx );
			recArray = new YCFSecHostNodeBuff[0];
		}
		return( recArray );
	}

	public YCFSecHostNodeBuff readDerivedByUDescrIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		String Description )
	{
		final String S_ProcName = "YCFBamRamHostNode.readDerivedByUDescrIdx";
		YCFSecHostNodeByUDescrIdxKey key = schema.getFactoryHostNode().newUDescrIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredDescription( Description );

		YCFSecHostNodeBuff buff;
		if( dictByUDescrIdx.containsKey( key ) ) {
			buff = dictByUDescrIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecHostNodeBuff readDerivedByHostNameIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		String HostName )
	{
		final String S_ProcName = "YCFBamRamHostNode.readDerivedByHostNameIdx";
		YCFSecHostNodeByHostNameIdxKey key = schema.getFactoryHostNode().newHostNameIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredHostName( HostName );

		YCFSecHostNodeBuff buff;
		if( dictByHostNameIdx.containsKey( key ) ) {
			buff = dictByHostNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecHostNodeBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		long HostNodeId )
	{
		final String S_ProcName = "YCFBamRamHostNode.readDerivedByIdIdx() ";
		YCFSecHostNodePKey key = schema.getFactoryHostNode().newPKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredHostNodeId( HostNodeId );

		YCFSecHostNodeBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecHostNodeBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecHostNodePKey PKey )
	{
		final String S_ProcName = "YCFBamRamHostNode.readBuff";
		YCFSecHostNodeBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a002" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecHostNodeBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecHostNodePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFSecHostNodeBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a002" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecHostNodeBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamHostNode.readAllBuff";
		YCFSecHostNodeBuff buff;
		ArrayList<YCFSecHostNodeBuff> filteredList = new ArrayList<YCFSecHostNodeBuff>();
		YCFSecHostNodeBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a002" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFSecHostNodeBuff[0] ) );
	}

	/**
	 *	Read a page of all the specific HostNode buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific HostNode instances in the database accessible for the Authorization.
	 */
	public YCFSecHostNodeBuff[] pageAllBuff( YCFSecAuthorization Authorization,
		Long priorClusterId,
		Long priorHostNodeId )
	{
		final String S_ProcName = "pageAllBuff";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public YCFSecHostNodeBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		long HostNodeId )
	{
		final String S_ProcName = "YCFBamRamHostNode.readBuffByIdIdx() ";
		YCFSecHostNodeBuff buff = readDerivedByIdIdx( Authorization,
			ClusterId,
			HostNodeId );
		if( ( buff != null ) && buff.getClassCode().equals( "a002" ) ) {
			return( (YCFSecHostNodeBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecHostNodeBuff[] readBuffByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFBamRamHostNode.readBuffByClusterIdx() ";
		YCFSecHostNodeBuff buff;
		ArrayList<YCFSecHostNodeBuff> filteredList = new ArrayList<YCFSecHostNodeBuff>();
		YCFSecHostNodeBuff[] buffList = readDerivedByClusterIdx( Authorization,
			ClusterId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a002" ) ) {
				filteredList.add( (YCFSecHostNodeBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecHostNodeBuff[0] ) );
	}

	public YCFSecHostNodeBuff readBuffByUDescrIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		String Description )
	{
		final String S_ProcName = "YCFBamRamHostNode.readBuffByUDescrIdx() ";
		YCFSecHostNodeBuff buff = readDerivedByUDescrIdx( Authorization,
			ClusterId,
			Description );
		if( ( buff != null ) && buff.getClassCode().equals( "a002" ) ) {
			return( (YCFSecHostNodeBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecHostNodeBuff readBuffByHostNameIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		String HostName )
	{
		final String S_ProcName = "YCFBamRamHostNode.readBuffByHostNameIdx() ";
		YCFSecHostNodeBuff buff = readDerivedByHostNameIdx( Authorization,
			ClusterId,
			HostName );
		if( ( buff != null ) && buff.getClassCode().equals( "a002" ) ) {
			return( (YCFSecHostNodeBuff)buff );
		}
		else {
			return( null );
		}
	}

	/**
	 *	Read a page array of the specific HostNode buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFSecHostNodeBuff[] pageBuffByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		Long priorClusterId,
		Long priorHostNodeId )
	{
		final String S_ProcName = "pageBuffByClusterIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateHostNode( YCFSecAuthorization Authorization,
		YCFSecHostNodeBuff Buff )
	{
		YCFSecHostNodePKey pkey = schema.getFactoryHostNode().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredHostNodeId( Buff.getRequiredHostNodeId() );
		YCFSecHostNodeBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateHostNode",
				"Existing record not found",
				"HostNode",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateHostNode",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFSecHostNodeByClusterIdxKey existingKeyClusterIdx = schema.getFactoryHostNode().newClusterIdxKey();
		existingKeyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFSecHostNodeByClusterIdxKey newKeyClusterIdx = schema.getFactoryHostNode().newClusterIdxKey();
		newKeyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFSecHostNodeByUDescrIdxKey existingKeyUDescrIdx = schema.getFactoryHostNode().newUDescrIdxKey();
		existingKeyUDescrIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyUDescrIdx.setRequiredDescription( existing.getRequiredDescription() );

		YCFSecHostNodeByUDescrIdxKey newKeyUDescrIdx = schema.getFactoryHostNode().newUDescrIdxKey();
		newKeyUDescrIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyUDescrIdx.setRequiredDescription( Buff.getRequiredDescription() );

		YCFSecHostNodeByHostNameIdxKey existingKeyHostNameIdx = schema.getFactoryHostNode().newHostNameIdxKey();
		existingKeyHostNameIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyHostNameIdx.setRequiredHostName( existing.getRequiredHostName() );

		YCFSecHostNodeByHostNameIdxKey newKeyHostNameIdx = schema.getFactoryHostNode().newHostNameIdxKey();
		newKeyHostNameIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyHostNameIdx.setRequiredHostName( Buff.getRequiredHostName() );

		// Check unique indexes

		if( ! existingKeyUDescrIdx.equals( newKeyUDescrIdx ) ) {
			if( dictByUDescrIdx.containsKey( newKeyUDescrIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateHostNode",
					"HostNodeUDescrIdx",
					newKeyUDescrIdx );
			}
		}

		if( ! existingKeyHostNameIdx.equals( newKeyHostNameIdx ) ) {
			if( dictByHostNameIdx.containsKey( newKeyHostNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateHostNode",
					"HostNodeUHostNameIdx",
					newKeyHostNameIdx );
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
						"updateHostNode",
						"Container",
						"HostNodeCluster",
						"Cluster",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFSecHostNodePKey, YCFSecHostNodeBuff > subdict;

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
			subdict = new HashMap< YCFSecHostNodePKey, YCFSecHostNodeBuff >();
			dictByClusterIdx.put( newKeyClusterIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUDescrIdx.remove( existingKeyUDescrIdx );
		dictByUDescrIdx.put( newKeyUDescrIdx, Buff );

		dictByHostNameIdx.remove( existingKeyHostNameIdx );
		dictByHostNameIdx.put( newKeyHostNameIdx, Buff );

	}

	public void deleteHostNode( YCFSecAuthorization Authorization,
		YCFSecHostNodeBuff Buff )
	{
		final String S_ProcName = "YCFBamRamHostNodeTable.deleteHostNode() ";
		String classCode;
		YCFSecHostNodePKey pkey = schema.getFactoryHostNode().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredHostNodeId( Buff.getRequiredHostNodeId() );
		YCFSecHostNodeBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteHostNode",
				pkey );
		}
					schema.getTableService().deleteServiceByHostIdx( Authorization,
						existing.getRequiredClusterId(),
						existing.getRequiredHostNodeId() );
		YCFSecHostNodeByClusterIdxKey keyClusterIdx = schema.getFactoryHostNode().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFSecHostNodeByUDescrIdxKey keyUDescrIdx = schema.getFactoryHostNode().newUDescrIdxKey();
		keyUDescrIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUDescrIdx.setRequiredDescription( existing.getRequiredDescription() );

		YCFSecHostNodeByHostNameIdxKey keyHostNameIdx = schema.getFactoryHostNode().newHostNameIdxKey();
		keyHostNameIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyHostNameIdx.setRequiredHostName( existing.getRequiredHostName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFSecHostNodePKey, YCFSecHostNodeBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByClusterIdx.get( keyClusterIdx );
		subdict.remove( pkey );

		dictByUDescrIdx.remove( keyUDescrIdx );

		dictByHostNameIdx.remove( keyHostNameIdx );

	}
	public void deleteHostNodeByIdIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		long argHostNodeId )
	{
		YCFSecHostNodePKey key = schema.getFactoryHostNode().newPKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredHostNodeId( argHostNodeId );
		deleteHostNodeByIdIdx( Authorization, key );
	}

	public void deleteHostNodeByIdIdx( YCFSecAuthorization Authorization,
		YCFSecHostNodePKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFSecHostNodeBuff cur;
		LinkedList<YCFSecHostNodeBuff> matchSet = new LinkedList<YCFSecHostNodeBuff>();
		Iterator<YCFSecHostNodeBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecHostNodeBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableHostNode().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredHostNodeId() );
			deleteHostNode( Authorization, cur );
		}
	}

	public void deleteHostNodeByClusterIdx( YCFSecAuthorization Authorization,
		long argClusterId )
	{
		YCFSecHostNodeByClusterIdxKey key = schema.getFactoryHostNode().newClusterIdxKey();
		key.setRequiredClusterId( argClusterId );
		deleteHostNodeByClusterIdx( Authorization, key );
	}

	public void deleteHostNodeByClusterIdx( YCFSecAuthorization Authorization,
		YCFSecHostNodeByClusterIdxKey argKey )
	{
		YCFSecHostNodeBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecHostNodeBuff> matchSet = new LinkedList<YCFSecHostNodeBuff>();
		Iterator<YCFSecHostNodeBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecHostNodeBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableHostNode().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredHostNodeId() );
			deleteHostNode( Authorization, cur );
		}
	}

	public void deleteHostNodeByUDescrIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		String argDescription )
	{
		YCFSecHostNodeByUDescrIdxKey key = schema.getFactoryHostNode().newUDescrIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredDescription( argDescription );
		deleteHostNodeByUDescrIdx( Authorization, key );
	}

	public void deleteHostNodeByUDescrIdx( YCFSecAuthorization Authorization,
		YCFSecHostNodeByUDescrIdxKey argKey )
	{
		YCFSecHostNodeBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecHostNodeBuff> matchSet = new LinkedList<YCFSecHostNodeBuff>();
		Iterator<YCFSecHostNodeBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecHostNodeBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableHostNode().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredHostNodeId() );
			deleteHostNode( Authorization, cur );
		}
	}

	public void deleteHostNodeByHostNameIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		String argHostName )
	{
		YCFSecHostNodeByHostNameIdxKey key = schema.getFactoryHostNode().newHostNameIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredHostName( argHostName );
		deleteHostNodeByHostNameIdx( Authorization, key );
	}

	public void deleteHostNodeByHostNameIdx( YCFSecAuthorization Authorization,
		YCFSecHostNodeByHostNameIdxKey argKey )
	{
		YCFSecHostNodeBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecHostNodeBuff> matchSet = new LinkedList<YCFSecHostNodeBuff>();
		Iterator<YCFSecHostNodeBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecHostNodeBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableHostNode().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredHostNodeId() );
			deleteHostNode( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
