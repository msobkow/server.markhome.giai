
// Description: Java 11 in-memory RAM DbIO implementation for PopDep.

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
 *	YCFBamRamPopDepTable in-memory RAM DbIO implementation
 *	for PopDep.
 */
public class YCFBamRamPopDepTable
	implements IYCFBamPopDepTable
{
	private IYCFBamSchema schema;
	private Map< YCFBamScopePKey,
				YCFBamPopDepBuff > dictByPKey
		= new HashMap< YCFBamScopePKey,
				YCFBamPopDepBuff >();
	private Map< YCFBamPopDepByRelationIdxKey,
				Map< YCFBamScopePKey,
					YCFBamPopDepBuff >> dictByRelationIdx
		= new HashMap< YCFBamPopDepByRelationIdxKey,
				Map< YCFBamScopePKey,
					YCFBamPopDepBuff >>();
	private Map< YCFBamPopDepByDefSchemaIdxKey,
				Map< YCFBamScopePKey,
					YCFBamPopDepBuff >> dictByDefSchemaIdx
		= new HashMap< YCFBamPopDepByDefSchemaIdxKey,
				Map< YCFBamScopePKey,
					YCFBamPopDepBuff >>();

	public YCFBamRamPopDepTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createPopDep( YCFSecAuthorization Authorization,
		YCFBamPopDepBuff Buff )
	{
		final String S_ProcName = "createPopDep";
		schema.getTableScope().createScope( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamPopDepByRelationIdxKey keyRelationIdx = schema.getFactoryPopDep().newRelationIdxKey();
		keyRelationIdx.setRequiredRelationTenantId( Buff.getRequiredRelationTenantId() );
		keyRelationIdx.setRequiredRelationId( Buff.getRequiredRelationId() );

		YCFBamPopDepByDefSchemaIdxKey keyDefSchemaIdx = schema.getFactoryPopDep().newDefSchemaIdxKey();
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

		Map< YCFBamScopePKey, YCFBamPopDepBuff > subdictRelationIdx;
		if( dictByRelationIdx.containsKey( keyRelationIdx ) ) {
			subdictRelationIdx = dictByRelationIdx.get( keyRelationIdx );
		}
		else {
			subdictRelationIdx = new HashMap< YCFBamScopePKey, YCFBamPopDepBuff >();
			dictByRelationIdx.put( keyRelationIdx, subdictRelationIdx );
		}
		subdictRelationIdx.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamPopDepBuff > subdictDefSchemaIdx;
		if( dictByDefSchemaIdx.containsKey( keyDefSchemaIdx ) ) {
			subdictDefSchemaIdx = dictByDefSchemaIdx.get( keyDefSchemaIdx );
		}
		else {
			subdictDefSchemaIdx = new HashMap< YCFBamScopePKey, YCFBamPopDepBuff >();
			dictByDefSchemaIdx.put( keyDefSchemaIdx, subdictDefSchemaIdx );
		}
		subdictDefSchemaIdx.put( pkey, Buff );

	}

	public YCFBamPopDepBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamPopDep.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamPopDepBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamPopDepBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamPopDep.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamPopDepBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamPopDepBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamPopDep.readAllDerived";
		YCFBamPopDepBuff[] retList = new YCFBamPopDepBuff[ dictByPKey.values().size() ];
		Iterator< YCFBamPopDepBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamPopDepBuff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamPopDepBuff> filteredList = new ArrayList<YCFBamPopDepBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamPopDepBuff ) ) {
					filteredList.add( (YCFBamPopDepBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamPopDepBuff[0] ) );
		}
	}

	public YCFBamPopDepBuff[] readDerivedByRelationIdx( YCFSecAuthorization Authorization,
		long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "YCFBamRamPopDep.readDerivedByRelationIdx";
		YCFBamPopDepByRelationIdxKey key = schema.getFactoryPopDep().newRelationIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );

		YCFBamPopDepBuff[] recArray;
		if( dictByRelationIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamPopDepBuff > subdictRelationIdx
				= dictByRelationIdx.get( key );
			recArray = new YCFBamPopDepBuff[ subdictRelationIdx.size() ];
			Iterator< YCFBamPopDepBuff > iter = subdictRelationIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamPopDepBuff > subdictRelationIdx
				= new HashMap< YCFBamScopePKey, YCFBamPopDepBuff >();
			dictByRelationIdx.put( key, subdictRelationIdx );
			recArray = new YCFBamPopDepBuff[0];
		}
		return( recArray );
	}

	public YCFBamPopDepBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamPopDep.readDerivedByDefSchemaIdx";
		YCFBamPopDepByDefSchemaIdxKey key = schema.getFactoryPopDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );

		YCFBamPopDepBuff[] recArray;
		if( dictByDefSchemaIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamPopDepBuff > subdictDefSchemaIdx
				= dictByDefSchemaIdx.get( key );
			recArray = new YCFBamPopDepBuff[ subdictDefSchemaIdx.size() ];
			Iterator< YCFBamPopDepBuff > iter = subdictDefSchemaIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamPopDepBuff > subdictDefSchemaIdx
				= new HashMap< YCFBamScopePKey, YCFBamPopDepBuff >();
			dictByDefSchemaIdx.put( key, subdictDefSchemaIdx );
			recArray = new YCFBamPopDepBuff[0];
		}
		return( recArray );
	}

	public YCFBamPopDepBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readDerivedByIdIdx() ";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamPopDepBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamPopDepBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamPopDep.readBuff";
		YCFBamPopDepBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a833" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamPopDepBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamPopDepBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a833" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamPopDepBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamPopDep.readAllBuff";
		YCFBamPopDepBuff buff;
		ArrayList<YCFBamPopDepBuff> filteredList = new ArrayList<YCFBamPopDepBuff>();
		YCFBamPopDepBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a833" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamPopDepBuff[0] ) );
	}

	public YCFBamPopDepBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByIdIdx() ";
		YCFBamPopDepBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
			return( (YCFBamPopDepBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamPopDepBuff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByTenantIdx() ";
		YCFBamPopDepBuff buff;
		ArrayList<YCFBamPopDepBuff> filteredList = new ArrayList<YCFBamPopDepBuff>();
		YCFBamPopDepBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
				filteredList.add( (YCFBamPopDepBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamPopDepBuff[0] ) );
	}

	public YCFBamPopDepBuff[] readBuffByRelationIdx( YCFSecAuthorization Authorization,
		long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "YCFBamRamPopDep.readBuffByRelationIdx() ";
		YCFBamPopDepBuff buff;
		ArrayList<YCFBamPopDepBuff> filteredList = new ArrayList<YCFBamPopDepBuff>();
		YCFBamPopDepBuff[] buffList = readDerivedByRelationIdx( Authorization,
			RelationTenantId,
			RelationId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a833" ) ) {
				filteredList.add( (YCFBamPopDepBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamPopDepBuff[0] ) );
	}

	public YCFBamPopDepBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamPopDep.readBuffByDefSchemaIdx() ";
		YCFBamPopDepBuff buff;
		ArrayList<YCFBamPopDepBuff> filteredList = new ArrayList<YCFBamPopDepBuff>();
		YCFBamPopDepBuff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a833" ) ) {
				filteredList.add( (YCFBamPopDepBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamPopDepBuff[0] ) );
	}

	/**
	 *	Read a page array of the specific PopDep buffer instances identified by the duplicate key RelationIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRelationTenantId	The PopDep key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The PopDep key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamPopDepBuff[] pageBuffByRelationIdx( YCFSecAuthorization Authorization,
		long RelationTenantId,
		long RelationId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByRelationIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific PopDep buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The PopDep key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The PopDep key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamPopDepBuff[] pageBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByDefSchemaIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updatePopDep( YCFSecAuthorization Authorization,
		YCFBamPopDepBuff Buff )
	{
		schema.getTableScope().updateScope( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamPopDepBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updatePopDep",
				"Existing record not found",
				"PopDep",
				pkey );
		}
		YCFBamPopDepByRelationIdxKey existingKeyRelationIdx = schema.getFactoryPopDep().newRelationIdxKey();
		existingKeyRelationIdx.setRequiredRelationTenantId( existing.getRequiredRelationTenantId() );
		existingKeyRelationIdx.setRequiredRelationId( existing.getRequiredRelationId() );

		YCFBamPopDepByRelationIdxKey newKeyRelationIdx = schema.getFactoryPopDep().newRelationIdxKey();
		newKeyRelationIdx.setRequiredRelationTenantId( Buff.getRequiredRelationTenantId() );
		newKeyRelationIdx.setRequiredRelationId( Buff.getRequiredRelationId() );

		YCFBamPopDepByDefSchemaIdxKey existingKeyDefSchemaIdx = schema.getFactoryPopDep().newDefSchemaIdxKey();
		existingKeyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		existingKeyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		YCFBamPopDepByDefSchemaIdxKey newKeyDefSchemaIdx = schema.getFactoryPopDep().newDefSchemaIdxKey();
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
						"updatePopDep",
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
						"updatePopDep",
						"Lookup",
						"Relation",
						"Relation",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamScopePKey, YCFBamPopDepBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByRelationIdx.get( existingKeyRelationIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByRelationIdx.containsKey( newKeyRelationIdx ) ) {
			subdict = dictByRelationIdx.get( newKeyRelationIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamPopDepBuff >();
			dictByRelationIdx.put( newKeyRelationIdx, subdict );
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
			subdict = new HashMap< YCFBamScopePKey, YCFBamPopDepBuff >();
			dictByDefSchemaIdx.put( newKeyDefSchemaIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deletePopDep( YCFSecAuthorization Authorization,
		YCFBamPopDepBuff Buff )
	{
		final String S_ProcName = "YCFBamRamPopDepTable.deletePopDep() ";
		String classCode;
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamPopDepBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deletePopDep",
				pkey );
		}
		YCFBamPopDepByRelationIdxKey keyRelationIdx = schema.getFactoryPopDep().newRelationIdxKey();
		keyRelationIdx.setRequiredRelationTenantId( existing.getRequiredRelationTenantId() );
		keyRelationIdx.setRequiredRelationId( existing.getRequiredRelationId() );

		YCFBamPopDepByDefSchemaIdxKey keyDefSchemaIdx = schema.getFactoryPopDep().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		// Validate reverse foreign keys

		if( schema.getTablePopSubDep1().readDerivedByIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deletePopDep",
				"Superclass",
				"SuperClass",
				"PopSubDep1",
				pkey );
		}

		if( schema.getTablePopSubDep2().readDerivedByIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deletePopDep",
				"Superclass",
				"SuperClass",
				"PopSubDep2",
				pkey );
		}

		if( schema.getTablePopSubDep3().readDerivedByIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deletePopDep",
				"Superclass",
				"SuperClass",
				"PopSubDep3",
				pkey );
		}

		if( schema.getTablePopTopDep().readDerivedByIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deletePopDep",
				"Superclass",
				"SuperClass",
				"PopTopDep",
				pkey );
		}

		// Delete is valid
		Map< YCFBamScopePKey, YCFBamPopDepBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByRelationIdx.get( keyRelationIdx );
		subdict.remove( pkey );

		subdict = dictByDefSchemaIdx.get( keyDefSchemaIdx );
		subdict.remove( pkey );

		schema.getTableScope().deleteScope( Authorization,
			Buff );
	}
	public void deletePopDepByRelationIdx( YCFSecAuthorization Authorization,
		long argRelationTenantId,
		long argRelationId )
	{
		YCFBamPopDepByRelationIdxKey key = schema.getFactoryPopDep().newRelationIdxKey();
		key.setRequiredRelationTenantId( argRelationTenantId );
		key.setRequiredRelationId( argRelationId );
		deletePopDepByRelationIdx( Authorization, key );
	}

	public void deletePopDepByRelationIdx( YCFSecAuthorization Authorization,
		YCFBamPopDepByRelationIdxKey argKey )
	{
		final String S_ProcName = "deletePopDepByRelationIdx";
		YCFBamPopDepBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamPopDepBuff> matchSet = new LinkedList<YCFBamPopDepBuff>();
		Iterator<YCFBamPopDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamPopDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTablePopDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a833".equals( subClassCode ) ) {
				schema.getTablePopDep().deletePopDep( Authorization, cur );
			}
			else if( "a834".equals( subClassCode ) ) {
				schema.getTablePopSubDep1().deletePopSubDep1( Authorization, (YCFBamPopSubDep1Buff)cur );
			}
			else if( "a835".equals( subClassCode ) ) {
				schema.getTablePopSubDep2().deletePopSubDep2( Authorization, (YCFBamPopSubDep2Buff)cur );
			}
			else if( "a836".equals( subClassCode ) ) {
				schema.getTablePopSubDep3().deletePopSubDep3( Authorization, (YCFBamPopSubDep3Buff)cur );
			}
			else if( "a837".equals( subClassCode ) ) {
				schema.getTablePopTopDep().deletePopTopDep( Authorization, (YCFBamPopTopDepBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of PopDep must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deletePopDepByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamPopDepByDefSchemaIdxKey key = schema.getFactoryPopDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deletePopDepByDefSchemaIdx( Authorization, key );
	}

	public void deletePopDepByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamPopDepByDefSchemaIdxKey argKey )
	{
		final String S_ProcName = "deletePopDepByDefSchemaIdx";
		YCFBamPopDepBuff cur;
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
		LinkedList<YCFBamPopDepBuff> matchSet = new LinkedList<YCFBamPopDepBuff>();
		Iterator<YCFBamPopDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamPopDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTablePopDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a833".equals( subClassCode ) ) {
				schema.getTablePopDep().deletePopDep( Authorization, cur );
			}
			else if( "a834".equals( subClassCode ) ) {
				schema.getTablePopSubDep1().deletePopSubDep1( Authorization, (YCFBamPopSubDep1Buff)cur );
			}
			else if( "a835".equals( subClassCode ) ) {
				schema.getTablePopSubDep2().deletePopSubDep2( Authorization, (YCFBamPopSubDep2Buff)cur );
			}
			else if( "a836".equals( subClassCode ) ) {
				schema.getTablePopSubDep3().deletePopSubDep3( Authorization, (YCFBamPopSubDep3Buff)cur );
			}
			else if( "a837".equals( subClassCode ) ) {
				schema.getTablePopTopDep().deletePopTopDep( Authorization, (YCFBamPopTopDepBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of PopDep must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deletePopDepByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deletePopDepByIdIdx( Authorization, key );
	}

	public void deletePopDepByIdIdx( YCFSecAuthorization Authorization,
		YCFBamScopePKey argKey )
	{
		final String S_ProcName = "deletePopDepByIdIdx";
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamPopDepBuff cur;
		LinkedList<YCFBamPopDepBuff> matchSet = new LinkedList<YCFBamPopDepBuff>();
		Iterator<YCFBamPopDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamPopDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTablePopDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a833".equals( subClassCode ) ) {
				schema.getTablePopDep().deletePopDep( Authorization, cur );
			}
			else if( "a834".equals( subClassCode ) ) {
				schema.getTablePopSubDep1().deletePopSubDep1( Authorization, (YCFBamPopSubDep1Buff)cur );
			}
			else if( "a835".equals( subClassCode ) ) {
				schema.getTablePopSubDep2().deletePopSubDep2( Authorization, (YCFBamPopSubDep2Buff)cur );
			}
			else if( "a836".equals( subClassCode ) ) {
				schema.getTablePopSubDep3().deletePopSubDep3( Authorization, (YCFBamPopSubDep3Buff)cur );
			}
			else if( "a837".equals( subClassCode ) ) {
				schema.getTablePopTopDep().deletePopTopDep( Authorization, (YCFBamPopTopDepBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of PopDep must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deletePopDepByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamScopeByTenantIdxKey key = schema.getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deletePopDepByTenantIdx( Authorization, key );
	}

	public void deletePopDepByTenantIdx( YCFSecAuthorization Authorization,
		YCFBamScopeByTenantIdxKey argKey )
	{
		final String S_ProcName = "deletePopDepByTenantIdx";
		YCFBamPopDepBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamPopDepBuff> matchSet = new LinkedList<YCFBamPopDepBuff>();
		Iterator<YCFBamPopDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamPopDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTablePopDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a833".equals( subClassCode ) ) {
				schema.getTablePopDep().deletePopDep( Authorization, cur );
			}
			else if( "a834".equals( subClassCode ) ) {
				schema.getTablePopSubDep1().deletePopSubDep1( Authorization, (YCFBamPopSubDep1Buff)cur );
			}
			else if( "a835".equals( subClassCode ) ) {
				schema.getTablePopSubDep2().deletePopSubDep2( Authorization, (YCFBamPopSubDep2Buff)cur );
			}
			else if( "a836".equals( subClassCode ) ) {
				schema.getTablePopSubDep3().deletePopSubDep3( Authorization, (YCFBamPopSubDep3Buff)cur );
			}
			else if( "a837".equals( subClassCode ) ) {
				schema.getTablePopTopDep().deletePopTopDep( Authorization, (YCFBamPopTopDepBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of PopDep must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void releasePreparedStatements() {
	}
}
