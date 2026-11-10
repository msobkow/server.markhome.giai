
// Description: Java 11 in-memory RAM DbIO implementation for ServerMethod.

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
 *	YCFBamRamServerMethodTable in-memory RAM DbIO implementation
 *	for ServerMethod.
 */
public class YCFBamRamServerMethodTable
	implements IYCFBamServerMethodTable
{
	private IYCFBamSchema schema;
	private Map< YCFBamScopePKey,
				YCFBamServerMethodBuff > dictByPKey
		= new HashMap< YCFBamScopePKey,
				YCFBamServerMethodBuff >();
	private Map< YCFBamServerMethodByUNameIdxKey,
			YCFBamServerMethodBuff > dictByUNameIdx
		= new HashMap< YCFBamServerMethodByUNameIdxKey,
			YCFBamServerMethodBuff >();
	private Map< YCFBamServerMethodByMethTableIdxKey,
				Map< YCFBamScopePKey,
					YCFBamServerMethodBuff >> dictByMethTableIdx
		= new HashMap< YCFBamServerMethodByMethTableIdxKey,
				Map< YCFBamScopePKey,
					YCFBamServerMethodBuff >>();
	private Map< YCFBamServerMethodByMethTableVisIdxKey,
				Map< YCFBamScopePKey,
					YCFBamServerMethodBuff >> dictByMethTableVisIdx
		= new HashMap< YCFBamServerMethodByMethTableVisIdxKey,
				Map< YCFBamScopePKey,
					YCFBamServerMethodBuff >>();
	private Map< YCFBamServerMethodByMethCodeVisIdxKey,
				Map< YCFBamScopePKey,
					YCFBamServerMethodBuff >> dictByMethCodeVisIdx
		= new HashMap< YCFBamServerMethodByMethCodeVisIdxKey,
				Map< YCFBamScopePKey,
					YCFBamServerMethodBuff >>();
	private Map< YCFBamServerMethodByDefSchemaIdxKey,
				Map< YCFBamScopePKey,
					YCFBamServerMethodBuff >> dictByDefSchemaIdx
		= new HashMap< YCFBamServerMethodByDefSchemaIdxKey,
				Map< YCFBamScopePKey,
					YCFBamServerMethodBuff >>();

	public YCFBamRamServerMethodTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createServerMethod( YCFSecAuthorization Authorization,
		YCFBamServerMethodBuff Buff )
	{
		final String S_ProcName = "createServerMethod";
		schema.getTableScope().createScope( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamServerMethodByUNameIdxKey keyUNameIdx = schema.getFactoryServerMethod().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyUNameIdx.setRequiredTableId( Buff.getRequiredTableId() );
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamServerMethodByMethTableIdxKey keyMethTableIdx = schema.getFactoryServerMethod().newMethTableIdxKey();
		keyMethTableIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyMethTableIdx.setRequiredTableId( Buff.getRequiredTableId() );

		YCFBamServerMethodByMethTableVisIdxKey keyMethTableVisIdx = schema.getFactoryServerMethod().newMethTableVisIdxKey();
		keyMethTableVisIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyMethTableVisIdx.setRequiredTableId( Buff.getRequiredTableId() );
		keyMethTableVisIdx.setRequiredCodeVis( Buff.getRequiredCodeVis() );

		YCFBamServerMethodByMethCodeVisIdxKey keyMethCodeVisIdx = schema.getFactoryServerMethod().newMethCodeVisIdxKey();
		keyMethCodeVisIdx.setRequiredCodeVis( Buff.getRequiredCodeVis() );

		YCFBamServerMethodByDefSchemaIdxKey keyDefSchemaIdx = schema.getFactoryServerMethod().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( Buff.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( Buff.getOptionalDefSchemaId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"ServerMethodUNameIdx",
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
						"ForTable",
						"Table",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

		Map< YCFBamScopePKey, YCFBamServerMethodBuff > subdictMethTableIdx;
		if( dictByMethTableIdx.containsKey( keyMethTableIdx ) ) {
			subdictMethTableIdx = dictByMethTableIdx.get( keyMethTableIdx );
		}
		else {
			subdictMethTableIdx = new HashMap< YCFBamScopePKey, YCFBamServerMethodBuff >();
			dictByMethTableIdx.put( keyMethTableIdx, subdictMethTableIdx );
		}
		subdictMethTableIdx.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamServerMethodBuff > subdictMethTableVisIdx;
		if( dictByMethTableVisIdx.containsKey( keyMethTableVisIdx ) ) {
			subdictMethTableVisIdx = dictByMethTableVisIdx.get( keyMethTableVisIdx );
		}
		else {
			subdictMethTableVisIdx = new HashMap< YCFBamScopePKey, YCFBamServerMethodBuff >();
			dictByMethTableVisIdx.put( keyMethTableVisIdx, subdictMethTableVisIdx );
		}
		subdictMethTableVisIdx.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamServerMethodBuff > subdictMethCodeVisIdx;
		if( dictByMethCodeVisIdx.containsKey( keyMethCodeVisIdx ) ) {
			subdictMethCodeVisIdx = dictByMethCodeVisIdx.get( keyMethCodeVisIdx );
		}
		else {
			subdictMethCodeVisIdx = new HashMap< YCFBamScopePKey, YCFBamServerMethodBuff >();
			dictByMethCodeVisIdx.put( keyMethCodeVisIdx, subdictMethCodeVisIdx );
		}
		subdictMethCodeVisIdx.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamServerMethodBuff > subdictDefSchemaIdx;
		if( dictByDefSchemaIdx.containsKey( keyDefSchemaIdx ) ) {
			subdictDefSchemaIdx = dictByDefSchemaIdx.get( keyDefSchemaIdx );
		}
		else {
			subdictDefSchemaIdx = new HashMap< YCFBamScopePKey, YCFBamServerMethodBuff >();
			dictByDefSchemaIdx.put( keyDefSchemaIdx, subdictDefSchemaIdx );
		}
		subdictDefSchemaIdx.put( pkey, Buff );

	}

	public YCFBamServerMethodBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamServerMethodBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamServerMethodBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamServerMethodBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamServerMethodBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamServerMethod.readAllDerived";
		YCFBamServerMethodBuff[] retList = new YCFBamServerMethodBuff[ dictByPKey.values().size() ];
		Iterator< YCFBamServerMethodBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamServerMethodBuff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamServerMethodBuff> filteredList = new ArrayList<YCFBamServerMethodBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamServerMethodBuff ) ) {
					filteredList.add( (YCFBamServerMethodBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamServerMethodBuff[0] ) );
		}
	}

	public YCFBamServerMethodBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readDerivedByUNameIdx";
		YCFBamServerMethodByUNameIdxKey key = schema.getFactoryServerMethod().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );

		YCFBamServerMethodBuff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamServerMethodBuff[] readDerivedByMethTableIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readDerivedByMethTableIdx";
		YCFBamServerMethodByMethTableIdxKey key = schema.getFactoryServerMethod().newMethTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );

		YCFBamServerMethodBuff[] recArray;
		if( dictByMethTableIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamServerMethodBuff > subdictMethTableIdx
				= dictByMethTableIdx.get( key );
			recArray = new YCFBamServerMethodBuff[ subdictMethTableIdx.size() ];
			Iterator< YCFBamServerMethodBuff > iter = subdictMethTableIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamServerMethodBuff > subdictMethTableIdx
				= new HashMap< YCFBamScopePKey, YCFBamServerMethodBuff >();
			dictByMethTableIdx.put( key, subdictMethTableIdx );
			recArray = new YCFBamServerMethodBuff[0];
		}
		return( recArray );
	}

	public YCFBamServerMethodBuff[] readDerivedByMethTableVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readDerivedByMethTableVisIdx";
		YCFBamServerMethodByMethTableVisIdxKey key = schema.getFactoryServerMethod().newMethTableVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredCodeVis( CodeVis );

		YCFBamServerMethodBuff[] recArray;
		if( dictByMethTableVisIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamServerMethodBuff > subdictMethTableVisIdx
				= dictByMethTableVisIdx.get( key );
			recArray = new YCFBamServerMethodBuff[ subdictMethTableVisIdx.size() ];
			Iterator< YCFBamServerMethodBuff > iter = subdictMethTableVisIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamServerMethodBuff > subdictMethTableVisIdx
				= new HashMap< YCFBamScopePKey, YCFBamServerMethodBuff >();
			dictByMethTableVisIdx.put( key, subdictMethTableVisIdx );
			recArray = new YCFBamServerMethodBuff[0];
		}
		return( recArray );
	}

	public YCFBamServerMethodBuff[] readDerivedByMethCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readDerivedByMethCodeVisIdx";
		YCFBamServerMethodByMethCodeVisIdxKey key = schema.getFactoryServerMethod().newMethCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );

		YCFBamServerMethodBuff[] recArray;
		if( dictByMethCodeVisIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamServerMethodBuff > subdictMethCodeVisIdx
				= dictByMethCodeVisIdx.get( key );
			recArray = new YCFBamServerMethodBuff[ subdictMethCodeVisIdx.size() ];
			Iterator< YCFBamServerMethodBuff > iter = subdictMethCodeVisIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamServerMethodBuff > subdictMethCodeVisIdx
				= new HashMap< YCFBamScopePKey, YCFBamServerMethodBuff >();
			dictByMethCodeVisIdx.put( key, subdictMethCodeVisIdx );
			recArray = new YCFBamServerMethodBuff[0];
		}
		return( recArray );
	}

	public YCFBamServerMethodBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readDerivedByDefSchemaIdx";
		YCFBamServerMethodByDefSchemaIdxKey key = schema.getFactoryServerMethod().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );

		YCFBamServerMethodBuff[] recArray;
		if( dictByDefSchemaIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamServerMethodBuff > subdictDefSchemaIdx
				= dictByDefSchemaIdx.get( key );
			recArray = new YCFBamServerMethodBuff[ subdictDefSchemaIdx.size() ];
			Iterator< YCFBamServerMethodBuff > iter = subdictDefSchemaIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamServerMethodBuff > subdictDefSchemaIdx
				= new HashMap< YCFBamScopePKey, YCFBamServerMethodBuff >();
			dictByDefSchemaIdx.put( key, subdictDefSchemaIdx );
			recArray = new YCFBamServerMethodBuff[0];
		}
		return( recArray );
	}

	public YCFBamServerMethodBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readDerivedByIdIdx() ";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamServerMethodBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamServerMethodBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readBuff";
		YCFBamServerMethodBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a804" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamServerMethodBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamServerMethodBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a804" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamServerMethodBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readAllBuff";
		YCFBamServerMethodBuff buff;
		ArrayList<YCFBamServerMethodBuff> filteredList = new ArrayList<YCFBamServerMethodBuff>();
		YCFBamServerMethodBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a804" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamServerMethodBuff[0] ) );
	}

	public YCFBamServerMethodBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByIdIdx() ";
		YCFBamServerMethodBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
			return( (YCFBamServerMethodBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamServerMethodBuff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByTenantIdx() ";
		YCFBamServerMethodBuff buff;
		ArrayList<YCFBamServerMethodBuff> filteredList = new ArrayList<YCFBamServerMethodBuff>();
		YCFBamServerMethodBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
				filteredList.add( (YCFBamServerMethodBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamServerMethodBuff[0] ) );
	}

	public YCFBamServerMethodBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readBuffByUNameIdx() ";
		YCFBamServerMethodBuff buff = readDerivedByUNameIdx( Authorization,
			TenantId,
			TableId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a804" ) ) {
			return( (YCFBamServerMethodBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamServerMethodBuff[] readBuffByMethTableIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readBuffByMethTableIdx() ";
		YCFBamServerMethodBuff buff;
		ArrayList<YCFBamServerMethodBuff> filteredList = new ArrayList<YCFBamServerMethodBuff>();
		YCFBamServerMethodBuff[] buffList = readDerivedByMethTableIdx( Authorization,
			TenantId,
			TableId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a804" ) ) {
				filteredList.add( (YCFBamServerMethodBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamServerMethodBuff[0] ) );
	}

	public YCFBamServerMethodBuff[] readBuffByMethTableVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readBuffByMethTableVisIdx() ";
		YCFBamServerMethodBuff buff;
		ArrayList<YCFBamServerMethodBuff> filteredList = new ArrayList<YCFBamServerMethodBuff>();
		YCFBamServerMethodBuff[] buffList = readDerivedByMethTableVisIdx( Authorization,
			TenantId,
			TableId,
			CodeVis );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a804" ) ) {
				filteredList.add( (YCFBamServerMethodBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamServerMethodBuff[0] ) );
	}

	public YCFBamServerMethodBuff[] readBuffByMethCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readBuffByMethCodeVisIdx() ";
		YCFBamServerMethodBuff buff;
		ArrayList<YCFBamServerMethodBuff> filteredList = new ArrayList<YCFBamServerMethodBuff>();
		YCFBamServerMethodBuff[] buffList = readDerivedByMethCodeVisIdx( Authorization,
			CodeVis );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a804" ) ) {
				filteredList.add( (YCFBamServerMethodBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamServerMethodBuff[0] ) );
	}

	public YCFBamServerMethodBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamServerMethod.readBuffByDefSchemaIdx() ";
		YCFBamServerMethodBuff buff;
		ArrayList<YCFBamServerMethodBuff> filteredList = new ArrayList<YCFBamServerMethodBuff>();
		YCFBamServerMethodBuff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a804" ) ) {
				filteredList.add( (YCFBamServerMethodBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamServerMethodBuff[0] ) );
	}

	/**
	 *	Read a page array of the specific ServerMethod buffer instances identified by the duplicate key MethTableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamServerMethodBuff[] pageBuffByMethTableIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByMethTableIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific ServerMethod buffer instances identified by the duplicate key MethTableVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argCodeVis	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamServerMethodBuff[] pageBuffByMethTableVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByMethTableVisIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific ServerMethod buffer instances identified by the duplicate key MethCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argCodeVis	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamServerMethodBuff[] pageBuffByMethCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByMethCodeVisIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific ServerMethod buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamServerMethodBuff[] pageBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByDefSchemaIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateServerMethod( YCFSecAuthorization Authorization,
		YCFBamServerMethodBuff Buff )
	{
		schema.getTableScope().updateScope( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamServerMethodBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateServerMethod",
				"Existing record not found",
				"ServerMethod",
				pkey );
		}
		YCFBamServerMethodByUNameIdxKey existingKeyUNameIdx = schema.getFactoryServerMethod().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyUNameIdx.setRequiredTableId( existing.getRequiredTableId() );
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamServerMethodByUNameIdxKey newKeyUNameIdx = schema.getFactoryServerMethod().newUNameIdxKey();
		newKeyUNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyUNameIdx.setRequiredTableId( Buff.getRequiredTableId() );
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamServerMethodByMethTableIdxKey existingKeyMethTableIdx = schema.getFactoryServerMethod().newMethTableIdxKey();
		existingKeyMethTableIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyMethTableIdx.setRequiredTableId( existing.getRequiredTableId() );

		YCFBamServerMethodByMethTableIdxKey newKeyMethTableIdx = schema.getFactoryServerMethod().newMethTableIdxKey();
		newKeyMethTableIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyMethTableIdx.setRequiredTableId( Buff.getRequiredTableId() );

		YCFBamServerMethodByMethTableVisIdxKey existingKeyMethTableVisIdx = schema.getFactoryServerMethod().newMethTableVisIdxKey();
		existingKeyMethTableVisIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyMethTableVisIdx.setRequiredTableId( existing.getRequiredTableId() );
		existingKeyMethTableVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		YCFBamServerMethodByMethTableVisIdxKey newKeyMethTableVisIdx = schema.getFactoryServerMethod().newMethTableVisIdxKey();
		newKeyMethTableVisIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyMethTableVisIdx.setRequiredTableId( Buff.getRequiredTableId() );
		newKeyMethTableVisIdx.setRequiredCodeVis( Buff.getRequiredCodeVis() );

		YCFBamServerMethodByMethCodeVisIdxKey existingKeyMethCodeVisIdx = schema.getFactoryServerMethod().newMethCodeVisIdxKey();
		existingKeyMethCodeVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		YCFBamServerMethodByMethCodeVisIdxKey newKeyMethCodeVisIdx = schema.getFactoryServerMethod().newMethCodeVisIdxKey();
		newKeyMethCodeVisIdx.setRequiredCodeVis( Buff.getRequiredCodeVis() );

		YCFBamServerMethodByDefSchemaIdxKey existingKeyDefSchemaIdx = schema.getFactoryServerMethod().newDefSchemaIdxKey();
		existingKeyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		existingKeyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		YCFBamServerMethodByDefSchemaIdxKey newKeyDefSchemaIdx = schema.getFactoryServerMethod().newDefSchemaIdxKey();
		newKeyDefSchemaIdx.setOptionalDefSchemaTenantId( Buff.getOptionalDefSchemaTenantId() );
		newKeyDefSchemaIdx.setOptionalDefSchemaId( Buff.getOptionalDefSchemaId() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateServerMethod",
					"ServerMethodUNameIdx",
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
						"updateServerMethod",
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
						"updateServerMethod",
						"Container",
						"ForTable",
						"Table",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamScopePKey, YCFBamServerMethodBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

		subdict = dictByMethTableIdx.get( existingKeyMethTableIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByMethTableIdx.containsKey( newKeyMethTableIdx ) ) {
			subdict = dictByMethTableIdx.get( newKeyMethTableIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamServerMethodBuff >();
			dictByMethTableIdx.put( newKeyMethTableIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByMethTableVisIdx.get( existingKeyMethTableVisIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByMethTableVisIdx.containsKey( newKeyMethTableVisIdx ) ) {
			subdict = dictByMethTableVisIdx.get( newKeyMethTableVisIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamServerMethodBuff >();
			dictByMethTableVisIdx.put( newKeyMethTableVisIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByMethCodeVisIdx.get( existingKeyMethCodeVisIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByMethCodeVisIdx.containsKey( newKeyMethCodeVisIdx ) ) {
			subdict = dictByMethCodeVisIdx.get( newKeyMethCodeVisIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamServerMethodBuff >();
			dictByMethCodeVisIdx.put( newKeyMethCodeVisIdx, subdict );
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
			subdict = new HashMap< YCFBamScopePKey, YCFBamServerMethodBuff >();
			dictByDefSchemaIdx.put( newKeyDefSchemaIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteServerMethod( YCFSecAuthorization Authorization,
		YCFBamServerMethodBuff Buff )
	{
		final String S_ProcName = "YCFBamRamServerMethodTable.deleteServerMethod() ";
		String classCode;
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamServerMethodBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteServerMethod",
				pkey );
		}
		// Short circuit self-referential code to prevent stack overflows
		Object arrCheckParams[] = schema.getTableParam().readDerivedByServerMethodIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		if( arrCheckParams.length > 0 ) {
			schema.getTableParam().deleteParamByServerMethodIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		}
		YCFBamServerMethodByUNameIdxKey keyUNameIdx = schema.getFactoryServerMethod().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredTableId( existing.getRequiredTableId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamServerMethodByMethTableIdxKey keyMethTableIdx = schema.getFactoryServerMethod().newMethTableIdxKey();
		keyMethTableIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyMethTableIdx.setRequiredTableId( existing.getRequiredTableId() );

		YCFBamServerMethodByMethTableVisIdxKey keyMethTableVisIdx = schema.getFactoryServerMethod().newMethTableVisIdxKey();
		keyMethTableVisIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyMethTableVisIdx.setRequiredTableId( existing.getRequiredTableId() );
		keyMethTableVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		YCFBamServerMethodByMethCodeVisIdxKey keyMethCodeVisIdx = schema.getFactoryServerMethod().newMethCodeVisIdxKey();
		keyMethCodeVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		YCFBamServerMethodByDefSchemaIdxKey keyDefSchemaIdx = schema.getFactoryServerMethod().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		// Validate reverse foreign keys

		if( schema.getTableServerObjFunc().readDerivedByIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteServerMethod",
				"Superclass",
				"SuperClass",
				"ServerObjFunc",
				pkey );
		}

		if( schema.getTableServerProc().readDerivedByIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteServerMethod",
				"Superclass",
				"SuperClass",
				"ServerProc",
				pkey );
		}

		if( schema.getTableServerListFunc().readDerivedByIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteServerMethod",
				"Superclass",
				"SuperClass",
				"ServerListFunc",
				pkey );
		}

		// Delete is valid
		Map< YCFBamScopePKey, YCFBamServerMethodBuff > subdict;

		dictByPKey.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

		subdict = dictByMethTableIdx.get( keyMethTableIdx );
		subdict.remove( pkey );

		subdict = dictByMethTableVisIdx.get( keyMethTableVisIdx );
		subdict.remove( pkey );

		subdict = dictByMethCodeVisIdx.get( keyMethCodeVisIdx );
		subdict.remove( pkey );

		subdict = dictByDefSchemaIdx.get( keyDefSchemaIdx );
		subdict.remove( pkey );

		schema.getTableScope().deleteScope( Authorization,
			Buff );
	}
	public void deleteServerMethodByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTableId,
		String argName )
	{
		YCFBamServerMethodByUNameIdxKey key = schema.getFactoryServerMethod().newUNameIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTableId( argTableId );
		key.setRequiredName( argName );
		deleteServerMethodByUNameIdx( Authorization, key );
	}

	public void deleteServerMethodByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamServerMethodByUNameIdxKey argKey )
	{
		final String S_ProcName = "deleteServerMethodByUNameIdx";
		YCFBamServerMethodBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamServerMethodBuff> matchSet = new LinkedList<YCFBamServerMethodBuff>();
		Iterator<YCFBamServerMethodBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamServerMethodBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableServerMethod().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a804".equals( subClassCode ) ) {
				schema.getTableServerMethod().deleteServerMethod( Authorization, cur );
			}
			else if( "a805".equals( subClassCode ) ) {
				schema.getTableServerObjFunc().deleteServerObjFunc( Authorization, (YCFBamServerObjFuncBuff)cur );
			}
			else if( "a806".equals( subClassCode ) ) {
				schema.getTableServerProc().deleteServerProc( Authorization, (YCFBamServerProcBuff)cur );
			}
			else if( "a83a".equals( subClassCode ) ) {
				schema.getTableServerListFunc().deleteServerListFunc( Authorization, (YCFBamServerListFuncBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of ServerMethod must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteServerMethodByMethTableIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTableId )
	{
		YCFBamServerMethodByMethTableIdxKey key = schema.getFactoryServerMethod().newMethTableIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTableId( argTableId );
		deleteServerMethodByMethTableIdx( Authorization, key );
	}

	public void deleteServerMethodByMethTableIdx( YCFSecAuthorization Authorization,
		YCFBamServerMethodByMethTableIdxKey argKey )
	{
		final String S_ProcName = "deleteServerMethodByMethTableIdx";
		YCFBamServerMethodBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamServerMethodBuff> matchSet = new LinkedList<YCFBamServerMethodBuff>();
		Iterator<YCFBamServerMethodBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamServerMethodBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableServerMethod().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a804".equals( subClassCode ) ) {
				schema.getTableServerMethod().deleteServerMethod( Authorization, cur );
			}
			else if( "a805".equals( subClassCode ) ) {
				schema.getTableServerObjFunc().deleteServerObjFunc( Authorization, (YCFBamServerObjFuncBuff)cur );
			}
			else if( "a806".equals( subClassCode ) ) {
				schema.getTableServerProc().deleteServerProc( Authorization, (YCFBamServerProcBuff)cur );
			}
			else if( "a83a".equals( subClassCode ) ) {
				schema.getTableServerListFunc().deleteServerListFunc( Authorization, (YCFBamServerListFuncBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of ServerMethod must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteServerMethodByMethTableVisIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTableId,
		IYCFBamSchema.CodeVisibilityEnum argCodeVis )
	{
		YCFBamServerMethodByMethTableVisIdxKey key = schema.getFactoryServerMethod().newMethTableVisIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTableId( argTableId );
		key.setRequiredCodeVis( argCodeVis );
		deleteServerMethodByMethTableVisIdx( Authorization, key );
	}

	public void deleteServerMethodByMethTableVisIdx( YCFSecAuthorization Authorization,
		YCFBamServerMethodByMethTableVisIdxKey argKey )
	{
		final String S_ProcName = "deleteServerMethodByMethTableVisIdx";
		YCFBamServerMethodBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamServerMethodBuff> matchSet = new LinkedList<YCFBamServerMethodBuff>();
		Iterator<YCFBamServerMethodBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamServerMethodBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableServerMethod().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a804".equals( subClassCode ) ) {
				schema.getTableServerMethod().deleteServerMethod( Authorization, cur );
			}
			else if( "a805".equals( subClassCode ) ) {
				schema.getTableServerObjFunc().deleteServerObjFunc( Authorization, (YCFBamServerObjFuncBuff)cur );
			}
			else if( "a806".equals( subClassCode ) ) {
				schema.getTableServerProc().deleteServerProc( Authorization, (YCFBamServerProcBuff)cur );
			}
			else if( "a83a".equals( subClassCode ) ) {
				schema.getTableServerListFunc().deleteServerListFunc( Authorization, (YCFBamServerListFuncBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of ServerMethod must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteServerMethodByMethCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum argCodeVis )
	{
		YCFBamServerMethodByMethCodeVisIdxKey key = schema.getFactoryServerMethod().newMethCodeVisIdxKey();
		key.setRequiredCodeVis( argCodeVis );
		deleteServerMethodByMethCodeVisIdx( Authorization, key );
	}

	public void deleteServerMethodByMethCodeVisIdx( YCFSecAuthorization Authorization,
		YCFBamServerMethodByMethCodeVisIdxKey argKey )
	{
		final String S_ProcName = "deleteServerMethodByMethCodeVisIdx";
		YCFBamServerMethodBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamServerMethodBuff> matchSet = new LinkedList<YCFBamServerMethodBuff>();
		Iterator<YCFBamServerMethodBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamServerMethodBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableServerMethod().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a804".equals( subClassCode ) ) {
				schema.getTableServerMethod().deleteServerMethod( Authorization, cur );
			}
			else if( "a805".equals( subClassCode ) ) {
				schema.getTableServerObjFunc().deleteServerObjFunc( Authorization, (YCFBamServerObjFuncBuff)cur );
			}
			else if( "a806".equals( subClassCode ) ) {
				schema.getTableServerProc().deleteServerProc( Authorization, (YCFBamServerProcBuff)cur );
			}
			else if( "a83a".equals( subClassCode ) ) {
				schema.getTableServerListFunc().deleteServerListFunc( Authorization, (YCFBamServerListFuncBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of ServerMethod must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteServerMethodByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamServerMethodByDefSchemaIdxKey key = schema.getFactoryServerMethod().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deleteServerMethodByDefSchemaIdx( Authorization, key );
	}

	public void deleteServerMethodByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamServerMethodByDefSchemaIdxKey argKey )
	{
		final String S_ProcName = "deleteServerMethodByDefSchemaIdx";
		YCFBamServerMethodBuff cur;
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
		LinkedList<YCFBamServerMethodBuff> matchSet = new LinkedList<YCFBamServerMethodBuff>();
		Iterator<YCFBamServerMethodBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamServerMethodBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableServerMethod().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a804".equals( subClassCode ) ) {
				schema.getTableServerMethod().deleteServerMethod( Authorization, cur );
			}
			else if( "a805".equals( subClassCode ) ) {
				schema.getTableServerObjFunc().deleteServerObjFunc( Authorization, (YCFBamServerObjFuncBuff)cur );
			}
			else if( "a806".equals( subClassCode ) ) {
				schema.getTableServerProc().deleteServerProc( Authorization, (YCFBamServerProcBuff)cur );
			}
			else if( "a83a".equals( subClassCode ) ) {
				schema.getTableServerListFunc().deleteServerListFunc( Authorization, (YCFBamServerListFuncBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of ServerMethod must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteServerMethodByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteServerMethodByIdIdx( Authorization, key );
	}

	public void deleteServerMethodByIdIdx( YCFSecAuthorization Authorization,
		YCFBamScopePKey argKey )
	{
		final String S_ProcName = "deleteServerMethodByIdIdx";
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamServerMethodBuff cur;
		LinkedList<YCFBamServerMethodBuff> matchSet = new LinkedList<YCFBamServerMethodBuff>();
		Iterator<YCFBamServerMethodBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamServerMethodBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableServerMethod().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a804".equals( subClassCode ) ) {
				schema.getTableServerMethod().deleteServerMethod( Authorization, cur );
			}
			else if( "a805".equals( subClassCode ) ) {
				schema.getTableServerObjFunc().deleteServerObjFunc( Authorization, (YCFBamServerObjFuncBuff)cur );
			}
			else if( "a806".equals( subClassCode ) ) {
				schema.getTableServerProc().deleteServerProc( Authorization, (YCFBamServerProcBuff)cur );
			}
			else if( "a83a".equals( subClassCode ) ) {
				schema.getTableServerListFunc().deleteServerListFunc( Authorization, (YCFBamServerListFuncBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of ServerMethod must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteServerMethodByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamScopeByTenantIdxKey key = schema.getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteServerMethodByTenantIdx( Authorization, key );
	}

	public void deleteServerMethodByTenantIdx( YCFSecAuthorization Authorization,
		YCFBamScopeByTenantIdxKey argKey )
	{
		final String S_ProcName = "deleteServerMethodByTenantIdx";
		YCFBamServerMethodBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamServerMethodBuff> matchSet = new LinkedList<YCFBamServerMethodBuff>();
		Iterator<YCFBamServerMethodBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamServerMethodBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableServerMethod().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a804".equals( subClassCode ) ) {
				schema.getTableServerMethod().deleteServerMethod( Authorization, cur );
			}
			else if( "a805".equals( subClassCode ) ) {
				schema.getTableServerObjFunc().deleteServerObjFunc( Authorization, (YCFBamServerObjFuncBuff)cur );
			}
			else if( "a806".equals( subClassCode ) ) {
				schema.getTableServerProc().deleteServerProc( Authorization, (YCFBamServerProcBuff)cur );
			}
			else if( "a83a".equals( subClassCode ) ) {
				schema.getTableServerListFunc().deleteServerListFunc( Authorization, (YCFBamServerListFuncBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of ServerMethod must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void releasePreparedStatements() {
	}
}
