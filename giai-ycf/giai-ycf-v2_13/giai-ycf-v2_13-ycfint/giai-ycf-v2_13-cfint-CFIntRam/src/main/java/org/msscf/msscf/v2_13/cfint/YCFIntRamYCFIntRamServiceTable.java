
// Description: Java 11 in-memory RAM DbIO implementation for Service.

/*
 *	org.mssycf.mssycf.YCFInt
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
 *	YCFIntRamServiceTable in-memory RAM DbIO implementation
 *	for Service.
 */
public class YCFIntRamServiceTable
	implements IYCFIntServiceTable
{
	private IYCFIntSchema schema;
	private Map< YCFSecServicePKey,
				YCFSecServiceBuff > dictByPKey
		= new HashMap< YCFSecServicePKey,
				YCFSecServiceBuff >();
	private Map< YCFSecServiceByClusterIdxKey,
				Map< YCFSecServicePKey,
					YCFSecServiceBuff >> dictByClusterIdx
		= new HashMap< YCFSecServiceByClusterIdxKey,
				Map< YCFSecServicePKey,
					YCFSecServiceBuff >>();
	private Map< YCFSecServiceByHostIdxKey,
				Map< YCFSecServicePKey,
					YCFSecServiceBuff >> dictByHostIdx
		= new HashMap< YCFSecServiceByHostIdxKey,
				Map< YCFSecServicePKey,
					YCFSecServiceBuff >>();
	private Map< YCFSecServiceByTypeIdxKey,
				Map< YCFSecServicePKey,
					YCFSecServiceBuff >> dictByTypeIdx
		= new HashMap< YCFSecServiceByTypeIdxKey,
				Map< YCFSecServicePKey,
					YCFSecServiceBuff >>();
	private Map< YCFSecServiceByUTypeIdxKey,
			YCFSecServiceBuff > dictByUTypeIdx
		= new HashMap< YCFSecServiceByUTypeIdxKey,
			YCFSecServiceBuff >();
	private Map< YCFSecServiceByUHostPortIdxKey,
			YCFSecServiceBuff > dictByUHostPortIdx
		= new HashMap< YCFSecServiceByUHostPortIdxKey,
			YCFSecServiceBuff >();

	public YCFIntRamServiceTable( IYCFIntSchema argSchema ) {
		schema = argSchema;
	}

	public void createService( YCFSecAuthorization Authorization,
		YCFSecServiceBuff Buff )
	{
		final String S_ProcName = "createService";
		YCFSecServicePKey pkey = schema.getFactoryService().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredServiceId( ((YCFIntRamClusterTable)schema.getTableCluster()).nextServiceIdGen( Authorization,
			Buff.getRequiredClusterId() ) );
		Buff.setRequiredClusterId( pkey.getRequiredClusterId() );
		Buff.setRequiredServiceId( pkey.getRequiredServiceId() );
		YCFSecServiceByClusterIdxKey keyClusterIdx = schema.getFactoryService().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFSecServiceByHostIdxKey keyHostIdx = schema.getFactoryService().newHostIdxKey();
		keyHostIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyHostIdx.setRequiredHostNodeId( Buff.getRequiredHostNodeId() );

		YCFSecServiceByTypeIdxKey keyTypeIdx = schema.getFactoryService().newTypeIdxKey();
		keyTypeIdx.setRequiredServiceTypeId( Buff.getRequiredServiceTypeId() );

		YCFSecServiceByUTypeIdxKey keyUTypeIdx = schema.getFactoryService().newUTypeIdxKey();
		keyUTypeIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyUTypeIdx.setRequiredHostNodeId( Buff.getRequiredHostNodeId() );
		keyUTypeIdx.setRequiredServiceTypeId( Buff.getRequiredServiceTypeId() );

		YCFSecServiceByUHostPortIdxKey keyUHostPortIdx = schema.getFactoryService().newUHostPortIdxKey();
		keyUHostPortIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyUHostPortIdx.setRequiredHostNodeId( Buff.getRequiredHostNodeId() );
		keyUHostPortIdx.setRequiredHostPort( Buff.getRequiredHostPort() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUTypeIdx.containsKey( keyUTypeIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"ServiceUTypeIdx",
				keyUTypeIdx );
		}

		if( dictByUHostPortIdx.containsKey( keyUHostPortIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"ServiceUHostPort",
				keyUHostPortIdx );
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
						"ServiceCluster",
						"Cluster",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFSecServicePKey, YCFSecServiceBuff > subdictClusterIdx;
		if( dictByClusterIdx.containsKey( keyClusterIdx ) ) {
			subdictClusterIdx = dictByClusterIdx.get( keyClusterIdx );
		}
		else {
			subdictClusterIdx = new HashMap< YCFSecServicePKey, YCFSecServiceBuff >();
			dictByClusterIdx.put( keyClusterIdx, subdictClusterIdx );
		}
		subdictClusterIdx.put( pkey, Buff );

		Map< YCFSecServicePKey, YCFSecServiceBuff > subdictHostIdx;
		if( dictByHostIdx.containsKey( keyHostIdx ) ) {
			subdictHostIdx = dictByHostIdx.get( keyHostIdx );
		}
		else {
			subdictHostIdx = new HashMap< YCFSecServicePKey, YCFSecServiceBuff >();
			dictByHostIdx.put( keyHostIdx, subdictHostIdx );
		}
		subdictHostIdx.put( pkey, Buff );

		Map< YCFSecServicePKey, YCFSecServiceBuff > subdictTypeIdx;
		if( dictByTypeIdx.containsKey( keyTypeIdx ) ) {
			subdictTypeIdx = dictByTypeIdx.get( keyTypeIdx );
		}
		else {
			subdictTypeIdx = new HashMap< YCFSecServicePKey, YCFSecServiceBuff >();
			dictByTypeIdx.put( keyTypeIdx, subdictTypeIdx );
		}
		subdictTypeIdx.put( pkey, Buff );

		dictByUTypeIdx.put( keyUTypeIdx, Buff );

		dictByUHostPortIdx.put( keyUHostPortIdx, Buff );

	}

	public YCFSecServiceBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecServicePKey PKey )
	{
		final String S_ProcName = "YCFIntRamService.readDerived";
		YCFSecServicePKey key = schema.getFactoryService().newPKey();
		key.setRequiredClusterId( PKey.getRequiredClusterId() );
		key.setRequiredServiceId( PKey.getRequiredServiceId() );
		YCFSecServiceBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecServiceBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecServicePKey PKey )
	{
		final String S_ProcName = "YCFIntRamService.readDerived";
		YCFSecServicePKey key = schema.getFactoryService().newPKey();
		key.setRequiredClusterId( PKey.getRequiredClusterId() );
		key.setRequiredServiceId( PKey.getRequiredServiceId() );
		YCFSecServiceBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecServiceBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFIntRamService.readAllDerived";
		YCFSecServiceBuff[] retList = new YCFSecServiceBuff[ dictByPKey.values().size() ];
		Iterator< YCFSecServiceBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFSecServiceBuff[] readDerivedByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFIntRamService.readDerivedByClusterIdx";
		YCFSecServiceByClusterIdxKey key = schema.getFactoryService().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );

		YCFSecServiceBuff[] recArray;
		if( dictByClusterIdx.containsKey( key ) ) {
			Map< YCFSecServicePKey, YCFSecServiceBuff > subdictClusterIdx
				= dictByClusterIdx.get( key );
			recArray = new YCFSecServiceBuff[ subdictClusterIdx.size() ];
			Iterator< YCFSecServiceBuff > iter = subdictClusterIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecServicePKey, YCFSecServiceBuff > subdictClusterIdx
				= new HashMap< YCFSecServicePKey, YCFSecServiceBuff >();
			dictByClusterIdx.put( key, subdictClusterIdx );
			recArray = new YCFSecServiceBuff[0];
		}
		return( recArray );
	}

	public YCFSecServiceBuff[] readDerivedByHostIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		long HostNodeId )
	{
		final String S_ProcName = "YCFIntRamService.readDerivedByHostIdx";
		YCFSecServiceByHostIdxKey key = schema.getFactoryService().newHostIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredHostNodeId( HostNodeId );

		YCFSecServiceBuff[] recArray;
		if( dictByHostIdx.containsKey( key ) ) {
			Map< YCFSecServicePKey, YCFSecServiceBuff > subdictHostIdx
				= dictByHostIdx.get( key );
			recArray = new YCFSecServiceBuff[ subdictHostIdx.size() ];
			Iterator< YCFSecServiceBuff > iter = subdictHostIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecServicePKey, YCFSecServiceBuff > subdictHostIdx
				= new HashMap< YCFSecServicePKey, YCFSecServiceBuff >();
			dictByHostIdx.put( key, subdictHostIdx );
			recArray = new YCFSecServiceBuff[0];
		}
		return( recArray );
	}

	public YCFSecServiceBuff[] readDerivedByTypeIdx( YCFSecAuthorization Authorization,
		int ServiceTypeId )
	{
		final String S_ProcName = "YCFIntRamService.readDerivedByTypeIdx";
		YCFSecServiceByTypeIdxKey key = schema.getFactoryService().newTypeIdxKey();
		key.setRequiredServiceTypeId( ServiceTypeId );

		YCFSecServiceBuff[] recArray;
		if( dictByTypeIdx.containsKey( key ) ) {
			Map< YCFSecServicePKey, YCFSecServiceBuff > subdictTypeIdx
				= dictByTypeIdx.get( key );
			recArray = new YCFSecServiceBuff[ subdictTypeIdx.size() ];
			Iterator< YCFSecServiceBuff > iter = subdictTypeIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecServicePKey, YCFSecServiceBuff > subdictTypeIdx
				= new HashMap< YCFSecServicePKey, YCFSecServiceBuff >();
			dictByTypeIdx.put( key, subdictTypeIdx );
			recArray = new YCFSecServiceBuff[0];
		}
		return( recArray );
	}

	public YCFSecServiceBuff readDerivedByUTypeIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		long HostNodeId,
		int ServiceTypeId )
	{
		final String S_ProcName = "YCFIntRamService.readDerivedByUTypeIdx";
		YCFSecServiceByUTypeIdxKey key = schema.getFactoryService().newUTypeIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredHostNodeId( HostNodeId );
		key.setRequiredServiceTypeId( ServiceTypeId );

		YCFSecServiceBuff buff;
		if( dictByUTypeIdx.containsKey( key ) ) {
			buff = dictByUTypeIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecServiceBuff readDerivedByUHostPortIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		long HostNodeId,
		short HostPort )
	{
		final String S_ProcName = "YCFIntRamService.readDerivedByUHostPortIdx";
		YCFSecServiceByUHostPortIdxKey key = schema.getFactoryService().newUHostPortIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredHostNodeId( HostNodeId );
		key.setRequiredHostPort( HostPort );

		YCFSecServiceBuff buff;
		if( dictByUHostPortIdx.containsKey( key ) ) {
			buff = dictByUHostPortIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecServiceBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		long ServiceId )
	{
		final String S_ProcName = "YCFIntRamService.readDerivedByIdIdx() ";
		YCFSecServicePKey key = schema.getFactoryService().newPKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredServiceId( ServiceId );

		YCFSecServiceBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecServiceBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecServicePKey PKey )
	{
		final String S_ProcName = "YCFIntRamService.readBuff";
		YCFSecServiceBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a012" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecServiceBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecServicePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFSecServiceBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a012" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecServiceBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFIntRamService.readAllBuff";
		YCFSecServiceBuff buff;
		ArrayList<YCFSecServiceBuff> filteredList = new ArrayList<YCFSecServiceBuff>();
		YCFSecServiceBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a012" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFSecServiceBuff[0] ) );
	}

	/**
	 *	Read a page of all the specific Service buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific Service instances in the database accessible for the Authorization.
	 */
	public YCFSecServiceBuff[] pageAllBuff( YCFSecAuthorization Authorization,
		Long priorClusterId,
		Long priorServiceId )
	{
		final String S_ProcName = "pageAllBuff";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public YCFSecServiceBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		long ServiceId )
	{
		final String S_ProcName = "YCFIntRamService.readBuffByIdIdx() ";
		YCFSecServiceBuff buff = readDerivedByIdIdx( Authorization,
			ClusterId,
			ServiceId );
		if( ( buff != null ) && buff.getClassCode().equals( "a012" ) ) {
			return( (YCFSecServiceBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecServiceBuff[] readBuffByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFIntRamService.readBuffByClusterIdx() ";
		YCFSecServiceBuff buff;
		ArrayList<YCFSecServiceBuff> filteredList = new ArrayList<YCFSecServiceBuff>();
		YCFSecServiceBuff[] buffList = readDerivedByClusterIdx( Authorization,
			ClusterId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a012" ) ) {
				filteredList.add( (YCFSecServiceBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecServiceBuff[0] ) );
	}

	public YCFSecServiceBuff[] readBuffByHostIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		long HostNodeId )
	{
		final String S_ProcName = "YCFIntRamService.readBuffByHostIdx() ";
		YCFSecServiceBuff buff;
		ArrayList<YCFSecServiceBuff> filteredList = new ArrayList<YCFSecServiceBuff>();
		YCFSecServiceBuff[] buffList = readDerivedByHostIdx( Authorization,
			ClusterId,
			HostNodeId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a012" ) ) {
				filteredList.add( (YCFSecServiceBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecServiceBuff[0] ) );
	}

	public YCFSecServiceBuff[] readBuffByTypeIdx( YCFSecAuthorization Authorization,
		int ServiceTypeId )
	{
		final String S_ProcName = "YCFIntRamService.readBuffByTypeIdx() ";
		YCFSecServiceBuff buff;
		ArrayList<YCFSecServiceBuff> filteredList = new ArrayList<YCFSecServiceBuff>();
		YCFSecServiceBuff[] buffList = readDerivedByTypeIdx( Authorization,
			ServiceTypeId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a012" ) ) {
				filteredList.add( (YCFSecServiceBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecServiceBuff[0] ) );
	}

	public YCFSecServiceBuff readBuffByUTypeIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		long HostNodeId,
		int ServiceTypeId )
	{
		final String S_ProcName = "YCFIntRamService.readBuffByUTypeIdx() ";
		YCFSecServiceBuff buff = readDerivedByUTypeIdx( Authorization,
			ClusterId,
			HostNodeId,
			ServiceTypeId );
		if( ( buff != null ) && buff.getClassCode().equals( "a012" ) ) {
			return( (YCFSecServiceBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecServiceBuff readBuffByUHostPortIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		long HostNodeId,
		short HostPort )
	{
		final String S_ProcName = "YCFIntRamService.readBuffByUHostPortIdx() ";
		YCFSecServiceBuff buff = readDerivedByUHostPortIdx( Authorization,
			ClusterId,
			HostNodeId,
			HostPort );
		if( ( buff != null ) && buff.getClassCode().equals( "a012" ) ) {
			return( (YCFSecServiceBuff)buff );
		}
		else {
			return( null );
		}
	}

	/**
	 *	Read a page array of the specific Service buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFSecServiceBuff[] pageBuffByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		Long priorClusterId,
		Long priorServiceId )
	{
		final String S_ProcName = "pageBuffByClusterIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific Service buffer instances identified by the duplicate key HostIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The Service key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFSecServiceBuff[] pageBuffByHostIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		long HostNodeId,
		Long priorClusterId,
		Long priorServiceId )
	{
		final String S_ProcName = "pageBuffByHostIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific Service buffer instances identified by the duplicate key TypeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argServiceTypeId	The Service key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFSecServiceBuff[] pageBuffByTypeIdx( YCFSecAuthorization Authorization,
		int ServiceTypeId,
		Long priorClusterId,
		Long priorServiceId )
	{
		final String S_ProcName = "pageBuffByTypeIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateService( YCFSecAuthorization Authorization,
		YCFSecServiceBuff Buff )
	{
		YCFSecServicePKey pkey = schema.getFactoryService().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredServiceId( Buff.getRequiredServiceId() );
		YCFSecServiceBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateService",
				"Existing record not found",
				"Service",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateService",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFSecServiceByClusterIdxKey existingKeyClusterIdx = schema.getFactoryService().newClusterIdxKey();
		existingKeyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFSecServiceByClusterIdxKey newKeyClusterIdx = schema.getFactoryService().newClusterIdxKey();
		newKeyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFSecServiceByHostIdxKey existingKeyHostIdx = schema.getFactoryService().newHostIdxKey();
		existingKeyHostIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyHostIdx.setRequiredHostNodeId( existing.getRequiredHostNodeId() );

		YCFSecServiceByHostIdxKey newKeyHostIdx = schema.getFactoryService().newHostIdxKey();
		newKeyHostIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyHostIdx.setRequiredHostNodeId( Buff.getRequiredHostNodeId() );

		YCFSecServiceByTypeIdxKey existingKeyTypeIdx = schema.getFactoryService().newTypeIdxKey();
		existingKeyTypeIdx.setRequiredServiceTypeId( existing.getRequiredServiceTypeId() );

		YCFSecServiceByTypeIdxKey newKeyTypeIdx = schema.getFactoryService().newTypeIdxKey();
		newKeyTypeIdx.setRequiredServiceTypeId( Buff.getRequiredServiceTypeId() );

		YCFSecServiceByUTypeIdxKey existingKeyUTypeIdx = schema.getFactoryService().newUTypeIdxKey();
		existingKeyUTypeIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyUTypeIdx.setRequiredHostNodeId( existing.getRequiredHostNodeId() );
		existingKeyUTypeIdx.setRequiredServiceTypeId( existing.getRequiredServiceTypeId() );

		YCFSecServiceByUTypeIdxKey newKeyUTypeIdx = schema.getFactoryService().newUTypeIdxKey();
		newKeyUTypeIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyUTypeIdx.setRequiredHostNodeId( Buff.getRequiredHostNodeId() );
		newKeyUTypeIdx.setRequiredServiceTypeId( Buff.getRequiredServiceTypeId() );

		YCFSecServiceByUHostPortIdxKey existingKeyUHostPortIdx = schema.getFactoryService().newUHostPortIdxKey();
		existingKeyUHostPortIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyUHostPortIdx.setRequiredHostNodeId( existing.getRequiredHostNodeId() );
		existingKeyUHostPortIdx.setRequiredHostPort( existing.getRequiredHostPort() );

		YCFSecServiceByUHostPortIdxKey newKeyUHostPortIdx = schema.getFactoryService().newUHostPortIdxKey();
		newKeyUHostPortIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyUHostPortIdx.setRequiredHostNodeId( Buff.getRequiredHostNodeId() );
		newKeyUHostPortIdx.setRequiredHostPort( Buff.getRequiredHostPort() );

		// Check unique indexes

		if( ! existingKeyUTypeIdx.equals( newKeyUTypeIdx ) ) {
			if( dictByUTypeIdx.containsKey( newKeyUTypeIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateService",
					"ServiceUTypeIdx",
					newKeyUTypeIdx );
			}
		}

		if( ! existingKeyUHostPortIdx.equals( newKeyUHostPortIdx ) ) {
			if( dictByUHostPortIdx.containsKey( newKeyUHostPortIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateService",
					"ServiceUHostPort",
					newKeyUHostPortIdx );
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
						"updateService",
						"Owner",
						"ServiceCluster",
						"Cluster",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFSecServicePKey, YCFSecServiceBuff > subdict;

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
			subdict = new HashMap< YCFSecServicePKey, YCFSecServiceBuff >();
			dictByClusterIdx.put( newKeyClusterIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByHostIdx.get( existingKeyHostIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByHostIdx.containsKey( newKeyHostIdx ) ) {
			subdict = dictByHostIdx.get( newKeyHostIdx );
		}
		else {
			subdict = new HashMap< YCFSecServicePKey, YCFSecServiceBuff >();
			dictByHostIdx.put( newKeyHostIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByTypeIdx.get( existingKeyTypeIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByTypeIdx.containsKey( newKeyTypeIdx ) ) {
			subdict = dictByTypeIdx.get( newKeyTypeIdx );
		}
		else {
			subdict = new HashMap< YCFSecServicePKey, YCFSecServiceBuff >();
			dictByTypeIdx.put( newKeyTypeIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUTypeIdx.remove( existingKeyUTypeIdx );
		dictByUTypeIdx.put( newKeyUTypeIdx, Buff );

		dictByUHostPortIdx.remove( existingKeyUHostPortIdx );
		dictByUHostPortIdx.put( newKeyUHostPortIdx, Buff );

	}

	public void deleteService( YCFSecAuthorization Authorization,
		YCFSecServiceBuff Buff )
	{
		final String S_ProcName = "YCFIntRamServiceTable.deleteService() ";
		String classCode;
		YCFSecServicePKey pkey = schema.getFactoryService().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredServiceId( Buff.getRequiredServiceId() );
		YCFSecServiceBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteService",
				pkey );
		}
		YCFSecServiceByClusterIdxKey keyClusterIdx = schema.getFactoryService().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFSecServiceByHostIdxKey keyHostIdx = schema.getFactoryService().newHostIdxKey();
		keyHostIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyHostIdx.setRequiredHostNodeId( existing.getRequiredHostNodeId() );

		YCFSecServiceByTypeIdxKey keyTypeIdx = schema.getFactoryService().newTypeIdxKey();
		keyTypeIdx.setRequiredServiceTypeId( existing.getRequiredServiceTypeId() );

		YCFSecServiceByUTypeIdxKey keyUTypeIdx = schema.getFactoryService().newUTypeIdxKey();
		keyUTypeIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUTypeIdx.setRequiredHostNodeId( existing.getRequiredHostNodeId() );
		keyUTypeIdx.setRequiredServiceTypeId( existing.getRequiredServiceTypeId() );

		YCFSecServiceByUHostPortIdxKey keyUHostPortIdx = schema.getFactoryService().newUHostPortIdxKey();
		keyUHostPortIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUHostPortIdx.setRequiredHostNodeId( existing.getRequiredHostNodeId() );
		keyUHostPortIdx.setRequiredHostPort( existing.getRequiredHostPort() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFSecServicePKey, YCFSecServiceBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByClusterIdx.get( keyClusterIdx );
		subdict.remove( pkey );

		subdict = dictByHostIdx.get( keyHostIdx );
		subdict.remove( pkey );

		subdict = dictByTypeIdx.get( keyTypeIdx );
		subdict.remove( pkey );

		dictByUTypeIdx.remove( keyUTypeIdx );

		dictByUHostPortIdx.remove( keyUHostPortIdx );

	}
	public void deleteServiceByIdIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		long argServiceId )
	{
		YCFSecServicePKey key = schema.getFactoryService().newPKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredServiceId( argServiceId );
		deleteServiceByIdIdx( Authorization, key );
	}

	public void deleteServiceByIdIdx( YCFSecAuthorization Authorization,
		YCFSecServicePKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFSecServiceBuff cur;
		LinkedList<YCFSecServiceBuff> matchSet = new LinkedList<YCFSecServiceBuff>();
		Iterator<YCFSecServiceBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecServiceBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableService().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredServiceId() );
			deleteService( Authorization, cur );
		}
	}

	public void deleteServiceByClusterIdx( YCFSecAuthorization Authorization,
		long argClusterId )
	{
		YCFSecServiceByClusterIdxKey key = schema.getFactoryService().newClusterIdxKey();
		key.setRequiredClusterId( argClusterId );
		deleteServiceByClusterIdx( Authorization, key );
	}

	public void deleteServiceByClusterIdx( YCFSecAuthorization Authorization,
		YCFSecServiceByClusterIdxKey argKey )
	{
		YCFSecServiceBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecServiceBuff> matchSet = new LinkedList<YCFSecServiceBuff>();
		Iterator<YCFSecServiceBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecServiceBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableService().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredServiceId() );
			deleteService( Authorization, cur );
		}
	}

	public void deleteServiceByHostIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		long argHostNodeId )
	{
		YCFSecServiceByHostIdxKey key = schema.getFactoryService().newHostIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredHostNodeId( argHostNodeId );
		deleteServiceByHostIdx( Authorization, key );
	}

	public void deleteServiceByHostIdx( YCFSecAuthorization Authorization,
		YCFSecServiceByHostIdxKey argKey )
	{
		YCFSecServiceBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecServiceBuff> matchSet = new LinkedList<YCFSecServiceBuff>();
		Iterator<YCFSecServiceBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecServiceBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableService().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredServiceId() );
			deleteService( Authorization, cur );
		}
	}

	public void deleteServiceByTypeIdx( YCFSecAuthorization Authorization,
		int argServiceTypeId )
	{
		YCFSecServiceByTypeIdxKey key = schema.getFactoryService().newTypeIdxKey();
		key.setRequiredServiceTypeId( argServiceTypeId );
		deleteServiceByTypeIdx( Authorization, key );
	}

	public void deleteServiceByTypeIdx( YCFSecAuthorization Authorization,
		YCFSecServiceByTypeIdxKey argKey )
	{
		YCFSecServiceBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecServiceBuff> matchSet = new LinkedList<YCFSecServiceBuff>();
		Iterator<YCFSecServiceBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecServiceBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableService().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredServiceId() );
			deleteService( Authorization, cur );
		}
	}

	public void deleteServiceByUTypeIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		long argHostNodeId,
		int argServiceTypeId )
	{
		YCFSecServiceByUTypeIdxKey key = schema.getFactoryService().newUTypeIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredHostNodeId( argHostNodeId );
		key.setRequiredServiceTypeId( argServiceTypeId );
		deleteServiceByUTypeIdx( Authorization, key );
	}

	public void deleteServiceByUTypeIdx( YCFSecAuthorization Authorization,
		YCFSecServiceByUTypeIdxKey argKey )
	{
		YCFSecServiceBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecServiceBuff> matchSet = new LinkedList<YCFSecServiceBuff>();
		Iterator<YCFSecServiceBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecServiceBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableService().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredServiceId() );
			deleteService( Authorization, cur );
		}
	}

	public void deleteServiceByUHostPortIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		long argHostNodeId,
		short argHostPort )
	{
		YCFSecServiceByUHostPortIdxKey key = schema.getFactoryService().newUHostPortIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredHostNodeId( argHostNodeId );
		key.setRequiredHostPort( argHostPort );
		deleteServiceByUHostPortIdx( Authorization, key );
	}

	public void deleteServiceByUHostPortIdx( YCFSecAuthorization Authorization,
		YCFSecServiceByUHostPortIdxKey argKey )
	{
		YCFSecServiceBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecServiceBuff> matchSet = new LinkedList<YCFSecServiceBuff>();
		Iterator<YCFSecServiceBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecServiceBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableService().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredServiceId() );
			deleteService( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
