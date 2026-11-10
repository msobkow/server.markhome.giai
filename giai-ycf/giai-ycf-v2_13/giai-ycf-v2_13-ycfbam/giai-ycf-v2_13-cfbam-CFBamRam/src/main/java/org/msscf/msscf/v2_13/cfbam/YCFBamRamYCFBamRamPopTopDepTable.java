
// Description: Java 11 in-memory RAM DbIO implementation for PopTopDep.

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
 *	YCFBamRamPopTopDepTable in-memory RAM DbIO implementation
 *	for PopTopDep.
 */
public class YCFBamRamPopTopDepTable
	implements IYCFBamPopTopDepTable
{
	private IYCFBamSchema schema;
	private Map< YCFBamScopePKey,
				YCFBamPopTopDepBuff > dictByPKey
		= new HashMap< YCFBamScopePKey,
				YCFBamPopTopDepBuff >();
	private Map< YCFBamPopTopDepByContRelIdxKey,
				Map< YCFBamScopePKey,
					YCFBamPopTopDepBuff >> dictByContRelIdx
		= new HashMap< YCFBamPopTopDepByContRelIdxKey,
				Map< YCFBamScopePKey,
					YCFBamPopTopDepBuff >>();
	private Map< YCFBamPopTopDepByUNameIdxKey,
			YCFBamPopTopDepBuff > dictByUNameIdx
		= new HashMap< YCFBamPopTopDepByUNameIdxKey,
			YCFBamPopTopDepBuff >();

	public YCFBamRamPopTopDepTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createPopTopDep( YCFSecAuthorization Authorization,
		YCFBamPopTopDepBuff Buff )
	{
		final String S_ProcName = "createPopTopDep";
		schema.getTablePopDep().createPopDep( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamPopTopDepByContRelIdxKey keyContRelIdx = schema.getFactoryPopTopDep().newContRelIdxKey();
		keyContRelIdx.setRequiredContRelationTenantId( Buff.getRequiredContRelationTenantId() );
		keyContRelIdx.setRequiredContRelationId( Buff.getRequiredContRelationId() );

		YCFBamPopTopDepByUNameIdxKey keyUNameIdx = schema.getFactoryPopTopDep().newUNameIdxKey();
		keyUNameIdx.setRequiredContRelationTenantId( Buff.getRequiredContRelationTenantId() );
		keyUNameIdx.setRequiredContRelationId( Buff.getRequiredContRelationId() );
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"PopTopDepUNameIdx",
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
				if( null == schema.getTableRelation().readDerivedByIdIdx( Authorization,
						Buff.getRequiredContRelationTenantId(),
						Buff.getRequiredContRelationId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"ContRelation",
						"Relation",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamPopTopDepBuff > subdictContRelIdx;
		if( dictByContRelIdx.containsKey( keyContRelIdx ) ) {
			subdictContRelIdx = dictByContRelIdx.get( keyContRelIdx );
		}
		else {
			subdictContRelIdx = new HashMap< YCFBamScopePKey, YCFBamPopTopDepBuff >();
			dictByContRelIdx.put( keyContRelIdx, subdictContRelIdx );
		}
		subdictContRelIdx.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

	}

	public YCFBamPopTopDepBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamPopTopDep.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamPopTopDepBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamPopTopDepBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamPopTopDep.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamPopTopDepBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamPopTopDepBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamPopTopDep.readAllDerived";
		YCFBamPopTopDepBuff[] retList = new YCFBamPopTopDepBuff[ dictByPKey.values().size() ];
		Iterator< YCFBamPopTopDepBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamPopTopDepBuff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamPopTopDepBuff> filteredList = new ArrayList<YCFBamPopTopDepBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamPopTopDepBuff ) ) {
					filteredList.add( (YCFBamPopTopDepBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamPopTopDepBuff[0] ) );
		}
	}

	public YCFBamPopTopDepBuff[] readDerivedByRelationIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamPopTopDepBuff> filteredList = new ArrayList<YCFBamPopTopDepBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamPopTopDepBuff ) ) {
					filteredList.add( (YCFBamPopTopDepBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamPopTopDepBuff[0] ) );
		}
	}

	public YCFBamPopTopDepBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamPopTopDepBuff> filteredList = new ArrayList<YCFBamPopTopDepBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamPopTopDepBuff ) ) {
					filteredList.add( (YCFBamPopTopDepBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamPopTopDepBuff[0] ) );
		}
	}

	public YCFBamPopTopDepBuff[] readDerivedByContRelIdx( YCFSecAuthorization Authorization,
		long ContRelationTenantId,
		long ContRelationId )
	{
		final String S_ProcName = "YCFBamRamPopTopDep.readDerivedByContRelIdx";
		YCFBamPopTopDepByContRelIdxKey key = schema.getFactoryPopTopDep().newContRelIdxKey();
		key.setRequiredContRelationTenantId( ContRelationTenantId );
		key.setRequiredContRelationId( ContRelationId );

		YCFBamPopTopDepBuff[] recArray;
		if( dictByContRelIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamPopTopDepBuff > subdictContRelIdx
				= dictByContRelIdx.get( key );
			recArray = new YCFBamPopTopDepBuff[ subdictContRelIdx.size() ];
			Iterator< YCFBamPopTopDepBuff > iter = subdictContRelIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamPopTopDepBuff > subdictContRelIdx
				= new HashMap< YCFBamScopePKey, YCFBamPopTopDepBuff >();
			dictByContRelIdx.put( key, subdictContRelIdx );
			recArray = new YCFBamPopTopDepBuff[0];
		}
		return( recArray );
	}

	public YCFBamPopTopDepBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long ContRelationTenantId,
		long ContRelationId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamPopTopDep.readDerivedByUNameIdx";
		YCFBamPopTopDepByUNameIdxKey key = schema.getFactoryPopTopDep().newUNameIdxKey();
		key.setRequiredContRelationTenantId( ContRelationTenantId );
		key.setRequiredContRelationId( ContRelationId );
		key.setRequiredName( Name );

		YCFBamPopTopDepBuff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamPopTopDepBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readDerivedByIdIdx() ";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamPopTopDepBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamPopTopDepBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamPopTopDep.readBuff";
		YCFBamPopTopDepBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a837" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamPopTopDepBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamPopTopDepBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a837" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamPopTopDepBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamPopTopDep.readAllBuff";
		YCFBamPopTopDepBuff buff;
		ArrayList<YCFBamPopTopDepBuff> filteredList = new ArrayList<YCFBamPopTopDepBuff>();
		YCFBamPopTopDepBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a837" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamPopTopDepBuff[0] ) );
	}

	public YCFBamPopTopDepBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByIdIdx() ";
		YCFBamPopTopDepBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
			return( (YCFBamPopTopDepBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamPopTopDepBuff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByTenantIdx() ";
		YCFBamPopTopDepBuff buff;
		ArrayList<YCFBamPopTopDepBuff> filteredList = new ArrayList<YCFBamPopTopDepBuff>();
		YCFBamPopTopDepBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
				filteredList.add( (YCFBamPopTopDepBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamPopTopDepBuff[0] ) );
	}

	public YCFBamPopTopDepBuff[] readBuffByRelationIdx( YCFSecAuthorization Authorization,
		long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "YCFBamRamPopDep.readBuffByRelationIdx() ";
		YCFBamPopTopDepBuff buff;
		ArrayList<YCFBamPopTopDepBuff> filteredList = new ArrayList<YCFBamPopTopDepBuff>();
		YCFBamPopTopDepBuff[] buffList = readDerivedByRelationIdx( Authorization,
			RelationTenantId,
			RelationId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a833" ) ) {
				filteredList.add( (YCFBamPopTopDepBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamPopTopDepBuff[0] ) );
	}

	public YCFBamPopTopDepBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamPopDep.readBuffByDefSchemaIdx() ";
		YCFBamPopTopDepBuff buff;
		ArrayList<YCFBamPopTopDepBuff> filteredList = new ArrayList<YCFBamPopTopDepBuff>();
		YCFBamPopTopDepBuff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a833" ) ) {
				filteredList.add( (YCFBamPopTopDepBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamPopTopDepBuff[0] ) );
	}

	public YCFBamPopTopDepBuff[] readBuffByContRelIdx( YCFSecAuthorization Authorization,
		long ContRelationTenantId,
		long ContRelationId )
	{
		final String S_ProcName = "YCFBamRamPopTopDep.readBuffByContRelIdx() ";
		YCFBamPopTopDepBuff buff;
		ArrayList<YCFBamPopTopDepBuff> filteredList = new ArrayList<YCFBamPopTopDepBuff>();
		YCFBamPopTopDepBuff[] buffList = readDerivedByContRelIdx( Authorization,
			ContRelationTenantId,
			ContRelationId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a837" ) ) {
				filteredList.add( (YCFBamPopTopDepBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamPopTopDepBuff[0] ) );
	}

	public YCFBamPopTopDepBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long ContRelationTenantId,
		long ContRelationId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamPopTopDep.readBuffByUNameIdx() ";
		YCFBamPopTopDepBuff buff = readDerivedByUNameIdx( Authorization,
			ContRelationTenantId,
			ContRelationId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a837" ) ) {
			return( (YCFBamPopTopDepBuff)buff );
		}
		else {
			return( null );
		}
	}

	/**
	 *	Read a page array of the specific PopTopDep buffer instances identified by the duplicate key RelationIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRelationTenantId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamPopTopDepBuff[] pageBuffByRelationIdx( YCFSecAuthorization Authorization,
		long RelationTenantId,
		long RelationId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByRelationIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific PopTopDep buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamPopTopDepBuff[] pageBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByDefSchemaIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific PopTopDep buffer instances identified by the duplicate key ContRelIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argContRelationTenantId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argContRelationId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamPopTopDepBuff[] pageBuffByContRelIdx( YCFSecAuthorization Authorization,
		long ContRelationTenantId,
		long ContRelationId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByContRelIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updatePopTopDep( YCFSecAuthorization Authorization,
		YCFBamPopTopDepBuff Buff )
	{
		schema.getTablePopDep().updatePopDep( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamPopTopDepBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updatePopTopDep",
				"Existing record not found",
				"PopTopDep",
				pkey );
		}
		YCFBamPopTopDepByContRelIdxKey existingKeyContRelIdx = schema.getFactoryPopTopDep().newContRelIdxKey();
		existingKeyContRelIdx.setRequiredContRelationTenantId( existing.getRequiredContRelationTenantId() );
		existingKeyContRelIdx.setRequiredContRelationId( existing.getRequiredContRelationId() );

		YCFBamPopTopDepByContRelIdxKey newKeyContRelIdx = schema.getFactoryPopTopDep().newContRelIdxKey();
		newKeyContRelIdx.setRequiredContRelationTenantId( Buff.getRequiredContRelationTenantId() );
		newKeyContRelIdx.setRequiredContRelationId( Buff.getRequiredContRelationId() );

		YCFBamPopTopDepByUNameIdxKey existingKeyUNameIdx = schema.getFactoryPopTopDep().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredContRelationTenantId( existing.getRequiredContRelationTenantId() );
		existingKeyUNameIdx.setRequiredContRelationId( existing.getRequiredContRelationId() );
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamPopTopDepByUNameIdxKey newKeyUNameIdx = schema.getFactoryPopTopDep().newUNameIdxKey();
		newKeyUNameIdx.setRequiredContRelationTenantId( Buff.getRequiredContRelationTenantId() );
		newKeyUNameIdx.setRequiredContRelationId( Buff.getRequiredContRelationId() );
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updatePopTopDep",
					"PopTopDepUNameIdx",
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
						"updatePopTopDep",
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
				if( null == schema.getTableRelation().readDerivedByIdIdx( Authorization,
						Buff.getRequiredContRelationTenantId(),
						Buff.getRequiredContRelationId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updatePopTopDep",
						"Container",
						"ContRelation",
						"Relation",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamScopePKey, YCFBamPopTopDepBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByContRelIdx.get( existingKeyContRelIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByContRelIdx.containsKey( newKeyContRelIdx ) ) {
			subdict = dictByContRelIdx.get( newKeyContRelIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamPopTopDepBuff >();
			dictByContRelIdx.put( newKeyContRelIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

	}

	public void deletePopTopDep( YCFSecAuthorization Authorization,
		YCFBamPopTopDepBuff Buff )
	{
		final String S_ProcName = "YCFBamRamPopTopDepTable.deletePopTopDep() ";
		String classCode;
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamPopTopDepBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deletePopTopDep",
				pkey );
		}
		// Short circuit self-referential code to prevent stack overflows
		Object arrCheckPopDep[] = schema.getTablePopSubDep1().readDerivedByPopTopDepIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		if( arrCheckPopDep.length > 0 ) {
			schema.getTablePopSubDep1().deletePopSubDep1ByPopTopDepIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		}
		YCFBamPopTopDepByContRelIdxKey keyContRelIdx = schema.getFactoryPopTopDep().newContRelIdxKey();
		keyContRelIdx.setRequiredContRelationTenantId( existing.getRequiredContRelationTenantId() );
		keyContRelIdx.setRequiredContRelationId( existing.getRequiredContRelationId() );

		YCFBamPopTopDepByUNameIdxKey keyUNameIdx = schema.getFactoryPopTopDep().newUNameIdxKey();
		keyUNameIdx.setRequiredContRelationTenantId( existing.getRequiredContRelationTenantId() );
		keyUNameIdx.setRequiredContRelationId( existing.getRequiredContRelationId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFBamScopePKey, YCFBamPopTopDepBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByContRelIdx.get( keyContRelIdx );
		subdict.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

		schema.getTablePopDep().deletePopDep( Authorization,
			Buff );
	}
	public void deletePopTopDepByContRelIdx( YCFSecAuthorization Authorization,
		long argContRelationTenantId,
		long argContRelationId )
	{
		YCFBamPopTopDepByContRelIdxKey key = schema.getFactoryPopTopDep().newContRelIdxKey();
		key.setRequiredContRelationTenantId( argContRelationTenantId );
		key.setRequiredContRelationId( argContRelationId );
		deletePopTopDepByContRelIdx( Authorization, key );
	}

	public void deletePopTopDepByContRelIdx( YCFSecAuthorization Authorization,
		YCFBamPopTopDepByContRelIdxKey argKey )
	{
		YCFBamPopTopDepBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamPopTopDepBuff> matchSet = new LinkedList<YCFBamPopTopDepBuff>();
		Iterator<YCFBamPopTopDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamPopTopDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTablePopTopDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deletePopTopDep( Authorization, cur );
		}
	}

	public void deletePopTopDepByUNameIdx( YCFSecAuthorization Authorization,
		long argContRelationTenantId,
		long argContRelationId,
		String argName )
	{
		YCFBamPopTopDepByUNameIdxKey key = schema.getFactoryPopTopDep().newUNameIdxKey();
		key.setRequiredContRelationTenantId( argContRelationTenantId );
		key.setRequiredContRelationId( argContRelationId );
		key.setRequiredName( argName );
		deletePopTopDepByUNameIdx( Authorization, key );
	}

	public void deletePopTopDepByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamPopTopDepByUNameIdxKey argKey )
	{
		YCFBamPopTopDepBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamPopTopDepBuff> matchSet = new LinkedList<YCFBamPopTopDepBuff>();
		Iterator<YCFBamPopTopDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamPopTopDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTablePopTopDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deletePopTopDep( Authorization, cur );
		}
	}

	public void deletePopTopDepByRelationIdx( YCFSecAuthorization Authorization,
		long argRelationTenantId,
		long argRelationId )
	{
		YCFBamPopDepByRelationIdxKey key = schema.getFactoryPopDep().newRelationIdxKey();
		key.setRequiredRelationTenantId( argRelationTenantId );
		key.setRequiredRelationId( argRelationId );
		deletePopTopDepByRelationIdx( Authorization, key );
	}

	public void deletePopTopDepByRelationIdx( YCFSecAuthorization Authorization,
		YCFBamPopDepByRelationIdxKey argKey )
	{
		YCFBamPopTopDepBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamPopTopDepBuff> matchSet = new LinkedList<YCFBamPopTopDepBuff>();
		Iterator<YCFBamPopTopDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamPopTopDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTablePopTopDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deletePopTopDep( Authorization, cur );
		}
	}

	public void deletePopTopDepByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamPopDepByDefSchemaIdxKey key = schema.getFactoryPopDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deletePopTopDepByDefSchemaIdx( Authorization, key );
	}

	public void deletePopTopDepByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamPopDepByDefSchemaIdxKey argKey )
	{
		YCFBamPopTopDepBuff cur;
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
		LinkedList<YCFBamPopTopDepBuff> matchSet = new LinkedList<YCFBamPopTopDepBuff>();
		Iterator<YCFBamPopTopDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamPopTopDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTablePopTopDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deletePopTopDep( Authorization, cur );
		}
	}

	public void deletePopTopDepByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deletePopTopDepByIdIdx( Authorization, key );
	}

	public void deletePopTopDepByIdIdx( YCFSecAuthorization Authorization,
		YCFBamScopePKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamPopTopDepBuff cur;
		LinkedList<YCFBamPopTopDepBuff> matchSet = new LinkedList<YCFBamPopTopDepBuff>();
		Iterator<YCFBamPopTopDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamPopTopDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTablePopTopDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deletePopTopDep( Authorization, cur );
		}
	}

	public void deletePopTopDepByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamScopeByTenantIdxKey key = schema.getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deletePopTopDepByTenantIdx( Authorization, key );
	}

	public void deletePopTopDepByTenantIdx( YCFSecAuthorization Authorization,
		YCFBamScopeByTenantIdxKey argKey )
	{
		YCFBamPopTopDepBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamPopTopDepBuff> matchSet = new LinkedList<YCFBamPopTopDepBuff>();
		Iterator<YCFBamPopTopDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamPopTopDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTablePopTopDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deletePopTopDep( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
