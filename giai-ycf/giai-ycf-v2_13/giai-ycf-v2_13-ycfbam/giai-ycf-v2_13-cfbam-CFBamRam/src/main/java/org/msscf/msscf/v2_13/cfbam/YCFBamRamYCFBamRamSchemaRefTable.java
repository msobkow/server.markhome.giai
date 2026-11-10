
// Description: Java 11 in-memory RAM DbIO implementation for SchemaRef.

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
 *	YCFBamRamSchemaRefTable in-memory RAM DbIO implementation
 *	for SchemaRef.
 */
public class YCFBamRamSchemaRefTable
	implements IYCFBamSchemaRefTable
{
	private IYCFBamSchema schema;
	private Map< YCFBamScopePKey,
				YCFBamSchemaRefBuff > dictByPKey
		= new HashMap< YCFBamScopePKey,
				YCFBamSchemaRefBuff >();
	private Map< YCFBamSchemaRefBySchemaIdxKey,
				Map< YCFBamScopePKey,
					YCFBamSchemaRefBuff >> dictBySchemaIdx
		= new HashMap< YCFBamSchemaRefBySchemaIdxKey,
				Map< YCFBamScopePKey,
					YCFBamSchemaRefBuff >>();
	private Map< YCFBamSchemaRefByUNameIdxKey,
			YCFBamSchemaRefBuff > dictByUNameIdx
		= new HashMap< YCFBamSchemaRefByUNameIdxKey,
			YCFBamSchemaRefBuff >();
	private Map< YCFBamSchemaRefByRefSchemaIdxKey,
				Map< YCFBamScopePKey,
					YCFBamSchemaRefBuff >> dictByRefSchemaIdx
		= new HashMap< YCFBamSchemaRefByRefSchemaIdxKey,
				Map< YCFBamScopePKey,
					YCFBamSchemaRefBuff >>();
	private Map< YCFBamSchemaRefByPrevIdxKey,
				Map< YCFBamScopePKey,
					YCFBamSchemaRefBuff >> dictByPrevIdx
		= new HashMap< YCFBamSchemaRefByPrevIdxKey,
				Map< YCFBamScopePKey,
					YCFBamSchemaRefBuff >>();
	private Map< YCFBamSchemaRefByNextIdxKey,
				Map< YCFBamScopePKey,
					YCFBamSchemaRefBuff >> dictByNextIdx
		= new HashMap< YCFBamSchemaRefByNextIdxKey,
				Map< YCFBamScopePKey,
					YCFBamSchemaRefBuff >>();

	public YCFBamRamSchemaRefTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createSchemaRef( YCFSecAuthorization Authorization,
		YCFBamSchemaRefBuff Buff )
	{
		final String S_ProcName = "createSchemaRef";
		YCFBamSchemaRefBuff tail = null;
		if( Buff.getClassCode().equals( "a803" ) ) {
			YCFBamSchemaRefBuff[] siblings = schema.getTableSchemaRef().readDerivedBySchemaIdx( Authorization,
				Buff.getRequiredTenantId(),
				Buff.getRequiredSchemaId() );
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
		schema.getTableScope().createScope( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamSchemaRefBySchemaIdxKey keySchemaIdx = schema.getFactorySchemaRef().newSchemaIdxKey();
		keySchemaIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keySchemaIdx.setRequiredSchemaId( Buff.getRequiredSchemaId() );

		YCFBamSchemaRefByUNameIdxKey keyUNameIdx = schema.getFactorySchemaRef().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyUNameIdx.setRequiredSchemaId( Buff.getRequiredSchemaId() );
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamSchemaRefByRefSchemaIdxKey keyRefSchemaIdx = schema.getFactorySchemaRef().newRefSchemaIdxKey();
		keyRefSchemaIdx.setOptionalRefSchemaTenantId( Buff.getOptionalRefSchemaTenantId() );
		keyRefSchemaIdx.setOptionalRefSchemaId( Buff.getOptionalRefSchemaId() );

		YCFBamSchemaRefByPrevIdxKey keyPrevIdx = schema.getFactorySchemaRef().newPrevIdxKey();
		keyPrevIdx.setOptionalPrevTenantId( Buff.getOptionalPrevTenantId() );
		keyPrevIdx.setOptionalPrevId( Buff.getOptionalPrevId() );

		YCFBamSchemaRefByNextIdxKey keyNextIdx = schema.getFactorySchemaRef().newNextIdxKey();
		keyNextIdx.setOptionalNextTenantId( Buff.getOptionalNextTenantId() );
		keyNextIdx.setOptionalNextId( Buff.getOptionalNextId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"SchemaRefUNameIdx",
				keyUNameIdx );
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
				if( null == schema.getTableSchemaDef().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredSchemaId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"Schema",
						"SchemaDef",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamSchemaRefBuff > subdictSchemaIdx;
		if( dictBySchemaIdx.containsKey( keySchemaIdx ) ) {
			subdictSchemaIdx = dictBySchemaIdx.get( keySchemaIdx );
		}
		else {
			subdictSchemaIdx = new HashMap< YCFBamScopePKey, YCFBamSchemaRefBuff >();
			dictBySchemaIdx.put( keySchemaIdx, subdictSchemaIdx );
		}
		subdictSchemaIdx.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

		Map< YCFBamScopePKey, YCFBamSchemaRefBuff > subdictRefSchemaIdx;
		if( dictByRefSchemaIdx.containsKey( keyRefSchemaIdx ) ) {
			subdictRefSchemaIdx = dictByRefSchemaIdx.get( keyRefSchemaIdx );
		}
		else {
			subdictRefSchemaIdx = new HashMap< YCFBamScopePKey, YCFBamSchemaRefBuff >();
			dictByRefSchemaIdx.put( keyRefSchemaIdx, subdictRefSchemaIdx );
		}
		subdictRefSchemaIdx.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamSchemaRefBuff > subdictPrevIdx;
		if( dictByPrevIdx.containsKey( keyPrevIdx ) ) {
			subdictPrevIdx = dictByPrevIdx.get( keyPrevIdx );
		}
		else {
			subdictPrevIdx = new HashMap< YCFBamScopePKey, YCFBamSchemaRefBuff >();
			dictByPrevIdx.put( keyPrevIdx, subdictPrevIdx );
		}
		subdictPrevIdx.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamSchemaRefBuff > subdictNextIdx;
		if( dictByNextIdx.containsKey( keyNextIdx ) ) {
			subdictNextIdx = dictByNextIdx.get( keyNextIdx );
		}
		else {
			subdictNextIdx = new HashMap< YCFBamScopePKey, YCFBamSchemaRefBuff >();
			dictByNextIdx.put( keyNextIdx, subdictNextIdx );
		}
		subdictNextIdx.put( pkey, Buff );

		if( tail != null ) {
			String tailClassCode = tail.getClassCode();
			if( tailClassCode.equals( "a803" ) ) {
				YCFBamSchemaRefBuff tailEdit = schema.getFactorySchemaRef().newBuff();
				tailEdit.set( (YCFBamSchemaRefBuff)tail );
				tailEdit.setOptionalNextTenantId( Buff.getRequiredTenantId() );
				tailEdit.setOptionalNextId( Buff.getRequiredId() );
				schema.getTableSchemaRef().updateSchemaRef( Authorization, tailEdit );
			}
			else {
				throw new YCFLibUsageException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode " + tailClassCode );
			}
		}
	}

	public YCFBamSchemaRefBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamSchemaRef.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamSchemaRefBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamSchemaRefBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamSchemaRef.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamSchemaRefBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamSchemaRefBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamSchemaRef.readAllDerived";
		YCFBamSchemaRefBuff[] retList = new YCFBamSchemaRefBuff[ dictByPKey.values().size() ];
		Iterator< YCFBamSchemaRefBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamSchemaRefBuff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamSchemaRefBuff> filteredList = new ArrayList<YCFBamSchemaRefBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamSchemaRefBuff ) ) {
					filteredList.add( (YCFBamSchemaRefBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamSchemaRefBuff[0] ) );
		}
	}

	public YCFBamSchemaRefBuff[] readDerivedBySchemaIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaId )
	{
		final String S_ProcName = "YCFBamRamSchemaRef.readDerivedBySchemaIdx";
		YCFBamSchemaRefBySchemaIdxKey key = schema.getFactorySchemaRef().newSchemaIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaId( SchemaId );

		YCFBamSchemaRefBuff[] recArray;
		if( dictBySchemaIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamSchemaRefBuff > subdictSchemaIdx
				= dictBySchemaIdx.get( key );
			recArray = new YCFBamSchemaRefBuff[ subdictSchemaIdx.size() ];
			Iterator< YCFBamSchemaRefBuff > iter = subdictSchemaIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamSchemaRefBuff > subdictSchemaIdx
				= new HashMap< YCFBamScopePKey, YCFBamSchemaRefBuff >();
			dictBySchemaIdx.put( key, subdictSchemaIdx );
			recArray = new YCFBamSchemaRefBuff[0];
		}
		return( recArray );
	}

	public YCFBamSchemaRefBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamSchemaRef.readDerivedByUNameIdx";
		YCFBamSchemaRefByUNameIdxKey key = schema.getFactorySchemaRef().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredSchemaId( SchemaId );
		key.setRequiredName( Name );

		YCFBamSchemaRefBuff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamSchemaRefBuff[] readDerivedByRefSchemaIdx( YCFSecAuthorization Authorization,
		Long RefSchemaTenantId,
		Long RefSchemaId )
	{
		final String S_ProcName = "YCFBamRamSchemaRef.readDerivedByRefSchemaIdx";
		YCFBamSchemaRefByRefSchemaIdxKey key = schema.getFactorySchemaRef().newRefSchemaIdxKey();
		key.setOptionalRefSchemaTenantId( RefSchemaTenantId );
		key.setOptionalRefSchemaId( RefSchemaId );

		YCFBamSchemaRefBuff[] recArray;
		if( dictByRefSchemaIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamSchemaRefBuff > subdictRefSchemaIdx
				= dictByRefSchemaIdx.get( key );
			recArray = new YCFBamSchemaRefBuff[ subdictRefSchemaIdx.size() ];
			Iterator< YCFBamSchemaRefBuff > iter = subdictRefSchemaIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamSchemaRefBuff > subdictRefSchemaIdx
				= new HashMap< YCFBamScopePKey, YCFBamSchemaRefBuff >();
			dictByRefSchemaIdx.put( key, subdictRefSchemaIdx );
			recArray = new YCFBamSchemaRefBuff[0];
		}
		return( recArray );
	}

	public YCFBamSchemaRefBuff[] readDerivedByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "YCFBamRamSchemaRef.readDerivedByPrevIdx";
		YCFBamSchemaRefByPrevIdxKey key = schema.getFactorySchemaRef().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );

		YCFBamSchemaRefBuff[] recArray;
		if( dictByPrevIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamSchemaRefBuff > subdictPrevIdx
				= dictByPrevIdx.get( key );
			recArray = new YCFBamSchemaRefBuff[ subdictPrevIdx.size() ];
			Iterator< YCFBamSchemaRefBuff > iter = subdictPrevIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamSchemaRefBuff > subdictPrevIdx
				= new HashMap< YCFBamScopePKey, YCFBamSchemaRefBuff >();
			dictByPrevIdx.put( key, subdictPrevIdx );
			recArray = new YCFBamSchemaRefBuff[0];
		}
		return( recArray );
	}

	public YCFBamSchemaRefBuff[] readDerivedByNextIdx( YCFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "YCFBamRamSchemaRef.readDerivedByNextIdx";
		YCFBamSchemaRefByNextIdxKey key = schema.getFactorySchemaRef().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );

		YCFBamSchemaRefBuff[] recArray;
		if( dictByNextIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamSchemaRefBuff > subdictNextIdx
				= dictByNextIdx.get( key );
			recArray = new YCFBamSchemaRefBuff[ subdictNextIdx.size() ];
			Iterator< YCFBamSchemaRefBuff > iter = subdictNextIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamSchemaRefBuff > subdictNextIdx
				= new HashMap< YCFBamScopePKey, YCFBamSchemaRefBuff >();
			dictByNextIdx.put( key, subdictNextIdx );
			recArray = new YCFBamSchemaRefBuff[0];
		}
		return( recArray );
	}

	public YCFBamSchemaRefBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readDerivedByIdIdx() ";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamSchemaRefBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamSchemaRefBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamSchemaRef.readBuff";
		YCFBamSchemaRefBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a803" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamSchemaRefBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamSchemaRefBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a803" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamSchemaRefBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamSchemaRef.readAllBuff";
		YCFBamSchemaRefBuff buff;
		ArrayList<YCFBamSchemaRefBuff> filteredList = new ArrayList<YCFBamSchemaRefBuff>();
		YCFBamSchemaRefBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a803" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamSchemaRefBuff[0] ) );
	}

	public YCFBamSchemaRefBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByIdIdx() ";
		YCFBamSchemaRefBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
			return( (YCFBamSchemaRefBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamSchemaRefBuff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByTenantIdx() ";
		YCFBamSchemaRefBuff buff;
		ArrayList<YCFBamSchemaRefBuff> filteredList = new ArrayList<YCFBamSchemaRefBuff>();
		YCFBamSchemaRefBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
				filteredList.add( (YCFBamSchemaRefBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamSchemaRefBuff[0] ) );
	}

	public YCFBamSchemaRefBuff[] readBuffBySchemaIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaId )
	{
		final String S_ProcName = "YCFBamRamSchemaRef.readBuffBySchemaIdx() ";
		YCFBamSchemaRefBuff buff;
		ArrayList<YCFBamSchemaRefBuff> filteredList = new ArrayList<YCFBamSchemaRefBuff>();
		YCFBamSchemaRefBuff[] buffList = readDerivedBySchemaIdx( Authorization,
			TenantId,
			SchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a803" ) ) {
				filteredList.add( (YCFBamSchemaRefBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamSchemaRefBuff[0] ) );
	}

	public YCFBamSchemaRefBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamSchemaRef.readBuffByUNameIdx() ";
		YCFBamSchemaRefBuff buff = readDerivedByUNameIdx( Authorization,
			TenantId,
			SchemaId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a803" ) ) {
			return( (YCFBamSchemaRefBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamSchemaRefBuff[] readBuffByRefSchemaIdx( YCFSecAuthorization Authorization,
		Long RefSchemaTenantId,
		Long RefSchemaId )
	{
		final String S_ProcName = "YCFBamRamSchemaRef.readBuffByRefSchemaIdx() ";
		YCFBamSchemaRefBuff buff;
		ArrayList<YCFBamSchemaRefBuff> filteredList = new ArrayList<YCFBamSchemaRefBuff>();
		YCFBamSchemaRefBuff[] buffList = readDerivedByRefSchemaIdx( Authorization,
			RefSchemaTenantId,
			RefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a803" ) ) {
				filteredList.add( (YCFBamSchemaRefBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamSchemaRefBuff[0] ) );
	}

	public YCFBamSchemaRefBuff[] readBuffByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "YCFBamRamSchemaRef.readBuffByPrevIdx() ";
		YCFBamSchemaRefBuff buff;
		ArrayList<YCFBamSchemaRefBuff> filteredList = new ArrayList<YCFBamSchemaRefBuff>();
		YCFBamSchemaRefBuff[] buffList = readDerivedByPrevIdx( Authorization,
			PrevTenantId,
			PrevId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a803" ) ) {
				filteredList.add( (YCFBamSchemaRefBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamSchemaRefBuff[0] ) );
	}

	public YCFBamSchemaRefBuff[] readBuffByNextIdx( YCFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "YCFBamRamSchemaRef.readBuffByNextIdx() ";
		YCFBamSchemaRefBuff buff;
		ArrayList<YCFBamSchemaRefBuff> filteredList = new ArrayList<YCFBamSchemaRefBuff>();
		YCFBamSchemaRefBuff[] buffList = readDerivedByNextIdx( Authorization,
			NextTenantId,
			NextId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a803" ) ) {
				filteredList.add( (YCFBamSchemaRefBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamSchemaRefBuff[0] ) );
	}

	/**
	 *	Read a page array of the specific SchemaRef buffer instances identified by the duplicate key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@param	argSchemaId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamSchemaRefBuff[] pageBuffBySchemaIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long SchemaId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffBySchemaIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific SchemaRef buffer instances identified by the duplicate key RefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRefSchemaTenantId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@param	argRefSchemaId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamSchemaRefBuff[] pageBuffByRefSchemaIdx( YCFSecAuthorization Authorization,
		Long RefSchemaTenantId,
		Long RefSchemaId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByRefSchemaIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific SchemaRef buffer instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevTenantId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@param	argPrevId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamSchemaRefBuff[] pageBuffByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByPrevIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific SchemaRef buffer instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextTenantId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@param	argNextId	The SchemaRef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamSchemaRefBuff[] pageBuffByNextIdx( YCFSecAuthorization Authorization,
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
	public YCFBamSchemaRefBuff moveBuffUp( YCFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision )
	{
		final String S_ProcName = "moveBuffUp";

		YCFBamSchemaRefBuff grandprev = null;
		YCFBamSchemaRefBuff prev = null;
		YCFBamSchemaRefBuff cur = null;
		YCFBamSchemaRefBuff next = null;

		cur = schema.getTableSchemaRef().readDerivedByIdIdx(Authorization, TenantId, Id);
		if( cur == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object" );
		}

		if( ( cur.getOptionalPrevTenantId() == null )
			&& ( cur.getOptionalPrevId() == null ) )
		{
			return( (YCFBamSchemaRefBuff)cur );
		}

		prev = schema.getTableSchemaRef().readDerivedByIdIdx(Authorization, cur.getOptionalPrevTenantId(), cur.getOptionalPrevId() );
		if( prev == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object.prev" );
		}

		if( ( prev.getOptionalPrevTenantId() != null )
			&& ( prev.getOptionalPrevId() != null ) )
		{
			grandprev = schema.getTableSchemaRef().readDerivedByIdIdx(Authorization, prev.getOptionalPrevTenantId(), prev.getOptionalPrevId() );
			if( grandprev == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.prev.prev" );
			}
		}

		if( ( cur.getOptionalNextTenantId() != null )
			&& ( cur.getOptionalNextId() != null ) )
		{
			next = schema.getTableSchemaRef().readDerivedByIdIdx(Authorization, cur.getOptionalNextTenantId(), cur.getOptionalNextId() );
			if( next == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.next" );
			}
		}

		String classCode = prev.getClassCode();
		YCFBamSchemaRefBuff newInstance;
			if( classCode.equals( "a803" ) ) {
				newInstance = schema.getFactorySchemaRef().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamSchemaRefBuff editPrev = newInstance;
		editPrev.set( prev );

		classCode = cur.getClassCode();
			if( classCode.equals( "a803" ) ) {
				newInstance = schema.getFactorySchemaRef().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamSchemaRefBuff editCur = newInstance;
		editCur.set( cur );

		YCFBamSchemaRefBuff editGrandprev = null;
		if( grandprev != null ) {
			classCode = grandprev.getClassCode();
			if( classCode.equals( "a803" ) ) {
				newInstance = schema.getFactorySchemaRef().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editGrandprev = newInstance;
			editGrandprev.set( grandprev );
		}

		YCFBamSchemaRefBuff editNext = null;
		if( next != null ) {
			classCode = next.getClassCode();
			if( classCode.equals( "a803" ) ) {
				newInstance = schema.getFactorySchemaRef().newBuff();
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
			if( classCode.equals( "a803" ) ) {
				schema.getTableSchemaRef().updateSchemaRef( Authorization, editGrandprev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		classCode = editPrev.getClassCode();
			if( classCode.equals( "a803" ) ) {
				schema.getTableSchemaRef().updateSchemaRef( Authorization, editPrev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		classCode = editCur.getClassCode();
			if( classCode.equals( "a803" ) ) {
				schema.getTableSchemaRef().updateSchemaRef( Authorization, editCur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		if( editNext != null ) {
			classCode = editNext.getClassCode();
			if( classCode.equals( "a803" ) ) {
				schema.getTableSchemaRef().updateSchemaRef( Authorization, editNext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		return( (YCFBamSchemaRefBuff)editCur );
	}

	/**
	 *	Move the specified buffer down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	public YCFBamSchemaRefBuff moveBuffDown( YCFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision )
	{
		final String S_ProcName = "moveBuffDown";

		YCFBamSchemaRefBuff prev = null;
		YCFBamSchemaRefBuff cur = null;
		YCFBamSchemaRefBuff next = null;
		YCFBamSchemaRefBuff grandnext = null;

		cur = schema.getTableSchemaRef().readDerivedByIdIdx(Authorization, TenantId, Id);
		if( cur == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object" );
		}

		if( ( cur.getOptionalNextTenantId() == null )
			&& ( cur.getOptionalNextId() == null ) )
		{
			return( (YCFBamSchemaRefBuff)cur );
		}

		next = schema.getTableSchemaRef().readDerivedByIdIdx(Authorization, cur.getOptionalNextTenantId(), cur.getOptionalNextId() );
		if( next == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object.next" );
		}

		if( ( next.getOptionalNextTenantId() != null )
			&& ( next.getOptionalNextId() != null ) )
		{
			grandnext = schema.getTableSchemaRef().readDerivedByIdIdx(Authorization, next.getOptionalNextTenantId(), next.getOptionalNextId() );
			if( grandnext == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.next.next" );
			}
		}

		if( ( cur.getOptionalPrevTenantId() != null )
			&& ( cur.getOptionalPrevId() != null ) )
		{
			prev = schema.getTableSchemaRef().readDerivedByIdIdx(Authorization, cur.getOptionalPrevTenantId(), cur.getOptionalPrevId() );
			if( prev == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.prev" );
			}
		}

		String classCode = cur.getClassCode();
		YCFBamSchemaRefBuff newInstance;
			if( classCode.equals( "a803" ) ) {
				newInstance = schema.getFactorySchemaRef().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamSchemaRefBuff editCur = newInstance;
		editCur.set( cur );

		classCode = next.getClassCode();
			if( classCode.equals( "a803" ) ) {
				newInstance = schema.getFactorySchemaRef().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamSchemaRefBuff editNext = newInstance;
		editNext.set( next );

		YCFBamSchemaRefBuff editGrandnext = null;
		if( grandnext != null ) {
			classCode = grandnext.getClassCode();
			if( classCode.equals( "a803" ) ) {
				newInstance = schema.getFactorySchemaRef().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editGrandnext = newInstance;
			editGrandnext.set( grandnext );
		}

		YCFBamSchemaRefBuff editPrev = null;
		if( prev != null ) {
			classCode = prev.getClassCode();
			if( classCode.equals( "a803" ) ) {
				newInstance = schema.getFactorySchemaRef().newBuff();
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
			if( classCode.equals( "a803" ) ) {
				schema.getTableSchemaRef().updateSchemaRef( Authorization, editPrev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		classCode = editCur.getClassCode();
			if( classCode.equals( "a803" ) ) {
				schema.getTableSchemaRef().updateSchemaRef( Authorization, editCur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		classCode = editNext.getClassCode();
			if( classCode.equals( "a803" ) ) {
				schema.getTableSchemaRef().updateSchemaRef( Authorization, editNext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		if( editGrandnext != null ) {
			classCode = editGrandnext.getClassCode();
			if( classCode.equals( "a803" ) ) {
				schema.getTableSchemaRef().updateSchemaRef( Authorization, editGrandnext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		return( (YCFBamSchemaRefBuff)editCur );
	}

	public void updateSchemaRef( YCFSecAuthorization Authorization,
		YCFBamSchemaRefBuff Buff )
	{
		schema.getTableScope().updateScope( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamSchemaRefBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateSchemaRef",
				"Existing record not found",
				"SchemaRef",
				pkey );
		}
		YCFBamSchemaRefBySchemaIdxKey existingKeySchemaIdx = schema.getFactorySchemaRef().newSchemaIdxKey();
		existingKeySchemaIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeySchemaIdx.setRequiredSchemaId( existing.getRequiredSchemaId() );

		YCFBamSchemaRefBySchemaIdxKey newKeySchemaIdx = schema.getFactorySchemaRef().newSchemaIdxKey();
		newKeySchemaIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeySchemaIdx.setRequiredSchemaId( Buff.getRequiredSchemaId() );

		YCFBamSchemaRefByUNameIdxKey existingKeyUNameIdx = schema.getFactorySchemaRef().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyUNameIdx.setRequiredSchemaId( existing.getRequiredSchemaId() );
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamSchemaRefByUNameIdxKey newKeyUNameIdx = schema.getFactorySchemaRef().newUNameIdxKey();
		newKeyUNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyUNameIdx.setRequiredSchemaId( Buff.getRequiredSchemaId() );
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamSchemaRefByRefSchemaIdxKey existingKeyRefSchemaIdx = schema.getFactorySchemaRef().newRefSchemaIdxKey();
		existingKeyRefSchemaIdx.setOptionalRefSchemaTenantId( existing.getOptionalRefSchemaTenantId() );
		existingKeyRefSchemaIdx.setOptionalRefSchemaId( existing.getOptionalRefSchemaId() );

		YCFBamSchemaRefByRefSchemaIdxKey newKeyRefSchemaIdx = schema.getFactorySchemaRef().newRefSchemaIdxKey();
		newKeyRefSchemaIdx.setOptionalRefSchemaTenantId( Buff.getOptionalRefSchemaTenantId() );
		newKeyRefSchemaIdx.setOptionalRefSchemaId( Buff.getOptionalRefSchemaId() );

		YCFBamSchemaRefByPrevIdxKey existingKeyPrevIdx = schema.getFactorySchemaRef().newPrevIdxKey();
		existingKeyPrevIdx.setOptionalPrevTenantId( existing.getOptionalPrevTenantId() );
		existingKeyPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamSchemaRefByPrevIdxKey newKeyPrevIdx = schema.getFactorySchemaRef().newPrevIdxKey();
		newKeyPrevIdx.setOptionalPrevTenantId( Buff.getOptionalPrevTenantId() );
		newKeyPrevIdx.setOptionalPrevId( Buff.getOptionalPrevId() );

		YCFBamSchemaRefByNextIdxKey existingKeyNextIdx = schema.getFactorySchemaRef().newNextIdxKey();
		existingKeyNextIdx.setOptionalNextTenantId( existing.getOptionalNextTenantId() );
		existingKeyNextIdx.setOptionalNextId( existing.getOptionalNextId() );

		YCFBamSchemaRefByNextIdxKey newKeyNextIdx = schema.getFactorySchemaRef().newNextIdxKey();
		newKeyNextIdx.setOptionalNextTenantId( Buff.getOptionalNextTenantId() );
		newKeyNextIdx.setOptionalNextId( Buff.getOptionalNextId() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateSchemaRef",
					"SchemaRefUNameIdx",
					newKeyUNameIdx );
			}
		}

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableScope().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateSchemaRef",
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
				if( null == schema.getTableSchemaDef().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredSchemaId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateSchemaRef",
						"Container",
						"Schema",
						"SchemaDef",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamScopePKey, YCFBamSchemaRefBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictBySchemaIdx.get( existingKeySchemaIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictBySchemaIdx.containsKey( newKeySchemaIdx ) ) {
			subdict = dictBySchemaIdx.get( newKeySchemaIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamSchemaRefBuff >();
			dictBySchemaIdx.put( newKeySchemaIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

		subdict = dictByRefSchemaIdx.get( existingKeyRefSchemaIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByRefSchemaIdx.containsKey( newKeyRefSchemaIdx ) ) {
			subdict = dictByRefSchemaIdx.get( newKeyRefSchemaIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamSchemaRefBuff >();
			dictByRefSchemaIdx.put( newKeyRefSchemaIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByPrevIdx.get( existingKeyPrevIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByPrevIdx.containsKey( newKeyPrevIdx ) ) {
			subdict = dictByPrevIdx.get( newKeyPrevIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamSchemaRefBuff >();
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
			subdict = new HashMap< YCFBamScopePKey, YCFBamSchemaRefBuff >();
			dictByNextIdx.put( newKeyNextIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteSchemaRef( YCFSecAuthorization Authorization,
		YCFBamSchemaRefBuff Buff )
	{
		final String S_ProcName = "YCFBamRamSchemaRefTable.deleteSchemaRef() ";
		String classCode;
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamSchemaRefBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteSchemaRef",
				pkey );
		}
		long varTenantId = existing.getRequiredTenantId();
		long varSchemaId = existing.getRequiredSchemaId();
		YCFBamSchemaDefBuff container = schema.getTableSchemaDef().readDerivedByIdIdx( Authorization,
			varTenantId,
			varSchemaId );
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

		YCFBamSchemaRefBuff prev = null;
		if( ( prevTenantId != null )
			&& ( prevId != null ) )
		{
			prev = schema.getTableSchemaRef().readDerivedByIdIdx( Authorization,
				prevTenantId,
				prevId );
			if( prev == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"prev" );
			}
			YCFBamSchemaRefBuff editPrev;
			classCode = prev.getClassCode();
			if( classCode.equals( "a803" ) ) {
				editPrev = schema.getFactorySchemaRef().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editPrev.set( prev );
			editPrev.setOptionalNextTenantId( nextTenantId );
			editPrev.setOptionalNextId( nextId );
			if( classCode.equals( "a803" ) ) {
				schema.getTableSchemaRef().updateSchemaRef( Authorization, editPrev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		YCFBamSchemaRefBuff next = null;
		if( ( nextTenantId != null )
			&& ( nextId != null ) )
		{
			next = schema.getTableSchemaRef().readDerivedByIdIdx( Authorization,
				nextTenantId,
				nextId );
			if( next == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"next" );
			}
			YCFBamSchemaRefBuff editNext;
			classCode = next.getClassCode();
			if( classCode.equals( "a803" ) ) {
				editNext = schema.getFactorySchemaRef().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editNext.set( next );
			editNext.setOptionalPrevTenantId( prevTenantId );
			editNext.setOptionalPrevId( prevId );
			if( classCode.equals( "a803" ) ) {
				schema.getTableSchemaRef().updateSchemaRef( Authorization, editNext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		YCFBamSchemaRefBySchemaIdxKey keySchemaIdx = schema.getFactorySchemaRef().newSchemaIdxKey();
		keySchemaIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keySchemaIdx.setRequiredSchemaId( existing.getRequiredSchemaId() );

		YCFBamSchemaRefByUNameIdxKey keyUNameIdx = schema.getFactorySchemaRef().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredSchemaId( existing.getRequiredSchemaId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamSchemaRefByRefSchemaIdxKey keyRefSchemaIdx = schema.getFactorySchemaRef().newRefSchemaIdxKey();
		keyRefSchemaIdx.setOptionalRefSchemaTenantId( existing.getOptionalRefSchemaTenantId() );
		keyRefSchemaIdx.setOptionalRefSchemaId( existing.getOptionalRefSchemaId() );

		YCFBamSchemaRefByPrevIdxKey keyPrevIdx = schema.getFactorySchemaRef().newPrevIdxKey();
		keyPrevIdx.setOptionalPrevTenantId( existing.getOptionalPrevTenantId() );
		keyPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamSchemaRefByNextIdxKey keyNextIdx = schema.getFactorySchemaRef().newNextIdxKey();
		keyNextIdx.setOptionalNextTenantId( existing.getOptionalNextTenantId() );
		keyNextIdx.setOptionalNextId( existing.getOptionalNextId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFBamScopePKey, YCFBamSchemaRefBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictBySchemaIdx.get( keySchemaIdx );
		subdict.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

		subdict = dictByRefSchemaIdx.get( keyRefSchemaIdx );
		subdict.remove( pkey );

		subdict = dictByPrevIdx.get( keyPrevIdx );
		subdict.remove( pkey );

		subdict = dictByNextIdx.get( keyNextIdx );
		subdict.remove( pkey );

		schema.getTableScope().deleteScope( Authorization,
			Buff );
	}
	public void deleteSchemaRefBySchemaIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argSchemaId )
	{
		YCFBamSchemaRefBySchemaIdxKey key = schema.getFactorySchemaRef().newSchemaIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredSchemaId( argSchemaId );
		deleteSchemaRefBySchemaIdx( Authorization, key );
	}

	public void deleteSchemaRefBySchemaIdx( YCFSecAuthorization Authorization,
		YCFBamSchemaRefBySchemaIdxKey argKey )
	{
		YCFBamSchemaRefBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamSchemaRefBuff> matchSet = new LinkedList<YCFBamSchemaRefBuff>();
		Iterator<YCFBamSchemaRefBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamSchemaRefBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSchemaRef().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSchemaRef( Authorization, cur );
		}
	}

	public void deleteSchemaRefByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argSchemaId,
		String argName )
	{
		YCFBamSchemaRefByUNameIdxKey key = schema.getFactorySchemaRef().newUNameIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredSchemaId( argSchemaId );
		key.setRequiredName( argName );
		deleteSchemaRefByUNameIdx( Authorization, key );
	}

	public void deleteSchemaRefByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamSchemaRefByUNameIdxKey argKey )
	{
		YCFBamSchemaRefBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamSchemaRefBuff> matchSet = new LinkedList<YCFBamSchemaRefBuff>();
		Iterator<YCFBamSchemaRefBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamSchemaRefBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSchemaRef().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSchemaRef( Authorization, cur );
		}
	}

	public void deleteSchemaRefByRefSchemaIdx( YCFSecAuthorization Authorization,
		Long argRefSchemaTenantId,
		Long argRefSchemaId )
	{
		YCFBamSchemaRefByRefSchemaIdxKey key = schema.getFactorySchemaRef().newRefSchemaIdxKey();
		key.setOptionalRefSchemaTenantId( argRefSchemaTenantId );
		key.setOptionalRefSchemaId( argRefSchemaId );
		deleteSchemaRefByRefSchemaIdx( Authorization, key );
	}

	public void deleteSchemaRefByRefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamSchemaRefByRefSchemaIdxKey argKey )
	{
		YCFBamSchemaRefBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalRefSchemaTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalRefSchemaId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamSchemaRefBuff> matchSet = new LinkedList<YCFBamSchemaRefBuff>();
		Iterator<YCFBamSchemaRefBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamSchemaRefBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSchemaRef().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSchemaRef( Authorization, cur );
		}
	}

	public void deleteSchemaRefByPrevIdx( YCFSecAuthorization Authorization,
		Long argPrevTenantId,
		Long argPrevId )
	{
		YCFBamSchemaRefByPrevIdxKey key = schema.getFactorySchemaRef().newPrevIdxKey();
		key.setOptionalPrevTenantId( argPrevTenantId );
		key.setOptionalPrevId( argPrevId );
		deleteSchemaRefByPrevIdx( Authorization, key );
	}

	public void deleteSchemaRefByPrevIdx( YCFSecAuthorization Authorization,
		YCFBamSchemaRefByPrevIdxKey argKey )
	{
		YCFBamSchemaRefBuff cur;
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
		LinkedList<YCFBamSchemaRefBuff> matchSet = new LinkedList<YCFBamSchemaRefBuff>();
		Iterator<YCFBamSchemaRefBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamSchemaRefBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSchemaRef().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSchemaRef( Authorization, cur );
		}
	}

	public void deleteSchemaRefByNextIdx( YCFSecAuthorization Authorization,
		Long argNextTenantId,
		Long argNextId )
	{
		YCFBamSchemaRefByNextIdxKey key = schema.getFactorySchemaRef().newNextIdxKey();
		key.setOptionalNextTenantId( argNextTenantId );
		key.setOptionalNextId( argNextId );
		deleteSchemaRefByNextIdx( Authorization, key );
	}

	public void deleteSchemaRefByNextIdx( YCFSecAuthorization Authorization,
		YCFBamSchemaRefByNextIdxKey argKey )
	{
		YCFBamSchemaRefBuff cur;
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
		LinkedList<YCFBamSchemaRefBuff> matchSet = new LinkedList<YCFBamSchemaRefBuff>();
		Iterator<YCFBamSchemaRefBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamSchemaRefBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSchemaRef().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSchemaRef( Authorization, cur );
		}
	}

	public void deleteSchemaRefByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteSchemaRefByIdIdx( Authorization, key );
	}

	public void deleteSchemaRefByIdIdx( YCFSecAuthorization Authorization,
		YCFBamScopePKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamSchemaRefBuff cur;
		LinkedList<YCFBamSchemaRefBuff> matchSet = new LinkedList<YCFBamSchemaRefBuff>();
		Iterator<YCFBamSchemaRefBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamSchemaRefBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSchemaRef().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSchemaRef( Authorization, cur );
		}
	}

	public void deleteSchemaRefByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamScopeByTenantIdxKey key = schema.getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteSchemaRefByTenantIdx( Authorization, key );
	}

	public void deleteSchemaRefByTenantIdx( YCFSecAuthorization Authorization,
		YCFBamScopeByTenantIdxKey argKey )
	{
		YCFBamSchemaRefBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamSchemaRefBuff> matchSet = new LinkedList<YCFBamSchemaRefBuff>();
		Iterator<YCFBamSchemaRefBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamSchemaRefBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSchemaRef().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSchemaRef( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
