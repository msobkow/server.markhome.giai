
// Description: Java 11 in-memory RAM DbIO implementation for ClearSubDep1.

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
 *	YCFBamRamClearSubDep1Table in-memory RAM DbIO implementation
 *	for ClearSubDep1.
 */
public class YCFBamRamClearSubDep1Table
	implements IYCFBamClearSubDep1Table
{
	private IYCFBamSchema schema;
	private Map< YCFBamScopePKey,
				YCFBamClearSubDep1Buff > dictByPKey
		= new HashMap< YCFBamScopePKey,
				YCFBamClearSubDep1Buff >();
	private Map< YCFBamClearSubDep1ByClearTopDepIdxKey,
				Map< YCFBamScopePKey,
					YCFBamClearSubDep1Buff >> dictByClearTopDepIdx
		= new HashMap< YCFBamClearSubDep1ByClearTopDepIdxKey,
				Map< YCFBamScopePKey,
					YCFBamClearSubDep1Buff >>();
	private Map< YCFBamClearSubDep1ByUNameIdxKey,
			YCFBamClearSubDep1Buff > dictByUNameIdx
		= new HashMap< YCFBamClearSubDep1ByUNameIdxKey,
			YCFBamClearSubDep1Buff >();

	public YCFBamRamClearSubDep1Table( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createClearSubDep1( YCFSecAuthorization Authorization,
		YCFBamClearSubDep1Buff Buff )
	{
		final String S_ProcName = "createClearSubDep1";
		schema.getTableClearDep().createClearDep( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamClearSubDep1ByClearTopDepIdxKey keyClearTopDepIdx = schema.getFactoryClearSubDep1().newClearTopDepIdxKey();
		keyClearTopDepIdx.setRequiredClearTopDepTenantId( Buff.getRequiredClearTopDepTenantId() );
		keyClearTopDepIdx.setRequiredClearTopDepId( Buff.getRequiredClearTopDepId() );

		YCFBamClearSubDep1ByUNameIdxKey keyUNameIdx = schema.getFactoryClearSubDep1().newUNameIdxKey();
		keyUNameIdx.setRequiredClearTopDepTenantId( Buff.getRequiredClearTopDepTenantId() );
		keyUNameIdx.setRequiredClearTopDepId( Buff.getRequiredClearTopDepId() );
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"ClearSubDep1UNameIdx",
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
				if( null == schema.getTableClearTopDep().readDerivedByIdIdx( Authorization,
						Buff.getRequiredClearTopDepTenantId(),
						Buff.getRequiredClearTopDepId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"ClearTopDep",
						"ClearTopDep",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamClearSubDep1Buff > subdictClearTopDepIdx;
		if( dictByClearTopDepIdx.containsKey( keyClearTopDepIdx ) ) {
			subdictClearTopDepIdx = dictByClearTopDepIdx.get( keyClearTopDepIdx );
		}
		else {
			subdictClearTopDepIdx = new HashMap< YCFBamScopePKey, YCFBamClearSubDep1Buff >();
			dictByClearTopDepIdx.put( keyClearTopDepIdx, subdictClearTopDepIdx );
		}
		subdictClearTopDepIdx.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

	}

	public YCFBamClearSubDep1Buff readDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamClearSubDep1.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamClearSubDep1Buff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamClearSubDep1Buff lockDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamClearSubDep1.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamClearSubDep1Buff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamClearSubDep1Buff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamClearSubDep1.readAllDerived";
		YCFBamClearSubDep1Buff[] retList = new YCFBamClearSubDep1Buff[ dictByPKey.values().size() ];
		Iterator< YCFBamClearSubDep1Buff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamClearSubDep1Buff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamClearSubDep1Buff> filteredList = new ArrayList<YCFBamClearSubDep1Buff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamClearSubDep1Buff ) ) {
					filteredList.add( (YCFBamClearSubDep1Buff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamClearSubDep1Buff[0] ) );
		}
	}

	public YCFBamClearSubDep1Buff[] readDerivedByClearDepIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamClearSubDep1Buff> filteredList = new ArrayList<YCFBamClearSubDep1Buff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamClearSubDep1Buff ) ) {
					filteredList.add( (YCFBamClearSubDep1Buff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamClearSubDep1Buff[0] ) );
		}
	}

	public YCFBamClearSubDep1Buff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamClearSubDep1Buff> filteredList = new ArrayList<YCFBamClearSubDep1Buff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamClearSubDep1Buff ) ) {
					filteredList.add( (YCFBamClearSubDep1Buff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamClearSubDep1Buff[0] ) );
		}
	}

	public YCFBamClearSubDep1Buff[] readDerivedByClearTopDepIdx( YCFSecAuthorization Authorization,
		long ClearTopDepTenantId,
		long ClearTopDepId )
	{
		final String S_ProcName = "YCFBamRamClearSubDep1.readDerivedByClearTopDepIdx";
		YCFBamClearSubDep1ByClearTopDepIdxKey key = schema.getFactoryClearSubDep1().newClearTopDepIdxKey();
		key.setRequiredClearTopDepTenantId( ClearTopDepTenantId );
		key.setRequiredClearTopDepId( ClearTopDepId );

		YCFBamClearSubDep1Buff[] recArray;
		if( dictByClearTopDepIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamClearSubDep1Buff > subdictClearTopDepIdx
				= dictByClearTopDepIdx.get( key );
			recArray = new YCFBamClearSubDep1Buff[ subdictClearTopDepIdx.size() ];
			Iterator< YCFBamClearSubDep1Buff > iter = subdictClearTopDepIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamClearSubDep1Buff > subdictClearTopDepIdx
				= new HashMap< YCFBamScopePKey, YCFBamClearSubDep1Buff >();
			dictByClearTopDepIdx.put( key, subdictClearTopDepIdx );
			recArray = new YCFBamClearSubDep1Buff[0];
		}
		return( recArray );
	}

	public YCFBamClearSubDep1Buff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long ClearTopDepTenantId,
		long ClearTopDepId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamClearSubDep1.readDerivedByUNameIdx";
		YCFBamClearSubDep1ByUNameIdxKey key = schema.getFactoryClearSubDep1().newUNameIdxKey();
		key.setRequiredClearTopDepTenantId( ClearTopDepTenantId );
		key.setRequiredClearTopDepId( ClearTopDepId );
		key.setRequiredName( Name );

		YCFBamClearSubDep1Buff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamClearSubDep1Buff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readDerivedByIdIdx() ";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamClearSubDep1Buff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamClearSubDep1Buff readBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamClearSubDep1.readBuff";
		YCFBamClearSubDep1Buff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a814" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamClearSubDep1Buff lockBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamClearSubDep1Buff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a814" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamClearSubDep1Buff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamClearSubDep1.readAllBuff";
		YCFBamClearSubDep1Buff buff;
		ArrayList<YCFBamClearSubDep1Buff> filteredList = new ArrayList<YCFBamClearSubDep1Buff>();
		YCFBamClearSubDep1Buff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a814" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamClearSubDep1Buff[0] ) );
	}

	public YCFBamClearSubDep1Buff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByIdIdx() ";
		YCFBamClearSubDep1Buff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
			return( (YCFBamClearSubDep1Buff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamClearSubDep1Buff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByTenantIdx() ";
		YCFBamClearSubDep1Buff buff;
		ArrayList<YCFBamClearSubDep1Buff> filteredList = new ArrayList<YCFBamClearSubDep1Buff>();
		YCFBamClearSubDep1Buff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
				filteredList.add( (YCFBamClearSubDep1Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamClearSubDep1Buff[0] ) );
	}

	public YCFBamClearSubDep1Buff[] readBuffByClearDepIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long RelationId )
	{
		final String S_ProcName = "YCFBamRamClearDep.readBuffByClearDepIdx() ";
		YCFBamClearSubDep1Buff buff;
		ArrayList<YCFBamClearSubDep1Buff> filteredList = new ArrayList<YCFBamClearSubDep1Buff>();
		YCFBamClearSubDep1Buff[] buffList = readDerivedByClearDepIdx( Authorization,
			TenantId,
			RelationId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a813" ) ) {
				filteredList.add( (YCFBamClearSubDep1Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamClearSubDep1Buff[0] ) );
	}

	public YCFBamClearSubDep1Buff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamClearDep.readBuffByDefSchemaIdx() ";
		YCFBamClearSubDep1Buff buff;
		ArrayList<YCFBamClearSubDep1Buff> filteredList = new ArrayList<YCFBamClearSubDep1Buff>();
		YCFBamClearSubDep1Buff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a813" ) ) {
				filteredList.add( (YCFBamClearSubDep1Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamClearSubDep1Buff[0] ) );
	}

	public YCFBamClearSubDep1Buff[] readBuffByClearTopDepIdx( YCFSecAuthorization Authorization,
		long ClearTopDepTenantId,
		long ClearTopDepId )
	{
		final String S_ProcName = "YCFBamRamClearSubDep1.readBuffByClearTopDepIdx() ";
		YCFBamClearSubDep1Buff buff;
		ArrayList<YCFBamClearSubDep1Buff> filteredList = new ArrayList<YCFBamClearSubDep1Buff>();
		YCFBamClearSubDep1Buff[] buffList = readDerivedByClearTopDepIdx( Authorization,
			ClearTopDepTenantId,
			ClearTopDepId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a814" ) ) {
				filteredList.add( (YCFBamClearSubDep1Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamClearSubDep1Buff[0] ) );
	}

	public YCFBamClearSubDep1Buff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long ClearTopDepTenantId,
		long ClearTopDepId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamClearSubDep1.readBuffByUNameIdx() ";
		YCFBamClearSubDep1Buff buff = readDerivedByUNameIdx( Authorization,
			ClearTopDepTenantId,
			ClearTopDepId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a814" ) ) {
			return( (YCFBamClearSubDep1Buff)buff );
		}
		else {
			return( null );
		}
	}

	/**
	 *	Read a page array of the specific ClearSubDep1 buffer instances identified by the duplicate key ClearDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamClearSubDep1Buff[] pageBuffByClearDepIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long RelationId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByClearDepIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific ClearSubDep1 buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamClearSubDep1Buff[] pageBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByDefSchemaIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific ClearSubDep1 buffer instances identified by the duplicate key ClearTopDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClearTopDepTenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argClearTopDepId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamClearSubDep1Buff[] pageBuffByClearTopDepIdx( YCFSecAuthorization Authorization,
		long ClearTopDepTenantId,
		long ClearTopDepId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByClearTopDepIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateClearSubDep1( YCFSecAuthorization Authorization,
		YCFBamClearSubDep1Buff Buff )
	{
		schema.getTableClearDep().updateClearDep( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamClearSubDep1Buff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateClearSubDep1",
				"Existing record not found",
				"ClearSubDep1",
				pkey );
		}
		YCFBamClearSubDep1ByClearTopDepIdxKey existingKeyClearTopDepIdx = schema.getFactoryClearSubDep1().newClearTopDepIdxKey();
		existingKeyClearTopDepIdx.setRequiredClearTopDepTenantId( existing.getRequiredClearTopDepTenantId() );
		existingKeyClearTopDepIdx.setRequiredClearTopDepId( existing.getRequiredClearTopDepId() );

		YCFBamClearSubDep1ByClearTopDepIdxKey newKeyClearTopDepIdx = schema.getFactoryClearSubDep1().newClearTopDepIdxKey();
		newKeyClearTopDepIdx.setRequiredClearTopDepTenantId( Buff.getRequiredClearTopDepTenantId() );
		newKeyClearTopDepIdx.setRequiredClearTopDepId( Buff.getRequiredClearTopDepId() );

		YCFBamClearSubDep1ByUNameIdxKey existingKeyUNameIdx = schema.getFactoryClearSubDep1().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredClearTopDepTenantId( existing.getRequiredClearTopDepTenantId() );
		existingKeyUNameIdx.setRequiredClearTopDepId( existing.getRequiredClearTopDepId() );
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamClearSubDep1ByUNameIdxKey newKeyUNameIdx = schema.getFactoryClearSubDep1().newUNameIdxKey();
		newKeyUNameIdx.setRequiredClearTopDepTenantId( Buff.getRequiredClearTopDepTenantId() );
		newKeyUNameIdx.setRequiredClearTopDepId( Buff.getRequiredClearTopDepId() );
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateClearSubDep1",
					"ClearSubDep1UNameIdx",
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
						"updateClearSubDep1",
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
				if( null == schema.getTableClearTopDep().readDerivedByIdIdx( Authorization,
						Buff.getRequiredClearTopDepTenantId(),
						Buff.getRequiredClearTopDepId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateClearSubDep1",
						"Container",
						"ClearTopDep",
						"ClearTopDep",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamScopePKey, YCFBamClearSubDep1Buff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByClearTopDepIdx.get( existingKeyClearTopDepIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByClearTopDepIdx.containsKey( newKeyClearTopDepIdx ) ) {
			subdict = dictByClearTopDepIdx.get( newKeyClearTopDepIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamClearSubDep1Buff >();
			dictByClearTopDepIdx.put( newKeyClearTopDepIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

	}

	public void deleteClearSubDep1( YCFSecAuthorization Authorization,
		YCFBamClearSubDep1Buff Buff )
	{
		final String S_ProcName = "YCFBamRamClearSubDep1Table.deleteClearSubDep1() ";
		String classCode;
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamClearSubDep1Buff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteClearSubDep1",
				pkey );
		}
		// Short circuit self-referential code to prevent stack overflows
		Object arrCheckClearDep[] = schema.getTableClearSubDep2().readDerivedByClearSubDep1Idx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		if( arrCheckClearDep.length > 0 ) {
			schema.getTableClearSubDep2().deleteClearSubDep2ByClearSubDep1Idx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		}
		YCFBamClearSubDep1ByClearTopDepIdxKey keyClearTopDepIdx = schema.getFactoryClearSubDep1().newClearTopDepIdxKey();
		keyClearTopDepIdx.setRequiredClearTopDepTenantId( existing.getRequiredClearTopDepTenantId() );
		keyClearTopDepIdx.setRequiredClearTopDepId( existing.getRequiredClearTopDepId() );

		YCFBamClearSubDep1ByUNameIdxKey keyUNameIdx = schema.getFactoryClearSubDep1().newUNameIdxKey();
		keyUNameIdx.setRequiredClearTopDepTenantId( existing.getRequiredClearTopDepTenantId() );
		keyUNameIdx.setRequiredClearTopDepId( existing.getRequiredClearTopDepId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFBamScopePKey, YCFBamClearSubDep1Buff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByClearTopDepIdx.get( keyClearTopDepIdx );
		subdict.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

		schema.getTableClearDep().deleteClearDep( Authorization,
			Buff );
	}
	public void deleteClearSubDep1ByClearTopDepIdx( YCFSecAuthorization Authorization,
		long argClearTopDepTenantId,
		long argClearTopDepId )
	{
		YCFBamClearSubDep1ByClearTopDepIdxKey key = schema.getFactoryClearSubDep1().newClearTopDepIdxKey();
		key.setRequiredClearTopDepTenantId( argClearTopDepTenantId );
		key.setRequiredClearTopDepId( argClearTopDepId );
		deleteClearSubDep1ByClearTopDepIdx( Authorization, key );
	}

	public void deleteClearSubDep1ByClearTopDepIdx( YCFSecAuthorization Authorization,
		YCFBamClearSubDep1ByClearTopDepIdxKey argKey )
	{
		YCFBamClearSubDep1Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamClearSubDep1Buff> matchSet = new LinkedList<YCFBamClearSubDep1Buff>();
		Iterator<YCFBamClearSubDep1Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamClearSubDep1Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableClearSubDep1().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteClearSubDep1( Authorization, cur );
		}
	}

	public void deleteClearSubDep1ByUNameIdx( YCFSecAuthorization Authorization,
		long argClearTopDepTenantId,
		long argClearTopDepId,
		String argName )
	{
		YCFBamClearSubDep1ByUNameIdxKey key = schema.getFactoryClearSubDep1().newUNameIdxKey();
		key.setRequiredClearTopDepTenantId( argClearTopDepTenantId );
		key.setRequiredClearTopDepId( argClearTopDepId );
		key.setRequiredName( argName );
		deleteClearSubDep1ByUNameIdx( Authorization, key );
	}

	public void deleteClearSubDep1ByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamClearSubDep1ByUNameIdxKey argKey )
	{
		YCFBamClearSubDep1Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamClearSubDep1Buff> matchSet = new LinkedList<YCFBamClearSubDep1Buff>();
		Iterator<YCFBamClearSubDep1Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamClearSubDep1Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableClearSubDep1().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteClearSubDep1( Authorization, cur );
		}
	}

	public void deleteClearSubDep1ByClearDepIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argRelationId )
	{
		YCFBamClearDepByClearDepIdxKey key = schema.getFactoryClearDep().newClearDepIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredRelationId( argRelationId );
		deleteClearSubDep1ByClearDepIdx( Authorization, key );
	}

	public void deleteClearSubDep1ByClearDepIdx( YCFSecAuthorization Authorization,
		YCFBamClearDepByClearDepIdxKey argKey )
	{
		YCFBamClearSubDep1Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamClearSubDep1Buff> matchSet = new LinkedList<YCFBamClearSubDep1Buff>();
		Iterator<YCFBamClearSubDep1Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamClearSubDep1Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableClearSubDep1().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteClearSubDep1( Authorization, cur );
		}
	}

	public void deleteClearSubDep1ByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamClearDepByDefSchemaIdxKey key = schema.getFactoryClearDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deleteClearSubDep1ByDefSchemaIdx( Authorization, key );
	}

	public void deleteClearSubDep1ByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamClearDepByDefSchemaIdxKey argKey )
	{
		YCFBamClearSubDep1Buff cur;
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
		LinkedList<YCFBamClearSubDep1Buff> matchSet = new LinkedList<YCFBamClearSubDep1Buff>();
		Iterator<YCFBamClearSubDep1Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamClearSubDep1Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableClearSubDep1().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteClearSubDep1( Authorization, cur );
		}
	}

	public void deleteClearSubDep1ByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteClearSubDep1ByIdIdx( Authorization, key );
	}

	public void deleteClearSubDep1ByIdIdx( YCFSecAuthorization Authorization,
		YCFBamScopePKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamClearSubDep1Buff cur;
		LinkedList<YCFBamClearSubDep1Buff> matchSet = new LinkedList<YCFBamClearSubDep1Buff>();
		Iterator<YCFBamClearSubDep1Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamClearSubDep1Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableClearSubDep1().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteClearSubDep1( Authorization, cur );
		}
	}

	public void deleteClearSubDep1ByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamScopeByTenantIdxKey key = schema.getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteClearSubDep1ByTenantIdx( Authorization, key );
	}

	public void deleteClearSubDep1ByTenantIdx( YCFSecAuthorization Authorization,
		YCFBamScopeByTenantIdxKey argKey )
	{
		YCFBamClearSubDep1Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamClearSubDep1Buff> matchSet = new LinkedList<YCFBamClearSubDep1Buff>();
		Iterator<YCFBamClearSubDep1Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamClearSubDep1Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableClearSubDep1().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteClearSubDep1( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
