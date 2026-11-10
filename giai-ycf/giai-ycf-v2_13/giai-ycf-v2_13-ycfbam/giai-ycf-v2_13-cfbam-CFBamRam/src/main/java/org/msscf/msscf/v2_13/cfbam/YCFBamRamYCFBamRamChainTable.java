
// Description: Java 11 in-memory RAM DbIO implementation for Chain.

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
 *	YCFBamRamChainTable in-memory RAM DbIO implementation
 *	for Chain.
 */
public class YCFBamRamChainTable
	implements IYCFBamChainTable
{
	private IYCFBamSchema schema;
	private Map< YCFBamChainPKey,
				YCFBamChainBuff > dictByPKey
		= new HashMap< YCFBamChainPKey,
				YCFBamChainBuff >();
	private Map< YCFBamChainByTenantIdxKey,
				Map< YCFBamChainPKey,
					YCFBamChainBuff >> dictByTenantIdx
		= new HashMap< YCFBamChainByTenantIdxKey,
				Map< YCFBamChainPKey,
					YCFBamChainBuff >>();
	private Map< YCFBamChainByChainTableIdxKey,
				Map< YCFBamChainPKey,
					YCFBamChainBuff >> dictByChainTableIdx
		= new HashMap< YCFBamChainByChainTableIdxKey,
				Map< YCFBamChainPKey,
					YCFBamChainBuff >>();
	private Map< YCFBamChainByDefSchemaIdxKey,
				Map< YCFBamChainPKey,
					YCFBamChainBuff >> dictByDefSchemaIdx
		= new HashMap< YCFBamChainByDefSchemaIdxKey,
				Map< YCFBamChainPKey,
					YCFBamChainBuff >>();
	private Map< YCFBamChainByUNameIdxKey,
			YCFBamChainBuff > dictByUNameIdx
		= new HashMap< YCFBamChainByUNameIdxKey,
			YCFBamChainBuff >();
	private Map< YCFBamChainByPrevRelIdxKey,
				Map< YCFBamChainPKey,
					YCFBamChainBuff >> dictByPrevRelIdx
		= new HashMap< YCFBamChainByPrevRelIdxKey,
				Map< YCFBamChainPKey,
					YCFBamChainBuff >>();
	private Map< YCFBamChainByNextRelIdxKey,
				Map< YCFBamChainPKey,
					YCFBamChainBuff >> dictByNextRelIdx
		= new HashMap< YCFBamChainByNextRelIdxKey,
				Map< YCFBamChainPKey,
					YCFBamChainBuff >>();

	public YCFBamRamChainTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createChain( YCFSecAuthorization Authorization,
		YCFBamChainBuff Buff )
	{
		final String S_ProcName = "createChain";
		YCFBamChainPKey pkey = schema.getFactoryChain().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( ((YCFBamRamTenantTable)schema.getTableTenant()).nextChainIdGen( Authorization,
			Buff.getRequiredTenantId() ) );
		Buff.setRequiredTenantId( pkey.getRequiredTenantId() );
		Buff.setRequiredId( pkey.getRequiredId() );
		YCFBamChainByTenantIdxKey keyTenantIdx = schema.getFactoryChain().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFBamChainByChainTableIdxKey keyChainTableIdx = schema.getFactoryChain().newChainTableIdxKey();
		keyChainTableIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyChainTableIdx.setRequiredTableId( Buff.getRequiredTableId() );

		YCFBamChainByDefSchemaIdxKey keyDefSchemaIdx = schema.getFactoryChain().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( Buff.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( Buff.getOptionalDefSchemaId() );

		YCFBamChainByUNameIdxKey keyUNameIdx = schema.getFactoryChain().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyUNameIdx.setRequiredTableId( Buff.getRequiredTableId() );
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamChainByPrevRelIdxKey keyPrevRelIdx = schema.getFactoryChain().newPrevRelIdxKey();
		keyPrevRelIdx.setRequiredPrevRelationTenantId( Buff.getRequiredPrevRelationTenantId() );
		keyPrevRelIdx.setRequiredPrevRelationId( Buff.getRequiredPrevRelationId() );

		YCFBamChainByNextRelIdxKey keyNextRelIdx = schema.getFactoryChain().newNextRelIdxKey();
		keyNextRelIdx.setRequiredNextRelationTenantId( Buff.getRequiredNextRelationTenantId() );
		keyNextRelIdx.setRequiredNextRelationId( Buff.getRequiredNextRelationId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"ChainUNameIdx",
				keyUNameIdx );
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
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableRelation().readDerivedByIdIdx( Authorization,
						Buff.getRequiredPrevRelationTenantId(),
						Buff.getRequiredPrevRelationId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Lookup",
						"PrevRelation",
						"Relation",
						null );
				}
			}
		}

		{
			boolean allNull = true;
			allNull = false;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableRelation().readDerivedByIdIdx( Authorization,
						Buff.getRequiredNextRelationTenantId(),
						Buff.getRequiredNextRelationId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Lookup",
						"NextRelation",
						"Relation",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFBamChainPKey, YCFBamChainBuff > subdictTenantIdx;
		if( dictByTenantIdx.containsKey( keyTenantIdx ) ) {
			subdictTenantIdx = dictByTenantIdx.get( keyTenantIdx );
		}
		else {
			subdictTenantIdx = new HashMap< YCFBamChainPKey, YCFBamChainBuff >();
			dictByTenantIdx.put( keyTenantIdx, subdictTenantIdx );
		}
		subdictTenantIdx.put( pkey, Buff );

		Map< YCFBamChainPKey, YCFBamChainBuff > subdictChainTableIdx;
		if( dictByChainTableIdx.containsKey( keyChainTableIdx ) ) {
			subdictChainTableIdx = dictByChainTableIdx.get( keyChainTableIdx );
		}
		else {
			subdictChainTableIdx = new HashMap< YCFBamChainPKey, YCFBamChainBuff >();
			dictByChainTableIdx.put( keyChainTableIdx, subdictChainTableIdx );
		}
		subdictChainTableIdx.put( pkey, Buff );

		Map< YCFBamChainPKey, YCFBamChainBuff > subdictDefSchemaIdx;
		if( dictByDefSchemaIdx.containsKey( keyDefSchemaIdx ) ) {
			subdictDefSchemaIdx = dictByDefSchemaIdx.get( keyDefSchemaIdx );
		}
		else {
			subdictDefSchemaIdx = new HashMap< YCFBamChainPKey, YCFBamChainBuff >();
			dictByDefSchemaIdx.put( keyDefSchemaIdx, subdictDefSchemaIdx );
		}
		subdictDefSchemaIdx.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

		Map< YCFBamChainPKey, YCFBamChainBuff > subdictPrevRelIdx;
		if( dictByPrevRelIdx.containsKey( keyPrevRelIdx ) ) {
			subdictPrevRelIdx = dictByPrevRelIdx.get( keyPrevRelIdx );
		}
		else {
			subdictPrevRelIdx = new HashMap< YCFBamChainPKey, YCFBamChainBuff >();
			dictByPrevRelIdx.put( keyPrevRelIdx, subdictPrevRelIdx );
		}
		subdictPrevRelIdx.put( pkey, Buff );

		Map< YCFBamChainPKey, YCFBamChainBuff > subdictNextRelIdx;
		if( dictByNextRelIdx.containsKey( keyNextRelIdx ) ) {
			subdictNextRelIdx = dictByNextRelIdx.get( keyNextRelIdx );
		}
		else {
			subdictNextRelIdx = new HashMap< YCFBamChainPKey, YCFBamChainBuff >();
			dictByNextRelIdx.put( keyNextRelIdx, subdictNextRelIdx );
		}
		subdictNextRelIdx.put( pkey, Buff );

	}

	public YCFBamChainBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamChainPKey PKey )
	{
		final String S_ProcName = "YCFBamRamChain.readDerived";
		YCFBamChainPKey key = schema.getFactoryChain().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamChainBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamChainBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamChainPKey PKey )
	{
		final String S_ProcName = "YCFBamRamChain.readDerived";
		YCFBamChainPKey key = schema.getFactoryChain().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamChainBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamChainBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamChain.readAllDerived";
		YCFBamChainBuff[] retList = new YCFBamChainBuff[ dictByPKey.values().size() ];
		Iterator< YCFBamChainBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamChainBuff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamChain.readDerivedByTenantIdx";
		YCFBamChainByTenantIdxKey key = schema.getFactoryChain().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );

		YCFBamChainBuff[] recArray;
		if( dictByTenantIdx.containsKey( key ) ) {
			Map< YCFBamChainPKey, YCFBamChainBuff > subdictTenantIdx
				= dictByTenantIdx.get( key );
			recArray = new YCFBamChainBuff[ subdictTenantIdx.size() ];
			Iterator< YCFBamChainBuff > iter = subdictTenantIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamChainPKey, YCFBamChainBuff > subdictTenantIdx
				= new HashMap< YCFBamChainPKey, YCFBamChainBuff >();
			dictByTenantIdx.put( key, subdictTenantIdx );
			recArray = new YCFBamChainBuff[0];
		}
		return( recArray );
	}

	public YCFBamChainBuff[] readDerivedByChainTableIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId )
	{
		final String S_ProcName = "YCFBamRamChain.readDerivedByChainTableIdx";
		YCFBamChainByChainTableIdxKey key = schema.getFactoryChain().newChainTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );

		YCFBamChainBuff[] recArray;
		if( dictByChainTableIdx.containsKey( key ) ) {
			Map< YCFBamChainPKey, YCFBamChainBuff > subdictChainTableIdx
				= dictByChainTableIdx.get( key );
			recArray = new YCFBamChainBuff[ subdictChainTableIdx.size() ];
			Iterator< YCFBamChainBuff > iter = subdictChainTableIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamChainPKey, YCFBamChainBuff > subdictChainTableIdx
				= new HashMap< YCFBamChainPKey, YCFBamChainBuff >();
			dictByChainTableIdx.put( key, subdictChainTableIdx );
			recArray = new YCFBamChainBuff[0];
		}
		return( recArray );
	}

	public YCFBamChainBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamChain.readDerivedByDefSchemaIdx";
		YCFBamChainByDefSchemaIdxKey key = schema.getFactoryChain().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );

		YCFBamChainBuff[] recArray;
		if( dictByDefSchemaIdx.containsKey( key ) ) {
			Map< YCFBamChainPKey, YCFBamChainBuff > subdictDefSchemaIdx
				= dictByDefSchemaIdx.get( key );
			recArray = new YCFBamChainBuff[ subdictDefSchemaIdx.size() ];
			Iterator< YCFBamChainBuff > iter = subdictDefSchemaIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamChainPKey, YCFBamChainBuff > subdictDefSchemaIdx
				= new HashMap< YCFBamChainPKey, YCFBamChainBuff >();
			dictByDefSchemaIdx.put( key, subdictDefSchemaIdx );
			recArray = new YCFBamChainBuff[0];
		}
		return( recArray );
	}

	public YCFBamChainBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamChain.readDerivedByUNameIdx";
		YCFBamChainByUNameIdxKey key = schema.getFactoryChain().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );

		YCFBamChainBuff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamChainBuff[] readDerivedByPrevRelIdx( YCFSecAuthorization Authorization,
		long PrevRelationTenantId,
		long PrevRelationId )
	{
		final String S_ProcName = "YCFBamRamChain.readDerivedByPrevRelIdx";
		YCFBamChainByPrevRelIdxKey key = schema.getFactoryChain().newPrevRelIdxKey();
		key.setRequiredPrevRelationTenantId( PrevRelationTenantId );
		key.setRequiredPrevRelationId( PrevRelationId );

		YCFBamChainBuff[] recArray;
		if( dictByPrevRelIdx.containsKey( key ) ) {
			Map< YCFBamChainPKey, YCFBamChainBuff > subdictPrevRelIdx
				= dictByPrevRelIdx.get( key );
			recArray = new YCFBamChainBuff[ subdictPrevRelIdx.size() ];
			Iterator< YCFBamChainBuff > iter = subdictPrevRelIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamChainPKey, YCFBamChainBuff > subdictPrevRelIdx
				= new HashMap< YCFBamChainPKey, YCFBamChainBuff >();
			dictByPrevRelIdx.put( key, subdictPrevRelIdx );
			recArray = new YCFBamChainBuff[0];
		}
		return( recArray );
	}

	public YCFBamChainBuff[] readDerivedByNextRelIdx( YCFSecAuthorization Authorization,
		long NextRelationTenantId,
		long NextRelationId )
	{
		final String S_ProcName = "YCFBamRamChain.readDerivedByNextRelIdx";
		YCFBamChainByNextRelIdxKey key = schema.getFactoryChain().newNextRelIdxKey();
		key.setRequiredNextRelationTenantId( NextRelationTenantId );
		key.setRequiredNextRelationId( NextRelationId );

		YCFBamChainBuff[] recArray;
		if( dictByNextRelIdx.containsKey( key ) ) {
			Map< YCFBamChainPKey, YCFBamChainBuff > subdictNextRelIdx
				= dictByNextRelIdx.get( key );
			recArray = new YCFBamChainBuff[ subdictNextRelIdx.size() ];
			Iterator< YCFBamChainBuff > iter = subdictNextRelIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamChainPKey, YCFBamChainBuff > subdictNextRelIdx
				= new HashMap< YCFBamChainPKey, YCFBamChainBuff >();
			dictByNextRelIdx.put( key, subdictNextRelIdx );
			recArray = new YCFBamChainBuff[0];
		}
		return( recArray );
	}

	public YCFBamChainBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamChain.readDerivedByIdIdx() ";
		YCFBamChainPKey key = schema.getFactoryChain().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamChainBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamChainBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamChainPKey PKey )
	{
		final String S_ProcName = "YCFBamRamChain.readBuff";
		YCFBamChainBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a812" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamChainBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamChainPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamChainBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a812" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamChainBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamChain.readAllBuff";
		YCFBamChainBuff buff;
		ArrayList<YCFBamChainBuff> filteredList = new ArrayList<YCFBamChainBuff>();
		YCFBamChainBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a812" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamChainBuff[0] ) );
	}

	public YCFBamChainBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamChain.readBuffByIdIdx() ";
		YCFBamChainBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a812" ) ) {
			return( (YCFBamChainBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamChainBuff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamChain.readBuffByTenantIdx() ";
		YCFBamChainBuff buff;
		ArrayList<YCFBamChainBuff> filteredList = new ArrayList<YCFBamChainBuff>();
		YCFBamChainBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a812" ) ) {
				filteredList.add( (YCFBamChainBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamChainBuff[0] ) );
	}

	public YCFBamChainBuff[] readBuffByChainTableIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId )
	{
		final String S_ProcName = "YCFBamRamChain.readBuffByChainTableIdx() ";
		YCFBamChainBuff buff;
		ArrayList<YCFBamChainBuff> filteredList = new ArrayList<YCFBamChainBuff>();
		YCFBamChainBuff[] buffList = readDerivedByChainTableIdx( Authorization,
			TenantId,
			TableId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a812" ) ) {
				filteredList.add( (YCFBamChainBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamChainBuff[0] ) );
	}

	public YCFBamChainBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamChain.readBuffByDefSchemaIdx() ";
		YCFBamChainBuff buff;
		ArrayList<YCFBamChainBuff> filteredList = new ArrayList<YCFBamChainBuff>();
		YCFBamChainBuff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a812" ) ) {
				filteredList.add( (YCFBamChainBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamChainBuff[0] ) );
	}

	public YCFBamChainBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamChain.readBuffByUNameIdx() ";
		YCFBamChainBuff buff = readDerivedByUNameIdx( Authorization,
			TenantId,
			TableId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a812" ) ) {
			return( (YCFBamChainBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamChainBuff[] readBuffByPrevRelIdx( YCFSecAuthorization Authorization,
		long PrevRelationTenantId,
		long PrevRelationId )
	{
		final String S_ProcName = "YCFBamRamChain.readBuffByPrevRelIdx() ";
		YCFBamChainBuff buff;
		ArrayList<YCFBamChainBuff> filteredList = new ArrayList<YCFBamChainBuff>();
		YCFBamChainBuff[] buffList = readDerivedByPrevRelIdx( Authorization,
			PrevRelationTenantId,
			PrevRelationId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a812" ) ) {
				filteredList.add( (YCFBamChainBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamChainBuff[0] ) );
	}

	public YCFBamChainBuff[] readBuffByNextRelIdx( YCFSecAuthorization Authorization,
		long NextRelationTenantId,
		long NextRelationId )
	{
		final String S_ProcName = "YCFBamRamChain.readBuffByNextRelIdx() ";
		YCFBamChainBuff buff;
		ArrayList<YCFBamChainBuff> filteredList = new ArrayList<YCFBamChainBuff>();
		YCFBamChainBuff[] buffList = readDerivedByNextRelIdx( Authorization,
			NextRelationTenantId,
			NextRelationId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a812" ) ) {
				filteredList.add( (YCFBamChainBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamChainBuff[0] ) );
	}

	public void updateChain( YCFSecAuthorization Authorization,
		YCFBamChainBuff Buff )
	{
		YCFBamChainPKey pkey = schema.getFactoryChain().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamChainBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateChain",
				"Existing record not found",
				"Chain",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateChain",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFBamChainByTenantIdxKey existingKeyTenantIdx = schema.getFactoryChain().newTenantIdxKey();
		existingKeyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFBamChainByTenantIdxKey newKeyTenantIdx = schema.getFactoryChain().newTenantIdxKey();
		newKeyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFBamChainByChainTableIdxKey existingKeyChainTableIdx = schema.getFactoryChain().newChainTableIdxKey();
		existingKeyChainTableIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyChainTableIdx.setRequiredTableId( existing.getRequiredTableId() );

		YCFBamChainByChainTableIdxKey newKeyChainTableIdx = schema.getFactoryChain().newChainTableIdxKey();
		newKeyChainTableIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyChainTableIdx.setRequiredTableId( Buff.getRequiredTableId() );

		YCFBamChainByDefSchemaIdxKey existingKeyDefSchemaIdx = schema.getFactoryChain().newDefSchemaIdxKey();
		existingKeyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		existingKeyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		YCFBamChainByDefSchemaIdxKey newKeyDefSchemaIdx = schema.getFactoryChain().newDefSchemaIdxKey();
		newKeyDefSchemaIdx.setOptionalDefSchemaTenantId( Buff.getOptionalDefSchemaTenantId() );
		newKeyDefSchemaIdx.setOptionalDefSchemaId( Buff.getOptionalDefSchemaId() );

		YCFBamChainByUNameIdxKey existingKeyUNameIdx = schema.getFactoryChain().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyUNameIdx.setRequiredTableId( existing.getRequiredTableId() );
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamChainByUNameIdxKey newKeyUNameIdx = schema.getFactoryChain().newUNameIdxKey();
		newKeyUNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyUNameIdx.setRequiredTableId( Buff.getRequiredTableId() );
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamChainByPrevRelIdxKey existingKeyPrevRelIdx = schema.getFactoryChain().newPrevRelIdxKey();
		existingKeyPrevRelIdx.setRequiredPrevRelationTenantId( existing.getRequiredPrevRelationTenantId() );
		existingKeyPrevRelIdx.setRequiredPrevRelationId( existing.getRequiredPrevRelationId() );

		YCFBamChainByPrevRelIdxKey newKeyPrevRelIdx = schema.getFactoryChain().newPrevRelIdxKey();
		newKeyPrevRelIdx.setRequiredPrevRelationTenantId( Buff.getRequiredPrevRelationTenantId() );
		newKeyPrevRelIdx.setRequiredPrevRelationId( Buff.getRequiredPrevRelationId() );

		YCFBamChainByNextRelIdxKey existingKeyNextRelIdx = schema.getFactoryChain().newNextRelIdxKey();
		existingKeyNextRelIdx.setRequiredNextRelationTenantId( existing.getRequiredNextRelationTenantId() );
		existingKeyNextRelIdx.setRequiredNextRelationId( existing.getRequiredNextRelationId() );

		YCFBamChainByNextRelIdxKey newKeyNextRelIdx = schema.getFactoryChain().newNextRelIdxKey();
		newKeyNextRelIdx.setRequiredNextRelationTenantId( Buff.getRequiredNextRelationTenantId() );
		newKeyNextRelIdx.setRequiredNextRelationId( Buff.getRequiredNextRelationId() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateChain",
					"ChainUNameIdx",
					newKeyUNameIdx );
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
						"updateChain",
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
				if( null == schema.getTableTable().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredTableId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateChain",
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
				if( null == schema.getTableRelation().readDerivedByIdIdx( Authorization,
						Buff.getRequiredPrevRelationTenantId(),
						Buff.getRequiredPrevRelationId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateChain",
						"Lookup",
						"PrevRelation",
						"Relation",
						null );
				}
			}
		}

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableRelation().readDerivedByIdIdx( Authorization,
						Buff.getRequiredNextRelationTenantId(),
						Buff.getRequiredNextRelationId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateChain",
						"Lookup",
						"NextRelation",
						"Relation",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamChainPKey, YCFBamChainBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByTenantIdx.get( existingKeyTenantIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByTenantIdx.containsKey( newKeyTenantIdx ) ) {
			subdict = dictByTenantIdx.get( newKeyTenantIdx );
		}
		else {
			subdict = new HashMap< YCFBamChainPKey, YCFBamChainBuff >();
			dictByTenantIdx.put( newKeyTenantIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByChainTableIdx.get( existingKeyChainTableIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByChainTableIdx.containsKey( newKeyChainTableIdx ) ) {
			subdict = dictByChainTableIdx.get( newKeyChainTableIdx );
		}
		else {
			subdict = new HashMap< YCFBamChainPKey, YCFBamChainBuff >();
			dictByChainTableIdx.put( newKeyChainTableIdx, subdict );
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
			subdict = new HashMap< YCFBamChainPKey, YCFBamChainBuff >();
			dictByDefSchemaIdx.put( newKeyDefSchemaIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

		subdict = dictByPrevRelIdx.get( existingKeyPrevRelIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByPrevRelIdx.containsKey( newKeyPrevRelIdx ) ) {
			subdict = dictByPrevRelIdx.get( newKeyPrevRelIdx );
		}
		else {
			subdict = new HashMap< YCFBamChainPKey, YCFBamChainBuff >();
			dictByPrevRelIdx.put( newKeyPrevRelIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByNextRelIdx.get( existingKeyNextRelIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByNextRelIdx.containsKey( newKeyNextRelIdx ) ) {
			subdict = dictByNextRelIdx.get( newKeyNextRelIdx );
		}
		else {
			subdict = new HashMap< YCFBamChainPKey, YCFBamChainBuff >();
			dictByNextRelIdx.put( newKeyNextRelIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteChain( YCFSecAuthorization Authorization,
		YCFBamChainBuff Buff )
	{
		final String S_ProcName = "YCFBamRamChainTable.deleteChain() ";
		String classCode;
		YCFBamChainPKey pkey = schema.getFactoryChain().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamChainBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteChain",
				pkey );
		}
		YCFBamChainByTenantIdxKey keyTenantIdx = schema.getFactoryChain().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFBamChainByChainTableIdxKey keyChainTableIdx = schema.getFactoryChain().newChainTableIdxKey();
		keyChainTableIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyChainTableIdx.setRequiredTableId( existing.getRequiredTableId() );

		YCFBamChainByDefSchemaIdxKey keyDefSchemaIdx = schema.getFactoryChain().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		YCFBamChainByUNameIdxKey keyUNameIdx = schema.getFactoryChain().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredTableId( existing.getRequiredTableId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamChainByPrevRelIdxKey keyPrevRelIdx = schema.getFactoryChain().newPrevRelIdxKey();
		keyPrevRelIdx.setRequiredPrevRelationTenantId( existing.getRequiredPrevRelationTenantId() );
		keyPrevRelIdx.setRequiredPrevRelationId( existing.getRequiredPrevRelationId() );

		YCFBamChainByNextRelIdxKey keyNextRelIdx = schema.getFactoryChain().newNextRelIdxKey();
		keyNextRelIdx.setRequiredNextRelationTenantId( existing.getRequiredNextRelationTenantId() );
		keyNextRelIdx.setRequiredNextRelationId( existing.getRequiredNextRelationId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFBamChainPKey, YCFBamChainBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByTenantIdx.get( keyTenantIdx );
		subdict.remove( pkey );

		subdict = dictByChainTableIdx.get( keyChainTableIdx );
		subdict.remove( pkey );

		subdict = dictByDefSchemaIdx.get( keyDefSchemaIdx );
		subdict.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

		subdict = dictByPrevRelIdx.get( keyPrevRelIdx );
		subdict.remove( pkey );

		subdict = dictByNextRelIdx.get( keyNextRelIdx );
		subdict.remove( pkey );

	}
	public void deleteChainByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamChainPKey key = schema.getFactoryChain().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteChainByIdIdx( Authorization, key );
	}

	public void deleteChainByIdIdx( YCFSecAuthorization Authorization,
		YCFBamChainPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamChainBuff cur;
		LinkedList<YCFBamChainBuff> matchSet = new LinkedList<YCFBamChainBuff>();
		Iterator<YCFBamChainBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamChainBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableChain().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteChain( Authorization, cur );
		}
	}

	public void deleteChainByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamChainByTenantIdxKey key = schema.getFactoryChain().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteChainByTenantIdx( Authorization, key );
	}

	public void deleteChainByTenantIdx( YCFSecAuthorization Authorization,
		YCFBamChainByTenantIdxKey argKey )
	{
		YCFBamChainBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamChainBuff> matchSet = new LinkedList<YCFBamChainBuff>();
		Iterator<YCFBamChainBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamChainBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableChain().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteChain( Authorization, cur );
		}
	}

	public void deleteChainByChainTableIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTableId )
	{
		YCFBamChainByChainTableIdxKey key = schema.getFactoryChain().newChainTableIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTableId( argTableId );
		deleteChainByChainTableIdx( Authorization, key );
	}

	public void deleteChainByChainTableIdx( YCFSecAuthorization Authorization,
		YCFBamChainByChainTableIdxKey argKey )
	{
		YCFBamChainBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamChainBuff> matchSet = new LinkedList<YCFBamChainBuff>();
		Iterator<YCFBamChainBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamChainBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableChain().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteChain( Authorization, cur );
		}
	}

	public void deleteChainByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamChainByDefSchemaIdxKey key = schema.getFactoryChain().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deleteChainByDefSchemaIdx( Authorization, key );
	}

	public void deleteChainByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamChainByDefSchemaIdxKey argKey )
	{
		YCFBamChainBuff cur;
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
		LinkedList<YCFBamChainBuff> matchSet = new LinkedList<YCFBamChainBuff>();
		Iterator<YCFBamChainBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamChainBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableChain().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteChain( Authorization, cur );
		}
	}

	public void deleteChainByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTableId,
		String argName )
	{
		YCFBamChainByUNameIdxKey key = schema.getFactoryChain().newUNameIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTableId( argTableId );
		key.setRequiredName( argName );
		deleteChainByUNameIdx( Authorization, key );
	}

	public void deleteChainByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamChainByUNameIdxKey argKey )
	{
		YCFBamChainBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamChainBuff> matchSet = new LinkedList<YCFBamChainBuff>();
		Iterator<YCFBamChainBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamChainBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableChain().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteChain( Authorization, cur );
		}
	}

	public void deleteChainByPrevRelIdx( YCFSecAuthorization Authorization,
		long argPrevRelationTenantId,
		long argPrevRelationId )
	{
		YCFBamChainByPrevRelIdxKey key = schema.getFactoryChain().newPrevRelIdxKey();
		key.setRequiredPrevRelationTenantId( argPrevRelationTenantId );
		key.setRequiredPrevRelationId( argPrevRelationId );
		deleteChainByPrevRelIdx( Authorization, key );
	}

	public void deleteChainByPrevRelIdx( YCFSecAuthorization Authorization,
		YCFBamChainByPrevRelIdxKey argKey )
	{
		YCFBamChainBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamChainBuff> matchSet = new LinkedList<YCFBamChainBuff>();
		Iterator<YCFBamChainBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamChainBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableChain().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteChain( Authorization, cur );
		}
	}

	public void deleteChainByNextRelIdx( YCFSecAuthorization Authorization,
		long argNextRelationTenantId,
		long argNextRelationId )
	{
		YCFBamChainByNextRelIdxKey key = schema.getFactoryChain().newNextRelIdxKey();
		key.setRequiredNextRelationTenantId( argNextRelationTenantId );
		key.setRequiredNextRelationId( argNextRelationId );
		deleteChainByNextRelIdx( Authorization, key );
	}

	public void deleteChainByNextRelIdx( YCFSecAuthorization Authorization,
		YCFBamChainByNextRelIdxKey argKey )
	{
		YCFBamChainBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamChainBuff> matchSet = new LinkedList<YCFBamChainBuff>();
		Iterator<YCFBamChainBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamChainBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableChain().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteChain( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
