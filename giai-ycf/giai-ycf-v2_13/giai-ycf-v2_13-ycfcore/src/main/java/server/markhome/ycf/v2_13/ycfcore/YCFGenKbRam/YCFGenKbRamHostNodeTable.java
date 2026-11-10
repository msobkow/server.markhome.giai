
// Description: Java 11 in-memory RAM DbIO implementation for HostNode.

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
 *	YCFGenKbRamHostNodeTable in-memory RAM DbIO implementation
 *	for HostNode.
 */
public class YCFGenKbRamHostNodeTable
	implements IYCFGenKbHostNodeTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbHostNodePKey,
				YCFGenKbHostNodeBuff > dictByPKey
		= new HashMap< YCFGenKbHostNodePKey,
				YCFGenKbHostNodeBuff >();
	private Map< YCFGenKbHostNodeByClusterIdxKey,
				Map< YCFGenKbHostNodePKey,
					YCFGenKbHostNodeBuff >> dictByClusterIdx
		= new HashMap< YCFGenKbHostNodeByClusterIdxKey,
				Map< YCFGenKbHostNodePKey,
					YCFGenKbHostNodeBuff >>();
	private Map< YCFGenKbHostNodeByUDescrIdxKey,
			YCFGenKbHostNodeBuff > dictByUDescrIdx
		= new HashMap< YCFGenKbHostNodeByUDescrIdxKey,
			YCFGenKbHostNodeBuff >();
	private Map< YCFGenKbHostNodeByHostNameIdxKey,
			YCFGenKbHostNodeBuff > dictByHostNameIdx
		= new HashMap< YCFGenKbHostNodeByHostNameIdxKey,
			YCFGenKbHostNodeBuff >();

	public YCFGenKbRamHostNodeTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createHostNode( YCFGenKbAuthorization Authorization,
		YCFGenKbHostNodeBuff Buff )
	{
		final String S_ProcName = "createHostNode";
		YCFGenKbHostNodePKey pkey = schema.getFactoryHostNode().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredHostNodeId( ((YCFGenKbRamClusterTable)schema.getTableCluster()).nextHostNodeIdGen( Authorization,
			Buff.getRequiredClusterId() ) );
		Buff.setRequiredClusterId( pkey.getRequiredClusterId() );
		Buff.setRequiredHostNodeId( pkey.getRequiredHostNodeId() );
		YCFGenKbHostNodeByClusterIdxKey keyClusterIdx = schema.getFactoryHostNode().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFGenKbHostNodeByUDescrIdxKey keyUDescrIdx = schema.getFactoryHostNode().newUDescrIdxKey();
		keyUDescrIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyUDescrIdx.setRequiredDescription( Buff.getRequiredDescription() );

		YCFGenKbHostNodeByHostNameIdxKey keyHostNameIdx = schema.getFactoryHostNode().newHostNameIdxKey();
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

		Map< YCFGenKbHostNodePKey, YCFGenKbHostNodeBuff > subdictClusterIdx;
		if( dictByClusterIdx.containsKey( keyClusterIdx ) ) {
			subdictClusterIdx = dictByClusterIdx.get( keyClusterIdx );
		}
		else {
			subdictClusterIdx = new HashMap< YCFGenKbHostNodePKey, YCFGenKbHostNodeBuff >();
			dictByClusterIdx.put( keyClusterIdx, subdictClusterIdx );
		}
		subdictClusterIdx.put( pkey, Buff );

		dictByUDescrIdx.put( keyUDescrIdx, Buff );

		dictByHostNameIdx.put( keyHostNameIdx, Buff );

	}

	public YCFGenKbHostNodeBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbHostNodePKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamHostNode.readDerived";
		YCFGenKbHostNodePKey key = schema.getFactoryHostNode().newPKey();
		key.setRequiredClusterId( PKey.getRequiredClusterId() );
		key.setRequiredHostNodeId( PKey.getRequiredHostNodeId() );
		YCFGenKbHostNodeBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbHostNodeBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbHostNodePKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamHostNode.readDerived";
		YCFGenKbHostNodePKey key = schema.getFactoryHostNode().newPKey();
		key.setRequiredClusterId( PKey.getRequiredClusterId() );
		key.setRequiredHostNodeId( PKey.getRequiredHostNodeId() );
		YCFGenKbHostNodeBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbHostNodeBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamHostNode.readAllDerived";
		YCFGenKbHostNodeBuff[] retList = new YCFGenKbHostNodeBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbHostNodeBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbHostNodeBuff[] readDerivedByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFGenKbRamHostNode.readDerivedByClusterIdx";
		YCFGenKbHostNodeByClusterIdxKey key = schema.getFactoryHostNode().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );

		YCFGenKbHostNodeBuff[] recArray;
		if( dictByClusterIdx.containsKey( key ) ) {
			Map< YCFGenKbHostNodePKey, YCFGenKbHostNodeBuff > subdictClusterIdx
				= dictByClusterIdx.get( key );
			recArray = new YCFGenKbHostNodeBuff[ subdictClusterIdx.size() ];
			Iterator< YCFGenKbHostNodeBuff > iter = subdictClusterIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbHostNodePKey, YCFGenKbHostNodeBuff > subdictClusterIdx
				= new HashMap< YCFGenKbHostNodePKey, YCFGenKbHostNodeBuff >();
			dictByClusterIdx.put( key, subdictClusterIdx );
			recArray = new YCFGenKbHostNodeBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbHostNodeBuff readDerivedByUDescrIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		String Description )
	{
		final String S_ProcName = "YCFGenKbRamHostNode.readDerivedByUDescrIdx";
		YCFGenKbHostNodeByUDescrIdxKey key = schema.getFactoryHostNode().newUDescrIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredDescription( Description );

		YCFGenKbHostNodeBuff buff;
		if( dictByUDescrIdx.containsKey( key ) ) {
			buff = dictByUDescrIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbHostNodeBuff readDerivedByHostNameIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		String HostName )
	{
		final String S_ProcName = "YCFGenKbRamHostNode.readDerivedByHostNameIdx";
		YCFGenKbHostNodeByHostNameIdxKey key = schema.getFactoryHostNode().newHostNameIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredHostName( HostName );

		YCFGenKbHostNodeBuff buff;
		if( dictByHostNameIdx.containsKey( key ) ) {
			buff = dictByHostNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbHostNodeBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		long HostNodeId )
	{
		final String S_ProcName = "YCFGenKbRamHostNode.readDerivedByIdIdx() ";
		YCFGenKbHostNodePKey key = schema.getFactoryHostNode().newPKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredHostNodeId( HostNodeId );

		YCFGenKbHostNodeBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbHostNodeBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbHostNodePKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamHostNode.readBuff";
		YCFGenKbHostNodeBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a902" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbHostNodeBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbHostNodePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbHostNodeBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a902" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbHostNodeBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamHostNode.readAllBuff";
		YCFGenKbHostNodeBuff buff;
		ArrayList<YCFGenKbHostNodeBuff> filteredList = new ArrayList<YCFGenKbHostNodeBuff>();
		YCFGenKbHostNodeBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a902" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbHostNodeBuff[0] ) );
	}

	/**
	 *	Read a page of all the specific HostNode buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific HostNode instances in the database accessible for the Authorization.
	 */
	public YCFGenKbHostNodeBuff[] pageAllBuff( YCFGenKbAuthorization Authorization,
		Long priorClusterId,
		Long priorHostNodeId )
	{
		final String S_ProcName = "pageAllBuff";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public YCFGenKbHostNodeBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		long HostNodeId )
	{
		final String S_ProcName = "YCFGenKbRamHostNode.readBuffByIdIdx() ";
		YCFGenKbHostNodeBuff buff = readDerivedByIdIdx( Authorization,
			ClusterId,
			HostNodeId );
		if( ( buff != null ) && buff.getClassCode().equals( "a902" ) ) {
			return( (YCFGenKbHostNodeBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbHostNodeBuff[] readBuffByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFGenKbRamHostNode.readBuffByClusterIdx() ";
		YCFGenKbHostNodeBuff buff;
		ArrayList<YCFGenKbHostNodeBuff> filteredList = new ArrayList<YCFGenKbHostNodeBuff>();
		YCFGenKbHostNodeBuff[] buffList = readDerivedByClusterIdx( Authorization,
			ClusterId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a902" ) ) {
				filteredList.add( (YCFGenKbHostNodeBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbHostNodeBuff[0] ) );
	}

	public YCFGenKbHostNodeBuff readBuffByUDescrIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		String Description )
	{
		final String S_ProcName = "YCFGenKbRamHostNode.readBuffByUDescrIdx() ";
		YCFGenKbHostNodeBuff buff = readDerivedByUDescrIdx( Authorization,
			ClusterId,
			Description );
		if( ( buff != null ) && buff.getClassCode().equals( "a902" ) ) {
			return( (YCFGenKbHostNodeBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbHostNodeBuff readBuffByHostNameIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		String HostName )
	{
		final String S_ProcName = "YCFGenKbRamHostNode.readBuffByHostNameIdx() ";
		YCFGenKbHostNodeBuff buff = readDerivedByHostNameIdx( Authorization,
			ClusterId,
			HostName );
		if( ( buff != null ) && buff.getClassCode().equals( "a902" ) ) {
			return( (YCFGenKbHostNodeBuff)buff );
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
	public YCFGenKbHostNodeBuff[] pageBuffByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		Long priorClusterId,
		Long priorHostNodeId )
	{
		final String S_ProcName = "pageBuffByClusterIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateHostNode( YCFGenKbAuthorization Authorization,
		YCFGenKbHostNodeBuff Buff )
	{
		YCFGenKbHostNodePKey pkey = schema.getFactoryHostNode().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredHostNodeId( Buff.getRequiredHostNodeId() );
		YCFGenKbHostNodeBuff existing = dictByPKey.get( pkey );
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
		YCFGenKbHostNodeByClusterIdxKey existingKeyClusterIdx = schema.getFactoryHostNode().newClusterIdxKey();
		existingKeyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFGenKbHostNodeByClusterIdxKey newKeyClusterIdx = schema.getFactoryHostNode().newClusterIdxKey();
		newKeyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFGenKbHostNodeByUDescrIdxKey existingKeyUDescrIdx = schema.getFactoryHostNode().newUDescrIdxKey();
		existingKeyUDescrIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyUDescrIdx.setRequiredDescription( existing.getRequiredDescription() );

		YCFGenKbHostNodeByUDescrIdxKey newKeyUDescrIdx = schema.getFactoryHostNode().newUDescrIdxKey();
		newKeyUDescrIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyUDescrIdx.setRequiredDescription( Buff.getRequiredDescription() );

		YCFGenKbHostNodeByHostNameIdxKey existingKeyHostNameIdx = schema.getFactoryHostNode().newHostNameIdxKey();
		existingKeyHostNameIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyHostNameIdx.setRequiredHostName( existing.getRequiredHostName() );

		YCFGenKbHostNodeByHostNameIdxKey newKeyHostNameIdx = schema.getFactoryHostNode().newHostNameIdxKey();
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

		Map< YCFGenKbHostNodePKey, YCFGenKbHostNodeBuff > subdict;

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
			subdict = new HashMap< YCFGenKbHostNodePKey, YCFGenKbHostNodeBuff >();
			dictByClusterIdx.put( newKeyClusterIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUDescrIdx.remove( existingKeyUDescrIdx );
		dictByUDescrIdx.put( newKeyUDescrIdx, Buff );

		dictByHostNameIdx.remove( existingKeyHostNameIdx );
		dictByHostNameIdx.put( newKeyHostNameIdx, Buff );

	}

	public void deleteHostNode( YCFGenKbAuthorization Authorization,
		YCFGenKbHostNodeBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamHostNodeTable.deleteHostNode() ";
		String classCode;
		YCFGenKbHostNodePKey pkey = schema.getFactoryHostNode().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredHostNodeId( Buff.getRequiredHostNodeId() );
		YCFGenKbHostNodeBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteHostNode",
				pkey );
		}
		YCFGenKbHostNodeByClusterIdxKey keyClusterIdx = schema.getFactoryHostNode().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFGenKbHostNodeByUDescrIdxKey keyUDescrIdx = schema.getFactoryHostNode().newUDescrIdxKey();
		keyUDescrIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUDescrIdx.setRequiredDescription( existing.getRequiredDescription() );

		YCFGenKbHostNodeByHostNameIdxKey keyHostNameIdx = schema.getFactoryHostNode().newHostNameIdxKey();
		keyHostNameIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyHostNameIdx.setRequiredHostName( existing.getRequiredHostName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFGenKbHostNodePKey, YCFGenKbHostNodeBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByClusterIdx.get( keyClusterIdx );
		subdict.remove( pkey );

		dictByUDescrIdx.remove( keyUDescrIdx );

		dictByHostNameIdx.remove( keyHostNameIdx );

	}
	public void deleteHostNodeByIdIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		long argHostNodeId )
	{
		YCFGenKbHostNodePKey key = schema.getFactoryHostNode().newPKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredHostNodeId( argHostNodeId );
		deleteHostNodeByIdIdx( Authorization, key );
	}

	public void deleteHostNodeByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbHostNodePKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbHostNodeBuff cur;
		LinkedList<YCFGenKbHostNodeBuff> matchSet = new LinkedList<YCFGenKbHostNodeBuff>();
		Iterator<YCFGenKbHostNodeBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbHostNodeBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableHostNode().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredHostNodeId() );
			deleteHostNode( Authorization, cur );
		}
	}

	public void deleteHostNodeByClusterIdx( YCFGenKbAuthorization Authorization,
		long argClusterId )
	{
		YCFGenKbHostNodeByClusterIdxKey key = schema.getFactoryHostNode().newClusterIdxKey();
		key.setRequiredClusterId( argClusterId );
		deleteHostNodeByClusterIdx( Authorization, key );
	}

	public void deleteHostNodeByClusterIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbHostNodeByClusterIdxKey argKey )
	{
		YCFGenKbHostNodeBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbHostNodeBuff> matchSet = new LinkedList<YCFGenKbHostNodeBuff>();
		Iterator<YCFGenKbHostNodeBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbHostNodeBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableHostNode().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredHostNodeId() );
			deleteHostNode( Authorization, cur );
		}
	}

	public void deleteHostNodeByUDescrIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		String argDescription )
	{
		YCFGenKbHostNodeByUDescrIdxKey key = schema.getFactoryHostNode().newUDescrIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredDescription( argDescription );
		deleteHostNodeByUDescrIdx( Authorization, key );
	}

	public void deleteHostNodeByUDescrIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbHostNodeByUDescrIdxKey argKey )
	{
		YCFGenKbHostNodeBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbHostNodeBuff> matchSet = new LinkedList<YCFGenKbHostNodeBuff>();
		Iterator<YCFGenKbHostNodeBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbHostNodeBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableHostNode().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredHostNodeId() );
			deleteHostNode( Authorization, cur );
		}
	}

	public void deleteHostNodeByHostNameIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		String argHostName )
	{
		YCFGenKbHostNodeByHostNameIdxKey key = schema.getFactoryHostNode().newHostNameIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredHostName( argHostName );
		deleteHostNodeByHostNameIdx( Authorization, key );
	}

	public void deleteHostNodeByHostNameIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbHostNodeByHostNameIdxKey argKey )
	{
		YCFGenKbHostNodeBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbHostNodeBuff> matchSet = new LinkedList<YCFGenKbHostNodeBuff>();
		Iterator<YCFGenKbHostNodeBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbHostNodeBuff> iterMatch = matchSet.iterator();
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
