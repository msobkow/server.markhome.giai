
// Description: Java 11 in-memory RAM DbIO implementation for Table.

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
 *	YCFBamRamTableTable in-memory RAM DbIO implementation
 *	for Table.
 */
public class YCFBamRamTableTable
	implements IYCFBamTableTable
{
	private IYCFBamSchema schema;
	private Map< YCFBamScopePKey,
				YCFBamTableBuff > dictByPKey
		= new HashMap< YCFBamScopePKey,
				YCFBamTableBuff >();
	private Map< YCFBamTableBySchemaDefIdxKey,
				Map< YCFBamScopePKey,
					YCFBamTableBuff >> dictBySchemaDefIdx
		= new HashMap< YCFBamTableBySchemaDefIdxKey,
				Map< YCFBamScopePKey,
					YCFBamTableBuff >>();
	private Map< YCFBamTableByCodeVisIdxKey,
				Map< YCFBamScopePKey,
					YCFBamTableBuff >> dictByCodeVisIdx
		= new HashMap< YCFBamTableByCodeVisIdxKey,
				Map< YCFBamScopePKey,
					YCFBamTableBuff >>();
	private Map< YCFBamTableBySchemaCodeVisIdxKey,
				Map< YCFBamScopePKey,
					YCFBamTableBuff >> dictBySchemaCodeVisIdx
		= new HashMap< YCFBamTableBySchemaCodeVisIdxKey,
				Map< YCFBamScopePKey,
					YCFBamTableBuff >>();
	private Map< YCFBamTableByDefSchemaIdxKey,
				Map< YCFBamScopePKey,
					YCFBamTableBuff >> dictByDefSchemaIdx
		= new HashMap< YCFBamTableByDefSchemaIdxKey,
				Map< YCFBamScopePKey,
					YCFBamTableBuff >>();
	private Map< YCFBamTableByUNameIdxKey,
			YCFBamTableBuff > dictByUNameIdx
		= new HashMap< YCFBamTableByUNameIdxKey,
			YCFBamTableBuff >();
	private Map< YCFBamTableBySchemaCdIdxKey,
			YCFBamTableBuff > dictBySchemaCdIdx
		= new HashMap< YCFBamTableBySchemaCdIdxKey,
			YCFBamTableBuff >();
	private Map< YCFBamTableByPrimaryIndexIdxKey,
				Map< YCFBamScopePKey,
					YCFBamTableBuff >> dictByPrimaryIndexIdx
		= new HashMap< YCFBamTableByPrimaryIndexIdxKey,
				Map< YCFBamScopePKey,
					YCFBamTableBuff >>();
	private Map< YCFBamTableByLookupIndexIdxKey,
				Map< YCFBamScopePKey,
					YCFBamTableBuff >> dictByLookupIndexIdx
		= new HashMap< YCFBamTableByLookupIndexIdxKey,
				Map< YCFBamScopePKey,
					YCFBamTableBuff >>();
	private Map< YCFBamTableByAltIndexIdxKey,
				Map< YCFBamScopePKey,
					YCFBamTableBuff >> dictByAltIndexIdx
		= new HashMap< YCFBamTableByAltIndexIdxKey,
				Map< YCFBamScopePKey,
					YCFBamTableBuff >>();
	private Map< YCFBamTableByQualTableIdxKey,
				Map< YCFBamScopePKey,
					YCFBamTableBuff >> dictByQualTableIdx
		= new HashMap< YCFBamTableByQualTableIdxKey,
				Map< YCFBamScopePKey,
					YCFBamTableBuff >>();

	public YCFBamRamTableTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createTable( YCFSecAuthorization Authorization,
		YCFBamTableBuff Buff )
	{
		final String S_ProcName = "createTable";
		schema.getTableScope().createScope( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamTableBySchemaDefIdxKey keySchemaDefIdx = schema.getFactoryTable().newSchemaDefIdxKey();
		keySchemaDefIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keySchemaDefIdx.setRequiredSchemaDefId( Buff.getRequiredSchemaDefId() );

		YCFBamTableByCodeVisIdxKey keyCodeVisIdx = schema.getFactoryTable().newCodeVisIdxKey();
		keyCodeVisIdx.setRequiredCodeVis( Buff.getRequiredCodeVis() );

		YCFBamTableBySchemaCodeVisIdxKey keySchemaCodeVisIdx = schema.getFactoryTable().newSchemaCodeVisIdxKey();
		keySchemaCodeVisIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keySchemaCodeVisIdx.setRequiredSchemaDefId( Buff.getRequiredSchemaDefId() );
		keySchemaCodeVisIdx.setRequiredCodeVis( Buff.getRequiredCodeVis() );

		YCFBamTableByDefSchemaIdxKey keyDefSchemaIdx = schema.getFactoryTable().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( Buff.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( Buff.getOptionalDefSchemaId() );

		YCFBamTableByUNameIdxKey keyUNameIdx = schema.getFactoryTable().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyUNameIdx.setRequiredSchemaDefId( Buff.getRequiredSchemaDefId() );
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamTableBySchemaCdIdxKey keySchemaCdIdx = schema.getFactoryTable().newSchemaCdIdxKey();
		keySchemaCdIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keySchemaCdIdx.setRequiredSchemaDefId( Buff.getRequiredSchemaDefId() );
		keySchemaCdIdx.setRequiredTableClassCode( Buff.getRequiredTableClassCode() );

		YCFBamTableByPrimaryIndexIdxKey keyPrimaryIndexIdx = schema.getFactoryTable().newPrimaryIndexIdxKey();
		keyPrimaryIndexIdx.setOptionalPrimaryIndexTenantId( Buff.getOptionalPrimaryIndexTenantId() );
		keyPrimaryIndexIdx.setOptionalPrimaryIndexId( Buff.getOptionalPrimaryIndexId() );

		YCFBamTableByLookupIndexIdxKey keyLookupIndexIdx = schema.getFactoryTable().newLookupIndexIdxKey();
		keyLookupIndexIdx.setOptionalLookupIndexTenantId( Buff.getOptionalLookupIndexTenantId() );
		keyLookupIndexIdx.setOptionalLookupIndexId( Buff.getOptionalLookupIndexId() );

		YCFBamTableByAltIndexIdxKey keyAltIndexIdx = schema.getFactoryTable().newAltIndexIdxKey();
		keyAltIndexIdx.setOptionalAltIndexTenantId( Buff.getOptionalAltIndexTenantId() );
		keyAltIndexIdx.setOptionalAltIndexId( Buff.getOptionalAltIndexId() );

		YCFBamTableByQualTableIdxKey keyQualTableIdx = schema.getFactoryTable().newQualTableIdxKey();
		keyQualTableIdx.setOptionalQualifyingTenantId( Buff.getOptionalQualifyingTenantId() );
		keyQualTableIdx.setOptionalQualifyingTableId( Buff.getOptionalQualifyingTableId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"TableUNameIdx",
				keyUNameIdx );
		}

		if( dictBySchemaCdIdx.containsKey( keySchemaCdIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"TableSchemaCodeIdx",
				keySchemaCdIdx );
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
				if( null == schema.getTableSchemaDef().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredSchemaDefId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"SchemaDef",
						"SchemaDef",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamTableBuff > subdictSchemaDefIdx;
		if( dictBySchemaDefIdx.containsKey( keySchemaDefIdx ) ) {
			subdictSchemaDefIdx = dictBySchemaDefIdx.get( keySchemaDefIdx );
		}
		else {
			subdictSchemaDefIdx = new HashMap< YCFBamScopePKey, YCFBamTableBuff >();
			dictBySchemaDefIdx.put( keySchemaDefIdx, subdictSchemaDefIdx );
		}
		subdictSchemaDefIdx.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamTableBuff > subdictCodeVisIdx;
		if( dictByCodeVisIdx.containsKey( keyCodeVisIdx ) ) {
			subdictCodeVisIdx = dictByCodeVisIdx.get( keyCodeVisIdx );
		}
		else {
			subdictCodeVisIdx = new HashMap< YCFBamScopePKey, YCFBamTableBuff >();
			dictByCodeVisIdx.put( keyCodeVisIdx, subdictCodeVisIdx );
		}
		subdictCodeVisIdx.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamTableBuff > subdictSchemaCodeVisIdx;
		if( dictBySchemaCodeVisIdx.containsKey( keySchemaCodeVisIdx ) ) {
			subdictSchemaCodeVisIdx = dictBySchemaCodeVisIdx.get( keySchemaCodeVisIdx );
		}
		else {
			subdictSchemaCodeVisIdx = new HashMap< YCFBamScopePKey, YCFBamTableBuff >();
			dictBySchemaCodeVisIdx.put( keySchemaCodeVisIdx, subdictSchemaCodeVisIdx );
		}
		subdictSchemaCodeVisIdx.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamTableBuff > subdictDefSchemaIdx;
		if( dictByDefSchemaIdx.containsKey( keyDefSchemaIdx ) ) {
			subdictDefSchemaIdx = dictByDefSchemaIdx.get( keyDefSchemaIdx );
		}
		else {
			subdictDefSchemaIdx = new HashMap< YCFBamScopePKey, YCFBamTableBuff >();
			dictByDefSchemaIdx.put( keyDefSchemaIdx, subdictDefSchemaIdx );
		}
		subdictDefSchemaIdx.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

		dictBySchemaCdIdx.put( keySchemaCdIdx, Buff );

		Map< YCFBamScopePKey, YCFBamTableBuff > subdictPrimaryIndexIdx;
		if( dictByPrimaryIndexIdx.containsKey( keyPrimaryIndexIdx ) ) {
			subdictPrimaryIndexIdx = dictByPrimaryIndexIdx.get( keyPrimaryIndexIdx );
		}
		else {
			subdictPrimaryIndexIdx = new HashMap< YCFBamScopePKey, YCFBamTableBuff >();
			dictByPrimaryIndexIdx.put( keyPrimaryIndexIdx, subdictPrimaryIndexIdx );
		}
		subdictPrimaryIndexIdx.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamTableBuff > subdictLookupIndexIdx;
		if( dictByLookupIndexIdx.containsKey( keyLookupIndexIdx ) ) {
			subdictLookupIndexIdx = dictByLookupIndexIdx.get( keyLookupIndexIdx );
		}
		else {
			subdictLookupIndexIdx = new HashMap< YCFBamScopePKey, YCFBamTableBuff >();
			dictByLookupIndexIdx.put( keyLookupIndexIdx, subdictLookupIndexIdx );
		}
		subdictLookupIndexIdx.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamTableBuff > subdictAltIndexIdx;
		if( dictByAltIndexIdx.containsKey( keyAltIndexIdx ) ) {
			subdictAltIndexIdx = dictByAltIndexIdx.get( keyAltIndexIdx );
		}
		else {
			subdictAltIndexIdx = new HashMap< YCFBamScopePKey, YCFBamTableBuff >();
			dictByAltIndexIdx.put( keyAltIndexIdx, subdictAltIndexIdx );
		}
		subdictAltIndexIdx.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamTableBuff > subdictQualTableIdx;
		if( dictByQualTableIdx.containsKey( keyQualTableIdx ) ) {
			subdictQualTableIdx = dictByQualTableIdx.get( keyQualTableIdx );
		}
		else {
			subdictQualTableIdx = new HashMap< YCFBamScopePKey, YCFBamTableBuff >();
			dictByQualTableIdx.put( keyQualTableIdx, subdictQualTableIdx );
		}
		subdictQualTableIdx.put( pkey, Buff );

	}

	public YCFBamTableBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamTable.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamTableBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamTableBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamTable.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamTableBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamTableBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamTable.readAllDerived";
		YCFBamTableBuff[] retList = new YCFBamTableBuff[ dictByPKey.values().size() ];
		Iterator< YCFBamTableBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamTableBuff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamTableBuff> filteredList = new ArrayList<YCFBamTableBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamTableBuff ) ) {
					filteredList.add( (YCFBamTableBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamTableBuff[0] ) );
		}
	}

	public YCFBamTableBuff[] readDerivedBySchemaDefIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId )
	{
		final String S_ProcName = "YCFBamRamTable.readDerivedBySchemaDefIdx";
		YCFBamTableBySchemaDefIdxKey key = schema.getFactoryTable().newSchemaDefIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );

		YCFBamTableBuff[] recArray;
		if( dictBySchemaDefIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamTableBuff > subdictSchemaDefIdx
				= dictBySchemaDefIdx.get( key );
			recArray = new YCFBamTableBuff[ subdictSchemaDefIdx.size() ];
			Iterator< YCFBamTableBuff > iter = subdictSchemaDefIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamTableBuff > subdictSchemaDefIdx
				= new HashMap< YCFBamScopePKey, YCFBamTableBuff >();
			dictBySchemaDefIdx.put( key, subdictSchemaDefIdx );
			recArray = new YCFBamTableBuff[0];
		}
		return( recArray );
	}

	public YCFBamTableBuff[] readDerivedByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "YCFBamRamTable.readDerivedByCodeVisIdx";
		YCFBamTableByCodeVisIdxKey key = schema.getFactoryTable().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );

		YCFBamTableBuff[] recArray;
		if( dictByCodeVisIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamTableBuff > subdictCodeVisIdx
				= dictByCodeVisIdx.get( key );
			recArray = new YCFBamTableBuff[ subdictCodeVisIdx.size() ];
			Iterator< YCFBamTableBuff > iter = subdictCodeVisIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamTableBuff > subdictCodeVisIdx
				= new HashMap< YCFBamScopePKey, YCFBamTableBuff >();
			dictByCodeVisIdx.put( key, subdictCodeVisIdx );
			recArray = new YCFBamTableBuff[0];
		}
		return( recArray );
	}

	public YCFBamTableBuff[] readDerivedBySchemaCodeVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "YCFBamRamTable.readDerivedBySchemaCodeVisIdx";
		YCFBamTableBySchemaCodeVisIdxKey key = schema.getFactoryTable().newSchemaCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		key.setRequiredCodeVis( CodeVis );

		YCFBamTableBuff[] recArray;
		if( dictBySchemaCodeVisIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamTableBuff > subdictSchemaCodeVisIdx
				= dictBySchemaCodeVisIdx.get( key );
			recArray = new YCFBamTableBuff[ subdictSchemaCodeVisIdx.size() ];
			Iterator< YCFBamTableBuff > iter = subdictSchemaCodeVisIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamTableBuff > subdictSchemaCodeVisIdx
				= new HashMap< YCFBamScopePKey, YCFBamTableBuff >();
			dictBySchemaCodeVisIdx.put( key, subdictSchemaCodeVisIdx );
			recArray = new YCFBamTableBuff[0];
		}
		return( recArray );
	}

	public YCFBamTableBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamTable.readDerivedByDefSchemaIdx";
		YCFBamTableByDefSchemaIdxKey key = schema.getFactoryTable().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );

		YCFBamTableBuff[] recArray;
		if( dictByDefSchemaIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamTableBuff > subdictDefSchemaIdx
				= dictByDefSchemaIdx.get( key );
			recArray = new YCFBamTableBuff[ subdictDefSchemaIdx.size() ];
			Iterator< YCFBamTableBuff > iter = subdictDefSchemaIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamTableBuff > subdictDefSchemaIdx
				= new HashMap< YCFBamScopePKey, YCFBamTableBuff >();
			dictByDefSchemaIdx.put( key, subdictDefSchemaIdx );
			recArray = new YCFBamTableBuff[0];
		}
		return( recArray );
	}

	public YCFBamTableBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamTable.readDerivedByUNameIdx";
		YCFBamTableByUNameIdxKey key = schema.getFactoryTable().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		key.setRequiredName( Name );

		YCFBamTableBuff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamTableBuff readDerivedBySchemaCdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId,
		String TableClassCode )
	{
		final String S_ProcName = "YCFBamRamTable.readDerivedBySchemaCdIdx";
		YCFBamTableBySchemaCdIdxKey key = schema.getFactoryTable().newSchemaCdIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaDefId( SchemaDefId );
		key.setRequiredTableClassCode( TableClassCode );

		YCFBamTableBuff buff;
		if( dictBySchemaCdIdx.containsKey( key ) ) {
			buff = dictBySchemaCdIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamTableBuff[] readDerivedByPrimaryIndexIdx( YCFSecAuthorization Authorization,
		Long PrimaryIndexTenantId,
		Long PrimaryIndexId )
	{
		final String S_ProcName = "YCFBamRamTable.readDerivedByPrimaryIndexIdx";
		YCFBamTableByPrimaryIndexIdxKey key = schema.getFactoryTable().newPrimaryIndexIdxKey();
		key.setOptionalPrimaryIndexTenantId( PrimaryIndexTenantId );
		key.setOptionalPrimaryIndexId( PrimaryIndexId );

		YCFBamTableBuff[] recArray;
		if( dictByPrimaryIndexIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamTableBuff > subdictPrimaryIndexIdx
				= dictByPrimaryIndexIdx.get( key );
			recArray = new YCFBamTableBuff[ subdictPrimaryIndexIdx.size() ];
			Iterator< YCFBamTableBuff > iter = subdictPrimaryIndexIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamTableBuff > subdictPrimaryIndexIdx
				= new HashMap< YCFBamScopePKey, YCFBamTableBuff >();
			dictByPrimaryIndexIdx.put( key, subdictPrimaryIndexIdx );
			recArray = new YCFBamTableBuff[0];
		}
		return( recArray );
	}

	public YCFBamTableBuff[] readDerivedByLookupIndexIdx( YCFSecAuthorization Authorization,
		Long LookupIndexTenantId,
		Long LookupIndexId )
	{
		final String S_ProcName = "YCFBamRamTable.readDerivedByLookupIndexIdx";
		YCFBamTableByLookupIndexIdxKey key = schema.getFactoryTable().newLookupIndexIdxKey();
		key.setOptionalLookupIndexTenantId( LookupIndexTenantId );
		key.setOptionalLookupIndexId( LookupIndexId );

		YCFBamTableBuff[] recArray;
		if( dictByLookupIndexIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamTableBuff > subdictLookupIndexIdx
				= dictByLookupIndexIdx.get( key );
			recArray = new YCFBamTableBuff[ subdictLookupIndexIdx.size() ];
			Iterator< YCFBamTableBuff > iter = subdictLookupIndexIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamTableBuff > subdictLookupIndexIdx
				= new HashMap< YCFBamScopePKey, YCFBamTableBuff >();
			dictByLookupIndexIdx.put( key, subdictLookupIndexIdx );
			recArray = new YCFBamTableBuff[0];
		}
		return( recArray );
	}

	public YCFBamTableBuff[] readDerivedByAltIndexIdx( YCFSecAuthorization Authorization,
		Long AltIndexTenantId,
		Long AltIndexId )
	{
		final String S_ProcName = "YCFBamRamTable.readDerivedByAltIndexIdx";
		YCFBamTableByAltIndexIdxKey key = schema.getFactoryTable().newAltIndexIdxKey();
		key.setOptionalAltIndexTenantId( AltIndexTenantId );
		key.setOptionalAltIndexId( AltIndexId );

		YCFBamTableBuff[] recArray;
		if( dictByAltIndexIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamTableBuff > subdictAltIndexIdx
				= dictByAltIndexIdx.get( key );
			recArray = new YCFBamTableBuff[ subdictAltIndexIdx.size() ];
			Iterator< YCFBamTableBuff > iter = subdictAltIndexIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamTableBuff > subdictAltIndexIdx
				= new HashMap< YCFBamScopePKey, YCFBamTableBuff >();
			dictByAltIndexIdx.put( key, subdictAltIndexIdx );
			recArray = new YCFBamTableBuff[0];
		}
		return( recArray );
	}

	public YCFBamTableBuff[] readDerivedByQualTableIdx( YCFSecAuthorization Authorization,
		Long QualifyingTenantId,
		Long QualifyingTableId )
	{
		final String S_ProcName = "YCFBamRamTable.readDerivedByQualTableIdx";
		YCFBamTableByQualTableIdxKey key = schema.getFactoryTable().newQualTableIdxKey();
		key.setOptionalQualifyingTenantId( QualifyingTenantId );
		key.setOptionalQualifyingTableId( QualifyingTableId );

		YCFBamTableBuff[] recArray;
		if( dictByQualTableIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamTableBuff > subdictQualTableIdx
				= dictByQualTableIdx.get( key );
			recArray = new YCFBamTableBuff[ subdictQualTableIdx.size() ];
			Iterator< YCFBamTableBuff > iter = subdictQualTableIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamTableBuff > subdictQualTableIdx
				= new HashMap< YCFBamScopePKey, YCFBamTableBuff >();
			dictByQualTableIdx.put( key, subdictQualTableIdx );
			recArray = new YCFBamTableBuff[0];
		}
		return( recArray );
	}

	public YCFBamTableBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readDerivedByIdIdx() ";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamTableBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamTableBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamTable.readBuff";
		YCFBamTableBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a807" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamTableBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamTableBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a807" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamTableBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamTable.readAllBuff";
		YCFBamTableBuff buff;
		ArrayList<YCFBamTableBuff> filteredList = new ArrayList<YCFBamTableBuff>();
		YCFBamTableBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a807" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamTableBuff[0] ) );
	}

	public YCFBamTableBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByIdIdx() ";
		YCFBamTableBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
			return( (YCFBamTableBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamTableBuff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByTenantIdx() ";
		YCFBamTableBuff buff;
		ArrayList<YCFBamTableBuff> filteredList = new ArrayList<YCFBamTableBuff>();
		YCFBamTableBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
				filteredList.add( (YCFBamTableBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamTableBuff[0] ) );
	}

	public YCFBamTableBuff[] readBuffBySchemaDefIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId )
	{
		final String S_ProcName = "YCFBamRamTable.readBuffBySchemaDefIdx() ";
		YCFBamTableBuff buff;
		ArrayList<YCFBamTableBuff> filteredList = new ArrayList<YCFBamTableBuff>();
		YCFBamTableBuff[] buffList = readDerivedBySchemaDefIdx( Authorization,
			TenantId,
			SchemaDefId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a807" ) ) {
				filteredList.add( (YCFBamTableBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamTableBuff[0] ) );
	}

	public YCFBamTableBuff[] readBuffByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "YCFBamRamTable.readBuffByCodeVisIdx() ";
		YCFBamTableBuff buff;
		ArrayList<YCFBamTableBuff> filteredList = new ArrayList<YCFBamTableBuff>();
		YCFBamTableBuff[] buffList = readDerivedByCodeVisIdx( Authorization,
			CodeVis );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a807" ) ) {
				filteredList.add( (YCFBamTableBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamTableBuff[0] ) );
	}

	public YCFBamTableBuff[] readBuffBySchemaCodeVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "YCFBamRamTable.readBuffBySchemaCodeVisIdx() ";
		YCFBamTableBuff buff;
		ArrayList<YCFBamTableBuff> filteredList = new ArrayList<YCFBamTableBuff>();
		YCFBamTableBuff[] buffList = readDerivedBySchemaCodeVisIdx( Authorization,
			TenantId,
			SchemaDefId,
			CodeVis );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a807" ) ) {
				filteredList.add( (YCFBamTableBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamTableBuff[0] ) );
	}

	public YCFBamTableBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamTable.readBuffByDefSchemaIdx() ";
		YCFBamTableBuff buff;
		ArrayList<YCFBamTableBuff> filteredList = new ArrayList<YCFBamTableBuff>();
		YCFBamTableBuff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a807" ) ) {
				filteredList.add( (YCFBamTableBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamTableBuff[0] ) );
	}

	public YCFBamTableBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamTable.readBuffByUNameIdx() ";
		YCFBamTableBuff buff = readDerivedByUNameIdx( Authorization,
			TenantId,
			SchemaDefId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a807" ) ) {
			return( (YCFBamTableBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamTableBuff readBuffBySchemaCdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId,
		String TableClassCode )
	{
		final String S_ProcName = "YCFBamRamTable.readBuffBySchemaCdIdx() ";
		YCFBamTableBuff buff = readDerivedBySchemaCdIdx( Authorization,
			TenantId,
			SchemaDefId,
			TableClassCode );
		if( ( buff != null ) && buff.getClassCode().equals( "a807" ) ) {
			return( (YCFBamTableBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamTableBuff[] readBuffByPrimaryIndexIdx( YCFSecAuthorization Authorization,
		Long PrimaryIndexTenantId,
		Long PrimaryIndexId )
	{
		final String S_ProcName = "YCFBamRamTable.readBuffByPrimaryIndexIdx() ";
		YCFBamTableBuff buff;
		ArrayList<YCFBamTableBuff> filteredList = new ArrayList<YCFBamTableBuff>();
		YCFBamTableBuff[] buffList = readDerivedByPrimaryIndexIdx( Authorization,
			PrimaryIndexTenantId,
			PrimaryIndexId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a807" ) ) {
				filteredList.add( (YCFBamTableBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamTableBuff[0] ) );
	}

	public YCFBamTableBuff[] readBuffByLookupIndexIdx( YCFSecAuthorization Authorization,
		Long LookupIndexTenantId,
		Long LookupIndexId )
	{
		final String S_ProcName = "YCFBamRamTable.readBuffByLookupIndexIdx() ";
		YCFBamTableBuff buff;
		ArrayList<YCFBamTableBuff> filteredList = new ArrayList<YCFBamTableBuff>();
		YCFBamTableBuff[] buffList = readDerivedByLookupIndexIdx( Authorization,
			LookupIndexTenantId,
			LookupIndexId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a807" ) ) {
				filteredList.add( (YCFBamTableBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamTableBuff[0] ) );
	}

	public YCFBamTableBuff[] readBuffByAltIndexIdx( YCFSecAuthorization Authorization,
		Long AltIndexTenantId,
		Long AltIndexId )
	{
		final String S_ProcName = "YCFBamRamTable.readBuffByAltIndexIdx() ";
		YCFBamTableBuff buff;
		ArrayList<YCFBamTableBuff> filteredList = new ArrayList<YCFBamTableBuff>();
		YCFBamTableBuff[] buffList = readDerivedByAltIndexIdx( Authorization,
			AltIndexTenantId,
			AltIndexId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a807" ) ) {
				filteredList.add( (YCFBamTableBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamTableBuff[0] ) );
	}

	public YCFBamTableBuff[] readBuffByQualTableIdx( YCFSecAuthorization Authorization,
		Long QualifyingTenantId,
		Long QualifyingTableId )
	{
		final String S_ProcName = "YCFBamRamTable.readBuffByQualTableIdx() ";
		YCFBamTableBuff buff;
		ArrayList<YCFBamTableBuff> filteredList = new ArrayList<YCFBamTableBuff>();
		YCFBamTableBuff[] buffList = readDerivedByQualTableIdx( Authorization,
			QualifyingTenantId,
			QualifyingTableId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a807" ) ) {
				filteredList.add( (YCFBamTableBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamTableBuff[0] ) );
	}

	/**
	 *	Read a page array of the specific Table buffer instances identified by the duplicate key SchemaDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamTableBuff[] pageBuffBySchemaDefIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffBySchemaDefIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific Table buffer instances identified by the duplicate key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argCodeVis	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamTableBuff[] pageBuffByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByCodeVisIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific Table buffer instances identified by the duplicate key SchemaCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamTableBuff[] pageBuffBySchemaCodeVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaDefId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffBySchemaCodeVisIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific Table buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamTableBuff[] pageBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByDefSchemaIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific Table buffer instances identified by the duplicate key PrimaryIndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrimaryIndexTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argPrimaryIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamTableBuff[] pageBuffByPrimaryIndexIdx( YCFSecAuthorization Authorization,
		Long PrimaryIndexTenantId,
		Long PrimaryIndexId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByPrimaryIndexIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific Table buffer instances identified by the duplicate key LookupIndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argLookupIndexTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argLookupIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamTableBuff[] pageBuffByLookupIndexIdx( YCFSecAuthorization Authorization,
		Long LookupIndexTenantId,
		Long LookupIndexId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByLookupIndexIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific Table buffer instances identified by the duplicate key AltIndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argAltIndexTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argAltIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamTableBuff[] pageBuffByAltIndexIdx( YCFSecAuthorization Authorization,
		Long AltIndexTenantId,
		Long AltIndexId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByAltIndexIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific Table buffer instances identified by the duplicate key QualTableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argQualifyingTenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	argQualifyingTableId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamTableBuff[] pageBuffByQualTableIdx( YCFSecAuthorization Authorization,
		Long QualifyingTenantId,
		Long QualifyingTableId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByQualTableIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateTable( YCFSecAuthorization Authorization,
		YCFBamTableBuff Buff )
	{
		schema.getTableScope().updateScope( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamTableBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateTable",
				"Existing record not found",
				"Table",
				pkey );
		}
		YCFBamTableBySchemaDefIdxKey existingKeySchemaDefIdx = schema.getFactoryTable().newSchemaDefIdxKey();
		existingKeySchemaDefIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeySchemaDefIdx.setRequiredSchemaDefId( existing.getRequiredSchemaDefId() );

		YCFBamTableBySchemaDefIdxKey newKeySchemaDefIdx = schema.getFactoryTable().newSchemaDefIdxKey();
		newKeySchemaDefIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeySchemaDefIdx.setRequiredSchemaDefId( Buff.getRequiredSchemaDefId() );

		YCFBamTableByCodeVisIdxKey existingKeyCodeVisIdx = schema.getFactoryTable().newCodeVisIdxKey();
		existingKeyCodeVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		YCFBamTableByCodeVisIdxKey newKeyCodeVisIdx = schema.getFactoryTable().newCodeVisIdxKey();
		newKeyCodeVisIdx.setRequiredCodeVis( Buff.getRequiredCodeVis() );

		YCFBamTableBySchemaCodeVisIdxKey existingKeySchemaCodeVisIdx = schema.getFactoryTable().newSchemaCodeVisIdxKey();
		existingKeySchemaCodeVisIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeySchemaCodeVisIdx.setRequiredSchemaDefId( existing.getRequiredSchemaDefId() );
		existingKeySchemaCodeVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		YCFBamTableBySchemaCodeVisIdxKey newKeySchemaCodeVisIdx = schema.getFactoryTable().newSchemaCodeVisIdxKey();
		newKeySchemaCodeVisIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeySchemaCodeVisIdx.setRequiredSchemaDefId( Buff.getRequiredSchemaDefId() );
		newKeySchemaCodeVisIdx.setRequiredCodeVis( Buff.getRequiredCodeVis() );

		YCFBamTableByDefSchemaIdxKey existingKeyDefSchemaIdx = schema.getFactoryTable().newDefSchemaIdxKey();
		existingKeyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		existingKeyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		YCFBamTableByDefSchemaIdxKey newKeyDefSchemaIdx = schema.getFactoryTable().newDefSchemaIdxKey();
		newKeyDefSchemaIdx.setOptionalDefSchemaTenantId( Buff.getOptionalDefSchemaTenantId() );
		newKeyDefSchemaIdx.setOptionalDefSchemaId( Buff.getOptionalDefSchemaId() );

		YCFBamTableByUNameIdxKey existingKeyUNameIdx = schema.getFactoryTable().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyUNameIdx.setRequiredSchemaDefId( existing.getRequiredSchemaDefId() );
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamTableByUNameIdxKey newKeyUNameIdx = schema.getFactoryTable().newUNameIdxKey();
		newKeyUNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyUNameIdx.setRequiredSchemaDefId( Buff.getRequiredSchemaDefId() );
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamTableBySchemaCdIdxKey existingKeySchemaCdIdx = schema.getFactoryTable().newSchemaCdIdxKey();
		existingKeySchemaCdIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeySchemaCdIdx.setRequiredSchemaDefId( existing.getRequiredSchemaDefId() );
		existingKeySchemaCdIdx.setRequiredTableClassCode( existing.getRequiredTableClassCode() );

		YCFBamTableBySchemaCdIdxKey newKeySchemaCdIdx = schema.getFactoryTable().newSchemaCdIdxKey();
		newKeySchemaCdIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeySchemaCdIdx.setRequiredSchemaDefId( Buff.getRequiredSchemaDefId() );
		newKeySchemaCdIdx.setRequiredTableClassCode( Buff.getRequiredTableClassCode() );

		YCFBamTableByPrimaryIndexIdxKey existingKeyPrimaryIndexIdx = schema.getFactoryTable().newPrimaryIndexIdxKey();
		existingKeyPrimaryIndexIdx.setOptionalPrimaryIndexTenantId( existing.getOptionalPrimaryIndexTenantId() );
		existingKeyPrimaryIndexIdx.setOptionalPrimaryIndexId( existing.getOptionalPrimaryIndexId() );

		YCFBamTableByPrimaryIndexIdxKey newKeyPrimaryIndexIdx = schema.getFactoryTable().newPrimaryIndexIdxKey();
		newKeyPrimaryIndexIdx.setOptionalPrimaryIndexTenantId( Buff.getOptionalPrimaryIndexTenantId() );
		newKeyPrimaryIndexIdx.setOptionalPrimaryIndexId( Buff.getOptionalPrimaryIndexId() );

		YCFBamTableByLookupIndexIdxKey existingKeyLookupIndexIdx = schema.getFactoryTable().newLookupIndexIdxKey();
		existingKeyLookupIndexIdx.setOptionalLookupIndexTenantId( existing.getOptionalLookupIndexTenantId() );
		existingKeyLookupIndexIdx.setOptionalLookupIndexId( existing.getOptionalLookupIndexId() );

		YCFBamTableByLookupIndexIdxKey newKeyLookupIndexIdx = schema.getFactoryTable().newLookupIndexIdxKey();
		newKeyLookupIndexIdx.setOptionalLookupIndexTenantId( Buff.getOptionalLookupIndexTenantId() );
		newKeyLookupIndexIdx.setOptionalLookupIndexId( Buff.getOptionalLookupIndexId() );

		YCFBamTableByAltIndexIdxKey existingKeyAltIndexIdx = schema.getFactoryTable().newAltIndexIdxKey();
		existingKeyAltIndexIdx.setOptionalAltIndexTenantId( existing.getOptionalAltIndexTenantId() );
		existingKeyAltIndexIdx.setOptionalAltIndexId( existing.getOptionalAltIndexId() );

		YCFBamTableByAltIndexIdxKey newKeyAltIndexIdx = schema.getFactoryTable().newAltIndexIdxKey();
		newKeyAltIndexIdx.setOptionalAltIndexTenantId( Buff.getOptionalAltIndexTenantId() );
		newKeyAltIndexIdx.setOptionalAltIndexId( Buff.getOptionalAltIndexId() );

		YCFBamTableByQualTableIdxKey existingKeyQualTableIdx = schema.getFactoryTable().newQualTableIdxKey();
		existingKeyQualTableIdx.setOptionalQualifyingTenantId( existing.getOptionalQualifyingTenantId() );
		existingKeyQualTableIdx.setOptionalQualifyingTableId( existing.getOptionalQualifyingTableId() );

		YCFBamTableByQualTableIdxKey newKeyQualTableIdx = schema.getFactoryTable().newQualTableIdxKey();
		newKeyQualTableIdx.setOptionalQualifyingTenantId( Buff.getOptionalQualifyingTenantId() );
		newKeyQualTableIdx.setOptionalQualifyingTableId( Buff.getOptionalQualifyingTableId() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateTable",
					"TableUNameIdx",
					newKeyUNameIdx );
			}
		}

		if( ! existingKeySchemaCdIdx.equals( newKeySchemaCdIdx ) ) {
			if( dictBySchemaCdIdx.containsKey( newKeySchemaCdIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateTable",
					"TableSchemaCodeIdx",
					newKeySchemaCdIdx );
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
						"updateTable",
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
				if( null == schema.getTableSchemaDef().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredSchemaDefId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateTable",
						"Container",
						"SchemaDef",
						"SchemaDef",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamScopePKey, YCFBamTableBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictBySchemaDefIdx.get( existingKeySchemaDefIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictBySchemaDefIdx.containsKey( newKeySchemaDefIdx ) ) {
			subdict = dictBySchemaDefIdx.get( newKeySchemaDefIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamTableBuff >();
			dictBySchemaDefIdx.put( newKeySchemaDefIdx, subdict );
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
			subdict = new HashMap< YCFBamScopePKey, YCFBamTableBuff >();
			dictByCodeVisIdx.put( newKeyCodeVisIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictBySchemaCodeVisIdx.get( existingKeySchemaCodeVisIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictBySchemaCodeVisIdx.containsKey( newKeySchemaCodeVisIdx ) ) {
			subdict = dictBySchemaCodeVisIdx.get( newKeySchemaCodeVisIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamTableBuff >();
			dictBySchemaCodeVisIdx.put( newKeySchemaCodeVisIdx, subdict );
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
			subdict = new HashMap< YCFBamScopePKey, YCFBamTableBuff >();
			dictByDefSchemaIdx.put( newKeyDefSchemaIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

		dictBySchemaCdIdx.remove( existingKeySchemaCdIdx );
		dictBySchemaCdIdx.put( newKeySchemaCdIdx, Buff );

		subdict = dictByPrimaryIndexIdx.get( existingKeyPrimaryIndexIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByPrimaryIndexIdx.containsKey( newKeyPrimaryIndexIdx ) ) {
			subdict = dictByPrimaryIndexIdx.get( newKeyPrimaryIndexIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamTableBuff >();
			dictByPrimaryIndexIdx.put( newKeyPrimaryIndexIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByLookupIndexIdx.get( existingKeyLookupIndexIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByLookupIndexIdx.containsKey( newKeyLookupIndexIdx ) ) {
			subdict = dictByLookupIndexIdx.get( newKeyLookupIndexIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamTableBuff >();
			dictByLookupIndexIdx.put( newKeyLookupIndexIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByAltIndexIdx.get( existingKeyAltIndexIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByAltIndexIdx.containsKey( newKeyAltIndexIdx ) ) {
			subdict = dictByAltIndexIdx.get( newKeyAltIndexIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamTableBuff >();
			dictByAltIndexIdx.put( newKeyAltIndexIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByQualTableIdx.get( existingKeyQualTableIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByQualTableIdx.containsKey( newKeyQualTableIdx ) ) {
			subdict = dictByQualTableIdx.get( newKeyQualTableIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamTableBuff >();
			dictByQualTableIdx.put( newKeyQualTableIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteTable( YCFSecAuthorization Authorization,
		YCFBamTableBuff Buff )
	{
		final String S_ProcName = "YCFBamRamTableTable.deleteTable() ";
		String classCode;
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamTableBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteTable",
				pkey );
		}
					{
						YCFBamTableBuff editBuff = schema.getTableTable().readDerivedByIdIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
						editBuff.setOptionalPrimaryIndexTenantId( null );
						editBuff.setOptionalPrimaryIndexId( null );
						classCode = editBuff.getClassCode();
						if( classCode.equals( "a807" ) ) {
							schema.getTableTable().updateTable( Authorization, editBuff );
						}
						else {
							new YCFLibUnsupportedClassException( getClass(),
								S_ProcName,
								"Unrecognized ClassCode \"" + classCode + "\"" );
						}
					}
		YCFBamTableBuff editSubobj = schema.getTableTable().readDerivedByIdIdx( Authorization,
			existing.getRequiredTenantId(),
			existing.getRequiredId() );
			editSubobj.setOptionalLookupIndexTenantId( null );
			editSubobj.setOptionalLookupIndexId( null );
			editSubobj.setOptionalAltIndexTenantId( null );
			editSubobj.setOptionalAltIndexId( null );
			editSubobj.setOptionalPrimaryIndexTenantId( null );
			editSubobj.setOptionalPrimaryIndexId( null );
		classCode = editSubobj.getClassCode();
		if( classCode.equals( "a807" ) ) {
			schema.getTableTable().updateTable( Authorization, editSubobj );
		}
		else {
			new YCFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"Unrecognized ClassCode \"" + classCode + "\"" );
		}
		existing = editSubobj;
					schema.getTableServerMethod().deleteServerMethodByMethTableIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
					schema.getTableDelTopDep().deleteDelTopDepByDelTopDepTblIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
					schema.getTableClearTopDep().deleteClearTopDepByClrTopDepTblIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
					schema.getTableChain().deleteChainByChainTableIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		YCFBamRelationBuff buffDelTableRelationPopDep;
		YCFBamRelationBuff arrDelTableRelationPopDep[] = schema.getTableRelation().readDerivedByRelTableIdx( Authorization,
			existing.getRequiredTenantId(),
			existing.getRequiredId() );
		for( int idxDelTableRelationPopDep = 0; idxDelTableRelationPopDep < arrDelTableRelationPopDep.length; idxDelTableRelationPopDep++ ) {
			buffDelTableRelationPopDep = arrDelTableRelationPopDep[idxDelTableRelationPopDep];
					schema.getTablePopTopDep().deletePopTopDepByContRelIdx( Authorization,
						buffDelTableRelationPopDep.getRequiredTenantId(),
						buffDelTableRelationPopDep.getRequiredId() );
		}
		YCFBamRelationBuff buffDelTableRelationCol;
		YCFBamRelationBuff arrDelTableRelationCol[] = schema.getTableRelation().readDerivedByRelTableIdx( Authorization,
			existing.getRequiredTenantId(),
			existing.getRequiredId() );
		for( int idxDelTableRelationCol = 0; idxDelTableRelationCol < arrDelTableRelationCol.length; idxDelTableRelationCol++ ) {
			buffDelTableRelationCol = arrDelTableRelationCol[idxDelTableRelationCol];
					schema.getTableRelationCol().deleteRelationColByRelationIdx( Authorization,
						buffDelTableRelationCol.getRequiredTenantId(),
						buffDelTableRelationCol.getRequiredId() );
		}
					schema.getTableRelation().deleteRelationByRelTableIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		YCFBamIndexBuff buffDelTableIndexRefRelFmCol;
		YCFBamIndexBuff arrDelTableIndexRefRelFmCol[] = schema.getTableIndex().readDerivedByIdxTableIdx( Authorization,
			existing.getRequiredTenantId(),
			existing.getRequiredId() );
		for( int idxDelTableIndexRefRelFmCol = 0; idxDelTableIndexRefRelFmCol < arrDelTableIndexRefRelFmCol.length; idxDelTableIndexRefRelFmCol++ ) {
			buffDelTableIndexRefRelFmCol = arrDelTableIndexRefRelFmCol[idxDelTableIndexRefRelFmCol];
			YCFBamIndexColBuff buffColumns;
			YCFBamIndexColBuff arrColumns[] = schema.getTableIndexCol().readDerivedByIndexIdx( Authorization,
				buffDelTableIndexRefRelFmCol.getRequiredTenantId(),
				buffDelTableIndexRefRelFmCol.getRequiredId() );
			for( int idxColumns = 0; idxColumns < arrColumns.length; idxColumns++ ) {
				buffColumns = arrColumns[idxColumns];
					schema.getTableRelationCol().deleteRelationColByFromColIdx( Authorization,
						buffColumns.getRequiredTenantId(),
						buffColumns.getRequiredId() );
			}
		}
		YCFBamIndexBuff buffDelTableIndexRefRelToCol;
		YCFBamIndexBuff arrDelTableIndexRefRelToCol[] = schema.getTableIndex().readDerivedByIdxTableIdx( Authorization,
			existing.getRequiredTenantId(),
			existing.getRequiredId() );
		for( int idxDelTableIndexRefRelToCol = 0; idxDelTableIndexRefRelToCol < arrDelTableIndexRefRelToCol.length; idxDelTableIndexRefRelToCol++ ) {
			buffDelTableIndexRefRelToCol = arrDelTableIndexRefRelToCol[idxDelTableIndexRefRelToCol];
			YCFBamIndexColBuff buffColumns;
			YCFBamIndexColBuff arrColumns[] = schema.getTableIndexCol().readDerivedByIndexIdx( Authorization,
				buffDelTableIndexRefRelToCol.getRequiredTenantId(),
				buffDelTableIndexRefRelToCol.getRequiredId() );
			for( int idxColumns = 0; idxColumns < arrColumns.length; idxColumns++ ) {
				buffColumns = arrColumns[idxColumns];
					schema.getTableRelationCol().deleteRelationColByToColIdx( Authorization,
						buffColumns.getRequiredTenantId(),
						buffColumns.getRequiredId() );
			}
		}
		YCFBamIndexBuff buffDelTableIndexCol;
		YCFBamIndexBuff arrDelTableIndexCol[] = schema.getTableIndex().readDerivedByIdxTableIdx( Authorization,
			existing.getRequiredTenantId(),
			existing.getRequiredId() );
		for( int idxDelTableIndexCol = 0; idxDelTableIndexCol < arrDelTableIndexCol.length; idxDelTableIndexCol++ ) {
			buffDelTableIndexCol = arrDelTableIndexCol[idxDelTableIndexCol];
					schema.getTableIndexCol().deleteIndexColByIndexIdx( Authorization,
						buffDelTableIndexCol.getRequiredTenantId(),
						buffDelTableIndexCol.getRequiredId() );
		}
					schema.getTableIndex().deleteIndexByIdxTableIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		YCFBamValueBuff buffDelTableRefIndexColumns;
		YCFBamValueBuff arrDelTableRefIndexColumns[] = schema.getTableValue().readDerivedByScopeIdx( Authorization,
			existing.getRequiredTenantId(),
			existing.getRequiredId() );
		for( int idxDelTableRefIndexColumns = 0; idxDelTableRefIndexColumns < arrDelTableRefIndexColumns.length; idxDelTableRefIndexColumns++ ) {
			buffDelTableRefIndexColumns = arrDelTableRefIndexColumns[idxDelTableRefIndexColumns];
					schema.getTableIndexCol().deleteIndexColByColIdx( Authorization,
						buffDelTableRefIndexColumns.getRequiredTenantId(),
						buffDelTableRefIndexColumns.getRequiredId() );
		}
					schema.getTableValue().deleteValueByScopeIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
					schema.getTableId64Gen().deleteId64GenByDispIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
					schema.getTableId32Gen().deleteId32GenByDispIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
					schema.getTableId16Gen().deleteId16GenByDispIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		YCFBamTableBySchemaDefIdxKey keySchemaDefIdx = schema.getFactoryTable().newSchemaDefIdxKey();
		keySchemaDefIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keySchemaDefIdx.setRequiredSchemaDefId( existing.getRequiredSchemaDefId() );

		YCFBamTableByCodeVisIdxKey keyCodeVisIdx = schema.getFactoryTable().newCodeVisIdxKey();
		keyCodeVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		YCFBamTableBySchemaCodeVisIdxKey keySchemaCodeVisIdx = schema.getFactoryTable().newSchemaCodeVisIdxKey();
		keySchemaCodeVisIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keySchemaCodeVisIdx.setRequiredSchemaDefId( existing.getRequiredSchemaDefId() );
		keySchemaCodeVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		YCFBamTableByDefSchemaIdxKey keyDefSchemaIdx = schema.getFactoryTable().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		YCFBamTableByUNameIdxKey keyUNameIdx = schema.getFactoryTable().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredSchemaDefId( existing.getRequiredSchemaDefId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamTableBySchemaCdIdxKey keySchemaCdIdx = schema.getFactoryTable().newSchemaCdIdxKey();
		keySchemaCdIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keySchemaCdIdx.setRequiredSchemaDefId( existing.getRequiredSchemaDefId() );
		keySchemaCdIdx.setRequiredTableClassCode( existing.getRequiredTableClassCode() );

		YCFBamTableByPrimaryIndexIdxKey keyPrimaryIndexIdx = schema.getFactoryTable().newPrimaryIndexIdxKey();
		keyPrimaryIndexIdx.setOptionalPrimaryIndexTenantId( existing.getOptionalPrimaryIndexTenantId() );
		keyPrimaryIndexIdx.setOptionalPrimaryIndexId( existing.getOptionalPrimaryIndexId() );

		YCFBamTableByLookupIndexIdxKey keyLookupIndexIdx = schema.getFactoryTable().newLookupIndexIdxKey();
		keyLookupIndexIdx.setOptionalLookupIndexTenantId( existing.getOptionalLookupIndexTenantId() );
		keyLookupIndexIdx.setOptionalLookupIndexId( existing.getOptionalLookupIndexId() );

		YCFBamTableByAltIndexIdxKey keyAltIndexIdx = schema.getFactoryTable().newAltIndexIdxKey();
		keyAltIndexIdx.setOptionalAltIndexTenantId( existing.getOptionalAltIndexTenantId() );
		keyAltIndexIdx.setOptionalAltIndexId( existing.getOptionalAltIndexId() );

		YCFBamTableByQualTableIdxKey keyQualTableIdx = schema.getFactoryTable().newQualTableIdxKey();
		keyQualTableIdx.setOptionalQualifyingTenantId( existing.getOptionalQualifyingTenantId() );
		keyQualTableIdx.setOptionalQualifyingTableId( existing.getOptionalQualifyingTableId() );

		// Validate reverse foreign keys

		if( schema.getTableRelation().readDerivedByToTblIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ).length > 0 )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteTable",
				"Lookup",
				"ToTable",
				"Relation",
				pkey );
		}

		// Delete is valid
		Map< YCFBamScopePKey, YCFBamTableBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictBySchemaDefIdx.get( keySchemaDefIdx );
		subdict.remove( pkey );

		subdict = dictByCodeVisIdx.get( keyCodeVisIdx );
		subdict.remove( pkey );

		subdict = dictBySchemaCodeVisIdx.get( keySchemaCodeVisIdx );
		subdict.remove( pkey );

		subdict = dictByDefSchemaIdx.get( keyDefSchemaIdx );
		subdict.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

		dictBySchemaCdIdx.remove( keySchemaCdIdx );

		subdict = dictByPrimaryIndexIdx.get( keyPrimaryIndexIdx );
		subdict.remove( pkey );

		subdict = dictByLookupIndexIdx.get( keyLookupIndexIdx );
		subdict.remove( pkey );

		subdict = dictByAltIndexIdx.get( keyAltIndexIdx );
		subdict.remove( pkey );

		subdict = dictByQualTableIdx.get( keyQualTableIdx );
		subdict.remove( pkey );

		schema.getTableScope().deleteScope( Authorization,
			Buff );
	}
	public void deleteTableBySchemaDefIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argSchemaDefId )
	{
		YCFBamTableBySchemaDefIdxKey key = schema.getFactoryTable().newSchemaDefIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredSchemaDefId( argSchemaDefId );
		deleteTableBySchemaDefIdx( Authorization, key );
	}

	public void deleteTableBySchemaDefIdx( YCFSecAuthorization Authorization,
		YCFBamTableBySchemaDefIdxKey argKey )
	{
		YCFBamTableBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamTableBuff> matchSet = new LinkedList<YCFBamTableBuff>();
		Iterator<YCFBamTableBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamTableBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTable().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteTable( Authorization, cur );
		}
	}

	public void deleteTableByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum argCodeVis )
	{
		YCFBamTableByCodeVisIdxKey key = schema.getFactoryTable().newCodeVisIdxKey();
		key.setRequiredCodeVis( argCodeVis );
		deleteTableByCodeVisIdx( Authorization, key );
	}

	public void deleteTableByCodeVisIdx( YCFSecAuthorization Authorization,
		YCFBamTableByCodeVisIdxKey argKey )
	{
		YCFBamTableBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamTableBuff> matchSet = new LinkedList<YCFBamTableBuff>();
		Iterator<YCFBamTableBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamTableBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTable().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteTable( Authorization, cur );
		}
	}

	public void deleteTableBySchemaCodeVisIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argSchemaDefId,
		IYCFBamSchema.CodeVisibilityEnum argCodeVis )
	{
		YCFBamTableBySchemaCodeVisIdxKey key = schema.getFactoryTable().newSchemaCodeVisIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredSchemaDefId( argSchemaDefId );
		key.setRequiredCodeVis( argCodeVis );
		deleteTableBySchemaCodeVisIdx( Authorization, key );
	}

	public void deleteTableBySchemaCodeVisIdx( YCFSecAuthorization Authorization,
		YCFBamTableBySchemaCodeVisIdxKey argKey )
	{
		YCFBamTableBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamTableBuff> matchSet = new LinkedList<YCFBamTableBuff>();
		Iterator<YCFBamTableBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamTableBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTable().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteTable( Authorization, cur );
		}
	}

	public void deleteTableByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamTableByDefSchemaIdxKey key = schema.getFactoryTable().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deleteTableByDefSchemaIdx( Authorization, key );
	}

	public void deleteTableByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamTableByDefSchemaIdxKey argKey )
	{
		YCFBamTableBuff cur;
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
		LinkedList<YCFBamTableBuff> matchSet = new LinkedList<YCFBamTableBuff>();
		Iterator<YCFBamTableBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamTableBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTable().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteTable( Authorization, cur );
		}
	}

	public void deleteTableByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argSchemaDefId,
		String argName )
	{
		YCFBamTableByUNameIdxKey key = schema.getFactoryTable().newUNameIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredSchemaDefId( argSchemaDefId );
		key.setRequiredName( argName );
		deleteTableByUNameIdx( Authorization, key );
	}

	public void deleteTableByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamTableByUNameIdxKey argKey )
	{
		YCFBamTableBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamTableBuff> matchSet = new LinkedList<YCFBamTableBuff>();
		Iterator<YCFBamTableBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamTableBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTable().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteTable( Authorization, cur );
		}
	}

	public void deleteTableBySchemaCdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argSchemaDefId,
		String argTableClassCode )
	{
		YCFBamTableBySchemaCdIdxKey key = schema.getFactoryTable().newSchemaCdIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredSchemaDefId( argSchemaDefId );
		key.setRequiredTableClassCode( argTableClassCode );
		deleteTableBySchemaCdIdx( Authorization, key );
	}

	public void deleteTableBySchemaCdIdx( YCFSecAuthorization Authorization,
		YCFBamTableBySchemaCdIdxKey argKey )
	{
		YCFBamTableBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamTableBuff> matchSet = new LinkedList<YCFBamTableBuff>();
		Iterator<YCFBamTableBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamTableBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTable().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteTable( Authorization, cur );
		}
	}

	public void deleteTableByPrimaryIndexIdx( YCFSecAuthorization Authorization,
		Long argPrimaryIndexTenantId,
		Long argPrimaryIndexId )
	{
		YCFBamTableByPrimaryIndexIdxKey key = schema.getFactoryTable().newPrimaryIndexIdxKey();
		key.setOptionalPrimaryIndexTenantId( argPrimaryIndexTenantId );
		key.setOptionalPrimaryIndexId( argPrimaryIndexId );
		deleteTableByPrimaryIndexIdx( Authorization, key );
	}

	public void deleteTableByPrimaryIndexIdx( YCFSecAuthorization Authorization,
		YCFBamTableByPrimaryIndexIdxKey argKey )
	{
		YCFBamTableBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalPrimaryIndexTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalPrimaryIndexId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamTableBuff> matchSet = new LinkedList<YCFBamTableBuff>();
		Iterator<YCFBamTableBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamTableBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTable().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteTable( Authorization, cur );
		}
	}

	public void deleteTableByLookupIndexIdx( YCFSecAuthorization Authorization,
		Long argLookupIndexTenantId,
		Long argLookupIndexId )
	{
		YCFBamTableByLookupIndexIdxKey key = schema.getFactoryTable().newLookupIndexIdxKey();
		key.setOptionalLookupIndexTenantId( argLookupIndexTenantId );
		key.setOptionalLookupIndexId( argLookupIndexId );
		deleteTableByLookupIndexIdx( Authorization, key );
	}

	public void deleteTableByLookupIndexIdx( YCFSecAuthorization Authorization,
		YCFBamTableByLookupIndexIdxKey argKey )
	{
		YCFBamTableBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalLookupIndexTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalLookupIndexId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamTableBuff> matchSet = new LinkedList<YCFBamTableBuff>();
		Iterator<YCFBamTableBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamTableBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTable().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteTable( Authorization, cur );
		}
	}

	public void deleteTableByAltIndexIdx( YCFSecAuthorization Authorization,
		Long argAltIndexTenantId,
		Long argAltIndexId )
	{
		YCFBamTableByAltIndexIdxKey key = schema.getFactoryTable().newAltIndexIdxKey();
		key.setOptionalAltIndexTenantId( argAltIndexTenantId );
		key.setOptionalAltIndexId( argAltIndexId );
		deleteTableByAltIndexIdx( Authorization, key );
	}

	public void deleteTableByAltIndexIdx( YCFSecAuthorization Authorization,
		YCFBamTableByAltIndexIdxKey argKey )
	{
		YCFBamTableBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalAltIndexTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalAltIndexId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamTableBuff> matchSet = new LinkedList<YCFBamTableBuff>();
		Iterator<YCFBamTableBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamTableBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTable().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteTable( Authorization, cur );
		}
	}

	public void deleteTableByQualTableIdx( YCFSecAuthorization Authorization,
		Long argQualifyingTenantId,
		Long argQualifyingTableId )
	{
		YCFBamTableByQualTableIdxKey key = schema.getFactoryTable().newQualTableIdxKey();
		key.setOptionalQualifyingTenantId( argQualifyingTenantId );
		key.setOptionalQualifyingTableId( argQualifyingTableId );
		deleteTableByQualTableIdx( Authorization, key );
	}

	public void deleteTableByQualTableIdx( YCFSecAuthorization Authorization,
		YCFBamTableByQualTableIdxKey argKey )
	{
		YCFBamTableBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalQualifyingTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalQualifyingTableId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamTableBuff> matchSet = new LinkedList<YCFBamTableBuff>();
		Iterator<YCFBamTableBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamTableBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTable().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteTable( Authorization, cur );
		}
	}

	public void deleteTableByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteTableByIdIdx( Authorization, key );
	}

	public void deleteTableByIdIdx( YCFSecAuthorization Authorization,
		YCFBamScopePKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamTableBuff cur;
		LinkedList<YCFBamTableBuff> matchSet = new LinkedList<YCFBamTableBuff>();
		Iterator<YCFBamTableBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamTableBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTable().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteTable( Authorization, cur );
		}
	}

	public void deleteTableByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamScopeByTenantIdxKey key = schema.getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteTableByTenantIdx( Authorization, key );
	}

	public void deleteTableByTenantIdx( YCFSecAuthorization Authorization,
		YCFBamScopeByTenantIdxKey argKey )
	{
		YCFBamTableBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamTableBuff> matchSet = new LinkedList<YCFBamTableBuff>();
		Iterator<YCFBamTableBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamTableBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTable().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteTable( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
