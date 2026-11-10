
// Description: Java 11 in-memory RAM DbIO implementation for EnumTag.

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
 *	YCFBamRamEnumTagTable in-memory RAM DbIO implementation
 *	for EnumTag.
 */
public class YCFBamRamEnumTagTable
	implements IYCFBamEnumTagTable
{
	private IYCFBamSchema schema;
	private Map< YCFBamEnumTagPKey,
				YCFBamEnumTagBuff > dictByPKey
		= new HashMap< YCFBamEnumTagPKey,
				YCFBamEnumTagBuff >();
	private Map< YCFBamEnumTagByEnumTagTenantIdxKey,
				Map< YCFBamEnumTagPKey,
					YCFBamEnumTagBuff >> dictByEnumTagTenantIdx
		= new HashMap< YCFBamEnumTagByEnumTagTenantIdxKey,
				Map< YCFBamEnumTagPKey,
					YCFBamEnumTagBuff >>();
	private Map< YCFBamEnumTagByEnumIdxKey,
				Map< YCFBamEnumTagPKey,
					YCFBamEnumTagBuff >> dictByEnumIdx
		= new HashMap< YCFBamEnumTagByEnumIdxKey,
				Map< YCFBamEnumTagPKey,
					YCFBamEnumTagBuff >>();
	private Map< YCFBamEnumTagByDefSchemaIdxKey,
				Map< YCFBamEnumTagPKey,
					YCFBamEnumTagBuff >> dictByDefSchemaIdx
		= new HashMap< YCFBamEnumTagByDefSchemaIdxKey,
				Map< YCFBamEnumTagPKey,
					YCFBamEnumTagBuff >>();
	private Map< YCFBamEnumTagByEnumNameIdxKey,
			YCFBamEnumTagBuff > dictByEnumNameIdx
		= new HashMap< YCFBamEnumTagByEnumNameIdxKey,
			YCFBamEnumTagBuff >();
	private Map< YCFBamEnumTagByPrevIdxKey,
				Map< YCFBamEnumTagPKey,
					YCFBamEnumTagBuff >> dictByPrevIdx
		= new HashMap< YCFBamEnumTagByPrevIdxKey,
				Map< YCFBamEnumTagPKey,
					YCFBamEnumTagBuff >>();
	private Map< YCFBamEnumTagByNextIdxKey,
				Map< YCFBamEnumTagPKey,
					YCFBamEnumTagBuff >> dictByNextIdx
		= new HashMap< YCFBamEnumTagByNextIdxKey,
				Map< YCFBamEnumTagPKey,
					YCFBamEnumTagBuff >>();

	public YCFBamRamEnumTagTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createEnumTag( YCFSecAuthorization Authorization,
		YCFBamEnumTagBuff Buff )
	{
		final String S_ProcName = "createEnumTag";
			YCFBamEnumTagBuff tail = null;

			YCFBamEnumTagBuff[] siblings = schema.getTableEnumTag().readDerivedByEnumIdx( Authorization,
				Buff.getRequiredTenantId(),
				Buff.getRequiredEnumId() );
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
		
		YCFBamEnumTagPKey pkey = schema.getFactoryEnumTag().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( ((YCFBamRamTenantTable)schema.getTableTenant()).nextEnumTagIdGen( Authorization,
			Buff.getRequiredTenantId() ) );
		Buff.setRequiredTenantId( pkey.getRequiredTenantId() );
		Buff.setRequiredId( pkey.getRequiredId() );
		YCFBamEnumTagByEnumTagTenantIdxKey keyEnumTagTenantIdx = schema.getFactoryEnumTag().newEnumTagTenantIdxKey();
		keyEnumTagTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFBamEnumTagByEnumIdxKey keyEnumIdx = schema.getFactoryEnumTag().newEnumIdxKey();
		keyEnumIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyEnumIdx.setRequiredEnumId( Buff.getRequiredEnumId() );

		YCFBamEnumTagByDefSchemaIdxKey keyDefSchemaIdx = schema.getFactoryEnumTag().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( Buff.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( Buff.getOptionalDefSchemaId() );

		YCFBamEnumTagByEnumNameIdxKey keyEnumNameIdx = schema.getFactoryEnumTag().newEnumNameIdxKey();
		keyEnumNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyEnumNameIdx.setRequiredEnumId( Buff.getRequiredEnumId() );
		keyEnumNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamEnumTagByPrevIdxKey keyPrevIdx = schema.getFactoryEnumTag().newPrevIdxKey();
		keyPrevIdx.setOptionalPrevTenantId( Buff.getOptionalPrevTenantId() );
		keyPrevIdx.setOptionalPrevId( Buff.getOptionalPrevId() );

		YCFBamEnumTagByNextIdxKey keyNextIdx = schema.getFactoryEnumTag().newNextIdxKey();
		keyNextIdx.setOptionalNextTenantId( Buff.getOptionalNextTenantId() );
		keyNextIdx.setOptionalNextId( Buff.getOptionalNextId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByEnumNameIdx.containsKey( keyEnumNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"EnumTagEnumNameIdx",
				keyEnumNameIdx );
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
				if( null == schema.getTableEnumDef().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredEnumId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"EnumDef",
						"EnumDef",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFBamEnumTagPKey, YCFBamEnumTagBuff > subdictEnumTagTenantIdx;
		if( dictByEnumTagTenantIdx.containsKey( keyEnumTagTenantIdx ) ) {
			subdictEnumTagTenantIdx = dictByEnumTagTenantIdx.get( keyEnumTagTenantIdx );
		}
		else {
			subdictEnumTagTenantIdx = new HashMap< YCFBamEnumTagPKey, YCFBamEnumTagBuff >();
			dictByEnumTagTenantIdx.put( keyEnumTagTenantIdx, subdictEnumTagTenantIdx );
		}
		subdictEnumTagTenantIdx.put( pkey, Buff );

		Map< YCFBamEnumTagPKey, YCFBamEnumTagBuff > subdictEnumIdx;
		if( dictByEnumIdx.containsKey( keyEnumIdx ) ) {
			subdictEnumIdx = dictByEnumIdx.get( keyEnumIdx );
		}
		else {
			subdictEnumIdx = new HashMap< YCFBamEnumTagPKey, YCFBamEnumTagBuff >();
			dictByEnumIdx.put( keyEnumIdx, subdictEnumIdx );
		}
		subdictEnumIdx.put( pkey, Buff );

		Map< YCFBamEnumTagPKey, YCFBamEnumTagBuff > subdictDefSchemaIdx;
		if( dictByDefSchemaIdx.containsKey( keyDefSchemaIdx ) ) {
			subdictDefSchemaIdx = dictByDefSchemaIdx.get( keyDefSchemaIdx );
		}
		else {
			subdictDefSchemaIdx = new HashMap< YCFBamEnumTagPKey, YCFBamEnumTagBuff >();
			dictByDefSchemaIdx.put( keyDefSchemaIdx, subdictDefSchemaIdx );
		}
		subdictDefSchemaIdx.put( pkey, Buff );

		dictByEnumNameIdx.put( keyEnumNameIdx, Buff );

		Map< YCFBamEnumTagPKey, YCFBamEnumTagBuff > subdictPrevIdx;
		if( dictByPrevIdx.containsKey( keyPrevIdx ) ) {
			subdictPrevIdx = dictByPrevIdx.get( keyPrevIdx );
		}
		else {
			subdictPrevIdx = new HashMap< YCFBamEnumTagPKey, YCFBamEnumTagBuff >();
			dictByPrevIdx.put( keyPrevIdx, subdictPrevIdx );
		}
		subdictPrevIdx.put( pkey, Buff );

		Map< YCFBamEnumTagPKey, YCFBamEnumTagBuff > subdictNextIdx;
		if( dictByNextIdx.containsKey( keyNextIdx ) ) {
			subdictNextIdx = dictByNextIdx.get( keyNextIdx );
		}
		else {
			subdictNextIdx = new HashMap< YCFBamEnumTagPKey, YCFBamEnumTagBuff >();
			dictByNextIdx.put( keyNextIdx, subdictNextIdx );
		}
		subdictNextIdx.put( pkey, Buff );

		if( tail != null ) {
			YCFBamEnumTagBuff tailEdit = schema.getFactoryEnumTag().newBuff();
			tailEdit.set( (YCFBamEnumTagBuff)tail );
				tailEdit.setOptionalNextTenantId( Buff.getRequiredTenantId() );
				tailEdit.setOptionalNextId( Buff.getRequiredId() );
			schema.getTableEnumTag().updateEnumTag( Authorization, tailEdit );
		}
	}

	public YCFBamEnumTagBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamEnumTagPKey PKey )
	{
		final String S_ProcName = "YCFBamRamEnumTag.readDerived";
		YCFBamEnumTagPKey key = schema.getFactoryEnumTag().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamEnumTagBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamEnumTagBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamEnumTagPKey PKey )
	{
		final String S_ProcName = "YCFBamRamEnumTag.readDerived";
		YCFBamEnumTagPKey key = schema.getFactoryEnumTag().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamEnumTagBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamEnumTagBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamEnumTag.readAllDerived";
		YCFBamEnumTagBuff[] retList = new YCFBamEnumTagBuff[ dictByPKey.values().size() ];
		Iterator< YCFBamEnumTagBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamEnumTagBuff[] readDerivedByEnumTagTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamEnumTag.readDerivedByEnumTagTenantIdx";
		YCFBamEnumTagByEnumTagTenantIdxKey key = schema.getFactoryEnumTag().newEnumTagTenantIdxKey();
		key.setRequiredTenantId( TenantId );

		YCFBamEnumTagBuff[] recArray;
		if( dictByEnumTagTenantIdx.containsKey( key ) ) {
			Map< YCFBamEnumTagPKey, YCFBamEnumTagBuff > subdictEnumTagTenantIdx
				= dictByEnumTagTenantIdx.get( key );
			recArray = new YCFBamEnumTagBuff[ subdictEnumTagTenantIdx.size() ];
			Iterator< YCFBamEnumTagBuff > iter = subdictEnumTagTenantIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamEnumTagPKey, YCFBamEnumTagBuff > subdictEnumTagTenantIdx
				= new HashMap< YCFBamEnumTagPKey, YCFBamEnumTagBuff >();
			dictByEnumTagTenantIdx.put( key, subdictEnumTagTenantIdx );
			recArray = new YCFBamEnumTagBuff[0];
		}
		return( recArray );
	}

	public YCFBamEnumTagBuff[] readDerivedByEnumIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long EnumId )
	{
		final String S_ProcName = "YCFBamRamEnumTag.readDerivedByEnumIdx";
		YCFBamEnumTagByEnumIdxKey key = schema.getFactoryEnumTag().newEnumIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredEnumId( EnumId );

		YCFBamEnumTagBuff[] recArray;
		if( dictByEnumIdx.containsKey( key ) ) {
			Map< YCFBamEnumTagPKey, YCFBamEnumTagBuff > subdictEnumIdx
				= dictByEnumIdx.get( key );
			recArray = new YCFBamEnumTagBuff[ subdictEnumIdx.size() ];
			Iterator< YCFBamEnumTagBuff > iter = subdictEnumIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamEnumTagPKey, YCFBamEnumTagBuff > subdictEnumIdx
				= new HashMap< YCFBamEnumTagPKey, YCFBamEnumTagBuff >();
			dictByEnumIdx.put( key, subdictEnumIdx );
			recArray = new YCFBamEnumTagBuff[0];
		}
		return( recArray );
	}

	public YCFBamEnumTagBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamEnumTag.readDerivedByDefSchemaIdx";
		YCFBamEnumTagByDefSchemaIdxKey key = schema.getFactoryEnumTag().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );

		YCFBamEnumTagBuff[] recArray;
		if( dictByDefSchemaIdx.containsKey( key ) ) {
			Map< YCFBamEnumTagPKey, YCFBamEnumTagBuff > subdictDefSchemaIdx
				= dictByDefSchemaIdx.get( key );
			recArray = new YCFBamEnumTagBuff[ subdictDefSchemaIdx.size() ];
			Iterator< YCFBamEnumTagBuff > iter = subdictDefSchemaIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamEnumTagPKey, YCFBamEnumTagBuff > subdictDefSchemaIdx
				= new HashMap< YCFBamEnumTagPKey, YCFBamEnumTagBuff >();
			dictByDefSchemaIdx.put( key, subdictDefSchemaIdx );
			recArray = new YCFBamEnumTagBuff[0];
		}
		return( recArray );
	}

	public YCFBamEnumTagBuff readDerivedByEnumNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long EnumId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamEnumTag.readDerivedByEnumNameIdx";
		YCFBamEnumTagByEnumNameIdxKey key = schema.getFactoryEnumTag().newEnumNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredEnumId( EnumId );
		key.setRequiredName( Name );

		YCFBamEnumTagBuff buff;
		if( dictByEnumNameIdx.containsKey( key ) ) {
			buff = dictByEnumNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamEnumTagBuff[] readDerivedByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "YCFBamRamEnumTag.readDerivedByPrevIdx";
		YCFBamEnumTagByPrevIdxKey key = schema.getFactoryEnumTag().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );

		YCFBamEnumTagBuff[] recArray;
		if( dictByPrevIdx.containsKey( key ) ) {
			Map< YCFBamEnumTagPKey, YCFBamEnumTagBuff > subdictPrevIdx
				= dictByPrevIdx.get( key );
			recArray = new YCFBamEnumTagBuff[ subdictPrevIdx.size() ];
			Iterator< YCFBamEnumTagBuff > iter = subdictPrevIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamEnumTagPKey, YCFBamEnumTagBuff > subdictPrevIdx
				= new HashMap< YCFBamEnumTagPKey, YCFBamEnumTagBuff >();
			dictByPrevIdx.put( key, subdictPrevIdx );
			recArray = new YCFBamEnumTagBuff[0];
		}
		return( recArray );
	}

	public YCFBamEnumTagBuff[] readDerivedByNextIdx( YCFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "YCFBamRamEnumTag.readDerivedByNextIdx";
		YCFBamEnumTagByNextIdxKey key = schema.getFactoryEnumTag().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );

		YCFBamEnumTagBuff[] recArray;
		if( dictByNextIdx.containsKey( key ) ) {
			Map< YCFBamEnumTagPKey, YCFBamEnumTagBuff > subdictNextIdx
				= dictByNextIdx.get( key );
			recArray = new YCFBamEnumTagBuff[ subdictNextIdx.size() ];
			Iterator< YCFBamEnumTagBuff > iter = subdictNextIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamEnumTagPKey, YCFBamEnumTagBuff > subdictNextIdx
				= new HashMap< YCFBamEnumTagPKey, YCFBamEnumTagBuff >();
			dictByNextIdx.put( key, subdictNextIdx );
			recArray = new YCFBamEnumTagBuff[0];
		}
		return( recArray );
	}

	public YCFBamEnumTagBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamEnumTag.readDerivedByIdIdx() ";
		YCFBamEnumTagPKey key = schema.getFactoryEnumTag().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamEnumTagBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamEnumTagBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamEnumTagPKey PKey )
	{
		final String S_ProcName = "YCFBamRamEnumTag.readBuff";
		YCFBamEnumTagBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a821" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamEnumTagBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamEnumTagPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamEnumTagBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a821" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamEnumTagBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamEnumTag.readAllBuff";
		YCFBamEnumTagBuff buff;
		ArrayList<YCFBamEnumTagBuff> filteredList = new ArrayList<YCFBamEnumTagBuff>();
		YCFBamEnumTagBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a821" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamEnumTagBuff[0] ) );
	}

	public YCFBamEnumTagBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamEnumTag.readBuffByIdIdx() ";
		YCFBamEnumTagBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a821" ) ) {
			return( (YCFBamEnumTagBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamEnumTagBuff[] readBuffByEnumTagTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamEnumTag.readBuffByEnumTagTenantIdx() ";
		YCFBamEnumTagBuff buff;
		ArrayList<YCFBamEnumTagBuff> filteredList = new ArrayList<YCFBamEnumTagBuff>();
		YCFBamEnumTagBuff[] buffList = readDerivedByEnumTagTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a821" ) ) {
				filteredList.add( (YCFBamEnumTagBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamEnumTagBuff[0] ) );
	}

	public YCFBamEnumTagBuff[] readBuffByEnumIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long EnumId )
	{
		final String S_ProcName = "YCFBamRamEnumTag.readBuffByEnumIdx() ";
		YCFBamEnumTagBuff buff;
		ArrayList<YCFBamEnumTagBuff> filteredList = new ArrayList<YCFBamEnumTagBuff>();
		YCFBamEnumTagBuff[] buffList = readDerivedByEnumIdx( Authorization,
			TenantId,
			EnumId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a821" ) ) {
				filteredList.add( (YCFBamEnumTagBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamEnumTagBuff[0] ) );
	}

	public YCFBamEnumTagBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamEnumTag.readBuffByDefSchemaIdx() ";
		YCFBamEnumTagBuff buff;
		ArrayList<YCFBamEnumTagBuff> filteredList = new ArrayList<YCFBamEnumTagBuff>();
		YCFBamEnumTagBuff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a821" ) ) {
				filteredList.add( (YCFBamEnumTagBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamEnumTagBuff[0] ) );
	}

	public YCFBamEnumTagBuff readBuffByEnumNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long EnumId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamEnumTag.readBuffByEnumNameIdx() ";
		YCFBamEnumTagBuff buff = readDerivedByEnumNameIdx( Authorization,
			TenantId,
			EnumId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a821" ) ) {
			return( (YCFBamEnumTagBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamEnumTagBuff[] readBuffByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "YCFBamRamEnumTag.readBuffByPrevIdx() ";
		YCFBamEnumTagBuff buff;
		ArrayList<YCFBamEnumTagBuff> filteredList = new ArrayList<YCFBamEnumTagBuff>();
		YCFBamEnumTagBuff[] buffList = readDerivedByPrevIdx( Authorization,
			PrevTenantId,
			PrevId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a821" ) ) {
				filteredList.add( (YCFBamEnumTagBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamEnumTagBuff[0] ) );
	}

	public YCFBamEnumTagBuff[] readBuffByNextIdx( YCFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "YCFBamRamEnumTag.readBuffByNextIdx() ";
		YCFBamEnumTagBuff buff;
		ArrayList<YCFBamEnumTagBuff> filteredList = new ArrayList<YCFBamEnumTagBuff>();
		YCFBamEnumTagBuff[] buffList = readDerivedByNextIdx( Authorization,
			NextTenantId,
			NextId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a821" ) ) {
				filteredList.add( (YCFBamEnumTagBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamEnumTagBuff[0] ) );
	}

	/**
	 *	Move the specified buffer up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	public YCFBamEnumTagBuff moveBuffUp( YCFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision )
	{
		final String S_ProcName = "moveBuffUp";

		YCFBamEnumTagBuff grandprev = null;
		YCFBamEnumTagBuff prev = null;
		YCFBamEnumTagBuff cur = null;
		YCFBamEnumTagBuff next = null;

		cur = schema.getTableEnumTag().readDerivedByIdIdx(Authorization, TenantId, Id);
		if( cur == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object" );
		}

		if( ( cur.getOptionalPrevTenantId() == null )
			&& ( cur.getOptionalPrevId() == null ) )
		{
			return( (YCFBamEnumTagBuff)cur );
		}

		prev = schema.getTableEnumTag().readDerivedByIdIdx(Authorization, cur.getOptionalPrevTenantId(), cur.getOptionalPrevId() );
		if( prev == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object.prev" );
		}

		if( ( prev.getOptionalPrevTenantId() != null )
			&& ( prev.getOptionalPrevId() != null ) )
		{
			grandprev = schema.getTableEnumTag().readDerivedByIdIdx(Authorization, prev.getOptionalPrevTenantId(), prev.getOptionalPrevId() );
			if( grandprev == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.prev.prev" );
			}
		}

		if( ( cur.getOptionalNextTenantId() != null )
			&& ( cur.getOptionalNextId() != null ) )
		{
			next = schema.getTableEnumTag().readDerivedByIdIdx(Authorization, cur.getOptionalNextTenantId(), cur.getOptionalNextId() );
			if( next == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.next" );
			}
		}

		String classCode = prev.getClassCode();
		YCFBamEnumTagBuff newInstance;
			if( classCode.equals( "a821" ) ) {
				newInstance = schema.getFactoryEnumTag().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamEnumTagBuff editPrev = newInstance;
		editPrev.set( prev );

		classCode = cur.getClassCode();
			if( classCode.equals( "a821" ) ) {
				newInstance = schema.getFactoryEnumTag().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamEnumTagBuff editCur = newInstance;
		editCur.set( cur );

		YCFBamEnumTagBuff editGrandprev = null;
		if( grandprev != null ) {
			classCode = grandprev.getClassCode();
			if( classCode.equals( "a821" ) ) {
				newInstance = schema.getFactoryEnumTag().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editGrandprev = newInstance;
			editGrandprev.set( grandprev );
		}

		YCFBamEnumTagBuff editNext = null;
		if( next != null ) {
			classCode = next.getClassCode();
			if( classCode.equals( "a821" ) ) {
				newInstance = schema.getFactoryEnumTag().newBuff();
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
			if( classCode.equals( "a821" ) ) {
				schema.getTableEnumTag().updateEnumTag( Authorization, editGrandprev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		classCode = editPrev.getClassCode();
			if( classCode.equals( "a821" ) ) {
				schema.getTableEnumTag().updateEnumTag( Authorization, editPrev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		classCode = editCur.getClassCode();
			if( classCode.equals( "a821" ) ) {
				schema.getTableEnumTag().updateEnumTag( Authorization, editCur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		if( editNext != null ) {
			classCode = editNext.getClassCode();
			if( classCode.equals( "a821" ) ) {
				schema.getTableEnumTag().updateEnumTag( Authorization, editNext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		return( (YCFBamEnumTagBuff)editCur );
	}

	/**
	 *	Move the specified buffer down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	public YCFBamEnumTagBuff moveBuffDown( YCFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision )
	{
		final String S_ProcName = "moveBuffDown";

		YCFBamEnumTagBuff prev = null;
		YCFBamEnumTagBuff cur = null;
		YCFBamEnumTagBuff next = null;
		YCFBamEnumTagBuff grandnext = null;

		cur = schema.getTableEnumTag().readDerivedByIdIdx(Authorization, TenantId, Id);
		if( cur == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object" );
		}

		if( ( cur.getOptionalNextTenantId() == null )
			&& ( cur.getOptionalNextId() == null ) )
		{
			return( (YCFBamEnumTagBuff)cur );
		}

		next = schema.getTableEnumTag().readDerivedByIdIdx(Authorization, cur.getOptionalNextTenantId(), cur.getOptionalNextId() );
		if( next == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object.next" );
		}

		if( ( next.getOptionalNextTenantId() != null )
			&& ( next.getOptionalNextId() != null ) )
		{
			grandnext = schema.getTableEnumTag().readDerivedByIdIdx(Authorization, next.getOptionalNextTenantId(), next.getOptionalNextId() );
			if( grandnext == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.next.next" );
			}
		}

		if( ( cur.getOptionalPrevTenantId() != null )
			&& ( cur.getOptionalPrevId() != null ) )
		{
			prev = schema.getTableEnumTag().readDerivedByIdIdx(Authorization, cur.getOptionalPrevTenantId(), cur.getOptionalPrevId() );
			if( prev == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.prev" );
			}
		}

		String classCode = cur.getClassCode();
		YCFBamEnumTagBuff newInstance;
			if( classCode.equals( "a821" ) ) {
				newInstance = schema.getFactoryEnumTag().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamEnumTagBuff editCur = newInstance;
		editCur.set( cur );

		classCode = next.getClassCode();
			if( classCode.equals( "a821" ) ) {
				newInstance = schema.getFactoryEnumTag().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamEnumTagBuff editNext = newInstance;
		editNext.set( next );

		YCFBamEnumTagBuff editGrandnext = null;
		if( grandnext != null ) {
			classCode = grandnext.getClassCode();
			if( classCode.equals( "a821" ) ) {
				newInstance = schema.getFactoryEnumTag().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editGrandnext = newInstance;
			editGrandnext.set( grandnext );
		}

		YCFBamEnumTagBuff editPrev = null;
		if( prev != null ) {
			classCode = prev.getClassCode();
			if( classCode.equals( "a821" ) ) {
				newInstance = schema.getFactoryEnumTag().newBuff();
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
			if( classCode.equals( "a821" ) ) {
				schema.getTableEnumTag().updateEnumTag( Authorization, editPrev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		classCode = editCur.getClassCode();
			if( classCode.equals( "a821" ) ) {
				schema.getTableEnumTag().updateEnumTag( Authorization, editCur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		classCode = editNext.getClassCode();
			if( classCode.equals( "a821" ) ) {
				schema.getTableEnumTag().updateEnumTag( Authorization, editNext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		if( editGrandnext != null ) {
			classCode = editGrandnext.getClassCode();
			if( classCode.equals( "a821" ) ) {
				schema.getTableEnumTag().updateEnumTag( Authorization, editGrandnext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		return( (YCFBamEnumTagBuff)editCur );
	}

	public void updateEnumTag( YCFSecAuthorization Authorization,
		YCFBamEnumTagBuff Buff )
	{
		YCFBamEnumTagPKey pkey = schema.getFactoryEnumTag().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamEnumTagBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateEnumTag",
				"Existing record not found",
				"EnumTag",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateEnumTag",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFBamEnumTagByEnumTagTenantIdxKey existingKeyEnumTagTenantIdx = schema.getFactoryEnumTag().newEnumTagTenantIdxKey();
		existingKeyEnumTagTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFBamEnumTagByEnumTagTenantIdxKey newKeyEnumTagTenantIdx = schema.getFactoryEnumTag().newEnumTagTenantIdxKey();
		newKeyEnumTagTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFBamEnumTagByEnumIdxKey existingKeyEnumIdx = schema.getFactoryEnumTag().newEnumIdxKey();
		existingKeyEnumIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyEnumIdx.setRequiredEnumId( existing.getRequiredEnumId() );

		YCFBamEnumTagByEnumIdxKey newKeyEnumIdx = schema.getFactoryEnumTag().newEnumIdxKey();
		newKeyEnumIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyEnumIdx.setRequiredEnumId( Buff.getRequiredEnumId() );

		YCFBamEnumTagByDefSchemaIdxKey existingKeyDefSchemaIdx = schema.getFactoryEnumTag().newDefSchemaIdxKey();
		existingKeyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		existingKeyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		YCFBamEnumTagByDefSchemaIdxKey newKeyDefSchemaIdx = schema.getFactoryEnumTag().newDefSchemaIdxKey();
		newKeyDefSchemaIdx.setOptionalDefSchemaTenantId( Buff.getOptionalDefSchemaTenantId() );
		newKeyDefSchemaIdx.setOptionalDefSchemaId( Buff.getOptionalDefSchemaId() );

		YCFBamEnumTagByEnumNameIdxKey existingKeyEnumNameIdx = schema.getFactoryEnumTag().newEnumNameIdxKey();
		existingKeyEnumNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyEnumNameIdx.setRequiredEnumId( existing.getRequiredEnumId() );
		existingKeyEnumNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamEnumTagByEnumNameIdxKey newKeyEnumNameIdx = schema.getFactoryEnumTag().newEnumNameIdxKey();
		newKeyEnumNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyEnumNameIdx.setRequiredEnumId( Buff.getRequiredEnumId() );
		newKeyEnumNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamEnumTagByPrevIdxKey existingKeyPrevIdx = schema.getFactoryEnumTag().newPrevIdxKey();
		existingKeyPrevIdx.setOptionalPrevTenantId( existing.getOptionalPrevTenantId() );
		existingKeyPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamEnumTagByPrevIdxKey newKeyPrevIdx = schema.getFactoryEnumTag().newPrevIdxKey();
		newKeyPrevIdx.setOptionalPrevTenantId( Buff.getOptionalPrevTenantId() );
		newKeyPrevIdx.setOptionalPrevId( Buff.getOptionalPrevId() );

		YCFBamEnumTagByNextIdxKey existingKeyNextIdx = schema.getFactoryEnumTag().newNextIdxKey();
		existingKeyNextIdx.setOptionalNextTenantId( existing.getOptionalNextTenantId() );
		existingKeyNextIdx.setOptionalNextId( existing.getOptionalNextId() );

		YCFBamEnumTagByNextIdxKey newKeyNextIdx = schema.getFactoryEnumTag().newNextIdxKey();
		newKeyNextIdx.setOptionalNextTenantId( Buff.getOptionalNextTenantId() );
		newKeyNextIdx.setOptionalNextId( Buff.getOptionalNextId() );

		// Check unique indexes

		if( ! existingKeyEnumNameIdx.equals( newKeyEnumNameIdx ) ) {
			if( dictByEnumNameIdx.containsKey( newKeyEnumNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateEnumTag",
					"EnumTagEnumNameIdx",
					newKeyEnumNameIdx );
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
						"updateEnumTag",
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
				if( null == schema.getTableEnumDef().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredEnumId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateEnumTag",
						"Container",
						"EnumDef",
						"EnumDef",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamEnumTagPKey, YCFBamEnumTagBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByEnumTagTenantIdx.get( existingKeyEnumTagTenantIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByEnumTagTenantIdx.containsKey( newKeyEnumTagTenantIdx ) ) {
			subdict = dictByEnumTagTenantIdx.get( newKeyEnumTagTenantIdx );
		}
		else {
			subdict = new HashMap< YCFBamEnumTagPKey, YCFBamEnumTagBuff >();
			dictByEnumTagTenantIdx.put( newKeyEnumTagTenantIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByEnumIdx.get( existingKeyEnumIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByEnumIdx.containsKey( newKeyEnumIdx ) ) {
			subdict = dictByEnumIdx.get( newKeyEnumIdx );
		}
		else {
			subdict = new HashMap< YCFBamEnumTagPKey, YCFBamEnumTagBuff >();
			dictByEnumIdx.put( newKeyEnumIdx, subdict );
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
			subdict = new HashMap< YCFBamEnumTagPKey, YCFBamEnumTagBuff >();
			dictByDefSchemaIdx.put( newKeyDefSchemaIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByEnumNameIdx.remove( existingKeyEnumNameIdx );
		dictByEnumNameIdx.put( newKeyEnumNameIdx, Buff );

		subdict = dictByPrevIdx.get( existingKeyPrevIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByPrevIdx.containsKey( newKeyPrevIdx ) ) {
			subdict = dictByPrevIdx.get( newKeyPrevIdx );
		}
		else {
			subdict = new HashMap< YCFBamEnumTagPKey, YCFBamEnumTagBuff >();
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
			subdict = new HashMap< YCFBamEnumTagPKey, YCFBamEnumTagBuff >();
			dictByNextIdx.put( newKeyNextIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteEnumTag( YCFSecAuthorization Authorization,
		YCFBamEnumTagBuff Buff )
	{
		final String S_ProcName = "YCFBamRamEnumTagTable.deleteEnumTag() ";
		String classCode;
		YCFBamEnumTagPKey pkey = schema.getFactoryEnumTag().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamEnumTagBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteEnumTag",
				pkey );
		}
		long varTenantId = existing.getRequiredTenantId();
		long varEnumId = existing.getRequiredEnumId();
		YCFBamEnumDefBuff container = schema.getTableEnumDef().readDerivedByIdIdx( Authorization,
			varTenantId,
			varEnumId );
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

		YCFBamEnumTagBuff prev = null;
		if( ( prevTenantId != null )
			&& ( prevId != null ) )
		{
			prev = schema.getTableEnumTag().readDerivedByIdIdx( Authorization,
				prevTenantId,
				prevId );
			if( prev == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"prev" );
			}
			YCFBamEnumTagBuff editPrev;
			classCode = prev.getClassCode();
			if( classCode.equals( "a821" ) ) {
				editPrev = schema.getFactoryEnumTag().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editPrev.set( prev );
			editPrev.setOptionalNextTenantId( nextTenantId );
			editPrev.setOptionalNextId( nextId );
			if( classCode.equals( "a821" ) ) {
				schema.getTableEnumTag().updateEnumTag( Authorization, editPrev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		YCFBamEnumTagBuff next = null;
		if( ( nextTenantId != null )
			&& ( nextId != null ) )
		{
			next = schema.getTableEnumTag().readDerivedByIdIdx( Authorization,
				nextTenantId,
				nextId );
			if( next == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"next" );
			}
			YCFBamEnumTagBuff editNext;
			classCode = next.getClassCode();
			if( classCode.equals( "a821" ) ) {
				editNext = schema.getFactoryEnumTag().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editNext.set( next );
			editNext.setOptionalPrevTenantId( prevTenantId );
			editNext.setOptionalPrevId( prevId );
			if( classCode.equals( "a821" ) ) {
				schema.getTableEnumTag().updateEnumTag( Authorization, editNext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		YCFBamEnumTagByEnumTagTenantIdxKey keyEnumTagTenantIdx = schema.getFactoryEnumTag().newEnumTagTenantIdxKey();
		keyEnumTagTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFBamEnumTagByEnumIdxKey keyEnumIdx = schema.getFactoryEnumTag().newEnumIdxKey();
		keyEnumIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyEnumIdx.setRequiredEnumId( existing.getRequiredEnumId() );

		YCFBamEnumTagByDefSchemaIdxKey keyDefSchemaIdx = schema.getFactoryEnumTag().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		YCFBamEnumTagByEnumNameIdxKey keyEnumNameIdx = schema.getFactoryEnumTag().newEnumNameIdxKey();
		keyEnumNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyEnumNameIdx.setRequiredEnumId( existing.getRequiredEnumId() );
		keyEnumNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamEnumTagByPrevIdxKey keyPrevIdx = schema.getFactoryEnumTag().newPrevIdxKey();
		keyPrevIdx.setOptionalPrevTenantId( existing.getOptionalPrevTenantId() );
		keyPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamEnumTagByNextIdxKey keyNextIdx = schema.getFactoryEnumTag().newNextIdxKey();
		keyNextIdx.setOptionalNextTenantId( existing.getOptionalNextTenantId() );
		keyNextIdx.setOptionalNextId( existing.getOptionalNextId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFBamEnumTagPKey, YCFBamEnumTagBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByEnumTagTenantIdx.get( keyEnumTagTenantIdx );
		subdict.remove( pkey );

		subdict = dictByEnumIdx.get( keyEnumIdx );
		subdict.remove( pkey );

		subdict = dictByDefSchemaIdx.get( keyDefSchemaIdx );
		subdict.remove( pkey );

		dictByEnumNameIdx.remove( keyEnumNameIdx );

		subdict = dictByPrevIdx.get( keyPrevIdx );
		subdict.remove( pkey );

		subdict = dictByNextIdx.get( keyNextIdx );
		subdict.remove( pkey );

	}
	public void deleteEnumTagByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamEnumTagPKey key = schema.getFactoryEnumTag().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteEnumTagByIdIdx( Authorization, key );
	}

	public void deleteEnumTagByIdIdx( YCFSecAuthorization Authorization,
		YCFBamEnumTagPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamEnumTagBuff cur;
		LinkedList<YCFBamEnumTagBuff> matchSet = new LinkedList<YCFBamEnumTagBuff>();
		Iterator<YCFBamEnumTagBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamEnumTagBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableEnumTag().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteEnumTag( Authorization, cur );
		}
	}

	public void deleteEnumTagByEnumTagTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamEnumTagByEnumTagTenantIdxKey key = schema.getFactoryEnumTag().newEnumTagTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteEnumTagByEnumTagTenantIdx( Authorization, key );
	}

	public void deleteEnumTagByEnumTagTenantIdx( YCFSecAuthorization Authorization,
		YCFBamEnumTagByEnumTagTenantIdxKey argKey )
	{
		YCFBamEnumTagBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamEnumTagBuff> matchSet = new LinkedList<YCFBamEnumTagBuff>();
		Iterator<YCFBamEnumTagBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamEnumTagBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableEnumTag().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteEnumTag( Authorization, cur );
		}
	}

	public void deleteEnumTagByEnumIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argEnumId )
	{
		YCFBamEnumTagByEnumIdxKey key = schema.getFactoryEnumTag().newEnumIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredEnumId( argEnumId );
		deleteEnumTagByEnumIdx( Authorization, key );
	}

	public void deleteEnumTagByEnumIdx( YCFSecAuthorization Authorization,
		YCFBamEnumTagByEnumIdxKey argKey )
	{
		YCFBamEnumTagBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamEnumTagBuff> matchSet = new LinkedList<YCFBamEnumTagBuff>();
		Iterator<YCFBamEnumTagBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamEnumTagBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableEnumTag().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteEnumTag( Authorization, cur );
		}
	}

	public void deleteEnumTagByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamEnumTagByDefSchemaIdxKey key = schema.getFactoryEnumTag().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deleteEnumTagByDefSchemaIdx( Authorization, key );
	}

	public void deleteEnumTagByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamEnumTagByDefSchemaIdxKey argKey )
	{
		YCFBamEnumTagBuff cur;
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
		LinkedList<YCFBamEnumTagBuff> matchSet = new LinkedList<YCFBamEnumTagBuff>();
		Iterator<YCFBamEnumTagBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamEnumTagBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableEnumTag().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteEnumTag( Authorization, cur );
		}
	}

	public void deleteEnumTagByEnumNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argEnumId,
		String argName )
	{
		YCFBamEnumTagByEnumNameIdxKey key = schema.getFactoryEnumTag().newEnumNameIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredEnumId( argEnumId );
		key.setRequiredName( argName );
		deleteEnumTagByEnumNameIdx( Authorization, key );
	}

	public void deleteEnumTagByEnumNameIdx( YCFSecAuthorization Authorization,
		YCFBamEnumTagByEnumNameIdxKey argKey )
	{
		YCFBamEnumTagBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamEnumTagBuff> matchSet = new LinkedList<YCFBamEnumTagBuff>();
		Iterator<YCFBamEnumTagBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamEnumTagBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableEnumTag().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteEnumTag( Authorization, cur );
		}
	}

	public void deleteEnumTagByPrevIdx( YCFSecAuthorization Authorization,
		Long argPrevTenantId,
		Long argPrevId )
	{
		YCFBamEnumTagByPrevIdxKey key = schema.getFactoryEnumTag().newPrevIdxKey();
		key.setOptionalPrevTenantId( argPrevTenantId );
		key.setOptionalPrevId( argPrevId );
		deleteEnumTagByPrevIdx( Authorization, key );
	}

	public void deleteEnumTagByPrevIdx( YCFSecAuthorization Authorization,
		YCFBamEnumTagByPrevIdxKey argKey )
	{
		YCFBamEnumTagBuff cur;
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
		LinkedList<YCFBamEnumTagBuff> matchSet = new LinkedList<YCFBamEnumTagBuff>();
		Iterator<YCFBamEnumTagBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamEnumTagBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableEnumTag().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteEnumTag( Authorization, cur );
		}
	}

	public void deleteEnumTagByNextIdx( YCFSecAuthorization Authorization,
		Long argNextTenantId,
		Long argNextId )
	{
		YCFBamEnumTagByNextIdxKey key = schema.getFactoryEnumTag().newNextIdxKey();
		key.setOptionalNextTenantId( argNextTenantId );
		key.setOptionalNextId( argNextId );
		deleteEnumTagByNextIdx( Authorization, key );
	}

	public void deleteEnumTagByNextIdx( YCFSecAuthorization Authorization,
		YCFBamEnumTagByNextIdxKey argKey )
	{
		YCFBamEnumTagBuff cur;
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
		LinkedList<YCFBamEnumTagBuff> matchSet = new LinkedList<YCFBamEnumTagBuff>();
		Iterator<YCFBamEnumTagBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamEnumTagBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableEnumTag().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteEnumTag( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
