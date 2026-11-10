
// Description: Java 11 in-memory RAM DbIO implementation for SecForm.

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
 *	YCFBamRamSecFormTable in-memory RAM DbIO implementation
 *	for SecForm.
 */
public class YCFBamRamSecFormTable
	implements IYCFBamSecFormTable
{
	private IYCFBamSchema schema;
	private Map< YCFSecSecFormPKey,
				YCFSecSecFormBuff > dictByPKey
		= new HashMap< YCFSecSecFormPKey,
				YCFSecSecFormBuff >();
	private Map< YCFSecSecFormByClusterIdxKey,
				Map< YCFSecSecFormPKey,
					YCFSecSecFormBuff >> dictByClusterIdx
		= new HashMap< YCFSecSecFormByClusterIdxKey,
				Map< YCFSecSecFormPKey,
					YCFSecSecFormBuff >>();
	private Map< YCFSecSecFormBySecAppIdxKey,
				Map< YCFSecSecFormPKey,
					YCFSecSecFormBuff >> dictBySecAppIdx
		= new HashMap< YCFSecSecFormBySecAppIdxKey,
				Map< YCFSecSecFormPKey,
					YCFSecSecFormBuff >>();
	private Map< YCFSecSecFormByUJEEServletIdxKey,
			YCFSecSecFormBuff > dictByUJEEServletIdx
		= new HashMap< YCFSecSecFormByUJEEServletIdxKey,
			YCFSecSecFormBuff >();

	public YCFBamRamSecFormTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createSecForm( YCFSecAuthorization Authorization,
		YCFSecSecFormBuff Buff )
	{
		final String S_ProcName = "createSecForm";
		YCFSecSecFormPKey pkey = schema.getFactorySecForm().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecFormId( ((YCFBamRamClusterTable)schema.getTableCluster()).nextSecFormIdGen( Authorization,
			Buff.getRequiredClusterId() ) );
		Buff.setRequiredClusterId( pkey.getRequiredClusterId() );
		Buff.setRequiredSecFormId( pkey.getRequiredSecFormId() );
		YCFSecSecFormByClusterIdxKey keyClusterIdx = schema.getFactorySecForm().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFSecSecFormBySecAppIdxKey keySecAppIdx = schema.getFactorySecForm().newSecAppIdxKey();
		keySecAppIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keySecAppIdx.setRequiredSecAppId( Buff.getRequiredSecAppId() );

		YCFSecSecFormByUJEEServletIdxKey keyUJEEServletIdx = schema.getFactorySecForm().newUJEEServletIdxKey();
		keyUJEEServletIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyUJEEServletIdx.setRequiredSecAppId( Buff.getRequiredSecAppId() );
		keyUJEEServletIdx.setRequiredJEEServletMapName( Buff.getRequiredJEEServletMapName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUJEEServletIdx.containsKey( keyUJEEServletIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"SecFormUJEEServletIdx",
				keyUJEEServletIdx );
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
						"SecFormCluster",
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
				if( null == schema.getTableSecApp().readDerivedByIdIdx( Authorization,
						Buff.getRequiredClusterId(),
						Buff.getRequiredSecAppId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"SecFormApplication",
						"SecApp",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFSecSecFormPKey, YCFSecSecFormBuff > subdictClusterIdx;
		if( dictByClusterIdx.containsKey( keyClusterIdx ) ) {
			subdictClusterIdx = dictByClusterIdx.get( keyClusterIdx );
		}
		else {
			subdictClusterIdx = new HashMap< YCFSecSecFormPKey, YCFSecSecFormBuff >();
			dictByClusterIdx.put( keyClusterIdx, subdictClusterIdx );
		}
		subdictClusterIdx.put( pkey, Buff );

		Map< YCFSecSecFormPKey, YCFSecSecFormBuff > subdictSecAppIdx;
		if( dictBySecAppIdx.containsKey( keySecAppIdx ) ) {
			subdictSecAppIdx = dictBySecAppIdx.get( keySecAppIdx );
		}
		else {
			subdictSecAppIdx = new HashMap< YCFSecSecFormPKey, YCFSecSecFormBuff >();
			dictBySecAppIdx.put( keySecAppIdx, subdictSecAppIdx );
		}
		subdictSecAppIdx.put( pkey, Buff );

		dictByUJEEServletIdx.put( keyUJEEServletIdx, Buff );

	}

	public YCFSecSecFormBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecSecFormPKey PKey )
	{
		final String S_ProcName = "YCFBamRamSecForm.readDerived";
		YCFSecSecFormPKey key = schema.getFactorySecForm().newPKey();
		key.setRequiredClusterId( PKey.getRequiredClusterId() );
		key.setRequiredSecFormId( PKey.getRequiredSecFormId() );
		YCFSecSecFormBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecFormBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecSecFormPKey PKey )
	{
		final String S_ProcName = "YCFBamRamSecForm.readDerived";
		YCFSecSecFormPKey key = schema.getFactorySecForm().newPKey();
		key.setRequiredClusterId( PKey.getRequiredClusterId() );
		key.setRequiredSecFormId( PKey.getRequiredSecFormId() );
		YCFSecSecFormBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecFormBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamSecForm.readAllDerived";
		YCFSecSecFormBuff[] retList = new YCFSecSecFormBuff[ dictByPKey.values().size() ];
		Iterator< YCFSecSecFormBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFSecSecFormBuff[] readDerivedByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFBamRamSecForm.readDerivedByClusterIdx";
		YCFSecSecFormByClusterIdxKey key = schema.getFactorySecForm().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );

		YCFSecSecFormBuff[] recArray;
		if( dictByClusterIdx.containsKey( key ) ) {
			Map< YCFSecSecFormPKey, YCFSecSecFormBuff > subdictClusterIdx
				= dictByClusterIdx.get( key );
			recArray = new YCFSecSecFormBuff[ subdictClusterIdx.size() ];
			Iterator< YCFSecSecFormBuff > iter = subdictClusterIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecSecFormPKey, YCFSecSecFormBuff > subdictClusterIdx
				= new HashMap< YCFSecSecFormPKey, YCFSecSecFormBuff >();
			dictByClusterIdx.put( key, subdictClusterIdx );
			recArray = new YCFSecSecFormBuff[0];
		}
		return( recArray );
	}

	public YCFSecSecFormBuff[] readDerivedBySecAppIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecAppId )
	{
		final String S_ProcName = "YCFBamRamSecForm.readDerivedBySecAppIdx";
		YCFSecSecFormBySecAppIdxKey key = schema.getFactorySecForm().newSecAppIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );

		YCFSecSecFormBuff[] recArray;
		if( dictBySecAppIdx.containsKey( key ) ) {
			Map< YCFSecSecFormPKey, YCFSecSecFormBuff > subdictSecAppIdx
				= dictBySecAppIdx.get( key );
			recArray = new YCFSecSecFormBuff[ subdictSecAppIdx.size() ];
			Iterator< YCFSecSecFormBuff > iter = subdictSecAppIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecSecFormPKey, YCFSecSecFormBuff > subdictSecAppIdx
				= new HashMap< YCFSecSecFormPKey, YCFSecSecFormBuff >();
			dictBySecAppIdx.put( key, subdictSecAppIdx );
			recArray = new YCFSecSecFormBuff[0];
		}
		return( recArray );
	}

	public YCFSecSecFormBuff readDerivedByUJEEServletIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecAppId,
		String JEEServletMapName )
	{
		final String S_ProcName = "YCFBamRamSecForm.readDerivedByUJEEServletIdx";
		YCFSecSecFormByUJEEServletIdxKey key = schema.getFactorySecForm().newUJEEServletIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );
		key.setRequiredJEEServletMapName( JEEServletMapName );

		YCFSecSecFormBuff buff;
		if( dictByUJEEServletIdx.containsKey( key ) ) {
			buff = dictByUJEEServletIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecFormBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecFormId )
	{
		final String S_ProcName = "YCFBamRamSecForm.readDerivedByIdIdx() ";
		YCFSecSecFormPKey key = schema.getFactorySecForm().newPKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecFormId( SecFormId );

		YCFSecSecFormBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecFormBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecSecFormPKey PKey )
	{
		final String S_ProcName = "YCFBamRamSecForm.readBuff";
		YCFSecSecFormBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a00b" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecFormBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecSecFormPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFSecSecFormBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a00b" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecFormBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamSecForm.readAllBuff";
		YCFSecSecFormBuff buff;
		ArrayList<YCFSecSecFormBuff> filteredList = new ArrayList<YCFSecSecFormBuff>();
		YCFSecSecFormBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a00b" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFSecSecFormBuff[0] ) );
	}

	/**
	 *	Read a page of all the specific SecForm buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecForm instances in the database accessible for the Authorization.
	 */
	public YCFSecSecFormBuff[] pageAllBuff( YCFSecAuthorization Authorization,
		Long priorClusterId,
		Integer priorSecFormId )
	{
		final String S_ProcName = "pageAllBuff";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public YCFSecSecFormBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecFormId )
	{
		final String S_ProcName = "YCFBamRamSecForm.readBuffByIdIdx() ";
		YCFSecSecFormBuff buff = readDerivedByIdIdx( Authorization,
			ClusterId,
			SecFormId );
		if( ( buff != null ) && buff.getClassCode().equals( "a00b" ) ) {
			return( (YCFSecSecFormBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecSecFormBuff[] readBuffByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFBamRamSecForm.readBuffByClusterIdx() ";
		YCFSecSecFormBuff buff;
		ArrayList<YCFSecSecFormBuff> filteredList = new ArrayList<YCFSecSecFormBuff>();
		YCFSecSecFormBuff[] buffList = readDerivedByClusterIdx( Authorization,
			ClusterId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a00b" ) ) {
				filteredList.add( (YCFSecSecFormBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecSecFormBuff[0] ) );
	}

	public YCFSecSecFormBuff[] readBuffBySecAppIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecAppId )
	{
		final String S_ProcName = "YCFBamRamSecForm.readBuffBySecAppIdx() ";
		YCFSecSecFormBuff buff;
		ArrayList<YCFSecSecFormBuff> filteredList = new ArrayList<YCFSecSecFormBuff>();
		YCFSecSecFormBuff[] buffList = readDerivedBySecAppIdx( Authorization,
			ClusterId,
			SecAppId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a00b" ) ) {
				filteredList.add( (YCFSecSecFormBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecSecFormBuff[0] ) );
	}

	public YCFSecSecFormBuff readBuffByUJEEServletIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecAppId,
		String JEEServletMapName )
	{
		final String S_ProcName = "YCFBamRamSecForm.readBuffByUJEEServletIdx() ";
		YCFSecSecFormBuff buff = readDerivedByUJEEServletIdx( Authorization,
			ClusterId,
			SecAppId,
			JEEServletMapName );
		if( ( buff != null ) && buff.getClassCode().equals( "a00b" ) ) {
			return( (YCFSecSecFormBuff)buff );
		}
		else {
			return( null );
		}
	}

	/**
	 *	Read a page array of the specific SecForm buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFSecSecFormBuff[] pageBuffByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		Long priorClusterId,
		Integer priorSecFormId )
	{
		final String S_ProcName = "pageBuffByClusterIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific SecForm buffer instances identified by the duplicate key SecAppIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFSecSecFormBuff[] pageBuffBySecAppIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecAppId,
		Long priorClusterId,
		Integer priorSecFormId )
	{
		final String S_ProcName = "pageBuffBySecAppIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateSecForm( YCFSecAuthorization Authorization,
		YCFSecSecFormBuff Buff )
	{
		YCFSecSecFormPKey pkey = schema.getFactorySecForm().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecFormId( Buff.getRequiredSecFormId() );
		YCFSecSecFormBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateSecForm",
				"Existing record not found",
				"SecForm",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateSecForm",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFSecSecFormByClusterIdxKey existingKeyClusterIdx = schema.getFactorySecForm().newClusterIdxKey();
		existingKeyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFSecSecFormByClusterIdxKey newKeyClusterIdx = schema.getFactorySecForm().newClusterIdxKey();
		newKeyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFSecSecFormBySecAppIdxKey existingKeySecAppIdx = schema.getFactorySecForm().newSecAppIdxKey();
		existingKeySecAppIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeySecAppIdx.setRequiredSecAppId( existing.getRequiredSecAppId() );

		YCFSecSecFormBySecAppIdxKey newKeySecAppIdx = schema.getFactorySecForm().newSecAppIdxKey();
		newKeySecAppIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeySecAppIdx.setRequiredSecAppId( Buff.getRequiredSecAppId() );

		YCFSecSecFormByUJEEServletIdxKey existingKeyUJEEServletIdx = schema.getFactorySecForm().newUJEEServletIdxKey();
		existingKeyUJEEServletIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyUJEEServletIdx.setRequiredSecAppId( existing.getRequiredSecAppId() );
		existingKeyUJEEServletIdx.setRequiredJEEServletMapName( existing.getRequiredJEEServletMapName() );

		YCFSecSecFormByUJEEServletIdxKey newKeyUJEEServletIdx = schema.getFactorySecForm().newUJEEServletIdxKey();
		newKeyUJEEServletIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyUJEEServletIdx.setRequiredSecAppId( Buff.getRequiredSecAppId() );
		newKeyUJEEServletIdx.setRequiredJEEServletMapName( Buff.getRequiredJEEServletMapName() );

		// Check unique indexes

		if( ! existingKeyUJEEServletIdx.equals( newKeyUJEEServletIdx ) ) {
			if( dictByUJEEServletIdx.containsKey( newKeyUJEEServletIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateSecForm",
					"SecFormUJEEServletIdx",
					newKeyUJEEServletIdx );
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
						"updateSecForm",
						"Owner",
						"SecFormCluster",
						"Cluster",
						null );
				}
			}
		}

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableSecApp().readDerivedByIdIdx( Authorization,
						Buff.getRequiredClusterId(),
						Buff.getRequiredSecAppId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateSecForm",
						"Container",
						"SecFormApplication",
						"SecApp",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFSecSecFormPKey, YCFSecSecFormBuff > subdict;

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
			subdict = new HashMap< YCFSecSecFormPKey, YCFSecSecFormBuff >();
			dictByClusterIdx.put( newKeyClusterIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictBySecAppIdx.get( existingKeySecAppIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictBySecAppIdx.containsKey( newKeySecAppIdx ) ) {
			subdict = dictBySecAppIdx.get( newKeySecAppIdx );
		}
		else {
			subdict = new HashMap< YCFSecSecFormPKey, YCFSecSecFormBuff >();
			dictBySecAppIdx.put( newKeySecAppIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUJEEServletIdx.remove( existingKeyUJEEServletIdx );
		dictByUJEEServletIdx.put( newKeyUJEEServletIdx, Buff );

	}

	public void deleteSecForm( YCFSecAuthorization Authorization,
		YCFSecSecFormBuff Buff )
	{
		final String S_ProcName = "YCFBamRamSecFormTable.deleteSecForm() ";
		String classCode;
		YCFSecSecFormPKey pkey = schema.getFactorySecForm().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecFormId( Buff.getRequiredSecFormId() );
		YCFSecSecFormBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteSecForm",
				pkey );
		}
		YCFSecSecFormByClusterIdxKey keyClusterIdx = schema.getFactorySecForm().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFSecSecFormBySecAppIdxKey keySecAppIdx = schema.getFactorySecForm().newSecAppIdxKey();
		keySecAppIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keySecAppIdx.setRequiredSecAppId( existing.getRequiredSecAppId() );

		YCFSecSecFormByUJEEServletIdxKey keyUJEEServletIdx = schema.getFactorySecForm().newUJEEServletIdxKey();
		keyUJEEServletIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUJEEServletIdx.setRequiredSecAppId( existing.getRequiredSecAppId() );
		keyUJEEServletIdx.setRequiredJEEServletMapName( existing.getRequiredJEEServletMapName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFSecSecFormPKey, YCFSecSecFormBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByClusterIdx.get( keyClusterIdx );
		subdict.remove( pkey );

		subdict = dictBySecAppIdx.get( keySecAppIdx );
		subdict.remove( pkey );

		dictByUJEEServletIdx.remove( keyUJEEServletIdx );

	}
	public void deleteSecFormByIdIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		int argSecFormId )
	{
		YCFSecSecFormPKey key = schema.getFactorySecForm().newPKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredSecFormId( argSecFormId );
		deleteSecFormByIdIdx( Authorization, key );
	}

	public void deleteSecFormByIdIdx( YCFSecAuthorization Authorization,
		YCFSecSecFormPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFSecSecFormBuff cur;
		LinkedList<YCFSecSecFormBuff> matchSet = new LinkedList<YCFSecSecFormBuff>();
		Iterator<YCFSecSecFormBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecFormBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecForm().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecFormId() );
			deleteSecForm( Authorization, cur );
		}
	}

	public void deleteSecFormByClusterIdx( YCFSecAuthorization Authorization,
		long argClusterId )
	{
		YCFSecSecFormByClusterIdxKey key = schema.getFactorySecForm().newClusterIdxKey();
		key.setRequiredClusterId( argClusterId );
		deleteSecFormByClusterIdx( Authorization, key );
	}

	public void deleteSecFormByClusterIdx( YCFSecAuthorization Authorization,
		YCFSecSecFormByClusterIdxKey argKey )
	{
		YCFSecSecFormBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecSecFormBuff> matchSet = new LinkedList<YCFSecSecFormBuff>();
		Iterator<YCFSecSecFormBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecFormBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecForm().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecFormId() );
			deleteSecForm( Authorization, cur );
		}
	}

	public void deleteSecFormBySecAppIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		int argSecAppId )
	{
		YCFSecSecFormBySecAppIdxKey key = schema.getFactorySecForm().newSecAppIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredSecAppId( argSecAppId );
		deleteSecFormBySecAppIdx( Authorization, key );
	}

	public void deleteSecFormBySecAppIdx( YCFSecAuthorization Authorization,
		YCFSecSecFormBySecAppIdxKey argKey )
	{
		YCFSecSecFormBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecSecFormBuff> matchSet = new LinkedList<YCFSecSecFormBuff>();
		Iterator<YCFSecSecFormBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecFormBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecForm().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecFormId() );
			deleteSecForm( Authorization, cur );
		}
	}

	public void deleteSecFormByUJEEServletIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		int argSecAppId,
		String argJEEServletMapName )
	{
		YCFSecSecFormByUJEEServletIdxKey key = schema.getFactorySecForm().newUJEEServletIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredSecAppId( argSecAppId );
		key.setRequiredJEEServletMapName( argJEEServletMapName );
		deleteSecFormByUJEEServletIdx( Authorization, key );
	}

	public void deleteSecFormByUJEEServletIdx( YCFSecAuthorization Authorization,
		YCFSecSecFormByUJEEServletIdxKey argKey )
	{
		YCFSecSecFormBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecSecFormBuff> matchSet = new LinkedList<YCFSecSecFormBuff>();
		Iterator<YCFSecSecFormBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecFormBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecForm().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecFormId() );
			deleteSecForm( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
