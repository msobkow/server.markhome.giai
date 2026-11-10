
// Description: Java 11 in-memory RAM DbIO implementation for PopSubDep1.

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
 *	YCFBamRamPopSubDep1Table in-memory RAM DbIO implementation
 *	for PopSubDep1.
 */
public class YCFBamRamPopSubDep1Table
	implements IYCFBamPopSubDep1Table
{
	private IYCFBamSchema schema;
	private Map< YCFBamScopePKey,
				YCFBamPopSubDep1Buff > dictByPKey
		= new HashMap< YCFBamScopePKey,
				YCFBamPopSubDep1Buff >();
	private Map< YCFBamPopSubDep1ByPopTopDepIdxKey,
				Map< YCFBamScopePKey,
					YCFBamPopSubDep1Buff >> dictByPopTopDepIdx
		= new HashMap< YCFBamPopSubDep1ByPopTopDepIdxKey,
				Map< YCFBamScopePKey,
					YCFBamPopSubDep1Buff >>();
	private Map< YCFBamPopSubDep1ByUNameIdxKey,
			YCFBamPopSubDep1Buff > dictByUNameIdx
		= new HashMap< YCFBamPopSubDep1ByUNameIdxKey,
			YCFBamPopSubDep1Buff >();

	public YCFBamRamPopSubDep1Table( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createPopSubDep1( YCFSecAuthorization Authorization,
		YCFBamPopSubDep1Buff Buff )
	{
		final String S_ProcName = "createPopSubDep1";
		schema.getTablePopDep().createPopDep( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamPopSubDep1ByPopTopDepIdxKey keyPopTopDepIdx = schema.getFactoryPopSubDep1().newPopTopDepIdxKey();
		keyPopTopDepIdx.setRequiredPopTopDepTenantId( Buff.getRequiredPopTopDepTenantId() );
		keyPopTopDepIdx.setRequiredPopTopDepId( Buff.getRequiredPopTopDepId() );

		YCFBamPopSubDep1ByUNameIdxKey keyUNameIdx = schema.getFactoryPopSubDep1().newUNameIdxKey();
		keyUNameIdx.setRequiredPopTopDepTenantId( Buff.getRequiredPopTopDepTenantId() );
		keyUNameIdx.setRequiredPopTopDepId( Buff.getRequiredPopTopDepId() );
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"PopSubDep1UNameIdx",
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
				if( null == schema.getTablePopTopDep().readDerivedByIdIdx( Authorization,
						Buff.getRequiredPopTopDepTenantId(),
						Buff.getRequiredPopTopDepId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"PopTopDep",
						"PopTopDep",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamPopSubDep1Buff > subdictPopTopDepIdx;
		if( dictByPopTopDepIdx.containsKey( keyPopTopDepIdx ) ) {
			subdictPopTopDepIdx = dictByPopTopDepIdx.get( keyPopTopDepIdx );
		}
		else {
			subdictPopTopDepIdx = new HashMap< YCFBamScopePKey, YCFBamPopSubDep1Buff >();
			dictByPopTopDepIdx.put( keyPopTopDepIdx, subdictPopTopDepIdx );
		}
		subdictPopTopDepIdx.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

	}

	public YCFBamPopSubDep1Buff readDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamPopSubDep1.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamPopSubDep1Buff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamPopSubDep1Buff lockDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamPopSubDep1.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamPopSubDep1Buff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamPopSubDep1Buff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamPopSubDep1.readAllDerived";
		YCFBamPopSubDep1Buff[] retList = new YCFBamPopSubDep1Buff[ dictByPKey.values().size() ];
		Iterator< YCFBamPopSubDep1Buff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamPopSubDep1Buff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamPopSubDep1Buff> filteredList = new ArrayList<YCFBamPopSubDep1Buff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamPopSubDep1Buff ) ) {
					filteredList.add( (YCFBamPopSubDep1Buff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamPopSubDep1Buff[0] ) );
		}
	}

	public YCFBamPopSubDep1Buff[] readDerivedByRelationIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamPopSubDep1Buff> filteredList = new ArrayList<YCFBamPopSubDep1Buff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamPopSubDep1Buff ) ) {
					filteredList.add( (YCFBamPopSubDep1Buff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamPopSubDep1Buff[0] ) );
		}
	}

	public YCFBamPopSubDep1Buff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamPopSubDep1Buff> filteredList = new ArrayList<YCFBamPopSubDep1Buff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamPopSubDep1Buff ) ) {
					filteredList.add( (YCFBamPopSubDep1Buff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamPopSubDep1Buff[0] ) );
		}
	}

	public YCFBamPopSubDep1Buff[] readDerivedByPopTopDepIdx( YCFSecAuthorization Authorization,
		long PopTopDepTenantId,
		long PopTopDepId )
	{
		final String S_ProcName = "YCFBamRamPopSubDep1.readDerivedByPopTopDepIdx";
		YCFBamPopSubDep1ByPopTopDepIdxKey key = schema.getFactoryPopSubDep1().newPopTopDepIdxKey();
		key.setRequiredPopTopDepTenantId( PopTopDepTenantId );
		key.setRequiredPopTopDepId( PopTopDepId );

		YCFBamPopSubDep1Buff[] recArray;
		if( dictByPopTopDepIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamPopSubDep1Buff > subdictPopTopDepIdx
				= dictByPopTopDepIdx.get( key );
			recArray = new YCFBamPopSubDep1Buff[ subdictPopTopDepIdx.size() ];
			Iterator< YCFBamPopSubDep1Buff > iter = subdictPopTopDepIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamPopSubDep1Buff > subdictPopTopDepIdx
				= new HashMap< YCFBamScopePKey, YCFBamPopSubDep1Buff >();
			dictByPopTopDepIdx.put( key, subdictPopTopDepIdx );
			recArray = new YCFBamPopSubDep1Buff[0];
		}
		return( recArray );
	}

	public YCFBamPopSubDep1Buff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long PopTopDepTenantId,
		long PopTopDepId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamPopSubDep1.readDerivedByUNameIdx";
		YCFBamPopSubDep1ByUNameIdxKey key = schema.getFactoryPopSubDep1().newUNameIdxKey();
		key.setRequiredPopTopDepTenantId( PopTopDepTenantId );
		key.setRequiredPopTopDepId( PopTopDepId );
		key.setRequiredName( Name );

		YCFBamPopSubDep1Buff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamPopSubDep1Buff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readDerivedByIdIdx() ";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamPopSubDep1Buff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamPopSubDep1Buff readBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamPopSubDep1.readBuff";
		YCFBamPopSubDep1Buff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a834" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamPopSubDep1Buff lockBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamPopSubDep1Buff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a834" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamPopSubDep1Buff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamPopSubDep1.readAllBuff";
		YCFBamPopSubDep1Buff buff;
		ArrayList<YCFBamPopSubDep1Buff> filteredList = new ArrayList<YCFBamPopSubDep1Buff>();
		YCFBamPopSubDep1Buff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a834" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamPopSubDep1Buff[0] ) );
	}

	public YCFBamPopSubDep1Buff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByIdIdx() ";
		YCFBamPopSubDep1Buff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
			return( (YCFBamPopSubDep1Buff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamPopSubDep1Buff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByTenantIdx() ";
		YCFBamPopSubDep1Buff buff;
		ArrayList<YCFBamPopSubDep1Buff> filteredList = new ArrayList<YCFBamPopSubDep1Buff>();
		YCFBamPopSubDep1Buff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
				filteredList.add( (YCFBamPopSubDep1Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamPopSubDep1Buff[0] ) );
	}

	public YCFBamPopSubDep1Buff[] readBuffByRelationIdx( YCFSecAuthorization Authorization,
		long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "YCFBamRamPopDep.readBuffByRelationIdx() ";
		YCFBamPopSubDep1Buff buff;
		ArrayList<YCFBamPopSubDep1Buff> filteredList = new ArrayList<YCFBamPopSubDep1Buff>();
		YCFBamPopSubDep1Buff[] buffList = readDerivedByRelationIdx( Authorization,
			RelationTenantId,
			RelationId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a833" ) ) {
				filteredList.add( (YCFBamPopSubDep1Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamPopSubDep1Buff[0] ) );
	}

	public YCFBamPopSubDep1Buff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamPopDep.readBuffByDefSchemaIdx() ";
		YCFBamPopSubDep1Buff buff;
		ArrayList<YCFBamPopSubDep1Buff> filteredList = new ArrayList<YCFBamPopSubDep1Buff>();
		YCFBamPopSubDep1Buff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a833" ) ) {
				filteredList.add( (YCFBamPopSubDep1Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamPopSubDep1Buff[0] ) );
	}

	public YCFBamPopSubDep1Buff[] readBuffByPopTopDepIdx( YCFSecAuthorization Authorization,
		long PopTopDepTenantId,
		long PopTopDepId )
	{
		final String S_ProcName = "YCFBamRamPopSubDep1.readBuffByPopTopDepIdx() ";
		YCFBamPopSubDep1Buff buff;
		ArrayList<YCFBamPopSubDep1Buff> filteredList = new ArrayList<YCFBamPopSubDep1Buff>();
		YCFBamPopSubDep1Buff[] buffList = readDerivedByPopTopDepIdx( Authorization,
			PopTopDepTenantId,
			PopTopDepId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a834" ) ) {
				filteredList.add( (YCFBamPopSubDep1Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamPopSubDep1Buff[0] ) );
	}

	public YCFBamPopSubDep1Buff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long PopTopDepTenantId,
		long PopTopDepId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamPopSubDep1.readBuffByUNameIdx() ";
		YCFBamPopSubDep1Buff buff = readDerivedByUNameIdx( Authorization,
			PopTopDepTenantId,
			PopTopDepId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a834" ) ) {
			return( (YCFBamPopSubDep1Buff)buff );
		}
		else {
			return( null );
		}
	}

	/**
	 *	Read a page array of the specific PopSubDep1 buffer instances identified by the duplicate key RelationIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRelationTenantId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamPopSubDep1Buff[] pageBuffByRelationIdx( YCFSecAuthorization Authorization,
		long RelationTenantId,
		long RelationId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByRelationIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific PopSubDep1 buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamPopSubDep1Buff[] pageBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByDefSchemaIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific PopSubDep1 buffer instances identified by the duplicate key PopTopDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPopTopDepTenantId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argPopTopDepId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamPopSubDep1Buff[] pageBuffByPopTopDepIdx( YCFSecAuthorization Authorization,
		long PopTopDepTenantId,
		long PopTopDepId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByPopTopDepIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updatePopSubDep1( YCFSecAuthorization Authorization,
		YCFBamPopSubDep1Buff Buff )
	{
		schema.getTablePopDep().updatePopDep( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamPopSubDep1Buff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updatePopSubDep1",
				"Existing record not found",
				"PopSubDep1",
				pkey );
		}
		YCFBamPopSubDep1ByPopTopDepIdxKey existingKeyPopTopDepIdx = schema.getFactoryPopSubDep1().newPopTopDepIdxKey();
		existingKeyPopTopDepIdx.setRequiredPopTopDepTenantId( existing.getRequiredPopTopDepTenantId() );
		existingKeyPopTopDepIdx.setRequiredPopTopDepId( existing.getRequiredPopTopDepId() );

		YCFBamPopSubDep1ByPopTopDepIdxKey newKeyPopTopDepIdx = schema.getFactoryPopSubDep1().newPopTopDepIdxKey();
		newKeyPopTopDepIdx.setRequiredPopTopDepTenantId( Buff.getRequiredPopTopDepTenantId() );
		newKeyPopTopDepIdx.setRequiredPopTopDepId( Buff.getRequiredPopTopDepId() );

		YCFBamPopSubDep1ByUNameIdxKey existingKeyUNameIdx = schema.getFactoryPopSubDep1().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredPopTopDepTenantId( existing.getRequiredPopTopDepTenantId() );
		existingKeyUNameIdx.setRequiredPopTopDepId( existing.getRequiredPopTopDepId() );
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamPopSubDep1ByUNameIdxKey newKeyUNameIdx = schema.getFactoryPopSubDep1().newUNameIdxKey();
		newKeyUNameIdx.setRequiredPopTopDepTenantId( Buff.getRequiredPopTopDepTenantId() );
		newKeyUNameIdx.setRequiredPopTopDepId( Buff.getRequiredPopTopDepId() );
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updatePopSubDep1",
					"PopSubDep1UNameIdx",
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
						"updatePopSubDep1",
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
				if( null == schema.getTablePopTopDep().readDerivedByIdIdx( Authorization,
						Buff.getRequiredPopTopDepTenantId(),
						Buff.getRequiredPopTopDepId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updatePopSubDep1",
						"Container",
						"PopTopDep",
						"PopTopDep",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamScopePKey, YCFBamPopSubDep1Buff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByPopTopDepIdx.get( existingKeyPopTopDepIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByPopTopDepIdx.containsKey( newKeyPopTopDepIdx ) ) {
			subdict = dictByPopTopDepIdx.get( newKeyPopTopDepIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamPopSubDep1Buff >();
			dictByPopTopDepIdx.put( newKeyPopTopDepIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

	}

	public void deletePopSubDep1( YCFSecAuthorization Authorization,
		YCFBamPopSubDep1Buff Buff )
	{
		final String S_ProcName = "YCFBamRamPopSubDep1Table.deletePopSubDep1() ";
		String classCode;
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamPopSubDep1Buff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deletePopSubDep1",
				pkey );
		}
		// Short circuit self-referential code to prevent stack overflows
		Object arrCheckPopDep[] = schema.getTablePopSubDep2().readDerivedByPopSubDep1Idx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		if( arrCheckPopDep.length > 0 ) {
			schema.getTablePopSubDep2().deletePopSubDep2ByPopSubDep1Idx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		}
		YCFBamPopSubDep1ByPopTopDepIdxKey keyPopTopDepIdx = schema.getFactoryPopSubDep1().newPopTopDepIdxKey();
		keyPopTopDepIdx.setRequiredPopTopDepTenantId( existing.getRequiredPopTopDepTenantId() );
		keyPopTopDepIdx.setRequiredPopTopDepId( existing.getRequiredPopTopDepId() );

		YCFBamPopSubDep1ByUNameIdxKey keyUNameIdx = schema.getFactoryPopSubDep1().newUNameIdxKey();
		keyUNameIdx.setRequiredPopTopDepTenantId( existing.getRequiredPopTopDepTenantId() );
		keyUNameIdx.setRequiredPopTopDepId( existing.getRequiredPopTopDepId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFBamScopePKey, YCFBamPopSubDep1Buff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByPopTopDepIdx.get( keyPopTopDepIdx );
		subdict.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

		schema.getTablePopDep().deletePopDep( Authorization,
			Buff );
	}
	public void deletePopSubDep1ByPopTopDepIdx( YCFSecAuthorization Authorization,
		long argPopTopDepTenantId,
		long argPopTopDepId )
	{
		YCFBamPopSubDep1ByPopTopDepIdxKey key = schema.getFactoryPopSubDep1().newPopTopDepIdxKey();
		key.setRequiredPopTopDepTenantId( argPopTopDepTenantId );
		key.setRequiredPopTopDepId( argPopTopDepId );
		deletePopSubDep1ByPopTopDepIdx( Authorization, key );
	}

	public void deletePopSubDep1ByPopTopDepIdx( YCFSecAuthorization Authorization,
		YCFBamPopSubDep1ByPopTopDepIdxKey argKey )
	{
		YCFBamPopSubDep1Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamPopSubDep1Buff> matchSet = new LinkedList<YCFBamPopSubDep1Buff>();
		Iterator<YCFBamPopSubDep1Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamPopSubDep1Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTablePopSubDep1().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deletePopSubDep1( Authorization, cur );
		}
	}

	public void deletePopSubDep1ByUNameIdx( YCFSecAuthorization Authorization,
		long argPopTopDepTenantId,
		long argPopTopDepId,
		String argName )
	{
		YCFBamPopSubDep1ByUNameIdxKey key = schema.getFactoryPopSubDep1().newUNameIdxKey();
		key.setRequiredPopTopDepTenantId( argPopTopDepTenantId );
		key.setRequiredPopTopDepId( argPopTopDepId );
		key.setRequiredName( argName );
		deletePopSubDep1ByUNameIdx( Authorization, key );
	}

	public void deletePopSubDep1ByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamPopSubDep1ByUNameIdxKey argKey )
	{
		YCFBamPopSubDep1Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamPopSubDep1Buff> matchSet = new LinkedList<YCFBamPopSubDep1Buff>();
		Iterator<YCFBamPopSubDep1Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamPopSubDep1Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTablePopSubDep1().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deletePopSubDep1( Authorization, cur );
		}
	}

	public void deletePopSubDep1ByRelationIdx( YCFSecAuthorization Authorization,
		long argRelationTenantId,
		long argRelationId )
	{
		YCFBamPopDepByRelationIdxKey key = schema.getFactoryPopDep().newRelationIdxKey();
		key.setRequiredRelationTenantId( argRelationTenantId );
		key.setRequiredRelationId( argRelationId );
		deletePopSubDep1ByRelationIdx( Authorization, key );
	}

	public void deletePopSubDep1ByRelationIdx( YCFSecAuthorization Authorization,
		YCFBamPopDepByRelationIdxKey argKey )
	{
		YCFBamPopSubDep1Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamPopSubDep1Buff> matchSet = new LinkedList<YCFBamPopSubDep1Buff>();
		Iterator<YCFBamPopSubDep1Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamPopSubDep1Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTablePopSubDep1().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deletePopSubDep1( Authorization, cur );
		}
	}

	public void deletePopSubDep1ByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamPopDepByDefSchemaIdxKey key = schema.getFactoryPopDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deletePopSubDep1ByDefSchemaIdx( Authorization, key );
	}

	public void deletePopSubDep1ByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamPopDepByDefSchemaIdxKey argKey )
	{
		YCFBamPopSubDep1Buff cur;
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
		LinkedList<YCFBamPopSubDep1Buff> matchSet = new LinkedList<YCFBamPopSubDep1Buff>();
		Iterator<YCFBamPopSubDep1Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamPopSubDep1Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTablePopSubDep1().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deletePopSubDep1( Authorization, cur );
		}
	}

	public void deletePopSubDep1ByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deletePopSubDep1ByIdIdx( Authorization, key );
	}

	public void deletePopSubDep1ByIdIdx( YCFSecAuthorization Authorization,
		YCFBamScopePKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamPopSubDep1Buff cur;
		LinkedList<YCFBamPopSubDep1Buff> matchSet = new LinkedList<YCFBamPopSubDep1Buff>();
		Iterator<YCFBamPopSubDep1Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamPopSubDep1Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTablePopSubDep1().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deletePopSubDep1( Authorization, cur );
		}
	}

	public void deletePopSubDep1ByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamScopeByTenantIdxKey key = schema.getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deletePopSubDep1ByTenantIdx( Authorization, key );
	}

	public void deletePopSubDep1ByTenantIdx( YCFSecAuthorization Authorization,
		YCFBamScopeByTenantIdxKey argKey )
	{
		YCFBamPopSubDep1Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamPopSubDep1Buff> matchSet = new LinkedList<YCFBamPopSubDep1Buff>();
		Iterator<YCFBamPopSubDep1Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamPopSubDep1Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTablePopSubDep1().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deletePopSubDep1( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
