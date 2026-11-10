
// Description: Java 11 in-memory RAM DbIO implementation for RelationCol.

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
 *	YCFBamRamRelationColTable in-memory RAM DbIO implementation
 *	for RelationCol.
 */
public class YCFBamRamRelationColTable
	implements IYCFBamRelationColTable
{
	private IYCFBamSchema schema;
	private Map< YCFBamRelationColPKey,
				YCFBamRelationColBuff > dictByPKey
		= new HashMap< YCFBamRelationColPKey,
				YCFBamRelationColBuff >();
	private Map< YCFBamRelationColByUNameIdxKey,
			YCFBamRelationColBuff > dictByUNameIdx
		= new HashMap< YCFBamRelationColByUNameIdxKey,
			YCFBamRelationColBuff >();
	private Map< YCFBamRelationColByRelColTenantIdxKey,
				Map< YCFBamRelationColPKey,
					YCFBamRelationColBuff >> dictByRelColTenantIdx
		= new HashMap< YCFBamRelationColByRelColTenantIdxKey,
				Map< YCFBamRelationColPKey,
					YCFBamRelationColBuff >>();
	private Map< YCFBamRelationColByRelationIdxKey,
				Map< YCFBamRelationColPKey,
					YCFBamRelationColBuff >> dictByRelationIdx
		= new HashMap< YCFBamRelationColByRelationIdxKey,
				Map< YCFBamRelationColPKey,
					YCFBamRelationColBuff >>();
	private Map< YCFBamRelationColByDefSchemaIdxKey,
				Map< YCFBamRelationColPKey,
					YCFBamRelationColBuff >> dictByDefSchemaIdx
		= new HashMap< YCFBamRelationColByDefSchemaIdxKey,
				Map< YCFBamRelationColPKey,
					YCFBamRelationColBuff >>();
	private Map< YCFBamRelationColByFromColIdxKey,
				Map< YCFBamRelationColPKey,
					YCFBamRelationColBuff >> dictByFromColIdx
		= new HashMap< YCFBamRelationColByFromColIdxKey,
				Map< YCFBamRelationColPKey,
					YCFBamRelationColBuff >>();
	private Map< YCFBamRelationColByToColIdxKey,
				Map< YCFBamRelationColPKey,
					YCFBamRelationColBuff >> dictByToColIdx
		= new HashMap< YCFBamRelationColByToColIdxKey,
				Map< YCFBamRelationColPKey,
					YCFBamRelationColBuff >>();
	private Map< YCFBamRelationColByPrevIdxKey,
				Map< YCFBamRelationColPKey,
					YCFBamRelationColBuff >> dictByPrevIdx
		= new HashMap< YCFBamRelationColByPrevIdxKey,
				Map< YCFBamRelationColPKey,
					YCFBamRelationColBuff >>();
	private Map< YCFBamRelationColByNextIdxKey,
				Map< YCFBamRelationColPKey,
					YCFBamRelationColBuff >> dictByNextIdx
		= new HashMap< YCFBamRelationColByNextIdxKey,
				Map< YCFBamRelationColPKey,
					YCFBamRelationColBuff >>();
	private Map< YCFBamRelationColByRelPrevIdxKey,
				Map< YCFBamRelationColPKey,
					YCFBamRelationColBuff >> dictByRelPrevIdx
		= new HashMap< YCFBamRelationColByRelPrevIdxKey,
				Map< YCFBamRelationColPKey,
					YCFBamRelationColBuff >>();
	private Map< YCFBamRelationColByRelNextIdxKey,
				Map< YCFBamRelationColPKey,
					YCFBamRelationColBuff >> dictByRelNextIdx
		= new HashMap< YCFBamRelationColByRelNextIdxKey,
				Map< YCFBamRelationColPKey,
					YCFBamRelationColBuff >>();

	public YCFBamRamRelationColTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createRelationCol( YCFSecAuthorization Authorization,
		YCFBamRelationColBuff Buff )
	{
		final String S_ProcName = "createRelationCol";
			YCFBamRelationColBuff tail = null;

			YCFBamRelationColBuff[] siblings = schema.getTableRelationCol().readDerivedByRelationIdx( Authorization,
				Buff.getRequiredTenantId(),
				Buff.getRequiredRelationId() );
			for( int idx = 0; ( tail == null ) && ( idx < siblings.length ); idx ++ ) {
				if( ( siblings[idx].getOptionalNextTenantId() == null )
					&& ( siblings[idx].getOptionalNextId() == null ) )
				{
					tail = siblings[idx];
				}
			}
			if( tail != null ) {
				Buff.setOptionalPrevTenantId( tail.getRequiredTenantId() );
				Buff.setOptionalPrevId( tail.getRequiredId() );
			}
			else {
				Buff.setOptionalPrevTenantId( null );
				Buff.setOptionalPrevId( null );
			}
		
		YCFBamRelationColPKey pkey = schema.getFactoryRelationCol().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( ((YCFBamRamTenantTable)schema.getTableTenant()).nextRelationColIdGen( Authorization,
			Buff.getRequiredTenantId() ) );
		Buff.setRequiredTenantId( pkey.getRequiredTenantId() );
		Buff.setRequiredId( pkey.getRequiredId() );
		YCFBamRelationColByUNameIdxKey keyUNameIdx = schema.getFactoryRelationCol().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyUNameIdx.setRequiredRelationId( Buff.getRequiredRelationId() );
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamRelationColByRelColTenantIdxKey keyRelColTenantIdx = schema.getFactoryRelationCol().newRelColTenantIdxKey();
		keyRelColTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFBamRelationColByRelationIdxKey keyRelationIdx = schema.getFactoryRelationCol().newRelationIdxKey();
		keyRelationIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyRelationIdx.setRequiredRelationId( Buff.getRequiredRelationId() );

		YCFBamRelationColByDefSchemaIdxKey keyDefSchemaIdx = schema.getFactoryRelationCol().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( Buff.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( Buff.getOptionalDefSchemaId() );

		YCFBamRelationColByFromColIdxKey keyFromColIdx = schema.getFactoryRelationCol().newFromColIdxKey();
		keyFromColIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyFromColIdx.setRequiredFromColId( Buff.getRequiredFromColId() );

		YCFBamRelationColByToColIdxKey keyToColIdx = schema.getFactoryRelationCol().newToColIdxKey();
		keyToColIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyToColIdx.setRequiredToColId( Buff.getRequiredToColId() );

		YCFBamRelationColByPrevIdxKey keyPrevIdx = schema.getFactoryRelationCol().newPrevIdxKey();
		keyPrevIdx.setOptionalPrevTenantId( Buff.getOptionalPrevTenantId() );
		keyPrevIdx.setOptionalPrevId( Buff.getOptionalPrevId() );

		YCFBamRelationColByNextIdxKey keyNextIdx = schema.getFactoryRelationCol().newNextIdxKey();
		keyNextIdx.setOptionalNextTenantId( Buff.getOptionalNextTenantId() );
		keyNextIdx.setOptionalNextId( Buff.getOptionalNextId() );

		YCFBamRelationColByRelPrevIdxKey keyRelPrevIdx = schema.getFactoryRelationCol().newRelPrevIdxKey();
		keyRelPrevIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyRelPrevIdx.setRequiredRelationId( Buff.getRequiredRelationId() );
		keyRelPrevIdx.setOptionalPrevId( Buff.getOptionalPrevId() );

		YCFBamRelationColByRelNextIdxKey keyRelNextIdx = schema.getFactoryRelationCol().newRelNextIdxKey();
		keyRelNextIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyRelNextIdx.setRequiredRelationId( Buff.getRequiredRelationId() );
		keyRelNextIdx.setOptionalNextId( Buff.getOptionalNextId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"RelationColUNameIdx",
				keyUNameIdx );
		}

		// Validate foreign keys

		{
			boolean allNull = true;
			allNull = false;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableRelation().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredRelationId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"Relation",
						"Relation",
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
				if( null == schema.getTableIndexCol().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredFromColId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Lookup",
						"LookupFromCol",
						"IndexCol",
						null );
				}
			}
		}

		{
			boolean allNull = true;
			allNull = false;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableIndexCol().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredToColId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Lookup",
						"LookupToCol",
						"IndexCol",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

		Map< YCFBamRelationColPKey, YCFBamRelationColBuff > subdictRelColTenantIdx;
		if( dictByRelColTenantIdx.containsKey( keyRelColTenantIdx ) ) {
			subdictRelColTenantIdx = dictByRelColTenantIdx.get( keyRelColTenantIdx );
		}
		else {
			subdictRelColTenantIdx = new HashMap< YCFBamRelationColPKey, YCFBamRelationColBuff >();
			dictByRelColTenantIdx.put( keyRelColTenantIdx, subdictRelColTenantIdx );
		}
		subdictRelColTenantIdx.put( pkey, Buff );

		Map< YCFBamRelationColPKey, YCFBamRelationColBuff > subdictRelationIdx;
		if( dictByRelationIdx.containsKey( keyRelationIdx ) ) {
			subdictRelationIdx = dictByRelationIdx.get( keyRelationIdx );
		}
		else {
			subdictRelationIdx = new HashMap< YCFBamRelationColPKey, YCFBamRelationColBuff >();
			dictByRelationIdx.put( keyRelationIdx, subdictRelationIdx );
		}
		subdictRelationIdx.put( pkey, Buff );

		Map< YCFBamRelationColPKey, YCFBamRelationColBuff > subdictDefSchemaIdx;
		if( dictByDefSchemaIdx.containsKey( keyDefSchemaIdx ) ) {
			subdictDefSchemaIdx = dictByDefSchemaIdx.get( keyDefSchemaIdx );
		}
		else {
			subdictDefSchemaIdx = new HashMap< YCFBamRelationColPKey, YCFBamRelationColBuff >();
			dictByDefSchemaIdx.put( keyDefSchemaIdx, subdictDefSchemaIdx );
		}
		subdictDefSchemaIdx.put( pkey, Buff );

		Map< YCFBamRelationColPKey, YCFBamRelationColBuff > subdictFromColIdx;
		if( dictByFromColIdx.containsKey( keyFromColIdx ) ) {
			subdictFromColIdx = dictByFromColIdx.get( keyFromColIdx );
		}
		else {
			subdictFromColIdx = new HashMap< YCFBamRelationColPKey, YCFBamRelationColBuff >();
			dictByFromColIdx.put( keyFromColIdx, subdictFromColIdx );
		}
		subdictFromColIdx.put( pkey, Buff );

		Map< YCFBamRelationColPKey, YCFBamRelationColBuff > subdictToColIdx;
		if( dictByToColIdx.containsKey( keyToColIdx ) ) {
			subdictToColIdx = dictByToColIdx.get( keyToColIdx );
		}
		else {
			subdictToColIdx = new HashMap< YCFBamRelationColPKey, YCFBamRelationColBuff >();
			dictByToColIdx.put( keyToColIdx, subdictToColIdx );
		}
		subdictToColIdx.put( pkey, Buff );

		Map< YCFBamRelationColPKey, YCFBamRelationColBuff > subdictPrevIdx;
		if( dictByPrevIdx.containsKey( keyPrevIdx ) ) {
			subdictPrevIdx = dictByPrevIdx.get( keyPrevIdx );
		}
		else {
			subdictPrevIdx = new HashMap< YCFBamRelationColPKey, YCFBamRelationColBuff >();
			dictByPrevIdx.put( keyPrevIdx, subdictPrevIdx );
		}
		subdictPrevIdx.put( pkey, Buff );

		Map< YCFBamRelationColPKey, YCFBamRelationColBuff > subdictNextIdx;
		if( dictByNextIdx.containsKey( keyNextIdx ) ) {
			subdictNextIdx = dictByNextIdx.get( keyNextIdx );
		}
		else {
			subdictNextIdx = new HashMap< YCFBamRelationColPKey, YCFBamRelationColBuff >();
			dictByNextIdx.put( keyNextIdx, subdictNextIdx );
		}
		subdictNextIdx.put( pkey, Buff );

		Map< YCFBamRelationColPKey, YCFBamRelationColBuff > subdictRelPrevIdx;
		if( dictByRelPrevIdx.containsKey( keyRelPrevIdx ) ) {
			subdictRelPrevIdx = dictByRelPrevIdx.get( keyRelPrevIdx );
		}
		else {
			subdictRelPrevIdx = new HashMap< YCFBamRelationColPKey, YCFBamRelationColBuff >();
			dictByRelPrevIdx.put( keyRelPrevIdx, subdictRelPrevIdx );
		}
		subdictRelPrevIdx.put( pkey, Buff );

		Map< YCFBamRelationColPKey, YCFBamRelationColBuff > subdictRelNextIdx;
		if( dictByRelNextIdx.containsKey( keyRelNextIdx ) ) {
			subdictRelNextIdx = dictByRelNextIdx.get( keyRelNextIdx );
		}
		else {
			subdictRelNextIdx = new HashMap< YCFBamRelationColPKey, YCFBamRelationColBuff >();
			dictByRelNextIdx.put( keyRelNextIdx, subdictRelNextIdx );
		}
		subdictRelNextIdx.put( pkey, Buff );

		if( tail != null ) {
			YCFBamRelationColBuff tailEdit = schema.getFactoryRelationCol().newBuff();
			tailEdit.set( (YCFBamRelationColBuff)tail );
				tailEdit.setOptionalNextTenantId( Buff.getRequiredTenantId() );
				tailEdit.setOptionalNextId( Buff.getRequiredId() );
			schema.getTableRelationCol().updateRelationCol( Authorization, tailEdit );
		}
	}

	public YCFBamRelationColBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamRelationColPKey PKey )
	{
		final String S_ProcName = "YCFBamRamRelationCol.readDerived";
		YCFBamRelationColPKey key = schema.getFactoryRelationCol().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamRelationColBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamRelationColBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamRelationColPKey PKey )
	{
		final String S_ProcName = "YCFBamRamRelationCol.readDerived";
		YCFBamRelationColPKey key = schema.getFactoryRelationCol().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamRelationColBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamRelationColBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamRelationCol.readAllDerived";
		YCFBamRelationColBuff[] retList = new YCFBamRelationColBuff[ dictByPKey.values().size() ];
		Iterator< YCFBamRelationColBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamRelationColBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long RelationId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamRelationCol.readDerivedByUNameIdx";
		YCFBamRelationColByUNameIdxKey key = schema.getFactoryRelationCol().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredRelationId( RelationId );
		key.setRequiredName( Name );

		YCFBamRelationColBuff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamRelationColBuff[] readDerivedByRelColTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamRelationCol.readDerivedByRelColTenantIdx";
		YCFBamRelationColByRelColTenantIdxKey key = schema.getFactoryRelationCol().newRelColTenantIdxKey();
		key.setRequiredTenantId( TenantId );

		YCFBamRelationColBuff[] recArray;
		if( dictByRelColTenantIdx.containsKey( key ) ) {
			Map< YCFBamRelationColPKey, YCFBamRelationColBuff > subdictRelColTenantIdx
				= dictByRelColTenantIdx.get( key );
			recArray = new YCFBamRelationColBuff[ subdictRelColTenantIdx.size() ];
			Iterator< YCFBamRelationColBuff > iter = subdictRelColTenantIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamRelationColPKey, YCFBamRelationColBuff > subdictRelColTenantIdx
				= new HashMap< YCFBamRelationColPKey, YCFBamRelationColBuff >();
			dictByRelColTenantIdx.put( key, subdictRelColTenantIdx );
			recArray = new YCFBamRelationColBuff[0];
		}
		return( recArray );
	}

	public YCFBamRelationColBuff[] readDerivedByRelationIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long RelationId )
	{
		final String S_ProcName = "YCFBamRamRelationCol.readDerivedByRelationIdx";
		YCFBamRelationColByRelationIdxKey key = schema.getFactoryRelationCol().newRelationIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredRelationId( RelationId );

		YCFBamRelationColBuff[] recArray;
		if( dictByRelationIdx.containsKey( key ) ) {
			Map< YCFBamRelationColPKey, YCFBamRelationColBuff > subdictRelationIdx
				= dictByRelationIdx.get( key );
			recArray = new YCFBamRelationColBuff[ subdictRelationIdx.size() ];
			Iterator< YCFBamRelationColBuff > iter = subdictRelationIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamRelationColPKey, YCFBamRelationColBuff > subdictRelationIdx
				= new HashMap< YCFBamRelationColPKey, YCFBamRelationColBuff >();
			dictByRelationIdx.put( key, subdictRelationIdx );
			recArray = new YCFBamRelationColBuff[0];
		}
		return( recArray );
	}

	public YCFBamRelationColBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamRelationCol.readDerivedByDefSchemaIdx";
		YCFBamRelationColByDefSchemaIdxKey key = schema.getFactoryRelationCol().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );

		YCFBamRelationColBuff[] recArray;
		if( dictByDefSchemaIdx.containsKey( key ) ) {
			Map< YCFBamRelationColPKey, YCFBamRelationColBuff > subdictDefSchemaIdx
				= dictByDefSchemaIdx.get( key );
			recArray = new YCFBamRelationColBuff[ subdictDefSchemaIdx.size() ];
			Iterator< YCFBamRelationColBuff > iter = subdictDefSchemaIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamRelationColPKey, YCFBamRelationColBuff > subdictDefSchemaIdx
				= new HashMap< YCFBamRelationColPKey, YCFBamRelationColBuff >();
			dictByDefSchemaIdx.put( key, subdictDefSchemaIdx );
			recArray = new YCFBamRelationColBuff[0];
		}
		return( recArray );
	}

	public YCFBamRelationColBuff[] readDerivedByFromColIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long FromColId )
	{
		final String S_ProcName = "YCFBamRamRelationCol.readDerivedByFromColIdx";
		YCFBamRelationColByFromColIdxKey key = schema.getFactoryRelationCol().newFromColIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredFromColId( FromColId );

		YCFBamRelationColBuff[] recArray;
		if( dictByFromColIdx.containsKey( key ) ) {
			Map< YCFBamRelationColPKey, YCFBamRelationColBuff > subdictFromColIdx
				= dictByFromColIdx.get( key );
			recArray = new YCFBamRelationColBuff[ subdictFromColIdx.size() ];
			Iterator< YCFBamRelationColBuff > iter = subdictFromColIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamRelationColPKey, YCFBamRelationColBuff > subdictFromColIdx
				= new HashMap< YCFBamRelationColPKey, YCFBamRelationColBuff >();
			dictByFromColIdx.put( key, subdictFromColIdx );
			recArray = new YCFBamRelationColBuff[0];
		}
		return( recArray );
	}

	public YCFBamRelationColBuff[] readDerivedByToColIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ToColId )
	{
		final String S_ProcName = "YCFBamRamRelationCol.readDerivedByToColIdx";
		YCFBamRelationColByToColIdxKey key = schema.getFactoryRelationCol().newToColIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredToColId( ToColId );

		YCFBamRelationColBuff[] recArray;
		if( dictByToColIdx.containsKey( key ) ) {
			Map< YCFBamRelationColPKey, YCFBamRelationColBuff > subdictToColIdx
				= dictByToColIdx.get( key );
			recArray = new YCFBamRelationColBuff[ subdictToColIdx.size() ];
			Iterator< YCFBamRelationColBuff > iter = subdictToColIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamRelationColPKey, YCFBamRelationColBuff > subdictToColIdx
				= new HashMap< YCFBamRelationColPKey, YCFBamRelationColBuff >();
			dictByToColIdx.put( key, subdictToColIdx );
			recArray = new YCFBamRelationColBuff[0];
		}
		return( recArray );
	}

	public YCFBamRelationColBuff[] readDerivedByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "YCFBamRamRelationCol.readDerivedByPrevIdx";
		YCFBamRelationColByPrevIdxKey key = schema.getFactoryRelationCol().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );

		YCFBamRelationColBuff[] recArray;
		if( dictByPrevIdx.containsKey( key ) ) {
			Map< YCFBamRelationColPKey, YCFBamRelationColBuff > subdictPrevIdx
				= dictByPrevIdx.get( key );
			recArray = new YCFBamRelationColBuff[ subdictPrevIdx.size() ];
			Iterator< YCFBamRelationColBuff > iter = subdictPrevIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamRelationColPKey, YCFBamRelationColBuff > subdictPrevIdx
				= new HashMap< YCFBamRelationColPKey, YCFBamRelationColBuff >();
			dictByPrevIdx.put( key, subdictPrevIdx );
			recArray = new YCFBamRelationColBuff[0];
		}
		return( recArray );
	}

	public YCFBamRelationColBuff[] readDerivedByNextIdx( YCFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "YCFBamRamRelationCol.readDerivedByNextIdx";
		YCFBamRelationColByNextIdxKey key = schema.getFactoryRelationCol().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );

		YCFBamRelationColBuff[] recArray;
		if( dictByNextIdx.containsKey( key ) ) {
			Map< YCFBamRelationColPKey, YCFBamRelationColBuff > subdictNextIdx
				= dictByNextIdx.get( key );
			recArray = new YCFBamRelationColBuff[ subdictNextIdx.size() ];
			Iterator< YCFBamRelationColBuff > iter = subdictNextIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamRelationColPKey, YCFBamRelationColBuff > subdictNextIdx
				= new HashMap< YCFBamRelationColPKey, YCFBamRelationColBuff >();
			dictByNextIdx.put( key, subdictNextIdx );
			recArray = new YCFBamRelationColBuff[0];
		}
		return( recArray );
	}

	public YCFBamRelationColBuff[] readDerivedByRelPrevIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long RelationId,
		Long PrevId )
	{
		final String S_ProcName = "YCFBamRamRelationCol.readDerivedByRelPrevIdx";
		YCFBamRelationColByRelPrevIdxKey key = schema.getFactoryRelationCol().newRelPrevIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredRelationId( RelationId );
		key.setOptionalPrevId( PrevId );

		YCFBamRelationColBuff[] recArray;
		if( dictByRelPrevIdx.containsKey( key ) ) {
			Map< YCFBamRelationColPKey, YCFBamRelationColBuff > subdictRelPrevIdx
				= dictByRelPrevIdx.get( key );
			recArray = new YCFBamRelationColBuff[ subdictRelPrevIdx.size() ];
			Iterator< YCFBamRelationColBuff > iter = subdictRelPrevIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamRelationColPKey, YCFBamRelationColBuff > subdictRelPrevIdx
				= new HashMap< YCFBamRelationColPKey, YCFBamRelationColBuff >();
			dictByRelPrevIdx.put( key, subdictRelPrevIdx );
			recArray = new YCFBamRelationColBuff[0];
		}
		return( recArray );
	}

	public YCFBamRelationColBuff[] readDerivedByRelNextIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long RelationId,
		Long NextId )
	{
		final String S_ProcName = "YCFBamRamRelationCol.readDerivedByRelNextIdx";
		YCFBamRelationColByRelNextIdxKey key = schema.getFactoryRelationCol().newRelNextIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredRelationId( RelationId );
		key.setOptionalNextId( NextId );

		YCFBamRelationColBuff[] recArray;
		if( dictByRelNextIdx.containsKey( key ) ) {
			Map< YCFBamRelationColPKey, YCFBamRelationColBuff > subdictRelNextIdx
				= dictByRelNextIdx.get( key );
			recArray = new YCFBamRelationColBuff[ subdictRelNextIdx.size() ];
			Iterator< YCFBamRelationColBuff > iter = subdictRelNextIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamRelationColPKey, YCFBamRelationColBuff > subdictRelNextIdx
				= new HashMap< YCFBamRelationColPKey, YCFBamRelationColBuff >();
			dictByRelNextIdx.put( key, subdictRelNextIdx );
			recArray = new YCFBamRelationColBuff[0];
		}
		return( recArray );
	}

	public YCFBamRelationColBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamRelationCol.readDerivedByIdIdx() ";
		YCFBamRelationColPKey key = schema.getFactoryRelationCol().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamRelationColBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamRelationColBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamRelationColPKey PKey )
	{
		final String S_ProcName = "YCFBamRamRelationCol.readBuff";
		YCFBamRelationColBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a839" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamRelationColBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamRelationColPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamRelationColBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a839" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamRelationColBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamRelationCol.readAllBuff";
		YCFBamRelationColBuff buff;
		ArrayList<YCFBamRelationColBuff> filteredList = new ArrayList<YCFBamRelationColBuff>();
		YCFBamRelationColBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a839" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamRelationColBuff[0] ) );
	}

	public YCFBamRelationColBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamRelationCol.readBuffByIdIdx() ";
		YCFBamRelationColBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a839" ) ) {
			return( (YCFBamRelationColBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamRelationColBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long RelationId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamRelationCol.readBuffByUNameIdx() ";
		YCFBamRelationColBuff buff = readDerivedByUNameIdx( Authorization,
			TenantId,
			RelationId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a839" ) ) {
			return( (YCFBamRelationColBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamRelationColBuff[] readBuffByRelColTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamRelationCol.readBuffByRelColTenantIdx() ";
		YCFBamRelationColBuff buff;
		ArrayList<YCFBamRelationColBuff> filteredList = new ArrayList<YCFBamRelationColBuff>();
		YCFBamRelationColBuff[] buffList = readDerivedByRelColTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a839" ) ) {
				filteredList.add( (YCFBamRelationColBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamRelationColBuff[0] ) );
	}

	public YCFBamRelationColBuff[] readBuffByRelationIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long RelationId )
	{
		final String S_ProcName = "YCFBamRamRelationCol.readBuffByRelationIdx() ";
		YCFBamRelationColBuff buff;
		ArrayList<YCFBamRelationColBuff> filteredList = new ArrayList<YCFBamRelationColBuff>();
		YCFBamRelationColBuff[] buffList = readDerivedByRelationIdx( Authorization,
			TenantId,
			RelationId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a839" ) ) {
				filteredList.add( (YCFBamRelationColBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamRelationColBuff[0] ) );
	}

	public YCFBamRelationColBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamRelationCol.readBuffByDefSchemaIdx() ";
		YCFBamRelationColBuff buff;
		ArrayList<YCFBamRelationColBuff> filteredList = new ArrayList<YCFBamRelationColBuff>();
		YCFBamRelationColBuff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a839" ) ) {
				filteredList.add( (YCFBamRelationColBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamRelationColBuff[0] ) );
	}

	public YCFBamRelationColBuff[] readBuffByFromColIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long FromColId )
	{
		final String S_ProcName = "YCFBamRamRelationCol.readBuffByFromColIdx() ";
		YCFBamRelationColBuff buff;
		ArrayList<YCFBamRelationColBuff> filteredList = new ArrayList<YCFBamRelationColBuff>();
		YCFBamRelationColBuff[] buffList = readDerivedByFromColIdx( Authorization,
			TenantId,
			FromColId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a839" ) ) {
				filteredList.add( (YCFBamRelationColBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamRelationColBuff[0] ) );
	}

	public YCFBamRelationColBuff[] readBuffByToColIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ToColId )
	{
		final String S_ProcName = "YCFBamRamRelationCol.readBuffByToColIdx() ";
		YCFBamRelationColBuff buff;
		ArrayList<YCFBamRelationColBuff> filteredList = new ArrayList<YCFBamRelationColBuff>();
		YCFBamRelationColBuff[] buffList = readDerivedByToColIdx( Authorization,
			TenantId,
			ToColId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a839" ) ) {
				filteredList.add( (YCFBamRelationColBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamRelationColBuff[0] ) );
	}

	public YCFBamRelationColBuff[] readBuffByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "YCFBamRamRelationCol.readBuffByPrevIdx() ";
		YCFBamRelationColBuff buff;
		ArrayList<YCFBamRelationColBuff> filteredList = new ArrayList<YCFBamRelationColBuff>();
		YCFBamRelationColBuff[] buffList = readDerivedByPrevIdx( Authorization,
			PrevTenantId,
			PrevId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a839" ) ) {
				filteredList.add( (YCFBamRelationColBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamRelationColBuff[0] ) );
	}

	public YCFBamRelationColBuff[] readBuffByNextIdx( YCFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "YCFBamRamRelationCol.readBuffByNextIdx() ";
		YCFBamRelationColBuff buff;
		ArrayList<YCFBamRelationColBuff> filteredList = new ArrayList<YCFBamRelationColBuff>();
		YCFBamRelationColBuff[] buffList = readDerivedByNextIdx( Authorization,
			NextTenantId,
			NextId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a839" ) ) {
				filteredList.add( (YCFBamRelationColBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamRelationColBuff[0] ) );
	}

	public YCFBamRelationColBuff[] readBuffByRelPrevIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long RelationId,
		Long PrevId )
	{
		final String S_ProcName = "YCFBamRamRelationCol.readBuffByRelPrevIdx() ";
		YCFBamRelationColBuff buff;
		ArrayList<YCFBamRelationColBuff> filteredList = new ArrayList<YCFBamRelationColBuff>();
		YCFBamRelationColBuff[] buffList = readDerivedByRelPrevIdx( Authorization,
			TenantId,
			RelationId,
			PrevId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a839" ) ) {
				filteredList.add( (YCFBamRelationColBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamRelationColBuff[0] ) );
	}

	public YCFBamRelationColBuff[] readBuffByRelNextIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long RelationId,
		Long NextId )
	{
		final String S_ProcName = "YCFBamRamRelationCol.readBuffByRelNextIdx() ";
		YCFBamRelationColBuff buff;
		ArrayList<YCFBamRelationColBuff> filteredList = new ArrayList<YCFBamRelationColBuff>();
		YCFBamRelationColBuff[] buffList = readDerivedByRelNextIdx( Authorization,
			TenantId,
			RelationId,
			NextId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a839" ) ) {
				filteredList.add( (YCFBamRelationColBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamRelationColBuff[0] ) );
	}

	/**
	 *	Move the specified buffer up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	public YCFBamRelationColBuff moveBuffUp( YCFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision )
	{
		final String S_ProcName = "moveBuffUp";

		YCFBamRelationColBuff grandprev = null;
		YCFBamRelationColBuff prev = null;
		YCFBamRelationColBuff cur = null;
		YCFBamRelationColBuff next = null;

		cur = schema.getTableRelationCol().readDerivedByIdIdx(Authorization, TenantId, Id);
		if( cur == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object" );
		}

		if( ( cur.getOptionalPrevTenantId() == null )
			&& ( cur.getOptionalPrevId() == null ) )
		{
			return( (YCFBamRelationColBuff)cur );
		}

		prev = schema.getTableRelationCol().readDerivedByIdIdx(Authorization, cur.getOptionalPrevTenantId(), cur.getOptionalPrevId() );
		if( prev == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object.prev" );
		}

		if( ( prev.getOptionalPrevTenantId() != null )
			&& ( prev.getOptionalPrevId() != null ) )
		{
			grandprev = schema.getTableRelationCol().readDerivedByIdIdx(Authorization, prev.getOptionalPrevTenantId(), prev.getOptionalPrevId() );
			if( grandprev == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.prev.prev" );
			}
		}

		if( ( cur.getOptionalNextTenantId() != null )
			&& ( cur.getOptionalNextId() != null ) )
		{
			next = schema.getTableRelationCol().readDerivedByIdIdx(Authorization, cur.getOptionalNextTenantId(), cur.getOptionalNextId() );
			if( next == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.next" );
			}
		}

		String classCode = prev.getClassCode();
		YCFBamRelationColBuff newInstance;
			if( classCode.equals( "a839" ) ) {
				newInstance = schema.getFactoryRelationCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamRelationColBuff editPrev = newInstance;
		editPrev.set( prev );

		classCode = cur.getClassCode();
			if( classCode.equals( "a839" ) ) {
				newInstance = schema.getFactoryRelationCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamRelationColBuff editCur = newInstance;
		editCur.set( cur );

		YCFBamRelationColBuff editGrandprev = null;
		if( grandprev != null ) {
			classCode = grandprev.getClassCode();
			if( classCode.equals( "a839" ) ) {
				newInstance = schema.getFactoryRelationCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editGrandprev = newInstance;
			editGrandprev.set( grandprev );
		}

		YCFBamRelationColBuff editNext = null;
		if( next != null ) {
			classCode = next.getClassCode();
			if( classCode.equals( "a839" ) ) {
				newInstance = schema.getFactoryRelationCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editNext = newInstance;
			editNext.set( next );
		}

		if( editGrandprev != null ) {
			editGrandprev.setOptionalNextTenantId( cur.getRequiredTenantId() );
			editGrandprev.setOptionalNextId( cur.getRequiredId() );
			editCur.setOptionalPrevTenantId( grandprev.getRequiredTenantId() );
			editCur.setOptionalPrevId( grandprev.getRequiredId() );
		}
		else {
			editCur.setOptionalPrevTenantId( null );
			editCur.setOptionalPrevId( null );
		}

			editPrev.setOptionalPrevTenantId( cur.getRequiredTenantId() );
			editPrev.setOptionalPrevId( cur.getRequiredId() );

			editCur.setOptionalNextTenantId( prev.getRequiredTenantId() );
			editCur.setOptionalNextId( prev.getRequiredId() );

		if( next != null ) {
			editPrev.setOptionalNextTenantId( next.getRequiredTenantId() );
			editPrev.setOptionalNextId( next.getRequiredId() );
			editNext.setOptionalPrevTenantId( prev.getRequiredTenantId() );
			editNext.setOptionalPrevId( prev.getRequiredId() );
		}
		else {
			editPrev.setOptionalNextTenantId( null );
			editPrev.setOptionalNextId( null );
		}

		if( editGrandprev != null ) {
			classCode = editGrandprev.getClassCode();
			if( classCode.equals( "a839" ) ) {
				schema.getTableRelationCol().updateRelationCol( Authorization, editGrandprev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		classCode = editPrev.getClassCode();
			if( classCode.equals( "a839" ) ) {
				schema.getTableRelationCol().updateRelationCol( Authorization, editPrev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		classCode = editCur.getClassCode();
			if( classCode.equals( "a839" ) ) {
				schema.getTableRelationCol().updateRelationCol( Authorization, editCur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		if( editNext != null ) {
			classCode = editNext.getClassCode();
			if( classCode.equals( "a839" ) ) {
				schema.getTableRelationCol().updateRelationCol( Authorization, editNext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		return( (YCFBamRelationColBuff)editCur );
	}

	/**
	 *	Move the specified buffer down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	public YCFBamRelationColBuff moveBuffDown( YCFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision )
	{
		final String S_ProcName = "moveBuffDown";

		YCFBamRelationColBuff prev = null;
		YCFBamRelationColBuff cur = null;
		YCFBamRelationColBuff next = null;
		YCFBamRelationColBuff grandnext = null;

		cur = schema.getTableRelationCol().readDerivedByIdIdx(Authorization, TenantId, Id);
		if( cur == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object" );
		}

		if( ( cur.getOptionalNextTenantId() == null )
			&& ( cur.getOptionalNextId() == null ) )
		{
			return( (YCFBamRelationColBuff)cur );
		}

		next = schema.getTableRelationCol().readDerivedByIdIdx(Authorization, cur.getOptionalNextTenantId(), cur.getOptionalNextId() );
		if( next == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object.next" );
		}

		if( ( next.getOptionalNextTenantId() != null )
			&& ( next.getOptionalNextId() != null ) )
		{
			grandnext = schema.getTableRelationCol().readDerivedByIdIdx(Authorization, next.getOptionalNextTenantId(), next.getOptionalNextId() );
			if( grandnext == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.next.next" );
			}
		}

		if( ( cur.getOptionalPrevTenantId() != null )
			&& ( cur.getOptionalPrevId() != null ) )
		{
			prev = schema.getTableRelationCol().readDerivedByIdIdx(Authorization, cur.getOptionalPrevTenantId(), cur.getOptionalPrevId() );
			if( prev == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.prev" );
			}
		}

		String classCode = cur.getClassCode();
		YCFBamRelationColBuff newInstance;
			if( classCode.equals( "a839" ) ) {
				newInstance = schema.getFactoryRelationCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamRelationColBuff editCur = newInstance;
		editCur.set( cur );

		classCode = next.getClassCode();
			if( classCode.equals( "a839" ) ) {
				newInstance = schema.getFactoryRelationCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamRelationColBuff editNext = newInstance;
		editNext.set( next );

		YCFBamRelationColBuff editGrandnext = null;
		if( grandnext != null ) {
			classCode = grandnext.getClassCode();
			if( classCode.equals( "a839" ) ) {
				newInstance = schema.getFactoryRelationCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editGrandnext = newInstance;
			editGrandnext.set( grandnext );
		}

		YCFBamRelationColBuff editPrev = null;
		if( prev != null ) {
			classCode = prev.getClassCode();
			if( classCode.equals( "a839" ) ) {
				newInstance = schema.getFactoryRelationCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editPrev = newInstance;
			editPrev.set( prev );
		}

		if( prev != null ) {
			editPrev.setOptionalNextTenantId( next.getRequiredTenantId() );
			editPrev.setOptionalNextId( next.getRequiredId() );
			editNext.setOptionalPrevTenantId( prev.getRequiredTenantId() );
			editNext.setOptionalPrevId( prev.getRequiredId() );
		}
		else {
			editNext.setOptionalPrevTenantId( null );
			editNext.setOptionalPrevId( null );
		}

			editCur.setOptionalPrevTenantId( next.getRequiredTenantId() );
			editCur.setOptionalPrevId( next.getRequiredId() );

			editNext.setOptionalNextTenantId( cur.getRequiredTenantId() );
			editNext.setOptionalNextId( cur.getRequiredId() );

		if( editGrandnext != null ) {
			editCur.setOptionalNextTenantId( grandnext.getRequiredTenantId() );
			editCur.setOptionalNextId( grandnext.getRequiredId() );
			editGrandnext.setOptionalPrevTenantId( cur.getRequiredTenantId() );
			editGrandnext.setOptionalPrevId( cur.getRequiredId() );
		}
		else {
			editCur.setOptionalNextTenantId( null );
			editCur.setOptionalNextId( null );
		}

		if( editPrev != null ) {
			classCode = editPrev.getClassCode();
			if( classCode.equals( "a839" ) ) {
				schema.getTableRelationCol().updateRelationCol( Authorization, editPrev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		classCode = editCur.getClassCode();
			if( classCode.equals( "a839" ) ) {
				schema.getTableRelationCol().updateRelationCol( Authorization, editCur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		classCode = editNext.getClassCode();
			if( classCode.equals( "a839" ) ) {
				schema.getTableRelationCol().updateRelationCol( Authorization, editNext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		if( editGrandnext != null ) {
			classCode = editGrandnext.getClassCode();
			if( classCode.equals( "a839" ) ) {
				schema.getTableRelationCol().updateRelationCol( Authorization, editGrandnext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		return( (YCFBamRelationColBuff)editCur );
	}

	public void updateRelationCol( YCFSecAuthorization Authorization,
		YCFBamRelationColBuff Buff )
	{
		YCFBamRelationColPKey pkey = schema.getFactoryRelationCol().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamRelationColBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateRelationCol",
				"Existing record not found",
				"RelationCol",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateRelationCol",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFBamRelationColByUNameIdxKey existingKeyUNameIdx = schema.getFactoryRelationCol().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyUNameIdx.setRequiredRelationId( existing.getRequiredRelationId() );
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamRelationColByUNameIdxKey newKeyUNameIdx = schema.getFactoryRelationCol().newUNameIdxKey();
		newKeyUNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyUNameIdx.setRequiredRelationId( Buff.getRequiredRelationId() );
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamRelationColByRelColTenantIdxKey existingKeyRelColTenantIdx = schema.getFactoryRelationCol().newRelColTenantIdxKey();
		existingKeyRelColTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFBamRelationColByRelColTenantIdxKey newKeyRelColTenantIdx = schema.getFactoryRelationCol().newRelColTenantIdxKey();
		newKeyRelColTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFBamRelationColByRelationIdxKey existingKeyRelationIdx = schema.getFactoryRelationCol().newRelationIdxKey();
		existingKeyRelationIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyRelationIdx.setRequiredRelationId( existing.getRequiredRelationId() );

		YCFBamRelationColByRelationIdxKey newKeyRelationIdx = schema.getFactoryRelationCol().newRelationIdxKey();
		newKeyRelationIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyRelationIdx.setRequiredRelationId( Buff.getRequiredRelationId() );

		YCFBamRelationColByDefSchemaIdxKey existingKeyDefSchemaIdx = schema.getFactoryRelationCol().newDefSchemaIdxKey();
		existingKeyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		existingKeyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		YCFBamRelationColByDefSchemaIdxKey newKeyDefSchemaIdx = schema.getFactoryRelationCol().newDefSchemaIdxKey();
		newKeyDefSchemaIdx.setOptionalDefSchemaTenantId( Buff.getOptionalDefSchemaTenantId() );
		newKeyDefSchemaIdx.setOptionalDefSchemaId( Buff.getOptionalDefSchemaId() );

		YCFBamRelationColByFromColIdxKey existingKeyFromColIdx = schema.getFactoryRelationCol().newFromColIdxKey();
		existingKeyFromColIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyFromColIdx.setRequiredFromColId( existing.getRequiredFromColId() );

		YCFBamRelationColByFromColIdxKey newKeyFromColIdx = schema.getFactoryRelationCol().newFromColIdxKey();
		newKeyFromColIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyFromColIdx.setRequiredFromColId( Buff.getRequiredFromColId() );

		YCFBamRelationColByToColIdxKey existingKeyToColIdx = schema.getFactoryRelationCol().newToColIdxKey();
		existingKeyToColIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyToColIdx.setRequiredToColId( existing.getRequiredToColId() );

		YCFBamRelationColByToColIdxKey newKeyToColIdx = schema.getFactoryRelationCol().newToColIdxKey();
		newKeyToColIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyToColIdx.setRequiredToColId( Buff.getRequiredToColId() );

		YCFBamRelationColByPrevIdxKey existingKeyPrevIdx = schema.getFactoryRelationCol().newPrevIdxKey();
		existingKeyPrevIdx.setOptionalPrevTenantId( existing.getOptionalPrevTenantId() );
		existingKeyPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamRelationColByPrevIdxKey newKeyPrevIdx = schema.getFactoryRelationCol().newPrevIdxKey();
		newKeyPrevIdx.setOptionalPrevTenantId( Buff.getOptionalPrevTenantId() );
		newKeyPrevIdx.setOptionalPrevId( Buff.getOptionalPrevId() );

		YCFBamRelationColByNextIdxKey existingKeyNextIdx = schema.getFactoryRelationCol().newNextIdxKey();
		existingKeyNextIdx.setOptionalNextTenantId( existing.getOptionalNextTenantId() );
		existingKeyNextIdx.setOptionalNextId( existing.getOptionalNextId() );

		YCFBamRelationColByNextIdxKey newKeyNextIdx = schema.getFactoryRelationCol().newNextIdxKey();
		newKeyNextIdx.setOptionalNextTenantId( Buff.getOptionalNextTenantId() );
		newKeyNextIdx.setOptionalNextId( Buff.getOptionalNextId() );

		YCFBamRelationColByRelPrevIdxKey existingKeyRelPrevIdx = schema.getFactoryRelationCol().newRelPrevIdxKey();
		existingKeyRelPrevIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyRelPrevIdx.setRequiredRelationId( existing.getRequiredRelationId() );
		existingKeyRelPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamRelationColByRelPrevIdxKey newKeyRelPrevIdx = schema.getFactoryRelationCol().newRelPrevIdxKey();
		newKeyRelPrevIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyRelPrevIdx.setRequiredRelationId( Buff.getRequiredRelationId() );
		newKeyRelPrevIdx.setOptionalPrevId( Buff.getOptionalPrevId() );

		YCFBamRelationColByRelNextIdxKey existingKeyRelNextIdx = schema.getFactoryRelationCol().newRelNextIdxKey();
		existingKeyRelNextIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyRelNextIdx.setRequiredRelationId( existing.getRequiredRelationId() );
		existingKeyRelNextIdx.setOptionalNextId( existing.getOptionalNextId() );

		YCFBamRelationColByRelNextIdxKey newKeyRelNextIdx = schema.getFactoryRelationCol().newRelNextIdxKey();
		newKeyRelNextIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyRelNextIdx.setRequiredRelationId( Buff.getRequiredRelationId() );
		newKeyRelNextIdx.setOptionalNextId( Buff.getOptionalNextId() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateRelationCol",
					"RelationColUNameIdx",
					newKeyUNameIdx );
			}
		}

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableRelation().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredRelationId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateRelationCol",
						"Container",
						"Relation",
						"Relation",
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
						"updateRelationCol",
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
				if( null == schema.getTableIndexCol().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredFromColId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateRelationCol",
						"Lookup",
						"LookupFromCol",
						"IndexCol",
						null );
				}
			}
		}

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableIndexCol().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredToColId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateRelationCol",
						"Lookup",
						"LookupToCol",
						"IndexCol",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamRelationColPKey, YCFBamRelationColBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

		subdict = dictByRelColTenantIdx.get( existingKeyRelColTenantIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByRelColTenantIdx.containsKey( newKeyRelColTenantIdx ) ) {
			subdict = dictByRelColTenantIdx.get( newKeyRelColTenantIdx );
		}
		else {
			subdict = new HashMap< YCFBamRelationColPKey, YCFBamRelationColBuff >();
			dictByRelColTenantIdx.put( newKeyRelColTenantIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByRelationIdx.get( existingKeyRelationIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByRelationIdx.containsKey( newKeyRelationIdx ) ) {
			subdict = dictByRelationIdx.get( newKeyRelationIdx );
		}
		else {
			subdict = new HashMap< YCFBamRelationColPKey, YCFBamRelationColBuff >();
			dictByRelationIdx.put( newKeyRelationIdx, subdict );
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
			subdict = new HashMap< YCFBamRelationColPKey, YCFBamRelationColBuff >();
			dictByDefSchemaIdx.put( newKeyDefSchemaIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByFromColIdx.get( existingKeyFromColIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByFromColIdx.containsKey( newKeyFromColIdx ) ) {
			subdict = dictByFromColIdx.get( newKeyFromColIdx );
		}
		else {
			subdict = new HashMap< YCFBamRelationColPKey, YCFBamRelationColBuff >();
			dictByFromColIdx.put( newKeyFromColIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByToColIdx.get( existingKeyToColIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByToColIdx.containsKey( newKeyToColIdx ) ) {
			subdict = dictByToColIdx.get( newKeyToColIdx );
		}
		else {
			subdict = new HashMap< YCFBamRelationColPKey, YCFBamRelationColBuff >();
			dictByToColIdx.put( newKeyToColIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByPrevIdx.get( existingKeyPrevIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByPrevIdx.containsKey( newKeyPrevIdx ) ) {
			subdict = dictByPrevIdx.get( newKeyPrevIdx );
		}
		else {
			subdict = new HashMap< YCFBamRelationColPKey, YCFBamRelationColBuff >();
			dictByPrevIdx.put( newKeyPrevIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByNextIdx.get( existingKeyNextIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByNextIdx.containsKey( newKeyNextIdx ) ) {
			subdict = dictByNextIdx.get( newKeyNextIdx );
		}
		else {
			subdict = new HashMap< YCFBamRelationColPKey, YCFBamRelationColBuff >();
			dictByNextIdx.put( newKeyNextIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByRelPrevIdx.get( existingKeyRelPrevIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByRelPrevIdx.containsKey( newKeyRelPrevIdx ) ) {
			subdict = dictByRelPrevIdx.get( newKeyRelPrevIdx );
		}
		else {
			subdict = new HashMap< YCFBamRelationColPKey, YCFBamRelationColBuff >();
			dictByRelPrevIdx.put( newKeyRelPrevIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByRelNextIdx.get( existingKeyRelNextIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByRelNextIdx.containsKey( newKeyRelNextIdx ) ) {
			subdict = dictByRelNextIdx.get( newKeyRelNextIdx );
		}
		else {
			subdict = new HashMap< YCFBamRelationColPKey, YCFBamRelationColBuff >();
			dictByRelNextIdx.put( newKeyRelNextIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteRelationCol( YCFSecAuthorization Authorization,
		YCFBamRelationColBuff Buff )
	{
		final String S_ProcName = "YCFBamRamRelationColTable.deleteRelationCol() ";
		String classCode;
		YCFBamRelationColPKey pkey = schema.getFactoryRelationCol().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamRelationColBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteRelationCol",
				pkey );
		}
		long varTenantId = existing.getRequiredTenantId();
		long varRelationId = existing.getRequiredRelationId();
		YCFBamRelationBuff container = schema.getTableRelation().readDerivedByIdIdx( Authorization,
			varTenantId,
			varRelationId );
		if( container == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				0,
				"container" );
		}

		Long prevTenantId = existing.getOptionalPrevTenantId();
		Long prevId = existing.getOptionalPrevId();
		Long nextTenantId = existing.getOptionalNextTenantId();
		Long nextId = existing.getOptionalNextId();

		YCFBamRelationColBuff prev = null;
		if( ( prevTenantId != null )
			&& ( prevId != null ) )
		{
			prev = schema.getTableRelationCol().readDerivedByIdIdx( Authorization,
				prevTenantId,
				prevId );
			if( prev == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"prev" );
			}
			YCFBamRelationColBuff editPrev;
			classCode = prev.getClassCode();
			if( classCode.equals( "a839" ) ) {
				editPrev = schema.getFactoryRelationCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editPrev.set( prev );
			editPrev.setOptionalNextTenantId( nextTenantId );
			editPrev.setOptionalNextId( nextId );
			if( classCode.equals( "a839" ) ) {
				schema.getTableRelationCol().updateRelationCol( Authorization, editPrev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		YCFBamRelationColBuff next = null;
		if( ( nextTenantId != null )
			&& ( nextId != null ) )
		{
			next = schema.getTableRelationCol().readDerivedByIdIdx( Authorization,
				nextTenantId,
				nextId );
			if( next == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"next" );
			}
			YCFBamRelationColBuff editNext;
			classCode = next.getClassCode();
			if( classCode.equals( "a839" ) ) {
				editNext = schema.getFactoryRelationCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editNext.set( next );
			editNext.setOptionalPrevTenantId( prevTenantId );
			editNext.setOptionalPrevId( prevId );
			if( classCode.equals( "a839" ) ) {
				schema.getTableRelationCol().updateRelationCol( Authorization, editNext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		YCFBamRelationColByUNameIdxKey keyUNameIdx = schema.getFactoryRelationCol().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredRelationId( existing.getRequiredRelationId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamRelationColByRelColTenantIdxKey keyRelColTenantIdx = schema.getFactoryRelationCol().newRelColTenantIdxKey();
		keyRelColTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFBamRelationColByRelationIdxKey keyRelationIdx = schema.getFactoryRelationCol().newRelationIdxKey();
		keyRelationIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyRelationIdx.setRequiredRelationId( existing.getRequiredRelationId() );

		YCFBamRelationColByDefSchemaIdxKey keyDefSchemaIdx = schema.getFactoryRelationCol().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		YCFBamRelationColByFromColIdxKey keyFromColIdx = schema.getFactoryRelationCol().newFromColIdxKey();
		keyFromColIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyFromColIdx.setRequiredFromColId( existing.getRequiredFromColId() );

		YCFBamRelationColByToColIdxKey keyToColIdx = schema.getFactoryRelationCol().newToColIdxKey();
		keyToColIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyToColIdx.setRequiredToColId( existing.getRequiredToColId() );

		YCFBamRelationColByPrevIdxKey keyPrevIdx = schema.getFactoryRelationCol().newPrevIdxKey();
		keyPrevIdx.setOptionalPrevTenantId( existing.getOptionalPrevTenantId() );
		keyPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamRelationColByNextIdxKey keyNextIdx = schema.getFactoryRelationCol().newNextIdxKey();
		keyNextIdx.setOptionalNextTenantId( existing.getOptionalNextTenantId() );
		keyNextIdx.setOptionalNextId( existing.getOptionalNextId() );

		YCFBamRelationColByRelPrevIdxKey keyRelPrevIdx = schema.getFactoryRelationCol().newRelPrevIdxKey();
		keyRelPrevIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyRelPrevIdx.setRequiredRelationId( existing.getRequiredRelationId() );
		keyRelPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamRelationColByRelNextIdxKey keyRelNextIdx = schema.getFactoryRelationCol().newRelNextIdxKey();
		keyRelNextIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyRelNextIdx.setRequiredRelationId( existing.getRequiredRelationId() );
		keyRelNextIdx.setOptionalNextId( existing.getOptionalNextId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFBamRelationColPKey, YCFBamRelationColBuff > subdict;

		dictByPKey.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

		subdict = dictByRelColTenantIdx.get( keyRelColTenantIdx );
		subdict.remove( pkey );

		subdict = dictByRelationIdx.get( keyRelationIdx );
		subdict.remove( pkey );

		subdict = dictByDefSchemaIdx.get( keyDefSchemaIdx );
		subdict.remove( pkey );

		subdict = dictByFromColIdx.get( keyFromColIdx );
		subdict.remove( pkey );

		subdict = dictByToColIdx.get( keyToColIdx );
		subdict.remove( pkey );

		subdict = dictByPrevIdx.get( keyPrevIdx );
		subdict.remove( pkey );

		subdict = dictByNextIdx.get( keyNextIdx );
		subdict.remove( pkey );

		subdict = dictByRelPrevIdx.get( keyRelPrevIdx );
		subdict.remove( pkey );

		subdict = dictByRelNextIdx.get( keyRelNextIdx );
		subdict.remove( pkey );

	}
	public void deleteRelationColByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamRelationColPKey key = schema.getFactoryRelationCol().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteRelationColByIdIdx( Authorization, key );
	}

	public void deleteRelationColByIdIdx( YCFSecAuthorization Authorization,
		YCFBamRelationColPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamRelationColBuff cur;
		LinkedList<YCFBamRelationColBuff> matchSet = new LinkedList<YCFBamRelationColBuff>();
		Iterator<YCFBamRelationColBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamRelationColBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRelationCol().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteRelationCol( Authorization, cur );
		}
	}

	public void deleteRelationColByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argRelationId,
		String argName )
	{
		YCFBamRelationColByUNameIdxKey key = schema.getFactoryRelationCol().newUNameIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredRelationId( argRelationId );
		key.setRequiredName( argName );
		deleteRelationColByUNameIdx( Authorization, key );
	}

	public void deleteRelationColByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamRelationColByUNameIdxKey argKey )
	{
		YCFBamRelationColBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamRelationColBuff> matchSet = new LinkedList<YCFBamRelationColBuff>();
		Iterator<YCFBamRelationColBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamRelationColBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRelationCol().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteRelationCol( Authorization, cur );
		}
	}

	public void deleteRelationColByRelColTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamRelationColByRelColTenantIdxKey key = schema.getFactoryRelationCol().newRelColTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteRelationColByRelColTenantIdx( Authorization, key );
	}

	public void deleteRelationColByRelColTenantIdx( YCFSecAuthorization Authorization,
		YCFBamRelationColByRelColTenantIdxKey argKey )
	{
		YCFBamRelationColBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamRelationColBuff> matchSet = new LinkedList<YCFBamRelationColBuff>();
		Iterator<YCFBamRelationColBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamRelationColBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRelationCol().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteRelationCol( Authorization, cur );
		}
	}

	public void deleteRelationColByRelationIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argRelationId )
	{
		YCFBamRelationColByRelationIdxKey key = schema.getFactoryRelationCol().newRelationIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredRelationId( argRelationId );
		deleteRelationColByRelationIdx( Authorization, key );
	}

	public void deleteRelationColByRelationIdx( YCFSecAuthorization Authorization,
		YCFBamRelationColByRelationIdxKey argKey )
	{
		YCFBamRelationColBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamRelationColBuff> matchSet = new LinkedList<YCFBamRelationColBuff>();
		Iterator<YCFBamRelationColBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamRelationColBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRelationCol().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteRelationCol( Authorization, cur );
		}
	}

	public void deleteRelationColByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamRelationColByDefSchemaIdxKey key = schema.getFactoryRelationCol().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deleteRelationColByDefSchemaIdx( Authorization, key );
	}

	public void deleteRelationColByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamRelationColByDefSchemaIdxKey argKey )
	{
		YCFBamRelationColBuff cur;
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
		LinkedList<YCFBamRelationColBuff> matchSet = new LinkedList<YCFBamRelationColBuff>();
		Iterator<YCFBamRelationColBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamRelationColBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRelationCol().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteRelationCol( Authorization, cur );
		}
	}

	public void deleteRelationColByFromColIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argFromColId )
	{
		YCFBamRelationColByFromColIdxKey key = schema.getFactoryRelationCol().newFromColIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredFromColId( argFromColId );
		deleteRelationColByFromColIdx( Authorization, key );
	}

	public void deleteRelationColByFromColIdx( YCFSecAuthorization Authorization,
		YCFBamRelationColByFromColIdxKey argKey )
	{
		YCFBamRelationColBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamRelationColBuff> matchSet = new LinkedList<YCFBamRelationColBuff>();
		Iterator<YCFBamRelationColBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamRelationColBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRelationCol().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteRelationCol( Authorization, cur );
		}
	}

	public void deleteRelationColByToColIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argToColId )
	{
		YCFBamRelationColByToColIdxKey key = schema.getFactoryRelationCol().newToColIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredToColId( argToColId );
		deleteRelationColByToColIdx( Authorization, key );
	}

	public void deleteRelationColByToColIdx( YCFSecAuthorization Authorization,
		YCFBamRelationColByToColIdxKey argKey )
	{
		YCFBamRelationColBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamRelationColBuff> matchSet = new LinkedList<YCFBamRelationColBuff>();
		Iterator<YCFBamRelationColBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamRelationColBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRelationCol().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteRelationCol( Authorization, cur );
		}
	}

	public void deleteRelationColByPrevIdx( YCFSecAuthorization Authorization,
		Long argPrevTenantId,
		Long argPrevId )
	{
		YCFBamRelationColByPrevIdxKey key = schema.getFactoryRelationCol().newPrevIdxKey();
		key.setOptionalPrevTenantId( argPrevTenantId );
		key.setOptionalPrevId( argPrevId );
		deleteRelationColByPrevIdx( Authorization, key );
	}

	public void deleteRelationColByPrevIdx( YCFSecAuthorization Authorization,
		YCFBamRelationColByPrevIdxKey argKey )
	{
		YCFBamRelationColBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalPrevTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalPrevId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamRelationColBuff> matchSet = new LinkedList<YCFBamRelationColBuff>();
		Iterator<YCFBamRelationColBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamRelationColBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRelationCol().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteRelationCol( Authorization, cur );
		}
	}

	public void deleteRelationColByNextIdx( YCFSecAuthorization Authorization,
		Long argNextTenantId,
		Long argNextId )
	{
		YCFBamRelationColByNextIdxKey key = schema.getFactoryRelationCol().newNextIdxKey();
		key.setOptionalNextTenantId( argNextTenantId );
		key.setOptionalNextId( argNextId );
		deleteRelationColByNextIdx( Authorization, key );
	}

	public void deleteRelationColByNextIdx( YCFSecAuthorization Authorization,
		YCFBamRelationColByNextIdxKey argKey )
	{
		YCFBamRelationColBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalNextTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalNextId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamRelationColBuff> matchSet = new LinkedList<YCFBamRelationColBuff>();
		Iterator<YCFBamRelationColBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamRelationColBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRelationCol().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteRelationCol( Authorization, cur );
		}
	}

	public void deleteRelationColByRelPrevIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argRelationId,
		Long argPrevId )
	{
		YCFBamRelationColByRelPrevIdxKey key = schema.getFactoryRelationCol().newRelPrevIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredRelationId( argRelationId );
		key.setOptionalPrevId( argPrevId );
		deleteRelationColByRelPrevIdx( Authorization, key );
	}

	public void deleteRelationColByRelPrevIdx( YCFSecAuthorization Authorization,
		YCFBamRelationColByRelPrevIdxKey argKey )
	{
		YCFBamRelationColBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( argKey.getOptionalPrevId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamRelationColBuff> matchSet = new LinkedList<YCFBamRelationColBuff>();
		Iterator<YCFBamRelationColBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamRelationColBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRelationCol().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteRelationCol( Authorization, cur );
		}
	}

	public void deleteRelationColByRelNextIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argRelationId,
		Long argNextId )
	{
		YCFBamRelationColByRelNextIdxKey key = schema.getFactoryRelationCol().newRelNextIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredRelationId( argRelationId );
		key.setOptionalNextId( argNextId );
		deleteRelationColByRelNextIdx( Authorization, key );
	}

	public void deleteRelationColByRelNextIdx( YCFSecAuthorization Authorization,
		YCFBamRelationColByRelNextIdxKey argKey )
	{
		YCFBamRelationColBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( argKey.getOptionalNextId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamRelationColBuff> matchSet = new LinkedList<YCFBamRelationColBuff>();
		Iterator<YCFBamRelationColBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamRelationColBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRelationCol().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteRelationCol( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
