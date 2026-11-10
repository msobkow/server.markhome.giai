
// Description: Java 11 in-memory RAM DbIO implementation for SchemaRole.

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
 *	YCFBamRamSchemaRoleTable in-memory RAM DbIO implementation
 *	for SchemaRole.
 */
public class YCFBamRamSchemaRoleTable
	implements IYCFBamSchemaRoleTable
{
	private IYCFBamSchema schema;
	private Map< YCFBamRoleDefPKey,
				YCFBamSchemaRoleBuff > dictByPKey
		= new HashMap< YCFBamRoleDefPKey,
				YCFBamSchemaRoleBuff >();
	private Map< YCFBamSchemaRoleBySchemaIdxKey,
				Map< YCFBamRoleDefPKey,
					YCFBamSchemaRoleBuff >> dictBySchemaIdx
		= new HashMap< YCFBamSchemaRoleBySchemaIdxKey,
				Map< YCFBamRoleDefPKey,
					YCFBamSchemaRoleBuff >>();
	private Map< YCFBamSchemaRoleByRoleScopeIdxKey,
				Map< YCFBamRoleDefPKey,
					YCFBamSchemaRoleBuff >> dictByRoleScopeIdx
		= new HashMap< YCFBamSchemaRoleByRoleScopeIdxKey,
				Map< YCFBamRoleDefPKey,
					YCFBamSchemaRoleBuff >>();
	private Map< YCFBamSchemaRoleBySchRoleScpIdxKey,
				Map< YCFBamRoleDefPKey,
					YCFBamSchemaRoleBuff >> dictBySchRoleScpIdx
		= new HashMap< YCFBamSchemaRoleBySchRoleScpIdxKey,
				Map< YCFBamRoleDefPKey,
					YCFBamSchemaRoleBuff >>();

	public YCFBamRamSchemaRoleTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createSchemaRole( YCFSecAuthorization Authorization,
		YCFBamSchemaRoleBuff Buff )
	{
		final String S_ProcName = "createSchemaRole";
		schema.getTableRoleDef().createRoleDef( Authorization,
			Buff );
		YCFBamRoleDefPKey pkey = schema.getFactoryRoleDef().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamSchemaRoleBySchemaIdxKey keySchemaIdx = schema.getFactorySchemaRole().newSchemaIdxKey();
		keySchemaIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keySchemaIdx.setRequiredSchemaDefId( Buff.getRequiredSchemaDefId() );

		YCFBamSchemaRoleByRoleScopeIdxKey keyRoleScopeIdx = schema.getFactorySchemaRole().newRoleScopeIdxKey();
		keyRoleScopeIdx.setRequiredRoleScope( Buff.getRequiredRoleScope() );

		YCFBamSchemaRoleBySchRoleScpIdxKey keySchRoleScpIdx = schema.getFactorySchemaRole().newSchRoleScpIdxKey();
		keySchRoleScpIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keySchRoleScpIdx.setRequiredSchemaDefId( Buff.getRequiredSchemaDefId() );
		keySchRoleScpIdx.setRequiredRoleScope( Buff.getRequiredRoleScope() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		// Validate foreign keys

		{
			boolean allNull = true;
			allNull = false;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableRoleDef().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Superclass",
						"SuperClass",
						"RoleDef",
						null );
				}
			}
		}

		{
			boolean allNull = true;
			allNull = false;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableSchemaDef().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredSchemaDefId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"Schema",
						"SchemaDef",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFBamRoleDefPKey, YCFBamSchemaRoleBuff > subdictSchemaIdx;
		if( dictBySchemaIdx.containsKey( keySchemaIdx ) ) {
			subdictSchemaIdx = dictBySchemaIdx.get( keySchemaIdx );
		}
		else {
			subdictSchemaIdx = new HashMap< YCFBamRoleDefPKey, YCFBamSchemaRoleBuff >();
			dictBySchemaIdx.put( keySchemaIdx, subdictSchemaIdx );
		}
		subdictSchemaIdx.put( pkey, Buff );

		Map< YCFBamRoleDefPKey, YCFBamSchemaRoleBuff > subdictRoleScopeIdx;
		if( dictByRoleScopeIdx.containsKey( keyRoleScopeIdx ) ) {
			subdictRoleScopeIdx = dictByRoleScopeIdx.get( keyRoleScopeIdx );
		}
		else {
			subdictRoleScopeIdx = new HashMap< YCFBamRoleDefPKey, YCFBamSchemaRoleBuff >();
			dictByRoleScopeIdx.put( keyRoleScopeIdx, subdictRoleScopeIdx );
		}
		subdictRoleScopeIdx.put( pkey, Buff );

		Map< YCFBamRoleDefPKey, YCFBamSchemaRoleBuff > subdictSchRoleScpIdx;
		if( dictBySchRoleScpIdx.containsKey( keySchRoleScpIdx ) ) {
			subdictSchRoleScpIdx = dictBySchRoleScpIdx.get( keySchRoleScpIdx );
		}
		else {
			subdictSchRoleScpIdx = new HashMap< YCFBamRoleDefPKey, YCFBamSchemaRoleBuff >();
			dictBySchRoleScpIdx.put( keySchRoleScpIdx, subdictSchRoleScpIdx );
		}
		subdictSchRoleScpIdx.put( pkey, Buff );

	}

	public YCFBamSchemaRoleBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamRoleDefPKey PKey )
	{
		final String S_ProcName = "YCFBamRamSchemaRole.readDerived";
		YCFBamRoleDefPKey key = schema.getFactoryRoleDef().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamSchemaRoleBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamSchemaRoleBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamRoleDefPKey PKey )
	{
		final String S_ProcName = "YCFBamRamSchemaRole.readDerived";
		YCFBamRoleDefPKey key = schema.getFactoryRoleDef().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamSchemaRoleBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamSchemaRoleBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamSchemaRole.readAllDerived";
		YCFBamSchemaRoleBuff[] retList = new YCFBamSchemaRoleBuff[ dictByPKey.values().size() ];
		Iterator< YCFBamSchemaRoleBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamSchemaRoleBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamRoleDef.readDerivedByUNameIdx";
		YCFBamRoleDefBuff buff = schema.getTableRoleDef().readDerivedByUNameIdx( Authorization,
			TenantId,
			ScopeId,
			Name );
		if( buff == null ) {
			return( null );
		}
		else if( buff instanceof YCFBamSchemaRoleBuff ) {
			return( (YCFBamSchemaRoleBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamSchemaRoleBuff readDerivedByUDefIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamRoleDef.readDerivedByUDefIdx";
		YCFBamRoleDefBuff buff = schema.getTableRoleDef().readDerivedByUDefIdx( Authorization,
			TenantId,
			ScopeId,
			DefSchemaTenantId,
			DefSchemaId,
			Name );
		if( buff == null ) {
			return( null );
		}
		else if( buff instanceof YCFBamSchemaRoleBuff ) {
			return( (YCFBamSchemaRoleBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamSchemaRoleBuff[] readDerivedByRoleDefTentIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamRoleDef.readDerivedByRoleDefTentIdx";
		YCFBamRoleDefBuff buffList[] = schema.getTableRoleDef().readDerivedByRoleDefTentIdx( Authorization,
			TenantId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFBamRoleDefBuff buff;
			ArrayList<YCFBamSchemaRoleBuff> filteredList = new ArrayList<YCFBamSchemaRoleBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamSchemaRoleBuff ) ) {
					filteredList.add( (YCFBamSchemaRoleBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamSchemaRoleBuff[0] ) );
		}
	}

	public YCFBamSchemaRoleBuff[] readDerivedByScopeIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "YCFBamRamRoleDef.readDerivedByScopeIdx";
		YCFBamRoleDefBuff buffList[] = schema.getTableRoleDef().readDerivedByScopeIdx( Authorization,
			TenantId,
			ScopeId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFBamRoleDefBuff buff;
			ArrayList<YCFBamSchemaRoleBuff> filteredList = new ArrayList<YCFBamSchemaRoleBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamSchemaRoleBuff ) ) {
					filteredList.add( (YCFBamSchemaRoleBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamSchemaRoleBuff[0] ) );
		}
	}

	public YCFBamSchemaRoleBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamRoleDef.readDerivedByDefSchemaIdx";
		YCFBamRoleDefBuff buffList[] = schema.getTableRoleDef().readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFBamRoleDefBuff buff;
			ArrayList<YCFBamSchemaRoleBuff> filteredList = new ArrayList<YCFBamSchemaRoleBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamSchemaRoleBuff ) ) {
					filteredList.add( (YCFBamSchemaRoleBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamSchemaRoleBuff[0] ) );
		}
	}

	public YCFBamSchemaRoleBuff[] readDerivedBySchemaIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId )
	{
		final String S_ProcName = "YCFBamRamSchemaRole.readDerivedBySchemaIdx";
		YCFBamSchemaRoleBySchemaIdxKey key = schema.getFactorySchemaRole().newSchemaIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );

		YCFBamSchemaRoleBuff[] recArray;
		if( dictBySchemaIdx.containsKey( key ) ) {
			Map< YCFBamRoleDefPKey, YCFBamSchemaRoleBuff > subdictSchemaIdx
				= dictBySchemaIdx.get( key );
			recArray = new YCFBamSchemaRoleBuff[ subdictSchemaIdx.size() ];
			Iterator< YCFBamSchemaRoleBuff > iter = subdictSchemaIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamRoleDefPKey, YCFBamSchemaRoleBuff > subdictSchemaIdx
				= new HashMap< YCFBamRoleDefPKey, YCFBamSchemaRoleBuff >();
			dictBySchemaIdx.put( key, subdictSchemaIdx );
			recArray = new YCFBamSchemaRoleBuff[0];
		}
		return( recArray );
	}

	public YCFBamSchemaRoleBuff[] readDerivedByRoleScopeIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.RoleScopeEnum RoleScope )
	{
		final String S_ProcName = "YCFBamRamSchemaRole.readDerivedByRoleScopeIdx";
		YCFBamSchemaRoleByRoleScopeIdxKey key = schema.getFactorySchemaRole().newRoleScopeIdxKey();
		key.setRequiredRoleScope( RoleScope );

		YCFBamSchemaRoleBuff[] recArray;
		if( dictByRoleScopeIdx.containsKey( key ) ) {
			Map< YCFBamRoleDefPKey, YCFBamSchemaRoleBuff > subdictRoleScopeIdx
				= dictByRoleScopeIdx.get( key );
			recArray = new YCFBamSchemaRoleBuff[ subdictRoleScopeIdx.size() ];
			Iterator< YCFBamSchemaRoleBuff > iter = subdictRoleScopeIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamRoleDefPKey, YCFBamSchemaRoleBuff > subdictRoleScopeIdx
				= new HashMap< YCFBamRoleDefPKey, YCFBamSchemaRoleBuff >();
			dictByRoleScopeIdx.put( key, subdictRoleScopeIdx );
			recArray = new YCFBamSchemaRoleBuff[0];
		}
		return( recArray );
	}

	public YCFBamSchemaRoleBuff[] readDerivedBySchRoleScpIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId,
		IYCFBamSchema.RoleScopeEnum RoleScope )
	{
		final String S_ProcName = "YCFBamRamSchemaRole.readDerivedBySchRoleScpIdx";
		YCFBamSchemaRoleBySchRoleScpIdxKey key = schema.getFactorySchemaRole().newSchRoleScpIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		key.setRequiredRoleScope( RoleScope );

		YCFBamSchemaRoleBuff[] recArray;
		if( dictBySchRoleScpIdx.containsKey( key ) ) {
			Map< YCFBamRoleDefPKey, YCFBamSchemaRoleBuff > subdictSchRoleScpIdx
				= dictBySchRoleScpIdx.get( key );
			recArray = new YCFBamSchemaRoleBuff[ subdictSchRoleScpIdx.size() ];
			Iterator< YCFBamSchemaRoleBuff > iter = subdictSchRoleScpIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamRoleDefPKey, YCFBamSchemaRoleBuff > subdictSchRoleScpIdx
				= new HashMap< YCFBamRoleDefPKey, YCFBamSchemaRoleBuff >();
			dictBySchRoleScpIdx.put( key, subdictSchRoleScpIdx );
			recArray = new YCFBamSchemaRoleBuff[0];
		}
		return( recArray );
	}

	public YCFBamSchemaRoleBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamRoleDef.readDerivedByIdIdx() ";
		YCFBamRoleDefPKey key = schema.getFactoryRoleDef().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamSchemaRoleBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamSchemaRoleBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamRoleDefPKey PKey )
	{
		final String S_ProcName = "YCFBamRamSchemaRole.readBuff";
		YCFBamSchemaRoleBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a88e" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamSchemaRoleBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamRoleDefPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamSchemaRoleBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a88e" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamSchemaRoleBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamSchemaRole.readAllBuff";
		YCFBamSchemaRoleBuff buff;
		ArrayList<YCFBamSchemaRoleBuff> filteredList = new ArrayList<YCFBamSchemaRoleBuff>();
		YCFBamSchemaRoleBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a88e" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamSchemaRoleBuff[0] ) );
	}

	public YCFBamSchemaRoleBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamRoleDef.readBuffByIdIdx() ";
		YCFBamSchemaRoleBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a88d" ) ) {
			return( (YCFBamSchemaRoleBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamSchemaRoleBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamRoleDef.readBuffByUNameIdx() ";
		YCFBamSchemaRoleBuff buff = readDerivedByUNameIdx( Authorization,
			TenantId,
			ScopeId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a88d" ) ) {
			return( (YCFBamSchemaRoleBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamSchemaRoleBuff readBuffByUDefIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamRoleDef.readBuffByUDefIdx() ";
		YCFBamSchemaRoleBuff buff = readDerivedByUDefIdx( Authorization,
			TenantId,
			ScopeId,
			DefSchemaTenantId,
			DefSchemaId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a88d" ) ) {
			return( (YCFBamSchemaRoleBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamSchemaRoleBuff[] readBuffByRoleDefTentIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamRoleDef.readBuffByRoleDefTentIdx() ";
		YCFBamSchemaRoleBuff buff;
		ArrayList<YCFBamSchemaRoleBuff> filteredList = new ArrayList<YCFBamSchemaRoleBuff>();
		YCFBamSchemaRoleBuff[] buffList = readDerivedByRoleDefTentIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a88d" ) ) {
				filteredList.add( (YCFBamSchemaRoleBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamSchemaRoleBuff[0] ) );
	}

	public YCFBamSchemaRoleBuff[] readBuffByScopeIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "YCFBamRamRoleDef.readBuffByScopeIdx() ";
		YCFBamSchemaRoleBuff buff;
		ArrayList<YCFBamSchemaRoleBuff> filteredList = new ArrayList<YCFBamSchemaRoleBuff>();
		YCFBamSchemaRoleBuff[] buffList = readDerivedByScopeIdx( Authorization,
			TenantId,
			ScopeId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a88d" ) ) {
				filteredList.add( (YCFBamSchemaRoleBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamSchemaRoleBuff[0] ) );
	}

	public YCFBamSchemaRoleBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamRoleDef.readBuffByDefSchemaIdx() ";
		YCFBamSchemaRoleBuff buff;
		ArrayList<YCFBamSchemaRoleBuff> filteredList = new ArrayList<YCFBamSchemaRoleBuff>();
		YCFBamSchemaRoleBuff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a88d" ) ) {
				filteredList.add( (YCFBamSchemaRoleBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamSchemaRoleBuff[0] ) );
	}

	public YCFBamSchemaRoleBuff[] readBuffBySchemaIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId )
	{
		final String S_ProcName = "YCFBamRamSchemaRole.readBuffBySchemaIdx() ";
		YCFBamSchemaRoleBuff buff;
		ArrayList<YCFBamSchemaRoleBuff> filteredList = new ArrayList<YCFBamSchemaRoleBuff>();
		YCFBamSchemaRoleBuff[] buffList = readDerivedBySchemaIdx( Authorization,
			TenantId,
			SchemaDefId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a88e" ) ) {
				filteredList.add( (YCFBamSchemaRoleBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamSchemaRoleBuff[0] ) );
	}

	public YCFBamSchemaRoleBuff[] readBuffByRoleScopeIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.RoleScopeEnum RoleScope )
	{
		final String S_ProcName = "YCFBamRamSchemaRole.readBuffByRoleScopeIdx() ";
		YCFBamSchemaRoleBuff buff;
		ArrayList<YCFBamSchemaRoleBuff> filteredList = new ArrayList<YCFBamSchemaRoleBuff>();
		YCFBamSchemaRoleBuff[] buffList = readDerivedByRoleScopeIdx( Authorization,
			RoleScope );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a88e" ) ) {
				filteredList.add( (YCFBamSchemaRoleBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamSchemaRoleBuff[0] ) );
	}

	public YCFBamSchemaRoleBuff[] readBuffBySchRoleScpIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId,
		IYCFBamSchema.RoleScopeEnum RoleScope )
	{
		final String S_ProcName = "YCFBamRamSchemaRole.readBuffBySchRoleScpIdx() ";
		YCFBamSchemaRoleBuff buff;
		ArrayList<YCFBamSchemaRoleBuff> filteredList = new ArrayList<YCFBamSchemaRoleBuff>();
		YCFBamSchemaRoleBuff[] buffList = readDerivedBySchRoleScpIdx( Authorization,
			TenantId,
			SchemaDefId,
			RoleScope );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a88e" ) ) {
				filteredList.add( (YCFBamSchemaRoleBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamSchemaRoleBuff[0] ) );
	}

	/**
	 *	Read a page array of the specific SchemaRole buffer instances identified by the duplicate key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamSchemaRoleBuff[] pageBuffBySchemaIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffBySchemaIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific SchemaRole buffer instances identified by the duplicate key RoleScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRoleScope	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamSchemaRoleBuff[] pageBuffByRoleScopeIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.RoleScopeEnum RoleScope,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByRoleScopeIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific SchemaRole buffer instances identified by the duplicate key SchRoleScpIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	argRoleScope	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamSchemaRoleBuff[] pageBuffBySchRoleScpIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId,
		IYCFBamSchema.RoleScopeEnum RoleScope,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffBySchRoleScpIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateSchemaRole( YCFSecAuthorization Authorization,
		YCFBamSchemaRoleBuff Buff )
	{
		schema.getTableRoleDef().updateRoleDef( Authorization,
			Buff );
		YCFBamRoleDefPKey pkey = schema.getFactoryRoleDef().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamSchemaRoleBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateSchemaRole",
				"Existing record not found",
				"SchemaRole",
				pkey );
		}
		YCFBamSchemaRoleBySchemaIdxKey existingKeySchemaIdx = schema.getFactorySchemaRole().newSchemaIdxKey();
		existingKeySchemaIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeySchemaIdx.setRequiredSchemaDefId( existing.getRequiredSchemaDefId() );

		YCFBamSchemaRoleBySchemaIdxKey newKeySchemaIdx = schema.getFactorySchemaRole().newSchemaIdxKey();
		newKeySchemaIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeySchemaIdx.setRequiredSchemaDefId( Buff.getRequiredSchemaDefId() );

		YCFBamSchemaRoleByRoleScopeIdxKey existingKeyRoleScopeIdx = schema.getFactorySchemaRole().newRoleScopeIdxKey();
		existingKeyRoleScopeIdx.setRequiredRoleScope( existing.getRequiredRoleScope() );

		YCFBamSchemaRoleByRoleScopeIdxKey newKeyRoleScopeIdx = schema.getFactorySchemaRole().newRoleScopeIdxKey();
		newKeyRoleScopeIdx.setRequiredRoleScope( Buff.getRequiredRoleScope() );

		YCFBamSchemaRoleBySchRoleScpIdxKey existingKeySchRoleScpIdx = schema.getFactorySchemaRole().newSchRoleScpIdxKey();
		existingKeySchRoleScpIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeySchRoleScpIdx.setRequiredSchemaDefId( existing.getRequiredSchemaDefId() );
		existingKeySchRoleScpIdx.setRequiredRoleScope( existing.getRequiredRoleScope() );

		YCFBamSchemaRoleBySchRoleScpIdxKey newKeySchRoleScpIdx = schema.getFactorySchemaRole().newSchRoleScpIdxKey();
		newKeySchRoleScpIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeySchRoleScpIdx.setRequiredSchemaDefId( Buff.getRequiredSchemaDefId() );
		newKeySchRoleScpIdx.setRequiredRoleScope( Buff.getRequiredRoleScope() );

		// Check unique indexes

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableRoleDef().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateSchemaRole",
						"Superclass",
						"SuperClass",
						"RoleDef",
						null );
				}
			}
		}

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableSchemaDef().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredSchemaDefId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateSchemaRole",
						"Container",
						"Schema",
						"SchemaDef",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamRoleDefPKey, YCFBamSchemaRoleBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictBySchemaIdx.get( existingKeySchemaIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictBySchemaIdx.containsKey( newKeySchemaIdx ) ) {
			subdict = dictBySchemaIdx.get( newKeySchemaIdx );
		}
		else {
			subdict = new HashMap< YCFBamRoleDefPKey, YCFBamSchemaRoleBuff >();
			dictBySchemaIdx.put( newKeySchemaIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByRoleScopeIdx.get( existingKeyRoleScopeIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByRoleScopeIdx.containsKey( newKeyRoleScopeIdx ) ) {
			subdict = dictByRoleScopeIdx.get( newKeyRoleScopeIdx );
		}
		else {
			subdict = new HashMap< YCFBamRoleDefPKey, YCFBamSchemaRoleBuff >();
			dictByRoleScopeIdx.put( newKeyRoleScopeIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictBySchRoleScpIdx.get( existingKeySchRoleScpIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictBySchRoleScpIdx.containsKey( newKeySchRoleScpIdx ) ) {
			subdict = dictBySchRoleScpIdx.get( newKeySchRoleScpIdx );
		}
		else {
			subdict = new HashMap< YCFBamRoleDefPKey, YCFBamSchemaRoleBuff >();
			dictBySchRoleScpIdx.put( newKeySchRoleScpIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteSchemaRole( YCFSecAuthorization Authorization,
		YCFBamSchemaRoleBuff Buff )
	{
		final String S_ProcName = "YCFBamRamSchemaRoleTable.deleteSchemaRole() ";
		String classCode;
		YCFBamRoleDefPKey pkey = schema.getFactoryRoleDef().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamSchemaRoleBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteSchemaRole",
				pkey );
		}
		YCFBamSchemaRoleBySchemaIdxKey keySchemaIdx = schema.getFactorySchemaRole().newSchemaIdxKey();
		keySchemaIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keySchemaIdx.setRequiredSchemaDefId( existing.getRequiredSchemaDefId() );

		YCFBamSchemaRoleByRoleScopeIdxKey keyRoleScopeIdx = schema.getFactorySchemaRole().newRoleScopeIdxKey();
		keyRoleScopeIdx.setRequiredRoleScope( existing.getRequiredRoleScope() );

		YCFBamSchemaRoleBySchRoleScpIdxKey keySchRoleScpIdx = schema.getFactorySchemaRole().newSchRoleScpIdxKey();
		keySchRoleScpIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keySchRoleScpIdx.setRequiredSchemaDefId( existing.getRequiredSchemaDefId() );
		keySchRoleScpIdx.setRequiredRoleScope( existing.getRequiredRoleScope() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFBamRoleDefPKey, YCFBamSchemaRoleBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictBySchemaIdx.get( keySchemaIdx );
		subdict.remove( pkey );

		subdict = dictByRoleScopeIdx.get( keyRoleScopeIdx );
		subdict.remove( pkey );

		subdict = dictBySchRoleScpIdx.get( keySchRoleScpIdx );
		subdict.remove( pkey );

		schema.getTableRoleDef().deleteRoleDef( Authorization,
			Buff );
	}
	public void deleteSchemaRoleBySchemaIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argSchemaDefId )
	{
		YCFBamSchemaRoleBySchemaIdxKey key = schema.getFactorySchemaRole().newSchemaIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredSchemaDefId( argSchemaDefId );
		deleteSchemaRoleBySchemaIdx( Authorization, key );
	}

	public void deleteSchemaRoleBySchemaIdx( YCFSecAuthorization Authorization,
		YCFBamSchemaRoleBySchemaIdxKey argKey )
	{
		YCFBamSchemaRoleBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamSchemaRoleBuff> matchSet = new LinkedList<YCFBamSchemaRoleBuff>();
		Iterator<YCFBamSchemaRoleBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamSchemaRoleBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSchemaRole().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSchemaRole( Authorization, cur );
		}
	}

	public void deleteSchemaRoleByRoleScopeIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.RoleScopeEnum argRoleScope )
	{
		YCFBamSchemaRoleByRoleScopeIdxKey key = schema.getFactorySchemaRole().newRoleScopeIdxKey();
		key.setRequiredRoleScope( argRoleScope );
		deleteSchemaRoleByRoleScopeIdx( Authorization, key );
	}

	public void deleteSchemaRoleByRoleScopeIdx( YCFSecAuthorization Authorization,
		YCFBamSchemaRoleByRoleScopeIdxKey argKey )
	{
		YCFBamSchemaRoleBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamSchemaRoleBuff> matchSet = new LinkedList<YCFBamSchemaRoleBuff>();
		Iterator<YCFBamSchemaRoleBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamSchemaRoleBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSchemaRole().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSchemaRole( Authorization, cur );
		}
	}

	public void deleteSchemaRoleBySchRoleScpIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argSchemaDefId,
		IYCFBamSchema.RoleScopeEnum argRoleScope )
	{
		YCFBamSchemaRoleBySchRoleScpIdxKey key = schema.getFactorySchemaRole().newSchRoleScpIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredSchemaDefId( argSchemaDefId );
		key.setRequiredRoleScope( argRoleScope );
		deleteSchemaRoleBySchRoleScpIdx( Authorization, key );
	}

	public void deleteSchemaRoleBySchRoleScpIdx( YCFSecAuthorization Authorization,
		YCFBamSchemaRoleBySchRoleScpIdxKey argKey )
	{
		YCFBamSchemaRoleBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamSchemaRoleBuff> matchSet = new LinkedList<YCFBamSchemaRoleBuff>();
		Iterator<YCFBamSchemaRoleBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamSchemaRoleBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSchemaRole().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSchemaRole( Authorization, cur );
		}
	}

	public void deleteSchemaRoleByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamRoleDefPKey key = schema.getFactoryRoleDef().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteSchemaRoleByIdIdx( Authorization, key );
	}

	public void deleteSchemaRoleByIdIdx( YCFSecAuthorization Authorization,
		YCFBamRoleDefPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamSchemaRoleBuff cur;
		LinkedList<YCFBamSchemaRoleBuff> matchSet = new LinkedList<YCFBamSchemaRoleBuff>();
		Iterator<YCFBamSchemaRoleBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamSchemaRoleBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSchemaRole().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSchemaRole( Authorization, cur );
		}
	}

	public void deleteSchemaRoleByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		String argName )
	{
		YCFBamRoleDefByUNameIdxKey key = schema.getFactoryRoleDef().newUNameIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredScopeId( argScopeId );
		key.setRequiredName( argName );
		deleteSchemaRoleByUNameIdx( Authorization, key );
	}

	public void deleteSchemaRoleByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamRoleDefByUNameIdxKey argKey )
	{
		YCFBamSchemaRoleBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamSchemaRoleBuff> matchSet = new LinkedList<YCFBamSchemaRoleBuff>();
		Iterator<YCFBamSchemaRoleBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamSchemaRoleBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSchemaRole().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSchemaRole( Authorization, cur );
		}
	}

	public void deleteSchemaRoleByUDefIdx( YCFSecAuthorization Authorization,
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
		deleteSchemaRoleByUDefIdx( Authorization, key );
	}

	public void deleteSchemaRoleByUDefIdx( YCFSecAuthorization Authorization,
		YCFBamRoleDefByUDefIdxKey argKey )
	{
		YCFBamSchemaRoleBuff cur;
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
		LinkedList<YCFBamSchemaRoleBuff> matchSet = new LinkedList<YCFBamSchemaRoleBuff>();
		Iterator<YCFBamSchemaRoleBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamSchemaRoleBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSchemaRole().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSchemaRole( Authorization, cur );
		}
	}

	public void deleteSchemaRoleByRoleDefTentIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamRoleDefByRoleDefTentIdxKey key = schema.getFactoryRoleDef().newRoleDefTentIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteSchemaRoleByRoleDefTentIdx( Authorization, key );
	}

	public void deleteSchemaRoleByRoleDefTentIdx( YCFSecAuthorization Authorization,
		YCFBamRoleDefByRoleDefTentIdxKey argKey )
	{
		YCFBamSchemaRoleBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamSchemaRoleBuff> matchSet = new LinkedList<YCFBamSchemaRoleBuff>();
		Iterator<YCFBamSchemaRoleBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamSchemaRoleBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSchemaRole().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSchemaRole( Authorization, cur );
		}
	}

	public void deleteSchemaRoleByScopeIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId )
	{
		YCFBamRoleDefByScopeIdxKey key = schema.getFactoryRoleDef().newScopeIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredScopeId( argScopeId );
		deleteSchemaRoleByScopeIdx( Authorization, key );
	}

	public void deleteSchemaRoleByScopeIdx( YCFSecAuthorization Authorization,
		YCFBamRoleDefByScopeIdxKey argKey )
	{
		YCFBamSchemaRoleBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamSchemaRoleBuff> matchSet = new LinkedList<YCFBamSchemaRoleBuff>();
		Iterator<YCFBamSchemaRoleBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamSchemaRoleBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSchemaRole().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSchemaRole( Authorization, cur );
		}
	}

	public void deleteSchemaRoleByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamRoleDefByDefSchemaIdxKey key = schema.getFactoryRoleDef().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deleteSchemaRoleByDefSchemaIdx( Authorization, key );
	}

	public void deleteSchemaRoleByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamRoleDefByDefSchemaIdxKey argKey )
	{
		YCFBamSchemaRoleBuff cur;
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
		LinkedList<YCFBamSchemaRoleBuff> matchSet = new LinkedList<YCFBamSchemaRoleBuff>();
		Iterator<YCFBamSchemaRoleBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamSchemaRoleBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSchemaRole().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSchemaRole( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
