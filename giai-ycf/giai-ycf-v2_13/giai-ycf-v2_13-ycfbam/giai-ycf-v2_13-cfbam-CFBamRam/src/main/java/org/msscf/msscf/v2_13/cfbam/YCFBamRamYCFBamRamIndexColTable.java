
// Description: Java 11 in-memory RAM DbIO implementation for IndexCol.

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
 *	YCFBamRamIndexColTable in-memory RAM DbIO implementation
 *	for IndexCol.
 */
public class YCFBamRamIndexColTable
	implements IYCFBamIndexColTable
{
	private IYCFBamSchema schema;
	private Map< YCFBamIndexColPKey,
				YCFBamIndexColBuff > dictByPKey
		= new HashMap< YCFBamIndexColPKey,
				YCFBamIndexColBuff >();
	private Map< YCFBamIndexColByUNameIdxKey,
			YCFBamIndexColBuff > dictByUNameIdx
		= new HashMap< YCFBamIndexColByUNameIdxKey,
			YCFBamIndexColBuff >();
	private Map< YCFBamIndexColByIdxColTenantIdxKey,
				Map< YCFBamIndexColPKey,
					YCFBamIndexColBuff >> dictByIdxColTenantIdx
		= new HashMap< YCFBamIndexColByIdxColTenantIdxKey,
				Map< YCFBamIndexColPKey,
					YCFBamIndexColBuff >>();
	private Map< YCFBamIndexColByIndexIdxKey,
				Map< YCFBamIndexColPKey,
					YCFBamIndexColBuff >> dictByIndexIdx
		= new HashMap< YCFBamIndexColByIndexIdxKey,
				Map< YCFBamIndexColPKey,
					YCFBamIndexColBuff >>();
	private Map< YCFBamIndexColByDefSchemaIdxKey,
				Map< YCFBamIndexColPKey,
					YCFBamIndexColBuff >> dictByDefSchemaIdx
		= new HashMap< YCFBamIndexColByDefSchemaIdxKey,
				Map< YCFBamIndexColPKey,
					YCFBamIndexColBuff >>();
	private Map< YCFBamIndexColByColIdxKey,
				Map< YCFBamIndexColPKey,
					YCFBamIndexColBuff >> dictByColIdx
		= new HashMap< YCFBamIndexColByColIdxKey,
				Map< YCFBamIndexColPKey,
					YCFBamIndexColBuff >>();
	private Map< YCFBamIndexColByPrevIdxKey,
				Map< YCFBamIndexColPKey,
					YCFBamIndexColBuff >> dictByPrevIdx
		= new HashMap< YCFBamIndexColByPrevIdxKey,
				Map< YCFBamIndexColPKey,
					YCFBamIndexColBuff >>();
	private Map< YCFBamIndexColByNextIdxKey,
				Map< YCFBamIndexColPKey,
					YCFBamIndexColBuff >> dictByNextIdx
		= new HashMap< YCFBamIndexColByNextIdxKey,
				Map< YCFBamIndexColPKey,
					YCFBamIndexColBuff >>();
	private Map< YCFBamIndexColByIdxPrevIdxKey,
				Map< YCFBamIndexColPKey,
					YCFBamIndexColBuff >> dictByIdxPrevIdx
		= new HashMap< YCFBamIndexColByIdxPrevIdxKey,
				Map< YCFBamIndexColPKey,
					YCFBamIndexColBuff >>();
	private Map< YCFBamIndexColByIdxNextIdxKey,
				Map< YCFBamIndexColPKey,
					YCFBamIndexColBuff >> dictByIdxNextIdx
		= new HashMap< YCFBamIndexColByIdxNextIdxKey,
				Map< YCFBamIndexColPKey,
					YCFBamIndexColBuff >>();

	public YCFBamRamIndexColTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createIndexCol( YCFSecAuthorization Authorization,
		YCFBamIndexColBuff Buff )
	{
		final String S_ProcName = "createIndexCol";
			YCFBamIndexColBuff tail = null;

			YCFBamIndexColBuff[] siblings = schema.getTableIndexCol().readDerivedByIndexIdx( Authorization,
				Buff.getRequiredTenantId(),
				Buff.getRequiredIndexId() );
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
		
		YCFBamIndexColPKey pkey = schema.getFactoryIndexCol().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( ((YCFBamRamTenantTable)schema.getTableTenant()).nextIndexColIdGen( Authorization,
			Buff.getRequiredTenantId() ) );
		Buff.setRequiredTenantId( pkey.getRequiredTenantId() );
		Buff.setRequiredId( pkey.getRequiredId() );
		YCFBamIndexColByUNameIdxKey keyUNameIdx = schema.getFactoryIndexCol().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyUNameIdx.setRequiredIndexId( Buff.getRequiredIndexId() );
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamIndexColByIdxColTenantIdxKey keyIdxColTenantIdx = schema.getFactoryIndexCol().newIdxColTenantIdxKey();
		keyIdxColTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFBamIndexColByIndexIdxKey keyIndexIdx = schema.getFactoryIndexCol().newIndexIdxKey();
		keyIndexIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyIndexIdx.setRequiredIndexId( Buff.getRequiredIndexId() );

		YCFBamIndexColByDefSchemaIdxKey keyDefSchemaIdx = schema.getFactoryIndexCol().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( Buff.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( Buff.getOptionalDefSchemaId() );

		YCFBamIndexColByColIdxKey keyColIdx = schema.getFactoryIndexCol().newColIdxKey();
		keyColIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyColIdx.setRequiredColumnId( Buff.getRequiredColumnId() );

		YCFBamIndexColByPrevIdxKey keyPrevIdx = schema.getFactoryIndexCol().newPrevIdxKey();
		keyPrevIdx.setOptionalPrevTenantId( Buff.getOptionalPrevTenantId() );
		keyPrevIdx.setOptionalPrevId( Buff.getOptionalPrevId() );

		YCFBamIndexColByNextIdxKey keyNextIdx = schema.getFactoryIndexCol().newNextIdxKey();
		keyNextIdx.setOptionalNextTenantId( Buff.getOptionalNextTenantId() );
		keyNextIdx.setOptionalNextId( Buff.getOptionalNextId() );

		YCFBamIndexColByIdxPrevIdxKey keyIdxPrevIdx = schema.getFactoryIndexCol().newIdxPrevIdxKey();
		keyIdxPrevIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyIdxPrevIdx.setRequiredIndexId( Buff.getRequiredIndexId() );
		keyIdxPrevIdx.setOptionalPrevId( Buff.getOptionalPrevId() );

		YCFBamIndexColByIdxNextIdxKey keyIdxNextIdx = schema.getFactoryIndexCol().newIdxNextIdxKey();
		keyIdxNextIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyIdxNextIdx.setRequiredIndexId( Buff.getRequiredIndexId() );
		keyIdxNextIdx.setOptionalNextId( Buff.getOptionalNextId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"IndexColUNameIdx",
				keyUNameIdx );
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

		{
			boolean allNull = true;
			allNull = false;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableValue().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredColumnId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Lookup",
						"Column",
						"Value",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

		Map< YCFBamIndexColPKey, YCFBamIndexColBuff > subdictIdxColTenantIdx;
		if( dictByIdxColTenantIdx.containsKey( keyIdxColTenantIdx ) ) {
			subdictIdxColTenantIdx = dictByIdxColTenantIdx.get( keyIdxColTenantIdx );
		}
		else {
			subdictIdxColTenantIdx = new HashMap< YCFBamIndexColPKey, YCFBamIndexColBuff >();
			dictByIdxColTenantIdx.put( keyIdxColTenantIdx, subdictIdxColTenantIdx );
		}
		subdictIdxColTenantIdx.put( pkey, Buff );

		Map< YCFBamIndexColPKey, YCFBamIndexColBuff > subdictIndexIdx;
		if( dictByIndexIdx.containsKey( keyIndexIdx ) ) {
			subdictIndexIdx = dictByIndexIdx.get( keyIndexIdx );
		}
		else {
			subdictIndexIdx = new HashMap< YCFBamIndexColPKey, YCFBamIndexColBuff >();
			dictByIndexIdx.put( keyIndexIdx, subdictIndexIdx );
		}
		subdictIndexIdx.put( pkey, Buff );

		Map< YCFBamIndexColPKey, YCFBamIndexColBuff > subdictDefSchemaIdx;
		if( dictByDefSchemaIdx.containsKey( keyDefSchemaIdx ) ) {
			subdictDefSchemaIdx = dictByDefSchemaIdx.get( keyDefSchemaIdx );
		}
		else {
			subdictDefSchemaIdx = new HashMap< YCFBamIndexColPKey, YCFBamIndexColBuff >();
			dictByDefSchemaIdx.put( keyDefSchemaIdx, subdictDefSchemaIdx );
		}
		subdictDefSchemaIdx.put( pkey, Buff );

		Map< YCFBamIndexColPKey, YCFBamIndexColBuff > subdictColIdx;
		if( dictByColIdx.containsKey( keyColIdx ) ) {
			subdictColIdx = dictByColIdx.get( keyColIdx );
		}
		else {
			subdictColIdx = new HashMap< YCFBamIndexColPKey, YCFBamIndexColBuff >();
			dictByColIdx.put( keyColIdx, subdictColIdx );
		}
		subdictColIdx.put( pkey, Buff );

		Map< YCFBamIndexColPKey, YCFBamIndexColBuff > subdictPrevIdx;
		if( dictByPrevIdx.containsKey( keyPrevIdx ) ) {
			subdictPrevIdx = dictByPrevIdx.get( keyPrevIdx );
		}
		else {
			subdictPrevIdx = new HashMap< YCFBamIndexColPKey, YCFBamIndexColBuff >();
			dictByPrevIdx.put( keyPrevIdx, subdictPrevIdx );
		}
		subdictPrevIdx.put( pkey, Buff );

		Map< YCFBamIndexColPKey, YCFBamIndexColBuff > subdictNextIdx;
		if( dictByNextIdx.containsKey( keyNextIdx ) ) {
			subdictNextIdx = dictByNextIdx.get( keyNextIdx );
		}
		else {
			subdictNextIdx = new HashMap< YCFBamIndexColPKey, YCFBamIndexColBuff >();
			dictByNextIdx.put( keyNextIdx, subdictNextIdx );
		}
		subdictNextIdx.put( pkey, Buff );

		Map< YCFBamIndexColPKey, YCFBamIndexColBuff > subdictIdxPrevIdx;
		if( dictByIdxPrevIdx.containsKey( keyIdxPrevIdx ) ) {
			subdictIdxPrevIdx = dictByIdxPrevIdx.get( keyIdxPrevIdx );
		}
		else {
			subdictIdxPrevIdx = new HashMap< YCFBamIndexColPKey, YCFBamIndexColBuff >();
			dictByIdxPrevIdx.put( keyIdxPrevIdx, subdictIdxPrevIdx );
		}
		subdictIdxPrevIdx.put( pkey, Buff );

		Map< YCFBamIndexColPKey, YCFBamIndexColBuff > subdictIdxNextIdx;
		if( dictByIdxNextIdx.containsKey( keyIdxNextIdx ) ) {
			subdictIdxNextIdx = dictByIdxNextIdx.get( keyIdxNextIdx );
		}
		else {
			subdictIdxNextIdx = new HashMap< YCFBamIndexColPKey, YCFBamIndexColBuff >();
			dictByIdxNextIdx.put( keyIdxNextIdx, subdictIdxNextIdx );
		}
		subdictIdxNextIdx.put( pkey, Buff );

		if( tail != null ) {
			YCFBamIndexColBuff tailEdit = schema.getFactoryIndexCol().newBuff();
			tailEdit.set( (YCFBamIndexColBuff)tail );
				tailEdit.setOptionalNextTenantId( Buff.getRequiredTenantId() );
				tailEdit.setOptionalNextId( Buff.getRequiredId() );
			schema.getTableIndexCol().updateIndexCol( Authorization, tailEdit );
		}
	}

	public YCFBamIndexColBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamIndexColPKey PKey )
	{
		final String S_ProcName = "YCFBamRamIndexCol.readDerived";
		YCFBamIndexColPKey key = schema.getFactoryIndexCol().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamIndexColBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamIndexColBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamIndexColPKey PKey )
	{
		final String S_ProcName = "YCFBamRamIndexCol.readDerived";
		YCFBamIndexColPKey key = schema.getFactoryIndexCol().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamIndexColBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamIndexColBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamIndexCol.readAllDerived";
		YCFBamIndexColBuff[] retList = new YCFBamIndexColBuff[ dictByPKey.values().size() ];
		Iterator< YCFBamIndexColBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamIndexColBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long IndexId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamIndexCol.readDerivedByUNameIdx";
		YCFBamIndexColByUNameIdxKey key = schema.getFactoryIndexCol().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );
		key.setRequiredName( Name );

		YCFBamIndexColBuff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamIndexColBuff[] readDerivedByIdxColTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamIndexCol.readDerivedByIdxColTenantIdx";
		YCFBamIndexColByIdxColTenantIdxKey key = schema.getFactoryIndexCol().newIdxColTenantIdxKey();
		key.setRequiredTenantId( TenantId );

		YCFBamIndexColBuff[] recArray;
		if( dictByIdxColTenantIdx.containsKey( key ) ) {
			Map< YCFBamIndexColPKey, YCFBamIndexColBuff > subdictIdxColTenantIdx
				= dictByIdxColTenantIdx.get( key );
			recArray = new YCFBamIndexColBuff[ subdictIdxColTenantIdx.size() ];
			Iterator< YCFBamIndexColBuff > iter = subdictIdxColTenantIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamIndexColPKey, YCFBamIndexColBuff > subdictIdxColTenantIdx
				= new HashMap< YCFBamIndexColPKey, YCFBamIndexColBuff >();
			dictByIdxColTenantIdx.put( key, subdictIdxColTenantIdx );
			recArray = new YCFBamIndexColBuff[0];
		}
		return( recArray );
	}

	public YCFBamIndexColBuff[] readDerivedByIndexIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long IndexId )
	{
		final String S_ProcName = "YCFBamRamIndexCol.readDerivedByIndexIdx";
		YCFBamIndexColByIndexIdxKey key = schema.getFactoryIndexCol().newIndexIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );

		YCFBamIndexColBuff[] recArray;
		if( dictByIndexIdx.containsKey( key ) ) {
			Map< YCFBamIndexColPKey, YCFBamIndexColBuff > subdictIndexIdx
				= dictByIndexIdx.get( key );
			recArray = new YCFBamIndexColBuff[ subdictIndexIdx.size() ];
			Iterator< YCFBamIndexColBuff > iter = subdictIndexIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamIndexColPKey, YCFBamIndexColBuff > subdictIndexIdx
				= new HashMap< YCFBamIndexColPKey, YCFBamIndexColBuff >();
			dictByIndexIdx.put( key, subdictIndexIdx );
			recArray = new YCFBamIndexColBuff[0];
		}
		return( recArray );
	}

	public YCFBamIndexColBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamIndexCol.readDerivedByDefSchemaIdx";
		YCFBamIndexColByDefSchemaIdxKey key = schema.getFactoryIndexCol().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );

		YCFBamIndexColBuff[] recArray;
		if( dictByDefSchemaIdx.containsKey( key ) ) {
			Map< YCFBamIndexColPKey, YCFBamIndexColBuff > subdictDefSchemaIdx
				= dictByDefSchemaIdx.get( key );
			recArray = new YCFBamIndexColBuff[ subdictDefSchemaIdx.size() ];
			Iterator< YCFBamIndexColBuff > iter = subdictDefSchemaIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamIndexColPKey, YCFBamIndexColBuff > subdictDefSchemaIdx
				= new HashMap< YCFBamIndexColPKey, YCFBamIndexColBuff >();
			dictByDefSchemaIdx.put( key, subdictDefSchemaIdx );
			recArray = new YCFBamIndexColBuff[0];
		}
		return( recArray );
	}

	public YCFBamIndexColBuff[] readDerivedByColIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ColumnId )
	{
		final String S_ProcName = "YCFBamRamIndexCol.readDerivedByColIdx";
		YCFBamIndexColByColIdxKey key = schema.getFactoryIndexCol().newColIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredColumnId( ColumnId );

		YCFBamIndexColBuff[] recArray;
		if( dictByColIdx.containsKey( key ) ) {
			Map< YCFBamIndexColPKey, YCFBamIndexColBuff > subdictColIdx
				= dictByColIdx.get( key );
			recArray = new YCFBamIndexColBuff[ subdictColIdx.size() ];
			Iterator< YCFBamIndexColBuff > iter = subdictColIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamIndexColPKey, YCFBamIndexColBuff > subdictColIdx
				= new HashMap< YCFBamIndexColPKey, YCFBamIndexColBuff >();
			dictByColIdx.put( key, subdictColIdx );
			recArray = new YCFBamIndexColBuff[0];
		}
		return( recArray );
	}

	public YCFBamIndexColBuff[] readDerivedByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "YCFBamRamIndexCol.readDerivedByPrevIdx";
		YCFBamIndexColByPrevIdxKey key = schema.getFactoryIndexCol().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );

		YCFBamIndexColBuff[] recArray;
		if( dictByPrevIdx.containsKey( key ) ) {
			Map< YCFBamIndexColPKey, YCFBamIndexColBuff > subdictPrevIdx
				= dictByPrevIdx.get( key );
			recArray = new YCFBamIndexColBuff[ subdictPrevIdx.size() ];
			Iterator< YCFBamIndexColBuff > iter = subdictPrevIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamIndexColPKey, YCFBamIndexColBuff > subdictPrevIdx
				= new HashMap< YCFBamIndexColPKey, YCFBamIndexColBuff >();
			dictByPrevIdx.put( key, subdictPrevIdx );
			recArray = new YCFBamIndexColBuff[0];
		}
		return( recArray );
	}

	public YCFBamIndexColBuff[] readDerivedByNextIdx( YCFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "YCFBamRamIndexCol.readDerivedByNextIdx";
		YCFBamIndexColByNextIdxKey key = schema.getFactoryIndexCol().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );

		YCFBamIndexColBuff[] recArray;
		if( dictByNextIdx.containsKey( key ) ) {
			Map< YCFBamIndexColPKey, YCFBamIndexColBuff > subdictNextIdx
				= dictByNextIdx.get( key );
			recArray = new YCFBamIndexColBuff[ subdictNextIdx.size() ];
			Iterator< YCFBamIndexColBuff > iter = subdictNextIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamIndexColPKey, YCFBamIndexColBuff > subdictNextIdx
				= new HashMap< YCFBamIndexColPKey, YCFBamIndexColBuff >();
			dictByNextIdx.put( key, subdictNextIdx );
			recArray = new YCFBamIndexColBuff[0];
		}
		return( recArray );
	}

	public YCFBamIndexColBuff[] readDerivedByIdxPrevIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long IndexId,
		Long PrevId )
	{
		final String S_ProcName = "YCFBamRamIndexCol.readDerivedByIdxPrevIdx";
		YCFBamIndexColByIdxPrevIdxKey key = schema.getFactoryIndexCol().newIdxPrevIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );
		key.setOptionalPrevId( PrevId );

		YCFBamIndexColBuff[] recArray;
		if( dictByIdxPrevIdx.containsKey( key ) ) {
			Map< YCFBamIndexColPKey, YCFBamIndexColBuff > subdictIdxPrevIdx
				= dictByIdxPrevIdx.get( key );
			recArray = new YCFBamIndexColBuff[ subdictIdxPrevIdx.size() ];
			Iterator< YCFBamIndexColBuff > iter = subdictIdxPrevIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamIndexColPKey, YCFBamIndexColBuff > subdictIdxPrevIdx
				= new HashMap< YCFBamIndexColPKey, YCFBamIndexColBuff >();
			dictByIdxPrevIdx.put( key, subdictIdxPrevIdx );
			recArray = new YCFBamIndexColBuff[0];
		}
		return( recArray );
	}

	public YCFBamIndexColBuff[] readDerivedByIdxNextIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long IndexId,
		Long NextId )
	{
		final String S_ProcName = "YCFBamRamIndexCol.readDerivedByIdxNextIdx";
		YCFBamIndexColByIdxNextIdxKey key = schema.getFactoryIndexCol().newIdxNextIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIndexId( IndexId );
		key.setOptionalNextId( NextId );

		YCFBamIndexColBuff[] recArray;
		if( dictByIdxNextIdx.containsKey( key ) ) {
			Map< YCFBamIndexColPKey, YCFBamIndexColBuff > subdictIdxNextIdx
				= dictByIdxNextIdx.get( key );
			recArray = new YCFBamIndexColBuff[ subdictIdxNextIdx.size() ];
			Iterator< YCFBamIndexColBuff > iter = subdictIdxNextIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamIndexColPKey, YCFBamIndexColBuff > subdictIdxNextIdx
				= new HashMap< YCFBamIndexColPKey, YCFBamIndexColBuff >();
			dictByIdxNextIdx.put( key, subdictIdxNextIdx );
			recArray = new YCFBamIndexColBuff[0];
		}
		return( recArray );
	}

	public YCFBamIndexColBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamIndexCol.readDerivedByIdIdx() ";
		YCFBamIndexColPKey key = schema.getFactoryIndexCol().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamIndexColBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamIndexColBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamIndexColPKey PKey )
	{
		final String S_ProcName = "YCFBamRamIndexCol.readBuff";
		YCFBamIndexColBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a825" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamIndexColBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamIndexColPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamIndexColBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a825" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamIndexColBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamIndexCol.readAllBuff";
		YCFBamIndexColBuff buff;
		ArrayList<YCFBamIndexColBuff> filteredList = new ArrayList<YCFBamIndexColBuff>();
		YCFBamIndexColBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a825" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamIndexColBuff[0] ) );
	}

	public YCFBamIndexColBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamIndexCol.readBuffByIdIdx() ";
		YCFBamIndexColBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a825" ) ) {
			return( (YCFBamIndexColBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamIndexColBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long IndexId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamIndexCol.readBuffByUNameIdx() ";
		YCFBamIndexColBuff buff = readDerivedByUNameIdx( Authorization,
			TenantId,
			IndexId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a825" ) ) {
			return( (YCFBamIndexColBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamIndexColBuff[] readBuffByIdxColTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamIndexCol.readBuffByIdxColTenantIdx() ";
		YCFBamIndexColBuff buff;
		ArrayList<YCFBamIndexColBuff> filteredList = new ArrayList<YCFBamIndexColBuff>();
		YCFBamIndexColBuff[] buffList = readDerivedByIdxColTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a825" ) ) {
				filteredList.add( (YCFBamIndexColBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamIndexColBuff[0] ) );
	}

	public YCFBamIndexColBuff[] readBuffByIndexIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long IndexId )
	{
		final String S_ProcName = "YCFBamRamIndexCol.readBuffByIndexIdx() ";
		YCFBamIndexColBuff buff;
		ArrayList<YCFBamIndexColBuff> filteredList = new ArrayList<YCFBamIndexColBuff>();
		YCFBamIndexColBuff[] buffList = readDerivedByIndexIdx( Authorization,
			TenantId,
			IndexId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a825" ) ) {
				filteredList.add( (YCFBamIndexColBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamIndexColBuff[0] ) );
	}

	public YCFBamIndexColBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamIndexCol.readBuffByDefSchemaIdx() ";
		YCFBamIndexColBuff buff;
		ArrayList<YCFBamIndexColBuff> filteredList = new ArrayList<YCFBamIndexColBuff>();
		YCFBamIndexColBuff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a825" ) ) {
				filteredList.add( (YCFBamIndexColBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamIndexColBuff[0] ) );
	}

	public YCFBamIndexColBuff[] readBuffByColIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ColumnId )
	{
		final String S_ProcName = "YCFBamRamIndexCol.readBuffByColIdx() ";
		YCFBamIndexColBuff buff;
		ArrayList<YCFBamIndexColBuff> filteredList = new ArrayList<YCFBamIndexColBuff>();
		YCFBamIndexColBuff[] buffList = readDerivedByColIdx( Authorization,
			TenantId,
			ColumnId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a825" ) ) {
				filteredList.add( (YCFBamIndexColBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamIndexColBuff[0] ) );
	}

	public YCFBamIndexColBuff[] readBuffByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "YCFBamRamIndexCol.readBuffByPrevIdx() ";
		YCFBamIndexColBuff buff;
		ArrayList<YCFBamIndexColBuff> filteredList = new ArrayList<YCFBamIndexColBuff>();
		YCFBamIndexColBuff[] buffList = readDerivedByPrevIdx( Authorization,
			PrevTenantId,
			PrevId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a825" ) ) {
				filteredList.add( (YCFBamIndexColBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamIndexColBuff[0] ) );
	}

	public YCFBamIndexColBuff[] readBuffByNextIdx( YCFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "YCFBamRamIndexCol.readBuffByNextIdx() ";
		YCFBamIndexColBuff buff;
		ArrayList<YCFBamIndexColBuff> filteredList = new ArrayList<YCFBamIndexColBuff>();
		YCFBamIndexColBuff[] buffList = readDerivedByNextIdx( Authorization,
			NextTenantId,
			NextId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a825" ) ) {
				filteredList.add( (YCFBamIndexColBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamIndexColBuff[0] ) );
	}

	public YCFBamIndexColBuff[] readBuffByIdxPrevIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long IndexId,
		Long PrevId )
	{
		final String S_ProcName = "YCFBamRamIndexCol.readBuffByIdxPrevIdx() ";
		YCFBamIndexColBuff buff;
		ArrayList<YCFBamIndexColBuff> filteredList = new ArrayList<YCFBamIndexColBuff>();
		YCFBamIndexColBuff[] buffList = readDerivedByIdxPrevIdx( Authorization,
			TenantId,
			IndexId,
			PrevId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a825" ) ) {
				filteredList.add( (YCFBamIndexColBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamIndexColBuff[0] ) );
	}

	public YCFBamIndexColBuff[] readBuffByIdxNextIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long IndexId,
		Long NextId )
	{
		final String S_ProcName = "YCFBamRamIndexCol.readBuffByIdxNextIdx() ";
		YCFBamIndexColBuff buff;
		ArrayList<YCFBamIndexColBuff> filteredList = new ArrayList<YCFBamIndexColBuff>();
		YCFBamIndexColBuff[] buffList = readDerivedByIdxNextIdx( Authorization,
			TenantId,
			IndexId,
			NextId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a825" ) ) {
				filteredList.add( (YCFBamIndexColBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamIndexColBuff[0] ) );
	}

	/**
	 *	Move the specified buffer up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	public YCFBamIndexColBuff moveBuffUp( YCFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision )
	{
		final String S_ProcName = "moveBuffUp";

		YCFBamIndexColBuff grandprev = null;
		YCFBamIndexColBuff prev = null;
		YCFBamIndexColBuff cur = null;
		YCFBamIndexColBuff next = null;

		cur = schema.getTableIndexCol().readDerivedByIdIdx(Authorization, TenantId, Id);
		if( cur == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object" );
		}

		if( ( cur.getOptionalPrevTenantId() == null )
			&& ( cur.getOptionalPrevId() == null ) )
		{
			return( (YCFBamIndexColBuff)cur );
		}

		prev = schema.getTableIndexCol().readDerivedByIdIdx(Authorization, cur.getOptionalPrevTenantId(), cur.getOptionalPrevId() );
		if( prev == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object.prev" );
		}

		if( ( prev.getOptionalPrevTenantId() != null )
			&& ( prev.getOptionalPrevId() != null ) )
		{
			grandprev = schema.getTableIndexCol().readDerivedByIdIdx(Authorization, prev.getOptionalPrevTenantId(), prev.getOptionalPrevId() );
			if( grandprev == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.prev.prev" );
			}
		}

		if( ( cur.getOptionalNextTenantId() != null )
			&& ( cur.getOptionalNextId() != null ) )
		{
			next = schema.getTableIndexCol().readDerivedByIdIdx(Authorization, cur.getOptionalNextTenantId(), cur.getOptionalNextId() );
			if( next == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.next" );
			}
		}

		String classCode = prev.getClassCode();
		YCFBamIndexColBuff newInstance;
			if( classCode.equals( "a825" ) ) {
				newInstance = schema.getFactoryIndexCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamIndexColBuff editPrev = newInstance;
		editPrev.set( prev );

		classCode = cur.getClassCode();
			if( classCode.equals( "a825" ) ) {
				newInstance = schema.getFactoryIndexCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamIndexColBuff editCur = newInstance;
		editCur.set( cur );

		YCFBamIndexColBuff editGrandprev = null;
		if( grandprev != null ) {
			classCode = grandprev.getClassCode();
			if( classCode.equals( "a825" ) ) {
				newInstance = schema.getFactoryIndexCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editGrandprev = newInstance;
			editGrandprev.set( grandprev );
		}

		YCFBamIndexColBuff editNext = null;
		if( next != null ) {
			classCode = next.getClassCode();
			if( classCode.equals( "a825" ) ) {
				newInstance = schema.getFactoryIndexCol().newBuff();
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
			if( classCode.equals( "a825" ) ) {
				schema.getTableIndexCol().updateIndexCol( Authorization, editGrandprev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		classCode = editPrev.getClassCode();
			if( classCode.equals( "a825" ) ) {
				schema.getTableIndexCol().updateIndexCol( Authorization, editPrev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		classCode = editCur.getClassCode();
			if( classCode.equals( "a825" ) ) {
				schema.getTableIndexCol().updateIndexCol( Authorization, editCur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		if( editNext != null ) {
			classCode = editNext.getClassCode();
			if( classCode.equals( "a825" ) ) {
				schema.getTableIndexCol().updateIndexCol( Authorization, editNext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		return( (YCFBamIndexColBuff)editCur );
	}

	/**
	 *	Move the specified buffer down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	public YCFBamIndexColBuff moveBuffDown( YCFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision )
	{
		final String S_ProcName = "moveBuffDown";

		YCFBamIndexColBuff prev = null;
		YCFBamIndexColBuff cur = null;
		YCFBamIndexColBuff next = null;
		YCFBamIndexColBuff grandnext = null;

		cur = schema.getTableIndexCol().readDerivedByIdIdx(Authorization, TenantId, Id);
		if( cur == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object" );
		}

		if( ( cur.getOptionalNextTenantId() == null )
			&& ( cur.getOptionalNextId() == null ) )
		{
			return( (YCFBamIndexColBuff)cur );
		}

		next = schema.getTableIndexCol().readDerivedByIdIdx(Authorization, cur.getOptionalNextTenantId(), cur.getOptionalNextId() );
		if( next == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object.next" );
		}

		if( ( next.getOptionalNextTenantId() != null )
			&& ( next.getOptionalNextId() != null ) )
		{
			grandnext = schema.getTableIndexCol().readDerivedByIdIdx(Authorization, next.getOptionalNextTenantId(), next.getOptionalNextId() );
			if( grandnext == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.next.next" );
			}
		}

		if( ( cur.getOptionalPrevTenantId() != null )
			&& ( cur.getOptionalPrevId() != null ) )
		{
			prev = schema.getTableIndexCol().readDerivedByIdIdx(Authorization, cur.getOptionalPrevTenantId(), cur.getOptionalPrevId() );
			if( prev == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.prev" );
			}
		}

		String classCode = cur.getClassCode();
		YCFBamIndexColBuff newInstance;
			if( classCode.equals( "a825" ) ) {
				newInstance = schema.getFactoryIndexCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamIndexColBuff editCur = newInstance;
		editCur.set( cur );

		classCode = next.getClassCode();
			if( classCode.equals( "a825" ) ) {
				newInstance = schema.getFactoryIndexCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamIndexColBuff editNext = newInstance;
		editNext.set( next );

		YCFBamIndexColBuff editGrandnext = null;
		if( grandnext != null ) {
			classCode = grandnext.getClassCode();
			if( classCode.equals( "a825" ) ) {
				newInstance = schema.getFactoryIndexCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editGrandnext = newInstance;
			editGrandnext.set( grandnext );
		}

		YCFBamIndexColBuff editPrev = null;
		if( prev != null ) {
			classCode = prev.getClassCode();
			if( classCode.equals( "a825" ) ) {
				newInstance = schema.getFactoryIndexCol().newBuff();
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
			if( classCode.equals( "a825" ) ) {
				schema.getTableIndexCol().updateIndexCol( Authorization, editPrev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		classCode = editCur.getClassCode();
			if( classCode.equals( "a825" ) ) {
				schema.getTableIndexCol().updateIndexCol( Authorization, editCur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		classCode = editNext.getClassCode();
			if( classCode.equals( "a825" ) ) {
				schema.getTableIndexCol().updateIndexCol( Authorization, editNext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		if( editGrandnext != null ) {
			classCode = editGrandnext.getClassCode();
			if( classCode.equals( "a825" ) ) {
				schema.getTableIndexCol().updateIndexCol( Authorization, editGrandnext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		return( (YCFBamIndexColBuff)editCur );
	}

	public void updateIndexCol( YCFSecAuthorization Authorization,
		YCFBamIndexColBuff Buff )
	{
		YCFBamIndexColPKey pkey = schema.getFactoryIndexCol().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamIndexColBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateIndexCol",
				"Existing record not found",
				"IndexCol",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateIndexCol",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFBamIndexColByUNameIdxKey existingKeyUNameIdx = schema.getFactoryIndexCol().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyUNameIdx.setRequiredIndexId( existing.getRequiredIndexId() );
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamIndexColByUNameIdxKey newKeyUNameIdx = schema.getFactoryIndexCol().newUNameIdxKey();
		newKeyUNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyUNameIdx.setRequiredIndexId( Buff.getRequiredIndexId() );
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamIndexColByIdxColTenantIdxKey existingKeyIdxColTenantIdx = schema.getFactoryIndexCol().newIdxColTenantIdxKey();
		existingKeyIdxColTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFBamIndexColByIdxColTenantIdxKey newKeyIdxColTenantIdx = schema.getFactoryIndexCol().newIdxColTenantIdxKey();
		newKeyIdxColTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFBamIndexColByIndexIdxKey existingKeyIndexIdx = schema.getFactoryIndexCol().newIndexIdxKey();
		existingKeyIndexIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyIndexIdx.setRequiredIndexId( existing.getRequiredIndexId() );

		YCFBamIndexColByIndexIdxKey newKeyIndexIdx = schema.getFactoryIndexCol().newIndexIdxKey();
		newKeyIndexIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyIndexIdx.setRequiredIndexId( Buff.getRequiredIndexId() );

		YCFBamIndexColByDefSchemaIdxKey existingKeyDefSchemaIdx = schema.getFactoryIndexCol().newDefSchemaIdxKey();
		existingKeyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		existingKeyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		YCFBamIndexColByDefSchemaIdxKey newKeyDefSchemaIdx = schema.getFactoryIndexCol().newDefSchemaIdxKey();
		newKeyDefSchemaIdx.setOptionalDefSchemaTenantId( Buff.getOptionalDefSchemaTenantId() );
		newKeyDefSchemaIdx.setOptionalDefSchemaId( Buff.getOptionalDefSchemaId() );

		YCFBamIndexColByColIdxKey existingKeyColIdx = schema.getFactoryIndexCol().newColIdxKey();
		existingKeyColIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyColIdx.setRequiredColumnId( existing.getRequiredColumnId() );

		YCFBamIndexColByColIdxKey newKeyColIdx = schema.getFactoryIndexCol().newColIdxKey();
		newKeyColIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyColIdx.setRequiredColumnId( Buff.getRequiredColumnId() );

		YCFBamIndexColByPrevIdxKey existingKeyPrevIdx = schema.getFactoryIndexCol().newPrevIdxKey();
		existingKeyPrevIdx.setOptionalPrevTenantId( existing.getOptionalPrevTenantId() );
		existingKeyPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamIndexColByPrevIdxKey newKeyPrevIdx = schema.getFactoryIndexCol().newPrevIdxKey();
		newKeyPrevIdx.setOptionalPrevTenantId( Buff.getOptionalPrevTenantId() );
		newKeyPrevIdx.setOptionalPrevId( Buff.getOptionalPrevId() );

		YCFBamIndexColByNextIdxKey existingKeyNextIdx = schema.getFactoryIndexCol().newNextIdxKey();
		existingKeyNextIdx.setOptionalNextTenantId( existing.getOptionalNextTenantId() );
		existingKeyNextIdx.setOptionalNextId( existing.getOptionalNextId() );

		YCFBamIndexColByNextIdxKey newKeyNextIdx = schema.getFactoryIndexCol().newNextIdxKey();
		newKeyNextIdx.setOptionalNextTenantId( Buff.getOptionalNextTenantId() );
		newKeyNextIdx.setOptionalNextId( Buff.getOptionalNextId() );

		YCFBamIndexColByIdxPrevIdxKey existingKeyIdxPrevIdx = schema.getFactoryIndexCol().newIdxPrevIdxKey();
		existingKeyIdxPrevIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyIdxPrevIdx.setRequiredIndexId( existing.getRequiredIndexId() );
		existingKeyIdxPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamIndexColByIdxPrevIdxKey newKeyIdxPrevIdx = schema.getFactoryIndexCol().newIdxPrevIdxKey();
		newKeyIdxPrevIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyIdxPrevIdx.setRequiredIndexId( Buff.getRequiredIndexId() );
		newKeyIdxPrevIdx.setOptionalPrevId( Buff.getOptionalPrevId() );

		YCFBamIndexColByIdxNextIdxKey existingKeyIdxNextIdx = schema.getFactoryIndexCol().newIdxNextIdxKey();
		existingKeyIdxNextIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyIdxNextIdx.setRequiredIndexId( existing.getRequiredIndexId() );
		existingKeyIdxNextIdx.setOptionalNextId( existing.getOptionalNextId() );

		YCFBamIndexColByIdxNextIdxKey newKeyIdxNextIdx = schema.getFactoryIndexCol().newIdxNextIdxKey();
		newKeyIdxNextIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyIdxNextIdx.setRequiredIndexId( Buff.getRequiredIndexId() );
		newKeyIdxNextIdx.setOptionalNextId( Buff.getOptionalNextId() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateIndexCol",
					"IndexColUNameIdx",
					newKeyUNameIdx );
			}
		}

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableTenant().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateIndexCol",
						"Owner",
						"Tenant",
						"Tenant",
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
						"updateIndexCol",
						"Container",
						"Index",
						"Index",
						null );
				}
			}
		}

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableValue().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredColumnId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateIndexCol",
						"Lookup",
						"Column",
						"Value",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamIndexColPKey, YCFBamIndexColBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

		subdict = dictByIdxColTenantIdx.get( existingKeyIdxColTenantIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByIdxColTenantIdx.containsKey( newKeyIdxColTenantIdx ) ) {
			subdict = dictByIdxColTenantIdx.get( newKeyIdxColTenantIdx );
		}
		else {
			subdict = new HashMap< YCFBamIndexColPKey, YCFBamIndexColBuff >();
			dictByIdxColTenantIdx.put( newKeyIdxColTenantIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByIndexIdx.get( existingKeyIndexIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByIndexIdx.containsKey( newKeyIndexIdx ) ) {
			subdict = dictByIndexIdx.get( newKeyIndexIdx );
		}
		else {
			subdict = new HashMap< YCFBamIndexColPKey, YCFBamIndexColBuff >();
			dictByIndexIdx.put( newKeyIndexIdx, subdict );
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
			subdict = new HashMap< YCFBamIndexColPKey, YCFBamIndexColBuff >();
			dictByDefSchemaIdx.put( newKeyDefSchemaIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByColIdx.get( existingKeyColIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByColIdx.containsKey( newKeyColIdx ) ) {
			subdict = dictByColIdx.get( newKeyColIdx );
		}
		else {
			subdict = new HashMap< YCFBamIndexColPKey, YCFBamIndexColBuff >();
			dictByColIdx.put( newKeyColIdx, subdict );
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
			subdict = new HashMap< YCFBamIndexColPKey, YCFBamIndexColBuff >();
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
			subdict = new HashMap< YCFBamIndexColPKey, YCFBamIndexColBuff >();
			dictByNextIdx.put( newKeyNextIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByIdxPrevIdx.get( existingKeyIdxPrevIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByIdxPrevIdx.containsKey( newKeyIdxPrevIdx ) ) {
			subdict = dictByIdxPrevIdx.get( newKeyIdxPrevIdx );
		}
		else {
			subdict = new HashMap< YCFBamIndexColPKey, YCFBamIndexColBuff >();
			dictByIdxPrevIdx.put( newKeyIdxPrevIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByIdxNextIdx.get( existingKeyIdxNextIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByIdxNextIdx.containsKey( newKeyIdxNextIdx ) ) {
			subdict = dictByIdxNextIdx.get( newKeyIdxNextIdx );
		}
		else {
			subdict = new HashMap< YCFBamIndexColPKey, YCFBamIndexColBuff >();
			dictByIdxNextIdx.put( newKeyIdxNextIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteIndexCol( YCFSecAuthorization Authorization,
		YCFBamIndexColBuff Buff )
	{
		final String S_ProcName = "YCFBamRamIndexColTable.deleteIndexCol() ";
		String classCode;
		YCFBamIndexColPKey pkey = schema.getFactoryIndexCol().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamIndexColBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteIndexCol",
				pkey );
		}
		long varTenantId = existing.getRequiredTenantId();
		long varIndexId = existing.getRequiredIndexId();
		YCFBamIndexBuff container = schema.getTableIndex().readDerivedByIdIdx( Authorization,
			varTenantId,
			varIndexId );
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

		YCFBamIndexColBuff prev = null;
		if( ( prevTenantId != null )
			&& ( prevId != null ) )
		{
			prev = schema.getTableIndexCol().readDerivedByIdIdx( Authorization,
				prevTenantId,
				prevId );
			if( prev == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"prev" );
			}
			YCFBamIndexColBuff editPrev;
			classCode = prev.getClassCode();
			if( classCode.equals( "a825" ) ) {
				editPrev = schema.getFactoryIndexCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editPrev.set( prev );
			editPrev.setOptionalNextTenantId( nextTenantId );
			editPrev.setOptionalNextId( nextId );
			if( classCode.equals( "a825" ) ) {
				schema.getTableIndexCol().updateIndexCol( Authorization, editPrev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		YCFBamIndexColBuff next = null;
		if( ( nextTenantId != null )
			&& ( nextId != null ) )
		{
			next = schema.getTableIndexCol().readDerivedByIdIdx( Authorization,
				nextTenantId,
				nextId );
			if( next == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"next" );
			}
			YCFBamIndexColBuff editNext;
			classCode = next.getClassCode();
			if( classCode.equals( "a825" ) ) {
				editNext = schema.getFactoryIndexCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editNext.set( next );
			editNext.setOptionalPrevTenantId( prevTenantId );
			editNext.setOptionalPrevId( prevId );
			if( classCode.equals( "a825" ) ) {
				schema.getTableIndexCol().updateIndexCol( Authorization, editNext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

					schema.getTableRelationCol().deleteRelationColByFromColIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
					schema.getTableRelationCol().deleteRelationColByToColIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		YCFBamIndexColByUNameIdxKey keyUNameIdx = schema.getFactoryIndexCol().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredIndexId( existing.getRequiredIndexId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamIndexColByIdxColTenantIdxKey keyIdxColTenantIdx = schema.getFactoryIndexCol().newIdxColTenantIdxKey();
		keyIdxColTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFBamIndexColByIndexIdxKey keyIndexIdx = schema.getFactoryIndexCol().newIndexIdxKey();
		keyIndexIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyIndexIdx.setRequiredIndexId( existing.getRequiredIndexId() );

		YCFBamIndexColByDefSchemaIdxKey keyDefSchemaIdx = schema.getFactoryIndexCol().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		YCFBamIndexColByColIdxKey keyColIdx = schema.getFactoryIndexCol().newColIdxKey();
		keyColIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyColIdx.setRequiredColumnId( existing.getRequiredColumnId() );

		YCFBamIndexColByPrevIdxKey keyPrevIdx = schema.getFactoryIndexCol().newPrevIdxKey();
		keyPrevIdx.setOptionalPrevTenantId( existing.getOptionalPrevTenantId() );
		keyPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamIndexColByNextIdxKey keyNextIdx = schema.getFactoryIndexCol().newNextIdxKey();
		keyNextIdx.setOptionalNextTenantId( existing.getOptionalNextTenantId() );
		keyNextIdx.setOptionalNextId( existing.getOptionalNextId() );

		YCFBamIndexColByIdxPrevIdxKey keyIdxPrevIdx = schema.getFactoryIndexCol().newIdxPrevIdxKey();
		keyIdxPrevIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyIdxPrevIdx.setRequiredIndexId( existing.getRequiredIndexId() );
		keyIdxPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamIndexColByIdxNextIdxKey keyIdxNextIdx = schema.getFactoryIndexCol().newIdxNextIdxKey();
		keyIdxNextIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyIdxNextIdx.setRequiredIndexId( existing.getRequiredIndexId() );
		keyIdxNextIdx.setOptionalNextId( existing.getOptionalNextId() );

		// Validate reverse foreign keys

		if( schema.getTableRelationCol().readDerivedByFromColIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ).length > 0 )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteIndexCol",
				"Lookup",
				"LookupFromCol",
				"RelationCol",
				pkey );
		}

		if( schema.getTableRelationCol().readDerivedByToColIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ).length > 0 )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteIndexCol",
				"Lookup",
				"LookupToCol",
				"RelationCol",
				pkey );
		}

		// Delete is valid
		Map< YCFBamIndexColPKey, YCFBamIndexColBuff > subdict;

		dictByPKey.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

		subdict = dictByIdxColTenantIdx.get( keyIdxColTenantIdx );
		subdict.remove( pkey );

		subdict = dictByIndexIdx.get( keyIndexIdx );
		subdict.remove( pkey );

		subdict = dictByDefSchemaIdx.get( keyDefSchemaIdx );
		subdict.remove( pkey );

		subdict = dictByColIdx.get( keyColIdx );
		subdict.remove( pkey );

		subdict = dictByPrevIdx.get( keyPrevIdx );
		subdict.remove( pkey );

		subdict = dictByNextIdx.get( keyNextIdx );
		subdict.remove( pkey );

		subdict = dictByIdxPrevIdx.get( keyIdxPrevIdx );
		subdict.remove( pkey );

		subdict = dictByIdxNextIdx.get( keyIdxNextIdx );
		subdict.remove( pkey );

	}
	public void deleteIndexColByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamIndexColPKey key = schema.getFactoryIndexCol().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteIndexColByIdIdx( Authorization, key );
	}

	public void deleteIndexColByIdIdx( YCFSecAuthorization Authorization,
		YCFBamIndexColPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamIndexColBuff cur;
		LinkedList<YCFBamIndexColBuff> matchSet = new LinkedList<YCFBamIndexColBuff>();
		Iterator<YCFBamIndexColBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamIndexColBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableIndexCol().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteIndexCol( Authorization, cur );
		}
	}

	public void deleteIndexColByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argIndexId,
		String argName )
	{
		YCFBamIndexColByUNameIdxKey key = schema.getFactoryIndexCol().newUNameIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredIndexId( argIndexId );
		key.setRequiredName( argName );
		deleteIndexColByUNameIdx( Authorization, key );
	}

	public void deleteIndexColByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamIndexColByUNameIdxKey argKey )
	{
		YCFBamIndexColBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamIndexColBuff> matchSet = new LinkedList<YCFBamIndexColBuff>();
		Iterator<YCFBamIndexColBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamIndexColBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableIndexCol().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteIndexCol( Authorization, cur );
		}
	}

	public void deleteIndexColByIdxColTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamIndexColByIdxColTenantIdxKey key = schema.getFactoryIndexCol().newIdxColTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteIndexColByIdxColTenantIdx( Authorization, key );
	}

	public void deleteIndexColByIdxColTenantIdx( YCFSecAuthorization Authorization,
		YCFBamIndexColByIdxColTenantIdxKey argKey )
	{
		YCFBamIndexColBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamIndexColBuff> matchSet = new LinkedList<YCFBamIndexColBuff>();
		Iterator<YCFBamIndexColBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamIndexColBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableIndexCol().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteIndexCol( Authorization, cur );
		}
	}

	public void deleteIndexColByIndexIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argIndexId )
	{
		YCFBamIndexColByIndexIdxKey key = schema.getFactoryIndexCol().newIndexIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredIndexId( argIndexId );
		deleteIndexColByIndexIdx( Authorization, key );
	}

	public void deleteIndexColByIndexIdx( YCFSecAuthorization Authorization,
		YCFBamIndexColByIndexIdxKey argKey )
	{
		YCFBamIndexColBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamIndexColBuff> matchSet = new LinkedList<YCFBamIndexColBuff>();
		Iterator<YCFBamIndexColBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamIndexColBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableIndexCol().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteIndexCol( Authorization, cur );
		}
	}

	public void deleteIndexColByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamIndexColByDefSchemaIdxKey key = schema.getFactoryIndexCol().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deleteIndexColByDefSchemaIdx( Authorization, key );
	}

	public void deleteIndexColByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamIndexColByDefSchemaIdxKey argKey )
	{
		YCFBamIndexColBuff cur;
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
		LinkedList<YCFBamIndexColBuff> matchSet = new LinkedList<YCFBamIndexColBuff>();
		Iterator<YCFBamIndexColBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamIndexColBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableIndexCol().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteIndexCol( Authorization, cur );
		}
	}

	public void deleteIndexColByColIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argColumnId )
	{
		YCFBamIndexColByColIdxKey key = schema.getFactoryIndexCol().newColIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredColumnId( argColumnId );
		deleteIndexColByColIdx( Authorization, key );
	}

	public void deleteIndexColByColIdx( YCFSecAuthorization Authorization,
		YCFBamIndexColByColIdxKey argKey )
	{
		YCFBamIndexColBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamIndexColBuff> matchSet = new LinkedList<YCFBamIndexColBuff>();
		Iterator<YCFBamIndexColBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamIndexColBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableIndexCol().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteIndexCol( Authorization, cur );
		}
	}

	public void deleteIndexColByPrevIdx( YCFSecAuthorization Authorization,
		Long argPrevTenantId,
		Long argPrevId )
	{
		YCFBamIndexColByPrevIdxKey key = schema.getFactoryIndexCol().newPrevIdxKey();
		key.setOptionalPrevTenantId( argPrevTenantId );
		key.setOptionalPrevId( argPrevId );
		deleteIndexColByPrevIdx( Authorization, key );
	}

	public void deleteIndexColByPrevIdx( YCFSecAuthorization Authorization,
		YCFBamIndexColByPrevIdxKey argKey )
	{
		YCFBamIndexColBuff cur;
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
		LinkedList<YCFBamIndexColBuff> matchSet = new LinkedList<YCFBamIndexColBuff>();
		Iterator<YCFBamIndexColBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamIndexColBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableIndexCol().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteIndexCol( Authorization, cur );
		}
	}

	public void deleteIndexColByNextIdx( YCFSecAuthorization Authorization,
		Long argNextTenantId,
		Long argNextId )
	{
		YCFBamIndexColByNextIdxKey key = schema.getFactoryIndexCol().newNextIdxKey();
		key.setOptionalNextTenantId( argNextTenantId );
		key.setOptionalNextId( argNextId );
		deleteIndexColByNextIdx( Authorization, key );
	}

	public void deleteIndexColByNextIdx( YCFSecAuthorization Authorization,
		YCFBamIndexColByNextIdxKey argKey )
	{
		YCFBamIndexColBuff cur;
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
		LinkedList<YCFBamIndexColBuff> matchSet = new LinkedList<YCFBamIndexColBuff>();
		Iterator<YCFBamIndexColBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamIndexColBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableIndexCol().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteIndexCol( Authorization, cur );
		}
	}

	public void deleteIndexColByIdxPrevIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argIndexId,
		Long argPrevId )
	{
		YCFBamIndexColByIdxPrevIdxKey key = schema.getFactoryIndexCol().newIdxPrevIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredIndexId( argIndexId );
		key.setOptionalPrevId( argPrevId );
		deleteIndexColByIdxPrevIdx( Authorization, key );
	}

	public void deleteIndexColByIdxPrevIdx( YCFSecAuthorization Authorization,
		YCFBamIndexColByIdxPrevIdxKey argKey )
	{
		YCFBamIndexColBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( argKey.getOptionalPrevId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamIndexColBuff> matchSet = new LinkedList<YCFBamIndexColBuff>();
		Iterator<YCFBamIndexColBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamIndexColBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableIndexCol().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteIndexCol( Authorization, cur );
		}
	}

	public void deleteIndexColByIdxNextIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argIndexId,
		Long argNextId )
	{
		YCFBamIndexColByIdxNextIdxKey key = schema.getFactoryIndexCol().newIdxNextIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredIndexId( argIndexId );
		key.setOptionalNextId( argNextId );
		deleteIndexColByIdxNextIdx( Authorization, key );
	}

	public void deleteIndexColByIdxNextIdx( YCFSecAuthorization Authorization,
		YCFBamIndexColByIdxNextIdxKey argKey )
	{
		YCFBamIndexColBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( argKey.getOptionalNextId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamIndexColBuff> matchSet = new LinkedList<YCFBamIndexColBuff>();
		Iterator<YCFBamIndexColBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamIndexColBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableIndexCol().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteIndexCol( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
