
// Description: Java 11 in-memory RAM DbIO implementation for Index.

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
 *	YCFBamRamIndexTable in-memory RAM DbIO implementation
 *	for Index.
 */
public class YCFBamRamIndexTable
	implements IYCFBamIndexTable
{
	private IYCFBamSchema schema;
	private Map< YCFBamScopePKey,
				YCFBamIndexBuff > dictByPKey
		= new HashMap< YCFBamScopePKey,
				YCFBamIndexBuff >();
	private Map< YCFBamIndexByUNameIdxKey,
			YCFBamIndexBuff > dictByUNameIdx
		= new HashMap< YCFBamIndexByUNameIdxKey,
			YCFBamIndexBuff >();
	private Map< YCFBamIndexByIndexTenantIdxKey,
				Map< YCFBamScopePKey,
					YCFBamIndexBuff >> dictByIndexTenantIdx
		= new HashMap< YCFBamIndexByIndexTenantIdxKey,
				Map< YCFBamScopePKey,
					YCFBamIndexBuff >>();
	private Map< YCFBamIndexByIdxTableIdxKey,
				Map< YCFBamScopePKey,
					YCFBamIndexBuff >> dictByIdxTableIdx
		= new HashMap< YCFBamIndexByIdxTableIdxKey,
				Map< YCFBamScopePKey,
					YCFBamIndexBuff >>();
	private Map< YCFBamIndexByCodeVisIdxKey,
				Map< YCFBamScopePKey,
					YCFBamIndexBuff >> dictByCodeVisIdx
		= new HashMap< YCFBamIndexByCodeVisIdxKey,
				Map< YCFBamScopePKey,
					YCFBamIndexBuff >>();
	private Map< YCFBamIndexByTableCodeVisIdxKey,
				Map< YCFBamScopePKey,
					YCFBamIndexBuff >> dictByTableCodeVisIdx
		= new HashMap< YCFBamIndexByTableCodeVisIdxKey,
				Map< YCFBamScopePKey,
					YCFBamIndexBuff >>();
	private Map< YCFBamIndexByDefSchemaIdxKey,
				Map< YCFBamScopePKey,
					YCFBamIndexBuff >> dictByDefSchemaIdx
		= new HashMap< YCFBamIndexByDefSchemaIdxKey,
				Map< YCFBamScopePKey,
					YCFBamIndexBuff >>();

	public YCFBamRamIndexTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createIndex( YCFSecAuthorization Authorization,
		YCFBamIndexBuff Buff )
	{
		final String S_ProcName = "createIndex";
		schema.getTableScope().createScope( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamIndexByUNameIdxKey keyUNameIdx = schema.getFactoryIndex().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyUNameIdx.setRequiredTableId( Buff.getRequiredTableId() );
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamIndexByIndexTenantIdxKey keyIndexTenantIdx = schema.getFactoryIndex().newIndexTenantIdxKey();
		keyIndexTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFBamIndexByIdxTableIdxKey keyIdxTableIdx = schema.getFactoryIndex().newIdxTableIdxKey();
		keyIdxTableIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyIdxTableIdx.setRequiredTableId( Buff.getRequiredTableId() );

		YCFBamIndexByCodeVisIdxKey keyCodeVisIdx = schema.getFactoryIndex().newCodeVisIdxKey();
		keyCodeVisIdx.setRequiredCodeVis( Buff.getRequiredCodeVis() );

		YCFBamIndexByTableCodeVisIdxKey keyTableCodeVisIdx = schema.getFactoryIndex().newTableCodeVisIdxKey();
		keyTableCodeVisIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyTableCodeVisIdx.setRequiredTableId( Buff.getRequiredTableId() );
		keyTableCodeVisIdx.setRequiredCodeVis( Buff.getRequiredCodeVis() );

		YCFBamIndexByDefSchemaIdxKey keyDefSchemaIdx = schema.getFactoryIndex().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( Buff.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( Buff.getOptionalDefSchemaId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"IndexUNameIdx",
				keyUNameIdx );
		}

		// Validate foreign keys

		{
			boolean allNull = true;
			allNull = false;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableScope().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Superclass",
						"SuperClass",
						"Scope",
						null );
				}
			}
		}

		{
			boolean allNull = true;
			allNull = false;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableTable().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredTableId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"Table",
						"Table",
						null );
				}
			}
		}

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
						"IndexTenant",
						"Tenant",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

		Map< YCFBamScopePKey, YCFBamIndexBuff > subdictIndexTenantIdx;
		if( dictByIndexTenantIdx.containsKey( keyIndexTenantIdx ) ) {
			subdictIndexTenantIdx = dictByIndexTenantIdx.get( keyIndexTenantIdx );
		}
		else {
			subdictIndexTenantIdx = new HashMap< YCFBamScopePKey, YCFBamIndexBuff >();
			dictByIndexTenantIdx.put( keyIndexTenantIdx, subdictIndexTenantIdx );
		}
		subdictIndexTenantIdx.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamIndexBuff > subdictIdxTableIdx;
		if( dictByIdxTableIdx.containsKey( keyIdxTableIdx ) ) {
			subdictIdxTableIdx = dictByIdxTableIdx.get( keyIdxTableIdx );
		}
		else {
			subdictIdxTableIdx = new HashMap< YCFBamScopePKey, YCFBamIndexBuff >();
			dictByIdxTableIdx.put( keyIdxTableIdx, subdictIdxTableIdx );
		}
		subdictIdxTableIdx.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamIndexBuff > subdictCodeVisIdx;
		if( dictByCodeVisIdx.containsKey( keyCodeVisIdx ) ) {
			subdictCodeVisIdx = dictByCodeVisIdx.get( keyCodeVisIdx );
		}
		else {
			subdictCodeVisIdx = new HashMap< YCFBamScopePKey, YCFBamIndexBuff >();
			dictByCodeVisIdx.put( keyCodeVisIdx, subdictCodeVisIdx );
		}
		subdictCodeVisIdx.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamIndexBuff > subdictTableCodeVisIdx;
		if( dictByTableCodeVisIdx.containsKey( keyTableCodeVisIdx ) ) {
			subdictTableCodeVisIdx = dictByTableCodeVisIdx.get( keyTableCodeVisIdx );
		}
		else {
			subdictTableCodeVisIdx = new HashMap< YCFBamScopePKey, YCFBamIndexBuff >();
			dictByTableCodeVisIdx.put( keyTableCodeVisIdx, subdictTableCodeVisIdx );
		}
		subdictTableCodeVisIdx.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamIndexBuff > subdictDefSchemaIdx;
		if( dictByDefSchemaIdx.containsKey( keyDefSchemaIdx ) ) {
			subdictDefSchemaIdx = dictByDefSchemaIdx.get( keyDefSchemaIdx );
		}
		else {
			subdictDefSchemaIdx = new HashMap< YCFBamScopePKey, YCFBamIndexBuff >();
			dictByDefSchemaIdx.put( keyDefSchemaIdx, subdictDefSchemaIdx );
		}
		subdictDefSchemaIdx.put( pkey, Buff );

	}

	public YCFBamIndexBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamIndex.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamIndexBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamIndexBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamIndex.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamIndexBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamIndexBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamIndex.readAllDerived";
		YCFBamIndexBuff[] retList = new YCFBamIndexBuff[ dictByPKey.values().size() ];
		Iterator< YCFBamIndexBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamIndexBuff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamScope.readDerivedByTenantIdx";
		YCFBamScopeBuff buffList[] = schema.getTableScope().readDerivedByTenantIdx( Authorization,
			TenantId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFBamScopeBuff buff;
			ArrayList<YCFBamIndexBuff> filteredList = new ArrayList<YCFBamIndexBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamIndexBuff ) ) {
					filteredList.add( (YCFBamIndexBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamIndexBuff[0] ) );
		}
	}

	public YCFBamIndexBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamIndex.readDerivedByUNameIdx";
		YCFBamIndexByUNameIdxKey key = schema.getFactoryIndex().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );

		YCFBamIndexBuff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamIndexBuff[] readDerivedByIndexTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamIndex.readDerivedByIndexTenantIdx";
		YCFBamIndexByIndexTenantIdxKey key = schema.getFactoryIndex().newIndexTenantIdxKey();
		key.setRequiredTenantId( TenantId );

		YCFBamIndexBuff[] recArray;
		if( dictByIndexTenantIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamIndexBuff > subdictIndexTenantIdx
				= dictByIndexTenantIdx.get( key );
			recArray = new YCFBamIndexBuff[ subdictIndexTenantIdx.size() ];
			Iterator< YCFBamIndexBuff > iter = subdictIndexTenantIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamIndexBuff > subdictIndexTenantIdx
				= new HashMap< YCFBamScopePKey, YCFBamIndexBuff >();
			dictByIndexTenantIdx.put( key, subdictIndexTenantIdx );
			recArray = new YCFBamIndexBuff[0];
		}
		return( recArray );
	}

	public YCFBamIndexBuff[] readDerivedByIdxTableIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId )
	{
		final String S_ProcName = "YCFBamRamIndex.readDerivedByIdxTableIdx";
		YCFBamIndexByIdxTableIdxKey key = schema.getFactoryIndex().newIdxTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );

		YCFBamIndexBuff[] recArray;
		if( dictByIdxTableIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamIndexBuff > subdictIdxTableIdx
				= dictByIdxTableIdx.get( key );
			recArray = new YCFBamIndexBuff[ subdictIdxTableIdx.size() ];
			Iterator< YCFBamIndexBuff > iter = subdictIdxTableIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamIndexBuff > subdictIdxTableIdx
				= new HashMap< YCFBamScopePKey, YCFBamIndexBuff >();
			dictByIdxTableIdx.put( key, subdictIdxTableIdx );
			recArray = new YCFBamIndexBuff[0];
		}
		return( recArray );
	}

	public YCFBamIndexBuff[] readDerivedByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "YCFBamRamIndex.readDerivedByCodeVisIdx";
		YCFBamIndexByCodeVisIdxKey key = schema.getFactoryIndex().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );

		YCFBamIndexBuff[] recArray;
		if( dictByCodeVisIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamIndexBuff > subdictCodeVisIdx
				= dictByCodeVisIdx.get( key );
			recArray = new YCFBamIndexBuff[ subdictCodeVisIdx.size() ];
			Iterator< YCFBamIndexBuff > iter = subdictCodeVisIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamIndexBuff > subdictCodeVisIdx
				= new HashMap< YCFBamScopePKey, YCFBamIndexBuff >();
			dictByCodeVisIdx.put( key, subdictCodeVisIdx );
			recArray = new YCFBamIndexBuff[0];
		}
		return( recArray );
	}

	public YCFBamIndexBuff[] readDerivedByTableCodeVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "YCFBamRamIndex.readDerivedByTableCodeVisIdx";
		YCFBamIndexByTableCodeVisIdxKey key = schema.getFactoryIndex().newTableCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredCodeVis( CodeVis );

		YCFBamIndexBuff[] recArray;
		if( dictByTableCodeVisIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamIndexBuff > subdictTableCodeVisIdx
				= dictByTableCodeVisIdx.get( key );
			recArray = new YCFBamIndexBuff[ subdictTableCodeVisIdx.size() ];
			Iterator< YCFBamIndexBuff > iter = subdictTableCodeVisIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamIndexBuff > subdictTableCodeVisIdx
				= new HashMap< YCFBamScopePKey, YCFBamIndexBuff >();
			dictByTableCodeVisIdx.put( key, subdictTableCodeVisIdx );
			recArray = new YCFBamIndexBuff[0];
		}
		return( recArray );
	}

	public YCFBamIndexBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamIndex.readDerivedByDefSchemaIdx";
		YCFBamIndexByDefSchemaIdxKey key = schema.getFactoryIndex().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );

		YCFBamIndexBuff[] recArray;
		if( dictByDefSchemaIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamIndexBuff > subdictDefSchemaIdx
				= dictByDefSchemaIdx.get( key );
			recArray = new YCFBamIndexBuff[ subdictDefSchemaIdx.size() ];
			Iterator< YCFBamIndexBuff > iter = subdictDefSchemaIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamIndexBuff > subdictDefSchemaIdx
				= new HashMap< YCFBamScopePKey, YCFBamIndexBuff >();
			dictByDefSchemaIdx.put( key, subdictDefSchemaIdx );
			recArray = new YCFBamIndexBuff[0];
		}
		return( recArray );
	}

	public YCFBamIndexBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readDerivedByIdIdx() ";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamIndexBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamIndexBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamIndex.readBuff";
		YCFBamIndexBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a824" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamIndexBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamIndexBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a824" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamIndexBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamIndex.readAllBuff";
		YCFBamIndexBuff buff;
		ArrayList<YCFBamIndexBuff> filteredList = new ArrayList<YCFBamIndexBuff>();
		YCFBamIndexBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a824" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamIndexBuff[0] ) );
	}

	public YCFBamIndexBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByIdIdx() ";
		YCFBamIndexBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
			return( (YCFBamIndexBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamIndexBuff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByTenantIdx() ";
		YCFBamIndexBuff buff;
		ArrayList<YCFBamIndexBuff> filteredList = new ArrayList<YCFBamIndexBuff>();
		YCFBamIndexBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
				filteredList.add( (YCFBamIndexBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamIndexBuff[0] ) );
	}

	public YCFBamIndexBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamIndex.readBuffByUNameIdx() ";
		YCFBamIndexBuff buff = readDerivedByUNameIdx( Authorization,
			TenantId,
			TableId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a824" ) ) {
			return( (YCFBamIndexBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamIndexBuff[] readBuffByIndexTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamIndex.readBuffByIndexTenantIdx() ";
		YCFBamIndexBuff buff;
		ArrayList<YCFBamIndexBuff> filteredList = new ArrayList<YCFBamIndexBuff>();
		YCFBamIndexBuff[] buffList = readDerivedByIndexTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a824" ) ) {
				filteredList.add( (YCFBamIndexBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamIndexBuff[0] ) );
	}

	public YCFBamIndexBuff[] readBuffByIdxTableIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId )
	{
		final String S_ProcName = "YCFBamRamIndex.readBuffByIdxTableIdx() ";
		YCFBamIndexBuff buff;
		ArrayList<YCFBamIndexBuff> filteredList = new ArrayList<YCFBamIndexBuff>();
		YCFBamIndexBuff[] buffList = readDerivedByIdxTableIdx( Authorization,
			TenantId,
			TableId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a824" ) ) {
				filteredList.add( (YCFBamIndexBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamIndexBuff[0] ) );
	}

	public YCFBamIndexBuff[] readBuffByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "YCFBamRamIndex.readBuffByCodeVisIdx() ";
		YCFBamIndexBuff buff;
		ArrayList<YCFBamIndexBuff> filteredList = new ArrayList<YCFBamIndexBuff>();
		YCFBamIndexBuff[] buffList = readDerivedByCodeVisIdx( Authorization,
			CodeVis );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a824" ) ) {
				filteredList.add( (YCFBamIndexBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamIndexBuff[0] ) );
	}

	public YCFBamIndexBuff[] readBuffByTableCodeVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "YCFBamRamIndex.readBuffByTableCodeVisIdx() ";
		YCFBamIndexBuff buff;
		ArrayList<YCFBamIndexBuff> filteredList = new ArrayList<YCFBamIndexBuff>();
		YCFBamIndexBuff[] buffList = readDerivedByTableCodeVisIdx( Authorization,
			TenantId,
			TableId,
			CodeVis );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a824" ) ) {
				filteredList.add( (YCFBamIndexBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamIndexBuff[0] ) );
	}

	public YCFBamIndexBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamIndex.readBuffByDefSchemaIdx() ";
		YCFBamIndexBuff buff;
		ArrayList<YCFBamIndexBuff> filteredList = new ArrayList<YCFBamIndexBuff>();
		YCFBamIndexBuff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a824" ) ) {
				filteredList.add( (YCFBamIndexBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamIndexBuff[0] ) );
	}

	/**
	 *	Read a page array of the specific Index buffer instances identified by the duplicate key IndexTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamIndexBuff[] pageBuffByIndexTenantIdx( YCFSecAuthorization Authorization,
		long TenantId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByIndexTenantIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific Index buffer instances identified by the duplicate key IdxTableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Index key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamIndexBuff[] pageBuffByIdxTableIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByIdxTableIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific Index buffer instances identified by the duplicate key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argCodeVis	The Index key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamIndexBuff[] pageBuffByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByCodeVisIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific Index buffer instances identified by the duplicate key TableCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Index key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamIndexBuff[] pageBuffByTableCodeVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByTableCodeVisIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific Index buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Index key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamIndexBuff[] pageBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByDefSchemaIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateIndex( YCFSecAuthorization Authorization,
		YCFBamIndexBuff Buff )
	{
		schema.getTableScope().updateScope( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamIndexBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateIndex",
				"Existing record not found",
				"Index",
				pkey );
		}
		YCFBamIndexByUNameIdxKey existingKeyUNameIdx = schema.getFactoryIndex().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyUNameIdx.setRequiredTableId( existing.getRequiredTableId() );
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamIndexByUNameIdxKey newKeyUNameIdx = schema.getFactoryIndex().newUNameIdxKey();
		newKeyUNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyUNameIdx.setRequiredTableId( Buff.getRequiredTableId() );
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamIndexByIndexTenantIdxKey existingKeyIndexTenantIdx = schema.getFactoryIndex().newIndexTenantIdxKey();
		existingKeyIndexTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFBamIndexByIndexTenantIdxKey newKeyIndexTenantIdx = schema.getFactoryIndex().newIndexTenantIdxKey();
		newKeyIndexTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFBamIndexByIdxTableIdxKey existingKeyIdxTableIdx = schema.getFactoryIndex().newIdxTableIdxKey();
		existingKeyIdxTableIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyIdxTableIdx.setRequiredTableId( existing.getRequiredTableId() );

		YCFBamIndexByIdxTableIdxKey newKeyIdxTableIdx = schema.getFactoryIndex().newIdxTableIdxKey();
		newKeyIdxTableIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyIdxTableIdx.setRequiredTableId( Buff.getRequiredTableId() );

		YCFBamIndexByCodeVisIdxKey existingKeyCodeVisIdx = schema.getFactoryIndex().newCodeVisIdxKey();
		existingKeyCodeVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		YCFBamIndexByCodeVisIdxKey newKeyCodeVisIdx = schema.getFactoryIndex().newCodeVisIdxKey();
		newKeyCodeVisIdx.setRequiredCodeVis( Buff.getRequiredCodeVis() );

		YCFBamIndexByTableCodeVisIdxKey existingKeyTableCodeVisIdx = schema.getFactoryIndex().newTableCodeVisIdxKey();
		existingKeyTableCodeVisIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyTableCodeVisIdx.setRequiredTableId( existing.getRequiredTableId() );
		existingKeyTableCodeVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		YCFBamIndexByTableCodeVisIdxKey newKeyTableCodeVisIdx = schema.getFactoryIndex().newTableCodeVisIdxKey();
		newKeyTableCodeVisIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyTableCodeVisIdx.setRequiredTableId( Buff.getRequiredTableId() );
		newKeyTableCodeVisIdx.setRequiredCodeVis( Buff.getRequiredCodeVis() );

		YCFBamIndexByDefSchemaIdxKey existingKeyDefSchemaIdx = schema.getFactoryIndex().newDefSchemaIdxKey();
		existingKeyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		existingKeyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		YCFBamIndexByDefSchemaIdxKey newKeyDefSchemaIdx = schema.getFactoryIndex().newDefSchemaIdxKey();
		newKeyDefSchemaIdx.setOptionalDefSchemaTenantId( Buff.getOptionalDefSchemaTenantId() );
		newKeyDefSchemaIdx.setOptionalDefSchemaId( Buff.getOptionalDefSchemaId() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateIndex",
					"IndexUNameIdx",
					newKeyUNameIdx );
			}
		}

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableScope().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateIndex",
						"Superclass",
						"SuperClass",
						"Scope",
						null );
				}
			}
		}

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableTable().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredTableId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateIndex",
						"Container",
						"Table",
						"Table",
						null );
				}
			}
		}

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableTenant().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateIndex",
						"Owner",
						"IndexTenant",
						"Tenant",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamScopePKey, YCFBamIndexBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

		subdict = dictByIndexTenantIdx.get( existingKeyIndexTenantIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByIndexTenantIdx.containsKey( newKeyIndexTenantIdx ) ) {
			subdict = dictByIndexTenantIdx.get( newKeyIndexTenantIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamIndexBuff >();
			dictByIndexTenantIdx.put( newKeyIndexTenantIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByIdxTableIdx.get( existingKeyIdxTableIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByIdxTableIdx.containsKey( newKeyIdxTableIdx ) ) {
			subdict = dictByIdxTableIdx.get( newKeyIdxTableIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamIndexBuff >();
			dictByIdxTableIdx.put( newKeyIdxTableIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByCodeVisIdx.get( existingKeyCodeVisIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByCodeVisIdx.containsKey( newKeyCodeVisIdx ) ) {
			subdict = dictByCodeVisIdx.get( newKeyCodeVisIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamIndexBuff >();
			dictByCodeVisIdx.put( newKeyCodeVisIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByTableCodeVisIdx.get( existingKeyTableCodeVisIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByTableCodeVisIdx.containsKey( newKeyTableCodeVisIdx ) ) {
			subdict = dictByTableCodeVisIdx.get( newKeyTableCodeVisIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamIndexBuff >();
			dictByTableCodeVisIdx.put( newKeyTableCodeVisIdx, subdict );
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
			subdict = new HashMap< YCFBamScopePKey, YCFBamIndexBuff >();
			dictByDefSchemaIdx.put( newKeyDefSchemaIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteIndex( YCFSecAuthorization Authorization,
		YCFBamIndexBuff Buff )
	{
		final String S_ProcName = "YCFBamRamIndexTable.deleteIndex() ";
		String classCode;
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamIndexBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteIndex",
				pkey );
		}
		YCFBamIndexColBuff buffDelIndexRefRelFromCols;
		YCFBamIndexColBuff arrDelIndexRefRelFromCols[] = schema.getTableIndexCol().readDerivedByIndexIdx( Authorization,
			existing.getRequiredTenantId(),
			existing.getRequiredId() );
		for( int idxDelIndexRefRelFromCols = 0; idxDelIndexRefRelFromCols < arrDelIndexRefRelFromCols.length; idxDelIndexRefRelFromCols++ ) {
			buffDelIndexRefRelFromCols = arrDelIndexRefRelFromCols[idxDelIndexRefRelFromCols];
					schema.getTableRelationCol().deleteRelationColByFromColIdx( Authorization,
						buffDelIndexRefRelFromCols.getRequiredTenantId(),
						buffDelIndexRefRelFromCols.getRequiredId() );
		}
		YCFBamIndexColBuff buffDelIndexRefRelToCols;
		YCFBamIndexColBuff arrDelIndexRefRelToCols[] = schema.getTableIndexCol().readDerivedByIndexIdx( Authorization,
			existing.getRequiredTenantId(),
			existing.getRequiredId() );
		for( int idxDelIndexRefRelToCols = 0; idxDelIndexRefRelToCols < arrDelIndexRefRelToCols.length; idxDelIndexRefRelToCols++ ) {
			buffDelIndexRefRelToCols = arrDelIndexRefRelToCols[idxDelIndexRefRelToCols];
					schema.getTableRelationCol().deleteRelationColByToColIdx( Authorization,
						buffDelIndexRefRelToCols.getRequiredTenantId(),
						buffDelIndexRefRelToCols.getRequiredId() );
		}
					schema.getTableIndexCol().deleteIndexColByIndexIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		YCFBamIndexByUNameIdxKey keyUNameIdx = schema.getFactoryIndex().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredTableId( existing.getRequiredTableId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamIndexByIndexTenantIdxKey keyIndexTenantIdx = schema.getFactoryIndex().newIndexTenantIdxKey();
		keyIndexTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFBamIndexByIdxTableIdxKey keyIdxTableIdx = schema.getFactoryIndex().newIdxTableIdxKey();
		keyIdxTableIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyIdxTableIdx.setRequiredTableId( existing.getRequiredTableId() );

		YCFBamIndexByCodeVisIdxKey keyCodeVisIdx = schema.getFactoryIndex().newCodeVisIdxKey();
		keyCodeVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		YCFBamIndexByTableCodeVisIdxKey keyTableCodeVisIdx = schema.getFactoryIndex().newTableCodeVisIdxKey();
		keyTableCodeVisIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyTableCodeVisIdx.setRequiredTableId( existing.getRequiredTableId() );
		keyTableCodeVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		YCFBamIndexByDefSchemaIdxKey keyDefSchemaIdx = schema.getFactoryIndex().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		// Validate reverse foreign keys

		if( schema.getTableRelation().readDerivedByFromKeyIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ).length > 0 )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteIndex",
				"Lookup",
				"FromIndex",
				"Relation",
				pkey );
		}

		if( schema.getTableRelation().readDerivedByToKeyIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ).length > 0 )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteIndex",
				"Lookup",
				"ToIndex",
				"Relation",
				pkey );
		}

		// Delete is valid
		Map< YCFBamScopePKey, YCFBamIndexBuff > subdict;

		dictByPKey.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

		subdict = dictByIndexTenantIdx.get( keyIndexTenantIdx );
		subdict.remove( pkey );

		subdict = dictByIdxTableIdx.get( keyIdxTableIdx );
		subdict.remove( pkey );

		subdict = dictByCodeVisIdx.get( keyCodeVisIdx );
		subdict.remove( pkey );

		subdict = dictByTableCodeVisIdx.get( keyTableCodeVisIdx );
		subdict.remove( pkey );

		subdict = dictByDefSchemaIdx.get( keyDefSchemaIdx );
		subdict.remove( pkey );

		schema.getTableScope().deleteScope( Authorization,
			Buff );
	}
	public void deleteIndexByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTableId,
		String argName )
	{
		YCFBamIndexByUNameIdxKey key = schema.getFactoryIndex().newUNameIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTableId( argTableId );
		key.setRequiredName( argName );
		deleteIndexByUNameIdx( Authorization, key );
	}

	public void deleteIndexByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamIndexByUNameIdxKey argKey )
	{
		YCFBamIndexBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamIndexBuff> matchSet = new LinkedList<YCFBamIndexBuff>();
		Iterator<YCFBamIndexBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamIndexBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableIndex().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteIndex( Authorization, cur );
		}
	}

	public void deleteIndexByIndexTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamIndexByIndexTenantIdxKey key = schema.getFactoryIndex().newIndexTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteIndexByIndexTenantIdx( Authorization, key );
	}

	public void deleteIndexByIndexTenantIdx( YCFSecAuthorization Authorization,
		YCFBamIndexByIndexTenantIdxKey argKey )
	{
		YCFBamIndexBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamIndexBuff> matchSet = new LinkedList<YCFBamIndexBuff>();
		Iterator<YCFBamIndexBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamIndexBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableIndex().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteIndex( Authorization, cur );
		}
	}

	public void deleteIndexByIdxTableIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTableId )
	{
		YCFBamIndexByIdxTableIdxKey key = schema.getFactoryIndex().newIdxTableIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTableId( argTableId );
		deleteIndexByIdxTableIdx( Authorization, key );
	}

	public void deleteIndexByIdxTableIdx( YCFSecAuthorization Authorization,
		YCFBamIndexByIdxTableIdxKey argKey )
	{
		YCFBamIndexBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamIndexBuff> matchSet = new LinkedList<YCFBamIndexBuff>();
		Iterator<YCFBamIndexBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamIndexBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableIndex().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteIndex( Authorization, cur );
		}
	}

	public void deleteIndexByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum argCodeVis )
	{
		YCFBamIndexByCodeVisIdxKey key = schema.getFactoryIndex().newCodeVisIdxKey();
		key.setRequiredCodeVis( argCodeVis );
		deleteIndexByCodeVisIdx( Authorization, key );
	}

	public void deleteIndexByCodeVisIdx( YCFSecAuthorization Authorization,
		YCFBamIndexByCodeVisIdxKey argKey )
	{
		YCFBamIndexBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamIndexBuff> matchSet = new LinkedList<YCFBamIndexBuff>();
		Iterator<YCFBamIndexBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamIndexBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableIndex().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteIndex( Authorization, cur );
		}
	}

	public void deleteIndexByTableCodeVisIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTableId,
		IYCFBamSchema.CodeVisibilityEnum argCodeVis )
	{
		YCFBamIndexByTableCodeVisIdxKey key = schema.getFactoryIndex().newTableCodeVisIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTableId( argTableId );
		key.setRequiredCodeVis( argCodeVis );
		deleteIndexByTableCodeVisIdx( Authorization, key );
	}

	public void deleteIndexByTableCodeVisIdx( YCFSecAuthorization Authorization,
		YCFBamIndexByTableCodeVisIdxKey argKey )
	{
		YCFBamIndexBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamIndexBuff> matchSet = new LinkedList<YCFBamIndexBuff>();
		Iterator<YCFBamIndexBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamIndexBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableIndex().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteIndex( Authorization, cur );
		}
	}

	public void deleteIndexByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamIndexByDefSchemaIdxKey key = schema.getFactoryIndex().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deleteIndexByDefSchemaIdx( Authorization, key );
	}

	public void deleteIndexByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamIndexByDefSchemaIdxKey argKey )
	{
		YCFBamIndexBuff cur;
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
		LinkedList<YCFBamIndexBuff> matchSet = new LinkedList<YCFBamIndexBuff>();
		Iterator<YCFBamIndexBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamIndexBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableIndex().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteIndex( Authorization, cur );
		}
	}

	public void deleteIndexByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteIndexByIdIdx( Authorization, key );
	}

	public void deleteIndexByIdIdx( YCFSecAuthorization Authorization,
		YCFBamScopePKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamIndexBuff cur;
		LinkedList<YCFBamIndexBuff> matchSet = new LinkedList<YCFBamIndexBuff>();
		Iterator<YCFBamIndexBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamIndexBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableIndex().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteIndex( Authorization, cur );
		}
	}

	public void deleteIndexByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamScopeByTenantIdxKey key = schema.getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteIndexByTenantIdx( Authorization, key );
	}

	public void deleteIndexByTenantIdx( YCFSecAuthorization Authorization,
		YCFBamScopeByTenantIdxKey argKey )
	{
		YCFBamIndexBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamIndexBuff> matchSet = new LinkedList<YCFBamIndexBuff>();
		Iterator<YCFBamIndexBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamIndexBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableIndex().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteIndex( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
