
// Description: Java 11 in-memory RAM DbIO implementation for RoleDef.

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
 *	YCFBamRamRoleDefTable in-memory RAM DbIO implementation
 *	for RoleDef.
 */
public class YCFBamRamRoleDefTable
	implements IYCFBamRoleDefTable
{
	private IYCFBamSchema schema;
	private Map< YCFBamRoleDefPKey,
				YCFBamRoleDefBuff > dictByPKey
		= new HashMap< YCFBamRoleDefPKey,
				YCFBamRoleDefBuff >();
	private Map< YCFBamRoleDefByUNameIdxKey,
			YCFBamRoleDefBuff > dictByUNameIdx
		= new HashMap< YCFBamRoleDefByUNameIdxKey,
			YCFBamRoleDefBuff >();
	private Map< YCFBamRoleDefByUDefIdxKey,
			YCFBamRoleDefBuff > dictByUDefIdx
		= new HashMap< YCFBamRoleDefByUDefIdxKey,
			YCFBamRoleDefBuff >();
	private Map< YCFBamRoleDefByRoleDefTentIdxKey,
				Map< YCFBamRoleDefPKey,
					YCFBamRoleDefBuff >> dictByRoleDefTentIdx
		= new HashMap< YCFBamRoleDefByRoleDefTentIdxKey,
				Map< YCFBamRoleDefPKey,
					YCFBamRoleDefBuff >>();
	private Map< YCFBamRoleDefByScopeIdxKey,
				Map< YCFBamRoleDefPKey,
					YCFBamRoleDefBuff >> dictByScopeIdx
		= new HashMap< YCFBamRoleDefByScopeIdxKey,
				Map< YCFBamRoleDefPKey,
					YCFBamRoleDefBuff >>();
	private Map< YCFBamRoleDefByDefSchemaIdxKey,
				Map< YCFBamRoleDefPKey,
					YCFBamRoleDefBuff >> dictByDefSchemaIdx
		= new HashMap< YCFBamRoleDefByDefSchemaIdxKey,
				Map< YCFBamRoleDefPKey,
					YCFBamRoleDefBuff >>();

	public YCFBamRamRoleDefTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createRoleDef( YCFSecAuthorization Authorization,
		YCFBamRoleDefBuff Buff )
	{
		final String S_ProcName = "createRoleDef";
		YCFBamRoleDefPKey pkey = schema.getFactoryRoleDef().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( ((YCFBamRamTenantTable)schema.getTableTenant()).nextRoleIdGen( Authorization,
			Buff.getRequiredTenantId() ) );
		Buff.setRequiredTenantId( pkey.getRequiredTenantId() );
		Buff.setRequiredId( pkey.getRequiredId() );
		YCFBamRoleDefByUNameIdxKey keyUNameIdx = schema.getFactoryRoleDef().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyUNameIdx.setRequiredScopeId( Buff.getRequiredScopeId() );
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamRoleDefByUDefIdxKey keyUDefIdx = schema.getFactoryRoleDef().newUDefIdxKey();
		keyUDefIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyUDefIdx.setRequiredScopeId( Buff.getRequiredScopeId() );
		keyUDefIdx.setOptionalDefSchemaTenantId( Buff.getOptionalDefSchemaTenantId() );
		keyUDefIdx.setOptionalDefSchemaId( Buff.getOptionalDefSchemaId() );
		keyUDefIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamRoleDefByRoleDefTentIdxKey keyRoleDefTentIdx = schema.getFactoryRoleDef().newRoleDefTentIdxKey();
		keyRoleDefTentIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFBamRoleDefByScopeIdxKey keyScopeIdx = schema.getFactoryRoleDef().newScopeIdxKey();
		keyScopeIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyScopeIdx.setRequiredScopeId( Buff.getRequiredScopeId() );

		YCFBamRoleDefByDefSchemaIdxKey keyDefSchemaIdx = schema.getFactoryRoleDef().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( Buff.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( Buff.getOptionalDefSchemaId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"RoleDefUNameIdx",
				keyUNameIdx );
		}

		if( dictByUDefIdx.containsKey( keyUDefIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"RoleDefUDefIdx",
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

		Map< YCFBamRoleDefPKey, YCFBamRoleDefBuff > subdictRoleDefTentIdx;
		if( dictByRoleDefTentIdx.containsKey( keyRoleDefTentIdx ) ) {
			subdictRoleDefTentIdx = dictByRoleDefTentIdx.get( keyRoleDefTentIdx );
		}
		else {
			subdictRoleDefTentIdx = new HashMap< YCFBamRoleDefPKey, YCFBamRoleDefBuff >();
			dictByRoleDefTentIdx.put( keyRoleDefTentIdx, subdictRoleDefTentIdx );
		}
		subdictRoleDefTentIdx.put( pkey, Buff );

		Map< YCFBamRoleDefPKey, YCFBamRoleDefBuff > subdictScopeIdx;
		if( dictByScopeIdx.containsKey( keyScopeIdx ) ) {
			subdictScopeIdx = dictByScopeIdx.get( keyScopeIdx );
		}
		else {
			subdictScopeIdx = new HashMap< YCFBamRoleDefPKey, YCFBamRoleDefBuff >();
			dictByScopeIdx.put( keyScopeIdx, subdictScopeIdx );
		}
		subdictScopeIdx.put( pkey, Buff );

		Map< YCFBamRoleDefPKey, YCFBamRoleDefBuff > subdictDefSchemaIdx;
		if( dictByDefSchemaIdx.containsKey( keyDefSchemaIdx ) ) {
			subdictDefSchemaIdx = dictByDefSchemaIdx.get( keyDefSchemaIdx );
		}
		else {
			subdictDefSchemaIdx = new HashMap< YCFBamRoleDefPKey, YCFBamRoleDefBuff >();
			dictByDefSchemaIdx.put( keyDefSchemaIdx, subdictDefSchemaIdx );
		}
		subdictDefSchemaIdx.put( pkey, Buff );

	}

	public YCFBamRoleDefBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamRoleDefPKey PKey )
	{
		final String S_ProcName = "YCFBamRamRoleDef.readDerived";
		YCFBamRoleDefPKey key = schema.getFactoryRoleDef().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamRoleDefBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamRoleDefBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamRoleDefPKey PKey )
	{
		final String S_ProcName = "YCFBamRamRoleDef.readDerived";
		YCFBamRoleDefPKey key = schema.getFactoryRoleDef().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamRoleDefBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamRoleDefBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamRoleDef.readAllDerived";
		YCFBamRoleDefBuff[] retList = new YCFBamRoleDefBuff[ dictByPKey.values().size() ];
		Iterator< YCFBamRoleDefBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamRoleDefBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamRoleDef.readDerivedByUNameIdx";
		YCFBamRoleDefByUNameIdxKey key = schema.getFactoryRoleDef().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );

		YCFBamRoleDefBuff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamRoleDefBuff readDerivedByUDefIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamRoleDef.readDerivedByUDefIdx";
		YCFBamRoleDefByUDefIdxKey key = schema.getFactoryRoleDef().newUDefIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		key.setRequiredName( Name );

		YCFBamRoleDefBuff buff;
		if( dictByUDefIdx.containsKey( key ) ) {
			buff = dictByUDefIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamRoleDefBuff[] readDerivedByRoleDefTentIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamRoleDef.readDerivedByRoleDefTentIdx";
		YCFBamRoleDefByRoleDefTentIdxKey key = schema.getFactoryRoleDef().newRoleDefTentIdxKey();
		key.setRequiredTenantId( TenantId );

		YCFBamRoleDefBuff[] recArray;
		if( dictByRoleDefTentIdx.containsKey( key ) ) {
			Map< YCFBamRoleDefPKey, YCFBamRoleDefBuff > subdictRoleDefTentIdx
				= dictByRoleDefTentIdx.get( key );
			recArray = new YCFBamRoleDefBuff[ subdictRoleDefTentIdx.size() ];
			Iterator< YCFBamRoleDefBuff > iter = subdictRoleDefTentIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamRoleDefPKey, YCFBamRoleDefBuff > subdictRoleDefTentIdx
				= new HashMap< YCFBamRoleDefPKey, YCFBamRoleDefBuff >();
			dictByRoleDefTentIdx.put( key, subdictRoleDefTentIdx );
			recArray = new YCFBamRoleDefBuff[0];
		}
		return( recArray );
	}

	public YCFBamRoleDefBuff[] readDerivedByScopeIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "YCFBamRamRoleDef.readDerivedByScopeIdx";
		YCFBamRoleDefByScopeIdxKey key = schema.getFactoryRoleDef().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );

		YCFBamRoleDefBuff[] recArray;
		if( dictByScopeIdx.containsKey( key ) ) {
			Map< YCFBamRoleDefPKey, YCFBamRoleDefBuff > subdictScopeIdx
				= dictByScopeIdx.get( key );
			recArray = new YCFBamRoleDefBuff[ subdictScopeIdx.size() ];
			Iterator< YCFBamRoleDefBuff > iter = subdictScopeIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamRoleDefPKey, YCFBamRoleDefBuff > subdictScopeIdx
				= new HashMap< YCFBamRoleDefPKey, YCFBamRoleDefBuff >();
			dictByScopeIdx.put( key, subdictScopeIdx );
			recArray = new YCFBamRoleDefBuff[0];
		}
		return( recArray );
	}

	public YCFBamRoleDefBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamRoleDef.readDerivedByDefSchemaIdx";
		YCFBamRoleDefByDefSchemaIdxKey key = schema.getFactoryRoleDef().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );

		YCFBamRoleDefBuff[] recArray;
		if( dictByDefSchemaIdx.containsKey( key ) ) {
			Map< YCFBamRoleDefPKey, YCFBamRoleDefBuff > subdictDefSchemaIdx
				= dictByDefSchemaIdx.get( key );
			recArray = new YCFBamRoleDefBuff[ subdictDefSchemaIdx.size() ];
			Iterator< YCFBamRoleDefBuff > iter = subdictDefSchemaIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamRoleDefPKey, YCFBamRoleDefBuff > subdictDefSchemaIdx
				= new HashMap< YCFBamRoleDefPKey, YCFBamRoleDefBuff >();
			dictByDefSchemaIdx.put( key, subdictDefSchemaIdx );
			recArray = new YCFBamRoleDefBuff[0];
		}
		return( recArray );
	}

	public YCFBamRoleDefBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamRoleDef.readDerivedByIdIdx() ";
		YCFBamRoleDefPKey key = schema.getFactoryRoleDef().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamRoleDefBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamRoleDefBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamRoleDefPKey PKey )
	{
		final String S_ProcName = "YCFBamRamRoleDef.readBuff";
		YCFBamRoleDefBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a88d" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamRoleDefBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamRoleDefPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamRoleDefBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a88d" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamRoleDefBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamRoleDef.readAllBuff";
		YCFBamRoleDefBuff buff;
		ArrayList<YCFBamRoleDefBuff> filteredList = new ArrayList<YCFBamRoleDefBuff>();
		YCFBamRoleDefBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a88d" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamRoleDefBuff[0] ) );
	}

	public YCFBamRoleDefBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamRoleDef.readBuffByIdIdx() ";
		YCFBamRoleDefBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a88d" ) ) {
			return( (YCFBamRoleDefBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamRoleDefBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamRoleDef.readBuffByUNameIdx() ";
		YCFBamRoleDefBuff buff = readDerivedByUNameIdx( Authorization,
			TenantId,
			ScopeId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a88d" ) ) {
			return( (YCFBamRoleDefBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamRoleDefBuff readBuffByUDefIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamRoleDef.readBuffByUDefIdx() ";
		YCFBamRoleDefBuff buff = readDerivedByUDefIdx( Authorization,
			TenantId,
			ScopeId,
			DefSchemaTenantId,
			DefSchemaId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a88d" ) ) {
			return( (YCFBamRoleDefBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamRoleDefBuff[] readBuffByRoleDefTentIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamRoleDef.readBuffByRoleDefTentIdx() ";
		YCFBamRoleDefBuff buff;
		ArrayList<YCFBamRoleDefBuff> filteredList = new ArrayList<YCFBamRoleDefBuff>();
		YCFBamRoleDefBuff[] buffList = readDerivedByRoleDefTentIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a88d" ) ) {
				filteredList.add( (YCFBamRoleDefBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamRoleDefBuff[0] ) );
	}

	public YCFBamRoleDefBuff[] readBuffByScopeIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "YCFBamRamRoleDef.readBuffByScopeIdx() ";
		YCFBamRoleDefBuff buff;
		ArrayList<YCFBamRoleDefBuff> filteredList = new ArrayList<YCFBamRoleDefBuff>();
		YCFBamRoleDefBuff[] buffList = readDerivedByScopeIdx( Authorization,
			TenantId,
			ScopeId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a88d" ) ) {
				filteredList.add( (YCFBamRoleDefBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamRoleDefBuff[0] ) );
	}

	public YCFBamRoleDefBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamRoleDef.readBuffByDefSchemaIdx() ";
		YCFBamRoleDefBuff buff;
		ArrayList<YCFBamRoleDefBuff> filteredList = new ArrayList<YCFBamRoleDefBuff>();
		YCFBamRoleDefBuff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a88d" ) ) {
				filteredList.add( (YCFBamRoleDefBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamRoleDefBuff[0] ) );
	}

	public void updateRoleDef( YCFSecAuthorization Authorization,
		YCFBamRoleDefBuff Buff )
	{
		YCFBamRoleDefPKey pkey = schema.getFactoryRoleDef().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamRoleDefBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateRoleDef",
				"Existing record not found",
				"RoleDef",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateRoleDef",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFBamRoleDefByUNameIdxKey existingKeyUNameIdx = schema.getFactoryRoleDef().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyUNameIdx.setRequiredScopeId( existing.getRequiredScopeId() );
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamRoleDefByUNameIdxKey newKeyUNameIdx = schema.getFactoryRoleDef().newUNameIdxKey();
		newKeyUNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyUNameIdx.setRequiredScopeId( Buff.getRequiredScopeId() );
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamRoleDefByUDefIdxKey existingKeyUDefIdx = schema.getFactoryRoleDef().newUDefIdxKey();
		existingKeyUDefIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyUDefIdx.setRequiredScopeId( existing.getRequiredScopeId() );
		existingKeyUDefIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		existingKeyUDefIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );
		existingKeyUDefIdx.setRequiredName( existing.getRequiredName() );

		YCFBamRoleDefByUDefIdxKey newKeyUDefIdx = schema.getFactoryRoleDef().newUDefIdxKey();
		newKeyUDefIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyUDefIdx.setRequiredScopeId( Buff.getRequiredScopeId() );
		newKeyUDefIdx.setOptionalDefSchemaTenantId( Buff.getOptionalDefSchemaTenantId() );
		newKeyUDefIdx.setOptionalDefSchemaId( Buff.getOptionalDefSchemaId() );
		newKeyUDefIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamRoleDefByRoleDefTentIdxKey existingKeyRoleDefTentIdx = schema.getFactoryRoleDef().newRoleDefTentIdxKey();
		existingKeyRoleDefTentIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFBamRoleDefByRoleDefTentIdxKey newKeyRoleDefTentIdx = schema.getFactoryRoleDef().newRoleDefTentIdxKey();
		newKeyRoleDefTentIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFBamRoleDefByScopeIdxKey existingKeyScopeIdx = schema.getFactoryRoleDef().newScopeIdxKey();
		existingKeyScopeIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyScopeIdx.setRequiredScopeId( existing.getRequiredScopeId() );

		YCFBamRoleDefByScopeIdxKey newKeyScopeIdx = schema.getFactoryRoleDef().newScopeIdxKey();
		newKeyScopeIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyScopeIdx.setRequiredScopeId( Buff.getRequiredScopeId() );

		YCFBamRoleDefByDefSchemaIdxKey existingKeyDefSchemaIdx = schema.getFactoryRoleDef().newDefSchemaIdxKey();
		existingKeyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		existingKeyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		YCFBamRoleDefByDefSchemaIdxKey newKeyDefSchemaIdx = schema.getFactoryRoleDef().newDefSchemaIdxKey();
		newKeyDefSchemaIdx.setOptionalDefSchemaTenantId( Buff.getOptionalDefSchemaTenantId() );
		newKeyDefSchemaIdx.setOptionalDefSchemaId( Buff.getOptionalDefSchemaId() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateRoleDef",
					"RoleDefUNameIdx",
					newKeyUNameIdx );
			}
		}

		if( ! existingKeyUDefIdx.equals( newKeyUDefIdx ) ) {
			if( dictByUDefIdx.containsKey( newKeyUDefIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateRoleDef",
					"RoleDefUDefIdx",
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
						"updateRoleDef",
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
						"updateRoleDef",
						"Container",
						"Scope",
						"Scope",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamRoleDefPKey, YCFBamRoleDefBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

		dictByUDefIdx.remove( existingKeyUDefIdx );
		dictByUDefIdx.put( newKeyUDefIdx, Buff );

		subdict = dictByRoleDefTentIdx.get( existingKeyRoleDefTentIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByRoleDefTentIdx.containsKey( newKeyRoleDefTentIdx ) ) {
			subdict = dictByRoleDefTentIdx.get( newKeyRoleDefTentIdx );
		}
		else {
			subdict = new HashMap< YCFBamRoleDefPKey, YCFBamRoleDefBuff >();
			dictByRoleDefTentIdx.put( newKeyRoleDefTentIdx, subdict );
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
			subdict = new HashMap< YCFBamRoleDefPKey, YCFBamRoleDefBuff >();
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
			subdict = new HashMap< YCFBamRoleDefPKey, YCFBamRoleDefBuff >();
			dictByDefSchemaIdx.put( newKeyDefSchemaIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteRoleDef( YCFSecAuthorization Authorization,
		YCFBamRoleDefBuff Buff )
	{
		final String S_ProcName = "YCFBamRamRoleDefTable.deleteRoleDef() ";
		String classCode;
		YCFBamRoleDefPKey pkey = schema.getFactoryRoleDef().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamRoleDefBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteRoleDef",
				pkey );
		}
		YCFBamRoleDefByUNameIdxKey keyUNameIdx = schema.getFactoryRoleDef().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredScopeId( existing.getRequiredScopeId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamRoleDefByUDefIdxKey keyUDefIdx = schema.getFactoryRoleDef().newUDefIdxKey();
		keyUDefIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUDefIdx.setRequiredScopeId( existing.getRequiredScopeId() );
		keyUDefIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyUDefIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );
		keyUDefIdx.setRequiredName( existing.getRequiredName() );

		YCFBamRoleDefByRoleDefTentIdxKey keyRoleDefTentIdx = schema.getFactoryRoleDef().newRoleDefTentIdxKey();
		keyRoleDefTentIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFBamRoleDefByScopeIdxKey keyScopeIdx = schema.getFactoryRoleDef().newScopeIdxKey();
		keyScopeIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyScopeIdx.setRequiredScopeId( existing.getRequiredScopeId() );

		YCFBamRoleDefByDefSchemaIdxKey keyDefSchemaIdx = schema.getFactoryRoleDef().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		// Validate reverse foreign keys

		if( schema.getTableSchemaRole().readDerivedByIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteRoleDef",
				"Superclass",
				"SuperClass",
				"SchemaRole",
				pkey );
		}

		// Delete is valid
		Map< YCFBamRoleDefPKey, YCFBamRoleDefBuff > subdict;

		dictByPKey.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

		dictByUDefIdx.remove( keyUDefIdx );

		subdict = dictByRoleDefTentIdx.get( keyRoleDefTentIdx );
		subdict.remove( pkey );

		subdict = dictByScopeIdx.get( keyScopeIdx );
		subdict.remove( pkey );

		subdict = dictByDefSchemaIdx.get( keyDefSchemaIdx );
		subdict.remove( pkey );

	}
	public void deleteRoleDefByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamRoleDefPKey key = schema.getFactoryRoleDef().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteRoleDefByIdIdx( Authorization, key );
	}

	public void deleteRoleDefByIdIdx( YCFSecAuthorization Authorization,
		YCFBamRoleDefPKey argKey )
	{
		final String S_ProcName = "deleteRoleDefByIdIdx";
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamRoleDefBuff cur;
		LinkedList<YCFBamRoleDefBuff> matchSet = new LinkedList<YCFBamRoleDefBuff>();
		Iterator<YCFBamRoleDefBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamRoleDefBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRoleDef().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a88d".equals( subClassCode ) ) {
				schema.getTableRoleDef().deleteRoleDef( Authorization, cur );
			}
			else if( "a88e".equals( subClassCode ) ) {
				schema.getTableSchemaRole().deleteSchemaRole( Authorization, (YCFBamSchemaRoleBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of RoleDef must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteRoleDefByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		String argName )
	{
		YCFBamRoleDefByUNameIdxKey key = schema.getFactoryRoleDef().newUNameIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredScopeId( argScopeId );
		key.setRequiredName( argName );
		deleteRoleDefByUNameIdx( Authorization, key );
	}

	public void deleteRoleDefByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamRoleDefByUNameIdxKey argKey )
	{
		final String S_ProcName = "deleteRoleDefByUNameIdx";
		YCFBamRoleDefBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamRoleDefBuff> matchSet = new LinkedList<YCFBamRoleDefBuff>();
		Iterator<YCFBamRoleDefBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamRoleDefBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRoleDef().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a88d".equals( subClassCode ) ) {
				schema.getTableRoleDef().deleteRoleDef( Authorization, cur );
			}
			else if( "a88e".equals( subClassCode ) ) {
				schema.getTableSchemaRole().deleteSchemaRole( Authorization, (YCFBamSchemaRoleBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of RoleDef must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteRoleDefByUDefIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		Long argDefSchemaTenantId,
		Long argDefSchemaId,
		String argName )
	{
		YCFBamRoleDefByUDefIdxKey key = schema.getFactoryRoleDef().newUDefIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredScopeId( argScopeId );
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		key.setRequiredName( argName );
		deleteRoleDefByUDefIdx( Authorization, key );
	}

	public void deleteRoleDefByUDefIdx( YCFSecAuthorization Authorization,
		YCFBamRoleDefByUDefIdxKey argKey )
	{
		final String S_ProcName = "deleteRoleDefByUDefIdx";
		YCFBamRoleDefBuff cur;
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
		LinkedList<YCFBamRoleDefBuff> matchSet = new LinkedList<YCFBamRoleDefBuff>();
		Iterator<YCFBamRoleDefBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamRoleDefBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRoleDef().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a88d".equals( subClassCode ) ) {
				schema.getTableRoleDef().deleteRoleDef( Authorization, cur );
			}
			else if( "a88e".equals( subClassCode ) ) {
				schema.getTableSchemaRole().deleteSchemaRole( Authorization, (YCFBamSchemaRoleBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of RoleDef must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteRoleDefByRoleDefTentIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamRoleDefByRoleDefTentIdxKey key = schema.getFactoryRoleDef().newRoleDefTentIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteRoleDefByRoleDefTentIdx( Authorization, key );
	}

	public void deleteRoleDefByRoleDefTentIdx( YCFSecAuthorization Authorization,
		YCFBamRoleDefByRoleDefTentIdxKey argKey )
	{
		final String S_ProcName = "deleteRoleDefByRoleDefTentIdx";
		YCFBamRoleDefBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamRoleDefBuff> matchSet = new LinkedList<YCFBamRoleDefBuff>();
		Iterator<YCFBamRoleDefBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamRoleDefBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRoleDef().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a88d".equals( subClassCode ) ) {
				schema.getTableRoleDef().deleteRoleDef( Authorization, cur );
			}
			else if( "a88e".equals( subClassCode ) ) {
				schema.getTableSchemaRole().deleteSchemaRole( Authorization, (YCFBamSchemaRoleBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of RoleDef must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteRoleDefByScopeIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId )
	{
		YCFBamRoleDefByScopeIdxKey key = schema.getFactoryRoleDef().newScopeIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredScopeId( argScopeId );
		deleteRoleDefByScopeIdx( Authorization, key );
	}

	public void deleteRoleDefByScopeIdx( YCFSecAuthorization Authorization,
		YCFBamRoleDefByScopeIdxKey argKey )
	{
		final String S_ProcName = "deleteRoleDefByScopeIdx";
		YCFBamRoleDefBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamRoleDefBuff> matchSet = new LinkedList<YCFBamRoleDefBuff>();
		Iterator<YCFBamRoleDefBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamRoleDefBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRoleDef().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a88d".equals( subClassCode ) ) {
				schema.getTableRoleDef().deleteRoleDef( Authorization, cur );
			}
			else if( "a88e".equals( subClassCode ) ) {
				schema.getTableSchemaRole().deleteSchemaRole( Authorization, (YCFBamSchemaRoleBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of RoleDef must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteRoleDefByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamRoleDefByDefSchemaIdxKey key = schema.getFactoryRoleDef().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deleteRoleDefByDefSchemaIdx( Authorization, key );
	}

	public void deleteRoleDefByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamRoleDefByDefSchemaIdxKey argKey )
	{
		final String S_ProcName = "deleteRoleDefByDefSchemaIdx";
		YCFBamRoleDefBuff cur;
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
		LinkedList<YCFBamRoleDefBuff> matchSet = new LinkedList<YCFBamRoleDefBuff>();
		Iterator<YCFBamRoleDefBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamRoleDefBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRoleDef().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a88d".equals( subClassCode ) ) {
				schema.getTableRoleDef().deleteRoleDef( Authorization, cur );
			}
			else if( "a88e".equals( subClassCode ) ) {
				schema.getTableSchemaRole().deleteSchemaRole( Authorization, (YCFBamSchemaRoleBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of RoleDef must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void releasePreparedStatements() {
	}
}
