
// Description: Java 11 in-memory RAM DbIO implementation for TableTweak.

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
 *	YCFBamRamTableTweakTable in-memory RAM DbIO implementation
 *	for TableTweak.
 */
public class YCFBamRamTableTweakTable
	implements IYCFBamTableTweakTable
{
	private IYCFBamSchema schema;
	private Map< YCFBamTweakPKey,
				YCFBamTableTweakBuff > dictByPKey
		= new HashMap< YCFBamTweakPKey,
				YCFBamTableTweakBuff >();
	private Map< YCFBamTableTweakByTableIdxKey,
				Map< YCFBamTweakPKey,
					YCFBamTableTweakBuff >> dictByTableIdx
		= new HashMap< YCFBamTableTweakByTableIdxKey,
				Map< YCFBamTweakPKey,
					YCFBamTableTweakBuff >>();

	public YCFBamRamTableTweakTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createTableTweak( YCFSecAuthorization Authorization,
		YCFBamTableTweakBuff Buff )
	{
		final String S_ProcName = "createTableTweak";
		schema.getTableTweak().createTweak( Authorization,
			Buff );
		YCFBamTweakPKey pkey = schema.getFactoryTweak().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamTableTweakByTableIdxKey keyTableIdx = schema.getFactoryTableTweak().newTableIdxKey();
		keyTableIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyTableIdx.setRequiredTableId( Buff.getRequiredTableId() );

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
				if( null == schema.getTableTable().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredTableId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"Table",
						"Table",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFBamTweakPKey, YCFBamTableTweakBuff > subdictTableIdx;
		if( dictByTableIdx.containsKey( keyTableIdx ) ) {
			subdictTableIdx = dictByTableIdx.get( keyTableIdx );
		}
		else {
			subdictTableIdx = new HashMap< YCFBamTweakPKey, YCFBamTableTweakBuff >();
			dictByTableIdx.put( keyTableIdx, subdictTableIdx );
		}
		subdictTableIdx.put( pkey, Buff );

	}

	public YCFBamTableTweakBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamTweakPKey PKey )
	{
		final String S_ProcName = "YCFBamRamTableTweak.readDerived";
		YCFBamTweakPKey key = schema.getFactoryTweak().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamTableTweakBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamTableTweakBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamTweakPKey PKey )
	{
		final String S_ProcName = "YCFBamRamTableTweak.readDerived";
		YCFBamTweakPKey key = schema.getFactoryTweak().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamTableTweakBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamTableTweakBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamTableTweak.readAllDerived";
		YCFBamTableTweakBuff[] retList = new YCFBamTableTweakBuff[ dictByPKey.values().size() ];
		Iterator< YCFBamTableTweakBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamTableTweakBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
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
		else if( buff instanceof YCFBamTableTweakBuff ) {
			return( (YCFBamTableTweakBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamTableTweakBuff readDerivedByUDefIdx( YCFSecAuthorization Authorization,
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
		else if( buff instanceof YCFBamTableTweakBuff ) {
			return( (YCFBamTableTweakBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamTableTweakBuff[] readDerivedByValTentIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamTableTweakBuff> filteredList = new ArrayList<YCFBamTableTweakBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamTableTweakBuff ) ) {
					filteredList.add( (YCFBamTableTweakBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamTableTweakBuff[0] ) );
		}
	}

	public YCFBamTableTweakBuff[] readDerivedByScopeIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamTableTweakBuff> filteredList = new ArrayList<YCFBamTableTweakBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamTableTweakBuff ) ) {
					filteredList.add( (YCFBamTableTweakBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamTableTweakBuff[0] ) );
		}
	}

	public YCFBamTableTweakBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamTableTweakBuff> filteredList = new ArrayList<YCFBamTableTweakBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamTableTweakBuff ) ) {
					filteredList.add( (YCFBamTableTweakBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamTableTweakBuff[0] ) );
		}
	}

	public YCFBamTableTweakBuff[] readDerivedByTableIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId )
	{
		final String S_ProcName = "YCFBamRamTableTweak.readDerivedByTableIdx";
		YCFBamTableTweakByTableIdxKey key = schema.getFactoryTableTweak().newTableIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTableId( TableId );

		YCFBamTableTweakBuff[] recArray;
		if( dictByTableIdx.containsKey( key ) ) {
			Map< YCFBamTweakPKey, YCFBamTableTweakBuff > subdictTableIdx
				= dictByTableIdx.get( key );
			recArray = new YCFBamTableTweakBuff[ subdictTableIdx.size() ];
			Iterator< YCFBamTableTweakBuff > iter = subdictTableIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamTweakPKey, YCFBamTableTweakBuff > subdictTableIdx
				= new HashMap< YCFBamTweakPKey, YCFBamTableTweakBuff >();
			dictByTableIdx.put( key, subdictTableIdx );
			recArray = new YCFBamTableTweakBuff[0];
		}
		return( recArray );
	}

	public YCFBamTableTweakBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamTweak.readDerivedByIdIdx() ";
		YCFBamTweakPKey key = schema.getFactoryTweak().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamTableTweakBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamTableTweakBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamTweakPKey PKey )
	{
		final String S_ProcName = "YCFBamRamTableTweak.readBuff";
		YCFBamTableTweakBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a809" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamTableTweakBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamTweakPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamTableTweakBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a809" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamTableTweakBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamTableTweak.readAllBuff";
		YCFBamTableTweakBuff buff;
		ArrayList<YCFBamTableTweakBuff> filteredList = new ArrayList<YCFBamTableTweakBuff>();
		YCFBamTableTweakBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a809" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamTableTweakBuff[0] ) );
	}

	public YCFBamTableTweakBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamTweak.readBuffByIdIdx() ";
		YCFBamTableTweakBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a808" ) ) {
			return( (YCFBamTableTweakBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamTableTweakBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamTweak.readBuffByUNameIdx() ";
		YCFBamTableTweakBuff buff = readDerivedByUNameIdx( Authorization,
			TenantId,
			ScopeId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a808" ) ) {
			return( (YCFBamTableTweakBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamTableTweakBuff readBuffByUDefIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamTweak.readBuffByUDefIdx() ";
		YCFBamTableTweakBuff buff = readDerivedByUDefIdx( Authorization,
			TenantId,
			ScopeId,
			DefSchemaTenantId,
			DefSchemaId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a808" ) ) {
			return( (YCFBamTableTweakBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamTableTweakBuff[] readBuffByValTentIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamTweak.readBuffByValTentIdx() ";
		YCFBamTableTweakBuff buff;
		ArrayList<YCFBamTableTweakBuff> filteredList = new ArrayList<YCFBamTableTweakBuff>();
		YCFBamTableTweakBuff[] buffList = readDerivedByValTentIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a808" ) ) {
				filteredList.add( (YCFBamTableTweakBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamTableTweakBuff[0] ) );
	}

	public YCFBamTableTweakBuff[] readBuffByScopeIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "YCFBamRamTweak.readBuffByScopeIdx() ";
		YCFBamTableTweakBuff buff;
		ArrayList<YCFBamTableTweakBuff> filteredList = new ArrayList<YCFBamTableTweakBuff>();
		YCFBamTableTweakBuff[] buffList = readDerivedByScopeIdx( Authorization,
			TenantId,
			ScopeId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a808" ) ) {
				filteredList.add( (YCFBamTableTweakBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamTableTweakBuff[0] ) );
	}

	public YCFBamTableTweakBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamTweak.readBuffByDefSchemaIdx() ";
		YCFBamTableTweakBuff buff;
		ArrayList<YCFBamTableTweakBuff> filteredList = new ArrayList<YCFBamTableTweakBuff>();
		YCFBamTableTweakBuff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a808" ) ) {
				filteredList.add( (YCFBamTableTweakBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamTableTweakBuff[0] ) );
	}

	public YCFBamTableTweakBuff[] readBuffByTableIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId )
	{
		final String S_ProcName = "YCFBamRamTableTweak.readBuffByTableIdx() ";
		YCFBamTableTweakBuff buff;
		ArrayList<YCFBamTableTweakBuff> filteredList = new ArrayList<YCFBamTableTweakBuff>();
		YCFBamTableTweakBuff[] buffList = readDerivedByTableIdx( Authorization,
			TenantId,
			TableId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a809" ) ) {
				filteredList.add( (YCFBamTableTweakBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamTableTweakBuff[0] ) );
	}

	/**
	 *	Read a page array of the specific TableTweak buffer instances identified by the duplicate key TableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamTableTweakBuff[] pageBuffByTableIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TableId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByTableIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateTableTweak( YCFSecAuthorization Authorization,
		YCFBamTableTweakBuff Buff )
	{
		schema.getTableTweak().updateTweak( Authorization,
			Buff );
		YCFBamTweakPKey pkey = schema.getFactoryTweak().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamTableTweakBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateTableTweak",
				"Existing record not found",
				"TableTweak",
				pkey );
		}
		YCFBamTableTweakByTableIdxKey existingKeyTableIdx = schema.getFactoryTableTweak().newTableIdxKey();
		existingKeyTableIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyTableIdx.setRequiredTableId( existing.getRequiredTableId() );

		YCFBamTableTweakByTableIdxKey newKeyTableIdx = schema.getFactoryTableTweak().newTableIdxKey();
		newKeyTableIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyTableIdx.setRequiredTableId( Buff.getRequiredTableId() );

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
						"updateTableTweak",
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
				if( null == schema.getTableTable().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredTableId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateTableTweak",
						"Container",
						"Table",
						"Table",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamTweakPKey, YCFBamTableTweakBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByTableIdx.get( existingKeyTableIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByTableIdx.containsKey( newKeyTableIdx ) ) {
			subdict = dictByTableIdx.get( newKeyTableIdx );
		}
		else {
			subdict = new HashMap< YCFBamTweakPKey, YCFBamTableTweakBuff >();
			dictByTableIdx.put( newKeyTableIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteTableTweak( YCFSecAuthorization Authorization,
		YCFBamTableTweakBuff Buff )
	{
		final String S_ProcName = "YCFBamRamTableTweakTable.deleteTableTweak() ";
		String classCode;
		YCFBamTweakPKey pkey = schema.getFactoryTweak().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamTableTweakBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteTableTweak",
				pkey );
		}
		YCFBamTableTweakByTableIdxKey keyTableIdx = schema.getFactoryTableTweak().newTableIdxKey();
		keyTableIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyTableIdx.setRequiredTableId( existing.getRequiredTableId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFBamTweakPKey, YCFBamTableTweakBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByTableIdx.get( keyTableIdx );
		subdict.remove( pkey );

		schema.getTableTweak().deleteTweak( Authorization,
			Buff );
	}
	public void deleteTableTweakByTableIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTableId )
	{
		YCFBamTableTweakByTableIdxKey key = schema.getFactoryTableTweak().newTableIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTableId( argTableId );
		deleteTableTweakByTableIdx( Authorization, key );
	}

	public void deleteTableTweakByTableIdx( YCFSecAuthorization Authorization,
		YCFBamTableTweakByTableIdxKey argKey )
	{
		YCFBamTableTweakBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamTableTweakBuff> matchSet = new LinkedList<YCFBamTableTweakBuff>();
		Iterator<YCFBamTableTweakBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamTableTweakBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTableTweak().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteTableTweak( Authorization, cur );
		}
	}

	public void deleteTableTweakByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamTweakPKey key = schema.getFactoryTweak().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteTableTweakByIdIdx( Authorization, key );
	}

	public void deleteTableTweakByIdIdx( YCFSecAuthorization Authorization,
		YCFBamTweakPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamTableTweakBuff cur;
		LinkedList<YCFBamTableTweakBuff> matchSet = new LinkedList<YCFBamTableTweakBuff>();
		Iterator<YCFBamTableTweakBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamTableTweakBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTableTweak().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteTableTweak( Authorization, cur );
		}
	}

	public void deleteTableTweakByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		String argName )
	{
		YCFBamTweakByUNameIdxKey key = schema.getFactoryTweak().newUNameIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredScopeId( argScopeId );
		key.setRequiredName( argName );
		deleteTableTweakByUNameIdx( Authorization, key );
	}

	public void deleteTableTweakByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamTweakByUNameIdxKey argKey )
	{
		YCFBamTableTweakBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamTableTweakBuff> matchSet = new LinkedList<YCFBamTableTweakBuff>();
		Iterator<YCFBamTableTweakBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamTableTweakBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTableTweak().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteTableTweak( Authorization, cur );
		}
	}

	public void deleteTableTweakByUDefIdx( YCFSecAuthorization Authorization,
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
		deleteTableTweakByUDefIdx( Authorization, key );
	}

	public void deleteTableTweakByUDefIdx( YCFSecAuthorization Authorization,
		YCFBamTweakByUDefIdxKey argKey )
	{
		YCFBamTableTweakBuff cur;
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
		LinkedList<YCFBamTableTweakBuff> matchSet = new LinkedList<YCFBamTableTweakBuff>();
		Iterator<YCFBamTableTweakBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamTableTweakBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTableTweak().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteTableTweak( Authorization, cur );
		}
	}

	public void deleteTableTweakByValTentIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamTweakByValTentIdxKey key = schema.getFactoryTweak().newValTentIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteTableTweakByValTentIdx( Authorization, key );
	}

	public void deleteTableTweakByValTentIdx( YCFSecAuthorization Authorization,
		YCFBamTweakByValTentIdxKey argKey )
	{
		YCFBamTableTweakBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamTableTweakBuff> matchSet = new LinkedList<YCFBamTableTweakBuff>();
		Iterator<YCFBamTableTweakBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamTableTweakBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTableTweak().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteTableTweak( Authorization, cur );
		}
	}

	public void deleteTableTweakByScopeIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId )
	{
		YCFBamTweakByScopeIdxKey key = schema.getFactoryTweak().newScopeIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredScopeId( argScopeId );
		deleteTableTweakByScopeIdx( Authorization, key );
	}

	public void deleteTableTweakByScopeIdx( YCFSecAuthorization Authorization,
		YCFBamTweakByScopeIdxKey argKey )
	{
		YCFBamTableTweakBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamTableTweakBuff> matchSet = new LinkedList<YCFBamTableTweakBuff>();
		Iterator<YCFBamTableTweakBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamTableTweakBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTableTweak().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteTableTweak( Authorization, cur );
		}
	}

	public void deleteTableTweakByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamTweakByDefSchemaIdxKey key = schema.getFactoryTweak().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deleteTableTweakByDefSchemaIdx( Authorization, key );
	}

	public void deleteTableTweakByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamTweakByDefSchemaIdxKey argKey )
	{
		YCFBamTableTweakBuff cur;
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
		LinkedList<YCFBamTableTweakBuff> matchSet = new LinkedList<YCFBamTableTweakBuff>();
		Iterator<YCFBamTableTweakBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamTableTweakBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTableTweak().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteTableTweak( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
