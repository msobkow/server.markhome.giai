
// Description: Java 11 in-memory RAM DbIO implementation for Scope.

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
 *	YCFBamRamScopeTable in-memory RAM DbIO implementation
 *	for Scope.
 */
public class YCFBamRamScopeTable
	implements IYCFBamScopeTable
{
	private IYCFBamSchema schema;
	private Map< YCFBamScopePKey,
				YCFBamScopeBuff > dictByPKey
		= new HashMap< YCFBamScopePKey,
				YCFBamScopeBuff >();
	private Map< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey,
					YCFBamScopeBuff >> dictByTenantIdx
		= new HashMap< YCFBamScopeByTenantIdxKey,
				Map< YCFBamScopePKey,
					YCFBamScopeBuff >>();

	public YCFBamRamScopeTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createScope( YCFSecAuthorization Authorization,
		YCFBamScopeBuff Buff )
	{
		final String S_ProcName = "createScope";
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( ((YCFBamRamTenantTable)schema.getTableTenant()).nextScopeIdGen( Authorization,
			Buff.getRequiredTenantId() ) );
		Buff.setRequiredTenantId( pkey.getRequiredTenantId() );
		Buff.setRequiredId( pkey.getRequiredId() );
		YCFBamScopeByTenantIdxKey keyTenantIdx = schema.getFactoryScope().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		// Validate foreign keys

		{
			boolean allNull = true;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableTenant().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Owner",
						"Tenant",
						"Tenant",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamScopeBuff > subdictTenantIdx;
		if( dictByTenantIdx.containsKey( keyTenantIdx ) ) {
			subdictTenantIdx = dictByTenantIdx.get( keyTenantIdx );
		}
		else {
			subdictTenantIdx = new HashMap< YCFBamScopePKey, YCFBamScopeBuff >();
			dictByTenantIdx.put( keyTenantIdx, subdictTenantIdx );
		}
		subdictTenantIdx.put( pkey, Buff );

	}

	public YCFBamScopeBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamScope.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamScopeBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamScopeBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamScope.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamScopeBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamScopeBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamScope.readAllDerived";
		YCFBamScopeBuff[] retList = new YCFBamScopeBuff[ dictByPKey.values().size() ];
		Iterator< YCFBamScopeBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamScopeBuff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamScope.readDerivedByTenantIdx";
		YCFBamScopeByTenantIdxKey key = schema.getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );

		YCFBamScopeBuff[] recArray;
		if( dictByTenantIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamScopeBuff > subdictTenantIdx
				= dictByTenantIdx.get( key );
			recArray = new YCFBamScopeBuff[ subdictTenantIdx.size() ];
			Iterator< YCFBamScopeBuff > iter = subdictTenantIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamScopeBuff > subdictTenantIdx
				= new HashMap< YCFBamScopePKey, YCFBamScopeBuff >();
			dictByTenantIdx.put( key, subdictTenantIdx );
			recArray = new YCFBamScopeBuff[0];
		}
		return( recArray );
	}

	public YCFBamScopeBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readDerivedByIdIdx() ";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamScopeBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamScopeBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamScope.readBuff";
		YCFBamScopeBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a801" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamScopeBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamScopeBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a801" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamScopeBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamScope.readAllBuff";
		YCFBamScopeBuff buff;
		ArrayList<YCFBamScopeBuff> filteredList = new ArrayList<YCFBamScopeBuff>();
		YCFBamScopeBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamScopeBuff[0] ) );
	}

	public YCFBamScopeBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByIdIdx() ";
		YCFBamScopeBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
			return( (YCFBamScopeBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamScopeBuff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByTenantIdx() ";
		YCFBamScopeBuff buff;
		ArrayList<YCFBamScopeBuff> filteredList = new ArrayList<YCFBamScopeBuff>();
		YCFBamScopeBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
				filteredList.add( (YCFBamScopeBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamScopeBuff[0] ) );
	}

	public void updateScope( YCFSecAuthorization Authorization,
		YCFBamScopeBuff Buff )
	{
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamScopeBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateScope",
				"Existing record not found",
				"Scope",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateScope",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFBamScopeByTenantIdxKey existingKeyTenantIdx = schema.getFactoryScope().newTenantIdxKey();
		existingKeyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFBamScopeByTenantIdxKey newKeyTenantIdx = schema.getFactoryScope().newTenantIdxKey();
		newKeyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		// Check unique indexes

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableTenant().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateScope",
						"Owner",
						"Tenant",
						"Tenant",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamScopePKey, YCFBamScopeBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByTenantIdx.get( existingKeyTenantIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByTenantIdx.containsKey( newKeyTenantIdx ) ) {
			subdict = dictByTenantIdx.get( newKeyTenantIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamScopeBuff >();
			dictByTenantIdx.put( newKeyTenantIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteScope( YCFSecAuthorization Authorization,
		YCFBamScopeBuff Buff )
	{
		final String S_ProcName = "YCFBamRamScopeTable.deleteScope() ";
		String classCode;
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamScopeBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteScope",
				pkey );
		}
		YCFBamScopeByTenantIdxKey keyTenantIdx = schema.getFactoryScope().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		// Validate reverse foreign keys

		if( schema.getTableSchemaDef().readDerivedByIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteScope",
				"Superclass",
				"SuperClass",
				"SchemaDef",
				pkey );
		}

		if( schema.getTableSchemaRef().readDerivedByIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteScope",
				"Superclass",
				"SuperClass",
				"SchemaRef",
				pkey );
		}

		if( schema.getTableServerMethod().readDerivedByIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteScope",
				"Superclass",
				"SuperClass",
				"ServerMethod",
				pkey );
		}

		if( schema.getTableTable().readDerivedByIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteScope",
				"Superclass",
				"SuperClass",
				"Table",
				pkey );
		}

		if( schema.getTableClearDep().readDerivedByIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteScope",
				"Superclass",
				"SuperClass",
				"ClearDep",
				pkey );
		}

		if( schema.getTableDelDep().readDerivedByIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteScope",
				"Superclass",
				"SuperClass",
				"DelDep",
				pkey );
		}

		if( schema.getTableIndex().readDerivedByIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteScope",
				"Superclass",
				"SuperClass",
				"Index",
				pkey );
		}

		if( schema.getTablePopDep().readDerivedByIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteScope",
				"Superclass",
				"SuperClass",
				"PopDep",
				pkey );
		}

		if( schema.getTableRelation().readDerivedByIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteScope",
				"Superclass",
				"SuperClass",
				"Relation",
				pkey );
		}

		// Delete is valid
		Map< YCFBamScopePKey, YCFBamScopeBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByTenantIdx.get( keyTenantIdx );
		subdict.remove( pkey );

	}
	public void deleteScopeByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteScopeByIdIdx( Authorization, key );
	}

	public void deleteScopeByIdIdx( YCFSecAuthorization Authorization,
		YCFBamScopePKey argKey )
	{
		final String S_ProcName = "deleteScopeByIdIdx";
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamScopeBuff cur;
		LinkedList<YCFBamScopeBuff> matchSet = new LinkedList<YCFBamScopeBuff>();
		Iterator<YCFBamScopeBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamScopeBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableScope().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a801".equals( subClassCode ) ) {
				schema.getTableScope().deleteScope( Authorization, cur );
			}
			else if( "a802".equals( subClassCode ) ) {
				schema.getTableSchemaDef().deleteSchemaDef( Authorization, (YCFBamSchemaDefBuff)cur );
			}
			else if( "a803".equals( subClassCode ) ) {
				schema.getTableSchemaRef().deleteSchemaRef( Authorization, (YCFBamSchemaRefBuff)cur );
			}
			else if( "a804".equals( subClassCode ) ) {
				schema.getTableServerMethod().deleteServerMethod( Authorization, (YCFBamServerMethodBuff)cur );
			}
			else if( "a805".equals( subClassCode ) ) {
				schema.getTableServerObjFunc().deleteServerObjFunc( Authorization, (YCFBamServerObjFuncBuff)cur );
			}
			else if( "a806".equals( subClassCode ) ) {
				schema.getTableServerProc().deleteServerProc( Authorization, (YCFBamServerProcBuff)cur );
			}
			else if( "a83a".equals( subClassCode ) ) {
				schema.getTableServerListFunc().deleteServerListFunc( Authorization, (YCFBamServerListFuncBuff)cur );
			}
			else if( "a807".equals( subClassCode ) ) {
				schema.getTableTable().deleteTable( Authorization, (YCFBamTableBuff)cur );
			}
			else if( "a813".equals( subClassCode ) ) {
				schema.getTableClearDep().deleteClearDep( Authorization, (YCFBamClearDepBuff)cur );
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
			else if( "a81a".equals( subClassCode ) ) {
				schema.getTableDelDep().deleteDelDep( Authorization, (YCFBamDelDepBuff)cur );
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
			else if( "a824".equals( subClassCode ) ) {
				schema.getTableIndex().deleteIndex( Authorization, (YCFBamIndexBuff)cur );
			}
			else if( "a833".equals( subClassCode ) ) {
				schema.getTablePopDep().deletePopDep( Authorization, (YCFBamPopDepBuff)cur );
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
			else if( "a838".equals( subClassCode ) ) {
				schema.getTableRelation().deleteRelation( Authorization, (YCFBamRelationBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of Scope must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteScopeByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamScopeByTenantIdxKey key = schema.getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteScopeByTenantIdx( Authorization, key );
	}

	public void deleteScopeByTenantIdx( YCFSecAuthorization Authorization,
		YCFBamScopeByTenantIdxKey argKey )
	{
		final String S_ProcName = "deleteScopeByTenantIdx";
		YCFBamScopeBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamScopeBuff> matchSet = new LinkedList<YCFBamScopeBuff>();
		Iterator<YCFBamScopeBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamScopeBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableScope().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a801".equals( subClassCode ) ) {
				schema.getTableScope().deleteScope( Authorization, cur );
			}
			else if( "a802".equals( subClassCode ) ) {
				schema.getTableSchemaDef().deleteSchemaDef( Authorization, (YCFBamSchemaDefBuff)cur );
			}
			else if( "a803".equals( subClassCode ) ) {
				schema.getTableSchemaRef().deleteSchemaRef( Authorization, (YCFBamSchemaRefBuff)cur );
			}
			else if( "a804".equals( subClassCode ) ) {
				schema.getTableServerMethod().deleteServerMethod( Authorization, (YCFBamServerMethodBuff)cur );
			}
			else if( "a805".equals( subClassCode ) ) {
				schema.getTableServerObjFunc().deleteServerObjFunc( Authorization, (YCFBamServerObjFuncBuff)cur );
			}
			else if( "a806".equals( subClassCode ) ) {
				schema.getTableServerProc().deleteServerProc( Authorization, (YCFBamServerProcBuff)cur );
			}
			else if( "a83a".equals( subClassCode ) ) {
				schema.getTableServerListFunc().deleteServerListFunc( Authorization, (YCFBamServerListFuncBuff)cur );
			}
			else if( "a807".equals( subClassCode ) ) {
				schema.getTableTable().deleteTable( Authorization, (YCFBamTableBuff)cur );
			}
			else if( "a813".equals( subClassCode ) ) {
				schema.getTableClearDep().deleteClearDep( Authorization, (YCFBamClearDepBuff)cur );
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
			else if( "a81a".equals( subClassCode ) ) {
				schema.getTableDelDep().deleteDelDep( Authorization, (YCFBamDelDepBuff)cur );
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
			else if( "a824".equals( subClassCode ) ) {
				schema.getTableIndex().deleteIndex( Authorization, (YCFBamIndexBuff)cur );
			}
			else if( "a833".equals( subClassCode ) ) {
				schema.getTablePopDep().deletePopDep( Authorization, (YCFBamPopDepBuff)cur );
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
			else if( "a838".equals( subClassCode ) ) {
				schema.getTableRelation().deleteRelation( Authorization, (YCFBamRelationBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of Scope must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void releasePreparedStatements() {
	}
}
