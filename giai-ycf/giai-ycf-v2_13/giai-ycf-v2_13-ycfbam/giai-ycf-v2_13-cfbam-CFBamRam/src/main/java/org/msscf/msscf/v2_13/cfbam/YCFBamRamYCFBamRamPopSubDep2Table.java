
// Description: Java 11 in-memory RAM DbIO implementation for PopSubDep2.

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
 *	YCFBamRamPopSubDep2Table in-memory RAM DbIO implementation
 *	for PopSubDep2.
 */
public class YCFBamRamPopSubDep2Table
	implements IYCFBamPopSubDep2Table
{
	private IYCFBamSchema schema;
	private Map< YCFBamScopePKey,
				YCFBamPopSubDep2Buff > dictByPKey
		= new HashMap< YCFBamScopePKey,
				YCFBamPopSubDep2Buff >();
	private Map< YCFBamPopSubDep2ByPopSubDep1IdxKey,
				Map< YCFBamScopePKey,
					YCFBamPopSubDep2Buff >> dictByPopSubDep1Idx
		= new HashMap< YCFBamPopSubDep2ByPopSubDep1IdxKey,
				Map< YCFBamScopePKey,
					YCFBamPopSubDep2Buff >>();
	private Map< YCFBamPopSubDep2ByUNameIdxKey,
			YCFBamPopSubDep2Buff > dictByUNameIdx
		= new HashMap< YCFBamPopSubDep2ByUNameIdxKey,
			YCFBamPopSubDep2Buff >();

	public YCFBamRamPopSubDep2Table( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createPopSubDep2( YCFSecAuthorization Authorization,
		YCFBamPopSubDep2Buff Buff )
	{
		final String S_ProcName = "createPopSubDep2";
		schema.getTablePopDep().createPopDep( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamPopSubDep2ByPopSubDep1IdxKey keyPopSubDep1Idx = schema.getFactoryPopSubDep2().newPopSubDep1IdxKey();
		keyPopSubDep1Idx.setRequiredPopSubDep1TenantId( Buff.getRequiredPopSubDep1TenantId() );
		keyPopSubDep1Idx.setRequiredPopSubDep1Id( Buff.getRequiredPopSubDep1Id() );

		YCFBamPopSubDep2ByUNameIdxKey keyUNameIdx = schema.getFactoryPopSubDep2().newUNameIdxKey();
		keyUNameIdx.setRequiredPopSubDep1TenantId( Buff.getRequiredPopSubDep1TenantId() );
		keyUNameIdx.setRequiredPopSubDep1Id( Buff.getRequiredPopSubDep1Id() );
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"PopSubDep2UNameIdx",
				keyUNameIdx );
		}

		// Validate foreign keys

		{
			boolean allNull = true;
			allNull = false;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTablePopDep().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Superclass",
						"SuperClass",
						"PopDep",
						null );
				}
			}
		}

		{
			boolean allNull = true;
			allNull = false;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTablePopSubDep1().readDerivedByIdIdx( Authorization,
						Buff.getRequiredPopSubDep1TenantId(),
						Buff.getRequiredPopSubDep1Id() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"PopSubDep1",
						"PopSubDep1",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamPopSubDep2Buff > subdictPopSubDep1Idx;
		if( dictByPopSubDep1Idx.containsKey( keyPopSubDep1Idx ) ) {
			subdictPopSubDep1Idx = dictByPopSubDep1Idx.get( keyPopSubDep1Idx );
		}
		else {
			subdictPopSubDep1Idx = new HashMap< YCFBamScopePKey, YCFBamPopSubDep2Buff >();
			dictByPopSubDep1Idx.put( keyPopSubDep1Idx, subdictPopSubDep1Idx );
		}
		subdictPopSubDep1Idx.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

	}

	public YCFBamPopSubDep2Buff readDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamPopSubDep2.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamPopSubDep2Buff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamPopSubDep2Buff lockDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamPopSubDep2.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamPopSubDep2Buff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamPopSubDep2Buff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamPopSubDep2.readAllDerived";
		YCFBamPopSubDep2Buff[] retList = new YCFBamPopSubDep2Buff[ dictByPKey.values().size() ];
		Iterator< YCFBamPopSubDep2Buff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamPopSubDep2Buff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamPopSubDep2Buff> filteredList = new ArrayList<YCFBamPopSubDep2Buff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamPopSubDep2Buff ) ) {
					filteredList.add( (YCFBamPopSubDep2Buff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamPopSubDep2Buff[0] ) );
		}
	}

	public YCFBamPopSubDep2Buff[] readDerivedByRelationIdx( YCFSecAuthorization Authorization,
		long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "YCFBamRamPopDep.readDerivedByRelationIdx";
		YCFBamPopDepBuff buffList[] = schema.getTablePopDep().readDerivedByRelationIdx( Authorization,
			RelationTenantId,
			RelationId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFBamPopDepBuff buff;
			ArrayList<YCFBamPopSubDep2Buff> filteredList = new ArrayList<YCFBamPopSubDep2Buff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamPopSubDep2Buff ) ) {
					filteredList.add( (YCFBamPopSubDep2Buff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamPopSubDep2Buff[0] ) );
		}
	}

	public YCFBamPopSubDep2Buff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamPopDep.readDerivedByDefSchemaIdx";
		YCFBamPopDepBuff buffList[] = schema.getTablePopDep().readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFBamPopDepBuff buff;
			ArrayList<YCFBamPopSubDep2Buff> filteredList = new ArrayList<YCFBamPopSubDep2Buff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamPopSubDep2Buff ) ) {
					filteredList.add( (YCFBamPopSubDep2Buff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamPopSubDep2Buff[0] ) );
		}
	}

	public YCFBamPopSubDep2Buff[] readDerivedByPopSubDep1Idx( YCFSecAuthorization Authorization,
		long PopSubDep1TenantId,
		long PopSubDep1Id )
	{
		final String S_ProcName = "YCFBamRamPopSubDep2.readDerivedByPopSubDep1Idx";
		YCFBamPopSubDep2ByPopSubDep1IdxKey key = schema.getFactoryPopSubDep2().newPopSubDep1IdxKey();
		key.setRequiredPopSubDep1TenantId( PopSubDep1TenantId );
		key.setRequiredPopSubDep1Id( PopSubDep1Id );

		YCFBamPopSubDep2Buff[] recArray;
		if( dictByPopSubDep1Idx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamPopSubDep2Buff > subdictPopSubDep1Idx
				= dictByPopSubDep1Idx.get( key );
			recArray = new YCFBamPopSubDep2Buff[ subdictPopSubDep1Idx.size() ];
			Iterator< YCFBamPopSubDep2Buff > iter = subdictPopSubDep1Idx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamPopSubDep2Buff > subdictPopSubDep1Idx
				= new HashMap< YCFBamScopePKey, YCFBamPopSubDep2Buff >();
			dictByPopSubDep1Idx.put( key, subdictPopSubDep1Idx );
			recArray = new YCFBamPopSubDep2Buff[0];
		}
		return( recArray );
	}

	public YCFBamPopSubDep2Buff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long PopSubDep1TenantId,
		long PopSubDep1Id,
		String Name )
	{
		final String S_ProcName = "YCFBamRamPopSubDep2.readDerivedByUNameIdx";
		YCFBamPopSubDep2ByUNameIdxKey key = schema.getFactoryPopSubDep2().newUNameIdxKey();
		key.setRequiredPopSubDep1TenantId( PopSubDep1TenantId );
		key.setRequiredPopSubDep1Id( PopSubDep1Id );
		key.setRequiredName( Name );

		YCFBamPopSubDep2Buff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamPopSubDep2Buff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readDerivedByIdIdx() ";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamPopSubDep2Buff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamPopSubDep2Buff readBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamPopSubDep2.readBuff";
		YCFBamPopSubDep2Buff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a835" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamPopSubDep2Buff lockBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamPopSubDep2Buff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a835" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamPopSubDep2Buff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamPopSubDep2.readAllBuff";
		YCFBamPopSubDep2Buff buff;
		ArrayList<YCFBamPopSubDep2Buff> filteredList = new ArrayList<YCFBamPopSubDep2Buff>();
		YCFBamPopSubDep2Buff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a835" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamPopSubDep2Buff[0] ) );
	}

	public YCFBamPopSubDep2Buff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByIdIdx() ";
		YCFBamPopSubDep2Buff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
			return( (YCFBamPopSubDep2Buff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamPopSubDep2Buff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByTenantIdx() ";
		YCFBamPopSubDep2Buff buff;
		ArrayList<YCFBamPopSubDep2Buff> filteredList = new ArrayList<YCFBamPopSubDep2Buff>();
		YCFBamPopSubDep2Buff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
				filteredList.add( (YCFBamPopSubDep2Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamPopSubDep2Buff[0] ) );
	}

	public YCFBamPopSubDep2Buff[] readBuffByRelationIdx( YCFSecAuthorization Authorization,
		long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "YCFBamRamPopDep.readBuffByRelationIdx() ";
		YCFBamPopSubDep2Buff buff;
		ArrayList<YCFBamPopSubDep2Buff> filteredList = new ArrayList<YCFBamPopSubDep2Buff>();
		YCFBamPopSubDep2Buff[] buffList = readDerivedByRelationIdx( Authorization,
			RelationTenantId,
			RelationId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a833" ) ) {
				filteredList.add( (YCFBamPopSubDep2Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamPopSubDep2Buff[0] ) );
	}

	public YCFBamPopSubDep2Buff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamPopDep.readBuffByDefSchemaIdx() ";
		YCFBamPopSubDep2Buff buff;
		ArrayList<YCFBamPopSubDep2Buff> filteredList = new ArrayList<YCFBamPopSubDep2Buff>();
		YCFBamPopSubDep2Buff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a833" ) ) {
				filteredList.add( (YCFBamPopSubDep2Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamPopSubDep2Buff[0] ) );
	}

	public YCFBamPopSubDep2Buff[] readBuffByPopSubDep1Idx( YCFSecAuthorization Authorization,
		long PopSubDep1TenantId,
		long PopSubDep1Id )
	{
		final String S_ProcName = "YCFBamRamPopSubDep2.readBuffByPopSubDep1Idx() ";
		YCFBamPopSubDep2Buff buff;
		ArrayList<YCFBamPopSubDep2Buff> filteredList = new ArrayList<YCFBamPopSubDep2Buff>();
		YCFBamPopSubDep2Buff[] buffList = readDerivedByPopSubDep1Idx( Authorization,
			PopSubDep1TenantId,
			PopSubDep1Id );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a835" ) ) {
				filteredList.add( (YCFBamPopSubDep2Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamPopSubDep2Buff[0] ) );
	}

	public YCFBamPopSubDep2Buff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long PopSubDep1TenantId,
		long PopSubDep1Id,
		String Name )
	{
		final String S_ProcName = "YCFBamRamPopSubDep2.readBuffByUNameIdx() ";
		YCFBamPopSubDep2Buff buff = readDerivedByUNameIdx( Authorization,
			PopSubDep1TenantId,
			PopSubDep1Id,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a835" ) ) {
			return( (YCFBamPopSubDep2Buff)buff );
		}
		else {
			return( null );
		}
	}

	/**
	 *	Read a page array of the specific PopSubDep2 buffer instances identified by the duplicate key RelationIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRelationTenantId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamPopSubDep2Buff[] pageBuffByRelationIdx( YCFSecAuthorization Authorization,
		long RelationTenantId,
		long RelationId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByRelationIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific PopSubDep2 buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamPopSubDep2Buff[] pageBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByDefSchemaIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific PopSubDep2 buffer instances identified by the duplicate key PopSubDep1Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPopSubDep1TenantId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argPopSubDep1Id	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamPopSubDep2Buff[] pageBuffByPopSubDep1Idx( YCFSecAuthorization Authorization,
		long PopSubDep1TenantId,
		long PopSubDep1Id,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByPopSubDep1Idx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updatePopSubDep2( YCFSecAuthorization Authorization,
		YCFBamPopSubDep2Buff Buff )
	{
		schema.getTablePopDep().updatePopDep( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamPopSubDep2Buff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updatePopSubDep2",
				"Existing record not found",
				"PopSubDep2",
				pkey );
		}
		YCFBamPopSubDep2ByPopSubDep1IdxKey existingKeyPopSubDep1Idx = schema.getFactoryPopSubDep2().newPopSubDep1IdxKey();
		existingKeyPopSubDep1Idx.setRequiredPopSubDep1TenantId( existing.getRequiredPopSubDep1TenantId() );
		existingKeyPopSubDep1Idx.setRequiredPopSubDep1Id( existing.getRequiredPopSubDep1Id() );

		YCFBamPopSubDep2ByPopSubDep1IdxKey newKeyPopSubDep1Idx = schema.getFactoryPopSubDep2().newPopSubDep1IdxKey();
		newKeyPopSubDep1Idx.setRequiredPopSubDep1TenantId( Buff.getRequiredPopSubDep1TenantId() );
		newKeyPopSubDep1Idx.setRequiredPopSubDep1Id( Buff.getRequiredPopSubDep1Id() );

		YCFBamPopSubDep2ByUNameIdxKey existingKeyUNameIdx = schema.getFactoryPopSubDep2().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredPopSubDep1TenantId( existing.getRequiredPopSubDep1TenantId() );
		existingKeyUNameIdx.setRequiredPopSubDep1Id( existing.getRequiredPopSubDep1Id() );
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamPopSubDep2ByUNameIdxKey newKeyUNameIdx = schema.getFactoryPopSubDep2().newUNameIdxKey();
		newKeyUNameIdx.setRequiredPopSubDep1TenantId( Buff.getRequiredPopSubDep1TenantId() );
		newKeyUNameIdx.setRequiredPopSubDep1Id( Buff.getRequiredPopSubDep1Id() );
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updatePopSubDep2",
					"PopSubDep2UNameIdx",
					newKeyUNameIdx );
			}
		}

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTablePopDep().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updatePopSubDep2",
						"Superclass",
						"SuperClass",
						"PopDep",
						null );
				}
			}
		}

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTablePopSubDep1().readDerivedByIdIdx( Authorization,
						Buff.getRequiredPopSubDep1TenantId(),
						Buff.getRequiredPopSubDep1Id() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updatePopSubDep2",
						"Container",
						"PopSubDep1",
						"PopSubDep1",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamScopePKey, YCFBamPopSubDep2Buff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByPopSubDep1Idx.get( existingKeyPopSubDep1Idx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByPopSubDep1Idx.containsKey( newKeyPopSubDep1Idx ) ) {
			subdict = dictByPopSubDep1Idx.get( newKeyPopSubDep1Idx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamPopSubDep2Buff >();
			dictByPopSubDep1Idx.put( newKeyPopSubDep1Idx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

	}

	public void deletePopSubDep2( YCFSecAuthorization Authorization,
		YCFBamPopSubDep2Buff Buff )
	{
		final String S_ProcName = "YCFBamRamPopSubDep2Table.deletePopSubDep2() ";
		String classCode;
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamPopSubDep2Buff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deletePopSubDep2",
				pkey );
		}
		// Short circuit self-referential code to prevent stack overflows
		Object arrCheckPopDep[] = schema.getTablePopSubDep3().readDerivedByPopSubDep2Idx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		if( arrCheckPopDep.length > 0 ) {
			schema.getTablePopSubDep3().deletePopSubDep3ByPopSubDep2Idx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		}
		YCFBamPopSubDep2ByPopSubDep1IdxKey keyPopSubDep1Idx = schema.getFactoryPopSubDep2().newPopSubDep1IdxKey();
		keyPopSubDep1Idx.setRequiredPopSubDep1TenantId( existing.getRequiredPopSubDep1TenantId() );
		keyPopSubDep1Idx.setRequiredPopSubDep1Id( existing.getRequiredPopSubDep1Id() );

		YCFBamPopSubDep2ByUNameIdxKey keyUNameIdx = schema.getFactoryPopSubDep2().newUNameIdxKey();
		keyUNameIdx.setRequiredPopSubDep1TenantId( existing.getRequiredPopSubDep1TenantId() );
		keyUNameIdx.setRequiredPopSubDep1Id( existing.getRequiredPopSubDep1Id() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFBamScopePKey, YCFBamPopSubDep2Buff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByPopSubDep1Idx.get( keyPopSubDep1Idx );
		subdict.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

		schema.getTablePopDep().deletePopDep( Authorization,
			Buff );
	}
	public void deletePopSubDep2ByPopSubDep1Idx( YCFSecAuthorization Authorization,
		long argPopSubDep1TenantId,
		long argPopSubDep1Id )
	{
		YCFBamPopSubDep2ByPopSubDep1IdxKey key = schema.getFactoryPopSubDep2().newPopSubDep1IdxKey();
		key.setRequiredPopSubDep1TenantId( argPopSubDep1TenantId );
		key.setRequiredPopSubDep1Id( argPopSubDep1Id );
		deletePopSubDep2ByPopSubDep1Idx( Authorization, key );
	}

	public void deletePopSubDep2ByPopSubDep1Idx( YCFSecAuthorization Authorization,
		YCFBamPopSubDep2ByPopSubDep1IdxKey argKey )
	{
		YCFBamPopSubDep2Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamPopSubDep2Buff> matchSet = new LinkedList<YCFBamPopSubDep2Buff>();
		Iterator<YCFBamPopSubDep2Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamPopSubDep2Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTablePopSubDep2().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deletePopSubDep2( Authorization, cur );
		}
	}

	public void deletePopSubDep2ByUNameIdx( YCFSecAuthorization Authorization,
		long argPopSubDep1TenantId,
		long argPopSubDep1Id,
		String argName )
	{
		YCFBamPopSubDep2ByUNameIdxKey key = schema.getFactoryPopSubDep2().newUNameIdxKey();
		key.setRequiredPopSubDep1TenantId( argPopSubDep1TenantId );
		key.setRequiredPopSubDep1Id( argPopSubDep1Id );
		key.setRequiredName( argName );
		deletePopSubDep2ByUNameIdx( Authorization, key );
	}

	public void deletePopSubDep2ByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamPopSubDep2ByUNameIdxKey argKey )
	{
		YCFBamPopSubDep2Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamPopSubDep2Buff> matchSet = new LinkedList<YCFBamPopSubDep2Buff>();
		Iterator<YCFBamPopSubDep2Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamPopSubDep2Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTablePopSubDep2().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deletePopSubDep2( Authorization, cur );
		}
	}

	public void deletePopSubDep2ByRelationIdx( YCFSecAuthorization Authorization,
		long argRelationTenantId,
		long argRelationId )
	{
		YCFBamPopDepByRelationIdxKey key = schema.getFactoryPopDep().newRelationIdxKey();
		key.setRequiredRelationTenantId( argRelationTenantId );
		key.setRequiredRelationId( argRelationId );
		deletePopSubDep2ByRelationIdx( Authorization, key );
	}

	public void deletePopSubDep2ByRelationIdx( YCFSecAuthorization Authorization,
		YCFBamPopDepByRelationIdxKey argKey )
	{
		YCFBamPopSubDep2Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamPopSubDep2Buff> matchSet = new LinkedList<YCFBamPopSubDep2Buff>();
		Iterator<YCFBamPopSubDep2Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamPopSubDep2Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTablePopSubDep2().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deletePopSubDep2( Authorization, cur );
		}
	}

	public void deletePopSubDep2ByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamPopDepByDefSchemaIdxKey key = schema.getFactoryPopDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deletePopSubDep2ByDefSchemaIdx( Authorization, key );
	}

	public void deletePopSubDep2ByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamPopDepByDefSchemaIdxKey argKey )
	{
		YCFBamPopSubDep2Buff cur;
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
		LinkedList<YCFBamPopSubDep2Buff> matchSet = new LinkedList<YCFBamPopSubDep2Buff>();
		Iterator<YCFBamPopSubDep2Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamPopSubDep2Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTablePopSubDep2().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deletePopSubDep2( Authorization, cur );
		}
	}

	public void deletePopSubDep2ByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deletePopSubDep2ByIdIdx( Authorization, key );
	}

	public void deletePopSubDep2ByIdIdx( YCFSecAuthorization Authorization,
		YCFBamScopePKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamPopSubDep2Buff cur;
		LinkedList<YCFBamPopSubDep2Buff> matchSet = new LinkedList<YCFBamPopSubDep2Buff>();
		Iterator<YCFBamPopSubDep2Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamPopSubDep2Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTablePopSubDep2().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deletePopSubDep2( Authorization, cur );
		}
	}

	public void deletePopSubDep2ByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamScopeByTenantIdxKey key = schema.getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deletePopSubDep2ByTenantIdx( Authorization, key );
	}

	public void deletePopSubDep2ByTenantIdx( YCFSecAuthorization Authorization,
		YCFBamScopeByTenantIdxKey argKey )
	{
		YCFBamPopSubDep2Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamPopSubDep2Buff> matchSet = new LinkedList<YCFBamPopSubDep2Buff>();
		Iterator<YCFBamPopSubDep2Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamPopSubDep2Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTablePopSubDep2().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deletePopSubDep2( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
