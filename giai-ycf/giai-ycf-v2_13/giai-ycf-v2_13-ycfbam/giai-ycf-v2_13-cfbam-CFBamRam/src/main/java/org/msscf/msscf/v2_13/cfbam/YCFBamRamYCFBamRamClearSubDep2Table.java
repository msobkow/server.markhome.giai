
// Description: Java 11 in-memory RAM DbIO implementation for ClearSubDep2.

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
 *	YCFBamRamClearSubDep2Table in-memory RAM DbIO implementation
 *	for ClearSubDep2.
 */
public class YCFBamRamClearSubDep2Table
	implements IYCFBamClearSubDep2Table
{
	private IYCFBamSchema schema;
	private Map< YCFBamScopePKey,
				YCFBamClearSubDep2Buff > dictByPKey
		= new HashMap< YCFBamScopePKey,
				YCFBamClearSubDep2Buff >();
	private Map< YCFBamClearSubDep2ByClearSubDep1IdxKey,
				Map< YCFBamScopePKey,
					YCFBamClearSubDep2Buff >> dictByClearSubDep1Idx
		= new HashMap< YCFBamClearSubDep2ByClearSubDep1IdxKey,
				Map< YCFBamScopePKey,
					YCFBamClearSubDep2Buff >>();
	private Map< YCFBamClearSubDep2ByUNameIdxKey,
			YCFBamClearSubDep2Buff > dictByUNameIdx
		= new HashMap< YCFBamClearSubDep2ByUNameIdxKey,
			YCFBamClearSubDep2Buff >();

	public YCFBamRamClearSubDep2Table( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createClearSubDep2( YCFSecAuthorization Authorization,
		YCFBamClearSubDep2Buff Buff )
	{
		final String S_ProcName = "createClearSubDep2";
		schema.getTableClearDep().createClearDep( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamClearSubDep2ByClearSubDep1IdxKey keyClearSubDep1Idx = schema.getFactoryClearSubDep2().newClearSubDep1IdxKey();
		keyClearSubDep1Idx.setRequiredClearSubDep1TenantId( Buff.getRequiredClearSubDep1TenantId() );
		keyClearSubDep1Idx.setRequiredClearSubDep1Id( Buff.getRequiredClearSubDep1Id() );

		YCFBamClearSubDep2ByUNameIdxKey keyUNameIdx = schema.getFactoryClearSubDep2().newUNameIdxKey();
		keyUNameIdx.setRequiredClearSubDep1TenantId( Buff.getRequiredClearSubDep1TenantId() );
		keyUNameIdx.setRequiredClearSubDep1Id( Buff.getRequiredClearSubDep1Id() );
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"ClearSubDep2UNameIdx",
				keyUNameIdx );
		}

		// Validate foreign keys

		{
			boolean allNull = true;
			allNull = false;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableClearDep().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Superclass",
						"SuperClass",
						"ClearDep",
						null );
				}
			}
		}

		{
			boolean allNull = true;
			allNull = false;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableClearSubDep1().readDerivedByIdIdx( Authorization,
						Buff.getRequiredClearSubDep1TenantId(),
						Buff.getRequiredClearSubDep1Id() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"ClearSubDep1",
						"ClearSubDep1",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamClearSubDep2Buff > subdictClearSubDep1Idx;
		if( dictByClearSubDep1Idx.containsKey( keyClearSubDep1Idx ) ) {
			subdictClearSubDep1Idx = dictByClearSubDep1Idx.get( keyClearSubDep1Idx );
		}
		else {
			subdictClearSubDep1Idx = new HashMap< YCFBamScopePKey, YCFBamClearSubDep2Buff >();
			dictByClearSubDep1Idx.put( keyClearSubDep1Idx, subdictClearSubDep1Idx );
		}
		subdictClearSubDep1Idx.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

	}

	public YCFBamClearSubDep2Buff readDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamClearSubDep2.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamClearSubDep2Buff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamClearSubDep2Buff lockDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamClearSubDep2.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamClearSubDep2Buff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamClearSubDep2Buff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamClearSubDep2.readAllDerived";
		YCFBamClearSubDep2Buff[] retList = new YCFBamClearSubDep2Buff[ dictByPKey.values().size() ];
		Iterator< YCFBamClearSubDep2Buff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamClearSubDep2Buff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamClearSubDep2Buff> filteredList = new ArrayList<YCFBamClearSubDep2Buff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamClearSubDep2Buff ) ) {
					filteredList.add( (YCFBamClearSubDep2Buff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamClearSubDep2Buff[0] ) );
		}
	}

	public YCFBamClearSubDep2Buff[] readDerivedByClearDepIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long RelationId )
	{
		final String S_ProcName = "YCFBamRamClearDep.readDerivedByClearDepIdx";
		YCFBamClearDepBuff buffList[] = schema.getTableClearDep().readDerivedByClearDepIdx( Authorization,
			TenantId,
			RelationId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFBamClearDepBuff buff;
			ArrayList<YCFBamClearSubDep2Buff> filteredList = new ArrayList<YCFBamClearSubDep2Buff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamClearSubDep2Buff ) ) {
					filteredList.add( (YCFBamClearSubDep2Buff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamClearSubDep2Buff[0] ) );
		}
	}

	public YCFBamClearSubDep2Buff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamClearDep.readDerivedByDefSchemaIdx";
		YCFBamClearDepBuff buffList[] = schema.getTableClearDep().readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFBamClearDepBuff buff;
			ArrayList<YCFBamClearSubDep2Buff> filteredList = new ArrayList<YCFBamClearSubDep2Buff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamClearSubDep2Buff ) ) {
					filteredList.add( (YCFBamClearSubDep2Buff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamClearSubDep2Buff[0] ) );
		}
	}

	public YCFBamClearSubDep2Buff[] readDerivedByClearSubDep1Idx( YCFSecAuthorization Authorization,
		long ClearSubDep1TenantId,
		long ClearSubDep1Id )
	{
		final String S_ProcName = "YCFBamRamClearSubDep2.readDerivedByClearSubDep1Idx";
		YCFBamClearSubDep2ByClearSubDep1IdxKey key = schema.getFactoryClearSubDep2().newClearSubDep1IdxKey();
		key.setRequiredClearSubDep1TenantId( ClearSubDep1TenantId );
		key.setRequiredClearSubDep1Id( ClearSubDep1Id );

		YCFBamClearSubDep2Buff[] recArray;
		if( dictByClearSubDep1Idx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamClearSubDep2Buff > subdictClearSubDep1Idx
				= dictByClearSubDep1Idx.get( key );
			recArray = new YCFBamClearSubDep2Buff[ subdictClearSubDep1Idx.size() ];
			Iterator< YCFBamClearSubDep2Buff > iter = subdictClearSubDep1Idx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamClearSubDep2Buff > subdictClearSubDep1Idx
				= new HashMap< YCFBamScopePKey, YCFBamClearSubDep2Buff >();
			dictByClearSubDep1Idx.put( key, subdictClearSubDep1Idx );
			recArray = new YCFBamClearSubDep2Buff[0];
		}
		return( recArray );
	}

	public YCFBamClearSubDep2Buff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long ClearSubDep1TenantId,
		long ClearSubDep1Id,
		String Name )
	{
		final String S_ProcName = "YCFBamRamClearSubDep2.readDerivedByUNameIdx";
		YCFBamClearSubDep2ByUNameIdxKey key = schema.getFactoryClearSubDep2().newUNameIdxKey();
		key.setRequiredClearSubDep1TenantId( ClearSubDep1TenantId );
		key.setRequiredClearSubDep1Id( ClearSubDep1Id );
		key.setRequiredName( Name );

		YCFBamClearSubDep2Buff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamClearSubDep2Buff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readDerivedByIdIdx() ";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamClearSubDep2Buff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamClearSubDep2Buff readBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamClearSubDep2.readBuff";
		YCFBamClearSubDep2Buff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a815" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamClearSubDep2Buff lockBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamClearSubDep2Buff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a815" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamClearSubDep2Buff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamClearSubDep2.readAllBuff";
		YCFBamClearSubDep2Buff buff;
		ArrayList<YCFBamClearSubDep2Buff> filteredList = new ArrayList<YCFBamClearSubDep2Buff>();
		YCFBamClearSubDep2Buff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a815" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamClearSubDep2Buff[0] ) );
	}

	public YCFBamClearSubDep2Buff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByIdIdx() ";
		YCFBamClearSubDep2Buff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
			return( (YCFBamClearSubDep2Buff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamClearSubDep2Buff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByTenantIdx() ";
		YCFBamClearSubDep2Buff buff;
		ArrayList<YCFBamClearSubDep2Buff> filteredList = new ArrayList<YCFBamClearSubDep2Buff>();
		YCFBamClearSubDep2Buff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
				filteredList.add( (YCFBamClearSubDep2Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamClearSubDep2Buff[0] ) );
	}

	public YCFBamClearSubDep2Buff[] readBuffByClearDepIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long RelationId )
	{
		final String S_ProcName = "YCFBamRamClearDep.readBuffByClearDepIdx() ";
		YCFBamClearSubDep2Buff buff;
		ArrayList<YCFBamClearSubDep2Buff> filteredList = new ArrayList<YCFBamClearSubDep2Buff>();
		YCFBamClearSubDep2Buff[] buffList = readDerivedByClearDepIdx( Authorization,
			TenantId,
			RelationId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a813" ) ) {
				filteredList.add( (YCFBamClearSubDep2Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamClearSubDep2Buff[0] ) );
	}

	public YCFBamClearSubDep2Buff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamClearDep.readBuffByDefSchemaIdx() ";
		YCFBamClearSubDep2Buff buff;
		ArrayList<YCFBamClearSubDep2Buff> filteredList = new ArrayList<YCFBamClearSubDep2Buff>();
		YCFBamClearSubDep2Buff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a813" ) ) {
				filteredList.add( (YCFBamClearSubDep2Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamClearSubDep2Buff[0] ) );
	}

	public YCFBamClearSubDep2Buff[] readBuffByClearSubDep1Idx( YCFSecAuthorization Authorization,
		long ClearSubDep1TenantId,
		long ClearSubDep1Id )
	{
		final String S_ProcName = "YCFBamRamClearSubDep2.readBuffByClearSubDep1Idx() ";
		YCFBamClearSubDep2Buff buff;
		ArrayList<YCFBamClearSubDep2Buff> filteredList = new ArrayList<YCFBamClearSubDep2Buff>();
		YCFBamClearSubDep2Buff[] buffList = readDerivedByClearSubDep1Idx( Authorization,
			ClearSubDep1TenantId,
			ClearSubDep1Id );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a815" ) ) {
				filteredList.add( (YCFBamClearSubDep2Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamClearSubDep2Buff[0] ) );
	}

	public YCFBamClearSubDep2Buff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long ClearSubDep1TenantId,
		long ClearSubDep1Id,
		String Name )
	{
		final String S_ProcName = "YCFBamRamClearSubDep2.readBuffByUNameIdx() ";
		YCFBamClearSubDep2Buff buff = readDerivedByUNameIdx( Authorization,
			ClearSubDep1TenantId,
			ClearSubDep1Id,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a815" ) ) {
			return( (YCFBamClearSubDep2Buff)buff );
		}
		else {
			return( null );
		}
	}

	/**
	 *	Read a page array of the specific ClearSubDep2 buffer instances identified by the duplicate key ClearDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamClearSubDep2Buff[] pageBuffByClearDepIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long RelationId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByClearDepIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific ClearSubDep2 buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamClearSubDep2Buff[] pageBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByDefSchemaIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific ClearSubDep2 buffer instances identified by the duplicate key ClearSubDep1Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClearSubDep1TenantId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argClearSubDep1Id	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamClearSubDep2Buff[] pageBuffByClearSubDep1Idx( YCFSecAuthorization Authorization,
		long ClearSubDep1TenantId,
		long ClearSubDep1Id,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByClearSubDep1Idx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateClearSubDep2( YCFSecAuthorization Authorization,
		YCFBamClearSubDep2Buff Buff )
	{
		schema.getTableClearDep().updateClearDep( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamClearSubDep2Buff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateClearSubDep2",
				"Existing record not found",
				"ClearSubDep2",
				pkey );
		}
		YCFBamClearSubDep2ByClearSubDep1IdxKey existingKeyClearSubDep1Idx = schema.getFactoryClearSubDep2().newClearSubDep1IdxKey();
		existingKeyClearSubDep1Idx.setRequiredClearSubDep1TenantId( existing.getRequiredClearSubDep1TenantId() );
		existingKeyClearSubDep1Idx.setRequiredClearSubDep1Id( existing.getRequiredClearSubDep1Id() );

		YCFBamClearSubDep2ByClearSubDep1IdxKey newKeyClearSubDep1Idx = schema.getFactoryClearSubDep2().newClearSubDep1IdxKey();
		newKeyClearSubDep1Idx.setRequiredClearSubDep1TenantId( Buff.getRequiredClearSubDep1TenantId() );
		newKeyClearSubDep1Idx.setRequiredClearSubDep1Id( Buff.getRequiredClearSubDep1Id() );

		YCFBamClearSubDep2ByUNameIdxKey existingKeyUNameIdx = schema.getFactoryClearSubDep2().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredClearSubDep1TenantId( existing.getRequiredClearSubDep1TenantId() );
		existingKeyUNameIdx.setRequiredClearSubDep1Id( existing.getRequiredClearSubDep1Id() );
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamClearSubDep2ByUNameIdxKey newKeyUNameIdx = schema.getFactoryClearSubDep2().newUNameIdxKey();
		newKeyUNameIdx.setRequiredClearSubDep1TenantId( Buff.getRequiredClearSubDep1TenantId() );
		newKeyUNameIdx.setRequiredClearSubDep1Id( Buff.getRequiredClearSubDep1Id() );
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateClearSubDep2",
					"ClearSubDep2UNameIdx",
					newKeyUNameIdx );
			}
		}

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableClearDep().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateClearSubDep2",
						"Superclass",
						"SuperClass",
						"ClearDep",
						null );
				}
			}
		}

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableClearSubDep1().readDerivedByIdIdx( Authorization,
						Buff.getRequiredClearSubDep1TenantId(),
						Buff.getRequiredClearSubDep1Id() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateClearSubDep2",
						"Container",
						"ClearSubDep1",
						"ClearSubDep1",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamScopePKey, YCFBamClearSubDep2Buff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByClearSubDep1Idx.get( existingKeyClearSubDep1Idx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByClearSubDep1Idx.containsKey( newKeyClearSubDep1Idx ) ) {
			subdict = dictByClearSubDep1Idx.get( newKeyClearSubDep1Idx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamClearSubDep2Buff >();
			dictByClearSubDep1Idx.put( newKeyClearSubDep1Idx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

	}

	public void deleteClearSubDep2( YCFSecAuthorization Authorization,
		YCFBamClearSubDep2Buff Buff )
	{
		final String S_ProcName = "YCFBamRamClearSubDep2Table.deleteClearSubDep2() ";
		String classCode;
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamClearSubDep2Buff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteClearSubDep2",
				pkey );
		}
		// Short circuit self-referential code to prevent stack overflows
		Object arrCheckClearDep[] = schema.getTableClearSubDep3().readDerivedByClearSubDep2Idx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		if( arrCheckClearDep.length > 0 ) {
			schema.getTableClearSubDep3().deleteClearSubDep3ByClearSubDep2Idx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		}
		YCFBamClearSubDep2ByClearSubDep1IdxKey keyClearSubDep1Idx = schema.getFactoryClearSubDep2().newClearSubDep1IdxKey();
		keyClearSubDep1Idx.setRequiredClearSubDep1TenantId( existing.getRequiredClearSubDep1TenantId() );
		keyClearSubDep1Idx.setRequiredClearSubDep1Id( existing.getRequiredClearSubDep1Id() );

		YCFBamClearSubDep2ByUNameIdxKey keyUNameIdx = schema.getFactoryClearSubDep2().newUNameIdxKey();
		keyUNameIdx.setRequiredClearSubDep1TenantId( existing.getRequiredClearSubDep1TenantId() );
		keyUNameIdx.setRequiredClearSubDep1Id( existing.getRequiredClearSubDep1Id() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFBamScopePKey, YCFBamClearSubDep2Buff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByClearSubDep1Idx.get( keyClearSubDep1Idx );
		subdict.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

		schema.getTableClearDep().deleteClearDep( Authorization,
			Buff );
	}
	public void deleteClearSubDep2ByClearSubDep1Idx( YCFSecAuthorization Authorization,
		long argClearSubDep1TenantId,
		long argClearSubDep1Id )
	{
		YCFBamClearSubDep2ByClearSubDep1IdxKey key = schema.getFactoryClearSubDep2().newClearSubDep1IdxKey();
		key.setRequiredClearSubDep1TenantId( argClearSubDep1TenantId );
		key.setRequiredClearSubDep1Id( argClearSubDep1Id );
		deleteClearSubDep2ByClearSubDep1Idx( Authorization, key );
	}

	public void deleteClearSubDep2ByClearSubDep1Idx( YCFSecAuthorization Authorization,
		YCFBamClearSubDep2ByClearSubDep1IdxKey argKey )
	{
		YCFBamClearSubDep2Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamClearSubDep2Buff> matchSet = new LinkedList<YCFBamClearSubDep2Buff>();
		Iterator<YCFBamClearSubDep2Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamClearSubDep2Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableClearSubDep2().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteClearSubDep2( Authorization, cur );
		}
	}

	public void deleteClearSubDep2ByUNameIdx( YCFSecAuthorization Authorization,
		long argClearSubDep1TenantId,
		long argClearSubDep1Id,
		String argName )
	{
		YCFBamClearSubDep2ByUNameIdxKey key = schema.getFactoryClearSubDep2().newUNameIdxKey();
		key.setRequiredClearSubDep1TenantId( argClearSubDep1TenantId );
		key.setRequiredClearSubDep1Id( argClearSubDep1Id );
		key.setRequiredName( argName );
		deleteClearSubDep2ByUNameIdx( Authorization, key );
	}

	public void deleteClearSubDep2ByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamClearSubDep2ByUNameIdxKey argKey )
	{
		YCFBamClearSubDep2Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamClearSubDep2Buff> matchSet = new LinkedList<YCFBamClearSubDep2Buff>();
		Iterator<YCFBamClearSubDep2Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamClearSubDep2Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableClearSubDep2().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteClearSubDep2( Authorization, cur );
		}
	}

	public void deleteClearSubDep2ByClearDepIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argRelationId )
	{
		YCFBamClearDepByClearDepIdxKey key = schema.getFactoryClearDep().newClearDepIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredRelationId( argRelationId );
		deleteClearSubDep2ByClearDepIdx( Authorization, key );
	}

	public void deleteClearSubDep2ByClearDepIdx( YCFSecAuthorization Authorization,
		YCFBamClearDepByClearDepIdxKey argKey )
	{
		YCFBamClearSubDep2Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamClearSubDep2Buff> matchSet = new LinkedList<YCFBamClearSubDep2Buff>();
		Iterator<YCFBamClearSubDep2Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamClearSubDep2Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableClearSubDep2().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteClearSubDep2( Authorization, cur );
		}
	}

	public void deleteClearSubDep2ByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamClearDepByDefSchemaIdxKey key = schema.getFactoryClearDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deleteClearSubDep2ByDefSchemaIdx( Authorization, key );
	}

	public void deleteClearSubDep2ByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamClearDepByDefSchemaIdxKey argKey )
	{
		YCFBamClearSubDep2Buff cur;
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
		LinkedList<YCFBamClearSubDep2Buff> matchSet = new LinkedList<YCFBamClearSubDep2Buff>();
		Iterator<YCFBamClearSubDep2Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamClearSubDep2Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableClearSubDep2().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteClearSubDep2( Authorization, cur );
		}
	}

	public void deleteClearSubDep2ByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteClearSubDep2ByIdIdx( Authorization, key );
	}

	public void deleteClearSubDep2ByIdIdx( YCFSecAuthorization Authorization,
		YCFBamScopePKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamClearSubDep2Buff cur;
		LinkedList<YCFBamClearSubDep2Buff> matchSet = new LinkedList<YCFBamClearSubDep2Buff>();
		Iterator<YCFBamClearSubDep2Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamClearSubDep2Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableClearSubDep2().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteClearSubDep2( Authorization, cur );
		}
	}

	public void deleteClearSubDep2ByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamScopeByTenantIdxKey key = schema.getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteClearSubDep2ByTenantIdx( Authorization, key );
	}

	public void deleteClearSubDep2ByTenantIdx( YCFSecAuthorization Authorization,
		YCFBamScopeByTenantIdxKey argKey )
	{
		YCFBamClearSubDep2Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamClearSubDep2Buff> matchSet = new LinkedList<YCFBamClearSubDep2Buff>();
		Iterator<YCFBamClearSubDep2Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamClearSubDep2Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableClearSubDep2().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteClearSubDep2( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
