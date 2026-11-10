
// Description: Java 11 in-memory RAM DbIO implementation for Tweak.

/*
 *	org.mssycf.mssycf.YCFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFBam 2.13 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFBam.
 *	
 *	Mark's Code Fractal YCFBam is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	As a special exception, Mark Sobkow gives you permission to link this library
 *	with independent modules to produce an executable, provided that none of them
 *	conflict with the intent of the GPLv3; that is, you are not allowed to invoke
 *	the methods of this library from non-GPLv3-compatibly licensed code. You may not
 *	implement an LPGLv3 "wedge" to try to bypass this restriction. That said, code which
 *	does not rely on this library is free to specify whatever license its authors decide
 *	to use. Mark Sobkow specifically rejects the infectious nature of the GPLv3, and
 *	considers the mere act of including GPLv3 modules in an executable to be perfectly
 *	reasonable given tools like modern Java's single-jar deployment options.
 *	
 *	Mark's Code Fractal YCFBam is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Mark's Code Fractal YCFBam is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Mark's Code Fractal YCFBam.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
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
 *	YCFBamRamTweakTable in-memory RAM DbIO implementation
 *	for Tweak.
 */
public class YCFBamRamTweakTable
	implements IYCFBamTweakTable
{
	private IYCFBamSchema schema;
	private Map< YCFBamTweakPKey,
				YCFBamTweakBuff > dictByPKey
		= new HashMap< YCFBamTweakPKey,
				YCFBamTweakBuff >();
	private Map< YCFBamTweakByUNameIdxKey,
			YCFBamTweakBuff > dictByUNameIdx
		= new HashMap< YCFBamTweakByUNameIdxKey,
			YCFBamTweakBuff >();
	private Map< YCFBamTweakByUDefIdxKey,
			YCFBamTweakBuff > dictByUDefIdx
		= new HashMap< YCFBamTweakByUDefIdxKey,
			YCFBamTweakBuff >();
	private Map< YCFBamTweakByValTentIdxKey,
				Map< YCFBamTweakPKey,
					YCFBamTweakBuff >> dictByValTentIdx
		= new HashMap< YCFBamTweakByValTentIdxKey,
				Map< YCFBamTweakPKey,
					YCFBamTweakBuff >>();
	private Map< YCFBamTweakByScopeIdxKey,
				Map< YCFBamTweakPKey,
					YCFBamTweakBuff >> dictByScopeIdx
		= new HashMap< YCFBamTweakByScopeIdxKey,
				Map< YCFBamTweakPKey,
					YCFBamTweakBuff >>();
	private Map< YCFBamTweakByDefSchemaIdxKey,
				Map< YCFBamTweakPKey,
					YCFBamTweakBuff >> dictByDefSchemaIdx
		= new HashMap< YCFBamTweakByDefSchemaIdxKey,
				Map< YCFBamTweakPKey,
					YCFBamTweakBuff >>();

	public YCFBamRamTweakTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createTweak( YCFSecAuthorization Authorization,
		YCFBamTweakBuff Buff )
	{
		final String S_ProcName = "createTweak";
		YCFBamTweakPKey pkey = schema.getFactoryTweak().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( ((YCFBamRamTenantTable)schema.getTableTenant()).nextTweakIdGen( Authorization,
			Buff.getRequiredTenantId() ) );
		Buff.setRequiredTenantId( pkey.getRequiredTenantId() );
		Buff.setRequiredId( pkey.getRequiredId() );
		YCFBamTweakByUNameIdxKey keyUNameIdx = schema.getFactoryTweak().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyUNameIdx.setRequiredScopeId( Buff.getRequiredScopeId() );
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamTweakByUDefIdxKey keyUDefIdx = schema.getFactoryTweak().newUDefIdxKey();
		keyUDefIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyUDefIdx.setRequiredScopeId( Buff.getRequiredScopeId() );
		keyUDefIdx.setOptionalDefSchemaTenantId( Buff.getOptionalDefSchemaTenantId() );
		keyUDefIdx.setOptionalDefSchemaId( Buff.getOptionalDefSchemaId() );
		keyUDefIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamTweakByValTentIdxKey keyValTentIdx = schema.getFactoryTweak().newValTentIdxKey();
		keyValTentIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFBamTweakByScopeIdxKey keyScopeIdx = schema.getFactoryTweak().newScopeIdxKey();
		keyScopeIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyScopeIdx.setRequiredScopeId( Buff.getRequiredScopeId() );

		YCFBamTweakByDefSchemaIdxKey keyDefSchemaIdx = schema.getFactoryTweak().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( Buff.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( Buff.getOptionalDefSchemaId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"TweakUNameIdx",
				keyUNameIdx );
		}

		if( dictByUDefIdx.containsKey( keyUDefIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"TweakUDefIdx",
				keyUDefIdx );
		}

		// Validate foreign keys

		{
			boolean allNull = true;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableTenant().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Owner",
						"Tenant",
						"Tenant",
						null );
				}
			}
		}

		{
			boolean allNull = true;
			allNull = false;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableScope().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredScopeId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"Scope",
						"Scope",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

		dictByUDefIdx.put( keyUDefIdx, Buff );

		Map< YCFBamTweakPKey, YCFBamTweakBuff > subdictValTentIdx;
		if( dictByValTentIdx.containsKey( keyValTentIdx ) ) {
			subdictValTentIdx = dictByValTentIdx.get( keyValTentIdx );
		}
		else {
			subdictValTentIdx = new HashMap< YCFBamTweakPKey, YCFBamTweakBuff >();
			dictByValTentIdx.put( keyValTentIdx, subdictValTentIdx );
		}
		subdictValTentIdx.put( pkey, Buff );

		Map< YCFBamTweakPKey, YCFBamTweakBuff > subdictScopeIdx;
		if( dictByScopeIdx.containsKey( keyScopeIdx ) ) {
			subdictScopeIdx = dictByScopeIdx.get( keyScopeIdx );
		}
		else {
			subdictScopeIdx = new HashMap< YCFBamTweakPKey, YCFBamTweakBuff >();
			dictByScopeIdx.put( keyScopeIdx, subdictScopeIdx );
		}
		subdictScopeIdx.put( pkey, Buff );

		Map< YCFBamTweakPKey, YCFBamTweakBuff > subdictDefSchemaIdx;
		if( dictByDefSchemaIdx.containsKey( keyDefSchemaIdx ) ) {
			subdictDefSchemaIdx = dictByDefSchemaIdx.get( keyDefSchemaIdx );
		}
		else {
			subdictDefSchemaIdx = new HashMap< YCFBamTweakPKey, YCFBamTweakBuff >();
			dictByDefSchemaIdx.put( keyDefSchemaIdx, subdictDefSchemaIdx );
		}
		subdictDefSchemaIdx.put( pkey, Buff );

	}

	public YCFBamTweakBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamTweakPKey PKey )
	{
		final String S_ProcName = "YCFBamRamTweak.readDerived";
		YCFBamTweakPKey key = schema.getFactoryTweak().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamTweakBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamTweakBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamTweakPKey PKey )
	{
		final String S_ProcName = "YCFBamRamTweak.readDerived";
		YCFBamTweakPKey key = schema.getFactoryTweak().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamTweakBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamTweakBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamTweak.readAllDerived";
		YCFBamTweakBuff[] retList = new YCFBamTweakBuff[ dictByPKey.values().size() ];
		Iterator< YCFBamTweakBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamTweakBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamTweak.readDerivedByUNameIdx";
		YCFBamTweakByUNameIdxKey key = schema.getFactoryTweak().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );

		YCFBamTweakBuff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamTweakBuff readDerivedByUDefIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamTweak.readDerivedByUDefIdx";
		YCFBamTweakByUDefIdxKey key = schema.getFactoryTweak().newUDefIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		key.setRequiredName( Name );

		YCFBamTweakBuff buff;
		if( dictByUDefIdx.containsKey( key ) ) {
			buff = dictByUDefIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamTweakBuff[] readDerivedByValTentIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamTweak.readDerivedByValTentIdx";
		YCFBamTweakByValTentIdxKey key = schema.getFactoryTweak().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );

		YCFBamTweakBuff[] recArray;
		if( dictByValTentIdx.containsKey( key ) ) {
			Map< YCFBamTweakPKey, YCFBamTweakBuff > subdictValTentIdx
				= dictByValTentIdx.get( key );
			recArray = new YCFBamTweakBuff[ subdictValTentIdx.size() ];
			Iterator< YCFBamTweakBuff > iter = subdictValTentIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamTweakPKey, YCFBamTweakBuff > subdictValTentIdx
				= new HashMap< YCFBamTweakPKey, YCFBamTweakBuff >();
			dictByValTentIdx.put( key, subdictValTentIdx );
			recArray = new YCFBamTweakBuff[0];
		}
		return( recArray );
	}

	public YCFBamTweakBuff[] readDerivedByScopeIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "YCFBamRamTweak.readDerivedByScopeIdx";
		YCFBamTweakByScopeIdxKey key = schema.getFactoryTweak().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );

		YCFBamTweakBuff[] recArray;
		if( dictByScopeIdx.containsKey( key ) ) {
			Map< YCFBamTweakPKey, YCFBamTweakBuff > subdictScopeIdx
				= dictByScopeIdx.get( key );
			recArray = new YCFBamTweakBuff[ subdictScopeIdx.size() ];
			Iterator< YCFBamTweakBuff > iter = subdictScopeIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamTweakPKey, YCFBamTweakBuff > subdictScopeIdx
				= new HashMap< YCFBamTweakPKey, YCFBamTweakBuff >();
			dictByScopeIdx.put( key, subdictScopeIdx );
			recArray = new YCFBamTweakBuff[0];
		}
		return( recArray );
	}

	public YCFBamTweakBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamTweak.readDerivedByDefSchemaIdx";
		YCFBamTweakByDefSchemaIdxKey key = schema.getFactoryTweak().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );

		YCFBamTweakBuff[] recArray;
		if( dictByDefSchemaIdx.containsKey( key ) ) {
			Map< YCFBamTweakPKey, YCFBamTweakBuff > subdictDefSchemaIdx
				= dictByDefSchemaIdx.get( key );
			recArray = new YCFBamTweakBuff[ subdictDefSchemaIdx.size() ];
			Iterator< YCFBamTweakBuff > iter = subdictDefSchemaIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamTweakPKey, YCFBamTweakBuff > subdictDefSchemaIdx
				= new HashMap< YCFBamTweakPKey, YCFBamTweakBuff >();
			dictByDefSchemaIdx.put( key, subdictDefSchemaIdx );
			recArray = new YCFBamTweakBuff[0];
		}
		return( recArray );
	}

	public YCFBamTweakBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamTweak.readDerivedByIdIdx() ";
		YCFBamTweakPKey key = schema.getFactoryTweak().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamTweakBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamTweakBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamTweakPKey PKey )
	{
		final String S_ProcName = "YCFBamRamTweak.readBuff";
		YCFBamTweakBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a808" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamTweakBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamTweakPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamTweakBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a808" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamTweakBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamTweak.readAllBuff";
		YCFBamTweakBuff buff;
		ArrayList<YCFBamTweakBuff> filteredList = new ArrayList<YCFBamTweakBuff>();
		YCFBamTweakBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a808" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamTweakBuff[0] ) );
	}

	public YCFBamTweakBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamTweak.readBuffByIdIdx() ";
		YCFBamTweakBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a808" ) ) {
			return( (YCFBamTweakBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamTweakBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamTweak.readBuffByUNameIdx() ";
		YCFBamTweakBuff buff = readDerivedByUNameIdx( Authorization,
			TenantId,
			ScopeId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a808" ) ) {
			return( (YCFBamTweakBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamTweakBuff readBuffByUDefIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamTweak.readBuffByUDefIdx() ";
		YCFBamTweakBuff buff = readDerivedByUDefIdx( Authorization,
			TenantId,
			ScopeId,
			DefSchemaTenantId,
			DefSchemaId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a808" ) ) {
			return( (YCFBamTweakBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamTweakBuff[] readBuffByValTentIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamTweak.readBuffByValTentIdx() ";
		YCFBamTweakBuff buff;
		ArrayList<YCFBamTweakBuff> filteredList = new ArrayList<YCFBamTweakBuff>();
		YCFBamTweakBuff[] buffList = readDerivedByValTentIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a808" ) ) {
				filteredList.add( (YCFBamTweakBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamTweakBuff[0] ) );
	}

	public YCFBamTweakBuff[] readBuffByScopeIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "YCFBamRamTweak.readBuffByScopeIdx() ";
		YCFBamTweakBuff buff;
		ArrayList<YCFBamTweakBuff> filteredList = new ArrayList<YCFBamTweakBuff>();
		YCFBamTweakBuff[] buffList = readDerivedByScopeIdx( Authorization,
			TenantId,
			ScopeId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a808" ) ) {
				filteredList.add( (YCFBamTweakBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamTweakBuff[0] ) );
	}

	public YCFBamTweakBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamTweak.readBuffByDefSchemaIdx() ";
		YCFBamTweakBuff buff;
		ArrayList<YCFBamTweakBuff> filteredList = new ArrayList<YCFBamTweakBuff>();
		YCFBamTweakBuff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a808" ) ) {
				filteredList.add( (YCFBamTweakBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamTweakBuff[0] ) );
	}

	public void updateTweak( YCFSecAuthorization Authorization,
		YCFBamTweakBuff Buff )
	{
		YCFBamTweakPKey pkey = schema.getFactoryTweak().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamTweakBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateTweak",
				"Existing record not found",
				"Tweak",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateTweak",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFBamTweakByUNameIdxKey existingKeyUNameIdx = schema.getFactoryTweak().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyUNameIdx.setRequiredScopeId( existing.getRequiredScopeId() );
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamTweakByUNameIdxKey newKeyUNameIdx = schema.getFactoryTweak().newUNameIdxKey();
		newKeyUNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyUNameIdx.setRequiredScopeId( Buff.getRequiredScopeId() );
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamTweakByUDefIdxKey existingKeyUDefIdx = schema.getFactoryTweak().newUDefIdxKey();
		existingKeyUDefIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyUDefIdx.setRequiredScopeId( existing.getRequiredScopeId() );
		existingKeyUDefIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		existingKeyUDefIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );
		existingKeyUDefIdx.setRequiredName( existing.getRequiredName() );

		YCFBamTweakByUDefIdxKey newKeyUDefIdx = schema.getFactoryTweak().newUDefIdxKey();
		newKeyUDefIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyUDefIdx.setRequiredScopeId( Buff.getRequiredScopeId() );
		newKeyUDefIdx.setOptionalDefSchemaTenantId( Buff.getOptionalDefSchemaTenantId() );
		newKeyUDefIdx.setOptionalDefSchemaId( Buff.getOptionalDefSchemaId() );
		newKeyUDefIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamTweakByValTentIdxKey existingKeyValTentIdx = schema.getFactoryTweak().newValTentIdxKey();
		existingKeyValTentIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFBamTweakByValTentIdxKey newKeyValTentIdx = schema.getFactoryTweak().newValTentIdxKey();
		newKeyValTentIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFBamTweakByScopeIdxKey existingKeyScopeIdx = schema.getFactoryTweak().newScopeIdxKey();
		existingKeyScopeIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyScopeIdx.setRequiredScopeId( existing.getRequiredScopeId() );

		YCFBamTweakByScopeIdxKey newKeyScopeIdx = schema.getFactoryTweak().newScopeIdxKey();
		newKeyScopeIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyScopeIdx.setRequiredScopeId( Buff.getRequiredScopeId() );

		YCFBamTweakByDefSchemaIdxKey existingKeyDefSchemaIdx = schema.getFactoryTweak().newDefSchemaIdxKey();
		existingKeyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		existingKeyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		YCFBamTweakByDefSchemaIdxKey newKeyDefSchemaIdx = schema.getFactoryTweak().newDefSchemaIdxKey();
		newKeyDefSchemaIdx.setOptionalDefSchemaTenantId( Buff.getOptionalDefSchemaTenantId() );
		newKeyDefSchemaIdx.setOptionalDefSchemaId( Buff.getOptionalDefSchemaId() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateTweak",
					"TweakUNameIdx",
					newKeyUNameIdx );
			}
		}

		if( ! existingKeyUDefIdx.equals( newKeyUDefIdx ) ) {
			if( dictByUDefIdx.containsKey( newKeyUDefIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateTweak",
					"TweakUDefIdx",
					newKeyUDefIdx );
			}
		}

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableTenant().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateTweak",
						"Owner",
						"Tenant",
						"Tenant",
						null );
				}
			}
		}

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableScope().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredScopeId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateTweak",
						"Container",
						"Scope",
						"Scope",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamTweakPKey, YCFBamTweakBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

		dictByUDefIdx.remove( existingKeyUDefIdx );
		dictByUDefIdx.put( newKeyUDefIdx, Buff );

		subdict = dictByValTentIdx.get( existingKeyValTentIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByValTentIdx.containsKey( newKeyValTentIdx ) ) {
			subdict = dictByValTentIdx.get( newKeyValTentIdx );
		}
		else {
			subdict = new HashMap< YCFBamTweakPKey, YCFBamTweakBuff >();
			dictByValTentIdx.put( newKeyValTentIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByScopeIdx.get( existingKeyScopeIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByScopeIdx.containsKey( newKeyScopeIdx ) ) {
			subdict = dictByScopeIdx.get( newKeyScopeIdx );
		}
		else {
			subdict = new HashMap< YCFBamTweakPKey, YCFBamTweakBuff >();
			dictByScopeIdx.put( newKeyScopeIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByDefSchemaIdx.get( existingKeyDefSchemaIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByDefSchemaIdx.containsKey( newKeyDefSchemaIdx ) ) {
			subdict = dictByDefSchemaIdx.get( newKeyDefSchemaIdx );
		}
		else {
			subdict = new HashMap< YCFBamTweakPKey, YCFBamTweakBuff >();
			dictByDefSchemaIdx.put( newKeyDefSchemaIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteTweak( YCFSecAuthorization Authorization,
		YCFBamTweakBuff Buff )
	{
		final String S_ProcName = "YCFBamRamTweakTable.deleteTweak() ";
		String classCode;
		YCFBamTweakPKey pkey = schema.getFactoryTweak().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamTweakBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteTweak",
				pkey );
		}
		YCFBamTweakByUNameIdxKey keyUNameIdx = schema.getFactoryTweak().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredScopeId( existing.getRequiredScopeId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamTweakByUDefIdxKey keyUDefIdx = schema.getFactoryTweak().newUDefIdxKey();
		keyUDefIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUDefIdx.setRequiredScopeId( existing.getRequiredScopeId() );
		keyUDefIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyUDefIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );
		keyUDefIdx.setRequiredName( existing.getRequiredName() );

		YCFBamTweakByValTentIdxKey keyValTentIdx = schema.getFactoryTweak().newValTentIdxKey();
		keyValTentIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFBamTweakByScopeIdxKey keyScopeIdx = schema.getFactoryTweak().newScopeIdxKey();
		keyScopeIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyScopeIdx.setRequiredScopeId( existing.getRequiredScopeId() );

		YCFBamTweakByDefSchemaIdxKey keyDefSchemaIdx = schema.getFactoryTweak().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		// Validate reverse foreign keys

		if( schema.getTableTableTweak().readDerivedByIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteTweak",
				"Superclass",
				"SuperClass",
				"TableTweak",
				pkey );
		}

		if( schema.getTableSchemaTweak().readDerivedByIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteTweak",
				"Superclass",
				"SuperClass",
				"SchemaTweak",
				pkey );
		}

		if( schema.getTableIndexTweak().readDerivedByIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteTweak",
				"Superclass",
				"SuperClass",
				"IndexTweak",
				pkey );
		}

		// Delete is valid
		Map< YCFBamTweakPKey, YCFBamTweakBuff > subdict;

		dictByPKey.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

		dictByUDefIdx.remove( keyUDefIdx );

		subdict = dictByValTentIdx.get( keyValTentIdx );
		subdict.remove( pkey );

		subdict = dictByScopeIdx.get( keyScopeIdx );
		subdict.remove( pkey );

		subdict = dictByDefSchemaIdx.get( keyDefSchemaIdx );
		subdict.remove( pkey );

	}
	public void deleteTweakByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamTweakPKey key = schema.getFactoryTweak().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteTweakByIdIdx( Authorization, key );
	}

	public void deleteTweakByIdIdx( YCFSecAuthorization Authorization,
		YCFBamTweakPKey argKey )
	{
		final String S_ProcName = "deleteTweakByIdIdx";
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamTweakBuff cur;
		LinkedList<YCFBamTweakBuff> matchSet = new LinkedList<YCFBamTweakBuff>();
		Iterator<YCFBamTweakBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamTweakBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTweak().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a808".equals( subClassCode ) ) {
				schema.getTableTweak().deleteTweak( Authorization, cur );
			}
			else if( "a809".equals( subClassCode ) ) {
				schema.getTableTableTweak().deleteTableTweak( Authorization, (YCFBamTableTweakBuff)cur );
			}
			else if( "a80a".equals( subClassCode ) ) {
				schema.getTableSchemaTweak().deleteSchemaTweak( Authorization, (YCFBamSchemaTweakBuff)cur );
			}
			else if( "a80b".equals( subClassCode ) ) {
				schema.getTableIndexTweak().deleteIndexTweak( Authorization, (YCFBamIndexTweakBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of Tweak must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteTweakByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		String argName )
	{
		YCFBamTweakByUNameIdxKey key = schema.getFactoryTweak().newUNameIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredScopeId( argScopeId );
		key.setRequiredName( argName );
		deleteTweakByUNameIdx( Authorization, key );
	}

	public void deleteTweakByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamTweakByUNameIdxKey argKey )
	{
		final String S_ProcName = "deleteTweakByUNameIdx";
		YCFBamTweakBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamTweakBuff> matchSet = new LinkedList<YCFBamTweakBuff>();
		Iterator<YCFBamTweakBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamTweakBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTweak().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a808".equals( subClassCode ) ) {
				schema.getTableTweak().deleteTweak( Authorization, cur );
			}
			else if( "a809".equals( subClassCode ) ) {
				schema.getTableTableTweak().deleteTableTweak( Authorization, (YCFBamTableTweakBuff)cur );
			}
			else if( "a80a".equals( subClassCode ) ) {
				schema.getTableSchemaTweak().deleteSchemaTweak( Authorization, (YCFBamSchemaTweakBuff)cur );
			}
			else if( "a80b".equals( subClassCode ) ) {
				schema.getTableIndexTweak().deleteIndexTweak( Authorization, (YCFBamIndexTweakBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of Tweak must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteTweakByUDefIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		Long argDefSchemaTenantId,
		Long argDefSchemaId,
		String argName )
	{
		YCFBamTweakByUDefIdxKey key = schema.getFactoryTweak().newUDefIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredScopeId( argScopeId );
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		key.setRequiredName( argName );
		deleteTweakByUDefIdx( Authorization, key );
	}

	public void deleteTweakByUDefIdx( YCFSecAuthorization Authorization,
		YCFBamTweakByUDefIdxKey argKey )
	{
		final String S_ProcName = "deleteTweakByUDefIdx";
		YCFBamTweakBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( argKey.getOptionalDefSchemaTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalDefSchemaId() != null ) {
			anyNotNull = true;
		}
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamTweakBuff> matchSet = new LinkedList<YCFBamTweakBuff>();
		Iterator<YCFBamTweakBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamTweakBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTweak().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a808".equals( subClassCode ) ) {
				schema.getTableTweak().deleteTweak( Authorization, cur );
			}
			else if( "a809".equals( subClassCode ) ) {
				schema.getTableTableTweak().deleteTableTweak( Authorization, (YCFBamTableTweakBuff)cur );
			}
			else if( "a80a".equals( subClassCode ) ) {
				schema.getTableSchemaTweak().deleteSchemaTweak( Authorization, (YCFBamSchemaTweakBuff)cur );
			}
			else if( "a80b".equals( subClassCode ) ) {
				schema.getTableIndexTweak().deleteIndexTweak( Authorization, (YCFBamIndexTweakBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of Tweak must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteTweakByValTentIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamTweakByValTentIdxKey key = schema.getFactoryTweak().newValTentIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteTweakByValTentIdx( Authorization, key );
	}

	public void deleteTweakByValTentIdx( YCFSecAuthorization Authorization,
		YCFBamTweakByValTentIdxKey argKey )
	{
		final String S_ProcName = "deleteTweakByValTentIdx";
		YCFBamTweakBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamTweakBuff> matchSet = new LinkedList<YCFBamTweakBuff>();
		Iterator<YCFBamTweakBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamTweakBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTweak().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a808".equals( subClassCode ) ) {
				schema.getTableTweak().deleteTweak( Authorization, cur );
			}
			else if( "a809".equals( subClassCode ) ) {
				schema.getTableTableTweak().deleteTableTweak( Authorization, (YCFBamTableTweakBuff)cur );
			}
			else if( "a80a".equals( subClassCode ) ) {
				schema.getTableSchemaTweak().deleteSchemaTweak( Authorization, (YCFBamSchemaTweakBuff)cur );
			}
			else if( "a80b".equals( subClassCode ) ) {
				schema.getTableIndexTweak().deleteIndexTweak( Authorization, (YCFBamIndexTweakBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of Tweak must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteTweakByScopeIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId )
	{
		YCFBamTweakByScopeIdxKey key = schema.getFactoryTweak().newScopeIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredScopeId( argScopeId );
		deleteTweakByScopeIdx( Authorization, key );
	}

	public void deleteTweakByScopeIdx( YCFSecAuthorization Authorization,
		YCFBamTweakByScopeIdxKey argKey )
	{
		final String S_ProcName = "deleteTweakByScopeIdx";
		YCFBamTweakBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamTweakBuff> matchSet = new LinkedList<YCFBamTweakBuff>();
		Iterator<YCFBamTweakBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamTweakBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTweak().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a808".equals( subClassCode ) ) {
				schema.getTableTweak().deleteTweak( Authorization, cur );
			}
			else if( "a809".equals( subClassCode ) ) {
				schema.getTableTableTweak().deleteTableTweak( Authorization, (YCFBamTableTweakBuff)cur );
			}
			else if( "a80a".equals( subClassCode ) ) {
				schema.getTableSchemaTweak().deleteSchemaTweak( Authorization, (YCFBamSchemaTweakBuff)cur );
			}
			else if( "a80b".equals( subClassCode ) ) {
				schema.getTableIndexTweak().deleteIndexTweak( Authorization, (YCFBamIndexTweakBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of Tweak must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteTweakByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamTweakByDefSchemaIdxKey key = schema.getFactoryTweak().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deleteTweakByDefSchemaIdx( Authorization, key );
	}

	public void deleteTweakByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamTweakByDefSchemaIdxKey argKey )
	{
		final String S_ProcName = "deleteTweakByDefSchemaIdx";
		YCFBamTweakBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalDefSchemaTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalDefSchemaId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamTweakBuff> matchSet = new LinkedList<YCFBamTweakBuff>();
		Iterator<YCFBamTweakBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamTweakBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTweak().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a808".equals( subClassCode ) ) {
				schema.getTableTweak().deleteTweak( Authorization, cur );
			}
			else if( "a809".equals( subClassCode ) ) {
				schema.getTableTableTweak().deleteTableTweak( Authorization, (YCFBamTableTweakBuff)cur );
			}
			else if( "a80a".equals( subClassCode ) ) {
				schema.getTableSchemaTweak().deleteSchemaTweak( Authorization, (YCFBamSchemaTweakBuff)cur );
			}
			else if( "a80b".equals( subClassCode ) ) {
				schema.getTableIndexTweak().deleteIndexTweak( Authorization, (YCFBamIndexTweakBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of Tweak must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void releasePreparedStatements() {
	}
}
