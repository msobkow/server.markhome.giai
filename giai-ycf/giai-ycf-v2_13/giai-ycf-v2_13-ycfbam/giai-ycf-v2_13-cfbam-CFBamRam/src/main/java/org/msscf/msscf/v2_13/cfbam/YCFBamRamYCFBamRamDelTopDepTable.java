
// Description: Java 11 in-memory RAM DbIO implementation for DelTopDep.

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
 *	YCFBamRamDelTopDepTable in-memory RAM DbIO implementation
 *	for DelTopDep.
 */
public class YCFBamRamDelTopDepTable
	implements IYCFBamDelTopDepTable
{
	private IYCFBamSchema schema;
	private Map< YCFBamScopePKey,
				YCFBamDelTopDepBuff > dictByPKey
		= new HashMap< YCFBamScopePKey,
				YCFBamDelTopDepBuff >();
	private Map< YCFBamDelTopDepByDelTopDepTblIdxKey,
				Map< YCFBamScopePKey,
					YCFBamDelTopDepBuff >> dictByDelTopDepTblIdx
		= new HashMap< YCFBamDelTopDepByDelTopDepTblIdxKey,
				Map< YCFBamScopePKey,
					YCFBamDelTopDepBuff >>();
	private Map< YCFBamDelTopDepByUNameIdxKey,
			YCFBamDelTopDepBuff > dictByUNameIdx
		= new HashMap< YCFBamDelTopDepByUNameIdxKey,
			YCFBamDelTopDepBuff >();
	private Map< YCFBamDelTopDepByPrevIdxKey,
				Map< YCFBamScopePKey,
					YCFBamDelTopDepBuff >> dictByPrevIdx
		= new HashMap< YCFBamDelTopDepByPrevIdxKey,
				Map< YCFBamScopePKey,
					YCFBamDelTopDepBuff >>();
	private Map< YCFBamDelTopDepByNextIdxKey,
				Map< YCFBamScopePKey,
					YCFBamDelTopDepBuff >> dictByNextIdx
		= new HashMap< YCFBamDelTopDepByNextIdxKey,
				Map< YCFBamScopePKey,
					YCFBamDelTopDepBuff >>();

	public YCFBamRamDelTopDepTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createDelTopDep( YCFSecAuthorization Authorization,
		YCFBamDelTopDepBuff Buff )
	{
		final String S_ProcName = "createDelTopDep";
		YCFBamDelTopDepBuff tail = null;
		if( Buff.getClassCode().equals( "a81e" ) ) {
			YCFBamDelTopDepBuff[] siblings = schema.getTableDelTopDep().readDerivedByDelTopDepTblIdx( Authorization,
				Buff.getRequiredTableTenantId(),
				Buff.getRequiredTableId() );
			for( int idx = 0; ( tail == null ) && ( idx < siblings.length ); idx ++ ) {
				if( ( siblings[idx].getOptionalNextTenantId() == null )
					&& ( siblings[idx].getOptionalNextId() == null ) )
				{
					tail = siblings[idx];
				}
			}
			if( tail != null ) {
				Buff.setOptionalPrevTenantId( tail.getRequiredTenantId() );
				Buff.setOptionalPrevId( tail.getRequiredId() );
			}
			else {
				Buff.setOptionalPrevTenantId( null );
				Buff.setOptionalPrevId( null );
			}
		}
		schema.getTableDelDep().createDelDep( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamDelTopDepByDelTopDepTblIdxKey keyDelTopDepTblIdx = schema.getFactoryDelTopDep().newDelTopDepTblIdxKey();
		keyDelTopDepTblIdx.setRequiredTableTenantId( Buff.getRequiredTableTenantId() );
		keyDelTopDepTblIdx.setRequiredTableId( Buff.getRequiredTableId() );

		YCFBamDelTopDepByUNameIdxKey keyUNameIdx = schema.getFactoryDelTopDep().newUNameIdxKey();
		keyUNameIdx.setRequiredTableTenantId( Buff.getRequiredTableTenantId() );
		keyUNameIdx.setRequiredTableId( Buff.getRequiredTableId() );
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamDelTopDepByPrevIdxKey keyPrevIdx = schema.getFactoryDelTopDep().newPrevIdxKey();
		keyPrevIdx.setOptionalPrevTenantId( Buff.getOptionalPrevTenantId() );
		keyPrevIdx.setOptionalPrevId( Buff.getOptionalPrevId() );

		YCFBamDelTopDepByNextIdxKey keyNextIdx = schema.getFactoryDelTopDep().newNextIdxKey();
		keyNextIdx.setOptionalNextTenantId( Buff.getOptionalNextTenantId() );
		keyNextIdx.setOptionalNextId( Buff.getOptionalNextId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"DelTopDepUNameIdx",
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
				if( null == schema.getTableTable().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTableTenantId(),
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

		Map< YCFBamScopePKey, YCFBamDelTopDepBuff > subdictDelTopDepTblIdx;
		if( dictByDelTopDepTblIdx.containsKey( keyDelTopDepTblIdx ) ) {
			subdictDelTopDepTblIdx = dictByDelTopDepTblIdx.get( keyDelTopDepTblIdx );
		}
		else {
			subdictDelTopDepTblIdx = new HashMap< YCFBamScopePKey, YCFBamDelTopDepBuff >();
			dictByDelTopDepTblIdx.put( keyDelTopDepTblIdx, subdictDelTopDepTblIdx );
		}
		subdictDelTopDepTblIdx.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

		Map< YCFBamScopePKey, YCFBamDelTopDepBuff > subdictPrevIdx;
		if( dictByPrevIdx.containsKey( keyPrevIdx ) ) {
			subdictPrevIdx = dictByPrevIdx.get( keyPrevIdx );
		}
		else {
			subdictPrevIdx = new HashMap< YCFBamScopePKey, YCFBamDelTopDepBuff >();
			dictByPrevIdx.put( keyPrevIdx, subdictPrevIdx );
		}
		subdictPrevIdx.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamDelTopDepBuff > subdictNextIdx;
		if( dictByNextIdx.containsKey( keyNextIdx ) ) {
			subdictNextIdx = dictByNextIdx.get( keyNextIdx );
		}
		else {
			subdictNextIdx = new HashMap< YCFBamScopePKey, YCFBamDelTopDepBuff >();
			dictByNextIdx.put( keyNextIdx, subdictNextIdx );
		}
		subdictNextIdx.put( pkey, Buff );

		if( tail != null ) {
			String tailClassCode = tail.getClassCode();
			if( tailClassCode.equals( "a81e" ) ) {
				YCFBamDelTopDepBuff tailEdit = schema.getFactoryDelTopDep().newBuff();
				tailEdit.set( (YCFBamDelTopDepBuff)tail );
				tailEdit.setOptionalNextTenantId( Buff.getRequiredTenantId() );
				tailEdit.setOptionalNextId( Buff.getRequiredId() );
				schema.getTableDelTopDep().updateDelTopDep( Authorization, tailEdit );
			}
			else {
				throw new YCFLibUsageException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode " + tailClassCode );
			}
		}
	}

	public YCFBamDelTopDepBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamDelTopDep.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamDelTopDepBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamDelTopDepBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamDelTopDep.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamDelTopDepBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamDelTopDepBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamDelTopDep.readAllDerived";
		YCFBamDelTopDepBuff[] retList = new YCFBamDelTopDepBuff[ dictByPKey.values().size() ];
		Iterator< YCFBamDelTopDepBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamDelTopDepBuff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamDelTopDepBuff> filteredList = new ArrayList<YCFBamDelTopDepBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamDelTopDepBuff ) ) {
					filteredList.add( (YCFBamDelTopDepBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamDelTopDepBuff[0] ) );
		}
	}

	public YCFBamDelTopDepBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamDelTopDepBuff> filteredList = new ArrayList<YCFBamDelTopDepBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamDelTopDepBuff ) ) {
					filteredList.add( (YCFBamDelTopDepBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamDelTopDepBuff[0] ) );
		}
	}

	public YCFBamDelTopDepBuff[] readDerivedByDelDepIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamDelTopDepBuff> filteredList = new ArrayList<YCFBamDelTopDepBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamDelTopDepBuff ) ) {
					filteredList.add( (YCFBamDelTopDepBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamDelTopDepBuff[0] ) );
		}
	}

	public YCFBamDelTopDepBuff[] readDerivedByDelTopDepTblIdx( YCFSecAuthorization Authorization,
		long TableTenantId,
		long TableId )
	{
		final String S_ProcName = "YCFBamRamDelTopDep.readDerivedByDelTopDepTblIdx";
		YCFBamDelTopDepByDelTopDepTblIdxKey key = schema.getFactoryDelTopDep().newDelTopDepTblIdxKey();
		key.setRequiredTableTenantId( TableTenantId );
		key.setRequiredTableId( TableId );

		YCFBamDelTopDepBuff[] recArray;
		if( dictByDelTopDepTblIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamDelTopDepBuff > subdictDelTopDepTblIdx
				= dictByDelTopDepTblIdx.get( key );
			recArray = new YCFBamDelTopDepBuff[ subdictDelTopDepTblIdx.size() ];
			Iterator< YCFBamDelTopDepBuff > iter = subdictDelTopDepTblIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamDelTopDepBuff > subdictDelTopDepTblIdx
				= new HashMap< YCFBamScopePKey, YCFBamDelTopDepBuff >();
			dictByDelTopDepTblIdx.put( key, subdictDelTopDepTblIdx );
			recArray = new YCFBamDelTopDepBuff[0];
		}
		return( recArray );
	}

	public YCFBamDelTopDepBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long TableTenantId,
		long TableId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamDelTopDep.readDerivedByUNameIdx";
		YCFBamDelTopDepByUNameIdxKey key = schema.getFactoryDelTopDep().newUNameIdxKey();
		key.setRequiredTableTenantId( TableTenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );

		YCFBamDelTopDepBuff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamDelTopDepBuff[] readDerivedByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "YCFBamRamDelTopDep.readDerivedByPrevIdx";
		YCFBamDelTopDepByPrevIdxKey key = schema.getFactoryDelTopDep().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );

		YCFBamDelTopDepBuff[] recArray;
		if( dictByPrevIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamDelTopDepBuff > subdictPrevIdx
				= dictByPrevIdx.get( key );
			recArray = new YCFBamDelTopDepBuff[ subdictPrevIdx.size() ];
			Iterator< YCFBamDelTopDepBuff > iter = subdictPrevIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamDelTopDepBuff > subdictPrevIdx
				= new HashMap< YCFBamScopePKey, YCFBamDelTopDepBuff >();
			dictByPrevIdx.put( key, subdictPrevIdx );
			recArray = new YCFBamDelTopDepBuff[0];
		}
		return( recArray );
	}

	public YCFBamDelTopDepBuff[] readDerivedByNextIdx( YCFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "YCFBamRamDelTopDep.readDerivedByNextIdx";
		YCFBamDelTopDepByNextIdxKey key = schema.getFactoryDelTopDep().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );

		YCFBamDelTopDepBuff[] recArray;
		if( dictByNextIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamDelTopDepBuff > subdictNextIdx
				= dictByNextIdx.get( key );
			recArray = new YCFBamDelTopDepBuff[ subdictNextIdx.size() ];
			Iterator< YCFBamDelTopDepBuff > iter = subdictNextIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamDelTopDepBuff > subdictNextIdx
				= new HashMap< YCFBamScopePKey, YCFBamDelTopDepBuff >();
			dictByNextIdx.put( key, subdictNextIdx );
			recArray = new YCFBamDelTopDepBuff[0];
		}
		return( recArray );
	}

	public YCFBamDelTopDepBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readDerivedByIdIdx() ";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamDelTopDepBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamDelTopDepBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamDelTopDep.readBuff";
		YCFBamDelTopDepBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a81e" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamDelTopDepBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamDelTopDepBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a81e" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamDelTopDepBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamDelTopDep.readAllBuff";
		YCFBamDelTopDepBuff buff;
		ArrayList<YCFBamDelTopDepBuff> filteredList = new ArrayList<YCFBamDelTopDepBuff>();
		YCFBamDelTopDepBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a81e" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamDelTopDepBuff[0] ) );
	}

	public YCFBamDelTopDepBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByIdIdx() ";
		YCFBamDelTopDepBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
			return( (YCFBamDelTopDepBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamDelTopDepBuff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByTenantIdx() ";
		YCFBamDelTopDepBuff buff;
		ArrayList<YCFBamDelTopDepBuff> filteredList = new ArrayList<YCFBamDelTopDepBuff>();
		YCFBamDelTopDepBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
				filteredList.add( (YCFBamDelTopDepBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamDelTopDepBuff[0] ) );
	}

	public YCFBamDelTopDepBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamDelDep.readBuffByDefSchemaIdx() ";
		YCFBamDelTopDepBuff buff;
		ArrayList<YCFBamDelTopDepBuff> filteredList = new ArrayList<YCFBamDelTopDepBuff>();
		YCFBamDelTopDepBuff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a81a" ) ) {
				filteredList.add( (YCFBamDelTopDepBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamDelTopDepBuff[0] ) );
	}

	public YCFBamDelTopDepBuff[] readBuffByDelDepIdx( YCFSecAuthorization Authorization,
		long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "YCFBamRamDelDep.readBuffByDelDepIdx() ";
		YCFBamDelTopDepBuff buff;
		ArrayList<YCFBamDelTopDepBuff> filteredList = new ArrayList<YCFBamDelTopDepBuff>();
		YCFBamDelTopDepBuff[] buffList = readDerivedByDelDepIdx( Authorization,
			RelationTenantId,
			RelationId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a81a" ) ) {
				filteredList.add( (YCFBamDelTopDepBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamDelTopDepBuff[0] ) );
	}

	public YCFBamDelTopDepBuff[] readBuffByDelTopDepTblIdx( YCFSecAuthorization Authorization,
		long TableTenantId,
		long TableId )
	{
		final String S_ProcName = "YCFBamRamDelTopDep.readBuffByDelTopDepTblIdx() ";
		YCFBamDelTopDepBuff buff;
		ArrayList<YCFBamDelTopDepBuff> filteredList = new ArrayList<YCFBamDelTopDepBuff>();
		YCFBamDelTopDepBuff[] buffList = readDerivedByDelTopDepTblIdx( Authorization,
			TableTenantId,
			TableId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a81e" ) ) {
				filteredList.add( (YCFBamDelTopDepBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamDelTopDepBuff[0] ) );
	}

	public YCFBamDelTopDepBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TableTenantId,
		long TableId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamDelTopDep.readBuffByUNameIdx() ";
		YCFBamDelTopDepBuff buff = readDerivedByUNameIdx( Authorization,
			TableTenantId,
			TableId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a81e" ) ) {
			return( (YCFBamDelTopDepBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamDelTopDepBuff[] readBuffByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "YCFBamRamDelTopDep.readBuffByPrevIdx() ";
		YCFBamDelTopDepBuff buff;
		ArrayList<YCFBamDelTopDepBuff> filteredList = new ArrayList<YCFBamDelTopDepBuff>();
		YCFBamDelTopDepBuff[] buffList = readDerivedByPrevIdx( Authorization,
			PrevTenantId,
			PrevId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a81e" ) ) {
				filteredList.add( (YCFBamDelTopDepBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamDelTopDepBuff[0] ) );
	}

	public YCFBamDelTopDepBuff[] readBuffByNextIdx( YCFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "YCFBamRamDelTopDep.readBuffByNextIdx() ";
		YCFBamDelTopDepBuff buff;
		ArrayList<YCFBamDelTopDepBuff> filteredList = new ArrayList<YCFBamDelTopDepBuff>();
		YCFBamDelTopDepBuff[] buffList = readDerivedByNextIdx( Authorization,
			NextTenantId,
			NextId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a81e" ) ) {
				filteredList.add( (YCFBamDelTopDepBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamDelTopDepBuff[0] ) );
	}

	/**
	 *	Read a page array of the specific DelTopDep buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamDelTopDepBuff[] pageBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByDefSchemaIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific DelTopDep buffer instances identified by the duplicate key DelDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRelationTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamDelTopDepBuff[] pageBuffByDelDepIdx( YCFSecAuthorization Authorization,
		long RelationTenantId,
		long RelationId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByDelDepIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific DelTopDep buffer instances identified by the duplicate key DelTopDepTblIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTableTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamDelTopDepBuff[] pageBuffByDelTopDepTblIdx( YCFSecAuthorization Authorization,
		long TableTenantId,
		long TableId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByDelTopDepTblIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific DelTopDep buffer instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamDelTopDepBuff[] pageBuffByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByPrevIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific DelTopDep buffer instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamDelTopDepBuff[] pageBuffByNextIdx( YCFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByNextIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Move the specified buffer up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	public YCFBamDelTopDepBuff moveBuffUp( YCFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision )
	{
		final String S_ProcName = "moveBuffUp";

		YCFBamDelTopDepBuff grandprev = null;
		YCFBamDelTopDepBuff prev = null;
		YCFBamDelTopDepBuff cur = null;
		YCFBamDelTopDepBuff next = null;

		cur = schema.getTableDelTopDep().readDerivedByIdIdx(Authorization, TenantId, Id);
		if( cur == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object" );
		}

		if( ( cur.getOptionalPrevTenantId() == null )
			&& ( cur.getOptionalPrevId() == null ) )
		{
			return( (YCFBamDelTopDepBuff)cur );
		}

		prev = schema.getTableDelTopDep().readDerivedByIdIdx(Authorization, cur.getOptionalPrevTenantId(), cur.getOptionalPrevId() );
		if( prev == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object.prev" );
		}

		if( ( prev.getOptionalPrevTenantId() != null )
			&& ( prev.getOptionalPrevId() != null ) )
		{
			grandprev = schema.getTableDelTopDep().readDerivedByIdIdx(Authorization, prev.getOptionalPrevTenantId(), prev.getOptionalPrevId() );
			if( grandprev == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.prev.prev" );
			}
		}

		if( ( cur.getOptionalNextTenantId() != null )
			&& ( cur.getOptionalNextId() != null ) )
		{
			next = schema.getTableDelTopDep().readDerivedByIdIdx(Authorization, cur.getOptionalNextTenantId(), cur.getOptionalNextId() );
			if( next == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.next" );
			}
		}

		String classCode = prev.getClassCode();
		YCFBamDelTopDepBuff newInstance;
			if( classCode.equals( "a81e" ) ) {
				newInstance = schema.getFactoryDelTopDep().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamDelTopDepBuff editPrev = newInstance;
		editPrev.set( prev );

		classCode = cur.getClassCode();
			if( classCode.equals( "a81e" ) ) {
				newInstance = schema.getFactoryDelTopDep().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamDelTopDepBuff editCur = newInstance;
		editCur.set( cur );

		YCFBamDelTopDepBuff editGrandprev = null;
		if( grandprev != null ) {
			classCode = grandprev.getClassCode();
			if( classCode.equals( "a81e" ) ) {
				newInstance = schema.getFactoryDelTopDep().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editGrandprev = newInstance;
			editGrandprev.set( grandprev );
		}

		YCFBamDelTopDepBuff editNext = null;
		if( next != null ) {
			classCode = next.getClassCode();
			if( classCode.equals( "a81e" ) ) {
				newInstance = schema.getFactoryDelTopDep().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editNext = newInstance;
			editNext.set( next );
		}

		if( editGrandprev != null ) {
			editGrandprev.setOptionalNextTenantId( cur.getRequiredTenantId() );
			editGrandprev.setOptionalNextId( cur.getRequiredId() );
			editCur.setOptionalPrevTenantId( grandprev.getRequiredTenantId() );
			editCur.setOptionalPrevId( grandprev.getRequiredId() );
		}
		else {
			editCur.setOptionalPrevTenantId( null );
			editCur.setOptionalPrevId( null );
		}

			editPrev.setOptionalPrevTenantId( cur.getRequiredTenantId() );
			editPrev.setOptionalPrevId( cur.getRequiredId() );

			editCur.setOptionalNextTenantId( prev.getRequiredTenantId() );
			editCur.setOptionalNextId( prev.getRequiredId() );

		if( next != null ) {
			editPrev.setOptionalNextTenantId( next.getRequiredTenantId() );
			editPrev.setOptionalNextId( next.getRequiredId() );
			editNext.setOptionalPrevTenantId( prev.getRequiredTenantId() );
			editNext.setOptionalPrevId( prev.getRequiredId() );
		}
		else {
			editPrev.setOptionalNextTenantId( null );
			editPrev.setOptionalNextId( null );
		}

		if( editGrandprev != null ) {
			classCode = editGrandprev.getClassCode();
			if( classCode.equals( "a81e" ) ) {
				schema.getTableDelTopDep().updateDelTopDep( Authorization, editGrandprev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		classCode = editPrev.getClassCode();
			if( classCode.equals( "a81e" ) ) {
				schema.getTableDelTopDep().updateDelTopDep( Authorization, editPrev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		classCode = editCur.getClassCode();
			if( classCode.equals( "a81e" ) ) {
				schema.getTableDelTopDep().updateDelTopDep( Authorization, editCur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		if( editNext != null ) {
			classCode = editNext.getClassCode();
			if( classCode.equals( "a81e" ) ) {
				schema.getTableDelTopDep().updateDelTopDep( Authorization, editNext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		return( (YCFBamDelTopDepBuff)editCur );
	}

	/**
	 *	Move the specified buffer down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	public YCFBamDelTopDepBuff moveBuffDown( YCFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision )
	{
		final String S_ProcName = "moveBuffDown";

		YCFBamDelTopDepBuff prev = null;
		YCFBamDelTopDepBuff cur = null;
		YCFBamDelTopDepBuff next = null;
		YCFBamDelTopDepBuff grandnext = null;

		cur = schema.getTableDelTopDep().readDerivedByIdIdx(Authorization, TenantId, Id);
		if( cur == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object" );
		}

		if( ( cur.getOptionalNextTenantId() == null )
			&& ( cur.getOptionalNextId() == null ) )
		{
			return( (YCFBamDelTopDepBuff)cur );
		}

		next = schema.getTableDelTopDep().readDerivedByIdIdx(Authorization, cur.getOptionalNextTenantId(), cur.getOptionalNextId() );
		if( next == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object.next" );
		}

		if( ( next.getOptionalNextTenantId() != null )
			&& ( next.getOptionalNextId() != null ) )
		{
			grandnext = schema.getTableDelTopDep().readDerivedByIdIdx(Authorization, next.getOptionalNextTenantId(), next.getOptionalNextId() );
			if( grandnext == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.next.next" );
			}
		}

		if( ( cur.getOptionalPrevTenantId() != null )
			&& ( cur.getOptionalPrevId() != null ) )
		{
			prev = schema.getTableDelTopDep().readDerivedByIdIdx(Authorization, cur.getOptionalPrevTenantId(), cur.getOptionalPrevId() );
			if( prev == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.prev" );
			}
		}

		String classCode = cur.getClassCode();
		YCFBamDelTopDepBuff newInstance;
			if( classCode.equals( "a81e" ) ) {
				newInstance = schema.getFactoryDelTopDep().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamDelTopDepBuff editCur = newInstance;
		editCur.set( cur );

		classCode = next.getClassCode();
			if( classCode.equals( "a81e" ) ) {
				newInstance = schema.getFactoryDelTopDep().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamDelTopDepBuff editNext = newInstance;
		editNext.set( next );

		YCFBamDelTopDepBuff editGrandnext = null;
		if( grandnext != null ) {
			classCode = grandnext.getClassCode();
			if( classCode.equals( "a81e" ) ) {
				newInstance = schema.getFactoryDelTopDep().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editGrandnext = newInstance;
			editGrandnext.set( grandnext );
		}

		YCFBamDelTopDepBuff editPrev = null;
		if( prev != null ) {
			classCode = prev.getClassCode();
			if( classCode.equals( "a81e" ) ) {
				newInstance = schema.getFactoryDelTopDep().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editPrev = newInstance;
			editPrev.set( prev );
		}

		if( prev != null ) {
			editPrev.setOptionalNextTenantId( next.getRequiredTenantId() );
			editPrev.setOptionalNextId( next.getRequiredId() );
			editNext.setOptionalPrevTenantId( prev.getRequiredTenantId() );
			editNext.setOptionalPrevId( prev.getRequiredId() );
		}
		else {
			editNext.setOptionalPrevTenantId( null );
			editNext.setOptionalPrevId( null );
		}

			editCur.setOptionalPrevTenantId( next.getRequiredTenantId() );
			editCur.setOptionalPrevId( next.getRequiredId() );

			editNext.setOptionalNextTenantId( cur.getRequiredTenantId() );
			editNext.setOptionalNextId( cur.getRequiredId() );

		if( editGrandnext != null ) {
			editCur.setOptionalNextTenantId( grandnext.getRequiredTenantId() );
			editCur.setOptionalNextId( grandnext.getRequiredId() );
			editGrandnext.setOptionalPrevTenantId( cur.getRequiredTenantId() );
			editGrandnext.setOptionalPrevId( cur.getRequiredId() );
		}
		else {
			editCur.setOptionalNextTenantId( null );
			editCur.setOptionalNextId( null );
		}

		if( editPrev != null ) {
			classCode = editPrev.getClassCode();
			if( classCode.equals( "a81e" ) ) {
				schema.getTableDelTopDep().updateDelTopDep( Authorization, editPrev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		classCode = editCur.getClassCode();
			if( classCode.equals( "a81e" ) ) {
				schema.getTableDelTopDep().updateDelTopDep( Authorization, editCur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		classCode = editNext.getClassCode();
			if( classCode.equals( "a81e" ) ) {
				schema.getTableDelTopDep().updateDelTopDep( Authorization, editNext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		if( editGrandnext != null ) {
			classCode = editGrandnext.getClassCode();
			if( classCode.equals( "a81e" ) ) {
				schema.getTableDelTopDep().updateDelTopDep( Authorization, editGrandnext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		return( (YCFBamDelTopDepBuff)editCur );
	}

	public void updateDelTopDep( YCFSecAuthorization Authorization,
		YCFBamDelTopDepBuff Buff )
	{
		schema.getTableDelDep().updateDelDep( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamDelTopDepBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateDelTopDep",
				"Existing record not found",
				"DelTopDep",
				pkey );
		}
		YCFBamDelTopDepByDelTopDepTblIdxKey existingKeyDelTopDepTblIdx = schema.getFactoryDelTopDep().newDelTopDepTblIdxKey();
		existingKeyDelTopDepTblIdx.setRequiredTableTenantId( existing.getRequiredTableTenantId() );
		existingKeyDelTopDepTblIdx.setRequiredTableId( existing.getRequiredTableId() );

		YCFBamDelTopDepByDelTopDepTblIdxKey newKeyDelTopDepTblIdx = schema.getFactoryDelTopDep().newDelTopDepTblIdxKey();
		newKeyDelTopDepTblIdx.setRequiredTableTenantId( Buff.getRequiredTableTenantId() );
		newKeyDelTopDepTblIdx.setRequiredTableId( Buff.getRequiredTableId() );

		YCFBamDelTopDepByUNameIdxKey existingKeyUNameIdx = schema.getFactoryDelTopDep().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredTableTenantId( existing.getRequiredTableTenantId() );
		existingKeyUNameIdx.setRequiredTableId( existing.getRequiredTableId() );
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamDelTopDepByUNameIdxKey newKeyUNameIdx = schema.getFactoryDelTopDep().newUNameIdxKey();
		newKeyUNameIdx.setRequiredTableTenantId( Buff.getRequiredTableTenantId() );
		newKeyUNameIdx.setRequiredTableId( Buff.getRequiredTableId() );
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamDelTopDepByPrevIdxKey existingKeyPrevIdx = schema.getFactoryDelTopDep().newPrevIdxKey();
		existingKeyPrevIdx.setOptionalPrevTenantId( existing.getOptionalPrevTenantId() );
		existingKeyPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamDelTopDepByPrevIdxKey newKeyPrevIdx = schema.getFactoryDelTopDep().newPrevIdxKey();
		newKeyPrevIdx.setOptionalPrevTenantId( Buff.getOptionalPrevTenantId() );
		newKeyPrevIdx.setOptionalPrevId( Buff.getOptionalPrevId() );

		YCFBamDelTopDepByNextIdxKey existingKeyNextIdx = schema.getFactoryDelTopDep().newNextIdxKey();
		existingKeyNextIdx.setOptionalNextTenantId( existing.getOptionalNextTenantId() );
		existingKeyNextIdx.setOptionalNextId( existing.getOptionalNextId() );

		YCFBamDelTopDepByNextIdxKey newKeyNextIdx = schema.getFactoryDelTopDep().newNextIdxKey();
		newKeyNextIdx.setOptionalNextTenantId( Buff.getOptionalNextTenantId() );
		newKeyNextIdx.setOptionalNextId( Buff.getOptionalNextId() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateDelTopDep",
					"DelTopDepUNameIdx",
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
						"updateDelTopDep",
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
				if( null == schema.getTableTable().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTableTenantId(),
						Buff.getRequiredTableId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateDelTopDep",
						"Container",
						"Table",
						"Table",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamScopePKey, YCFBamDelTopDepBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByDelTopDepTblIdx.get( existingKeyDelTopDepTblIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByDelTopDepTblIdx.containsKey( newKeyDelTopDepTblIdx ) ) {
			subdict = dictByDelTopDepTblIdx.get( newKeyDelTopDepTblIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamDelTopDepBuff >();
			dictByDelTopDepTblIdx.put( newKeyDelTopDepTblIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

		subdict = dictByPrevIdx.get( existingKeyPrevIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByPrevIdx.containsKey( newKeyPrevIdx ) ) {
			subdict = dictByPrevIdx.get( newKeyPrevIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamDelTopDepBuff >();
			dictByPrevIdx.put( newKeyPrevIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByNextIdx.get( existingKeyNextIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByNextIdx.containsKey( newKeyNextIdx ) ) {
			subdict = dictByNextIdx.get( newKeyNextIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamDelTopDepBuff >();
			dictByNextIdx.put( newKeyNextIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteDelTopDep( YCFSecAuthorization Authorization,
		YCFBamDelTopDepBuff Buff )
	{
		final String S_ProcName = "YCFBamRamDelTopDepTable.deleteDelTopDep() ";
		String classCode;
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamDelTopDepBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteDelTopDep",
				pkey );
		}
		long varTableTenantId = existing.getRequiredTableTenantId();
		long varTableId = existing.getRequiredTableId();
		YCFBamTableBuff container = schema.getTableTable().readDerivedByIdIdx( Authorization,
			varTableTenantId,
			varTableId );
		if( container == null ) {
			throw new YCFLibNullArgumentException( getClass(),
				S_ProcName,
				0,
				"container" );
		}

		Long prevTenantId = existing.getOptionalPrevTenantId();
		Long prevId = existing.getOptionalPrevId();
		Long nextTenantId = existing.getOptionalNextTenantId();
		Long nextId = existing.getOptionalNextId();

		YCFBamDelTopDepBuff prev = null;
		if( ( prevTenantId != null )
			&& ( prevId != null ) )
		{
			prev = schema.getTableDelTopDep().readDerivedByIdIdx( Authorization,
				prevTenantId,
				prevId );
			if( prev == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"prev" );
			}
			YCFBamDelTopDepBuff editPrev;
			classCode = prev.getClassCode();
			if( classCode.equals( "a81e" ) ) {
				editPrev = schema.getFactoryDelTopDep().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editPrev.set( prev );
			editPrev.setOptionalNextTenantId( nextTenantId );
			editPrev.setOptionalNextId( nextId );
			if( classCode.equals( "a81e" ) ) {
				schema.getTableDelTopDep().updateDelTopDep( Authorization, editPrev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		YCFBamDelTopDepBuff next = null;
		if( ( nextTenantId != null )
			&& ( nextId != null ) )
		{
			next = schema.getTableDelTopDep().readDerivedByIdIdx( Authorization,
				nextTenantId,
				nextId );
			if( next == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"next" );
			}
			YCFBamDelTopDepBuff editNext;
			classCode = next.getClassCode();
			if( classCode.equals( "a81e" ) ) {
				editNext = schema.getFactoryDelTopDep().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editNext.set( next );
			editNext.setOptionalPrevTenantId( prevTenantId );
			editNext.setOptionalPrevId( prevId );
			if( classCode.equals( "a81e" ) ) {
				schema.getTableDelTopDep().updateDelTopDep( Authorization, editNext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		// Short circuit self-referential code to prevent stack overflows
		Object arrCheckDelDep[] = schema.getTableDelSubDep1().readDerivedByDelTopDepIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		if( arrCheckDelDep.length > 0 ) {
			schema.getTableDelSubDep1().deleteDelSubDep1ByDelTopDepIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		}
		YCFBamDelTopDepByDelTopDepTblIdxKey keyDelTopDepTblIdx = schema.getFactoryDelTopDep().newDelTopDepTblIdxKey();
		keyDelTopDepTblIdx.setRequiredTableTenantId( existing.getRequiredTableTenantId() );
		keyDelTopDepTblIdx.setRequiredTableId( existing.getRequiredTableId() );

		YCFBamDelTopDepByUNameIdxKey keyUNameIdx = schema.getFactoryDelTopDep().newUNameIdxKey();
		keyUNameIdx.setRequiredTableTenantId( existing.getRequiredTableTenantId() );
		keyUNameIdx.setRequiredTableId( existing.getRequiredTableId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamDelTopDepByPrevIdxKey keyPrevIdx = schema.getFactoryDelTopDep().newPrevIdxKey();
		keyPrevIdx.setOptionalPrevTenantId( existing.getOptionalPrevTenantId() );
		keyPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamDelTopDepByNextIdxKey keyNextIdx = schema.getFactoryDelTopDep().newNextIdxKey();
		keyNextIdx.setOptionalNextTenantId( existing.getOptionalNextTenantId() );
		keyNextIdx.setOptionalNextId( existing.getOptionalNextId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFBamScopePKey, YCFBamDelTopDepBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByDelTopDepTblIdx.get( keyDelTopDepTblIdx );
		subdict.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

		subdict = dictByPrevIdx.get( keyPrevIdx );
		subdict.remove( pkey );

		subdict = dictByNextIdx.get( keyNextIdx );
		subdict.remove( pkey );

		schema.getTableDelDep().deleteDelDep( Authorization,
			Buff );
	}
	public void deleteDelTopDepByDelTopDepTblIdx( YCFSecAuthorization Authorization,
		long argTableTenantId,
		long argTableId )
	{
		YCFBamDelTopDepByDelTopDepTblIdxKey key = schema.getFactoryDelTopDep().newDelTopDepTblIdxKey();
		key.setRequiredTableTenantId( argTableTenantId );
		key.setRequiredTableId( argTableId );
		deleteDelTopDepByDelTopDepTblIdx( Authorization, key );
	}

	public void deleteDelTopDepByDelTopDepTblIdx( YCFSecAuthorization Authorization,
		YCFBamDelTopDepByDelTopDepTblIdxKey argKey )
	{
		YCFBamDelTopDepBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamDelTopDepBuff> matchSet = new LinkedList<YCFBamDelTopDepBuff>();
		Iterator<YCFBamDelTopDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamDelTopDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableDelTopDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteDelTopDep( Authorization, cur );
		}
	}

	public void deleteDelTopDepByUNameIdx( YCFSecAuthorization Authorization,
		long argTableTenantId,
		long argTableId,
		String argName )
	{
		YCFBamDelTopDepByUNameIdxKey key = schema.getFactoryDelTopDep().newUNameIdxKey();
		key.setRequiredTableTenantId( argTableTenantId );
		key.setRequiredTableId( argTableId );
		key.setRequiredName( argName );
		deleteDelTopDepByUNameIdx( Authorization, key );
	}

	public void deleteDelTopDepByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamDelTopDepByUNameIdxKey argKey )
	{
		YCFBamDelTopDepBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamDelTopDepBuff> matchSet = new LinkedList<YCFBamDelTopDepBuff>();
		Iterator<YCFBamDelTopDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamDelTopDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableDelTopDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteDelTopDep( Authorization, cur );
		}
	}

	public void deleteDelTopDepByPrevIdx( YCFSecAuthorization Authorization,
		Long argPrevTenantId,
		Long argPrevId )
	{
		YCFBamDelTopDepByPrevIdxKey key = schema.getFactoryDelTopDep().newPrevIdxKey();
		key.setOptionalPrevTenantId( argPrevTenantId );
		key.setOptionalPrevId( argPrevId );
		deleteDelTopDepByPrevIdx( Authorization, key );
	}

	public void deleteDelTopDepByPrevIdx( YCFSecAuthorization Authorization,
		YCFBamDelTopDepByPrevIdxKey argKey )
	{
		YCFBamDelTopDepBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalPrevTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalPrevId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamDelTopDepBuff> matchSet = new LinkedList<YCFBamDelTopDepBuff>();
		Iterator<YCFBamDelTopDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamDelTopDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableDelTopDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteDelTopDep( Authorization, cur );
		}
	}

	public void deleteDelTopDepByNextIdx( YCFSecAuthorization Authorization,
		Long argNextTenantId,
		Long argNextId )
	{
		YCFBamDelTopDepByNextIdxKey key = schema.getFactoryDelTopDep().newNextIdxKey();
		key.setOptionalNextTenantId( argNextTenantId );
		key.setOptionalNextId( argNextId );
		deleteDelTopDepByNextIdx( Authorization, key );
	}

	public void deleteDelTopDepByNextIdx( YCFSecAuthorization Authorization,
		YCFBamDelTopDepByNextIdxKey argKey )
	{
		YCFBamDelTopDepBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalNextTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalNextId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamDelTopDepBuff> matchSet = new LinkedList<YCFBamDelTopDepBuff>();
		Iterator<YCFBamDelTopDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamDelTopDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableDelTopDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteDelTopDep( Authorization, cur );
		}
	}

	public void deleteDelTopDepByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamDelDepByDefSchemaIdxKey key = schema.getFactoryDelDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deleteDelTopDepByDefSchemaIdx( Authorization, key );
	}

	public void deleteDelTopDepByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamDelDepByDefSchemaIdxKey argKey )
	{
		YCFBamDelTopDepBuff cur;
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
		LinkedList<YCFBamDelTopDepBuff> matchSet = new LinkedList<YCFBamDelTopDepBuff>();
		Iterator<YCFBamDelTopDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamDelTopDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableDelTopDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteDelTopDep( Authorization, cur );
		}
	}

	public void deleteDelTopDepByDelDepIdx( YCFSecAuthorization Authorization,
		long argRelationTenantId,
		long argRelationId )
	{
		YCFBamDelDepByDelDepIdxKey key = schema.getFactoryDelDep().newDelDepIdxKey();
		key.setRequiredRelationTenantId( argRelationTenantId );
		key.setRequiredRelationId( argRelationId );
		deleteDelTopDepByDelDepIdx( Authorization, key );
	}

	public void deleteDelTopDepByDelDepIdx( YCFSecAuthorization Authorization,
		YCFBamDelDepByDelDepIdxKey argKey )
	{
		YCFBamDelTopDepBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamDelTopDepBuff> matchSet = new LinkedList<YCFBamDelTopDepBuff>();
		Iterator<YCFBamDelTopDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamDelTopDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableDelTopDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteDelTopDep( Authorization, cur );
		}
	}

	public void deleteDelTopDepByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteDelTopDepByIdIdx( Authorization, key );
	}

	public void deleteDelTopDepByIdIdx( YCFSecAuthorization Authorization,
		YCFBamScopePKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamDelTopDepBuff cur;
		LinkedList<YCFBamDelTopDepBuff> matchSet = new LinkedList<YCFBamDelTopDepBuff>();
		Iterator<YCFBamDelTopDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamDelTopDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableDelTopDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteDelTopDep( Authorization, cur );
		}
	}

	public void deleteDelTopDepByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamScopeByTenantIdxKey key = schema.getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteDelTopDepByTenantIdx( Authorization, key );
	}

	public void deleteDelTopDepByTenantIdx( YCFSecAuthorization Authorization,
		YCFBamScopeByTenantIdxKey argKey )
	{
		YCFBamDelTopDepBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamDelTopDepBuff> matchSet = new LinkedList<YCFBamDelTopDepBuff>();
		Iterator<YCFBamDelTopDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamDelTopDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableDelTopDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteDelTopDep( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
