
// Description: Java 11 in-memory RAM DbIO implementation for SchemaTweak.

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
 *	YCFBamRamSchemaTweakTable in-memory RAM DbIO implementation
 *	for SchemaTweak.
 */
public class YCFBamRamSchemaTweakTable
	implements IYCFBamSchemaTweakTable
{
	private IYCFBamSchema schema;
	private Map< YCFBamTweakPKey,
				YCFBamSchemaTweakBuff > dictByPKey
		= new HashMap< YCFBamTweakPKey,
				YCFBamSchemaTweakBuff >();
	private Map< YCFBamSchemaTweakBySchemaIdxKey,
				Map< YCFBamTweakPKey,
					YCFBamSchemaTweakBuff >> dictBySchemaIdx
		= new HashMap< YCFBamSchemaTweakBySchemaIdxKey,
				Map< YCFBamTweakPKey,
					YCFBamSchemaTweakBuff >>();

	public YCFBamRamSchemaTweakTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createSchemaTweak( YCFSecAuthorization Authorization,
		YCFBamSchemaTweakBuff Buff )
	{
		final String S_ProcName = "createSchemaTweak";
		schema.getTableTweak().createTweak( Authorization,
			Buff );
		YCFBamTweakPKey pkey = schema.getFactoryTweak().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamSchemaTweakBySchemaIdxKey keySchemaIdx = schema.getFactorySchemaTweak().newSchemaIdxKey();
		keySchemaIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keySchemaIdx.setRequiredSchemaDefId( Buff.getRequiredSchemaDefId() );

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
				if( null == schema.getTableTweak().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Superclass",
						"SuperClass",
						"Tweak",
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

		Map< YCFBamTweakPKey, YCFBamSchemaTweakBuff > subdictSchemaIdx;
		if( dictBySchemaIdx.containsKey( keySchemaIdx ) ) {
			subdictSchemaIdx = dictBySchemaIdx.get( keySchemaIdx );
		}
		else {
			subdictSchemaIdx = new HashMap< YCFBamTweakPKey, YCFBamSchemaTweakBuff >();
			dictBySchemaIdx.put( keySchemaIdx, subdictSchemaIdx );
		}
		subdictSchemaIdx.put( pkey, Buff );

	}

	public YCFBamSchemaTweakBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamTweakPKey PKey )
	{
		final String S_ProcName = "YCFBamRamSchemaTweak.readDerived";
		YCFBamTweakPKey key = schema.getFactoryTweak().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamSchemaTweakBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamSchemaTweakBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamTweakPKey PKey )
	{
		final String S_ProcName = "YCFBamRamSchemaTweak.readDerived";
		YCFBamTweakPKey key = schema.getFactoryTweak().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamSchemaTweakBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamSchemaTweakBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamSchemaTweak.readAllDerived";
		YCFBamSchemaTweakBuff[] retList = new YCFBamSchemaTweakBuff[ dictByPKey.values().size() ];
		Iterator< YCFBamSchemaTweakBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamSchemaTweakBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamTweak.readDerivedByUNameIdx";
		YCFBamTweakBuff buff = schema.getTableTweak().readDerivedByUNameIdx( Authorization,
			TenantId,
			ScopeId,
			Name );
		if( buff == null ) {
			return( null );
		}
		else if( buff instanceof YCFBamSchemaTweakBuff ) {
			return( (YCFBamSchemaTweakBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamSchemaTweakBuff readDerivedByUDefIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamTweak.readDerivedByUDefIdx";
		YCFBamTweakBuff buff = schema.getTableTweak().readDerivedByUDefIdx( Authorization,
			TenantId,
			ScopeId,
			DefSchemaTenantId,
			DefSchemaId,
			Name );
		if( buff == null ) {
			return( null );
		}
		else if( buff instanceof YCFBamSchemaTweakBuff ) {
			return( (YCFBamSchemaTweakBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamSchemaTweakBuff[] readDerivedByValTentIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamTweak.readDerivedByValTentIdx";
		YCFBamTweakBuff buffList[] = schema.getTableTweak().readDerivedByValTentIdx( Authorization,
			TenantId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFBamTweakBuff buff;
			ArrayList<YCFBamSchemaTweakBuff> filteredList = new ArrayList<YCFBamSchemaTweakBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamSchemaTweakBuff ) ) {
					filteredList.add( (YCFBamSchemaTweakBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamSchemaTweakBuff[0] ) );
		}
	}

	public YCFBamSchemaTweakBuff[] readDerivedByScopeIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "YCFBamRamTweak.readDerivedByScopeIdx";
		YCFBamTweakBuff buffList[] = schema.getTableTweak().readDerivedByScopeIdx( Authorization,
			TenantId,
			ScopeId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFBamTweakBuff buff;
			ArrayList<YCFBamSchemaTweakBuff> filteredList = new ArrayList<YCFBamSchemaTweakBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamSchemaTweakBuff ) ) {
					filteredList.add( (YCFBamSchemaTweakBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamSchemaTweakBuff[0] ) );
		}
	}

	public YCFBamSchemaTweakBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamTweak.readDerivedByDefSchemaIdx";
		YCFBamTweakBuff buffList[] = schema.getTableTweak().readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFBamTweakBuff buff;
			ArrayList<YCFBamSchemaTweakBuff> filteredList = new ArrayList<YCFBamSchemaTweakBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamSchemaTweakBuff ) ) {
					filteredList.add( (YCFBamSchemaTweakBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamSchemaTweakBuff[0] ) );
		}
	}

	public YCFBamSchemaTweakBuff[] readDerivedBySchemaIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId )
	{
		final String S_ProcName = "YCFBamRamSchemaTweak.readDerivedBySchemaIdx";
		YCFBamSchemaTweakBySchemaIdxKey key = schema.getFactorySchemaTweak().newSchemaIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );

		YCFBamSchemaTweakBuff[] recArray;
		if( dictBySchemaIdx.containsKey( key ) ) {
			Map< YCFBamTweakPKey, YCFBamSchemaTweakBuff > subdictSchemaIdx
				= dictBySchemaIdx.get( key );
			recArray = new YCFBamSchemaTweakBuff[ subdictSchemaIdx.size() ];
			Iterator< YCFBamSchemaTweakBuff > iter = subdictSchemaIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamTweakPKey, YCFBamSchemaTweakBuff > subdictSchemaIdx
				= new HashMap< YCFBamTweakPKey, YCFBamSchemaTweakBuff >();
			dictBySchemaIdx.put( key, subdictSchemaIdx );
			recArray = new YCFBamSchemaTweakBuff[0];
		}
		return( recArray );
	}

	public YCFBamSchemaTweakBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamTweak.readDerivedByIdIdx() ";
		YCFBamTweakPKey key = schema.getFactoryTweak().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamSchemaTweakBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamSchemaTweakBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamTweakPKey PKey )
	{
		final String S_ProcName = "YCFBamRamSchemaTweak.readBuff";
		YCFBamSchemaTweakBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a80a" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamSchemaTweakBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamTweakPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamSchemaTweakBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a80a" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamSchemaTweakBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamSchemaTweak.readAllBuff";
		YCFBamSchemaTweakBuff buff;
		ArrayList<YCFBamSchemaTweakBuff> filteredList = new ArrayList<YCFBamSchemaTweakBuff>();
		YCFBamSchemaTweakBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a80a" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamSchemaTweakBuff[0] ) );
	}

	public YCFBamSchemaTweakBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamTweak.readBuffByIdIdx() ";
		YCFBamSchemaTweakBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a808" ) ) {
			return( (YCFBamSchemaTweakBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamSchemaTweakBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamTweak.readBuffByUNameIdx() ";
		YCFBamSchemaTweakBuff buff = readDerivedByUNameIdx( Authorization,
			TenantId,
			ScopeId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a808" ) ) {
			return( (YCFBamSchemaTweakBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamSchemaTweakBuff readBuffByUDefIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamTweak.readBuffByUDefIdx() ";
		YCFBamSchemaTweakBuff buff = readDerivedByUDefIdx( Authorization,
			TenantId,
			ScopeId,
			DefSchemaTenantId,
			DefSchemaId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a808" ) ) {
			return( (YCFBamSchemaTweakBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamSchemaTweakBuff[] readBuffByValTentIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamTweak.readBuffByValTentIdx() ";
		YCFBamSchemaTweakBuff buff;
		ArrayList<YCFBamSchemaTweakBuff> filteredList = new ArrayList<YCFBamSchemaTweakBuff>();
		YCFBamSchemaTweakBuff[] buffList = readDerivedByValTentIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a808" ) ) {
				filteredList.add( (YCFBamSchemaTweakBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamSchemaTweakBuff[0] ) );
	}

	public YCFBamSchemaTweakBuff[] readBuffByScopeIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "YCFBamRamTweak.readBuffByScopeIdx() ";
		YCFBamSchemaTweakBuff buff;
		ArrayList<YCFBamSchemaTweakBuff> filteredList = new ArrayList<YCFBamSchemaTweakBuff>();
		YCFBamSchemaTweakBuff[] buffList = readDerivedByScopeIdx( Authorization,
			TenantId,
			ScopeId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a808" ) ) {
				filteredList.add( (YCFBamSchemaTweakBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamSchemaTweakBuff[0] ) );
	}

	public YCFBamSchemaTweakBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamTweak.readBuffByDefSchemaIdx() ";
		YCFBamSchemaTweakBuff buff;
		ArrayList<YCFBamSchemaTweakBuff> filteredList = new ArrayList<YCFBamSchemaTweakBuff>();
		YCFBamSchemaTweakBuff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a808" ) ) {
				filteredList.add( (YCFBamSchemaTweakBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamSchemaTweakBuff[0] ) );
	}

	public YCFBamSchemaTweakBuff[] readBuffBySchemaIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId )
	{
		final String S_ProcName = "YCFBamRamSchemaTweak.readBuffBySchemaIdx() ";
		YCFBamSchemaTweakBuff buff;
		ArrayList<YCFBamSchemaTweakBuff> filteredList = new ArrayList<YCFBamSchemaTweakBuff>();
		YCFBamSchemaTweakBuff[] buffList = readDerivedBySchemaIdx( Authorization,
			TenantId,
			SchemaDefId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a80a" ) ) {
				filteredList.add( (YCFBamSchemaTweakBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamSchemaTweakBuff[0] ) );
	}

	/**
	 *	Read a page array of the specific SchemaTweak buffer instances identified by the duplicate key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamSchemaTweakBuff[] pageBuffBySchemaIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffBySchemaIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateSchemaTweak( YCFSecAuthorization Authorization,
		YCFBamSchemaTweakBuff Buff )
	{
		schema.getTableTweak().updateTweak( Authorization,
			Buff );
		YCFBamTweakPKey pkey = schema.getFactoryTweak().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamSchemaTweakBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateSchemaTweak",
				"Existing record not found",
				"SchemaTweak",
				pkey );
		}
		YCFBamSchemaTweakBySchemaIdxKey existingKeySchemaIdx = schema.getFactorySchemaTweak().newSchemaIdxKey();
		existingKeySchemaIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeySchemaIdx.setRequiredSchemaDefId( existing.getRequiredSchemaDefId() );

		YCFBamSchemaTweakBySchemaIdxKey newKeySchemaIdx = schema.getFactorySchemaTweak().newSchemaIdxKey();
		newKeySchemaIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeySchemaIdx.setRequiredSchemaDefId( Buff.getRequiredSchemaDefId() );

		// Check unique indexes

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableTweak().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateSchemaTweak",
						"Superclass",
						"SuperClass",
						"Tweak",
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
						"updateSchemaTweak",
						"Container",
						"Schema",
						"SchemaDef",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamTweakPKey, YCFBamSchemaTweakBuff > subdict;

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
			subdict = new HashMap< YCFBamTweakPKey, YCFBamSchemaTweakBuff >();
			dictBySchemaIdx.put( newKeySchemaIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteSchemaTweak( YCFSecAuthorization Authorization,
		YCFBamSchemaTweakBuff Buff )
	{
		final String S_ProcName = "YCFBamRamSchemaTweakTable.deleteSchemaTweak() ";
		String classCode;
		YCFBamTweakPKey pkey = schema.getFactoryTweak().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamSchemaTweakBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteSchemaTweak",
				pkey );
		}
		YCFBamSchemaTweakBySchemaIdxKey keySchemaIdx = schema.getFactorySchemaTweak().newSchemaIdxKey();
		keySchemaIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keySchemaIdx.setRequiredSchemaDefId( existing.getRequiredSchemaDefId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFBamTweakPKey, YCFBamSchemaTweakBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictBySchemaIdx.get( keySchemaIdx );
		subdict.remove( pkey );

		schema.getTableTweak().deleteTweak( Authorization,
			Buff );
	}
	public void deleteSchemaTweakBySchemaIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argSchemaDefId )
	{
		YCFBamSchemaTweakBySchemaIdxKey key = schema.getFactorySchemaTweak().newSchemaIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredSchemaDefId( argSchemaDefId );
		deleteSchemaTweakBySchemaIdx( Authorization, key );
	}

	public void deleteSchemaTweakBySchemaIdx( YCFSecAuthorization Authorization,
		YCFBamSchemaTweakBySchemaIdxKey argKey )
	{
		YCFBamSchemaTweakBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamSchemaTweakBuff> matchSet = new LinkedList<YCFBamSchemaTweakBuff>();
		Iterator<YCFBamSchemaTweakBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamSchemaTweakBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSchemaTweak().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSchemaTweak( Authorization, cur );
		}
	}

	public void deleteSchemaTweakByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamTweakPKey key = schema.getFactoryTweak().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteSchemaTweakByIdIdx( Authorization, key );
	}

	public void deleteSchemaTweakByIdIdx( YCFSecAuthorization Authorization,
		YCFBamTweakPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamSchemaTweakBuff cur;
		LinkedList<YCFBamSchemaTweakBuff> matchSet = new LinkedList<YCFBamSchemaTweakBuff>();
		Iterator<YCFBamSchemaTweakBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamSchemaTweakBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSchemaTweak().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSchemaTweak( Authorization, cur );
		}
	}

	public void deleteSchemaTweakByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		String argName )
	{
		YCFBamTweakByUNameIdxKey key = schema.getFactoryTweak().newUNameIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredScopeId( argScopeId );
		key.setRequiredName( argName );
		deleteSchemaTweakByUNameIdx( Authorization, key );
	}

	public void deleteSchemaTweakByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamTweakByUNameIdxKey argKey )
	{
		YCFBamSchemaTweakBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamSchemaTweakBuff> matchSet = new LinkedList<YCFBamSchemaTweakBuff>();
		Iterator<YCFBamSchemaTweakBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamSchemaTweakBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSchemaTweak().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSchemaTweak( Authorization, cur );
		}
	}

	public void deleteSchemaTweakByUDefIdx( YCFSecAuthorization Authorization,
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
		deleteSchemaTweakByUDefIdx( Authorization, key );
	}

	public void deleteSchemaTweakByUDefIdx( YCFSecAuthorization Authorization,
		YCFBamTweakByUDefIdxKey argKey )
	{
		YCFBamSchemaTweakBuff cur;
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
		LinkedList<YCFBamSchemaTweakBuff> matchSet = new LinkedList<YCFBamSchemaTweakBuff>();
		Iterator<YCFBamSchemaTweakBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamSchemaTweakBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSchemaTweak().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSchemaTweak( Authorization, cur );
		}
	}

	public void deleteSchemaTweakByValTentIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamTweakByValTentIdxKey key = schema.getFactoryTweak().newValTentIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteSchemaTweakByValTentIdx( Authorization, key );
	}

	public void deleteSchemaTweakByValTentIdx( YCFSecAuthorization Authorization,
		YCFBamTweakByValTentIdxKey argKey )
	{
		YCFBamSchemaTweakBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamSchemaTweakBuff> matchSet = new LinkedList<YCFBamSchemaTweakBuff>();
		Iterator<YCFBamSchemaTweakBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamSchemaTweakBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSchemaTweak().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSchemaTweak( Authorization, cur );
		}
	}

	public void deleteSchemaTweakByScopeIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId )
	{
		YCFBamTweakByScopeIdxKey key = schema.getFactoryTweak().newScopeIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredScopeId( argScopeId );
		deleteSchemaTweakByScopeIdx( Authorization, key );
	}

	public void deleteSchemaTweakByScopeIdx( YCFSecAuthorization Authorization,
		YCFBamTweakByScopeIdxKey argKey )
	{
		YCFBamSchemaTweakBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamSchemaTweakBuff> matchSet = new LinkedList<YCFBamSchemaTweakBuff>();
		Iterator<YCFBamSchemaTweakBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamSchemaTweakBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSchemaTweak().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSchemaTweak( Authorization, cur );
		}
	}

	public void deleteSchemaTweakByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamTweakByDefSchemaIdxKey key = schema.getFactoryTweak().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deleteSchemaTweakByDefSchemaIdx( Authorization, key );
	}

	public void deleteSchemaTweakByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamTweakByDefSchemaIdxKey argKey )
	{
		YCFBamSchemaTweakBuff cur;
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
		LinkedList<YCFBamSchemaTweakBuff> matchSet = new LinkedList<YCFBamSchemaTweakBuff>();
		Iterator<YCFBamSchemaTweakBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamSchemaTweakBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSchemaTweak().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSchemaTweak( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
