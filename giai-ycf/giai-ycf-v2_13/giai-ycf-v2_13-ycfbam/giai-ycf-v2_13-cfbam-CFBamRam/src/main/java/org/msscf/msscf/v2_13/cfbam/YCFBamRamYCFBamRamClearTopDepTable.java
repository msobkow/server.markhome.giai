
// Description: Java 11 in-memory RAM DbIO implementation for ClearTopDep.

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
 *	YCFBamRamClearTopDepTable in-memory RAM DbIO implementation
 *	for ClearTopDep.
 */
public class YCFBamRamClearTopDepTable
	implements IYCFBamClearTopDepTable
{
	private IYCFBamSchema schema;
	private Map< YCFBamScopePKey,
				YCFBamClearTopDepBuff > dictByPKey
		= new HashMap< YCFBamScopePKey,
				YCFBamClearTopDepBuff >();
	private Map< YCFBamClearTopDepByClrTopDepTblIdxKey,
				Map< YCFBamScopePKey,
					YCFBamClearTopDepBuff >> dictByClrTopDepTblIdx
		= new HashMap< YCFBamClearTopDepByClrTopDepTblIdxKey,
				Map< YCFBamScopePKey,
					YCFBamClearTopDepBuff >>();
	private Map< YCFBamClearTopDepByUNameIdxKey,
			YCFBamClearTopDepBuff > dictByUNameIdx
		= new HashMap< YCFBamClearTopDepByUNameIdxKey,
			YCFBamClearTopDepBuff >();
	private Map< YCFBamClearTopDepByPrevIdxKey,
				Map< YCFBamScopePKey,
					YCFBamClearTopDepBuff >> dictByPrevIdx
		= new HashMap< YCFBamClearTopDepByPrevIdxKey,
				Map< YCFBamScopePKey,
					YCFBamClearTopDepBuff >>();
	private Map< YCFBamClearTopDepByNextIdxKey,
				Map< YCFBamScopePKey,
					YCFBamClearTopDepBuff >> dictByNextIdx
		= new HashMap< YCFBamClearTopDepByNextIdxKey,
				Map< YCFBamScopePKey,
					YCFBamClearTopDepBuff >>();

	public YCFBamRamClearTopDepTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createClearTopDep( YCFSecAuthorization Authorization,
		YCFBamClearTopDepBuff Buff )
	{
		final String S_ProcName = "createClearTopDep";
		YCFBamClearTopDepBuff tail = null;
		if( Buff.getClassCode().equals( "a817" ) ) {
			YCFBamClearTopDepBuff[] siblings = schema.getTableClearTopDep().readDerivedByClrTopDepTblIdx( Authorization,
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
		schema.getTableClearDep().createClearDep( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamClearTopDepByClrTopDepTblIdxKey keyClrTopDepTblIdx = schema.getFactoryClearTopDep().newClrTopDepTblIdxKey();
		keyClrTopDepTblIdx.setRequiredTableTenantId( Buff.getRequiredTableTenantId() );
		keyClrTopDepTblIdx.setRequiredTableId( Buff.getRequiredTableId() );

		YCFBamClearTopDepByUNameIdxKey keyUNameIdx = schema.getFactoryClearTopDep().newUNameIdxKey();
		keyUNameIdx.setRequiredTableTenantId( Buff.getRequiredTableTenantId() );
		keyUNameIdx.setRequiredTableId( Buff.getRequiredTableId() );
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamClearTopDepByPrevIdxKey keyPrevIdx = schema.getFactoryClearTopDep().newPrevIdxKey();
		keyPrevIdx.setOptionalPrevTenantId( Buff.getOptionalPrevTenantId() );
		keyPrevIdx.setOptionalPrevId( Buff.getOptionalPrevId() );

		YCFBamClearTopDepByNextIdxKey keyNextIdx = schema.getFactoryClearTopDep().newNextIdxKey();
		keyNextIdx.setOptionalNextTenantId( Buff.getOptionalNextTenantId() );
		keyNextIdx.setOptionalNextId( Buff.getOptionalNextId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"ClearTopDepUNameIdx",
				keyUNameIdx );
		}

		// Validate foreign keys

		{
			boolean allNull = true;
			allNull = false;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableClearDep().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Superclass",
						"SuperClass",
						"ClearDep",
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

		Map< YCFBamScopePKey, YCFBamClearTopDepBuff > subdictClrTopDepTblIdx;
		if( dictByClrTopDepTblIdx.containsKey( keyClrTopDepTblIdx ) ) {
			subdictClrTopDepTblIdx = dictByClrTopDepTblIdx.get( keyClrTopDepTblIdx );
		}
		else {
			subdictClrTopDepTblIdx = new HashMap< YCFBamScopePKey, YCFBamClearTopDepBuff >();
			dictByClrTopDepTblIdx.put( keyClrTopDepTblIdx, subdictClrTopDepTblIdx );
		}
		subdictClrTopDepTblIdx.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

		Map< YCFBamScopePKey, YCFBamClearTopDepBuff > subdictPrevIdx;
		if( dictByPrevIdx.containsKey( keyPrevIdx ) ) {
			subdictPrevIdx = dictByPrevIdx.get( keyPrevIdx );
		}
		else {
			subdictPrevIdx = new HashMap< YCFBamScopePKey, YCFBamClearTopDepBuff >();
			dictByPrevIdx.put( keyPrevIdx, subdictPrevIdx );
		}
		subdictPrevIdx.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamClearTopDepBuff > subdictNextIdx;
		if( dictByNextIdx.containsKey( keyNextIdx ) ) {
			subdictNextIdx = dictByNextIdx.get( keyNextIdx );
		}
		else {
			subdictNextIdx = new HashMap< YCFBamScopePKey, YCFBamClearTopDepBuff >();
			dictByNextIdx.put( keyNextIdx, subdictNextIdx );
		}
		subdictNextIdx.put( pkey, Buff );

		if( tail != null ) {
			String tailClassCode = tail.getClassCode();
			if( tailClassCode.equals( "a817" ) ) {
				YCFBamClearTopDepBuff tailEdit = schema.getFactoryClearTopDep().newBuff();
				tailEdit.set( (YCFBamClearTopDepBuff)tail );
				tailEdit.setOptionalNextTenantId( Buff.getRequiredTenantId() );
				tailEdit.setOptionalNextId( Buff.getRequiredId() );
				schema.getTableClearTopDep().updateClearTopDep( Authorization, tailEdit );
			}
			else {
				throw new YCFLibUsageException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode " + tailClassCode );
			}
		}
	}

	public YCFBamClearTopDepBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamClearTopDep.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamClearTopDepBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamClearTopDepBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamClearTopDep.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamClearTopDepBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamClearTopDepBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamClearTopDep.readAllDerived";
		YCFBamClearTopDepBuff[] retList = new YCFBamClearTopDepBuff[ dictByPKey.values().size() ];
		Iterator< YCFBamClearTopDepBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamClearTopDepBuff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamClearTopDepBuff> filteredList = new ArrayList<YCFBamClearTopDepBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamClearTopDepBuff ) ) {
					filteredList.add( (YCFBamClearTopDepBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamClearTopDepBuff[0] ) );
		}
	}

	public YCFBamClearTopDepBuff[] readDerivedByClearDepIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long RelationId )
	{
		final String S_ProcName = "YCFBamRamClearDep.readDerivedByClearDepIdx";
		YCFBamClearDepBuff buffList[] = schema.getTableClearDep().readDerivedByClearDepIdx( Authorization,
			TenantId,
			RelationId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFBamClearDepBuff buff;
			ArrayList<YCFBamClearTopDepBuff> filteredList = new ArrayList<YCFBamClearTopDepBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamClearTopDepBuff ) ) {
					filteredList.add( (YCFBamClearTopDepBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamClearTopDepBuff[0] ) );
		}
	}

	public YCFBamClearTopDepBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamClearDep.readDerivedByDefSchemaIdx";
		YCFBamClearDepBuff buffList[] = schema.getTableClearDep().readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		if( buffList == null ) {
			return( null );
		}
		else {
			YCFBamClearDepBuff buff;
			ArrayList<YCFBamClearTopDepBuff> filteredList = new ArrayList<YCFBamClearTopDepBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamClearTopDepBuff ) ) {
					filteredList.add( (YCFBamClearTopDepBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamClearTopDepBuff[0] ) );
		}
	}

	public YCFBamClearTopDepBuff[] readDerivedByClrTopDepTblIdx( YCFSecAuthorization Authorization,
		long TableTenantId,
		long TableId )
	{
		final String S_ProcName = "YCFBamRamClearTopDep.readDerivedByClrTopDepTblIdx";
		YCFBamClearTopDepByClrTopDepTblIdxKey key = schema.getFactoryClearTopDep().newClrTopDepTblIdxKey();
		key.setRequiredTableTenantId( TableTenantId );
		key.setRequiredTableId( TableId );

		YCFBamClearTopDepBuff[] recArray;
		if( dictByClrTopDepTblIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamClearTopDepBuff > subdictClrTopDepTblIdx
				= dictByClrTopDepTblIdx.get( key );
			recArray = new YCFBamClearTopDepBuff[ subdictClrTopDepTblIdx.size() ];
			Iterator< YCFBamClearTopDepBuff > iter = subdictClrTopDepTblIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamClearTopDepBuff > subdictClrTopDepTblIdx
				= new HashMap< YCFBamScopePKey, YCFBamClearTopDepBuff >();
			dictByClrTopDepTblIdx.put( key, subdictClrTopDepTblIdx );
			recArray = new YCFBamClearTopDepBuff[0];
		}
		return( recArray );
	}

	public YCFBamClearTopDepBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long TableTenantId,
		long TableId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamClearTopDep.readDerivedByUNameIdx";
		YCFBamClearTopDepByUNameIdxKey key = schema.getFactoryClearTopDep().newUNameIdxKey();
		key.setRequiredTableTenantId( TableTenantId );
		key.setRequiredTableId( TableId );
		key.setRequiredName( Name );

		YCFBamClearTopDepBuff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamClearTopDepBuff[] readDerivedByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "YCFBamRamClearTopDep.readDerivedByPrevIdx";
		YCFBamClearTopDepByPrevIdxKey key = schema.getFactoryClearTopDep().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );

		YCFBamClearTopDepBuff[] recArray;
		if( dictByPrevIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamClearTopDepBuff > subdictPrevIdx
				= dictByPrevIdx.get( key );
			recArray = new YCFBamClearTopDepBuff[ subdictPrevIdx.size() ];
			Iterator< YCFBamClearTopDepBuff > iter = subdictPrevIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamClearTopDepBuff > subdictPrevIdx
				= new HashMap< YCFBamScopePKey, YCFBamClearTopDepBuff >();
			dictByPrevIdx.put( key, subdictPrevIdx );
			recArray = new YCFBamClearTopDepBuff[0];
		}
		return( recArray );
	}

	public YCFBamClearTopDepBuff[] readDerivedByNextIdx( YCFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "YCFBamRamClearTopDep.readDerivedByNextIdx";
		YCFBamClearTopDepByNextIdxKey key = schema.getFactoryClearTopDep().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );

		YCFBamClearTopDepBuff[] recArray;
		if( dictByNextIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamClearTopDepBuff > subdictNextIdx
				= dictByNextIdx.get( key );
			recArray = new YCFBamClearTopDepBuff[ subdictNextIdx.size() ];
			Iterator< YCFBamClearTopDepBuff > iter = subdictNextIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamClearTopDepBuff > subdictNextIdx
				= new HashMap< YCFBamScopePKey, YCFBamClearTopDepBuff >();
			dictByNextIdx.put( key, subdictNextIdx );
			recArray = new YCFBamClearTopDepBuff[0];
		}
		return( recArray );
	}

	public YCFBamClearTopDepBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readDerivedByIdIdx() ";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamClearTopDepBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamClearTopDepBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamClearTopDep.readBuff";
		YCFBamClearTopDepBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a817" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamClearTopDepBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamClearTopDepBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a817" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamClearTopDepBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamClearTopDep.readAllBuff";
		YCFBamClearTopDepBuff buff;
		ArrayList<YCFBamClearTopDepBuff> filteredList = new ArrayList<YCFBamClearTopDepBuff>();
		YCFBamClearTopDepBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a817" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamClearTopDepBuff[0] ) );
	}

	public YCFBamClearTopDepBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByIdIdx() ";
		YCFBamClearTopDepBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
			return( (YCFBamClearTopDepBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamClearTopDepBuff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByTenantIdx() ";
		YCFBamClearTopDepBuff buff;
		ArrayList<YCFBamClearTopDepBuff> filteredList = new ArrayList<YCFBamClearTopDepBuff>();
		YCFBamClearTopDepBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
				filteredList.add( (YCFBamClearTopDepBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamClearTopDepBuff[0] ) );
	}

	public YCFBamClearTopDepBuff[] readBuffByClearDepIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long RelationId )
	{
		final String S_ProcName = "YCFBamRamClearDep.readBuffByClearDepIdx() ";
		YCFBamClearTopDepBuff buff;
		ArrayList<YCFBamClearTopDepBuff> filteredList = new ArrayList<YCFBamClearTopDepBuff>();
		YCFBamClearTopDepBuff[] buffList = readDerivedByClearDepIdx( Authorization,
			TenantId,
			RelationId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a813" ) ) {
				filteredList.add( (YCFBamClearTopDepBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamClearTopDepBuff[0] ) );
	}

	public YCFBamClearTopDepBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamClearDep.readBuffByDefSchemaIdx() ";
		YCFBamClearTopDepBuff buff;
		ArrayList<YCFBamClearTopDepBuff> filteredList = new ArrayList<YCFBamClearTopDepBuff>();
		YCFBamClearTopDepBuff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a813" ) ) {
				filteredList.add( (YCFBamClearTopDepBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamClearTopDepBuff[0] ) );
	}

	public YCFBamClearTopDepBuff[] readBuffByClrTopDepTblIdx( YCFSecAuthorization Authorization,
		long TableTenantId,
		long TableId )
	{
		final String S_ProcName = "YCFBamRamClearTopDep.readBuffByClrTopDepTblIdx() ";
		YCFBamClearTopDepBuff buff;
		ArrayList<YCFBamClearTopDepBuff> filteredList = new ArrayList<YCFBamClearTopDepBuff>();
		YCFBamClearTopDepBuff[] buffList = readDerivedByClrTopDepTblIdx( Authorization,
			TableTenantId,
			TableId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a817" ) ) {
				filteredList.add( (YCFBamClearTopDepBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamClearTopDepBuff[0] ) );
	}

	public YCFBamClearTopDepBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TableTenantId,
		long TableId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamClearTopDep.readBuffByUNameIdx() ";
		YCFBamClearTopDepBuff buff = readDerivedByUNameIdx( Authorization,
			TableTenantId,
			TableId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a817" ) ) {
			return( (YCFBamClearTopDepBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamClearTopDepBuff[] readBuffByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "YCFBamRamClearTopDep.readBuffByPrevIdx() ";
		YCFBamClearTopDepBuff buff;
		ArrayList<YCFBamClearTopDepBuff> filteredList = new ArrayList<YCFBamClearTopDepBuff>();
		YCFBamClearTopDepBuff[] buffList = readDerivedByPrevIdx( Authorization,
			PrevTenantId,
			PrevId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a817" ) ) {
				filteredList.add( (YCFBamClearTopDepBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamClearTopDepBuff[0] ) );
	}

	public YCFBamClearTopDepBuff[] readBuffByNextIdx( YCFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "YCFBamRamClearTopDep.readBuffByNextIdx() ";
		YCFBamClearTopDepBuff buff;
		ArrayList<YCFBamClearTopDepBuff> filteredList = new ArrayList<YCFBamClearTopDepBuff>();
		YCFBamClearTopDepBuff[] buffList = readDerivedByNextIdx( Authorization,
			NextTenantId,
			NextId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a817" ) ) {
				filteredList.add( (YCFBamClearTopDepBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamClearTopDepBuff[0] ) );
	}

	/**
	 *	Read a page array of the specific ClearTopDep buffer instances identified by the duplicate key ClearDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argRelationId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamClearTopDepBuff[] pageBuffByClearDepIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long RelationId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByClearDepIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific ClearTopDep buffer instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDefSchemaTenantId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argDefSchemaId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamClearTopDepBuff[] pageBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByDefSchemaIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific ClearTopDep buffer instances identified by the duplicate key ClrTopDepTblIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTableTenantId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argTableId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamClearTopDepBuff[] pageBuffByClrTopDepTblIdx( YCFSecAuthorization Authorization,
		long TableTenantId,
		long TableId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByClrTopDepTblIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific ClearTopDep buffer instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamClearTopDepBuff[] pageBuffByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByPrevIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific ClearTopDep buffer instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamClearTopDepBuff[] pageBuffByNextIdx( YCFSecAuthorization Authorization,
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
	public YCFBamClearTopDepBuff moveBuffUp( YCFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision )
	{
		final String S_ProcName = "moveBuffUp";

		YCFBamClearTopDepBuff grandprev = null;
		YCFBamClearTopDepBuff prev = null;
		YCFBamClearTopDepBuff cur = null;
		YCFBamClearTopDepBuff next = null;

		cur = schema.getTableClearTopDep().readDerivedByIdIdx(Authorization, TenantId, Id);
		if( cur == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object" );
		}

		if( ( cur.getOptionalPrevTenantId() == null )
			&& ( cur.getOptionalPrevId() == null ) )
		{
			return( (YCFBamClearTopDepBuff)cur );
		}

		prev = schema.getTableClearTopDep().readDerivedByIdIdx(Authorization, cur.getOptionalPrevTenantId(), cur.getOptionalPrevId() );
		if( prev == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object.prev" );
		}

		if( ( prev.getOptionalPrevTenantId() != null )
			&& ( prev.getOptionalPrevId() != null ) )
		{
			grandprev = schema.getTableClearTopDep().readDerivedByIdIdx(Authorization, prev.getOptionalPrevTenantId(), prev.getOptionalPrevId() );
			if( grandprev == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.prev.prev" );
			}
		}

		if( ( cur.getOptionalNextTenantId() != null )
			&& ( cur.getOptionalNextId() != null ) )
		{
			next = schema.getTableClearTopDep().readDerivedByIdIdx(Authorization, cur.getOptionalNextTenantId(), cur.getOptionalNextId() );
			if( next == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.next" );
			}
		}

		String classCode = prev.getClassCode();
		YCFBamClearTopDepBuff newInstance;
			if( classCode.equals( "a817" ) ) {
				newInstance = schema.getFactoryClearTopDep().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamClearTopDepBuff editPrev = newInstance;
		editPrev.set( prev );

		classCode = cur.getClassCode();
			if( classCode.equals( "a817" ) ) {
				newInstance = schema.getFactoryClearTopDep().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamClearTopDepBuff editCur = newInstance;
		editCur.set( cur );

		YCFBamClearTopDepBuff editGrandprev = null;
		if( grandprev != null ) {
			classCode = grandprev.getClassCode();
			if( classCode.equals( "a817" ) ) {
				newInstance = schema.getFactoryClearTopDep().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editGrandprev = newInstance;
			editGrandprev.set( grandprev );
		}

		YCFBamClearTopDepBuff editNext = null;
		if( next != null ) {
			classCode = next.getClassCode();
			if( classCode.equals( "a817" ) ) {
				newInstance = schema.getFactoryClearTopDep().newBuff();
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
			if( classCode.equals( "a817" ) ) {
				schema.getTableClearTopDep().updateClearTopDep( Authorization, editGrandprev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		classCode = editPrev.getClassCode();
			if( classCode.equals( "a817" ) ) {
				schema.getTableClearTopDep().updateClearTopDep( Authorization, editPrev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		classCode = editCur.getClassCode();
			if( classCode.equals( "a817" ) ) {
				schema.getTableClearTopDep().updateClearTopDep( Authorization, editCur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		if( editNext != null ) {
			classCode = editNext.getClassCode();
			if( classCode.equals( "a817" ) ) {
				schema.getTableClearTopDep().updateClearTopDep( Authorization, editNext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		return( (YCFBamClearTopDepBuff)editCur );
	}

	/**
	 *	Move the specified buffer down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	public YCFBamClearTopDepBuff moveBuffDown( YCFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision )
	{
		final String S_ProcName = "moveBuffDown";

		YCFBamClearTopDepBuff prev = null;
		YCFBamClearTopDepBuff cur = null;
		YCFBamClearTopDepBuff next = null;
		YCFBamClearTopDepBuff grandnext = null;

		cur = schema.getTableClearTopDep().readDerivedByIdIdx(Authorization, TenantId, Id);
		if( cur == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object" );
		}

		if( ( cur.getOptionalNextTenantId() == null )
			&& ( cur.getOptionalNextId() == null ) )
		{
			return( (YCFBamClearTopDepBuff)cur );
		}

		next = schema.getTableClearTopDep().readDerivedByIdIdx(Authorization, cur.getOptionalNextTenantId(), cur.getOptionalNextId() );
		if( next == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object.next" );
		}

		if( ( next.getOptionalNextTenantId() != null )
			&& ( next.getOptionalNextId() != null ) )
		{
			grandnext = schema.getTableClearTopDep().readDerivedByIdIdx(Authorization, next.getOptionalNextTenantId(), next.getOptionalNextId() );
			if( grandnext == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.next.next" );
			}
		}

		if( ( cur.getOptionalPrevTenantId() != null )
			&& ( cur.getOptionalPrevId() != null ) )
		{
			prev = schema.getTableClearTopDep().readDerivedByIdIdx(Authorization, cur.getOptionalPrevTenantId(), cur.getOptionalPrevId() );
			if( prev == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.prev" );
			}
		}

		String classCode = cur.getClassCode();
		YCFBamClearTopDepBuff newInstance;
			if( classCode.equals( "a817" ) ) {
				newInstance = schema.getFactoryClearTopDep().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamClearTopDepBuff editCur = newInstance;
		editCur.set( cur );

		classCode = next.getClassCode();
			if( classCode.equals( "a817" ) ) {
				newInstance = schema.getFactoryClearTopDep().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamClearTopDepBuff editNext = newInstance;
		editNext.set( next );

		YCFBamClearTopDepBuff editGrandnext = null;
		if( grandnext != null ) {
			classCode = grandnext.getClassCode();
			if( classCode.equals( "a817" ) ) {
				newInstance = schema.getFactoryClearTopDep().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editGrandnext = newInstance;
			editGrandnext.set( grandnext );
		}

		YCFBamClearTopDepBuff editPrev = null;
		if( prev != null ) {
			classCode = prev.getClassCode();
			if( classCode.equals( "a817" ) ) {
				newInstance = schema.getFactoryClearTopDep().newBuff();
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
			if( classCode.equals( "a817" ) ) {
				schema.getTableClearTopDep().updateClearTopDep( Authorization, editPrev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		classCode = editCur.getClassCode();
			if( classCode.equals( "a817" ) ) {
				schema.getTableClearTopDep().updateClearTopDep( Authorization, editCur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		classCode = editNext.getClassCode();
			if( classCode.equals( "a817" ) ) {
				schema.getTableClearTopDep().updateClearTopDep( Authorization, editNext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		if( editGrandnext != null ) {
			classCode = editGrandnext.getClassCode();
			if( classCode.equals( "a817" ) ) {
				schema.getTableClearTopDep().updateClearTopDep( Authorization, editGrandnext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		return( (YCFBamClearTopDepBuff)editCur );
	}

	public void updateClearTopDep( YCFSecAuthorization Authorization,
		YCFBamClearTopDepBuff Buff )
	{
		schema.getTableClearDep().updateClearDep( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamClearTopDepBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateClearTopDep",
				"Existing record not found",
				"ClearTopDep",
				pkey );
		}
		YCFBamClearTopDepByClrTopDepTblIdxKey existingKeyClrTopDepTblIdx = schema.getFactoryClearTopDep().newClrTopDepTblIdxKey();
		existingKeyClrTopDepTblIdx.setRequiredTableTenantId( existing.getRequiredTableTenantId() );
		existingKeyClrTopDepTblIdx.setRequiredTableId( existing.getRequiredTableId() );

		YCFBamClearTopDepByClrTopDepTblIdxKey newKeyClrTopDepTblIdx = schema.getFactoryClearTopDep().newClrTopDepTblIdxKey();
		newKeyClrTopDepTblIdx.setRequiredTableTenantId( Buff.getRequiredTableTenantId() );
		newKeyClrTopDepTblIdx.setRequiredTableId( Buff.getRequiredTableId() );

		YCFBamClearTopDepByUNameIdxKey existingKeyUNameIdx = schema.getFactoryClearTopDep().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredTableTenantId( existing.getRequiredTableTenantId() );
		existingKeyUNameIdx.setRequiredTableId( existing.getRequiredTableId() );
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamClearTopDepByUNameIdxKey newKeyUNameIdx = schema.getFactoryClearTopDep().newUNameIdxKey();
		newKeyUNameIdx.setRequiredTableTenantId( Buff.getRequiredTableTenantId() );
		newKeyUNameIdx.setRequiredTableId( Buff.getRequiredTableId() );
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamClearTopDepByPrevIdxKey existingKeyPrevIdx = schema.getFactoryClearTopDep().newPrevIdxKey();
		existingKeyPrevIdx.setOptionalPrevTenantId( existing.getOptionalPrevTenantId() );
		existingKeyPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamClearTopDepByPrevIdxKey newKeyPrevIdx = schema.getFactoryClearTopDep().newPrevIdxKey();
		newKeyPrevIdx.setOptionalPrevTenantId( Buff.getOptionalPrevTenantId() );
		newKeyPrevIdx.setOptionalPrevId( Buff.getOptionalPrevId() );

		YCFBamClearTopDepByNextIdxKey existingKeyNextIdx = schema.getFactoryClearTopDep().newNextIdxKey();
		existingKeyNextIdx.setOptionalNextTenantId( existing.getOptionalNextTenantId() );
		existingKeyNextIdx.setOptionalNextId( existing.getOptionalNextId() );

		YCFBamClearTopDepByNextIdxKey newKeyNextIdx = schema.getFactoryClearTopDep().newNextIdxKey();
		newKeyNextIdx.setOptionalNextTenantId( Buff.getOptionalNextTenantId() );
		newKeyNextIdx.setOptionalNextId( Buff.getOptionalNextId() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateClearTopDep",
					"ClearTopDepUNameIdx",
					newKeyUNameIdx );
			}
		}

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableClearDep().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateClearTopDep",
						"Superclass",
						"SuperClass",
						"ClearDep",
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
						"updateClearTopDep",
						"Container",
						"Table",
						"Table",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamScopePKey, YCFBamClearTopDepBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByClrTopDepTblIdx.get( existingKeyClrTopDepTblIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByClrTopDepTblIdx.containsKey( newKeyClrTopDepTblIdx ) ) {
			subdict = dictByClrTopDepTblIdx.get( newKeyClrTopDepTblIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamClearTopDepBuff >();
			dictByClrTopDepTblIdx.put( newKeyClrTopDepTblIdx, subdict );
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
			subdict = new HashMap< YCFBamScopePKey, YCFBamClearTopDepBuff >();
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
			subdict = new HashMap< YCFBamScopePKey, YCFBamClearTopDepBuff >();
			dictByNextIdx.put( newKeyNextIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteClearTopDep( YCFSecAuthorization Authorization,
		YCFBamClearTopDepBuff Buff )
	{
		final String S_ProcName = "YCFBamRamClearTopDepTable.deleteClearTopDep() ";
		String classCode;
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamClearTopDepBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteClearTopDep",
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

		YCFBamClearTopDepBuff prev = null;
		if( ( prevTenantId != null )
			&& ( prevId != null ) )
		{
			prev = schema.getTableClearTopDep().readDerivedByIdIdx( Authorization,
				prevTenantId,
				prevId );
			if( prev == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"prev" );
			}
			YCFBamClearTopDepBuff editPrev;
			classCode = prev.getClassCode();
			if( classCode.equals( "a817" ) ) {
				editPrev = schema.getFactoryClearTopDep().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editPrev.set( prev );
			editPrev.setOptionalNextTenantId( nextTenantId );
			editPrev.setOptionalNextId( nextId );
			if( classCode.equals( "a817" ) ) {
				schema.getTableClearTopDep().updateClearTopDep( Authorization, editPrev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		YCFBamClearTopDepBuff next = null;
		if( ( nextTenantId != null )
			&& ( nextId != null ) )
		{
			next = schema.getTableClearTopDep().readDerivedByIdIdx( Authorization,
				nextTenantId,
				nextId );
			if( next == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"next" );
			}
			YCFBamClearTopDepBuff editNext;
			classCode = next.getClassCode();
			if( classCode.equals( "a817" ) ) {
				editNext = schema.getFactoryClearTopDep().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editNext.set( next );
			editNext.setOptionalPrevTenantId( prevTenantId );
			editNext.setOptionalPrevId( prevId );
			if( classCode.equals( "a817" ) ) {
				schema.getTableClearTopDep().updateClearTopDep( Authorization, editNext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		// Short circuit self-referential code to prevent stack overflows
		Object arrCheckClearDep[] = schema.getTableClearSubDep1().readDerivedByClearTopDepIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		if( arrCheckClearDep.length > 0 ) {
			schema.getTableClearSubDep1().deleteClearSubDep1ByClearTopDepIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		}
		YCFBamClearTopDepByClrTopDepTblIdxKey keyClrTopDepTblIdx = schema.getFactoryClearTopDep().newClrTopDepTblIdxKey();
		keyClrTopDepTblIdx.setRequiredTableTenantId( existing.getRequiredTableTenantId() );
		keyClrTopDepTblIdx.setRequiredTableId( existing.getRequiredTableId() );

		YCFBamClearTopDepByUNameIdxKey keyUNameIdx = schema.getFactoryClearTopDep().newUNameIdxKey();
		keyUNameIdx.setRequiredTableTenantId( existing.getRequiredTableTenantId() );
		keyUNameIdx.setRequiredTableId( existing.getRequiredTableId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamClearTopDepByPrevIdxKey keyPrevIdx = schema.getFactoryClearTopDep().newPrevIdxKey();
		keyPrevIdx.setOptionalPrevTenantId( existing.getOptionalPrevTenantId() );
		keyPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamClearTopDepByNextIdxKey keyNextIdx = schema.getFactoryClearTopDep().newNextIdxKey();
		keyNextIdx.setOptionalNextTenantId( existing.getOptionalNextTenantId() );
		keyNextIdx.setOptionalNextId( existing.getOptionalNextId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFBamScopePKey, YCFBamClearTopDepBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByClrTopDepTblIdx.get( keyClrTopDepTblIdx );
		subdict.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

		subdict = dictByPrevIdx.get( keyPrevIdx );
		subdict.remove( pkey );

		subdict = dictByNextIdx.get( keyNextIdx );
		subdict.remove( pkey );

		schema.getTableClearDep().deleteClearDep( Authorization,
			Buff );
	}
	public void deleteClearTopDepByClrTopDepTblIdx( YCFSecAuthorization Authorization,
		long argTableTenantId,
		long argTableId )
	{
		YCFBamClearTopDepByClrTopDepTblIdxKey key = schema.getFactoryClearTopDep().newClrTopDepTblIdxKey();
		key.setRequiredTableTenantId( argTableTenantId );
		key.setRequiredTableId( argTableId );
		deleteClearTopDepByClrTopDepTblIdx( Authorization, key );
	}

	public void deleteClearTopDepByClrTopDepTblIdx( YCFSecAuthorization Authorization,
		YCFBamClearTopDepByClrTopDepTblIdxKey argKey )
	{
		YCFBamClearTopDepBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamClearTopDepBuff> matchSet = new LinkedList<YCFBamClearTopDepBuff>();
		Iterator<YCFBamClearTopDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamClearTopDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableClearTopDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteClearTopDep( Authorization, cur );
		}
	}

	public void deleteClearTopDepByUNameIdx( YCFSecAuthorization Authorization,
		long argTableTenantId,
		long argTableId,
		String argName )
	{
		YCFBamClearTopDepByUNameIdxKey key = schema.getFactoryClearTopDep().newUNameIdxKey();
		key.setRequiredTableTenantId( argTableTenantId );
		key.setRequiredTableId( argTableId );
		key.setRequiredName( argName );
		deleteClearTopDepByUNameIdx( Authorization, key );
	}

	public void deleteClearTopDepByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamClearTopDepByUNameIdxKey argKey )
	{
		YCFBamClearTopDepBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamClearTopDepBuff> matchSet = new LinkedList<YCFBamClearTopDepBuff>();
		Iterator<YCFBamClearTopDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamClearTopDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableClearTopDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteClearTopDep( Authorization, cur );
		}
	}

	public void deleteClearTopDepByPrevIdx( YCFSecAuthorization Authorization,
		Long argPrevTenantId,
		Long argPrevId )
	{
		YCFBamClearTopDepByPrevIdxKey key = schema.getFactoryClearTopDep().newPrevIdxKey();
		key.setOptionalPrevTenantId( argPrevTenantId );
		key.setOptionalPrevId( argPrevId );
		deleteClearTopDepByPrevIdx( Authorization, key );
	}

	public void deleteClearTopDepByPrevIdx( YCFSecAuthorization Authorization,
		YCFBamClearTopDepByPrevIdxKey argKey )
	{
		YCFBamClearTopDepBuff cur;
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
		LinkedList<YCFBamClearTopDepBuff> matchSet = new LinkedList<YCFBamClearTopDepBuff>();
		Iterator<YCFBamClearTopDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamClearTopDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableClearTopDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteClearTopDep( Authorization, cur );
		}
	}

	public void deleteClearTopDepByNextIdx( YCFSecAuthorization Authorization,
		Long argNextTenantId,
		Long argNextId )
	{
		YCFBamClearTopDepByNextIdxKey key = schema.getFactoryClearTopDep().newNextIdxKey();
		key.setOptionalNextTenantId( argNextTenantId );
		key.setOptionalNextId( argNextId );
		deleteClearTopDepByNextIdx( Authorization, key );
	}

	public void deleteClearTopDepByNextIdx( YCFSecAuthorization Authorization,
		YCFBamClearTopDepByNextIdxKey argKey )
	{
		YCFBamClearTopDepBuff cur;
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
		LinkedList<YCFBamClearTopDepBuff> matchSet = new LinkedList<YCFBamClearTopDepBuff>();
		Iterator<YCFBamClearTopDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamClearTopDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableClearTopDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteClearTopDep( Authorization, cur );
		}
	}

	public void deleteClearTopDepByClearDepIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argRelationId )
	{
		YCFBamClearDepByClearDepIdxKey key = schema.getFactoryClearDep().newClearDepIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredRelationId( argRelationId );
		deleteClearTopDepByClearDepIdx( Authorization, key );
	}

	public void deleteClearTopDepByClearDepIdx( YCFSecAuthorization Authorization,
		YCFBamClearDepByClearDepIdxKey argKey )
	{
		YCFBamClearTopDepBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamClearTopDepBuff> matchSet = new LinkedList<YCFBamClearTopDepBuff>();
		Iterator<YCFBamClearTopDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamClearTopDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableClearTopDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteClearTopDep( Authorization, cur );
		}
	}

	public void deleteClearTopDepByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamClearDepByDefSchemaIdxKey key = schema.getFactoryClearDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deleteClearTopDepByDefSchemaIdx( Authorization, key );
	}

	public void deleteClearTopDepByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamClearDepByDefSchemaIdxKey argKey )
	{
		YCFBamClearTopDepBuff cur;
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
		LinkedList<YCFBamClearTopDepBuff> matchSet = new LinkedList<YCFBamClearTopDepBuff>();
		Iterator<YCFBamClearTopDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamClearTopDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableClearTopDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteClearTopDep( Authorization, cur );
		}
	}

	public void deleteClearTopDepByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteClearTopDepByIdIdx( Authorization, key );
	}

	public void deleteClearTopDepByIdIdx( YCFSecAuthorization Authorization,
		YCFBamScopePKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamClearTopDepBuff cur;
		LinkedList<YCFBamClearTopDepBuff> matchSet = new LinkedList<YCFBamClearTopDepBuff>();
		Iterator<YCFBamClearTopDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamClearTopDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableClearTopDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteClearTopDep( Authorization, cur );
		}
	}

	public void deleteClearTopDepByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamScopeByTenantIdxKey key = schema.getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteClearTopDepByTenantIdx( Authorization, key );
	}

	public void deleteClearTopDepByTenantIdx( YCFSecAuthorization Authorization,
		YCFBamScopeByTenantIdxKey argKey )
	{
		YCFBamClearTopDepBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamClearTopDepBuff> matchSet = new LinkedList<YCFBamClearTopDepBuff>();
		Iterator<YCFBamClearTopDepBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamClearTopDepBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableClearTopDep().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteClearTopDep( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
