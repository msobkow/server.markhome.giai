
// Description: Java 11 in-memory RAM DbIO implementation for SecGroupForm.

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
 *	YCFIntRamSecGroupFormTable in-memory RAM DbIO implementation
 *	for SecGroupForm.
 */
public class YCFIntRamSecGroupFormTable
	implements IYCFIntSecGroupFormTable
{
	private IYCFIntSchema schema;
	private Map< YCFSecSecGroupFormPKey,
				YCFSecSecGroupFormBuff > dictByPKey
		= new HashMap< YCFSecSecGroupFormPKey,
				YCFSecSecGroupFormBuff >();
	private Map< YCFSecSecGroupFormByClusterIdxKey,
				Map< YCFSecSecGroupFormPKey,
					YCFSecSecGroupFormBuff >> dictByClusterIdx
		= new HashMap< YCFSecSecGroupFormByClusterIdxKey,
				Map< YCFSecSecGroupFormPKey,
					YCFSecSecGroupFormBuff >>();
	private Map< YCFSecSecGroupFormByGroupIdxKey,
				Map< YCFSecSecGroupFormPKey,
					YCFSecSecGroupFormBuff >> dictByGroupIdx
		= new HashMap< YCFSecSecGroupFormByGroupIdxKey,
				Map< YCFSecSecGroupFormPKey,
					YCFSecSecGroupFormBuff >>();
	private Map< YCFSecSecGroupFormByAppIdxKey,
				Map< YCFSecSecGroupFormPKey,
					YCFSecSecGroupFormBuff >> dictByAppIdx
		= new HashMap< YCFSecSecGroupFormByAppIdxKey,
				Map< YCFSecSecGroupFormPKey,
					YCFSecSecGroupFormBuff >>();
	private Map< YCFSecSecGroupFormByFormIdxKey,
				Map< YCFSecSecGroupFormPKey,
					YCFSecSecGroupFormBuff >> dictByFormIdx
		= new HashMap< YCFSecSecGroupFormByFormIdxKey,
				Map< YCFSecSecGroupFormPKey,
					YCFSecSecGroupFormBuff >>();
	private Map< YCFSecSecGroupFormByUFormIdxKey,
			YCFSecSecGroupFormBuff > dictByUFormIdx
		= new HashMap< YCFSecSecGroupFormByUFormIdxKey,
			YCFSecSecGroupFormBuff >();

	public YCFIntRamSecGroupFormTable( IYCFIntSchema argSchema ) {
		schema = argSchema;
	}

	public void createSecGroupForm( YCFSecAuthorization Authorization,
		YCFSecSecGroupFormBuff Buff )
	{
		final String S_ProcName = "createSecGroupForm";
		YCFSecSecGroupFormPKey pkey = schema.getFactorySecGroupForm().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecGroupFormId( ((YCFIntRamClusterTable)schema.getTableCluster()).nextSecGroupFormIdGen( Authorization,
			Buff.getRequiredClusterId() ) );
		Buff.setRequiredClusterId( pkey.getRequiredClusterId() );
		Buff.setRequiredSecGroupFormId( pkey.getRequiredSecGroupFormId() );
		YCFSecSecGroupFormByClusterIdxKey keyClusterIdx = schema.getFactorySecGroupForm().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFSecSecGroupFormByGroupIdxKey keyGroupIdx = schema.getFactorySecGroupForm().newGroupIdxKey();
		keyGroupIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyGroupIdx.setRequiredSecGroupId( Buff.getRequiredSecGroupId() );

		YCFSecSecGroupFormByAppIdxKey keyAppIdx = schema.getFactorySecGroupForm().newAppIdxKey();
		keyAppIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyAppIdx.setRequiredSecAppId( Buff.getRequiredSecAppId() );

		YCFSecSecGroupFormByFormIdxKey keyFormIdx = schema.getFactorySecGroupForm().newFormIdxKey();
		keyFormIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyFormIdx.setRequiredSecFormId( Buff.getRequiredSecFormId() );

		YCFSecSecGroupFormByUFormIdxKey keyUFormIdx = schema.getFactorySecGroupForm().newUFormIdxKey();
		keyUFormIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyUFormIdx.setRequiredSecGroupId( Buff.getRequiredSecGroupId() );
		keyUFormIdx.setRequiredSecFormId( Buff.getRequiredSecFormId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUFormIdx.containsKey( keyUFormIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"SecGroupFormUFormIdx",
				keyUFormIdx );
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
						"SecGroupFormCluster",
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
						"SecGroupFormGroup",
						"SecGroup",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFSecSecGroupFormPKey, YCFSecSecGroupFormBuff > subdictClusterIdx;
		if( dictByClusterIdx.containsKey( keyClusterIdx ) ) {
			subdictClusterIdx = dictByClusterIdx.get( keyClusterIdx );
		}
		else {
			subdictClusterIdx = new HashMap< YCFSecSecGroupFormPKey, YCFSecSecGroupFormBuff >();
			dictByClusterIdx.put( keyClusterIdx, subdictClusterIdx );
		}
		subdictClusterIdx.put( pkey, Buff );

		Map< YCFSecSecGroupFormPKey, YCFSecSecGroupFormBuff > subdictGroupIdx;
		if( dictByGroupIdx.containsKey( keyGroupIdx ) ) {
			subdictGroupIdx = dictByGroupIdx.get( keyGroupIdx );
		}
		else {
			subdictGroupIdx = new HashMap< YCFSecSecGroupFormPKey, YCFSecSecGroupFormBuff >();
			dictByGroupIdx.put( keyGroupIdx, subdictGroupIdx );
		}
		subdictGroupIdx.put( pkey, Buff );

		Map< YCFSecSecGroupFormPKey, YCFSecSecGroupFormBuff > subdictAppIdx;
		if( dictByAppIdx.containsKey( keyAppIdx ) ) {
			subdictAppIdx = dictByAppIdx.get( keyAppIdx );
		}
		else {
			subdictAppIdx = new HashMap< YCFSecSecGroupFormPKey, YCFSecSecGroupFormBuff >();
			dictByAppIdx.put( keyAppIdx, subdictAppIdx );
		}
		subdictAppIdx.put( pkey, Buff );

		Map< YCFSecSecGroupFormPKey, YCFSecSecGroupFormBuff > subdictFormIdx;
		if( dictByFormIdx.containsKey( keyFormIdx ) ) {
			subdictFormIdx = dictByFormIdx.get( keyFormIdx );
		}
		else {
			subdictFormIdx = new HashMap< YCFSecSecGroupFormPKey, YCFSecSecGroupFormBuff >();
			dictByFormIdx.put( keyFormIdx, subdictFormIdx );
		}
		subdictFormIdx.put( pkey, Buff );

		dictByUFormIdx.put( keyUFormIdx, Buff );

	}

	public YCFSecSecGroupFormBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecSecGroupFormPKey PKey )
	{
		final String S_ProcName = "YCFIntRamSecGroupForm.readDerived";
		YCFSecSecGroupFormPKey key = schema.getFactorySecGroupForm().newPKey();
		key.setRequiredClusterId( PKey.getRequiredClusterId() );
		key.setRequiredSecGroupFormId( PKey.getRequiredSecGroupFormId() );
		YCFSecSecGroupFormBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecGroupFormBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecSecGroupFormPKey PKey )
	{
		final String S_ProcName = "YCFIntRamSecGroupForm.readDerived";
		YCFSecSecGroupFormPKey key = schema.getFactorySecGroupForm().newPKey();
		key.setRequiredClusterId( PKey.getRequiredClusterId() );
		key.setRequiredSecGroupFormId( PKey.getRequiredSecGroupFormId() );
		YCFSecSecGroupFormBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecGroupFormBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFIntRamSecGroupForm.readAllDerived";
		YCFSecSecGroupFormBuff[] retList = new YCFSecSecGroupFormBuff[ dictByPKey.values().size() ];
		Iterator< YCFSecSecGroupFormBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFSecSecGroupFormBuff[] readDerivedByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFIntRamSecGroupForm.readDerivedByClusterIdx";
		YCFSecSecGroupFormByClusterIdxKey key = schema.getFactorySecGroupForm().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );

		YCFSecSecGroupFormBuff[] recArray;
		if( dictByClusterIdx.containsKey( key ) ) {
			Map< YCFSecSecGroupFormPKey, YCFSecSecGroupFormBuff > subdictClusterIdx
				= dictByClusterIdx.get( key );
			recArray = new YCFSecSecGroupFormBuff[ subdictClusterIdx.size() ];
			Iterator< YCFSecSecGroupFormBuff > iter = subdictClusterIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecSecGroupFormPKey, YCFSecSecGroupFormBuff > subdictClusterIdx
				= new HashMap< YCFSecSecGroupFormPKey, YCFSecSecGroupFormBuff >();
			dictByClusterIdx.put( key, subdictClusterIdx );
			recArray = new YCFSecSecGroupFormBuff[0];
		}
		return( recArray );
	}

	public YCFSecSecGroupFormBuff[] readDerivedByGroupIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecGroupId )
	{
		final String S_ProcName = "YCFIntRamSecGroupForm.readDerivedByGroupIdx";
		YCFSecSecGroupFormByGroupIdxKey key = schema.getFactorySecGroupForm().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );

		YCFSecSecGroupFormBuff[] recArray;
		if( dictByGroupIdx.containsKey( key ) ) {
			Map< YCFSecSecGroupFormPKey, YCFSecSecGroupFormBuff > subdictGroupIdx
				= dictByGroupIdx.get( key );
			recArray = new YCFSecSecGroupFormBuff[ subdictGroupIdx.size() ];
			Iterator< YCFSecSecGroupFormBuff > iter = subdictGroupIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecSecGroupFormPKey, YCFSecSecGroupFormBuff > subdictGroupIdx
				= new HashMap< YCFSecSecGroupFormPKey, YCFSecSecGroupFormBuff >();
			dictByGroupIdx.put( key, subdictGroupIdx );
			recArray = new YCFSecSecGroupFormBuff[0];
		}
		return( recArray );
	}

	public YCFSecSecGroupFormBuff[] readDerivedByAppIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecAppId )
	{
		final String S_ProcName = "YCFIntRamSecGroupForm.readDerivedByAppIdx";
		YCFSecSecGroupFormByAppIdxKey key = schema.getFactorySecGroupForm().newAppIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );

		YCFSecSecGroupFormBuff[] recArray;
		if( dictByAppIdx.containsKey( key ) ) {
			Map< YCFSecSecGroupFormPKey, YCFSecSecGroupFormBuff > subdictAppIdx
				= dictByAppIdx.get( key );
			recArray = new YCFSecSecGroupFormBuff[ subdictAppIdx.size() ];
			Iterator< YCFSecSecGroupFormBuff > iter = subdictAppIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecSecGroupFormPKey, YCFSecSecGroupFormBuff > subdictAppIdx
				= new HashMap< YCFSecSecGroupFormPKey, YCFSecSecGroupFormBuff >();
			dictByAppIdx.put( key, subdictAppIdx );
			recArray = new YCFSecSecGroupFormBuff[0];
		}
		return( recArray );
	}

	public YCFSecSecGroupFormBuff[] readDerivedByFormIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecFormId )
	{
		final String S_ProcName = "YCFIntRamSecGroupForm.readDerivedByFormIdx";
		YCFSecSecGroupFormByFormIdxKey key = schema.getFactorySecGroupForm().newFormIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecFormId( SecFormId );

		YCFSecSecGroupFormBuff[] recArray;
		if( dictByFormIdx.containsKey( key ) ) {
			Map< YCFSecSecGroupFormPKey, YCFSecSecGroupFormBuff > subdictFormIdx
				= dictByFormIdx.get( key );
			recArray = new YCFSecSecGroupFormBuff[ subdictFormIdx.size() ];
			Iterator< YCFSecSecGroupFormBuff > iter = subdictFormIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecSecGroupFormPKey, YCFSecSecGroupFormBuff > subdictFormIdx
				= new HashMap< YCFSecSecGroupFormPKey, YCFSecSecGroupFormBuff >();
			dictByFormIdx.put( key, subdictFormIdx );
			recArray = new YCFSecSecGroupFormBuff[0];
		}
		return( recArray );
	}

	public YCFSecSecGroupFormBuff readDerivedByUFormIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecGroupId,
		int SecFormId )
	{
		final String S_ProcName = "YCFIntRamSecGroupForm.readDerivedByUFormIdx";
		YCFSecSecGroupFormByUFormIdxKey key = schema.getFactorySecGroupForm().newUFormIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		key.setRequiredSecFormId( SecFormId );

		YCFSecSecGroupFormBuff buff;
		if( dictByUFormIdx.containsKey( key ) ) {
			buff = dictByUFormIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecGroupFormBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		long SecGroupFormId )
	{
		final String S_ProcName = "YCFIntRamSecGroupForm.readDerivedByIdIdx() ";
		YCFSecSecGroupFormPKey key = schema.getFactorySecGroupForm().newPKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupFormId( SecGroupFormId );

		YCFSecSecGroupFormBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecGroupFormBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecSecGroupFormPKey PKey )
	{
		final String S_ProcName = "YCFIntRamSecGroupForm.readBuff";
		YCFSecSecGroupFormBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a00d" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecGroupFormBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecSecGroupFormPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFSecSecGroupFormBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a00d" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecGroupFormBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFIntRamSecGroupForm.readAllBuff";
		YCFSecSecGroupFormBuff buff;
		ArrayList<YCFSecSecGroupFormBuff> filteredList = new ArrayList<YCFSecSecGroupFormBuff>();
		YCFSecSecGroupFormBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a00d" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFSecSecGroupFormBuff[0] ) );
	}

	/**
	 *	Read a page of all the specific SecGroupForm buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecGroupForm instances in the database accessible for the Authorization.
	 */
	public YCFSecSecGroupFormBuff[] pageAllBuff( YCFSecAuthorization Authorization,
		Long priorClusterId,
		Long priorSecGroupFormId )
	{
		final String S_ProcName = "pageAllBuff";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public YCFSecSecGroupFormBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		long SecGroupFormId )
	{
		final String S_ProcName = "YCFIntRamSecGroupForm.readBuffByIdIdx() ";
		YCFSecSecGroupFormBuff buff = readDerivedByIdIdx( Authorization,
			ClusterId,
			SecGroupFormId );
		if( ( buff != null ) && buff.getClassCode().equals( "a00d" ) ) {
			return( (YCFSecSecGroupFormBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecSecGroupFormBuff[] readBuffByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFIntRamSecGroupForm.readBuffByClusterIdx() ";
		YCFSecSecGroupFormBuff buff;
		ArrayList<YCFSecSecGroupFormBuff> filteredList = new ArrayList<YCFSecSecGroupFormBuff>();
		YCFSecSecGroupFormBuff[] buffList = readDerivedByClusterIdx( Authorization,
			ClusterId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a00d" ) ) {
				filteredList.add( (YCFSecSecGroupFormBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecSecGroupFormBuff[0] ) );
	}

	public YCFSecSecGroupFormBuff[] readBuffByGroupIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecGroupId )
	{
		final String S_ProcName = "YCFIntRamSecGroupForm.readBuffByGroupIdx() ";
		YCFSecSecGroupFormBuff buff;
		ArrayList<YCFSecSecGroupFormBuff> filteredList = new ArrayList<YCFSecSecGroupFormBuff>();
		YCFSecSecGroupFormBuff[] buffList = readDerivedByGroupIdx( Authorization,
			ClusterId,
			SecGroupId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a00d" ) ) {
				filteredList.add( (YCFSecSecGroupFormBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecSecGroupFormBuff[0] ) );
	}

	public YCFSecSecGroupFormBuff[] readBuffByAppIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecAppId )
	{
		final String S_ProcName = "YCFIntRamSecGroupForm.readBuffByAppIdx() ";
		YCFSecSecGroupFormBuff buff;
		ArrayList<YCFSecSecGroupFormBuff> filteredList = new ArrayList<YCFSecSecGroupFormBuff>();
		YCFSecSecGroupFormBuff[] buffList = readDerivedByAppIdx( Authorization,
			ClusterId,
			SecAppId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a00d" ) ) {
				filteredList.add( (YCFSecSecGroupFormBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecSecGroupFormBuff[0] ) );
	}

	public YCFSecSecGroupFormBuff[] readBuffByFormIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecFormId )
	{
		final String S_ProcName = "YCFIntRamSecGroupForm.readBuffByFormIdx() ";
		YCFSecSecGroupFormBuff buff;
		ArrayList<YCFSecSecGroupFormBuff> filteredList = new ArrayList<YCFSecSecGroupFormBuff>();
		YCFSecSecGroupFormBuff[] buffList = readDerivedByFormIdx( Authorization,
			ClusterId,
			SecFormId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a00d" ) ) {
				filteredList.add( (YCFSecSecGroupFormBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecSecGroupFormBuff[0] ) );
	}

	public YCFSecSecGroupFormBuff readBuffByUFormIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecGroupId,
		int SecFormId )
	{
		final String S_ProcName = "YCFIntRamSecGroupForm.readBuffByUFormIdx() ";
		YCFSecSecGroupFormBuff buff = readDerivedByUFormIdx( Authorization,
			ClusterId,
			SecGroupId,
			SecFormId );
		if( ( buff != null ) && buff.getClassCode().equals( "a00d" ) ) {
			return( (YCFSecSecGroupFormBuff)buff );
		}
		else {
			return( null );
		}
	}

	/**
	 *	Read a page array of the specific SecGroupForm buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFSecSecGroupFormBuff[] pageBuffByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		Long priorClusterId,
		Long priorSecGroupFormId )
	{
		final String S_ProcName = "pageBuffByClusterIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific SecGroupForm buffer instances identified by the duplicate key GroupIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFSecSecGroupFormBuff[] pageBuffByGroupIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecGroupId,
		Long priorClusterId,
		Long priorSecGroupFormId )
	{
		final String S_ProcName = "pageBuffByGroupIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific SecGroupForm buffer instances identified by the duplicate key AppIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFSecSecGroupFormBuff[] pageBuffByAppIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecAppId,
		Long priorClusterId,
		Long priorSecGroupFormId )
	{
		final String S_ProcName = "pageBuffByAppIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific SecGroupForm buffer instances identified by the duplicate key FormIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFSecSecGroupFormBuff[] pageBuffByFormIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecFormId,
		Long priorClusterId,
		Long priorSecGroupFormId )
	{
		final String S_ProcName = "pageBuffByFormIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateSecGroupForm( YCFSecAuthorization Authorization,
		YCFSecSecGroupFormBuff Buff )
	{
		YCFSecSecGroupFormPKey pkey = schema.getFactorySecGroupForm().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecGroupFormId( Buff.getRequiredSecGroupFormId() );
		YCFSecSecGroupFormBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateSecGroupForm",
				"Existing record not found",
				"SecGroupForm",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateSecGroupForm",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFSecSecGroupFormByClusterIdxKey existingKeyClusterIdx = schema.getFactorySecGroupForm().newClusterIdxKey();
		existingKeyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFSecSecGroupFormByClusterIdxKey newKeyClusterIdx = schema.getFactorySecGroupForm().newClusterIdxKey();
		newKeyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFSecSecGroupFormByGroupIdxKey existingKeyGroupIdx = schema.getFactorySecGroupForm().newGroupIdxKey();
		existingKeyGroupIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyGroupIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );

		YCFSecSecGroupFormByGroupIdxKey newKeyGroupIdx = schema.getFactorySecGroupForm().newGroupIdxKey();
		newKeyGroupIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyGroupIdx.setRequiredSecGroupId( Buff.getRequiredSecGroupId() );

		YCFSecSecGroupFormByAppIdxKey existingKeyAppIdx = schema.getFactorySecGroupForm().newAppIdxKey();
		existingKeyAppIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyAppIdx.setRequiredSecAppId( existing.getRequiredSecAppId() );

		YCFSecSecGroupFormByAppIdxKey newKeyAppIdx = schema.getFactorySecGroupForm().newAppIdxKey();
		newKeyAppIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyAppIdx.setRequiredSecAppId( Buff.getRequiredSecAppId() );

		YCFSecSecGroupFormByFormIdxKey existingKeyFormIdx = schema.getFactorySecGroupForm().newFormIdxKey();
		existingKeyFormIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyFormIdx.setRequiredSecFormId( existing.getRequiredSecFormId() );

		YCFSecSecGroupFormByFormIdxKey newKeyFormIdx = schema.getFactorySecGroupForm().newFormIdxKey();
		newKeyFormIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyFormIdx.setRequiredSecFormId( Buff.getRequiredSecFormId() );

		YCFSecSecGroupFormByUFormIdxKey existingKeyUFormIdx = schema.getFactorySecGroupForm().newUFormIdxKey();
		existingKeyUFormIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyUFormIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );
		existingKeyUFormIdx.setRequiredSecFormId( existing.getRequiredSecFormId() );

		YCFSecSecGroupFormByUFormIdxKey newKeyUFormIdx = schema.getFactorySecGroupForm().newUFormIdxKey();
		newKeyUFormIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyUFormIdx.setRequiredSecGroupId( Buff.getRequiredSecGroupId() );
		newKeyUFormIdx.setRequiredSecFormId( Buff.getRequiredSecFormId() );

		// Check unique indexes

		if( ! existingKeyUFormIdx.equals( newKeyUFormIdx ) ) {
			if( dictByUFormIdx.containsKey( newKeyUFormIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateSecGroupForm",
					"SecGroupFormUFormIdx",
					newKeyUFormIdx );
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
						"updateSecGroupForm",
						"Owner",
						"SecGroupFormCluster",
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
						"updateSecGroupForm",
						"Container",
						"SecGroupFormGroup",
						"SecGroup",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFSecSecGroupFormPKey, YCFSecSecGroupFormBuff > subdict;

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
			subdict = new HashMap< YCFSecSecGroupFormPKey, YCFSecSecGroupFormBuff >();
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
			subdict = new HashMap< YCFSecSecGroupFormPKey, YCFSecSecGroupFormBuff >();
			dictByGroupIdx.put( newKeyGroupIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByAppIdx.get( existingKeyAppIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByAppIdx.containsKey( newKeyAppIdx ) ) {
			subdict = dictByAppIdx.get( newKeyAppIdx );
		}
		else {
			subdict = new HashMap< YCFSecSecGroupFormPKey, YCFSecSecGroupFormBuff >();
			dictByAppIdx.put( newKeyAppIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByFormIdx.get( existingKeyFormIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByFormIdx.containsKey( newKeyFormIdx ) ) {
			subdict = dictByFormIdx.get( newKeyFormIdx );
		}
		else {
			subdict = new HashMap< YCFSecSecGroupFormPKey, YCFSecSecGroupFormBuff >();
			dictByFormIdx.put( newKeyFormIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUFormIdx.remove( existingKeyUFormIdx );
		dictByUFormIdx.put( newKeyUFormIdx, Buff );

	}

	public void deleteSecGroupForm( YCFSecAuthorization Authorization,
		YCFSecSecGroupFormBuff Buff )
	{
		final String S_ProcName = "YCFIntRamSecGroupFormTable.deleteSecGroupForm() ";
		String classCode;
		YCFSecSecGroupFormPKey pkey = schema.getFactorySecGroupForm().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecGroupFormId( Buff.getRequiredSecGroupFormId() );
		YCFSecSecGroupFormBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteSecGroupForm",
				pkey );
		}
		YCFSecSecGroupFormByClusterIdxKey keyClusterIdx = schema.getFactorySecGroupForm().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFSecSecGroupFormByGroupIdxKey keyGroupIdx = schema.getFactorySecGroupForm().newGroupIdxKey();
		keyGroupIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyGroupIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );

		YCFSecSecGroupFormByAppIdxKey keyAppIdx = schema.getFactorySecGroupForm().newAppIdxKey();
		keyAppIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyAppIdx.setRequiredSecAppId( existing.getRequiredSecAppId() );

		YCFSecSecGroupFormByFormIdxKey keyFormIdx = schema.getFactorySecGroupForm().newFormIdxKey();
		keyFormIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyFormIdx.setRequiredSecFormId( existing.getRequiredSecFormId() );

		YCFSecSecGroupFormByUFormIdxKey keyUFormIdx = schema.getFactorySecGroupForm().newUFormIdxKey();
		keyUFormIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUFormIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );
		keyUFormIdx.setRequiredSecFormId( existing.getRequiredSecFormId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFSecSecGroupFormPKey, YCFSecSecGroupFormBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByClusterIdx.get( keyClusterIdx );
		subdict.remove( pkey );

		subdict = dictByGroupIdx.get( keyGroupIdx );
		subdict.remove( pkey );

		subdict = dictByAppIdx.get( keyAppIdx );
		subdict.remove( pkey );

		subdict = dictByFormIdx.get( keyFormIdx );
		subdict.remove( pkey );

		dictByUFormIdx.remove( keyUFormIdx );

	}
	public void deleteSecGroupFormByIdIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		long argSecGroupFormId )
	{
		YCFSecSecGroupFormPKey key = schema.getFactorySecGroupForm().newPKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredSecGroupFormId( argSecGroupFormId );
		deleteSecGroupFormByIdIdx( Authorization, key );
	}

	public void deleteSecGroupFormByIdIdx( YCFSecAuthorization Authorization,
		YCFSecSecGroupFormPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFSecSecGroupFormBuff cur;
		LinkedList<YCFSecSecGroupFormBuff> matchSet = new LinkedList<YCFSecSecGroupFormBuff>();
		Iterator<YCFSecSecGroupFormBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecGroupFormBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGroupForm().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGroupFormId() );
			deleteSecGroupForm( Authorization, cur );
		}
	}

	public void deleteSecGroupFormByClusterIdx( YCFSecAuthorization Authorization,
		long argClusterId )
	{
		YCFSecSecGroupFormByClusterIdxKey key = schema.getFactorySecGroupForm().newClusterIdxKey();
		key.setRequiredClusterId( argClusterId );
		deleteSecGroupFormByClusterIdx( Authorization, key );
	}

	public void deleteSecGroupFormByClusterIdx( YCFSecAuthorization Authorization,
		YCFSecSecGroupFormByClusterIdxKey argKey )
	{
		YCFSecSecGroupFormBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecSecGroupFormBuff> matchSet = new LinkedList<YCFSecSecGroupFormBuff>();
		Iterator<YCFSecSecGroupFormBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecGroupFormBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGroupForm().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGroupFormId() );
			deleteSecGroupForm( Authorization, cur );
		}
	}

	public void deleteSecGroupFormByGroupIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		int argSecGroupId )
	{
		YCFSecSecGroupFormByGroupIdxKey key = schema.getFactorySecGroupForm().newGroupIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredSecGroupId( argSecGroupId );
		deleteSecGroupFormByGroupIdx( Authorization, key );
	}

	public void deleteSecGroupFormByGroupIdx( YCFSecAuthorization Authorization,
		YCFSecSecGroupFormByGroupIdxKey argKey )
	{
		YCFSecSecGroupFormBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecSecGroupFormBuff> matchSet = new LinkedList<YCFSecSecGroupFormBuff>();
		Iterator<YCFSecSecGroupFormBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecGroupFormBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGroupForm().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGroupFormId() );
			deleteSecGroupForm( Authorization, cur );
		}
	}

	public void deleteSecGroupFormByAppIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		int argSecAppId )
	{
		YCFSecSecGroupFormByAppIdxKey key = schema.getFactorySecGroupForm().newAppIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredSecAppId( argSecAppId );
		deleteSecGroupFormByAppIdx( Authorization, key );
	}

	public void deleteSecGroupFormByAppIdx( YCFSecAuthorization Authorization,
		YCFSecSecGroupFormByAppIdxKey argKey )
	{
		YCFSecSecGroupFormBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecSecGroupFormBuff> matchSet = new LinkedList<YCFSecSecGroupFormBuff>();
		Iterator<YCFSecSecGroupFormBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecGroupFormBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGroupForm().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGroupFormId() );
			deleteSecGroupForm( Authorization, cur );
		}
	}

	public void deleteSecGroupFormByFormIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		int argSecFormId )
	{
		YCFSecSecGroupFormByFormIdxKey key = schema.getFactorySecGroupForm().newFormIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredSecFormId( argSecFormId );
		deleteSecGroupFormByFormIdx( Authorization, key );
	}

	public void deleteSecGroupFormByFormIdx( YCFSecAuthorization Authorization,
		YCFSecSecGroupFormByFormIdxKey argKey )
	{
		YCFSecSecGroupFormBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecSecGroupFormBuff> matchSet = new LinkedList<YCFSecSecGroupFormBuff>();
		Iterator<YCFSecSecGroupFormBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecGroupFormBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGroupForm().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGroupFormId() );
			deleteSecGroupForm( Authorization, cur );
		}
	}

	public void deleteSecGroupFormByUFormIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		int argSecGroupId,
		int argSecFormId )
	{
		YCFSecSecGroupFormByUFormIdxKey key = schema.getFactorySecGroupForm().newUFormIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredSecGroupId( argSecGroupId );
		key.setRequiredSecFormId( argSecFormId );
		deleteSecGroupFormByUFormIdx( Authorization, key );
	}

	public void deleteSecGroupFormByUFormIdx( YCFSecAuthorization Authorization,
		YCFSecSecGroupFormByUFormIdxKey argKey )
	{
		YCFSecSecGroupFormBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecSecGroupFormBuff> matchSet = new LinkedList<YCFSecSecGroupFormBuff>();
		Iterator<YCFSecSecGroupFormBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecGroupFormBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGroupForm().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGroupFormId() );
			deleteSecGroupForm( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
