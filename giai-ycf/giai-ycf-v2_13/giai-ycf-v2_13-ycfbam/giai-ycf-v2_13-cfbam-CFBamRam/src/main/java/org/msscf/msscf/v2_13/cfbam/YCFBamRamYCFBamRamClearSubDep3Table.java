
// Description: Java 11 in-memory RAM DbIO implementation for ClearSubDep3.

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
 *	YCFBamRamClearSubDep3Table in-memory RAM DbIO implementation
 *	for ClearSubDep3.
 */
public class YCFBamRamClearSubDep3Table
	implements IYCFBamClearSubDep3Table
{
	private IYCFBamSchema schema;
	private Map< YCFBamScopePKey,
				YCFBamClearSubDep3Buff > dictByPKey
		= new HashMap< YCFBamScopePKey,
				YCFBamClearSubDep3Buff >();
	private Map< YCFBamClearSubDep3ByClearSubDep2IdxKey,
				Map< YCFBamScopePKey,
					YCFBamClearSubDep3Buff >> dictByClearSubDep2Idx
		= new HashMap< YCFBamClearSubDep3ByClearSubDep2IdxKey,
				Map< YCFBamScopePKey,
					YCFBamClearSubDep3Buff >>();
	private Map< YCFBamClearSubDep3ByUNameIdxKey,
			YCFBamClearSubDep3Buff > dictByUNameIdx
		= new HashMap< YCFBamClearSubDep3ByUNameIdxKey,
			YCFBamClearSubDep3Buff >();

	public YCFBamRamClearSubDep3Table( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createClearSubDep3( YCFSecAuthorization Authorization,
		YCFBamClearSubDep3Buff Buff )
	{
		final String S_ProcName = "createClearSubDep3";
		schema.getTableClearDep().createClearDep( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamClearSubDep3ByClearSubDep2IdxKey keyClearSubDep2Idx = schema.getFactoryClearSubDep3().newClearSubDep2IdxKey();
		keyClearSubDep2Idx.setRequiredClearSubDep2TenantId( Buff.getRequiredClearSubDep2TenantId() );
		keyClearSubDep2Idx.setRequiredClearSubDep2Id( Buff.getRequiredClearSubDep2Id() );

		YCFBamClearSubDep3ByUNameIdxKey keyUNameIdx = schema.getFactoryClearSubDep3().newUNameIdxKey();
		keyUNameIdx.setRequiredClearSubDep2TenantId( Buff.getRequiredClearSubDep2TenantId() );
		keyUNameIdx.setRequiredClearSubDep2Id( Buff.getRequiredClearSubDep2Id() );
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"ClearSubDep3UNameIdx",
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
				if( null == schema.getTableClearSubDep2().readDerivedByIdIdx( Authorization,
						Buff.getRequiredClearSubDep2TenantId(),
						Buff.getRequiredClearSubDep2Id() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"ClearSubDep2",
						"ClearSubDep2",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamClearSubDep3Buff > subdictClearSubDep2Idx;
		if( dictByClearSubDep2Idx.containsKey( keyClearSubDep2Idx ) ) {
			subdictClearSubDep2Idx = dictByClearSubDep2Idx.get( keyClearSubDep2Idx );
		}
		else {
			subdictClearSubDep2Idx = new HashMap< YCFBamScopePKey, YCFBamClearSubDep3Buff >();
			dictByClearSubDep2Idx.put( keyClearSubDep2Idx, subdictClearSubDep2Idx );
		}
		subdictClearSubDep2Idx.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

	}

	public YCFBamClearSubDep3Buff readDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamClearSubDep3.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamClearSubDep3Buff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamClearSubDep3Buff lockDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamClearSubDep3.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamClearSubDep3Buff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamClearSubDep3Buff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamClearSubDep3.readAllDerived";
		YCFBamClearSubDep3Buff[] retList = new YCFBamClearSubDep3Buff[ dictByPKey.values().size() ];
		Iterator< YCFBamClearSubDep3Buff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamClearSubDep3Buff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamClearSubDep3Buff> filteredList = new ArrayList<YCFBamClearSubDep3Buff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamClearSubDep3Buff ) ) {
					filteredList.add( (YCFBamClearSubDep3Buff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamClearSubDep3Buff[0] ) );
		}
	}

	public YCFBamClearSubDep3Buff[] readDerivedByClearDepIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamClearSubDep3Buff> filteredList = new ArrayList<YCFBamClearSubDep3Buff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamClearSubDep3Buff ) ) {
					filteredList.add( (YCFBamClearSubDep3Buff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamClearSubDep3Buff[0] ) );
		}
	}

	public YCFBamClearSubDep3Buff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamClearSubDep3Buff> filteredList = new ArrayList<YCFBamClearSubDep3Buff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamClearSubDep3Buff ) ) {
					filteredList.add( (YCFBamClearSubDep3Buff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamClearSubDep3Buff[0] ) );
		}
	}

	public YCFBamClearSubDep3Buff[] readDerivedByClearSubDep2Idx( YCFSecAuthorization Authorization,
		long ClearSubDep2TenantId,
		long ClearSubDep2Id )
	{
		final String S_ProcName = "YCFBamRamClearSubDep3.readDerivedByClearSubDep2Idx";
		YCFBamClearSubDep3ByClearSubDep2IdxKey key = schema.getFactoryClearSubDep3().newClearSubDep2IdxKey();
		key.setRequiredClearSubDep2TenantId( ClearSubDep2TenantId );
		key.setRequiredClearSubDep2Id( ClearSubDep2Id );

		YCFBamClearSubDep3Buff[] recArray;
		if( dictByClearSubDep2Idx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamClearSubDep3Buff > subdictClearSubDep2Idx
				= dictByClearSubDep2Idx.get( key );
			recArray = new YCFBamClearSubDep3Buff[ subdictClearSubDep2Idx.size() ];
			Iterator< YCFBamClearSubDep3Buff > iter = subdictClearSubDep2Idx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamClearSubDep3Buff > subdictClearSubDep2Idx
				= new HashMap< YCFBamScopePKey, YCFBamClearSubDep3Buff >();
			dictByClearSubDep2Idx.put( key, subdictClearSubDep2Idx );
			recArray = new YCFBamClearSubDep3Buff[0];
		}
		return( recArray );
	}

	public YCFBamClearSubDep3Buff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long ClearSubDep2TenantId,
		long ClearSubDep2Id,
		String Name )
	{
		final String S_ProcName = "YCFBamRamClearSubDep3.readDerivedByUNameIdx";
		YCFBamClearSubDep3ByUNameIdxKey key = schema.getFactoryClearSubDep3().newUNameIdxKey();
		key.setRequiredClearSubDep2TenantId( ClearSubDep2TenantId );
		key.setRequiredClearSubDep2Id( ClearSubDep2Id );
		key.setRequiredName( Name );

		YCFBamClearSubDep3Buff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamClearSubDep3Buff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readDerivedByIdIdx() ";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamClearSubDep3Buff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamClearSubDep3Buff readBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamClearSubDep3.readBuff";
		YCFBamClearSubDep3Buff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a816" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamClearSubDep3Buff lockBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamClearSubDep3Buff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a816" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamClearSubDep3Buff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamClearSubDep3.readAllBuff";
		YCFBamClearSubDep3Buff buff;
		ArrayList<YCFBamClearSubDep3Buff> filteredList = new ArrayList<YCFBamClearSubDep3Buff>();
		YCFBamClearSubDep3Buff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a816" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamClearSubDep3Buff[0] ) );
	}

	public YCFBamClearSubDep3Buff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByIdIdx() ";
		YCFBamClearSubDep3Buff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
			return( (YCFBamClearSubDep3Buff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamClearSubDep3Buff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByTenantIdx() ";
		YCFBamClearSubDep3Buff buff;
		ArrayList<YCFBamClearSubDep3Buff> filteredList = new ArrayList<YCFBamClearSubDep3Buff>();
		YCFBamClearSubDep3Buff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
				filteredList.add( (YCFBamClearSubDep3Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamClearSubDep3Buff[0] ) );
	}

	public YCFBamClearSubDep3Buff[] readBuffByClearDepIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long RelationId )
	{
		final String S_ProcName = "YCFBamRamClearDep.readBuffByClearDepIdx() ";
		YCFBamClearSubDep3Buff buff;
		ArrayList<YCFBamClearSubDep3Buff> filteredList = new ArrayList<YCFBamClearSubDep3Buff>();
		YCFBamClearSubDep3Buff[] buffList = readDerivedByClearDepIdx( Authorization,
			TenantId,
			RelationId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a813" ) ) {
				filteredList.add( (YCFBamClearSubDep3Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamClearSubDep3Buff[0] ) );
	}

	public YCFBamClearSubDep3Buff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamClearDep.readBuffByDefSchemaIdx() ";
		YCFBamClearSubDep3Buff buff;
		ArrayList<YCFBamClearSubDep3Buff> filteredList = new ArrayList<YCFBamClearSubDep3Buff>();
		YCFBamClearSubDep3Buff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a813" ) ) {
				filteredList.add( (YCFBamClearSubDep3Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamClearSubDep3Buff[0] ) );
	}

	public YCFBamClearSubDep3Buff[] readBuffByClearSubDep2Idx( YCFSecAuthorization Authorization,
		long ClearSubDep2TenantId,
		long ClearSubDep2Id )
	{
		final String S_ProcName = "YCFBamRamClearSubDep3.readBuffByClearSubDep2Idx() ";
		YCFBamClearSubDep3Buff buff;
		ArrayList<YCFBamClearSubDep3Buff> filteredList = new ArrayList<YCFBamClearSubDep3Buff>();
		YCFBamClearSubDep3Buff[] buffList = readDerivedByClearSubDep2Idx( Authorization,
			ClearSubDep2TenantId,
			ClearSubDep2Id );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a816" ) ) {
				filteredList.add( (YCFBamClearSubDep3Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamClearSubDep3Buff[0] ) );
	}

	public YCFBamClearSubDep3Buff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long ClearSubDep2TenantId,
		long ClearSubDep2Id,
		String Name )
	{
		final String S_ProcName = "YCFBamRamClearSubDep3.readBuffByUNameIdx() ";
		YCFBamClearSubDep3Buff buff = readDerivedByUNameIdx( Authorization,
			ClearSubDep2TenantId,
			ClearSubDep2Id,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a816" ) ) {
			return( (YCFBamClearSubDep3Buff)buff );
		}
		else {
			return( null );
		}
	}

	/**
	 *	Read a page array of the specific ClearSubDep3 buffer instances identified by the duplicate key ClearDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamClearSubDep3Buff[] pageBuffByClearDepIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long RelationId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByClearDepIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific ClearSubDep3 buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamClearSubDep3Buff[] pageBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByDefSchemaIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific ClearSubDep3 buffer instances identified by the duplicate key ClearSubDep2Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClearSubDep2TenantId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argClearSubDep2Id	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamClearSubDep3Buff[] pageBuffByClearSubDep2Idx( YCFSecAuthorization Authorization,
		long ClearSubDep2TenantId,
		long ClearSubDep2Id,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByClearSubDep2Idx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateClearSubDep3( YCFSecAuthorization Authorization,
		YCFBamClearSubDep3Buff Buff )
	{
		schema.getTableClearDep().updateClearDep( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamClearSubDep3Buff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateClearSubDep3",
				"Existing record not found",
				"ClearSubDep3",
				pkey );
		}
		YCFBamClearSubDep3ByClearSubDep2IdxKey existingKeyClearSubDep2Idx = schema.getFactoryClearSubDep3().newClearSubDep2IdxKey();
		existingKeyClearSubDep2Idx.setRequiredClearSubDep2TenantId( existing.getRequiredClearSubDep2TenantId() );
		existingKeyClearSubDep2Idx.setRequiredClearSubDep2Id( existing.getRequiredClearSubDep2Id() );

		YCFBamClearSubDep3ByClearSubDep2IdxKey newKeyClearSubDep2Idx = schema.getFactoryClearSubDep3().newClearSubDep2IdxKey();
		newKeyClearSubDep2Idx.setRequiredClearSubDep2TenantId( Buff.getRequiredClearSubDep2TenantId() );
		newKeyClearSubDep2Idx.setRequiredClearSubDep2Id( Buff.getRequiredClearSubDep2Id() );

		YCFBamClearSubDep3ByUNameIdxKey existingKeyUNameIdx = schema.getFactoryClearSubDep3().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredClearSubDep2TenantId( existing.getRequiredClearSubDep2TenantId() );
		existingKeyUNameIdx.setRequiredClearSubDep2Id( existing.getRequiredClearSubDep2Id() );
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamClearSubDep3ByUNameIdxKey newKeyUNameIdx = schema.getFactoryClearSubDep3().newUNameIdxKey();
		newKeyUNameIdx.setRequiredClearSubDep2TenantId( Buff.getRequiredClearSubDep2TenantId() );
		newKeyUNameIdx.setRequiredClearSubDep2Id( Buff.getRequiredClearSubDep2Id() );
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateClearSubDep3",
					"ClearSubDep3UNameIdx",
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
						"updateClearSubDep3",
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
				if( null == schema.getTableClearSubDep2().readDerivedByIdIdx( Authorization,
						Buff.getRequiredClearSubDep2TenantId(),
						Buff.getRequiredClearSubDep2Id() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateClearSubDep3",
						"Container",
						"ClearSubDep2",
						"ClearSubDep2",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamScopePKey, YCFBamClearSubDep3Buff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByClearSubDep2Idx.get( existingKeyClearSubDep2Idx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByClearSubDep2Idx.containsKey( newKeyClearSubDep2Idx ) ) {
			subdict = dictByClearSubDep2Idx.get( newKeyClearSubDep2Idx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamClearSubDep3Buff >();
			dictByClearSubDep2Idx.put( newKeyClearSubDep2Idx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

	}

	public void deleteClearSubDep3( YCFSecAuthorization Authorization,
		YCFBamClearSubDep3Buff Buff )
	{
		final String S_ProcName = "YCFBamRamClearSubDep3Table.deleteClearSubDep3() ";
		String classCode;
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamClearSubDep3Buff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteClearSubDep3",
				pkey );
		}
		YCFBamClearSubDep3ByClearSubDep2IdxKey keyClearSubDep2Idx = schema.getFactoryClearSubDep3().newClearSubDep2IdxKey();
		keyClearSubDep2Idx.setRequiredClearSubDep2TenantId( existing.getRequiredClearSubDep2TenantId() );
		keyClearSubDep2Idx.setRequiredClearSubDep2Id( existing.getRequiredClearSubDep2Id() );

		YCFBamClearSubDep3ByUNameIdxKey keyUNameIdx = schema.getFactoryClearSubDep3().newUNameIdxKey();
		keyUNameIdx.setRequiredClearSubDep2TenantId( existing.getRequiredClearSubDep2TenantId() );
		keyUNameIdx.setRequiredClearSubDep2Id( existing.getRequiredClearSubDep2Id() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFBamScopePKey, YCFBamClearSubDep3Buff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByClearSubDep2Idx.get( keyClearSubDep2Idx );
		subdict.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

		schema.getTableClearDep().deleteClearDep( Authorization,
			Buff );
	}
	public void deleteClearSubDep3ByClearSubDep2Idx( YCFSecAuthorization Authorization,
		long argClearSubDep2TenantId,
		long argClearSubDep2Id )
	{
		YCFBamClearSubDep3ByClearSubDep2IdxKey key = schema.getFactoryClearSubDep3().newClearSubDep2IdxKey();
		key.setRequiredClearSubDep2TenantId( argClearSubDep2TenantId );
		key.setRequiredClearSubDep2Id( argClearSubDep2Id );
		deleteClearSubDep3ByClearSubDep2Idx( Authorization, key );
	}

	public void deleteClearSubDep3ByClearSubDep2Idx( YCFSecAuthorization Authorization,
		YCFBamClearSubDep3ByClearSubDep2IdxKey argKey )
	{
		YCFBamClearSubDep3Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamClearSubDep3Buff> matchSet = new LinkedList<YCFBamClearSubDep3Buff>();
		Iterator<YCFBamClearSubDep3Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamClearSubDep3Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableClearSubDep3().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteClearSubDep3( Authorization, cur );
		}
	}

	public void deleteClearSubDep3ByUNameIdx( YCFSecAuthorization Authorization,
		long argClearSubDep2TenantId,
		long argClearSubDep2Id,
		String argName )
	{
		YCFBamClearSubDep3ByUNameIdxKey key = schema.getFactoryClearSubDep3().newUNameIdxKey();
		key.setRequiredClearSubDep2TenantId( argClearSubDep2TenantId );
		key.setRequiredClearSubDep2Id( argClearSubDep2Id );
		key.setRequiredName( argName );
		deleteClearSubDep3ByUNameIdx( Authorization, key );
	}

	public void deleteClearSubDep3ByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamClearSubDep3ByUNameIdxKey argKey )
	{
		YCFBamClearSubDep3Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamClearSubDep3Buff> matchSet = new LinkedList<YCFBamClearSubDep3Buff>();
		Iterator<YCFBamClearSubDep3Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamClearSubDep3Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableClearSubDep3().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteClearSubDep3( Authorization, cur );
		}
	}

	public void deleteClearSubDep3ByClearDepIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argRelationId )
	{
		YCFBamClearDepByClearDepIdxKey key = schema.getFactoryClearDep().newClearDepIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredRelationId( argRelationId );
		deleteClearSubDep3ByClearDepIdx( Authorization, key );
	}

	public void deleteClearSubDep3ByClearDepIdx( YCFSecAuthorization Authorization,
		YCFBamClearDepByClearDepIdxKey argKey )
	{
		YCFBamClearSubDep3Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamClearSubDep3Buff> matchSet = new LinkedList<YCFBamClearSubDep3Buff>();
		Iterator<YCFBamClearSubDep3Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamClearSubDep3Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableClearSubDep3().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteClearSubDep3( Authorization, cur );
		}
	}

	public void deleteClearSubDep3ByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamClearDepByDefSchemaIdxKey key = schema.getFactoryClearDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deleteClearSubDep3ByDefSchemaIdx( Authorization, key );
	}

	public void deleteClearSubDep3ByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamClearDepByDefSchemaIdxKey argKey )
	{
		YCFBamClearSubDep3Buff cur;
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
		LinkedList<YCFBamClearSubDep3Buff> matchSet = new LinkedList<YCFBamClearSubDep3Buff>();
		Iterator<YCFBamClearSubDep3Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamClearSubDep3Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableClearSubDep3().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteClearSubDep3( Authorization, cur );
		}
	}

	public void deleteClearSubDep3ByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteClearSubDep3ByIdIdx( Authorization, key );
	}

	public void deleteClearSubDep3ByIdIdx( YCFSecAuthorization Authorization,
		YCFBamScopePKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamClearSubDep3Buff cur;
		LinkedList<YCFBamClearSubDep3Buff> matchSet = new LinkedList<YCFBamClearSubDep3Buff>();
		Iterator<YCFBamClearSubDep3Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamClearSubDep3Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableClearSubDep3().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteClearSubDep3( Authorization, cur );
		}
	}

	public void deleteClearSubDep3ByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamScopeByTenantIdxKey key = schema.getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteClearSubDep3ByTenantIdx( Authorization, key );
	}

	public void deleteClearSubDep3ByTenantIdx( YCFSecAuthorization Authorization,
		YCFBamScopeByTenantIdxKey argKey )
	{
		YCFBamClearSubDep3Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamClearSubDep3Buff> matchSet = new LinkedList<YCFBamClearSubDep3Buff>();
		Iterator<YCFBamClearSubDep3Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamClearSubDep3Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableClearSubDep3().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteClearSubDep3( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
