
// Description: Java 11 in-memory RAM DbIO implementation for DelDep.

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
 *	YCFBamRamDelDepTable in-memory RAM DbIO implementation
 *	for DelDep.
 */
public class YCFBamRamDelDepTable
	implements IYCFBamDelDepTable
{
	private IYCFBamSchema schema;
	private Map< YCFBamScopePKey,
				YCFBamDelDepBuff > dictByPKey
		= new HashMap< YCFBamScopePKey,
				YCFBamDelDepBuff >();
	private Map< YCFBamDelDepByDefSchemaIdxKey,
				Map< YCFBamScopePKey,
					YCFBamDelDepBuff >> dictByDefSchemaIdx
		= new HashMap< YCFBamDelDepByDefSchemaIdxKey,
				Map< YCFBamScopePKey,
					YCFBamDelDepBuff >>();
	private Map< YCFBamDelDepByDelDepIdxKey,
				Map< YCFBamScopePKey,
					YCFBamDelDepBuff >> dictByDelDepIdx
		= new HashMap< YCFBamDelDepByDelDepIdxKey,
				Map< YCFBamScopePKey,
					YCFBamDelDepBuff >>();

	public YCFBamRamDelDepTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createDelDep( YCFSecAuthorization Authorization,
		YCFBamDelDepBuff Buff )
	{
		final String S_ProcName = "createDelDep";
		schema.getTableScope().createScope( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamDelDepByDefSchemaIdxKey keyDefSchemaIdx = schema.getFactoryDelDep().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( Buff.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( Buff.getOptionalDefSchemaId() );

		YCFBamDelDepByDelDepIdxKey keyDelDepIdx = schema.getFactoryDelDep().newDelDepIdxKey();
		keyDelDepIdx.setRequiredRelationTenantId( Buff.getRequiredRelationTenantId() );
		keyDelDepIdx.setRequiredRelationId( Buff.getRequiredRelationId() );

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
						Buff.getRequiredRelationTenantId(),
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

		Map< YCFBamScopePKey, YCFBamDelDepBuff > subdictDefSchemaIdx;
		if( dictByDefSchemaIdx.containsKey( keyDefSchemaIdx ) ) {
			subdictDefSchemaIdx = dictByDefSchemaIdx.get( keyDefSchemaIdx );
		}
		else {
			subdictDefSchemaIdx = new HashMap< YCFBamScopePKey, YCFBamDelDepBuff >();
			dictByDefSchemaIdx.put( keyDefSchemaIdx, subdictDefSchemaIdx );
		}
		subdictDefSchemaIdx.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamDelDepBuff > subdictDelDepIdx;
		if( dictByDelDepIdx.containsKey( keyDelDepIdx ) ) {
			subdictDelDepIdx = dictByDelDepIdx.get( keyDelDepIdx );
		}
		else {
			subdictDelDepIdx = new HashMap< YCFBamScopePKey, YCFBamDelDepBuff >();
			dictByDelDepIdx.put( keyDelDepIdx, subdictDelDepIdx );
		}
		subdictDelDepIdx.put( pkey, Buff );

	}

	public YCFBamDelDepBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamDelDep.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamDelDepBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamDelDepBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamDelDep.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamDelDepBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamDelDepBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamDelDep.readAllDerived";
		YCFBamDelDepBuff[] retList = new YCFBamDelDepBuff[ dictByPKey.values().size() ];
		Iterator< YCFBamDelDepBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamDelDepBuff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamDelDepBuff> filteredList = new ArrayList<YCFBamDelDepBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamDelDepBuff ) ) {
					filteredList.add( (YCFBamDelDepBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamDelDepBuff[0] ) );
		}
	}

	public YCFBamDelDepBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamDelDep.readDerivedByDefSchemaIdx";
		YCFBamDelDepByDefSchemaIdxKey key = schema.getFactoryDelDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );

		YCFBamDelDepBuff[] recArray;
		if( dictByDefSchemaIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamDelDepBuff > subdictDefSchemaIdx
				= dictByDefSchemaIdx.get( key );
			recArray = new YCFBamDelDepBuff[ subdictDefSchemaIdx.size() ];
			Iterator< YCFBamDelDepBuff > iter = subdictDefSchemaIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamDelDepBuff > subdictDefSchemaIdx
				= new HashMap< YCFBamScopePKey, YCFBamDelDepBuff >();
			dictByDefSchemaIdx.put( key, subdictDefSchemaIdx );
			recArray = new YCFBamDelDepBuff[0];
		}
		return( recArray );
	}

	public YCFBamDelDepBuff[] readDerivedByDelDepIdx( YCFSecAuthorization Authorization,
		long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "YCFBamRamDelDep.readDerivedByDelDepIdx";
		YCFBamDelDepByDelDepIdxKey key = schema.getFactoryDelDep().newDelDepIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );

		YCFBamDelDepBuff[] recArray;
		if( dictByDelDepIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamDelDepBuff > subdictDelDepIdx
				= dictByDelDepIdx.get( key );
			recArray = new YCFBamDelDepBuff[ subdictDelDepIdx.size() ];
			Iterator< YCFBamDelDepBuff > iter = subdictDelDepIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamDelDepBuff > subdictDelDepIdx
				= new HashMap< YCFBamScopePKey, YCFBamDelDepBuff >();
			dictByDelDepIdx.put( key, subdictDelDepIdx );
			recArray = new YCFBamDelDepBuff[0];
		}
		return( recArray );
	}

	public YCFBamDelDepBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readDerivedByIdIdx() ";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamDelDepBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamDelDepBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamDelDep.readBuff";
		YCFBamDelDepBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a81a" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamDelDepBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamDelDepBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a81a" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamDelDepBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamDelDep.readAllBuff";
		YCFBamDelDepBuff buff;
		ArrayList<YCFBamDelDepBuff> filteredList = new ArrayList<YCFBamDelDepBuff>();
		YCFBamDelDepBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a81a" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamDelDepBuff[0] ) );
	}

	public YCFBamDelDepBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByIdIdx() ";
		YCFBamDelDepBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
			return( (YCFBamDelDepBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamDelDepBuff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByTenantIdx() ";
		YCFBamDelDepBuff buff;
		ArrayList<YCFBamDelDepBuff> filteredList = new ArrayList<YCFBamDelDepBuff>();
		YCFBamDelDepBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
				filteredList.add( (YCFBamDelDepBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamDelDepBuff[0] ) );
	}

	public YCFBamDelDepBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamDelDep.readBuffByDefSchemaIdx() ";
		YCFBamDelDepBuff buff;
		ArrayList<YCFBamDelDepBuff> filteredList = new ArrayList<YCFBamDelDepBuff>();
		YCFBamDelDepBuff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a81a" ) ) {
				filteredList.add( (YCFBamDelDepBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamDelDepBuff[0] ) );
	}

	public YCFBamDelDepBuff[] readBuffByDelDepIdx( YCFSecAuthorization Authorization,
		long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "YCFBamRamDelDep.readBuffByDelDepIdx() ";
		YCFBamDelDepBuff buff;
		ArrayList<YCFBamDelDepBuff> filteredList = new ArrayList<YCFBamDelDepBuff>();
		YCFBamDelDepBuff[] buffList = readDerivedByDelDepIdx( Authorization,
			RelationTenantId,
			RelationId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a81a" ) ) {
				filteredList.add( (YCFBamDelDepBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamDelDepBuff[0] ) );
	}

	/**
	 *	Read a page array of the specific DelDep buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamDelDepBuff[] pageBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByDefSchemaIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific DelDep buffer instances identified by the duplicate key DelDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRelationTenantId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The DelDep key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamDelDepBuff[] pageBuffByDelDepIdx( YCFSecAuthorization Authorization,
		long RelationTenantId,
		long RelationId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByDelDepIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateDelDep( YCFSecAuthorization Authorization,
		YCFBamDelDepBuff Buff )
	{
		schema.getTableScope().updateScope( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamDelDepBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateDelDep",
				"Existing record not found",
				"DelDep",
				pkey );
		}
		YCFBamDelDepByDefSchemaIdxKey existingKeyDefSchemaIdx = schema.getFactoryDelDep().newDefSchemaIdxKey();
		existingKeyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		existingKeyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		YCFBamDelDepByDefSchemaIdxKey newKeyDefSchemaIdx = schema.getFactoryDelDep().newDefSchemaIdxKey();
		newKeyDefSchemaIdx.setOptionalDefSchemaTenantId( Buff.getOptionalDefSchemaTenantId() );
		newKeyDefSchemaIdx.setOptionalDefSchemaId( Buff.getOptionalDefSchemaId() );

		YCFBamDelDepByDelDepIdxKey existingKeyDelDepIdx = schema.getFactoryDelDep().newDelDepIdxKey();
		existingKeyDelDepIdx.setRequiredRelationTenantId( existing.getRequiredRelationTenantId() );
		existingKeyDelDepIdx.setRequiredRelationId( existing.getRequiredRelationId() );

		YCFBamDelDepByDelDepIdxKey newKeyDelDepIdx = schema.getFactoryDelDep().newDelDepIdxKey();
		newKeyDelDepIdx.setRequiredRelationTenantId( Buff.getRequiredRelationTenantId() );
		newKeyDelDepIdx.setRequiredRelationId( Buff.getRequiredRelationId() );

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
						"updateDelDep",
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
						Buff.getRequiredRelationTenantId(),
						Buff.getRequiredRelationId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateDelDep",
						"Lookup",
						"Relation",
						"Relation",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamScopePKey, YCFBamDelDepBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByDefSchemaIdx.get( existingKeyDefSchemaIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByDefSchemaIdx.containsKey( newKeyDefSchemaIdx ) ) {
			subdict = dictByDefSchemaIdx.get( newKeyDefSchemaIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamDelDepBuff >();
			dictByDefSchemaIdx.put( newKeyDefSchemaIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByDelDepIdx.get( existingKeyDelDepIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByDelDepIdx.containsKey( newKeyDelDepIdx ) ) {
			subdict = dictByDelDepIdx.get( newKeyDelDepIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamDelDepBuff >();
			dictByDelDepIdx.put( newKeyDelDepIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteDelDep( YCFSecAuthorization Authorization,
		YCFBamDelDepBuff Buff )
	{
		final String S_ProcName = "YCFBamRamDelDepTable.deleteDelDep() ";
		String classCode;
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamDelDepBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteDelDep",
				pkey );
		}
		YCFBamDelDepByDefSchemaIdxKey keyDefSchemaIdx = schema.getFactoryDelDep().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		YCFBamDelDepByDelDepIdxKey keyDelDepIdx = schema.getFactoryDelDep().newDelDepIdxKey();
		keyDelDepIdx.setRequiredRelationTenantId( existing.getRequiredRelationTenantId() );
		keyDelDepIdx.setRequiredRelationId( existing.getRequiredRelationId() );

		// Validate reverse foreign keys

		if( schema.getTableDelSubDep1().readDerivedByIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteDelDep",
				"Superclass",
				"SuperClass",
				"DelSubDep1",
				pkey );
		}

		if( schema.getTableDelSubDep2().readDerivedByIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteDelDep",
				"Superclass",
				"SuperClass",
				"DelSubDep2",
				pkey );
		}

		if( schema.getTableDelSubDep3().readDerivedByIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteDelDep",
				"Superclass",
				"SuperClass",
				"DelSubDep3",
				pkey );
		}

		if( schema.getTableDelTopDep().readDerivedByIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteDelDep",
				"Superclass",
				"SuperClass",
				"DelTopDep",
				pkey );
		}

		// Delete is valid
		Map< YCFBamScopePKey, YCFBamDelDepBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByDefSchemaIdx.get( keyDefSchemaIdx );
		subdict.remove( pkey );

		subdict = dictByDelDepIdx.get( keyDelDepIdx );
		subdict.remove( pkey );

		schema.getTableScope().deleteScope( Authorization,
			Buff );
	}
	public void deleteDelDepByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamDelDepByDefSchemaIdxKey key = schema.getFactoryDelDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deleteDelDepByDefSchemaIdx( Authorization, key );
	}

	public void deleteDelDepByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamDelDepByDefSchemaIdxKey argKey )
	{
		final String S_ProcName = "deleteDelDepByDefSchemaIdx";
		YCFBamDelDepBuff cur;
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
		LinkedList<YCFBamDelDepBuff> matchSet = new LinkedList<YCFBamDelDepBuff>();
		Iterator<YCFBamDelDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamDelDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableDelDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a81a".equals( subClassCode ) ) {
				schema.getTableDelDep().deleteDelDep( Authorization, cur );
			}
			else if( "a81b".equals( subClassCode ) ) {
				schema.getTableDelSubDep1().deleteDelSubDep1( Authorization, (YCFBamDelSubDep1Buff)cur );
			}
			else if( "a81c".equals( subClassCode ) ) {
				schema.getTableDelSubDep2().deleteDelSubDep2( Authorization, (YCFBamDelSubDep2Buff)cur );
			}
			else if( "a81d".equals( subClassCode ) ) {
				schema.getTableDelSubDep3().deleteDelSubDep3( Authorization, (YCFBamDelSubDep3Buff)cur );
			}
			else if( "a81e".equals( subClassCode ) ) {
				schema.getTableDelTopDep().deleteDelTopDep( Authorization, (YCFBamDelTopDepBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of DelDep must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteDelDepByDelDepIdx( YCFSecAuthorization Authorization,
		long argRelationTenantId,
		long argRelationId )
	{
		YCFBamDelDepByDelDepIdxKey key = schema.getFactoryDelDep().newDelDepIdxKey();
		key.setRequiredRelationTenantId( argRelationTenantId );
		key.setRequiredRelationId( argRelationId );
		deleteDelDepByDelDepIdx( Authorization, key );
	}

	public void deleteDelDepByDelDepIdx( YCFSecAuthorization Authorization,
		YCFBamDelDepByDelDepIdxKey argKey )
	{
		final String S_ProcName = "deleteDelDepByDelDepIdx";
		YCFBamDelDepBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamDelDepBuff> matchSet = new LinkedList<YCFBamDelDepBuff>();
		Iterator<YCFBamDelDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamDelDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableDelDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a81a".equals( subClassCode ) ) {
				schema.getTableDelDep().deleteDelDep( Authorization, cur );
			}
			else if( "a81b".equals( subClassCode ) ) {
				schema.getTableDelSubDep1().deleteDelSubDep1( Authorization, (YCFBamDelSubDep1Buff)cur );
			}
			else if( "a81c".equals( subClassCode ) ) {
				schema.getTableDelSubDep2().deleteDelSubDep2( Authorization, (YCFBamDelSubDep2Buff)cur );
			}
			else if( "a81d".equals( subClassCode ) ) {
				schema.getTableDelSubDep3().deleteDelSubDep3( Authorization, (YCFBamDelSubDep3Buff)cur );
			}
			else if( "a81e".equals( subClassCode ) ) {
				schema.getTableDelTopDep().deleteDelTopDep( Authorization, (YCFBamDelTopDepBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of DelDep must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteDelDepByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteDelDepByIdIdx( Authorization, key );
	}

	public void deleteDelDepByIdIdx( YCFSecAuthorization Authorization,
		YCFBamScopePKey argKey )
	{
		final String S_ProcName = "deleteDelDepByIdIdx";
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamDelDepBuff cur;
		LinkedList<YCFBamDelDepBuff> matchSet = new LinkedList<YCFBamDelDepBuff>();
		Iterator<YCFBamDelDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamDelDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableDelDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a81a".equals( subClassCode ) ) {
				schema.getTableDelDep().deleteDelDep( Authorization, cur );
			}
			else if( "a81b".equals( subClassCode ) ) {
				schema.getTableDelSubDep1().deleteDelSubDep1( Authorization, (YCFBamDelSubDep1Buff)cur );
			}
			else if( "a81c".equals( subClassCode ) ) {
				schema.getTableDelSubDep2().deleteDelSubDep2( Authorization, (YCFBamDelSubDep2Buff)cur );
			}
			else if( "a81d".equals( subClassCode ) ) {
				schema.getTableDelSubDep3().deleteDelSubDep3( Authorization, (YCFBamDelSubDep3Buff)cur );
			}
			else if( "a81e".equals( subClassCode ) ) {
				schema.getTableDelTopDep().deleteDelTopDep( Authorization, (YCFBamDelTopDepBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of DelDep must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteDelDepByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamScopeByTenantIdxKey key = schema.getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteDelDepByTenantIdx( Authorization, key );
	}

	public void deleteDelDepByTenantIdx( YCFSecAuthorization Authorization,
		YCFBamScopeByTenantIdxKey argKey )
	{
		final String S_ProcName = "deleteDelDepByTenantIdx";
		YCFBamDelDepBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamDelDepBuff> matchSet = new LinkedList<YCFBamDelDepBuff>();
		Iterator<YCFBamDelDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamDelDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableDelDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a81a".equals( subClassCode ) ) {
				schema.getTableDelDep().deleteDelDep( Authorization, cur );
			}
			else if( "a81b".equals( subClassCode ) ) {
				schema.getTableDelSubDep1().deleteDelSubDep1( Authorization, (YCFBamDelSubDep1Buff)cur );
			}
			else if( "a81c".equals( subClassCode ) ) {
				schema.getTableDelSubDep2().deleteDelSubDep2( Authorization, (YCFBamDelSubDep2Buff)cur );
			}
			else if( "a81d".equals( subClassCode ) ) {
				schema.getTableDelSubDep3().deleteDelSubDep3( Authorization, (YCFBamDelSubDep3Buff)cur );
			}
			else if( "a81e".equals( subClassCode ) ) {
				schema.getTableDelTopDep().deleteDelTopDep( Authorization, (YCFBamDelTopDepBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of DelDep must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void releasePreparedStatements() {
	}
}
