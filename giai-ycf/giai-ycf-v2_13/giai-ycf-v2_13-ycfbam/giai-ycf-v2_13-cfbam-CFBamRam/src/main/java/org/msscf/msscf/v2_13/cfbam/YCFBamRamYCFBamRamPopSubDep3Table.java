
// Description: Java 11 in-memory RAM DbIO implementation for PopSubDep3.

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
 *	YCFBamRamPopSubDep3Table in-memory RAM DbIO implementation
 *	for PopSubDep3.
 */
public class YCFBamRamPopSubDep3Table
	implements IYCFBamPopSubDep3Table
{
	private IYCFBamSchema schema;
	private Map< YCFBamScopePKey,
				YCFBamPopSubDep3Buff > dictByPKey
		= new HashMap< YCFBamScopePKey,
				YCFBamPopSubDep3Buff >();
	private Map< YCFBamPopSubDep3ByPopSubDep2IdxKey,
				Map< YCFBamScopePKey,
					YCFBamPopSubDep3Buff >> dictByPopSubDep2Idx
		= new HashMap< YCFBamPopSubDep3ByPopSubDep2IdxKey,
				Map< YCFBamScopePKey,
					YCFBamPopSubDep3Buff >>();
	private Map< YCFBamPopSubDep3ByUNameIdxKey,
			YCFBamPopSubDep3Buff > dictByUNameIdx
		= new HashMap< YCFBamPopSubDep3ByUNameIdxKey,
			YCFBamPopSubDep3Buff >();

	public YCFBamRamPopSubDep3Table( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createPopSubDep3( YCFSecAuthorization Authorization,
		YCFBamPopSubDep3Buff Buff )
	{
		final String S_ProcName = "createPopSubDep3";
		schema.getTablePopDep().createPopDep( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamPopSubDep3ByPopSubDep2IdxKey keyPopSubDep2Idx = schema.getFactoryPopSubDep3().newPopSubDep2IdxKey();
		keyPopSubDep2Idx.setRequiredPopSubDep2TenantId( Buff.getRequiredPopSubDep2TenantId() );
		keyPopSubDep2Idx.setRequiredPopSubDep2Id( Buff.getRequiredPopSubDep2Id() );

		YCFBamPopSubDep3ByUNameIdxKey keyUNameIdx = schema.getFactoryPopSubDep3().newUNameIdxKey();
		keyUNameIdx.setRequiredPopSubDep2TenantId( Buff.getRequiredPopSubDep2TenantId() );
		keyUNameIdx.setRequiredPopSubDep2Id( Buff.getRequiredPopSubDep2Id() );
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"PopSubDep3UNameIdx",
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
				if( null == schema.getTablePopSubDep2().readDerivedByIdIdx( Authorization,
						Buff.getRequiredPopSubDep2TenantId(),
						Buff.getRequiredPopSubDep2Id() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"PopSubDep2",
						"PopSubDep2",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamPopSubDep3Buff > subdictPopSubDep2Idx;
		if( dictByPopSubDep2Idx.containsKey( keyPopSubDep2Idx ) ) {
			subdictPopSubDep2Idx = dictByPopSubDep2Idx.get( keyPopSubDep2Idx );
		}
		else {
			subdictPopSubDep2Idx = new HashMap< YCFBamScopePKey, YCFBamPopSubDep3Buff >();
			dictByPopSubDep2Idx.put( keyPopSubDep2Idx, subdictPopSubDep2Idx );
		}
		subdictPopSubDep2Idx.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

	}

	public YCFBamPopSubDep3Buff readDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamPopSubDep3.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamPopSubDep3Buff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamPopSubDep3Buff lockDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamPopSubDep3.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamPopSubDep3Buff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamPopSubDep3Buff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamPopSubDep3.readAllDerived";
		YCFBamPopSubDep3Buff[] retList = new YCFBamPopSubDep3Buff[ dictByPKey.values().size() ];
		Iterator< YCFBamPopSubDep3Buff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamPopSubDep3Buff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamPopSubDep3Buff> filteredList = new ArrayList<YCFBamPopSubDep3Buff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamPopSubDep3Buff ) ) {
					filteredList.add( (YCFBamPopSubDep3Buff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamPopSubDep3Buff[0] ) );
		}
	}

	public YCFBamPopSubDep3Buff[] readDerivedByRelationIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamPopSubDep3Buff> filteredList = new ArrayList<YCFBamPopSubDep3Buff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamPopSubDep3Buff ) ) {
					filteredList.add( (YCFBamPopSubDep3Buff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamPopSubDep3Buff[0] ) );
		}
	}

	public YCFBamPopSubDep3Buff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamPopSubDep3Buff> filteredList = new ArrayList<YCFBamPopSubDep3Buff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamPopSubDep3Buff ) ) {
					filteredList.add( (YCFBamPopSubDep3Buff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamPopSubDep3Buff[0] ) );
		}
	}

	public YCFBamPopSubDep3Buff[] readDerivedByPopSubDep2Idx( YCFSecAuthorization Authorization,
		long PopSubDep2TenantId,
		long PopSubDep2Id )
	{
		final String S_ProcName = "YCFBamRamPopSubDep3.readDerivedByPopSubDep2Idx";
		YCFBamPopSubDep3ByPopSubDep2IdxKey key = schema.getFactoryPopSubDep3().newPopSubDep2IdxKey();
		key.setRequiredPopSubDep2TenantId( PopSubDep2TenantId );
		key.setRequiredPopSubDep2Id( PopSubDep2Id );

		YCFBamPopSubDep3Buff[] recArray;
		if( dictByPopSubDep2Idx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamPopSubDep3Buff > subdictPopSubDep2Idx
				= dictByPopSubDep2Idx.get( key );
			recArray = new YCFBamPopSubDep3Buff[ subdictPopSubDep2Idx.size() ];
			Iterator< YCFBamPopSubDep3Buff > iter = subdictPopSubDep2Idx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamPopSubDep3Buff > subdictPopSubDep2Idx
				= new HashMap< YCFBamScopePKey, YCFBamPopSubDep3Buff >();
			dictByPopSubDep2Idx.put( key, subdictPopSubDep2Idx );
			recArray = new YCFBamPopSubDep3Buff[0];
		}
		return( recArray );
	}

	public YCFBamPopSubDep3Buff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long PopSubDep2TenantId,
		long PopSubDep2Id,
		String Name )
	{
		final String S_ProcName = "YCFBamRamPopSubDep3.readDerivedByUNameIdx";
		YCFBamPopSubDep3ByUNameIdxKey key = schema.getFactoryPopSubDep3().newUNameIdxKey();
		key.setRequiredPopSubDep2TenantId( PopSubDep2TenantId );
		key.setRequiredPopSubDep2Id( PopSubDep2Id );
		key.setRequiredName( Name );

		YCFBamPopSubDep3Buff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamPopSubDep3Buff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readDerivedByIdIdx() ";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamPopSubDep3Buff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamPopSubDep3Buff readBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamPopSubDep3.readBuff";
		YCFBamPopSubDep3Buff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a836" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamPopSubDep3Buff lockBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamPopSubDep3Buff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a836" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamPopSubDep3Buff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamPopSubDep3.readAllBuff";
		YCFBamPopSubDep3Buff buff;
		ArrayList<YCFBamPopSubDep3Buff> filteredList = new ArrayList<YCFBamPopSubDep3Buff>();
		YCFBamPopSubDep3Buff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a836" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamPopSubDep3Buff[0] ) );
	}

	public YCFBamPopSubDep3Buff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByIdIdx() ";
		YCFBamPopSubDep3Buff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
			return( (YCFBamPopSubDep3Buff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamPopSubDep3Buff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByTenantIdx() ";
		YCFBamPopSubDep3Buff buff;
		ArrayList<YCFBamPopSubDep3Buff> filteredList = new ArrayList<YCFBamPopSubDep3Buff>();
		YCFBamPopSubDep3Buff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
				filteredList.add( (YCFBamPopSubDep3Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamPopSubDep3Buff[0] ) );
	}

	public YCFBamPopSubDep3Buff[] readBuffByRelationIdx( YCFSecAuthorization Authorization,
		long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "YCFBamRamPopDep.readBuffByRelationIdx() ";
		YCFBamPopSubDep3Buff buff;
		ArrayList<YCFBamPopSubDep3Buff> filteredList = new ArrayList<YCFBamPopSubDep3Buff>();
		YCFBamPopSubDep3Buff[] buffList = readDerivedByRelationIdx( Authorization,
			RelationTenantId,
			RelationId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a833" ) ) {
				filteredList.add( (YCFBamPopSubDep3Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamPopSubDep3Buff[0] ) );
	}

	public YCFBamPopSubDep3Buff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamPopDep.readBuffByDefSchemaIdx() ";
		YCFBamPopSubDep3Buff buff;
		ArrayList<YCFBamPopSubDep3Buff> filteredList = new ArrayList<YCFBamPopSubDep3Buff>();
		YCFBamPopSubDep3Buff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a833" ) ) {
				filteredList.add( (YCFBamPopSubDep3Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamPopSubDep3Buff[0] ) );
	}

	public YCFBamPopSubDep3Buff[] readBuffByPopSubDep2Idx( YCFSecAuthorization Authorization,
		long PopSubDep2TenantId,
		long PopSubDep2Id )
	{
		final String S_ProcName = "YCFBamRamPopSubDep3.readBuffByPopSubDep2Idx() ";
		YCFBamPopSubDep3Buff buff;
		ArrayList<YCFBamPopSubDep3Buff> filteredList = new ArrayList<YCFBamPopSubDep3Buff>();
		YCFBamPopSubDep3Buff[] buffList = readDerivedByPopSubDep2Idx( Authorization,
			PopSubDep2TenantId,
			PopSubDep2Id );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a836" ) ) {
				filteredList.add( (YCFBamPopSubDep3Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamPopSubDep3Buff[0] ) );
	}

	public YCFBamPopSubDep3Buff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long PopSubDep2TenantId,
		long PopSubDep2Id,
		String Name )
	{
		final String S_ProcName = "YCFBamRamPopSubDep3.readBuffByUNameIdx() ";
		YCFBamPopSubDep3Buff buff = readDerivedByUNameIdx( Authorization,
			PopSubDep2TenantId,
			PopSubDep2Id,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a836" ) ) {
			return( (YCFBamPopSubDep3Buff)buff );
		}
		else {
			return( null );
		}
	}

	/**
	 *	Read a page array of the specific PopSubDep3 buffer instances identified by the duplicate key RelationIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRelationTenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamPopSubDep3Buff[] pageBuffByRelationIdx( YCFSecAuthorization Authorization,
		long RelationTenantId,
		long RelationId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByRelationIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific PopSubDep3 buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamPopSubDep3Buff[] pageBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByDefSchemaIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific PopSubDep3 buffer instances identified by the duplicate key PopSubDep2Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPopSubDep2TenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argPopSubDep2Id	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamPopSubDep3Buff[] pageBuffByPopSubDep2Idx( YCFSecAuthorization Authorization,
		long PopSubDep2TenantId,
		long PopSubDep2Id,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByPopSubDep2Idx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updatePopSubDep3( YCFSecAuthorization Authorization,
		YCFBamPopSubDep3Buff Buff )
	{
		schema.getTablePopDep().updatePopDep( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamPopSubDep3Buff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updatePopSubDep3",
				"Existing record not found",
				"PopSubDep3",
				pkey );
		}
		YCFBamPopSubDep3ByPopSubDep2IdxKey existingKeyPopSubDep2Idx = schema.getFactoryPopSubDep3().newPopSubDep2IdxKey();
		existingKeyPopSubDep2Idx.setRequiredPopSubDep2TenantId( existing.getRequiredPopSubDep2TenantId() );
		existingKeyPopSubDep2Idx.setRequiredPopSubDep2Id( existing.getRequiredPopSubDep2Id() );

		YCFBamPopSubDep3ByPopSubDep2IdxKey newKeyPopSubDep2Idx = schema.getFactoryPopSubDep3().newPopSubDep2IdxKey();
		newKeyPopSubDep2Idx.setRequiredPopSubDep2TenantId( Buff.getRequiredPopSubDep2TenantId() );
		newKeyPopSubDep2Idx.setRequiredPopSubDep2Id( Buff.getRequiredPopSubDep2Id() );

		YCFBamPopSubDep3ByUNameIdxKey existingKeyUNameIdx = schema.getFactoryPopSubDep3().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredPopSubDep2TenantId( existing.getRequiredPopSubDep2TenantId() );
		existingKeyUNameIdx.setRequiredPopSubDep2Id( existing.getRequiredPopSubDep2Id() );
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamPopSubDep3ByUNameIdxKey newKeyUNameIdx = schema.getFactoryPopSubDep3().newUNameIdxKey();
		newKeyUNameIdx.setRequiredPopSubDep2TenantId( Buff.getRequiredPopSubDep2TenantId() );
		newKeyUNameIdx.setRequiredPopSubDep2Id( Buff.getRequiredPopSubDep2Id() );
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updatePopSubDep3",
					"PopSubDep3UNameIdx",
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
						"updatePopSubDep3",
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
				if( null == schema.getTablePopSubDep2().readDerivedByIdIdx( Authorization,
						Buff.getRequiredPopSubDep2TenantId(),
						Buff.getRequiredPopSubDep2Id() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updatePopSubDep3",
						"Container",
						"PopSubDep2",
						"PopSubDep2",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamScopePKey, YCFBamPopSubDep3Buff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByPopSubDep2Idx.get( existingKeyPopSubDep2Idx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByPopSubDep2Idx.containsKey( newKeyPopSubDep2Idx ) ) {
			subdict = dictByPopSubDep2Idx.get( newKeyPopSubDep2Idx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamPopSubDep3Buff >();
			dictByPopSubDep2Idx.put( newKeyPopSubDep2Idx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

	}

	public void deletePopSubDep3( YCFSecAuthorization Authorization,
		YCFBamPopSubDep3Buff Buff )
	{
		final String S_ProcName = "YCFBamRamPopSubDep3Table.deletePopSubDep3() ";
		String classCode;
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamPopSubDep3Buff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deletePopSubDep3",
				pkey );
		}
		YCFBamPopSubDep3ByPopSubDep2IdxKey keyPopSubDep2Idx = schema.getFactoryPopSubDep3().newPopSubDep2IdxKey();
		keyPopSubDep2Idx.setRequiredPopSubDep2TenantId( existing.getRequiredPopSubDep2TenantId() );
		keyPopSubDep2Idx.setRequiredPopSubDep2Id( existing.getRequiredPopSubDep2Id() );

		YCFBamPopSubDep3ByUNameIdxKey keyUNameIdx = schema.getFactoryPopSubDep3().newUNameIdxKey();
		keyUNameIdx.setRequiredPopSubDep2TenantId( existing.getRequiredPopSubDep2TenantId() );
		keyUNameIdx.setRequiredPopSubDep2Id( existing.getRequiredPopSubDep2Id() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFBamScopePKey, YCFBamPopSubDep3Buff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByPopSubDep2Idx.get( keyPopSubDep2Idx );
		subdict.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

		schema.getTablePopDep().deletePopDep( Authorization,
			Buff );
	}
	public void deletePopSubDep3ByPopSubDep2Idx( YCFSecAuthorization Authorization,
		long argPopSubDep2TenantId,
		long argPopSubDep2Id )
	{
		YCFBamPopSubDep3ByPopSubDep2IdxKey key = schema.getFactoryPopSubDep3().newPopSubDep2IdxKey();
		key.setRequiredPopSubDep2TenantId( argPopSubDep2TenantId );
		key.setRequiredPopSubDep2Id( argPopSubDep2Id );
		deletePopSubDep3ByPopSubDep2Idx( Authorization, key );
	}

	public void deletePopSubDep3ByPopSubDep2Idx( YCFSecAuthorization Authorization,
		YCFBamPopSubDep3ByPopSubDep2IdxKey argKey )
	{
		YCFBamPopSubDep3Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamPopSubDep3Buff> matchSet = new LinkedList<YCFBamPopSubDep3Buff>();
		Iterator<YCFBamPopSubDep3Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamPopSubDep3Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTablePopSubDep3().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deletePopSubDep3( Authorization, cur );
		}
	}

	public void deletePopSubDep3ByUNameIdx( YCFSecAuthorization Authorization,
		long argPopSubDep2TenantId,
		long argPopSubDep2Id,
		String argName )
	{
		YCFBamPopSubDep3ByUNameIdxKey key = schema.getFactoryPopSubDep3().newUNameIdxKey();
		key.setRequiredPopSubDep2TenantId( argPopSubDep2TenantId );
		key.setRequiredPopSubDep2Id( argPopSubDep2Id );
		key.setRequiredName( argName );
		deletePopSubDep3ByUNameIdx( Authorization, key );
	}

	public void deletePopSubDep3ByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamPopSubDep3ByUNameIdxKey argKey )
	{
		YCFBamPopSubDep3Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamPopSubDep3Buff> matchSet = new LinkedList<YCFBamPopSubDep3Buff>();
		Iterator<YCFBamPopSubDep3Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamPopSubDep3Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTablePopSubDep3().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deletePopSubDep3( Authorization, cur );
		}
	}

	public void deletePopSubDep3ByRelationIdx( YCFSecAuthorization Authorization,
		long argRelationTenantId,
		long argRelationId )
	{
		YCFBamPopDepByRelationIdxKey key = schema.getFactoryPopDep().newRelationIdxKey();
		key.setRequiredRelationTenantId( argRelationTenantId );
		key.setRequiredRelationId( argRelationId );
		deletePopSubDep3ByRelationIdx( Authorization, key );
	}

	public void deletePopSubDep3ByRelationIdx( YCFSecAuthorization Authorization,
		YCFBamPopDepByRelationIdxKey argKey )
	{
		YCFBamPopSubDep3Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamPopSubDep3Buff> matchSet = new LinkedList<YCFBamPopSubDep3Buff>();
		Iterator<YCFBamPopSubDep3Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamPopSubDep3Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTablePopSubDep3().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deletePopSubDep3( Authorization, cur );
		}
	}

	public void deletePopSubDep3ByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamPopDepByDefSchemaIdxKey key = schema.getFactoryPopDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deletePopSubDep3ByDefSchemaIdx( Authorization, key );
	}

	public void deletePopSubDep3ByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamPopDepByDefSchemaIdxKey argKey )
	{
		YCFBamPopSubDep3Buff cur;
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
		LinkedList<YCFBamPopSubDep3Buff> matchSet = new LinkedList<YCFBamPopSubDep3Buff>();
		Iterator<YCFBamPopSubDep3Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamPopSubDep3Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTablePopSubDep3().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deletePopSubDep3( Authorization, cur );
		}
	}

	public void deletePopSubDep3ByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deletePopSubDep3ByIdIdx( Authorization, key );
	}

	public void deletePopSubDep3ByIdIdx( YCFSecAuthorization Authorization,
		YCFBamScopePKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamPopSubDep3Buff cur;
		LinkedList<YCFBamPopSubDep3Buff> matchSet = new LinkedList<YCFBamPopSubDep3Buff>();
		Iterator<YCFBamPopSubDep3Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamPopSubDep3Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTablePopSubDep3().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deletePopSubDep3( Authorization, cur );
		}
	}

	public void deletePopSubDep3ByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamScopeByTenantIdxKey key = schema.getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deletePopSubDep3ByTenantIdx( Authorization, key );
	}

	public void deletePopSubDep3ByTenantIdx( YCFSecAuthorization Authorization,
		YCFBamScopeByTenantIdxKey argKey )
	{
		YCFBamPopSubDep3Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamPopSubDep3Buff> matchSet = new LinkedList<YCFBamPopSubDep3Buff>();
		Iterator<YCFBamPopSubDep3Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamPopSubDep3Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTablePopSubDep3().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deletePopSubDep3( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
