
// Description: Java 11 in-memory RAM DbIO implementation for ClearDep.

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
 *	YCFBamRamClearDepTable in-memory RAM DbIO implementation
 *	for ClearDep.
 */
public class YCFBamRamClearDepTable
	implements IYCFBamClearDepTable
{
	private IYCFBamSchema schema;
	private Map< YCFBamScopePKey,
				YCFBamClearDepBuff > dictByPKey
		= new HashMap< YCFBamScopePKey,
				YCFBamClearDepBuff >();
	private Map< YCFBamClearDepByClearDepIdxKey,
				Map< YCFBamScopePKey,
					YCFBamClearDepBuff >> dictByClearDepIdx
		= new HashMap< YCFBamClearDepByClearDepIdxKey,
				Map< YCFBamScopePKey,
					YCFBamClearDepBuff >>();
	private Map< YCFBamClearDepByDefSchemaIdxKey,
				Map< YCFBamScopePKey,
					YCFBamClearDepBuff >> dictByDefSchemaIdx
		= new HashMap< YCFBamClearDepByDefSchemaIdxKey,
				Map< YCFBamScopePKey,
					YCFBamClearDepBuff >>();

	public YCFBamRamClearDepTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createClearDep( YCFSecAuthorization Authorization,
		YCFBamClearDepBuff Buff )
	{
		final String S_ProcName = "createClearDep";
		schema.getTableScope().createScope( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamClearDepByClearDepIdxKey keyClearDepIdx = schema.getFactoryClearDep().newClearDepIdxKey();
		keyClearDepIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyClearDepIdx.setRequiredRelationId( Buff.getRequiredRelationId() );

		YCFBamClearDepByDefSchemaIdxKey keyDefSchemaIdx = schema.getFactoryClearDep().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( Buff.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( Buff.getOptionalDefSchemaId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		// Validate foreign keys

		{
			boolean allNull = true;
			allNull = false;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableScope().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Superclass",
						"SuperClass",
						"Scope",
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
						Buff.getRequiredTenantId(),
						Buff.getRequiredRelationId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Lookup",
						"Relation",
						"Relation",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamClearDepBuff > subdictClearDepIdx;
		if( dictByClearDepIdx.containsKey( keyClearDepIdx ) ) {
			subdictClearDepIdx = dictByClearDepIdx.get( keyClearDepIdx );
		}
		else {
			subdictClearDepIdx = new HashMap< YCFBamScopePKey, YCFBamClearDepBuff >();
			dictByClearDepIdx.put( keyClearDepIdx, subdictClearDepIdx );
		}
		subdictClearDepIdx.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamClearDepBuff > subdictDefSchemaIdx;
		if( dictByDefSchemaIdx.containsKey( keyDefSchemaIdx ) ) {
			subdictDefSchemaIdx = dictByDefSchemaIdx.get( keyDefSchemaIdx );
		}
		else {
			subdictDefSchemaIdx = new HashMap< YCFBamScopePKey, YCFBamClearDepBuff >();
			dictByDefSchemaIdx.put( keyDefSchemaIdx, subdictDefSchemaIdx );
		}
		subdictDefSchemaIdx.put( pkey, Buff );

	}

	public YCFBamClearDepBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamClearDep.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamClearDepBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamClearDepBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamClearDep.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamClearDepBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamClearDepBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamClearDep.readAllDerived";
		YCFBamClearDepBuff[] retList = new YCFBamClearDepBuff[ dictByPKey.values().size() ];
		Iterator< YCFBamClearDepBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamClearDepBuff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamClearDepBuff> filteredList = new ArrayList<YCFBamClearDepBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamClearDepBuff ) ) {
					filteredList.add( (YCFBamClearDepBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamClearDepBuff[0] ) );
		}
	}

	public YCFBamClearDepBuff[] readDerivedByClearDepIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long RelationId )
	{
		final String S_ProcName = "YCFBamRamClearDep.readDerivedByClearDepIdx";
		YCFBamClearDepByClearDepIdxKey key = schema.getFactoryClearDep().newClearDepIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredRelationId( RelationId );

		YCFBamClearDepBuff[] recArray;
		if( dictByClearDepIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamClearDepBuff > subdictClearDepIdx
				= dictByClearDepIdx.get( key );
			recArray = new YCFBamClearDepBuff[ subdictClearDepIdx.size() ];
			Iterator< YCFBamClearDepBuff > iter = subdictClearDepIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamClearDepBuff > subdictClearDepIdx
				= new HashMap< YCFBamScopePKey, YCFBamClearDepBuff >();
			dictByClearDepIdx.put( key, subdictClearDepIdx );
			recArray = new YCFBamClearDepBuff[0];
		}
		return( recArray );
	}

	public YCFBamClearDepBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamClearDep.readDerivedByDefSchemaIdx";
		YCFBamClearDepByDefSchemaIdxKey key = schema.getFactoryClearDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );

		YCFBamClearDepBuff[] recArray;
		if( dictByDefSchemaIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamClearDepBuff > subdictDefSchemaIdx
				= dictByDefSchemaIdx.get( key );
			recArray = new YCFBamClearDepBuff[ subdictDefSchemaIdx.size() ];
			Iterator< YCFBamClearDepBuff > iter = subdictDefSchemaIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamClearDepBuff > subdictDefSchemaIdx
				= new HashMap< YCFBamScopePKey, YCFBamClearDepBuff >();
			dictByDefSchemaIdx.put( key, subdictDefSchemaIdx );
			recArray = new YCFBamClearDepBuff[0];
		}
		return( recArray );
	}

	public YCFBamClearDepBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readDerivedByIdIdx() ";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamClearDepBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamClearDepBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamClearDep.readBuff";
		YCFBamClearDepBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a813" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamClearDepBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamClearDepBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a813" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamClearDepBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamClearDep.readAllBuff";
		YCFBamClearDepBuff buff;
		ArrayList<YCFBamClearDepBuff> filteredList = new ArrayList<YCFBamClearDepBuff>();
		YCFBamClearDepBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a813" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamClearDepBuff[0] ) );
	}

	public YCFBamClearDepBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByIdIdx() ";
		YCFBamClearDepBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
			return( (YCFBamClearDepBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamClearDepBuff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByTenantIdx() ";
		YCFBamClearDepBuff buff;
		ArrayList<YCFBamClearDepBuff> filteredList = new ArrayList<YCFBamClearDepBuff>();
		YCFBamClearDepBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
				filteredList.add( (YCFBamClearDepBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamClearDepBuff[0] ) );
	}

	public YCFBamClearDepBuff[] readBuffByClearDepIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long RelationId )
	{
		final String S_ProcName = "YCFBamRamClearDep.readBuffByClearDepIdx() ";
		YCFBamClearDepBuff buff;
		ArrayList<YCFBamClearDepBuff> filteredList = new ArrayList<YCFBamClearDepBuff>();
		YCFBamClearDepBuff[] buffList = readDerivedByClearDepIdx( Authorization,
			TenantId,
			RelationId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a813" ) ) {
				filteredList.add( (YCFBamClearDepBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamClearDepBuff[0] ) );
	}

	public YCFBamClearDepBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamClearDep.readBuffByDefSchemaIdx() ";
		YCFBamClearDepBuff buff;
		ArrayList<YCFBamClearDepBuff> filteredList = new ArrayList<YCFBamClearDepBuff>();
		YCFBamClearDepBuff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a813" ) ) {
				filteredList.add( (YCFBamClearDepBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamClearDepBuff[0] ) );
	}

	/**
	 *	Read a page array of the specific ClearDep buffer instances identified by the duplicate key ClearDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamClearDepBuff[] pageBuffByClearDepIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long RelationId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByClearDepIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific ClearDep buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamClearDepBuff[] pageBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByDefSchemaIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateClearDep( YCFSecAuthorization Authorization,
		YCFBamClearDepBuff Buff )
	{
		schema.getTableScope().updateScope( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamClearDepBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateClearDep",
				"Existing record not found",
				"ClearDep",
				pkey );
		}
		YCFBamClearDepByClearDepIdxKey existingKeyClearDepIdx = schema.getFactoryClearDep().newClearDepIdxKey();
		existingKeyClearDepIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyClearDepIdx.setRequiredRelationId( existing.getRequiredRelationId() );

		YCFBamClearDepByClearDepIdxKey newKeyClearDepIdx = schema.getFactoryClearDep().newClearDepIdxKey();
		newKeyClearDepIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyClearDepIdx.setRequiredRelationId( Buff.getRequiredRelationId() );

		YCFBamClearDepByDefSchemaIdxKey existingKeyDefSchemaIdx = schema.getFactoryClearDep().newDefSchemaIdxKey();
		existingKeyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		existingKeyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		YCFBamClearDepByDefSchemaIdxKey newKeyDefSchemaIdx = schema.getFactoryClearDep().newDefSchemaIdxKey();
		newKeyDefSchemaIdx.setOptionalDefSchemaTenantId( Buff.getOptionalDefSchemaTenantId() );
		newKeyDefSchemaIdx.setOptionalDefSchemaId( Buff.getOptionalDefSchemaId() );

		// Check unique indexes

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableScope().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateClearDep",
						"Superclass",
						"SuperClass",
						"Scope",
						null );
				}
			}
		}

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableRelation().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredRelationId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateClearDep",
						"Lookup",
						"Relation",
						"Relation",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamScopePKey, YCFBamClearDepBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByClearDepIdx.get( existingKeyClearDepIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByClearDepIdx.containsKey( newKeyClearDepIdx ) ) {
			subdict = dictByClearDepIdx.get( newKeyClearDepIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamClearDepBuff >();
			dictByClearDepIdx.put( newKeyClearDepIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByDefSchemaIdx.get( existingKeyDefSchemaIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByDefSchemaIdx.containsKey( newKeyDefSchemaIdx ) ) {
			subdict = dictByDefSchemaIdx.get( newKeyDefSchemaIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamClearDepBuff >();
			dictByDefSchemaIdx.put( newKeyDefSchemaIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteClearDep( YCFSecAuthorization Authorization,
		YCFBamClearDepBuff Buff )
	{
		final String S_ProcName = "YCFBamRamClearDepTable.deleteClearDep() ";
		String classCode;
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamClearDepBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteClearDep",
				pkey );
		}
		YCFBamClearDepByClearDepIdxKey keyClearDepIdx = schema.getFactoryClearDep().newClearDepIdxKey();
		keyClearDepIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyClearDepIdx.setRequiredRelationId( existing.getRequiredRelationId() );

		YCFBamClearDepByDefSchemaIdxKey keyDefSchemaIdx = schema.getFactoryClearDep().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		// Validate reverse foreign keys

		if( schema.getTableClearSubDep1().readDerivedByIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteClearDep",
				"Superclass",
				"SuperClass",
				"ClearSubDep1",
				pkey );
		}

		if( schema.getTableClearSubDep2().readDerivedByIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteClearDep",
				"Superclass",
				"SuperClass",
				"ClearSubDep2",
				pkey );
		}

		if( schema.getTableClearSubDep3().readDerivedByIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteClearDep",
				"Superclass",
				"SuperClass",
				"ClearSubDep3",
				pkey );
		}

		if( schema.getTableClearTopDep().readDerivedByIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteClearDep",
				"Superclass",
				"SuperClass",
				"ClearTopDep",
				pkey );
		}

		// Delete is valid
		Map< YCFBamScopePKey, YCFBamClearDepBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByClearDepIdx.get( keyClearDepIdx );
		subdict.remove( pkey );

		subdict = dictByDefSchemaIdx.get( keyDefSchemaIdx );
		subdict.remove( pkey );

		schema.getTableScope().deleteScope( Authorization,
			Buff );
	}
	public void deleteClearDepByClearDepIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argRelationId )
	{
		YCFBamClearDepByClearDepIdxKey key = schema.getFactoryClearDep().newClearDepIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredRelationId( argRelationId );
		deleteClearDepByClearDepIdx( Authorization, key );
	}

	public void deleteClearDepByClearDepIdx( YCFSecAuthorization Authorization,
		YCFBamClearDepByClearDepIdxKey argKey )
	{
		final String S_ProcName = "deleteClearDepByClearDepIdx";
		YCFBamClearDepBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamClearDepBuff> matchSet = new LinkedList<YCFBamClearDepBuff>();
		Iterator<YCFBamClearDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamClearDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableClearDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a813".equals( subClassCode ) ) {
				schema.getTableClearDep().deleteClearDep( Authorization, cur );
			}
			else if( "a814".equals( subClassCode ) ) {
				schema.getTableClearSubDep1().deleteClearSubDep1( Authorization, (YCFBamClearSubDep1Buff)cur );
			}
			else if( "a815".equals( subClassCode ) ) {
				schema.getTableClearSubDep2().deleteClearSubDep2( Authorization, (YCFBamClearSubDep2Buff)cur );
			}
			else if( "a816".equals( subClassCode ) ) {
				schema.getTableClearSubDep3().deleteClearSubDep3( Authorization, (YCFBamClearSubDep3Buff)cur );
			}
			else if( "a817".equals( subClassCode ) ) {
				schema.getTableClearTopDep().deleteClearTopDep( Authorization, (YCFBamClearTopDepBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of ClearDep must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteClearDepByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamClearDepByDefSchemaIdxKey key = schema.getFactoryClearDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deleteClearDepByDefSchemaIdx( Authorization, key );
	}

	public void deleteClearDepByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamClearDepByDefSchemaIdxKey argKey )
	{
		final String S_ProcName = "deleteClearDepByDefSchemaIdx";
		YCFBamClearDepBuff cur;
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
		LinkedList<YCFBamClearDepBuff> matchSet = new LinkedList<YCFBamClearDepBuff>();
		Iterator<YCFBamClearDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamClearDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableClearDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a813".equals( subClassCode ) ) {
				schema.getTableClearDep().deleteClearDep( Authorization, cur );
			}
			else if( "a814".equals( subClassCode ) ) {
				schema.getTableClearSubDep1().deleteClearSubDep1( Authorization, (YCFBamClearSubDep1Buff)cur );
			}
			else if( "a815".equals( subClassCode ) ) {
				schema.getTableClearSubDep2().deleteClearSubDep2( Authorization, (YCFBamClearSubDep2Buff)cur );
			}
			else if( "a816".equals( subClassCode ) ) {
				schema.getTableClearSubDep3().deleteClearSubDep3( Authorization, (YCFBamClearSubDep3Buff)cur );
			}
			else if( "a817".equals( subClassCode ) ) {
				schema.getTableClearTopDep().deleteClearTopDep( Authorization, (YCFBamClearTopDepBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of ClearDep must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteClearDepByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteClearDepByIdIdx( Authorization, key );
	}

	public void deleteClearDepByIdIdx( YCFSecAuthorization Authorization,
		YCFBamScopePKey argKey )
	{
		final String S_ProcName = "deleteClearDepByIdIdx";
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamClearDepBuff cur;
		LinkedList<YCFBamClearDepBuff> matchSet = new LinkedList<YCFBamClearDepBuff>();
		Iterator<YCFBamClearDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamClearDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableClearDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a813".equals( subClassCode ) ) {
				schema.getTableClearDep().deleteClearDep( Authorization, cur );
			}
			else if( "a814".equals( subClassCode ) ) {
				schema.getTableClearSubDep1().deleteClearSubDep1( Authorization, (YCFBamClearSubDep1Buff)cur );
			}
			else if( "a815".equals( subClassCode ) ) {
				schema.getTableClearSubDep2().deleteClearSubDep2( Authorization, (YCFBamClearSubDep2Buff)cur );
			}
			else if( "a816".equals( subClassCode ) ) {
				schema.getTableClearSubDep3().deleteClearSubDep3( Authorization, (YCFBamClearSubDep3Buff)cur );
			}
			else if( "a817".equals( subClassCode ) ) {
				schema.getTableClearTopDep().deleteClearTopDep( Authorization, (YCFBamClearTopDepBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of ClearDep must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteClearDepByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamScopeByTenantIdxKey key = schema.getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteClearDepByTenantIdx( Authorization, key );
	}

	public void deleteClearDepByTenantIdx( YCFSecAuthorization Authorization,
		YCFBamScopeByTenantIdxKey argKey )
	{
		final String S_ProcName = "deleteClearDepByTenantIdx";
		YCFBamClearDepBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamClearDepBuff> matchSet = new LinkedList<YCFBamClearDepBuff>();
		Iterator<YCFBamClearDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamClearDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableClearDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a813".equals( subClassCode ) ) {
				schema.getTableClearDep().deleteClearDep( Authorization, cur );
			}
			else if( "a814".equals( subClassCode ) ) {
				schema.getTableClearSubDep1().deleteClearSubDep1( Authorization, (YCFBamClearSubDep1Buff)cur );
			}
			else if( "a815".equals( subClassCode ) ) {
				schema.getTableClearSubDep2().deleteClearSubDep2( Authorization, (YCFBamClearSubDep2Buff)cur );
			}
			else if( "a816".equals( subClassCode ) ) {
				schema.getTableClearSubDep3().deleteClearSubDep3( Authorization, (YCFBamClearSubDep3Buff)cur );
			}
			else if( "a817".equals( subClassCode ) ) {
				schema.getTableClearTopDep().deleteClearTopDep( Authorization, (YCFBamClearTopDepBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of ClearDep must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void releasePreparedStatements() {
	}
}
