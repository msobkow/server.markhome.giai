
// Description: Java 11 in-memory RAM DbIO implementation for DelSubDep2.

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
 *	YCFBamRamDelSubDep2Table in-memory RAM DbIO implementation
 *	for DelSubDep2.
 */
public class YCFBamRamDelSubDep2Table
	implements IYCFBamDelSubDep2Table
{
	private IYCFBamSchema schema;
	private Map< YCFBamScopePKey,
				YCFBamDelSubDep2Buff > dictByPKey
		= new HashMap< YCFBamScopePKey,
				YCFBamDelSubDep2Buff >();
	private Map< YCFBamDelSubDep2ByContDelDep1IdxKey,
				Map< YCFBamScopePKey,
					YCFBamDelSubDep2Buff >> dictByContDelDep1Idx
		= new HashMap< YCFBamDelSubDep2ByContDelDep1IdxKey,
				Map< YCFBamScopePKey,
					YCFBamDelSubDep2Buff >>();
	private Map< YCFBamDelSubDep2ByUNameIdxKey,
			YCFBamDelSubDep2Buff > dictByUNameIdx
		= new HashMap< YCFBamDelSubDep2ByUNameIdxKey,
			YCFBamDelSubDep2Buff >();

	public YCFBamRamDelSubDep2Table( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createDelSubDep2( YCFSecAuthorization Authorization,
		YCFBamDelSubDep2Buff Buff )
	{
		final String S_ProcName = "createDelSubDep2";
		schema.getTableDelDep().createDelDep( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamDelSubDep2ByContDelDep1IdxKey keyContDelDep1Idx = schema.getFactoryDelSubDep2().newContDelDep1IdxKey();
		keyContDelDep1Idx.setRequiredDelSubDep1TenantId( Buff.getRequiredDelSubDep1TenantId() );
		keyContDelDep1Idx.setRequiredDelSubDep1Id( Buff.getRequiredDelSubDep1Id() );

		YCFBamDelSubDep2ByUNameIdxKey keyUNameIdx = schema.getFactoryDelSubDep2().newUNameIdxKey();
		keyUNameIdx.setRequiredDelSubDep1TenantId( Buff.getRequiredDelSubDep1TenantId() );
		keyUNameIdx.setRequiredDelSubDep1Id( Buff.getRequiredDelSubDep1Id() );
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"DelSubDep2UNameIdx",
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
				if( null == schema.getTableDelSubDep1().readDerivedByIdIdx( Authorization,
						Buff.getRequiredDelSubDep1TenantId(),
						Buff.getRequiredDelSubDep1Id() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"DelSubDep1",
						"DelSubDep1",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamDelSubDep2Buff > subdictContDelDep1Idx;
		if( dictByContDelDep1Idx.containsKey( keyContDelDep1Idx ) ) {
			subdictContDelDep1Idx = dictByContDelDep1Idx.get( keyContDelDep1Idx );
		}
		else {
			subdictContDelDep1Idx = new HashMap< YCFBamScopePKey, YCFBamDelSubDep2Buff >();
			dictByContDelDep1Idx.put( keyContDelDep1Idx, subdictContDelDep1Idx );
		}
		subdictContDelDep1Idx.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

	}

	public YCFBamDelSubDep2Buff readDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamDelSubDep2.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamDelSubDep2Buff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamDelSubDep2Buff lockDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamDelSubDep2.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamDelSubDep2Buff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamDelSubDep2Buff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamDelSubDep2.readAllDerived";
		YCFBamDelSubDep2Buff[] retList = new YCFBamDelSubDep2Buff[ dictByPKey.values().size() ];
		Iterator< YCFBamDelSubDep2Buff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamDelSubDep2Buff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamDelSubDep2Buff> filteredList = new ArrayList<YCFBamDelSubDep2Buff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamDelSubDep2Buff ) ) {
					filteredList.add( (YCFBamDelSubDep2Buff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamDelSubDep2Buff[0] ) );
		}
	}

	public YCFBamDelSubDep2Buff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamDelSubDep2Buff> filteredList = new ArrayList<YCFBamDelSubDep2Buff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamDelSubDep2Buff ) ) {
					filteredList.add( (YCFBamDelSubDep2Buff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamDelSubDep2Buff[0] ) );
		}
	}

	public YCFBamDelSubDep2Buff[] readDerivedByDelDepIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamDelSubDep2Buff> filteredList = new ArrayList<YCFBamDelSubDep2Buff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamDelSubDep2Buff ) ) {
					filteredList.add( (YCFBamDelSubDep2Buff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamDelSubDep2Buff[0] ) );
		}
	}

	public YCFBamDelSubDep2Buff[] readDerivedByContDelDep1Idx( YCFSecAuthorization Authorization,
		long DelSubDep1TenantId,
		long DelSubDep1Id )
	{
		final String S_ProcName = "YCFBamRamDelSubDep2.readDerivedByContDelDep1Idx";
		YCFBamDelSubDep2ByContDelDep1IdxKey key = schema.getFactoryDelSubDep2().newContDelDep1IdxKey();
		key.setRequiredDelSubDep1TenantId( DelSubDep1TenantId );
		key.setRequiredDelSubDep1Id( DelSubDep1Id );

		YCFBamDelSubDep2Buff[] recArray;
		if( dictByContDelDep1Idx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamDelSubDep2Buff > subdictContDelDep1Idx
				= dictByContDelDep1Idx.get( key );
			recArray = new YCFBamDelSubDep2Buff[ subdictContDelDep1Idx.size() ];
			Iterator< YCFBamDelSubDep2Buff > iter = subdictContDelDep1Idx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamDelSubDep2Buff > subdictContDelDep1Idx
				= new HashMap< YCFBamScopePKey, YCFBamDelSubDep2Buff >();
			dictByContDelDep1Idx.put( key, subdictContDelDep1Idx );
			recArray = new YCFBamDelSubDep2Buff[0];
		}
		return( recArray );
	}

	public YCFBamDelSubDep2Buff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long DelSubDep1TenantId,
		long DelSubDep1Id,
		String Name )
	{
		final String S_ProcName = "YCFBamRamDelSubDep2.readDerivedByUNameIdx";
		YCFBamDelSubDep2ByUNameIdxKey key = schema.getFactoryDelSubDep2().newUNameIdxKey();
		key.setRequiredDelSubDep1TenantId( DelSubDep1TenantId );
		key.setRequiredDelSubDep1Id( DelSubDep1Id );
		key.setRequiredName( Name );

		YCFBamDelSubDep2Buff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamDelSubDep2Buff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readDerivedByIdIdx() ";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamDelSubDep2Buff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamDelSubDep2Buff readBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamDelSubDep2.readBuff";
		YCFBamDelSubDep2Buff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a81c" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamDelSubDep2Buff lockBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamDelSubDep2Buff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a81c" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamDelSubDep2Buff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamDelSubDep2.readAllBuff";
		YCFBamDelSubDep2Buff buff;
		ArrayList<YCFBamDelSubDep2Buff> filteredList = new ArrayList<YCFBamDelSubDep2Buff>();
		YCFBamDelSubDep2Buff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a81c" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamDelSubDep2Buff[0] ) );
	}

	public YCFBamDelSubDep2Buff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByIdIdx() ";
		YCFBamDelSubDep2Buff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
			return( (YCFBamDelSubDep2Buff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamDelSubDep2Buff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByTenantIdx() ";
		YCFBamDelSubDep2Buff buff;
		ArrayList<YCFBamDelSubDep2Buff> filteredList = new ArrayList<YCFBamDelSubDep2Buff>();
		YCFBamDelSubDep2Buff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
				filteredList.add( (YCFBamDelSubDep2Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamDelSubDep2Buff[0] ) );
	}

	public YCFBamDelSubDep2Buff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamDelDep.readBuffByDefSchemaIdx() ";
		YCFBamDelSubDep2Buff buff;
		ArrayList<YCFBamDelSubDep2Buff> filteredList = new ArrayList<YCFBamDelSubDep2Buff>();
		YCFBamDelSubDep2Buff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a81a" ) ) {
				filteredList.add( (YCFBamDelSubDep2Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamDelSubDep2Buff[0] ) );
	}

	public YCFBamDelSubDep2Buff[] readBuffByDelDepIdx( YCFSecAuthorization Authorization,
		long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "YCFBamRamDelDep.readBuffByDelDepIdx() ";
		YCFBamDelSubDep2Buff buff;
		ArrayList<YCFBamDelSubDep2Buff> filteredList = new ArrayList<YCFBamDelSubDep2Buff>();
		YCFBamDelSubDep2Buff[] buffList = readDerivedByDelDepIdx( Authorization,
			RelationTenantId,
			RelationId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a81a" ) ) {
				filteredList.add( (YCFBamDelSubDep2Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamDelSubDep2Buff[0] ) );
	}

	public YCFBamDelSubDep2Buff[] readBuffByContDelDep1Idx( YCFSecAuthorization Authorization,
		long DelSubDep1TenantId,
		long DelSubDep1Id )
	{
		final String S_ProcName = "YCFBamRamDelSubDep2.readBuffByContDelDep1Idx() ";
		YCFBamDelSubDep2Buff buff;
		ArrayList<YCFBamDelSubDep2Buff> filteredList = new ArrayList<YCFBamDelSubDep2Buff>();
		YCFBamDelSubDep2Buff[] buffList = readDerivedByContDelDep1Idx( Authorization,
			DelSubDep1TenantId,
			DelSubDep1Id );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a81c" ) ) {
				filteredList.add( (YCFBamDelSubDep2Buff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamDelSubDep2Buff[0] ) );
	}

	public YCFBamDelSubDep2Buff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long DelSubDep1TenantId,
		long DelSubDep1Id,
		String Name )
	{
		final String S_ProcName = "YCFBamRamDelSubDep2.readBuffByUNameIdx() ";
		YCFBamDelSubDep2Buff buff = readDerivedByUNameIdx( Authorization,
			DelSubDep1TenantId,
			DelSubDep1Id,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a81c" ) ) {
			return( (YCFBamDelSubDep2Buff)buff );
		}
		else {
			return( null );
		}
	}

	/**
	 *	Read a page array of the specific DelSubDep2 buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamDelSubDep2Buff[] pageBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByDefSchemaIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific DelSubDep2 buffer instances identified by the duplicate key DelDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRelationTenantId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamDelSubDep2Buff[] pageBuffByDelDepIdx( YCFSecAuthorization Authorization,
		long RelationTenantId,
		long RelationId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByDelDepIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific DelSubDep2 buffer instances identified by the duplicate key ContDelDep1Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDelSubDep1TenantId	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	argDelSubDep1Id	The DelSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamDelSubDep2Buff[] pageBuffByContDelDep1Idx( YCFSecAuthorization Authorization,
		long DelSubDep1TenantId,
		long DelSubDep1Id,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByContDelDep1Idx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateDelSubDep2( YCFSecAuthorization Authorization,
		YCFBamDelSubDep2Buff Buff )
	{
		schema.getTableDelDep().updateDelDep( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamDelSubDep2Buff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateDelSubDep2",
				"Existing record not found",
				"DelSubDep2",
				pkey );
		}
		YCFBamDelSubDep2ByContDelDep1IdxKey existingKeyContDelDep1Idx = schema.getFactoryDelSubDep2().newContDelDep1IdxKey();
		existingKeyContDelDep1Idx.setRequiredDelSubDep1TenantId( existing.getRequiredDelSubDep1TenantId() );
		existingKeyContDelDep1Idx.setRequiredDelSubDep1Id( existing.getRequiredDelSubDep1Id() );

		YCFBamDelSubDep2ByContDelDep1IdxKey newKeyContDelDep1Idx = schema.getFactoryDelSubDep2().newContDelDep1IdxKey();
		newKeyContDelDep1Idx.setRequiredDelSubDep1TenantId( Buff.getRequiredDelSubDep1TenantId() );
		newKeyContDelDep1Idx.setRequiredDelSubDep1Id( Buff.getRequiredDelSubDep1Id() );

		YCFBamDelSubDep2ByUNameIdxKey existingKeyUNameIdx = schema.getFactoryDelSubDep2().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredDelSubDep1TenantId( existing.getRequiredDelSubDep1TenantId() );
		existingKeyUNameIdx.setRequiredDelSubDep1Id( existing.getRequiredDelSubDep1Id() );
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamDelSubDep2ByUNameIdxKey newKeyUNameIdx = schema.getFactoryDelSubDep2().newUNameIdxKey();
		newKeyUNameIdx.setRequiredDelSubDep1TenantId( Buff.getRequiredDelSubDep1TenantId() );
		newKeyUNameIdx.setRequiredDelSubDep1Id( Buff.getRequiredDelSubDep1Id() );
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateDelSubDep2",
					"DelSubDep2UNameIdx",
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
						"updateDelSubDep2",
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
				if( null == schema.getTableDelSubDep1().readDerivedByIdIdx( Authorization,
						Buff.getRequiredDelSubDep1TenantId(),
						Buff.getRequiredDelSubDep1Id() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateDelSubDep2",
						"Container",
						"DelSubDep1",
						"DelSubDep1",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamScopePKey, YCFBamDelSubDep2Buff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByContDelDep1Idx.get( existingKeyContDelDep1Idx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByContDelDep1Idx.containsKey( newKeyContDelDep1Idx ) ) {
			subdict = dictByContDelDep1Idx.get( newKeyContDelDep1Idx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamDelSubDep2Buff >();
			dictByContDelDep1Idx.put( newKeyContDelDep1Idx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

	}

	public void deleteDelSubDep2( YCFSecAuthorization Authorization,
		YCFBamDelSubDep2Buff Buff )
	{
		final String S_ProcName = "YCFBamRamDelSubDep2Table.deleteDelSubDep2() ";
		String classCode;
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamDelSubDep2Buff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteDelSubDep2",
				pkey );
		}
		// Short circuit self-referential code to prevent stack overflows
		Object arrCheckDelDep[] = schema.getTableDelSubDep3().readDerivedByDelSubDep2Idx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		if( arrCheckDelDep.length > 0 ) {
			schema.getTableDelSubDep3().deleteDelSubDep3ByDelSubDep2Idx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		}
		YCFBamDelSubDep2ByContDelDep1IdxKey keyContDelDep1Idx = schema.getFactoryDelSubDep2().newContDelDep1IdxKey();
		keyContDelDep1Idx.setRequiredDelSubDep1TenantId( existing.getRequiredDelSubDep1TenantId() );
		keyContDelDep1Idx.setRequiredDelSubDep1Id( existing.getRequiredDelSubDep1Id() );

		YCFBamDelSubDep2ByUNameIdxKey keyUNameIdx = schema.getFactoryDelSubDep2().newUNameIdxKey();
		keyUNameIdx.setRequiredDelSubDep1TenantId( existing.getRequiredDelSubDep1TenantId() );
		keyUNameIdx.setRequiredDelSubDep1Id( existing.getRequiredDelSubDep1Id() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFBamScopePKey, YCFBamDelSubDep2Buff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByContDelDep1Idx.get( keyContDelDep1Idx );
		subdict.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

		schema.getTableDelDep().deleteDelDep( Authorization,
			Buff );
	}
	public void deleteDelSubDep2ByContDelDep1Idx( YCFSecAuthorization Authorization,
		long argDelSubDep1TenantId,
		long argDelSubDep1Id )
	{
		YCFBamDelSubDep2ByContDelDep1IdxKey key = schema.getFactoryDelSubDep2().newContDelDep1IdxKey();
		key.setRequiredDelSubDep1TenantId( argDelSubDep1TenantId );
		key.setRequiredDelSubDep1Id( argDelSubDep1Id );
		deleteDelSubDep2ByContDelDep1Idx( Authorization, key );
	}

	public void deleteDelSubDep2ByContDelDep1Idx( YCFSecAuthorization Authorization,
		YCFBamDelSubDep2ByContDelDep1IdxKey argKey )
	{
		YCFBamDelSubDep2Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamDelSubDep2Buff> matchSet = new LinkedList<YCFBamDelSubDep2Buff>();
		Iterator<YCFBamDelSubDep2Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamDelSubDep2Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableDelSubDep2().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteDelSubDep2( Authorization, cur );
		}
	}

	public void deleteDelSubDep2ByUNameIdx( YCFSecAuthorization Authorization,
		long argDelSubDep1TenantId,
		long argDelSubDep1Id,
		String argName )
	{
		YCFBamDelSubDep2ByUNameIdxKey key = schema.getFactoryDelSubDep2().newUNameIdxKey();
		key.setRequiredDelSubDep1TenantId( argDelSubDep1TenantId );
		key.setRequiredDelSubDep1Id( argDelSubDep1Id );
		key.setRequiredName( argName );
		deleteDelSubDep2ByUNameIdx( Authorization, key );
	}

	public void deleteDelSubDep2ByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamDelSubDep2ByUNameIdxKey argKey )
	{
		YCFBamDelSubDep2Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamDelSubDep2Buff> matchSet = new LinkedList<YCFBamDelSubDep2Buff>();
		Iterator<YCFBamDelSubDep2Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamDelSubDep2Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableDelSubDep2().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteDelSubDep2( Authorization, cur );
		}
	}

	public void deleteDelSubDep2ByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamDelDepByDefSchemaIdxKey key = schema.getFactoryDelDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deleteDelSubDep2ByDefSchemaIdx( Authorization, key );
	}

	public void deleteDelSubDep2ByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamDelDepByDefSchemaIdxKey argKey )
	{
		YCFBamDelSubDep2Buff cur;
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
		LinkedList<YCFBamDelSubDep2Buff> matchSet = new LinkedList<YCFBamDelSubDep2Buff>();
		Iterator<YCFBamDelSubDep2Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamDelSubDep2Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableDelSubDep2().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteDelSubDep2( Authorization, cur );
		}
	}

	public void deleteDelSubDep2ByDelDepIdx( YCFSecAuthorization Authorization,
		long argRelationTenantId,
		long argRelationId )
	{
		YCFBamDelDepByDelDepIdxKey key = schema.getFactoryDelDep().newDelDepIdxKey();
		key.setRequiredRelationTenantId( argRelationTenantId );
		key.setRequiredRelationId( argRelationId );
		deleteDelSubDep2ByDelDepIdx( Authorization, key );
	}

	public void deleteDelSubDep2ByDelDepIdx( YCFSecAuthorization Authorization,
		YCFBamDelDepByDelDepIdxKey argKey )
	{
		YCFBamDelSubDep2Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamDelSubDep2Buff> matchSet = new LinkedList<YCFBamDelSubDep2Buff>();
		Iterator<YCFBamDelSubDep2Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamDelSubDep2Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableDelSubDep2().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteDelSubDep2( Authorization, cur );
		}
	}

	public void deleteDelSubDep2ByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteDelSubDep2ByIdIdx( Authorization, key );
	}

	public void deleteDelSubDep2ByIdIdx( YCFSecAuthorization Authorization,
		YCFBamScopePKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamDelSubDep2Buff cur;
		LinkedList<YCFBamDelSubDep2Buff> matchSet = new LinkedList<YCFBamDelSubDep2Buff>();
		Iterator<YCFBamDelSubDep2Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamDelSubDep2Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableDelSubDep2().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteDelSubDep2( Authorization, cur );
		}
	}

	public void deleteDelSubDep2ByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamScopeByTenantIdxKey key = schema.getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteDelSubDep2ByTenantIdx( Authorization, key );
	}

	public void deleteDelSubDep2ByTenantIdx( YCFSecAuthorization Authorization,
		YCFBamScopeByTenantIdxKey argKey )
	{
		YCFBamDelSubDep2Buff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamDelSubDep2Buff> matchSet = new LinkedList<YCFBamDelSubDep2Buff>();
		Iterator<YCFBamDelSubDep2Buff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamDelSubDep2Buff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableDelSubDep2().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteDelSubDep2( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
