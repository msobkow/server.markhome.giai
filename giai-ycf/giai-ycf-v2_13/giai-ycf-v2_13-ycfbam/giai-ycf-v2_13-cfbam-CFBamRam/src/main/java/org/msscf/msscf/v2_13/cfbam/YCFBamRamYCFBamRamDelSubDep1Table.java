
// Description: Java 11 in-memory RAM DbIO implementation for DelSubDep1.

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
 *	YCFBamRamDelSubDep1Table in-memory RAM DbIO implementation
 *	for DelSubDep1.
 */
public class YCFBamRamDelSubDep1Table
	implements IYCFBamDelSubDep1Table
{
	private IYCFBamSchema schema;
	private Map< YCFBamScopePKey,
				YCFBamDelSubDep1Buff > dictByPKey
		= new HashMap< YCFBamScopePKey,
				YCFBamDelSubDep1Buff >();
	private Map< YCFBamDelSubDep1ByDelTopDepIdxKey,
				Map< YCFBamScopePKey,
					YCFBamDelSubDep1Buff >> dictByDelTopDepIdx
		= new HashMap< YCFBamDelSubDep1ByDelTopDepIdxKey,
				Map< YCFBamScopePKey,
					YCFBamDelSubDep1Buff >>();
	private Map< YCFBamDelSubDep1ByUNameIdxKey,
			YCFBamDelSubDep1Buff > dictByUNameIdx
		= new HashMap< YCFBamDelSubDep1ByUNameIdxKey,
			YCFBamDelSubDep1Buff >();

	public YCFBamRamDelSubDep1Table( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createDelSubDep1( YCFSecAuthorization Authorization,
		YCFBamDelSubDep1Buff Buff )
	{
		final String S_ProcName = "createDelSubDep1";
		schema.getTableDelDep().createDelDep( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamDelSubDep1ByDelTopDepIdxKey keyDelTopDepIdx = schema.getFactoryDelSubDep1().newDelTopDepIdxKey();
		keyDelTopDepIdx.setRequiredDelTopDepTenantId( Buff.getRequiredDelTopDepTenantId() );
		keyDelTopDepIdx.setRequiredDelTopDepId( Buff.getRequiredDelTopDepId() );

		YCFBamDelSubDep1ByUNameIdxKey keyUNameIdx = schema.getFactoryDelSubDep1().newUNameIdxKey();
		keyUNameIdx.setRequiredDelTopDepTenantId( Buff.getRequiredDelTopDepTenantId() );
		keyUNameIdx.setRequiredDelTopDepId( Buff.getRequiredDelTopDepId() );
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"DelSubDep1UNameIdx",
				keyUNameIdx );
		}

		// Validate foreign keys

		{
			boolean allNull = true;
			allNull = false;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableDelDep().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Superclass",
						"SuperClass",
						"DelDep",
						null );
				}
			}
		}

		{
			boolean allNull = true;
			allNull = false;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableDelTopDep().readDerivedByIdIdx( Authorization,
						Buff.getRequiredDelTopDepTenantId(),
						Buff.getRequiredDelTopDepId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"DelTopDep",
						"DelTopDep",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamDelSubDep1Buff > subdictDelTopDepIdx;
		if( dictByDelTopDepIdx.containsKey( keyDelTopDepIdx ) ) {
			subdictDelTopDepIdx = dictByDelTopDepIdx.get( keyDelTopDepIdx );
		}
		else {
			subdictDelTopDepIdx = new HashMap< YCFBamScopePKey, YCFBamDelSubDep1Buff >();
			dictByDelTopDepIdx.put( keyDelTopDepIdx, subdictDelTopDepIdx );
		}
		subdictDelTopDepIdx.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

	}

	public YCFBamDelSubDep1Buff readDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamDelSubDep1.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamDelSubDep1Buff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamDelSubDep1Buff lockDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamDelSubDep1.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamDelSubDep1Buff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamDelSubDep1Buff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamDelSubDep1.readAllDerived";
		YCFBamDelSubDep1Buff[] retList = new YCFBamDelSubDep1Buff[ dictByPKey.values().size() ];
		Iterator< YCFBamDelSubDep1Buff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamDelSubDep1Buff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamDelSubDep1Buff> filteredList = new ArrayList<YCFBamDelSubDep1Buff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamDelSubDep1Buff ) ) {
					filteredList.add( (YCFBamDelSubDep1Buff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamDelSubDep1Buff[0] ) );
		}
	}

	public YCFBamDelSubDep1Buff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamDelDep.readDerivedByDefSchemaIdx";
		YCFBamDelDepBuff buffList[] = schema.getTableDelDep().readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFBamDelDepBuff buff;
			ArrayList<YCFBamDelSubDep1Buff> filteredList = new ArrayList<YCFBamDelSubDep1Buff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamDelSubDep1Buff ) ) {
					filteredList.add( (YCFBamDelSubDep1Buff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamDelSubDep1Buff[0] ) );
		}
	}

	public YCFBamDelSubDep1Buff[] readDerivedByDelDepIdx( YCFSecAuthorization Authorization,
		long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "YCFBamRamDelDep.readDerivedByDelDepIdx";
		YCFBamDelDepBuff buffList[] = schema.getTableDelDep().readDerivedByDelDepIdx( Authorization,
			RelationTenantId,
			RelationId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFBamDelDepBuff buff;
			ArrayList<YCFBamDelSubDep1Buff> filteredList = new ArrayList<YCFBamDelSubDep1Buff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamDelSubDep1Buff ) ) {
					filteredList.add( (YCFBamDelSubDep1Buff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamDelSubDep1Buff[0] ) );
		}
	}

	public YCFBamDelSubDep1Buff[] readDerivedByDelTopDepIdx( YCFSecAuthorization Authorization,
		long DelTopDepTenantId,
		long DelTopDepId )
	{
		final String S_ProcName = "YCFBamRamDelSubDep1.readDerivedByDelTopDepIdx";
		YCFBamDelSubDep1ByDelTopDepIdxKey key = schema.getFactoryDelSubDep1().newDelTopDepIdxKey();
		key.setRequiredDelTopDepTenantId( DelTopDepTenantId );
		key.setRequiredDelTopDepId( DelTopDepId );

		YCFBamDelSubDep1Buff[] recArray;
		if( dictByDelTopDepIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamDelSubDep1Buff > subdictDelTopDepIdx
				= dictByDelTopDepIdx.get( key );
			recArray = new YCFBamDelSubDep1Buff[ subdictDelTopDepIdx.size() ];
			Iterator< YCFBamDelSubDep1Buff > iter = subdictDelTopDepIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamDelSubDep1Buff > subdictDelTopDepIdx
				= new HashMap< YCFBamScopePKey, YCFBamDelSubDep1Buff >();
			dictByDelTopDepIdx.put( key, subdictDelTopDepIdx );
			recArray = new YCFBamDelSubDep1Buff[0];
		}
		return( recArray );
	}

	public YCFBamDelSubDep1Buff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long DelTopDepTenantId,
		long DelTopDepId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamDelSubDep1.readDerivedByUNameIdx";
		YCFBamDelSubDep1ByUNameIdxKey key = schema.getFactoryDelSubDep1().newUNameIdxKey();
		key.setRequiredDelTopDepTenantId( DelTopDepTenantId );
		key.setRequiredDelTopDepId( DelTopDepId );
		key.setRequiredName( Name );

		YCFBamDelSubDep1Buff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamDelSubDep1Buff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readDerivedByIdIdx() ";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamDelSubDep1Buff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamDelSubDep1Buff readBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamDelSubDep1.readBuff";
		YCFBamDelSubDep1Buff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a81b" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamDelSubDep1Buff lockBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamDelSubDep1Buff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a81b" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamDelSubDep1Buff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamDelSubDep1.readAllBuff";
		YCFBamDelSubDep1Buff buff;
		ArrayList<YCFBamDelSubDep1Buff> filteredList = new ArrayList<YCFBamDelSubDep1Buff>();
		YCFBamDelSubDep1Buff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a81b" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamDelSubDep1Buff[0] ) );
	}

	public YCFBamDelSubDep1Buff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByIdIdx() ";
		YCFBamDelSubDep1Buff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
			return( (YCFBamDelSubDep1Buff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamDelSubDep1Buff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByTenantIdx() ";
		YCFBamDelSubDep1Buff buff;
		ArrayList<YCFBamDelSubDep1Buff> filteredList = new ArrayList<YCFBamDelSubDep1Buff>();
		YCFBamDelSubDep1Buff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
				filteredList.add( (YCFBamDelSubDep1Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamDelSubDep1Buff[0] ) );
	}

	public YCFBamDelSubDep1Buff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamDelDep.readBuffByDefSchemaIdx() ";
		YCFBamDelSubDep1Buff buff;
		ArrayList<YCFBamDelSubDep1Buff> filteredList = new ArrayList<YCFBamDelSubDep1Buff>();
		YCFBamDelSubDep1Buff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a81a" ) ) {
				filteredList.add( (YCFBamDelSubDep1Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamDelSubDep1Buff[0] ) );
	}

	public YCFBamDelSubDep1Buff[] readBuffByDelDepIdx( YCFSecAuthorization Authorization,
		long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "YCFBamRamDelDep.readBuffByDelDepIdx() ";
		YCFBamDelSubDep1Buff buff;
		ArrayList<YCFBamDelSubDep1Buff> filteredList = new ArrayList<YCFBamDelSubDep1Buff>();
		YCFBamDelSubDep1Buff[] buffList = readDerivedByDelDepIdx( Authorization,
			RelationTenantId,
			RelationId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a81a" ) ) {
				filteredList.add( (YCFBamDelSubDep1Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamDelSubDep1Buff[0] ) );
	}

	public YCFBamDelSubDep1Buff[] readBuffByDelTopDepIdx( YCFSecAuthorization Authorization,
		long DelTopDepTenantId,
		long DelTopDepId )
	{
		final String S_ProcName = "YCFBamRamDelSubDep1.readBuffByDelTopDepIdx() ";
		YCFBamDelSubDep1Buff buff;
		ArrayList<YCFBamDelSubDep1Buff> filteredList = new ArrayList<YCFBamDelSubDep1Buff>();
		YCFBamDelSubDep1Buff[] buffList = readDerivedByDelTopDepIdx( Authorization,
			DelTopDepTenantId,
			DelTopDepId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a81b" ) ) {
				filteredList.add( (YCFBamDelSubDep1Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamDelSubDep1Buff[0] ) );
	}

	public YCFBamDelSubDep1Buff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long DelTopDepTenantId,
		long DelTopDepId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamDelSubDep1.readBuffByUNameIdx() ";
		YCFBamDelSubDep1Buff buff = readDerivedByUNameIdx( Authorization,
			DelTopDepTenantId,
			DelTopDepId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a81b" ) ) {
			return( (YCFBamDelSubDep1Buff)buff );
		}
		else {
			return( null );
		}
	}

	/**
	 *	Read a page array of the specific DelSubDep1 buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamDelSubDep1Buff[] pageBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByDefSchemaIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific DelSubDep1 buffer instances identified by the duplicate key DelDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRelationTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamDelSubDep1Buff[] pageBuffByDelDepIdx( YCFSecAuthorization Authorization,
		long RelationTenantId,
		long RelationId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByDelDepIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific DelSubDep1 buffer instances identified by the duplicate key DelTopDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDelTopDepTenantId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	argDelTopDepId	The DelSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamDelSubDep1Buff[] pageBuffByDelTopDepIdx( YCFSecAuthorization Authorization,
		long DelTopDepTenantId,
		long DelTopDepId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByDelTopDepIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateDelSubDep1( YCFSecAuthorization Authorization,
		YCFBamDelSubDep1Buff Buff )
	{
		schema.getTableDelDep().updateDelDep( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamDelSubDep1Buff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateDelSubDep1",
				"Existing record not found",
				"DelSubDep1",
				pkey );
		}
		YCFBamDelSubDep1ByDelTopDepIdxKey existingKeyDelTopDepIdx = schema.getFactoryDelSubDep1().newDelTopDepIdxKey();
		existingKeyDelTopDepIdx.setRequiredDelTopDepTenantId( existing.getRequiredDelTopDepTenantId() );
		existingKeyDelTopDepIdx.setRequiredDelTopDepId( existing.getRequiredDelTopDepId() );

		YCFBamDelSubDep1ByDelTopDepIdxKey newKeyDelTopDepIdx = schema.getFactoryDelSubDep1().newDelTopDepIdxKey();
		newKeyDelTopDepIdx.setRequiredDelTopDepTenantId( Buff.getRequiredDelTopDepTenantId() );
		newKeyDelTopDepIdx.setRequiredDelTopDepId( Buff.getRequiredDelTopDepId() );

		YCFBamDelSubDep1ByUNameIdxKey existingKeyUNameIdx = schema.getFactoryDelSubDep1().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredDelTopDepTenantId( existing.getRequiredDelTopDepTenantId() );
		existingKeyUNameIdx.setRequiredDelTopDepId( existing.getRequiredDelTopDepId() );
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamDelSubDep1ByUNameIdxKey newKeyUNameIdx = schema.getFactoryDelSubDep1().newUNameIdxKey();
		newKeyUNameIdx.setRequiredDelTopDepTenantId( Buff.getRequiredDelTopDepTenantId() );
		newKeyUNameIdx.setRequiredDelTopDepId( Buff.getRequiredDelTopDepId() );
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateDelSubDep1",
					"DelSubDep1UNameIdx",
					newKeyUNameIdx );
			}
		}

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableDelDep().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateDelSubDep1",
						"Superclass",
						"SuperClass",
						"DelDep",
						null );
				}
			}
		}

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableDelTopDep().readDerivedByIdIdx( Authorization,
						Buff.getRequiredDelTopDepTenantId(),
						Buff.getRequiredDelTopDepId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateDelSubDep1",
						"Container",
						"DelTopDep",
						"DelTopDep",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamScopePKey, YCFBamDelSubDep1Buff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByDelTopDepIdx.get( existingKeyDelTopDepIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByDelTopDepIdx.containsKey( newKeyDelTopDepIdx ) ) {
			subdict = dictByDelTopDepIdx.get( newKeyDelTopDepIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamDelSubDep1Buff >();
			dictByDelTopDepIdx.put( newKeyDelTopDepIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

	}

	public void deleteDelSubDep1( YCFSecAuthorization Authorization,
		YCFBamDelSubDep1Buff Buff )
	{
		final String S_ProcName = "YCFBamRamDelSubDep1Table.deleteDelSubDep1() ";
		String classCode;
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamDelSubDep1Buff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteDelSubDep1",
				pkey );
		}
		// Short circuit self-referential code to prevent stack overflows
		Object arrCheckDelDep[] = schema.getTableDelSubDep2().readDerivedByContDelDep1Idx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		if( arrCheckDelDep.length > 0 ) {
			schema.getTableDelSubDep2().deleteDelSubDep2ByContDelDep1Idx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		}
		YCFBamDelSubDep1ByDelTopDepIdxKey keyDelTopDepIdx = schema.getFactoryDelSubDep1().newDelTopDepIdxKey();
		keyDelTopDepIdx.setRequiredDelTopDepTenantId( existing.getRequiredDelTopDepTenantId() );
		keyDelTopDepIdx.setRequiredDelTopDepId( existing.getRequiredDelTopDepId() );

		YCFBamDelSubDep1ByUNameIdxKey keyUNameIdx = schema.getFactoryDelSubDep1().newUNameIdxKey();
		keyUNameIdx.setRequiredDelTopDepTenantId( existing.getRequiredDelTopDepTenantId() );
		keyUNameIdx.setRequiredDelTopDepId( existing.getRequiredDelTopDepId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFBamScopePKey, YCFBamDelSubDep1Buff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByDelTopDepIdx.get( keyDelTopDepIdx );
		subdict.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

		schema.getTableDelDep().deleteDelDep( Authorization,
			Buff );
	}
	public void deleteDelSubDep1ByDelTopDepIdx( YCFSecAuthorization Authorization,
		long argDelTopDepTenantId,
		long argDelTopDepId )
	{
		YCFBamDelSubDep1ByDelTopDepIdxKey key = schema.getFactoryDelSubDep1().newDelTopDepIdxKey();
		key.setRequiredDelTopDepTenantId( argDelTopDepTenantId );
		key.setRequiredDelTopDepId( argDelTopDepId );
		deleteDelSubDep1ByDelTopDepIdx( Authorization, key );
	}

	public void deleteDelSubDep1ByDelTopDepIdx( YCFSecAuthorization Authorization,
		YCFBamDelSubDep1ByDelTopDepIdxKey argKey )
	{
		YCFBamDelSubDep1Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamDelSubDep1Buff> matchSet = new LinkedList<YCFBamDelSubDep1Buff>();
		Iterator<YCFBamDelSubDep1Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamDelSubDep1Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableDelSubDep1().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteDelSubDep1( Authorization, cur );
		}
	}

	public void deleteDelSubDep1ByUNameIdx( YCFSecAuthorization Authorization,
		long argDelTopDepTenantId,
		long argDelTopDepId,
		String argName )
	{
		YCFBamDelSubDep1ByUNameIdxKey key = schema.getFactoryDelSubDep1().newUNameIdxKey();
		key.setRequiredDelTopDepTenantId( argDelTopDepTenantId );
		key.setRequiredDelTopDepId( argDelTopDepId );
		key.setRequiredName( argName );
		deleteDelSubDep1ByUNameIdx( Authorization, key );
	}

	public void deleteDelSubDep1ByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamDelSubDep1ByUNameIdxKey argKey )
	{
		YCFBamDelSubDep1Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamDelSubDep1Buff> matchSet = new LinkedList<YCFBamDelSubDep1Buff>();
		Iterator<YCFBamDelSubDep1Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamDelSubDep1Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableDelSubDep1().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteDelSubDep1( Authorization, cur );
		}
	}

	public void deleteDelSubDep1ByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamDelDepByDefSchemaIdxKey key = schema.getFactoryDelDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deleteDelSubDep1ByDefSchemaIdx( Authorization, key );
	}

	public void deleteDelSubDep1ByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamDelDepByDefSchemaIdxKey argKey )
	{
		YCFBamDelSubDep1Buff cur;
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
		LinkedList<YCFBamDelSubDep1Buff> matchSet = new LinkedList<YCFBamDelSubDep1Buff>();
		Iterator<YCFBamDelSubDep1Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamDelSubDep1Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableDelSubDep1().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteDelSubDep1( Authorization, cur );
		}
	}

	public void deleteDelSubDep1ByDelDepIdx( YCFSecAuthorization Authorization,
		long argRelationTenantId,
		long argRelationId )
	{
		YCFBamDelDepByDelDepIdxKey key = schema.getFactoryDelDep().newDelDepIdxKey();
		key.setRequiredRelationTenantId( argRelationTenantId );
		key.setRequiredRelationId( argRelationId );
		deleteDelSubDep1ByDelDepIdx( Authorization, key );
	}

	public void deleteDelSubDep1ByDelDepIdx( YCFSecAuthorization Authorization,
		YCFBamDelDepByDelDepIdxKey argKey )
	{
		YCFBamDelSubDep1Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamDelSubDep1Buff> matchSet = new LinkedList<YCFBamDelSubDep1Buff>();
		Iterator<YCFBamDelSubDep1Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamDelSubDep1Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableDelSubDep1().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteDelSubDep1( Authorization, cur );
		}
	}

	public void deleteDelSubDep1ByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteDelSubDep1ByIdIdx( Authorization, key );
	}

	public void deleteDelSubDep1ByIdIdx( YCFSecAuthorization Authorization,
		YCFBamScopePKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamDelSubDep1Buff cur;
		LinkedList<YCFBamDelSubDep1Buff> matchSet = new LinkedList<YCFBamDelSubDep1Buff>();
		Iterator<YCFBamDelSubDep1Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamDelSubDep1Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableDelSubDep1().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteDelSubDep1( Authorization, cur );
		}
	}

	public void deleteDelSubDep1ByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamScopeByTenantIdxKey key = schema.getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteDelSubDep1ByTenantIdx( Authorization, key );
	}

	public void deleteDelSubDep1ByTenantIdx( YCFSecAuthorization Authorization,
		YCFBamScopeByTenantIdxKey argKey )
	{
		YCFBamDelSubDep1Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamDelSubDep1Buff> matchSet = new LinkedList<YCFBamDelSubDep1Buff>();
		Iterator<YCFBamDelSubDep1Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamDelSubDep1Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableDelSubDep1().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteDelSubDep1( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
