
// Description: Java 11 in-memory RAM DbIO implementation for IndexTweak.

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
 *	YCFBamRamIndexTweakTable in-memory RAM DbIO implementation
 *	for IndexTweak.
 */
public class YCFBamRamIndexTweakTable
	implements IYCFBamIndexTweakTable
{
	private IYCFBamSchema schema;
	private Map< YCFBamTweakPKey,
				YCFBamIndexTweakBuff > dictByPKey
		= new HashMap< YCFBamTweakPKey,
				YCFBamIndexTweakBuff >();
	private Map< YCFBamIndexTweakByIndexIdxKey,
				Map< YCFBamTweakPKey,
					YCFBamIndexTweakBuff >> dictByIndexIdx
		= new HashMap< YCFBamIndexTweakByIndexIdxKey,
				Map< YCFBamTweakPKey,
					YCFBamIndexTweakBuff >>();

	public YCFBamRamIndexTweakTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createIndexTweak( YCFSecAuthorization Authorization,
		YCFBamIndexTweakBuff Buff )
	{
		final String S_ProcName = "createIndexTweak";
		schema.getTableTweak().createTweak( Authorization,
			Buff );
		YCFBamTweakPKey pkey = schema.getFactoryTweak().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamIndexTweakByIndexIdxKey keyIndexIdx = schema.getFactoryIndexTweak().newIndexIdxKey();
		keyIndexIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyIndexIdx.setRequiredIndexId( Buff.getRequiredIndexId() );

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
				if( null == schema.getTableTweak().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Superclass",
						"SuperClass",
						"Tweak",
						null );
				}
			}
		}

		{
			boolean allNull = true;
			allNull = false;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableIndex().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredIndexId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"Index",
						"Index",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFBamTweakPKey, YCFBamIndexTweakBuff > subdictIndexIdx;
		if( dictByIndexIdx.containsKey( keyIndexIdx ) ) {
			subdictIndexIdx = dictByIndexIdx.get( keyIndexIdx );
		}
		else {
			subdictIndexIdx = new HashMap< YCFBamTweakPKey, YCFBamIndexTweakBuff >();
			dictByIndexIdx.put( keyIndexIdx, subdictIndexIdx );
		}
		subdictIndexIdx.put( pkey, Buff );

	}

	public YCFBamIndexTweakBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamTweakPKey PKey )
	{
		final String S_ProcName = "YCFBamRamIndexTweak.readDerived";
		YCFBamTweakPKey key = schema.getFactoryTweak().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamIndexTweakBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamIndexTweakBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamTweakPKey PKey )
	{
		final String S_ProcName = "YCFBamRamIndexTweak.readDerived";
		YCFBamTweakPKey key = schema.getFactoryTweak().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamIndexTweakBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamIndexTweakBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamIndexTweak.readAllDerived";
		YCFBamIndexTweakBuff[] retList = new YCFBamIndexTweakBuff[ dictByPKey.values().size() ];
		Iterator< YCFBamIndexTweakBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamIndexTweakBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamTweak.readDerivedByUNameIdx";
		YCFBamTweakBuff buff = schema.getTableTweak().readDerivedByUNameIdx( Authorization,
			TenantId,
			ScopeId,
			Name );
		if( buff == null ) {
			return( null );
		}
		else if( buff instanceof YCFBamIndexTweakBuff ) {
			return( (YCFBamIndexTweakBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamIndexTweakBuff readDerivedByUDefIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamTweak.readDerivedByUDefIdx";
		YCFBamTweakBuff buff = schema.getTableTweak().readDerivedByUDefIdx( Authorization,
			TenantId,
			ScopeId,
			DefSchemaTenantId,
			DefSchemaId,
			Name );
		if( buff == null ) {
			return( null );
		}
		else if( buff instanceof YCFBamIndexTweakBuff ) {
			return( (YCFBamIndexTweakBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamIndexTweakBuff[] readDerivedByValTentIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamTweak.readDerivedByValTentIdx";
		YCFBamTweakBuff buffList[] = schema.getTableTweak().readDerivedByValTentIdx( Authorization,
			TenantId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFBamTweakBuff buff;
			ArrayList<YCFBamIndexTweakBuff> filteredList = new ArrayList<YCFBamIndexTweakBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamIndexTweakBuff ) ) {
					filteredList.add( (YCFBamIndexTweakBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamIndexTweakBuff[0] ) );
		}
	}

	public YCFBamIndexTweakBuff[] readDerivedByScopeIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "YCFBamRamTweak.readDerivedByScopeIdx";
		YCFBamTweakBuff buffList[] = schema.getTableTweak().readDerivedByScopeIdx( Authorization,
			TenantId,
			ScopeId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFBamTweakBuff buff;
			ArrayList<YCFBamIndexTweakBuff> filteredList = new ArrayList<YCFBamIndexTweakBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamIndexTweakBuff ) ) {
					filteredList.add( (YCFBamIndexTweakBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamIndexTweakBuff[0] ) );
		}
	}

	public YCFBamIndexTweakBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamTweak.readDerivedByDefSchemaIdx";
		YCFBamTweakBuff buffList[] = schema.getTableTweak().readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFBamTweakBuff buff;
			ArrayList<YCFBamIndexTweakBuff> filteredList = new ArrayList<YCFBamIndexTweakBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamIndexTweakBuff ) ) {
					filteredList.add( (YCFBamIndexTweakBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamIndexTweakBuff[0] ) );
		}
	}

	public YCFBamIndexTweakBuff[] readDerivedByIndexIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long IndexId )
	{
		final String S_ProcName = "YCFBamRamIndexTweak.readDerivedByIndexIdx";
		YCFBamIndexTweakByIndexIdxKey key = schema.getFactoryIndexTweak().newIndexIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );

		YCFBamIndexTweakBuff[] recArray;
		if( dictByIndexIdx.containsKey( key ) ) {
			Map< YCFBamTweakPKey, YCFBamIndexTweakBuff > subdictIndexIdx
				= dictByIndexIdx.get( key );
			recArray = new YCFBamIndexTweakBuff[ subdictIndexIdx.size() ];
			Iterator< YCFBamIndexTweakBuff > iter = subdictIndexIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamTweakPKey, YCFBamIndexTweakBuff > subdictIndexIdx
				= new HashMap< YCFBamTweakPKey, YCFBamIndexTweakBuff >();
			dictByIndexIdx.put( key, subdictIndexIdx );
			recArray = new YCFBamIndexTweakBuff[0];
		}
		return( recArray );
	}

	public YCFBamIndexTweakBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamTweak.readDerivedByIdIdx() ";
		YCFBamTweakPKey key = schema.getFactoryTweak().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamIndexTweakBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamIndexTweakBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamTweakPKey PKey )
	{
		final String S_ProcName = "YCFBamRamIndexTweak.readBuff";
		YCFBamIndexTweakBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a80b" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamIndexTweakBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamTweakPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamIndexTweakBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a80b" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamIndexTweakBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamIndexTweak.readAllBuff";
		YCFBamIndexTweakBuff buff;
		ArrayList<YCFBamIndexTweakBuff> filteredList = new ArrayList<YCFBamIndexTweakBuff>();
		YCFBamIndexTweakBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a80b" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamIndexTweakBuff[0] ) );
	}

	public YCFBamIndexTweakBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamTweak.readBuffByIdIdx() ";
		YCFBamIndexTweakBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a808" ) ) {
			return( (YCFBamIndexTweakBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamIndexTweakBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamTweak.readBuffByUNameIdx() ";
		YCFBamIndexTweakBuff buff = readDerivedByUNameIdx( Authorization,
			TenantId,
			ScopeId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a808" ) ) {
			return( (YCFBamIndexTweakBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamIndexTweakBuff readBuffByUDefIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamTweak.readBuffByUDefIdx() ";
		YCFBamIndexTweakBuff buff = readDerivedByUDefIdx( Authorization,
			TenantId,
			ScopeId,
			DefSchemaTenantId,
			DefSchemaId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a808" ) ) {
			return( (YCFBamIndexTweakBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamIndexTweakBuff[] readBuffByValTentIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamTweak.readBuffByValTentIdx() ";
		YCFBamIndexTweakBuff buff;
		ArrayList<YCFBamIndexTweakBuff> filteredList = new ArrayList<YCFBamIndexTweakBuff>();
		YCFBamIndexTweakBuff[] buffList = readDerivedByValTentIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a808" ) ) {
				filteredList.add( (YCFBamIndexTweakBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamIndexTweakBuff[0] ) );
	}

	public YCFBamIndexTweakBuff[] readBuffByScopeIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "YCFBamRamTweak.readBuffByScopeIdx() ";
		YCFBamIndexTweakBuff buff;
		ArrayList<YCFBamIndexTweakBuff> filteredList = new ArrayList<YCFBamIndexTweakBuff>();
		YCFBamIndexTweakBuff[] buffList = readDerivedByScopeIdx( Authorization,
			TenantId,
			ScopeId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a808" ) ) {
				filteredList.add( (YCFBamIndexTweakBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamIndexTweakBuff[0] ) );
	}

	public YCFBamIndexTweakBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamTweak.readBuffByDefSchemaIdx() ";
		YCFBamIndexTweakBuff buff;
		ArrayList<YCFBamIndexTweakBuff> filteredList = new ArrayList<YCFBamIndexTweakBuff>();
		YCFBamIndexTweakBuff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a808" ) ) {
				filteredList.add( (YCFBamIndexTweakBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamIndexTweakBuff[0] ) );
	}

	public YCFBamIndexTweakBuff[] readBuffByIndexIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long IndexId )
	{
		final String S_ProcName = "YCFBamRamIndexTweak.readBuffByIndexIdx() ";
		YCFBamIndexTweakBuff buff;
		ArrayList<YCFBamIndexTweakBuff> filteredList = new ArrayList<YCFBamIndexTweakBuff>();
		YCFBamIndexTweakBuff[] buffList = readDerivedByIndexIdx( Authorization,
			TenantId,
			IndexId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a80b" ) ) {
				filteredList.add( (YCFBamIndexTweakBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamIndexTweakBuff[0] ) );
	}

	/**
	 *	Read a page array of the specific IndexTweak buffer instances identified by the duplicate key IndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	argIndexId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamIndexTweakBuff[] pageBuffByIndexIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long IndexId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByIndexIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateIndexTweak( YCFSecAuthorization Authorization,
		YCFBamIndexTweakBuff Buff )
	{
		schema.getTableTweak().updateTweak( Authorization,
			Buff );
		YCFBamTweakPKey pkey = schema.getFactoryTweak().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamIndexTweakBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateIndexTweak",
				"Existing record not found",
				"IndexTweak",
				pkey );
		}
		YCFBamIndexTweakByIndexIdxKey existingKeyIndexIdx = schema.getFactoryIndexTweak().newIndexIdxKey();
		existingKeyIndexIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyIndexIdx.setRequiredIndexId( existing.getRequiredIndexId() );

		YCFBamIndexTweakByIndexIdxKey newKeyIndexIdx = schema.getFactoryIndexTweak().newIndexIdxKey();
		newKeyIndexIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyIndexIdx.setRequiredIndexId( Buff.getRequiredIndexId() );

		// Check unique indexes

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableTweak().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateIndexTweak",
						"Superclass",
						"SuperClass",
						"Tweak",
						null );
				}
			}
		}

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableIndex().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredIndexId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateIndexTweak",
						"Container",
						"Index",
						"Index",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamTweakPKey, YCFBamIndexTweakBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByIndexIdx.get( existingKeyIndexIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByIndexIdx.containsKey( newKeyIndexIdx ) ) {
			subdict = dictByIndexIdx.get( newKeyIndexIdx );
		}
		else {
			subdict = new HashMap< YCFBamTweakPKey, YCFBamIndexTweakBuff >();
			dictByIndexIdx.put( newKeyIndexIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteIndexTweak( YCFSecAuthorization Authorization,
		YCFBamIndexTweakBuff Buff )
	{
		final String S_ProcName = "YCFBamRamIndexTweakTable.deleteIndexTweak() ";
		String classCode;
		YCFBamTweakPKey pkey = schema.getFactoryTweak().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamIndexTweakBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteIndexTweak",
				pkey );
		}
		YCFBamIndexTweakByIndexIdxKey keyIndexIdx = schema.getFactoryIndexTweak().newIndexIdxKey();
		keyIndexIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyIndexIdx.setRequiredIndexId( existing.getRequiredIndexId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFBamTweakPKey, YCFBamIndexTweakBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByIndexIdx.get( keyIndexIdx );
		subdict.remove( pkey );

		schema.getTableTweak().deleteTweak( Authorization,
			Buff );
	}
	public void deleteIndexTweakByIndexIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argIndexId )
	{
		YCFBamIndexTweakByIndexIdxKey key = schema.getFactoryIndexTweak().newIndexIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredIndexId( argIndexId );
		deleteIndexTweakByIndexIdx( Authorization, key );
	}

	public void deleteIndexTweakByIndexIdx( YCFSecAuthorization Authorization,
		YCFBamIndexTweakByIndexIdxKey argKey )
	{
		YCFBamIndexTweakBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamIndexTweakBuff> matchSet = new LinkedList<YCFBamIndexTweakBuff>();
		Iterator<YCFBamIndexTweakBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamIndexTweakBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableIndexTweak().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteIndexTweak( Authorization, cur );
		}
	}

	public void deleteIndexTweakByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamTweakPKey key = schema.getFactoryTweak().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteIndexTweakByIdIdx( Authorization, key );
	}

	public void deleteIndexTweakByIdIdx( YCFSecAuthorization Authorization,
		YCFBamTweakPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamIndexTweakBuff cur;
		LinkedList<YCFBamIndexTweakBuff> matchSet = new LinkedList<YCFBamIndexTweakBuff>();
		Iterator<YCFBamIndexTweakBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamIndexTweakBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableIndexTweak().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteIndexTweak( Authorization, cur );
		}
	}

	public void deleteIndexTweakByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		String argName )
	{
		YCFBamTweakByUNameIdxKey key = schema.getFactoryTweak().newUNameIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredScopeId( argScopeId );
		key.setRequiredName( argName );
		deleteIndexTweakByUNameIdx( Authorization, key );
	}

	public void deleteIndexTweakByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamTweakByUNameIdxKey argKey )
	{
		YCFBamIndexTweakBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamIndexTweakBuff> matchSet = new LinkedList<YCFBamIndexTweakBuff>();
		Iterator<YCFBamIndexTweakBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamIndexTweakBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableIndexTweak().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteIndexTweak( Authorization, cur );
		}
	}

	public void deleteIndexTweakByUDefIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		Long argDefSchemaTenantId,
		Long argDefSchemaId,
		String argName )
	{
		YCFBamTweakByUDefIdxKey key = schema.getFactoryTweak().newUDefIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredScopeId( argScopeId );
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		key.setRequiredName( argName );
		deleteIndexTweakByUDefIdx( Authorization, key );
	}

	public void deleteIndexTweakByUDefIdx( YCFSecAuthorization Authorization,
		YCFBamTweakByUDefIdxKey argKey )
	{
		YCFBamIndexTweakBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( argKey.getOptionalDefSchemaTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalDefSchemaId() != null ) {
			anyNotNull = true;
		}
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamIndexTweakBuff> matchSet = new LinkedList<YCFBamIndexTweakBuff>();
		Iterator<YCFBamIndexTweakBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamIndexTweakBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableIndexTweak().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteIndexTweak( Authorization, cur );
		}
	}

	public void deleteIndexTweakByValTentIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamTweakByValTentIdxKey key = schema.getFactoryTweak().newValTentIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteIndexTweakByValTentIdx( Authorization, key );
	}

	public void deleteIndexTweakByValTentIdx( YCFSecAuthorization Authorization,
		YCFBamTweakByValTentIdxKey argKey )
	{
		YCFBamIndexTweakBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamIndexTweakBuff> matchSet = new LinkedList<YCFBamIndexTweakBuff>();
		Iterator<YCFBamIndexTweakBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamIndexTweakBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableIndexTweak().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteIndexTweak( Authorization, cur );
		}
	}

	public void deleteIndexTweakByScopeIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId )
	{
		YCFBamTweakByScopeIdxKey key = schema.getFactoryTweak().newScopeIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredScopeId( argScopeId );
		deleteIndexTweakByScopeIdx( Authorization, key );
	}

	public void deleteIndexTweakByScopeIdx( YCFSecAuthorization Authorization,
		YCFBamTweakByScopeIdxKey argKey )
	{
		YCFBamIndexTweakBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamIndexTweakBuff> matchSet = new LinkedList<YCFBamIndexTweakBuff>();
		Iterator<YCFBamIndexTweakBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamIndexTweakBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableIndexTweak().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteIndexTweak( Authorization, cur );
		}
	}

	public void deleteIndexTweakByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamTweakByDefSchemaIdxKey key = schema.getFactoryTweak().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deleteIndexTweakByDefSchemaIdx( Authorization, key );
	}

	public void deleteIndexTweakByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamTweakByDefSchemaIdxKey argKey )
	{
		YCFBamIndexTweakBuff cur;
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
		LinkedList<YCFBamIndexTweakBuff> matchSet = new LinkedList<YCFBamIndexTweakBuff>();
		Iterator<YCFBamIndexTweakBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamIndexTweakBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableIndexTweak().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteIndexTweak( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
