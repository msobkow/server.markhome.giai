
// Description: Java 11 in-memory RAM DbIO implementation for DelSubDep3.

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
 *	YCFBamRamDelSubDep3Table in-memory RAM DbIO implementation
 *	for DelSubDep3.
 */
public class YCFBamRamDelSubDep3Table
	implements IYCFBamDelSubDep3Table
{
	private IYCFBamSchema schema;
	private Map< YCFBamScopePKey,
				YCFBamDelSubDep3Buff > dictByPKey
		= new HashMap< YCFBamScopePKey,
				YCFBamDelSubDep3Buff >();
	private Map< YCFBamDelSubDep3ByDelSubDep2IdxKey,
				Map< YCFBamScopePKey,
					YCFBamDelSubDep3Buff >> dictByDelSubDep2Idx
		= new HashMap< YCFBamDelSubDep3ByDelSubDep2IdxKey,
				Map< YCFBamScopePKey,
					YCFBamDelSubDep3Buff >>();
	private Map< YCFBamDelSubDep3ByUNameIdxKey,
			YCFBamDelSubDep3Buff > dictByUNameIdx
		= new HashMap< YCFBamDelSubDep3ByUNameIdxKey,
			YCFBamDelSubDep3Buff >();

	public YCFBamRamDelSubDep3Table( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createDelSubDep3( YCFSecAuthorization Authorization,
		YCFBamDelSubDep3Buff Buff )
	{
		final String S_ProcName = "createDelSubDep3";
		schema.getTableDelDep().createDelDep( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamDelSubDep3ByDelSubDep2IdxKey keyDelSubDep2Idx = schema.getFactoryDelSubDep3().newDelSubDep2IdxKey();
		keyDelSubDep2Idx.setRequiredDelSubDep2TenantId( Buff.getRequiredDelSubDep2TenantId() );
		keyDelSubDep2Idx.setRequiredDelSubDep2Id( Buff.getRequiredDelSubDep2Id() );

		YCFBamDelSubDep3ByUNameIdxKey keyUNameIdx = schema.getFactoryDelSubDep3().newUNameIdxKey();
		keyUNameIdx.setRequiredDelSubDep2TenantId( Buff.getRequiredDelSubDep2TenantId() );
		keyUNameIdx.setRequiredDelSubDep2Id( Buff.getRequiredDelSubDep2Id() );
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"DelSubDep3UNameIdx",
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
				if( null == schema.getTableDelSubDep2().readDerivedByIdIdx( Authorization,
						Buff.getRequiredDelSubDep2TenantId(),
						Buff.getRequiredDelSubDep2Id() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"DelSubDep2",
						"DelSubDep2",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamDelSubDep3Buff > subdictDelSubDep2Idx;
		if( dictByDelSubDep2Idx.containsKey( keyDelSubDep2Idx ) ) {
			subdictDelSubDep2Idx = dictByDelSubDep2Idx.get( keyDelSubDep2Idx );
		}
		else {
			subdictDelSubDep2Idx = new HashMap< YCFBamScopePKey, YCFBamDelSubDep3Buff >();
			dictByDelSubDep2Idx.put( keyDelSubDep2Idx, subdictDelSubDep2Idx );
		}
		subdictDelSubDep2Idx.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

	}

	public YCFBamDelSubDep3Buff readDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamDelSubDep3.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamDelSubDep3Buff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamDelSubDep3Buff lockDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamDelSubDep3.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamDelSubDep3Buff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamDelSubDep3Buff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamDelSubDep3.readAllDerived";
		YCFBamDelSubDep3Buff[] retList = new YCFBamDelSubDep3Buff[ dictByPKey.values().size() ];
		Iterator< YCFBamDelSubDep3Buff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamDelSubDep3Buff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamDelSubDep3Buff> filteredList = new ArrayList<YCFBamDelSubDep3Buff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamDelSubDep3Buff ) ) {
					filteredList.add( (YCFBamDelSubDep3Buff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamDelSubDep3Buff[0] ) );
		}
	}

	public YCFBamDelSubDep3Buff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamDelSubDep3Buff> filteredList = new ArrayList<YCFBamDelSubDep3Buff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamDelSubDep3Buff ) ) {
					filteredList.add( (YCFBamDelSubDep3Buff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamDelSubDep3Buff[0] ) );
		}
	}

	public YCFBamDelSubDep3Buff[] readDerivedByDelDepIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamDelSubDep3Buff> filteredList = new ArrayList<YCFBamDelSubDep3Buff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamDelSubDep3Buff ) ) {
					filteredList.add( (YCFBamDelSubDep3Buff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamDelSubDep3Buff[0] ) );
		}
	}

	public YCFBamDelSubDep3Buff[] readDerivedByDelSubDep2Idx( YCFSecAuthorization Authorization,
		long DelSubDep2TenantId,
		long DelSubDep2Id )
	{
		final String S_ProcName = "YCFBamRamDelSubDep3.readDerivedByDelSubDep2Idx";
		YCFBamDelSubDep3ByDelSubDep2IdxKey key = schema.getFactoryDelSubDep3().newDelSubDep2IdxKey();
		key.setRequiredDelSubDep2TenantId( DelSubDep2TenantId );
		key.setRequiredDelSubDep2Id( DelSubDep2Id );

		YCFBamDelSubDep3Buff[] recArray;
		if( dictByDelSubDep2Idx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamDelSubDep3Buff > subdictDelSubDep2Idx
				= dictByDelSubDep2Idx.get( key );
			recArray = new YCFBamDelSubDep3Buff[ subdictDelSubDep2Idx.size() ];
			Iterator< YCFBamDelSubDep3Buff > iter = subdictDelSubDep2Idx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamDelSubDep3Buff > subdictDelSubDep2Idx
				= new HashMap< YCFBamScopePKey, YCFBamDelSubDep3Buff >();
			dictByDelSubDep2Idx.put( key, subdictDelSubDep2Idx );
			recArray = new YCFBamDelSubDep3Buff[0];
		}
		return( recArray );
	}

	public YCFBamDelSubDep3Buff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long DelSubDep2TenantId,
		long DelSubDep2Id,
		String Name )
	{
		final String S_ProcName = "YCFBamRamDelSubDep3.readDerivedByUNameIdx";
		YCFBamDelSubDep3ByUNameIdxKey key = schema.getFactoryDelSubDep3().newUNameIdxKey();
		key.setRequiredDelSubDep2TenantId( DelSubDep2TenantId );
		key.setRequiredDelSubDep2Id( DelSubDep2Id );
		key.setRequiredName( Name );

		YCFBamDelSubDep3Buff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamDelSubDep3Buff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readDerivedByIdIdx() ";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamDelSubDep3Buff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamDelSubDep3Buff readBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamDelSubDep3.readBuff";
		YCFBamDelSubDep3Buff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a81d" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamDelSubDep3Buff lockBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamDelSubDep3Buff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a81d" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamDelSubDep3Buff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamDelSubDep3.readAllBuff";
		YCFBamDelSubDep3Buff buff;
		ArrayList<YCFBamDelSubDep3Buff> filteredList = new ArrayList<YCFBamDelSubDep3Buff>();
		YCFBamDelSubDep3Buff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a81d" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamDelSubDep3Buff[0] ) );
	}

	public YCFBamDelSubDep3Buff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByIdIdx() ";
		YCFBamDelSubDep3Buff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
			return( (YCFBamDelSubDep3Buff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamDelSubDep3Buff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByTenantIdx() ";
		YCFBamDelSubDep3Buff buff;
		ArrayList<YCFBamDelSubDep3Buff> filteredList = new ArrayList<YCFBamDelSubDep3Buff>();
		YCFBamDelSubDep3Buff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
				filteredList.add( (YCFBamDelSubDep3Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamDelSubDep3Buff[0] ) );
	}

	public YCFBamDelSubDep3Buff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamDelDep.readBuffByDefSchemaIdx() ";
		YCFBamDelSubDep3Buff buff;
		ArrayList<YCFBamDelSubDep3Buff> filteredList = new ArrayList<YCFBamDelSubDep3Buff>();
		YCFBamDelSubDep3Buff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a81a" ) ) {
				filteredList.add( (YCFBamDelSubDep3Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamDelSubDep3Buff[0] ) );
	}

	public YCFBamDelSubDep3Buff[] readBuffByDelDepIdx( YCFSecAuthorization Authorization,
		long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "YCFBamRamDelDep.readBuffByDelDepIdx() ";
		YCFBamDelSubDep3Buff buff;
		ArrayList<YCFBamDelSubDep3Buff> filteredList = new ArrayList<YCFBamDelSubDep3Buff>();
		YCFBamDelSubDep3Buff[] buffList = readDerivedByDelDepIdx( Authorization,
			RelationTenantId,
			RelationId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a81a" ) ) {
				filteredList.add( (YCFBamDelSubDep3Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamDelSubDep3Buff[0] ) );
	}

	public YCFBamDelSubDep3Buff[] readBuffByDelSubDep2Idx( YCFSecAuthorization Authorization,
		long DelSubDep2TenantId,
		long DelSubDep2Id )
	{
		final String S_ProcName = "YCFBamRamDelSubDep3.readBuffByDelSubDep2Idx() ";
		YCFBamDelSubDep3Buff buff;
		ArrayList<YCFBamDelSubDep3Buff> filteredList = new ArrayList<YCFBamDelSubDep3Buff>();
		YCFBamDelSubDep3Buff[] buffList = readDerivedByDelSubDep2Idx( Authorization,
			DelSubDep2TenantId,
			DelSubDep2Id );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a81d" ) ) {
				filteredList.add( (YCFBamDelSubDep3Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamDelSubDep3Buff[0] ) );
	}

	public YCFBamDelSubDep3Buff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long DelSubDep2TenantId,
		long DelSubDep2Id,
		String Name )
	{
		final String S_ProcName = "YCFBamRamDelSubDep3.readBuffByUNameIdx() ";
		YCFBamDelSubDep3Buff buff = readDerivedByUNameIdx( Authorization,
			DelSubDep2TenantId,
			DelSubDep2Id,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a81d" ) ) {
			return( (YCFBamDelSubDep3Buff)buff );
		}
		else {
			return( null );
		}
	}

	/**
	 *	Read a page array of the specific DelSubDep3 buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamDelSubDep3Buff[] pageBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByDefSchemaIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific DelSubDep3 buffer instances identified by the duplicate key DelDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRelationTenantId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamDelSubDep3Buff[] pageBuffByDelDepIdx( YCFSecAuthorization Authorization,
		long RelationTenantId,
		long RelationId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByDelDepIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific DelSubDep3 buffer instances identified by the duplicate key DelSubDep2Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDelSubDep2TenantId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	argDelSubDep2Id	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamDelSubDep3Buff[] pageBuffByDelSubDep2Idx( YCFSecAuthorization Authorization,
		long DelSubDep2TenantId,
		long DelSubDep2Id,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByDelSubDep2Idx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateDelSubDep3( YCFSecAuthorization Authorization,
		YCFBamDelSubDep3Buff Buff )
	{
		schema.getTableDelDep().updateDelDep( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamDelSubDep3Buff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateDelSubDep3",
				"Existing record not found",
				"DelSubDep3",
				pkey );
		}
		YCFBamDelSubDep3ByDelSubDep2IdxKey existingKeyDelSubDep2Idx = schema.getFactoryDelSubDep3().newDelSubDep2IdxKey();
		existingKeyDelSubDep2Idx.setRequiredDelSubDep2TenantId( existing.getRequiredDelSubDep2TenantId() );
		existingKeyDelSubDep2Idx.setRequiredDelSubDep2Id( existing.getRequiredDelSubDep2Id() );

		YCFBamDelSubDep3ByDelSubDep2IdxKey newKeyDelSubDep2Idx = schema.getFactoryDelSubDep3().newDelSubDep2IdxKey();
		newKeyDelSubDep2Idx.setRequiredDelSubDep2TenantId( Buff.getRequiredDelSubDep2TenantId() );
		newKeyDelSubDep2Idx.setRequiredDelSubDep2Id( Buff.getRequiredDelSubDep2Id() );

		YCFBamDelSubDep3ByUNameIdxKey existingKeyUNameIdx = schema.getFactoryDelSubDep3().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredDelSubDep2TenantId( existing.getRequiredDelSubDep2TenantId() );
		existingKeyUNameIdx.setRequiredDelSubDep2Id( existing.getRequiredDelSubDep2Id() );
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamDelSubDep3ByUNameIdxKey newKeyUNameIdx = schema.getFactoryDelSubDep3().newUNameIdxKey();
		newKeyUNameIdx.setRequiredDelSubDep2TenantId( Buff.getRequiredDelSubDep2TenantId() );
		newKeyUNameIdx.setRequiredDelSubDep2Id( Buff.getRequiredDelSubDep2Id() );
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateDelSubDep3",
					"DelSubDep3UNameIdx",
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
						"updateDelSubDep3",
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
				if( null == schema.getTableDelSubDep2().readDerivedByIdIdx( Authorization,
						Buff.getRequiredDelSubDep2TenantId(),
						Buff.getRequiredDelSubDep2Id() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateDelSubDep3",
						"Container",
						"DelSubDep2",
						"DelSubDep2",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamScopePKey, YCFBamDelSubDep3Buff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByDelSubDep2Idx.get( existingKeyDelSubDep2Idx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByDelSubDep2Idx.containsKey( newKeyDelSubDep2Idx ) ) {
			subdict = dictByDelSubDep2Idx.get( newKeyDelSubDep2Idx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamDelSubDep3Buff >();
			dictByDelSubDep2Idx.put( newKeyDelSubDep2Idx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

	}

	public void deleteDelSubDep3( YCFSecAuthorization Authorization,
		YCFBamDelSubDep3Buff Buff )
	{
		final String S_ProcName = "YCFBamRamDelSubDep3Table.deleteDelSubDep3() ";
		String classCode;
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamDelSubDep3Buff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteDelSubDep3",
				pkey );
		}
		YCFBamDelSubDep3ByDelSubDep2IdxKey keyDelSubDep2Idx = schema.getFactoryDelSubDep3().newDelSubDep2IdxKey();
		keyDelSubDep2Idx.setRequiredDelSubDep2TenantId( existing.getRequiredDelSubDep2TenantId() );
		keyDelSubDep2Idx.setRequiredDelSubDep2Id( existing.getRequiredDelSubDep2Id() );

		YCFBamDelSubDep3ByUNameIdxKey keyUNameIdx = schema.getFactoryDelSubDep3().newUNameIdxKey();
		keyUNameIdx.setRequiredDelSubDep2TenantId( existing.getRequiredDelSubDep2TenantId() );
		keyUNameIdx.setRequiredDelSubDep2Id( existing.getRequiredDelSubDep2Id() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFBamScopePKey, YCFBamDelSubDep3Buff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByDelSubDep2Idx.get( keyDelSubDep2Idx );
		subdict.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

		schema.getTableDelDep().deleteDelDep( Authorization,
			Buff );
	}
	public void deleteDelSubDep3ByDelSubDep2Idx( YCFSecAuthorization Authorization,
		long argDelSubDep2TenantId,
		long argDelSubDep2Id )
	{
		YCFBamDelSubDep3ByDelSubDep2IdxKey key = schema.getFactoryDelSubDep3().newDelSubDep2IdxKey();
		key.setRequiredDelSubDep2TenantId( argDelSubDep2TenantId );
		key.setRequiredDelSubDep2Id( argDelSubDep2Id );
		deleteDelSubDep3ByDelSubDep2Idx( Authorization, key );
	}

	public void deleteDelSubDep3ByDelSubDep2Idx( YCFSecAuthorization Authorization,
		YCFBamDelSubDep3ByDelSubDep2IdxKey argKey )
	{
		YCFBamDelSubDep3Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamDelSubDep3Buff> matchSet = new LinkedList<YCFBamDelSubDep3Buff>();
		Iterator<YCFBamDelSubDep3Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamDelSubDep3Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableDelSubDep3().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteDelSubDep3( Authorization, cur );
		}
	}

	public void deleteDelSubDep3ByUNameIdx( YCFSecAuthorization Authorization,
		long argDelSubDep2TenantId,
		long argDelSubDep2Id,
		String argName )
	{
		YCFBamDelSubDep3ByUNameIdxKey key = schema.getFactoryDelSubDep3().newUNameIdxKey();
		key.setRequiredDelSubDep2TenantId( argDelSubDep2TenantId );
		key.setRequiredDelSubDep2Id( argDelSubDep2Id );
		key.setRequiredName( argName );
		deleteDelSubDep3ByUNameIdx( Authorization, key );
	}

	public void deleteDelSubDep3ByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamDelSubDep3ByUNameIdxKey argKey )
	{
		YCFBamDelSubDep3Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamDelSubDep3Buff> matchSet = new LinkedList<YCFBamDelSubDep3Buff>();
		Iterator<YCFBamDelSubDep3Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamDelSubDep3Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableDelSubDep3().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteDelSubDep3( Authorization, cur );
		}
	}

	public void deleteDelSubDep3ByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamDelDepByDefSchemaIdxKey key = schema.getFactoryDelDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deleteDelSubDep3ByDefSchemaIdx( Authorization, key );
	}

	public void deleteDelSubDep3ByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamDelDepByDefSchemaIdxKey argKey )
	{
		YCFBamDelSubDep3Buff cur;
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
		LinkedList<YCFBamDelSubDep3Buff> matchSet = new LinkedList<YCFBamDelSubDep3Buff>();
		Iterator<YCFBamDelSubDep3Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamDelSubDep3Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableDelSubDep3().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteDelSubDep3( Authorization, cur );
		}
	}

	public void deleteDelSubDep3ByDelDepIdx( YCFSecAuthorization Authorization,
		long argRelationTenantId,
		long argRelationId )
	{
		YCFBamDelDepByDelDepIdxKey key = schema.getFactoryDelDep().newDelDepIdxKey();
		key.setRequiredRelationTenantId( argRelationTenantId );
		key.setRequiredRelationId( argRelationId );
		deleteDelSubDep3ByDelDepIdx( Authorization, key );
	}

	public void deleteDelSubDep3ByDelDepIdx( YCFSecAuthorization Authorization,
		YCFBamDelDepByDelDepIdxKey argKey )
	{
		YCFBamDelSubDep3Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamDelSubDep3Buff> matchSet = new LinkedList<YCFBamDelSubDep3Buff>();
		Iterator<YCFBamDelSubDep3Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamDelSubDep3Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableDelSubDep3().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteDelSubDep3( Authorization, cur );
		}
	}

	public void deleteDelSubDep3ByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteDelSubDep3ByIdIdx( Authorization, key );
	}

	public void deleteDelSubDep3ByIdIdx( YCFSecAuthorization Authorization,
		YCFBamScopePKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamDelSubDep3Buff cur;
		LinkedList<YCFBamDelSubDep3Buff> matchSet = new LinkedList<YCFBamDelSubDep3Buff>();
		Iterator<YCFBamDelSubDep3Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamDelSubDep3Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableDelSubDep3().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteDelSubDep3( Authorization, cur );
		}
	}

	public void deleteDelSubDep3ByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamScopeByTenantIdxKey key = schema.getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteDelSubDep3ByTenantIdx( Authorization, key );
	}

	public void deleteDelSubDep3ByTenantIdx( YCFSecAuthorization Authorization,
		YCFBamScopeByTenantIdxKey argKey )
	{
		YCFBamDelSubDep3Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamDelSubDep3Buff> matchSet = new LinkedList<YCFBamDelSubDep3Buff>();
		Iterator<YCFBamDelSubDep3Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamDelSubDep3Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableDelSubDep3().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteDelSubDep3( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
