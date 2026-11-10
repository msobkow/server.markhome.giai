
// Description: Java 11 in-memory RAM DbIO implementation for SecGrpMemb.

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
 *	YCFGenKbRamSecGrpMembTable in-memory RAM DbIO implementation
 *	for SecGrpMemb.
 */
public class YCFGenKbRamSecGrpMembTable
	implements IYCFGenKbSecGrpMembTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbSecGrpMembPKey,
				YCFGenKbSecGrpMembBuff > dictByPKey
		= new HashMap< YCFGenKbSecGrpMembPKey,
				YCFGenKbSecGrpMembBuff >();
	private Map< YCFGenKbSecGrpMembByClusterIdxKey,
				Map< YCFGenKbSecGrpMembPKey,
					YCFGenKbSecGrpMembBuff >> dictByClusterIdx
		= new HashMap< YCFGenKbSecGrpMembByClusterIdxKey,
				Map< YCFGenKbSecGrpMembPKey,
					YCFGenKbSecGrpMembBuff >>();
	private Map< YCFGenKbSecGrpMembByGroupIdxKey,
				Map< YCFGenKbSecGrpMembPKey,
					YCFGenKbSecGrpMembBuff >> dictByGroupIdx
		= new HashMap< YCFGenKbSecGrpMembByGroupIdxKey,
				Map< YCFGenKbSecGrpMembPKey,
					YCFGenKbSecGrpMembBuff >>();
	private Map< YCFGenKbSecGrpMembByUserIdxKey,
				Map< YCFGenKbSecGrpMembPKey,
					YCFGenKbSecGrpMembBuff >> dictByUserIdx
		= new HashMap< YCFGenKbSecGrpMembByUserIdxKey,
				Map< YCFGenKbSecGrpMembPKey,
					YCFGenKbSecGrpMembBuff >>();
	private Map< YCFGenKbSecGrpMembByUUserIdxKey,
			YCFGenKbSecGrpMembBuff > dictByUUserIdx
		= new HashMap< YCFGenKbSecGrpMembByUUserIdxKey,
			YCFGenKbSecGrpMembBuff >();

	public YCFGenKbRamSecGrpMembTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createSecGrpMemb( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpMembBuff Buff )
	{
		final String S_ProcName = "createSecGrpMemb";
		YCFGenKbSecGrpMembPKey pkey = schema.getFactorySecGrpMemb().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecGrpMembId( ((YCFGenKbRamClusterTable)schema.getTableCluster()).nextSecGrpMembIdGen( Authorization,
			Buff.getRequiredClusterId() ) );
		Buff.setRequiredClusterId( pkey.getRequiredClusterId() );
		Buff.setRequiredSecGrpMembId( pkey.getRequiredSecGrpMembId() );
		YCFGenKbSecGrpMembByClusterIdxKey keyClusterIdx = schema.getFactorySecGrpMemb().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFGenKbSecGrpMembByGroupIdxKey keyGroupIdx = schema.getFactorySecGrpMemb().newGroupIdxKey();
		keyGroupIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyGroupIdx.setRequiredSecGroupId( Buff.getRequiredSecGroupId() );

		YCFGenKbSecGrpMembByUserIdxKey keyUserIdx = schema.getFactorySecGrpMemb().newUserIdxKey();
		keyUserIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );

		YCFGenKbSecGrpMembByUUserIdxKey keyUUserIdx = schema.getFactorySecGrpMemb().newUUserIdxKey();
		keyUUserIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyUUserIdx.setRequiredSecGroupId( Buff.getRequiredSecGroupId() );
		keyUUserIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUUserIdx.containsKey( keyUUserIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"SecGrpMembUUserIdx",
				keyUUserIdx );
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
						"Owner",
						"SecGrpMembCluster",
						"Cluster",
						null );
				}
			}
		}

		{
			boolean allNull = true;
			allNull = false;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableSecGroup().readDerivedByIdIdx( Authorization,
						Buff.getRequiredClusterId(),
						Buff.getRequiredSecGroupId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"SecGrpMembGroup",
						"SecGroup",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFGenKbSecGrpMembPKey, YCFGenKbSecGrpMembBuff > subdictClusterIdx;
		if( dictByClusterIdx.containsKey( keyClusterIdx ) ) {
			subdictClusterIdx = dictByClusterIdx.get( keyClusterIdx );
		}
		else {
			subdictClusterIdx = new HashMap< YCFGenKbSecGrpMembPKey, YCFGenKbSecGrpMembBuff >();
			dictByClusterIdx.put( keyClusterIdx, subdictClusterIdx );
		}
		subdictClusterIdx.put( pkey, Buff );

		Map< YCFGenKbSecGrpMembPKey, YCFGenKbSecGrpMembBuff > subdictGroupIdx;
		if( dictByGroupIdx.containsKey( keyGroupIdx ) ) {
			subdictGroupIdx = dictByGroupIdx.get( keyGroupIdx );
		}
		else {
			subdictGroupIdx = new HashMap< YCFGenKbSecGrpMembPKey, YCFGenKbSecGrpMembBuff >();
			dictByGroupIdx.put( keyGroupIdx, subdictGroupIdx );
		}
		subdictGroupIdx.put( pkey, Buff );

		Map< YCFGenKbSecGrpMembPKey, YCFGenKbSecGrpMembBuff > subdictUserIdx;
		if( dictByUserIdx.containsKey( keyUserIdx ) ) {
			subdictUserIdx = dictByUserIdx.get( keyUserIdx );
		}
		else {
			subdictUserIdx = new HashMap< YCFGenKbSecGrpMembPKey, YCFGenKbSecGrpMembBuff >();
			dictByUserIdx.put( keyUserIdx, subdictUserIdx );
		}
		subdictUserIdx.put( pkey, Buff );

		dictByUUserIdx.put( keyUUserIdx, Buff );

	}

	public YCFGenKbSecGrpMembBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpMembPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamSecGrpMemb.readDerived";
		YCFGenKbSecGrpMembPKey key = schema.getFactorySecGrpMemb().newPKey();
		key.setRequiredClusterId( PKey.getRequiredClusterId() );
		key.setRequiredSecGrpMembId( PKey.getRequiredSecGrpMembId() );
		YCFGenKbSecGrpMembBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecGrpMembBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpMembPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamSecGrpMemb.readDerived";
		YCFGenKbSecGrpMembPKey key = schema.getFactorySecGrpMemb().newPKey();
		key.setRequiredClusterId( PKey.getRequiredClusterId() );
		key.setRequiredSecGrpMembId( PKey.getRequiredSecGrpMembId() );
		YCFGenKbSecGrpMembBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecGrpMembBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamSecGrpMemb.readAllDerived";
		YCFGenKbSecGrpMembBuff[] retList = new YCFGenKbSecGrpMembBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbSecGrpMembBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbSecGrpMembBuff[] readDerivedByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFGenKbRamSecGrpMemb.readDerivedByClusterIdx";
		YCFGenKbSecGrpMembByClusterIdxKey key = schema.getFactorySecGrpMemb().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );

		YCFGenKbSecGrpMembBuff[] recArray;
		if( dictByClusterIdx.containsKey( key ) ) {
			Map< YCFGenKbSecGrpMembPKey, YCFGenKbSecGrpMembBuff > subdictClusterIdx
				= dictByClusterIdx.get( key );
			recArray = new YCFGenKbSecGrpMembBuff[ subdictClusterIdx.size() ];
			Iterator< YCFGenKbSecGrpMembBuff > iter = subdictClusterIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbSecGrpMembPKey, YCFGenKbSecGrpMembBuff > subdictClusterIdx
				= new HashMap< YCFGenKbSecGrpMembPKey, YCFGenKbSecGrpMembBuff >();
			dictByClusterIdx.put( key, subdictClusterIdx );
			recArray = new YCFGenKbSecGrpMembBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbSecGrpMembBuff[] readDerivedByGroupIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecGroupId )
	{
		final String S_ProcName = "YCFGenKbRamSecGrpMemb.readDerivedByGroupIdx";
		YCFGenKbSecGrpMembByGroupIdxKey key = schema.getFactorySecGrpMemb().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );

		YCFGenKbSecGrpMembBuff[] recArray;
		if( dictByGroupIdx.containsKey( key ) ) {
			Map< YCFGenKbSecGrpMembPKey, YCFGenKbSecGrpMembBuff > subdictGroupIdx
				= dictByGroupIdx.get( key );
			recArray = new YCFGenKbSecGrpMembBuff[ subdictGroupIdx.size() ];
			Iterator< YCFGenKbSecGrpMembBuff > iter = subdictGroupIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbSecGrpMembPKey, YCFGenKbSecGrpMembBuff > subdictGroupIdx
				= new HashMap< YCFGenKbSecGrpMembPKey, YCFGenKbSecGrpMembBuff >();
			dictByGroupIdx.put( key, subdictGroupIdx );
			recArray = new YCFGenKbSecGrpMembBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbSecGrpMembBuff[] readDerivedByUserIdx( YCFGenKbAuthorization Authorization,
		UUID SecUserId )
	{
		final String S_ProcName = "YCFGenKbRamSecGrpMemb.readDerivedByUserIdx";
		YCFGenKbSecGrpMembByUserIdxKey key = schema.getFactorySecGrpMemb().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );

		YCFGenKbSecGrpMembBuff[] recArray;
		if( dictByUserIdx.containsKey( key ) ) {
			Map< YCFGenKbSecGrpMembPKey, YCFGenKbSecGrpMembBuff > subdictUserIdx
				= dictByUserIdx.get( key );
			recArray = new YCFGenKbSecGrpMembBuff[ subdictUserIdx.size() ];
			Iterator< YCFGenKbSecGrpMembBuff > iter = subdictUserIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbSecGrpMembPKey, YCFGenKbSecGrpMembBuff > subdictUserIdx
				= new HashMap< YCFGenKbSecGrpMembPKey, YCFGenKbSecGrpMembBuff >();
			dictByUserIdx.put( key, subdictUserIdx );
			recArray = new YCFGenKbSecGrpMembBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbSecGrpMembBuff readDerivedByUUserIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecGroupId,
		UUID SecUserId )
	{
		final String S_ProcName = "YCFGenKbRamSecGrpMemb.readDerivedByUUserIdx";
		YCFGenKbSecGrpMembByUUserIdxKey key = schema.getFactorySecGrpMemb().newUUserIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		key.setRequiredSecUserId( SecUserId );

		YCFGenKbSecGrpMembBuff buff;
		if( dictByUUserIdx.containsKey( key ) ) {
			buff = dictByUUserIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecGrpMembBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		long SecGrpMembId )
	{
		final String S_ProcName = "YCFGenKbRamSecGrpMemb.readDerivedByIdIdx() ";
		YCFGenKbSecGrpMembPKey key = schema.getFactorySecGrpMemb().newPKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGrpMembId( SecGrpMembId );

		YCFGenKbSecGrpMembBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecGrpMembBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpMembPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamSecGrpMemb.readBuff";
		YCFGenKbSecGrpMembBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a90c" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecGrpMembBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpMembPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbSecGrpMembBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a90c" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecGrpMembBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamSecGrpMemb.readAllBuff";
		YCFGenKbSecGrpMembBuff buff;
		ArrayList<YCFGenKbSecGrpMembBuff> filteredList = new ArrayList<YCFGenKbSecGrpMembBuff>();
		YCFGenKbSecGrpMembBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a90c" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSecGrpMembBuff[0] ) );
	}

	/**
	 *	Read a page of all the specific SecGrpMemb buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecGrpMemb instances in the database accessible for the Authorization.
	 */
	public YCFGenKbSecGrpMembBuff[] pageAllBuff( YCFGenKbAuthorization Authorization,
		Long priorClusterId,
		Long priorSecGrpMembId )
	{
		final String S_ProcName = "pageAllBuff";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public YCFGenKbSecGrpMembBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		long SecGrpMembId )
	{
		final String S_ProcName = "YCFGenKbRamSecGrpMemb.readBuffByIdIdx() ";
		YCFGenKbSecGrpMembBuff buff = readDerivedByIdIdx( Authorization,
			ClusterId,
			SecGrpMembId );
		if( ( buff != null ) && buff.getClassCode().equals( "a90c" ) ) {
			return( (YCFGenKbSecGrpMembBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbSecGrpMembBuff[] readBuffByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFGenKbRamSecGrpMemb.readBuffByClusterIdx() ";
		YCFGenKbSecGrpMembBuff buff;
		ArrayList<YCFGenKbSecGrpMembBuff> filteredList = new ArrayList<YCFGenKbSecGrpMembBuff>();
		YCFGenKbSecGrpMembBuff[] buffList = readDerivedByClusterIdx( Authorization,
			ClusterId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a90c" ) ) {
				filteredList.add( (YCFGenKbSecGrpMembBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSecGrpMembBuff[0] ) );
	}

	public YCFGenKbSecGrpMembBuff[] readBuffByGroupIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecGroupId )
	{
		final String S_ProcName = "YCFGenKbRamSecGrpMemb.readBuffByGroupIdx() ";
		YCFGenKbSecGrpMembBuff buff;
		ArrayList<YCFGenKbSecGrpMembBuff> filteredList = new ArrayList<YCFGenKbSecGrpMembBuff>();
		YCFGenKbSecGrpMembBuff[] buffList = readDerivedByGroupIdx( Authorization,
			ClusterId,
			SecGroupId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a90c" ) ) {
				filteredList.add( (YCFGenKbSecGrpMembBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSecGrpMembBuff[0] ) );
	}

	public YCFGenKbSecGrpMembBuff[] readBuffByUserIdx( YCFGenKbAuthorization Authorization,
		UUID SecUserId )
	{
		final String S_ProcName = "YCFGenKbRamSecGrpMemb.readBuffByUserIdx() ";
		YCFGenKbSecGrpMembBuff buff;
		ArrayList<YCFGenKbSecGrpMembBuff> filteredList = new ArrayList<YCFGenKbSecGrpMembBuff>();
		YCFGenKbSecGrpMembBuff[] buffList = readDerivedByUserIdx( Authorization,
			SecUserId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a90c" ) ) {
				filteredList.add( (YCFGenKbSecGrpMembBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSecGrpMembBuff[0] ) );
	}

	public YCFGenKbSecGrpMembBuff readBuffByUUserIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecGroupId,
		UUID SecUserId )
	{
		final String S_ProcName = "YCFGenKbRamSecGrpMemb.readBuffByUUserIdx() ";
		YCFGenKbSecGrpMembBuff buff = readDerivedByUUserIdx( Authorization,
			ClusterId,
			SecGroupId,
			SecUserId );
		if( ( buff != null ) && buff.getClassCode().equals( "a90c" ) ) {
			return( (YCFGenKbSecGrpMembBuff)buff );
		}
		else {
			return( null );
		}
	}

	/**
	 *	Read a page array of the specific SecGrpMemb buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbSecGrpMembBuff[] pageBuffByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		Long priorClusterId,
		Long priorSecGrpMembId )
	{
		final String S_ProcName = "pageBuffByClusterIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific SecGrpMemb buffer instances identified by the duplicate key GroupIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbSecGrpMembBuff[] pageBuffByGroupIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecGroupId,
		Long priorClusterId,
		Long priorSecGrpMembId )
	{
		final String S_ProcName = "pageBuffByGroupIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific SecGrpMemb buffer instances identified by the duplicate key UserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbSecGrpMembBuff[] pageBuffByUserIdx( YCFGenKbAuthorization Authorization,
		UUID SecUserId,
		Long priorClusterId,
		Long priorSecGrpMembId )
	{
		final String S_ProcName = "pageBuffByUserIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateSecGrpMemb( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpMembBuff Buff )
	{
		YCFGenKbSecGrpMembPKey pkey = schema.getFactorySecGrpMemb().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecGrpMembId( Buff.getRequiredSecGrpMembId() );
		YCFGenKbSecGrpMembBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateSecGrpMemb",
				"Existing record not found",
				"SecGrpMemb",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateSecGrpMemb",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFGenKbSecGrpMembByClusterIdxKey existingKeyClusterIdx = schema.getFactorySecGrpMemb().newClusterIdxKey();
		existingKeyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFGenKbSecGrpMembByClusterIdxKey newKeyClusterIdx = schema.getFactorySecGrpMemb().newClusterIdxKey();
		newKeyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFGenKbSecGrpMembByGroupIdxKey existingKeyGroupIdx = schema.getFactorySecGrpMemb().newGroupIdxKey();
		existingKeyGroupIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyGroupIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );

		YCFGenKbSecGrpMembByGroupIdxKey newKeyGroupIdx = schema.getFactorySecGrpMemb().newGroupIdxKey();
		newKeyGroupIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyGroupIdx.setRequiredSecGroupId( Buff.getRequiredSecGroupId() );

		YCFGenKbSecGrpMembByUserIdxKey existingKeyUserIdx = schema.getFactorySecGrpMemb().newUserIdxKey();
		existingKeyUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );

		YCFGenKbSecGrpMembByUserIdxKey newKeyUserIdx = schema.getFactorySecGrpMemb().newUserIdxKey();
		newKeyUserIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );

		YCFGenKbSecGrpMembByUUserIdxKey existingKeyUUserIdx = schema.getFactorySecGrpMemb().newUUserIdxKey();
		existingKeyUUserIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyUUserIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );
		existingKeyUUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );

		YCFGenKbSecGrpMembByUUserIdxKey newKeyUUserIdx = schema.getFactorySecGrpMemb().newUUserIdxKey();
		newKeyUUserIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyUUserIdx.setRequiredSecGroupId( Buff.getRequiredSecGroupId() );
		newKeyUUserIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );

		// Check unique indexes

		if( ! existingKeyUUserIdx.equals( newKeyUUserIdx ) ) {
			if( dictByUUserIdx.containsKey( newKeyUUserIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateSecGrpMemb",
					"SecGrpMembUUserIdx",
					newKeyUUserIdx );
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
						"updateSecGrpMemb",
						"Owner",
						"SecGrpMembCluster",
						"Cluster",
						null );
				}
			}
		}

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableSecGroup().readDerivedByIdIdx( Authorization,
						Buff.getRequiredClusterId(),
						Buff.getRequiredSecGroupId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateSecGrpMemb",
						"Container",
						"SecGrpMembGroup",
						"SecGroup",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFGenKbSecGrpMembPKey, YCFGenKbSecGrpMembBuff > subdict;

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
			subdict = new HashMap< YCFGenKbSecGrpMembPKey, YCFGenKbSecGrpMembBuff >();
			dictByClusterIdx.put( newKeyClusterIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByGroupIdx.get( existingKeyGroupIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByGroupIdx.containsKey( newKeyGroupIdx ) ) {
			subdict = dictByGroupIdx.get( newKeyGroupIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbSecGrpMembPKey, YCFGenKbSecGrpMembBuff >();
			dictByGroupIdx.put( newKeyGroupIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByUserIdx.get( existingKeyUserIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByUserIdx.containsKey( newKeyUserIdx ) ) {
			subdict = dictByUserIdx.get( newKeyUserIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbSecGrpMembPKey, YCFGenKbSecGrpMembBuff >();
			dictByUserIdx.put( newKeyUserIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUUserIdx.remove( existingKeyUUserIdx );
		dictByUUserIdx.put( newKeyUUserIdx, Buff );

	}

	public void deleteSecGrpMemb( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpMembBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamSecGrpMembTable.deleteSecGrpMemb() ";
		String classCode;
		YCFGenKbSecGrpMembPKey pkey = schema.getFactorySecGrpMemb().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecGrpMembId( Buff.getRequiredSecGrpMembId() );
		YCFGenKbSecGrpMembBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteSecGrpMemb",
				pkey );
		}
		YCFGenKbSecGrpMembByClusterIdxKey keyClusterIdx = schema.getFactorySecGrpMemb().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFGenKbSecGrpMembByGroupIdxKey keyGroupIdx = schema.getFactorySecGrpMemb().newGroupIdxKey();
		keyGroupIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyGroupIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );

		YCFGenKbSecGrpMembByUserIdxKey keyUserIdx = schema.getFactorySecGrpMemb().newUserIdxKey();
		keyUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );

		YCFGenKbSecGrpMembByUUserIdxKey keyUUserIdx = schema.getFactorySecGrpMemb().newUUserIdxKey();
		keyUUserIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUUserIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );
		keyUUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFGenKbSecGrpMembPKey, YCFGenKbSecGrpMembBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByClusterIdx.get( keyClusterIdx );
		subdict.remove( pkey );

		subdict = dictByGroupIdx.get( keyGroupIdx );
		subdict.remove( pkey );

		subdict = dictByUserIdx.get( keyUserIdx );
		subdict.remove( pkey );

		dictByUUserIdx.remove( keyUUserIdx );

	}
	public void deleteSecGrpMembByIdIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		long argSecGrpMembId )
	{
		YCFGenKbSecGrpMembPKey key = schema.getFactorySecGrpMemb().newPKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredSecGrpMembId( argSecGrpMembId );
		deleteSecGrpMembByIdIdx( Authorization, key );
	}

	public void deleteSecGrpMembByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpMembPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbSecGrpMembBuff cur;
		LinkedList<YCFGenKbSecGrpMembBuff> matchSet = new LinkedList<YCFGenKbSecGrpMembBuff>();
		Iterator<YCFGenKbSecGrpMembBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecGrpMembBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGrpMemb().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGrpMembId() );
			deleteSecGrpMemb( Authorization, cur );
		}
	}

	public void deleteSecGrpMembByClusterIdx( YCFGenKbAuthorization Authorization,
		long argClusterId )
	{
		YCFGenKbSecGrpMembByClusterIdxKey key = schema.getFactorySecGrpMemb().newClusterIdxKey();
		key.setRequiredClusterId( argClusterId );
		deleteSecGrpMembByClusterIdx( Authorization, key );
	}

	public void deleteSecGrpMembByClusterIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpMembByClusterIdxKey argKey )
	{
		YCFGenKbSecGrpMembBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbSecGrpMembBuff> matchSet = new LinkedList<YCFGenKbSecGrpMembBuff>();
		Iterator<YCFGenKbSecGrpMembBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecGrpMembBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGrpMemb().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGrpMembId() );
			deleteSecGrpMemb( Authorization, cur );
		}
	}

	public void deleteSecGrpMembByGroupIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		int argSecGroupId )
	{
		YCFGenKbSecGrpMembByGroupIdxKey key = schema.getFactorySecGrpMemb().newGroupIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredSecGroupId( argSecGroupId );
		deleteSecGrpMembByGroupIdx( Authorization, key );
	}

	public void deleteSecGrpMembByGroupIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpMembByGroupIdxKey argKey )
	{
		YCFGenKbSecGrpMembBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbSecGrpMembBuff> matchSet = new LinkedList<YCFGenKbSecGrpMembBuff>();
		Iterator<YCFGenKbSecGrpMembBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecGrpMembBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGrpMemb().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGrpMembId() );
			deleteSecGrpMemb( Authorization, cur );
		}
	}

	public void deleteSecGrpMembByUserIdx( YCFGenKbAuthorization Authorization,
		UUID argSecUserId )
	{
		YCFGenKbSecGrpMembByUserIdxKey key = schema.getFactorySecGrpMemb().newUserIdxKey();
		key.setRequiredSecUserId( argSecUserId );
		deleteSecGrpMembByUserIdx( Authorization, key );
	}

	public void deleteSecGrpMembByUserIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpMembByUserIdxKey argKey )
	{
		YCFGenKbSecGrpMembBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbSecGrpMembBuff> matchSet = new LinkedList<YCFGenKbSecGrpMembBuff>();
		Iterator<YCFGenKbSecGrpMembBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecGrpMembBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGrpMemb().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGrpMembId() );
			deleteSecGrpMemb( Authorization, cur );
		}
	}

	public void deleteSecGrpMembByUUserIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		int argSecGroupId,
		UUID argSecUserId )
	{
		YCFGenKbSecGrpMembByUUserIdxKey key = schema.getFactorySecGrpMemb().newUUserIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredSecGroupId( argSecGroupId );
		key.setRequiredSecUserId( argSecUserId );
		deleteSecGrpMembByUUserIdx( Authorization, key );
	}

	public void deleteSecGrpMembByUUserIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpMembByUUserIdxKey argKey )
	{
		YCFGenKbSecGrpMembBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbSecGrpMembBuff> matchSet = new LinkedList<YCFGenKbSecGrpMembBuff>();
		Iterator<YCFGenKbSecGrpMembBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecGrpMembBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGrpMemb().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGrpMembId() );
			deleteSecGrpMemb( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
