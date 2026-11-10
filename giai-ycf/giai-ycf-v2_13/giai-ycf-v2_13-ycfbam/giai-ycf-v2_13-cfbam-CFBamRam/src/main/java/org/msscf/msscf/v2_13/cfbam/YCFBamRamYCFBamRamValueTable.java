
// Description: Java 11 in-memory RAM DbIO implementation for Value.

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
 *	YCFBamRamValueTable in-memory RAM DbIO implementation
 *	for Value.
 */
public class YCFBamRamValueTable
	implements IYCFBamValueTable
{
	private IYCFBamSchema schema;
	private Map< YCFBamValuePKey,
				YCFBamValueBuff > dictByPKey
		= new HashMap< YCFBamValuePKey,
				YCFBamValueBuff >();
	private Map< YCFBamValueByUNameIdxKey,
			YCFBamValueBuff > dictByUNameIdx
		= new HashMap< YCFBamValueByUNameIdxKey,
			YCFBamValueBuff >();
	private Map< YCFBamValueByValTentIdxKey,
				Map< YCFBamValuePKey,
					YCFBamValueBuff >> dictByValTentIdx
		= new HashMap< YCFBamValueByValTentIdxKey,
				Map< YCFBamValuePKey,
					YCFBamValueBuff >>();
	private Map< YCFBamValueByScopeIdxKey,
				Map< YCFBamValuePKey,
					YCFBamValueBuff >> dictByScopeIdx
		= new HashMap< YCFBamValueByScopeIdxKey,
				Map< YCFBamValuePKey,
					YCFBamValueBuff >>();
	private Map< YCFBamValueByDefSchemaIdxKey,
				Map< YCFBamValuePKey,
					YCFBamValueBuff >> dictByDefSchemaIdx
		= new HashMap< YCFBamValueByDefSchemaIdxKey,
				Map< YCFBamValuePKey,
					YCFBamValueBuff >>();
	private Map< YCFBamValueByPrevIdxKey,
				Map< YCFBamValuePKey,
					YCFBamValueBuff >> dictByPrevIdx
		= new HashMap< YCFBamValueByPrevIdxKey,
				Map< YCFBamValuePKey,
					YCFBamValueBuff >>();
	private Map< YCFBamValueByNextIdxKey,
				Map< YCFBamValuePKey,
					YCFBamValueBuff >> dictByNextIdx
		= new HashMap< YCFBamValueByNextIdxKey,
				Map< YCFBamValuePKey,
					YCFBamValueBuff >>();
	private Map< YCFBamValueByContPrevIdxKey,
				Map< YCFBamValuePKey,
					YCFBamValueBuff >> dictByContPrevIdx
		= new HashMap< YCFBamValueByContPrevIdxKey,
				Map< YCFBamValuePKey,
					YCFBamValueBuff >>();
	private Map< YCFBamValueByContNextIdxKey,
				Map< YCFBamValuePKey,
					YCFBamValueBuff >> dictByContNextIdx
		= new HashMap< YCFBamValueByContNextIdxKey,
				Map< YCFBamValuePKey,
					YCFBamValueBuff >>();
	private Map< YCFBamValueByCodeVisIdxKey,
				Map< YCFBamValuePKey,
					YCFBamValueBuff >> dictByCodeVisIdx
		= new HashMap< YCFBamValueByCodeVisIdxKey,
				Map< YCFBamValuePKey,
					YCFBamValueBuff >>();
	private Map< YCFBamValueByScopeCodeVisIdxKey,
				Map< YCFBamValuePKey,
					YCFBamValueBuff >> dictByScopeCodeVisIdx
		= new HashMap< YCFBamValueByScopeCodeVisIdxKey,
				Map< YCFBamValuePKey,
					YCFBamValueBuff >>();

	public YCFBamRamValueTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createValue( YCFSecAuthorization Authorization,
		YCFBamValueBuff Buff )
	{
		final String S_ProcName = "createValue";
		YCFBamValuePKey pkey = schema.getFactoryValue().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( ((YCFBamRamTenantTable)schema.getTableTenant()).nextValueIdGen( Authorization,
			Buff.getRequiredTenantId() ) );
		Buff.setRequiredTenantId( pkey.getRequiredTenantId() );
		Buff.setRequiredId( pkey.getRequiredId() );
		YCFBamValueByUNameIdxKey keyUNameIdx = schema.getFactoryValue().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyUNameIdx.setRequiredScopeId( Buff.getRequiredScopeId() );
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamValueByValTentIdxKey keyValTentIdx = schema.getFactoryValue().newValTentIdxKey();
		keyValTentIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFBamValueByScopeIdxKey keyScopeIdx = schema.getFactoryValue().newScopeIdxKey();
		keyScopeIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyScopeIdx.setRequiredScopeId( Buff.getRequiredScopeId() );

		YCFBamValueByDefSchemaIdxKey keyDefSchemaIdx = schema.getFactoryValue().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( Buff.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( Buff.getOptionalDefSchemaId() );

		YCFBamValueByPrevIdxKey keyPrevIdx = schema.getFactoryValue().newPrevIdxKey();
		keyPrevIdx.setOptionalPrevTenantId( Buff.getOptionalPrevTenantId() );
		keyPrevIdx.setOptionalPrevId( Buff.getOptionalPrevId() );

		YCFBamValueByNextIdxKey keyNextIdx = schema.getFactoryValue().newNextIdxKey();
		keyNextIdx.setOptionalNextTenantId( Buff.getOptionalNextTenantId() );
		keyNextIdx.setOptionalNextId( Buff.getOptionalNextId() );

		YCFBamValueByContPrevIdxKey keyContPrevIdx = schema.getFactoryValue().newContPrevIdxKey();
		keyContPrevIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyContPrevIdx.setRequiredScopeId( Buff.getRequiredScopeId() );
		keyContPrevIdx.setOptionalPrevId( Buff.getOptionalPrevId() );

		YCFBamValueByContNextIdxKey keyContNextIdx = schema.getFactoryValue().newContNextIdxKey();
		keyContNextIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyContNextIdx.setRequiredScopeId( Buff.getRequiredScopeId() );
		keyContNextIdx.setOptionalNextId( Buff.getOptionalNextId() );

		YCFBamValueByCodeVisIdxKey keyCodeVisIdx = schema.getFactoryValue().newCodeVisIdxKey();
		keyCodeVisIdx.setRequiredCodeVis( Buff.getRequiredCodeVis() );

		YCFBamValueByScopeCodeVisIdxKey keyScopeCodeVisIdx = schema.getFactoryValue().newScopeCodeVisIdxKey();
		keyScopeCodeVisIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyScopeCodeVisIdx.setRequiredScopeId( Buff.getRequiredScopeId() );
		keyScopeCodeVisIdx.setRequiredCodeVis( Buff.getRequiredCodeVis() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"ValueUNameIdx",
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
				if( null == schema.getTableScope().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredScopeId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"Scope",
						"Scope",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

		Map< YCFBamValuePKey, YCFBamValueBuff > subdictValTentIdx;
		if( dictByValTentIdx.containsKey( keyValTentIdx ) ) {
			subdictValTentIdx = dictByValTentIdx.get( keyValTentIdx );
		}
		else {
			subdictValTentIdx = new HashMap< YCFBamValuePKey, YCFBamValueBuff >();
			dictByValTentIdx.put( keyValTentIdx, subdictValTentIdx );
		}
		subdictValTentIdx.put( pkey, Buff );

		Map< YCFBamValuePKey, YCFBamValueBuff > subdictScopeIdx;
		if( dictByScopeIdx.containsKey( keyScopeIdx ) ) {
			subdictScopeIdx = dictByScopeIdx.get( keyScopeIdx );
		}
		else {
			subdictScopeIdx = new HashMap< YCFBamValuePKey, YCFBamValueBuff >();
			dictByScopeIdx.put( keyScopeIdx, subdictScopeIdx );
		}
		subdictScopeIdx.put( pkey, Buff );

		Map< YCFBamValuePKey, YCFBamValueBuff > subdictDefSchemaIdx;
		if( dictByDefSchemaIdx.containsKey( keyDefSchemaIdx ) ) {
			subdictDefSchemaIdx = dictByDefSchemaIdx.get( keyDefSchemaIdx );
		}
		else {
			subdictDefSchemaIdx = new HashMap< YCFBamValuePKey, YCFBamValueBuff >();
			dictByDefSchemaIdx.put( keyDefSchemaIdx, subdictDefSchemaIdx );
		}
		subdictDefSchemaIdx.put( pkey, Buff );

		Map< YCFBamValuePKey, YCFBamValueBuff > subdictPrevIdx;
		if( dictByPrevIdx.containsKey( keyPrevIdx ) ) {
			subdictPrevIdx = dictByPrevIdx.get( keyPrevIdx );
		}
		else {
			subdictPrevIdx = new HashMap< YCFBamValuePKey, YCFBamValueBuff >();
			dictByPrevIdx.put( keyPrevIdx, subdictPrevIdx );
		}
		subdictPrevIdx.put( pkey, Buff );

		Map< YCFBamValuePKey, YCFBamValueBuff > subdictNextIdx;
		if( dictByNextIdx.containsKey( keyNextIdx ) ) {
			subdictNextIdx = dictByNextIdx.get( keyNextIdx );
		}
		else {
			subdictNextIdx = new HashMap< YCFBamValuePKey, YCFBamValueBuff >();
			dictByNextIdx.put( keyNextIdx, subdictNextIdx );
		}
		subdictNextIdx.put( pkey, Buff );

		Map< YCFBamValuePKey, YCFBamValueBuff > subdictContPrevIdx;
		if( dictByContPrevIdx.containsKey( keyContPrevIdx ) ) {
			subdictContPrevIdx = dictByContPrevIdx.get( keyContPrevIdx );
		}
		else {
			subdictContPrevIdx = new HashMap< YCFBamValuePKey, YCFBamValueBuff >();
			dictByContPrevIdx.put( keyContPrevIdx, subdictContPrevIdx );
		}
		subdictContPrevIdx.put( pkey, Buff );

		Map< YCFBamValuePKey, YCFBamValueBuff > subdictContNextIdx;
		if( dictByContNextIdx.containsKey( keyContNextIdx ) ) {
			subdictContNextIdx = dictByContNextIdx.get( keyContNextIdx );
		}
		else {
			subdictContNextIdx = new HashMap< YCFBamValuePKey, YCFBamValueBuff >();
			dictByContNextIdx.put( keyContNextIdx, subdictContNextIdx );
		}
		subdictContNextIdx.put( pkey, Buff );

		Map< YCFBamValuePKey, YCFBamValueBuff > subdictCodeVisIdx;
		if( dictByCodeVisIdx.containsKey( keyCodeVisIdx ) ) {
			subdictCodeVisIdx = dictByCodeVisIdx.get( keyCodeVisIdx );
		}
		else {
			subdictCodeVisIdx = new HashMap< YCFBamValuePKey, YCFBamValueBuff >();
			dictByCodeVisIdx.put( keyCodeVisIdx, subdictCodeVisIdx );
		}
		subdictCodeVisIdx.put( pkey, Buff );

		Map< YCFBamValuePKey, YCFBamValueBuff > subdictScopeCodeVisIdx;
		if( dictByScopeCodeVisIdx.containsKey( keyScopeCodeVisIdx ) ) {
			subdictScopeCodeVisIdx = dictByScopeCodeVisIdx.get( keyScopeCodeVisIdx );
		}
		else {
			subdictScopeCodeVisIdx = new HashMap< YCFBamValuePKey, YCFBamValueBuff >();
			dictByScopeCodeVisIdx.put( keyScopeCodeVisIdx, subdictScopeCodeVisIdx );
		}
		subdictScopeCodeVisIdx.put( pkey, Buff );

	}

	public YCFBamValueBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamValuePKey PKey )
	{
		final String S_ProcName = "YCFBamRamValue.readDerived";
		YCFBamValuePKey key = schema.getFactoryValue().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamValueBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamValueBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamValuePKey PKey )
	{
		final String S_ProcName = "YCFBamRamValue.readDerived";
		YCFBamValuePKey key = schema.getFactoryValue().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamValueBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamValueBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamValue.readAllDerived";
		YCFBamValueBuff[] retList = new YCFBamValueBuff[ dictByPKey.values().size() ];
		Iterator< YCFBamValueBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamValueBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamValue.readDerivedByUNameIdx";
		YCFBamValueByUNameIdxKey key = schema.getFactoryValue().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredName( Name );

		YCFBamValueBuff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamValueBuff[] readDerivedByValTentIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamValue.readDerivedByValTentIdx";
		YCFBamValueByValTentIdxKey key = schema.getFactoryValue().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );

		YCFBamValueBuff[] recArray;
		if( dictByValTentIdx.containsKey( key ) ) {
			Map< YCFBamValuePKey, YCFBamValueBuff > subdictValTentIdx
				= dictByValTentIdx.get( key );
			recArray = new YCFBamValueBuff[ subdictValTentIdx.size() ];
			Iterator< YCFBamValueBuff > iter = subdictValTentIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamValuePKey, YCFBamValueBuff > subdictValTentIdx
				= new HashMap< YCFBamValuePKey, YCFBamValueBuff >();
			dictByValTentIdx.put( key, subdictValTentIdx );
			recArray = new YCFBamValueBuff[0];
		}
		return( recArray );
	}

	public YCFBamValueBuff[] readDerivedByScopeIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "YCFBamRamValue.readDerivedByScopeIdx";
		YCFBamValueByScopeIdxKey key = schema.getFactoryValue().newScopeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );

		YCFBamValueBuff[] recArray;
		if( dictByScopeIdx.containsKey( key ) ) {
			Map< YCFBamValuePKey, YCFBamValueBuff > subdictScopeIdx
				= dictByScopeIdx.get( key );
			recArray = new YCFBamValueBuff[ subdictScopeIdx.size() ];
			Iterator< YCFBamValueBuff > iter = subdictScopeIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamValuePKey, YCFBamValueBuff > subdictScopeIdx
				= new HashMap< YCFBamValuePKey, YCFBamValueBuff >();
			dictByScopeIdx.put( key, subdictScopeIdx );
			recArray = new YCFBamValueBuff[0];
		}
		return( recArray );
	}

	public YCFBamValueBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamValue.readDerivedByDefSchemaIdx";
		YCFBamValueByDefSchemaIdxKey key = schema.getFactoryValue().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );

		YCFBamValueBuff[] recArray;
		if( dictByDefSchemaIdx.containsKey( key ) ) {
			Map< YCFBamValuePKey, YCFBamValueBuff > subdictDefSchemaIdx
				= dictByDefSchemaIdx.get( key );
			recArray = new YCFBamValueBuff[ subdictDefSchemaIdx.size() ];
			Iterator< YCFBamValueBuff > iter = subdictDefSchemaIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamValuePKey, YCFBamValueBuff > subdictDefSchemaIdx
				= new HashMap< YCFBamValuePKey, YCFBamValueBuff >();
			dictByDefSchemaIdx.put( key, subdictDefSchemaIdx );
			recArray = new YCFBamValueBuff[0];
		}
		return( recArray );
	}

	public YCFBamValueBuff[] readDerivedByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "YCFBamRamValue.readDerivedByPrevIdx";
		YCFBamValueByPrevIdxKey key = schema.getFactoryValue().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );

		YCFBamValueBuff[] recArray;
		if( dictByPrevIdx.containsKey( key ) ) {
			Map< YCFBamValuePKey, YCFBamValueBuff > subdictPrevIdx
				= dictByPrevIdx.get( key );
			recArray = new YCFBamValueBuff[ subdictPrevIdx.size() ];
			Iterator< YCFBamValueBuff > iter = subdictPrevIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamValuePKey, YCFBamValueBuff > subdictPrevIdx
				= new HashMap< YCFBamValuePKey, YCFBamValueBuff >();
			dictByPrevIdx.put( key, subdictPrevIdx );
			recArray = new YCFBamValueBuff[0];
		}
		return( recArray );
	}

	public YCFBamValueBuff[] readDerivedByNextIdx( YCFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "YCFBamRamValue.readDerivedByNextIdx";
		YCFBamValueByNextIdxKey key = schema.getFactoryValue().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );

		YCFBamValueBuff[] recArray;
		if( dictByNextIdx.containsKey( key ) ) {
			Map< YCFBamValuePKey, YCFBamValueBuff > subdictNextIdx
				= dictByNextIdx.get( key );
			recArray = new YCFBamValueBuff[ subdictNextIdx.size() ];
			Iterator< YCFBamValueBuff > iter = subdictNextIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamValuePKey, YCFBamValueBuff > subdictNextIdx
				= new HashMap< YCFBamValuePKey, YCFBamValueBuff >();
			dictByNextIdx.put( key, subdictNextIdx );
			recArray = new YCFBamValueBuff[0];
		}
		return( recArray );
	}

	public YCFBamValueBuff[] readDerivedByContPrevIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long PrevId )
	{
		final String S_ProcName = "YCFBamRamValue.readDerivedByContPrevIdx";
		YCFBamValueByContPrevIdxKey key = schema.getFactoryValue().newContPrevIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalPrevId( PrevId );

		YCFBamValueBuff[] recArray;
		if( dictByContPrevIdx.containsKey( key ) ) {
			Map< YCFBamValuePKey, YCFBamValueBuff > subdictContPrevIdx
				= dictByContPrevIdx.get( key );
			recArray = new YCFBamValueBuff[ subdictContPrevIdx.size() ];
			Iterator< YCFBamValueBuff > iter = subdictContPrevIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamValuePKey, YCFBamValueBuff > subdictContPrevIdx
				= new HashMap< YCFBamValuePKey, YCFBamValueBuff >();
			dictByContPrevIdx.put( key, subdictContPrevIdx );
			recArray = new YCFBamValueBuff[0];
		}
		return( recArray );
	}

	public YCFBamValueBuff[] readDerivedByContNextIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long NextId )
	{
		final String S_ProcName = "YCFBamRamValue.readDerivedByContNextIdx";
		YCFBamValueByContNextIdxKey key = schema.getFactoryValue().newContNextIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setOptionalNextId( NextId );

		YCFBamValueBuff[] recArray;
		if( dictByContNextIdx.containsKey( key ) ) {
			Map< YCFBamValuePKey, YCFBamValueBuff > subdictContNextIdx
				= dictByContNextIdx.get( key );
			recArray = new YCFBamValueBuff[ subdictContNextIdx.size() ];
			Iterator< YCFBamValueBuff > iter = subdictContNextIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamValuePKey, YCFBamValueBuff > subdictContNextIdx
				= new HashMap< YCFBamValuePKey, YCFBamValueBuff >();
			dictByContNextIdx.put( key, subdictContNextIdx );
			recArray = new YCFBamValueBuff[0];
		}
		return( recArray );
	}

	public YCFBamValueBuff[] readDerivedByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "YCFBamRamValue.readDerivedByCodeVisIdx";
		YCFBamValueByCodeVisIdxKey key = schema.getFactoryValue().newCodeVisIdxKey();
		key.setRequiredCodeVis( CodeVis );

		YCFBamValueBuff[] recArray;
		if( dictByCodeVisIdx.containsKey( key ) ) {
			Map< YCFBamValuePKey, YCFBamValueBuff > subdictCodeVisIdx
				= dictByCodeVisIdx.get( key );
			recArray = new YCFBamValueBuff[ subdictCodeVisIdx.size() ];
			Iterator< YCFBamValueBuff > iter = subdictCodeVisIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamValuePKey, YCFBamValueBuff > subdictCodeVisIdx
				= new HashMap< YCFBamValuePKey, YCFBamValueBuff >();
			dictByCodeVisIdx.put( key, subdictCodeVisIdx );
			recArray = new YCFBamValueBuff[0];
		}
		return( recArray );
	}

	public YCFBamValueBuff[] readDerivedByScopeCodeVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "YCFBamRamValue.readDerivedByScopeCodeVisIdx";
		YCFBamValueByScopeCodeVisIdxKey key = schema.getFactoryValue().newScopeCodeVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredScopeId( ScopeId );
		key.setRequiredCodeVis( CodeVis );

		YCFBamValueBuff[] recArray;
		if( dictByScopeCodeVisIdx.containsKey( key ) ) {
			Map< YCFBamValuePKey, YCFBamValueBuff > subdictScopeCodeVisIdx
				= dictByScopeCodeVisIdx.get( key );
			recArray = new YCFBamValueBuff[ subdictScopeCodeVisIdx.size() ];
			Iterator< YCFBamValueBuff > iter = subdictScopeCodeVisIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamValuePKey, YCFBamValueBuff > subdictScopeCodeVisIdx
				= new HashMap< YCFBamValuePKey, YCFBamValueBuff >();
			dictByScopeCodeVisIdx.put( key, subdictScopeCodeVisIdx );
			recArray = new YCFBamValueBuff[0];
		}
		return( recArray );
	}

	public YCFBamValueBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamValue.readDerivedByIdIdx() ";
		YCFBamValuePKey key = schema.getFactoryValue().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamValueBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamValueBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamValuePKey PKey )
	{
		final String S_ProcName = "YCFBamRamValue.readBuff";
		YCFBamValueBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a80c" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamValueBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamValuePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamValueBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a80c" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamValueBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamValue.readAllBuff";
		YCFBamValueBuff buff;
		ArrayList<YCFBamValueBuff> filteredList = new ArrayList<YCFBamValueBuff>();
		YCFBamValueBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a80c" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamValueBuff[0] ) );
	}

	public YCFBamValueBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamValue.readBuffByIdIdx() ";
		YCFBamValueBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a80c" ) ) {
			return( (YCFBamValueBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamValueBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamValue.readBuffByUNameIdx() ";
		YCFBamValueBuff buff = readDerivedByUNameIdx( Authorization,
			TenantId,
			ScopeId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a80c" ) ) {
			return( (YCFBamValueBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamValueBuff[] readBuffByValTentIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamValue.readBuffByValTentIdx() ";
		YCFBamValueBuff buff;
		ArrayList<YCFBamValueBuff> filteredList = new ArrayList<YCFBamValueBuff>();
		YCFBamValueBuff[] buffList = readDerivedByValTentIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a80c" ) ) {
				filteredList.add( (YCFBamValueBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamValueBuff[0] ) );
	}

	public YCFBamValueBuff[] readBuffByScopeIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId )
	{
		final String S_ProcName = "YCFBamRamValue.readBuffByScopeIdx() ";
		YCFBamValueBuff buff;
		ArrayList<YCFBamValueBuff> filteredList = new ArrayList<YCFBamValueBuff>();
		YCFBamValueBuff[] buffList = readDerivedByScopeIdx( Authorization,
			TenantId,
			ScopeId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a80c" ) ) {
				filteredList.add( (YCFBamValueBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamValueBuff[0] ) );
	}

	public YCFBamValueBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamValue.readBuffByDefSchemaIdx() ";
		YCFBamValueBuff buff;
		ArrayList<YCFBamValueBuff> filteredList = new ArrayList<YCFBamValueBuff>();
		YCFBamValueBuff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a80c" ) ) {
				filteredList.add( (YCFBamValueBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamValueBuff[0] ) );
	}

	public YCFBamValueBuff[] readBuffByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "YCFBamRamValue.readBuffByPrevIdx() ";
		YCFBamValueBuff buff;
		ArrayList<YCFBamValueBuff> filteredList = new ArrayList<YCFBamValueBuff>();
		YCFBamValueBuff[] buffList = readDerivedByPrevIdx( Authorization,
			PrevTenantId,
			PrevId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a80c" ) ) {
				filteredList.add( (YCFBamValueBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamValueBuff[0] ) );
	}

	public YCFBamValueBuff[] readBuffByNextIdx( YCFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "YCFBamRamValue.readBuffByNextIdx() ";
		YCFBamValueBuff buff;
		ArrayList<YCFBamValueBuff> filteredList = new ArrayList<YCFBamValueBuff>();
		YCFBamValueBuff[] buffList = readDerivedByNextIdx( Authorization,
			NextTenantId,
			NextId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a80c" ) ) {
				filteredList.add( (YCFBamValueBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamValueBuff[0] ) );
	}

	public YCFBamValueBuff[] readBuffByContPrevIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long PrevId )
	{
		final String S_ProcName = "YCFBamRamValue.readBuffByContPrevIdx() ";
		YCFBamValueBuff buff;
		ArrayList<YCFBamValueBuff> filteredList = new ArrayList<YCFBamValueBuff>();
		YCFBamValueBuff[] buffList = readDerivedByContPrevIdx( Authorization,
			TenantId,
			ScopeId,
			PrevId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a80c" ) ) {
				filteredList.add( (YCFBamValueBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamValueBuff[0] ) );
	}

	public YCFBamValueBuff[] readBuffByContNextIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		Long NextId )
	{
		final String S_ProcName = "YCFBamRamValue.readBuffByContNextIdx() ";
		YCFBamValueBuff buff;
		ArrayList<YCFBamValueBuff> filteredList = new ArrayList<YCFBamValueBuff>();
		YCFBamValueBuff[] buffList = readDerivedByContNextIdx( Authorization,
			TenantId,
			ScopeId,
			NextId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a80c" ) ) {
				filteredList.add( (YCFBamValueBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamValueBuff[0] ) );
	}

	public YCFBamValueBuff[] readBuffByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "YCFBamRamValue.readBuffByCodeVisIdx() ";
		YCFBamValueBuff buff;
		ArrayList<YCFBamValueBuff> filteredList = new ArrayList<YCFBamValueBuff>();
		YCFBamValueBuff[] buffList = readDerivedByCodeVisIdx( Authorization,
			CodeVis );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a80c" ) ) {
				filteredList.add( (YCFBamValueBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamValueBuff[0] ) );
	}

	public YCFBamValueBuff[] readBuffByScopeCodeVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ScopeId,
		IYCFBamSchema.CodeVisibilityEnum CodeVis )
	{
		final String S_ProcName = "YCFBamRamValue.readBuffByScopeCodeVisIdx() ";
		YCFBamValueBuff buff;
		ArrayList<YCFBamValueBuff> filteredList = new ArrayList<YCFBamValueBuff>();
		YCFBamValueBuff[] buffList = readDerivedByScopeCodeVisIdx( Authorization,
			TenantId,
			ScopeId,
			CodeVis );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a80c" ) ) {
				filteredList.add( (YCFBamValueBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamValueBuff[0] ) );
	}

	/**
	 *	Move the specified buffer up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	public YCFBamValueBuff moveBuffUp( YCFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision )
	{
		final String S_ProcName = "moveBuffUp";

		YCFBamValueBuff grandprev = null;
		YCFBamValueBuff prev = null;
		YCFBamValueBuff cur = null;
		YCFBamValueBuff next = null;

		cur = schema.getTableValue().readDerivedByIdIdx(Authorization, TenantId, Id);
		if( cur == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object" );
		}

		if( ( cur.getOptionalPrevTenantId() == null )
			&& ( cur.getOptionalPrevId() == null ) )
		{
			return( (YCFBamValueBuff)cur );
		}

		prev = schema.getTableValue().readDerivedByIdIdx(Authorization, cur.getOptionalPrevTenantId(), cur.getOptionalPrevId() );
		if( prev == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object.prev" );
		}

		if( ( prev.getOptionalPrevTenantId() != null )
			&& ( prev.getOptionalPrevId() != null ) )
		{
			grandprev = schema.getTableValue().readDerivedByIdIdx(Authorization, prev.getOptionalPrevTenantId(), prev.getOptionalPrevId() );
			if( grandprev == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.prev.prev" );
			}
		}

		if( ( cur.getOptionalNextTenantId() != null )
			&& ( cur.getOptionalNextId() != null ) )
		{
			next = schema.getTableValue().readDerivedByIdIdx(Authorization, cur.getOptionalNextTenantId(), cur.getOptionalNextId() );
			if( next == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.next" );
			}
		}

		String classCode = prev.getClassCode();
		YCFBamValueBuff newInstance;
			if( classCode.equals( "a80c" ) ) {
				newInstance = schema.getFactoryValue().newBuff();
			}
			else if( classCode.equals( "a80d" ) ) {
				newInstance = schema.getFactoryAtom().newBuff();
			}
			else if( classCode.equals( "a80e" ) ) {
				newInstance = schema.getFactoryBlobDef().newBuff();
			}
			else if( classCode.equals( "a80f" ) ) {
				newInstance = schema.getFactoryBlobType().newBuff();
			}
			else if( classCode.equals( "a86e" ) ) {
				newInstance = schema.getFactoryBlobCol().newBuff();
			}
			else if( classCode.equals( "a810" ) ) {
				newInstance = schema.getFactoryBoolDef().newBuff();
			}
			else if( classCode.equals( "a811" ) ) {
				newInstance = schema.getFactoryBoolType().newBuff();
			}
			else if( classCode.equals( "a86f" ) ) {
				newInstance = schema.getFactoryBoolCol().newBuff();
			}
			else if( classCode.equals( "a818" ) ) {
				newInstance = schema.getFactoryDateDef().newBuff();
			}
			else if( classCode.equals( "a819" ) ) {
				newInstance = schema.getFactoryDateType().newBuff();
			}
			else if( classCode.equals( "a870" ) ) {
				newInstance = schema.getFactoryDateCol().newBuff();
			}
			else if( classCode.equals( "a81f" ) ) {
				newInstance = schema.getFactoryDoubleDef().newBuff();
			}
			else if( classCode.equals( "a820" ) ) {
				newInstance = schema.getFactoryDoubleType().newBuff();
			}
			else if( classCode.equals( "a871" ) ) {
				newInstance = schema.getFactoryDoubleCol().newBuff();
			}
			else if( classCode.equals( "a822" ) ) {
				newInstance = schema.getFactoryFloatDef().newBuff();
			}
			else if( classCode.equals( "a823" ) ) {
				newInstance = schema.getFactoryFloatType().newBuff();
			}
			else if( classCode.equals( "a874" ) ) {
				newInstance = schema.getFactoryFloatCol().newBuff();
			}
			else if( classCode.equals( "a826" ) ) {
				newInstance = schema.getFactoryInt16Def().newBuff();
			}
			else if( classCode.equals( "a827" ) ) {
				newInstance = schema.getFactoryInt16Type().newBuff();
			}
			else if( classCode.equals( "a875" ) ) {
				newInstance = schema.getFactoryId16Gen().newBuff();
			}
			else if( classCode.equals( "a872" ) ) {
				newInstance = schema.getFactoryEnumDef().newBuff();
			}
			else if( classCode.equals( "a873" ) ) {
				newInstance = schema.getFactoryEnumType().newBuff();
			}
			else if( classCode.equals( "a878" ) ) {
				newInstance = schema.getFactoryInt16Col().newBuff();
			}
			else if( classCode.equals( "a828" ) ) {
				newInstance = schema.getFactoryInt32Def().newBuff();
			}
			else if( classCode.equals( "a829" ) ) {
				newInstance = schema.getFactoryInt32Type().newBuff();
			}
			else if( classCode.equals( "a876" ) ) {
				newInstance = schema.getFactoryId32Gen().newBuff();
			}
			else if( classCode.equals( "a879" ) ) {
				newInstance = schema.getFactoryInt32Col().newBuff();
			}
			else if( classCode.equals( "a82a" ) ) {
				newInstance = schema.getFactoryInt64Def().newBuff();
			}
			else if( classCode.equals( "a82b" ) ) {
				newInstance = schema.getFactoryInt64Type().newBuff();
			}
			else if( classCode.equals( "a877" ) ) {
				newInstance = schema.getFactoryId64Gen().newBuff();
			}
			else if( classCode.equals( "a87a" ) ) {
				newInstance = schema.getFactoryInt64Col().newBuff();
			}
			else if( classCode.equals( "a82c" ) ) {
				newInstance = schema.getFactoryNmTokenDef().newBuff();
			}
			else if( classCode.equals( "a82d" ) ) {
				newInstance = schema.getFactoryNmTokenType().newBuff();
			}
			else if( classCode.equals( "a87b" ) ) {
				newInstance = schema.getFactoryNmTokenCol().newBuff();
			}
			else if( classCode.equals( "a82e" ) ) {
				newInstance = schema.getFactoryNmTokensDef().newBuff();
			}
			else if( classCode.equals( "a82f" ) ) {
				newInstance = schema.getFactoryNmTokensType().newBuff();
			}
			else if( classCode.equals( "a87c" ) ) {
				newInstance = schema.getFactoryNmTokensCol().newBuff();
			}
			else if( classCode.equals( "a830" ) ) {
				newInstance = schema.getFactoryNumberDef().newBuff();
			}
			else if( classCode.equals( "a831" ) ) {
				newInstance = schema.getFactoryNumberType().newBuff();
			}
			else if( classCode.equals( "a87d" ) ) {
				newInstance = schema.getFactoryNumberCol().newBuff();
			}
			else if( classCode.equals( "a83b" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Def().newBuff();
			}
			else if( classCode.equals( "a83c" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Col().newBuff();
			}
			else if( classCode.equals( "a83d" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Type().newBuff();
			}
			else if( classCode.equals( "a83e" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Gen().newBuff();
			}
			else if( classCode.equals( "a83f" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Def().newBuff();
			}
			else if( classCode.equals( "a840" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Col().newBuff();
			}
			else if( classCode.equals( "a841" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Type().newBuff();
			}
			else if( classCode.equals( "a842" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Gen().newBuff();
			}
			else if( classCode.equals( "a843" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Def().newBuff();
			}
			else if( classCode.equals( "a844" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Col().newBuff();
			}
			else if( classCode.equals( "a845" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Type().newBuff();
			}
			else if( classCode.equals( "a846" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Gen().newBuff();
			}
			else if( classCode.equals( "a847" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Def().newBuff();
			}
			else if( classCode.equals( "a848" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Col().newBuff();
			}
			else if( classCode.equals( "a849" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Type().newBuff();
			}
			else if( classCode.equals( "a84a" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Gen().newBuff();
			}
			else if( classCode.equals( "a84b" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Def().newBuff();
			}
			else if( classCode.equals( "a84c" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Col().newBuff();
			}
			else if( classCode.equals( "a84d" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Type().newBuff();
			}
			else if( classCode.equals( "a84e" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Gen().newBuff();
			}
			else if( classCode.equals( "a84f" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Def().newBuff();
			}
			else if( classCode.equals( "a850" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Col().newBuff();
			}
			else if( classCode.equals( "a851" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Type().newBuff();
			}
			else if( classCode.equals( "a852" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Gen().newBuff();
			}
			else if( classCode.equals( "a853" ) ) {
				newInstance = schema.getFactoryStringDef().newBuff();
			}
			else if( classCode.equals( "a854" ) ) {
				newInstance = schema.getFactoryStringType().newBuff();
			}
			else if( classCode.equals( "a87e" ) ) {
				newInstance = schema.getFactoryStringCol().newBuff();
			}
			else if( classCode.equals( "a855" ) ) {
				newInstance = schema.getFactoryTZDateDef().newBuff();
			}
			else if( classCode.equals( "a856" ) ) {
				newInstance = schema.getFactoryTZDateType().newBuff();
			}
			else if( classCode.equals( "a87f" ) ) {
				newInstance = schema.getFactoryTZDateCol().newBuff();
			}
			else if( classCode.equals( "a857" ) ) {
				newInstance = schema.getFactoryTZTimeDef().newBuff();
			}
			else if( classCode.equals( "a858" ) ) {
				newInstance = schema.getFactoryTZTimeType().newBuff();
			}
			else if( classCode.equals( "a880" ) ) {
				newInstance = schema.getFactoryTZTimeCol().newBuff();
			}
			else if( classCode.equals( "a859" ) ) {
				newInstance = schema.getFactoryTZTimestampDef().newBuff();
			}
			else if( classCode.equals( "a85a" ) ) {
				newInstance = schema.getFactoryTZTimestampType().newBuff();
			}
			else if( classCode.equals( "a881" ) ) {
				newInstance = schema.getFactoryTZTimestampCol().newBuff();
			}
			else if( classCode.equals( "a85c" ) ) {
				newInstance = schema.getFactoryTextDef().newBuff();
			}
			else if( classCode.equals( "a85d" ) ) {
				newInstance = schema.getFactoryTextType().newBuff();
			}
			else if( classCode.equals( "a882" ) ) {
				newInstance = schema.getFactoryTextCol().newBuff();
			}
			else if( classCode.equals( "a85e" ) ) {
				newInstance = schema.getFactoryTimeDef().newBuff();
			}
			else if( classCode.equals( "a85f" ) ) {
				newInstance = schema.getFactoryTimeType().newBuff();
			}
			else if( classCode.equals( "a883" ) ) {
				newInstance = schema.getFactoryTimeCol().newBuff();
			}
			else if( classCode.equals( "a860" ) ) {
				newInstance = schema.getFactoryTimestampDef().newBuff();
			}
			else if( classCode.equals( "a861" ) ) {
				newInstance = schema.getFactoryTimestampType().newBuff();
			}
			else if( classCode.equals( "a884" ) ) {
				newInstance = schema.getFactoryTimestampCol().newBuff();
			}
			else if( classCode.equals( "a862" ) ) {
				newInstance = schema.getFactoryTokenDef().newBuff();
			}
			else if( classCode.equals( "a863" ) ) {
				newInstance = schema.getFactoryTokenType().newBuff();
			}
			else if( classCode.equals( "a885" ) ) {
				newInstance = schema.getFactoryTokenCol().newBuff();
			}
			else if( classCode.equals( "a864" ) ) {
				newInstance = schema.getFactoryUInt16Def().newBuff();
			}
			else if( classCode.equals( "a865" ) ) {
				newInstance = schema.getFactoryUInt16Type().newBuff();
			}
			else if( classCode.equals( "a886" ) ) {
				newInstance = schema.getFactoryUInt16Col().newBuff();
			}
			else if( classCode.equals( "a866" ) ) {
				newInstance = schema.getFactoryUInt32Def().newBuff();
			}
			else if( classCode.equals( "a867" ) ) {
				newInstance = schema.getFactoryUInt32Type().newBuff();
			}
			else if( classCode.equals( "a887" ) ) {
				newInstance = schema.getFactoryUInt32Col().newBuff();
			}
			else if( classCode.equals( "a868" ) ) {
				newInstance = schema.getFactoryUInt64Def().newBuff();
			}
			else if( classCode.equals( "a869" ) ) {
				newInstance = schema.getFactoryUInt64Type().newBuff();
			}
			else if( classCode.equals( "a888" ) ) {
				newInstance = schema.getFactoryUInt64Col().newBuff();
			}
			else if( classCode.equals( "a86a" ) ) {
				newInstance = schema.getFactoryUuidDef().newBuff();
			}
			else if( classCode.equals( "a86c" ) ) {
				newInstance = schema.getFactoryUuidType().newBuff();
			}
			else if( classCode.equals( "a88b" ) ) {
				newInstance = schema.getFactoryUuidGen().newBuff();
			}
			else if( classCode.equals( "a889" ) ) {
				newInstance = schema.getFactoryUuidCol().newBuff();
			}
			else if( classCode.equals( "a86b" ) ) {
				newInstance = schema.getFactoryUuid6Def().newBuff();
			}
			else if( classCode.equals( "a86d" ) ) {
				newInstance = schema.getFactoryUuid6Type().newBuff();
			}
			else if( classCode.equals( "a88c" ) ) {
				newInstance = schema.getFactoryUuid6Gen().newBuff();
			}
			else if( classCode.equals( "a88a" ) ) {
				newInstance = schema.getFactoryUuid6Col().newBuff();
			}
			else if( classCode.equals( "a85b" ) ) {
				newInstance = schema.getFactoryTableCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamValueBuff editPrev = newInstance;
		editPrev.set( prev );

		classCode = cur.getClassCode();
			if( classCode.equals( "a80c" ) ) {
				newInstance = schema.getFactoryValue().newBuff();
			}
			else if( classCode.equals( "a80d" ) ) {
				newInstance = schema.getFactoryAtom().newBuff();
			}
			else if( classCode.equals( "a80e" ) ) {
				newInstance = schema.getFactoryBlobDef().newBuff();
			}
			else if( classCode.equals( "a80f" ) ) {
				newInstance = schema.getFactoryBlobType().newBuff();
			}
			else if( classCode.equals( "a86e" ) ) {
				newInstance = schema.getFactoryBlobCol().newBuff();
			}
			else if( classCode.equals( "a810" ) ) {
				newInstance = schema.getFactoryBoolDef().newBuff();
			}
			else if( classCode.equals( "a811" ) ) {
				newInstance = schema.getFactoryBoolType().newBuff();
			}
			else if( classCode.equals( "a86f" ) ) {
				newInstance = schema.getFactoryBoolCol().newBuff();
			}
			else if( classCode.equals( "a818" ) ) {
				newInstance = schema.getFactoryDateDef().newBuff();
			}
			else if( classCode.equals( "a819" ) ) {
				newInstance = schema.getFactoryDateType().newBuff();
			}
			else if( classCode.equals( "a870" ) ) {
				newInstance = schema.getFactoryDateCol().newBuff();
			}
			else if( classCode.equals( "a81f" ) ) {
				newInstance = schema.getFactoryDoubleDef().newBuff();
			}
			else if( classCode.equals( "a820" ) ) {
				newInstance = schema.getFactoryDoubleType().newBuff();
			}
			else if( classCode.equals( "a871" ) ) {
				newInstance = schema.getFactoryDoubleCol().newBuff();
			}
			else if( classCode.equals( "a822" ) ) {
				newInstance = schema.getFactoryFloatDef().newBuff();
			}
			else if( classCode.equals( "a823" ) ) {
				newInstance = schema.getFactoryFloatType().newBuff();
			}
			else if( classCode.equals( "a874" ) ) {
				newInstance = schema.getFactoryFloatCol().newBuff();
			}
			else if( classCode.equals( "a826" ) ) {
				newInstance = schema.getFactoryInt16Def().newBuff();
			}
			else if( classCode.equals( "a827" ) ) {
				newInstance = schema.getFactoryInt16Type().newBuff();
			}
			else if( classCode.equals( "a875" ) ) {
				newInstance = schema.getFactoryId16Gen().newBuff();
			}
			else if( classCode.equals( "a872" ) ) {
				newInstance = schema.getFactoryEnumDef().newBuff();
			}
			else if( classCode.equals( "a873" ) ) {
				newInstance = schema.getFactoryEnumType().newBuff();
			}
			else if( classCode.equals( "a878" ) ) {
				newInstance = schema.getFactoryInt16Col().newBuff();
			}
			else if( classCode.equals( "a828" ) ) {
				newInstance = schema.getFactoryInt32Def().newBuff();
			}
			else if( classCode.equals( "a829" ) ) {
				newInstance = schema.getFactoryInt32Type().newBuff();
			}
			else if( classCode.equals( "a876" ) ) {
				newInstance = schema.getFactoryId32Gen().newBuff();
			}
			else if( classCode.equals( "a879" ) ) {
				newInstance = schema.getFactoryInt32Col().newBuff();
			}
			else if( classCode.equals( "a82a" ) ) {
				newInstance = schema.getFactoryInt64Def().newBuff();
			}
			else if( classCode.equals( "a82b" ) ) {
				newInstance = schema.getFactoryInt64Type().newBuff();
			}
			else if( classCode.equals( "a877" ) ) {
				newInstance = schema.getFactoryId64Gen().newBuff();
			}
			else if( classCode.equals( "a87a" ) ) {
				newInstance = schema.getFactoryInt64Col().newBuff();
			}
			else if( classCode.equals( "a82c" ) ) {
				newInstance = schema.getFactoryNmTokenDef().newBuff();
			}
			else if( classCode.equals( "a82d" ) ) {
				newInstance = schema.getFactoryNmTokenType().newBuff();
			}
			else if( classCode.equals( "a87b" ) ) {
				newInstance = schema.getFactoryNmTokenCol().newBuff();
			}
			else if( classCode.equals( "a82e" ) ) {
				newInstance = schema.getFactoryNmTokensDef().newBuff();
			}
			else if( classCode.equals( "a82f" ) ) {
				newInstance = schema.getFactoryNmTokensType().newBuff();
			}
			else if( classCode.equals( "a87c" ) ) {
				newInstance = schema.getFactoryNmTokensCol().newBuff();
			}
			else if( classCode.equals( "a830" ) ) {
				newInstance = schema.getFactoryNumberDef().newBuff();
			}
			else if( classCode.equals( "a831" ) ) {
				newInstance = schema.getFactoryNumberType().newBuff();
			}
			else if( classCode.equals( "a87d" ) ) {
				newInstance = schema.getFactoryNumberCol().newBuff();
			}
			else if( classCode.equals( "a83b" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Def().newBuff();
			}
			else if( classCode.equals( "a83c" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Col().newBuff();
			}
			else if( classCode.equals( "a83d" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Type().newBuff();
			}
			else if( classCode.equals( "a83e" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Gen().newBuff();
			}
			else if( classCode.equals( "a83f" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Def().newBuff();
			}
			else if( classCode.equals( "a840" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Col().newBuff();
			}
			else if( classCode.equals( "a841" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Type().newBuff();
			}
			else if( classCode.equals( "a842" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Gen().newBuff();
			}
			else if( classCode.equals( "a843" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Def().newBuff();
			}
			else if( classCode.equals( "a844" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Col().newBuff();
			}
			else if( classCode.equals( "a845" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Type().newBuff();
			}
			else if( classCode.equals( "a846" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Gen().newBuff();
			}
			else if( classCode.equals( "a847" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Def().newBuff();
			}
			else if( classCode.equals( "a848" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Col().newBuff();
			}
			else if( classCode.equals( "a849" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Type().newBuff();
			}
			else if( classCode.equals( "a84a" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Gen().newBuff();
			}
			else if( classCode.equals( "a84b" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Def().newBuff();
			}
			else if( classCode.equals( "a84c" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Col().newBuff();
			}
			else if( classCode.equals( "a84d" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Type().newBuff();
			}
			else if( classCode.equals( "a84e" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Gen().newBuff();
			}
			else if( classCode.equals( "a84f" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Def().newBuff();
			}
			else if( classCode.equals( "a850" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Col().newBuff();
			}
			else if( classCode.equals( "a851" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Type().newBuff();
			}
			else if( classCode.equals( "a852" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Gen().newBuff();
			}
			else if( classCode.equals( "a853" ) ) {
				newInstance = schema.getFactoryStringDef().newBuff();
			}
			else if( classCode.equals( "a854" ) ) {
				newInstance = schema.getFactoryStringType().newBuff();
			}
			else if( classCode.equals( "a87e" ) ) {
				newInstance = schema.getFactoryStringCol().newBuff();
			}
			else if( classCode.equals( "a855" ) ) {
				newInstance = schema.getFactoryTZDateDef().newBuff();
			}
			else if( classCode.equals( "a856" ) ) {
				newInstance = schema.getFactoryTZDateType().newBuff();
			}
			else if( classCode.equals( "a87f" ) ) {
				newInstance = schema.getFactoryTZDateCol().newBuff();
			}
			else if( classCode.equals( "a857" ) ) {
				newInstance = schema.getFactoryTZTimeDef().newBuff();
			}
			else if( classCode.equals( "a858" ) ) {
				newInstance = schema.getFactoryTZTimeType().newBuff();
			}
			else if( classCode.equals( "a880" ) ) {
				newInstance = schema.getFactoryTZTimeCol().newBuff();
			}
			else if( classCode.equals( "a859" ) ) {
				newInstance = schema.getFactoryTZTimestampDef().newBuff();
			}
			else if( classCode.equals( "a85a" ) ) {
				newInstance = schema.getFactoryTZTimestampType().newBuff();
			}
			else if( classCode.equals( "a881" ) ) {
				newInstance = schema.getFactoryTZTimestampCol().newBuff();
			}
			else if( classCode.equals( "a85c" ) ) {
				newInstance = schema.getFactoryTextDef().newBuff();
			}
			else if( classCode.equals( "a85d" ) ) {
				newInstance = schema.getFactoryTextType().newBuff();
			}
			else if( classCode.equals( "a882" ) ) {
				newInstance = schema.getFactoryTextCol().newBuff();
			}
			else if( classCode.equals( "a85e" ) ) {
				newInstance = schema.getFactoryTimeDef().newBuff();
			}
			else if( classCode.equals( "a85f" ) ) {
				newInstance = schema.getFactoryTimeType().newBuff();
			}
			else if( classCode.equals( "a883" ) ) {
				newInstance = schema.getFactoryTimeCol().newBuff();
			}
			else if( classCode.equals( "a860" ) ) {
				newInstance = schema.getFactoryTimestampDef().newBuff();
			}
			else if( classCode.equals( "a861" ) ) {
				newInstance = schema.getFactoryTimestampType().newBuff();
			}
			else if( classCode.equals( "a884" ) ) {
				newInstance = schema.getFactoryTimestampCol().newBuff();
			}
			else if( classCode.equals( "a862" ) ) {
				newInstance = schema.getFactoryTokenDef().newBuff();
			}
			else if( classCode.equals( "a863" ) ) {
				newInstance = schema.getFactoryTokenType().newBuff();
			}
			else if( classCode.equals( "a885" ) ) {
				newInstance = schema.getFactoryTokenCol().newBuff();
			}
			else if( classCode.equals( "a864" ) ) {
				newInstance = schema.getFactoryUInt16Def().newBuff();
			}
			else if( classCode.equals( "a865" ) ) {
				newInstance = schema.getFactoryUInt16Type().newBuff();
			}
			else if( classCode.equals( "a886" ) ) {
				newInstance = schema.getFactoryUInt16Col().newBuff();
			}
			else if( classCode.equals( "a866" ) ) {
				newInstance = schema.getFactoryUInt32Def().newBuff();
			}
			else if( classCode.equals( "a867" ) ) {
				newInstance = schema.getFactoryUInt32Type().newBuff();
			}
			else if( classCode.equals( "a887" ) ) {
				newInstance = schema.getFactoryUInt32Col().newBuff();
			}
			else if( classCode.equals( "a868" ) ) {
				newInstance = schema.getFactoryUInt64Def().newBuff();
			}
			else if( classCode.equals( "a869" ) ) {
				newInstance = schema.getFactoryUInt64Type().newBuff();
			}
			else if( classCode.equals( "a888" ) ) {
				newInstance = schema.getFactoryUInt64Col().newBuff();
			}
			else if( classCode.equals( "a86a" ) ) {
				newInstance = schema.getFactoryUuidDef().newBuff();
			}
			else if( classCode.equals( "a86c" ) ) {
				newInstance = schema.getFactoryUuidType().newBuff();
			}
			else if( classCode.equals( "a88b" ) ) {
				newInstance = schema.getFactoryUuidGen().newBuff();
			}
			else if( classCode.equals( "a889" ) ) {
				newInstance = schema.getFactoryUuidCol().newBuff();
			}
			else if( classCode.equals( "a86b" ) ) {
				newInstance = schema.getFactoryUuid6Def().newBuff();
			}
			else if( classCode.equals( "a86d" ) ) {
				newInstance = schema.getFactoryUuid6Type().newBuff();
			}
			else if( classCode.equals( "a88c" ) ) {
				newInstance = schema.getFactoryUuid6Gen().newBuff();
			}
			else if( classCode.equals( "a88a" ) ) {
				newInstance = schema.getFactoryUuid6Col().newBuff();
			}
			else if( classCode.equals( "a85b" ) ) {
				newInstance = schema.getFactoryTableCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamValueBuff editCur = newInstance;
		editCur.set( cur );

		YCFBamValueBuff editGrandprev = null;
		if( grandprev != null ) {
			classCode = grandprev.getClassCode();
			if( classCode.equals( "a80c" ) ) {
				newInstance = schema.getFactoryValue().newBuff();
			}
			else if( classCode.equals( "a80d" ) ) {
				newInstance = schema.getFactoryAtom().newBuff();
			}
			else if( classCode.equals( "a80e" ) ) {
				newInstance = schema.getFactoryBlobDef().newBuff();
			}
			else if( classCode.equals( "a80f" ) ) {
				newInstance = schema.getFactoryBlobType().newBuff();
			}
			else if( classCode.equals( "a86e" ) ) {
				newInstance = schema.getFactoryBlobCol().newBuff();
			}
			else if( classCode.equals( "a810" ) ) {
				newInstance = schema.getFactoryBoolDef().newBuff();
			}
			else if( classCode.equals( "a811" ) ) {
				newInstance = schema.getFactoryBoolType().newBuff();
			}
			else if( classCode.equals( "a86f" ) ) {
				newInstance = schema.getFactoryBoolCol().newBuff();
			}
			else if( classCode.equals( "a818" ) ) {
				newInstance = schema.getFactoryDateDef().newBuff();
			}
			else if( classCode.equals( "a819" ) ) {
				newInstance = schema.getFactoryDateType().newBuff();
			}
			else if( classCode.equals( "a870" ) ) {
				newInstance = schema.getFactoryDateCol().newBuff();
			}
			else if( classCode.equals( "a81f" ) ) {
				newInstance = schema.getFactoryDoubleDef().newBuff();
			}
			else if( classCode.equals( "a820" ) ) {
				newInstance = schema.getFactoryDoubleType().newBuff();
			}
			else if( classCode.equals( "a871" ) ) {
				newInstance = schema.getFactoryDoubleCol().newBuff();
			}
			else if( classCode.equals( "a822" ) ) {
				newInstance = schema.getFactoryFloatDef().newBuff();
			}
			else if( classCode.equals( "a823" ) ) {
				newInstance = schema.getFactoryFloatType().newBuff();
			}
			else if( classCode.equals( "a874" ) ) {
				newInstance = schema.getFactoryFloatCol().newBuff();
			}
			else if( classCode.equals( "a826" ) ) {
				newInstance = schema.getFactoryInt16Def().newBuff();
			}
			else if( classCode.equals( "a827" ) ) {
				newInstance = schema.getFactoryInt16Type().newBuff();
			}
			else if( classCode.equals( "a875" ) ) {
				newInstance = schema.getFactoryId16Gen().newBuff();
			}
			else if( classCode.equals( "a872" ) ) {
				newInstance = schema.getFactoryEnumDef().newBuff();
			}
			else if( classCode.equals( "a873" ) ) {
				newInstance = schema.getFactoryEnumType().newBuff();
			}
			else if( classCode.equals( "a878" ) ) {
				newInstance = schema.getFactoryInt16Col().newBuff();
			}
			else if( classCode.equals( "a828" ) ) {
				newInstance = schema.getFactoryInt32Def().newBuff();
			}
			else if( classCode.equals( "a829" ) ) {
				newInstance = schema.getFactoryInt32Type().newBuff();
			}
			else if( classCode.equals( "a876" ) ) {
				newInstance = schema.getFactoryId32Gen().newBuff();
			}
			else if( classCode.equals( "a879" ) ) {
				newInstance = schema.getFactoryInt32Col().newBuff();
			}
			else if( classCode.equals( "a82a" ) ) {
				newInstance = schema.getFactoryInt64Def().newBuff();
			}
			else if( classCode.equals( "a82b" ) ) {
				newInstance = schema.getFactoryInt64Type().newBuff();
			}
			else if( classCode.equals( "a877" ) ) {
				newInstance = schema.getFactoryId64Gen().newBuff();
			}
			else if( classCode.equals( "a87a" ) ) {
				newInstance = schema.getFactoryInt64Col().newBuff();
			}
			else if( classCode.equals( "a82c" ) ) {
				newInstance = schema.getFactoryNmTokenDef().newBuff();
			}
			else if( classCode.equals( "a82d" ) ) {
				newInstance = schema.getFactoryNmTokenType().newBuff();
			}
			else if( classCode.equals( "a87b" ) ) {
				newInstance = schema.getFactoryNmTokenCol().newBuff();
			}
			else if( classCode.equals( "a82e" ) ) {
				newInstance = schema.getFactoryNmTokensDef().newBuff();
			}
			else if( classCode.equals( "a82f" ) ) {
				newInstance = schema.getFactoryNmTokensType().newBuff();
			}
			else if( classCode.equals( "a87c" ) ) {
				newInstance = schema.getFactoryNmTokensCol().newBuff();
			}
			else if( classCode.equals( "a830" ) ) {
				newInstance = schema.getFactoryNumberDef().newBuff();
			}
			else if( classCode.equals( "a831" ) ) {
				newInstance = schema.getFactoryNumberType().newBuff();
			}
			else if( classCode.equals( "a87d" ) ) {
				newInstance = schema.getFactoryNumberCol().newBuff();
			}
			else if( classCode.equals( "a83b" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Def().newBuff();
			}
			else if( classCode.equals( "a83c" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Col().newBuff();
			}
			else if( classCode.equals( "a83d" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Type().newBuff();
			}
			else if( classCode.equals( "a83e" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Gen().newBuff();
			}
			else if( classCode.equals( "a83f" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Def().newBuff();
			}
			else if( classCode.equals( "a840" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Col().newBuff();
			}
			else if( classCode.equals( "a841" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Type().newBuff();
			}
			else if( classCode.equals( "a842" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Gen().newBuff();
			}
			else if( classCode.equals( "a843" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Def().newBuff();
			}
			else if( classCode.equals( "a844" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Col().newBuff();
			}
			else if( classCode.equals( "a845" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Type().newBuff();
			}
			else if( classCode.equals( "a846" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Gen().newBuff();
			}
			else if( classCode.equals( "a847" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Def().newBuff();
			}
			else if( classCode.equals( "a848" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Col().newBuff();
			}
			else if( classCode.equals( "a849" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Type().newBuff();
			}
			else if( classCode.equals( "a84a" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Gen().newBuff();
			}
			else if( classCode.equals( "a84b" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Def().newBuff();
			}
			else if( classCode.equals( "a84c" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Col().newBuff();
			}
			else if( classCode.equals( "a84d" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Type().newBuff();
			}
			else if( classCode.equals( "a84e" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Gen().newBuff();
			}
			else if( classCode.equals( "a84f" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Def().newBuff();
			}
			else if( classCode.equals( "a850" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Col().newBuff();
			}
			else if( classCode.equals( "a851" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Type().newBuff();
			}
			else if( classCode.equals( "a852" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Gen().newBuff();
			}
			else if( classCode.equals( "a853" ) ) {
				newInstance = schema.getFactoryStringDef().newBuff();
			}
			else if( classCode.equals( "a854" ) ) {
				newInstance = schema.getFactoryStringType().newBuff();
			}
			else if( classCode.equals( "a87e" ) ) {
				newInstance = schema.getFactoryStringCol().newBuff();
			}
			else if( classCode.equals( "a855" ) ) {
				newInstance = schema.getFactoryTZDateDef().newBuff();
			}
			else if( classCode.equals( "a856" ) ) {
				newInstance = schema.getFactoryTZDateType().newBuff();
			}
			else if( classCode.equals( "a87f" ) ) {
				newInstance = schema.getFactoryTZDateCol().newBuff();
			}
			else if( classCode.equals( "a857" ) ) {
				newInstance = schema.getFactoryTZTimeDef().newBuff();
			}
			else if( classCode.equals( "a858" ) ) {
				newInstance = schema.getFactoryTZTimeType().newBuff();
			}
			else if( classCode.equals( "a880" ) ) {
				newInstance = schema.getFactoryTZTimeCol().newBuff();
			}
			else if( classCode.equals( "a859" ) ) {
				newInstance = schema.getFactoryTZTimestampDef().newBuff();
			}
			else if( classCode.equals( "a85a" ) ) {
				newInstance = schema.getFactoryTZTimestampType().newBuff();
			}
			else if( classCode.equals( "a881" ) ) {
				newInstance = schema.getFactoryTZTimestampCol().newBuff();
			}
			else if( classCode.equals( "a85c" ) ) {
				newInstance = schema.getFactoryTextDef().newBuff();
			}
			else if( classCode.equals( "a85d" ) ) {
				newInstance = schema.getFactoryTextType().newBuff();
			}
			else if( classCode.equals( "a882" ) ) {
				newInstance = schema.getFactoryTextCol().newBuff();
			}
			else if( classCode.equals( "a85e" ) ) {
				newInstance = schema.getFactoryTimeDef().newBuff();
			}
			else if( classCode.equals( "a85f" ) ) {
				newInstance = schema.getFactoryTimeType().newBuff();
			}
			else if( classCode.equals( "a883" ) ) {
				newInstance = schema.getFactoryTimeCol().newBuff();
			}
			else if( classCode.equals( "a860" ) ) {
				newInstance = schema.getFactoryTimestampDef().newBuff();
			}
			else if( classCode.equals( "a861" ) ) {
				newInstance = schema.getFactoryTimestampType().newBuff();
			}
			else if( classCode.equals( "a884" ) ) {
				newInstance = schema.getFactoryTimestampCol().newBuff();
			}
			else if( classCode.equals( "a862" ) ) {
				newInstance = schema.getFactoryTokenDef().newBuff();
			}
			else if( classCode.equals( "a863" ) ) {
				newInstance = schema.getFactoryTokenType().newBuff();
			}
			else if( classCode.equals( "a885" ) ) {
				newInstance = schema.getFactoryTokenCol().newBuff();
			}
			else if( classCode.equals( "a864" ) ) {
				newInstance = schema.getFactoryUInt16Def().newBuff();
			}
			else if( classCode.equals( "a865" ) ) {
				newInstance = schema.getFactoryUInt16Type().newBuff();
			}
			else if( classCode.equals( "a886" ) ) {
				newInstance = schema.getFactoryUInt16Col().newBuff();
			}
			else if( classCode.equals( "a866" ) ) {
				newInstance = schema.getFactoryUInt32Def().newBuff();
			}
			else if( classCode.equals( "a867" ) ) {
				newInstance = schema.getFactoryUInt32Type().newBuff();
			}
			else if( classCode.equals( "a887" ) ) {
				newInstance = schema.getFactoryUInt32Col().newBuff();
			}
			else if( classCode.equals( "a868" ) ) {
				newInstance = schema.getFactoryUInt64Def().newBuff();
			}
			else if( classCode.equals( "a869" ) ) {
				newInstance = schema.getFactoryUInt64Type().newBuff();
			}
			else if( classCode.equals( "a888" ) ) {
				newInstance = schema.getFactoryUInt64Col().newBuff();
			}
			else if( classCode.equals( "a86a" ) ) {
				newInstance = schema.getFactoryUuidDef().newBuff();
			}
			else if( classCode.equals( "a86c" ) ) {
				newInstance = schema.getFactoryUuidType().newBuff();
			}
			else if( classCode.equals( "a88b" ) ) {
				newInstance = schema.getFactoryUuidGen().newBuff();
			}
			else if( classCode.equals( "a889" ) ) {
				newInstance = schema.getFactoryUuidCol().newBuff();
			}
			else if( classCode.equals( "a86b" ) ) {
				newInstance = schema.getFactoryUuid6Def().newBuff();
			}
			else if( classCode.equals( "a86d" ) ) {
				newInstance = schema.getFactoryUuid6Type().newBuff();
			}
			else if( classCode.equals( "a88c" ) ) {
				newInstance = schema.getFactoryUuid6Gen().newBuff();
			}
			else if( classCode.equals( "a88a" ) ) {
				newInstance = schema.getFactoryUuid6Col().newBuff();
			}
			else if( classCode.equals( "a85b" ) ) {
				newInstance = schema.getFactoryTableCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editGrandprev = newInstance;
			editGrandprev.set( grandprev );
		}

		YCFBamValueBuff editNext = null;
		if( next != null ) {
			classCode = next.getClassCode();
			if( classCode.equals( "a80c" ) ) {
				newInstance = schema.getFactoryValue().newBuff();
			}
			else if( classCode.equals( "a80d" ) ) {
				newInstance = schema.getFactoryAtom().newBuff();
			}
			else if( classCode.equals( "a80e" ) ) {
				newInstance = schema.getFactoryBlobDef().newBuff();
			}
			else if( classCode.equals( "a80f" ) ) {
				newInstance = schema.getFactoryBlobType().newBuff();
			}
			else if( classCode.equals( "a86e" ) ) {
				newInstance = schema.getFactoryBlobCol().newBuff();
			}
			else if( classCode.equals( "a810" ) ) {
				newInstance = schema.getFactoryBoolDef().newBuff();
			}
			else if( classCode.equals( "a811" ) ) {
				newInstance = schema.getFactoryBoolType().newBuff();
			}
			else if( classCode.equals( "a86f" ) ) {
				newInstance = schema.getFactoryBoolCol().newBuff();
			}
			else if( classCode.equals( "a818" ) ) {
				newInstance = schema.getFactoryDateDef().newBuff();
			}
			else if( classCode.equals( "a819" ) ) {
				newInstance = schema.getFactoryDateType().newBuff();
			}
			else if( classCode.equals( "a870" ) ) {
				newInstance = schema.getFactoryDateCol().newBuff();
			}
			else if( classCode.equals( "a81f" ) ) {
				newInstance = schema.getFactoryDoubleDef().newBuff();
			}
			else if( classCode.equals( "a820" ) ) {
				newInstance = schema.getFactoryDoubleType().newBuff();
			}
			else if( classCode.equals( "a871" ) ) {
				newInstance = schema.getFactoryDoubleCol().newBuff();
			}
			else if( classCode.equals( "a822" ) ) {
				newInstance = schema.getFactoryFloatDef().newBuff();
			}
			else if( classCode.equals( "a823" ) ) {
				newInstance = schema.getFactoryFloatType().newBuff();
			}
			else if( classCode.equals( "a874" ) ) {
				newInstance = schema.getFactoryFloatCol().newBuff();
			}
			else if( classCode.equals( "a826" ) ) {
				newInstance = schema.getFactoryInt16Def().newBuff();
			}
			else if( classCode.equals( "a827" ) ) {
				newInstance = schema.getFactoryInt16Type().newBuff();
			}
			else if( classCode.equals( "a875" ) ) {
				newInstance = schema.getFactoryId16Gen().newBuff();
			}
			else if( classCode.equals( "a872" ) ) {
				newInstance = schema.getFactoryEnumDef().newBuff();
			}
			else if( classCode.equals( "a873" ) ) {
				newInstance = schema.getFactoryEnumType().newBuff();
			}
			else if( classCode.equals( "a878" ) ) {
				newInstance = schema.getFactoryInt16Col().newBuff();
			}
			else if( classCode.equals( "a828" ) ) {
				newInstance = schema.getFactoryInt32Def().newBuff();
			}
			else if( classCode.equals( "a829" ) ) {
				newInstance = schema.getFactoryInt32Type().newBuff();
			}
			else if( classCode.equals( "a876" ) ) {
				newInstance = schema.getFactoryId32Gen().newBuff();
			}
			else if( classCode.equals( "a879" ) ) {
				newInstance = schema.getFactoryInt32Col().newBuff();
			}
			else if( classCode.equals( "a82a" ) ) {
				newInstance = schema.getFactoryInt64Def().newBuff();
			}
			else if( classCode.equals( "a82b" ) ) {
				newInstance = schema.getFactoryInt64Type().newBuff();
			}
			else if( classCode.equals( "a877" ) ) {
				newInstance = schema.getFactoryId64Gen().newBuff();
			}
			else if( classCode.equals( "a87a" ) ) {
				newInstance = schema.getFactoryInt64Col().newBuff();
			}
			else if( classCode.equals( "a82c" ) ) {
				newInstance = schema.getFactoryNmTokenDef().newBuff();
			}
			else if( classCode.equals( "a82d" ) ) {
				newInstance = schema.getFactoryNmTokenType().newBuff();
			}
			else if( classCode.equals( "a87b" ) ) {
				newInstance = schema.getFactoryNmTokenCol().newBuff();
			}
			else if( classCode.equals( "a82e" ) ) {
				newInstance = schema.getFactoryNmTokensDef().newBuff();
			}
			else if( classCode.equals( "a82f" ) ) {
				newInstance = schema.getFactoryNmTokensType().newBuff();
			}
			else if( classCode.equals( "a87c" ) ) {
				newInstance = schema.getFactoryNmTokensCol().newBuff();
			}
			else if( classCode.equals( "a830" ) ) {
				newInstance = schema.getFactoryNumberDef().newBuff();
			}
			else if( classCode.equals( "a831" ) ) {
				newInstance = schema.getFactoryNumberType().newBuff();
			}
			else if( classCode.equals( "a87d" ) ) {
				newInstance = schema.getFactoryNumberCol().newBuff();
			}
			else if( classCode.equals( "a83b" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Def().newBuff();
			}
			else if( classCode.equals( "a83c" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Col().newBuff();
			}
			else if( classCode.equals( "a83d" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Type().newBuff();
			}
			else if( classCode.equals( "a83e" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Gen().newBuff();
			}
			else if( classCode.equals( "a83f" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Def().newBuff();
			}
			else if( classCode.equals( "a840" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Col().newBuff();
			}
			else if( classCode.equals( "a841" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Type().newBuff();
			}
			else if( classCode.equals( "a842" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Gen().newBuff();
			}
			else if( classCode.equals( "a843" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Def().newBuff();
			}
			else if( classCode.equals( "a844" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Col().newBuff();
			}
			else if( classCode.equals( "a845" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Type().newBuff();
			}
			else if( classCode.equals( "a846" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Gen().newBuff();
			}
			else if( classCode.equals( "a847" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Def().newBuff();
			}
			else if( classCode.equals( "a848" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Col().newBuff();
			}
			else if( classCode.equals( "a849" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Type().newBuff();
			}
			else if( classCode.equals( "a84a" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Gen().newBuff();
			}
			else if( classCode.equals( "a84b" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Def().newBuff();
			}
			else if( classCode.equals( "a84c" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Col().newBuff();
			}
			else if( classCode.equals( "a84d" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Type().newBuff();
			}
			else if( classCode.equals( "a84e" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Gen().newBuff();
			}
			else if( classCode.equals( "a84f" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Def().newBuff();
			}
			else if( classCode.equals( "a850" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Col().newBuff();
			}
			else if( classCode.equals( "a851" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Type().newBuff();
			}
			else if( classCode.equals( "a852" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Gen().newBuff();
			}
			else if( classCode.equals( "a853" ) ) {
				newInstance = schema.getFactoryStringDef().newBuff();
			}
			else if( classCode.equals( "a854" ) ) {
				newInstance = schema.getFactoryStringType().newBuff();
			}
			else if( classCode.equals( "a87e" ) ) {
				newInstance = schema.getFactoryStringCol().newBuff();
			}
			else if( classCode.equals( "a855" ) ) {
				newInstance = schema.getFactoryTZDateDef().newBuff();
			}
			else if( classCode.equals( "a856" ) ) {
				newInstance = schema.getFactoryTZDateType().newBuff();
			}
			else if( classCode.equals( "a87f" ) ) {
				newInstance = schema.getFactoryTZDateCol().newBuff();
			}
			else if( classCode.equals( "a857" ) ) {
				newInstance = schema.getFactoryTZTimeDef().newBuff();
			}
			else if( classCode.equals( "a858" ) ) {
				newInstance = schema.getFactoryTZTimeType().newBuff();
			}
			else if( classCode.equals( "a880" ) ) {
				newInstance = schema.getFactoryTZTimeCol().newBuff();
			}
			else if( classCode.equals( "a859" ) ) {
				newInstance = schema.getFactoryTZTimestampDef().newBuff();
			}
			else if( classCode.equals( "a85a" ) ) {
				newInstance = schema.getFactoryTZTimestampType().newBuff();
			}
			else if( classCode.equals( "a881" ) ) {
				newInstance = schema.getFactoryTZTimestampCol().newBuff();
			}
			else if( classCode.equals( "a85c" ) ) {
				newInstance = schema.getFactoryTextDef().newBuff();
			}
			else if( classCode.equals( "a85d" ) ) {
				newInstance = schema.getFactoryTextType().newBuff();
			}
			else if( classCode.equals( "a882" ) ) {
				newInstance = schema.getFactoryTextCol().newBuff();
			}
			else if( classCode.equals( "a85e" ) ) {
				newInstance = schema.getFactoryTimeDef().newBuff();
			}
			else if( classCode.equals( "a85f" ) ) {
				newInstance = schema.getFactoryTimeType().newBuff();
			}
			else if( classCode.equals( "a883" ) ) {
				newInstance = schema.getFactoryTimeCol().newBuff();
			}
			else if( classCode.equals( "a860" ) ) {
				newInstance = schema.getFactoryTimestampDef().newBuff();
			}
			else if( classCode.equals( "a861" ) ) {
				newInstance = schema.getFactoryTimestampType().newBuff();
			}
			else if( classCode.equals( "a884" ) ) {
				newInstance = schema.getFactoryTimestampCol().newBuff();
			}
			else if( classCode.equals( "a862" ) ) {
				newInstance = schema.getFactoryTokenDef().newBuff();
			}
			else if( classCode.equals( "a863" ) ) {
				newInstance = schema.getFactoryTokenType().newBuff();
			}
			else if( classCode.equals( "a885" ) ) {
				newInstance = schema.getFactoryTokenCol().newBuff();
			}
			else if( classCode.equals( "a864" ) ) {
				newInstance = schema.getFactoryUInt16Def().newBuff();
			}
			else if( classCode.equals( "a865" ) ) {
				newInstance = schema.getFactoryUInt16Type().newBuff();
			}
			else if( classCode.equals( "a886" ) ) {
				newInstance = schema.getFactoryUInt16Col().newBuff();
			}
			else if( classCode.equals( "a866" ) ) {
				newInstance = schema.getFactoryUInt32Def().newBuff();
			}
			else if( classCode.equals( "a867" ) ) {
				newInstance = schema.getFactoryUInt32Type().newBuff();
			}
			else if( classCode.equals( "a887" ) ) {
				newInstance = schema.getFactoryUInt32Col().newBuff();
			}
			else if( classCode.equals( "a868" ) ) {
				newInstance = schema.getFactoryUInt64Def().newBuff();
			}
			else if( classCode.equals( "a869" ) ) {
				newInstance = schema.getFactoryUInt64Type().newBuff();
			}
			else if( classCode.equals( "a888" ) ) {
				newInstance = schema.getFactoryUInt64Col().newBuff();
			}
			else if( classCode.equals( "a86a" ) ) {
				newInstance = schema.getFactoryUuidDef().newBuff();
			}
			else if( classCode.equals( "a86c" ) ) {
				newInstance = schema.getFactoryUuidType().newBuff();
			}
			else if( classCode.equals( "a88b" ) ) {
				newInstance = schema.getFactoryUuidGen().newBuff();
			}
			else if( classCode.equals( "a889" ) ) {
				newInstance = schema.getFactoryUuidCol().newBuff();
			}
			else if( classCode.equals( "a86b" ) ) {
				newInstance = schema.getFactoryUuid6Def().newBuff();
			}
			else if( classCode.equals( "a86d" ) ) {
				newInstance = schema.getFactoryUuid6Type().newBuff();
			}
			else if( classCode.equals( "a88c" ) ) {
				newInstance = schema.getFactoryUuid6Gen().newBuff();
			}
			else if( classCode.equals( "a88a" ) ) {
				newInstance = schema.getFactoryUuid6Col().newBuff();
			}
			else if( classCode.equals( "a85b" ) ) {
				newInstance = schema.getFactoryTableCol().newBuff();
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
			if( classCode.equals( "a80c" ) ) {
				schema.getTableValue().updateValue( Authorization, editGrandprev );
			}
			else if( classCode.equals( "a80d" ) ) {
				schema.getTableAtom().updateAtom( Authorization, (YCFBamAtomBuff)editGrandprev );
			}
			else if( classCode.equals( "a80e" ) ) {
				schema.getTableBlobDef().updateBlobDef( Authorization, (YCFBamBlobDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a80f" ) ) {
				schema.getTableBlobType().updateBlobType( Authorization, (YCFBamBlobTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a86e" ) ) {
				schema.getTableBlobCol().updateBlobCol( Authorization, (YCFBamBlobColBuff)editGrandprev );
			}
			else if( classCode.equals( "a810" ) ) {
				schema.getTableBoolDef().updateBoolDef( Authorization, (YCFBamBoolDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a811" ) ) {
				schema.getTableBoolType().updateBoolType( Authorization, (YCFBamBoolTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a86f" ) ) {
				schema.getTableBoolCol().updateBoolCol( Authorization, (YCFBamBoolColBuff)editGrandprev );
			}
			else if( classCode.equals( "a818" ) ) {
				schema.getTableDateDef().updateDateDef( Authorization, (YCFBamDateDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a819" ) ) {
				schema.getTableDateType().updateDateType( Authorization, (YCFBamDateTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a870" ) ) {
				schema.getTableDateCol().updateDateCol( Authorization, (YCFBamDateColBuff)editGrandprev );
			}
			else if( classCode.equals( "a81f" ) ) {
				schema.getTableDoubleDef().updateDoubleDef( Authorization, (YCFBamDoubleDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a820" ) ) {
				schema.getTableDoubleType().updateDoubleType( Authorization, (YCFBamDoubleTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a871" ) ) {
				schema.getTableDoubleCol().updateDoubleCol( Authorization, (YCFBamDoubleColBuff)editGrandprev );
			}
			else if( classCode.equals( "a822" ) ) {
				schema.getTableFloatDef().updateFloatDef( Authorization, (YCFBamFloatDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a823" ) ) {
				schema.getTableFloatType().updateFloatType( Authorization, (YCFBamFloatTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a874" ) ) {
				schema.getTableFloatCol().updateFloatCol( Authorization, (YCFBamFloatColBuff)editGrandprev );
			}
			else if( classCode.equals( "a826" ) ) {
				schema.getTableInt16Def().updateInt16Def( Authorization, (YCFBamInt16DefBuff)editGrandprev );
			}
			else if( classCode.equals( "a827" ) ) {
				schema.getTableInt16Type().updateInt16Type( Authorization, (YCFBamInt16TypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a875" ) ) {
				schema.getTableId16Gen().updateId16Gen( Authorization, (YCFBamId16GenBuff)editGrandprev );
			}
			else if( classCode.equals( "a872" ) ) {
				schema.getTableEnumDef().updateEnumDef( Authorization, (YCFBamEnumDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a873" ) ) {
				schema.getTableEnumType().updateEnumType( Authorization, (YCFBamEnumTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a878" ) ) {
				schema.getTableInt16Col().updateInt16Col( Authorization, (YCFBamInt16ColBuff)editGrandprev );
			}
			else if( classCode.equals( "a828" ) ) {
				schema.getTableInt32Def().updateInt32Def( Authorization, (YCFBamInt32DefBuff)editGrandprev );
			}
			else if( classCode.equals( "a829" ) ) {
				schema.getTableInt32Type().updateInt32Type( Authorization, (YCFBamInt32TypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a876" ) ) {
				schema.getTableId32Gen().updateId32Gen( Authorization, (YCFBamId32GenBuff)editGrandprev );
			}
			else if( classCode.equals( "a879" ) ) {
				schema.getTableInt32Col().updateInt32Col( Authorization, (YCFBamInt32ColBuff)editGrandprev );
			}
			else if( classCode.equals( "a82a" ) ) {
				schema.getTableInt64Def().updateInt64Def( Authorization, (YCFBamInt64DefBuff)editGrandprev );
			}
			else if( classCode.equals( "a82b" ) ) {
				schema.getTableInt64Type().updateInt64Type( Authorization, (YCFBamInt64TypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a877" ) ) {
				schema.getTableId64Gen().updateId64Gen( Authorization, (YCFBamId64GenBuff)editGrandprev );
			}
			else if( classCode.equals( "a87a" ) ) {
				schema.getTableInt64Col().updateInt64Col( Authorization, (YCFBamInt64ColBuff)editGrandprev );
			}
			else if( classCode.equals( "a82c" ) ) {
				schema.getTableNmTokenDef().updateNmTokenDef( Authorization, (YCFBamNmTokenDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a82d" ) ) {
				schema.getTableNmTokenType().updateNmTokenType( Authorization, (YCFBamNmTokenTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a87b" ) ) {
				schema.getTableNmTokenCol().updateNmTokenCol( Authorization, (YCFBamNmTokenColBuff)editGrandprev );
			}
			else if( classCode.equals( "a82e" ) ) {
				schema.getTableNmTokensDef().updateNmTokensDef( Authorization, (YCFBamNmTokensDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a82f" ) ) {
				schema.getTableNmTokensType().updateNmTokensType( Authorization, (YCFBamNmTokensTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a87c" ) ) {
				schema.getTableNmTokensCol().updateNmTokensCol( Authorization, (YCFBamNmTokensColBuff)editGrandprev );
			}
			else if( classCode.equals( "a830" ) ) {
				schema.getTableNumberDef().updateNumberDef( Authorization, (YCFBamNumberDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a831" ) ) {
				schema.getTableNumberType().updateNumberType( Authorization, (YCFBamNumberTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a87d" ) ) {
				schema.getTableNumberCol().updateNumberCol( Authorization, (YCFBamNumberColBuff)editGrandprev );
			}
			else if( classCode.equals( "a83b" ) ) {
				schema.getTableDbKeyHash128Def().updateDbKeyHash128Def( Authorization, (YCFBamDbKeyHash128DefBuff)editGrandprev );
			}
			else if( classCode.equals( "a83c" ) ) {
				schema.getTableDbKeyHash128Col().updateDbKeyHash128Col( Authorization, (YCFBamDbKeyHash128ColBuff)editGrandprev );
			}
			else if( classCode.equals( "a83d" ) ) {
				schema.getTableDbKeyHash128Type().updateDbKeyHash128Type( Authorization, (YCFBamDbKeyHash128TypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a83e" ) ) {
				schema.getTableDbKeyHash128Gen().updateDbKeyHash128Gen( Authorization, (YCFBamDbKeyHash128GenBuff)editGrandprev );
			}
			else if( classCode.equals( "a83f" ) ) {
				schema.getTableDbKeyHash160Def().updateDbKeyHash160Def( Authorization, (YCFBamDbKeyHash160DefBuff)editGrandprev );
			}
			else if( classCode.equals( "a840" ) ) {
				schema.getTableDbKeyHash160Col().updateDbKeyHash160Col( Authorization, (YCFBamDbKeyHash160ColBuff)editGrandprev );
			}
			else if( classCode.equals( "a841" ) ) {
				schema.getTableDbKeyHash160Type().updateDbKeyHash160Type( Authorization, (YCFBamDbKeyHash160TypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a842" ) ) {
				schema.getTableDbKeyHash160Gen().updateDbKeyHash160Gen( Authorization, (YCFBamDbKeyHash160GenBuff)editGrandprev );
			}
			else if( classCode.equals( "a843" ) ) {
				schema.getTableDbKeyHash224Def().updateDbKeyHash224Def( Authorization, (YCFBamDbKeyHash224DefBuff)editGrandprev );
			}
			else if( classCode.equals( "a844" ) ) {
				schema.getTableDbKeyHash224Col().updateDbKeyHash224Col( Authorization, (YCFBamDbKeyHash224ColBuff)editGrandprev );
			}
			else if( classCode.equals( "a845" ) ) {
				schema.getTableDbKeyHash224Type().updateDbKeyHash224Type( Authorization, (YCFBamDbKeyHash224TypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a846" ) ) {
				schema.getTableDbKeyHash224Gen().updateDbKeyHash224Gen( Authorization, (YCFBamDbKeyHash224GenBuff)editGrandprev );
			}
			else if( classCode.equals( "a847" ) ) {
				schema.getTableDbKeyHash256Def().updateDbKeyHash256Def( Authorization, (YCFBamDbKeyHash256DefBuff)editGrandprev );
			}
			else if( classCode.equals( "a848" ) ) {
				schema.getTableDbKeyHash256Col().updateDbKeyHash256Col( Authorization, (YCFBamDbKeyHash256ColBuff)editGrandprev );
			}
			else if( classCode.equals( "a849" ) ) {
				schema.getTableDbKeyHash256Type().updateDbKeyHash256Type( Authorization, (YCFBamDbKeyHash256TypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a84a" ) ) {
				schema.getTableDbKeyHash256Gen().updateDbKeyHash256Gen( Authorization, (YCFBamDbKeyHash256GenBuff)editGrandprev );
			}
			else if( classCode.equals( "a84b" ) ) {
				schema.getTableDbKeyHash384Def().updateDbKeyHash384Def( Authorization, (YCFBamDbKeyHash384DefBuff)editGrandprev );
			}
			else if( classCode.equals( "a84c" ) ) {
				schema.getTableDbKeyHash384Col().updateDbKeyHash384Col( Authorization, (YCFBamDbKeyHash384ColBuff)editGrandprev );
			}
			else if( classCode.equals( "a84d" ) ) {
				schema.getTableDbKeyHash384Type().updateDbKeyHash384Type( Authorization, (YCFBamDbKeyHash384TypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a84e" ) ) {
				schema.getTableDbKeyHash384Gen().updateDbKeyHash384Gen( Authorization, (YCFBamDbKeyHash384GenBuff)editGrandprev );
			}
			else if( classCode.equals( "a84f" ) ) {
				schema.getTableDbKeyHash512Def().updateDbKeyHash512Def( Authorization, (YCFBamDbKeyHash512DefBuff)editGrandprev );
			}
			else if( classCode.equals( "a850" ) ) {
				schema.getTableDbKeyHash512Col().updateDbKeyHash512Col( Authorization, (YCFBamDbKeyHash512ColBuff)editGrandprev );
			}
			else if( classCode.equals( "a851" ) ) {
				schema.getTableDbKeyHash512Type().updateDbKeyHash512Type( Authorization, (YCFBamDbKeyHash512TypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a852" ) ) {
				schema.getTableDbKeyHash512Gen().updateDbKeyHash512Gen( Authorization, (YCFBamDbKeyHash512GenBuff)editGrandprev );
			}
			else if( classCode.equals( "a853" ) ) {
				schema.getTableStringDef().updateStringDef( Authorization, (YCFBamStringDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a854" ) ) {
				schema.getTableStringType().updateStringType( Authorization, (YCFBamStringTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a87e" ) ) {
				schema.getTableStringCol().updateStringCol( Authorization, (YCFBamStringColBuff)editGrandprev );
			}
			else if( classCode.equals( "a855" ) ) {
				schema.getTableTZDateDef().updateTZDateDef( Authorization, (YCFBamTZDateDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a856" ) ) {
				schema.getTableTZDateType().updateTZDateType( Authorization, (YCFBamTZDateTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a87f" ) ) {
				schema.getTableTZDateCol().updateTZDateCol( Authorization, (YCFBamTZDateColBuff)editGrandprev );
			}
			else if( classCode.equals( "a857" ) ) {
				schema.getTableTZTimeDef().updateTZTimeDef( Authorization, (YCFBamTZTimeDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a858" ) ) {
				schema.getTableTZTimeType().updateTZTimeType( Authorization, (YCFBamTZTimeTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a880" ) ) {
				schema.getTableTZTimeCol().updateTZTimeCol( Authorization, (YCFBamTZTimeColBuff)editGrandprev );
			}
			else if( classCode.equals( "a859" ) ) {
				schema.getTableTZTimestampDef().updateTZTimestampDef( Authorization, (YCFBamTZTimestampDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a85a" ) ) {
				schema.getTableTZTimestampType().updateTZTimestampType( Authorization, (YCFBamTZTimestampTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a881" ) ) {
				schema.getTableTZTimestampCol().updateTZTimestampCol( Authorization, (YCFBamTZTimestampColBuff)editGrandprev );
			}
			else if( classCode.equals( "a85c" ) ) {
				schema.getTableTextDef().updateTextDef( Authorization, (YCFBamTextDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a85d" ) ) {
				schema.getTableTextType().updateTextType( Authorization, (YCFBamTextTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a882" ) ) {
				schema.getTableTextCol().updateTextCol( Authorization, (YCFBamTextColBuff)editGrandprev );
			}
			else if( classCode.equals( "a85e" ) ) {
				schema.getTableTimeDef().updateTimeDef( Authorization, (YCFBamTimeDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a85f" ) ) {
				schema.getTableTimeType().updateTimeType( Authorization, (YCFBamTimeTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a883" ) ) {
				schema.getTableTimeCol().updateTimeCol( Authorization, (YCFBamTimeColBuff)editGrandprev );
			}
			else if( classCode.equals( "a860" ) ) {
				schema.getTableTimestampDef().updateTimestampDef( Authorization, (YCFBamTimestampDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a861" ) ) {
				schema.getTableTimestampType().updateTimestampType( Authorization, (YCFBamTimestampTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a884" ) ) {
				schema.getTableTimestampCol().updateTimestampCol( Authorization, (YCFBamTimestampColBuff)editGrandprev );
			}
			else if( classCode.equals( "a862" ) ) {
				schema.getTableTokenDef().updateTokenDef( Authorization, (YCFBamTokenDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a863" ) ) {
				schema.getTableTokenType().updateTokenType( Authorization, (YCFBamTokenTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a885" ) ) {
				schema.getTableTokenCol().updateTokenCol( Authorization, (YCFBamTokenColBuff)editGrandprev );
			}
			else if( classCode.equals( "a864" ) ) {
				schema.getTableUInt16Def().updateUInt16Def( Authorization, (YCFBamUInt16DefBuff)editGrandprev );
			}
			else if( classCode.equals( "a865" ) ) {
				schema.getTableUInt16Type().updateUInt16Type( Authorization, (YCFBamUInt16TypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a886" ) ) {
				schema.getTableUInt16Col().updateUInt16Col( Authorization, (YCFBamUInt16ColBuff)editGrandprev );
			}
			else if( classCode.equals( "a866" ) ) {
				schema.getTableUInt32Def().updateUInt32Def( Authorization, (YCFBamUInt32DefBuff)editGrandprev );
			}
			else if( classCode.equals( "a867" ) ) {
				schema.getTableUInt32Type().updateUInt32Type( Authorization, (YCFBamUInt32TypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a887" ) ) {
				schema.getTableUInt32Col().updateUInt32Col( Authorization, (YCFBamUInt32ColBuff)editGrandprev );
			}
			else if( classCode.equals( "a868" ) ) {
				schema.getTableUInt64Def().updateUInt64Def( Authorization, (YCFBamUInt64DefBuff)editGrandprev );
			}
			else if( classCode.equals( "a869" ) ) {
				schema.getTableUInt64Type().updateUInt64Type( Authorization, (YCFBamUInt64TypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a888" ) ) {
				schema.getTableUInt64Col().updateUInt64Col( Authorization, (YCFBamUInt64ColBuff)editGrandprev );
			}
			else if( classCode.equals( "a86a" ) ) {
				schema.getTableUuidDef().updateUuidDef( Authorization, (YCFBamUuidDefBuff)editGrandprev );
			}
			else if( classCode.equals( "a86c" ) ) {
				schema.getTableUuidType().updateUuidType( Authorization, (YCFBamUuidTypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a88b" ) ) {
				schema.getTableUuidGen().updateUuidGen( Authorization, (YCFBamUuidGenBuff)editGrandprev );
			}
			else if( classCode.equals( "a889" ) ) {
				schema.getTableUuidCol().updateUuidCol( Authorization, (YCFBamUuidColBuff)editGrandprev );
			}
			else if( classCode.equals( "a86b" ) ) {
				schema.getTableUuid6Def().updateUuid6Def( Authorization, (YCFBamUuid6DefBuff)editGrandprev );
			}
			else if( classCode.equals( "a86d" ) ) {
				schema.getTableUuid6Type().updateUuid6Type( Authorization, (YCFBamUuid6TypeBuff)editGrandprev );
			}
			else if( classCode.equals( "a88c" ) ) {
				schema.getTableUuid6Gen().updateUuid6Gen( Authorization, (YCFBamUuid6GenBuff)editGrandprev );
			}
			else if( classCode.equals( "a88a" ) ) {
				schema.getTableUuid6Col().updateUuid6Col( Authorization, (YCFBamUuid6ColBuff)editGrandprev );
			}
			else if( classCode.equals( "a85b" ) ) {
				schema.getTableTableCol().updateTableCol( Authorization, (YCFBamTableColBuff)editGrandprev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		classCode = editPrev.getClassCode();
			if( classCode.equals( "a80c" ) ) {
				schema.getTableValue().updateValue( Authorization, editPrev );
			}
			else if( classCode.equals( "a80d" ) ) {
				schema.getTableAtom().updateAtom( Authorization, (YCFBamAtomBuff)editPrev );
			}
			else if( classCode.equals( "a80e" ) ) {
				schema.getTableBlobDef().updateBlobDef( Authorization, (YCFBamBlobDefBuff)editPrev );
			}
			else if( classCode.equals( "a80f" ) ) {
				schema.getTableBlobType().updateBlobType( Authorization, (YCFBamBlobTypeBuff)editPrev );
			}
			else if( classCode.equals( "a86e" ) ) {
				schema.getTableBlobCol().updateBlobCol( Authorization, (YCFBamBlobColBuff)editPrev );
			}
			else if( classCode.equals( "a810" ) ) {
				schema.getTableBoolDef().updateBoolDef( Authorization, (YCFBamBoolDefBuff)editPrev );
			}
			else if( classCode.equals( "a811" ) ) {
				schema.getTableBoolType().updateBoolType( Authorization, (YCFBamBoolTypeBuff)editPrev );
			}
			else if( classCode.equals( "a86f" ) ) {
				schema.getTableBoolCol().updateBoolCol( Authorization, (YCFBamBoolColBuff)editPrev );
			}
			else if( classCode.equals( "a818" ) ) {
				schema.getTableDateDef().updateDateDef( Authorization, (YCFBamDateDefBuff)editPrev );
			}
			else if( classCode.equals( "a819" ) ) {
				schema.getTableDateType().updateDateType( Authorization, (YCFBamDateTypeBuff)editPrev );
			}
			else if( classCode.equals( "a870" ) ) {
				schema.getTableDateCol().updateDateCol( Authorization, (YCFBamDateColBuff)editPrev );
			}
			else if( classCode.equals( "a81f" ) ) {
				schema.getTableDoubleDef().updateDoubleDef( Authorization, (YCFBamDoubleDefBuff)editPrev );
			}
			else if( classCode.equals( "a820" ) ) {
				schema.getTableDoubleType().updateDoubleType( Authorization, (YCFBamDoubleTypeBuff)editPrev );
			}
			else if( classCode.equals( "a871" ) ) {
				schema.getTableDoubleCol().updateDoubleCol( Authorization, (YCFBamDoubleColBuff)editPrev );
			}
			else if( classCode.equals( "a822" ) ) {
				schema.getTableFloatDef().updateFloatDef( Authorization, (YCFBamFloatDefBuff)editPrev );
			}
			else if( classCode.equals( "a823" ) ) {
				schema.getTableFloatType().updateFloatType( Authorization, (YCFBamFloatTypeBuff)editPrev );
			}
			else if( classCode.equals( "a874" ) ) {
				schema.getTableFloatCol().updateFloatCol( Authorization, (YCFBamFloatColBuff)editPrev );
			}
			else if( classCode.equals( "a826" ) ) {
				schema.getTableInt16Def().updateInt16Def( Authorization, (YCFBamInt16DefBuff)editPrev );
			}
			else if( classCode.equals( "a827" ) ) {
				schema.getTableInt16Type().updateInt16Type( Authorization, (YCFBamInt16TypeBuff)editPrev );
			}
			else if( classCode.equals( "a875" ) ) {
				schema.getTableId16Gen().updateId16Gen( Authorization, (YCFBamId16GenBuff)editPrev );
			}
			else if( classCode.equals( "a872" ) ) {
				schema.getTableEnumDef().updateEnumDef( Authorization, (YCFBamEnumDefBuff)editPrev );
			}
			else if( classCode.equals( "a873" ) ) {
				schema.getTableEnumType().updateEnumType( Authorization, (YCFBamEnumTypeBuff)editPrev );
			}
			else if( classCode.equals( "a878" ) ) {
				schema.getTableInt16Col().updateInt16Col( Authorization, (YCFBamInt16ColBuff)editPrev );
			}
			else if( classCode.equals( "a828" ) ) {
				schema.getTableInt32Def().updateInt32Def( Authorization, (YCFBamInt32DefBuff)editPrev );
			}
			else if( classCode.equals( "a829" ) ) {
				schema.getTableInt32Type().updateInt32Type( Authorization, (YCFBamInt32TypeBuff)editPrev );
			}
			else if( classCode.equals( "a876" ) ) {
				schema.getTableId32Gen().updateId32Gen( Authorization, (YCFBamId32GenBuff)editPrev );
			}
			else if( classCode.equals( "a879" ) ) {
				schema.getTableInt32Col().updateInt32Col( Authorization, (YCFBamInt32ColBuff)editPrev );
			}
			else if( classCode.equals( "a82a" ) ) {
				schema.getTableInt64Def().updateInt64Def( Authorization, (YCFBamInt64DefBuff)editPrev );
			}
			else if( classCode.equals( "a82b" ) ) {
				schema.getTableInt64Type().updateInt64Type( Authorization, (YCFBamInt64TypeBuff)editPrev );
			}
			else if( classCode.equals( "a877" ) ) {
				schema.getTableId64Gen().updateId64Gen( Authorization, (YCFBamId64GenBuff)editPrev );
			}
			else if( classCode.equals( "a87a" ) ) {
				schema.getTableInt64Col().updateInt64Col( Authorization, (YCFBamInt64ColBuff)editPrev );
			}
			else if( classCode.equals( "a82c" ) ) {
				schema.getTableNmTokenDef().updateNmTokenDef( Authorization, (YCFBamNmTokenDefBuff)editPrev );
			}
			else if( classCode.equals( "a82d" ) ) {
				schema.getTableNmTokenType().updateNmTokenType( Authorization, (YCFBamNmTokenTypeBuff)editPrev );
			}
			else if( classCode.equals( "a87b" ) ) {
				schema.getTableNmTokenCol().updateNmTokenCol( Authorization, (YCFBamNmTokenColBuff)editPrev );
			}
			else if( classCode.equals( "a82e" ) ) {
				schema.getTableNmTokensDef().updateNmTokensDef( Authorization, (YCFBamNmTokensDefBuff)editPrev );
			}
			else if( classCode.equals( "a82f" ) ) {
				schema.getTableNmTokensType().updateNmTokensType( Authorization, (YCFBamNmTokensTypeBuff)editPrev );
			}
			else if( classCode.equals( "a87c" ) ) {
				schema.getTableNmTokensCol().updateNmTokensCol( Authorization, (YCFBamNmTokensColBuff)editPrev );
			}
			else if( classCode.equals( "a830" ) ) {
				schema.getTableNumberDef().updateNumberDef( Authorization, (YCFBamNumberDefBuff)editPrev );
			}
			else if( classCode.equals( "a831" ) ) {
				schema.getTableNumberType().updateNumberType( Authorization, (YCFBamNumberTypeBuff)editPrev );
			}
			else if( classCode.equals( "a87d" ) ) {
				schema.getTableNumberCol().updateNumberCol( Authorization, (YCFBamNumberColBuff)editPrev );
			}
			else if( classCode.equals( "a83b" ) ) {
				schema.getTableDbKeyHash128Def().updateDbKeyHash128Def( Authorization, (YCFBamDbKeyHash128DefBuff)editPrev );
			}
			else if( classCode.equals( "a83c" ) ) {
				schema.getTableDbKeyHash128Col().updateDbKeyHash128Col( Authorization, (YCFBamDbKeyHash128ColBuff)editPrev );
			}
			else if( classCode.equals( "a83d" ) ) {
				schema.getTableDbKeyHash128Type().updateDbKeyHash128Type( Authorization, (YCFBamDbKeyHash128TypeBuff)editPrev );
			}
			else if( classCode.equals( "a83e" ) ) {
				schema.getTableDbKeyHash128Gen().updateDbKeyHash128Gen( Authorization, (YCFBamDbKeyHash128GenBuff)editPrev );
			}
			else if( classCode.equals( "a83f" ) ) {
				schema.getTableDbKeyHash160Def().updateDbKeyHash160Def( Authorization, (YCFBamDbKeyHash160DefBuff)editPrev );
			}
			else if( classCode.equals( "a840" ) ) {
				schema.getTableDbKeyHash160Col().updateDbKeyHash160Col( Authorization, (YCFBamDbKeyHash160ColBuff)editPrev );
			}
			else if( classCode.equals( "a841" ) ) {
				schema.getTableDbKeyHash160Type().updateDbKeyHash160Type( Authorization, (YCFBamDbKeyHash160TypeBuff)editPrev );
			}
			else if( classCode.equals( "a842" ) ) {
				schema.getTableDbKeyHash160Gen().updateDbKeyHash160Gen( Authorization, (YCFBamDbKeyHash160GenBuff)editPrev );
			}
			else if( classCode.equals( "a843" ) ) {
				schema.getTableDbKeyHash224Def().updateDbKeyHash224Def( Authorization, (YCFBamDbKeyHash224DefBuff)editPrev );
			}
			else if( classCode.equals( "a844" ) ) {
				schema.getTableDbKeyHash224Col().updateDbKeyHash224Col( Authorization, (YCFBamDbKeyHash224ColBuff)editPrev );
			}
			else if( classCode.equals( "a845" ) ) {
				schema.getTableDbKeyHash224Type().updateDbKeyHash224Type( Authorization, (YCFBamDbKeyHash224TypeBuff)editPrev );
			}
			else if( classCode.equals( "a846" ) ) {
				schema.getTableDbKeyHash224Gen().updateDbKeyHash224Gen( Authorization, (YCFBamDbKeyHash224GenBuff)editPrev );
			}
			else if( classCode.equals( "a847" ) ) {
				schema.getTableDbKeyHash256Def().updateDbKeyHash256Def( Authorization, (YCFBamDbKeyHash256DefBuff)editPrev );
			}
			else if( classCode.equals( "a848" ) ) {
				schema.getTableDbKeyHash256Col().updateDbKeyHash256Col( Authorization, (YCFBamDbKeyHash256ColBuff)editPrev );
			}
			else if( classCode.equals( "a849" ) ) {
				schema.getTableDbKeyHash256Type().updateDbKeyHash256Type( Authorization, (YCFBamDbKeyHash256TypeBuff)editPrev );
			}
			else if( classCode.equals( "a84a" ) ) {
				schema.getTableDbKeyHash256Gen().updateDbKeyHash256Gen( Authorization, (YCFBamDbKeyHash256GenBuff)editPrev );
			}
			else if( classCode.equals( "a84b" ) ) {
				schema.getTableDbKeyHash384Def().updateDbKeyHash384Def( Authorization, (YCFBamDbKeyHash384DefBuff)editPrev );
			}
			else if( classCode.equals( "a84c" ) ) {
				schema.getTableDbKeyHash384Col().updateDbKeyHash384Col( Authorization, (YCFBamDbKeyHash384ColBuff)editPrev );
			}
			else if( classCode.equals( "a84d" ) ) {
				schema.getTableDbKeyHash384Type().updateDbKeyHash384Type( Authorization, (YCFBamDbKeyHash384TypeBuff)editPrev );
			}
			else if( classCode.equals( "a84e" ) ) {
				schema.getTableDbKeyHash384Gen().updateDbKeyHash384Gen( Authorization, (YCFBamDbKeyHash384GenBuff)editPrev );
			}
			else if( classCode.equals( "a84f" ) ) {
				schema.getTableDbKeyHash512Def().updateDbKeyHash512Def( Authorization, (YCFBamDbKeyHash512DefBuff)editPrev );
			}
			else if( classCode.equals( "a850" ) ) {
				schema.getTableDbKeyHash512Col().updateDbKeyHash512Col( Authorization, (YCFBamDbKeyHash512ColBuff)editPrev );
			}
			else if( classCode.equals( "a851" ) ) {
				schema.getTableDbKeyHash512Type().updateDbKeyHash512Type( Authorization, (YCFBamDbKeyHash512TypeBuff)editPrev );
			}
			else if( classCode.equals( "a852" ) ) {
				schema.getTableDbKeyHash512Gen().updateDbKeyHash512Gen( Authorization, (YCFBamDbKeyHash512GenBuff)editPrev );
			}
			else if( classCode.equals( "a853" ) ) {
				schema.getTableStringDef().updateStringDef( Authorization, (YCFBamStringDefBuff)editPrev );
			}
			else if( classCode.equals( "a854" ) ) {
				schema.getTableStringType().updateStringType( Authorization, (YCFBamStringTypeBuff)editPrev );
			}
			else if( classCode.equals( "a87e" ) ) {
				schema.getTableStringCol().updateStringCol( Authorization, (YCFBamStringColBuff)editPrev );
			}
			else if( classCode.equals( "a855" ) ) {
				schema.getTableTZDateDef().updateTZDateDef( Authorization, (YCFBamTZDateDefBuff)editPrev );
			}
			else if( classCode.equals( "a856" ) ) {
				schema.getTableTZDateType().updateTZDateType( Authorization, (YCFBamTZDateTypeBuff)editPrev );
			}
			else if( classCode.equals( "a87f" ) ) {
				schema.getTableTZDateCol().updateTZDateCol( Authorization, (YCFBamTZDateColBuff)editPrev );
			}
			else if( classCode.equals( "a857" ) ) {
				schema.getTableTZTimeDef().updateTZTimeDef( Authorization, (YCFBamTZTimeDefBuff)editPrev );
			}
			else if( classCode.equals( "a858" ) ) {
				schema.getTableTZTimeType().updateTZTimeType( Authorization, (YCFBamTZTimeTypeBuff)editPrev );
			}
			else if( classCode.equals( "a880" ) ) {
				schema.getTableTZTimeCol().updateTZTimeCol( Authorization, (YCFBamTZTimeColBuff)editPrev );
			}
			else if( classCode.equals( "a859" ) ) {
				schema.getTableTZTimestampDef().updateTZTimestampDef( Authorization, (YCFBamTZTimestampDefBuff)editPrev );
			}
			else if( classCode.equals( "a85a" ) ) {
				schema.getTableTZTimestampType().updateTZTimestampType( Authorization, (YCFBamTZTimestampTypeBuff)editPrev );
			}
			else if( classCode.equals( "a881" ) ) {
				schema.getTableTZTimestampCol().updateTZTimestampCol( Authorization, (YCFBamTZTimestampColBuff)editPrev );
			}
			else if( classCode.equals( "a85c" ) ) {
				schema.getTableTextDef().updateTextDef( Authorization, (YCFBamTextDefBuff)editPrev );
			}
			else if( classCode.equals( "a85d" ) ) {
				schema.getTableTextType().updateTextType( Authorization, (YCFBamTextTypeBuff)editPrev );
			}
			else if( classCode.equals( "a882" ) ) {
				schema.getTableTextCol().updateTextCol( Authorization, (YCFBamTextColBuff)editPrev );
			}
			else if( classCode.equals( "a85e" ) ) {
				schema.getTableTimeDef().updateTimeDef( Authorization, (YCFBamTimeDefBuff)editPrev );
			}
			else if( classCode.equals( "a85f" ) ) {
				schema.getTableTimeType().updateTimeType( Authorization, (YCFBamTimeTypeBuff)editPrev );
			}
			else if( classCode.equals( "a883" ) ) {
				schema.getTableTimeCol().updateTimeCol( Authorization, (YCFBamTimeColBuff)editPrev );
			}
			else if( classCode.equals( "a860" ) ) {
				schema.getTableTimestampDef().updateTimestampDef( Authorization, (YCFBamTimestampDefBuff)editPrev );
			}
			else if( classCode.equals( "a861" ) ) {
				schema.getTableTimestampType().updateTimestampType( Authorization, (YCFBamTimestampTypeBuff)editPrev );
			}
			else if( classCode.equals( "a884" ) ) {
				schema.getTableTimestampCol().updateTimestampCol( Authorization, (YCFBamTimestampColBuff)editPrev );
			}
			else if( classCode.equals( "a862" ) ) {
				schema.getTableTokenDef().updateTokenDef( Authorization, (YCFBamTokenDefBuff)editPrev );
			}
			else if( classCode.equals( "a863" ) ) {
				schema.getTableTokenType().updateTokenType( Authorization, (YCFBamTokenTypeBuff)editPrev );
			}
			else if( classCode.equals( "a885" ) ) {
				schema.getTableTokenCol().updateTokenCol( Authorization, (YCFBamTokenColBuff)editPrev );
			}
			else if( classCode.equals( "a864" ) ) {
				schema.getTableUInt16Def().updateUInt16Def( Authorization, (YCFBamUInt16DefBuff)editPrev );
			}
			else if( classCode.equals( "a865" ) ) {
				schema.getTableUInt16Type().updateUInt16Type( Authorization, (YCFBamUInt16TypeBuff)editPrev );
			}
			else if( classCode.equals( "a886" ) ) {
				schema.getTableUInt16Col().updateUInt16Col( Authorization, (YCFBamUInt16ColBuff)editPrev );
			}
			else if( classCode.equals( "a866" ) ) {
				schema.getTableUInt32Def().updateUInt32Def( Authorization, (YCFBamUInt32DefBuff)editPrev );
			}
			else if( classCode.equals( "a867" ) ) {
				schema.getTableUInt32Type().updateUInt32Type( Authorization, (YCFBamUInt32TypeBuff)editPrev );
			}
			else if( classCode.equals( "a887" ) ) {
				schema.getTableUInt32Col().updateUInt32Col( Authorization, (YCFBamUInt32ColBuff)editPrev );
			}
			else if( classCode.equals( "a868" ) ) {
				schema.getTableUInt64Def().updateUInt64Def( Authorization, (YCFBamUInt64DefBuff)editPrev );
			}
			else if( classCode.equals( "a869" ) ) {
				schema.getTableUInt64Type().updateUInt64Type( Authorization, (YCFBamUInt64TypeBuff)editPrev );
			}
			else if( classCode.equals( "a888" ) ) {
				schema.getTableUInt64Col().updateUInt64Col( Authorization, (YCFBamUInt64ColBuff)editPrev );
			}
			else if( classCode.equals( "a86a" ) ) {
				schema.getTableUuidDef().updateUuidDef( Authorization, (YCFBamUuidDefBuff)editPrev );
			}
			else if( classCode.equals( "a86c" ) ) {
				schema.getTableUuidType().updateUuidType( Authorization, (YCFBamUuidTypeBuff)editPrev );
			}
			else if( classCode.equals( "a88b" ) ) {
				schema.getTableUuidGen().updateUuidGen( Authorization, (YCFBamUuidGenBuff)editPrev );
			}
			else if( classCode.equals( "a889" ) ) {
				schema.getTableUuidCol().updateUuidCol( Authorization, (YCFBamUuidColBuff)editPrev );
			}
			else if( classCode.equals( "a86b" ) ) {
				schema.getTableUuid6Def().updateUuid6Def( Authorization, (YCFBamUuid6DefBuff)editPrev );
			}
			else if( classCode.equals( "a86d" ) ) {
				schema.getTableUuid6Type().updateUuid6Type( Authorization, (YCFBamUuid6TypeBuff)editPrev );
			}
			else if( classCode.equals( "a88c" ) ) {
				schema.getTableUuid6Gen().updateUuid6Gen( Authorization, (YCFBamUuid6GenBuff)editPrev );
			}
			else if( classCode.equals( "a88a" ) ) {
				schema.getTableUuid6Col().updateUuid6Col( Authorization, (YCFBamUuid6ColBuff)editPrev );
			}
			else if( classCode.equals( "a85b" ) ) {
				schema.getTableTableCol().updateTableCol( Authorization, (YCFBamTableColBuff)editPrev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		classCode = editCur.getClassCode();
			if( classCode.equals( "a80c" ) ) {
				schema.getTableValue().updateValue( Authorization, editCur );
			}
			else if( classCode.equals( "a80d" ) ) {
				schema.getTableAtom().updateAtom( Authorization, (YCFBamAtomBuff)editCur );
			}
			else if( classCode.equals( "a80e" ) ) {
				schema.getTableBlobDef().updateBlobDef( Authorization, (YCFBamBlobDefBuff)editCur );
			}
			else if( classCode.equals( "a80f" ) ) {
				schema.getTableBlobType().updateBlobType( Authorization, (YCFBamBlobTypeBuff)editCur );
			}
			else if( classCode.equals( "a86e" ) ) {
				schema.getTableBlobCol().updateBlobCol( Authorization, (YCFBamBlobColBuff)editCur );
			}
			else if( classCode.equals( "a810" ) ) {
				schema.getTableBoolDef().updateBoolDef( Authorization, (YCFBamBoolDefBuff)editCur );
			}
			else if( classCode.equals( "a811" ) ) {
				schema.getTableBoolType().updateBoolType( Authorization, (YCFBamBoolTypeBuff)editCur );
			}
			else if( classCode.equals( "a86f" ) ) {
				schema.getTableBoolCol().updateBoolCol( Authorization, (YCFBamBoolColBuff)editCur );
			}
			else if( classCode.equals( "a818" ) ) {
				schema.getTableDateDef().updateDateDef( Authorization, (YCFBamDateDefBuff)editCur );
			}
			else if( classCode.equals( "a819" ) ) {
				schema.getTableDateType().updateDateType( Authorization, (YCFBamDateTypeBuff)editCur );
			}
			else if( classCode.equals( "a870" ) ) {
				schema.getTableDateCol().updateDateCol( Authorization, (YCFBamDateColBuff)editCur );
			}
			else if( classCode.equals( "a81f" ) ) {
				schema.getTableDoubleDef().updateDoubleDef( Authorization, (YCFBamDoubleDefBuff)editCur );
			}
			else if( classCode.equals( "a820" ) ) {
				schema.getTableDoubleType().updateDoubleType( Authorization, (YCFBamDoubleTypeBuff)editCur );
			}
			else if( classCode.equals( "a871" ) ) {
				schema.getTableDoubleCol().updateDoubleCol( Authorization, (YCFBamDoubleColBuff)editCur );
			}
			else if( classCode.equals( "a822" ) ) {
				schema.getTableFloatDef().updateFloatDef( Authorization, (YCFBamFloatDefBuff)editCur );
			}
			else if( classCode.equals( "a823" ) ) {
				schema.getTableFloatType().updateFloatType( Authorization, (YCFBamFloatTypeBuff)editCur );
			}
			else if( classCode.equals( "a874" ) ) {
				schema.getTableFloatCol().updateFloatCol( Authorization, (YCFBamFloatColBuff)editCur );
			}
			else if( classCode.equals( "a826" ) ) {
				schema.getTableInt16Def().updateInt16Def( Authorization, (YCFBamInt16DefBuff)editCur );
			}
			else if( classCode.equals( "a827" ) ) {
				schema.getTableInt16Type().updateInt16Type( Authorization, (YCFBamInt16TypeBuff)editCur );
			}
			else if( classCode.equals( "a875" ) ) {
				schema.getTableId16Gen().updateId16Gen( Authorization, (YCFBamId16GenBuff)editCur );
			}
			else if( classCode.equals( "a872" ) ) {
				schema.getTableEnumDef().updateEnumDef( Authorization, (YCFBamEnumDefBuff)editCur );
			}
			else if( classCode.equals( "a873" ) ) {
				schema.getTableEnumType().updateEnumType( Authorization, (YCFBamEnumTypeBuff)editCur );
			}
			else if( classCode.equals( "a878" ) ) {
				schema.getTableInt16Col().updateInt16Col( Authorization, (YCFBamInt16ColBuff)editCur );
			}
			else if( classCode.equals( "a828" ) ) {
				schema.getTableInt32Def().updateInt32Def( Authorization, (YCFBamInt32DefBuff)editCur );
			}
			else if( classCode.equals( "a829" ) ) {
				schema.getTableInt32Type().updateInt32Type( Authorization, (YCFBamInt32TypeBuff)editCur );
			}
			else if( classCode.equals( "a876" ) ) {
				schema.getTableId32Gen().updateId32Gen( Authorization, (YCFBamId32GenBuff)editCur );
			}
			else if( classCode.equals( "a879" ) ) {
				schema.getTableInt32Col().updateInt32Col( Authorization, (YCFBamInt32ColBuff)editCur );
			}
			else if( classCode.equals( "a82a" ) ) {
				schema.getTableInt64Def().updateInt64Def( Authorization, (YCFBamInt64DefBuff)editCur );
			}
			else if( classCode.equals( "a82b" ) ) {
				schema.getTableInt64Type().updateInt64Type( Authorization, (YCFBamInt64TypeBuff)editCur );
			}
			else if( classCode.equals( "a877" ) ) {
				schema.getTableId64Gen().updateId64Gen( Authorization, (YCFBamId64GenBuff)editCur );
			}
			else if( classCode.equals( "a87a" ) ) {
				schema.getTableInt64Col().updateInt64Col( Authorization, (YCFBamInt64ColBuff)editCur );
			}
			else if( classCode.equals( "a82c" ) ) {
				schema.getTableNmTokenDef().updateNmTokenDef( Authorization, (YCFBamNmTokenDefBuff)editCur );
			}
			else if( classCode.equals( "a82d" ) ) {
				schema.getTableNmTokenType().updateNmTokenType( Authorization, (YCFBamNmTokenTypeBuff)editCur );
			}
			else if( classCode.equals( "a87b" ) ) {
				schema.getTableNmTokenCol().updateNmTokenCol( Authorization, (YCFBamNmTokenColBuff)editCur );
			}
			else if( classCode.equals( "a82e" ) ) {
				schema.getTableNmTokensDef().updateNmTokensDef( Authorization, (YCFBamNmTokensDefBuff)editCur );
			}
			else if( classCode.equals( "a82f" ) ) {
				schema.getTableNmTokensType().updateNmTokensType( Authorization, (YCFBamNmTokensTypeBuff)editCur );
			}
			else if( classCode.equals( "a87c" ) ) {
				schema.getTableNmTokensCol().updateNmTokensCol( Authorization, (YCFBamNmTokensColBuff)editCur );
			}
			else if( classCode.equals( "a830" ) ) {
				schema.getTableNumberDef().updateNumberDef( Authorization, (YCFBamNumberDefBuff)editCur );
			}
			else if( classCode.equals( "a831" ) ) {
				schema.getTableNumberType().updateNumberType( Authorization, (YCFBamNumberTypeBuff)editCur );
			}
			else if( classCode.equals( "a87d" ) ) {
				schema.getTableNumberCol().updateNumberCol( Authorization, (YCFBamNumberColBuff)editCur );
			}
			else if( classCode.equals( "a83b" ) ) {
				schema.getTableDbKeyHash128Def().updateDbKeyHash128Def( Authorization, (YCFBamDbKeyHash128DefBuff)editCur );
			}
			else if( classCode.equals( "a83c" ) ) {
				schema.getTableDbKeyHash128Col().updateDbKeyHash128Col( Authorization, (YCFBamDbKeyHash128ColBuff)editCur );
			}
			else if( classCode.equals( "a83d" ) ) {
				schema.getTableDbKeyHash128Type().updateDbKeyHash128Type( Authorization, (YCFBamDbKeyHash128TypeBuff)editCur );
			}
			else if( classCode.equals( "a83e" ) ) {
				schema.getTableDbKeyHash128Gen().updateDbKeyHash128Gen( Authorization, (YCFBamDbKeyHash128GenBuff)editCur );
			}
			else if( classCode.equals( "a83f" ) ) {
				schema.getTableDbKeyHash160Def().updateDbKeyHash160Def( Authorization, (YCFBamDbKeyHash160DefBuff)editCur );
			}
			else if( classCode.equals( "a840" ) ) {
				schema.getTableDbKeyHash160Col().updateDbKeyHash160Col( Authorization, (YCFBamDbKeyHash160ColBuff)editCur );
			}
			else if( classCode.equals( "a841" ) ) {
				schema.getTableDbKeyHash160Type().updateDbKeyHash160Type( Authorization, (YCFBamDbKeyHash160TypeBuff)editCur );
			}
			else if( classCode.equals( "a842" ) ) {
				schema.getTableDbKeyHash160Gen().updateDbKeyHash160Gen( Authorization, (YCFBamDbKeyHash160GenBuff)editCur );
			}
			else if( classCode.equals( "a843" ) ) {
				schema.getTableDbKeyHash224Def().updateDbKeyHash224Def( Authorization, (YCFBamDbKeyHash224DefBuff)editCur );
			}
			else if( classCode.equals( "a844" ) ) {
				schema.getTableDbKeyHash224Col().updateDbKeyHash224Col( Authorization, (YCFBamDbKeyHash224ColBuff)editCur );
			}
			else if( classCode.equals( "a845" ) ) {
				schema.getTableDbKeyHash224Type().updateDbKeyHash224Type( Authorization, (YCFBamDbKeyHash224TypeBuff)editCur );
			}
			else if( classCode.equals( "a846" ) ) {
				schema.getTableDbKeyHash224Gen().updateDbKeyHash224Gen( Authorization, (YCFBamDbKeyHash224GenBuff)editCur );
			}
			else if( classCode.equals( "a847" ) ) {
				schema.getTableDbKeyHash256Def().updateDbKeyHash256Def( Authorization, (YCFBamDbKeyHash256DefBuff)editCur );
			}
			else if( classCode.equals( "a848" ) ) {
				schema.getTableDbKeyHash256Col().updateDbKeyHash256Col( Authorization, (YCFBamDbKeyHash256ColBuff)editCur );
			}
			else if( classCode.equals( "a849" ) ) {
				schema.getTableDbKeyHash256Type().updateDbKeyHash256Type( Authorization, (YCFBamDbKeyHash256TypeBuff)editCur );
			}
			else if( classCode.equals( "a84a" ) ) {
				schema.getTableDbKeyHash256Gen().updateDbKeyHash256Gen( Authorization, (YCFBamDbKeyHash256GenBuff)editCur );
			}
			else if( classCode.equals( "a84b" ) ) {
				schema.getTableDbKeyHash384Def().updateDbKeyHash384Def( Authorization, (YCFBamDbKeyHash384DefBuff)editCur );
			}
			else if( classCode.equals( "a84c" ) ) {
				schema.getTableDbKeyHash384Col().updateDbKeyHash384Col( Authorization, (YCFBamDbKeyHash384ColBuff)editCur );
			}
			else if( classCode.equals( "a84d" ) ) {
				schema.getTableDbKeyHash384Type().updateDbKeyHash384Type( Authorization, (YCFBamDbKeyHash384TypeBuff)editCur );
			}
			else if( classCode.equals( "a84e" ) ) {
				schema.getTableDbKeyHash384Gen().updateDbKeyHash384Gen( Authorization, (YCFBamDbKeyHash384GenBuff)editCur );
			}
			else if( classCode.equals( "a84f" ) ) {
				schema.getTableDbKeyHash512Def().updateDbKeyHash512Def( Authorization, (YCFBamDbKeyHash512DefBuff)editCur );
			}
			else if( classCode.equals( "a850" ) ) {
				schema.getTableDbKeyHash512Col().updateDbKeyHash512Col( Authorization, (YCFBamDbKeyHash512ColBuff)editCur );
			}
			else if( classCode.equals( "a851" ) ) {
				schema.getTableDbKeyHash512Type().updateDbKeyHash512Type( Authorization, (YCFBamDbKeyHash512TypeBuff)editCur );
			}
			else if( classCode.equals( "a852" ) ) {
				schema.getTableDbKeyHash512Gen().updateDbKeyHash512Gen( Authorization, (YCFBamDbKeyHash512GenBuff)editCur );
			}
			else if( classCode.equals( "a853" ) ) {
				schema.getTableStringDef().updateStringDef( Authorization, (YCFBamStringDefBuff)editCur );
			}
			else if( classCode.equals( "a854" ) ) {
				schema.getTableStringType().updateStringType( Authorization, (YCFBamStringTypeBuff)editCur );
			}
			else if( classCode.equals( "a87e" ) ) {
				schema.getTableStringCol().updateStringCol( Authorization, (YCFBamStringColBuff)editCur );
			}
			else if( classCode.equals( "a855" ) ) {
				schema.getTableTZDateDef().updateTZDateDef( Authorization, (YCFBamTZDateDefBuff)editCur );
			}
			else if( classCode.equals( "a856" ) ) {
				schema.getTableTZDateType().updateTZDateType( Authorization, (YCFBamTZDateTypeBuff)editCur );
			}
			else if( classCode.equals( "a87f" ) ) {
				schema.getTableTZDateCol().updateTZDateCol( Authorization, (YCFBamTZDateColBuff)editCur );
			}
			else if( classCode.equals( "a857" ) ) {
				schema.getTableTZTimeDef().updateTZTimeDef( Authorization, (YCFBamTZTimeDefBuff)editCur );
			}
			else if( classCode.equals( "a858" ) ) {
				schema.getTableTZTimeType().updateTZTimeType( Authorization, (YCFBamTZTimeTypeBuff)editCur );
			}
			else if( classCode.equals( "a880" ) ) {
				schema.getTableTZTimeCol().updateTZTimeCol( Authorization, (YCFBamTZTimeColBuff)editCur );
			}
			else if( classCode.equals( "a859" ) ) {
				schema.getTableTZTimestampDef().updateTZTimestampDef( Authorization, (YCFBamTZTimestampDefBuff)editCur );
			}
			else if( classCode.equals( "a85a" ) ) {
				schema.getTableTZTimestampType().updateTZTimestampType( Authorization, (YCFBamTZTimestampTypeBuff)editCur );
			}
			else if( classCode.equals( "a881" ) ) {
				schema.getTableTZTimestampCol().updateTZTimestampCol( Authorization, (YCFBamTZTimestampColBuff)editCur );
			}
			else if( classCode.equals( "a85c" ) ) {
				schema.getTableTextDef().updateTextDef( Authorization, (YCFBamTextDefBuff)editCur );
			}
			else if( classCode.equals( "a85d" ) ) {
				schema.getTableTextType().updateTextType( Authorization, (YCFBamTextTypeBuff)editCur );
			}
			else if( classCode.equals( "a882" ) ) {
				schema.getTableTextCol().updateTextCol( Authorization, (YCFBamTextColBuff)editCur );
			}
			else if( classCode.equals( "a85e" ) ) {
				schema.getTableTimeDef().updateTimeDef( Authorization, (YCFBamTimeDefBuff)editCur );
			}
			else if( classCode.equals( "a85f" ) ) {
				schema.getTableTimeType().updateTimeType( Authorization, (YCFBamTimeTypeBuff)editCur );
			}
			else if( classCode.equals( "a883" ) ) {
				schema.getTableTimeCol().updateTimeCol( Authorization, (YCFBamTimeColBuff)editCur );
			}
			else if( classCode.equals( "a860" ) ) {
				schema.getTableTimestampDef().updateTimestampDef( Authorization, (YCFBamTimestampDefBuff)editCur );
			}
			else if( classCode.equals( "a861" ) ) {
				schema.getTableTimestampType().updateTimestampType( Authorization, (YCFBamTimestampTypeBuff)editCur );
			}
			else if( classCode.equals( "a884" ) ) {
				schema.getTableTimestampCol().updateTimestampCol( Authorization, (YCFBamTimestampColBuff)editCur );
			}
			else if( classCode.equals( "a862" ) ) {
				schema.getTableTokenDef().updateTokenDef( Authorization, (YCFBamTokenDefBuff)editCur );
			}
			else if( classCode.equals( "a863" ) ) {
				schema.getTableTokenType().updateTokenType( Authorization, (YCFBamTokenTypeBuff)editCur );
			}
			else if( classCode.equals( "a885" ) ) {
				schema.getTableTokenCol().updateTokenCol( Authorization, (YCFBamTokenColBuff)editCur );
			}
			else if( classCode.equals( "a864" ) ) {
				schema.getTableUInt16Def().updateUInt16Def( Authorization, (YCFBamUInt16DefBuff)editCur );
			}
			else if( classCode.equals( "a865" ) ) {
				schema.getTableUInt16Type().updateUInt16Type( Authorization, (YCFBamUInt16TypeBuff)editCur );
			}
			else if( classCode.equals( "a886" ) ) {
				schema.getTableUInt16Col().updateUInt16Col( Authorization, (YCFBamUInt16ColBuff)editCur );
			}
			else if( classCode.equals( "a866" ) ) {
				schema.getTableUInt32Def().updateUInt32Def( Authorization, (YCFBamUInt32DefBuff)editCur );
			}
			else if( classCode.equals( "a867" ) ) {
				schema.getTableUInt32Type().updateUInt32Type( Authorization, (YCFBamUInt32TypeBuff)editCur );
			}
			else if( classCode.equals( "a887" ) ) {
				schema.getTableUInt32Col().updateUInt32Col( Authorization, (YCFBamUInt32ColBuff)editCur );
			}
			else if( classCode.equals( "a868" ) ) {
				schema.getTableUInt64Def().updateUInt64Def( Authorization, (YCFBamUInt64DefBuff)editCur );
			}
			else if( classCode.equals( "a869" ) ) {
				schema.getTableUInt64Type().updateUInt64Type( Authorization, (YCFBamUInt64TypeBuff)editCur );
			}
			else if( classCode.equals( "a888" ) ) {
				schema.getTableUInt64Col().updateUInt64Col( Authorization, (YCFBamUInt64ColBuff)editCur );
			}
			else if( classCode.equals( "a86a" ) ) {
				schema.getTableUuidDef().updateUuidDef( Authorization, (YCFBamUuidDefBuff)editCur );
			}
			else if( classCode.equals( "a86c" ) ) {
				schema.getTableUuidType().updateUuidType( Authorization, (YCFBamUuidTypeBuff)editCur );
			}
			else if( classCode.equals( "a88b" ) ) {
				schema.getTableUuidGen().updateUuidGen( Authorization, (YCFBamUuidGenBuff)editCur );
			}
			else if( classCode.equals( "a889" ) ) {
				schema.getTableUuidCol().updateUuidCol( Authorization, (YCFBamUuidColBuff)editCur );
			}
			else if( classCode.equals( "a86b" ) ) {
				schema.getTableUuid6Def().updateUuid6Def( Authorization, (YCFBamUuid6DefBuff)editCur );
			}
			else if( classCode.equals( "a86d" ) ) {
				schema.getTableUuid6Type().updateUuid6Type( Authorization, (YCFBamUuid6TypeBuff)editCur );
			}
			else if( classCode.equals( "a88c" ) ) {
				schema.getTableUuid6Gen().updateUuid6Gen( Authorization, (YCFBamUuid6GenBuff)editCur );
			}
			else if( classCode.equals( "a88a" ) ) {
				schema.getTableUuid6Col().updateUuid6Col( Authorization, (YCFBamUuid6ColBuff)editCur );
			}
			else if( classCode.equals( "a85b" ) ) {
				schema.getTableTableCol().updateTableCol( Authorization, (YCFBamTableColBuff)editCur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		if( editNext != null ) {
			classCode = editNext.getClassCode();
			if( classCode.equals( "a80c" ) ) {
				schema.getTableValue().updateValue( Authorization, editNext );
			}
			else if( classCode.equals( "a80d" ) ) {
				schema.getTableAtom().updateAtom( Authorization, (YCFBamAtomBuff)editNext );
			}
			else if( classCode.equals( "a80e" ) ) {
				schema.getTableBlobDef().updateBlobDef( Authorization, (YCFBamBlobDefBuff)editNext );
			}
			else if( classCode.equals( "a80f" ) ) {
				schema.getTableBlobType().updateBlobType( Authorization, (YCFBamBlobTypeBuff)editNext );
			}
			else if( classCode.equals( "a86e" ) ) {
				schema.getTableBlobCol().updateBlobCol( Authorization, (YCFBamBlobColBuff)editNext );
			}
			else if( classCode.equals( "a810" ) ) {
				schema.getTableBoolDef().updateBoolDef( Authorization, (YCFBamBoolDefBuff)editNext );
			}
			else if( classCode.equals( "a811" ) ) {
				schema.getTableBoolType().updateBoolType( Authorization, (YCFBamBoolTypeBuff)editNext );
			}
			else if( classCode.equals( "a86f" ) ) {
				schema.getTableBoolCol().updateBoolCol( Authorization, (YCFBamBoolColBuff)editNext );
			}
			else if( classCode.equals( "a818" ) ) {
				schema.getTableDateDef().updateDateDef( Authorization, (YCFBamDateDefBuff)editNext );
			}
			else if( classCode.equals( "a819" ) ) {
				schema.getTableDateType().updateDateType( Authorization, (YCFBamDateTypeBuff)editNext );
			}
			else if( classCode.equals( "a870" ) ) {
				schema.getTableDateCol().updateDateCol( Authorization, (YCFBamDateColBuff)editNext );
			}
			else if( classCode.equals( "a81f" ) ) {
				schema.getTableDoubleDef().updateDoubleDef( Authorization, (YCFBamDoubleDefBuff)editNext );
			}
			else if( classCode.equals( "a820" ) ) {
				schema.getTableDoubleType().updateDoubleType( Authorization, (YCFBamDoubleTypeBuff)editNext );
			}
			else if( classCode.equals( "a871" ) ) {
				schema.getTableDoubleCol().updateDoubleCol( Authorization, (YCFBamDoubleColBuff)editNext );
			}
			else if( classCode.equals( "a822" ) ) {
				schema.getTableFloatDef().updateFloatDef( Authorization, (YCFBamFloatDefBuff)editNext );
			}
			else if( classCode.equals( "a823" ) ) {
				schema.getTableFloatType().updateFloatType( Authorization, (YCFBamFloatTypeBuff)editNext );
			}
			else if( classCode.equals( "a874" ) ) {
				schema.getTableFloatCol().updateFloatCol( Authorization, (YCFBamFloatColBuff)editNext );
			}
			else if( classCode.equals( "a826" ) ) {
				schema.getTableInt16Def().updateInt16Def( Authorization, (YCFBamInt16DefBuff)editNext );
			}
			else if( classCode.equals( "a827" ) ) {
				schema.getTableInt16Type().updateInt16Type( Authorization, (YCFBamInt16TypeBuff)editNext );
			}
			else if( classCode.equals( "a875" ) ) {
				schema.getTableId16Gen().updateId16Gen( Authorization, (YCFBamId16GenBuff)editNext );
			}
			else if( classCode.equals( "a872" ) ) {
				schema.getTableEnumDef().updateEnumDef( Authorization, (YCFBamEnumDefBuff)editNext );
			}
			else if( classCode.equals( "a873" ) ) {
				schema.getTableEnumType().updateEnumType( Authorization, (YCFBamEnumTypeBuff)editNext );
			}
			else if( classCode.equals( "a878" ) ) {
				schema.getTableInt16Col().updateInt16Col( Authorization, (YCFBamInt16ColBuff)editNext );
			}
			else if( classCode.equals( "a828" ) ) {
				schema.getTableInt32Def().updateInt32Def( Authorization, (YCFBamInt32DefBuff)editNext );
			}
			else if( classCode.equals( "a829" ) ) {
				schema.getTableInt32Type().updateInt32Type( Authorization, (YCFBamInt32TypeBuff)editNext );
			}
			else if( classCode.equals( "a876" ) ) {
				schema.getTableId32Gen().updateId32Gen( Authorization, (YCFBamId32GenBuff)editNext );
			}
			else if( classCode.equals( "a879" ) ) {
				schema.getTableInt32Col().updateInt32Col( Authorization, (YCFBamInt32ColBuff)editNext );
			}
			else if( classCode.equals( "a82a" ) ) {
				schema.getTableInt64Def().updateInt64Def( Authorization, (YCFBamInt64DefBuff)editNext );
			}
			else if( classCode.equals( "a82b" ) ) {
				schema.getTableInt64Type().updateInt64Type( Authorization, (YCFBamInt64TypeBuff)editNext );
			}
			else if( classCode.equals( "a877" ) ) {
				schema.getTableId64Gen().updateId64Gen( Authorization, (YCFBamId64GenBuff)editNext );
			}
			else if( classCode.equals( "a87a" ) ) {
				schema.getTableInt64Col().updateInt64Col( Authorization, (YCFBamInt64ColBuff)editNext );
			}
			else if( classCode.equals( "a82c" ) ) {
				schema.getTableNmTokenDef().updateNmTokenDef( Authorization, (YCFBamNmTokenDefBuff)editNext );
			}
			else if( classCode.equals( "a82d" ) ) {
				schema.getTableNmTokenType().updateNmTokenType( Authorization, (YCFBamNmTokenTypeBuff)editNext );
			}
			else if( classCode.equals( "a87b" ) ) {
				schema.getTableNmTokenCol().updateNmTokenCol( Authorization, (YCFBamNmTokenColBuff)editNext );
			}
			else if( classCode.equals( "a82e" ) ) {
				schema.getTableNmTokensDef().updateNmTokensDef( Authorization, (YCFBamNmTokensDefBuff)editNext );
			}
			else if( classCode.equals( "a82f" ) ) {
				schema.getTableNmTokensType().updateNmTokensType( Authorization, (YCFBamNmTokensTypeBuff)editNext );
			}
			else if( classCode.equals( "a87c" ) ) {
				schema.getTableNmTokensCol().updateNmTokensCol( Authorization, (YCFBamNmTokensColBuff)editNext );
			}
			else if( classCode.equals( "a830" ) ) {
				schema.getTableNumberDef().updateNumberDef( Authorization, (YCFBamNumberDefBuff)editNext );
			}
			else if( classCode.equals( "a831" ) ) {
				schema.getTableNumberType().updateNumberType( Authorization, (YCFBamNumberTypeBuff)editNext );
			}
			else if( classCode.equals( "a87d" ) ) {
				schema.getTableNumberCol().updateNumberCol( Authorization, (YCFBamNumberColBuff)editNext );
			}
			else if( classCode.equals( "a83b" ) ) {
				schema.getTableDbKeyHash128Def().updateDbKeyHash128Def( Authorization, (YCFBamDbKeyHash128DefBuff)editNext );
			}
			else if( classCode.equals( "a83c" ) ) {
				schema.getTableDbKeyHash128Col().updateDbKeyHash128Col( Authorization, (YCFBamDbKeyHash128ColBuff)editNext );
			}
			else if( classCode.equals( "a83d" ) ) {
				schema.getTableDbKeyHash128Type().updateDbKeyHash128Type( Authorization, (YCFBamDbKeyHash128TypeBuff)editNext );
			}
			else if( classCode.equals( "a83e" ) ) {
				schema.getTableDbKeyHash128Gen().updateDbKeyHash128Gen( Authorization, (YCFBamDbKeyHash128GenBuff)editNext );
			}
			else if( classCode.equals( "a83f" ) ) {
				schema.getTableDbKeyHash160Def().updateDbKeyHash160Def( Authorization, (YCFBamDbKeyHash160DefBuff)editNext );
			}
			else if( classCode.equals( "a840" ) ) {
				schema.getTableDbKeyHash160Col().updateDbKeyHash160Col( Authorization, (YCFBamDbKeyHash160ColBuff)editNext );
			}
			else if( classCode.equals( "a841" ) ) {
				schema.getTableDbKeyHash160Type().updateDbKeyHash160Type( Authorization, (YCFBamDbKeyHash160TypeBuff)editNext );
			}
			else if( classCode.equals( "a842" ) ) {
				schema.getTableDbKeyHash160Gen().updateDbKeyHash160Gen( Authorization, (YCFBamDbKeyHash160GenBuff)editNext );
			}
			else if( classCode.equals( "a843" ) ) {
				schema.getTableDbKeyHash224Def().updateDbKeyHash224Def( Authorization, (YCFBamDbKeyHash224DefBuff)editNext );
			}
			else if( classCode.equals( "a844" ) ) {
				schema.getTableDbKeyHash224Col().updateDbKeyHash224Col( Authorization, (YCFBamDbKeyHash224ColBuff)editNext );
			}
			else if( classCode.equals( "a845" ) ) {
				schema.getTableDbKeyHash224Type().updateDbKeyHash224Type( Authorization, (YCFBamDbKeyHash224TypeBuff)editNext );
			}
			else if( classCode.equals( "a846" ) ) {
				schema.getTableDbKeyHash224Gen().updateDbKeyHash224Gen( Authorization, (YCFBamDbKeyHash224GenBuff)editNext );
			}
			else if( classCode.equals( "a847" ) ) {
				schema.getTableDbKeyHash256Def().updateDbKeyHash256Def( Authorization, (YCFBamDbKeyHash256DefBuff)editNext );
			}
			else if( classCode.equals( "a848" ) ) {
				schema.getTableDbKeyHash256Col().updateDbKeyHash256Col( Authorization, (YCFBamDbKeyHash256ColBuff)editNext );
			}
			else if( classCode.equals( "a849" ) ) {
				schema.getTableDbKeyHash256Type().updateDbKeyHash256Type( Authorization, (YCFBamDbKeyHash256TypeBuff)editNext );
			}
			else if( classCode.equals( "a84a" ) ) {
				schema.getTableDbKeyHash256Gen().updateDbKeyHash256Gen( Authorization, (YCFBamDbKeyHash256GenBuff)editNext );
			}
			else if( classCode.equals( "a84b" ) ) {
				schema.getTableDbKeyHash384Def().updateDbKeyHash384Def( Authorization, (YCFBamDbKeyHash384DefBuff)editNext );
			}
			else if( classCode.equals( "a84c" ) ) {
				schema.getTableDbKeyHash384Col().updateDbKeyHash384Col( Authorization, (YCFBamDbKeyHash384ColBuff)editNext );
			}
			else if( classCode.equals( "a84d" ) ) {
				schema.getTableDbKeyHash384Type().updateDbKeyHash384Type( Authorization, (YCFBamDbKeyHash384TypeBuff)editNext );
			}
			else if( classCode.equals( "a84e" ) ) {
				schema.getTableDbKeyHash384Gen().updateDbKeyHash384Gen( Authorization, (YCFBamDbKeyHash384GenBuff)editNext );
			}
			else if( classCode.equals( "a84f" ) ) {
				schema.getTableDbKeyHash512Def().updateDbKeyHash512Def( Authorization, (YCFBamDbKeyHash512DefBuff)editNext );
			}
			else if( classCode.equals( "a850" ) ) {
				schema.getTableDbKeyHash512Col().updateDbKeyHash512Col( Authorization, (YCFBamDbKeyHash512ColBuff)editNext );
			}
			else if( classCode.equals( "a851" ) ) {
				schema.getTableDbKeyHash512Type().updateDbKeyHash512Type( Authorization, (YCFBamDbKeyHash512TypeBuff)editNext );
			}
			else if( classCode.equals( "a852" ) ) {
				schema.getTableDbKeyHash512Gen().updateDbKeyHash512Gen( Authorization, (YCFBamDbKeyHash512GenBuff)editNext );
			}
			else if( classCode.equals( "a853" ) ) {
				schema.getTableStringDef().updateStringDef( Authorization, (YCFBamStringDefBuff)editNext );
			}
			else if( classCode.equals( "a854" ) ) {
				schema.getTableStringType().updateStringType( Authorization, (YCFBamStringTypeBuff)editNext );
			}
			else if( classCode.equals( "a87e" ) ) {
				schema.getTableStringCol().updateStringCol( Authorization, (YCFBamStringColBuff)editNext );
			}
			else if( classCode.equals( "a855" ) ) {
				schema.getTableTZDateDef().updateTZDateDef( Authorization, (YCFBamTZDateDefBuff)editNext );
			}
			else if( classCode.equals( "a856" ) ) {
				schema.getTableTZDateType().updateTZDateType( Authorization, (YCFBamTZDateTypeBuff)editNext );
			}
			else if( classCode.equals( "a87f" ) ) {
				schema.getTableTZDateCol().updateTZDateCol( Authorization, (YCFBamTZDateColBuff)editNext );
			}
			else if( classCode.equals( "a857" ) ) {
				schema.getTableTZTimeDef().updateTZTimeDef( Authorization, (YCFBamTZTimeDefBuff)editNext );
			}
			else if( classCode.equals( "a858" ) ) {
				schema.getTableTZTimeType().updateTZTimeType( Authorization, (YCFBamTZTimeTypeBuff)editNext );
			}
			else if( classCode.equals( "a880" ) ) {
				schema.getTableTZTimeCol().updateTZTimeCol( Authorization, (YCFBamTZTimeColBuff)editNext );
			}
			else if( classCode.equals( "a859" ) ) {
				schema.getTableTZTimestampDef().updateTZTimestampDef( Authorization, (YCFBamTZTimestampDefBuff)editNext );
			}
			else if( classCode.equals( "a85a" ) ) {
				schema.getTableTZTimestampType().updateTZTimestampType( Authorization, (YCFBamTZTimestampTypeBuff)editNext );
			}
			else if( classCode.equals( "a881" ) ) {
				schema.getTableTZTimestampCol().updateTZTimestampCol( Authorization, (YCFBamTZTimestampColBuff)editNext );
			}
			else if( classCode.equals( "a85c" ) ) {
				schema.getTableTextDef().updateTextDef( Authorization, (YCFBamTextDefBuff)editNext );
			}
			else if( classCode.equals( "a85d" ) ) {
				schema.getTableTextType().updateTextType( Authorization, (YCFBamTextTypeBuff)editNext );
			}
			else if( classCode.equals( "a882" ) ) {
				schema.getTableTextCol().updateTextCol( Authorization, (YCFBamTextColBuff)editNext );
			}
			else if( classCode.equals( "a85e" ) ) {
				schema.getTableTimeDef().updateTimeDef( Authorization, (YCFBamTimeDefBuff)editNext );
			}
			else if( classCode.equals( "a85f" ) ) {
				schema.getTableTimeType().updateTimeType( Authorization, (YCFBamTimeTypeBuff)editNext );
			}
			else if( classCode.equals( "a883" ) ) {
				schema.getTableTimeCol().updateTimeCol( Authorization, (YCFBamTimeColBuff)editNext );
			}
			else if( classCode.equals( "a860" ) ) {
				schema.getTableTimestampDef().updateTimestampDef( Authorization, (YCFBamTimestampDefBuff)editNext );
			}
			else if( classCode.equals( "a861" ) ) {
				schema.getTableTimestampType().updateTimestampType( Authorization, (YCFBamTimestampTypeBuff)editNext );
			}
			else if( classCode.equals( "a884" ) ) {
				schema.getTableTimestampCol().updateTimestampCol( Authorization, (YCFBamTimestampColBuff)editNext );
			}
			else if( classCode.equals( "a862" ) ) {
				schema.getTableTokenDef().updateTokenDef( Authorization, (YCFBamTokenDefBuff)editNext );
			}
			else if( classCode.equals( "a863" ) ) {
				schema.getTableTokenType().updateTokenType( Authorization, (YCFBamTokenTypeBuff)editNext );
			}
			else if( classCode.equals( "a885" ) ) {
				schema.getTableTokenCol().updateTokenCol( Authorization, (YCFBamTokenColBuff)editNext );
			}
			else if( classCode.equals( "a864" ) ) {
				schema.getTableUInt16Def().updateUInt16Def( Authorization, (YCFBamUInt16DefBuff)editNext );
			}
			else if( classCode.equals( "a865" ) ) {
				schema.getTableUInt16Type().updateUInt16Type( Authorization, (YCFBamUInt16TypeBuff)editNext );
			}
			else if( classCode.equals( "a886" ) ) {
				schema.getTableUInt16Col().updateUInt16Col( Authorization, (YCFBamUInt16ColBuff)editNext );
			}
			else if( classCode.equals( "a866" ) ) {
				schema.getTableUInt32Def().updateUInt32Def( Authorization, (YCFBamUInt32DefBuff)editNext );
			}
			else if( classCode.equals( "a867" ) ) {
				schema.getTableUInt32Type().updateUInt32Type( Authorization, (YCFBamUInt32TypeBuff)editNext );
			}
			else if( classCode.equals( "a887" ) ) {
				schema.getTableUInt32Col().updateUInt32Col( Authorization, (YCFBamUInt32ColBuff)editNext );
			}
			else if( classCode.equals( "a868" ) ) {
				schema.getTableUInt64Def().updateUInt64Def( Authorization, (YCFBamUInt64DefBuff)editNext );
			}
			else if( classCode.equals( "a869" ) ) {
				schema.getTableUInt64Type().updateUInt64Type( Authorization, (YCFBamUInt64TypeBuff)editNext );
			}
			else if( classCode.equals( "a888" ) ) {
				schema.getTableUInt64Col().updateUInt64Col( Authorization, (YCFBamUInt64ColBuff)editNext );
			}
			else if( classCode.equals( "a86a" ) ) {
				schema.getTableUuidDef().updateUuidDef( Authorization, (YCFBamUuidDefBuff)editNext );
			}
			else if( classCode.equals( "a86c" ) ) {
				schema.getTableUuidType().updateUuidType( Authorization, (YCFBamUuidTypeBuff)editNext );
			}
			else if( classCode.equals( "a88b" ) ) {
				schema.getTableUuidGen().updateUuidGen( Authorization, (YCFBamUuidGenBuff)editNext );
			}
			else if( classCode.equals( "a889" ) ) {
				schema.getTableUuidCol().updateUuidCol( Authorization, (YCFBamUuidColBuff)editNext );
			}
			else if( classCode.equals( "a86b" ) ) {
				schema.getTableUuid6Def().updateUuid6Def( Authorization, (YCFBamUuid6DefBuff)editNext );
			}
			else if( classCode.equals( "a86d" ) ) {
				schema.getTableUuid6Type().updateUuid6Type( Authorization, (YCFBamUuid6TypeBuff)editNext );
			}
			else if( classCode.equals( "a88c" ) ) {
				schema.getTableUuid6Gen().updateUuid6Gen( Authorization, (YCFBamUuid6GenBuff)editNext );
			}
			else if( classCode.equals( "a88a" ) ) {
				schema.getTableUuid6Col().updateUuid6Col( Authorization, (YCFBamUuid6ColBuff)editNext );
			}
			else if( classCode.equals( "a85b" ) ) {
				schema.getTableTableCol().updateTableCol( Authorization, (YCFBamTableColBuff)editNext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		return( (YCFBamValueBuff)editCur );
	}

	/**
	 *	Move the specified buffer down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	public YCFBamValueBuff moveBuffDown( YCFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision )
	{
		final String S_ProcName = "moveBuffDown";

		YCFBamValueBuff prev = null;
		YCFBamValueBuff cur = null;
		YCFBamValueBuff next = null;
		YCFBamValueBuff grandnext = null;

		cur = schema.getTableValue().readDerivedByIdIdx(Authorization, TenantId, Id);
		if( cur == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object" );
		}

		if( ( cur.getOptionalNextTenantId() == null )
			&& ( cur.getOptionalNextId() == null ) )
		{
			return( (YCFBamValueBuff)cur );
		}

		next = schema.getTableValue().readDerivedByIdIdx(Authorization, cur.getOptionalNextTenantId(), cur.getOptionalNextId() );
		if( next == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object.next" );
		}

		if( ( next.getOptionalNextTenantId() != null )
			&& ( next.getOptionalNextId() != null ) )
		{
			grandnext = schema.getTableValue().readDerivedByIdIdx(Authorization, next.getOptionalNextTenantId(), next.getOptionalNextId() );
			if( grandnext == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.next.next" );
			}
		}

		if( ( cur.getOptionalPrevTenantId() != null )
			&& ( cur.getOptionalPrevId() != null ) )
		{
			prev = schema.getTableValue().readDerivedByIdIdx(Authorization, cur.getOptionalPrevTenantId(), cur.getOptionalPrevId() );
			if( prev == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.prev" );
			}
		}

		String classCode = cur.getClassCode();
		YCFBamValueBuff newInstance;
			if( classCode.equals( "a80c" ) ) {
				newInstance = schema.getFactoryValue().newBuff();
			}
			else if( classCode.equals( "a80d" ) ) {
				newInstance = schema.getFactoryAtom().newBuff();
			}
			else if( classCode.equals( "a80e" ) ) {
				newInstance = schema.getFactoryBlobDef().newBuff();
			}
			else if( classCode.equals( "a80f" ) ) {
				newInstance = schema.getFactoryBlobType().newBuff();
			}
			else if( classCode.equals( "a86e" ) ) {
				newInstance = schema.getFactoryBlobCol().newBuff();
			}
			else if( classCode.equals( "a810" ) ) {
				newInstance = schema.getFactoryBoolDef().newBuff();
			}
			else if( classCode.equals( "a811" ) ) {
				newInstance = schema.getFactoryBoolType().newBuff();
			}
			else if( classCode.equals( "a86f" ) ) {
				newInstance = schema.getFactoryBoolCol().newBuff();
			}
			else if( classCode.equals( "a818" ) ) {
				newInstance = schema.getFactoryDateDef().newBuff();
			}
			else if( classCode.equals( "a819" ) ) {
				newInstance = schema.getFactoryDateType().newBuff();
			}
			else if( classCode.equals( "a870" ) ) {
				newInstance = schema.getFactoryDateCol().newBuff();
			}
			else if( classCode.equals( "a81f" ) ) {
				newInstance = schema.getFactoryDoubleDef().newBuff();
			}
			else if( classCode.equals( "a820" ) ) {
				newInstance = schema.getFactoryDoubleType().newBuff();
			}
			else if( classCode.equals( "a871" ) ) {
				newInstance = schema.getFactoryDoubleCol().newBuff();
			}
			else if( classCode.equals( "a822" ) ) {
				newInstance = schema.getFactoryFloatDef().newBuff();
			}
			else if( classCode.equals( "a823" ) ) {
				newInstance = schema.getFactoryFloatType().newBuff();
			}
			else if( classCode.equals( "a874" ) ) {
				newInstance = schema.getFactoryFloatCol().newBuff();
			}
			else if( classCode.equals( "a826" ) ) {
				newInstance = schema.getFactoryInt16Def().newBuff();
			}
			else if( classCode.equals( "a827" ) ) {
				newInstance = schema.getFactoryInt16Type().newBuff();
			}
			else if( classCode.equals( "a875" ) ) {
				newInstance = schema.getFactoryId16Gen().newBuff();
			}
			else if( classCode.equals( "a872" ) ) {
				newInstance = schema.getFactoryEnumDef().newBuff();
			}
			else if( classCode.equals( "a873" ) ) {
				newInstance = schema.getFactoryEnumType().newBuff();
			}
			else if( classCode.equals( "a878" ) ) {
				newInstance = schema.getFactoryInt16Col().newBuff();
			}
			else if( classCode.equals( "a828" ) ) {
				newInstance = schema.getFactoryInt32Def().newBuff();
			}
			else if( classCode.equals( "a829" ) ) {
				newInstance = schema.getFactoryInt32Type().newBuff();
			}
			else if( classCode.equals( "a876" ) ) {
				newInstance = schema.getFactoryId32Gen().newBuff();
			}
			else if( classCode.equals( "a879" ) ) {
				newInstance = schema.getFactoryInt32Col().newBuff();
			}
			else if( classCode.equals( "a82a" ) ) {
				newInstance = schema.getFactoryInt64Def().newBuff();
			}
			else if( classCode.equals( "a82b" ) ) {
				newInstance = schema.getFactoryInt64Type().newBuff();
			}
			else if( classCode.equals( "a877" ) ) {
				newInstance = schema.getFactoryId64Gen().newBuff();
			}
			else if( classCode.equals( "a87a" ) ) {
				newInstance = schema.getFactoryInt64Col().newBuff();
			}
			else if( classCode.equals( "a82c" ) ) {
				newInstance = schema.getFactoryNmTokenDef().newBuff();
			}
			else if( classCode.equals( "a82d" ) ) {
				newInstance = schema.getFactoryNmTokenType().newBuff();
			}
			else if( classCode.equals( "a87b" ) ) {
				newInstance = schema.getFactoryNmTokenCol().newBuff();
			}
			else if( classCode.equals( "a82e" ) ) {
				newInstance = schema.getFactoryNmTokensDef().newBuff();
			}
			else if( classCode.equals( "a82f" ) ) {
				newInstance = schema.getFactoryNmTokensType().newBuff();
			}
			else if( classCode.equals( "a87c" ) ) {
				newInstance = schema.getFactoryNmTokensCol().newBuff();
			}
			else if( classCode.equals( "a830" ) ) {
				newInstance = schema.getFactoryNumberDef().newBuff();
			}
			else if( classCode.equals( "a831" ) ) {
				newInstance = schema.getFactoryNumberType().newBuff();
			}
			else if( classCode.equals( "a87d" ) ) {
				newInstance = schema.getFactoryNumberCol().newBuff();
			}
			else if( classCode.equals( "a83b" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Def().newBuff();
			}
			else if( classCode.equals( "a83c" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Col().newBuff();
			}
			else if( classCode.equals( "a83d" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Type().newBuff();
			}
			else if( classCode.equals( "a83e" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Gen().newBuff();
			}
			else if( classCode.equals( "a83f" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Def().newBuff();
			}
			else if( classCode.equals( "a840" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Col().newBuff();
			}
			else if( classCode.equals( "a841" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Type().newBuff();
			}
			else if( classCode.equals( "a842" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Gen().newBuff();
			}
			else if( classCode.equals( "a843" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Def().newBuff();
			}
			else if( classCode.equals( "a844" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Col().newBuff();
			}
			else if( classCode.equals( "a845" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Type().newBuff();
			}
			else if( classCode.equals( "a846" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Gen().newBuff();
			}
			else if( classCode.equals( "a847" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Def().newBuff();
			}
			else if( classCode.equals( "a848" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Col().newBuff();
			}
			else if( classCode.equals( "a849" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Type().newBuff();
			}
			else if( classCode.equals( "a84a" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Gen().newBuff();
			}
			else if( classCode.equals( "a84b" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Def().newBuff();
			}
			else if( classCode.equals( "a84c" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Col().newBuff();
			}
			else if( classCode.equals( "a84d" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Type().newBuff();
			}
			else if( classCode.equals( "a84e" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Gen().newBuff();
			}
			else if( classCode.equals( "a84f" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Def().newBuff();
			}
			else if( classCode.equals( "a850" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Col().newBuff();
			}
			else if( classCode.equals( "a851" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Type().newBuff();
			}
			else if( classCode.equals( "a852" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Gen().newBuff();
			}
			else if( classCode.equals( "a853" ) ) {
				newInstance = schema.getFactoryStringDef().newBuff();
			}
			else if( classCode.equals( "a854" ) ) {
				newInstance = schema.getFactoryStringType().newBuff();
			}
			else if( classCode.equals( "a87e" ) ) {
				newInstance = schema.getFactoryStringCol().newBuff();
			}
			else if( classCode.equals( "a855" ) ) {
				newInstance = schema.getFactoryTZDateDef().newBuff();
			}
			else if( classCode.equals( "a856" ) ) {
				newInstance = schema.getFactoryTZDateType().newBuff();
			}
			else if( classCode.equals( "a87f" ) ) {
				newInstance = schema.getFactoryTZDateCol().newBuff();
			}
			else if( classCode.equals( "a857" ) ) {
				newInstance = schema.getFactoryTZTimeDef().newBuff();
			}
			else if( classCode.equals( "a858" ) ) {
				newInstance = schema.getFactoryTZTimeType().newBuff();
			}
			else if( classCode.equals( "a880" ) ) {
				newInstance = schema.getFactoryTZTimeCol().newBuff();
			}
			else if( classCode.equals( "a859" ) ) {
				newInstance = schema.getFactoryTZTimestampDef().newBuff();
			}
			else if( classCode.equals( "a85a" ) ) {
				newInstance = schema.getFactoryTZTimestampType().newBuff();
			}
			else if( classCode.equals( "a881" ) ) {
				newInstance = schema.getFactoryTZTimestampCol().newBuff();
			}
			else if( classCode.equals( "a85c" ) ) {
				newInstance = schema.getFactoryTextDef().newBuff();
			}
			else if( classCode.equals( "a85d" ) ) {
				newInstance = schema.getFactoryTextType().newBuff();
			}
			else if( classCode.equals( "a882" ) ) {
				newInstance = schema.getFactoryTextCol().newBuff();
			}
			else if( classCode.equals( "a85e" ) ) {
				newInstance = schema.getFactoryTimeDef().newBuff();
			}
			else if( classCode.equals( "a85f" ) ) {
				newInstance = schema.getFactoryTimeType().newBuff();
			}
			else if( classCode.equals( "a883" ) ) {
				newInstance = schema.getFactoryTimeCol().newBuff();
			}
			else if( classCode.equals( "a860" ) ) {
				newInstance = schema.getFactoryTimestampDef().newBuff();
			}
			else if( classCode.equals( "a861" ) ) {
				newInstance = schema.getFactoryTimestampType().newBuff();
			}
			else if( classCode.equals( "a884" ) ) {
				newInstance = schema.getFactoryTimestampCol().newBuff();
			}
			else if( classCode.equals( "a862" ) ) {
				newInstance = schema.getFactoryTokenDef().newBuff();
			}
			else if( classCode.equals( "a863" ) ) {
				newInstance = schema.getFactoryTokenType().newBuff();
			}
			else if( classCode.equals( "a885" ) ) {
				newInstance = schema.getFactoryTokenCol().newBuff();
			}
			else if( classCode.equals( "a864" ) ) {
				newInstance = schema.getFactoryUInt16Def().newBuff();
			}
			else if( classCode.equals( "a865" ) ) {
				newInstance = schema.getFactoryUInt16Type().newBuff();
			}
			else if( classCode.equals( "a886" ) ) {
				newInstance = schema.getFactoryUInt16Col().newBuff();
			}
			else if( classCode.equals( "a866" ) ) {
				newInstance = schema.getFactoryUInt32Def().newBuff();
			}
			else if( classCode.equals( "a867" ) ) {
				newInstance = schema.getFactoryUInt32Type().newBuff();
			}
			else if( classCode.equals( "a887" ) ) {
				newInstance = schema.getFactoryUInt32Col().newBuff();
			}
			else if( classCode.equals( "a868" ) ) {
				newInstance = schema.getFactoryUInt64Def().newBuff();
			}
			else if( classCode.equals( "a869" ) ) {
				newInstance = schema.getFactoryUInt64Type().newBuff();
			}
			else if( classCode.equals( "a888" ) ) {
				newInstance = schema.getFactoryUInt64Col().newBuff();
			}
			else if( classCode.equals( "a86a" ) ) {
				newInstance = schema.getFactoryUuidDef().newBuff();
			}
			else if( classCode.equals( "a86c" ) ) {
				newInstance = schema.getFactoryUuidType().newBuff();
			}
			else if( classCode.equals( "a88b" ) ) {
				newInstance = schema.getFactoryUuidGen().newBuff();
			}
			else if( classCode.equals( "a889" ) ) {
				newInstance = schema.getFactoryUuidCol().newBuff();
			}
			else if( classCode.equals( "a86b" ) ) {
				newInstance = schema.getFactoryUuid6Def().newBuff();
			}
			else if( classCode.equals( "a86d" ) ) {
				newInstance = schema.getFactoryUuid6Type().newBuff();
			}
			else if( classCode.equals( "a88c" ) ) {
				newInstance = schema.getFactoryUuid6Gen().newBuff();
			}
			else if( classCode.equals( "a88a" ) ) {
				newInstance = schema.getFactoryUuid6Col().newBuff();
			}
			else if( classCode.equals( "a85b" ) ) {
				newInstance = schema.getFactoryTableCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamValueBuff editCur = newInstance;
		editCur.set( cur );

		classCode = next.getClassCode();
			if( classCode.equals( "a80c" ) ) {
				newInstance = schema.getFactoryValue().newBuff();
			}
			else if( classCode.equals( "a80d" ) ) {
				newInstance = schema.getFactoryAtom().newBuff();
			}
			else if( classCode.equals( "a80e" ) ) {
				newInstance = schema.getFactoryBlobDef().newBuff();
			}
			else if( classCode.equals( "a80f" ) ) {
				newInstance = schema.getFactoryBlobType().newBuff();
			}
			else if( classCode.equals( "a86e" ) ) {
				newInstance = schema.getFactoryBlobCol().newBuff();
			}
			else if( classCode.equals( "a810" ) ) {
				newInstance = schema.getFactoryBoolDef().newBuff();
			}
			else if( classCode.equals( "a811" ) ) {
				newInstance = schema.getFactoryBoolType().newBuff();
			}
			else if( classCode.equals( "a86f" ) ) {
				newInstance = schema.getFactoryBoolCol().newBuff();
			}
			else if( classCode.equals( "a818" ) ) {
				newInstance = schema.getFactoryDateDef().newBuff();
			}
			else if( classCode.equals( "a819" ) ) {
				newInstance = schema.getFactoryDateType().newBuff();
			}
			else if( classCode.equals( "a870" ) ) {
				newInstance = schema.getFactoryDateCol().newBuff();
			}
			else if( classCode.equals( "a81f" ) ) {
				newInstance = schema.getFactoryDoubleDef().newBuff();
			}
			else if( classCode.equals( "a820" ) ) {
				newInstance = schema.getFactoryDoubleType().newBuff();
			}
			else if( classCode.equals( "a871" ) ) {
				newInstance = schema.getFactoryDoubleCol().newBuff();
			}
			else if( classCode.equals( "a822" ) ) {
				newInstance = schema.getFactoryFloatDef().newBuff();
			}
			else if( classCode.equals( "a823" ) ) {
				newInstance = schema.getFactoryFloatType().newBuff();
			}
			else if( classCode.equals( "a874" ) ) {
				newInstance = schema.getFactoryFloatCol().newBuff();
			}
			else if( classCode.equals( "a826" ) ) {
				newInstance = schema.getFactoryInt16Def().newBuff();
			}
			else if( classCode.equals( "a827" ) ) {
				newInstance = schema.getFactoryInt16Type().newBuff();
			}
			else if( classCode.equals( "a875" ) ) {
				newInstance = schema.getFactoryId16Gen().newBuff();
			}
			else if( classCode.equals( "a872" ) ) {
				newInstance = schema.getFactoryEnumDef().newBuff();
			}
			else if( classCode.equals( "a873" ) ) {
				newInstance = schema.getFactoryEnumType().newBuff();
			}
			else if( classCode.equals( "a878" ) ) {
				newInstance = schema.getFactoryInt16Col().newBuff();
			}
			else if( classCode.equals( "a828" ) ) {
				newInstance = schema.getFactoryInt32Def().newBuff();
			}
			else if( classCode.equals( "a829" ) ) {
				newInstance = schema.getFactoryInt32Type().newBuff();
			}
			else if( classCode.equals( "a876" ) ) {
				newInstance = schema.getFactoryId32Gen().newBuff();
			}
			else if( classCode.equals( "a879" ) ) {
				newInstance = schema.getFactoryInt32Col().newBuff();
			}
			else if( classCode.equals( "a82a" ) ) {
				newInstance = schema.getFactoryInt64Def().newBuff();
			}
			else if( classCode.equals( "a82b" ) ) {
				newInstance = schema.getFactoryInt64Type().newBuff();
			}
			else if( classCode.equals( "a877" ) ) {
				newInstance = schema.getFactoryId64Gen().newBuff();
			}
			else if( classCode.equals( "a87a" ) ) {
				newInstance = schema.getFactoryInt64Col().newBuff();
			}
			else if( classCode.equals( "a82c" ) ) {
				newInstance = schema.getFactoryNmTokenDef().newBuff();
			}
			else if( classCode.equals( "a82d" ) ) {
				newInstance = schema.getFactoryNmTokenType().newBuff();
			}
			else if( classCode.equals( "a87b" ) ) {
				newInstance = schema.getFactoryNmTokenCol().newBuff();
			}
			else if( classCode.equals( "a82e" ) ) {
				newInstance = schema.getFactoryNmTokensDef().newBuff();
			}
			else if( classCode.equals( "a82f" ) ) {
				newInstance = schema.getFactoryNmTokensType().newBuff();
			}
			else if( classCode.equals( "a87c" ) ) {
				newInstance = schema.getFactoryNmTokensCol().newBuff();
			}
			else if( classCode.equals( "a830" ) ) {
				newInstance = schema.getFactoryNumberDef().newBuff();
			}
			else if( classCode.equals( "a831" ) ) {
				newInstance = schema.getFactoryNumberType().newBuff();
			}
			else if( classCode.equals( "a87d" ) ) {
				newInstance = schema.getFactoryNumberCol().newBuff();
			}
			else if( classCode.equals( "a83b" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Def().newBuff();
			}
			else if( classCode.equals( "a83c" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Col().newBuff();
			}
			else if( classCode.equals( "a83d" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Type().newBuff();
			}
			else if( classCode.equals( "a83e" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Gen().newBuff();
			}
			else if( classCode.equals( "a83f" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Def().newBuff();
			}
			else if( classCode.equals( "a840" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Col().newBuff();
			}
			else if( classCode.equals( "a841" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Type().newBuff();
			}
			else if( classCode.equals( "a842" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Gen().newBuff();
			}
			else if( classCode.equals( "a843" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Def().newBuff();
			}
			else if( classCode.equals( "a844" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Col().newBuff();
			}
			else if( classCode.equals( "a845" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Type().newBuff();
			}
			else if( classCode.equals( "a846" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Gen().newBuff();
			}
			else if( classCode.equals( "a847" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Def().newBuff();
			}
			else if( classCode.equals( "a848" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Col().newBuff();
			}
			else if( classCode.equals( "a849" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Type().newBuff();
			}
			else if( classCode.equals( "a84a" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Gen().newBuff();
			}
			else if( classCode.equals( "a84b" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Def().newBuff();
			}
			else if( classCode.equals( "a84c" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Col().newBuff();
			}
			else if( classCode.equals( "a84d" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Type().newBuff();
			}
			else if( classCode.equals( "a84e" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Gen().newBuff();
			}
			else if( classCode.equals( "a84f" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Def().newBuff();
			}
			else if( classCode.equals( "a850" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Col().newBuff();
			}
			else if( classCode.equals( "a851" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Type().newBuff();
			}
			else if( classCode.equals( "a852" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Gen().newBuff();
			}
			else if( classCode.equals( "a853" ) ) {
				newInstance = schema.getFactoryStringDef().newBuff();
			}
			else if( classCode.equals( "a854" ) ) {
				newInstance = schema.getFactoryStringType().newBuff();
			}
			else if( classCode.equals( "a87e" ) ) {
				newInstance = schema.getFactoryStringCol().newBuff();
			}
			else if( classCode.equals( "a855" ) ) {
				newInstance = schema.getFactoryTZDateDef().newBuff();
			}
			else if( classCode.equals( "a856" ) ) {
				newInstance = schema.getFactoryTZDateType().newBuff();
			}
			else if( classCode.equals( "a87f" ) ) {
				newInstance = schema.getFactoryTZDateCol().newBuff();
			}
			else if( classCode.equals( "a857" ) ) {
				newInstance = schema.getFactoryTZTimeDef().newBuff();
			}
			else if( classCode.equals( "a858" ) ) {
				newInstance = schema.getFactoryTZTimeType().newBuff();
			}
			else if( classCode.equals( "a880" ) ) {
				newInstance = schema.getFactoryTZTimeCol().newBuff();
			}
			else if( classCode.equals( "a859" ) ) {
				newInstance = schema.getFactoryTZTimestampDef().newBuff();
			}
			else if( classCode.equals( "a85a" ) ) {
				newInstance = schema.getFactoryTZTimestampType().newBuff();
			}
			else if( classCode.equals( "a881" ) ) {
				newInstance = schema.getFactoryTZTimestampCol().newBuff();
			}
			else if( classCode.equals( "a85c" ) ) {
				newInstance = schema.getFactoryTextDef().newBuff();
			}
			else if( classCode.equals( "a85d" ) ) {
				newInstance = schema.getFactoryTextType().newBuff();
			}
			else if( classCode.equals( "a882" ) ) {
				newInstance = schema.getFactoryTextCol().newBuff();
			}
			else if( classCode.equals( "a85e" ) ) {
				newInstance = schema.getFactoryTimeDef().newBuff();
			}
			else if( classCode.equals( "a85f" ) ) {
				newInstance = schema.getFactoryTimeType().newBuff();
			}
			else if( classCode.equals( "a883" ) ) {
				newInstance = schema.getFactoryTimeCol().newBuff();
			}
			else if( classCode.equals( "a860" ) ) {
				newInstance = schema.getFactoryTimestampDef().newBuff();
			}
			else if( classCode.equals( "a861" ) ) {
				newInstance = schema.getFactoryTimestampType().newBuff();
			}
			else if( classCode.equals( "a884" ) ) {
				newInstance = schema.getFactoryTimestampCol().newBuff();
			}
			else if( classCode.equals( "a862" ) ) {
				newInstance = schema.getFactoryTokenDef().newBuff();
			}
			else if( classCode.equals( "a863" ) ) {
				newInstance = schema.getFactoryTokenType().newBuff();
			}
			else if( classCode.equals( "a885" ) ) {
				newInstance = schema.getFactoryTokenCol().newBuff();
			}
			else if( classCode.equals( "a864" ) ) {
				newInstance = schema.getFactoryUInt16Def().newBuff();
			}
			else if( classCode.equals( "a865" ) ) {
				newInstance = schema.getFactoryUInt16Type().newBuff();
			}
			else if( classCode.equals( "a886" ) ) {
				newInstance = schema.getFactoryUInt16Col().newBuff();
			}
			else if( classCode.equals( "a866" ) ) {
				newInstance = schema.getFactoryUInt32Def().newBuff();
			}
			else if( classCode.equals( "a867" ) ) {
				newInstance = schema.getFactoryUInt32Type().newBuff();
			}
			else if( classCode.equals( "a887" ) ) {
				newInstance = schema.getFactoryUInt32Col().newBuff();
			}
			else if( classCode.equals( "a868" ) ) {
				newInstance = schema.getFactoryUInt64Def().newBuff();
			}
			else if( classCode.equals( "a869" ) ) {
				newInstance = schema.getFactoryUInt64Type().newBuff();
			}
			else if( classCode.equals( "a888" ) ) {
				newInstance = schema.getFactoryUInt64Col().newBuff();
			}
			else if( classCode.equals( "a86a" ) ) {
				newInstance = schema.getFactoryUuidDef().newBuff();
			}
			else if( classCode.equals( "a86c" ) ) {
				newInstance = schema.getFactoryUuidType().newBuff();
			}
			else if( classCode.equals( "a88b" ) ) {
				newInstance = schema.getFactoryUuidGen().newBuff();
			}
			else if( classCode.equals( "a889" ) ) {
				newInstance = schema.getFactoryUuidCol().newBuff();
			}
			else if( classCode.equals( "a86b" ) ) {
				newInstance = schema.getFactoryUuid6Def().newBuff();
			}
			else if( classCode.equals( "a86d" ) ) {
				newInstance = schema.getFactoryUuid6Type().newBuff();
			}
			else if( classCode.equals( "a88c" ) ) {
				newInstance = schema.getFactoryUuid6Gen().newBuff();
			}
			else if( classCode.equals( "a88a" ) ) {
				newInstance = schema.getFactoryUuid6Col().newBuff();
			}
			else if( classCode.equals( "a85b" ) ) {
				newInstance = schema.getFactoryTableCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamValueBuff editNext = newInstance;
		editNext.set( next );

		YCFBamValueBuff editGrandnext = null;
		if( grandnext != null ) {
			classCode = grandnext.getClassCode();
			if( classCode.equals( "a80c" ) ) {
				newInstance = schema.getFactoryValue().newBuff();
			}
			else if( classCode.equals( "a80d" ) ) {
				newInstance = schema.getFactoryAtom().newBuff();
			}
			else if( classCode.equals( "a80e" ) ) {
				newInstance = schema.getFactoryBlobDef().newBuff();
			}
			else if( classCode.equals( "a80f" ) ) {
				newInstance = schema.getFactoryBlobType().newBuff();
			}
			else if( classCode.equals( "a86e" ) ) {
				newInstance = schema.getFactoryBlobCol().newBuff();
			}
			else if( classCode.equals( "a810" ) ) {
				newInstance = schema.getFactoryBoolDef().newBuff();
			}
			else if( classCode.equals( "a811" ) ) {
				newInstance = schema.getFactoryBoolType().newBuff();
			}
			else if( classCode.equals( "a86f" ) ) {
				newInstance = schema.getFactoryBoolCol().newBuff();
			}
			else if( classCode.equals( "a818" ) ) {
				newInstance = schema.getFactoryDateDef().newBuff();
			}
			else if( classCode.equals( "a819" ) ) {
				newInstance = schema.getFactoryDateType().newBuff();
			}
			else if( classCode.equals( "a870" ) ) {
				newInstance = schema.getFactoryDateCol().newBuff();
			}
			else if( classCode.equals( "a81f" ) ) {
				newInstance = schema.getFactoryDoubleDef().newBuff();
			}
			else if( classCode.equals( "a820" ) ) {
				newInstance = schema.getFactoryDoubleType().newBuff();
			}
			else if( classCode.equals( "a871" ) ) {
				newInstance = schema.getFactoryDoubleCol().newBuff();
			}
			else if( classCode.equals( "a822" ) ) {
				newInstance = schema.getFactoryFloatDef().newBuff();
			}
			else if( classCode.equals( "a823" ) ) {
				newInstance = schema.getFactoryFloatType().newBuff();
			}
			else if( classCode.equals( "a874" ) ) {
				newInstance = schema.getFactoryFloatCol().newBuff();
			}
			else if( classCode.equals( "a826" ) ) {
				newInstance = schema.getFactoryInt16Def().newBuff();
			}
			else if( classCode.equals( "a827" ) ) {
				newInstance = schema.getFactoryInt16Type().newBuff();
			}
			else if( classCode.equals( "a875" ) ) {
				newInstance = schema.getFactoryId16Gen().newBuff();
			}
			else if( classCode.equals( "a872" ) ) {
				newInstance = schema.getFactoryEnumDef().newBuff();
			}
			else if( classCode.equals( "a873" ) ) {
				newInstance = schema.getFactoryEnumType().newBuff();
			}
			else if( classCode.equals( "a878" ) ) {
				newInstance = schema.getFactoryInt16Col().newBuff();
			}
			else if( classCode.equals( "a828" ) ) {
				newInstance = schema.getFactoryInt32Def().newBuff();
			}
			else if( classCode.equals( "a829" ) ) {
				newInstance = schema.getFactoryInt32Type().newBuff();
			}
			else if( classCode.equals( "a876" ) ) {
				newInstance = schema.getFactoryId32Gen().newBuff();
			}
			else if( classCode.equals( "a879" ) ) {
				newInstance = schema.getFactoryInt32Col().newBuff();
			}
			else if( classCode.equals( "a82a" ) ) {
				newInstance = schema.getFactoryInt64Def().newBuff();
			}
			else if( classCode.equals( "a82b" ) ) {
				newInstance = schema.getFactoryInt64Type().newBuff();
			}
			else if( classCode.equals( "a877" ) ) {
				newInstance = schema.getFactoryId64Gen().newBuff();
			}
			else if( classCode.equals( "a87a" ) ) {
				newInstance = schema.getFactoryInt64Col().newBuff();
			}
			else if( classCode.equals( "a82c" ) ) {
				newInstance = schema.getFactoryNmTokenDef().newBuff();
			}
			else if( classCode.equals( "a82d" ) ) {
				newInstance = schema.getFactoryNmTokenType().newBuff();
			}
			else if( classCode.equals( "a87b" ) ) {
				newInstance = schema.getFactoryNmTokenCol().newBuff();
			}
			else if( classCode.equals( "a82e" ) ) {
				newInstance = schema.getFactoryNmTokensDef().newBuff();
			}
			else if( classCode.equals( "a82f" ) ) {
				newInstance = schema.getFactoryNmTokensType().newBuff();
			}
			else if( classCode.equals( "a87c" ) ) {
				newInstance = schema.getFactoryNmTokensCol().newBuff();
			}
			else if( classCode.equals( "a830" ) ) {
				newInstance = schema.getFactoryNumberDef().newBuff();
			}
			else if( classCode.equals( "a831" ) ) {
				newInstance = schema.getFactoryNumberType().newBuff();
			}
			else if( classCode.equals( "a87d" ) ) {
				newInstance = schema.getFactoryNumberCol().newBuff();
			}
			else if( classCode.equals( "a83b" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Def().newBuff();
			}
			else if( classCode.equals( "a83c" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Col().newBuff();
			}
			else if( classCode.equals( "a83d" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Type().newBuff();
			}
			else if( classCode.equals( "a83e" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Gen().newBuff();
			}
			else if( classCode.equals( "a83f" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Def().newBuff();
			}
			else if( classCode.equals( "a840" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Col().newBuff();
			}
			else if( classCode.equals( "a841" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Type().newBuff();
			}
			else if( classCode.equals( "a842" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Gen().newBuff();
			}
			else if( classCode.equals( "a843" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Def().newBuff();
			}
			else if( classCode.equals( "a844" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Col().newBuff();
			}
			else if( classCode.equals( "a845" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Type().newBuff();
			}
			else if( classCode.equals( "a846" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Gen().newBuff();
			}
			else if( classCode.equals( "a847" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Def().newBuff();
			}
			else if( classCode.equals( "a848" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Col().newBuff();
			}
			else if( classCode.equals( "a849" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Type().newBuff();
			}
			else if( classCode.equals( "a84a" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Gen().newBuff();
			}
			else if( classCode.equals( "a84b" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Def().newBuff();
			}
			else if( classCode.equals( "a84c" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Col().newBuff();
			}
			else if( classCode.equals( "a84d" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Type().newBuff();
			}
			else if( classCode.equals( "a84e" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Gen().newBuff();
			}
			else if( classCode.equals( "a84f" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Def().newBuff();
			}
			else if( classCode.equals( "a850" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Col().newBuff();
			}
			else if( classCode.equals( "a851" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Type().newBuff();
			}
			else if( classCode.equals( "a852" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Gen().newBuff();
			}
			else if( classCode.equals( "a853" ) ) {
				newInstance = schema.getFactoryStringDef().newBuff();
			}
			else if( classCode.equals( "a854" ) ) {
				newInstance = schema.getFactoryStringType().newBuff();
			}
			else if( classCode.equals( "a87e" ) ) {
				newInstance = schema.getFactoryStringCol().newBuff();
			}
			else if( classCode.equals( "a855" ) ) {
				newInstance = schema.getFactoryTZDateDef().newBuff();
			}
			else if( classCode.equals( "a856" ) ) {
				newInstance = schema.getFactoryTZDateType().newBuff();
			}
			else if( classCode.equals( "a87f" ) ) {
				newInstance = schema.getFactoryTZDateCol().newBuff();
			}
			else if( classCode.equals( "a857" ) ) {
				newInstance = schema.getFactoryTZTimeDef().newBuff();
			}
			else if( classCode.equals( "a858" ) ) {
				newInstance = schema.getFactoryTZTimeType().newBuff();
			}
			else if( classCode.equals( "a880" ) ) {
				newInstance = schema.getFactoryTZTimeCol().newBuff();
			}
			else if( classCode.equals( "a859" ) ) {
				newInstance = schema.getFactoryTZTimestampDef().newBuff();
			}
			else if( classCode.equals( "a85a" ) ) {
				newInstance = schema.getFactoryTZTimestampType().newBuff();
			}
			else if( classCode.equals( "a881" ) ) {
				newInstance = schema.getFactoryTZTimestampCol().newBuff();
			}
			else if( classCode.equals( "a85c" ) ) {
				newInstance = schema.getFactoryTextDef().newBuff();
			}
			else if( classCode.equals( "a85d" ) ) {
				newInstance = schema.getFactoryTextType().newBuff();
			}
			else if( classCode.equals( "a882" ) ) {
				newInstance = schema.getFactoryTextCol().newBuff();
			}
			else if( classCode.equals( "a85e" ) ) {
				newInstance = schema.getFactoryTimeDef().newBuff();
			}
			else if( classCode.equals( "a85f" ) ) {
				newInstance = schema.getFactoryTimeType().newBuff();
			}
			else if( classCode.equals( "a883" ) ) {
				newInstance = schema.getFactoryTimeCol().newBuff();
			}
			else if( classCode.equals( "a860" ) ) {
				newInstance = schema.getFactoryTimestampDef().newBuff();
			}
			else if( classCode.equals( "a861" ) ) {
				newInstance = schema.getFactoryTimestampType().newBuff();
			}
			else if( classCode.equals( "a884" ) ) {
				newInstance = schema.getFactoryTimestampCol().newBuff();
			}
			else if( classCode.equals( "a862" ) ) {
				newInstance = schema.getFactoryTokenDef().newBuff();
			}
			else if( classCode.equals( "a863" ) ) {
				newInstance = schema.getFactoryTokenType().newBuff();
			}
			else if( classCode.equals( "a885" ) ) {
				newInstance = schema.getFactoryTokenCol().newBuff();
			}
			else if( classCode.equals( "a864" ) ) {
				newInstance = schema.getFactoryUInt16Def().newBuff();
			}
			else if( classCode.equals( "a865" ) ) {
				newInstance = schema.getFactoryUInt16Type().newBuff();
			}
			else if( classCode.equals( "a886" ) ) {
				newInstance = schema.getFactoryUInt16Col().newBuff();
			}
			else if( classCode.equals( "a866" ) ) {
				newInstance = schema.getFactoryUInt32Def().newBuff();
			}
			else if( classCode.equals( "a867" ) ) {
				newInstance = schema.getFactoryUInt32Type().newBuff();
			}
			else if( classCode.equals( "a887" ) ) {
				newInstance = schema.getFactoryUInt32Col().newBuff();
			}
			else if( classCode.equals( "a868" ) ) {
				newInstance = schema.getFactoryUInt64Def().newBuff();
			}
			else if( classCode.equals( "a869" ) ) {
				newInstance = schema.getFactoryUInt64Type().newBuff();
			}
			else if( classCode.equals( "a888" ) ) {
				newInstance = schema.getFactoryUInt64Col().newBuff();
			}
			else if( classCode.equals( "a86a" ) ) {
				newInstance = schema.getFactoryUuidDef().newBuff();
			}
			else if( classCode.equals( "a86c" ) ) {
				newInstance = schema.getFactoryUuidType().newBuff();
			}
			else if( classCode.equals( "a88b" ) ) {
				newInstance = schema.getFactoryUuidGen().newBuff();
			}
			else if( classCode.equals( "a889" ) ) {
				newInstance = schema.getFactoryUuidCol().newBuff();
			}
			else if( classCode.equals( "a86b" ) ) {
				newInstance = schema.getFactoryUuid6Def().newBuff();
			}
			else if( classCode.equals( "a86d" ) ) {
				newInstance = schema.getFactoryUuid6Type().newBuff();
			}
			else if( classCode.equals( "a88c" ) ) {
				newInstance = schema.getFactoryUuid6Gen().newBuff();
			}
			else if( classCode.equals( "a88a" ) ) {
				newInstance = schema.getFactoryUuid6Col().newBuff();
			}
			else if( classCode.equals( "a85b" ) ) {
				newInstance = schema.getFactoryTableCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editGrandnext = newInstance;
			editGrandnext.set( grandnext );
		}

		YCFBamValueBuff editPrev = null;
		if( prev != null ) {
			classCode = prev.getClassCode();
			if( classCode.equals( "a80c" ) ) {
				newInstance = schema.getFactoryValue().newBuff();
			}
			else if( classCode.equals( "a80d" ) ) {
				newInstance = schema.getFactoryAtom().newBuff();
			}
			else if( classCode.equals( "a80e" ) ) {
				newInstance = schema.getFactoryBlobDef().newBuff();
			}
			else if( classCode.equals( "a80f" ) ) {
				newInstance = schema.getFactoryBlobType().newBuff();
			}
			else if( classCode.equals( "a86e" ) ) {
				newInstance = schema.getFactoryBlobCol().newBuff();
			}
			else if( classCode.equals( "a810" ) ) {
				newInstance = schema.getFactoryBoolDef().newBuff();
			}
			else if( classCode.equals( "a811" ) ) {
				newInstance = schema.getFactoryBoolType().newBuff();
			}
			else if( classCode.equals( "a86f" ) ) {
				newInstance = schema.getFactoryBoolCol().newBuff();
			}
			else if( classCode.equals( "a818" ) ) {
				newInstance = schema.getFactoryDateDef().newBuff();
			}
			else if( classCode.equals( "a819" ) ) {
				newInstance = schema.getFactoryDateType().newBuff();
			}
			else if( classCode.equals( "a870" ) ) {
				newInstance = schema.getFactoryDateCol().newBuff();
			}
			else if( classCode.equals( "a81f" ) ) {
				newInstance = schema.getFactoryDoubleDef().newBuff();
			}
			else if( classCode.equals( "a820" ) ) {
				newInstance = schema.getFactoryDoubleType().newBuff();
			}
			else if( classCode.equals( "a871" ) ) {
				newInstance = schema.getFactoryDoubleCol().newBuff();
			}
			else if( classCode.equals( "a822" ) ) {
				newInstance = schema.getFactoryFloatDef().newBuff();
			}
			else if( classCode.equals( "a823" ) ) {
				newInstance = schema.getFactoryFloatType().newBuff();
			}
			else if( classCode.equals( "a874" ) ) {
				newInstance = schema.getFactoryFloatCol().newBuff();
			}
			else if( classCode.equals( "a826" ) ) {
				newInstance = schema.getFactoryInt16Def().newBuff();
			}
			else if( classCode.equals( "a827" ) ) {
				newInstance = schema.getFactoryInt16Type().newBuff();
			}
			else if( classCode.equals( "a875" ) ) {
				newInstance = schema.getFactoryId16Gen().newBuff();
			}
			else if( classCode.equals( "a872" ) ) {
				newInstance = schema.getFactoryEnumDef().newBuff();
			}
			else if( classCode.equals( "a873" ) ) {
				newInstance = schema.getFactoryEnumType().newBuff();
			}
			else if( classCode.equals( "a878" ) ) {
				newInstance = schema.getFactoryInt16Col().newBuff();
			}
			else if( classCode.equals( "a828" ) ) {
				newInstance = schema.getFactoryInt32Def().newBuff();
			}
			else if( classCode.equals( "a829" ) ) {
				newInstance = schema.getFactoryInt32Type().newBuff();
			}
			else if( classCode.equals( "a876" ) ) {
				newInstance = schema.getFactoryId32Gen().newBuff();
			}
			else if( classCode.equals( "a879" ) ) {
				newInstance = schema.getFactoryInt32Col().newBuff();
			}
			else if( classCode.equals( "a82a" ) ) {
				newInstance = schema.getFactoryInt64Def().newBuff();
			}
			else if( classCode.equals( "a82b" ) ) {
				newInstance = schema.getFactoryInt64Type().newBuff();
			}
			else if( classCode.equals( "a877" ) ) {
				newInstance = schema.getFactoryId64Gen().newBuff();
			}
			else if( classCode.equals( "a87a" ) ) {
				newInstance = schema.getFactoryInt64Col().newBuff();
			}
			else if( classCode.equals( "a82c" ) ) {
				newInstance = schema.getFactoryNmTokenDef().newBuff();
			}
			else if( classCode.equals( "a82d" ) ) {
				newInstance = schema.getFactoryNmTokenType().newBuff();
			}
			else if( classCode.equals( "a87b" ) ) {
				newInstance = schema.getFactoryNmTokenCol().newBuff();
			}
			else if( classCode.equals( "a82e" ) ) {
				newInstance = schema.getFactoryNmTokensDef().newBuff();
			}
			else if( classCode.equals( "a82f" ) ) {
				newInstance = schema.getFactoryNmTokensType().newBuff();
			}
			else if( classCode.equals( "a87c" ) ) {
				newInstance = schema.getFactoryNmTokensCol().newBuff();
			}
			else if( classCode.equals( "a830" ) ) {
				newInstance = schema.getFactoryNumberDef().newBuff();
			}
			else if( classCode.equals( "a831" ) ) {
				newInstance = schema.getFactoryNumberType().newBuff();
			}
			else if( classCode.equals( "a87d" ) ) {
				newInstance = schema.getFactoryNumberCol().newBuff();
			}
			else if( classCode.equals( "a83b" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Def().newBuff();
			}
			else if( classCode.equals( "a83c" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Col().newBuff();
			}
			else if( classCode.equals( "a83d" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Type().newBuff();
			}
			else if( classCode.equals( "a83e" ) ) {
				newInstance = schema.getFactoryDbKeyHash128Gen().newBuff();
			}
			else if( classCode.equals( "a83f" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Def().newBuff();
			}
			else if( classCode.equals( "a840" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Col().newBuff();
			}
			else if( classCode.equals( "a841" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Type().newBuff();
			}
			else if( classCode.equals( "a842" ) ) {
				newInstance = schema.getFactoryDbKeyHash160Gen().newBuff();
			}
			else if( classCode.equals( "a843" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Def().newBuff();
			}
			else if( classCode.equals( "a844" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Col().newBuff();
			}
			else if( classCode.equals( "a845" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Type().newBuff();
			}
			else if( classCode.equals( "a846" ) ) {
				newInstance = schema.getFactoryDbKeyHash224Gen().newBuff();
			}
			else if( classCode.equals( "a847" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Def().newBuff();
			}
			else if( classCode.equals( "a848" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Col().newBuff();
			}
			else if( classCode.equals( "a849" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Type().newBuff();
			}
			else if( classCode.equals( "a84a" ) ) {
				newInstance = schema.getFactoryDbKeyHash256Gen().newBuff();
			}
			else if( classCode.equals( "a84b" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Def().newBuff();
			}
			else if( classCode.equals( "a84c" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Col().newBuff();
			}
			else if( classCode.equals( "a84d" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Type().newBuff();
			}
			else if( classCode.equals( "a84e" ) ) {
				newInstance = schema.getFactoryDbKeyHash384Gen().newBuff();
			}
			else if( classCode.equals( "a84f" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Def().newBuff();
			}
			else if( classCode.equals( "a850" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Col().newBuff();
			}
			else if( classCode.equals( "a851" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Type().newBuff();
			}
			else if( classCode.equals( "a852" ) ) {
				newInstance = schema.getFactoryDbKeyHash512Gen().newBuff();
			}
			else if( classCode.equals( "a853" ) ) {
				newInstance = schema.getFactoryStringDef().newBuff();
			}
			else if( classCode.equals( "a854" ) ) {
				newInstance = schema.getFactoryStringType().newBuff();
			}
			else if( classCode.equals( "a87e" ) ) {
				newInstance = schema.getFactoryStringCol().newBuff();
			}
			else if( classCode.equals( "a855" ) ) {
				newInstance = schema.getFactoryTZDateDef().newBuff();
			}
			else if( classCode.equals( "a856" ) ) {
				newInstance = schema.getFactoryTZDateType().newBuff();
			}
			else if( classCode.equals( "a87f" ) ) {
				newInstance = schema.getFactoryTZDateCol().newBuff();
			}
			else if( classCode.equals( "a857" ) ) {
				newInstance = schema.getFactoryTZTimeDef().newBuff();
			}
			else if( classCode.equals( "a858" ) ) {
				newInstance = schema.getFactoryTZTimeType().newBuff();
			}
			else if( classCode.equals( "a880" ) ) {
				newInstance = schema.getFactoryTZTimeCol().newBuff();
			}
			else if( classCode.equals( "a859" ) ) {
				newInstance = schema.getFactoryTZTimestampDef().newBuff();
			}
			else if( classCode.equals( "a85a" ) ) {
				newInstance = schema.getFactoryTZTimestampType().newBuff();
			}
			else if( classCode.equals( "a881" ) ) {
				newInstance = schema.getFactoryTZTimestampCol().newBuff();
			}
			else if( classCode.equals( "a85c" ) ) {
				newInstance = schema.getFactoryTextDef().newBuff();
			}
			else if( classCode.equals( "a85d" ) ) {
				newInstance = schema.getFactoryTextType().newBuff();
			}
			else if( classCode.equals( "a882" ) ) {
				newInstance = schema.getFactoryTextCol().newBuff();
			}
			else if( classCode.equals( "a85e" ) ) {
				newInstance = schema.getFactoryTimeDef().newBuff();
			}
			else if( classCode.equals( "a85f" ) ) {
				newInstance = schema.getFactoryTimeType().newBuff();
			}
			else if( classCode.equals( "a883" ) ) {
				newInstance = schema.getFactoryTimeCol().newBuff();
			}
			else if( classCode.equals( "a860" ) ) {
				newInstance = schema.getFactoryTimestampDef().newBuff();
			}
			else if( classCode.equals( "a861" ) ) {
				newInstance = schema.getFactoryTimestampType().newBuff();
			}
			else if( classCode.equals( "a884" ) ) {
				newInstance = schema.getFactoryTimestampCol().newBuff();
			}
			else if( classCode.equals( "a862" ) ) {
				newInstance = schema.getFactoryTokenDef().newBuff();
			}
			else if( classCode.equals( "a863" ) ) {
				newInstance = schema.getFactoryTokenType().newBuff();
			}
			else if( classCode.equals( "a885" ) ) {
				newInstance = schema.getFactoryTokenCol().newBuff();
			}
			else if( classCode.equals( "a864" ) ) {
				newInstance = schema.getFactoryUInt16Def().newBuff();
			}
			else if( classCode.equals( "a865" ) ) {
				newInstance = schema.getFactoryUInt16Type().newBuff();
			}
			else if( classCode.equals( "a886" ) ) {
				newInstance = schema.getFactoryUInt16Col().newBuff();
			}
			else if( classCode.equals( "a866" ) ) {
				newInstance = schema.getFactoryUInt32Def().newBuff();
			}
			else if( classCode.equals( "a867" ) ) {
				newInstance = schema.getFactoryUInt32Type().newBuff();
			}
			else if( classCode.equals( "a887" ) ) {
				newInstance = schema.getFactoryUInt32Col().newBuff();
			}
			else if( classCode.equals( "a868" ) ) {
				newInstance = schema.getFactoryUInt64Def().newBuff();
			}
			else if( classCode.equals( "a869" ) ) {
				newInstance = schema.getFactoryUInt64Type().newBuff();
			}
			else if( classCode.equals( "a888" ) ) {
				newInstance = schema.getFactoryUInt64Col().newBuff();
			}
			else if( classCode.equals( "a86a" ) ) {
				newInstance = schema.getFactoryUuidDef().newBuff();
			}
			else if( classCode.equals( "a86c" ) ) {
				newInstance = schema.getFactoryUuidType().newBuff();
			}
			else if( classCode.equals( "a88b" ) ) {
				newInstance = schema.getFactoryUuidGen().newBuff();
			}
			else if( classCode.equals( "a889" ) ) {
				newInstance = schema.getFactoryUuidCol().newBuff();
			}
			else if( classCode.equals( "a86b" ) ) {
				newInstance = schema.getFactoryUuid6Def().newBuff();
			}
			else if( classCode.equals( "a86d" ) ) {
				newInstance = schema.getFactoryUuid6Type().newBuff();
			}
			else if( classCode.equals( "a88c" ) ) {
				newInstance = schema.getFactoryUuid6Gen().newBuff();
			}
			else if( classCode.equals( "a88a" ) ) {
				newInstance = schema.getFactoryUuid6Col().newBuff();
			}
			else if( classCode.equals( "a85b" ) ) {
				newInstance = schema.getFactoryTableCol().newBuff();
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
			if( classCode.equals( "a80c" ) ) {
				schema.getTableValue().updateValue( Authorization, editPrev );
			}
			else if( classCode.equals( "a80d" ) ) {
				schema.getTableAtom().updateAtom( Authorization, (YCFBamAtomBuff)editPrev );
			}
			else if( classCode.equals( "a80e" ) ) {
				schema.getTableBlobDef().updateBlobDef( Authorization, (YCFBamBlobDefBuff)editPrev );
			}
			else if( classCode.equals( "a80f" ) ) {
				schema.getTableBlobType().updateBlobType( Authorization, (YCFBamBlobTypeBuff)editPrev );
			}
			else if( classCode.equals( "a86e" ) ) {
				schema.getTableBlobCol().updateBlobCol( Authorization, (YCFBamBlobColBuff)editPrev );
			}
			else if( classCode.equals( "a810" ) ) {
				schema.getTableBoolDef().updateBoolDef( Authorization, (YCFBamBoolDefBuff)editPrev );
			}
			else if( classCode.equals( "a811" ) ) {
				schema.getTableBoolType().updateBoolType( Authorization, (YCFBamBoolTypeBuff)editPrev );
			}
			else if( classCode.equals( "a86f" ) ) {
				schema.getTableBoolCol().updateBoolCol( Authorization, (YCFBamBoolColBuff)editPrev );
			}
			else if( classCode.equals( "a818" ) ) {
				schema.getTableDateDef().updateDateDef( Authorization, (YCFBamDateDefBuff)editPrev );
			}
			else if( classCode.equals( "a819" ) ) {
				schema.getTableDateType().updateDateType( Authorization, (YCFBamDateTypeBuff)editPrev );
			}
			else if( classCode.equals( "a870" ) ) {
				schema.getTableDateCol().updateDateCol( Authorization, (YCFBamDateColBuff)editPrev );
			}
			else if( classCode.equals( "a81f" ) ) {
				schema.getTableDoubleDef().updateDoubleDef( Authorization, (YCFBamDoubleDefBuff)editPrev );
			}
			else if( classCode.equals( "a820" ) ) {
				schema.getTableDoubleType().updateDoubleType( Authorization, (YCFBamDoubleTypeBuff)editPrev );
			}
			else if( classCode.equals( "a871" ) ) {
				schema.getTableDoubleCol().updateDoubleCol( Authorization, (YCFBamDoubleColBuff)editPrev );
			}
			else if( classCode.equals( "a822" ) ) {
				schema.getTableFloatDef().updateFloatDef( Authorization, (YCFBamFloatDefBuff)editPrev );
			}
			else if( classCode.equals( "a823" ) ) {
				schema.getTableFloatType().updateFloatType( Authorization, (YCFBamFloatTypeBuff)editPrev );
			}
			else if( classCode.equals( "a874" ) ) {
				schema.getTableFloatCol().updateFloatCol( Authorization, (YCFBamFloatColBuff)editPrev );
			}
			else if( classCode.equals( "a826" ) ) {
				schema.getTableInt16Def().updateInt16Def( Authorization, (YCFBamInt16DefBuff)editPrev );
			}
			else if( classCode.equals( "a827" ) ) {
				schema.getTableInt16Type().updateInt16Type( Authorization, (YCFBamInt16TypeBuff)editPrev );
			}
			else if( classCode.equals( "a875" ) ) {
				schema.getTableId16Gen().updateId16Gen( Authorization, (YCFBamId16GenBuff)editPrev );
			}
			else if( classCode.equals( "a872" ) ) {
				schema.getTableEnumDef().updateEnumDef( Authorization, (YCFBamEnumDefBuff)editPrev );
			}
			else if( classCode.equals( "a873" ) ) {
				schema.getTableEnumType().updateEnumType( Authorization, (YCFBamEnumTypeBuff)editPrev );
			}
			else if( classCode.equals( "a878" ) ) {
				schema.getTableInt16Col().updateInt16Col( Authorization, (YCFBamInt16ColBuff)editPrev );
			}
			else if( classCode.equals( "a828" ) ) {
				schema.getTableInt32Def().updateInt32Def( Authorization, (YCFBamInt32DefBuff)editPrev );
			}
			else if( classCode.equals( "a829" ) ) {
				schema.getTableInt32Type().updateInt32Type( Authorization, (YCFBamInt32TypeBuff)editPrev );
			}
			else if( classCode.equals( "a876" ) ) {
				schema.getTableId32Gen().updateId32Gen( Authorization, (YCFBamId32GenBuff)editPrev );
			}
			else if( classCode.equals( "a879" ) ) {
				schema.getTableInt32Col().updateInt32Col( Authorization, (YCFBamInt32ColBuff)editPrev );
			}
			else if( classCode.equals( "a82a" ) ) {
				schema.getTableInt64Def().updateInt64Def( Authorization, (YCFBamInt64DefBuff)editPrev );
			}
			else if( classCode.equals( "a82b" ) ) {
				schema.getTableInt64Type().updateInt64Type( Authorization, (YCFBamInt64TypeBuff)editPrev );
			}
			else if( classCode.equals( "a877" ) ) {
				schema.getTableId64Gen().updateId64Gen( Authorization, (YCFBamId64GenBuff)editPrev );
			}
			else if( classCode.equals( "a87a" ) ) {
				schema.getTableInt64Col().updateInt64Col( Authorization, (YCFBamInt64ColBuff)editPrev );
			}
			else if( classCode.equals( "a82c" ) ) {
				schema.getTableNmTokenDef().updateNmTokenDef( Authorization, (YCFBamNmTokenDefBuff)editPrev );
			}
			else if( classCode.equals( "a82d" ) ) {
				schema.getTableNmTokenType().updateNmTokenType( Authorization, (YCFBamNmTokenTypeBuff)editPrev );
			}
			else if( classCode.equals( "a87b" ) ) {
				schema.getTableNmTokenCol().updateNmTokenCol( Authorization, (YCFBamNmTokenColBuff)editPrev );
			}
			else if( classCode.equals( "a82e" ) ) {
				schema.getTableNmTokensDef().updateNmTokensDef( Authorization, (YCFBamNmTokensDefBuff)editPrev );
			}
			else if( classCode.equals( "a82f" ) ) {
				schema.getTableNmTokensType().updateNmTokensType( Authorization, (YCFBamNmTokensTypeBuff)editPrev );
			}
			else if( classCode.equals( "a87c" ) ) {
				schema.getTableNmTokensCol().updateNmTokensCol( Authorization, (YCFBamNmTokensColBuff)editPrev );
			}
			else if( classCode.equals( "a830" ) ) {
				schema.getTableNumberDef().updateNumberDef( Authorization, (YCFBamNumberDefBuff)editPrev );
			}
			else if( classCode.equals( "a831" ) ) {
				schema.getTableNumberType().updateNumberType( Authorization, (YCFBamNumberTypeBuff)editPrev );
			}
			else if( classCode.equals( "a87d" ) ) {
				schema.getTableNumberCol().updateNumberCol( Authorization, (YCFBamNumberColBuff)editPrev );
			}
			else if( classCode.equals( "a83b" ) ) {
				schema.getTableDbKeyHash128Def().updateDbKeyHash128Def( Authorization, (YCFBamDbKeyHash128DefBuff)editPrev );
			}
			else if( classCode.equals( "a83c" ) ) {
				schema.getTableDbKeyHash128Col().updateDbKeyHash128Col( Authorization, (YCFBamDbKeyHash128ColBuff)editPrev );
			}
			else if( classCode.equals( "a83d" ) ) {
				schema.getTableDbKeyHash128Type().updateDbKeyHash128Type( Authorization, (YCFBamDbKeyHash128TypeBuff)editPrev );
			}
			else if( classCode.equals( "a83e" ) ) {
				schema.getTableDbKeyHash128Gen().updateDbKeyHash128Gen( Authorization, (YCFBamDbKeyHash128GenBuff)editPrev );
			}
			else if( classCode.equals( "a83f" ) ) {
				schema.getTableDbKeyHash160Def().updateDbKeyHash160Def( Authorization, (YCFBamDbKeyHash160DefBuff)editPrev );
			}
			else if( classCode.equals( "a840" ) ) {
				schema.getTableDbKeyHash160Col().updateDbKeyHash160Col( Authorization, (YCFBamDbKeyHash160ColBuff)editPrev );
			}
			else if( classCode.equals( "a841" ) ) {
				schema.getTableDbKeyHash160Type().updateDbKeyHash160Type( Authorization, (YCFBamDbKeyHash160TypeBuff)editPrev );
			}
			else if( classCode.equals( "a842" ) ) {
				schema.getTableDbKeyHash160Gen().updateDbKeyHash160Gen( Authorization, (YCFBamDbKeyHash160GenBuff)editPrev );
			}
			else if( classCode.equals( "a843" ) ) {
				schema.getTableDbKeyHash224Def().updateDbKeyHash224Def( Authorization, (YCFBamDbKeyHash224DefBuff)editPrev );
			}
			else if( classCode.equals( "a844" ) ) {
				schema.getTableDbKeyHash224Col().updateDbKeyHash224Col( Authorization, (YCFBamDbKeyHash224ColBuff)editPrev );
			}
			else if( classCode.equals( "a845" ) ) {
				schema.getTableDbKeyHash224Type().updateDbKeyHash224Type( Authorization, (YCFBamDbKeyHash224TypeBuff)editPrev );
			}
			else if( classCode.equals( "a846" ) ) {
				schema.getTableDbKeyHash224Gen().updateDbKeyHash224Gen( Authorization, (YCFBamDbKeyHash224GenBuff)editPrev );
			}
			else if( classCode.equals( "a847" ) ) {
				schema.getTableDbKeyHash256Def().updateDbKeyHash256Def( Authorization, (YCFBamDbKeyHash256DefBuff)editPrev );
			}
			else if( classCode.equals( "a848" ) ) {
				schema.getTableDbKeyHash256Col().updateDbKeyHash256Col( Authorization, (YCFBamDbKeyHash256ColBuff)editPrev );
			}
			else if( classCode.equals( "a849" ) ) {
				schema.getTableDbKeyHash256Type().updateDbKeyHash256Type( Authorization, (YCFBamDbKeyHash256TypeBuff)editPrev );
			}
			else if( classCode.equals( "a84a" ) ) {
				schema.getTableDbKeyHash256Gen().updateDbKeyHash256Gen( Authorization, (YCFBamDbKeyHash256GenBuff)editPrev );
			}
			else if( classCode.equals( "a84b" ) ) {
				schema.getTableDbKeyHash384Def().updateDbKeyHash384Def( Authorization, (YCFBamDbKeyHash384DefBuff)editPrev );
			}
			else if( classCode.equals( "a84c" ) ) {
				schema.getTableDbKeyHash384Col().updateDbKeyHash384Col( Authorization, (YCFBamDbKeyHash384ColBuff)editPrev );
			}
			else if( classCode.equals( "a84d" ) ) {
				schema.getTableDbKeyHash384Type().updateDbKeyHash384Type( Authorization, (YCFBamDbKeyHash384TypeBuff)editPrev );
			}
			else if( classCode.equals( "a84e" ) ) {
				schema.getTableDbKeyHash384Gen().updateDbKeyHash384Gen( Authorization, (YCFBamDbKeyHash384GenBuff)editPrev );
			}
			else if( classCode.equals( "a84f" ) ) {
				schema.getTableDbKeyHash512Def().updateDbKeyHash512Def( Authorization, (YCFBamDbKeyHash512DefBuff)editPrev );
			}
			else if( classCode.equals( "a850" ) ) {
				schema.getTableDbKeyHash512Col().updateDbKeyHash512Col( Authorization, (YCFBamDbKeyHash512ColBuff)editPrev );
			}
			else if( classCode.equals( "a851" ) ) {
				schema.getTableDbKeyHash512Type().updateDbKeyHash512Type( Authorization, (YCFBamDbKeyHash512TypeBuff)editPrev );
			}
			else if( classCode.equals( "a852" ) ) {
				schema.getTableDbKeyHash512Gen().updateDbKeyHash512Gen( Authorization, (YCFBamDbKeyHash512GenBuff)editPrev );
			}
			else if( classCode.equals( "a853" ) ) {
				schema.getTableStringDef().updateStringDef( Authorization, (YCFBamStringDefBuff)editPrev );
			}
			else if( classCode.equals( "a854" ) ) {
				schema.getTableStringType().updateStringType( Authorization, (YCFBamStringTypeBuff)editPrev );
			}
			else if( classCode.equals( "a87e" ) ) {
				schema.getTableStringCol().updateStringCol( Authorization, (YCFBamStringColBuff)editPrev );
			}
			else if( classCode.equals( "a855" ) ) {
				schema.getTableTZDateDef().updateTZDateDef( Authorization, (YCFBamTZDateDefBuff)editPrev );
			}
			else if( classCode.equals( "a856" ) ) {
				schema.getTableTZDateType().updateTZDateType( Authorization, (YCFBamTZDateTypeBuff)editPrev );
			}
			else if( classCode.equals( "a87f" ) ) {
				schema.getTableTZDateCol().updateTZDateCol( Authorization, (YCFBamTZDateColBuff)editPrev );
			}
			else if( classCode.equals( "a857" ) ) {
				schema.getTableTZTimeDef().updateTZTimeDef( Authorization, (YCFBamTZTimeDefBuff)editPrev );
			}
			else if( classCode.equals( "a858" ) ) {
				schema.getTableTZTimeType().updateTZTimeType( Authorization, (YCFBamTZTimeTypeBuff)editPrev );
			}
			else if( classCode.equals( "a880" ) ) {
				schema.getTableTZTimeCol().updateTZTimeCol( Authorization, (YCFBamTZTimeColBuff)editPrev );
			}
			else if( classCode.equals( "a859" ) ) {
				schema.getTableTZTimestampDef().updateTZTimestampDef( Authorization, (YCFBamTZTimestampDefBuff)editPrev );
			}
			else if( classCode.equals( "a85a" ) ) {
				schema.getTableTZTimestampType().updateTZTimestampType( Authorization, (YCFBamTZTimestampTypeBuff)editPrev );
			}
			else if( classCode.equals( "a881" ) ) {
				schema.getTableTZTimestampCol().updateTZTimestampCol( Authorization, (YCFBamTZTimestampColBuff)editPrev );
			}
			else if( classCode.equals( "a85c" ) ) {
				schema.getTableTextDef().updateTextDef( Authorization, (YCFBamTextDefBuff)editPrev );
			}
			else if( classCode.equals( "a85d" ) ) {
				schema.getTableTextType().updateTextType( Authorization, (YCFBamTextTypeBuff)editPrev );
			}
			else if( classCode.equals( "a882" ) ) {
				schema.getTableTextCol().updateTextCol( Authorization, (YCFBamTextColBuff)editPrev );
			}
			else if( classCode.equals( "a85e" ) ) {
				schema.getTableTimeDef().updateTimeDef( Authorization, (YCFBamTimeDefBuff)editPrev );
			}
			else if( classCode.equals( "a85f" ) ) {
				schema.getTableTimeType().updateTimeType( Authorization, (YCFBamTimeTypeBuff)editPrev );
			}
			else if( classCode.equals( "a883" ) ) {
				schema.getTableTimeCol().updateTimeCol( Authorization, (YCFBamTimeColBuff)editPrev );
			}
			else if( classCode.equals( "a860" ) ) {
				schema.getTableTimestampDef().updateTimestampDef( Authorization, (YCFBamTimestampDefBuff)editPrev );
			}
			else if( classCode.equals( "a861" ) ) {
				schema.getTableTimestampType().updateTimestampType( Authorization, (YCFBamTimestampTypeBuff)editPrev );
			}
			else if( classCode.equals( "a884" ) ) {
				schema.getTableTimestampCol().updateTimestampCol( Authorization, (YCFBamTimestampColBuff)editPrev );
			}
			else if( classCode.equals( "a862" ) ) {
				schema.getTableTokenDef().updateTokenDef( Authorization, (YCFBamTokenDefBuff)editPrev );
			}
			else if( classCode.equals( "a863" ) ) {
				schema.getTableTokenType().updateTokenType( Authorization, (YCFBamTokenTypeBuff)editPrev );
			}
			else if( classCode.equals( "a885" ) ) {
				schema.getTableTokenCol().updateTokenCol( Authorization, (YCFBamTokenColBuff)editPrev );
			}
			else if( classCode.equals( "a864" ) ) {
				schema.getTableUInt16Def().updateUInt16Def( Authorization, (YCFBamUInt16DefBuff)editPrev );
			}
			else if( classCode.equals( "a865" ) ) {
				schema.getTableUInt16Type().updateUInt16Type( Authorization, (YCFBamUInt16TypeBuff)editPrev );
			}
			else if( classCode.equals( "a886" ) ) {
				schema.getTableUInt16Col().updateUInt16Col( Authorization, (YCFBamUInt16ColBuff)editPrev );
			}
			else if( classCode.equals( "a866" ) ) {
				schema.getTableUInt32Def().updateUInt32Def( Authorization, (YCFBamUInt32DefBuff)editPrev );
			}
			else if( classCode.equals( "a867" ) ) {
				schema.getTableUInt32Type().updateUInt32Type( Authorization, (YCFBamUInt32TypeBuff)editPrev );
			}
			else if( classCode.equals( "a887" ) ) {
				schema.getTableUInt32Col().updateUInt32Col( Authorization, (YCFBamUInt32ColBuff)editPrev );
			}
			else if( classCode.equals( "a868" ) ) {
				schema.getTableUInt64Def().updateUInt64Def( Authorization, (YCFBamUInt64DefBuff)editPrev );
			}
			else if( classCode.equals( "a869" ) ) {
				schema.getTableUInt64Type().updateUInt64Type( Authorization, (YCFBamUInt64TypeBuff)editPrev );
			}
			else if( classCode.equals( "a888" ) ) {
				schema.getTableUInt64Col().updateUInt64Col( Authorization, (YCFBamUInt64ColBuff)editPrev );
			}
			else if( classCode.equals( "a86a" ) ) {
				schema.getTableUuidDef().updateUuidDef( Authorization, (YCFBamUuidDefBuff)editPrev );
			}
			else if( classCode.equals( "a86c" ) ) {
				schema.getTableUuidType().updateUuidType( Authorization, (YCFBamUuidTypeBuff)editPrev );
			}
			else if( classCode.equals( "a88b" ) ) {
				schema.getTableUuidGen().updateUuidGen( Authorization, (YCFBamUuidGenBuff)editPrev );
			}
			else if( classCode.equals( "a889" ) ) {
				schema.getTableUuidCol().updateUuidCol( Authorization, (YCFBamUuidColBuff)editPrev );
			}
			else if( classCode.equals( "a86b" ) ) {
				schema.getTableUuid6Def().updateUuid6Def( Authorization, (YCFBamUuid6DefBuff)editPrev );
			}
			else if( classCode.equals( "a86d" ) ) {
				schema.getTableUuid6Type().updateUuid6Type( Authorization, (YCFBamUuid6TypeBuff)editPrev );
			}
			else if( classCode.equals( "a88c" ) ) {
				schema.getTableUuid6Gen().updateUuid6Gen( Authorization, (YCFBamUuid6GenBuff)editPrev );
			}
			else if( classCode.equals( "a88a" ) ) {
				schema.getTableUuid6Col().updateUuid6Col( Authorization, (YCFBamUuid6ColBuff)editPrev );
			}
			else if( classCode.equals( "a85b" ) ) {
				schema.getTableTableCol().updateTableCol( Authorization, (YCFBamTableColBuff)editPrev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		classCode = editCur.getClassCode();
			if( classCode.equals( "a80c" ) ) {
				schema.getTableValue().updateValue( Authorization, editCur );
			}
			else if( classCode.equals( "a80d" ) ) {
				schema.getTableAtom().updateAtom( Authorization, (YCFBamAtomBuff)editCur );
			}
			else if( classCode.equals( "a80e" ) ) {
				schema.getTableBlobDef().updateBlobDef( Authorization, (YCFBamBlobDefBuff)editCur );
			}
			else if( classCode.equals( "a80f" ) ) {
				schema.getTableBlobType().updateBlobType( Authorization, (YCFBamBlobTypeBuff)editCur );
			}
			else if( classCode.equals( "a86e" ) ) {
				schema.getTableBlobCol().updateBlobCol( Authorization, (YCFBamBlobColBuff)editCur );
			}
			else if( classCode.equals( "a810" ) ) {
				schema.getTableBoolDef().updateBoolDef( Authorization, (YCFBamBoolDefBuff)editCur );
			}
			else if( classCode.equals( "a811" ) ) {
				schema.getTableBoolType().updateBoolType( Authorization, (YCFBamBoolTypeBuff)editCur );
			}
			else if( classCode.equals( "a86f" ) ) {
				schema.getTableBoolCol().updateBoolCol( Authorization, (YCFBamBoolColBuff)editCur );
			}
			else if( classCode.equals( "a818" ) ) {
				schema.getTableDateDef().updateDateDef( Authorization, (YCFBamDateDefBuff)editCur );
			}
			else if( classCode.equals( "a819" ) ) {
				schema.getTableDateType().updateDateType( Authorization, (YCFBamDateTypeBuff)editCur );
			}
			else if( classCode.equals( "a870" ) ) {
				schema.getTableDateCol().updateDateCol( Authorization, (YCFBamDateColBuff)editCur );
			}
			else if( classCode.equals( "a81f" ) ) {
				schema.getTableDoubleDef().updateDoubleDef( Authorization, (YCFBamDoubleDefBuff)editCur );
			}
			else if( classCode.equals( "a820" ) ) {
				schema.getTableDoubleType().updateDoubleType( Authorization, (YCFBamDoubleTypeBuff)editCur );
			}
			else if( classCode.equals( "a871" ) ) {
				schema.getTableDoubleCol().updateDoubleCol( Authorization, (YCFBamDoubleColBuff)editCur );
			}
			else if( classCode.equals( "a822" ) ) {
				schema.getTableFloatDef().updateFloatDef( Authorization, (YCFBamFloatDefBuff)editCur );
			}
			else if( classCode.equals( "a823" ) ) {
				schema.getTableFloatType().updateFloatType( Authorization, (YCFBamFloatTypeBuff)editCur );
			}
			else if( classCode.equals( "a874" ) ) {
				schema.getTableFloatCol().updateFloatCol( Authorization, (YCFBamFloatColBuff)editCur );
			}
			else if( classCode.equals( "a826" ) ) {
				schema.getTableInt16Def().updateInt16Def( Authorization, (YCFBamInt16DefBuff)editCur );
			}
			else if( classCode.equals( "a827" ) ) {
				schema.getTableInt16Type().updateInt16Type( Authorization, (YCFBamInt16TypeBuff)editCur );
			}
			else if( classCode.equals( "a875" ) ) {
				schema.getTableId16Gen().updateId16Gen( Authorization, (YCFBamId16GenBuff)editCur );
			}
			else if( classCode.equals( "a872" ) ) {
				schema.getTableEnumDef().updateEnumDef( Authorization, (YCFBamEnumDefBuff)editCur );
			}
			else if( classCode.equals( "a873" ) ) {
				schema.getTableEnumType().updateEnumType( Authorization, (YCFBamEnumTypeBuff)editCur );
			}
			else if( classCode.equals( "a878" ) ) {
				schema.getTableInt16Col().updateInt16Col( Authorization, (YCFBamInt16ColBuff)editCur );
			}
			else if( classCode.equals( "a828" ) ) {
				schema.getTableInt32Def().updateInt32Def( Authorization, (YCFBamInt32DefBuff)editCur );
			}
			else if( classCode.equals( "a829" ) ) {
				schema.getTableInt32Type().updateInt32Type( Authorization, (YCFBamInt32TypeBuff)editCur );
			}
			else if( classCode.equals( "a876" ) ) {
				schema.getTableId32Gen().updateId32Gen( Authorization, (YCFBamId32GenBuff)editCur );
			}
			else if( classCode.equals( "a879" ) ) {
				schema.getTableInt32Col().updateInt32Col( Authorization, (YCFBamInt32ColBuff)editCur );
			}
			else if( classCode.equals( "a82a" ) ) {
				schema.getTableInt64Def().updateInt64Def( Authorization, (YCFBamInt64DefBuff)editCur );
			}
			else if( classCode.equals( "a82b" ) ) {
				schema.getTableInt64Type().updateInt64Type( Authorization, (YCFBamInt64TypeBuff)editCur );
			}
			else if( classCode.equals( "a877" ) ) {
				schema.getTableId64Gen().updateId64Gen( Authorization, (YCFBamId64GenBuff)editCur );
			}
			else if( classCode.equals( "a87a" ) ) {
				schema.getTableInt64Col().updateInt64Col( Authorization, (YCFBamInt64ColBuff)editCur );
			}
			else if( classCode.equals( "a82c" ) ) {
				schema.getTableNmTokenDef().updateNmTokenDef( Authorization, (YCFBamNmTokenDefBuff)editCur );
			}
			else if( classCode.equals( "a82d" ) ) {
				schema.getTableNmTokenType().updateNmTokenType( Authorization, (YCFBamNmTokenTypeBuff)editCur );
			}
			else if( classCode.equals( "a87b" ) ) {
				schema.getTableNmTokenCol().updateNmTokenCol( Authorization, (YCFBamNmTokenColBuff)editCur );
			}
			else if( classCode.equals( "a82e" ) ) {
				schema.getTableNmTokensDef().updateNmTokensDef( Authorization, (YCFBamNmTokensDefBuff)editCur );
			}
			else if( classCode.equals( "a82f" ) ) {
				schema.getTableNmTokensType().updateNmTokensType( Authorization, (YCFBamNmTokensTypeBuff)editCur );
			}
			else if( classCode.equals( "a87c" ) ) {
				schema.getTableNmTokensCol().updateNmTokensCol( Authorization, (YCFBamNmTokensColBuff)editCur );
			}
			else if( classCode.equals( "a830" ) ) {
				schema.getTableNumberDef().updateNumberDef( Authorization, (YCFBamNumberDefBuff)editCur );
			}
			else if( classCode.equals( "a831" ) ) {
				schema.getTableNumberType().updateNumberType( Authorization, (YCFBamNumberTypeBuff)editCur );
			}
			else if( classCode.equals( "a87d" ) ) {
				schema.getTableNumberCol().updateNumberCol( Authorization, (YCFBamNumberColBuff)editCur );
			}
			else if( classCode.equals( "a83b" ) ) {
				schema.getTableDbKeyHash128Def().updateDbKeyHash128Def( Authorization, (YCFBamDbKeyHash128DefBuff)editCur );
			}
			else if( classCode.equals( "a83c" ) ) {
				schema.getTableDbKeyHash128Col().updateDbKeyHash128Col( Authorization, (YCFBamDbKeyHash128ColBuff)editCur );
			}
			else if( classCode.equals( "a83d" ) ) {
				schema.getTableDbKeyHash128Type().updateDbKeyHash128Type( Authorization, (YCFBamDbKeyHash128TypeBuff)editCur );
			}
			else if( classCode.equals( "a83e" ) ) {
				schema.getTableDbKeyHash128Gen().updateDbKeyHash128Gen( Authorization, (YCFBamDbKeyHash128GenBuff)editCur );
			}
			else if( classCode.equals( "a83f" ) ) {
				schema.getTableDbKeyHash160Def().updateDbKeyHash160Def( Authorization, (YCFBamDbKeyHash160DefBuff)editCur );
			}
			else if( classCode.equals( "a840" ) ) {
				schema.getTableDbKeyHash160Col().updateDbKeyHash160Col( Authorization, (YCFBamDbKeyHash160ColBuff)editCur );
			}
			else if( classCode.equals( "a841" ) ) {
				schema.getTableDbKeyHash160Type().updateDbKeyHash160Type( Authorization, (YCFBamDbKeyHash160TypeBuff)editCur );
			}
			else if( classCode.equals( "a842" ) ) {
				schema.getTableDbKeyHash160Gen().updateDbKeyHash160Gen( Authorization, (YCFBamDbKeyHash160GenBuff)editCur );
			}
			else if( classCode.equals( "a843" ) ) {
				schema.getTableDbKeyHash224Def().updateDbKeyHash224Def( Authorization, (YCFBamDbKeyHash224DefBuff)editCur );
			}
			else if( classCode.equals( "a844" ) ) {
				schema.getTableDbKeyHash224Col().updateDbKeyHash224Col( Authorization, (YCFBamDbKeyHash224ColBuff)editCur );
			}
			else if( classCode.equals( "a845" ) ) {
				schema.getTableDbKeyHash224Type().updateDbKeyHash224Type( Authorization, (YCFBamDbKeyHash224TypeBuff)editCur );
			}
			else if( classCode.equals( "a846" ) ) {
				schema.getTableDbKeyHash224Gen().updateDbKeyHash224Gen( Authorization, (YCFBamDbKeyHash224GenBuff)editCur );
			}
			else if( classCode.equals( "a847" ) ) {
				schema.getTableDbKeyHash256Def().updateDbKeyHash256Def( Authorization, (YCFBamDbKeyHash256DefBuff)editCur );
			}
			else if( classCode.equals( "a848" ) ) {
				schema.getTableDbKeyHash256Col().updateDbKeyHash256Col( Authorization, (YCFBamDbKeyHash256ColBuff)editCur );
			}
			else if( classCode.equals( "a849" ) ) {
				schema.getTableDbKeyHash256Type().updateDbKeyHash256Type( Authorization, (YCFBamDbKeyHash256TypeBuff)editCur );
			}
			else if( classCode.equals( "a84a" ) ) {
				schema.getTableDbKeyHash256Gen().updateDbKeyHash256Gen( Authorization, (YCFBamDbKeyHash256GenBuff)editCur );
			}
			else if( classCode.equals( "a84b" ) ) {
				schema.getTableDbKeyHash384Def().updateDbKeyHash384Def( Authorization, (YCFBamDbKeyHash384DefBuff)editCur );
			}
			else if( classCode.equals( "a84c" ) ) {
				schema.getTableDbKeyHash384Col().updateDbKeyHash384Col( Authorization, (YCFBamDbKeyHash384ColBuff)editCur );
			}
			else if( classCode.equals( "a84d" ) ) {
				schema.getTableDbKeyHash384Type().updateDbKeyHash384Type( Authorization, (YCFBamDbKeyHash384TypeBuff)editCur );
			}
			else if( classCode.equals( "a84e" ) ) {
				schema.getTableDbKeyHash384Gen().updateDbKeyHash384Gen( Authorization, (YCFBamDbKeyHash384GenBuff)editCur );
			}
			else if( classCode.equals( "a84f" ) ) {
				schema.getTableDbKeyHash512Def().updateDbKeyHash512Def( Authorization, (YCFBamDbKeyHash512DefBuff)editCur );
			}
			else if( classCode.equals( "a850" ) ) {
				schema.getTableDbKeyHash512Col().updateDbKeyHash512Col( Authorization, (YCFBamDbKeyHash512ColBuff)editCur );
			}
			else if( classCode.equals( "a851" ) ) {
				schema.getTableDbKeyHash512Type().updateDbKeyHash512Type( Authorization, (YCFBamDbKeyHash512TypeBuff)editCur );
			}
			else if( classCode.equals( "a852" ) ) {
				schema.getTableDbKeyHash512Gen().updateDbKeyHash512Gen( Authorization, (YCFBamDbKeyHash512GenBuff)editCur );
			}
			else if( classCode.equals( "a853" ) ) {
				schema.getTableStringDef().updateStringDef( Authorization, (YCFBamStringDefBuff)editCur );
			}
			else if( classCode.equals( "a854" ) ) {
				schema.getTableStringType().updateStringType( Authorization, (YCFBamStringTypeBuff)editCur );
			}
			else if( classCode.equals( "a87e" ) ) {
				schema.getTableStringCol().updateStringCol( Authorization, (YCFBamStringColBuff)editCur );
			}
			else if( classCode.equals( "a855" ) ) {
				schema.getTableTZDateDef().updateTZDateDef( Authorization, (YCFBamTZDateDefBuff)editCur );
			}
			else if( classCode.equals( "a856" ) ) {
				schema.getTableTZDateType().updateTZDateType( Authorization, (YCFBamTZDateTypeBuff)editCur );
			}
			else if( classCode.equals( "a87f" ) ) {
				schema.getTableTZDateCol().updateTZDateCol( Authorization, (YCFBamTZDateColBuff)editCur );
			}
			else if( classCode.equals( "a857" ) ) {
				schema.getTableTZTimeDef().updateTZTimeDef( Authorization, (YCFBamTZTimeDefBuff)editCur );
			}
			else if( classCode.equals( "a858" ) ) {
				schema.getTableTZTimeType().updateTZTimeType( Authorization, (YCFBamTZTimeTypeBuff)editCur );
			}
			else if( classCode.equals( "a880" ) ) {
				schema.getTableTZTimeCol().updateTZTimeCol( Authorization, (YCFBamTZTimeColBuff)editCur );
			}
			else if( classCode.equals( "a859" ) ) {
				schema.getTableTZTimestampDef().updateTZTimestampDef( Authorization, (YCFBamTZTimestampDefBuff)editCur );
			}
			else if( classCode.equals( "a85a" ) ) {
				schema.getTableTZTimestampType().updateTZTimestampType( Authorization, (YCFBamTZTimestampTypeBuff)editCur );
			}
			else if( classCode.equals( "a881" ) ) {
				schema.getTableTZTimestampCol().updateTZTimestampCol( Authorization, (YCFBamTZTimestampColBuff)editCur );
			}
			else if( classCode.equals( "a85c" ) ) {
				schema.getTableTextDef().updateTextDef( Authorization, (YCFBamTextDefBuff)editCur );
			}
			else if( classCode.equals( "a85d" ) ) {
				schema.getTableTextType().updateTextType( Authorization, (YCFBamTextTypeBuff)editCur );
			}
			else if( classCode.equals( "a882" ) ) {
				schema.getTableTextCol().updateTextCol( Authorization, (YCFBamTextColBuff)editCur );
			}
			else if( classCode.equals( "a85e" ) ) {
				schema.getTableTimeDef().updateTimeDef( Authorization, (YCFBamTimeDefBuff)editCur );
			}
			else if( classCode.equals( "a85f" ) ) {
				schema.getTableTimeType().updateTimeType( Authorization, (YCFBamTimeTypeBuff)editCur );
			}
			else if( classCode.equals( "a883" ) ) {
				schema.getTableTimeCol().updateTimeCol( Authorization, (YCFBamTimeColBuff)editCur );
			}
			else if( classCode.equals( "a860" ) ) {
				schema.getTableTimestampDef().updateTimestampDef( Authorization, (YCFBamTimestampDefBuff)editCur );
			}
			else if( classCode.equals( "a861" ) ) {
				schema.getTableTimestampType().updateTimestampType( Authorization, (YCFBamTimestampTypeBuff)editCur );
			}
			else if( classCode.equals( "a884" ) ) {
				schema.getTableTimestampCol().updateTimestampCol( Authorization, (YCFBamTimestampColBuff)editCur );
			}
			else if( classCode.equals( "a862" ) ) {
				schema.getTableTokenDef().updateTokenDef( Authorization, (YCFBamTokenDefBuff)editCur );
			}
			else if( classCode.equals( "a863" ) ) {
				schema.getTableTokenType().updateTokenType( Authorization, (YCFBamTokenTypeBuff)editCur );
			}
			else if( classCode.equals( "a885" ) ) {
				schema.getTableTokenCol().updateTokenCol( Authorization, (YCFBamTokenColBuff)editCur );
			}
			else if( classCode.equals( "a864" ) ) {
				schema.getTableUInt16Def().updateUInt16Def( Authorization, (YCFBamUInt16DefBuff)editCur );
			}
			else if( classCode.equals( "a865" ) ) {
				schema.getTableUInt16Type().updateUInt16Type( Authorization, (YCFBamUInt16TypeBuff)editCur );
			}
			else if( classCode.equals( "a886" ) ) {
				schema.getTableUInt16Col().updateUInt16Col( Authorization, (YCFBamUInt16ColBuff)editCur );
			}
			else if( classCode.equals( "a866" ) ) {
				schema.getTableUInt32Def().updateUInt32Def( Authorization, (YCFBamUInt32DefBuff)editCur );
			}
			else if( classCode.equals( "a867" ) ) {
				schema.getTableUInt32Type().updateUInt32Type( Authorization, (YCFBamUInt32TypeBuff)editCur );
			}
			else if( classCode.equals( "a887" ) ) {
				schema.getTableUInt32Col().updateUInt32Col( Authorization, (YCFBamUInt32ColBuff)editCur );
			}
			else if( classCode.equals( "a868" ) ) {
				schema.getTableUInt64Def().updateUInt64Def( Authorization, (YCFBamUInt64DefBuff)editCur );
			}
			else if( classCode.equals( "a869" ) ) {
				schema.getTableUInt64Type().updateUInt64Type( Authorization, (YCFBamUInt64TypeBuff)editCur );
			}
			else if( classCode.equals( "a888" ) ) {
				schema.getTableUInt64Col().updateUInt64Col( Authorization, (YCFBamUInt64ColBuff)editCur );
			}
			else if( classCode.equals( "a86a" ) ) {
				schema.getTableUuidDef().updateUuidDef( Authorization, (YCFBamUuidDefBuff)editCur );
			}
			else if( classCode.equals( "a86c" ) ) {
				schema.getTableUuidType().updateUuidType( Authorization, (YCFBamUuidTypeBuff)editCur );
			}
			else if( classCode.equals( "a88b" ) ) {
				schema.getTableUuidGen().updateUuidGen( Authorization, (YCFBamUuidGenBuff)editCur );
			}
			else if( classCode.equals( "a889" ) ) {
				schema.getTableUuidCol().updateUuidCol( Authorization, (YCFBamUuidColBuff)editCur );
			}
			else if( classCode.equals( "a86b" ) ) {
				schema.getTableUuid6Def().updateUuid6Def( Authorization, (YCFBamUuid6DefBuff)editCur );
			}
			else if( classCode.equals( "a86d" ) ) {
				schema.getTableUuid6Type().updateUuid6Type( Authorization, (YCFBamUuid6TypeBuff)editCur );
			}
			else if( classCode.equals( "a88c" ) ) {
				schema.getTableUuid6Gen().updateUuid6Gen( Authorization, (YCFBamUuid6GenBuff)editCur );
			}
			else if( classCode.equals( "a88a" ) ) {
				schema.getTableUuid6Col().updateUuid6Col( Authorization, (YCFBamUuid6ColBuff)editCur );
			}
			else if( classCode.equals( "a85b" ) ) {
				schema.getTableTableCol().updateTableCol( Authorization, (YCFBamTableColBuff)editCur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		classCode = editNext.getClassCode();
			if( classCode.equals( "a80c" ) ) {
				schema.getTableValue().updateValue( Authorization, editNext );
			}
			else if( classCode.equals( "a80d" ) ) {
				schema.getTableAtom().updateAtom( Authorization, (YCFBamAtomBuff)editNext );
			}
			else if( classCode.equals( "a80e" ) ) {
				schema.getTableBlobDef().updateBlobDef( Authorization, (YCFBamBlobDefBuff)editNext );
			}
			else if( classCode.equals( "a80f" ) ) {
				schema.getTableBlobType().updateBlobType( Authorization, (YCFBamBlobTypeBuff)editNext );
			}
			else if( classCode.equals( "a86e" ) ) {
				schema.getTableBlobCol().updateBlobCol( Authorization, (YCFBamBlobColBuff)editNext );
			}
			else if( classCode.equals( "a810" ) ) {
				schema.getTableBoolDef().updateBoolDef( Authorization, (YCFBamBoolDefBuff)editNext );
			}
			else if( classCode.equals( "a811" ) ) {
				schema.getTableBoolType().updateBoolType( Authorization, (YCFBamBoolTypeBuff)editNext );
			}
			else if( classCode.equals( "a86f" ) ) {
				schema.getTableBoolCol().updateBoolCol( Authorization, (YCFBamBoolColBuff)editNext );
			}
			else if( classCode.equals( "a818" ) ) {
				schema.getTableDateDef().updateDateDef( Authorization, (YCFBamDateDefBuff)editNext );
			}
			else if( classCode.equals( "a819" ) ) {
				schema.getTableDateType().updateDateType( Authorization, (YCFBamDateTypeBuff)editNext );
			}
			else if( classCode.equals( "a870" ) ) {
				schema.getTableDateCol().updateDateCol( Authorization, (YCFBamDateColBuff)editNext );
			}
			else if( classCode.equals( "a81f" ) ) {
				schema.getTableDoubleDef().updateDoubleDef( Authorization, (YCFBamDoubleDefBuff)editNext );
			}
			else if( classCode.equals( "a820" ) ) {
				schema.getTableDoubleType().updateDoubleType( Authorization, (YCFBamDoubleTypeBuff)editNext );
			}
			else if( classCode.equals( "a871" ) ) {
				schema.getTableDoubleCol().updateDoubleCol( Authorization, (YCFBamDoubleColBuff)editNext );
			}
			else if( classCode.equals( "a822" ) ) {
				schema.getTableFloatDef().updateFloatDef( Authorization, (YCFBamFloatDefBuff)editNext );
			}
			else if( classCode.equals( "a823" ) ) {
				schema.getTableFloatType().updateFloatType( Authorization, (YCFBamFloatTypeBuff)editNext );
			}
			else if( classCode.equals( "a874" ) ) {
				schema.getTableFloatCol().updateFloatCol( Authorization, (YCFBamFloatColBuff)editNext );
			}
			else if( classCode.equals( "a826" ) ) {
				schema.getTableInt16Def().updateInt16Def( Authorization, (YCFBamInt16DefBuff)editNext );
			}
			else if( classCode.equals( "a827" ) ) {
				schema.getTableInt16Type().updateInt16Type( Authorization, (YCFBamInt16TypeBuff)editNext );
			}
			else if( classCode.equals( "a875" ) ) {
				schema.getTableId16Gen().updateId16Gen( Authorization, (YCFBamId16GenBuff)editNext );
			}
			else if( classCode.equals( "a872" ) ) {
				schema.getTableEnumDef().updateEnumDef( Authorization, (YCFBamEnumDefBuff)editNext );
			}
			else if( classCode.equals( "a873" ) ) {
				schema.getTableEnumType().updateEnumType( Authorization, (YCFBamEnumTypeBuff)editNext );
			}
			else if( classCode.equals( "a878" ) ) {
				schema.getTableInt16Col().updateInt16Col( Authorization, (YCFBamInt16ColBuff)editNext );
			}
			else if( classCode.equals( "a828" ) ) {
				schema.getTableInt32Def().updateInt32Def( Authorization, (YCFBamInt32DefBuff)editNext );
			}
			else if( classCode.equals( "a829" ) ) {
				schema.getTableInt32Type().updateInt32Type( Authorization, (YCFBamInt32TypeBuff)editNext );
			}
			else if( classCode.equals( "a876" ) ) {
				schema.getTableId32Gen().updateId32Gen( Authorization, (YCFBamId32GenBuff)editNext );
			}
			else if( classCode.equals( "a879" ) ) {
				schema.getTableInt32Col().updateInt32Col( Authorization, (YCFBamInt32ColBuff)editNext );
			}
			else if( classCode.equals( "a82a" ) ) {
				schema.getTableInt64Def().updateInt64Def( Authorization, (YCFBamInt64DefBuff)editNext );
			}
			else if( classCode.equals( "a82b" ) ) {
				schema.getTableInt64Type().updateInt64Type( Authorization, (YCFBamInt64TypeBuff)editNext );
			}
			else if( classCode.equals( "a877" ) ) {
				schema.getTableId64Gen().updateId64Gen( Authorization, (YCFBamId64GenBuff)editNext );
			}
			else if( classCode.equals( "a87a" ) ) {
				schema.getTableInt64Col().updateInt64Col( Authorization, (YCFBamInt64ColBuff)editNext );
			}
			else if( classCode.equals( "a82c" ) ) {
				schema.getTableNmTokenDef().updateNmTokenDef( Authorization, (YCFBamNmTokenDefBuff)editNext );
			}
			else if( classCode.equals( "a82d" ) ) {
				schema.getTableNmTokenType().updateNmTokenType( Authorization, (YCFBamNmTokenTypeBuff)editNext );
			}
			else if( classCode.equals( "a87b" ) ) {
				schema.getTableNmTokenCol().updateNmTokenCol( Authorization, (YCFBamNmTokenColBuff)editNext );
			}
			else if( classCode.equals( "a82e" ) ) {
				schema.getTableNmTokensDef().updateNmTokensDef( Authorization, (YCFBamNmTokensDefBuff)editNext );
			}
			else if( classCode.equals( "a82f" ) ) {
				schema.getTableNmTokensType().updateNmTokensType( Authorization, (YCFBamNmTokensTypeBuff)editNext );
			}
			else if( classCode.equals( "a87c" ) ) {
				schema.getTableNmTokensCol().updateNmTokensCol( Authorization, (YCFBamNmTokensColBuff)editNext );
			}
			else if( classCode.equals( "a830" ) ) {
				schema.getTableNumberDef().updateNumberDef( Authorization, (YCFBamNumberDefBuff)editNext );
			}
			else if( classCode.equals( "a831" ) ) {
				schema.getTableNumberType().updateNumberType( Authorization, (YCFBamNumberTypeBuff)editNext );
			}
			else if( classCode.equals( "a87d" ) ) {
				schema.getTableNumberCol().updateNumberCol( Authorization, (YCFBamNumberColBuff)editNext );
			}
			else if( classCode.equals( "a83b" ) ) {
				schema.getTableDbKeyHash128Def().updateDbKeyHash128Def( Authorization, (YCFBamDbKeyHash128DefBuff)editNext );
			}
			else if( classCode.equals( "a83c" ) ) {
				schema.getTableDbKeyHash128Col().updateDbKeyHash128Col( Authorization, (YCFBamDbKeyHash128ColBuff)editNext );
			}
			else if( classCode.equals( "a83d" ) ) {
				schema.getTableDbKeyHash128Type().updateDbKeyHash128Type( Authorization, (YCFBamDbKeyHash128TypeBuff)editNext );
			}
			else if( classCode.equals( "a83e" ) ) {
				schema.getTableDbKeyHash128Gen().updateDbKeyHash128Gen( Authorization, (YCFBamDbKeyHash128GenBuff)editNext );
			}
			else if( classCode.equals( "a83f" ) ) {
				schema.getTableDbKeyHash160Def().updateDbKeyHash160Def( Authorization, (YCFBamDbKeyHash160DefBuff)editNext );
			}
			else if( classCode.equals( "a840" ) ) {
				schema.getTableDbKeyHash160Col().updateDbKeyHash160Col( Authorization, (YCFBamDbKeyHash160ColBuff)editNext );
			}
			else if( classCode.equals( "a841" ) ) {
				schema.getTableDbKeyHash160Type().updateDbKeyHash160Type( Authorization, (YCFBamDbKeyHash160TypeBuff)editNext );
			}
			else if( classCode.equals( "a842" ) ) {
				schema.getTableDbKeyHash160Gen().updateDbKeyHash160Gen( Authorization, (YCFBamDbKeyHash160GenBuff)editNext );
			}
			else if( classCode.equals( "a843" ) ) {
				schema.getTableDbKeyHash224Def().updateDbKeyHash224Def( Authorization, (YCFBamDbKeyHash224DefBuff)editNext );
			}
			else if( classCode.equals( "a844" ) ) {
				schema.getTableDbKeyHash224Col().updateDbKeyHash224Col( Authorization, (YCFBamDbKeyHash224ColBuff)editNext );
			}
			else if( classCode.equals( "a845" ) ) {
				schema.getTableDbKeyHash224Type().updateDbKeyHash224Type( Authorization, (YCFBamDbKeyHash224TypeBuff)editNext );
			}
			else if( classCode.equals( "a846" ) ) {
				schema.getTableDbKeyHash224Gen().updateDbKeyHash224Gen( Authorization, (YCFBamDbKeyHash224GenBuff)editNext );
			}
			else if( classCode.equals( "a847" ) ) {
				schema.getTableDbKeyHash256Def().updateDbKeyHash256Def( Authorization, (YCFBamDbKeyHash256DefBuff)editNext );
			}
			else if( classCode.equals( "a848" ) ) {
				schema.getTableDbKeyHash256Col().updateDbKeyHash256Col( Authorization, (YCFBamDbKeyHash256ColBuff)editNext );
			}
			else if( classCode.equals( "a849" ) ) {
				schema.getTableDbKeyHash256Type().updateDbKeyHash256Type( Authorization, (YCFBamDbKeyHash256TypeBuff)editNext );
			}
			else if( classCode.equals( "a84a" ) ) {
				schema.getTableDbKeyHash256Gen().updateDbKeyHash256Gen( Authorization, (YCFBamDbKeyHash256GenBuff)editNext );
			}
			else if( classCode.equals( "a84b" ) ) {
				schema.getTableDbKeyHash384Def().updateDbKeyHash384Def( Authorization, (YCFBamDbKeyHash384DefBuff)editNext );
			}
			else if( classCode.equals( "a84c" ) ) {
				schema.getTableDbKeyHash384Col().updateDbKeyHash384Col( Authorization, (YCFBamDbKeyHash384ColBuff)editNext );
			}
			else if( classCode.equals( "a84d" ) ) {
				schema.getTableDbKeyHash384Type().updateDbKeyHash384Type( Authorization, (YCFBamDbKeyHash384TypeBuff)editNext );
			}
			else if( classCode.equals( "a84e" ) ) {
				schema.getTableDbKeyHash384Gen().updateDbKeyHash384Gen( Authorization, (YCFBamDbKeyHash384GenBuff)editNext );
			}
			else if( classCode.equals( "a84f" ) ) {
				schema.getTableDbKeyHash512Def().updateDbKeyHash512Def( Authorization, (YCFBamDbKeyHash512DefBuff)editNext );
			}
			else if( classCode.equals( "a850" ) ) {
				schema.getTableDbKeyHash512Col().updateDbKeyHash512Col( Authorization, (YCFBamDbKeyHash512ColBuff)editNext );
			}
			else if( classCode.equals( "a851" ) ) {
				schema.getTableDbKeyHash512Type().updateDbKeyHash512Type( Authorization, (YCFBamDbKeyHash512TypeBuff)editNext );
			}
			else if( classCode.equals( "a852" ) ) {
				schema.getTableDbKeyHash512Gen().updateDbKeyHash512Gen( Authorization, (YCFBamDbKeyHash512GenBuff)editNext );
			}
			else if( classCode.equals( "a853" ) ) {
				schema.getTableStringDef().updateStringDef( Authorization, (YCFBamStringDefBuff)editNext );
			}
			else if( classCode.equals( "a854" ) ) {
				schema.getTableStringType().updateStringType( Authorization, (YCFBamStringTypeBuff)editNext );
			}
			else if( classCode.equals( "a87e" ) ) {
				schema.getTableStringCol().updateStringCol( Authorization, (YCFBamStringColBuff)editNext );
			}
			else if( classCode.equals( "a855" ) ) {
				schema.getTableTZDateDef().updateTZDateDef( Authorization, (YCFBamTZDateDefBuff)editNext );
			}
			else if( classCode.equals( "a856" ) ) {
				schema.getTableTZDateType().updateTZDateType( Authorization, (YCFBamTZDateTypeBuff)editNext );
			}
			else if( classCode.equals( "a87f" ) ) {
				schema.getTableTZDateCol().updateTZDateCol( Authorization, (YCFBamTZDateColBuff)editNext );
			}
			else if( classCode.equals( "a857" ) ) {
				schema.getTableTZTimeDef().updateTZTimeDef( Authorization, (YCFBamTZTimeDefBuff)editNext );
			}
			else if( classCode.equals( "a858" ) ) {
				schema.getTableTZTimeType().updateTZTimeType( Authorization, (YCFBamTZTimeTypeBuff)editNext );
			}
			else if( classCode.equals( "a880" ) ) {
				schema.getTableTZTimeCol().updateTZTimeCol( Authorization, (YCFBamTZTimeColBuff)editNext );
			}
			else if( classCode.equals( "a859" ) ) {
				schema.getTableTZTimestampDef().updateTZTimestampDef( Authorization, (YCFBamTZTimestampDefBuff)editNext );
			}
			else if( classCode.equals( "a85a" ) ) {
				schema.getTableTZTimestampType().updateTZTimestampType( Authorization, (YCFBamTZTimestampTypeBuff)editNext );
			}
			else if( classCode.equals( "a881" ) ) {
				schema.getTableTZTimestampCol().updateTZTimestampCol( Authorization, (YCFBamTZTimestampColBuff)editNext );
			}
			else if( classCode.equals( "a85c" ) ) {
				schema.getTableTextDef().updateTextDef( Authorization, (YCFBamTextDefBuff)editNext );
			}
			else if( classCode.equals( "a85d" ) ) {
				schema.getTableTextType().updateTextType( Authorization, (YCFBamTextTypeBuff)editNext );
			}
			else if( classCode.equals( "a882" ) ) {
				schema.getTableTextCol().updateTextCol( Authorization, (YCFBamTextColBuff)editNext );
			}
			else if( classCode.equals( "a85e" ) ) {
				schema.getTableTimeDef().updateTimeDef( Authorization, (YCFBamTimeDefBuff)editNext );
			}
			else if( classCode.equals( "a85f" ) ) {
				schema.getTableTimeType().updateTimeType( Authorization, (YCFBamTimeTypeBuff)editNext );
			}
			else if( classCode.equals( "a883" ) ) {
				schema.getTableTimeCol().updateTimeCol( Authorization, (YCFBamTimeColBuff)editNext );
			}
			else if( classCode.equals( "a860" ) ) {
				schema.getTableTimestampDef().updateTimestampDef( Authorization, (YCFBamTimestampDefBuff)editNext );
			}
			else if( classCode.equals( "a861" ) ) {
				schema.getTableTimestampType().updateTimestampType( Authorization, (YCFBamTimestampTypeBuff)editNext );
			}
			else if( classCode.equals( "a884" ) ) {
				schema.getTableTimestampCol().updateTimestampCol( Authorization, (YCFBamTimestampColBuff)editNext );
			}
			else if( classCode.equals( "a862" ) ) {
				schema.getTableTokenDef().updateTokenDef( Authorization, (YCFBamTokenDefBuff)editNext );
			}
			else if( classCode.equals( "a863" ) ) {
				schema.getTableTokenType().updateTokenType( Authorization, (YCFBamTokenTypeBuff)editNext );
			}
			else if( classCode.equals( "a885" ) ) {
				schema.getTableTokenCol().updateTokenCol( Authorization, (YCFBamTokenColBuff)editNext );
			}
			else if( classCode.equals( "a864" ) ) {
				schema.getTableUInt16Def().updateUInt16Def( Authorization, (YCFBamUInt16DefBuff)editNext );
			}
			else if( classCode.equals( "a865" ) ) {
				schema.getTableUInt16Type().updateUInt16Type( Authorization, (YCFBamUInt16TypeBuff)editNext );
			}
			else if( classCode.equals( "a886" ) ) {
				schema.getTableUInt16Col().updateUInt16Col( Authorization, (YCFBamUInt16ColBuff)editNext );
			}
			else if( classCode.equals( "a866" ) ) {
				schema.getTableUInt32Def().updateUInt32Def( Authorization, (YCFBamUInt32DefBuff)editNext );
			}
			else if( classCode.equals( "a867" ) ) {
				schema.getTableUInt32Type().updateUInt32Type( Authorization, (YCFBamUInt32TypeBuff)editNext );
			}
			else if( classCode.equals( "a887" ) ) {
				schema.getTableUInt32Col().updateUInt32Col( Authorization, (YCFBamUInt32ColBuff)editNext );
			}
			else if( classCode.equals( "a868" ) ) {
				schema.getTableUInt64Def().updateUInt64Def( Authorization, (YCFBamUInt64DefBuff)editNext );
			}
			else if( classCode.equals( "a869" ) ) {
				schema.getTableUInt64Type().updateUInt64Type( Authorization, (YCFBamUInt64TypeBuff)editNext );
			}
			else if( classCode.equals( "a888" ) ) {
				schema.getTableUInt64Col().updateUInt64Col( Authorization, (YCFBamUInt64ColBuff)editNext );
			}
			else if( classCode.equals( "a86a" ) ) {
				schema.getTableUuidDef().updateUuidDef( Authorization, (YCFBamUuidDefBuff)editNext );
			}
			else if( classCode.equals( "a86c" ) ) {
				schema.getTableUuidType().updateUuidType( Authorization, (YCFBamUuidTypeBuff)editNext );
			}
			else if( classCode.equals( "a88b" ) ) {
				schema.getTableUuidGen().updateUuidGen( Authorization, (YCFBamUuidGenBuff)editNext );
			}
			else if( classCode.equals( "a889" ) ) {
				schema.getTableUuidCol().updateUuidCol( Authorization, (YCFBamUuidColBuff)editNext );
			}
			else if( classCode.equals( "a86b" ) ) {
				schema.getTableUuid6Def().updateUuid6Def( Authorization, (YCFBamUuid6DefBuff)editNext );
			}
			else if( classCode.equals( "a86d" ) ) {
				schema.getTableUuid6Type().updateUuid6Type( Authorization, (YCFBamUuid6TypeBuff)editNext );
			}
			else if( classCode.equals( "a88c" ) ) {
				schema.getTableUuid6Gen().updateUuid6Gen( Authorization, (YCFBamUuid6GenBuff)editNext );
			}
			else if( classCode.equals( "a88a" ) ) {
				schema.getTableUuid6Col().updateUuid6Col( Authorization, (YCFBamUuid6ColBuff)editNext );
			}
			else if( classCode.equals( "a85b" ) ) {
				schema.getTableTableCol().updateTableCol( Authorization, (YCFBamTableColBuff)editNext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		if( editGrandnext != null ) {
			classCode = editGrandnext.getClassCode();
			if( classCode.equals( "a80c" ) ) {
				schema.getTableValue().updateValue( Authorization, editGrandnext );
			}
			else if( classCode.equals( "a80d" ) ) {
				schema.getTableAtom().updateAtom( Authorization, (YCFBamAtomBuff)editGrandnext );
			}
			else if( classCode.equals( "a80e" ) ) {
				schema.getTableBlobDef().updateBlobDef( Authorization, (YCFBamBlobDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a80f" ) ) {
				schema.getTableBlobType().updateBlobType( Authorization, (YCFBamBlobTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a86e" ) ) {
				schema.getTableBlobCol().updateBlobCol( Authorization, (YCFBamBlobColBuff)editGrandnext );
			}
			else if( classCode.equals( "a810" ) ) {
				schema.getTableBoolDef().updateBoolDef( Authorization, (YCFBamBoolDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a811" ) ) {
				schema.getTableBoolType().updateBoolType( Authorization, (YCFBamBoolTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a86f" ) ) {
				schema.getTableBoolCol().updateBoolCol( Authorization, (YCFBamBoolColBuff)editGrandnext );
			}
			else if( classCode.equals( "a818" ) ) {
				schema.getTableDateDef().updateDateDef( Authorization, (YCFBamDateDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a819" ) ) {
				schema.getTableDateType().updateDateType( Authorization, (YCFBamDateTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a870" ) ) {
				schema.getTableDateCol().updateDateCol( Authorization, (YCFBamDateColBuff)editGrandnext );
			}
			else if( classCode.equals( "a81f" ) ) {
				schema.getTableDoubleDef().updateDoubleDef( Authorization, (YCFBamDoubleDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a820" ) ) {
				schema.getTableDoubleType().updateDoubleType( Authorization, (YCFBamDoubleTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a871" ) ) {
				schema.getTableDoubleCol().updateDoubleCol( Authorization, (YCFBamDoubleColBuff)editGrandnext );
			}
			else if( classCode.equals( "a822" ) ) {
				schema.getTableFloatDef().updateFloatDef( Authorization, (YCFBamFloatDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a823" ) ) {
				schema.getTableFloatType().updateFloatType( Authorization, (YCFBamFloatTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a874" ) ) {
				schema.getTableFloatCol().updateFloatCol( Authorization, (YCFBamFloatColBuff)editGrandnext );
			}
			else if( classCode.equals( "a826" ) ) {
				schema.getTableInt16Def().updateInt16Def( Authorization, (YCFBamInt16DefBuff)editGrandnext );
			}
			else if( classCode.equals( "a827" ) ) {
				schema.getTableInt16Type().updateInt16Type( Authorization, (YCFBamInt16TypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a875" ) ) {
				schema.getTableId16Gen().updateId16Gen( Authorization, (YCFBamId16GenBuff)editGrandnext );
			}
			else if( classCode.equals( "a872" ) ) {
				schema.getTableEnumDef().updateEnumDef( Authorization, (YCFBamEnumDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a873" ) ) {
				schema.getTableEnumType().updateEnumType( Authorization, (YCFBamEnumTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a878" ) ) {
				schema.getTableInt16Col().updateInt16Col( Authorization, (YCFBamInt16ColBuff)editGrandnext );
			}
			else if( classCode.equals( "a828" ) ) {
				schema.getTableInt32Def().updateInt32Def( Authorization, (YCFBamInt32DefBuff)editGrandnext );
			}
			else if( classCode.equals( "a829" ) ) {
				schema.getTableInt32Type().updateInt32Type( Authorization, (YCFBamInt32TypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a876" ) ) {
				schema.getTableId32Gen().updateId32Gen( Authorization, (YCFBamId32GenBuff)editGrandnext );
			}
			else if( classCode.equals( "a879" ) ) {
				schema.getTableInt32Col().updateInt32Col( Authorization, (YCFBamInt32ColBuff)editGrandnext );
			}
			else if( classCode.equals( "a82a" ) ) {
				schema.getTableInt64Def().updateInt64Def( Authorization, (YCFBamInt64DefBuff)editGrandnext );
			}
			else if( classCode.equals( "a82b" ) ) {
				schema.getTableInt64Type().updateInt64Type( Authorization, (YCFBamInt64TypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a877" ) ) {
				schema.getTableId64Gen().updateId64Gen( Authorization, (YCFBamId64GenBuff)editGrandnext );
			}
			else if( classCode.equals( "a87a" ) ) {
				schema.getTableInt64Col().updateInt64Col( Authorization, (YCFBamInt64ColBuff)editGrandnext );
			}
			else if( classCode.equals( "a82c" ) ) {
				schema.getTableNmTokenDef().updateNmTokenDef( Authorization, (YCFBamNmTokenDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a82d" ) ) {
				schema.getTableNmTokenType().updateNmTokenType( Authorization, (YCFBamNmTokenTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a87b" ) ) {
				schema.getTableNmTokenCol().updateNmTokenCol( Authorization, (YCFBamNmTokenColBuff)editGrandnext );
			}
			else if( classCode.equals( "a82e" ) ) {
				schema.getTableNmTokensDef().updateNmTokensDef( Authorization, (YCFBamNmTokensDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a82f" ) ) {
				schema.getTableNmTokensType().updateNmTokensType( Authorization, (YCFBamNmTokensTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a87c" ) ) {
				schema.getTableNmTokensCol().updateNmTokensCol( Authorization, (YCFBamNmTokensColBuff)editGrandnext );
			}
			else if( classCode.equals( "a830" ) ) {
				schema.getTableNumberDef().updateNumberDef( Authorization, (YCFBamNumberDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a831" ) ) {
				schema.getTableNumberType().updateNumberType( Authorization, (YCFBamNumberTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a87d" ) ) {
				schema.getTableNumberCol().updateNumberCol( Authorization, (YCFBamNumberColBuff)editGrandnext );
			}
			else if( classCode.equals( "a83b" ) ) {
				schema.getTableDbKeyHash128Def().updateDbKeyHash128Def( Authorization, (YCFBamDbKeyHash128DefBuff)editGrandnext );
			}
			else if( classCode.equals( "a83c" ) ) {
				schema.getTableDbKeyHash128Col().updateDbKeyHash128Col( Authorization, (YCFBamDbKeyHash128ColBuff)editGrandnext );
			}
			else if( classCode.equals( "a83d" ) ) {
				schema.getTableDbKeyHash128Type().updateDbKeyHash128Type( Authorization, (YCFBamDbKeyHash128TypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a83e" ) ) {
				schema.getTableDbKeyHash128Gen().updateDbKeyHash128Gen( Authorization, (YCFBamDbKeyHash128GenBuff)editGrandnext );
			}
			else if( classCode.equals( "a83f" ) ) {
				schema.getTableDbKeyHash160Def().updateDbKeyHash160Def( Authorization, (YCFBamDbKeyHash160DefBuff)editGrandnext );
			}
			else if( classCode.equals( "a840" ) ) {
				schema.getTableDbKeyHash160Col().updateDbKeyHash160Col( Authorization, (YCFBamDbKeyHash160ColBuff)editGrandnext );
			}
			else if( classCode.equals( "a841" ) ) {
				schema.getTableDbKeyHash160Type().updateDbKeyHash160Type( Authorization, (YCFBamDbKeyHash160TypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a842" ) ) {
				schema.getTableDbKeyHash160Gen().updateDbKeyHash160Gen( Authorization, (YCFBamDbKeyHash160GenBuff)editGrandnext );
			}
			else if( classCode.equals( "a843" ) ) {
				schema.getTableDbKeyHash224Def().updateDbKeyHash224Def( Authorization, (YCFBamDbKeyHash224DefBuff)editGrandnext );
			}
			else if( classCode.equals( "a844" ) ) {
				schema.getTableDbKeyHash224Col().updateDbKeyHash224Col( Authorization, (YCFBamDbKeyHash224ColBuff)editGrandnext );
			}
			else if( classCode.equals( "a845" ) ) {
				schema.getTableDbKeyHash224Type().updateDbKeyHash224Type( Authorization, (YCFBamDbKeyHash224TypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a846" ) ) {
				schema.getTableDbKeyHash224Gen().updateDbKeyHash224Gen( Authorization, (YCFBamDbKeyHash224GenBuff)editGrandnext );
			}
			else if( classCode.equals( "a847" ) ) {
				schema.getTableDbKeyHash256Def().updateDbKeyHash256Def( Authorization, (YCFBamDbKeyHash256DefBuff)editGrandnext );
			}
			else if( classCode.equals( "a848" ) ) {
				schema.getTableDbKeyHash256Col().updateDbKeyHash256Col( Authorization, (YCFBamDbKeyHash256ColBuff)editGrandnext );
			}
			else if( classCode.equals( "a849" ) ) {
				schema.getTableDbKeyHash256Type().updateDbKeyHash256Type( Authorization, (YCFBamDbKeyHash256TypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a84a" ) ) {
				schema.getTableDbKeyHash256Gen().updateDbKeyHash256Gen( Authorization, (YCFBamDbKeyHash256GenBuff)editGrandnext );
			}
			else if( classCode.equals( "a84b" ) ) {
				schema.getTableDbKeyHash384Def().updateDbKeyHash384Def( Authorization, (YCFBamDbKeyHash384DefBuff)editGrandnext );
			}
			else if( classCode.equals( "a84c" ) ) {
				schema.getTableDbKeyHash384Col().updateDbKeyHash384Col( Authorization, (YCFBamDbKeyHash384ColBuff)editGrandnext );
			}
			else if( classCode.equals( "a84d" ) ) {
				schema.getTableDbKeyHash384Type().updateDbKeyHash384Type( Authorization, (YCFBamDbKeyHash384TypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a84e" ) ) {
				schema.getTableDbKeyHash384Gen().updateDbKeyHash384Gen( Authorization, (YCFBamDbKeyHash384GenBuff)editGrandnext );
			}
			else if( classCode.equals( "a84f" ) ) {
				schema.getTableDbKeyHash512Def().updateDbKeyHash512Def( Authorization, (YCFBamDbKeyHash512DefBuff)editGrandnext );
			}
			else if( classCode.equals( "a850" ) ) {
				schema.getTableDbKeyHash512Col().updateDbKeyHash512Col( Authorization, (YCFBamDbKeyHash512ColBuff)editGrandnext );
			}
			else if( classCode.equals( "a851" ) ) {
				schema.getTableDbKeyHash512Type().updateDbKeyHash512Type( Authorization, (YCFBamDbKeyHash512TypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a852" ) ) {
				schema.getTableDbKeyHash512Gen().updateDbKeyHash512Gen( Authorization, (YCFBamDbKeyHash512GenBuff)editGrandnext );
			}
			else if( classCode.equals( "a853" ) ) {
				schema.getTableStringDef().updateStringDef( Authorization, (YCFBamStringDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a854" ) ) {
				schema.getTableStringType().updateStringType( Authorization, (YCFBamStringTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a87e" ) ) {
				schema.getTableStringCol().updateStringCol( Authorization, (YCFBamStringColBuff)editGrandnext );
			}
			else if( classCode.equals( "a855" ) ) {
				schema.getTableTZDateDef().updateTZDateDef( Authorization, (YCFBamTZDateDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a856" ) ) {
				schema.getTableTZDateType().updateTZDateType( Authorization, (YCFBamTZDateTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a87f" ) ) {
				schema.getTableTZDateCol().updateTZDateCol( Authorization, (YCFBamTZDateColBuff)editGrandnext );
			}
			else if( classCode.equals( "a857" ) ) {
				schema.getTableTZTimeDef().updateTZTimeDef( Authorization, (YCFBamTZTimeDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a858" ) ) {
				schema.getTableTZTimeType().updateTZTimeType( Authorization, (YCFBamTZTimeTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a880" ) ) {
				schema.getTableTZTimeCol().updateTZTimeCol( Authorization, (YCFBamTZTimeColBuff)editGrandnext );
			}
			else if( classCode.equals( "a859" ) ) {
				schema.getTableTZTimestampDef().updateTZTimestampDef( Authorization, (YCFBamTZTimestampDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a85a" ) ) {
				schema.getTableTZTimestampType().updateTZTimestampType( Authorization, (YCFBamTZTimestampTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a881" ) ) {
				schema.getTableTZTimestampCol().updateTZTimestampCol( Authorization, (YCFBamTZTimestampColBuff)editGrandnext );
			}
			else if( classCode.equals( "a85c" ) ) {
				schema.getTableTextDef().updateTextDef( Authorization, (YCFBamTextDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a85d" ) ) {
				schema.getTableTextType().updateTextType( Authorization, (YCFBamTextTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a882" ) ) {
				schema.getTableTextCol().updateTextCol( Authorization, (YCFBamTextColBuff)editGrandnext );
			}
			else if( classCode.equals( "a85e" ) ) {
				schema.getTableTimeDef().updateTimeDef( Authorization, (YCFBamTimeDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a85f" ) ) {
				schema.getTableTimeType().updateTimeType( Authorization, (YCFBamTimeTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a883" ) ) {
				schema.getTableTimeCol().updateTimeCol( Authorization, (YCFBamTimeColBuff)editGrandnext );
			}
			else if( classCode.equals( "a860" ) ) {
				schema.getTableTimestampDef().updateTimestampDef( Authorization, (YCFBamTimestampDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a861" ) ) {
				schema.getTableTimestampType().updateTimestampType( Authorization, (YCFBamTimestampTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a884" ) ) {
				schema.getTableTimestampCol().updateTimestampCol( Authorization, (YCFBamTimestampColBuff)editGrandnext );
			}
			else if( classCode.equals( "a862" ) ) {
				schema.getTableTokenDef().updateTokenDef( Authorization, (YCFBamTokenDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a863" ) ) {
				schema.getTableTokenType().updateTokenType( Authorization, (YCFBamTokenTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a885" ) ) {
				schema.getTableTokenCol().updateTokenCol( Authorization, (YCFBamTokenColBuff)editGrandnext );
			}
			else if( classCode.equals( "a864" ) ) {
				schema.getTableUInt16Def().updateUInt16Def( Authorization, (YCFBamUInt16DefBuff)editGrandnext );
			}
			else if( classCode.equals( "a865" ) ) {
				schema.getTableUInt16Type().updateUInt16Type( Authorization, (YCFBamUInt16TypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a886" ) ) {
				schema.getTableUInt16Col().updateUInt16Col( Authorization, (YCFBamUInt16ColBuff)editGrandnext );
			}
			else if( classCode.equals( "a866" ) ) {
				schema.getTableUInt32Def().updateUInt32Def( Authorization, (YCFBamUInt32DefBuff)editGrandnext );
			}
			else if( classCode.equals( "a867" ) ) {
				schema.getTableUInt32Type().updateUInt32Type( Authorization, (YCFBamUInt32TypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a887" ) ) {
				schema.getTableUInt32Col().updateUInt32Col( Authorization, (YCFBamUInt32ColBuff)editGrandnext );
			}
			else if( classCode.equals( "a868" ) ) {
				schema.getTableUInt64Def().updateUInt64Def( Authorization, (YCFBamUInt64DefBuff)editGrandnext );
			}
			else if( classCode.equals( "a869" ) ) {
				schema.getTableUInt64Type().updateUInt64Type( Authorization, (YCFBamUInt64TypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a888" ) ) {
				schema.getTableUInt64Col().updateUInt64Col( Authorization, (YCFBamUInt64ColBuff)editGrandnext );
			}
			else if( classCode.equals( "a86a" ) ) {
				schema.getTableUuidDef().updateUuidDef( Authorization, (YCFBamUuidDefBuff)editGrandnext );
			}
			else if( classCode.equals( "a86c" ) ) {
				schema.getTableUuidType().updateUuidType( Authorization, (YCFBamUuidTypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a88b" ) ) {
				schema.getTableUuidGen().updateUuidGen( Authorization, (YCFBamUuidGenBuff)editGrandnext );
			}
			else if( classCode.equals( "a889" ) ) {
				schema.getTableUuidCol().updateUuidCol( Authorization, (YCFBamUuidColBuff)editGrandnext );
			}
			else if( classCode.equals( "a86b" ) ) {
				schema.getTableUuid6Def().updateUuid6Def( Authorization, (YCFBamUuid6DefBuff)editGrandnext );
			}
			else if( classCode.equals( "a86d" ) ) {
				schema.getTableUuid6Type().updateUuid6Type( Authorization, (YCFBamUuid6TypeBuff)editGrandnext );
			}
			else if( classCode.equals( "a88c" ) ) {
				schema.getTableUuid6Gen().updateUuid6Gen( Authorization, (YCFBamUuid6GenBuff)editGrandnext );
			}
			else if( classCode.equals( "a88a" ) ) {
				schema.getTableUuid6Col().updateUuid6Col( Authorization, (YCFBamUuid6ColBuff)editGrandnext );
			}
			else if( classCode.equals( "a85b" ) ) {
				schema.getTableTableCol().updateTableCol( Authorization, (YCFBamTableColBuff)editGrandnext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		return( (YCFBamValueBuff)editCur );
	}

	public void updateValue( YCFSecAuthorization Authorization,
		YCFBamValueBuff Buff )
	{
		YCFBamValuePKey pkey = schema.getFactoryValue().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamValueBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateValue",
				"Existing record not found",
				"Value",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateValue",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFBamValueByUNameIdxKey existingKeyUNameIdx = schema.getFactoryValue().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyUNameIdx.setRequiredScopeId( existing.getRequiredScopeId() );
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamValueByUNameIdxKey newKeyUNameIdx = schema.getFactoryValue().newUNameIdxKey();
		newKeyUNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyUNameIdx.setRequiredScopeId( Buff.getRequiredScopeId() );
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamValueByValTentIdxKey existingKeyValTentIdx = schema.getFactoryValue().newValTentIdxKey();
		existingKeyValTentIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFBamValueByValTentIdxKey newKeyValTentIdx = schema.getFactoryValue().newValTentIdxKey();
		newKeyValTentIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFBamValueByScopeIdxKey existingKeyScopeIdx = schema.getFactoryValue().newScopeIdxKey();
		existingKeyScopeIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyScopeIdx.setRequiredScopeId( existing.getRequiredScopeId() );

		YCFBamValueByScopeIdxKey newKeyScopeIdx = schema.getFactoryValue().newScopeIdxKey();
		newKeyScopeIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyScopeIdx.setRequiredScopeId( Buff.getRequiredScopeId() );

		YCFBamValueByDefSchemaIdxKey existingKeyDefSchemaIdx = schema.getFactoryValue().newDefSchemaIdxKey();
		existingKeyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		existingKeyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		YCFBamValueByDefSchemaIdxKey newKeyDefSchemaIdx = schema.getFactoryValue().newDefSchemaIdxKey();
		newKeyDefSchemaIdx.setOptionalDefSchemaTenantId( Buff.getOptionalDefSchemaTenantId() );
		newKeyDefSchemaIdx.setOptionalDefSchemaId( Buff.getOptionalDefSchemaId() );

		YCFBamValueByPrevIdxKey existingKeyPrevIdx = schema.getFactoryValue().newPrevIdxKey();
		existingKeyPrevIdx.setOptionalPrevTenantId( existing.getOptionalPrevTenantId() );
		existingKeyPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamValueByPrevIdxKey newKeyPrevIdx = schema.getFactoryValue().newPrevIdxKey();
		newKeyPrevIdx.setOptionalPrevTenantId( Buff.getOptionalPrevTenantId() );
		newKeyPrevIdx.setOptionalPrevId( Buff.getOptionalPrevId() );

		YCFBamValueByNextIdxKey existingKeyNextIdx = schema.getFactoryValue().newNextIdxKey();
		existingKeyNextIdx.setOptionalNextTenantId( existing.getOptionalNextTenantId() );
		existingKeyNextIdx.setOptionalNextId( existing.getOptionalNextId() );

		YCFBamValueByNextIdxKey newKeyNextIdx = schema.getFactoryValue().newNextIdxKey();
		newKeyNextIdx.setOptionalNextTenantId( Buff.getOptionalNextTenantId() );
		newKeyNextIdx.setOptionalNextId( Buff.getOptionalNextId() );

		YCFBamValueByContPrevIdxKey existingKeyContPrevIdx = schema.getFactoryValue().newContPrevIdxKey();
		existingKeyContPrevIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyContPrevIdx.setRequiredScopeId( existing.getRequiredScopeId() );
		existingKeyContPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamValueByContPrevIdxKey newKeyContPrevIdx = schema.getFactoryValue().newContPrevIdxKey();
		newKeyContPrevIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyContPrevIdx.setRequiredScopeId( Buff.getRequiredScopeId() );
		newKeyContPrevIdx.setOptionalPrevId( Buff.getOptionalPrevId() );

		YCFBamValueByContNextIdxKey existingKeyContNextIdx = schema.getFactoryValue().newContNextIdxKey();
		existingKeyContNextIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyContNextIdx.setRequiredScopeId( existing.getRequiredScopeId() );
		existingKeyContNextIdx.setOptionalNextId( existing.getOptionalNextId() );

		YCFBamValueByContNextIdxKey newKeyContNextIdx = schema.getFactoryValue().newContNextIdxKey();
		newKeyContNextIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyContNextIdx.setRequiredScopeId( Buff.getRequiredScopeId() );
		newKeyContNextIdx.setOptionalNextId( Buff.getOptionalNextId() );

		YCFBamValueByCodeVisIdxKey existingKeyCodeVisIdx = schema.getFactoryValue().newCodeVisIdxKey();
		existingKeyCodeVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		YCFBamValueByCodeVisIdxKey newKeyCodeVisIdx = schema.getFactoryValue().newCodeVisIdxKey();
		newKeyCodeVisIdx.setRequiredCodeVis( Buff.getRequiredCodeVis() );

		YCFBamValueByScopeCodeVisIdxKey existingKeyScopeCodeVisIdx = schema.getFactoryValue().newScopeCodeVisIdxKey();
		existingKeyScopeCodeVisIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyScopeCodeVisIdx.setRequiredScopeId( existing.getRequiredScopeId() );
		existingKeyScopeCodeVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		YCFBamValueByScopeCodeVisIdxKey newKeyScopeCodeVisIdx = schema.getFactoryValue().newScopeCodeVisIdxKey();
		newKeyScopeCodeVisIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyScopeCodeVisIdx.setRequiredScopeId( Buff.getRequiredScopeId() );
		newKeyScopeCodeVisIdx.setRequiredCodeVis( Buff.getRequiredCodeVis() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateValue",
					"ValueUNameIdx",
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
						"updateValue",
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
				if( null == schema.getTableScope().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredScopeId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateValue",
						"Container",
						"Scope",
						"Scope",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamValuePKey, YCFBamValueBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

		subdict = dictByValTentIdx.get( existingKeyValTentIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByValTentIdx.containsKey( newKeyValTentIdx ) ) {
			subdict = dictByValTentIdx.get( newKeyValTentIdx );
		}
		else {
			subdict = new HashMap< YCFBamValuePKey, YCFBamValueBuff >();
			dictByValTentIdx.put( newKeyValTentIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByScopeIdx.get( existingKeyScopeIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByScopeIdx.containsKey( newKeyScopeIdx ) ) {
			subdict = dictByScopeIdx.get( newKeyScopeIdx );
		}
		else {
			subdict = new HashMap< YCFBamValuePKey, YCFBamValueBuff >();
			dictByScopeIdx.put( newKeyScopeIdx, subdict );
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
			subdict = new HashMap< YCFBamValuePKey, YCFBamValueBuff >();
			dictByDefSchemaIdx.put( newKeyDefSchemaIdx, subdict );
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
			subdict = new HashMap< YCFBamValuePKey, YCFBamValueBuff >();
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
			subdict = new HashMap< YCFBamValuePKey, YCFBamValueBuff >();
			dictByNextIdx.put( newKeyNextIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByContPrevIdx.get( existingKeyContPrevIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByContPrevIdx.containsKey( newKeyContPrevIdx ) ) {
			subdict = dictByContPrevIdx.get( newKeyContPrevIdx );
		}
		else {
			subdict = new HashMap< YCFBamValuePKey, YCFBamValueBuff >();
			dictByContPrevIdx.put( newKeyContPrevIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByContNextIdx.get( existingKeyContNextIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByContNextIdx.containsKey( newKeyContNextIdx ) ) {
			subdict = dictByContNextIdx.get( newKeyContNextIdx );
		}
		else {
			subdict = new HashMap< YCFBamValuePKey, YCFBamValueBuff >();
			dictByContNextIdx.put( newKeyContNextIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByCodeVisIdx.get( existingKeyCodeVisIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByCodeVisIdx.containsKey( newKeyCodeVisIdx ) ) {
			subdict = dictByCodeVisIdx.get( newKeyCodeVisIdx );
		}
		else {
			subdict = new HashMap< YCFBamValuePKey, YCFBamValueBuff >();
			dictByCodeVisIdx.put( newKeyCodeVisIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByScopeCodeVisIdx.get( existingKeyScopeCodeVisIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByScopeCodeVisIdx.containsKey( newKeyScopeCodeVisIdx ) ) {
			subdict = dictByScopeCodeVisIdx.get( newKeyScopeCodeVisIdx );
		}
		else {
			subdict = new HashMap< YCFBamValuePKey, YCFBamValueBuff >();
			dictByScopeCodeVisIdx.put( newKeyScopeCodeVisIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteValue( YCFSecAuthorization Authorization,
		YCFBamValueBuff Buff )
	{
		final String S_ProcName = "YCFBamRamValueTable.deleteValue() ";
		String classCode;
		YCFBamValuePKey pkey = schema.getFactoryValue().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamValueBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteValue",
				pkey );
		}
		long varTenantId = existing.getRequiredTenantId();
		long varScopeId = existing.getRequiredScopeId();
		YCFBamScopeBuff container = schema.getTableScope().readDerivedByIdIdx( Authorization,
			varTenantId,
			varScopeId );
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

		YCFBamValueBuff prev = null;
		if( ( prevTenantId != null )
			&& ( prevId != null ) )
		{
			prev = schema.getTableValue().readDerivedByIdIdx( Authorization,
				prevTenantId,
				prevId );
			if( prev == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"prev" );
			}
			YCFBamValueBuff editPrev;
			classCode = prev.getClassCode();
			if( classCode.equals( "a80c" ) ) {
				editPrev = schema.getFactoryValue().newBuff();
			}
			else if( classCode.equals( "a80d" ) ) {
				editPrev = schema.getFactoryAtom().newBuff();
			}
			else if( classCode.equals( "a80e" ) ) {
				editPrev = schema.getFactoryBlobDef().newBuff();
			}
			else if( classCode.equals( "a80f" ) ) {
				editPrev = schema.getFactoryBlobType().newBuff();
			}
			else if( classCode.equals( "a86e" ) ) {
				editPrev = schema.getFactoryBlobCol().newBuff();
			}
			else if( classCode.equals( "a810" ) ) {
				editPrev = schema.getFactoryBoolDef().newBuff();
			}
			else if( classCode.equals( "a811" ) ) {
				editPrev = schema.getFactoryBoolType().newBuff();
			}
			else if( classCode.equals( "a86f" ) ) {
				editPrev = schema.getFactoryBoolCol().newBuff();
			}
			else if( classCode.equals( "a818" ) ) {
				editPrev = schema.getFactoryDateDef().newBuff();
			}
			else if( classCode.equals( "a819" ) ) {
				editPrev = schema.getFactoryDateType().newBuff();
			}
			else if( classCode.equals( "a870" ) ) {
				editPrev = schema.getFactoryDateCol().newBuff();
			}
			else if( classCode.equals( "a81f" ) ) {
				editPrev = schema.getFactoryDoubleDef().newBuff();
			}
			else if( classCode.equals( "a820" ) ) {
				editPrev = schema.getFactoryDoubleType().newBuff();
			}
			else if( classCode.equals( "a871" ) ) {
				editPrev = schema.getFactoryDoubleCol().newBuff();
			}
			else if( classCode.equals( "a822" ) ) {
				editPrev = schema.getFactoryFloatDef().newBuff();
			}
			else if( classCode.equals( "a823" ) ) {
				editPrev = schema.getFactoryFloatType().newBuff();
			}
			else if( classCode.equals( "a874" ) ) {
				editPrev = schema.getFactoryFloatCol().newBuff();
			}
			else if( classCode.equals( "a826" ) ) {
				editPrev = schema.getFactoryInt16Def().newBuff();
			}
			else if( classCode.equals( "a827" ) ) {
				editPrev = schema.getFactoryInt16Type().newBuff();
			}
			else if( classCode.equals( "a875" ) ) {
				editPrev = schema.getFactoryId16Gen().newBuff();
			}
			else if( classCode.equals( "a872" ) ) {
				editPrev = schema.getFactoryEnumDef().newBuff();
			}
			else if( classCode.equals( "a873" ) ) {
				editPrev = schema.getFactoryEnumType().newBuff();
			}
			else if( classCode.equals( "a878" ) ) {
				editPrev = schema.getFactoryInt16Col().newBuff();
			}
			else if( classCode.equals( "a828" ) ) {
				editPrev = schema.getFactoryInt32Def().newBuff();
			}
			else if( classCode.equals( "a829" ) ) {
				editPrev = schema.getFactoryInt32Type().newBuff();
			}
			else if( classCode.equals( "a876" ) ) {
				editPrev = schema.getFactoryId32Gen().newBuff();
			}
			else if( classCode.equals( "a879" ) ) {
				editPrev = schema.getFactoryInt32Col().newBuff();
			}
			else if( classCode.equals( "a82a" ) ) {
				editPrev = schema.getFactoryInt64Def().newBuff();
			}
			else if( classCode.equals( "a82b" ) ) {
				editPrev = schema.getFactoryInt64Type().newBuff();
			}
			else if( classCode.equals( "a877" ) ) {
				editPrev = schema.getFactoryId64Gen().newBuff();
			}
			else if( classCode.equals( "a87a" ) ) {
				editPrev = schema.getFactoryInt64Col().newBuff();
			}
			else if( classCode.equals( "a82c" ) ) {
				editPrev = schema.getFactoryNmTokenDef().newBuff();
			}
			else if( classCode.equals( "a82d" ) ) {
				editPrev = schema.getFactoryNmTokenType().newBuff();
			}
			else if( classCode.equals( "a87b" ) ) {
				editPrev = schema.getFactoryNmTokenCol().newBuff();
			}
			else if( classCode.equals( "a82e" ) ) {
				editPrev = schema.getFactoryNmTokensDef().newBuff();
			}
			else if( classCode.equals( "a82f" ) ) {
				editPrev = schema.getFactoryNmTokensType().newBuff();
			}
			else if( classCode.equals( "a87c" ) ) {
				editPrev = schema.getFactoryNmTokensCol().newBuff();
			}
			else if( classCode.equals( "a830" ) ) {
				editPrev = schema.getFactoryNumberDef().newBuff();
			}
			else if( classCode.equals( "a831" ) ) {
				editPrev = schema.getFactoryNumberType().newBuff();
			}
			else if( classCode.equals( "a87d" ) ) {
				editPrev = schema.getFactoryNumberCol().newBuff();
			}
			else if( classCode.equals( "a83b" ) ) {
				editPrev = schema.getFactoryDbKeyHash128Def().newBuff();
			}
			else if( classCode.equals( "a83c" ) ) {
				editPrev = schema.getFactoryDbKeyHash128Col().newBuff();
			}
			else if( classCode.equals( "a83d" ) ) {
				editPrev = schema.getFactoryDbKeyHash128Type().newBuff();
			}
			else if( classCode.equals( "a83e" ) ) {
				editPrev = schema.getFactoryDbKeyHash128Gen().newBuff();
			}
			else if( classCode.equals( "a83f" ) ) {
				editPrev = schema.getFactoryDbKeyHash160Def().newBuff();
			}
			else if( classCode.equals( "a840" ) ) {
				editPrev = schema.getFactoryDbKeyHash160Col().newBuff();
			}
			else if( classCode.equals( "a841" ) ) {
				editPrev = schema.getFactoryDbKeyHash160Type().newBuff();
			}
			else if( classCode.equals( "a842" ) ) {
				editPrev = schema.getFactoryDbKeyHash160Gen().newBuff();
			}
			else if( classCode.equals( "a843" ) ) {
				editPrev = schema.getFactoryDbKeyHash224Def().newBuff();
			}
			else if( classCode.equals( "a844" ) ) {
				editPrev = schema.getFactoryDbKeyHash224Col().newBuff();
			}
			else if( classCode.equals( "a845" ) ) {
				editPrev = schema.getFactoryDbKeyHash224Type().newBuff();
			}
			else if( classCode.equals( "a846" ) ) {
				editPrev = schema.getFactoryDbKeyHash224Gen().newBuff();
			}
			else if( classCode.equals( "a847" ) ) {
				editPrev = schema.getFactoryDbKeyHash256Def().newBuff();
			}
			else if( classCode.equals( "a848" ) ) {
				editPrev = schema.getFactoryDbKeyHash256Col().newBuff();
			}
			else if( classCode.equals( "a849" ) ) {
				editPrev = schema.getFactoryDbKeyHash256Type().newBuff();
			}
			else if( classCode.equals( "a84a" ) ) {
				editPrev = schema.getFactoryDbKeyHash256Gen().newBuff();
			}
			else if( classCode.equals( "a84b" ) ) {
				editPrev = schema.getFactoryDbKeyHash384Def().newBuff();
			}
			else if( classCode.equals( "a84c" ) ) {
				editPrev = schema.getFactoryDbKeyHash384Col().newBuff();
			}
			else if( classCode.equals( "a84d" ) ) {
				editPrev = schema.getFactoryDbKeyHash384Type().newBuff();
			}
			else if( classCode.equals( "a84e" ) ) {
				editPrev = schema.getFactoryDbKeyHash384Gen().newBuff();
			}
			else if( classCode.equals( "a84f" ) ) {
				editPrev = schema.getFactoryDbKeyHash512Def().newBuff();
			}
			else if( classCode.equals( "a850" ) ) {
				editPrev = schema.getFactoryDbKeyHash512Col().newBuff();
			}
			else if( classCode.equals( "a851" ) ) {
				editPrev = schema.getFactoryDbKeyHash512Type().newBuff();
			}
			else if( classCode.equals( "a852" ) ) {
				editPrev = schema.getFactoryDbKeyHash512Gen().newBuff();
			}
			else if( classCode.equals( "a853" ) ) {
				editPrev = schema.getFactoryStringDef().newBuff();
			}
			else if( classCode.equals( "a854" ) ) {
				editPrev = schema.getFactoryStringType().newBuff();
			}
			else if( classCode.equals( "a87e" ) ) {
				editPrev = schema.getFactoryStringCol().newBuff();
			}
			else if( classCode.equals( "a855" ) ) {
				editPrev = schema.getFactoryTZDateDef().newBuff();
			}
			else if( classCode.equals( "a856" ) ) {
				editPrev = schema.getFactoryTZDateType().newBuff();
			}
			else if( classCode.equals( "a87f" ) ) {
				editPrev = schema.getFactoryTZDateCol().newBuff();
			}
			else if( classCode.equals( "a857" ) ) {
				editPrev = schema.getFactoryTZTimeDef().newBuff();
			}
			else if( classCode.equals( "a858" ) ) {
				editPrev = schema.getFactoryTZTimeType().newBuff();
			}
			else if( classCode.equals( "a880" ) ) {
				editPrev = schema.getFactoryTZTimeCol().newBuff();
			}
			else if( classCode.equals( "a859" ) ) {
				editPrev = schema.getFactoryTZTimestampDef().newBuff();
			}
			else if( classCode.equals( "a85a" ) ) {
				editPrev = schema.getFactoryTZTimestampType().newBuff();
			}
			else if( classCode.equals( "a881" ) ) {
				editPrev = schema.getFactoryTZTimestampCol().newBuff();
			}
			else if( classCode.equals( "a85c" ) ) {
				editPrev = schema.getFactoryTextDef().newBuff();
			}
			else if( classCode.equals( "a85d" ) ) {
				editPrev = schema.getFactoryTextType().newBuff();
			}
			else if( classCode.equals( "a882" ) ) {
				editPrev = schema.getFactoryTextCol().newBuff();
			}
			else if( classCode.equals( "a85e" ) ) {
				editPrev = schema.getFactoryTimeDef().newBuff();
			}
			else if( classCode.equals( "a85f" ) ) {
				editPrev = schema.getFactoryTimeType().newBuff();
			}
			else if( classCode.equals( "a883" ) ) {
				editPrev = schema.getFactoryTimeCol().newBuff();
			}
			else if( classCode.equals( "a860" ) ) {
				editPrev = schema.getFactoryTimestampDef().newBuff();
			}
			else if( classCode.equals( "a861" ) ) {
				editPrev = schema.getFactoryTimestampType().newBuff();
			}
			else if( classCode.equals( "a884" ) ) {
				editPrev = schema.getFactoryTimestampCol().newBuff();
			}
			else if( classCode.equals( "a862" ) ) {
				editPrev = schema.getFactoryTokenDef().newBuff();
			}
			else if( classCode.equals( "a863" ) ) {
				editPrev = schema.getFactoryTokenType().newBuff();
			}
			else if( classCode.equals( "a885" ) ) {
				editPrev = schema.getFactoryTokenCol().newBuff();
			}
			else if( classCode.equals( "a864" ) ) {
				editPrev = schema.getFactoryUInt16Def().newBuff();
			}
			else if( classCode.equals( "a865" ) ) {
				editPrev = schema.getFactoryUInt16Type().newBuff();
			}
			else if( classCode.equals( "a886" ) ) {
				editPrev = schema.getFactoryUInt16Col().newBuff();
			}
			else if( classCode.equals( "a866" ) ) {
				editPrev = schema.getFactoryUInt32Def().newBuff();
			}
			else if( classCode.equals( "a867" ) ) {
				editPrev = schema.getFactoryUInt32Type().newBuff();
			}
			else if( classCode.equals( "a887" ) ) {
				editPrev = schema.getFactoryUInt32Col().newBuff();
			}
			else if( classCode.equals( "a868" ) ) {
				editPrev = schema.getFactoryUInt64Def().newBuff();
			}
			else if( classCode.equals( "a869" ) ) {
				editPrev = schema.getFactoryUInt64Type().newBuff();
			}
			else if( classCode.equals( "a888" ) ) {
				editPrev = schema.getFactoryUInt64Col().newBuff();
			}
			else if( classCode.equals( "a86a" ) ) {
				editPrev = schema.getFactoryUuidDef().newBuff();
			}
			else if( classCode.equals( "a86c" ) ) {
				editPrev = schema.getFactoryUuidType().newBuff();
			}
			else if( classCode.equals( "a88b" ) ) {
				editPrev = schema.getFactoryUuidGen().newBuff();
			}
			else if( classCode.equals( "a889" ) ) {
				editPrev = schema.getFactoryUuidCol().newBuff();
			}
			else if( classCode.equals( "a86b" ) ) {
				editPrev = schema.getFactoryUuid6Def().newBuff();
			}
			else if( classCode.equals( "a86d" ) ) {
				editPrev = schema.getFactoryUuid6Type().newBuff();
			}
			else if( classCode.equals( "a88c" ) ) {
				editPrev = schema.getFactoryUuid6Gen().newBuff();
			}
			else if( classCode.equals( "a88a" ) ) {
				editPrev = schema.getFactoryUuid6Col().newBuff();
			}
			else if( classCode.equals( "a85b" ) ) {
				editPrev = schema.getFactoryTableCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editPrev.set( prev );
			editPrev.setOptionalNextTenantId( nextTenantId );
			editPrev.setOptionalNextId( nextId );
			if( classCode.equals( "a80c" ) ) {
				schema.getTableValue().updateValue( Authorization, editPrev );
			}
			else if( classCode.equals( "a80d" ) ) {
				schema.getTableAtom().updateAtom( Authorization, (YCFBamAtomBuff)editPrev );
			}
			else if( classCode.equals( "a80e" ) ) {
				schema.getTableBlobDef().updateBlobDef( Authorization, (YCFBamBlobDefBuff)editPrev );
			}
			else if( classCode.equals( "a80f" ) ) {
				schema.getTableBlobType().updateBlobType( Authorization, (YCFBamBlobTypeBuff)editPrev );
			}
			else if( classCode.equals( "a86e" ) ) {
				schema.getTableBlobCol().updateBlobCol( Authorization, (YCFBamBlobColBuff)editPrev );
			}
			else if( classCode.equals( "a810" ) ) {
				schema.getTableBoolDef().updateBoolDef( Authorization, (YCFBamBoolDefBuff)editPrev );
			}
			else if( classCode.equals( "a811" ) ) {
				schema.getTableBoolType().updateBoolType( Authorization, (YCFBamBoolTypeBuff)editPrev );
			}
			else if( classCode.equals( "a86f" ) ) {
				schema.getTableBoolCol().updateBoolCol( Authorization, (YCFBamBoolColBuff)editPrev );
			}
			else if( classCode.equals( "a818" ) ) {
				schema.getTableDateDef().updateDateDef( Authorization, (YCFBamDateDefBuff)editPrev );
			}
			else if( classCode.equals( "a819" ) ) {
				schema.getTableDateType().updateDateType( Authorization, (YCFBamDateTypeBuff)editPrev );
			}
			else if( classCode.equals( "a870" ) ) {
				schema.getTableDateCol().updateDateCol( Authorization, (YCFBamDateColBuff)editPrev );
			}
			else if( classCode.equals( "a81f" ) ) {
				schema.getTableDoubleDef().updateDoubleDef( Authorization, (YCFBamDoubleDefBuff)editPrev );
			}
			else if( classCode.equals( "a820" ) ) {
				schema.getTableDoubleType().updateDoubleType( Authorization, (YCFBamDoubleTypeBuff)editPrev );
			}
			else if( classCode.equals( "a871" ) ) {
				schema.getTableDoubleCol().updateDoubleCol( Authorization, (YCFBamDoubleColBuff)editPrev );
			}
			else if( classCode.equals( "a822" ) ) {
				schema.getTableFloatDef().updateFloatDef( Authorization, (YCFBamFloatDefBuff)editPrev );
			}
			else if( classCode.equals( "a823" ) ) {
				schema.getTableFloatType().updateFloatType( Authorization, (YCFBamFloatTypeBuff)editPrev );
			}
			else if( classCode.equals( "a874" ) ) {
				schema.getTableFloatCol().updateFloatCol( Authorization, (YCFBamFloatColBuff)editPrev );
			}
			else if( classCode.equals( "a826" ) ) {
				schema.getTableInt16Def().updateInt16Def( Authorization, (YCFBamInt16DefBuff)editPrev );
			}
			else if( classCode.equals( "a827" ) ) {
				schema.getTableInt16Type().updateInt16Type( Authorization, (YCFBamInt16TypeBuff)editPrev );
			}
			else if( classCode.equals( "a875" ) ) {
				schema.getTableId16Gen().updateId16Gen( Authorization, (YCFBamId16GenBuff)editPrev );
			}
			else if( classCode.equals( "a872" ) ) {
				schema.getTableEnumDef().updateEnumDef( Authorization, (YCFBamEnumDefBuff)editPrev );
			}
			else if( classCode.equals( "a873" ) ) {
				schema.getTableEnumType().updateEnumType( Authorization, (YCFBamEnumTypeBuff)editPrev );
			}
			else if( classCode.equals( "a878" ) ) {
				schema.getTableInt16Col().updateInt16Col( Authorization, (YCFBamInt16ColBuff)editPrev );
			}
			else if( classCode.equals( "a828" ) ) {
				schema.getTableInt32Def().updateInt32Def( Authorization, (YCFBamInt32DefBuff)editPrev );
			}
			else if( classCode.equals( "a829" ) ) {
				schema.getTableInt32Type().updateInt32Type( Authorization, (YCFBamInt32TypeBuff)editPrev );
			}
			else if( classCode.equals( "a876" ) ) {
				schema.getTableId32Gen().updateId32Gen( Authorization, (YCFBamId32GenBuff)editPrev );
			}
			else if( classCode.equals( "a879" ) ) {
				schema.getTableInt32Col().updateInt32Col( Authorization, (YCFBamInt32ColBuff)editPrev );
			}
			else if( classCode.equals( "a82a" ) ) {
				schema.getTableInt64Def().updateInt64Def( Authorization, (YCFBamInt64DefBuff)editPrev );
			}
			else if( classCode.equals( "a82b" ) ) {
				schema.getTableInt64Type().updateInt64Type( Authorization, (YCFBamInt64TypeBuff)editPrev );
			}
			else if( classCode.equals( "a877" ) ) {
				schema.getTableId64Gen().updateId64Gen( Authorization, (YCFBamId64GenBuff)editPrev );
			}
			else if( classCode.equals( "a87a" ) ) {
				schema.getTableInt64Col().updateInt64Col( Authorization, (YCFBamInt64ColBuff)editPrev );
			}
			else if( classCode.equals( "a82c" ) ) {
				schema.getTableNmTokenDef().updateNmTokenDef( Authorization, (YCFBamNmTokenDefBuff)editPrev );
			}
			else if( classCode.equals( "a82d" ) ) {
				schema.getTableNmTokenType().updateNmTokenType( Authorization, (YCFBamNmTokenTypeBuff)editPrev );
			}
			else if( classCode.equals( "a87b" ) ) {
				schema.getTableNmTokenCol().updateNmTokenCol( Authorization, (YCFBamNmTokenColBuff)editPrev );
			}
			else if( classCode.equals( "a82e" ) ) {
				schema.getTableNmTokensDef().updateNmTokensDef( Authorization, (YCFBamNmTokensDefBuff)editPrev );
			}
			else if( classCode.equals( "a82f" ) ) {
				schema.getTableNmTokensType().updateNmTokensType( Authorization, (YCFBamNmTokensTypeBuff)editPrev );
			}
			else if( classCode.equals( "a87c" ) ) {
				schema.getTableNmTokensCol().updateNmTokensCol( Authorization, (YCFBamNmTokensColBuff)editPrev );
			}
			else if( classCode.equals( "a830" ) ) {
				schema.getTableNumberDef().updateNumberDef( Authorization, (YCFBamNumberDefBuff)editPrev );
			}
			else if( classCode.equals( "a831" ) ) {
				schema.getTableNumberType().updateNumberType( Authorization, (YCFBamNumberTypeBuff)editPrev );
			}
			else if( classCode.equals( "a87d" ) ) {
				schema.getTableNumberCol().updateNumberCol( Authorization, (YCFBamNumberColBuff)editPrev );
			}
			else if( classCode.equals( "a83b" ) ) {
				schema.getTableDbKeyHash128Def().updateDbKeyHash128Def( Authorization, (YCFBamDbKeyHash128DefBuff)editPrev );
			}
			else if( classCode.equals( "a83c" ) ) {
				schema.getTableDbKeyHash128Col().updateDbKeyHash128Col( Authorization, (YCFBamDbKeyHash128ColBuff)editPrev );
			}
			else if( classCode.equals( "a83d" ) ) {
				schema.getTableDbKeyHash128Type().updateDbKeyHash128Type( Authorization, (YCFBamDbKeyHash128TypeBuff)editPrev );
			}
			else if( classCode.equals( "a83e" ) ) {
				schema.getTableDbKeyHash128Gen().updateDbKeyHash128Gen( Authorization, (YCFBamDbKeyHash128GenBuff)editPrev );
			}
			else if( classCode.equals( "a83f" ) ) {
				schema.getTableDbKeyHash160Def().updateDbKeyHash160Def( Authorization, (YCFBamDbKeyHash160DefBuff)editPrev );
			}
			else if( classCode.equals( "a840" ) ) {
				schema.getTableDbKeyHash160Col().updateDbKeyHash160Col( Authorization, (YCFBamDbKeyHash160ColBuff)editPrev );
			}
			else if( classCode.equals( "a841" ) ) {
				schema.getTableDbKeyHash160Type().updateDbKeyHash160Type( Authorization, (YCFBamDbKeyHash160TypeBuff)editPrev );
			}
			else if( classCode.equals( "a842" ) ) {
				schema.getTableDbKeyHash160Gen().updateDbKeyHash160Gen( Authorization, (YCFBamDbKeyHash160GenBuff)editPrev );
			}
			else if( classCode.equals( "a843" ) ) {
				schema.getTableDbKeyHash224Def().updateDbKeyHash224Def( Authorization, (YCFBamDbKeyHash224DefBuff)editPrev );
			}
			else if( classCode.equals( "a844" ) ) {
				schema.getTableDbKeyHash224Col().updateDbKeyHash224Col( Authorization, (YCFBamDbKeyHash224ColBuff)editPrev );
			}
			else if( classCode.equals( "a845" ) ) {
				schema.getTableDbKeyHash224Type().updateDbKeyHash224Type( Authorization, (YCFBamDbKeyHash224TypeBuff)editPrev );
			}
			else if( classCode.equals( "a846" ) ) {
				schema.getTableDbKeyHash224Gen().updateDbKeyHash224Gen( Authorization, (YCFBamDbKeyHash224GenBuff)editPrev );
			}
			else if( classCode.equals( "a847" ) ) {
				schema.getTableDbKeyHash256Def().updateDbKeyHash256Def( Authorization, (YCFBamDbKeyHash256DefBuff)editPrev );
			}
			else if( classCode.equals( "a848" ) ) {
				schema.getTableDbKeyHash256Col().updateDbKeyHash256Col( Authorization, (YCFBamDbKeyHash256ColBuff)editPrev );
			}
			else if( classCode.equals( "a849" ) ) {
				schema.getTableDbKeyHash256Type().updateDbKeyHash256Type( Authorization, (YCFBamDbKeyHash256TypeBuff)editPrev );
			}
			else if( classCode.equals( "a84a" ) ) {
				schema.getTableDbKeyHash256Gen().updateDbKeyHash256Gen( Authorization, (YCFBamDbKeyHash256GenBuff)editPrev );
			}
			else if( classCode.equals( "a84b" ) ) {
				schema.getTableDbKeyHash384Def().updateDbKeyHash384Def( Authorization, (YCFBamDbKeyHash384DefBuff)editPrev );
			}
			else if( classCode.equals( "a84c" ) ) {
				schema.getTableDbKeyHash384Col().updateDbKeyHash384Col( Authorization, (YCFBamDbKeyHash384ColBuff)editPrev );
			}
			else if( classCode.equals( "a84d" ) ) {
				schema.getTableDbKeyHash384Type().updateDbKeyHash384Type( Authorization, (YCFBamDbKeyHash384TypeBuff)editPrev );
			}
			else if( classCode.equals( "a84e" ) ) {
				schema.getTableDbKeyHash384Gen().updateDbKeyHash384Gen( Authorization, (YCFBamDbKeyHash384GenBuff)editPrev );
			}
			else if( classCode.equals( "a84f" ) ) {
				schema.getTableDbKeyHash512Def().updateDbKeyHash512Def( Authorization, (YCFBamDbKeyHash512DefBuff)editPrev );
			}
			else if( classCode.equals( "a850" ) ) {
				schema.getTableDbKeyHash512Col().updateDbKeyHash512Col( Authorization, (YCFBamDbKeyHash512ColBuff)editPrev );
			}
			else if( classCode.equals( "a851" ) ) {
				schema.getTableDbKeyHash512Type().updateDbKeyHash512Type( Authorization, (YCFBamDbKeyHash512TypeBuff)editPrev );
			}
			else if( classCode.equals( "a852" ) ) {
				schema.getTableDbKeyHash512Gen().updateDbKeyHash512Gen( Authorization, (YCFBamDbKeyHash512GenBuff)editPrev );
			}
			else if( classCode.equals( "a853" ) ) {
				schema.getTableStringDef().updateStringDef( Authorization, (YCFBamStringDefBuff)editPrev );
			}
			else if( classCode.equals( "a854" ) ) {
				schema.getTableStringType().updateStringType( Authorization, (YCFBamStringTypeBuff)editPrev );
			}
			else if( classCode.equals( "a87e" ) ) {
				schema.getTableStringCol().updateStringCol( Authorization, (YCFBamStringColBuff)editPrev );
			}
			else if( classCode.equals( "a855" ) ) {
				schema.getTableTZDateDef().updateTZDateDef( Authorization, (YCFBamTZDateDefBuff)editPrev );
			}
			else if( classCode.equals( "a856" ) ) {
				schema.getTableTZDateType().updateTZDateType( Authorization, (YCFBamTZDateTypeBuff)editPrev );
			}
			else if( classCode.equals( "a87f" ) ) {
				schema.getTableTZDateCol().updateTZDateCol( Authorization, (YCFBamTZDateColBuff)editPrev );
			}
			else if( classCode.equals( "a857" ) ) {
				schema.getTableTZTimeDef().updateTZTimeDef( Authorization, (YCFBamTZTimeDefBuff)editPrev );
			}
			else if( classCode.equals( "a858" ) ) {
				schema.getTableTZTimeType().updateTZTimeType( Authorization, (YCFBamTZTimeTypeBuff)editPrev );
			}
			else if( classCode.equals( "a880" ) ) {
				schema.getTableTZTimeCol().updateTZTimeCol( Authorization, (YCFBamTZTimeColBuff)editPrev );
			}
			else if( classCode.equals( "a859" ) ) {
				schema.getTableTZTimestampDef().updateTZTimestampDef( Authorization, (YCFBamTZTimestampDefBuff)editPrev );
			}
			else if( classCode.equals( "a85a" ) ) {
				schema.getTableTZTimestampType().updateTZTimestampType( Authorization, (YCFBamTZTimestampTypeBuff)editPrev );
			}
			else if( classCode.equals( "a881" ) ) {
				schema.getTableTZTimestampCol().updateTZTimestampCol( Authorization, (YCFBamTZTimestampColBuff)editPrev );
			}
			else if( classCode.equals( "a85c" ) ) {
				schema.getTableTextDef().updateTextDef( Authorization, (YCFBamTextDefBuff)editPrev );
			}
			else if( classCode.equals( "a85d" ) ) {
				schema.getTableTextType().updateTextType( Authorization, (YCFBamTextTypeBuff)editPrev );
			}
			else if( classCode.equals( "a882" ) ) {
				schema.getTableTextCol().updateTextCol( Authorization, (YCFBamTextColBuff)editPrev );
			}
			else if( classCode.equals( "a85e" ) ) {
				schema.getTableTimeDef().updateTimeDef( Authorization, (YCFBamTimeDefBuff)editPrev );
			}
			else if( classCode.equals( "a85f" ) ) {
				schema.getTableTimeType().updateTimeType( Authorization, (YCFBamTimeTypeBuff)editPrev );
			}
			else if( classCode.equals( "a883" ) ) {
				schema.getTableTimeCol().updateTimeCol( Authorization, (YCFBamTimeColBuff)editPrev );
			}
			else if( classCode.equals( "a860" ) ) {
				schema.getTableTimestampDef().updateTimestampDef( Authorization, (YCFBamTimestampDefBuff)editPrev );
			}
			else if( classCode.equals( "a861" ) ) {
				schema.getTableTimestampType().updateTimestampType( Authorization, (YCFBamTimestampTypeBuff)editPrev );
			}
			else if( classCode.equals( "a884" ) ) {
				schema.getTableTimestampCol().updateTimestampCol( Authorization, (YCFBamTimestampColBuff)editPrev );
			}
			else if( classCode.equals( "a862" ) ) {
				schema.getTableTokenDef().updateTokenDef( Authorization, (YCFBamTokenDefBuff)editPrev );
			}
			else if( classCode.equals( "a863" ) ) {
				schema.getTableTokenType().updateTokenType( Authorization, (YCFBamTokenTypeBuff)editPrev );
			}
			else if( classCode.equals( "a885" ) ) {
				schema.getTableTokenCol().updateTokenCol( Authorization, (YCFBamTokenColBuff)editPrev );
			}
			else if( classCode.equals( "a864" ) ) {
				schema.getTableUInt16Def().updateUInt16Def( Authorization, (YCFBamUInt16DefBuff)editPrev );
			}
			else if( classCode.equals( "a865" ) ) {
				schema.getTableUInt16Type().updateUInt16Type( Authorization, (YCFBamUInt16TypeBuff)editPrev );
			}
			else if( classCode.equals( "a886" ) ) {
				schema.getTableUInt16Col().updateUInt16Col( Authorization, (YCFBamUInt16ColBuff)editPrev );
			}
			else if( classCode.equals( "a866" ) ) {
				schema.getTableUInt32Def().updateUInt32Def( Authorization, (YCFBamUInt32DefBuff)editPrev );
			}
			else if( classCode.equals( "a867" ) ) {
				schema.getTableUInt32Type().updateUInt32Type( Authorization, (YCFBamUInt32TypeBuff)editPrev );
			}
			else if( classCode.equals( "a887" ) ) {
				schema.getTableUInt32Col().updateUInt32Col( Authorization, (YCFBamUInt32ColBuff)editPrev );
			}
			else if( classCode.equals( "a868" ) ) {
				schema.getTableUInt64Def().updateUInt64Def( Authorization, (YCFBamUInt64DefBuff)editPrev );
			}
			else if( classCode.equals( "a869" ) ) {
				schema.getTableUInt64Type().updateUInt64Type( Authorization, (YCFBamUInt64TypeBuff)editPrev );
			}
			else if( classCode.equals( "a888" ) ) {
				schema.getTableUInt64Col().updateUInt64Col( Authorization, (YCFBamUInt64ColBuff)editPrev );
			}
			else if( classCode.equals( "a86a" ) ) {
				schema.getTableUuidDef().updateUuidDef( Authorization, (YCFBamUuidDefBuff)editPrev );
			}
			else if( classCode.equals( "a86c" ) ) {
				schema.getTableUuidType().updateUuidType( Authorization, (YCFBamUuidTypeBuff)editPrev );
			}
			else if( classCode.equals( "a88b" ) ) {
				schema.getTableUuidGen().updateUuidGen( Authorization, (YCFBamUuidGenBuff)editPrev );
			}
			else if( classCode.equals( "a889" ) ) {
				schema.getTableUuidCol().updateUuidCol( Authorization, (YCFBamUuidColBuff)editPrev );
			}
			else if( classCode.equals( "a86b" ) ) {
				schema.getTableUuid6Def().updateUuid6Def( Authorization, (YCFBamUuid6DefBuff)editPrev );
			}
			else if( classCode.equals( "a86d" ) ) {
				schema.getTableUuid6Type().updateUuid6Type( Authorization, (YCFBamUuid6TypeBuff)editPrev );
			}
			else if( classCode.equals( "a88c" ) ) {
				schema.getTableUuid6Gen().updateUuid6Gen( Authorization, (YCFBamUuid6GenBuff)editPrev );
			}
			else if( classCode.equals( "a88a" ) ) {
				schema.getTableUuid6Col().updateUuid6Col( Authorization, (YCFBamUuid6ColBuff)editPrev );
			}
			else if( classCode.equals( "a85b" ) ) {
				schema.getTableTableCol().updateTableCol( Authorization, (YCFBamTableColBuff)editPrev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		YCFBamValueBuff next = null;
		if( ( nextTenantId != null )
			&& ( nextId != null ) )
		{
			next = schema.getTableValue().readDerivedByIdIdx( Authorization,
				nextTenantId,
				nextId );
			if( next == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"next" );
			}
			YCFBamValueBuff editNext;
			classCode = next.getClassCode();
			if( classCode.equals( "a80c" ) ) {
				editNext = schema.getFactoryValue().newBuff();
			}
			else if( classCode.equals( "a80d" ) ) {
				editNext = schema.getFactoryAtom().newBuff();
			}
			else if( classCode.equals( "a80e" ) ) {
				editNext = schema.getFactoryBlobDef().newBuff();
			}
			else if( classCode.equals( "a80f" ) ) {
				editNext = schema.getFactoryBlobType().newBuff();
			}
			else if( classCode.equals( "a86e" ) ) {
				editNext = schema.getFactoryBlobCol().newBuff();
			}
			else if( classCode.equals( "a810" ) ) {
				editNext = schema.getFactoryBoolDef().newBuff();
			}
			else if( classCode.equals( "a811" ) ) {
				editNext = schema.getFactoryBoolType().newBuff();
			}
			else if( classCode.equals( "a86f" ) ) {
				editNext = schema.getFactoryBoolCol().newBuff();
			}
			else if( classCode.equals( "a818" ) ) {
				editNext = schema.getFactoryDateDef().newBuff();
			}
			else if( classCode.equals( "a819" ) ) {
				editNext = schema.getFactoryDateType().newBuff();
			}
			else if( classCode.equals( "a870" ) ) {
				editNext = schema.getFactoryDateCol().newBuff();
			}
			else if( classCode.equals( "a81f" ) ) {
				editNext = schema.getFactoryDoubleDef().newBuff();
			}
			else if( classCode.equals( "a820" ) ) {
				editNext = schema.getFactoryDoubleType().newBuff();
			}
			else if( classCode.equals( "a871" ) ) {
				editNext = schema.getFactoryDoubleCol().newBuff();
			}
			else if( classCode.equals( "a822" ) ) {
				editNext = schema.getFactoryFloatDef().newBuff();
			}
			else if( classCode.equals( "a823" ) ) {
				editNext = schema.getFactoryFloatType().newBuff();
			}
			else if( classCode.equals( "a874" ) ) {
				editNext = schema.getFactoryFloatCol().newBuff();
			}
			else if( classCode.equals( "a826" ) ) {
				editNext = schema.getFactoryInt16Def().newBuff();
			}
			else if( classCode.equals( "a827" ) ) {
				editNext = schema.getFactoryInt16Type().newBuff();
			}
			else if( classCode.equals( "a875" ) ) {
				editNext = schema.getFactoryId16Gen().newBuff();
			}
			else if( classCode.equals( "a872" ) ) {
				editNext = schema.getFactoryEnumDef().newBuff();
			}
			else if( classCode.equals( "a873" ) ) {
				editNext = schema.getFactoryEnumType().newBuff();
			}
			else if( classCode.equals( "a878" ) ) {
				editNext = schema.getFactoryInt16Col().newBuff();
			}
			else if( classCode.equals( "a828" ) ) {
				editNext = schema.getFactoryInt32Def().newBuff();
			}
			else if( classCode.equals( "a829" ) ) {
				editNext = schema.getFactoryInt32Type().newBuff();
			}
			else if( classCode.equals( "a876" ) ) {
				editNext = schema.getFactoryId32Gen().newBuff();
			}
			else if( classCode.equals( "a879" ) ) {
				editNext = schema.getFactoryInt32Col().newBuff();
			}
			else if( classCode.equals( "a82a" ) ) {
				editNext = schema.getFactoryInt64Def().newBuff();
			}
			else if( classCode.equals( "a82b" ) ) {
				editNext = schema.getFactoryInt64Type().newBuff();
			}
			else if( classCode.equals( "a877" ) ) {
				editNext = schema.getFactoryId64Gen().newBuff();
			}
			else if( classCode.equals( "a87a" ) ) {
				editNext = schema.getFactoryInt64Col().newBuff();
			}
			else if( classCode.equals( "a82c" ) ) {
				editNext = schema.getFactoryNmTokenDef().newBuff();
			}
			else if( classCode.equals( "a82d" ) ) {
				editNext = schema.getFactoryNmTokenType().newBuff();
			}
			else if( classCode.equals( "a87b" ) ) {
				editNext = schema.getFactoryNmTokenCol().newBuff();
			}
			else if( classCode.equals( "a82e" ) ) {
				editNext = schema.getFactoryNmTokensDef().newBuff();
			}
			else if( classCode.equals( "a82f" ) ) {
				editNext = schema.getFactoryNmTokensType().newBuff();
			}
			else if( classCode.equals( "a87c" ) ) {
				editNext = schema.getFactoryNmTokensCol().newBuff();
			}
			else if( classCode.equals( "a830" ) ) {
				editNext = schema.getFactoryNumberDef().newBuff();
			}
			else if( classCode.equals( "a831" ) ) {
				editNext = schema.getFactoryNumberType().newBuff();
			}
			else if( classCode.equals( "a87d" ) ) {
				editNext = schema.getFactoryNumberCol().newBuff();
			}
			else if( classCode.equals( "a83b" ) ) {
				editNext = schema.getFactoryDbKeyHash128Def().newBuff();
			}
			else if( classCode.equals( "a83c" ) ) {
				editNext = schema.getFactoryDbKeyHash128Col().newBuff();
			}
			else if( classCode.equals( "a83d" ) ) {
				editNext = schema.getFactoryDbKeyHash128Type().newBuff();
			}
			else if( classCode.equals( "a83e" ) ) {
				editNext = schema.getFactoryDbKeyHash128Gen().newBuff();
			}
			else if( classCode.equals( "a83f" ) ) {
				editNext = schema.getFactoryDbKeyHash160Def().newBuff();
			}
			else if( classCode.equals( "a840" ) ) {
				editNext = schema.getFactoryDbKeyHash160Col().newBuff();
			}
			else if( classCode.equals( "a841" ) ) {
				editNext = schema.getFactoryDbKeyHash160Type().newBuff();
			}
			else if( classCode.equals( "a842" ) ) {
				editNext = schema.getFactoryDbKeyHash160Gen().newBuff();
			}
			else if( classCode.equals( "a843" ) ) {
				editNext = schema.getFactoryDbKeyHash224Def().newBuff();
			}
			else if( classCode.equals( "a844" ) ) {
				editNext = schema.getFactoryDbKeyHash224Col().newBuff();
			}
			else if( classCode.equals( "a845" ) ) {
				editNext = schema.getFactoryDbKeyHash224Type().newBuff();
			}
			else if( classCode.equals( "a846" ) ) {
				editNext = schema.getFactoryDbKeyHash224Gen().newBuff();
			}
			else if( classCode.equals( "a847" ) ) {
				editNext = schema.getFactoryDbKeyHash256Def().newBuff();
			}
			else if( classCode.equals( "a848" ) ) {
				editNext = schema.getFactoryDbKeyHash256Col().newBuff();
			}
			else if( classCode.equals( "a849" ) ) {
				editNext = schema.getFactoryDbKeyHash256Type().newBuff();
			}
			else if( classCode.equals( "a84a" ) ) {
				editNext = schema.getFactoryDbKeyHash256Gen().newBuff();
			}
			else if( classCode.equals( "a84b" ) ) {
				editNext = schema.getFactoryDbKeyHash384Def().newBuff();
			}
			else if( classCode.equals( "a84c" ) ) {
				editNext = schema.getFactoryDbKeyHash384Col().newBuff();
			}
			else if( classCode.equals( "a84d" ) ) {
				editNext = schema.getFactoryDbKeyHash384Type().newBuff();
			}
			else if( classCode.equals( "a84e" ) ) {
				editNext = schema.getFactoryDbKeyHash384Gen().newBuff();
			}
			else if( classCode.equals( "a84f" ) ) {
				editNext = schema.getFactoryDbKeyHash512Def().newBuff();
			}
			else if( classCode.equals( "a850" ) ) {
				editNext = schema.getFactoryDbKeyHash512Col().newBuff();
			}
			else if( classCode.equals( "a851" ) ) {
				editNext = schema.getFactoryDbKeyHash512Type().newBuff();
			}
			else if( classCode.equals( "a852" ) ) {
				editNext = schema.getFactoryDbKeyHash512Gen().newBuff();
			}
			else if( classCode.equals( "a853" ) ) {
				editNext = schema.getFactoryStringDef().newBuff();
			}
			else if( classCode.equals( "a854" ) ) {
				editNext = schema.getFactoryStringType().newBuff();
			}
			else if( classCode.equals( "a87e" ) ) {
				editNext = schema.getFactoryStringCol().newBuff();
			}
			else if( classCode.equals( "a855" ) ) {
				editNext = schema.getFactoryTZDateDef().newBuff();
			}
			else if( classCode.equals( "a856" ) ) {
				editNext = schema.getFactoryTZDateType().newBuff();
			}
			else if( classCode.equals( "a87f" ) ) {
				editNext = schema.getFactoryTZDateCol().newBuff();
			}
			else if( classCode.equals( "a857" ) ) {
				editNext = schema.getFactoryTZTimeDef().newBuff();
			}
			else if( classCode.equals( "a858" ) ) {
				editNext = schema.getFactoryTZTimeType().newBuff();
			}
			else if( classCode.equals( "a880" ) ) {
				editNext = schema.getFactoryTZTimeCol().newBuff();
			}
			else if( classCode.equals( "a859" ) ) {
				editNext = schema.getFactoryTZTimestampDef().newBuff();
			}
			else if( classCode.equals( "a85a" ) ) {
				editNext = schema.getFactoryTZTimestampType().newBuff();
			}
			else if( classCode.equals( "a881" ) ) {
				editNext = schema.getFactoryTZTimestampCol().newBuff();
			}
			else if( classCode.equals( "a85c" ) ) {
				editNext = schema.getFactoryTextDef().newBuff();
			}
			else if( classCode.equals( "a85d" ) ) {
				editNext = schema.getFactoryTextType().newBuff();
			}
			else if( classCode.equals( "a882" ) ) {
				editNext = schema.getFactoryTextCol().newBuff();
			}
			else if( classCode.equals( "a85e" ) ) {
				editNext = schema.getFactoryTimeDef().newBuff();
			}
			else if( classCode.equals( "a85f" ) ) {
				editNext = schema.getFactoryTimeType().newBuff();
			}
			else if( classCode.equals( "a883" ) ) {
				editNext = schema.getFactoryTimeCol().newBuff();
			}
			else if( classCode.equals( "a860" ) ) {
				editNext = schema.getFactoryTimestampDef().newBuff();
			}
			else if( classCode.equals( "a861" ) ) {
				editNext = schema.getFactoryTimestampType().newBuff();
			}
			else if( classCode.equals( "a884" ) ) {
				editNext = schema.getFactoryTimestampCol().newBuff();
			}
			else if( classCode.equals( "a862" ) ) {
				editNext = schema.getFactoryTokenDef().newBuff();
			}
			else if( classCode.equals( "a863" ) ) {
				editNext = schema.getFactoryTokenType().newBuff();
			}
			else if( classCode.equals( "a885" ) ) {
				editNext = schema.getFactoryTokenCol().newBuff();
			}
			else if( classCode.equals( "a864" ) ) {
				editNext = schema.getFactoryUInt16Def().newBuff();
			}
			else if( classCode.equals( "a865" ) ) {
				editNext = schema.getFactoryUInt16Type().newBuff();
			}
			else if( classCode.equals( "a886" ) ) {
				editNext = schema.getFactoryUInt16Col().newBuff();
			}
			else if( classCode.equals( "a866" ) ) {
				editNext = schema.getFactoryUInt32Def().newBuff();
			}
			else if( classCode.equals( "a867" ) ) {
				editNext = schema.getFactoryUInt32Type().newBuff();
			}
			else if( classCode.equals( "a887" ) ) {
				editNext = schema.getFactoryUInt32Col().newBuff();
			}
			else if( classCode.equals( "a868" ) ) {
				editNext = schema.getFactoryUInt64Def().newBuff();
			}
			else if( classCode.equals( "a869" ) ) {
				editNext = schema.getFactoryUInt64Type().newBuff();
			}
			else if( classCode.equals( "a888" ) ) {
				editNext = schema.getFactoryUInt64Col().newBuff();
			}
			else if( classCode.equals( "a86a" ) ) {
				editNext = schema.getFactoryUuidDef().newBuff();
			}
			else if( classCode.equals( "a86c" ) ) {
				editNext = schema.getFactoryUuidType().newBuff();
			}
			else if( classCode.equals( "a88b" ) ) {
				editNext = schema.getFactoryUuidGen().newBuff();
			}
			else if( classCode.equals( "a889" ) ) {
				editNext = schema.getFactoryUuidCol().newBuff();
			}
			else if( classCode.equals( "a86b" ) ) {
				editNext = schema.getFactoryUuid6Def().newBuff();
			}
			else if( classCode.equals( "a86d" ) ) {
				editNext = schema.getFactoryUuid6Type().newBuff();
			}
			else if( classCode.equals( "a88c" ) ) {
				editNext = schema.getFactoryUuid6Gen().newBuff();
			}
			else if( classCode.equals( "a88a" ) ) {
				editNext = schema.getFactoryUuid6Col().newBuff();
			}
			else if( classCode.equals( "a85b" ) ) {
				editNext = schema.getFactoryTableCol().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editNext.set( next );
			editNext.setOptionalPrevTenantId( prevTenantId );
			editNext.setOptionalPrevId( prevId );
			if( classCode.equals( "a80c" ) ) {
				schema.getTableValue().updateValue( Authorization, editNext );
			}
			else if( classCode.equals( "a80d" ) ) {
				schema.getTableAtom().updateAtom( Authorization, (YCFBamAtomBuff)editNext );
			}
			else if( classCode.equals( "a80e" ) ) {
				schema.getTableBlobDef().updateBlobDef( Authorization, (YCFBamBlobDefBuff)editNext );
			}
			else if( classCode.equals( "a80f" ) ) {
				schema.getTableBlobType().updateBlobType( Authorization, (YCFBamBlobTypeBuff)editNext );
			}
			else if( classCode.equals( "a86e" ) ) {
				schema.getTableBlobCol().updateBlobCol( Authorization, (YCFBamBlobColBuff)editNext );
			}
			else if( classCode.equals( "a810" ) ) {
				schema.getTableBoolDef().updateBoolDef( Authorization, (YCFBamBoolDefBuff)editNext );
			}
			else if( classCode.equals( "a811" ) ) {
				schema.getTableBoolType().updateBoolType( Authorization, (YCFBamBoolTypeBuff)editNext );
			}
			else if( classCode.equals( "a86f" ) ) {
				schema.getTableBoolCol().updateBoolCol( Authorization, (YCFBamBoolColBuff)editNext );
			}
			else if( classCode.equals( "a818" ) ) {
				schema.getTableDateDef().updateDateDef( Authorization, (YCFBamDateDefBuff)editNext );
			}
			else if( classCode.equals( "a819" ) ) {
				schema.getTableDateType().updateDateType( Authorization, (YCFBamDateTypeBuff)editNext );
			}
			else if( classCode.equals( "a870" ) ) {
				schema.getTableDateCol().updateDateCol( Authorization, (YCFBamDateColBuff)editNext );
			}
			else if( classCode.equals( "a81f" ) ) {
				schema.getTableDoubleDef().updateDoubleDef( Authorization, (YCFBamDoubleDefBuff)editNext );
			}
			else if( classCode.equals( "a820" ) ) {
				schema.getTableDoubleType().updateDoubleType( Authorization, (YCFBamDoubleTypeBuff)editNext );
			}
			else if( classCode.equals( "a871" ) ) {
				schema.getTableDoubleCol().updateDoubleCol( Authorization, (YCFBamDoubleColBuff)editNext );
			}
			else if( classCode.equals( "a822" ) ) {
				schema.getTableFloatDef().updateFloatDef( Authorization, (YCFBamFloatDefBuff)editNext );
			}
			else if( classCode.equals( "a823" ) ) {
				schema.getTableFloatType().updateFloatType( Authorization, (YCFBamFloatTypeBuff)editNext );
			}
			else if( classCode.equals( "a874" ) ) {
				schema.getTableFloatCol().updateFloatCol( Authorization, (YCFBamFloatColBuff)editNext );
			}
			else if( classCode.equals( "a826" ) ) {
				schema.getTableInt16Def().updateInt16Def( Authorization, (YCFBamInt16DefBuff)editNext );
			}
			else if( classCode.equals( "a827" ) ) {
				schema.getTableInt16Type().updateInt16Type( Authorization, (YCFBamInt16TypeBuff)editNext );
			}
			else if( classCode.equals( "a875" ) ) {
				schema.getTableId16Gen().updateId16Gen( Authorization, (YCFBamId16GenBuff)editNext );
			}
			else if( classCode.equals( "a872" ) ) {
				schema.getTableEnumDef().updateEnumDef( Authorization, (YCFBamEnumDefBuff)editNext );
			}
			else if( classCode.equals( "a873" ) ) {
				schema.getTableEnumType().updateEnumType( Authorization, (YCFBamEnumTypeBuff)editNext );
			}
			else if( classCode.equals( "a878" ) ) {
				schema.getTableInt16Col().updateInt16Col( Authorization, (YCFBamInt16ColBuff)editNext );
			}
			else if( classCode.equals( "a828" ) ) {
				schema.getTableInt32Def().updateInt32Def( Authorization, (YCFBamInt32DefBuff)editNext );
			}
			else if( classCode.equals( "a829" ) ) {
				schema.getTableInt32Type().updateInt32Type( Authorization, (YCFBamInt32TypeBuff)editNext );
			}
			else if( classCode.equals( "a876" ) ) {
				schema.getTableId32Gen().updateId32Gen( Authorization, (YCFBamId32GenBuff)editNext );
			}
			else if( classCode.equals( "a879" ) ) {
				schema.getTableInt32Col().updateInt32Col( Authorization, (YCFBamInt32ColBuff)editNext );
			}
			else if( classCode.equals( "a82a" ) ) {
				schema.getTableInt64Def().updateInt64Def( Authorization, (YCFBamInt64DefBuff)editNext );
			}
			else if( classCode.equals( "a82b" ) ) {
				schema.getTableInt64Type().updateInt64Type( Authorization, (YCFBamInt64TypeBuff)editNext );
			}
			else if( classCode.equals( "a877" ) ) {
				schema.getTableId64Gen().updateId64Gen( Authorization, (YCFBamId64GenBuff)editNext );
			}
			else if( classCode.equals( "a87a" ) ) {
				schema.getTableInt64Col().updateInt64Col( Authorization, (YCFBamInt64ColBuff)editNext );
			}
			else if( classCode.equals( "a82c" ) ) {
				schema.getTableNmTokenDef().updateNmTokenDef( Authorization, (YCFBamNmTokenDefBuff)editNext );
			}
			else if( classCode.equals( "a82d" ) ) {
				schema.getTableNmTokenType().updateNmTokenType( Authorization, (YCFBamNmTokenTypeBuff)editNext );
			}
			else if( classCode.equals( "a87b" ) ) {
				schema.getTableNmTokenCol().updateNmTokenCol( Authorization, (YCFBamNmTokenColBuff)editNext );
			}
			else if( classCode.equals( "a82e" ) ) {
				schema.getTableNmTokensDef().updateNmTokensDef( Authorization, (YCFBamNmTokensDefBuff)editNext );
			}
			else if( classCode.equals( "a82f" ) ) {
				schema.getTableNmTokensType().updateNmTokensType( Authorization, (YCFBamNmTokensTypeBuff)editNext );
			}
			else if( classCode.equals( "a87c" ) ) {
				schema.getTableNmTokensCol().updateNmTokensCol( Authorization, (YCFBamNmTokensColBuff)editNext );
			}
			else if( classCode.equals( "a830" ) ) {
				schema.getTableNumberDef().updateNumberDef( Authorization, (YCFBamNumberDefBuff)editNext );
			}
			else if( classCode.equals( "a831" ) ) {
				schema.getTableNumberType().updateNumberType( Authorization, (YCFBamNumberTypeBuff)editNext );
			}
			else if( classCode.equals( "a87d" ) ) {
				schema.getTableNumberCol().updateNumberCol( Authorization, (YCFBamNumberColBuff)editNext );
			}
			else if( classCode.equals( "a83b" ) ) {
				schema.getTableDbKeyHash128Def().updateDbKeyHash128Def( Authorization, (YCFBamDbKeyHash128DefBuff)editNext );
			}
			else if( classCode.equals( "a83c" ) ) {
				schema.getTableDbKeyHash128Col().updateDbKeyHash128Col( Authorization, (YCFBamDbKeyHash128ColBuff)editNext );
			}
			else if( classCode.equals( "a83d" ) ) {
				schema.getTableDbKeyHash128Type().updateDbKeyHash128Type( Authorization, (YCFBamDbKeyHash128TypeBuff)editNext );
			}
			else if( classCode.equals( "a83e" ) ) {
				schema.getTableDbKeyHash128Gen().updateDbKeyHash128Gen( Authorization, (YCFBamDbKeyHash128GenBuff)editNext );
			}
			else if( classCode.equals( "a83f" ) ) {
				schema.getTableDbKeyHash160Def().updateDbKeyHash160Def( Authorization, (YCFBamDbKeyHash160DefBuff)editNext );
			}
			else if( classCode.equals( "a840" ) ) {
				schema.getTableDbKeyHash160Col().updateDbKeyHash160Col( Authorization, (YCFBamDbKeyHash160ColBuff)editNext );
			}
			else if( classCode.equals( "a841" ) ) {
				schema.getTableDbKeyHash160Type().updateDbKeyHash160Type( Authorization, (YCFBamDbKeyHash160TypeBuff)editNext );
			}
			else if( classCode.equals( "a842" ) ) {
				schema.getTableDbKeyHash160Gen().updateDbKeyHash160Gen( Authorization, (YCFBamDbKeyHash160GenBuff)editNext );
			}
			else if( classCode.equals( "a843" ) ) {
				schema.getTableDbKeyHash224Def().updateDbKeyHash224Def( Authorization, (YCFBamDbKeyHash224DefBuff)editNext );
			}
			else if( classCode.equals( "a844" ) ) {
				schema.getTableDbKeyHash224Col().updateDbKeyHash224Col( Authorization, (YCFBamDbKeyHash224ColBuff)editNext );
			}
			else if( classCode.equals( "a845" ) ) {
				schema.getTableDbKeyHash224Type().updateDbKeyHash224Type( Authorization, (YCFBamDbKeyHash224TypeBuff)editNext );
			}
			else if( classCode.equals( "a846" ) ) {
				schema.getTableDbKeyHash224Gen().updateDbKeyHash224Gen( Authorization, (YCFBamDbKeyHash224GenBuff)editNext );
			}
			else if( classCode.equals( "a847" ) ) {
				schema.getTableDbKeyHash256Def().updateDbKeyHash256Def( Authorization, (YCFBamDbKeyHash256DefBuff)editNext );
			}
			else if( classCode.equals( "a848" ) ) {
				schema.getTableDbKeyHash256Col().updateDbKeyHash256Col( Authorization, (YCFBamDbKeyHash256ColBuff)editNext );
			}
			else if( classCode.equals( "a849" ) ) {
				schema.getTableDbKeyHash256Type().updateDbKeyHash256Type( Authorization, (YCFBamDbKeyHash256TypeBuff)editNext );
			}
			else if( classCode.equals( "a84a" ) ) {
				schema.getTableDbKeyHash256Gen().updateDbKeyHash256Gen( Authorization, (YCFBamDbKeyHash256GenBuff)editNext );
			}
			else if( classCode.equals( "a84b" ) ) {
				schema.getTableDbKeyHash384Def().updateDbKeyHash384Def( Authorization, (YCFBamDbKeyHash384DefBuff)editNext );
			}
			else if( classCode.equals( "a84c" ) ) {
				schema.getTableDbKeyHash384Col().updateDbKeyHash384Col( Authorization, (YCFBamDbKeyHash384ColBuff)editNext );
			}
			else if( classCode.equals( "a84d" ) ) {
				schema.getTableDbKeyHash384Type().updateDbKeyHash384Type( Authorization, (YCFBamDbKeyHash384TypeBuff)editNext );
			}
			else if( classCode.equals( "a84e" ) ) {
				schema.getTableDbKeyHash384Gen().updateDbKeyHash384Gen( Authorization, (YCFBamDbKeyHash384GenBuff)editNext );
			}
			else if( classCode.equals( "a84f" ) ) {
				schema.getTableDbKeyHash512Def().updateDbKeyHash512Def( Authorization, (YCFBamDbKeyHash512DefBuff)editNext );
			}
			else if( classCode.equals( "a850" ) ) {
				schema.getTableDbKeyHash512Col().updateDbKeyHash512Col( Authorization, (YCFBamDbKeyHash512ColBuff)editNext );
			}
			else if( classCode.equals( "a851" ) ) {
				schema.getTableDbKeyHash512Type().updateDbKeyHash512Type( Authorization, (YCFBamDbKeyHash512TypeBuff)editNext );
			}
			else if( classCode.equals( "a852" ) ) {
				schema.getTableDbKeyHash512Gen().updateDbKeyHash512Gen( Authorization, (YCFBamDbKeyHash512GenBuff)editNext );
			}
			else if( classCode.equals( "a853" ) ) {
				schema.getTableStringDef().updateStringDef( Authorization, (YCFBamStringDefBuff)editNext );
			}
			else if( classCode.equals( "a854" ) ) {
				schema.getTableStringType().updateStringType( Authorization, (YCFBamStringTypeBuff)editNext );
			}
			else if( classCode.equals( "a87e" ) ) {
				schema.getTableStringCol().updateStringCol( Authorization, (YCFBamStringColBuff)editNext );
			}
			else if( classCode.equals( "a855" ) ) {
				schema.getTableTZDateDef().updateTZDateDef( Authorization, (YCFBamTZDateDefBuff)editNext );
			}
			else if( classCode.equals( "a856" ) ) {
				schema.getTableTZDateType().updateTZDateType( Authorization, (YCFBamTZDateTypeBuff)editNext );
			}
			else if( classCode.equals( "a87f" ) ) {
				schema.getTableTZDateCol().updateTZDateCol( Authorization, (YCFBamTZDateColBuff)editNext );
			}
			else if( classCode.equals( "a857" ) ) {
				schema.getTableTZTimeDef().updateTZTimeDef( Authorization, (YCFBamTZTimeDefBuff)editNext );
			}
			else if( classCode.equals( "a858" ) ) {
				schema.getTableTZTimeType().updateTZTimeType( Authorization, (YCFBamTZTimeTypeBuff)editNext );
			}
			else if( classCode.equals( "a880" ) ) {
				schema.getTableTZTimeCol().updateTZTimeCol( Authorization, (YCFBamTZTimeColBuff)editNext );
			}
			else if( classCode.equals( "a859" ) ) {
				schema.getTableTZTimestampDef().updateTZTimestampDef( Authorization, (YCFBamTZTimestampDefBuff)editNext );
			}
			else if( classCode.equals( "a85a" ) ) {
				schema.getTableTZTimestampType().updateTZTimestampType( Authorization, (YCFBamTZTimestampTypeBuff)editNext );
			}
			else if( classCode.equals( "a881" ) ) {
				schema.getTableTZTimestampCol().updateTZTimestampCol( Authorization, (YCFBamTZTimestampColBuff)editNext );
			}
			else if( classCode.equals( "a85c" ) ) {
				schema.getTableTextDef().updateTextDef( Authorization, (YCFBamTextDefBuff)editNext );
			}
			else if( classCode.equals( "a85d" ) ) {
				schema.getTableTextType().updateTextType( Authorization, (YCFBamTextTypeBuff)editNext );
			}
			else if( classCode.equals( "a882" ) ) {
				schema.getTableTextCol().updateTextCol( Authorization, (YCFBamTextColBuff)editNext );
			}
			else if( classCode.equals( "a85e" ) ) {
				schema.getTableTimeDef().updateTimeDef( Authorization, (YCFBamTimeDefBuff)editNext );
			}
			else if( classCode.equals( "a85f" ) ) {
				schema.getTableTimeType().updateTimeType( Authorization, (YCFBamTimeTypeBuff)editNext );
			}
			else if( classCode.equals( "a883" ) ) {
				schema.getTableTimeCol().updateTimeCol( Authorization, (YCFBamTimeColBuff)editNext );
			}
			else if( classCode.equals( "a860" ) ) {
				schema.getTableTimestampDef().updateTimestampDef( Authorization, (YCFBamTimestampDefBuff)editNext );
			}
			else if( classCode.equals( "a861" ) ) {
				schema.getTableTimestampType().updateTimestampType( Authorization, (YCFBamTimestampTypeBuff)editNext );
			}
			else if( classCode.equals( "a884" ) ) {
				schema.getTableTimestampCol().updateTimestampCol( Authorization, (YCFBamTimestampColBuff)editNext );
			}
			else if( classCode.equals( "a862" ) ) {
				schema.getTableTokenDef().updateTokenDef( Authorization, (YCFBamTokenDefBuff)editNext );
			}
			else if( classCode.equals( "a863" ) ) {
				schema.getTableTokenType().updateTokenType( Authorization, (YCFBamTokenTypeBuff)editNext );
			}
			else if( classCode.equals( "a885" ) ) {
				schema.getTableTokenCol().updateTokenCol( Authorization, (YCFBamTokenColBuff)editNext );
			}
			else if( classCode.equals( "a864" ) ) {
				schema.getTableUInt16Def().updateUInt16Def( Authorization, (YCFBamUInt16DefBuff)editNext );
			}
			else if( classCode.equals( "a865" ) ) {
				schema.getTableUInt16Type().updateUInt16Type( Authorization, (YCFBamUInt16TypeBuff)editNext );
			}
			else if( classCode.equals( "a886" ) ) {
				schema.getTableUInt16Col().updateUInt16Col( Authorization, (YCFBamUInt16ColBuff)editNext );
			}
			else if( classCode.equals( "a866" ) ) {
				schema.getTableUInt32Def().updateUInt32Def( Authorization, (YCFBamUInt32DefBuff)editNext );
			}
			else if( classCode.equals( "a867" ) ) {
				schema.getTableUInt32Type().updateUInt32Type( Authorization, (YCFBamUInt32TypeBuff)editNext );
			}
			else if( classCode.equals( "a887" ) ) {
				schema.getTableUInt32Col().updateUInt32Col( Authorization, (YCFBamUInt32ColBuff)editNext );
			}
			else if( classCode.equals( "a868" ) ) {
				schema.getTableUInt64Def().updateUInt64Def( Authorization, (YCFBamUInt64DefBuff)editNext );
			}
			else if( classCode.equals( "a869" ) ) {
				schema.getTableUInt64Type().updateUInt64Type( Authorization, (YCFBamUInt64TypeBuff)editNext );
			}
			else if( classCode.equals( "a888" ) ) {
				schema.getTableUInt64Col().updateUInt64Col( Authorization, (YCFBamUInt64ColBuff)editNext );
			}
			else if( classCode.equals( "a86a" ) ) {
				schema.getTableUuidDef().updateUuidDef( Authorization, (YCFBamUuidDefBuff)editNext );
			}
			else if( classCode.equals( "a86c" ) ) {
				schema.getTableUuidType().updateUuidType( Authorization, (YCFBamUuidTypeBuff)editNext );
			}
			else if( classCode.equals( "a88b" ) ) {
				schema.getTableUuidGen().updateUuidGen( Authorization, (YCFBamUuidGenBuff)editNext );
			}
			else if( classCode.equals( "a889" ) ) {
				schema.getTableUuidCol().updateUuidCol( Authorization, (YCFBamUuidColBuff)editNext );
			}
			else if( classCode.equals( "a86b" ) ) {
				schema.getTableUuid6Def().updateUuid6Def( Authorization, (YCFBamUuid6DefBuff)editNext );
			}
			else if( classCode.equals( "a86d" ) ) {
				schema.getTableUuid6Type().updateUuid6Type( Authorization, (YCFBamUuid6TypeBuff)editNext );
			}
			else if( classCode.equals( "a88c" ) ) {
				schema.getTableUuid6Gen().updateUuid6Gen( Authorization, (YCFBamUuid6GenBuff)editNext );
			}
			else if( classCode.equals( "a88a" ) ) {
				schema.getTableUuid6Col().updateUuid6Col( Authorization, (YCFBamUuid6ColBuff)editNext );
			}
			else if( classCode.equals( "a85b" ) ) {
				schema.getTableTableCol().updateTableCol( Authorization, (YCFBamTableColBuff)editNext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		// Short circuit self-referential code to prevent stack overflows
		Object arrCheckReferencingTableCols[] = schema.getTableTableCol().readDerivedByDataIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		if( arrCheckReferencingTableCols.length > 0 ) {
			schema.getTableTableCol().deleteTableColByDataIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		}
		// Short circuit self-referential code to prevent stack overflows
		Object arrCheckReferencingIndexCols[] = schema.getTableIndexCol().readDerivedByColIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		if( arrCheckReferencingIndexCols.length > 0 ) {
			schema.getTableIndexCol().deleteIndexColByColIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		}
		YCFBamValueByUNameIdxKey keyUNameIdx = schema.getFactoryValue().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredScopeId( existing.getRequiredScopeId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamValueByValTentIdxKey keyValTentIdx = schema.getFactoryValue().newValTentIdxKey();
		keyValTentIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFBamValueByScopeIdxKey keyScopeIdx = schema.getFactoryValue().newScopeIdxKey();
		keyScopeIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyScopeIdx.setRequiredScopeId( existing.getRequiredScopeId() );

		YCFBamValueByDefSchemaIdxKey keyDefSchemaIdx = schema.getFactoryValue().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		YCFBamValueByPrevIdxKey keyPrevIdx = schema.getFactoryValue().newPrevIdxKey();
		keyPrevIdx.setOptionalPrevTenantId( existing.getOptionalPrevTenantId() );
		keyPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamValueByNextIdxKey keyNextIdx = schema.getFactoryValue().newNextIdxKey();
		keyNextIdx.setOptionalNextTenantId( existing.getOptionalNextTenantId() );
		keyNextIdx.setOptionalNextId( existing.getOptionalNextId() );

		YCFBamValueByContPrevIdxKey keyContPrevIdx = schema.getFactoryValue().newContPrevIdxKey();
		keyContPrevIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyContPrevIdx.setRequiredScopeId( existing.getRequiredScopeId() );
		keyContPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamValueByContNextIdxKey keyContNextIdx = schema.getFactoryValue().newContNextIdxKey();
		keyContNextIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyContNextIdx.setRequiredScopeId( existing.getRequiredScopeId() );
		keyContNextIdx.setOptionalNextId( existing.getOptionalNextId() );

		YCFBamValueByCodeVisIdxKey keyCodeVisIdx = schema.getFactoryValue().newCodeVisIdxKey();
		keyCodeVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		YCFBamValueByScopeCodeVisIdxKey keyScopeCodeVisIdx = schema.getFactoryValue().newScopeCodeVisIdxKey();
		keyScopeCodeVisIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyScopeCodeVisIdx.setRequiredScopeId( existing.getRequiredScopeId() );
		keyScopeCodeVisIdx.setRequiredCodeVis( existing.getRequiredCodeVis() );

		// Validate reverse foreign keys

		if( schema.getTableAtom().readDerivedByIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteValue",
				"Superclass",
				"SuperClass",
				"Atom",
				pkey );
		}

		if( schema.getTableTableCol().readDerivedByIdIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ) != null )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteValue",
				"Superclass",
				"SuperClass",
				"TableCol",
				pkey );
		}

		if( schema.getTableIndexCol().readDerivedByColIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ).length > 0 )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteValue",
				"Lookup",
				"Column",
				"IndexCol",
				pkey );
		}

		if( schema.getTableParam().readDerivedByServerTypeIdx( Authorization,
					existing.getRequiredTenantId(),
					existing.getRequiredId() ).length > 0 )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteValue",
				"Lookup",
				"Type",
				"Param",
				pkey );
		}

		// Delete is valid
		Map< YCFBamValuePKey, YCFBamValueBuff > subdict;

		dictByPKey.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

		subdict = dictByValTentIdx.get( keyValTentIdx );
		subdict.remove( pkey );

		subdict = dictByScopeIdx.get( keyScopeIdx );
		subdict.remove( pkey );

		subdict = dictByDefSchemaIdx.get( keyDefSchemaIdx );
		subdict.remove( pkey );

		subdict = dictByPrevIdx.get( keyPrevIdx );
		subdict.remove( pkey );

		subdict = dictByNextIdx.get( keyNextIdx );
		subdict.remove( pkey );

		subdict = dictByContPrevIdx.get( keyContPrevIdx );
		subdict.remove( pkey );

		subdict = dictByContNextIdx.get( keyContNextIdx );
		subdict.remove( pkey );

		subdict = dictByCodeVisIdx.get( keyCodeVisIdx );
		subdict.remove( pkey );

		subdict = dictByScopeCodeVisIdx.get( keyScopeCodeVisIdx );
		subdict.remove( pkey );

	}
	public void deleteValueByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamValuePKey key = schema.getFactoryValue().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteValueByIdIdx( Authorization, key );
	}

	public void deleteValueByIdIdx( YCFSecAuthorization Authorization,
		YCFBamValuePKey argKey )
	{
		final String S_ProcName = "deleteValueByIdIdx";
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamValueBuff cur;
		LinkedList<YCFBamValueBuff> matchSet = new LinkedList<YCFBamValueBuff>();
		Iterator<YCFBamValueBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamValueBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableValue().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a80c".equals( subClassCode ) ) {
				schema.getTableValue().deleteValue( Authorization, cur );
			}
			else if( "a80d".equals( subClassCode ) ) {
				schema.getTableAtom().deleteAtom( Authorization, (YCFBamAtomBuff)cur );
			}
			else if( "a80e".equals( subClassCode ) ) {
				schema.getTableBlobDef().deleteBlobDef( Authorization, (YCFBamBlobDefBuff)cur );
			}
			else if( "a80f".equals( subClassCode ) ) {
				schema.getTableBlobType().deleteBlobType( Authorization, (YCFBamBlobTypeBuff)cur );
			}
			else if( "a86e".equals( subClassCode ) ) {
				schema.getTableBlobCol().deleteBlobCol( Authorization, (YCFBamBlobColBuff)cur );
			}
			else if( "a810".equals( subClassCode ) ) {
				schema.getTableBoolDef().deleteBoolDef( Authorization, (YCFBamBoolDefBuff)cur );
			}
			else if( "a811".equals( subClassCode ) ) {
				schema.getTableBoolType().deleteBoolType( Authorization, (YCFBamBoolTypeBuff)cur );
			}
			else if( "a86f".equals( subClassCode ) ) {
				schema.getTableBoolCol().deleteBoolCol( Authorization, (YCFBamBoolColBuff)cur );
			}
			else if( "a818".equals( subClassCode ) ) {
				schema.getTableDateDef().deleteDateDef( Authorization, (YCFBamDateDefBuff)cur );
			}
			else if( "a819".equals( subClassCode ) ) {
				schema.getTableDateType().deleteDateType( Authorization, (YCFBamDateTypeBuff)cur );
			}
			else if( "a870".equals( subClassCode ) ) {
				schema.getTableDateCol().deleteDateCol( Authorization, (YCFBamDateColBuff)cur );
			}
			else if( "a81f".equals( subClassCode ) ) {
				schema.getTableDoubleDef().deleteDoubleDef( Authorization, (YCFBamDoubleDefBuff)cur );
			}
			else if( "a820".equals( subClassCode ) ) {
				schema.getTableDoubleType().deleteDoubleType( Authorization, (YCFBamDoubleTypeBuff)cur );
			}
			else if( "a871".equals( subClassCode ) ) {
				schema.getTableDoubleCol().deleteDoubleCol( Authorization, (YCFBamDoubleColBuff)cur );
			}
			else if( "a822".equals( subClassCode ) ) {
				schema.getTableFloatDef().deleteFloatDef( Authorization, (YCFBamFloatDefBuff)cur );
			}
			else if( "a823".equals( subClassCode ) ) {
				schema.getTableFloatType().deleteFloatType( Authorization, (YCFBamFloatTypeBuff)cur );
			}
			else if( "a874".equals( subClassCode ) ) {
				schema.getTableFloatCol().deleteFloatCol( Authorization, (YCFBamFloatColBuff)cur );
			}
			else if( "a826".equals( subClassCode ) ) {
				schema.getTableInt16Def().deleteInt16Def( Authorization, (YCFBamInt16DefBuff)cur );
			}
			else if( "a827".equals( subClassCode ) ) {
				schema.getTableInt16Type().deleteInt16Type( Authorization, (YCFBamInt16TypeBuff)cur );
			}
			else if( "a875".equals( subClassCode ) ) {
				schema.getTableId16Gen().deleteId16Gen( Authorization, (YCFBamId16GenBuff)cur );
			}
			else if( "a872".equals( subClassCode ) ) {
				schema.getTableEnumDef().deleteEnumDef( Authorization, (YCFBamEnumDefBuff)cur );
			}
			else if( "a873".equals( subClassCode ) ) {
				schema.getTableEnumType().deleteEnumType( Authorization, (YCFBamEnumTypeBuff)cur );
			}
			else if( "a878".equals( subClassCode ) ) {
				schema.getTableInt16Col().deleteInt16Col( Authorization, (YCFBamInt16ColBuff)cur );
			}
			else if( "a828".equals( subClassCode ) ) {
				schema.getTableInt32Def().deleteInt32Def( Authorization, (YCFBamInt32DefBuff)cur );
			}
			else if( "a829".equals( subClassCode ) ) {
				schema.getTableInt32Type().deleteInt32Type( Authorization, (YCFBamInt32TypeBuff)cur );
			}
			else if( "a876".equals( subClassCode ) ) {
				schema.getTableId32Gen().deleteId32Gen( Authorization, (YCFBamId32GenBuff)cur );
			}
			else if( "a879".equals( subClassCode ) ) {
				schema.getTableInt32Col().deleteInt32Col( Authorization, (YCFBamInt32ColBuff)cur );
			}
			else if( "a82a".equals( subClassCode ) ) {
				schema.getTableInt64Def().deleteInt64Def( Authorization, (YCFBamInt64DefBuff)cur );
			}
			else if( "a82b".equals( subClassCode ) ) {
				schema.getTableInt64Type().deleteInt64Type( Authorization, (YCFBamInt64TypeBuff)cur );
			}
			else if( "a877".equals( subClassCode ) ) {
				schema.getTableId64Gen().deleteId64Gen( Authorization, (YCFBamId64GenBuff)cur );
			}
			else if( "a87a".equals( subClassCode ) ) {
				schema.getTableInt64Col().deleteInt64Col( Authorization, (YCFBamInt64ColBuff)cur );
			}
			else if( "a82c".equals( subClassCode ) ) {
				schema.getTableNmTokenDef().deleteNmTokenDef( Authorization, (YCFBamNmTokenDefBuff)cur );
			}
			else if( "a82d".equals( subClassCode ) ) {
				schema.getTableNmTokenType().deleteNmTokenType( Authorization, (YCFBamNmTokenTypeBuff)cur );
			}
			else if( "a87b".equals( subClassCode ) ) {
				schema.getTableNmTokenCol().deleteNmTokenCol( Authorization, (YCFBamNmTokenColBuff)cur );
			}
			else if( "a82e".equals( subClassCode ) ) {
				schema.getTableNmTokensDef().deleteNmTokensDef( Authorization, (YCFBamNmTokensDefBuff)cur );
			}
			else if( "a82f".equals( subClassCode ) ) {
				schema.getTableNmTokensType().deleteNmTokensType( Authorization, (YCFBamNmTokensTypeBuff)cur );
			}
			else if( "a87c".equals( subClassCode ) ) {
				schema.getTableNmTokensCol().deleteNmTokensCol( Authorization, (YCFBamNmTokensColBuff)cur );
			}
			else if( "a830".equals( subClassCode ) ) {
				schema.getTableNumberDef().deleteNumberDef( Authorization, (YCFBamNumberDefBuff)cur );
			}
			else if( "a831".equals( subClassCode ) ) {
				schema.getTableNumberType().deleteNumberType( Authorization, (YCFBamNumberTypeBuff)cur );
			}
			else if( "a87d".equals( subClassCode ) ) {
				schema.getTableNumberCol().deleteNumberCol( Authorization, (YCFBamNumberColBuff)cur );
			}
			else if( "a83b".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Def().deleteDbKeyHash128Def( Authorization, (YCFBamDbKeyHash128DefBuff)cur );
			}
			else if( "a83c".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Col().deleteDbKeyHash128Col( Authorization, (YCFBamDbKeyHash128ColBuff)cur );
			}
			else if( "a83d".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Type().deleteDbKeyHash128Type( Authorization, (YCFBamDbKeyHash128TypeBuff)cur );
			}
			else if( "a83e".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Gen().deleteDbKeyHash128Gen( Authorization, (YCFBamDbKeyHash128GenBuff)cur );
			}
			else if( "a83f".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Def().deleteDbKeyHash160Def( Authorization, (YCFBamDbKeyHash160DefBuff)cur );
			}
			else if( "a840".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Col().deleteDbKeyHash160Col( Authorization, (YCFBamDbKeyHash160ColBuff)cur );
			}
			else if( "a841".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Type().deleteDbKeyHash160Type( Authorization, (YCFBamDbKeyHash160TypeBuff)cur );
			}
			else if( "a842".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Gen().deleteDbKeyHash160Gen( Authorization, (YCFBamDbKeyHash160GenBuff)cur );
			}
			else if( "a843".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Def().deleteDbKeyHash224Def( Authorization, (YCFBamDbKeyHash224DefBuff)cur );
			}
			else if( "a844".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Col().deleteDbKeyHash224Col( Authorization, (YCFBamDbKeyHash224ColBuff)cur );
			}
			else if( "a845".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Type().deleteDbKeyHash224Type( Authorization, (YCFBamDbKeyHash224TypeBuff)cur );
			}
			else if( "a846".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Gen().deleteDbKeyHash224Gen( Authorization, (YCFBamDbKeyHash224GenBuff)cur );
			}
			else if( "a847".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Def().deleteDbKeyHash256Def( Authorization, (YCFBamDbKeyHash256DefBuff)cur );
			}
			else if( "a848".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Col().deleteDbKeyHash256Col( Authorization, (YCFBamDbKeyHash256ColBuff)cur );
			}
			else if( "a849".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Type().deleteDbKeyHash256Type( Authorization, (YCFBamDbKeyHash256TypeBuff)cur );
			}
			else if( "a84a".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Gen().deleteDbKeyHash256Gen( Authorization, (YCFBamDbKeyHash256GenBuff)cur );
			}
			else if( "a84b".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Def().deleteDbKeyHash384Def( Authorization, (YCFBamDbKeyHash384DefBuff)cur );
			}
			else if( "a84c".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Col().deleteDbKeyHash384Col( Authorization, (YCFBamDbKeyHash384ColBuff)cur );
			}
			else if( "a84d".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Type().deleteDbKeyHash384Type( Authorization, (YCFBamDbKeyHash384TypeBuff)cur );
			}
			else if( "a84e".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Gen().deleteDbKeyHash384Gen( Authorization, (YCFBamDbKeyHash384GenBuff)cur );
			}
			else if( "a84f".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Def().deleteDbKeyHash512Def( Authorization, (YCFBamDbKeyHash512DefBuff)cur );
			}
			else if( "a850".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Col().deleteDbKeyHash512Col( Authorization, (YCFBamDbKeyHash512ColBuff)cur );
			}
			else if( "a851".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Type().deleteDbKeyHash512Type( Authorization, (YCFBamDbKeyHash512TypeBuff)cur );
			}
			else if( "a852".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Gen().deleteDbKeyHash512Gen( Authorization, (YCFBamDbKeyHash512GenBuff)cur );
			}
			else if( "a853".equals( subClassCode ) ) {
				schema.getTableStringDef().deleteStringDef( Authorization, (YCFBamStringDefBuff)cur );
			}
			else if( "a854".equals( subClassCode ) ) {
				schema.getTableStringType().deleteStringType( Authorization, (YCFBamStringTypeBuff)cur );
			}
			else if( "a87e".equals( subClassCode ) ) {
				schema.getTableStringCol().deleteStringCol( Authorization, (YCFBamStringColBuff)cur );
			}
			else if( "a855".equals( subClassCode ) ) {
				schema.getTableTZDateDef().deleteTZDateDef( Authorization, (YCFBamTZDateDefBuff)cur );
			}
			else if( "a856".equals( subClassCode ) ) {
				schema.getTableTZDateType().deleteTZDateType( Authorization, (YCFBamTZDateTypeBuff)cur );
			}
			else if( "a87f".equals( subClassCode ) ) {
				schema.getTableTZDateCol().deleteTZDateCol( Authorization, (YCFBamTZDateColBuff)cur );
			}
			else if( "a857".equals( subClassCode ) ) {
				schema.getTableTZTimeDef().deleteTZTimeDef( Authorization, (YCFBamTZTimeDefBuff)cur );
			}
			else if( "a858".equals( subClassCode ) ) {
				schema.getTableTZTimeType().deleteTZTimeType( Authorization, (YCFBamTZTimeTypeBuff)cur );
			}
			else if( "a880".equals( subClassCode ) ) {
				schema.getTableTZTimeCol().deleteTZTimeCol( Authorization, (YCFBamTZTimeColBuff)cur );
			}
			else if( "a859".equals( subClassCode ) ) {
				schema.getTableTZTimestampDef().deleteTZTimestampDef( Authorization, (YCFBamTZTimestampDefBuff)cur );
			}
			else if( "a85a".equals( subClassCode ) ) {
				schema.getTableTZTimestampType().deleteTZTimestampType( Authorization, (YCFBamTZTimestampTypeBuff)cur );
			}
			else if( "a881".equals( subClassCode ) ) {
				schema.getTableTZTimestampCol().deleteTZTimestampCol( Authorization, (YCFBamTZTimestampColBuff)cur );
			}
			else if( "a85c".equals( subClassCode ) ) {
				schema.getTableTextDef().deleteTextDef( Authorization, (YCFBamTextDefBuff)cur );
			}
			else if( "a85d".equals( subClassCode ) ) {
				schema.getTableTextType().deleteTextType( Authorization, (YCFBamTextTypeBuff)cur );
			}
			else if( "a882".equals( subClassCode ) ) {
				schema.getTableTextCol().deleteTextCol( Authorization, (YCFBamTextColBuff)cur );
			}
			else if( "a85e".equals( subClassCode ) ) {
				schema.getTableTimeDef().deleteTimeDef( Authorization, (YCFBamTimeDefBuff)cur );
			}
			else if( "a85f".equals( subClassCode ) ) {
				schema.getTableTimeType().deleteTimeType( Authorization, (YCFBamTimeTypeBuff)cur );
			}
			else if( "a883".equals( subClassCode ) ) {
				schema.getTableTimeCol().deleteTimeCol( Authorization, (YCFBamTimeColBuff)cur );
			}
			else if( "a860".equals( subClassCode ) ) {
				schema.getTableTimestampDef().deleteTimestampDef( Authorization, (YCFBamTimestampDefBuff)cur );
			}
			else if( "a861".equals( subClassCode ) ) {
				schema.getTableTimestampType().deleteTimestampType( Authorization, (YCFBamTimestampTypeBuff)cur );
			}
			else if( "a884".equals( subClassCode ) ) {
				schema.getTableTimestampCol().deleteTimestampCol( Authorization, (YCFBamTimestampColBuff)cur );
			}
			else if( "a862".equals( subClassCode ) ) {
				schema.getTableTokenDef().deleteTokenDef( Authorization, (YCFBamTokenDefBuff)cur );
			}
			else if( "a863".equals( subClassCode ) ) {
				schema.getTableTokenType().deleteTokenType( Authorization, (YCFBamTokenTypeBuff)cur );
			}
			else if( "a885".equals( subClassCode ) ) {
				schema.getTableTokenCol().deleteTokenCol( Authorization, (YCFBamTokenColBuff)cur );
			}
			else if( "a864".equals( subClassCode ) ) {
				schema.getTableUInt16Def().deleteUInt16Def( Authorization, (YCFBamUInt16DefBuff)cur );
			}
			else if( "a865".equals( subClassCode ) ) {
				schema.getTableUInt16Type().deleteUInt16Type( Authorization, (YCFBamUInt16TypeBuff)cur );
			}
			else if( "a886".equals( subClassCode ) ) {
				schema.getTableUInt16Col().deleteUInt16Col( Authorization, (YCFBamUInt16ColBuff)cur );
			}
			else if( "a866".equals( subClassCode ) ) {
				schema.getTableUInt32Def().deleteUInt32Def( Authorization, (YCFBamUInt32DefBuff)cur );
			}
			else if( "a867".equals( subClassCode ) ) {
				schema.getTableUInt32Type().deleteUInt32Type( Authorization, (YCFBamUInt32TypeBuff)cur );
			}
			else if( "a887".equals( subClassCode ) ) {
				schema.getTableUInt32Col().deleteUInt32Col( Authorization, (YCFBamUInt32ColBuff)cur );
			}
			else if( "a868".equals( subClassCode ) ) {
				schema.getTableUInt64Def().deleteUInt64Def( Authorization, (YCFBamUInt64DefBuff)cur );
			}
			else if( "a869".equals( subClassCode ) ) {
				schema.getTableUInt64Type().deleteUInt64Type( Authorization, (YCFBamUInt64TypeBuff)cur );
			}
			else if( "a888".equals( subClassCode ) ) {
				schema.getTableUInt64Col().deleteUInt64Col( Authorization, (YCFBamUInt64ColBuff)cur );
			}
			else if( "a86a".equals( subClassCode ) ) {
				schema.getTableUuidDef().deleteUuidDef( Authorization, (YCFBamUuidDefBuff)cur );
			}
			else if( "a86c".equals( subClassCode ) ) {
				schema.getTableUuidType().deleteUuidType( Authorization, (YCFBamUuidTypeBuff)cur );
			}
			else if( "a88b".equals( subClassCode ) ) {
				schema.getTableUuidGen().deleteUuidGen( Authorization, (YCFBamUuidGenBuff)cur );
			}
			else if( "a889".equals( subClassCode ) ) {
				schema.getTableUuidCol().deleteUuidCol( Authorization, (YCFBamUuidColBuff)cur );
			}
			else if( "a86b".equals( subClassCode ) ) {
				schema.getTableUuid6Def().deleteUuid6Def( Authorization, (YCFBamUuid6DefBuff)cur );
			}
			else if( "a86d".equals( subClassCode ) ) {
				schema.getTableUuid6Type().deleteUuid6Type( Authorization, (YCFBamUuid6TypeBuff)cur );
			}
			else if( "a88c".equals( subClassCode ) ) {
				schema.getTableUuid6Gen().deleteUuid6Gen( Authorization, (YCFBamUuid6GenBuff)cur );
			}
			else if( "a88a".equals( subClassCode ) ) {
				schema.getTableUuid6Col().deleteUuid6Col( Authorization, (YCFBamUuid6ColBuff)cur );
			}
			else if( "a85b".equals( subClassCode ) ) {
				schema.getTableTableCol().deleteTableCol( Authorization, (YCFBamTableColBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of Value must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteValueByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		String argName )
	{
		YCFBamValueByUNameIdxKey key = schema.getFactoryValue().newUNameIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredScopeId( argScopeId );
		key.setRequiredName( argName );
		deleteValueByUNameIdx( Authorization, key );
	}

	public void deleteValueByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamValueByUNameIdxKey argKey )
	{
		final String S_ProcName = "deleteValueByUNameIdx";
		YCFBamValueBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamValueBuff> matchSet = new LinkedList<YCFBamValueBuff>();
		Iterator<YCFBamValueBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamValueBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableValue().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a80c".equals( subClassCode ) ) {
				schema.getTableValue().deleteValue( Authorization, cur );
			}
			else if( "a80d".equals( subClassCode ) ) {
				schema.getTableAtom().deleteAtom( Authorization, (YCFBamAtomBuff)cur );
			}
			else if( "a80e".equals( subClassCode ) ) {
				schema.getTableBlobDef().deleteBlobDef( Authorization, (YCFBamBlobDefBuff)cur );
			}
			else if( "a80f".equals( subClassCode ) ) {
				schema.getTableBlobType().deleteBlobType( Authorization, (YCFBamBlobTypeBuff)cur );
			}
			else if( "a86e".equals( subClassCode ) ) {
				schema.getTableBlobCol().deleteBlobCol( Authorization, (YCFBamBlobColBuff)cur );
			}
			else if( "a810".equals( subClassCode ) ) {
				schema.getTableBoolDef().deleteBoolDef( Authorization, (YCFBamBoolDefBuff)cur );
			}
			else if( "a811".equals( subClassCode ) ) {
				schema.getTableBoolType().deleteBoolType( Authorization, (YCFBamBoolTypeBuff)cur );
			}
			else if( "a86f".equals( subClassCode ) ) {
				schema.getTableBoolCol().deleteBoolCol( Authorization, (YCFBamBoolColBuff)cur );
			}
			else if( "a818".equals( subClassCode ) ) {
				schema.getTableDateDef().deleteDateDef( Authorization, (YCFBamDateDefBuff)cur );
			}
			else if( "a819".equals( subClassCode ) ) {
				schema.getTableDateType().deleteDateType( Authorization, (YCFBamDateTypeBuff)cur );
			}
			else if( "a870".equals( subClassCode ) ) {
				schema.getTableDateCol().deleteDateCol( Authorization, (YCFBamDateColBuff)cur );
			}
			else if( "a81f".equals( subClassCode ) ) {
				schema.getTableDoubleDef().deleteDoubleDef( Authorization, (YCFBamDoubleDefBuff)cur );
			}
			else if( "a820".equals( subClassCode ) ) {
				schema.getTableDoubleType().deleteDoubleType( Authorization, (YCFBamDoubleTypeBuff)cur );
			}
			else if( "a871".equals( subClassCode ) ) {
				schema.getTableDoubleCol().deleteDoubleCol( Authorization, (YCFBamDoubleColBuff)cur );
			}
			else if( "a822".equals( subClassCode ) ) {
				schema.getTableFloatDef().deleteFloatDef( Authorization, (YCFBamFloatDefBuff)cur );
			}
			else if( "a823".equals( subClassCode ) ) {
				schema.getTableFloatType().deleteFloatType( Authorization, (YCFBamFloatTypeBuff)cur );
			}
			else if( "a874".equals( subClassCode ) ) {
				schema.getTableFloatCol().deleteFloatCol( Authorization, (YCFBamFloatColBuff)cur );
			}
			else if( "a826".equals( subClassCode ) ) {
				schema.getTableInt16Def().deleteInt16Def( Authorization, (YCFBamInt16DefBuff)cur );
			}
			else if( "a827".equals( subClassCode ) ) {
				schema.getTableInt16Type().deleteInt16Type( Authorization, (YCFBamInt16TypeBuff)cur );
			}
			else if( "a875".equals( subClassCode ) ) {
				schema.getTableId16Gen().deleteId16Gen( Authorization, (YCFBamId16GenBuff)cur );
			}
			else if( "a872".equals( subClassCode ) ) {
				schema.getTableEnumDef().deleteEnumDef( Authorization, (YCFBamEnumDefBuff)cur );
			}
			else if( "a873".equals( subClassCode ) ) {
				schema.getTableEnumType().deleteEnumType( Authorization, (YCFBamEnumTypeBuff)cur );
			}
			else if( "a878".equals( subClassCode ) ) {
				schema.getTableInt16Col().deleteInt16Col( Authorization, (YCFBamInt16ColBuff)cur );
			}
			else if( "a828".equals( subClassCode ) ) {
				schema.getTableInt32Def().deleteInt32Def( Authorization, (YCFBamInt32DefBuff)cur );
			}
			else if( "a829".equals( subClassCode ) ) {
				schema.getTableInt32Type().deleteInt32Type( Authorization, (YCFBamInt32TypeBuff)cur );
			}
			else if( "a876".equals( subClassCode ) ) {
				schema.getTableId32Gen().deleteId32Gen( Authorization, (YCFBamId32GenBuff)cur );
			}
			else if( "a879".equals( subClassCode ) ) {
				schema.getTableInt32Col().deleteInt32Col( Authorization, (YCFBamInt32ColBuff)cur );
			}
			else if( "a82a".equals( subClassCode ) ) {
				schema.getTableInt64Def().deleteInt64Def( Authorization, (YCFBamInt64DefBuff)cur );
			}
			else if( "a82b".equals( subClassCode ) ) {
				schema.getTableInt64Type().deleteInt64Type( Authorization, (YCFBamInt64TypeBuff)cur );
			}
			else if( "a877".equals( subClassCode ) ) {
				schema.getTableId64Gen().deleteId64Gen( Authorization, (YCFBamId64GenBuff)cur );
			}
			else if( "a87a".equals( subClassCode ) ) {
				schema.getTableInt64Col().deleteInt64Col( Authorization, (YCFBamInt64ColBuff)cur );
			}
			else if( "a82c".equals( subClassCode ) ) {
				schema.getTableNmTokenDef().deleteNmTokenDef( Authorization, (YCFBamNmTokenDefBuff)cur );
			}
			else if( "a82d".equals( subClassCode ) ) {
				schema.getTableNmTokenType().deleteNmTokenType( Authorization, (YCFBamNmTokenTypeBuff)cur );
			}
			else if( "a87b".equals( subClassCode ) ) {
				schema.getTableNmTokenCol().deleteNmTokenCol( Authorization, (YCFBamNmTokenColBuff)cur );
			}
			else if( "a82e".equals( subClassCode ) ) {
				schema.getTableNmTokensDef().deleteNmTokensDef( Authorization, (YCFBamNmTokensDefBuff)cur );
			}
			else if( "a82f".equals( subClassCode ) ) {
				schema.getTableNmTokensType().deleteNmTokensType( Authorization, (YCFBamNmTokensTypeBuff)cur );
			}
			else if( "a87c".equals( subClassCode ) ) {
				schema.getTableNmTokensCol().deleteNmTokensCol( Authorization, (YCFBamNmTokensColBuff)cur );
			}
			else if( "a830".equals( subClassCode ) ) {
				schema.getTableNumberDef().deleteNumberDef( Authorization, (YCFBamNumberDefBuff)cur );
			}
			else if( "a831".equals( subClassCode ) ) {
				schema.getTableNumberType().deleteNumberType( Authorization, (YCFBamNumberTypeBuff)cur );
			}
			else if( "a87d".equals( subClassCode ) ) {
				schema.getTableNumberCol().deleteNumberCol( Authorization, (YCFBamNumberColBuff)cur );
			}
			else if( "a83b".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Def().deleteDbKeyHash128Def( Authorization, (YCFBamDbKeyHash128DefBuff)cur );
			}
			else if( "a83c".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Col().deleteDbKeyHash128Col( Authorization, (YCFBamDbKeyHash128ColBuff)cur );
			}
			else if( "a83d".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Type().deleteDbKeyHash128Type( Authorization, (YCFBamDbKeyHash128TypeBuff)cur );
			}
			else if( "a83e".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Gen().deleteDbKeyHash128Gen( Authorization, (YCFBamDbKeyHash128GenBuff)cur );
			}
			else if( "a83f".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Def().deleteDbKeyHash160Def( Authorization, (YCFBamDbKeyHash160DefBuff)cur );
			}
			else if( "a840".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Col().deleteDbKeyHash160Col( Authorization, (YCFBamDbKeyHash160ColBuff)cur );
			}
			else if( "a841".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Type().deleteDbKeyHash160Type( Authorization, (YCFBamDbKeyHash160TypeBuff)cur );
			}
			else if( "a842".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Gen().deleteDbKeyHash160Gen( Authorization, (YCFBamDbKeyHash160GenBuff)cur );
			}
			else if( "a843".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Def().deleteDbKeyHash224Def( Authorization, (YCFBamDbKeyHash224DefBuff)cur );
			}
			else if( "a844".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Col().deleteDbKeyHash224Col( Authorization, (YCFBamDbKeyHash224ColBuff)cur );
			}
			else if( "a845".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Type().deleteDbKeyHash224Type( Authorization, (YCFBamDbKeyHash224TypeBuff)cur );
			}
			else if( "a846".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Gen().deleteDbKeyHash224Gen( Authorization, (YCFBamDbKeyHash224GenBuff)cur );
			}
			else if( "a847".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Def().deleteDbKeyHash256Def( Authorization, (YCFBamDbKeyHash256DefBuff)cur );
			}
			else if( "a848".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Col().deleteDbKeyHash256Col( Authorization, (YCFBamDbKeyHash256ColBuff)cur );
			}
			else if( "a849".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Type().deleteDbKeyHash256Type( Authorization, (YCFBamDbKeyHash256TypeBuff)cur );
			}
			else if( "a84a".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Gen().deleteDbKeyHash256Gen( Authorization, (YCFBamDbKeyHash256GenBuff)cur );
			}
			else if( "a84b".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Def().deleteDbKeyHash384Def( Authorization, (YCFBamDbKeyHash384DefBuff)cur );
			}
			else if( "a84c".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Col().deleteDbKeyHash384Col( Authorization, (YCFBamDbKeyHash384ColBuff)cur );
			}
			else if( "a84d".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Type().deleteDbKeyHash384Type( Authorization, (YCFBamDbKeyHash384TypeBuff)cur );
			}
			else if( "a84e".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Gen().deleteDbKeyHash384Gen( Authorization, (YCFBamDbKeyHash384GenBuff)cur );
			}
			else if( "a84f".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Def().deleteDbKeyHash512Def( Authorization, (YCFBamDbKeyHash512DefBuff)cur );
			}
			else if( "a850".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Col().deleteDbKeyHash512Col( Authorization, (YCFBamDbKeyHash512ColBuff)cur );
			}
			else if( "a851".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Type().deleteDbKeyHash512Type( Authorization, (YCFBamDbKeyHash512TypeBuff)cur );
			}
			else if( "a852".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Gen().deleteDbKeyHash512Gen( Authorization, (YCFBamDbKeyHash512GenBuff)cur );
			}
			else if( "a853".equals( subClassCode ) ) {
				schema.getTableStringDef().deleteStringDef( Authorization, (YCFBamStringDefBuff)cur );
			}
			else if( "a854".equals( subClassCode ) ) {
				schema.getTableStringType().deleteStringType( Authorization, (YCFBamStringTypeBuff)cur );
			}
			else if( "a87e".equals( subClassCode ) ) {
				schema.getTableStringCol().deleteStringCol( Authorization, (YCFBamStringColBuff)cur );
			}
			else if( "a855".equals( subClassCode ) ) {
				schema.getTableTZDateDef().deleteTZDateDef( Authorization, (YCFBamTZDateDefBuff)cur );
			}
			else if( "a856".equals( subClassCode ) ) {
				schema.getTableTZDateType().deleteTZDateType( Authorization, (YCFBamTZDateTypeBuff)cur );
			}
			else if( "a87f".equals( subClassCode ) ) {
				schema.getTableTZDateCol().deleteTZDateCol( Authorization, (YCFBamTZDateColBuff)cur );
			}
			else if( "a857".equals( subClassCode ) ) {
				schema.getTableTZTimeDef().deleteTZTimeDef( Authorization, (YCFBamTZTimeDefBuff)cur );
			}
			else if( "a858".equals( subClassCode ) ) {
				schema.getTableTZTimeType().deleteTZTimeType( Authorization, (YCFBamTZTimeTypeBuff)cur );
			}
			else if( "a880".equals( subClassCode ) ) {
				schema.getTableTZTimeCol().deleteTZTimeCol( Authorization, (YCFBamTZTimeColBuff)cur );
			}
			else if( "a859".equals( subClassCode ) ) {
				schema.getTableTZTimestampDef().deleteTZTimestampDef( Authorization, (YCFBamTZTimestampDefBuff)cur );
			}
			else if( "a85a".equals( subClassCode ) ) {
				schema.getTableTZTimestampType().deleteTZTimestampType( Authorization, (YCFBamTZTimestampTypeBuff)cur );
			}
			else if( "a881".equals( subClassCode ) ) {
				schema.getTableTZTimestampCol().deleteTZTimestampCol( Authorization, (YCFBamTZTimestampColBuff)cur );
			}
			else if( "a85c".equals( subClassCode ) ) {
				schema.getTableTextDef().deleteTextDef( Authorization, (YCFBamTextDefBuff)cur );
			}
			else if( "a85d".equals( subClassCode ) ) {
				schema.getTableTextType().deleteTextType( Authorization, (YCFBamTextTypeBuff)cur );
			}
			else if( "a882".equals( subClassCode ) ) {
				schema.getTableTextCol().deleteTextCol( Authorization, (YCFBamTextColBuff)cur );
			}
			else if( "a85e".equals( subClassCode ) ) {
				schema.getTableTimeDef().deleteTimeDef( Authorization, (YCFBamTimeDefBuff)cur );
			}
			else if( "a85f".equals( subClassCode ) ) {
				schema.getTableTimeType().deleteTimeType( Authorization, (YCFBamTimeTypeBuff)cur );
			}
			else if( "a883".equals( subClassCode ) ) {
				schema.getTableTimeCol().deleteTimeCol( Authorization, (YCFBamTimeColBuff)cur );
			}
			else if( "a860".equals( subClassCode ) ) {
				schema.getTableTimestampDef().deleteTimestampDef( Authorization, (YCFBamTimestampDefBuff)cur );
			}
			else if( "a861".equals( subClassCode ) ) {
				schema.getTableTimestampType().deleteTimestampType( Authorization, (YCFBamTimestampTypeBuff)cur );
			}
			else if( "a884".equals( subClassCode ) ) {
				schema.getTableTimestampCol().deleteTimestampCol( Authorization, (YCFBamTimestampColBuff)cur );
			}
			else if( "a862".equals( subClassCode ) ) {
				schema.getTableTokenDef().deleteTokenDef( Authorization, (YCFBamTokenDefBuff)cur );
			}
			else if( "a863".equals( subClassCode ) ) {
				schema.getTableTokenType().deleteTokenType( Authorization, (YCFBamTokenTypeBuff)cur );
			}
			else if( "a885".equals( subClassCode ) ) {
				schema.getTableTokenCol().deleteTokenCol( Authorization, (YCFBamTokenColBuff)cur );
			}
			else if( "a864".equals( subClassCode ) ) {
				schema.getTableUInt16Def().deleteUInt16Def( Authorization, (YCFBamUInt16DefBuff)cur );
			}
			else if( "a865".equals( subClassCode ) ) {
				schema.getTableUInt16Type().deleteUInt16Type( Authorization, (YCFBamUInt16TypeBuff)cur );
			}
			else if( "a886".equals( subClassCode ) ) {
				schema.getTableUInt16Col().deleteUInt16Col( Authorization, (YCFBamUInt16ColBuff)cur );
			}
			else if( "a866".equals( subClassCode ) ) {
				schema.getTableUInt32Def().deleteUInt32Def( Authorization, (YCFBamUInt32DefBuff)cur );
			}
			else if( "a867".equals( subClassCode ) ) {
				schema.getTableUInt32Type().deleteUInt32Type( Authorization, (YCFBamUInt32TypeBuff)cur );
			}
			else if( "a887".equals( subClassCode ) ) {
				schema.getTableUInt32Col().deleteUInt32Col( Authorization, (YCFBamUInt32ColBuff)cur );
			}
			else if( "a868".equals( subClassCode ) ) {
				schema.getTableUInt64Def().deleteUInt64Def( Authorization, (YCFBamUInt64DefBuff)cur );
			}
			else if( "a869".equals( subClassCode ) ) {
				schema.getTableUInt64Type().deleteUInt64Type( Authorization, (YCFBamUInt64TypeBuff)cur );
			}
			else if( "a888".equals( subClassCode ) ) {
				schema.getTableUInt64Col().deleteUInt64Col( Authorization, (YCFBamUInt64ColBuff)cur );
			}
			else if( "a86a".equals( subClassCode ) ) {
				schema.getTableUuidDef().deleteUuidDef( Authorization, (YCFBamUuidDefBuff)cur );
			}
			else if( "a86c".equals( subClassCode ) ) {
				schema.getTableUuidType().deleteUuidType( Authorization, (YCFBamUuidTypeBuff)cur );
			}
			else if( "a88b".equals( subClassCode ) ) {
				schema.getTableUuidGen().deleteUuidGen( Authorization, (YCFBamUuidGenBuff)cur );
			}
			else if( "a889".equals( subClassCode ) ) {
				schema.getTableUuidCol().deleteUuidCol( Authorization, (YCFBamUuidColBuff)cur );
			}
			else if( "a86b".equals( subClassCode ) ) {
				schema.getTableUuid6Def().deleteUuid6Def( Authorization, (YCFBamUuid6DefBuff)cur );
			}
			else if( "a86d".equals( subClassCode ) ) {
				schema.getTableUuid6Type().deleteUuid6Type( Authorization, (YCFBamUuid6TypeBuff)cur );
			}
			else if( "a88c".equals( subClassCode ) ) {
				schema.getTableUuid6Gen().deleteUuid6Gen( Authorization, (YCFBamUuid6GenBuff)cur );
			}
			else if( "a88a".equals( subClassCode ) ) {
				schema.getTableUuid6Col().deleteUuid6Col( Authorization, (YCFBamUuid6ColBuff)cur );
			}
			else if( "a85b".equals( subClassCode ) ) {
				schema.getTableTableCol().deleteTableCol( Authorization, (YCFBamTableColBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of Value must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteValueByValTentIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamValueByValTentIdxKey key = schema.getFactoryValue().newValTentIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteValueByValTentIdx( Authorization, key );
	}

	public void deleteValueByValTentIdx( YCFSecAuthorization Authorization,
		YCFBamValueByValTentIdxKey argKey )
	{
		final String S_ProcName = "deleteValueByValTentIdx";
		YCFBamValueBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamValueBuff> matchSet = new LinkedList<YCFBamValueBuff>();
		Iterator<YCFBamValueBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamValueBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableValue().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a80c".equals( subClassCode ) ) {
				schema.getTableValue().deleteValue( Authorization, cur );
			}
			else if( "a80d".equals( subClassCode ) ) {
				schema.getTableAtom().deleteAtom( Authorization, (YCFBamAtomBuff)cur );
			}
			else if( "a80e".equals( subClassCode ) ) {
				schema.getTableBlobDef().deleteBlobDef( Authorization, (YCFBamBlobDefBuff)cur );
			}
			else if( "a80f".equals( subClassCode ) ) {
				schema.getTableBlobType().deleteBlobType( Authorization, (YCFBamBlobTypeBuff)cur );
			}
			else if( "a86e".equals( subClassCode ) ) {
				schema.getTableBlobCol().deleteBlobCol( Authorization, (YCFBamBlobColBuff)cur );
			}
			else if( "a810".equals( subClassCode ) ) {
				schema.getTableBoolDef().deleteBoolDef( Authorization, (YCFBamBoolDefBuff)cur );
			}
			else if( "a811".equals( subClassCode ) ) {
				schema.getTableBoolType().deleteBoolType( Authorization, (YCFBamBoolTypeBuff)cur );
			}
			else if( "a86f".equals( subClassCode ) ) {
				schema.getTableBoolCol().deleteBoolCol( Authorization, (YCFBamBoolColBuff)cur );
			}
			else if( "a818".equals( subClassCode ) ) {
				schema.getTableDateDef().deleteDateDef( Authorization, (YCFBamDateDefBuff)cur );
			}
			else if( "a819".equals( subClassCode ) ) {
				schema.getTableDateType().deleteDateType( Authorization, (YCFBamDateTypeBuff)cur );
			}
			else if( "a870".equals( subClassCode ) ) {
				schema.getTableDateCol().deleteDateCol( Authorization, (YCFBamDateColBuff)cur );
			}
			else if( "a81f".equals( subClassCode ) ) {
				schema.getTableDoubleDef().deleteDoubleDef( Authorization, (YCFBamDoubleDefBuff)cur );
			}
			else if( "a820".equals( subClassCode ) ) {
				schema.getTableDoubleType().deleteDoubleType( Authorization, (YCFBamDoubleTypeBuff)cur );
			}
			else if( "a871".equals( subClassCode ) ) {
				schema.getTableDoubleCol().deleteDoubleCol( Authorization, (YCFBamDoubleColBuff)cur );
			}
			else if( "a822".equals( subClassCode ) ) {
				schema.getTableFloatDef().deleteFloatDef( Authorization, (YCFBamFloatDefBuff)cur );
			}
			else if( "a823".equals( subClassCode ) ) {
				schema.getTableFloatType().deleteFloatType( Authorization, (YCFBamFloatTypeBuff)cur );
			}
			else if( "a874".equals( subClassCode ) ) {
				schema.getTableFloatCol().deleteFloatCol( Authorization, (YCFBamFloatColBuff)cur );
			}
			else if( "a826".equals( subClassCode ) ) {
				schema.getTableInt16Def().deleteInt16Def( Authorization, (YCFBamInt16DefBuff)cur );
			}
			else if( "a827".equals( subClassCode ) ) {
				schema.getTableInt16Type().deleteInt16Type( Authorization, (YCFBamInt16TypeBuff)cur );
			}
			else if( "a875".equals( subClassCode ) ) {
				schema.getTableId16Gen().deleteId16Gen( Authorization, (YCFBamId16GenBuff)cur );
			}
			else if( "a872".equals( subClassCode ) ) {
				schema.getTableEnumDef().deleteEnumDef( Authorization, (YCFBamEnumDefBuff)cur );
			}
			else if( "a873".equals( subClassCode ) ) {
				schema.getTableEnumType().deleteEnumType( Authorization, (YCFBamEnumTypeBuff)cur );
			}
			else if( "a878".equals( subClassCode ) ) {
				schema.getTableInt16Col().deleteInt16Col( Authorization, (YCFBamInt16ColBuff)cur );
			}
			else if( "a828".equals( subClassCode ) ) {
				schema.getTableInt32Def().deleteInt32Def( Authorization, (YCFBamInt32DefBuff)cur );
			}
			else if( "a829".equals( subClassCode ) ) {
				schema.getTableInt32Type().deleteInt32Type( Authorization, (YCFBamInt32TypeBuff)cur );
			}
			else if( "a876".equals( subClassCode ) ) {
				schema.getTableId32Gen().deleteId32Gen( Authorization, (YCFBamId32GenBuff)cur );
			}
			else if( "a879".equals( subClassCode ) ) {
				schema.getTableInt32Col().deleteInt32Col( Authorization, (YCFBamInt32ColBuff)cur );
			}
			else if( "a82a".equals( subClassCode ) ) {
				schema.getTableInt64Def().deleteInt64Def( Authorization, (YCFBamInt64DefBuff)cur );
			}
			else if( "a82b".equals( subClassCode ) ) {
				schema.getTableInt64Type().deleteInt64Type( Authorization, (YCFBamInt64TypeBuff)cur );
			}
			else if( "a877".equals( subClassCode ) ) {
				schema.getTableId64Gen().deleteId64Gen( Authorization, (YCFBamId64GenBuff)cur );
			}
			else if( "a87a".equals( subClassCode ) ) {
				schema.getTableInt64Col().deleteInt64Col( Authorization, (YCFBamInt64ColBuff)cur );
			}
			else if( "a82c".equals( subClassCode ) ) {
				schema.getTableNmTokenDef().deleteNmTokenDef( Authorization, (YCFBamNmTokenDefBuff)cur );
			}
			else if( "a82d".equals( subClassCode ) ) {
				schema.getTableNmTokenType().deleteNmTokenType( Authorization, (YCFBamNmTokenTypeBuff)cur );
			}
			else if( "a87b".equals( subClassCode ) ) {
				schema.getTableNmTokenCol().deleteNmTokenCol( Authorization, (YCFBamNmTokenColBuff)cur );
			}
			else if( "a82e".equals( subClassCode ) ) {
				schema.getTableNmTokensDef().deleteNmTokensDef( Authorization, (YCFBamNmTokensDefBuff)cur );
			}
			else if( "a82f".equals( subClassCode ) ) {
				schema.getTableNmTokensType().deleteNmTokensType( Authorization, (YCFBamNmTokensTypeBuff)cur );
			}
			else if( "a87c".equals( subClassCode ) ) {
				schema.getTableNmTokensCol().deleteNmTokensCol( Authorization, (YCFBamNmTokensColBuff)cur );
			}
			else if( "a830".equals( subClassCode ) ) {
				schema.getTableNumberDef().deleteNumberDef( Authorization, (YCFBamNumberDefBuff)cur );
			}
			else if( "a831".equals( subClassCode ) ) {
				schema.getTableNumberType().deleteNumberType( Authorization, (YCFBamNumberTypeBuff)cur );
			}
			else if( "a87d".equals( subClassCode ) ) {
				schema.getTableNumberCol().deleteNumberCol( Authorization, (YCFBamNumberColBuff)cur );
			}
			else if( "a83b".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Def().deleteDbKeyHash128Def( Authorization, (YCFBamDbKeyHash128DefBuff)cur );
			}
			else if( "a83c".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Col().deleteDbKeyHash128Col( Authorization, (YCFBamDbKeyHash128ColBuff)cur );
			}
			else if( "a83d".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Type().deleteDbKeyHash128Type( Authorization, (YCFBamDbKeyHash128TypeBuff)cur );
			}
			else if( "a83e".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Gen().deleteDbKeyHash128Gen( Authorization, (YCFBamDbKeyHash128GenBuff)cur );
			}
			else if( "a83f".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Def().deleteDbKeyHash160Def( Authorization, (YCFBamDbKeyHash160DefBuff)cur );
			}
			else if( "a840".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Col().deleteDbKeyHash160Col( Authorization, (YCFBamDbKeyHash160ColBuff)cur );
			}
			else if( "a841".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Type().deleteDbKeyHash160Type( Authorization, (YCFBamDbKeyHash160TypeBuff)cur );
			}
			else if( "a842".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Gen().deleteDbKeyHash160Gen( Authorization, (YCFBamDbKeyHash160GenBuff)cur );
			}
			else if( "a843".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Def().deleteDbKeyHash224Def( Authorization, (YCFBamDbKeyHash224DefBuff)cur );
			}
			else if( "a844".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Col().deleteDbKeyHash224Col( Authorization, (YCFBamDbKeyHash224ColBuff)cur );
			}
			else if( "a845".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Type().deleteDbKeyHash224Type( Authorization, (YCFBamDbKeyHash224TypeBuff)cur );
			}
			else if( "a846".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Gen().deleteDbKeyHash224Gen( Authorization, (YCFBamDbKeyHash224GenBuff)cur );
			}
			else if( "a847".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Def().deleteDbKeyHash256Def( Authorization, (YCFBamDbKeyHash256DefBuff)cur );
			}
			else if( "a848".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Col().deleteDbKeyHash256Col( Authorization, (YCFBamDbKeyHash256ColBuff)cur );
			}
			else if( "a849".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Type().deleteDbKeyHash256Type( Authorization, (YCFBamDbKeyHash256TypeBuff)cur );
			}
			else if( "a84a".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Gen().deleteDbKeyHash256Gen( Authorization, (YCFBamDbKeyHash256GenBuff)cur );
			}
			else if( "a84b".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Def().deleteDbKeyHash384Def( Authorization, (YCFBamDbKeyHash384DefBuff)cur );
			}
			else if( "a84c".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Col().deleteDbKeyHash384Col( Authorization, (YCFBamDbKeyHash384ColBuff)cur );
			}
			else if( "a84d".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Type().deleteDbKeyHash384Type( Authorization, (YCFBamDbKeyHash384TypeBuff)cur );
			}
			else if( "a84e".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Gen().deleteDbKeyHash384Gen( Authorization, (YCFBamDbKeyHash384GenBuff)cur );
			}
			else if( "a84f".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Def().deleteDbKeyHash512Def( Authorization, (YCFBamDbKeyHash512DefBuff)cur );
			}
			else if( "a850".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Col().deleteDbKeyHash512Col( Authorization, (YCFBamDbKeyHash512ColBuff)cur );
			}
			else if( "a851".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Type().deleteDbKeyHash512Type( Authorization, (YCFBamDbKeyHash512TypeBuff)cur );
			}
			else if( "a852".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Gen().deleteDbKeyHash512Gen( Authorization, (YCFBamDbKeyHash512GenBuff)cur );
			}
			else if( "a853".equals( subClassCode ) ) {
				schema.getTableStringDef().deleteStringDef( Authorization, (YCFBamStringDefBuff)cur );
			}
			else if( "a854".equals( subClassCode ) ) {
				schema.getTableStringType().deleteStringType( Authorization, (YCFBamStringTypeBuff)cur );
			}
			else if( "a87e".equals( subClassCode ) ) {
				schema.getTableStringCol().deleteStringCol( Authorization, (YCFBamStringColBuff)cur );
			}
			else if( "a855".equals( subClassCode ) ) {
				schema.getTableTZDateDef().deleteTZDateDef( Authorization, (YCFBamTZDateDefBuff)cur );
			}
			else if( "a856".equals( subClassCode ) ) {
				schema.getTableTZDateType().deleteTZDateType( Authorization, (YCFBamTZDateTypeBuff)cur );
			}
			else if( "a87f".equals( subClassCode ) ) {
				schema.getTableTZDateCol().deleteTZDateCol( Authorization, (YCFBamTZDateColBuff)cur );
			}
			else if( "a857".equals( subClassCode ) ) {
				schema.getTableTZTimeDef().deleteTZTimeDef( Authorization, (YCFBamTZTimeDefBuff)cur );
			}
			else if( "a858".equals( subClassCode ) ) {
				schema.getTableTZTimeType().deleteTZTimeType( Authorization, (YCFBamTZTimeTypeBuff)cur );
			}
			else if( "a880".equals( subClassCode ) ) {
				schema.getTableTZTimeCol().deleteTZTimeCol( Authorization, (YCFBamTZTimeColBuff)cur );
			}
			else if( "a859".equals( subClassCode ) ) {
				schema.getTableTZTimestampDef().deleteTZTimestampDef( Authorization, (YCFBamTZTimestampDefBuff)cur );
			}
			else if( "a85a".equals( subClassCode ) ) {
				schema.getTableTZTimestampType().deleteTZTimestampType( Authorization, (YCFBamTZTimestampTypeBuff)cur );
			}
			else if( "a881".equals( subClassCode ) ) {
				schema.getTableTZTimestampCol().deleteTZTimestampCol( Authorization, (YCFBamTZTimestampColBuff)cur );
			}
			else if( "a85c".equals( subClassCode ) ) {
				schema.getTableTextDef().deleteTextDef( Authorization, (YCFBamTextDefBuff)cur );
			}
			else if( "a85d".equals( subClassCode ) ) {
				schema.getTableTextType().deleteTextType( Authorization, (YCFBamTextTypeBuff)cur );
			}
			else if( "a882".equals( subClassCode ) ) {
				schema.getTableTextCol().deleteTextCol( Authorization, (YCFBamTextColBuff)cur );
			}
			else if( "a85e".equals( subClassCode ) ) {
				schema.getTableTimeDef().deleteTimeDef( Authorization, (YCFBamTimeDefBuff)cur );
			}
			else if( "a85f".equals( subClassCode ) ) {
				schema.getTableTimeType().deleteTimeType( Authorization, (YCFBamTimeTypeBuff)cur );
			}
			else if( "a883".equals( subClassCode ) ) {
				schema.getTableTimeCol().deleteTimeCol( Authorization, (YCFBamTimeColBuff)cur );
			}
			else if( "a860".equals( subClassCode ) ) {
				schema.getTableTimestampDef().deleteTimestampDef( Authorization, (YCFBamTimestampDefBuff)cur );
			}
			else if( "a861".equals( subClassCode ) ) {
				schema.getTableTimestampType().deleteTimestampType( Authorization, (YCFBamTimestampTypeBuff)cur );
			}
			else if( "a884".equals( subClassCode ) ) {
				schema.getTableTimestampCol().deleteTimestampCol( Authorization, (YCFBamTimestampColBuff)cur );
			}
			else if( "a862".equals( subClassCode ) ) {
				schema.getTableTokenDef().deleteTokenDef( Authorization, (YCFBamTokenDefBuff)cur );
			}
			else if( "a863".equals( subClassCode ) ) {
				schema.getTableTokenType().deleteTokenType( Authorization, (YCFBamTokenTypeBuff)cur );
			}
			else if( "a885".equals( subClassCode ) ) {
				schema.getTableTokenCol().deleteTokenCol( Authorization, (YCFBamTokenColBuff)cur );
			}
			else if( "a864".equals( subClassCode ) ) {
				schema.getTableUInt16Def().deleteUInt16Def( Authorization, (YCFBamUInt16DefBuff)cur );
			}
			else if( "a865".equals( subClassCode ) ) {
				schema.getTableUInt16Type().deleteUInt16Type( Authorization, (YCFBamUInt16TypeBuff)cur );
			}
			else if( "a886".equals( subClassCode ) ) {
				schema.getTableUInt16Col().deleteUInt16Col( Authorization, (YCFBamUInt16ColBuff)cur );
			}
			else if( "a866".equals( subClassCode ) ) {
				schema.getTableUInt32Def().deleteUInt32Def( Authorization, (YCFBamUInt32DefBuff)cur );
			}
			else if( "a867".equals( subClassCode ) ) {
				schema.getTableUInt32Type().deleteUInt32Type( Authorization, (YCFBamUInt32TypeBuff)cur );
			}
			else if( "a887".equals( subClassCode ) ) {
				schema.getTableUInt32Col().deleteUInt32Col( Authorization, (YCFBamUInt32ColBuff)cur );
			}
			else if( "a868".equals( subClassCode ) ) {
				schema.getTableUInt64Def().deleteUInt64Def( Authorization, (YCFBamUInt64DefBuff)cur );
			}
			else if( "a869".equals( subClassCode ) ) {
				schema.getTableUInt64Type().deleteUInt64Type( Authorization, (YCFBamUInt64TypeBuff)cur );
			}
			else if( "a888".equals( subClassCode ) ) {
				schema.getTableUInt64Col().deleteUInt64Col( Authorization, (YCFBamUInt64ColBuff)cur );
			}
			else if( "a86a".equals( subClassCode ) ) {
				schema.getTableUuidDef().deleteUuidDef( Authorization, (YCFBamUuidDefBuff)cur );
			}
			else if( "a86c".equals( subClassCode ) ) {
				schema.getTableUuidType().deleteUuidType( Authorization, (YCFBamUuidTypeBuff)cur );
			}
			else if( "a88b".equals( subClassCode ) ) {
				schema.getTableUuidGen().deleteUuidGen( Authorization, (YCFBamUuidGenBuff)cur );
			}
			else if( "a889".equals( subClassCode ) ) {
				schema.getTableUuidCol().deleteUuidCol( Authorization, (YCFBamUuidColBuff)cur );
			}
			else if( "a86b".equals( subClassCode ) ) {
				schema.getTableUuid6Def().deleteUuid6Def( Authorization, (YCFBamUuid6DefBuff)cur );
			}
			else if( "a86d".equals( subClassCode ) ) {
				schema.getTableUuid6Type().deleteUuid6Type( Authorization, (YCFBamUuid6TypeBuff)cur );
			}
			else if( "a88c".equals( subClassCode ) ) {
				schema.getTableUuid6Gen().deleteUuid6Gen( Authorization, (YCFBamUuid6GenBuff)cur );
			}
			else if( "a88a".equals( subClassCode ) ) {
				schema.getTableUuid6Col().deleteUuid6Col( Authorization, (YCFBamUuid6ColBuff)cur );
			}
			else if( "a85b".equals( subClassCode ) ) {
				schema.getTableTableCol().deleteTableCol( Authorization, (YCFBamTableColBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of Value must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteValueByScopeIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId )
	{
		YCFBamValueByScopeIdxKey key = schema.getFactoryValue().newScopeIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredScopeId( argScopeId );
		deleteValueByScopeIdx( Authorization, key );
	}

	public void deleteValueByScopeIdx( YCFSecAuthorization Authorization,
		YCFBamValueByScopeIdxKey argKey )
	{
		final String S_ProcName = "deleteValueByScopeIdx";
		YCFBamValueBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamValueBuff> matchSet = new LinkedList<YCFBamValueBuff>();
		Iterator<YCFBamValueBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamValueBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableValue().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a80c".equals( subClassCode ) ) {
				schema.getTableValue().deleteValue( Authorization, cur );
			}
			else if( "a80d".equals( subClassCode ) ) {
				schema.getTableAtom().deleteAtom( Authorization, (YCFBamAtomBuff)cur );
			}
			else if( "a80e".equals( subClassCode ) ) {
				schema.getTableBlobDef().deleteBlobDef( Authorization, (YCFBamBlobDefBuff)cur );
			}
			else if( "a80f".equals( subClassCode ) ) {
				schema.getTableBlobType().deleteBlobType( Authorization, (YCFBamBlobTypeBuff)cur );
			}
			else if( "a86e".equals( subClassCode ) ) {
				schema.getTableBlobCol().deleteBlobCol( Authorization, (YCFBamBlobColBuff)cur );
			}
			else if( "a810".equals( subClassCode ) ) {
				schema.getTableBoolDef().deleteBoolDef( Authorization, (YCFBamBoolDefBuff)cur );
			}
			else if( "a811".equals( subClassCode ) ) {
				schema.getTableBoolType().deleteBoolType( Authorization, (YCFBamBoolTypeBuff)cur );
			}
			else if( "a86f".equals( subClassCode ) ) {
				schema.getTableBoolCol().deleteBoolCol( Authorization, (YCFBamBoolColBuff)cur );
			}
			else if( "a818".equals( subClassCode ) ) {
				schema.getTableDateDef().deleteDateDef( Authorization, (YCFBamDateDefBuff)cur );
			}
			else if( "a819".equals( subClassCode ) ) {
				schema.getTableDateType().deleteDateType( Authorization, (YCFBamDateTypeBuff)cur );
			}
			else if( "a870".equals( subClassCode ) ) {
				schema.getTableDateCol().deleteDateCol( Authorization, (YCFBamDateColBuff)cur );
			}
			else if( "a81f".equals( subClassCode ) ) {
				schema.getTableDoubleDef().deleteDoubleDef( Authorization, (YCFBamDoubleDefBuff)cur );
			}
			else if( "a820".equals( subClassCode ) ) {
				schema.getTableDoubleType().deleteDoubleType( Authorization, (YCFBamDoubleTypeBuff)cur );
			}
			else if( "a871".equals( subClassCode ) ) {
				schema.getTableDoubleCol().deleteDoubleCol( Authorization, (YCFBamDoubleColBuff)cur );
			}
			else if( "a822".equals( subClassCode ) ) {
				schema.getTableFloatDef().deleteFloatDef( Authorization, (YCFBamFloatDefBuff)cur );
			}
			else if( "a823".equals( subClassCode ) ) {
				schema.getTableFloatType().deleteFloatType( Authorization, (YCFBamFloatTypeBuff)cur );
			}
			else if( "a874".equals( subClassCode ) ) {
				schema.getTableFloatCol().deleteFloatCol( Authorization, (YCFBamFloatColBuff)cur );
			}
			else if( "a826".equals( subClassCode ) ) {
				schema.getTableInt16Def().deleteInt16Def( Authorization, (YCFBamInt16DefBuff)cur );
			}
			else if( "a827".equals( subClassCode ) ) {
				schema.getTableInt16Type().deleteInt16Type( Authorization, (YCFBamInt16TypeBuff)cur );
			}
			else if( "a875".equals( subClassCode ) ) {
				schema.getTableId16Gen().deleteId16Gen( Authorization, (YCFBamId16GenBuff)cur );
			}
			else if( "a872".equals( subClassCode ) ) {
				schema.getTableEnumDef().deleteEnumDef( Authorization, (YCFBamEnumDefBuff)cur );
			}
			else if( "a873".equals( subClassCode ) ) {
				schema.getTableEnumType().deleteEnumType( Authorization, (YCFBamEnumTypeBuff)cur );
			}
			else if( "a878".equals( subClassCode ) ) {
				schema.getTableInt16Col().deleteInt16Col( Authorization, (YCFBamInt16ColBuff)cur );
			}
			else if( "a828".equals( subClassCode ) ) {
				schema.getTableInt32Def().deleteInt32Def( Authorization, (YCFBamInt32DefBuff)cur );
			}
			else if( "a829".equals( subClassCode ) ) {
				schema.getTableInt32Type().deleteInt32Type( Authorization, (YCFBamInt32TypeBuff)cur );
			}
			else if( "a876".equals( subClassCode ) ) {
				schema.getTableId32Gen().deleteId32Gen( Authorization, (YCFBamId32GenBuff)cur );
			}
			else if( "a879".equals( subClassCode ) ) {
				schema.getTableInt32Col().deleteInt32Col( Authorization, (YCFBamInt32ColBuff)cur );
			}
			else if( "a82a".equals( subClassCode ) ) {
				schema.getTableInt64Def().deleteInt64Def( Authorization, (YCFBamInt64DefBuff)cur );
			}
			else if( "a82b".equals( subClassCode ) ) {
				schema.getTableInt64Type().deleteInt64Type( Authorization, (YCFBamInt64TypeBuff)cur );
			}
			else if( "a877".equals( subClassCode ) ) {
				schema.getTableId64Gen().deleteId64Gen( Authorization, (YCFBamId64GenBuff)cur );
			}
			else if( "a87a".equals( subClassCode ) ) {
				schema.getTableInt64Col().deleteInt64Col( Authorization, (YCFBamInt64ColBuff)cur );
			}
			else if( "a82c".equals( subClassCode ) ) {
				schema.getTableNmTokenDef().deleteNmTokenDef( Authorization, (YCFBamNmTokenDefBuff)cur );
			}
			else if( "a82d".equals( subClassCode ) ) {
				schema.getTableNmTokenType().deleteNmTokenType( Authorization, (YCFBamNmTokenTypeBuff)cur );
			}
			else if( "a87b".equals( subClassCode ) ) {
				schema.getTableNmTokenCol().deleteNmTokenCol( Authorization, (YCFBamNmTokenColBuff)cur );
			}
			else if( "a82e".equals( subClassCode ) ) {
				schema.getTableNmTokensDef().deleteNmTokensDef( Authorization, (YCFBamNmTokensDefBuff)cur );
			}
			else if( "a82f".equals( subClassCode ) ) {
				schema.getTableNmTokensType().deleteNmTokensType( Authorization, (YCFBamNmTokensTypeBuff)cur );
			}
			else if( "a87c".equals( subClassCode ) ) {
				schema.getTableNmTokensCol().deleteNmTokensCol( Authorization, (YCFBamNmTokensColBuff)cur );
			}
			else if( "a830".equals( subClassCode ) ) {
				schema.getTableNumberDef().deleteNumberDef( Authorization, (YCFBamNumberDefBuff)cur );
			}
			else if( "a831".equals( subClassCode ) ) {
				schema.getTableNumberType().deleteNumberType( Authorization, (YCFBamNumberTypeBuff)cur );
			}
			else if( "a87d".equals( subClassCode ) ) {
				schema.getTableNumberCol().deleteNumberCol( Authorization, (YCFBamNumberColBuff)cur );
			}
			else if( "a83b".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Def().deleteDbKeyHash128Def( Authorization, (YCFBamDbKeyHash128DefBuff)cur );
			}
			else if( "a83c".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Col().deleteDbKeyHash128Col( Authorization, (YCFBamDbKeyHash128ColBuff)cur );
			}
			else if( "a83d".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Type().deleteDbKeyHash128Type( Authorization, (YCFBamDbKeyHash128TypeBuff)cur );
			}
			else if( "a83e".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Gen().deleteDbKeyHash128Gen( Authorization, (YCFBamDbKeyHash128GenBuff)cur );
			}
			else if( "a83f".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Def().deleteDbKeyHash160Def( Authorization, (YCFBamDbKeyHash160DefBuff)cur );
			}
			else if( "a840".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Col().deleteDbKeyHash160Col( Authorization, (YCFBamDbKeyHash160ColBuff)cur );
			}
			else if( "a841".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Type().deleteDbKeyHash160Type( Authorization, (YCFBamDbKeyHash160TypeBuff)cur );
			}
			else if( "a842".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Gen().deleteDbKeyHash160Gen( Authorization, (YCFBamDbKeyHash160GenBuff)cur );
			}
			else if( "a843".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Def().deleteDbKeyHash224Def( Authorization, (YCFBamDbKeyHash224DefBuff)cur );
			}
			else if( "a844".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Col().deleteDbKeyHash224Col( Authorization, (YCFBamDbKeyHash224ColBuff)cur );
			}
			else if( "a845".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Type().deleteDbKeyHash224Type( Authorization, (YCFBamDbKeyHash224TypeBuff)cur );
			}
			else if( "a846".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Gen().deleteDbKeyHash224Gen( Authorization, (YCFBamDbKeyHash224GenBuff)cur );
			}
			else if( "a847".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Def().deleteDbKeyHash256Def( Authorization, (YCFBamDbKeyHash256DefBuff)cur );
			}
			else if( "a848".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Col().deleteDbKeyHash256Col( Authorization, (YCFBamDbKeyHash256ColBuff)cur );
			}
			else if( "a849".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Type().deleteDbKeyHash256Type( Authorization, (YCFBamDbKeyHash256TypeBuff)cur );
			}
			else if( "a84a".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Gen().deleteDbKeyHash256Gen( Authorization, (YCFBamDbKeyHash256GenBuff)cur );
			}
			else if( "a84b".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Def().deleteDbKeyHash384Def( Authorization, (YCFBamDbKeyHash384DefBuff)cur );
			}
			else if( "a84c".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Col().deleteDbKeyHash384Col( Authorization, (YCFBamDbKeyHash384ColBuff)cur );
			}
			else if( "a84d".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Type().deleteDbKeyHash384Type( Authorization, (YCFBamDbKeyHash384TypeBuff)cur );
			}
			else if( "a84e".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Gen().deleteDbKeyHash384Gen( Authorization, (YCFBamDbKeyHash384GenBuff)cur );
			}
			else if( "a84f".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Def().deleteDbKeyHash512Def( Authorization, (YCFBamDbKeyHash512DefBuff)cur );
			}
			else if( "a850".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Col().deleteDbKeyHash512Col( Authorization, (YCFBamDbKeyHash512ColBuff)cur );
			}
			else if( "a851".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Type().deleteDbKeyHash512Type( Authorization, (YCFBamDbKeyHash512TypeBuff)cur );
			}
			else if( "a852".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Gen().deleteDbKeyHash512Gen( Authorization, (YCFBamDbKeyHash512GenBuff)cur );
			}
			else if( "a853".equals( subClassCode ) ) {
				schema.getTableStringDef().deleteStringDef( Authorization, (YCFBamStringDefBuff)cur );
			}
			else if( "a854".equals( subClassCode ) ) {
				schema.getTableStringType().deleteStringType( Authorization, (YCFBamStringTypeBuff)cur );
			}
			else if( "a87e".equals( subClassCode ) ) {
				schema.getTableStringCol().deleteStringCol( Authorization, (YCFBamStringColBuff)cur );
			}
			else if( "a855".equals( subClassCode ) ) {
				schema.getTableTZDateDef().deleteTZDateDef( Authorization, (YCFBamTZDateDefBuff)cur );
			}
			else if( "a856".equals( subClassCode ) ) {
				schema.getTableTZDateType().deleteTZDateType( Authorization, (YCFBamTZDateTypeBuff)cur );
			}
			else if( "a87f".equals( subClassCode ) ) {
				schema.getTableTZDateCol().deleteTZDateCol( Authorization, (YCFBamTZDateColBuff)cur );
			}
			else if( "a857".equals( subClassCode ) ) {
				schema.getTableTZTimeDef().deleteTZTimeDef( Authorization, (YCFBamTZTimeDefBuff)cur );
			}
			else if( "a858".equals( subClassCode ) ) {
				schema.getTableTZTimeType().deleteTZTimeType( Authorization, (YCFBamTZTimeTypeBuff)cur );
			}
			else if( "a880".equals( subClassCode ) ) {
				schema.getTableTZTimeCol().deleteTZTimeCol( Authorization, (YCFBamTZTimeColBuff)cur );
			}
			else if( "a859".equals( subClassCode ) ) {
				schema.getTableTZTimestampDef().deleteTZTimestampDef( Authorization, (YCFBamTZTimestampDefBuff)cur );
			}
			else if( "a85a".equals( subClassCode ) ) {
				schema.getTableTZTimestampType().deleteTZTimestampType( Authorization, (YCFBamTZTimestampTypeBuff)cur );
			}
			else if( "a881".equals( subClassCode ) ) {
				schema.getTableTZTimestampCol().deleteTZTimestampCol( Authorization, (YCFBamTZTimestampColBuff)cur );
			}
			else if( "a85c".equals( subClassCode ) ) {
				schema.getTableTextDef().deleteTextDef( Authorization, (YCFBamTextDefBuff)cur );
			}
			else if( "a85d".equals( subClassCode ) ) {
				schema.getTableTextType().deleteTextType( Authorization, (YCFBamTextTypeBuff)cur );
			}
			else if( "a882".equals( subClassCode ) ) {
				schema.getTableTextCol().deleteTextCol( Authorization, (YCFBamTextColBuff)cur );
			}
			else if( "a85e".equals( subClassCode ) ) {
				schema.getTableTimeDef().deleteTimeDef( Authorization, (YCFBamTimeDefBuff)cur );
			}
			else if( "a85f".equals( subClassCode ) ) {
				schema.getTableTimeType().deleteTimeType( Authorization, (YCFBamTimeTypeBuff)cur );
			}
			else if( "a883".equals( subClassCode ) ) {
				schema.getTableTimeCol().deleteTimeCol( Authorization, (YCFBamTimeColBuff)cur );
			}
			else if( "a860".equals( subClassCode ) ) {
				schema.getTableTimestampDef().deleteTimestampDef( Authorization, (YCFBamTimestampDefBuff)cur );
			}
			else if( "a861".equals( subClassCode ) ) {
				schema.getTableTimestampType().deleteTimestampType( Authorization, (YCFBamTimestampTypeBuff)cur );
			}
			else if( "a884".equals( subClassCode ) ) {
				schema.getTableTimestampCol().deleteTimestampCol( Authorization, (YCFBamTimestampColBuff)cur );
			}
			else if( "a862".equals( subClassCode ) ) {
				schema.getTableTokenDef().deleteTokenDef( Authorization, (YCFBamTokenDefBuff)cur );
			}
			else if( "a863".equals( subClassCode ) ) {
				schema.getTableTokenType().deleteTokenType( Authorization, (YCFBamTokenTypeBuff)cur );
			}
			else if( "a885".equals( subClassCode ) ) {
				schema.getTableTokenCol().deleteTokenCol( Authorization, (YCFBamTokenColBuff)cur );
			}
			else if( "a864".equals( subClassCode ) ) {
				schema.getTableUInt16Def().deleteUInt16Def( Authorization, (YCFBamUInt16DefBuff)cur );
			}
			else if( "a865".equals( subClassCode ) ) {
				schema.getTableUInt16Type().deleteUInt16Type( Authorization, (YCFBamUInt16TypeBuff)cur );
			}
			else if( "a886".equals( subClassCode ) ) {
				schema.getTableUInt16Col().deleteUInt16Col( Authorization, (YCFBamUInt16ColBuff)cur );
			}
			else if( "a866".equals( subClassCode ) ) {
				schema.getTableUInt32Def().deleteUInt32Def( Authorization, (YCFBamUInt32DefBuff)cur );
			}
			else if( "a867".equals( subClassCode ) ) {
				schema.getTableUInt32Type().deleteUInt32Type( Authorization, (YCFBamUInt32TypeBuff)cur );
			}
			else if( "a887".equals( subClassCode ) ) {
				schema.getTableUInt32Col().deleteUInt32Col( Authorization, (YCFBamUInt32ColBuff)cur );
			}
			else if( "a868".equals( subClassCode ) ) {
				schema.getTableUInt64Def().deleteUInt64Def( Authorization, (YCFBamUInt64DefBuff)cur );
			}
			else if( "a869".equals( subClassCode ) ) {
				schema.getTableUInt64Type().deleteUInt64Type( Authorization, (YCFBamUInt64TypeBuff)cur );
			}
			else if( "a888".equals( subClassCode ) ) {
				schema.getTableUInt64Col().deleteUInt64Col( Authorization, (YCFBamUInt64ColBuff)cur );
			}
			else if( "a86a".equals( subClassCode ) ) {
				schema.getTableUuidDef().deleteUuidDef( Authorization, (YCFBamUuidDefBuff)cur );
			}
			else if( "a86c".equals( subClassCode ) ) {
				schema.getTableUuidType().deleteUuidType( Authorization, (YCFBamUuidTypeBuff)cur );
			}
			else if( "a88b".equals( subClassCode ) ) {
				schema.getTableUuidGen().deleteUuidGen( Authorization, (YCFBamUuidGenBuff)cur );
			}
			else if( "a889".equals( subClassCode ) ) {
				schema.getTableUuidCol().deleteUuidCol( Authorization, (YCFBamUuidColBuff)cur );
			}
			else if( "a86b".equals( subClassCode ) ) {
				schema.getTableUuid6Def().deleteUuid6Def( Authorization, (YCFBamUuid6DefBuff)cur );
			}
			else if( "a86d".equals( subClassCode ) ) {
				schema.getTableUuid6Type().deleteUuid6Type( Authorization, (YCFBamUuid6TypeBuff)cur );
			}
			else if( "a88c".equals( subClassCode ) ) {
				schema.getTableUuid6Gen().deleteUuid6Gen( Authorization, (YCFBamUuid6GenBuff)cur );
			}
			else if( "a88a".equals( subClassCode ) ) {
				schema.getTableUuid6Col().deleteUuid6Col( Authorization, (YCFBamUuid6ColBuff)cur );
			}
			else if( "a85b".equals( subClassCode ) ) {
				schema.getTableTableCol().deleteTableCol( Authorization, (YCFBamTableColBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of Value must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteValueByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamValueByDefSchemaIdxKey key = schema.getFactoryValue().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deleteValueByDefSchemaIdx( Authorization, key );
	}

	public void deleteValueByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamValueByDefSchemaIdxKey argKey )
	{
		final String S_ProcName = "deleteValueByDefSchemaIdx";
		YCFBamValueBuff cur;
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
		LinkedList<YCFBamValueBuff> matchSet = new LinkedList<YCFBamValueBuff>();
		Iterator<YCFBamValueBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamValueBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableValue().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a80c".equals( subClassCode ) ) {
				schema.getTableValue().deleteValue( Authorization, cur );
			}
			else if( "a80d".equals( subClassCode ) ) {
				schema.getTableAtom().deleteAtom( Authorization, (YCFBamAtomBuff)cur );
			}
			else if( "a80e".equals( subClassCode ) ) {
				schema.getTableBlobDef().deleteBlobDef( Authorization, (YCFBamBlobDefBuff)cur );
			}
			else if( "a80f".equals( subClassCode ) ) {
				schema.getTableBlobType().deleteBlobType( Authorization, (YCFBamBlobTypeBuff)cur );
			}
			else if( "a86e".equals( subClassCode ) ) {
				schema.getTableBlobCol().deleteBlobCol( Authorization, (YCFBamBlobColBuff)cur );
			}
			else if( "a810".equals( subClassCode ) ) {
				schema.getTableBoolDef().deleteBoolDef( Authorization, (YCFBamBoolDefBuff)cur );
			}
			else if( "a811".equals( subClassCode ) ) {
				schema.getTableBoolType().deleteBoolType( Authorization, (YCFBamBoolTypeBuff)cur );
			}
			else if( "a86f".equals( subClassCode ) ) {
				schema.getTableBoolCol().deleteBoolCol( Authorization, (YCFBamBoolColBuff)cur );
			}
			else if( "a818".equals( subClassCode ) ) {
				schema.getTableDateDef().deleteDateDef( Authorization, (YCFBamDateDefBuff)cur );
			}
			else if( "a819".equals( subClassCode ) ) {
				schema.getTableDateType().deleteDateType( Authorization, (YCFBamDateTypeBuff)cur );
			}
			else if( "a870".equals( subClassCode ) ) {
				schema.getTableDateCol().deleteDateCol( Authorization, (YCFBamDateColBuff)cur );
			}
			else if( "a81f".equals( subClassCode ) ) {
				schema.getTableDoubleDef().deleteDoubleDef( Authorization, (YCFBamDoubleDefBuff)cur );
			}
			else if( "a820".equals( subClassCode ) ) {
				schema.getTableDoubleType().deleteDoubleType( Authorization, (YCFBamDoubleTypeBuff)cur );
			}
			else if( "a871".equals( subClassCode ) ) {
				schema.getTableDoubleCol().deleteDoubleCol( Authorization, (YCFBamDoubleColBuff)cur );
			}
			else if( "a822".equals( subClassCode ) ) {
				schema.getTableFloatDef().deleteFloatDef( Authorization, (YCFBamFloatDefBuff)cur );
			}
			else if( "a823".equals( subClassCode ) ) {
				schema.getTableFloatType().deleteFloatType( Authorization, (YCFBamFloatTypeBuff)cur );
			}
			else if( "a874".equals( subClassCode ) ) {
				schema.getTableFloatCol().deleteFloatCol( Authorization, (YCFBamFloatColBuff)cur );
			}
			else if( "a826".equals( subClassCode ) ) {
				schema.getTableInt16Def().deleteInt16Def( Authorization, (YCFBamInt16DefBuff)cur );
			}
			else if( "a827".equals( subClassCode ) ) {
				schema.getTableInt16Type().deleteInt16Type( Authorization, (YCFBamInt16TypeBuff)cur );
			}
			else if( "a875".equals( subClassCode ) ) {
				schema.getTableId16Gen().deleteId16Gen( Authorization, (YCFBamId16GenBuff)cur );
			}
			else if( "a872".equals( subClassCode ) ) {
				schema.getTableEnumDef().deleteEnumDef( Authorization, (YCFBamEnumDefBuff)cur );
			}
			else if( "a873".equals( subClassCode ) ) {
				schema.getTableEnumType().deleteEnumType( Authorization, (YCFBamEnumTypeBuff)cur );
			}
			else if( "a878".equals( subClassCode ) ) {
				schema.getTableInt16Col().deleteInt16Col( Authorization, (YCFBamInt16ColBuff)cur );
			}
			else if( "a828".equals( subClassCode ) ) {
				schema.getTableInt32Def().deleteInt32Def( Authorization, (YCFBamInt32DefBuff)cur );
			}
			else if( "a829".equals( subClassCode ) ) {
				schema.getTableInt32Type().deleteInt32Type( Authorization, (YCFBamInt32TypeBuff)cur );
			}
			else if( "a876".equals( subClassCode ) ) {
				schema.getTableId32Gen().deleteId32Gen( Authorization, (YCFBamId32GenBuff)cur );
			}
			else if( "a879".equals( subClassCode ) ) {
				schema.getTableInt32Col().deleteInt32Col( Authorization, (YCFBamInt32ColBuff)cur );
			}
			else if( "a82a".equals( subClassCode ) ) {
				schema.getTableInt64Def().deleteInt64Def( Authorization, (YCFBamInt64DefBuff)cur );
			}
			else if( "a82b".equals( subClassCode ) ) {
				schema.getTableInt64Type().deleteInt64Type( Authorization, (YCFBamInt64TypeBuff)cur );
			}
			else if( "a877".equals( subClassCode ) ) {
				schema.getTableId64Gen().deleteId64Gen( Authorization, (YCFBamId64GenBuff)cur );
			}
			else if( "a87a".equals( subClassCode ) ) {
				schema.getTableInt64Col().deleteInt64Col( Authorization, (YCFBamInt64ColBuff)cur );
			}
			else if( "a82c".equals( subClassCode ) ) {
				schema.getTableNmTokenDef().deleteNmTokenDef( Authorization, (YCFBamNmTokenDefBuff)cur );
			}
			else if( "a82d".equals( subClassCode ) ) {
				schema.getTableNmTokenType().deleteNmTokenType( Authorization, (YCFBamNmTokenTypeBuff)cur );
			}
			else if( "a87b".equals( subClassCode ) ) {
				schema.getTableNmTokenCol().deleteNmTokenCol( Authorization, (YCFBamNmTokenColBuff)cur );
			}
			else if( "a82e".equals( subClassCode ) ) {
				schema.getTableNmTokensDef().deleteNmTokensDef( Authorization, (YCFBamNmTokensDefBuff)cur );
			}
			else if( "a82f".equals( subClassCode ) ) {
				schema.getTableNmTokensType().deleteNmTokensType( Authorization, (YCFBamNmTokensTypeBuff)cur );
			}
			else if( "a87c".equals( subClassCode ) ) {
				schema.getTableNmTokensCol().deleteNmTokensCol( Authorization, (YCFBamNmTokensColBuff)cur );
			}
			else if( "a830".equals( subClassCode ) ) {
				schema.getTableNumberDef().deleteNumberDef( Authorization, (YCFBamNumberDefBuff)cur );
			}
			else if( "a831".equals( subClassCode ) ) {
				schema.getTableNumberType().deleteNumberType( Authorization, (YCFBamNumberTypeBuff)cur );
			}
			else if( "a87d".equals( subClassCode ) ) {
				schema.getTableNumberCol().deleteNumberCol( Authorization, (YCFBamNumberColBuff)cur );
			}
			else if( "a83b".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Def().deleteDbKeyHash128Def( Authorization, (YCFBamDbKeyHash128DefBuff)cur );
			}
			else if( "a83c".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Col().deleteDbKeyHash128Col( Authorization, (YCFBamDbKeyHash128ColBuff)cur );
			}
			else if( "a83d".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Type().deleteDbKeyHash128Type( Authorization, (YCFBamDbKeyHash128TypeBuff)cur );
			}
			else if( "a83e".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Gen().deleteDbKeyHash128Gen( Authorization, (YCFBamDbKeyHash128GenBuff)cur );
			}
			else if( "a83f".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Def().deleteDbKeyHash160Def( Authorization, (YCFBamDbKeyHash160DefBuff)cur );
			}
			else if( "a840".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Col().deleteDbKeyHash160Col( Authorization, (YCFBamDbKeyHash160ColBuff)cur );
			}
			else if( "a841".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Type().deleteDbKeyHash160Type( Authorization, (YCFBamDbKeyHash160TypeBuff)cur );
			}
			else if( "a842".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Gen().deleteDbKeyHash160Gen( Authorization, (YCFBamDbKeyHash160GenBuff)cur );
			}
			else if( "a843".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Def().deleteDbKeyHash224Def( Authorization, (YCFBamDbKeyHash224DefBuff)cur );
			}
			else if( "a844".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Col().deleteDbKeyHash224Col( Authorization, (YCFBamDbKeyHash224ColBuff)cur );
			}
			else if( "a845".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Type().deleteDbKeyHash224Type( Authorization, (YCFBamDbKeyHash224TypeBuff)cur );
			}
			else if( "a846".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Gen().deleteDbKeyHash224Gen( Authorization, (YCFBamDbKeyHash224GenBuff)cur );
			}
			else if( "a847".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Def().deleteDbKeyHash256Def( Authorization, (YCFBamDbKeyHash256DefBuff)cur );
			}
			else if( "a848".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Col().deleteDbKeyHash256Col( Authorization, (YCFBamDbKeyHash256ColBuff)cur );
			}
			else if( "a849".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Type().deleteDbKeyHash256Type( Authorization, (YCFBamDbKeyHash256TypeBuff)cur );
			}
			else if( "a84a".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Gen().deleteDbKeyHash256Gen( Authorization, (YCFBamDbKeyHash256GenBuff)cur );
			}
			else if( "a84b".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Def().deleteDbKeyHash384Def( Authorization, (YCFBamDbKeyHash384DefBuff)cur );
			}
			else if( "a84c".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Col().deleteDbKeyHash384Col( Authorization, (YCFBamDbKeyHash384ColBuff)cur );
			}
			else if( "a84d".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Type().deleteDbKeyHash384Type( Authorization, (YCFBamDbKeyHash384TypeBuff)cur );
			}
			else if( "a84e".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Gen().deleteDbKeyHash384Gen( Authorization, (YCFBamDbKeyHash384GenBuff)cur );
			}
			else if( "a84f".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Def().deleteDbKeyHash512Def( Authorization, (YCFBamDbKeyHash512DefBuff)cur );
			}
			else if( "a850".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Col().deleteDbKeyHash512Col( Authorization, (YCFBamDbKeyHash512ColBuff)cur );
			}
			else if( "a851".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Type().deleteDbKeyHash512Type( Authorization, (YCFBamDbKeyHash512TypeBuff)cur );
			}
			else if( "a852".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Gen().deleteDbKeyHash512Gen( Authorization, (YCFBamDbKeyHash512GenBuff)cur );
			}
			else if( "a853".equals( subClassCode ) ) {
				schema.getTableStringDef().deleteStringDef( Authorization, (YCFBamStringDefBuff)cur );
			}
			else if( "a854".equals( subClassCode ) ) {
				schema.getTableStringType().deleteStringType( Authorization, (YCFBamStringTypeBuff)cur );
			}
			else if( "a87e".equals( subClassCode ) ) {
				schema.getTableStringCol().deleteStringCol( Authorization, (YCFBamStringColBuff)cur );
			}
			else if( "a855".equals( subClassCode ) ) {
				schema.getTableTZDateDef().deleteTZDateDef( Authorization, (YCFBamTZDateDefBuff)cur );
			}
			else if( "a856".equals( subClassCode ) ) {
				schema.getTableTZDateType().deleteTZDateType( Authorization, (YCFBamTZDateTypeBuff)cur );
			}
			else if( "a87f".equals( subClassCode ) ) {
				schema.getTableTZDateCol().deleteTZDateCol( Authorization, (YCFBamTZDateColBuff)cur );
			}
			else if( "a857".equals( subClassCode ) ) {
				schema.getTableTZTimeDef().deleteTZTimeDef( Authorization, (YCFBamTZTimeDefBuff)cur );
			}
			else if( "a858".equals( subClassCode ) ) {
				schema.getTableTZTimeType().deleteTZTimeType( Authorization, (YCFBamTZTimeTypeBuff)cur );
			}
			else if( "a880".equals( subClassCode ) ) {
				schema.getTableTZTimeCol().deleteTZTimeCol( Authorization, (YCFBamTZTimeColBuff)cur );
			}
			else if( "a859".equals( subClassCode ) ) {
				schema.getTableTZTimestampDef().deleteTZTimestampDef( Authorization, (YCFBamTZTimestampDefBuff)cur );
			}
			else if( "a85a".equals( subClassCode ) ) {
				schema.getTableTZTimestampType().deleteTZTimestampType( Authorization, (YCFBamTZTimestampTypeBuff)cur );
			}
			else if( "a881".equals( subClassCode ) ) {
				schema.getTableTZTimestampCol().deleteTZTimestampCol( Authorization, (YCFBamTZTimestampColBuff)cur );
			}
			else if( "a85c".equals( subClassCode ) ) {
				schema.getTableTextDef().deleteTextDef( Authorization, (YCFBamTextDefBuff)cur );
			}
			else if( "a85d".equals( subClassCode ) ) {
				schema.getTableTextType().deleteTextType( Authorization, (YCFBamTextTypeBuff)cur );
			}
			else if( "a882".equals( subClassCode ) ) {
				schema.getTableTextCol().deleteTextCol( Authorization, (YCFBamTextColBuff)cur );
			}
			else if( "a85e".equals( subClassCode ) ) {
				schema.getTableTimeDef().deleteTimeDef( Authorization, (YCFBamTimeDefBuff)cur );
			}
			else if( "a85f".equals( subClassCode ) ) {
				schema.getTableTimeType().deleteTimeType( Authorization, (YCFBamTimeTypeBuff)cur );
			}
			else if( "a883".equals( subClassCode ) ) {
				schema.getTableTimeCol().deleteTimeCol( Authorization, (YCFBamTimeColBuff)cur );
			}
			else if( "a860".equals( subClassCode ) ) {
				schema.getTableTimestampDef().deleteTimestampDef( Authorization, (YCFBamTimestampDefBuff)cur );
			}
			else if( "a861".equals( subClassCode ) ) {
				schema.getTableTimestampType().deleteTimestampType( Authorization, (YCFBamTimestampTypeBuff)cur );
			}
			else if( "a884".equals( subClassCode ) ) {
				schema.getTableTimestampCol().deleteTimestampCol( Authorization, (YCFBamTimestampColBuff)cur );
			}
			else if( "a862".equals( subClassCode ) ) {
				schema.getTableTokenDef().deleteTokenDef( Authorization, (YCFBamTokenDefBuff)cur );
			}
			else if( "a863".equals( subClassCode ) ) {
				schema.getTableTokenType().deleteTokenType( Authorization, (YCFBamTokenTypeBuff)cur );
			}
			else if( "a885".equals( subClassCode ) ) {
				schema.getTableTokenCol().deleteTokenCol( Authorization, (YCFBamTokenColBuff)cur );
			}
			else if( "a864".equals( subClassCode ) ) {
				schema.getTableUInt16Def().deleteUInt16Def( Authorization, (YCFBamUInt16DefBuff)cur );
			}
			else if( "a865".equals( subClassCode ) ) {
				schema.getTableUInt16Type().deleteUInt16Type( Authorization, (YCFBamUInt16TypeBuff)cur );
			}
			else if( "a886".equals( subClassCode ) ) {
				schema.getTableUInt16Col().deleteUInt16Col( Authorization, (YCFBamUInt16ColBuff)cur );
			}
			else if( "a866".equals( subClassCode ) ) {
				schema.getTableUInt32Def().deleteUInt32Def( Authorization, (YCFBamUInt32DefBuff)cur );
			}
			else if( "a867".equals( subClassCode ) ) {
				schema.getTableUInt32Type().deleteUInt32Type( Authorization, (YCFBamUInt32TypeBuff)cur );
			}
			else if( "a887".equals( subClassCode ) ) {
				schema.getTableUInt32Col().deleteUInt32Col( Authorization, (YCFBamUInt32ColBuff)cur );
			}
			else if( "a868".equals( subClassCode ) ) {
				schema.getTableUInt64Def().deleteUInt64Def( Authorization, (YCFBamUInt64DefBuff)cur );
			}
			else if( "a869".equals( subClassCode ) ) {
				schema.getTableUInt64Type().deleteUInt64Type( Authorization, (YCFBamUInt64TypeBuff)cur );
			}
			else if( "a888".equals( subClassCode ) ) {
				schema.getTableUInt64Col().deleteUInt64Col( Authorization, (YCFBamUInt64ColBuff)cur );
			}
			else if( "a86a".equals( subClassCode ) ) {
				schema.getTableUuidDef().deleteUuidDef( Authorization, (YCFBamUuidDefBuff)cur );
			}
			else if( "a86c".equals( subClassCode ) ) {
				schema.getTableUuidType().deleteUuidType( Authorization, (YCFBamUuidTypeBuff)cur );
			}
			else if( "a88b".equals( subClassCode ) ) {
				schema.getTableUuidGen().deleteUuidGen( Authorization, (YCFBamUuidGenBuff)cur );
			}
			else if( "a889".equals( subClassCode ) ) {
				schema.getTableUuidCol().deleteUuidCol( Authorization, (YCFBamUuidColBuff)cur );
			}
			else if( "a86b".equals( subClassCode ) ) {
				schema.getTableUuid6Def().deleteUuid6Def( Authorization, (YCFBamUuid6DefBuff)cur );
			}
			else if( "a86d".equals( subClassCode ) ) {
				schema.getTableUuid6Type().deleteUuid6Type( Authorization, (YCFBamUuid6TypeBuff)cur );
			}
			else if( "a88c".equals( subClassCode ) ) {
				schema.getTableUuid6Gen().deleteUuid6Gen( Authorization, (YCFBamUuid6GenBuff)cur );
			}
			else if( "a88a".equals( subClassCode ) ) {
				schema.getTableUuid6Col().deleteUuid6Col( Authorization, (YCFBamUuid6ColBuff)cur );
			}
			else if( "a85b".equals( subClassCode ) ) {
				schema.getTableTableCol().deleteTableCol( Authorization, (YCFBamTableColBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of Value must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteValueByPrevIdx( YCFSecAuthorization Authorization,
		Long argPrevTenantId,
		Long argPrevId )
	{
		YCFBamValueByPrevIdxKey key = schema.getFactoryValue().newPrevIdxKey();
		key.setOptionalPrevTenantId( argPrevTenantId );
		key.setOptionalPrevId( argPrevId );
		deleteValueByPrevIdx( Authorization, key );
	}

	public void deleteValueByPrevIdx( YCFSecAuthorization Authorization,
		YCFBamValueByPrevIdxKey argKey )
	{
		final String S_ProcName = "deleteValueByPrevIdx";
		YCFBamValueBuff cur;
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
		LinkedList<YCFBamValueBuff> matchSet = new LinkedList<YCFBamValueBuff>();
		Iterator<YCFBamValueBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamValueBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableValue().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a80c".equals( subClassCode ) ) {
				schema.getTableValue().deleteValue( Authorization, cur );
			}
			else if( "a80d".equals( subClassCode ) ) {
				schema.getTableAtom().deleteAtom( Authorization, (YCFBamAtomBuff)cur );
			}
			else if( "a80e".equals( subClassCode ) ) {
				schema.getTableBlobDef().deleteBlobDef( Authorization, (YCFBamBlobDefBuff)cur );
			}
			else if( "a80f".equals( subClassCode ) ) {
				schema.getTableBlobType().deleteBlobType( Authorization, (YCFBamBlobTypeBuff)cur );
			}
			else if( "a86e".equals( subClassCode ) ) {
				schema.getTableBlobCol().deleteBlobCol( Authorization, (YCFBamBlobColBuff)cur );
			}
			else if( "a810".equals( subClassCode ) ) {
				schema.getTableBoolDef().deleteBoolDef( Authorization, (YCFBamBoolDefBuff)cur );
			}
			else if( "a811".equals( subClassCode ) ) {
				schema.getTableBoolType().deleteBoolType( Authorization, (YCFBamBoolTypeBuff)cur );
			}
			else if( "a86f".equals( subClassCode ) ) {
				schema.getTableBoolCol().deleteBoolCol( Authorization, (YCFBamBoolColBuff)cur );
			}
			else if( "a818".equals( subClassCode ) ) {
				schema.getTableDateDef().deleteDateDef( Authorization, (YCFBamDateDefBuff)cur );
			}
			else if( "a819".equals( subClassCode ) ) {
				schema.getTableDateType().deleteDateType( Authorization, (YCFBamDateTypeBuff)cur );
			}
			else if( "a870".equals( subClassCode ) ) {
				schema.getTableDateCol().deleteDateCol( Authorization, (YCFBamDateColBuff)cur );
			}
			else if( "a81f".equals( subClassCode ) ) {
				schema.getTableDoubleDef().deleteDoubleDef( Authorization, (YCFBamDoubleDefBuff)cur );
			}
			else if( "a820".equals( subClassCode ) ) {
				schema.getTableDoubleType().deleteDoubleType( Authorization, (YCFBamDoubleTypeBuff)cur );
			}
			else if( "a871".equals( subClassCode ) ) {
				schema.getTableDoubleCol().deleteDoubleCol( Authorization, (YCFBamDoubleColBuff)cur );
			}
			else if( "a822".equals( subClassCode ) ) {
				schema.getTableFloatDef().deleteFloatDef( Authorization, (YCFBamFloatDefBuff)cur );
			}
			else if( "a823".equals( subClassCode ) ) {
				schema.getTableFloatType().deleteFloatType( Authorization, (YCFBamFloatTypeBuff)cur );
			}
			else if( "a874".equals( subClassCode ) ) {
				schema.getTableFloatCol().deleteFloatCol( Authorization, (YCFBamFloatColBuff)cur );
			}
			else if( "a826".equals( subClassCode ) ) {
				schema.getTableInt16Def().deleteInt16Def( Authorization, (YCFBamInt16DefBuff)cur );
			}
			else if( "a827".equals( subClassCode ) ) {
				schema.getTableInt16Type().deleteInt16Type( Authorization, (YCFBamInt16TypeBuff)cur );
			}
			else if( "a875".equals( subClassCode ) ) {
				schema.getTableId16Gen().deleteId16Gen( Authorization, (YCFBamId16GenBuff)cur );
			}
			else if( "a872".equals( subClassCode ) ) {
				schema.getTableEnumDef().deleteEnumDef( Authorization, (YCFBamEnumDefBuff)cur );
			}
			else if( "a873".equals( subClassCode ) ) {
				schema.getTableEnumType().deleteEnumType( Authorization, (YCFBamEnumTypeBuff)cur );
			}
			else if( "a878".equals( subClassCode ) ) {
				schema.getTableInt16Col().deleteInt16Col( Authorization, (YCFBamInt16ColBuff)cur );
			}
			else if( "a828".equals( subClassCode ) ) {
				schema.getTableInt32Def().deleteInt32Def( Authorization, (YCFBamInt32DefBuff)cur );
			}
			else if( "a829".equals( subClassCode ) ) {
				schema.getTableInt32Type().deleteInt32Type( Authorization, (YCFBamInt32TypeBuff)cur );
			}
			else if( "a876".equals( subClassCode ) ) {
				schema.getTableId32Gen().deleteId32Gen( Authorization, (YCFBamId32GenBuff)cur );
			}
			else if( "a879".equals( subClassCode ) ) {
				schema.getTableInt32Col().deleteInt32Col( Authorization, (YCFBamInt32ColBuff)cur );
			}
			else if( "a82a".equals( subClassCode ) ) {
				schema.getTableInt64Def().deleteInt64Def( Authorization, (YCFBamInt64DefBuff)cur );
			}
			else if( "a82b".equals( subClassCode ) ) {
				schema.getTableInt64Type().deleteInt64Type( Authorization, (YCFBamInt64TypeBuff)cur );
			}
			else if( "a877".equals( subClassCode ) ) {
				schema.getTableId64Gen().deleteId64Gen( Authorization, (YCFBamId64GenBuff)cur );
			}
			else if( "a87a".equals( subClassCode ) ) {
				schema.getTableInt64Col().deleteInt64Col( Authorization, (YCFBamInt64ColBuff)cur );
			}
			else if( "a82c".equals( subClassCode ) ) {
				schema.getTableNmTokenDef().deleteNmTokenDef( Authorization, (YCFBamNmTokenDefBuff)cur );
			}
			else if( "a82d".equals( subClassCode ) ) {
				schema.getTableNmTokenType().deleteNmTokenType( Authorization, (YCFBamNmTokenTypeBuff)cur );
			}
			else if( "a87b".equals( subClassCode ) ) {
				schema.getTableNmTokenCol().deleteNmTokenCol( Authorization, (YCFBamNmTokenColBuff)cur );
			}
			else if( "a82e".equals( subClassCode ) ) {
				schema.getTableNmTokensDef().deleteNmTokensDef( Authorization, (YCFBamNmTokensDefBuff)cur );
			}
			else if( "a82f".equals( subClassCode ) ) {
				schema.getTableNmTokensType().deleteNmTokensType( Authorization, (YCFBamNmTokensTypeBuff)cur );
			}
			else if( "a87c".equals( subClassCode ) ) {
				schema.getTableNmTokensCol().deleteNmTokensCol( Authorization, (YCFBamNmTokensColBuff)cur );
			}
			else if( "a830".equals( subClassCode ) ) {
				schema.getTableNumberDef().deleteNumberDef( Authorization, (YCFBamNumberDefBuff)cur );
			}
			else if( "a831".equals( subClassCode ) ) {
				schema.getTableNumberType().deleteNumberType( Authorization, (YCFBamNumberTypeBuff)cur );
			}
			else if( "a87d".equals( subClassCode ) ) {
				schema.getTableNumberCol().deleteNumberCol( Authorization, (YCFBamNumberColBuff)cur );
			}
			else if( "a83b".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Def().deleteDbKeyHash128Def( Authorization, (YCFBamDbKeyHash128DefBuff)cur );
			}
			else if( "a83c".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Col().deleteDbKeyHash128Col( Authorization, (YCFBamDbKeyHash128ColBuff)cur );
			}
			else if( "a83d".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Type().deleteDbKeyHash128Type( Authorization, (YCFBamDbKeyHash128TypeBuff)cur );
			}
			else if( "a83e".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Gen().deleteDbKeyHash128Gen( Authorization, (YCFBamDbKeyHash128GenBuff)cur );
			}
			else if( "a83f".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Def().deleteDbKeyHash160Def( Authorization, (YCFBamDbKeyHash160DefBuff)cur );
			}
			else if( "a840".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Col().deleteDbKeyHash160Col( Authorization, (YCFBamDbKeyHash160ColBuff)cur );
			}
			else if( "a841".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Type().deleteDbKeyHash160Type( Authorization, (YCFBamDbKeyHash160TypeBuff)cur );
			}
			else if( "a842".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Gen().deleteDbKeyHash160Gen( Authorization, (YCFBamDbKeyHash160GenBuff)cur );
			}
			else if( "a843".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Def().deleteDbKeyHash224Def( Authorization, (YCFBamDbKeyHash224DefBuff)cur );
			}
			else if( "a844".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Col().deleteDbKeyHash224Col( Authorization, (YCFBamDbKeyHash224ColBuff)cur );
			}
			else if( "a845".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Type().deleteDbKeyHash224Type( Authorization, (YCFBamDbKeyHash224TypeBuff)cur );
			}
			else if( "a846".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Gen().deleteDbKeyHash224Gen( Authorization, (YCFBamDbKeyHash224GenBuff)cur );
			}
			else if( "a847".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Def().deleteDbKeyHash256Def( Authorization, (YCFBamDbKeyHash256DefBuff)cur );
			}
			else if( "a848".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Col().deleteDbKeyHash256Col( Authorization, (YCFBamDbKeyHash256ColBuff)cur );
			}
			else if( "a849".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Type().deleteDbKeyHash256Type( Authorization, (YCFBamDbKeyHash256TypeBuff)cur );
			}
			else if( "a84a".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Gen().deleteDbKeyHash256Gen( Authorization, (YCFBamDbKeyHash256GenBuff)cur );
			}
			else if( "a84b".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Def().deleteDbKeyHash384Def( Authorization, (YCFBamDbKeyHash384DefBuff)cur );
			}
			else if( "a84c".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Col().deleteDbKeyHash384Col( Authorization, (YCFBamDbKeyHash384ColBuff)cur );
			}
			else if( "a84d".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Type().deleteDbKeyHash384Type( Authorization, (YCFBamDbKeyHash384TypeBuff)cur );
			}
			else if( "a84e".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Gen().deleteDbKeyHash384Gen( Authorization, (YCFBamDbKeyHash384GenBuff)cur );
			}
			else if( "a84f".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Def().deleteDbKeyHash512Def( Authorization, (YCFBamDbKeyHash512DefBuff)cur );
			}
			else if( "a850".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Col().deleteDbKeyHash512Col( Authorization, (YCFBamDbKeyHash512ColBuff)cur );
			}
			else if( "a851".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Type().deleteDbKeyHash512Type( Authorization, (YCFBamDbKeyHash512TypeBuff)cur );
			}
			else if( "a852".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Gen().deleteDbKeyHash512Gen( Authorization, (YCFBamDbKeyHash512GenBuff)cur );
			}
			else if( "a853".equals( subClassCode ) ) {
				schema.getTableStringDef().deleteStringDef( Authorization, (YCFBamStringDefBuff)cur );
			}
			else if( "a854".equals( subClassCode ) ) {
				schema.getTableStringType().deleteStringType( Authorization, (YCFBamStringTypeBuff)cur );
			}
			else if( "a87e".equals( subClassCode ) ) {
				schema.getTableStringCol().deleteStringCol( Authorization, (YCFBamStringColBuff)cur );
			}
			else if( "a855".equals( subClassCode ) ) {
				schema.getTableTZDateDef().deleteTZDateDef( Authorization, (YCFBamTZDateDefBuff)cur );
			}
			else if( "a856".equals( subClassCode ) ) {
				schema.getTableTZDateType().deleteTZDateType( Authorization, (YCFBamTZDateTypeBuff)cur );
			}
			else if( "a87f".equals( subClassCode ) ) {
				schema.getTableTZDateCol().deleteTZDateCol( Authorization, (YCFBamTZDateColBuff)cur );
			}
			else if( "a857".equals( subClassCode ) ) {
				schema.getTableTZTimeDef().deleteTZTimeDef( Authorization, (YCFBamTZTimeDefBuff)cur );
			}
			else if( "a858".equals( subClassCode ) ) {
				schema.getTableTZTimeType().deleteTZTimeType( Authorization, (YCFBamTZTimeTypeBuff)cur );
			}
			else if( "a880".equals( subClassCode ) ) {
				schema.getTableTZTimeCol().deleteTZTimeCol( Authorization, (YCFBamTZTimeColBuff)cur );
			}
			else if( "a859".equals( subClassCode ) ) {
				schema.getTableTZTimestampDef().deleteTZTimestampDef( Authorization, (YCFBamTZTimestampDefBuff)cur );
			}
			else if( "a85a".equals( subClassCode ) ) {
				schema.getTableTZTimestampType().deleteTZTimestampType( Authorization, (YCFBamTZTimestampTypeBuff)cur );
			}
			else if( "a881".equals( subClassCode ) ) {
				schema.getTableTZTimestampCol().deleteTZTimestampCol( Authorization, (YCFBamTZTimestampColBuff)cur );
			}
			else if( "a85c".equals( subClassCode ) ) {
				schema.getTableTextDef().deleteTextDef( Authorization, (YCFBamTextDefBuff)cur );
			}
			else if( "a85d".equals( subClassCode ) ) {
				schema.getTableTextType().deleteTextType( Authorization, (YCFBamTextTypeBuff)cur );
			}
			else if( "a882".equals( subClassCode ) ) {
				schema.getTableTextCol().deleteTextCol( Authorization, (YCFBamTextColBuff)cur );
			}
			else if( "a85e".equals( subClassCode ) ) {
				schema.getTableTimeDef().deleteTimeDef( Authorization, (YCFBamTimeDefBuff)cur );
			}
			else if( "a85f".equals( subClassCode ) ) {
				schema.getTableTimeType().deleteTimeType( Authorization, (YCFBamTimeTypeBuff)cur );
			}
			else if( "a883".equals( subClassCode ) ) {
				schema.getTableTimeCol().deleteTimeCol( Authorization, (YCFBamTimeColBuff)cur );
			}
			else if( "a860".equals( subClassCode ) ) {
				schema.getTableTimestampDef().deleteTimestampDef( Authorization, (YCFBamTimestampDefBuff)cur );
			}
			else if( "a861".equals( subClassCode ) ) {
				schema.getTableTimestampType().deleteTimestampType( Authorization, (YCFBamTimestampTypeBuff)cur );
			}
			else if( "a884".equals( subClassCode ) ) {
				schema.getTableTimestampCol().deleteTimestampCol( Authorization, (YCFBamTimestampColBuff)cur );
			}
			else if( "a862".equals( subClassCode ) ) {
				schema.getTableTokenDef().deleteTokenDef( Authorization, (YCFBamTokenDefBuff)cur );
			}
			else if( "a863".equals( subClassCode ) ) {
				schema.getTableTokenType().deleteTokenType( Authorization, (YCFBamTokenTypeBuff)cur );
			}
			else if( "a885".equals( subClassCode ) ) {
				schema.getTableTokenCol().deleteTokenCol( Authorization, (YCFBamTokenColBuff)cur );
			}
			else if( "a864".equals( subClassCode ) ) {
				schema.getTableUInt16Def().deleteUInt16Def( Authorization, (YCFBamUInt16DefBuff)cur );
			}
			else if( "a865".equals( subClassCode ) ) {
				schema.getTableUInt16Type().deleteUInt16Type( Authorization, (YCFBamUInt16TypeBuff)cur );
			}
			else if( "a886".equals( subClassCode ) ) {
				schema.getTableUInt16Col().deleteUInt16Col( Authorization, (YCFBamUInt16ColBuff)cur );
			}
			else if( "a866".equals( subClassCode ) ) {
				schema.getTableUInt32Def().deleteUInt32Def( Authorization, (YCFBamUInt32DefBuff)cur );
			}
			else if( "a867".equals( subClassCode ) ) {
				schema.getTableUInt32Type().deleteUInt32Type( Authorization, (YCFBamUInt32TypeBuff)cur );
			}
			else if( "a887".equals( subClassCode ) ) {
				schema.getTableUInt32Col().deleteUInt32Col( Authorization, (YCFBamUInt32ColBuff)cur );
			}
			else if( "a868".equals( subClassCode ) ) {
				schema.getTableUInt64Def().deleteUInt64Def( Authorization, (YCFBamUInt64DefBuff)cur );
			}
			else if( "a869".equals( subClassCode ) ) {
				schema.getTableUInt64Type().deleteUInt64Type( Authorization, (YCFBamUInt64TypeBuff)cur );
			}
			else if( "a888".equals( subClassCode ) ) {
				schema.getTableUInt64Col().deleteUInt64Col( Authorization, (YCFBamUInt64ColBuff)cur );
			}
			else if( "a86a".equals( subClassCode ) ) {
				schema.getTableUuidDef().deleteUuidDef( Authorization, (YCFBamUuidDefBuff)cur );
			}
			else if( "a86c".equals( subClassCode ) ) {
				schema.getTableUuidType().deleteUuidType( Authorization, (YCFBamUuidTypeBuff)cur );
			}
			else if( "a88b".equals( subClassCode ) ) {
				schema.getTableUuidGen().deleteUuidGen( Authorization, (YCFBamUuidGenBuff)cur );
			}
			else if( "a889".equals( subClassCode ) ) {
				schema.getTableUuidCol().deleteUuidCol( Authorization, (YCFBamUuidColBuff)cur );
			}
			else if( "a86b".equals( subClassCode ) ) {
				schema.getTableUuid6Def().deleteUuid6Def( Authorization, (YCFBamUuid6DefBuff)cur );
			}
			else if( "a86d".equals( subClassCode ) ) {
				schema.getTableUuid6Type().deleteUuid6Type( Authorization, (YCFBamUuid6TypeBuff)cur );
			}
			else if( "a88c".equals( subClassCode ) ) {
				schema.getTableUuid6Gen().deleteUuid6Gen( Authorization, (YCFBamUuid6GenBuff)cur );
			}
			else if( "a88a".equals( subClassCode ) ) {
				schema.getTableUuid6Col().deleteUuid6Col( Authorization, (YCFBamUuid6ColBuff)cur );
			}
			else if( "a85b".equals( subClassCode ) ) {
				schema.getTableTableCol().deleteTableCol( Authorization, (YCFBamTableColBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of Value must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteValueByNextIdx( YCFSecAuthorization Authorization,
		Long argNextTenantId,
		Long argNextId )
	{
		YCFBamValueByNextIdxKey key = schema.getFactoryValue().newNextIdxKey();
		key.setOptionalNextTenantId( argNextTenantId );
		key.setOptionalNextId( argNextId );
		deleteValueByNextIdx( Authorization, key );
	}

	public void deleteValueByNextIdx( YCFSecAuthorization Authorization,
		YCFBamValueByNextIdxKey argKey )
	{
		final String S_ProcName = "deleteValueByNextIdx";
		YCFBamValueBuff cur;
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
		LinkedList<YCFBamValueBuff> matchSet = new LinkedList<YCFBamValueBuff>();
		Iterator<YCFBamValueBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamValueBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableValue().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a80c".equals( subClassCode ) ) {
				schema.getTableValue().deleteValue( Authorization, cur );
			}
			else if( "a80d".equals( subClassCode ) ) {
				schema.getTableAtom().deleteAtom( Authorization, (YCFBamAtomBuff)cur );
			}
			else if( "a80e".equals( subClassCode ) ) {
				schema.getTableBlobDef().deleteBlobDef( Authorization, (YCFBamBlobDefBuff)cur );
			}
			else if( "a80f".equals( subClassCode ) ) {
				schema.getTableBlobType().deleteBlobType( Authorization, (YCFBamBlobTypeBuff)cur );
			}
			else if( "a86e".equals( subClassCode ) ) {
				schema.getTableBlobCol().deleteBlobCol( Authorization, (YCFBamBlobColBuff)cur );
			}
			else if( "a810".equals( subClassCode ) ) {
				schema.getTableBoolDef().deleteBoolDef( Authorization, (YCFBamBoolDefBuff)cur );
			}
			else if( "a811".equals( subClassCode ) ) {
				schema.getTableBoolType().deleteBoolType( Authorization, (YCFBamBoolTypeBuff)cur );
			}
			else if( "a86f".equals( subClassCode ) ) {
				schema.getTableBoolCol().deleteBoolCol( Authorization, (YCFBamBoolColBuff)cur );
			}
			else if( "a818".equals( subClassCode ) ) {
				schema.getTableDateDef().deleteDateDef( Authorization, (YCFBamDateDefBuff)cur );
			}
			else if( "a819".equals( subClassCode ) ) {
				schema.getTableDateType().deleteDateType( Authorization, (YCFBamDateTypeBuff)cur );
			}
			else if( "a870".equals( subClassCode ) ) {
				schema.getTableDateCol().deleteDateCol( Authorization, (YCFBamDateColBuff)cur );
			}
			else if( "a81f".equals( subClassCode ) ) {
				schema.getTableDoubleDef().deleteDoubleDef( Authorization, (YCFBamDoubleDefBuff)cur );
			}
			else if( "a820".equals( subClassCode ) ) {
				schema.getTableDoubleType().deleteDoubleType( Authorization, (YCFBamDoubleTypeBuff)cur );
			}
			else if( "a871".equals( subClassCode ) ) {
				schema.getTableDoubleCol().deleteDoubleCol( Authorization, (YCFBamDoubleColBuff)cur );
			}
			else if( "a822".equals( subClassCode ) ) {
				schema.getTableFloatDef().deleteFloatDef( Authorization, (YCFBamFloatDefBuff)cur );
			}
			else if( "a823".equals( subClassCode ) ) {
				schema.getTableFloatType().deleteFloatType( Authorization, (YCFBamFloatTypeBuff)cur );
			}
			else if( "a874".equals( subClassCode ) ) {
				schema.getTableFloatCol().deleteFloatCol( Authorization, (YCFBamFloatColBuff)cur );
			}
			else if( "a826".equals( subClassCode ) ) {
				schema.getTableInt16Def().deleteInt16Def( Authorization, (YCFBamInt16DefBuff)cur );
			}
			else if( "a827".equals( subClassCode ) ) {
				schema.getTableInt16Type().deleteInt16Type( Authorization, (YCFBamInt16TypeBuff)cur );
			}
			else if( "a875".equals( subClassCode ) ) {
				schema.getTableId16Gen().deleteId16Gen( Authorization, (YCFBamId16GenBuff)cur );
			}
			else if( "a872".equals( subClassCode ) ) {
				schema.getTableEnumDef().deleteEnumDef( Authorization, (YCFBamEnumDefBuff)cur );
			}
			else if( "a873".equals( subClassCode ) ) {
				schema.getTableEnumType().deleteEnumType( Authorization, (YCFBamEnumTypeBuff)cur );
			}
			else if( "a878".equals( subClassCode ) ) {
				schema.getTableInt16Col().deleteInt16Col( Authorization, (YCFBamInt16ColBuff)cur );
			}
			else if( "a828".equals( subClassCode ) ) {
				schema.getTableInt32Def().deleteInt32Def( Authorization, (YCFBamInt32DefBuff)cur );
			}
			else if( "a829".equals( subClassCode ) ) {
				schema.getTableInt32Type().deleteInt32Type( Authorization, (YCFBamInt32TypeBuff)cur );
			}
			else if( "a876".equals( subClassCode ) ) {
				schema.getTableId32Gen().deleteId32Gen( Authorization, (YCFBamId32GenBuff)cur );
			}
			else if( "a879".equals( subClassCode ) ) {
				schema.getTableInt32Col().deleteInt32Col( Authorization, (YCFBamInt32ColBuff)cur );
			}
			else if( "a82a".equals( subClassCode ) ) {
				schema.getTableInt64Def().deleteInt64Def( Authorization, (YCFBamInt64DefBuff)cur );
			}
			else if( "a82b".equals( subClassCode ) ) {
				schema.getTableInt64Type().deleteInt64Type( Authorization, (YCFBamInt64TypeBuff)cur );
			}
			else if( "a877".equals( subClassCode ) ) {
				schema.getTableId64Gen().deleteId64Gen( Authorization, (YCFBamId64GenBuff)cur );
			}
			else if( "a87a".equals( subClassCode ) ) {
				schema.getTableInt64Col().deleteInt64Col( Authorization, (YCFBamInt64ColBuff)cur );
			}
			else if( "a82c".equals( subClassCode ) ) {
				schema.getTableNmTokenDef().deleteNmTokenDef( Authorization, (YCFBamNmTokenDefBuff)cur );
			}
			else if( "a82d".equals( subClassCode ) ) {
				schema.getTableNmTokenType().deleteNmTokenType( Authorization, (YCFBamNmTokenTypeBuff)cur );
			}
			else if( "a87b".equals( subClassCode ) ) {
				schema.getTableNmTokenCol().deleteNmTokenCol( Authorization, (YCFBamNmTokenColBuff)cur );
			}
			else if( "a82e".equals( subClassCode ) ) {
				schema.getTableNmTokensDef().deleteNmTokensDef( Authorization, (YCFBamNmTokensDefBuff)cur );
			}
			else if( "a82f".equals( subClassCode ) ) {
				schema.getTableNmTokensType().deleteNmTokensType( Authorization, (YCFBamNmTokensTypeBuff)cur );
			}
			else if( "a87c".equals( subClassCode ) ) {
				schema.getTableNmTokensCol().deleteNmTokensCol( Authorization, (YCFBamNmTokensColBuff)cur );
			}
			else if( "a830".equals( subClassCode ) ) {
				schema.getTableNumberDef().deleteNumberDef( Authorization, (YCFBamNumberDefBuff)cur );
			}
			else if( "a831".equals( subClassCode ) ) {
				schema.getTableNumberType().deleteNumberType( Authorization, (YCFBamNumberTypeBuff)cur );
			}
			else if( "a87d".equals( subClassCode ) ) {
				schema.getTableNumberCol().deleteNumberCol( Authorization, (YCFBamNumberColBuff)cur );
			}
			else if( "a83b".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Def().deleteDbKeyHash128Def( Authorization, (YCFBamDbKeyHash128DefBuff)cur );
			}
			else if( "a83c".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Col().deleteDbKeyHash128Col( Authorization, (YCFBamDbKeyHash128ColBuff)cur );
			}
			else if( "a83d".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Type().deleteDbKeyHash128Type( Authorization, (YCFBamDbKeyHash128TypeBuff)cur );
			}
			else if( "a83e".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Gen().deleteDbKeyHash128Gen( Authorization, (YCFBamDbKeyHash128GenBuff)cur );
			}
			else if( "a83f".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Def().deleteDbKeyHash160Def( Authorization, (YCFBamDbKeyHash160DefBuff)cur );
			}
			else if( "a840".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Col().deleteDbKeyHash160Col( Authorization, (YCFBamDbKeyHash160ColBuff)cur );
			}
			else if( "a841".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Type().deleteDbKeyHash160Type( Authorization, (YCFBamDbKeyHash160TypeBuff)cur );
			}
			else if( "a842".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Gen().deleteDbKeyHash160Gen( Authorization, (YCFBamDbKeyHash160GenBuff)cur );
			}
			else if( "a843".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Def().deleteDbKeyHash224Def( Authorization, (YCFBamDbKeyHash224DefBuff)cur );
			}
			else if( "a844".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Col().deleteDbKeyHash224Col( Authorization, (YCFBamDbKeyHash224ColBuff)cur );
			}
			else if( "a845".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Type().deleteDbKeyHash224Type( Authorization, (YCFBamDbKeyHash224TypeBuff)cur );
			}
			else if( "a846".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Gen().deleteDbKeyHash224Gen( Authorization, (YCFBamDbKeyHash224GenBuff)cur );
			}
			else if( "a847".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Def().deleteDbKeyHash256Def( Authorization, (YCFBamDbKeyHash256DefBuff)cur );
			}
			else if( "a848".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Col().deleteDbKeyHash256Col( Authorization, (YCFBamDbKeyHash256ColBuff)cur );
			}
			else if( "a849".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Type().deleteDbKeyHash256Type( Authorization, (YCFBamDbKeyHash256TypeBuff)cur );
			}
			else if( "a84a".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Gen().deleteDbKeyHash256Gen( Authorization, (YCFBamDbKeyHash256GenBuff)cur );
			}
			else if( "a84b".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Def().deleteDbKeyHash384Def( Authorization, (YCFBamDbKeyHash384DefBuff)cur );
			}
			else if( "a84c".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Col().deleteDbKeyHash384Col( Authorization, (YCFBamDbKeyHash384ColBuff)cur );
			}
			else if( "a84d".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Type().deleteDbKeyHash384Type( Authorization, (YCFBamDbKeyHash384TypeBuff)cur );
			}
			else if( "a84e".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Gen().deleteDbKeyHash384Gen( Authorization, (YCFBamDbKeyHash384GenBuff)cur );
			}
			else if( "a84f".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Def().deleteDbKeyHash512Def( Authorization, (YCFBamDbKeyHash512DefBuff)cur );
			}
			else if( "a850".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Col().deleteDbKeyHash512Col( Authorization, (YCFBamDbKeyHash512ColBuff)cur );
			}
			else if( "a851".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Type().deleteDbKeyHash512Type( Authorization, (YCFBamDbKeyHash512TypeBuff)cur );
			}
			else if( "a852".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Gen().deleteDbKeyHash512Gen( Authorization, (YCFBamDbKeyHash512GenBuff)cur );
			}
			else if( "a853".equals( subClassCode ) ) {
				schema.getTableStringDef().deleteStringDef( Authorization, (YCFBamStringDefBuff)cur );
			}
			else if( "a854".equals( subClassCode ) ) {
				schema.getTableStringType().deleteStringType( Authorization, (YCFBamStringTypeBuff)cur );
			}
			else if( "a87e".equals( subClassCode ) ) {
				schema.getTableStringCol().deleteStringCol( Authorization, (YCFBamStringColBuff)cur );
			}
			else if( "a855".equals( subClassCode ) ) {
				schema.getTableTZDateDef().deleteTZDateDef( Authorization, (YCFBamTZDateDefBuff)cur );
			}
			else if( "a856".equals( subClassCode ) ) {
				schema.getTableTZDateType().deleteTZDateType( Authorization, (YCFBamTZDateTypeBuff)cur );
			}
			else if( "a87f".equals( subClassCode ) ) {
				schema.getTableTZDateCol().deleteTZDateCol( Authorization, (YCFBamTZDateColBuff)cur );
			}
			else if( "a857".equals( subClassCode ) ) {
				schema.getTableTZTimeDef().deleteTZTimeDef( Authorization, (YCFBamTZTimeDefBuff)cur );
			}
			else if( "a858".equals( subClassCode ) ) {
				schema.getTableTZTimeType().deleteTZTimeType( Authorization, (YCFBamTZTimeTypeBuff)cur );
			}
			else if( "a880".equals( subClassCode ) ) {
				schema.getTableTZTimeCol().deleteTZTimeCol( Authorization, (YCFBamTZTimeColBuff)cur );
			}
			else if( "a859".equals( subClassCode ) ) {
				schema.getTableTZTimestampDef().deleteTZTimestampDef( Authorization, (YCFBamTZTimestampDefBuff)cur );
			}
			else if( "a85a".equals( subClassCode ) ) {
				schema.getTableTZTimestampType().deleteTZTimestampType( Authorization, (YCFBamTZTimestampTypeBuff)cur );
			}
			else if( "a881".equals( subClassCode ) ) {
				schema.getTableTZTimestampCol().deleteTZTimestampCol( Authorization, (YCFBamTZTimestampColBuff)cur );
			}
			else if( "a85c".equals( subClassCode ) ) {
				schema.getTableTextDef().deleteTextDef( Authorization, (YCFBamTextDefBuff)cur );
			}
			else if( "a85d".equals( subClassCode ) ) {
				schema.getTableTextType().deleteTextType( Authorization, (YCFBamTextTypeBuff)cur );
			}
			else if( "a882".equals( subClassCode ) ) {
				schema.getTableTextCol().deleteTextCol( Authorization, (YCFBamTextColBuff)cur );
			}
			else if( "a85e".equals( subClassCode ) ) {
				schema.getTableTimeDef().deleteTimeDef( Authorization, (YCFBamTimeDefBuff)cur );
			}
			else if( "a85f".equals( subClassCode ) ) {
				schema.getTableTimeType().deleteTimeType( Authorization, (YCFBamTimeTypeBuff)cur );
			}
			else if( "a883".equals( subClassCode ) ) {
				schema.getTableTimeCol().deleteTimeCol( Authorization, (YCFBamTimeColBuff)cur );
			}
			else if( "a860".equals( subClassCode ) ) {
				schema.getTableTimestampDef().deleteTimestampDef( Authorization, (YCFBamTimestampDefBuff)cur );
			}
			else if( "a861".equals( subClassCode ) ) {
				schema.getTableTimestampType().deleteTimestampType( Authorization, (YCFBamTimestampTypeBuff)cur );
			}
			else if( "a884".equals( subClassCode ) ) {
				schema.getTableTimestampCol().deleteTimestampCol( Authorization, (YCFBamTimestampColBuff)cur );
			}
			else if( "a862".equals( subClassCode ) ) {
				schema.getTableTokenDef().deleteTokenDef( Authorization, (YCFBamTokenDefBuff)cur );
			}
			else if( "a863".equals( subClassCode ) ) {
				schema.getTableTokenType().deleteTokenType( Authorization, (YCFBamTokenTypeBuff)cur );
			}
			else if( "a885".equals( subClassCode ) ) {
				schema.getTableTokenCol().deleteTokenCol( Authorization, (YCFBamTokenColBuff)cur );
			}
			else if( "a864".equals( subClassCode ) ) {
				schema.getTableUInt16Def().deleteUInt16Def( Authorization, (YCFBamUInt16DefBuff)cur );
			}
			else if( "a865".equals( subClassCode ) ) {
				schema.getTableUInt16Type().deleteUInt16Type( Authorization, (YCFBamUInt16TypeBuff)cur );
			}
			else if( "a886".equals( subClassCode ) ) {
				schema.getTableUInt16Col().deleteUInt16Col( Authorization, (YCFBamUInt16ColBuff)cur );
			}
			else if( "a866".equals( subClassCode ) ) {
				schema.getTableUInt32Def().deleteUInt32Def( Authorization, (YCFBamUInt32DefBuff)cur );
			}
			else if( "a867".equals( subClassCode ) ) {
				schema.getTableUInt32Type().deleteUInt32Type( Authorization, (YCFBamUInt32TypeBuff)cur );
			}
			else if( "a887".equals( subClassCode ) ) {
				schema.getTableUInt32Col().deleteUInt32Col( Authorization, (YCFBamUInt32ColBuff)cur );
			}
			else if( "a868".equals( subClassCode ) ) {
				schema.getTableUInt64Def().deleteUInt64Def( Authorization, (YCFBamUInt64DefBuff)cur );
			}
			else if( "a869".equals( subClassCode ) ) {
				schema.getTableUInt64Type().deleteUInt64Type( Authorization, (YCFBamUInt64TypeBuff)cur );
			}
			else if( "a888".equals( subClassCode ) ) {
				schema.getTableUInt64Col().deleteUInt64Col( Authorization, (YCFBamUInt64ColBuff)cur );
			}
			else if( "a86a".equals( subClassCode ) ) {
				schema.getTableUuidDef().deleteUuidDef( Authorization, (YCFBamUuidDefBuff)cur );
			}
			else if( "a86c".equals( subClassCode ) ) {
				schema.getTableUuidType().deleteUuidType( Authorization, (YCFBamUuidTypeBuff)cur );
			}
			else if( "a88b".equals( subClassCode ) ) {
				schema.getTableUuidGen().deleteUuidGen( Authorization, (YCFBamUuidGenBuff)cur );
			}
			else if( "a889".equals( subClassCode ) ) {
				schema.getTableUuidCol().deleteUuidCol( Authorization, (YCFBamUuidColBuff)cur );
			}
			else if( "a86b".equals( subClassCode ) ) {
				schema.getTableUuid6Def().deleteUuid6Def( Authorization, (YCFBamUuid6DefBuff)cur );
			}
			else if( "a86d".equals( subClassCode ) ) {
				schema.getTableUuid6Type().deleteUuid6Type( Authorization, (YCFBamUuid6TypeBuff)cur );
			}
			else if( "a88c".equals( subClassCode ) ) {
				schema.getTableUuid6Gen().deleteUuid6Gen( Authorization, (YCFBamUuid6GenBuff)cur );
			}
			else if( "a88a".equals( subClassCode ) ) {
				schema.getTableUuid6Col().deleteUuid6Col( Authorization, (YCFBamUuid6ColBuff)cur );
			}
			else if( "a85b".equals( subClassCode ) ) {
				schema.getTableTableCol().deleteTableCol( Authorization, (YCFBamTableColBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of Value must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteValueByContPrevIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		Long argPrevId )
	{
		YCFBamValueByContPrevIdxKey key = schema.getFactoryValue().newContPrevIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredScopeId( argScopeId );
		key.setOptionalPrevId( argPrevId );
		deleteValueByContPrevIdx( Authorization, key );
	}

	public void deleteValueByContPrevIdx( YCFSecAuthorization Authorization,
		YCFBamValueByContPrevIdxKey argKey )
	{
		final String S_ProcName = "deleteValueByContPrevIdx";
		YCFBamValueBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( argKey.getOptionalPrevId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamValueBuff> matchSet = new LinkedList<YCFBamValueBuff>();
		Iterator<YCFBamValueBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamValueBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableValue().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a80c".equals( subClassCode ) ) {
				schema.getTableValue().deleteValue( Authorization, cur );
			}
			else if( "a80d".equals( subClassCode ) ) {
				schema.getTableAtom().deleteAtom( Authorization, (YCFBamAtomBuff)cur );
			}
			else if( "a80e".equals( subClassCode ) ) {
				schema.getTableBlobDef().deleteBlobDef( Authorization, (YCFBamBlobDefBuff)cur );
			}
			else if( "a80f".equals( subClassCode ) ) {
				schema.getTableBlobType().deleteBlobType( Authorization, (YCFBamBlobTypeBuff)cur );
			}
			else if( "a86e".equals( subClassCode ) ) {
				schema.getTableBlobCol().deleteBlobCol( Authorization, (YCFBamBlobColBuff)cur );
			}
			else if( "a810".equals( subClassCode ) ) {
				schema.getTableBoolDef().deleteBoolDef( Authorization, (YCFBamBoolDefBuff)cur );
			}
			else if( "a811".equals( subClassCode ) ) {
				schema.getTableBoolType().deleteBoolType( Authorization, (YCFBamBoolTypeBuff)cur );
			}
			else if( "a86f".equals( subClassCode ) ) {
				schema.getTableBoolCol().deleteBoolCol( Authorization, (YCFBamBoolColBuff)cur );
			}
			else if( "a818".equals( subClassCode ) ) {
				schema.getTableDateDef().deleteDateDef( Authorization, (YCFBamDateDefBuff)cur );
			}
			else if( "a819".equals( subClassCode ) ) {
				schema.getTableDateType().deleteDateType( Authorization, (YCFBamDateTypeBuff)cur );
			}
			else if( "a870".equals( subClassCode ) ) {
				schema.getTableDateCol().deleteDateCol( Authorization, (YCFBamDateColBuff)cur );
			}
			else if( "a81f".equals( subClassCode ) ) {
				schema.getTableDoubleDef().deleteDoubleDef( Authorization, (YCFBamDoubleDefBuff)cur );
			}
			else if( "a820".equals( subClassCode ) ) {
				schema.getTableDoubleType().deleteDoubleType( Authorization, (YCFBamDoubleTypeBuff)cur );
			}
			else if( "a871".equals( subClassCode ) ) {
				schema.getTableDoubleCol().deleteDoubleCol( Authorization, (YCFBamDoubleColBuff)cur );
			}
			else if( "a822".equals( subClassCode ) ) {
				schema.getTableFloatDef().deleteFloatDef( Authorization, (YCFBamFloatDefBuff)cur );
			}
			else if( "a823".equals( subClassCode ) ) {
				schema.getTableFloatType().deleteFloatType( Authorization, (YCFBamFloatTypeBuff)cur );
			}
			else if( "a874".equals( subClassCode ) ) {
				schema.getTableFloatCol().deleteFloatCol( Authorization, (YCFBamFloatColBuff)cur );
			}
			else if( "a826".equals( subClassCode ) ) {
				schema.getTableInt16Def().deleteInt16Def( Authorization, (YCFBamInt16DefBuff)cur );
			}
			else if( "a827".equals( subClassCode ) ) {
				schema.getTableInt16Type().deleteInt16Type( Authorization, (YCFBamInt16TypeBuff)cur );
			}
			else if( "a875".equals( subClassCode ) ) {
				schema.getTableId16Gen().deleteId16Gen( Authorization, (YCFBamId16GenBuff)cur );
			}
			else if( "a872".equals( subClassCode ) ) {
				schema.getTableEnumDef().deleteEnumDef( Authorization, (YCFBamEnumDefBuff)cur );
			}
			else if( "a873".equals( subClassCode ) ) {
				schema.getTableEnumType().deleteEnumType( Authorization, (YCFBamEnumTypeBuff)cur );
			}
			else if( "a878".equals( subClassCode ) ) {
				schema.getTableInt16Col().deleteInt16Col( Authorization, (YCFBamInt16ColBuff)cur );
			}
			else if( "a828".equals( subClassCode ) ) {
				schema.getTableInt32Def().deleteInt32Def( Authorization, (YCFBamInt32DefBuff)cur );
			}
			else if( "a829".equals( subClassCode ) ) {
				schema.getTableInt32Type().deleteInt32Type( Authorization, (YCFBamInt32TypeBuff)cur );
			}
			else if( "a876".equals( subClassCode ) ) {
				schema.getTableId32Gen().deleteId32Gen( Authorization, (YCFBamId32GenBuff)cur );
			}
			else if( "a879".equals( subClassCode ) ) {
				schema.getTableInt32Col().deleteInt32Col( Authorization, (YCFBamInt32ColBuff)cur );
			}
			else if( "a82a".equals( subClassCode ) ) {
				schema.getTableInt64Def().deleteInt64Def( Authorization, (YCFBamInt64DefBuff)cur );
			}
			else if( "a82b".equals( subClassCode ) ) {
				schema.getTableInt64Type().deleteInt64Type( Authorization, (YCFBamInt64TypeBuff)cur );
			}
			else if( "a877".equals( subClassCode ) ) {
				schema.getTableId64Gen().deleteId64Gen( Authorization, (YCFBamId64GenBuff)cur );
			}
			else if( "a87a".equals( subClassCode ) ) {
				schema.getTableInt64Col().deleteInt64Col( Authorization, (YCFBamInt64ColBuff)cur );
			}
			else if( "a82c".equals( subClassCode ) ) {
				schema.getTableNmTokenDef().deleteNmTokenDef( Authorization, (YCFBamNmTokenDefBuff)cur );
			}
			else if( "a82d".equals( subClassCode ) ) {
				schema.getTableNmTokenType().deleteNmTokenType( Authorization, (YCFBamNmTokenTypeBuff)cur );
			}
			else if( "a87b".equals( subClassCode ) ) {
				schema.getTableNmTokenCol().deleteNmTokenCol( Authorization, (YCFBamNmTokenColBuff)cur );
			}
			else if( "a82e".equals( subClassCode ) ) {
				schema.getTableNmTokensDef().deleteNmTokensDef( Authorization, (YCFBamNmTokensDefBuff)cur );
			}
			else if( "a82f".equals( subClassCode ) ) {
				schema.getTableNmTokensType().deleteNmTokensType( Authorization, (YCFBamNmTokensTypeBuff)cur );
			}
			else if( "a87c".equals( subClassCode ) ) {
				schema.getTableNmTokensCol().deleteNmTokensCol( Authorization, (YCFBamNmTokensColBuff)cur );
			}
			else if( "a830".equals( subClassCode ) ) {
				schema.getTableNumberDef().deleteNumberDef( Authorization, (YCFBamNumberDefBuff)cur );
			}
			else if( "a831".equals( subClassCode ) ) {
				schema.getTableNumberType().deleteNumberType( Authorization, (YCFBamNumberTypeBuff)cur );
			}
			else if( "a87d".equals( subClassCode ) ) {
				schema.getTableNumberCol().deleteNumberCol( Authorization, (YCFBamNumberColBuff)cur );
			}
			else if( "a83b".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Def().deleteDbKeyHash128Def( Authorization, (YCFBamDbKeyHash128DefBuff)cur );
			}
			else if( "a83c".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Col().deleteDbKeyHash128Col( Authorization, (YCFBamDbKeyHash128ColBuff)cur );
			}
			else if( "a83d".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Type().deleteDbKeyHash128Type( Authorization, (YCFBamDbKeyHash128TypeBuff)cur );
			}
			else if( "a83e".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Gen().deleteDbKeyHash128Gen( Authorization, (YCFBamDbKeyHash128GenBuff)cur );
			}
			else if( "a83f".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Def().deleteDbKeyHash160Def( Authorization, (YCFBamDbKeyHash160DefBuff)cur );
			}
			else if( "a840".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Col().deleteDbKeyHash160Col( Authorization, (YCFBamDbKeyHash160ColBuff)cur );
			}
			else if( "a841".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Type().deleteDbKeyHash160Type( Authorization, (YCFBamDbKeyHash160TypeBuff)cur );
			}
			else if( "a842".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Gen().deleteDbKeyHash160Gen( Authorization, (YCFBamDbKeyHash160GenBuff)cur );
			}
			else if( "a843".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Def().deleteDbKeyHash224Def( Authorization, (YCFBamDbKeyHash224DefBuff)cur );
			}
			else if( "a844".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Col().deleteDbKeyHash224Col( Authorization, (YCFBamDbKeyHash224ColBuff)cur );
			}
			else if( "a845".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Type().deleteDbKeyHash224Type( Authorization, (YCFBamDbKeyHash224TypeBuff)cur );
			}
			else if( "a846".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Gen().deleteDbKeyHash224Gen( Authorization, (YCFBamDbKeyHash224GenBuff)cur );
			}
			else if( "a847".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Def().deleteDbKeyHash256Def( Authorization, (YCFBamDbKeyHash256DefBuff)cur );
			}
			else if( "a848".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Col().deleteDbKeyHash256Col( Authorization, (YCFBamDbKeyHash256ColBuff)cur );
			}
			else if( "a849".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Type().deleteDbKeyHash256Type( Authorization, (YCFBamDbKeyHash256TypeBuff)cur );
			}
			else if( "a84a".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Gen().deleteDbKeyHash256Gen( Authorization, (YCFBamDbKeyHash256GenBuff)cur );
			}
			else if( "a84b".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Def().deleteDbKeyHash384Def( Authorization, (YCFBamDbKeyHash384DefBuff)cur );
			}
			else if( "a84c".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Col().deleteDbKeyHash384Col( Authorization, (YCFBamDbKeyHash384ColBuff)cur );
			}
			else if( "a84d".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Type().deleteDbKeyHash384Type( Authorization, (YCFBamDbKeyHash384TypeBuff)cur );
			}
			else if( "a84e".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Gen().deleteDbKeyHash384Gen( Authorization, (YCFBamDbKeyHash384GenBuff)cur );
			}
			else if( "a84f".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Def().deleteDbKeyHash512Def( Authorization, (YCFBamDbKeyHash512DefBuff)cur );
			}
			else if( "a850".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Col().deleteDbKeyHash512Col( Authorization, (YCFBamDbKeyHash512ColBuff)cur );
			}
			else if( "a851".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Type().deleteDbKeyHash512Type( Authorization, (YCFBamDbKeyHash512TypeBuff)cur );
			}
			else if( "a852".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Gen().deleteDbKeyHash512Gen( Authorization, (YCFBamDbKeyHash512GenBuff)cur );
			}
			else if( "a853".equals( subClassCode ) ) {
				schema.getTableStringDef().deleteStringDef( Authorization, (YCFBamStringDefBuff)cur );
			}
			else if( "a854".equals( subClassCode ) ) {
				schema.getTableStringType().deleteStringType( Authorization, (YCFBamStringTypeBuff)cur );
			}
			else if( "a87e".equals( subClassCode ) ) {
				schema.getTableStringCol().deleteStringCol( Authorization, (YCFBamStringColBuff)cur );
			}
			else if( "a855".equals( subClassCode ) ) {
				schema.getTableTZDateDef().deleteTZDateDef( Authorization, (YCFBamTZDateDefBuff)cur );
			}
			else if( "a856".equals( subClassCode ) ) {
				schema.getTableTZDateType().deleteTZDateType( Authorization, (YCFBamTZDateTypeBuff)cur );
			}
			else if( "a87f".equals( subClassCode ) ) {
				schema.getTableTZDateCol().deleteTZDateCol( Authorization, (YCFBamTZDateColBuff)cur );
			}
			else if( "a857".equals( subClassCode ) ) {
				schema.getTableTZTimeDef().deleteTZTimeDef( Authorization, (YCFBamTZTimeDefBuff)cur );
			}
			else if( "a858".equals( subClassCode ) ) {
				schema.getTableTZTimeType().deleteTZTimeType( Authorization, (YCFBamTZTimeTypeBuff)cur );
			}
			else if( "a880".equals( subClassCode ) ) {
				schema.getTableTZTimeCol().deleteTZTimeCol( Authorization, (YCFBamTZTimeColBuff)cur );
			}
			else if( "a859".equals( subClassCode ) ) {
				schema.getTableTZTimestampDef().deleteTZTimestampDef( Authorization, (YCFBamTZTimestampDefBuff)cur );
			}
			else if( "a85a".equals( subClassCode ) ) {
				schema.getTableTZTimestampType().deleteTZTimestampType( Authorization, (YCFBamTZTimestampTypeBuff)cur );
			}
			else if( "a881".equals( subClassCode ) ) {
				schema.getTableTZTimestampCol().deleteTZTimestampCol( Authorization, (YCFBamTZTimestampColBuff)cur );
			}
			else if( "a85c".equals( subClassCode ) ) {
				schema.getTableTextDef().deleteTextDef( Authorization, (YCFBamTextDefBuff)cur );
			}
			else if( "a85d".equals( subClassCode ) ) {
				schema.getTableTextType().deleteTextType( Authorization, (YCFBamTextTypeBuff)cur );
			}
			else if( "a882".equals( subClassCode ) ) {
				schema.getTableTextCol().deleteTextCol( Authorization, (YCFBamTextColBuff)cur );
			}
			else if( "a85e".equals( subClassCode ) ) {
				schema.getTableTimeDef().deleteTimeDef( Authorization, (YCFBamTimeDefBuff)cur );
			}
			else if( "a85f".equals( subClassCode ) ) {
				schema.getTableTimeType().deleteTimeType( Authorization, (YCFBamTimeTypeBuff)cur );
			}
			else if( "a883".equals( subClassCode ) ) {
				schema.getTableTimeCol().deleteTimeCol( Authorization, (YCFBamTimeColBuff)cur );
			}
			else if( "a860".equals( subClassCode ) ) {
				schema.getTableTimestampDef().deleteTimestampDef( Authorization, (YCFBamTimestampDefBuff)cur );
			}
			else if( "a861".equals( subClassCode ) ) {
				schema.getTableTimestampType().deleteTimestampType( Authorization, (YCFBamTimestampTypeBuff)cur );
			}
			else if( "a884".equals( subClassCode ) ) {
				schema.getTableTimestampCol().deleteTimestampCol( Authorization, (YCFBamTimestampColBuff)cur );
			}
			else if( "a862".equals( subClassCode ) ) {
				schema.getTableTokenDef().deleteTokenDef( Authorization, (YCFBamTokenDefBuff)cur );
			}
			else if( "a863".equals( subClassCode ) ) {
				schema.getTableTokenType().deleteTokenType( Authorization, (YCFBamTokenTypeBuff)cur );
			}
			else if( "a885".equals( subClassCode ) ) {
				schema.getTableTokenCol().deleteTokenCol( Authorization, (YCFBamTokenColBuff)cur );
			}
			else if( "a864".equals( subClassCode ) ) {
				schema.getTableUInt16Def().deleteUInt16Def( Authorization, (YCFBamUInt16DefBuff)cur );
			}
			else if( "a865".equals( subClassCode ) ) {
				schema.getTableUInt16Type().deleteUInt16Type( Authorization, (YCFBamUInt16TypeBuff)cur );
			}
			else if( "a886".equals( subClassCode ) ) {
				schema.getTableUInt16Col().deleteUInt16Col( Authorization, (YCFBamUInt16ColBuff)cur );
			}
			else if( "a866".equals( subClassCode ) ) {
				schema.getTableUInt32Def().deleteUInt32Def( Authorization, (YCFBamUInt32DefBuff)cur );
			}
			else if( "a867".equals( subClassCode ) ) {
				schema.getTableUInt32Type().deleteUInt32Type( Authorization, (YCFBamUInt32TypeBuff)cur );
			}
			else if( "a887".equals( subClassCode ) ) {
				schema.getTableUInt32Col().deleteUInt32Col( Authorization, (YCFBamUInt32ColBuff)cur );
			}
			else if( "a868".equals( subClassCode ) ) {
				schema.getTableUInt64Def().deleteUInt64Def( Authorization, (YCFBamUInt64DefBuff)cur );
			}
			else if( "a869".equals( subClassCode ) ) {
				schema.getTableUInt64Type().deleteUInt64Type( Authorization, (YCFBamUInt64TypeBuff)cur );
			}
			else if( "a888".equals( subClassCode ) ) {
				schema.getTableUInt64Col().deleteUInt64Col( Authorization, (YCFBamUInt64ColBuff)cur );
			}
			else if( "a86a".equals( subClassCode ) ) {
				schema.getTableUuidDef().deleteUuidDef( Authorization, (YCFBamUuidDefBuff)cur );
			}
			else if( "a86c".equals( subClassCode ) ) {
				schema.getTableUuidType().deleteUuidType( Authorization, (YCFBamUuidTypeBuff)cur );
			}
			else if( "a88b".equals( subClassCode ) ) {
				schema.getTableUuidGen().deleteUuidGen( Authorization, (YCFBamUuidGenBuff)cur );
			}
			else if( "a889".equals( subClassCode ) ) {
				schema.getTableUuidCol().deleteUuidCol( Authorization, (YCFBamUuidColBuff)cur );
			}
			else if( "a86b".equals( subClassCode ) ) {
				schema.getTableUuid6Def().deleteUuid6Def( Authorization, (YCFBamUuid6DefBuff)cur );
			}
			else if( "a86d".equals( subClassCode ) ) {
				schema.getTableUuid6Type().deleteUuid6Type( Authorization, (YCFBamUuid6TypeBuff)cur );
			}
			else if( "a88c".equals( subClassCode ) ) {
				schema.getTableUuid6Gen().deleteUuid6Gen( Authorization, (YCFBamUuid6GenBuff)cur );
			}
			else if( "a88a".equals( subClassCode ) ) {
				schema.getTableUuid6Col().deleteUuid6Col( Authorization, (YCFBamUuid6ColBuff)cur );
			}
			else if( "a85b".equals( subClassCode ) ) {
				schema.getTableTableCol().deleteTableCol( Authorization, (YCFBamTableColBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of Value must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteValueByContNextIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		Long argNextId )
	{
		YCFBamValueByContNextIdxKey key = schema.getFactoryValue().newContNextIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredScopeId( argScopeId );
		key.setOptionalNextId( argNextId );
		deleteValueByContNextIdx( Authorization, key );
	}

	public void deleteValueByContNextIdx( YCFSecAuthorization Authorization,
		YCFBamValueByContNextIdxKey argKey )
	{
		final String S_ProcName = "deleteValueByContNextIdx";
		YCFBamValueBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( argKey.getOptionalNextId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamValueBuff> matchSet = new LinkedList<YCFBamValueBuff>();
		Iterator<YCFBamValueBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamValueBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableValue().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a80c".equals( subClassCode ) ) {
				schema.getTableValue().deleteValue( Authorization, cur );
			}
			else if( "a80d".equals( subClassCode ) ) {
				schema.getTableAtom().deleteAtom( Authorization, (YCFBamAtomBuff)cur );
			}
			else if( "a80e".equals( subClassCode ) ) {
				schema.getTableBlobDef().deleteBlobDef( Authorization, (YCFBamBlobDefBuff)cur );
			}
			else if( "a80f".equals( subClassCode ) ) {
				schema.getTableBlobType().deleteBlobType( Authorization, (YCFBamBlobTypeBuff)cur );
			}
			else if( "a86e".equals( subClassCode ) ) {
				schema.getTableBlobCol().deleteBlobCol( Authorization, (YCFBamBlobColBuff)cur );
			}
			else if( "a810".equals( subClassCode ) ) {
				schema.getTableBoolDef().deleteBoolDef( Authorization, (YCFBamBoolDefBuff)cur );
			}
			else if( "a811".equals( subClassCode ) ) {
				schema.getTableBoolType().deleteBoolType( Authorization, (YCFBamBoolTypeBuff)cur );
			}
			else if( "a86f".equals( subClassCode ) ) {
				schema.getTableBoolCol().deleteBoolCol( Authorization, (YCFBamBoolColBuff)cur );
			}
			else if( "a818".equals( subClassCode ) ) {
				schema.getTableDateDef().deleteDateDef( Authorization, (YCFBamDateDefBuff)cur );
			}
			else if( "a819".equals( subClassCode ) ) {
				schema.getTableDateType().deleteDateType( Authorization, (YCFBamDateTypeBuff)cur );
			}
			else if( "a870".equals( subClassCode ) ) {
				schema.getTableDateCol().deleteDateCol( Authorization, (YCFBamDateColBuff)cur );
			}
			else if( "a81f".equals( subClassCode ) ) {
				schema.getTableDoubleDef().deleteDoubleDef( Authorization, (YCFBamDoubleDefBuff)cur );
			}
			else if( "a820".equals( subClassCode ) ) {
				schema.getTableDoubleType().deleteDoubleType( Authorization, (YCFBamDoubleTypeBuff)cur );
			}
			else if( "a871".equals( subClassCode ) ) {
				schema.getTableDoubleCol().deleteDoubleCol( Authorization, (YCFBamDoubleColBuff)cur );
			}
			else if( "a822".equals( subClassCode ) ) {
				schema.getTableFloatDef().deleteFloatDef( Authorization, (YCFBamFloatDefBuff)cur );
			}
			else if( "a823".equals( subClassCode ) ) {
				schema.getTableFloatType().deleteFloatType( Authorization, (YCFBamFloatTypeBuff)cur );
			}
			else if( "a874".equals( subClassCode ) ) {
				schema.getTableFloatCol().deleteFloatCol( Authorization, (YCFBamFloatColBuff)cur );
			}
			else if( "a826".equals( subClassCode ) ) {
				schema.getTableInt16Def().deleteInt16Def( Authorization, (YCFBamInt16DefBuff)cur );
			}
			else if( "a827".equals( subClassCode ) ) {
				schema.getTableInt16Type().deleteInt16Type( Authorization, (YCFBamInt16TypeBuff)cur );
			}
			else if( "a875".equals( subClassCode ) ) {
				schema.getTableId16Gen().deleteId16Gen( Authorization, (YCFBamId16GenBuff)cur );
			}
			else if( "a872".equals( subClassCode ) ) {
				schema.getTableEnumDef().deleteEnumDef( Authorization, (YCFBamEnumDefBuff)cur );
			}
			else if( "a873".equals( subClassCode ) ) {
				schema.getTableEnumType().deleteEnumType( Authorization, (YCFBamEnumTypeBuff)cur );
			}
			else if( "a878".equals( subClassCode ) ) {
				schema.getTableInt16Col().deleteInt16Col( Authorization, (YCFBamInt16ColBuff)cur );
			}
			else if( "a828".equals( subClassCode ) ) {
				schema.getTableInt32Def().deleteInt32Def( Authorization, (YCFBamInt32DefBuff)cur );
			}
			else if( "a829".equals( subClassCode ) ) {
				schema.getTableInt32Type().deleteInt32Type( Authorization, (YCFBamInt32TypeBuff)cur );
			}
			else if( "a876".equals( subClassCode ) ) {
				schema.getTableId32Gen().deleteId32Gen( Authorization, (YCFBamId32GenBuff)cur );
			}
			else if( "a879".equals( subClassCode ) ) {
				schema.getTableInt32Col().deleteInt32Col( Authorization, (YCFBamInt32ColBuff)cur );
			}
			else if( "a82a".equals( subClassCode ) ) {
				schema.getTableInt64Def().deleteInt64Def( Authorization, (YCFBamInt64DefBuff)cur );
			}
			else if( "a82b".equals( subClassCode ) ) {
				schema.getTableInt64Type().deleteInt64Type( Authorization, (YCFBamInt64TypeBuff)cur );
			}
			else if( "a877".equals( subClassCode ) ) {
				schema.getTableId64Gen().deleteId64Gen( Authorization, (YCFBamId64GenBuff)cur );
			}
			else if( "a87a".equals( subClassCode ) ) {
				schema.getTableInt64Col().deleteInt64Col( Authorization, (YCFBamInt64ColBuff)cur );
			}
			else if( "a82c".equals( subClassCode ) ) {
				schema.getTableNmTokenDef().deleteNmTokenDef( Authorization, (YCFBamNmTokenDefBuff)cur );
			}
			else if( "a82d".equals( subClassCode ) ) {
				schema.getTableNmTokenType().deleteNmTokenType( Authorization, (YCFBamNmTokenTypeBuff)cur );
			}
			else if( "a87b".equals( subClassCode ) ) {
				schema.getTableNmTokenCol().deleteNmTokenCol( Authorization, (YCFBamNmTokenColBuff)cur );
			}
			else if( "a82e".equals( subClassCode ) ) {
				schema.getTableNmTokensDef().deleteNmTokensDef( Authorization, (YCFBamNmTokensDefBuff)cur );
			}
			else if( "a82f".equals( subClassCode ) ) {
				schema.getTableNmTokensType().deleteNmTokensType( Authorization, (YCFBamNmTokensTypeBuff)cur );
			}
			else if( "a87c".equals( subClassCode ) ) {
				schema.getTableNmTokensCol().deleteNmTokensCol( Authorization, (YCFBamNmTokensColBuff)cur );
			}
			else if( "a830".equals( subClassCode ) ) {
				schema.getTableNumberDef().deleteNumberDef( Authorization, (YCFBamNumberDefBuff)cur );
			}
			else if( "a831".equals( subClassCode ) ) {
				schema.getTableNumberType().deleteNumberType( Authorization, (YCFBamNumberTypeBuff)cur );
			}
			else if( "a87d".equals( subClassCode ) ) {
				schema.getTableNumberCol().deleteNumberCol( Authorization, (YCFBamNumberColBuff)cur );
			}
			else if( "a83b".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Def().deleteDbKeyHash128Def( Authorization, (YCFBamDbKeyHash128DefBuff)cur );
			}
			else if( "a83c".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Col().deleteDbKeyHash128Col( Authorization, (YCFBamDbKeyHash128ColBuff)cur );
			}
			else if( "a83d".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Type().deleteDbKeyHash128Type( Authorization, (YCFBamDbKeyHash128TypeBuff)cur );
			}
			else if( "a83e".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Gen().deleteDbKeyHash128Gen( Authorization, (YCFBamDbKeyHash128GenBuff)cur );
			}
			else if( "a83f".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Def().deleteDbKeyHash160Def( Authorization, (YCFBamDbKeyHash160DefBuff)cur );
			}
			else if( "a840".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Col().deleteDbKeyHash160Col( Authorization, (YCFBamDbKeyHash160ColBuff)cur );
			}
			else if( "a841".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Type().deleteDbKeyHash160Type( Authorization, (YCFBamDbKeyHash160TypeBuff)cur );
			}
			else if( "a842".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Gen().deleteDbKeyHash160Gen( Authorization, (YCFBamDbKeyHash160GenBuff)cur );
			}
			else if( "a843".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Def().deleteDbKeyHash224Def( Authorization, (YCFBamDbKeyHash224DefBuff)cur );
			}
			else if( "a844".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Col().deleteDbKeyHash224Col( Authorization, (YCFBamDbKeyHash224ColBuff)cur );
			}
			else if( "a845".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Type().deleteDbKeyHash224Type( Authorization, (YCFBamDbKeyHash224TypeBuff)cur );
			}
			else if( "a846".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Gen().deleteDbKeyHash224Gen( Authorization, (YCFBamDbKeyHash224GenBuff)cur );
			}
			else if( "a847".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Def().deleteDbKeyHash256Def( Authorization, (YCFBamDbKeyHash256DefBuff)cur );
			}
			else if( "a848".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Col().deleteDbKeyHash256Col( Authorization, (YCFBamDbKeyHash256ColBuff)cur );
			}
			else if( "a849".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Type().deleteDbKeyHash256Type( Authorization, (YCFBamDbKeyHash256TypeBuff)cur );
			}
			else if( "a84a".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Gen().deleteDbKeyHash256Gen( Authorization, (YCFBamDbKeyHash256GenBuff)cur );
			}
			else if( "a84b".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Def().deleteDbKeyHash384Def( Authorization, (YCFBamDbKeyHash384DefBuff)cur );
			}
			else if( "a84c".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Col().deleteDbKeyHash384Col( Authorization, (YCFBamDbKeyHash384ColBuff)cur );
			}
			else if( "a84d".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Type().deleteDbKeyHash384Type( Authorization, (YCFBamDbKeyHash384TypeBuff)cur );
			}
			else if( "a84e".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Gen().deleteDbKeyHash384Gen( Authorization, (YCFBamDbKeyHash384GenBuff)cur );
			}
			else if( "a84f".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Def().deleteDbKeyHash512Def( Authorization, (YCFBamDbKeyHash512DefBuff)cur );
			}
			else if( "a850".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Col().deleteDbKeyHash512Col( Authorization, (YCFBamDbKeyHash512ColBuff)cur );
			}
			else if( "a851".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Type().deleteDbKeyHash512Type( Authorization, (YCFBamDbKeyHash512TypeBuff)cur );
			}
			else if( "a852".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Gen().deleteDbKeyHash512Gen( Authorization, (YCFBamDbKeyHash512GenBuff)cur );
			}
			else if( "a853".equals( subClassCode ) ) {
				schema.getTableStringDef().deleteStringDef( Authorization, (YCFBamStringDefBuff)cur );
			}
			else if( "a854".equals( subClassCode ) ) {
				schema.getTableStringType().deleteStringType( Authorization, (YCFBamStringTypeBuff)cur );
			}
			else if( "a87e".equals( subClassCode ) ) {
				schema.getTableStringCol().deleteStringCol( Authorization, (YCFBamStringColBuff)cur );
			}
			else if( "a855".equals( subClassCode ) ) {
				schema.getTableTZDateDef().deleteTZDateDef( Authorization, (YCFBamTZDateDefBuff)cur );
			}
			else if( "a856".equals( subClassCode ) ) {
				schema.getTableTZDateType().deleteTZDateType( Authorization, (YCFBamTZDateTypeBuff)cur );
			}
			else if( "a87f".equals( subClassCode ) ) {
				schema.getTableTZDateCol().deleteTZDateCol( Authorization, (YCFBamTZDateColBuff)cur );
			}
			else if( "a857".equals( subClassCode ) ) {
				schema.getTableTZTimeDef().deleteTZTimeDef( Authorization, (YCFBamTZTimeDefBuff)cur );
			}
			else if( "a858".equals( subClassCode ) ) {
				schema.getTableTZTimeType().deleteTZTimeType( Authorization, (YCFBamTZTimeTypeBuff)cur );
			}
			else if( "a880".equals( subClassCode ) ) {
				schema.getTableTZTimeCol().deleteTZTimeCol( Authorization, (YCFBamTZTimeColBuff)cur );
			}
			else if( "a859".equals( subClassCode ) ) {
				schema.getTableTZTimestampDef().deleteTZTimestampDef( Authorization, (YCFBamTZTimestampDefBuff)cur );
			}
			else if( "a85a".equals( subClassCode ) ) {
				schema.getTableTZTimestampType().deleteTZTimestampType( Authorization, (YCFBamTZTimestampTypeBuff)cur );
			}
			else if( "a881".equals( subClassCode ) ) {
				schema.getTableTZTimestampCol().deleteTZTimestampCol( Authorization, (YCFBamTZTimestampColBuff)cur );
			}
			else if( "a85c".equals( subClassCode ) ) {
				schema.getTableTextDef().deleteTextDef( Authorization, (YCFBamTextDefBuff)cur );
			}
			else if( "a85d".equals( subClassCode ) ) {
				schema.getTableTextType().deleteTextType( Authorization, (YCFBamTextTypeBuff)cur );
			}
			else if( "a882".equals( subClassCode ) ) {
				schema.getTableTextCol().deleteTextCol( Authorization, (YCFBamTextColBuff)cur );
			}
			else if( "a85e".equals( subClassCode ) ) {
				schema.getTableTimeDef().deleteTimeDef( Authorization, (YCFBamTimeDefBuff)cur );
			}
			else if( "a85f".equals( subClassCode ) ) {
				schema.getTableTimeType().deleteTimeType( Authorization, (YCFBamTimeTypeBuff)cur );
			}
			else if( "a883".equals( subClassCode ) ) {
				schema.getTableTimeCol().deleteTimeCol( Authorization, (YCFBamTimeColBuff)cur );
			}
			else if( "a860".equals( subClassCode ) ) {
				schema.getTableTimestampDef().deleteTimestampDef( Authorization, (YCFBamTimestampDefBuff)cur );
			}
			else if( "a861".equals( subClassCode ) ) {
				schema.getTableTimestampType().deleteTimestampType( Authorization, (YCFBamTimestampTypeBuff)cur );
			}
			else if( "a884".equals( subClassCode ) ) {
				schema.getTableTimestampCol().deleteTimestampCol( Authorization, (YCFBamTimestampColBuff)cur );
			}
			else if( "a862".equals( subClassCode ) ) {
				schema.getTableTokenDef().deleteTokenDef( Authorization, (YCFBamTokenDefBuff)cur );
			}
			else if( "a863".equals( subClassCode ) ) {
				schema.getTableTokenType().deleteTokenType( Authorization, (YCFBamTokenTypeBuff)cur );
			}
			else if( "a885".equals( subClassCode ) ) {
				schema.getTableTokenCol().deleteTokenCol( Authorization, (YCFBamTokenColBuff)cur );
			}
			else if( "a864".equals( subClassCode ) ) {
				schema.getTableUInt16Def().deleteUInt16Def( Authorization, (YCFBamUInt16DefBuff)cur );
			}
			else if( "a865".equals( subClassCode ) ) {
				schema.getTableUInt16Type().deleteUInt16Type( Authorization, (YCFBamUInt16TypeBuff)cur );
			}
			else if( "a886".equals( subClassCode ) ) {
				schema.getTableUInt16Col().deleteUInt16Col( Authorization, (YCFBamUInt16ColBuff)cur );
			}
			else if( "a866".equals( subClassCode ) ) {
				schema.getTableUInt32Def().deleteUInt32Def( Authorization, (YCFBamUInt32DefBuff)cur );
			}
			else if( "a867".equals( subClassCode ) ) {
				schema.getTableUInt32Type().deleteUInt32Type( Authorization, (YCFBamUInt32TypeBuff)cur );
			}
			else if( "a887".equals( subClassCode ) ) {
				schema.getTableUInt32Col().deleteUInt32Col( Authorization, (YCFBamUInt32ColBuff)cur );
			}
			else if( "a868".equals( subClassCode ) ) {
				schema.getTableUInt64Def().deleteUInt64Def( Authorization, (YCFBamUInt64DefBuff)cur );
			}
			else if( "a869".equals( subClassCode ) ) {
				schema.getTableUInt64Type().deleteUInt64Type( Authorization, (YCFBamUInt64TypeBuff)cur );
			}
			else if( "a888".equals( subClassCode ) ) {
				schema.getTableUInt64Col().deleteUInt64Col( Authorization, (YCFBamUInt64ColBuff)cur );
			}
			else if( "a86a".equals( subClassCode ) ) {
				schema.getTableUuidDef().deleteUuidDef( Authorization, (YCFBamUuidDefBuff)cur );
			}
			else if( "a86c".equals( subClassCode ) ) {
				schema.getTableUuidType().deleteUuidType( Authorization, (YCFBamUuidTypeBuff)cur );
			}
			else if( "a88b".equals( subClassCode ) ) {
				schema.getTableUuidGen().deleteUuidGen( Authorization, (YCFBamUuidGenBuff)cur );
			}
			else if( "a889".equals( subClassCode ) ) {
				schema.getTableUuidCol().deleteUuidCol( Authorization, (YCFBamUuidColBuff)cur );
			}
			else if( "a86b".equals( subClassCode ) ) {
				schema.getTableUuid6Def().deleteUuid6Def( Authorization, (YCFBamUuid6DefBuff)cur );
			}
			else if( "a86d".equals( subClassCode ) ) {
				schema.getTableUuid6Type().deleteUuid6Type( Authorization, (YCFBamUuid6TypeBuff)cur );
			}
			else if( "a88c".equals( subClassCode ) ) {
				schema.getTableUuid6Gen().deleteUuid6Gen( Authorization, (YCFBamUuid6GenBuff)cur );
			}
			else if( "a88a".equals( subClassCode ) ) {
				schema.getTableUuid6Col().deleteUuid6Col( Authorization, (YCFBamUuid6ColBuff)cur );
			}
			else if( "a85b".equals( subClassCode ) ) {
				schema.getTableTableCol().deleteTableCol( Authorization, (YCFBamTableColBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of Value must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteValueByCodeVisIdx( YCFSecAuthorization Authorization,
		IYCFBamSchema.CodeVisibilityEnum argCodeVis )
	{
		YCFBamValueByCodeVisIdxKey key = schema.getFactoryValue().newCodeVisIdxKey();
		key.setRequiredCodeVis( argCodeVis );
		deleteValueByCodeVisIdx( Authorization, key );
	}

	public void deleteValueByCodeVisIdx( YCFSecAuthorization Authorization,
		YCFBamValueByCodeVisIdxKey argKey )
	{
		final String S_ProcName = "deleteValueByCodeVisIdx";
		YCFBamValueBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamValueBuff> matchSet = new LinkedList<YCFBamValueBuff>();
		Iterator<YCFBamValueBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamValueBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableValue().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a80c".equals( subClassCode ) ) {
				schema.getTableValue().deleteValue( Authorization, cur );
			}
			else if( "a80d".equals( subClassCode ) ) {
				schema.getTableAtom().deleteAtom( Authorization, (YCFBamAtomBuff)cur );
			}
			else if( "a80e".equals( subClassCode ) ) {
				schema.getTableBlobDef().deleteBlobDef( Authorization, (YCFBamBlobDefBuff)cur );
			}
			else if( "a80f".equals( subClassCode ) ) {
				schema.getTableBlobType().deleteBlobType( Authorization, (YCFBamBlobTypeBuff)cur );
			}
			else if( "a86e".equals( subClassCode ) ) {
				schema.getTableBlobCol().deleteBlobCol( Authorization, (YCFBamBlobColBuff)cur );
			}
			else if( "a810".equals( subClassCode ) ) {
				schema.getTableBoolDef().deleteBoolDef( Authorization, (YCFBamBoolDefBuff)cur );
			}
			else if( "a811".equals( subClassCode ) ) {
				schema.getTableBoolType().deleteBoolType( Authorization, (YCFBamBoolTypeBuff)cur );
			}
			else if( "a86f".equals( subClassCode ) ) {
				schema.getTableBoolCol().deleteBoolCol( Authorization, (YCFBamBoolColBuff)cur );
			}
			else if( "a818".equals( subClassCode ) ) {
				schema.getTableDateDef().deleteDateDef( Authorization, (YCFBamDateDefBuff)cur );
			}
			else if( "a819".equals( subClassCode ) ) {
				schema.getTableDateType().deleteDateType( Authorization, (YCFBamDateTypeBuff)cur );
			}
			else if( "a870".equals( subClassCode ) ) {
				schema.getTableDateCol().deleteDateCol( Authorization, (YCFBamDateColBuff)cur );
			}
			else if( "a81f".equals( subClassCode ) ) {
				schema.getTableDoubleDef().deleteDoubleDef( Authorization, (YCFBamDoubleDefBuff)cur );
			}
			else if( "a820".equals( subClassCode ) ) {
				schema.getTableDoubleType().deleteDoubleType( Authorization, (YCFBamDoubleTypeBuff)cur );
			}
			else if( "a871".equals( subClassCode ) ) {
				schema.getTableDoubleCol().deleteDoubleCol( Authorization, (YCFBamDoubleColBuff)cur );
			}
			else if( "a822".equals( subClassCode ) ) {
				schema.getTableFloatDef().deleteFloatDef( Authorization, (YCFBamFloatDefBuff)cur );
			}
			else if( "a823".equals( subClassCode ) ) {
				schema.getTableFloatType().deleteFloatType( Authorization, (YCFBamFloatTypeBuff)cur );
			}
			else if( "a874".equals( subClassCode ) ) {
				schema.getTableFloatCol().deleteFloatCol( Authorization, (YCFBamFloatColBuff)cur );
			}
			else if( "a826".equals( subClassCode ) ) {
				schema.getTableInt16Def().deleteInt16Def( Authorization, (YCFBamInt16DefBuff)cur );
			}
			else if( "a827".equals( subClassCode ) ) {
				schema.getTableInt16Type().deleteInt16Type( Authorization, (YCFBamInt16TypeBuff)cur );
			}
			else if( "a875".equals( subClassCode ) ) {
				schema.getTableId16Gen().deleteId16Gen( Authorization, (YCFBamId16GenBuff)cur );
			}
			else if( "a872".equals( subClassCode ) ) {
				schema.getTableEnumDef().deleteEnumDef( Authorization, (YCFBamEnumDefBuff)cur );
			}
			else if( "a873".equals( subClassCode ) ) {
				schema.getTableEnumType().deleteEnumType( Authorization, (YCFBamEnumTypeBuff)cur );
			}
			else if( "a878".equals( subClassCode ) ) {
				schema.getTableInt16Col().deleteInt16Col( Authorization, (YCFBamInt16ColBuff)cur );
			}
			else if( "a828".equals( subClassCode ) ) {
				schema.getTableInt32Def().deleteInt32Def( Authorization, (YCFBamInt32DefBuff)cur );
			}
			else if( "a829".equals( subClassCode ) ) {
				schema.getTableInt32Type().deleteInt32Type( Authorization, (YCFBamInt32TypeBuff)cur );
			}
			else if( "a876".equals( subClassCode ) ) {
				schema.getTableId32Gen().deleteId32Gen( Authorization, (YCFBamId32GenBuff)cur );
			}
			else if( "a879".equals( subClassCode ) ) {
				schema.getTableInt32Col().deleteInt32Col( Authorization, (YCFBamInt32ColBuff)cur );
			}
			else if( "a82a".equals( subClassCode ) ) {
				schema.getTableInt64Def().deleteInt64Def( Authorization, (YCFBamInt64DefBuff)cur );
			}
			else if( "a82b".equals( subClassCode ) ) {
				schema.getTableInt64Type().deleteInt64Type( Authorization, (YCFBamInt64TypeBuff)cur );
			}
			else if( "a877".equals( subClassCode ) ) {
				schema.getTableId64Gen().deleteId64Gen( Authorization, (YCFBamId64GenBuff)cur );
			}
			else if( "a87a".equals( subClassCode ) ) {
				schema.getTableInt64Col().deleteInt64Col( Authorization, (YCFBamInt64ColBuff)cur );
			}
			else if( "a82c".equals( subClassCode ) ) {
				schema.getTableNmTokenDef().deleteNmTokenDef( Authorization, (YCFBamNmTokenDefBuff)cur );
			}
			else if( "a82d".equals( subClassCode ) ) {
				schema.getTableNmTokenType().deleteNmTokenType( Authorization, (YCFBamNmTokenTypeBuff)cur );
			}
			else if( "a87b".equals( subClassCode ) ) {
				schema.getTableNmTokenCol().deleteNmTokenCol( Authorization, (YCFBamNmTokenColBuff)cur );
			}
			else if( "a82e".equals( subClassCode ) ) {
				schema.getTableNmTokensDef().deleteNmTokensDef( Authorization, (YCFBamNmTokensDefBuff)cur );
			}
			else if( "a82f".equals( subClassCode ) ) {
				schema.getTableNmTokensType().deleteNmTokensType( Authorization, (YCFBamNmTokensTypeBuff)cur );
			}
			else if( "a87c".equals( subClassCode ) ) {
				schema.getTableNmTokensCol().deleteNmTokensCol( Authorization, (YCFBamNmTokensColBuff)cur );
			}
			else if( "a830".equals( subClassCode ) ) {
				schema.getTableNumberDef().deleteNumberDef( Authorization, (YCFBamNumberDefBuff)cur );
			}
			else if( "a831".equals( subClassCode ) ) {
				schema.getTableNumberType().deleteNumberType( Authorization, (YCFBamNumberTypeBuff)cur );
			}
			else if( "a87d".equals( subClassCode ) ) {
				schema.getTableNumberCol().deleteNumberCol( Authorization, (YCFBamNumberColBuff)cur );
			}
			else if( "a83b".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Def().deleteDbKeyHash128Def( Authorization, (YCFBamDbKeyHash128DefBuff)cur );
			}
			else if( "a83c".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Col().deleteDbKeyHash128Col( Authorization, (YCFBamDbKeyHash128ColBuff)cur );
			}
			else if( "a83d".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Type().deleteDbKeyHash128Type( Authorization, (YCFBamDbKeyHash128TypeBuff)cur );
			}
			else if( "a83e".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Gen().deleteDbKeyHash128Gen( Authorization, (YCFBamDbKeyHash128GenBuff)cur );
			}
			else if( "a83f".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Def().deleteDbKeyHash160Def( Authorization, (YCFBamDbKeyHash160DefBuff)cur );
			}
			else if( "a840".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Col().deleteDbKeyHash160Col( Authorization, (YCFBamDbKeyHash160ColBuff)cur );
			}
			else if( "a841".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Type().deleteDbKeyHash160Type( Authorization, (YCFBamDbKeyHash160TypeBuff)cur );
			}
			else if( "a842".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Gen().deleteDbKeyHash160Gen( Authorization, (YCFBamDbKeyHash160GenBuff)cur );
			}
			else if( "a843".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Def().deleteDbKeyHash224Def( Authorization, (YCFBamDbKeyHash224DefBuff)cur );
			}
			else if( "a844".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Col().deleteDbKeyHash224Col( Authorization, (YCFBamDbKeyHash224ColBuff)cur );
			}
			else if( "a845".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Type().deleteDbKeyHash224Type( Authorization, (YCFBamDbKeyHash224TypeBuff)cur );
			}
			else if( "a846".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Gen().deleteDbKeyHash224Gen( Authorization, (YCFBamDbKeyHash224GenBuff)cur );
			}
			else if( "a847".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Def().deleteDbKeyHash256Def( Authorization, (YCFBamDbKeyHash256DefBuff)cur );
			}
			else if( "a848".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Col().deleteDbKeyHash256Col( Authorization, (YCFBamDbKeyHash256ColBuff)cur );
			}
			else if( "a849".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Type().deleteDbKeyHash256Type( Authorization, (YCFBamDbKeyHash256TypeBuff)cur );
			}
			else if( "a84a".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Gen().deleteDbKeyHash256Gen( Authorization, (YCFBamDbKeyHash256GenBuff)cur );
			}
			else if( "a84b".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Def().deleteDbKeyHash384Def( Authorization, (YCFBamDbKeyHash384DefBuff)cur );
			}
			else if( "a84c".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Col().deleteDbKeyHash384Col( Authorization, (YCFBamDbKeyHash384ColBuff)cur );
			}
			else if( "a84d".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Type().deleteDbKeyHash384Type( Authorization, (YCFBamDbKeyHash384TypeBuff)cur );
			}
			else if( "a84e".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Gen().deleteDbKeyHash384Gen( Authorization, (YCFBamDbKeyHash384GenBuff)cur );
			}
			else if( "a84f".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Def().deleteDbKeyHash512Def( Authorization, (YCFBamDbKeyHash512DefBuff)cur );
			}
			else if( "a850".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Col().deleteDbKeyHash512Col( Authorization, (YCFBamDbKeyHash512ColBuff)cur );
			}
			else if( "a851".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Type().deleteDbKeyHash512Type( Authorization, (YCFBamDbKeyHash512TypeBuff)cur );
			}
			else if( "a852".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Gen().deleteDbKeyHash512Gen( Authorization, (YCFBamDbKeyHash512GenBuff)cur );
			}
			else if( "a853".equals( subClassCode ) ) {
				schema.getTableStringDef().deleteStringDef( Authorization, (YCFBamStringDefBuff)cur );
			}
			else if( "a854".equals( subClassCode ) ) {
				schema.getTableStringType().deleteStringType( Authorization, (YCFBamStringTypeBuff)cur );
			}
			else if( "a87e".equals( subClassCode ) ) {
				schema.getTableStringCol().deleteStringCol( Authorization, (YCFBamStringColBuff)cur );
			}
			else if( "a855".equals( subClassCode ) ) {
				schema.getTableTZDateDef().deleteTZDateDef( Authorization, (YCFBamTZDateDefBuff)cur );
			}
			else if( "a856".equals( subClassCode ) ) {
				schema.getTableTZDateType().deleteTZDateType( Authorization, (YCFBamTZDateTypeBuff)cur );
			}
			else if( "a87f".equals( subClassCode ) ) {
				schema.getTableTZDateCol().deleteTZDateCol( Authorization, (YCFBamTZDateColBuff)cur );
			}
			else if( "a857".equals( subClassCode ) ) {
				schema.getTableTZTimeDef().deleteTZTimeDef( Authorization, (YCFBamTZTimeDefBuff)cur );
			}
			else if( "a858".equals( subClassCode ) ) {
				schema.getTableTZTimeType().deleteTZTimeType( Authorization, (YCFBamTZTimeTypeBuff)cur );
			}
			else if( "a880".equals( subClassCode ) ) {
				schema.getTableTZTimeCol().deleteTZTimeCol( Authorization, (YCFBamTZTimeColBuff)cur );
			}
			else if( "a859".equals( subClassCode ) ) {
				schema.getTableTZTimestampDef().deleteTZTimestampDef( Authorization, (YCFBamTZTimestampDefBuff)cur );
			}
			else if( "a85a".equals( subClassCode ) ) {
				schema.getTableTZTimestampType().deleteTZTimestampType( Authorization, (YCFBamTZTimestampTypeBuff)cur );
			}
			else if( "a881".equals( subClassCode ) ) {
				schema.getTableTZTimestampCol().deleteTZTimestampCol( Authorization, (YCFBamTZTimestampColBuff)cur );
			}
			else if( "a85c".equals( subClassCode ) ) {
				schema.getTableTextDef().deleteTextDef( Authorization, (YCFBamTextDefBuff)cur );
			}
			else if( "a85d".equals( subClassCode ) ) {
				schema.getTableTextType().deleteTextType( Authorization, (YCFBamTextTypeBuff)cur );
			}
			else if( "a882".equals( subClassCode ) ) {
				schema.getTableTextCol().deleteTextCol( Authorization, (YCFBamTextColBuff)cur );
			}
			else if( "a85e".equals( subClassCode ) ) {
				schema.getTableTimeDef().deleteTimeDef( Authorization, (YCFBamTimeDefBuff)cur );
			}
			else if( "a85f".equals( subClassCode ) ) {
				schema.getTableTimeType().deleteTimeType( Authorization, (YCFBamTimeTypeBuff)cur );
			}
			else if( "a883".equals( subClassCode ) ) {
				schema.getTableTimeCol().deleteTimeCol( Authorization, (YCFBamTimeColBuff)cur );
			}
			else if( "a860".equals( subClassCode ) ) {
				schema.getTableTimestampDef().deleteTimestampDef( Authorization, (YCFBamTimestampDefBuff)cur );
			}
			else if( "a861".equals( subClassCode ) ) {
				schema.getTableTimestampType().deleteTimestampType( Authorization, (YCFBamTimestampTypeBuff)cur );
			}
			else if( "a884".equals( subClassCode ) ) {
				schema.getTableTimestampCol().deleteTimestampCol( Authorization, (YCFBamTimestampColBuff)cur );
			}
			else if( "a862".equals( subClassCode ) ) {
				schema.getTableTokenDef().deleteTokenDef( Authorization, (YCFBamTokenDefBuff)cur );
			}
			else if( "a863".equals( subClassCode ) ) {
				schema.getTableTokenType().deleteTokenType( Authorization, (YCFBamTokenTypeBuff)cur );
			}
			else if( "a885".equals( subClassCode ) ) {
				schema.getTableTokenCol().deleteTokenCol( Authorization, (YCFBamTokenColBuff)cur );
			}
			else if( "a864".equals( subClassCode ) ) {
				schema.getTableUInt16Def().deleteUInt16Def( Authorization, (YCFBamUInt16DefBuff)cur );
			}
			else if( "a865".equals( subClassCode ) ) {
				schema.getTableUInt16Type().deleteUInt16Type( Authorization, (YCFBamUInt16TypeBuff)cur );
			}
			else if( "a886".equals( subClassCode ) ) {
				schema.getTableUInt16Col().deleteUInt16Col( Authorization, (YCFBamUInt16ColBuff)cur );
			}
			else if( "a866".equals( subClassCode ) ) {
				schema.getTableUInt32Def().deleteUInt32Def( Authorization, (YCFBamUInt32DefBuff)cur );
			}
			else if( "a867".equals( subClassCode ) ) {
				schema.getTableUInt32Type().deleteUInt32Type( Authorization, (YCFBamUInt32TypeBuff)cur );
			}
			else if( "a887".equals( subClassCode ) ) {
				schema.getTableUInt32Col().deleteUInt32Col( Authorization, (YCFBamUInt32ColBuff)cur );
			}
			else if( "a868".equals( subClassCode ) ) {
				schema.getTableUInt64Def().deleteUInt64Def( Authorization, (YCFBamUInt64DefBuff)cur );
			}
			else if( "a869".equals( subClassCode ) ) {
				schema.getTableUInt64Type().deleteUInt64Type( Authorization, (YCFBamUInt64TypeBuff)cur );
			}
			else if( "a888".equals( subClassCode ) ) {
				schema.getTableUInt64Col().deleteUInt64Col( Authorization, (YCFBamUInt64ColBuff)cur );
			}
			else if( "a86a".equals( subClassCode ) ) {
				schema.getTableUuidDef().deleteUuidDef( Authorization, (YCFBamUuidDefBuff)cur );
			}
			else if( "a86c".equals( subClassCode ) ) {
				schema.getTableUuidType().deleteUuidType( Authorization, (YCFBamUuidTypeBuff)cur );
			}
			else if( "a88b".equals( subClassCode ) ) {
				schema.getTableUuidGen().deleteUuidGen( Authorization, (YCFBamUuidGenBuff)cur );
			}
			else if( "a889".equals( subClassCode ) ) {
				schema.getTableUuidCol().deleteUuidCol( Authorization, (YCFBamUuidColBuff)cur );
			}
			else if( "a86b".equals( subClassCode ) ) {
				schema.getTableUuid6Def().deleteUuid6Def( Authorization, (YCFBamUuid6DefBuff)cur );
			}
			else if( "a86d".equals( subClassCode ) ) {
				schema.getTableUuid6Type().deleteUuid6Type( Authorization, (YCFBamUuid6TypeBuff)cur );
			}
			else if( "a88c".equals( subClassCode ) ) {
				schema.getTableUuid6Gen().deleteUuid6Gen( Authorization, (YCFBamUuid6GenBuff)cur );
			}
			else if( "a88a".equals( subClassCode ) ) {
				schema.getTableUuid6Col().deleteUuid6Col( Authorization, (YCFBamUuid6ColBuff)cur );
			}
			else if( "a85b".equals( subClassCode ) ) {
				schema.getTableTableCol().deleteTableCol( Authorization, (YCFBamTableColBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of Value must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void deleteValueByScopeCodeVisIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argScopeId,
		IYCFBamSchema.CodeVisibilityEnum argCodeVis )
	{
		YCFBamValueByScopeCodeVisIdxKey key = schema.getFactoryValue().newScopeCodeVisIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredScopeId( argScopeId );
		key.setRequiredCodeVis( argCodeVis );
		deleteValueByScopeCodeVisIdx( Authorization, key );
	}

	public void deleteValueByScopeCodeVisIdx( YCFSecAuthorization Authorization,
		YCFBamValueByScopeCodeVisIdxKey argKey )
	{
		final String S_ProcName = "deleteValueByScopeCodeVisIdx";
		YCFBamValueBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamValueBuff> matchSet = new LinkedList<YCFBamValueBuff>();
		Iterator<YCFBamValueBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamValueBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableValue().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			String subClassCode = cur.getClassCode();
			if( "a80c".equals( subClassCode ) ) {
				schema.getTableValue().deleteValue( Authorization, cur );
			}
			else if( "a80d".equals( subClassCode ) ) {
				schema.getTableAtom().deleteAtom( Authorization, (YCFBamAtomBuff)cur );
			}
			else if( "a80e".equals( subClassCode ) ) {
				schema.getTableBlobDef().deleteBlobDef( Authorization, (YCFBamBlobDefBuff)cur );
			}
			else if( "a80f".equals( subClassCode ) ) {
				schema.getTableBlobType().deleteBlobType( Authorization, (YCFBamBlobTypeBuff)cur );
			}
			else if( "a86e".equals( subClassCode ) ) {
				schema.getTableBlobCol().deleteBlobCol( Authorization, (YCFBamBlobColBuff)cur );
			}
			else if( "a810".equals( subClassCode ) ) {
				schema.getTableBoolDef().deleteBoolDef( Authorization, (YCFBamBoolDefBuff)cur );
			}
			else if( "a811".equals( subClassCode ) ) {
				schema.getTableBoolType().deleteBoolType( Authorization, (YCFBamBoolTypeBuff)cur );
			}
			else if( "a86f".equals( subClassCode ) ) {
				schema.getTableBoolCol().deleteBoolCol( Authorization, (YCFBamBoolColBuff)cur );
			}
			else if( "a818".equals( subClassCode ) ) {
				schema.getTableDateDef().deleteDateDef( Authorization, (YCFBamDateDefBuff)cur );
			}
			else if( "a819".equals( subClassCode ) ) {
				schema.getTableDateType().deleteDateType( Authorization, (YCFBamDateTypeBuff)cur );
			}
			else if( "a870".equals( subClassCode ) ) {
				schema.getTableDateCol().deleteDateCol( Authorization, (YCFBamDateColBuff)cur );
			}
			else if( "a81f".equals( subClassCode ) ) {
				schema.getTableDoubleDef().deleteDoubleDef( Authorization, (YCFBamDoubleDefBuff)cur );
			}
			else if( "a820".equals( subClassCode ) ) {
				schema.getTableDoubleType().deleteDoubleType( Authorization, (YCFBamDoubleTypeBuff)cur );
			}
			else if( "a871".equals( subClassCode ) ) {
				schema.getTableDoubleCol().deleteDoubleCol( Authorization, (YCFBamDoubleColBuff)cur );
			}
			else if( "a822".equals( subClassCode ) ) {
				schema.getTableFloatDef().deleteFloatDef( Authorization, (YCFBamFloatDefBuff)cur );
			}
			else if( "a823".equals( subClassCode ) ) {
				schema.getTableFloatType().deleteFloatType( Authorization, (YCFBamFloatTypeBuff)cur );
			}
			else if( "a874".equals( subClassCode ) ) {
				schema.getTableFloatCol().deleteFloatCol( Authorization, (YCFBamFloatColBuff)cur );
			}
			else if( "a826".equals( subClassCode ) ) {
				schema.getTableInt16Def().deleteInt16Def( Authorization, (YCFBamInt16DefBuff)cur );
			}
			else if( "a827".equals( subClassCode ) ) {
				schema.getTableInt16Type().deleteInt16Type( Authorization, (YCFBamInt16TypeBuff)cur );
			}
			else if( "a875".equals( subClassCode ) ) {
				schema.getTableId16Gen().deleteId16Gen( Authorization, (YCFBamId16GenBuff)cur );
			}
			else if( "a872".equals( subClassCode ) ) {
				schema.getTableEnumDef().deleteEnumDef( Authorization, (YCFBamEnumDefBuff)cur );
			}
			else if( "a873".equals( subClassCode ) ) {
				schema.getTableEnumType().deleteEnumType( Authorization, (YCFBamEnumTypeBuff)cur );
			}
			else if( "a878".equals( subClassCode ) ) {
				schema.getTableInt16Col().deleteInt16Col( Authorization, (YCFBamInt16ColBuff)cur );
			}
			else if( "a828".equals( subClassCode ) ) {
				schema.getTableInt32Def().deleteInt32Def( Authorization, (YCFBamInt32DefBuff)cur );
			}
			else if( "a829".equals( subClassCode ) ) {
				schema.getTableInt32Type().deleteInt32Type( Authorization, (YCFBamInt32TypeBuff)cur );
			}
			else if( "a876".equals( subClassCode ) ) {
				schema.getTableId32Gen().deleteId32Gen( Authorization, (YCFBamId32GenBuff)cur );
			}
			else if( "a879".equals( subClassCode ) ) {
				schema.getTableInt32Col().deleteInt32Col( Authorization, (YCFBamInt32ColBuff)cur );
			}
			else if( "a82a".equals( subClassCode ) ) {
				schema.getTableInt64Def().deleteInt64Def( Authorization, (YCFBamInt64DefBuff)cur );
			}
			else if( "a82b".equals( subClassCode ) ) {
				schema.getTableInt64Type().deleteInt64Type( Authorization, (YCFBamInt64TypeBuff)cur );
			}
			else if( "a877".equals( subClassCode ) ) {
				schema.getTableId64Gen().deleteId64Gen( Authorization, (YCFBamId64GenBuff)cur );
			}
			else if( "a87a".equals( subClassCode ) ) {
				schema.getTableInt64Col().deleteInt64Col( Authorization, (YCFBamInt64ColBuff)cur );
			}
			else if( "a82c".equals( subClassCode ) ) {
				schema.getTableNmTokenDef().deleteNmTokenDef( Authorization, (YCFBamNmTokenDefBuff)cur );
			}
			else if( "a82d".equals( subClassCode ) ) {
				schema.getTableNmTokenType().deleteNmTokenType( Authorization, (YCFBamNmTokenTypeBuff)cur );
			}
			else if( "a87b".equals( subClassCode ) ) {
				schema.getTableNmTokenCol().deleteNmTokenCol( Authorization, (YCFBamNmTokenColBuff)cur );
			}
			else if( "a82e".equals( subClassCode ) ) {
				schema.getTableNmTokensDef().deleteNmTokensDef( Authorization, (YCFBamNmTokensDefBuff)cur );
			}
			else if( "a82f".equals( subClassCode ) ) {
				schema.getTableNmTokensType().deleteNmTokensType( Authorization, (YCFBamNmTokensTypeBuff)cur );
			}
			else if( "a87c".equals( subClassCode ) ) {
				schema.getTableNmTokensCol().deleteNmTokensCol( Authorization, (YCFBamNmTokensColBuff)cur );
			}
			else if( "a830".equals( subClassCode ) ) {
				schema.getTableNumberDef().deleteNumberDef( Authorization, (YCFBamNumberDefBuff)cur );
			}
			else if( "a831".equals( subClassCode ) ) {
				schema.getTableNumberType().deleteNumberType( Authorization, (YCFBamNumberTypeBuff)cur );
			}
			else if( "a87d".equals( subClassCode ) ) {
				schema.getTableNumberCol().deleteNumberCol( Authorization, (YCFBamNumberColBuff)cur );
			}
			else if( "a83b".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Def().deleteDbKeyHash128Def( Authorization, (YCFBamDbKeyHash128DefBuff)cur );
			}
			else if( "a83c".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Col().deleteDbKeyHash128Col( Authorization, (YCFBamDbKeyHash128ColBuff)cur );
			}
			else if( "a83d".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Type().deleteDbKeyHash128Type( Authorization, (YCFBamDbKeyHash128TypeBuff)cur );
			}
			else if( "a83e".equals( subClassCode ) ) {
				schema.getTableDbKeyHash128Gen().deleteDbKeyHash128Gen( Authorization, (YCFBamDbKeyHash128GenBuff)cur );
			}
			else if( "a83f".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Def().deleteDbKeyHash160Def( Authorization, (YCFBamDbKeyHash160DefBuff)cur );
			}
			else if( "a840".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Col().deleteDbKeyHash160Col( Authorization, (YCFBamDbKeyHash160ColBuff)cur );
			}
			else if( "a841".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Type().deleteDbKeyHash160Type( Authorization, (YCFBamDbKeyHash160TypeBuff)cur );
			}
			else if( "a842".equals( subClassCode ) ) {
				schema.getTableDbKeyHash160Gen().deleteDbKeyHash160Gen( Authorization, (YCFBamDbKeyHash160GenBuff)cur );
			}
			else if( "a843".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Def().deleteDbKeyHash224Def( Authorization, (YCFBamDbKeyHash224DefBuff)cur );
			}
			else if( "a844".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Col().deleteDbKeyHash224Col( Authorization, (YCFBamDbKeyHash224ColBuff)cur );
			}
			else if( "a845".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Type().deleteDbKeyHash224Type( Authorization, (YCFBamDbKeyHash224TypeBuff)cur );
			}
			else if( "a846".equals( subClassCode ) ) {
				schema.getTableDbKeyHash224Gen().deleteDbKeyHash224Gen( Authorization, (YCFBamDbKeyHash224GenBuff)cur );
			}
			else if( "a847".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Def().deleteDbKeyHash256Def( Authorization, (YCFBamDbKeyHash256DefBuff)cur );
			}
			else if( "a848".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Col().deleteDbKeyHash256Col( Authorization, (YCFBamDbKeyHash256ColBuff)cur );
			}
			else if( "a849".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Type().deleteDbKeyHash256Type( Authorization, (YCFBamDbKeyHash256TypeBuff)cur );
			}
			else if( "a84a".equals( subClassCode ) ) {
				schema.getTableDbKeyHash256Gen().deleteDbKeyHash256Gen( Authorization, (YCFBamDbKeyHash256GenBuff)cur );
			}
			else if( "a84b".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Def().deleteDbKeyHash384Def( Authorization, (YCFBamDbKeyHash384DefBuff)cur );
			}
			else if( "a84c".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Col().deleteDbKeyHash384Col( Authorization, (YCFBamDbKeyHash384ColBuff)cur );
			}
			else if( "a84d".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Type().deleteDbKeyHash384Type( Authorization, (YCFBamDbKeyHash384TypeBuff)cur );
			}
			else if( "a84e".equals( subClassCode ) ) {
				schema.getTableDbKeyHash384Gen().deleteDbKeyHash384Gen( Authorization, (YCFBamDbKeyHash384GenBuff)cur );
			}
			else if( "a84f".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Def().deleteDbKeyHash512Def( Authorization, (YCFBamDbKeyHash512DefBuff)cur );
			}
			else if( "a850".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Col().deleteDbKeyHash512Col( Authorization, (YCFBamDbKeyHash512ColBuff)cur );
			}
			else if( "a851".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Type().deleteDbKeyHash512Type( Authorization, (YCFBamDbKeyHash512TypeBuff)cur );
			}
			else if( "a852".equals( subClassCode ) ) {
				schema.getTableDbKeyHash512Gen().deleteDbKeyHash512Gen( Authorization, (YCFBamDbKeyHash512GenBuff)cur );
			}
			else if( "a853".equals( subClassCode ) ) {
				schema.getTableStringDef().deleteStringDef( Authorization, (YCFBamStringDefBuff)cur );
			}
			else if( "a854".equals( subClassCode ) ) {
				schema.getTableStringType().deleteStringType( Authorization, (YCFBamStringTypeBuff)cur );
			}
			else if( "a87e".equals( subClassCode ) ) {
				schema.getTableStringCol().deleteStringCol( Authorization, (YCFBamStringColBuff)cur );
			}
			else if( "a855".equals( subClassCode ) ) {
				schema.getTableTZDateDef().deleteTZDateDef( Authorization, (YCFBamTZDateDefBuff)cur );
			}
			else if( "a856".equals( subClassCode ) ) {
				schema.getTableTZDateType().deleteTZDateType( Authorization, (YCFBamTZDateTypeBuff)cur );
			}
			else if( "a87f".equals( subClassCode ) ) {
				schema.getTableTZDateCol().deleteTZDateCol( Authorization, (YCFBamTZDateColBuff)cur );
			}
			else if( "a857".equals( subClassCode ) ) {
				schema.getTableTZTimeDef().deleteTZTimeDef( Authorization, (YCFBamTZTimeDefBuff)cur );
			}
			else if( "a858".equals( subClassCode ) ) {
				schema.getTableTZTimeType().deleteTZTimeType( Authorization, (YCFBamTZTimeTypeBuff)cur );
			}
			else if( "a880".equals( subClassCode ) ) {
				schema.getTableTZTimeCol().deleteTZTimeCol( Authorization, (YCFBamTZTimeColBuff)cur );
			}
			else if( "a859".equals( subClassCode ) ) {
				schema.getTableTZTimestampDef().deleteTZTimestampDef( Authorization, (YCFBamTZTimestampDefBuff)cur );
			}
			else if( "a85a".equals( subClassCode ) ) {
				schema.getTableTZTimestampType().deleteTZTimestampType( Authorization, (YCFBamTZTimestampTypeBuff)cur );
			}
			else if( "a881".equals( subClassCode ) ) {
				schema.getTableTZTimestampCol().deleteTZTimestampCol( Authorization, (YCFBamTZTimestampColBuff)cur );
			}
			else if( "a85c".equals( subClassCode ) ) {
				schema.getTableTextDef().deleteTextDef( Authorization, (YCFBamTextDefBuff)cur );
			}
			else if( "a85d".equals( subClassCode ) ) {
				schema.getTableTextType().deleteTextType( Authorization, (YCFBamTextTypeBuff)cur );
			}
			else if( "a882".equals( subClassCode ) ) {
				schema.getTableTextCol().deleteTextCol( Authorization, (YCFBamTextColBuff)cur );
			}
			else if( "a85e".equals( subClassCode ) ) {
				schema.getTableTimeDef().deleteTimeDef( Authorization, (YCFBamTimeDefBuff)cur );
			}
			else if( "a85f".equals( subClassCode ) ) {
				schema.getTableTimeType().deleteTimeType( Authorization, (YCFBamTimeTypeBuff)cur );
			}
			else if( "a883".equals( subClassCode ) ) {
				schema.getTableTimeCol().deleteTimeCol( Authorization, (YCFBamTimeColBuff)cur );
			}
			else if( "a860".equals( subClassCode ) ) {
				schema.getTableTimestampDef().deleteTimestampDef( Authorization, (YCFBamTimestampDefBuff)cur );
			}
			else if( "a861".equals( subClassCode ) ) {
				schema.getTableTimestampType().deleteTimestampType( Authorization, (YCFBamTimestampTypeBuff)cur );
			}
			else if( "a884".equals( subClassCode ) ) {
				schema.getTableTimestampCol().deleteTimestampCol( Authorization, (YCFBamTimestampColBuff)cur );
			}
			else if( "a862".equals( subClassCode ) ) {
				schema.getTableTokenDef().deleteTokenDef( Authorization, (YCFBamTokenDefBuff)cur );
			}
			else if( "a863".equals( subClassCode ) ) {
				schema.getTableTokenType().deleteTokenType( Authorization, (YCFBamTokenTypeBuff)cur );
			}
			else if( "a885".equals( subClassCode ) ) {
				schema.getTableTokenCol().deleteTokenCol( Authorization, (YCFBamTokenColBuff)cur );
			}
			else if( "a864".equals( subClassCode ) ) {
				schema.getTableUInt16Def().deleteUInt16Def( Authorization, (YCFBamUInt16DefBuff)cur );
			}
			else if( "a865".equals( subClassCode ) ) {
				schema.getTableUInt16Type().deleteUInt16Type( Authorization, (YCFBamUInt16TypeBuff)cur );
			}
			else if( "a886".equals( subClassCode ) ) {
				schema.getTableUInt16Col().deleteUInt16Col( Authorization, (YCFBamUInt16ColBuff)cur );
			}
			else if( "a866".equals( subClassCode ) ) {
				schema.getTableUInt32Def().deleteUInt32Def( Authorization, (YCFBamUInt32DefBuff)cur );
			}
			else if( "a867".equals( subClassCode ) ) {
				schema.getTableUInt32Type().deleteUInt32Type( Authorization, (YCFBamUInt32TypeBuff)cur );
			}
			else if( "a887".equals( subClassCode ) ) {
				schema.getTableUInt32Col().deleteUInt32Col( Authorization, (YCFBamUInt32ColBuff)cur );
			}
			else if( "a868".equals( subClassCode ) ) {
				schema.getTableUInt64Def().deleteUInt64Def( Authorization, (YCFBamUInt64DefBuff)cur );
			}
			else if( "a869".equals( subClassCode ) ) {
				schema.getTableUInt64Type().deleteUInt64Type( Authorization, (YCFBamUInt64TypeBuff)cur );
			}
			else if( "a888".equals( subClassCode ) ) {
				schema.getTableUInt64Col().deleteUInt64Col( Authorization, (YCFBamUInt64ColBuff)cur );
			}
			else if( "a86a".equals( subClassCode ) ) {
				schema.getTableUuidDef().deleteUuidDef( Authorization, (YCFBamUuidDefBuff)cur );
			}
			else if( "a86c".equals( subClassCode ) ) {
				schema.getTableUuidType().deleteUuidType( Authorization, (YCFBamUuidTypeBuff)cur );
			}
			else if( "a88b".equals( subClassCode ) ) {
				schema.getTableUuidGen().deleteUuidGen( Authorization, (YCFBamUuidGenBuff)cur );
			}
			else if( "a889".equals( subClassCode ) ) {
				schema.getTableUuidCol().deleteUuidCol( Authorization, (YCFBamUuidColBuff)cur );
			}
			else if( "a86b".equals( subClassCode ) ) {
				schema.getTableUuid6Def().deleteUuid6Def( Authorization, (YCFBamUuid6DefBuff)cur );
			}
			else if( "a86d".equals( subClassCode ) ) {
				schema.getTableUuid6Type().deleteUuid6Type( Authorization, (YCFBamUuid6TypeBuff)cur );
			}
			else if( "a88c".equals( subClassCode ) ) {
				schema.getTableUuid6Gen().deleteUuid6Gen( Authorization, (YCFBamUuid6GenBuff)cur );
			}
			else if( "a88a".equals( subClassCode ) ) {
				schema.getTableUuid6Col().deleteUuid6Col( Authorization, (YCFBamUuid6ColBuff)cur );
			}
			else if( "a85b".equals( subClassCode ) ) {
				schema.getTableTableCol().deleteTableCol( Authorization, (YCFBamTableColBuff)cur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"subClassCode",
					cur,
					"Instance of or subclass of Value must not be \"" + subClassCode + "\"" );
			}
		}
	}

	public void releasePreparedStatements() {
	}
}
