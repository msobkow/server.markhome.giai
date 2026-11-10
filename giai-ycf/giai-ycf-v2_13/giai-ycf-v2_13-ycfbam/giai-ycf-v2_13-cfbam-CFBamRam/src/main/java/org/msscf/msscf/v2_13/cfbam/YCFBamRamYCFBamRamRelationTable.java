
// Description: Java 11 in-memory RAM DbIO implementation for Relation.

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
 *	YCFBamRamRelationTable in-memory RAM DbIO implementation
 *	for Relation.
 */
public class YCFBamRamRelationTable
	implements IYCFBamRelationTable
{
	private IYCFBamSchema schema;
	private Map< YCFBamScopePKey,
				YCFBamRelationBuff > dictByPKey
		= new HashMap< YCFBamScopePKey,
				YCFBamRelationBuff >();
	private Map< YCFBamRelationByUNameIdxKey,
			YCFBamRelationBuff > dictByUNameIdx
		= new HashMap< YCFBamRelationByUNameIdxKey,
			YCFBamRelationBuff >();
	private Map< YCFBamRelationByRelnTenantIdxKey,
				Map< YCFBamScopePKey,
					YCFBamRelationBuff >> dictByRelnTenantIdx
		= new HashMap< YCFBamRelationByRelnTenantIdxKey,
				Map< YCFBamScopePKey,
					YCFBamRelationBuff >>();
	private Map< YCFBamRelationByRelTableIdxKey,
				Map< YCFBamScopePKey,
					YCFBamRelationBuff >> dictByRelTableIdx
		= new HashMap< YCFBamRelationByRelTableIdxKey,
				Map< YCFBamScopePKey,
					YCFBamRelationBuff >>();
	private Map< YCFBamRelationByCodeVisIdxKey,
				Map< YCFBamScopePKey,
					YCFBamRelationBuff >> dictByCodeVisIdx
		= new HashMap< YCFBamRelationByCodeVisIdxKey,
				Map< YCFBamScopePKey,
					YCFBamRelationBuff >>();
	private Map< YCFBamRelationByTableCodeVisIdxKey,
				Map< YCFBamScopePKey,
					YCFBamRelationBuff >> dictByTableCodeVisIdx
		= new HashMap< YCFBamRelationByTableCodeVisIdxKey,
				Map< YCFBamScopePKey,
					YCFBamRelationBuff >>();
	private Map< YCFBamRelationByDefSchemaIdxKey,
				Map< YCFBamScopePKey,
					YCFBamRelationBuff >> dictByDefSchemaIdx
		= new HashMap< YCFBamRelationByDefSchemaIdxKey,
				Map< YCFBamScopePKey,
					YCFBamRelationBuff >>();
	private Map< YCFBamRelationByFromKeyIdxKey,
				Map< YCFBamScopePKey,
					YCFBamRelationBuff >> dictByFromKeyIdx
		= new HashMap< YCFBamRelationByFromKeyIdxKey,
				Map< YCFBamScopePKey,
					YCFBamRelationBuff >>();
	private Map< YCFBamRelationByToTblIdxKey,
				Map< YCFBamScopePKey,
					YCFBamRelationBuff >> dictByToTblIdx
		= new HashMap< YCFBamRelationByToTblIdxKey,
				Map< YCFBamScopePKey,
					YCFBamRelationBuff >>();
	private Map< YCFBamRelationByToKeyIdxKey,
				Map< YCFBamScopePKey,
					YCFBamRelationBuff >> dictByToKeyIdx
		= new HashMap< YCFBamRelationByToKeyIdxKey,
				Map< YCFBamScopePKey,
					YCFBamRelationBuff >>();
	private Map< YCFBamRelationByNarrowedIdxKey,
				Map< YCFBamScopePKey,
					YCFBamRelationBuff >> dictByNarrowedIdx
		= new HashMap< YCFBamRelationByNarrowedIdxKey,
				Map< YCFBamScopePKey,
					YCFBamRelationBuff >>();

	public YCFBamRamRelationTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createRelation( YCFSecAuthorization Authorization,
		YCFBamRelationBuff Buff )
	{
		final String S_ProcName = "createRelation";
		schema.getTableScope().createScope( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamRelationByUNameIdxKey keyUNameIdx = schema.getFactoryRelation().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyUNameIdx.setRequiredTableId( Buff.getRequiredTableId() );
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamRelationByRelnTenantIdxKey keyRelnTenantIdx = schema.getFactoryRelation().newRelnTenantIdxKey();
		keyRelnTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFBamRelationByRelTableIdxKey keyRelTableIdx = schema.getFactoryRelation().newRelTableIdxKey();
		keyRelTableIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyRelTableIdx.setRequiredTableId( Buff.getRequiredTableId() );

		YCFBamRelationByCodeVisIdxKey keyCodeVisIdx = schema.getFactoryRelation().newCodeVisIdxKey();
		keyCodeVisIdx.setRequiredCodeVis( Buff.getRequiredCodeVis() );

		YCFBamRelationByTableCodeVisIdxKey keyTableCodeVisIdx = schema.getFactoryRelation().newTableCodeVisIdxKey();
		keyTableCodeVisIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyTableCodeVisIdx.setRequiredTableId( Buff.getRequiredTableId() );
		keyTableCodeVisIdx.setRequiredCodeVis( Buff.getRequiredCodeVis() );

		YCFBamRelationByDefSchemaIdxKey keyDefSchemaIdx = schema.getFactoryRelation().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( Buff.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( Buff.getOptionalDefSchemaId() );

		YCFBamRelationByFromKeyIdxKey keyFromKeyIdx = schema.getFactoryRelation().newFromKeyIdxKey();
		keyFromKeyIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyFromKeyIdx.setRequiredFromIndexId( Buff.getRequiredFromIndexId() );

		YCFBamRelationByToTblIdxKey keyToTblIdx = schema.getFactoryRelation().newToTblIdxKey();
		keyToTblIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyToTblIdx.setRequiredToTableId( Buff.getRequiredToTableId() );

		YCFBamRelationByToKeyIdxKey keyToKeyIdx = schema.getFactoryRelation().newToKeyIdxKey();
		keyToKeyIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyToKeyIdx.setRequiredToIndexId( Buff.getRequiredToIndexId() );

		YCFBamRelationByNarrowedIdxKey keyNarrowedIdx = schema.getFactoryRelation().newNarrowedIdxKey();
		keyNarrowedIdx.setOptionalNarrowedTenantId( Buff.getOptionalNarrowedTenantId() );
		keyNarrowedIdx.setOptionalNarrowedId( Buff.getOptionalNarrowedId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"RelationUNameIdx",
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
						"FromTable",
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
						"RelTenant",
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
				if( null == schema.getTableIndex().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredFromIndexId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Lookup",
						"FromIndex",
						"Index",
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
						Buff.getRequiredToTableId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Lookup",
						"ToTable",
						"Table",
						null );
				}
			}
		}

		{
			boolean allNull = true;
			allNull = false;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableIndex().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredToIndexId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Lookup",
						"ToIndex",
						"Index",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

		Map< YCFBamScopePKey, YCFBamRelationBuff > subdictRelnTenantIdx;
		if( dictByRelnTenantIdx.containsKey( keyRelnTenantIdx ) ) {
			subdictRelnTenantIdx = dictByRelnTenantIdx.get( keyRelnTenantIdx );
		}
		else {
			subdictRelnTenantIdx = new HashMap< YCFBamScopePKey, YCFBamRelationBuff >();
			dictByRelnTenantIdx.put( keyRelnTenantIdx, subdictRelnTenantIdx );
		}
		subdictRelnTenantIdx.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamRelationBuff > subdictRelTableIdx;
		if( dictByRelTableIdx.containsKey( keyRelTableIdx ) ) {
			subdictRelTableIdx = dictByRelTableIdx.get( keyRelTableIdx );
		}
		else {
			subdictRelTableIdx = new HashMap< YCFBamScopePKey, YCFBamRelationBuff >();
			dictByRelTableIdx.put( keyRelTableIdx, subdictRelTableIdx );
		}
		subdictRelTableIdx.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamRelationBuff > subdictCodeVisIdx;
		if( dictByCodeVisIdx.containsKey( keyCodeVisIdx ) ) {
			subdictCodeVisIdx = dictByCodeVisIdx.get( keyCodeVisIdx );
		}
		else {
			subdictCodeVisIdx = new HashMap< YCFBamScopePKey, YCFBamRelationBuff >();
			dictByCodeVisIdx.put( keyCodeVisIdx, subdictCodeVisIdx );
		}
		subdictCodeVisIdx.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamRelationBuff > subdictTableCodeVisIdx;
		if( dictByTableCodeVisIdx.containsKey( keyTableCodeVisIdx ) ) {
			subdictTableCodeVisIdx = dictByTableCodeVisIdx.get( keyTableCodeVisIdx );
		}
		else {
			subdictTableCodeVisIdx = new HashMap< YCFBamScopePKey, YCFBamRelationBuff >();
			dictByTableCodeVisIdx.put( keyTableCodeVisIdx, subdictTableCodeVisIdx );
		}
		subdictTableCodeVisIdx.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamRelationBuff > subdictDefSchemaIdx;
		if( dictByDefSchemaIdx.containsKey( keyDefSchemaIdx ) ) {
			subdictDefSchemaIdx = dictByDefSchemaIdx.get( keyDefSchemaIdx );
		}
		else {
			subdictDefSchemaIdx = new HashMap< YCFBamScopePKey, YCFBamRelationBuff >();
			dictByDefSchemaIdx.put( keyDefSchemaIdx, subdictDefSchemaIdx );
		}
		subdictDefSchemaIdx.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamRelationBuff > subdictFromKeyIdx;
		if( dictByFromKeyIdx.containsKey( keyFromKeyIdx ) ) {
			subdictFromKeyIdx = dictByFromKeyIdx.get( keyFromKeyIdx );
		}
		else {
			subdictFromKeyIdx = new HashMap< YCFBamScopePKey, YCFBamRelationBuff >();
			dictByFromKeyIdx.put( keyFromKeyIdx, subdictFromKeyIdx );
		}
		subdictFromKeyIdx.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamRelationBuff > subdictToTblIdx;
		if( dictByToTblIdx.containsKey( keyToTblIdx ) ) {
			subdictToTblIdx = dictByToTblIdx.get( keyToTblIdx );
		}
		else {
			subdictToTblIdx = new HashMap< YCFBamScopePKey, YCFBamRelationBuff >();
			dictByToTblIdx.put( keyToTblIdx, subdictToTblIdx );
		}
		subdictToTblIdx.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamRelationBuff > subdictToKeyIdx;
		if( dictByToKeyIdx.containsKey( keyToKeyIdx ) ) {
			subdictToKeyIdx = dictByToKeyIdx.get( keyToKeyIdx );
		}
		else {
			subdictToKeyIdx = new HashMap< YCFBamScopePKey, YCFBamRelationBuff >();
			dictByToKeyIdx.put( keyToKeyIdx, subdictToKeyIdx );
		}
		subdictToKeyIdx.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamRelationBuff > subdictNarrowedIdx;
		if( dictByNarrowedIdx.containsKey( keyNarrowedIdx ) ) {
			subdictNarrowedIdx = dictByNarrowedIdx.get( keyNarrowedIdx );
		}
		else {
			subdictNarrowedIdx = new HashMap< YCFBamScopePKey, YCFBamRelationBuff >();
			dictByNarrowedIdx.put( keyNarrowedIdx, subdictNarrowedIdx );
		}
		subdictNarrowedIdx.put( pkey, Buff );

	}

	public YCFBamRelationBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamRelation.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamRelationBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamRelationBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamRelation.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamRelationBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamRelationBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamRelation.readAllDerived";
		YCFBamRelationBuff[] retList = new YCFBamRelationBuff[ dictByPKey.values().size() ];
		Iterator< YCFBamRelationBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamRelationBuff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamRelationBuff> filteredList = new ArrayList<YCFBamRelationBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamRelationBuff ) ) {
					filteredList.add( (YCFBamRelationBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamRelationBuff[0] ) );
		}
	}

	public YCFBamRelationBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamRelation.readDerivedByUNameIdx";
		YCFBamRelationByUNameIdxKey key = schema.getFactoryRelation().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );

		YCFBamRelationBuff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamRelationBuff[] readDerivedByRelnTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamRelation.readDerivedByRelnTenantIdx";
		YCFBamRelationByRelnTenantIdxKey key = schema.getFactoryRelation().newRelnTenantIdxKey();
		key.setRequiredTenantId( TenantId );

		YCFBamRelationBuff[] recArray;
		if( dictByRelnTenantIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamRelationBuff > subdictRelnTenantIdx
				= dictByRelnTenantIdx.get( key );
			recArray = new YCFBamRelationBuff[ subdictRelnTenantIdx.size() ];
			Iterator< YCFBamRelationBuff > iter = subdictRelnTenantIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamRelationBuff > subdictRelnTenantIdx
				= new HashMap< YCFBamScopePKey, YCFBamRelationBuff >();
			dictByRelnTenantIdx.put( key, subdictRelnTenantIdx );
			recArray = new YCFBamRelationBuff[0];
		}
		return( recArray );
	}

	public YCFBamRelationBuff[] readDerivedByRelTableIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId )
	{
		final String S_ProcName = "YCFBamRamRelation.readDerivedByRelTableIdx";
		YCFBamRelationByRelTableIdxKey key = schema.getFactoryRelation().newRelTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );

		YCFBamRelationBuff[] recArray;
		if( dictByRelTableIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamRelationBuff > subdictRelTableIdx
				= dictByRelTableIdx.get( key );
			recArray = new YCFBamRelationBuff[ subdictRelTableIdx.size() ];
			Iterator< YCFBamRelationBuff > iter = subdictRelTableIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamRelationBuff > subdictRelTableIdx
				= new HashMap< YCFBamScopePKey, YCFBamRelationBuff >();
			dictByRelTableIdx.put( key, subdictRelTableIdx );
			recArray = new YCFBamRelationBuff[0];
		}
		return( recArray );
	}

	public YCFBamRelationBuff[] readDerivedByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "YCFBamRamRelation.readDerivedByCodeVisIdx";
		YCFBamRelationByCodeVisIdxKey key = schema.getFactoryRelation().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );

		YCFBamRelationBuff[] recArray;
		if( dictByCodeVisIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamRelationBuff > subdictCodeVisIdx
				= dictByCodeVisIdx.get( key );
			recArray = new YCFBamRelationBuff[ subdictCodeVisIdx.size() ];
			Iterator< YCFBamRelationBuff > iter = subdictCodeVisIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamRelationBuff > subdictCodeVisIdx
				= new HashMap< YCFBamScopePKey, YCFBamRelationBuff >();
			dictByCodeVisIdx.put( key, subdictCodeVisIdx );
			recArray = new YCFBamRelationBuff[0];
		}
		return( recArray );
	}

	public YCFBamRelationBuff[] readDerivedByTableCodeVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "YCFBamRamRelation.readDerivedByTableCodeVisIdx";
		YCFBamRelationByTableCodeVisIdxKey key = schema.getFactoryRelation().newTableCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredCodeVis( CodeVis );

		YCFBamRelationBuff[] recArray;
		if( dictByTableCodeVisIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamRelationBuff > subdictTableCodeVisIdx
				= dictByTableCodeVisIdx.get( key );
			recArray = new YCFBamRelationBuff[ subdictTableCodeVisIdx.size() ];
			Iterator< YCFBamRelationBuff > iter = subdictTableCodeVisIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamRelationBuff > subdictTableCodeVisIdx
				= new HashMap< YCFBamScopePKey, YCFBamRelationBuff >();
			dictByTableCodeVisIdx.put( key, subdictTableCodeVisIdx );
			recArray = new YCFBamRelationBuff[0];
		}
		return( recArray );
	}

	public YCFBamRelationBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamRelation.readDerivedByDefSchemaIdx";
		YCFBamRelationByDefSchemaIdxKey key = schema.getFactoryRelation().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );

		YCFBamRelationBuff[] recArray;
		if( dictByDefSchemaIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamRelationBuff > subdictDefSchemaIdx
				= dictByDefSchemaIdx.get( key );
			recArray = new YCFBamRelationBuff[ subdictDefSchemaIdx.size() ];
			Iterator< YCFBamRelationBuff > iter = subdictDefSchemaIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamRelationBuff > subdictDefSchemaIdx
				= new HashMap< YCFBamScopePKey, YCFBamRelationBuff >();
			dictByDefSchemaIdx.put( key, subdictDefSchemaIdx );
			recArray = new YCFBamRelationBuff[0];
		}
		return( recArray );
	}

	public YCFBamRelationBuff[] readDerivedByFromKeyIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long FromIndexId )
	{
		final String S_ProcName = "YCFBamRamRelation.readDerivedByFromKeyIdx";
		YCFBamRelationByFromKeyIdxKey key = schema.getFactoryRelation().newFromKeyIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredFromIndexId( FromIndexId );

		YCFBamRelationBuff[] recArray;
		if( dictByFromKeyIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamRelationBuff > subdictFromKeyIdx
				= dictByFromKeyIdx.get( key );
			recArray = new YCFBamRelationBuff[ subdictFromKeyIdx.size() ];
			Iterator< YCFBamRelationBuff > iter = subdictFromKeyIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamRelationBuff > subdictFromKeyIdx
				= new HashMap< YCFBamScopePKey, YCFBamRelationBuff >();
			dictByFromKeyIdx.put( key, subdictFromKeyIdx );
			recArray = new YCFBamRelationBuff[0];
		}
		return( recArray );
	}

	public YCFBamRelationBuff[] readDerivedByToTblIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ToTableId )
	{
		final String S_ProcName = "YCFBamRamRelation.readDerivedByToTblIdx";
		YCFBamRelationByToTblIdxKey key = schema.getFactoryRelation().newToTblIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredToTableId( ToTableId );

		YCFBamRelationBuff[] recArray;
		if( dictByToTblIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamRelationBuff > subdictToTblIdx
				= dictByToTblIdx.get( key );
			recArray = new YCFBamRelationBuff[ subdictToTblIdx.size() ];
			Iterator< YCFBamRelationBuff > iter = subdictToTblIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamRelationBuff > subdictToTblIdx
				= new HashMap< YCFBamScopePKey, YCFBamRelationBuff >();
			dictByToTblIdx.put( key, subdictToTblIdx );
			recArray = new YCFBamRelationBuff[0];
		}
		return( recArray );
	}

	public YCFBamRelationBuff[] readDerivedByToKeyIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ToIndexId )
	{
		final String S_ProcName = "YCFBamRamRelation.readDerivedByToKeyIdx";
		YCFBamRelationByToKeyIdxKey key = schema.getFactoryRelation().newToKeyIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredToIndexId( ToIndexId );

		YCFBamRelationBuff[] recArray;
		if( dictByToKeyIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamRelationBuff > subdictToKeyIdx
				= dictByToKeyIdx.get( key );
			recArray = new YCFBamRelationBuff[ subdictToKeyIdx.size() ];
			Iterator< YCFBamRelationBuff > iter = subdictToKeyIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamRelationBuff > subdictToKeyIdx
				= new HashMap< YCFBamScopePKey, YCFBamRelationBuff >();
			dictByToKeyIdx.put( key, subdictToKeyIdx );
			recArray = new YCFBamRelationBuff[0];
		}
		return( recArray );
	}

	public YCFBamRelationBuff[] readDerivedByNarrowedIdx( YCFSecAuthorization Authorization,
		Long NarrowedTenantId,
		Long NarrowedId )
	{
		final String S_ProcName = "YCFBamRamRelation.readDerivedByNarrowedIdx";
		YCFBamRelationByNarrowedIdxKey key = schema.getFactoryRelation().newNarrowedIdxKey();
		key.setOptionalNarrowedTenantId( NarrowedTenantId );
		key.setOptionalNarrowedId( NarrowedId );

		YCFBamRelationBuff[] recArray;
		if( dictByNarrowedIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamRelationBuff > subdictNarrowedIdx
				= dictByNarrowedIdx.get( key );
			recArray = new YCFBamRelationBuff[ subdictNarrowedIdx.size() ];
			Iterator< YCFBamRelationBuff > iter = subdictNarrowedIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamRelationBuff > subdictNarrowedIdx
				= new HashMap< YCFBamScopePKey, YCFBamRelationBuff >();
			dictByNarrowedIdx.put( key, subdictNarrowedIdx );
			recArray = new YCFBamRelationBuff[0];
		}
		return( recArray );
	}

	public YCFBamRelationBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readDerivedByIdIdx() ";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamRelationBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamRelationBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamRelation.readBuff";
		YCFBamRelationBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a838" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamRelationBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamRelationBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a838" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamRelationBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamRelation.readAllBuff";
		YCFBamRelationBuff buff;
		ArrayList<YCFBamRelationBuff> filteredList = new ArrayList<YCFBamRelationBuff>();
		YCFBamRelationBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a838" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamRelationBuff[0] ) );
	}

	public YCFBamRelationBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByIdIdx() ";
		YCFBamRelationBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
			return( (YCFBamRelationBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamRelationBuff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByTenantIdx() ";
		YCFBamRelationBuff buff;
		ArrayList<YCFBamRelationBuff> filteredList = new ArrayList<YCFBamRelationBuff>();
		YCFBamRelationBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
				filteredList.add( (YCFBamRelationBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamRelationBuff[0] ) );
	}

	public YCFBamRelationBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamRelation.readBuffByUNameIdx() ";
		YCFBamRelationBuff buff = readDerivedByUNameIdx( Authorization,
			TenantId,
			TableId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a838" ) ) {
			return( (YCFBamRelationBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamRelationBuff[] readBuffByRelnTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamRelation.readBuffByRelnTenantIdx() ";
		YCFBamRelationBuff buff;
		ArrayList<YCFBamRelationBuff> filteredList = new ArrayList<YCFBamRelationBuff>();
		YCFBamRelationBuff[] buffList = readDerivedByRelnTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a838" ) ) {
				filteredList.add( (YCFBamRelationBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamRelationBuff[0] ) );
	}

	public YCFBamRelationBuff[] readBuffByRelTableIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId )
	{
		final String S_ProcName = "YCFBamRamRelation.readBuffByRelTableIdx() ";
		YCFBamRelationBuff buff;
		ArrayList<YCFBamRelationBuff> filteredList = new ArrayList<YCFBamRelationBuff>();
		YCFBamRelationBuff[] buffList = readDerivedByRelTableIdx( Authorization,
			TenantId,
			TableId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a838" ) ) {
				filteredList.add( (YCFBamRelationBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamRelationBuff[0] ) );
	}

	public YCFBamRelationBuff[] readBuffByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "YCFBamRamRelation.readBuffByCodeVisIdx() ";
		YCFBamRelationBuff buff;
		ArrayList<YCFBamRelationBuff> filteredList = new ArrayList<YCFBamRelationBuff>();
		YCFBamRelationBuff[] buffList = readDerivedByCodeVisIdx( Authorization,
			CodeVis );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a838" ) ) {
				filteredList.add( (YCFBamRelationBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamRelationBuff[0] ) );
	}

	public YCFBamRelationBuff[] readBuffByTableCodeVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "YCFBamRamRelation.readBuffByTableCodeVisIdx() ";
		YCFBamRelationBuff buff;
		ArrayList<YCFBamRelationBuff> filteredList = new ArrayList<YCFBamRelationBuff>();
		YCFBamRelationBuff[] buffList = readDerivedByTableCodeVisIdx( Authorization,
			TenantId,
			TableId,
			CodeVis );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a838" ) ) {
				filteredList.add( (YCFBamRelationBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamRelationBuff[0] ) );
	}

	public YCFBamRelationBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamRelation.readBuffByDefSchemaIdx() ";
		YCFBamRelationBuff buff;
		ArrayList<YCFBamRelationBuff> filteredList = new ArrayList<YCFBamRelationBuff>();
		YCFBamRelationBuff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a838" ) ) {
				filteredList.add( (YCFBamRelationBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamRelationBuff[0] ) );
	}

	public YCFBamRelationBuff[] readBuffByFromKeyIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long FromIndexId )
	{
		final String S_ProcName = "YCFBamRamRelation.readBuffByFromKeyIdx() ";
		YCFBamRelationBuff buff;
		ArrayList<YCFBamRelationBuff> filteredList = new ArrayList<YCFBamRelationBuff>();
		YCFBamRelationBuff[] buffList = readDerivedByFromKeyIdx( Authorization,
			TenantId,
			FromIndexId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a838" ) ) {
				filteredList.add( (YCFBamRelationBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamRelationBuff[0] ) );
	}

	public YCFBamRelationBuff[] readBuffByToTblIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ToTableId )
	{
		final String S_ProcName = "YCFBamRamRelation.readBuffByToTblIdx() ";
		YCFBamRelationBuff buff;
		ArrayList<YCFBamRelationBuff> filteredList = new ArrayList<YCFBamRelationBuff>();
		YCFBamRelationBuff[] buffList = readDerivedByToTblIdx( Authorization,
			TenantId,
			ToTableId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a838" ) ) {
				filteredList.add( (YCFBamRelationBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamRelationBuff[0] ) );
	}

	public YCFBamRelationBuff[] readBuffByToKeyIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ToIndexId )
	{
		final String S_ProcName = "YCFBamRamRelation.readBuffByToKeyIdx() ";
		YCFBamRelationBuff buff;
		ArrayList<YCFBamRelationBuff> filteredList = new ArrayList<YCFBamRelationBuff>();
		YCFBamRelationBuff[] buffList = readDerivedByToKeyIdx( Authorization,
			TenantId,
			ToIndexId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a838" ) ) {
				filteredList.add( (YCFBamRelationBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamRelationBuff[0] ) );
	}

	public YCFBamRelationBuff[] readBuffByNarrowedIdx( YCFSecAuthorization Authorization,
		Long NarrowedTenantId,
		Long NarrowedId )
	{
		final String S_ProcName = "YCFBamRamRelation.readBuffByNarrowedIdx() ";
		YCFBamRelationBuff buff;
		ArrayList<YCFBamRelationBuff> filteredList = new ArrayList<YCFBamRelationBuff>();
		YCFBamRelationBuff[] buffList = readDerivedByNarrowedIdx( Authorization,
			NarrowedTenantId,
			NarrowedId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a838" ) ) {
				filteredList.add( (YCFBamRelationBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamRelationBuff[0] ) );
	}

	/**
	 *	Read a page array of the specific Relation buffer instances identified by the duplicate key RelnTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamRelationBuff[] pageBuffByRelnTenantIdx( YCFSecAuthorization Authorization,
		long TenantId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByRelnTenantIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific Relation buffer instances identified by the duplicate key RelTableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamRelationBuff[] pageBuffByRelTableIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByRelTableIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific Relation buffer instances identified by the duplicate key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argCodeVis	The Relation key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamRelationBuff[] pageBuffByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByCodeVisIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific Relation buffer instances identified by the duplicate key TableCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The Relation key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamRelationBuff[] pageBuffByTableCodeVisIdx( YCFSecAuthorization Authorization,
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
	 *	Read a page array of the specific Relation buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamRelationBuff[] pageBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByDefSchemaIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific Relation buffer instances identified by the duplicate key FromKeyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argFromIndexId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamRelationBuff[] pageBuffByFromKeyIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long FromIndexId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByFromKeyIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific Relation buffer instances identified by the duplicate key ToTblIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argToTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamRelationBuff[] pageBuffByToTblIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ToTableId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByToTblIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific Relation buffer instances identified by the duplicate key ToKeyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argToIndexId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamRelationBuff[] pageBuffByToKeyIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ToIndexId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByToKeyIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific Relation buffer instances identified by the duplicate key NarrowedIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNarrowedTenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	argNarrowedId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamRelationBuff[] pageBuffByNarrowedIdx( YCFSecAuthorization Authorization,
		Long NarrowedTenantId,
		Long NarrowedId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByNarrowedIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateRelation( YCFSecAuthorization Authorization,
		YCFBamRelationBuff Buff )
	{
		schema.getTableScope().updateScope( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamRelationBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateRelation",
				"Existing record not found",
				"Relation",
				pkey );
		}
		YCFBamRelationByUNameIdxKey existingKeyUNameIdx = schema.getFactoryRelation().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyUNameIdx.setRequiredTableId( existing.getRequiredTableId() );
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamRelationByUNameIdxKey newKeyUNameIdx = schema.getFactoryRelation().newUNameIdxKey();
		newKeyUNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyUNameIdx.setRequiredTableId( Buff.getRequiredTableId() );
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamRelationByRelnTenantIdxKey existingKeyRelnTenantIdx = schema.getFactoryRelation().newRelnTenantIdxKey();
		existingKeyRelnTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFBamRelationByRelnTenantIdxKey newKeyRelnTenantIdx = schema.getFactoryRelation().newRelnTenantIdxKey();
		newKeyRelnTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFBamRelationByRelTableIdxKey existingKeyRelTableIdx = schema.getFactoryRelation().newRelTableIdxKey();
		existingKeyRelTableIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyRelTableIdx.setRequiredTableId( existing.getRequiredTableId() );

		YCFBamRelationByRelTableIdxKey newKeyRelTableIdx = schema.getFactoryRelation().newRelTableIdxKey();
		newKeyRelTableIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyRelTableIdx.setRequiredTableId( Buff.getRequiredTableId() );

		YCFBamRelationByCodeVisIdxKey existingKeyCodeVisIdx = schema.getFactoryRelation().newCodeVisIdxKey();
		existingKeyCodeVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		YCFBamRelationByCodeVisIdxKey newKeyCodeVisIdx = schema.getFactoryRelation().newCodeVisIdxKey();
		newKeyCodeVisIdx.setRequiredCodeVis( Buff.getRequiredCodeVis() );

		YCFBamRelationByTableCodeVisIdxKey existingKeyTableCodeVisIdx = schema.getFactoryRelation().newTableCodeVisIdxKey();
		existingKeyTableCodeVisIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyTableCodeVisIdx.setRequiredTableId( existing.getRequiredTableId() );
		existingKeyTableCodeVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		YCFBamRelationByTableCodeVisIdxKey newKeyTableCodeVisIdx = schema.getFactoryRelation().newTableCodeVisIdxKey();
		newKeyTableCodeVisIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyTableCodeVisIdx.setRequiredTableId( Buff.getRequiredTableId() );
		newKeyTableCodeVisIdx.setRequiredCodeVis( Buff.getRequiredCodeVis() );

		YCFBamRelationByDefSchemaIdxKey existingKeyDefSchemaIdx = schema.getFactoryRelation().newDefSchemaIdxKey();
		existingKeyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		existingKeyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		YCFBamRelationByDefSchemaIdxKey newKeyDefSchemaIdx = schema.getFactoryRelation().newDefSchemaIdxKey();
		newKeyDefSchemaIdx.setOptionalDefSchemaTenantId( Buff.getOptionalDefSchemaTenantId() );
		newKeyDefSchemaIdx.setOptionalDefSchemaId( Buff.getOptionalDefSchemaId() );

		YCFBamRelationByFromKeyIdxKey existingKeyFromKeyIdx = schema.getFactoryRelation().newFromKeyIdxKey();
		existingKeyFromKeyIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyFromKeyIdx.setRequiredFromIndexId( existing.getRequiredFromIndexId() );

		YCFBamRelationByFromKeyIdxKey newKeyFromKeyIdx = schema.getFactoryRelation().newFromKeyIdxKey();
		newKeyFromKeyIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyFromKeyIdx.setRequiredFromIndexId( Buff.getRequiredFromIndexId() );

		YCFBamRelationByToTblIdxKey existingKeyToTblIdx = schema.getFactoryRelation().newToTblIdxKey();
		existingKeyToTblIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyToTblIdx.setRequiredToTableId( existing.getRequiredToTableId() );

		YCFBamRelationByToTblIdxKey newKeyToTblIdx = schema.getFactoryRelation().newToTblIdxKey();
		newKeyToTblIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyToTblIdx.setRequiredToTableId( Buff.getRequiredToTableId() );

		YCFBamRelationByToKeyIdxKey existingKeyToKeyIdx = schema.getFactoryRelation().newToKeyIdxKey();
		existingKeyToKeyIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyToKeyIdx.setRequiredToIndexId( existing.getRequiredToIndexId() );

		YCFBamRelationByToKeyIdxKey newKeyToKeyIdx = schema.getFactoryRelation().newToKeyIdxKey();
		newKeyToKeyIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyToKeyIdx.setRequiredToIndexId( Buff.getRequiredToIndexId() );

		YCFBamRelationByNarrowedIdxKey existingKeyNarrowedIdx = schema.getFactoryRelation().newNarrowedIdxKey();
		existingKeyNarrowedIdx.setOptionalNarrowedTenantId( existing.getOptionalNarrowedTenantId() );
		existingKeyNarrowedIdx.setOptionalNarrowedId( existing.getOptionalNarrowedId() );

		YCFBamRelationByNarrowedIdxKey newKeyNarrowedIdx = schema.getFactoryRelation().newNarrowedIdxKey();
		newKeyNarrowedIdx.setOptionalNarrowedTenantId( Buff.getOptionalNarrowedTenantId() );
		newKeyNarrowedIdx.setOptionalNarrowedId( Buff.getOptionalNarrowedId() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateRelation",
					"RelationUNameIdx",
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
						"updateRelation",
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
						"updateRelation",
						"Container",
						"FromTable",
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
						"updateRelation",
						"Owner",
						"RelTenant",
						"Tenant",
						null );
				}
			}
		}

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableIndex().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredFromIndexId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateRelation",
						"Lookup",
						"FromIndex",
						"Index",
						null );
				}
			}
		}

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableTable().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredToTableId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateRelation",
						"Lookup",
						"ToTable",
						"Table",
						null );
				}
			}
		}

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableIndex().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredToIndexId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateRelation",
						"Lookup",
						"ToIndex",
						"Index",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamScopePKey, YCFBamRelationBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

		subdict = dictByRelnTenantIdx.get( existingKeyRelnTenantIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByRelnTenantIdx.containsKey( newKeyRelnTenantIdx ) ) {
			subdict = dictByRelnTenantIdx.get( newKeyRelnTenantIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamRelationBuff >();
			dictByRelnTenantIdx.put( newKeyRelnTenantIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByRelTableIdx.get( existingKeyRelTableIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByRelTableIdx.containsKey( newKeyRelTableIdx ) ) {
			subdict = dictByRelTableIdx.get( newKeyRelTableIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamRelationBuff >();
			dictByRelTableIdx.put( newKeyRelTableIdx, subdict );
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
			subdict = new HashMap< YCFBamScopePKey, YCFBamRelationBuff >();
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
			subdict = new HashMap< YCFBamScopePKey, YCFBamRelationBuff >();
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
			subdict = new HashMap< YCFBamScopePKey, YCFBamRelationBuff >();
			dictByDefSchemaIdx.put( newKeyDefSchemaIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByFromKeyIdx.get( existingKeyFromKeyIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByFromKeyIdx.containsKey( newKeyFromKeyIdx ) ) {
			subdict = dictByFromKeyIdx.get( newKeyFromKeyIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamRelationBuff >();
			dictByFromKeyIdx.put( newKeyFromKeyIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByToTblIdx.get( existingKeyToTblIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByToTblIdx.containsKey( newKeyToTblIdx ) ) {
			subdict = dictByToTblIdx.get( newKeyToTblIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamRelationBuff >();
			dictByToTblIdx.put( newKeyToTblIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByToKeyIdx.get( existingKeyToKeyIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByToKeyIdx.containsKey( newKeyToKeyIdx ) ) {
			subdict = dictByToKeyIdx.get( newKeyToKeyIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamRelationBuff >();
			dictByToKeyIdx.put( newKeyToKeyIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByNarrowedIdx.get( existingKeyNarrowedIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByNarrowedIdx.containsKey( newKeyNarrowedIdx ) ) {
			subdict = dictByNarrowedIdx.get( newKeyNarrowedIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamRelationBuff >();
			dictByNarrowedIdx.put( newKeyNarrowedIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteRelation( YCFSecAuthorization Authorization,
		YCFBamRelationBuff Buff )
	{
		final String S_ProcName = "YCFBamRamRelationTable.deleteRelation() ";
		String classCode;
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamRelationBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteRelation",
				pkey );
		}
					schema.getTablePopTopDep().deletePopTopDepByContRelIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
					schema.getTableRelationCol().deleteRelationColByRelationIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		YCFBamRelationByUNameIdxKey keyUNameIdx = schema.getFactoryRelation().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredTableId( existing.getRequiredTableId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamRelationByRelnTenantIdxKey keyRelnTenantIdx = schema.getFactoryRelation().newRelnTenantIdxKey();
		keyRelnTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFBamRelationByRelTableIdxKey keyRelTableIdx = schema.getFactoryRelation().newRelTableIdxKey();
		keyRelTableIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyRelTableIdx.setRequiredTableId( existing.getRequiredTableId() );

		YCFBamRelationByCodeVisIdxKey keyCodeVisIdx = schema.getFactoryRelation().newCodeVisIdxKey();
		keyCodeVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		YCFBamRelationByTableCodeVisIdxKey keyTableCodeVisIdx = schema.getFactoryRelation().newTableCodeVisIdxKey();
		keyTableCodeVisIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyTableCodeVisIdx.setRequiredTableId( existing.getRequiredTableId() );
		keyTableCodeVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		YCFBamRelationByDefSchemaIdxKey keyDefSchemaIdx = schema.getFactoryRelation().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		YCFBamRelationByFromKeyIdxKey keyFromKeyIdx = schema.getFactoryRelation().newFromKeyIdxKey();
		keyFromKeyIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyFromKeyIdx.setRequiredFromIndexId( existing.getRequiredFromIndexId() );

		YCFBamRelationByToTblIdxKey keyToTblIdx = schema.getFactoryRelation().newToTblIdxKey();
		keyToTblIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyToTblIdx.setRequiredToTableId( existing.getRequiredToTableId() );

		YCFBamRelationByToKeyIdxKey keyToKeyIdx = schema.getFactoryRelation().newToKeyIdxKey();
		keyToKeyIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyToKeyIdx.setRequiredToIndexId( existing.getRequiredToIndexId() );

		YCFBamRelationByNarrowedIdxKey keyNarrowedIdx = schema.getFactoryRelation().newNarrowedIdxKey();
		keyNarrowedIdx.setOptionalNarrowedTenantId( existing.getOptionalNarrowedTenantId() );
		keyNarrowedIdx.setOptionalNarrowedId( existing.getOptionalNarrowedId() );

		// Validate reverse foreign keys

		if( schema.getTableChain().readDerivedByPrevRelIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ).length > 0 )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteRelation",
				"Lookup",
				"PrevRelation",
				"Chain",
				pkey );
		}

		if( schema.getTableChain().readDerivedByNextRelIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ).length > 0 )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteRelation",
				"Lookup",
				"NextRelation",
				"Chain",
				pkey );
		}

		if( schema.getTableClearDep().readDerivedByClearDepIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ).length > 0 )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteRelation",
				"Lookup",
				"Relation",
				"ClearDep",
				pkey );
		}

		if( schema.getTableDelDep().readDerivedByDelDepIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ).length > 0 )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteRelation",
				"Lookup",
				"Relation",
				"DelDep",
				pkey );
		}

		if( schema.getTablePopDep().readDerivedByRelationIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ).length > 0 )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteRelation",
				"Lookup",
				"Relation",
				"PopDep",
				pkey );
		}

		// Delete is valid
		Map< YCFBamScopePKey, YCFBamRelationBuff > subdict;

		dictByPKey.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

		subdict = dictByRelnTenantIdx.get( keyRelnTenantIdx );
		subdict.remove( pkey );

		subdict = dictByRelTableIdx.get( keyRelTableIdx );
		subdict.remove( pkey );

		subdict = dictByCodeVisIdx.get( keyCodeVisIdx );
		subdict.remove( pkey );

		subdict = dictByTableCodeVisIdx.get( keyTableCodeVisIdx );
		subdict.remove( pkey );

		subdict = dictByDefSchemaIdx.get( keyDefSchemaIdx );
		subdict.remove( pkey );

		subdict = dictByFromKeyIdx.get( keyFromKeyIdx );
		subdict.remove( pkey );

		subdict = dictByToTblIdx.get( keyToTblIdx );
		subdict.remove( pkey );

		subdict = dictByToKeyIdx.get( keyToKeyIdx );
		subdict.remove( pkey );

		subdict = dictByNarrowedIdx.get( keyNarrowedIdx );
		subdict.remove( pkey );

		schema.getTableScope().deleteScope( Authorization,
			Buff );
	}
	public void deleteRelationByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTableId,
		String argName )
	{
		YCFBamRelationByUNameIdxKey key = schema.getFactoryRelation().newUNameIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTableId( argTableId );
		key.setRequiredName( argName );
		deleteRelationByUNameIdx( Authorization, key );
	}

	public void deleteRelationByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamRelationByUNameIdxKey argKey )
	{
		YCFBamRelationBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamRelationBuff> matchSet = new LinkedList<YCFBamRelationBuff>();
		Iterator<YCFBamRelationBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamRelationBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRelation().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteRelation( Authorization, cur );
		}
	}

	public void deleteRelationByRelnTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamRelationByRelnTenantIdxKey key = schema.getFactoryRelation().newRelnTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteRelationByRelnTenantIdx( Authorization, key );
	}

	public void deleteRelationByRelnTenantIdx( YCFSecAuthorization Authorization,
		YCFBamRelationByRelnTenantIdxKey argKey )
	{
		YCFBamRelationBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamRelationBuff> matchSet = new LinkedList<YCFBamRelationBuff>();
		Iterator<YCFBamRelationBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamRelationBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRelation().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteRelation( Authorization, cur );
		}
	}

	public void deleteRelationByRelTableIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTableId )
	{
		YCFBamRelationByRelTableIdxKey key = schema.getFactoryRelation().newRelTableIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTableId( argTableId );
		deleteRelationByRelTableIdx( Authorization, key );
	}

	public void deleteRelationByRelTableIdx( YCFSecAuthorization Authorization,
		YCFBamRelationByRelTableIdxKey argKey )
	{
		YCFBamRelationBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamRelationBuff> matchSet = new LinkedList<YCFBamRelationBuff>();
		Iterator<YCFBamRelationBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamRelationBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRelation().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteRelation( Authorization, cur );
		}
	}

	public void deleteRelationByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum argCodeVis )
	{
		YCFBamRelationByCodeVisIdxKey key = schema.getFactoryRelation().newCodeVisIdxKey();
		key.setRequiredCodeVis( argCodeVis );
		deleteRelationByCodeVisIdx( Authorization, key );
	}

	public void deleteRelationByCodeVisIdx( YCFSecAuthorization Authorization,
		YCFBamRelationByCodeVisIdxKey argKey )
	{
		YCFBamRelationBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamRelationBuff> matchSet = new LinkedList<YCFBamRelationBuff>();
		Iterator<YCFBamRelationBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamRelationBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRelation().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteRelation( Authorization, cur );
		}
	}

	public void deleteRelationByTableCodeVisIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTableId,
		IYCFBamSchema.CodeVisibilityEnum argCodeVis )
	{
		YCFBamRelationByTableCodeVisIdxKey key = schema.getFactoryRelation().newTableCodeVisIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTableId( argTableId );
		key.setRequiredCodeVis( argCodeVis );
		deleteRelationByTableCodeVisIdx( Authorization, key );
	}

	public void deleteRelationByTableCodeVisIdx( YCFSecAuthorization Authorization,
		YCFBamRelationByTableCodeVisIdxKey argKey )
	{
		YCFBamRelationBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamRelationBuff> matchSet = new LinkedList<YCFBamRelationBuff>();
		Iterator<YCFBamRelationBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamRelationBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRelation().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteRelation( Authorization, cur );
		}
	}

	public void deleteRelationByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamRelationByDefSchemaIdxKey key = schema.getFactoryRelation().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deleteRelationByDefSchemaIdx( Authorization, key );
	}

	public void deleteRelationByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamRelationByDefSchemaIdxKey argKey )
	{
		YCFBamRelationBuff cur;
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
		LinkedList<YCFBamRelationBuff> matchSet = new LinkedList<YCFBamRelationBuff>();
		Iterator<YCFBamRelationBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamRelationBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRelation().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteRelation( Authorization, cur );
		}
	}

	public void deleteRelationByFromKeyIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argFromIndexId )
	{
		YCFBamRelationByFromKeyIdxKey key = schema.getFactoryRelation().newFromKeyIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredFromIndexId( argFromIndexId );
		deleteRelationByFromKeyIdx( Authorization, key );
	}

	public void deleteRelationByFromKeyIdx( YCFSecAuthorization Authorization,
		YCFBamRelationByFromKeyIdxKey argKey )
	{
		YCFBamRelationBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamRelationBuff> matchSet = new LinkedList<YCFBamRelationBuff>();
		Iterator<YCFBamRelationBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamRelationBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRelation().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteRelation( Authorization, cur );
		}
	}

	public void deleteRelationByToTblIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argToTableId )
	{
		YCFBamRelationByToTblIdxKey key = schema.getFactoryRelation().newToTblIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredToTableId( argToTableId );
		deleteRelationByToTblIdx( Authorization, key );
	}

	public void deleteRelationByToTblIdx( YCFSecAuthorization Authorization,
		YCFBamRelationByToTblIdxKey argKey )
	{
		YCFBamRelationBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamRelationBuff> matchSet = new LinkedList<YCFBamRelationBuff>();
		Iterator<YCFBamRelationBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamRelationBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRelation().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteRelation( Authorization, cur );
		}
	}

	public void deleteRelationByToKeyIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argToIndexId )
	{
		YCFBamRelationByToKeyIdxKey key = schema.getFactoryRelation().newToKeyIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredToIndexId( argToIndexId );
		deleteRelationByToKeyIdx( Authorization, key );
	}

	public void deleteRelationByToKeyIdx( YCFSecAuthorization Authorization,
		YCFBamRelationByToKeyIdxKey argKey )
	{
		YCFBamRelationBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamRelationBuff> matchSet = new LinkedList<YCFBamRelationBuff>();
		Iterator<YCFBamRelationBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamRelationBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRelation().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteRelation( Authorization, cur );
		}
	}

	public void deleteRelationByNarrowedIdx( YCFSecAuthorization Authorization,
		Long argNarrowedTenantId,
		Long argNarrowedId )
	{
		YCFBamRelationByNarrowedIdxKey key = schema.getFactoryRelation().newNarrowedIdxKey();
		key.setOptionalNarrowedTenantId( argNarrowedTenantId );
		key.setOptionalNarrowedId( argNarrowedId );
		deleteRelationByNarrowedIdx( Authorization, key );
	}

	public void deleteRelationByNarrowedIdx( YCFSecAuthorization Authorization,
		YCFBamRelationByNarrowedIdxKey argKey )
	{
		YCFBamRelationBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalNarrowedTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalNarrowedId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamRelationBuff> matchSet = new LinkedList<YCFBamRelationBuff>();
		Iterator<YCFBamRelationBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamRelationBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRelation().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteRelation( Authorization, cur );
		}
	}

	public void deleteRelationByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteRelationByIdIdx( Authorization, key );
	}

	public void deleteRelationByIdIdx( YCFSecAuthorization Authorization,
		YCFBamScopePKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamRelationBuff cur;
		LinkedList<YCFBamRelationBuff> matchSet = new LinkedList<YCFBamRelationBuff>();
		Iterator<YCFBamRelationBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamRelationBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRelation().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteRelation( Authorization, cur );
		}
	}

	public void deleteRelationByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamScopeByTenantIdxKey key = schema.getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteRelationByTenantIdx( Authorization, key );
	}

	public void deleteRelationByTenantIdx( YCFSecAuthorization Authorization,
		YCFBamScopeByTenantIdxKey argKey )
	{
		YCFBamRelationBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamRelationBuff> matchSet = new LinkedList<YCFBamRelationBuff>();
		Iterator<YCFBamRelationBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamRelationBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRelation().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteRelation( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
