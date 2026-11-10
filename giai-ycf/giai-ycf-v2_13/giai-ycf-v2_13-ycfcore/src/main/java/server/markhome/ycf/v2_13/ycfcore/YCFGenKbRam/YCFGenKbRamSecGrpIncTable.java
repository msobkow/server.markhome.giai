
// Description: Java 11 in-memory RAM DbIO implementation for SecGrpInc.

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
 *	YCFGenKbRamSecGrpIncTable in-memory RAM DbIO implementation
 *	for SecGrpInc.
 */
public class YCFGenKbRamSecGrpIncTable
	implements IYCFGenKbSecGrpIncTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbSecGrpIncPKey,
				YCFGenKbSecGrpIncBuff > dictByPKey
		= new HashMap< YCFGenKbSecGrpIncPKey,
				YCFGenKbSecGrpIncBuff >();
	private Map< YCFGenKbSecGrpIncByClusterIdxKey,
				Map< YCFGenKbSecGrpIncPKey,
					YCFGenKbSecGrpIncBuff >> dictByClusterIdx
		= new HashMap< YCFGenKbSecGrpIncByClusterIdxKey,
				Map< YCFGenKbSecGrpIncPKey,
					YCFGenKbSecGrpIncBuff >>();
	private Map< YCFGenKbSecGrpIncByGroupIdxKey,
				Map< YCFGenKbSecGrpIncPKey,
					YCFGenKbSecGrpIncBuff >> dictByGroupIdx
		= new HashMap< YCFGenKbSecGrpIncByGroupIdxKey,
				Map< YCFGenKbSecGrpIncPKey,
					YCFGenKbSecGrpIncBuff >>();
	private Map< YCFGenKbSecGrpIncByIncludeIdxKey,
				Map< YCFGenKbSecGrpIncPKey,
					YCFGenKbSecGrpIncBuff >> dictByIncludeIdx
		= new HashMap< YCFGenKbSecGrpIncByIncludeIdxKey,
				Map< YCFGenKbSecGrpIncPKey,
					YCFGenKbSecGrpIncBuff >>();
	private Map< YCFGenKbSecGrpIncByUIncludeIdxKey,
			YCFGenKbSecGrpIncBuff > dictByUIncludeIdx
		= new HashMap< YCFGenKbSecGrpIncByUIncludeIdxKey,
			YCFGenKbSecGrpIncBuff >();

	public YCFGenKbRamSecGrpIncTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createSecGrpInc( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpIncBuff Buff )
	{
		final String S_ProcName = "createSecGrpInc";
		YCFGenKbSecGrpIncPKey pkey = schema.getFactorySecGrpInc().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecGrpIncId( ((YCFGenKbRamClusterTable)schema.getTableCluster()).nextSecGrpIncIdGen( Authorization,
			Buff.getRequiredClusterId() ) );
		Buff.setRequiredClusterId( pkey.getRequiredClusterId() );
		Buff.setRequiredSecGrpIncId( pkey.getRequiredSecGrpIncId() );
		YCFGenKbSecGrpIncByClusterIdxKey keyClusterIdx = schema.getFactorySecGrpInc().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFGenKbSecGrpIncByGroupIdxKey keyGroupIdx = schema.getFactorySecGrpInc().newGroupIdxKey();
		keyGroupIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyGroupIdx.setRequiredSecGroupId( Buff.getRequiredSecGroupId() );

		YCFGenKbSecGrpIncByIncludeIdxKey keyIncludeIdx = schema.getFactorySecGrpInc().newIncludeIdxKey();
		keyIncludeIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyIncludeIdx.setRequiredIncludeGroupId( Buff.getRequiredIncludeGroupId() );

		YCFGenKbSecGrpIncByUIncludeIdxKey keyUIncludeIdx = schema.getFactorySecGrpInc().newUIncludeIdxKey();
		keyUIncludeIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyUIncludeIdx.setRequiredSecGroupId( Buff.getRequiredSecGroupId() );
		keyUIncludeIdx.setRequiredIncludeGroupId( Buff.getRequiredIncludeGroupId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUIncludeIdx.containsKey( keyUIncludeIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"SecGrpIncUIncludeIdx",
				keyUIncludeIdx );
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
						"SecGrpIncCluster",
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
						"SecGrpIncGroup",
						"SecGroup",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFGenKbSecGrpIncPKey, YCFGenKbSecGrpIncBuff > subdictClusterIdx;
		if( dictByClusterIdx.containsKey( keyClusterIdx ) ) {
			subdictClusterIdx = dictByClusterIdx.get( keyClusterIdx );
		}
		else {
			subdictClusterIdx = new HashMap< YCFGenKbSecGrpIncPKey, YCFGenKbSecGrpIncBuff >();
			dictByClusterIdx.put( keyClusterIdx, subdictClusterIdx );
		}
		subdictClusterIdx.put( pkey, Buff );

		Map< YCFGenKbSecGrpIncPKey, YCFGenKbSecGrpIncBuff > subdictGroupIdx;
		if( dictByGroupIdx.containsKey( keyGroupIdx ) ) {
			subdictGroupIdx = dictByGroupIdx.get( keyGroupIdx );
		}
		else {
			subdictGroupIdx = new HashMap< YCFGenKbSecGrpIncPKey, YCFGenKbSecGrpIncBuff >();
			dictByGroupIdx.put( keyGroupIdx, subdictGroupIdx );
		}
		subdictGroupIdx.put( pkey, Buff );

		Map< YCFGenKbSecGrpIncPKey, YCFGenKbSecGrpIncBuff > subdictIncludeIdx;
		if( dictByIncludeIdx.containsKey( keyIncludeIdx ) ) {
			subdictIncludeIdx = dictByIncludeIdx.get( keyIncludeIdx );
		}
		else {
			subdictIncludeIdx = new HashMap< YCFGenKbSecGrpIncPKey, YCFGenKbSecGrpIncBuff >();
			dictByIncludeIdx.put( keyIncludeIdx, subdictIncludeIdx );
		}
		subdictIncludeIdx.put( pkey, Buff );

		dictByUIncludeIdx.put( keyUIncludeIdx, Buff );

	}

	public YCFGenKbSecGrpIncBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpIncPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamSecGrpInc.readDerived";
		YCFGenKbSecGrpIncPKey key = schema.getFactorySecGrpInc().newPKey();
		key.setRequiredClusterId( PKey.getRequiredClusterId() );
		key.setRequiredSecGrpIncId( PKey.getRequiredSecGrpIncId() );
		YCFGenKbSecGrpIncBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecGrpIncBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpIncPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamSecGrpInc.readDerived";
		YCFGenKbSecGrpIncPKey key = schema.getFactorySecGrpInc().newPKey();
		key.setRequiredClusterId( PKey.getRequiredClusterId() );
		key.setRequiredSecGrpIncId( PKey.getRequiredSecGrpIncId() );
		YCFGenKbSecGrpIncBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecGrpIncBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamSecGrpInc.readAllDerived";
		YCFGenKbSecGrpIncBuff[] retList = new YCFGenKbSecGrpIncBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbSecGrpIncBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbSecGrpIncBuff[] readDerivedByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFGenKbRamSecGrpInc.readDerivedByClusterIdx";
		YCFGenKbSecGrpIncByClusterIdxKey key = schema.getFactorySecGrpInc().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );

		YCFGenKbSecGrpIncBuff[] recArray;
		if( dictByClusterIdx.containsKey( key ) ) {
			Map< YCFGenKbSecGrpIncPKey, YCFGenKbSecGrpIncBuff > subdictClusterIdx
				= dictByClusterIdx.get( key );
			recArray = new YCFGenKbSecGrpIncBuff[ subdictClusterIdx.size() ];
			Iterator< YCFGenKbSecGrpIncBuff > iter = subdictClusterIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbSecGrpIncPKey, YCFGenKbSecGrpIncBuff > subdictClusterIdx
				= new HashMap< YCFGenKbSecGrpIncPKey, YCFGenKbSecGrpIncBuff >();
			dictByClusterIdx.put( key, subdictClusterIdx );
			recArray = new YCFGenKbSecGrpIncBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbSecGrpIncBuff[] readDerivedByGroupIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecGroupId )
	{
		final String S_ProcName = "YCFGenKbRamSecGrpInc.readDerivedByGroupIdx";
		YCFGenKbSecGrpIncByGroupIdxKey key = schema.getFactorySecGrpInc().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );

		YCFGenKbSecGrpIncBuff[] recArray;
		if( dictByGroupIdx.containsKey( key ) ) {
			Map< YCFGenKbSecGrpIncPKey, YCFGenKbSecGrpIncBuff > subdictGroupIdx
				= dictByGroupIdx.get( key );
			recArray = new YCFGenKbSecGrpIncBuff[ subdictGroupIdx.size() ];
			Iterator< YCFGenKbSecGrpIncBuff > iter = subdictGroupIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbSecGrpIncPKey, YCFGenKbSecGrpIncBuff > subdictGroupIdx
				= new HashMap< YCFGenKbSecGrpIncPKey, YCFGenKbSecGrpIncBuff >();
			dictByGroupIdx.put( key, subdictGroupIdx );
			recArray = new YCFGenKbSecGrpIncBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbSecGrpIncBuff[] readDerivedByIncludeIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int IncludeGroupId )
	{
		final String S_ProcName = "YCFGenKbRamSecGrpInc.readDerivedByIncludeIdx";
		YCFGenKbSecGrpIncByIncludeIdxKey key = schema.getFactorySecGrpInc().newIncludeIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredIncludeGroupId( IncludeGroupId );

		YCFGenKbSecGrpIncBuff[] recArray;
		if( dictByIncludeIdx.containsKey( key ) ) {
			Map< YCFGenKbSecGrpIncPKey, YCFGenKbSecGrpIncBuff > subdictIncludeIdx
				= dictByIncludeIdx.get( key );
			recArray = new YCFGenKbSecGrpIncBuff[ subdictIncludeIdx.size() ];
			Iterator< YCFGenKbSecGrpIncBuff > iter = subdictIncludeIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbSecGrpIncPKey, YCFGenKbSecGrpIncBuff > subdictIncludeIdx
				= new HashMap< YCFGenKbSecGrpIncPKey, YCFGenKbSecGrpIncBuff >();
			dictByIncludeIdx.put( key, subdictIncludeIdx );
			recArray = new YCFGenKbSecGrpIncBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbSecGrpIncBuff readDerivedByUIncludeIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecGroupId,
		int IncludeGroupId )
	{
		final String S_ProcName = "YCFGenKbRamSecGrpInc.readDerivedByUIncludeIdx";
		YCFGenKbSecGrpIncByUIncludeIdxKey key = schema.getFactorySecGrpInc().newUIncludeIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		key.setRequiredIncludeGroupId( IncludeGroupId );

		YCFGenKbSecGrpIncBuff buff;
		if( dictByUIncludeIdx.containsKey( key ) ) {
			buff = dictByUIncludeIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecGrpIncBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		long SecGrpIncId )
	{
		final String S_ProcName = "YCFGenKbRamSecGrpInc.readDerivedByIdIdx() ";
		YCFGenKbSecGrpIncPKey key = schema.getFactorySecGrpInc().newPKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGrpIncId( SecGrpIncId );

		YCFGenKbSecGrpIncBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecGrpIncBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpIncPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamSecGrpInc.readBuff";
		YCFGenKbSecGrpIncBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a90b" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecGrpIncBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpIncPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbSecGrpIncBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a90b" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecGrpIncBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamSecGrpInc.readAllBuff";
		YCFGenKbSecGrpIncBuff buff;
		ArrayList<YCFGenKbSecGrpIncBuff> filteredList = new ArrayList<YCFGenKbSecGrpIncBuff>();
		YCFGenKbSecGrpIncBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a90b" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSecGrpIncBuff[0] ) );
	}

	/**
	 *	Read a page of all the specific SecGrpInc buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecGrpInc instances in the database accessible for the Authorization.
	 */
	public YCFGenKbSecGrpIncBuff[] pageAllBuff( YCFGenKbAuthorization Authorization,
		Long priorClusterId,
		Long priorSecGrpIncId )
	{
		final String S_ProcName = "pageAllBuff";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public YCFGenKbSecGrpIncBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		long SecGrpIncId )
	{
		final String S_ProcName = "YCFGenKbRamSecGrpInc.readBuffByIdIdx() ";
		YCFGenKbSecGrpIncBuff buff = readDerivedByIdIdx( Authorization,
			ClusterId,
			SecGrpIncId );
		if( ( buff != null ) && buff.getClassCode().equals( "a90b" ) ) {
			return( (YCFGenKbSecGrpIncBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbSecGrpIncBuff[] readBuffByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFGenKbRamSecGrpInc.readBuffByClusterIdx() ";
		YCFGenKbSecGrpIncBuff buff;
		ArrayList<YCFGenKbSecGrpIncBuff> filteredList = new ArrayList<YCFGenKbSecGrpIncBuff>();
		YCFGenKbSecGrpIncBuff[] buffList = readDerivedByClusterIdx( Authorization,
			ClusterId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a90b" ) ) {
				filteredList.add( (YCFGenKbSecGrpIncBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSecGrpIncBuff[0] ) );
	}

	public YCFGenKbSecGrpIncBuff[] readBuffByGroupIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecGroupId )
	{
		final String S_ProcName = "YCFGenKbRamSecGrpInc.readBuffByGroupIdx() ";
		YCFGenKbSecGrpIncBuff buff;
		ArrayList<YCFGenKbSecGrpIncBuff> filteredList = new ArrayList<YCFGenKbSecGrpIncBuff>();
		YCFGenKbSecGrpIncBuff[] buffList = readDerivedByGroupIdx( Authorization,
			ClusterId,
			SecGroupId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a90b" ) ) {
				filteredList.add( (YCFGenKbSecGrpIncBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSecGrpIncBuff[0] ) );
	}

	public YCFGenKbSecGrpIncBuff[] readBuffByIncludeIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int IncludeGroupId )
	{
		final String S_ProcName = "YCFGenKbRamSecGrpInc.readBuffByIncludeIdx() ";
		YCFGenKbSecGrpIncBuff buff;
		ArrayList<YCFGenKbSecGrpIncBuff> filteredList = new ArrayList<YCFGenKbSecGrpIncBuff>();
		YCFGenKbSecGrpIncBuff[] buffList = readDerivedByIncludeIdx( Authorization,
			ClusterId,
			IncludeGroupId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a90b" ) ) {
				filteredList.add( (YCFGenKbSecGrpIncBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSecGrpIncBuff[0] ) );
	}

	public YCFGenKbSecGrpIncBuff readBuffByUIncludeIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecGroupId,
		int IncludeGroupId )
	{
		final String S_ProcName = "YCFGenKbRamSecGrpInc.readBuffByUIncludeIdx() ";
		YCFGenKbSecGrpIncBuff buff = readDerivedByUIncludeIdx( Authorization,
			ClusterId,
			SecGroupId,
			IncludeGroupId );
		if( ( buff != null ) && buff.getClassCode().equals( "a90b" ) ) {
			return( (YCFGenKbSecGrpIncBuff)buff );
		}
		else {
			return( null );
		}
	}

	/**
	 *	Read a page array of the specific SecGrpInc buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbSecGrpIncBuff[] pageBuffByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		Long priorClusterId,
		Long priorSecGrpIncId )
	{
		final String S_ProcName = "pageBuffByClusterIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific SecGrpInc buffer instances identified by the duplicate key GroupIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbSecGrpIncBuff[] pageBuffByGroupIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecGroupId,
		Long priorClusterId,
		Long priorSecGrpIncId )
	{
		final String S_ProcName = "pageBuffByGroupIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific SecGrpInc buffer instances identified by the duplicate key IncludeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbSecGrpIncBuff[] pageBuffByIncludeIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int IncludeGroupId,
		Long priorClusterId,
		Long priorSecGrpIncId )
	{
		final String S_ProcName = "pageBuffByIncludeIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateSecGrpInc( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpIncBuff Buff )
	{
		YCFGenKbSecGrpIncPKey pkey = schema.getFactorySecGrpInc().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecGrpIncId( Buff.getRequiredSecGrpIncId() );
		YCFGenKbSecGrpIncBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateSecGrpInc",
				"Existing record not found",
				"SecGrpInc",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateSecGrpInc",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFGenKbSecGrpIncByClusterIdxKey existingKeyClusterIdx = schema.getFactorySecGrpInc().newClusterIdxKey();
		existingKeyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFGenKbSecGrpIncByClusterIdxKey newKeyClusterIdx = schema.getFactorySecGrpInc().newClusterIdxKey();
		newKeyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFGenKbSecGrpIncByGroupIdxKey existingKeyGroupIdx = schema.getFactorySecGrpInc().newGroupIdxKey();
		existingKeyGroupIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyGroupIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );

		YCFGenKbSecGrpIncByGroupIdxKey newKeyGroupIdx = schema.getFactorySecGrpInc().newGroupIdxKey();
		newKeyGroupIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyGroupIdx.setRequiredSecGroupId( Buff.getRequiredSecGroupId() );

		YCFGenKbSecGrpIncByIncludeIdxKey existingKeyIncludeIdx = schema.getFactorySecGrpInc().newIncludeIdxKey();
		existingKeyIncludeIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyIncludeIdx.setRequiredIncludeGroupId( existing.getRequiredIncludeGroupId() );

		YCFGenKbSecGrpIncByIncludeIdxKey newKeyIncludeIdx = schema.getFactorySecGrpInc().newIncludeIdxKey();
		newKeyIncludeIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyIncludeIdx.setRequiredIncludeGroupId( Buff.getRequiredIncludeGroupId() );

		YCFGenKbSecGrpIncByUIncludeIdxKey existingKeyUIncludeIdx = schema.getFactorySecGrpInc().newUIncludeIdxKey();
		existingKeyUIncludeIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyUIncludeIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );
		existingKeyUIncludeIdx.setRequiredIncludeGroupId( existing.getRequiredIncludeGroupId() );

		YCFGenKbSecGrpIncByUIncludeIdxKey newKeyUIncludeIdx = schema.getFactorySecGrpInc().newUIncludeIdxKey();
		newKeyUIncludeIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyUIncludeIdx.setRequiredSecGroupId( Buff.getRequiredSecGroupId() );
		newKeyUIncludeIdx.setRequiredIncludeGroupId( Buff.getRequiredIncludeGroupId() );

		// Check unique indexes

		if( ! existingKeyUIncludeIdx.equals( newKeyUIncludeIdx ) ) {
			if( dictByUIncludeIdx.containsKey( newKeyUIncludeIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateSecGrpInc",
					"SecGrpIncUIncludeIdx",
					newKeyUIncludeIdx );
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
						"updateSecGrpInc",
						"Owner",
						"SecGrpIncCluster",
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
						"updateSecGrpInc",
						"Container",
						"SecGrpIncGroup",
						"SecGroup",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFGenKbSecGrpIncPKey, YCFGenKbSecGrpIncBuff > subdict;

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
			subdict = new HashMap< YCFGenKbSecGrpIncPKey, YCFGenKbSecGrpIncBuff >();
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
			subdict = new HashMap< YCFGenKbSecGrpIncPKey, YCFGenKbSecGrpIncBuff >();
			dictByGroupIdx.put( newKeyGroupIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByIncludeIdx.get( existingKeyIncludeIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByIncludeIdx.containsKey( newKeyIncludeIdx ) ) {
			subdict = dictByIncludeIdx.get( newKeyIncludeIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbSecGrpIncPKey, YCFGenKbSecGrpIncBuff >();
			dictByIncludeIdx.put( newKeyIncludeIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUIncludeIdx.remove( existingKeyUIncludeIdx );
		dictByUIncludeIdx.put( newKeyUIncludeIdx, Buff );

	}

	public void deleteSecGrpInc( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpIncBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamSecGrpIncTable.deleteSecGrpInc() ";
		String classCode;
		YCFGenKbSecGrpIncPKey pkey = schema.getFactorySecGrpInc().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecGrpIncId( Buff.getRequiredSecGrpIncId() );
		YCFGenKbSecGrpIncBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteSecGrpInc",
				pkey );
		}
		YCFGenKbSecGrpIncByClusterIdxKey keyClusterIdx = schema.getFactorySecGrpInc().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFGenKbSecGrpIncByGroupIdxKey keyGroupIdx = schema.getFactorySecGrpInc().newGroupIdxKey();
		keyGroupIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyGroupIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );

		YCFGenKbSecGrpIncByIncludeIdxKey keyIncludeIdx = schema.getFactorySecGrpInc().newIncludeIdxKey();
		keyIncludeIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyIncludeIdx.setRequiredIncludeGroupId( existing.getRequiredIncludeGroupId() );

		YCFGenKbSecGrpIncByUIncludeIdxKey keyUIncludeIdx = schema.getFactorySecGrpInc().newUIncludeIdxKey();
		keyUIncludeIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUIncludeIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );
		keyUIncludeIdx.setRequiredIncludeGroupId( existing.getRequiredIncludeGroupId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFGenKbSecGrpIncPKey, YCFGenKbSecGrpIncBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByClusterIdx.get( keyClusterIdx );
		subdict.remove( pkey );

		subdict = dictByGroupIdx.get( keyGroupIdx );
		subdict.remove( pkey );

		subdict = dictByIncludeIdx.get( keyIncludeIdx );
		subdict.remove( pkey );

		dictByUIncludeIdx.remove( keyUIncludeIdx );

	}
	public void deleteSecGrpIncByIdIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		long argSecGrpIncId )
	{
		YCFGenKbSecGrpIncPKey key = schema.getFactorySecGrpInc().newPKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredSecGrpIncId( argSecGrpIncId );
		deleteSecGrpIncByIdIdx( Authorization, key );
	}

	public void deleteSecGrpIncByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpIncPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbSecGrpIncBuff cur;
		LinkedList<YCFGenKbSecGrpIncBuff> matchSet = new LinkedList<YCFGenKbSecGrpIncBuff>();
		Iterator<YCFGenKbSecGrpIncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecGrpIncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGrpInc().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGrpIncId() );
			deleteSecGrpInc( Authorization, cur );
		}
	}

	public void deleteSecGrpIncByClusterIdx( YCFGenKbAuthorization Authorization,
		long argClusterId )
	{
		YCFGenKbSecGrpIncByClusterIdxKey key = schema.getFactorySecGrpInc().newClusterIdxKey();
		key.setRequiredClusterId( argClusterId );
		deleteSecGrpIncByClusterIdx( Authorization, key );
	}

	public void deleteSecGrpIncByClusterIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpIncByClusterIdxKey argKey )
	{
		YCFGenKbSecGrpIncBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbSecGrpIncBuff> matchSet = new LinkedList<YCFGenKbSecGrpIncBuff>();
		Iterator<YCFGenKbSecGrpIncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecGrpIncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGrpInc().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGrpIncId() );
			deleteSecGrpInc( Authorization, cur );
		}
	}

	public void deleteSecGrpIncByGroupIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		int argSecGroupId )
	{
		YCFGenKbSecGrpIncByGroupIdxKey key = schema.getFactorySecGrpInc().newGroupIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredSecGroupId( argSecGroupId );
		deleteSecGrpIncByGroupIdx( Authorization, key );
	}

	public void deleteSecGrpIncByGroupIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpIncByGroupIdxKey argKey )
	{
		YCFGenKbSecGrpIncBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbSecGrpIncBuff> matchSet = new LinkedList<YCFGenKbSecGrpIncBuff>();
		Iterator<YCFGenKbSecGrpIncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecGrpIncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGrpInc().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGrpIncId() );
			deleteSecGrpInc( Authorization, cur );
		}
	}

	public void deleteSecGrpIncByIncludeIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		int argIncludeGroupId )
	{
		YCFGenKbSecGrpIncByIncludeIdxKey key = schema.getFactorySecGrpInc().newIncludeIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredIncludeGroupId( argIncludeGroupId );
		deleteSecGrpIncByIncludeIdx( Authorization, key );
	}

	public void deleteSecGrpIncByIncludeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpIncByIncludeIdxKey argKey )
	{
		YCFGenKbSecGrpIncBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbSecGrpIncBuff> matchSet = new LinkedList<YCFGenKbSecGrpIncBuff>();
		Iterator<YCFGenKbSecGrpIncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecGrpIncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGrpInc().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGrpIncId() );
			deleteSecGrpInc( Authorization, cur );
		}
	}

	public void deleteSecGrpIncByUIncludeIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		int argSecGroupId,
		int argIncludeGroupId )
	{
		YCFGenKbSecGrpIncByUIncludeIdxKey key = schema.getFactorySecGrpInc().newUIncludeIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredSecGroupId( argSecGroupId );
		key.setRequiredIncludeGroupId( argIncludeGroupId );
		deleteSecGrpIncByUIncludeIdx( Authorization, key );
	}

	public void deleteSecGrpIncByUIncludeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpIncByUIncludeIdxKey argKey )
	{
		YCFGenKbSecGrpIncBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbSecGrpIncBuff> matchSet = new LinkedList<YCFGenKbSecGrpIncBuff>();
		Iterator<YCFGenKbSecGrpIncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecGrpIncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGrpInc().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGrpIncId() );
			deleteSecGrpInc( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
