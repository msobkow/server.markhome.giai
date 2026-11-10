
// Description: Java 11 in-memory RAM DbIO implementation for Param.

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
 *	YCFBamRamParamTable in-memory RAM DbIO implementation
 *	for Param.
 */
public class YCFBamRamParamTable
	implements IYCFBamParamTable
{
	private IYCFBamSchema schema;
	private Map< YCFBamParamPKey,
				YCFBamParamBuff > dictByPKey
		= new HashMap< YCFBamParamPKey,
				YCFBamParamBuff >();
	private Map< YCFBamParamByUNameIdxKey,
			YCFBamParamBuff > dictByUNameIdx
		= new HashMap< YCFBamParamByUNameIdxKey,
			YCFBamParamBuff >();
	private Map< YCFBamParamByValTentIdxKey,
				Map< YCFBamParamPKey,
					YCFBamParamBuff >> dictByValTentIdx
		= new HashMap< YCFBamParamByValTentIdxKey,
				Map< YCFBamParamPKey,
					YCFBamParamBuff >>();
	private Map< YCFBamParamByServerMethodIdxKey,
				Map< YCFBamParamPKey,
					YCFBamParamBuff >> dictByServerMethodIdx
		= new HashMap< YCFBamParamByServerMethodIdxKey,
				Map< YCFBamParamPKey,
					YCFBamParamBuff >>();
	private Map< YCFBamParamByDefSchemaIdxKey,
				Map< YCFBamParamPKey,
					YCFBamParamBuff >> dictByDefSchemaIdx
		= new HashMap< YCFBamParamByDefSchemaIdxKey,
				Map< YCFBamParamPKey,
					YCFBamParamBuff >>();
	private Map< YCFBamParamByServerTypeIdxKey,
				Map< YCFBamParamPKey,
					YCFBamParamBuff >> dictByServerTypeIdx
		= new HashMap< YCFBamParamByServerTypeIdxKey,
				Map< YCFBamParamPKey,
					YCFBamParamBuff >>();
	private Map< YCFBamParamByPrevIdxKey,
				Map< YCFBamParamPKey,
					YCFBamParamBuff >> dictByPrevIdx
		= new HashMap< YCFBamParamByPrevIdxKey,
				Map< YCFBamParamPKey,
					YCFBamParamBuff >>();
	private Map< YCFBamParamByNextIdxKey,
				Map< YCFBamParamPKey,
					YCFBamParamBuff >> dictByNextIdx
		= new HashMap< YCFBamParamByNextIdxKey,
				Map< YCFBamParamPKey,
					YCFBamParamBuff >>();
	private Map< YCFBamParamByContPrevIdxKey,
				Map< YCFBamParamPKey,
					YCFBamParamBuff >> dictByContPrevIdx
		= new HashMap< YCFBamParamByContPrevIdxKey,
				Map< YCFBamParamPKey,
					YCFBamParamBuff >>();
	private Map< YCFBamParamByContNextIdxKey,
				Map< YCFBamParamPKey,
					YCFBamParamBuff >> dictByContNextIdx
		= new HashMap< YCFBamParamByContNextIdxKey,
				Map< YCFBamParamPKey,
					YCFBamParamBuff >>();

	public YCFBamRamParamTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createParam( YCFSecAuthorization Authorization,
		YCFBamParamBuff Buff )
	{
		final String S_ProcName = "createParam";
			YCFBamParamBuff tail = null;

			YCFBamParamBuff[] siblings = schema.getTableParam().readDerivedByServerMethodIdx( Authorization,
				Buff.getRequiredTenantId(),
				Buff.getRequiredServerMethodId() );
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
		
		YCFBamParamPKey pkey = schema.getFactoryParam().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( ((YCFBamRamTenantTable)schema.getTableTenant()).nextParamIdGen( Authorization,
			Buff.getRequiredTenantId() ) );
		Buff.setRequiredTenantId( pkey.getRequiredTenantId() );
		Buff.setRequiredId( pkey.getRequiredId() );
		YCFBamParamByUNameIdxKey keyUNameIdx = schema.getFactoryParam().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyUNameIdx.setRequiredServerMethodId( Buff.getRequiredServerMethodId() );
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamParamByValTentIdxKey keyValTentIdx = schema.getFactoryParam().newValTentIdxKey();
		keyValTentIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFBamParamByServerMethodIdxKey keyServerMethodIdx = schema.getFactoryParam().newServerMethodIdxKey();
		keyServerMethodIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyServerMethodIdx.setRequiredServerMethodId( Buff.getRequiredServerMethodId() );

		YCFBamParamByDefSchemaIdxKey keyDefSchemaIdx = schema.getFactoryParam().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( Buff.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( Buff.getOptionalDefSchemaId() );

		YCFBamParamByServerTypeIdxKey keyServerTypeIdx = schema.getFactoryParam().newServerTypeIdxKey();
		keyServerTypeIdx.setOptionalTypeTenantId( Buff.getOptionalTypeTenantId() );
		keyServerTypeIdx.setOptionalTypeId( Buff.getOptionalTypeId() );

		YCFBamParamByPrevIdxKey keyPrevIdx = schema.getFactoryParam().newPrevIdxKey();
		keyPrevIdx.setOptionalPrevTenantId( Buff.getOptionalPrevTenantId() );
		keyPrevIdx.setOptionalPrevId( Buff.getOptionalPrevId() );

		YCFBamParamByNextIdxKey keyNextIdx = schema.getFactoryParam().newNextIdxKey();
		keyNextIdx.setOptionalNextTenantId( Buff.getOptionalNextTenantId() );
		keyNextIdx.setOptionalNextId( Buff.getOptionalNextId() );

		YCFBamParamByContPrevIdxKey keyContPrevIdx = schema.getFactoryParam().newContPrevIdxKey();
		keyContPrevIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyContPrevIdx.setRequiredServerMethodId( Buff.getRequiredServerMethodId() );
		keyContPrevIdx.setOptionalPrevId( Buff.getOptionalPrevId() );

		YCFBamParamByContNextIdxKey keyContNextIdx = schema.getFactoryParam().newContNextIdxKey();
		keyContNextIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyContNextIdx.setRequiredServerMethodId( Buff.getRequiredServerMethodId() );
		keyContNextIdx.setOptionalNextId( Buff.getOptionalNextId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"ParamUNameIdx",
				keyUNameIdx );
		}

		// Validate foreign keys

		{
			boolean allNull = true;
			allNull = false;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableServerMethod().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredServerMethodId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"ServerMethod",
						"ServerMethod",
						null );
				}
			}
		}

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
			if( Buff.getOptionalTypeTenantId() != null ) {
				allNull = false;
			}
			if( Buff.getOptionalTypeId() != null ) {
				allNull = false;
			}
			if( ! allNull ) {
				if( null == schema.getTableValue().readDerivedByIdIdx( Authorization,
						Buff.getOptionalTypeTenantId(),
						Buff.getOptionalTypeId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Lookup",
						"Type",
						"Value",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

		Map< YCFBamParamPKey, YCFBamParamBuff > subdictValTentIdx;
		if( dictByValTentIdx.containsKey( keyValTentIdx ) ) {
			subdictValTentIdx = dictByValTentIdx.get( keyValTentIdx );
		}
		else {
			subdictValTentIdx = new HashMap< YCFBamParamPKey, YCFBamParamBuff >();
			dictByValTentIdx.put( keyValTentIdx, subdictValTentIdx );
		}
		subdictValTentIdx.put( pkey, Buff );

		Map< YCFBamParamPKey, YCFBamParamBuff > subdictServerMethodIdx;
		if( dictByServerMethodIdx.containsKey( keyServerMethodIdx ) ) {
			subdictServerMethodIdx = dictByServerMethodIdx.get( keyServerMethodIdx );
		}
		else {
			subdictServerMethodIdx = new HashMap< YCFBamParamPKey, YCFBamParamBuff >();
			dictByServerMethodIdx.put( keyServerMethodIdx, subdictServerMethodIdx );
		}
		subdictServerMethodIdx.put( pkey, Buff );

		Map< YCFBamParamPKey, YCFBamParamBuff > subdictDefSchemaIdx;
		if( dictByDefSchemaIdx.containsKey( keyDefSchemaIdx ) ) {
			subdictDefSchemaIdx = dictByDefSchemaIdx.get( keyDefSchemaIdx );
		}
		else {
			subdictDefSchemaIdx = new HashMap< YCFBamParamPKey, YCFBamParamBuff >();
			dictByDefSchemaIdx.put( keyDefSchemaIdx, subdictDefSchemaIdx );
		}
		subdictDefSchemaIdx.put( pkey, Buff );

		Map< YCFBamParamPKey, YCFBamParamBuff > subdictServerTypeIdx;
		if( dictByServerTypeIdx.containsKey( keyServerTypeIdx ) ) {
			subdictServerTypeIdx = dictByServerTypeIdx.get( keyServerTypeIdx );
		}
		else {
			subdictServerTypeIdx = new HashMap< YCFBamParamPKey, YCFBamParamBuff >();
			dictByServerTypeIdx.put( keyServerTypeIdx, subdictServerTypeIdx );
		}
		subdictServerTypeIdx.put( pkey, Buff );

		Map< YCFBamParamPKey, YCFBamParamBuff > subdictPrevIdx;
		if( dictByPrevIdx.containsKey( keyPrevIdx ) ) {
			subdictPrevIdx = dictByPrevIdx.get( keyPrevIdx );
		}
		else {
			subdictPrevIdx = new HashMap< YCFBamParamPKey, YCFBamParamBuff >();
			dictByPrevIdx.put( keyPrevIdx, subdictPrevIdx );
		}
		subdictPrevIdx.put( pkey, Buff );

		Map< YCFBamParamPKey, YCFBamParamBuff > subdictNextIdx;
		if( dictByNextIdx.containsKey( keyNextIdx ) ) {
			subdictNextIdx = dictByNextIdx.get( keyNextIdx );
		}
		else {
			subdictNextIdx = new HashMap< YCFBamParamPKey, YCFBamParamBuff >();
			dictByNextIdx.put( keyNextIdx, subdictNextIdx );
		}
		subdictNextIdx.put( pkey, Buff );

		Map< YCFBamParamPKey, YCFBamParamBuff > subdictContPrevIdx;
		if( dictByContPrevIdx.containsKey( keyContPrevIdx ) ) {
			subdictContPrevIdx = dictByContPrevIdx.get( keyContPrevIdx );
		}
		else {
			subdictContPrevIdx = new HashMap< YCFBamParamPKey, YCFBamParamBuff >();
			dictByContPrevIdx.put( keyContPrevIdx, subdictContPrevIdx );
		}
		subdictContPrevIdx.put( pkey, Buff );

		Map< YCFBamParamPKey, YCFBamParamBuff > subdictContNextIdx;
		if( dictByContNextIdx.containsKey( keyContNextIdx ) ) {
			subdictContNextIdx = dictByContNextIdx.get( keyContNextIdx );
		}
		else {
			subdictContNextIdx = new HashMap< YCFBamParamPKey, YCFBamParamBuff >();
			dictByContNextIdx.put( keyContNextIdx, subdictContNextIdx );
		}
		subdictContNextIdx.put( pkey, Buff );

		if( tail != null ) {
			YCFBamParamBuff tailEdit = schema.getFactoryParam().newBuff();
			tailEdit.set( (YCFBamParamBuff)tail );
				tailEdit.setOptionalNextTenantId( Buff.getRequiredTenantId() );
				tailEdit.setOptionalNextId( Buff.getRequiredId() );
			schema.getTableParam().updateParam( Authorization, tailEdit );
		}
	}

	public YCFBamParamBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamParamPKey PKey )
	{
		final String S_ProcName = "YCFBamRamParam.readDerived";
		YCFBamParamPKey key = schema.getFactoryParam().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamParamBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamParamBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamParamPKey PKey )
	{
		final String S_ProcName = "YCFBamRamParam.readDerived";
		YCFBamParamPKey key = schema.getFactoryParam().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamParamBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamParamBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamParam.readAllDerived";
		YCFBamParamBuff[] retList = new YCFBamParamBuff[ dictByPKey.values().size() ];
		Iterator< YCFBamParamBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamParamBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ServerMethodId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamParam.readDerivedByUNameIdx";
		YCFBamParamByUNameIdxKey key = schema.getFactoryParam().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredServerMethodId( ServerMethodId );
		key.setRequiredName( Name );

		YCFBamParamBuff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamParamBuff[] readDerivedByValTentIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamParam.readDerivedByValTentIdx";
		YCFBamParamByValTentIdxKey key = schema.getFactoryParam().newValTentIdxKey();
		key.setRequiredTenantId( TenantId );

		YCFBamParamBuff[] recArray;
		if( dictByValTentIdx.containsKey( key ) ) {
			Map< YCFBamParamPKey, YCFBamParamBuff > subdictValTentIdx
				= dictByValTentIdx.get( key );
			recArray = new YCFBamParamBuff[ subdictValTentIdx.size() ];
			Iterator< YCFBamParamBuff > iter = subdictValTentIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamParamPKey, YCFBamParamBuff > subdictValTentIdx
				= new HashMap< YCFBamParamPKey, YCFBamParamBuff >();
			dictByValTentIdx.put( key, subdictValTentIdx );
			recArray = new YCFBamParamBuff[0];
		}
		return( recArray );
	}

	public YCFBamParamBuff[] readDerivedByServerMethodIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ServerMethodId )
	{
		final String S_ProcName = "YCFBamRamParam.readDerivedByServerMethodIdx";
		YCFBamParamByServerMethodIdxKey key = schema.getFactoryParam().newServerMethodIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredServerMethodId( ServerMethodId );

		YCFBamParamBuff[] recArray;
		if( dictByServerMethodIdx.containsKey( key ) ) {
			Map< YCFBamParamPKey, YCFBamParamBuff > subdictServerMethodIdx
				= dictByServerMethodIdx.get( key );
			recArray = new YCFBamParamBuff[ subdictServerMethodIdx.size() ];
			Iterator< YCFBamParamBuff > iter = subdictServerMethodIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamParamPKey, YCFBamParamBuff > subdictServerMethodIdx
				= new HashMap< YCFBamParamPKey, YCFBamParamBuff >();
			dictByServerMethodIdx.put( key, subdictServerMethodIdx );
			recArray = new YCFBamParamBuff[0];
		}
		return( recArray );
	}

	public YCFBamParamBuff[] readDerivedByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamParam.readDerivedByDefSchemaIdx";
		YCFBamParamByDefSchemaIdxKey key = schema.getFactoryParam().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );

		YCFBamParamBuff[] recArray;
		if( dictByDefSchemaIdx.containsKey( key ) ) {
			Map< YCFBamParamPKey, YCFBamParamBuff > subdictDefSchemaIdx
				= dictByDefSchemaIdx.get( key );
			recArray = new YCFBamParamBuff[ subdictDefSchemaIdx.size() ];
			Iterator< YCFBamParamBuff > iter = subdictDefSchemaIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamParamPKey, YCFBamParamBuff > subdictDefSchemaIdx
				= new HashMap< YCFBamParamPKey, YCFBamParamBuff >();
			dictByDefSchemaIdx.put( key, subdictDefSchemaIdx );
			recArray = new YCFBamParamBuff[0];
		}
		return( recArray );
	}

	public YCFBamParamBuff[] readDerivedByServerTypeIdx( YCFSecAuthorization Authorization,
		Long TypeTenantId,
		Long TypeId )
	{
		final String S_ProcName = "YCFBamRamParam.readDerivedByServerTypeIdx";
		YCFBamParamByServerTypeIdxKey key = schema.getFactoryParam().newServerTypeIdxKey();
		key.setOptionalTypeTenantId( TypeTenantId );
		key.setOptionalTypeId( TypeId );

		YCFBamParamBuff[] recArray;
		if( dictByServerTypeIdx.containsKey( key ) ) {
			Map< YCFBamParamPKey, YCFBamParamBuff > subdictServerTypeIdx
				= dictByServerTypeIdx.get( key );
			recArray = new YCFBamParamBuff[ subdictServerTypeIdx.size() ];
			Iterator< YCFBamParamBuff > iter = subdictServerTypeIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamParamPKey, YCFBamParamBuff > subdictServerTypeIdx
				= new HashMap< YCFBamParamPKey, YCFBamParamBuff >();
			dictByServerTypeIdx.put( key, subdictServerTypeIdx );
			recArray = new YCFBamParamBuff[0];
		}
		return( recArray );
	}

	public YCFBamParamBuff[] readDerivedByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "YCFBamRamParam.readDerivedByPrevIdx";
		YCFBamParamByPrevIdxKey key = schema.getFactoryParam().newPrevIdxKey();
		key.setOptionalPrevTenantId( PrevTenantId );
		key.setOptionalPrevId( PrevId );

		YCFBamParamBuff[] recArray;
		if( dictByPrevIdx.containsKey( key ) ) {
			Map< YCFBamParamPKey, YCFBamParamBuff > subdictPrevIdx
				= dictByPrevIdx.get( key );
			recArray = new YCFBamParamBuff[ subdictPrevIdx.size() ];
			Iterator< YCFBamParamBuff > iter = subdictPrevIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamParamPKey, YCFBamParamBuff > subdictPrevIdx
				= new HashMap< YCFBamParamPKey, YCFBamParamBuff >();
			dictByPrevIdx.put( key, subdictPrevIdx );
			recArray = new YCFBamParamBuff[0];
		}
		return( recArray );
	}

	public YCFBamParamBuff[] readDerivedByNextIdx( YCFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "YCFBamRamParam.readDerivedByNextIdx";
		YCFBamParamByNextIdxKey key = schema.getFactoryParam().newNextIdxKey();
		key.setOptionalNextTenantId( NextTenantId );
		key.setOptionalNextId( NextId );

		YCFBamParamBuff[] recArray;
		if( dictByNextIdx.containsKey( key ) ) {
			Map< YCFBamParamPKey, YCFBamParamBuff > subdictNextIdx
				= dictByNextIdx.get( key );
			recArray = new YCFBamParamBuff[ subdictNextIdx.size() ];
			Iterator< YCFBamParamBuff > iter = subdictNextIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamParamPKey, YCFBamParamBuff > subdictNextIdx
				= new HashMap< YCFBamParamPKey, YCFBamParamBuff >();
			dictByNextIdx.put( key, subdictNextIdx );
			recArray = new YCFBamParamBuff[0];
		}
		return( recArray );
	}

	public YCFBamParamBuff[] readDerivedByContPrevIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ServerMethodId,
		Long PrevId )
	{
		final String S_ProcName = "YCFBamRamParam.readDerivedByContPrevIdx";
		YCFBamParamByContPrevIdxKey key = schema.getFactoryParam().newContPrevIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredServerMethodId( ServerMethodId );
		key.setOptionalPrevId( PrevId );

		YCFBamParamBuff[] recArray;
		if( dictByContPrevIdx.containsKey( key ) ) {
			Map< YCFBamParamPKey, YCFBamParamBuff > subdictContPrevIdx
				= dictByContPrevIdx.get( key );
			recArray = new YCFBamParamBuff[ subdictContPrevIdx.size() ];
			Iterator< YCFBamParamBuff > iter = subdictContPrevIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamParamPKey, YCFBamParamBuff > subdictContPrevIdx
				= new HashMap< YCFBamParamPKey, YCFBamParamBuff >();
			dictByContPrevIdx.put( key, subdictContPrevIdx );
			recArray = new YCFBamParamBuff[0];
		}
		return( recArray );
	}

	public YCFBamParamBuff[] readDerivedByContNextIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ServerMethodId,
		Long NextId )
	{
		final String S_ProcName = "YCFBamRamParam.readDerivedByContNextIdx";
		YCFBamParamByContNextIdxKey key = schema.getFactoryParam().newContNextIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredServerMethodId( ServerMethodId );
		key.setOptionalNextId( NextId );

		YCFBamParamBuff[] recArray;
		if( dictByContNextIdx.containsKey( key ) ) {
			Map< YCFBamParamPKey, YCFBamParamBuff > subdictContNextIdx
				= dictByContNextIdx.get( key );
			recArray = new YCFBamParamBuff[ subdictContNextIdx.size() ];
			Iterator< YCFBamParamBuff > iter = subdictContNextIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamParamPKey, YCFBamParamBuff > subdictContNextIdx
				= new HashMap< YCFBamParamPKey, YCFBamParamBuff >();
			dictByContNextIdx.put( key, subdictContNextIdx );
			recArray = new YCFBamParamBuff[0];
		}
		return( recArray );
	}

	public YCFBamParamBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamParam.readDerivedByIdIdx() ";
		YCFBamParamPKey key = schema.getFactoryParam().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamParamBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamParamBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamParamPKey PKey )
	{
		final String S_ProcName = "YCFBamRamParam.readBuff";
		YCFBamParamBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a832" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamParamBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamParamPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamParamBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a832" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamParamBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamParam.readAllBuff";
		YCFBamParamBuff buff;
		ArrayList<YCFBamParamBuff> filteredList = new ArrayList<YCFBamParamBuff>();
		YCFBamParamBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a832" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamParamBuff[0] ) );
	}

	public YCFBamParamBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamParam.readBuffByIdIdx() ";
		YCFBamParamBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a832" ) ) {
			return( (YCFBamParamBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamParamBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ServerMethodId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamParam.readBuffByUNameIdx() ";
		YCFBamParamBuff buff = readDerivedByUNameIdx( Authorization,
			TenantId,
			ServerMethodId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a832" ) ) {
			return( (YCFBamParamBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamParamBuff[] readBuffByValTentIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamParam.readBuffByValTentIdx() ";
		YCFBamParamBuff buff;
		ArrayList<YCFBamParamBuff> filteredList = new ArrayList<YCFBamParamBuff>();
		YCFBamParamBuff[] buffList = readDerivedByValTentIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a832" ) ) {
				filteredList.add( (YCFBamParamBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamParamBuff[0] ) );
	}

	public YCFBamParamBuff[] readBuffByServerMethodIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ServerMethodId )
	{
		final String S_ProcName = "YCFBamRamParam.readBuffByServerMethodIdx() ";
		YCFBamParamBuff buff;
		ArrayList<YCFBamParamBuff> filteredList = new ArrayList<YCFBamParamBuff>();
		YCFBamParamBuff[] buffList = readDerivedByServerMethodIdx( Authorization,
			TenantId,
			ServerMethodId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a832" ) ) {
				filteredList.add( (YCFBamParamBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamParamBuff[0] ) );
	}

	public YCFBamParamBuff[] readBuffByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "YCFBamRamParam.readBuffByDefSchemaIdx() ";
		YCFBamParamBuff buff;
		ArrayList<YCFBamParamBuff> filteredList = new ArrayList<YCFBamParamBuff>();
		YCFBamParamBuff[] buffList = readDerivedByDefSchemaIdx( Authorization,
			DefSchemaTenantId,
			DefSchemaId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a832" ) ) {
				filteredList.add( (YCFBamParamBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamParamBuff[0] ) );
	}

	public YCFBamParamBuff[] readBuffByServerTypeIdx( YCFSecAuthorization Authorization,
		Long TypeTenantId,
		Long TypeId )
	{
		final String S_ProcName = "YCFBamRamParam.readBuffByServerTypeIdx() ";
		YCFBamParamBuff buff;
		ArrayList<YCFBamParamBuff> filteredList = new ArrayList<YCFBamParamBuff>();
		YCFBamParamBuff[] buffList = readDerivedByServerTypeIdx( Authorization,
			TypeTenantId,
			TypeId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a832" ) ) {
				filteredList.add( (YCFBamParamBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamParamBuff[0] ) );
	}

	public YCFBamParamBuff[] readBuffByPrevIdx( YCFSecAuthorization Authorization,
		Long PrevTenantId,
		Long PrevId )
	{
		final String S_ProcName = "YCFBamRamParam.readBuffByPrevIdx() ";
		YCFBamParamBuff buff;
		ArrayList<YCFBamParamBuff> filteredList = new ArrayList<YCFBamParamBuff>();
		YCFBamParamBuff[] buffList = readDerivedByPrevIdx( Authorization,
			PrevTenantId,
			PrevId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a832" ) ) {
				filteredList.add( (YCFBamParamBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamParamBuff[0] ) );
	}

	public YCFBamParamBuff[] readBuffByNextIdx( YCFSecAuthorization Authorization,
		Long NextTenantId,
		Long NextId )
	{
		final String S_ProcName = "YCFBamRamParam.readBuffByNextIdx() ";
		YCFBamParamBuff buff;
		ArrayList<YCFBamParamBuff> filteredList = new ArrayList<YCFBamParamBuff>();
		YCFBamParamBuff[] buffList = readDerivedByNextIdx( Authorization,
			NextTenantId,
			NextId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a832" ) ) {
				filteredList.add( (YCFBamParamBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamParamBuff[0] ) );
	}

	public YCFBamParamBuff[] readBuffByContPrevIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ServerMethodId,
		Long PrevId )
	{
		final String S_ProcName = "YCFBamRamParam.readBuffByContPrevIdx() ";
		YCFBamParamBuff buff;
		ArrayList<YCFBamParamBuff> filteredList = new ArrayList<YCFBamParamBuff>();
		YCFBamParamBuff[] buffList = readDerivedByContPrevIdx( Authorization,
			TenantId,
			ServerMethodId,
			PrevId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a832" ) ) {
				filteredList.add( (YCFBamParamBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamParamBuff[0] ) );
	}

	public YCFBamParamBuff[] readBuffByContNextIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long ServerMethodId,
		Long NextId )
	{
		final String S_ProcName = "YCFBamRamParam.readBuffByContNextIdx() ";
		YCFBamParamBuff buff;
		ArrayList<YCFBamParamBuff> filteredList = new ArrayList<YCFBamParamBuff>();
		YCFBamParamBuff[] buffList = readDerivedByContNextIdx( Authorization,
			TenantId,
			ServerMethodId,
			NextId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a832" ) ) {
				filteredList.add( (YCFBamParamBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamParamBuff[0] ) );
	}

	/**
	 *	Move the specified buffer up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	public YCFBamParamBuff moveBuffUp( YCFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision )
	{
		final String S_ProcName = "moveBuffUp";

		YCFBamParamBuff grandprev = null;
		YCFBamParamBuff prev = null;
		YCFBamParamBuff cur = null;
		YCFBamParamBuff next = null;

		cur = schema.getTableParam().readDerivedByIdIdx(Authorization, TenantId, Id);
		if( cur == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object" );
		}

		if( ( cur.getOptionalPrevTenantId() == null )
			&& ( cur.getOptionalPrevId() == null ) )
		{
			return( (YCFBamParamBuff)cur );
		}

		prev = schema.getTableParam().readDerivedByIdIdx(Authorization, cur.getOptionalPrevTenantId(), cur.getOptionalPrevId() );
		if( prev == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object.prev" );
		}

		if( ( prev.getOptionalPrevTenantId() != null )
			&& ( prev.getOptionalPrevId() != null ) )
		{
			grandprev = schema.getTableParam().readDerivedByIdIdx(Authorization, prev.getOptionalPrevTenantId(), prev.getOptionalPrevId() );
			if( grandprev == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.prev.prev" );
			}
		}

		if( ( cur.getOptionalNextTenantId() != null )
			&& ( cur.getOptionalNextId() != null ) )
		{
			next = schema.getTableParam().readDerivedByIdIdx(Authorization, cur.getOptionalNextTenantId(), cur.getOptionalNextId() );
			if( next == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.next" );
			}
		}

		String classCode = prev.getClassCode();
		YCFBamParamBuff newInstance;
			if( classCode.equals( "a832" ) ) {
				newInstance = schema.getFactoryParam().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamParamBuff editPrev = newInstance;
		editPrev.set( prev );

		classCode = cur.getClassCode();
			if( classCode.equals( "a832" ) ) {
				newInstance = schema.getFactoryParam().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamParamBuff editCur = newInstance;
		editCur.set( cur );

		YCFBamParamBuff editGrandprev = null;
		if( grandprev != null ) {
			classCode = grandprev.getClassCode();
			if( classCode.equals( "a832" ) ) {
				newInstance = schema.getFactoryParam().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editGrandprev = newInstance;
			editGrandprev.set( grandprev );
		}

		YCFBamParamBuff editNext = null;
		if( next != null ) {
			classCode = next.getClassCode();
			if( classCode.equals( "a832" ) ) {
				newInstance = schema.getFactoryParam().newBuff();
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
			if( classCode.equals( "a832" ) ) {
				schema.getTableParam().updateParam( Authorization, editGrandprev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		classCode = editPrev.getClassCode();
			if( classCode.equals( "a832" ) ) {
				schema.getTableParam().updateParam( Authorization, editPrev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		classCode = editCur.getClassCode();
			if( classCode.equals( "a832" ) ) {
				schema.getTableParam().updateParam( Authorization, editCur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		if( editNext != null ) {
			classCode = editNext.getClassCode();
			if( classCode.equals( "a832" ) ) {
				schema.getTableParam().updateParam( Authorization, editNext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		return( (YCFBamParamBuff)editCur );
	}

	/**
	 *	Move the specified buffer down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed buffer after it has been moved
	 */
	public YCFBamParamBuff moveBuffDown( YCFSecAuthorization Authorization,
		long TenantId,
		long Id,
		int revision )
	{
		final String S_ProcName = "moveBuffDown";

		YCFBamParamBuff prev = null;
		YCFBamParamBuff cur = null;
		YCFBamParamBuff next = null;
		YCFBamParamBuff grandnext = null;

		cur = schema.getTableParam().readDerivedByIdIdx(Authorization, TenantId, Id);
		if( cur == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object" );
		}

		if( ( cur.getOptionalNextTenantId() == null )
			&& ( cur.getOptionalNextId() == null ) )
		{
			return( (YCFBamParamBuff)cur );
		}

		next = schema.getTableParam().readDerivedByIdIdx(Authorization, cur.getOptionalNextTenantId(), cur.getOptionalNextId() );
		if( next == null ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				S_ProcName,
				"Could not locate object.next" );
		}

		if( ( next.getOptionalNextTenantId() != null )
			&& ( next.getOptionalNextId() != null ) )
		{
			grandnext = schema.getTableParam().readDerivedByIdIdx(Authorization, next.getOptionalNextTenantId(), next.getOptionalNextId() );
			if( grandnext == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.next.next" );
			}
		}

		if( ( cur.getOptionalPrevTenantId() != null )
			&& ( cur.getOptionalPrevId() != null ) )
		{
			prev = schema.getTableParam().readDerivedByIdIdx(Authorization, cur.getOptionalPrevTenantId(), cur.getOptionalPrevId() );
			if( prev == null ) {
				throw new YCFLibCollisionDetectedException( getClass(),
					S_ProcName,
					"Could not locate object.prev" );
			}
		}

		String classCode = cur.getClassCode();
		YCFBamParamBuff newInstance;
			if( classCode.equals( "a832" ) ) {
				newInstance = schema.getFactoryParam().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamParamBuff editCur = newInstance;
		editCur.set( cur );

		classCode = next.getClassCode();
			if( classCode.equals( "a832" ) ) {
				newInstance = schema.getFactoryParam().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		YCFBamParamBuff editNext = newInstance;
		editNext.set( next );

		YCFBamParamBuff editGrandnext = null;
		if( grandnext != null ) {
			classCode = grandnext.getClassCode();
			if( classCode.equals( "a832" ) ) {
				newInstance = schema.getFactoryParam().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editGrandnext = newInstance;
			editGrandnext.set( grandnext );
		}

		YCFBamParamBuff editPrev = null;
		if( prev != null ) {
			classCode = prev.getClassCode();
			if( classCode.equals( "a832" ) ) {
				newInstance = schema.getFactoryParam().newBuff();
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
			if( classCode.equals( "a832" ) ) {
				schema.getTableParam().updateParam( Authorization, editPrev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		classCode = editCur.getClassCode();
			if( classCode.equals( "a832" ) ) {
				schema.getTableParam().updateParam( Authorization, editCur );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		classCode = editNext.getClassCode();
			if( classCode.equals( "a832" ) ) {
				schema.getTableParam().updateParam( Authorization, editNext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}

		if( editGrandnext != null ) {
			classCode = editGrandnext.getClassCode();
			if( classCode.equals( "a832" ) ) {
				schema.getTableParam().updateParam( Authorization, editGrandnext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		return( (YCFBamParamBuff)editCur );
	}

	public void updateParam( YCFSecAuthorization Authorization,
		YCFBamParamBuff Buff )
	{
		YCFBamParamPKey pkey = schema.getFactoryParam().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamParamBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateParam",
				"Existing record not found",
				"Param",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateParam",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFBamParamByUNameIdxKey existingKeyUNameIdx = schema.getFactoryParam().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyUNameIdx.setRequiredServerMethodId( existing.getRequiredServerMethodId() );
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamParamByUNameIdxKey newKeyUNameIdx = schema.getFactoryParam().newUNameIdxKey();
		newKeyUNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyUNameIdx.setRequiredServerMethodId( Buff.getRequiredServerMethodId() );
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamParamByValTentIdxKey existingKeyValTentIdx = schema.getFactoryParam().newValTentIdxKey();
		existingKeyValTentIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFBamParamByValTentIdxKey newKeyValTentIdx = schema.getFactoryParam().newValTentIdxKey();
		newKeyValTentIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFBamParamByServerMethodIdxKey existingKeyServerMethodIdx = schema.getFactoryParam().newServerMethodIdxKey();
		existingKeyServerMethodIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyServerMethodIdx.setRequiredServerMethodId( existing.getRequiredServerMethodId() );

		YCFBamParamByServerMethodIdxKey newKeyServerMethodIdx = schema.getFactoryParam().newServerMethodIdxKey();
		newKeyServerMethodIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyServerMethodIdx.setRequiredServerMethodId( Buff.getRequiredServerMethodId() );

		YCFBamParamByDefSchemaIdxKey existingKeyDefSchemaIdx = schema.getFactoryParam().newDefSchemaIdxKey();
		existingKeyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		existingKeyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		YCFBamParamByDefSchemaIdxKey newKeyDefSchemaIdx = schema.getFactoryParam().newDefSchemaIdxKey();
		newKeyDefSchemaIdx.setOptionalDefSchemaTenantId( Buff.getOptionalDefSchemaTenantId() );
		newKeyDefSchemaIdx.setOptionalDefSchemaId( Buff.getOptionalDefSchemaId() );

		YCFBamParamByServerTypeIdxKey existingKeyServerTypeIdx = schema.getFactoryParam().newServerTypeIdxKey();
		existingKeyServerTypeIdx.setOptionalTypeTenantId( existing.getOptionalTypeTenantId() );
		existingKeyServerTypeIdx.setOptionalTypeId( existing.getOptionalTypeId() );

		YCFBamParamByServerTypeIdxKey newKeyServerTypeIdx = schema.getFactoryParam().newServerTypeIdxKey();
		newKeyServerTypeIdx.setOptionalTypeTenantId( Buff.getOptionalTypeTenantId() );
		newKeyServerTypeIdx.setOptionalTypeId( Buff.getOptionalTypeId() );

		YCFBamParamByPrevIdxKey existingKeyPrevIdx = schema.getFactoryParam().newPrevIdxKey();
		existingKeyPrevIdx.setOptionalPrevTenantId( existing.getOptionalPrevTenantId() );
		existingKeyPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamParamByPrevIdxKey newKeyPrevIdx = schema.getFactoryParam().newPrevIdxKey();
		newKeyPrevIdx.setOptionalPrevTenantId( Buff.getOptionalPrevTenantId() );
		newKeyPrevIdx.setOptionalPrevId( Buff.getOptionalPrevId() );

		YCFBamParamByNextIdxKey existingKeyNextIdx = schema.getFactoryParam().newNextIdxKey();
		existingKeyNextIdx.setOptionalNextTenantId( existing.getOptionalNextTenantId() );
		existingKeyNextIdx.setOptionalNextId( existing.getOptionalNextId() );

		YCFBamParamByNextIdxKey newKeyNextIdx = schema.getFactoryParam().newNextIdxKey();
		newKeyNextIdx.setOptionalNextTenantId( Buff.getOptionalNextTenantId() );
		newKeyNextIdx.setOptionalNextId( Buff.getOptionalNextId() );

		YCFBamParamByContPrevIdxKey existingKeyContPrevIdx = schema.getFactoryParam().newContPrevIdxKey();
		existingKeyContPrevIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyContPrevIdx.setRequiredServerMethodId( existing.getRequiredServerMethodId() );
		existingKeyContPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamParamByContPrevIdxKey newKeyContPrevIdx = schema.getFactoryParam().newContPrevIdxKey();
		newKeyContPrevIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyContPrevIdx.setRequiredServerMethodId( Buff.getRequiredServerMethodId() );
		newKeyContPrevIdx.setOptionalPrevId( Buff.getOptionalPrevId() );

		YCFBamParamByContNextIdxKey existingKeyContNextIdx = schema.getFactoryParam().newContNextIdxKey();
		existingKeyContNextIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyContNextIdx.setRequiredServerMethodId( existing.getRequiredServerMethodId() );
		existingKeyContNextIdx.setOptionalNextId( existing.getOptionalNextId() );

		YCFBamParamByContNextIdxKey newKeyContNextIdx = schema.getFactoryParam().newContNextIdxKey();
		newKeyContNextIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyContNextIdx.setRequiredServerMethodId( Buff.getRequiredServerMethodId() );
		newKeyContNextIdx.setOptionalNextId( Buff.getOptionalNextId() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateParam",
					"ParamUNameIdx",
					newKeyUNameIdx );
			}
		}

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableServerMethod().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredServerMethodId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateParam",
						"Container",
						"ServerMethod",
						"ServerMethod",
						null );
				}
			}
		}

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableTenant().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateParam",
						"Owner",
						"Tenant",
						"Tenant",
						null );
				}
			}
		}

		{
			boolean allNull = true;
			if( Buff.getOptionalTypeTenantId() != null ) {
				allNull = false;
			}			if( Buff.getOptionalTypeId() != null ) {
				allNull = false;
			}
			if( allNull ) {
				if( null == schema.getTableValue().readDerivedByIdIdx( Authorization,
						Buff.getOptionalTypeTenantId(),
						Buff.getOptionalTypeId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateParam",
						"Lookup",
						"Type",
						"Value",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamParamPKey, YCFBamParamBuff > subdict;

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
			subdict = new HashMap< YCFBamParamPKey, YCFBamParamBuff >();
			dictByValTentIdx.put( newKeyValTentIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByServerMethodIdx.get( existingKeyServerMethodIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByServerMethodIdx.containsKey( newKeyServerMethodIdx ) ) {
			subdict = dictByServerMethodIdx.get( newKeyServerMethodIdx );
		}
		else {
			subdict = new HashMap< YCFBamParamPKey, YCFBamParamBuff >();
			dictByServerMethodIdx.put( newKeyServerMethodIdx, subdict );
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
			subdict = new HashMap< YCFBamParamPKey, YCFBamParamBuff >();
			dictByDefSchemaIdx.put( newKeyDefSchemaIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByServerTypeIdx.get( existingKeyServerTypeIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByServerTypeIdx.containsKey( newKeyServerTypeIdx ) ) {
			subdict = dictByServerTypeIdx.get( newKeyServerTypeIdx );
		}
		else {
			subdict = new HashMap< YCFBamParamPKey, YCFBamParamBuff >();
			dictByServerTypeIdx.put( newKeyServerTypeIdx, subdict );
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
			subdict = new HashMap< YCFBamParamPKey, YCFBamParamBuff >();
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
			subdict = new HashMap< YCFBamParamPKey, YCFBamParamBuff >();
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
			subdict = new HashMap< YCFBamParamPKey, YCFBamParamBuff >();
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
			subdict = new HashMap< YCFBamParamPKey, YCFBamParamBuff >();
			dictByContNextIdx.put( newKeyContNextIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteParam( YCFSecAuthorization Authorization,
		YCFBamParamBuff Buff )
	{
		final String S_ProcName = "YCFBamRamParamTable.deleteParam() ";
		String classCode;
		YCFBamParamPKey pkey = schema.getFactoryParam().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamParamBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteParam",
				pkey );
		}
		long varTenantId = existing.getRequiredTenantId();
		long varServerMethodId = existing.getRequiredServerMethodId();
		YCFBamServerMethodBuff container = schema.getTableServerMethod().readDerivedByIdIdx( Authorization,
			varTenantId,
			varServerMethodId );
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

		YCFBamParamBuff prev = null;
		if( ( prevTenantId != null )
			&& ( prevId != null ) )
		{
			prev = schema.getTableParam().readDerivedByIdIdx( Authorization,
				prevTenantId,
				prevId );
			if( prev == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"prev" );
			}
			YCFBamParamBuff editPrev;
			classCode = prev.getClassCode();
			if( classCode.equals( "a832" ) ) {
				editPrev = schema.getFactoryParam().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editPrev.set( prev );
			editPrev.setOptionalNextTenantId( nextTenantId );
			editPrev.setOptionalNextId( nextId );
			if( classCode.equals( "a832" ) ) {
				schema.getTableParam().updateParam( Authorization, editPrev );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		YCFBamParamBuff next = null;
		if( ( nextTenantId != null )
			&& ( nextId != null ) )
		{
			next = schema.getTableParam().readDerivedByIdIdx( Authorization,
				nextTenantId,
				nextId );
			if( next == null ) {
				throw new YCFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"next" );
			}
			YCFBamParamBuff editNext;
			classCode = next.getClassCode();
			if( classCode.equals( "a832" ) ) {
				editNext = schema.getFactoryParam().newBuff();
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
			editNext.set( next );
			editNext.setOptionalPrevTenantId( prevTenantId );
			editNext.setOptionalPrevId( prevId );
			if( classCode.equals( "a832" ) ) {
				schema.getTableParam().updateParam( Authorization, editNext );
			}
			else {
				throw new YCFLibUnsupportedClassException( getClass(),
					S_ProcName,
					"Unrecognized ClassCode \"" + classCode + "\"" );
			}
		}

		YCFBamParamByUNameIdxKey keyUNameIdx = schema.getFactoryParam().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredServerMethodId( existing.getRequiredServerMethodId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamParamByValTentIdxKey keyValTentIdx = schema.getFactoryParam().newValTentIdxKey();
		keyValTentIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFBamParamByServerMethodIdxKey keyServerMethodIdx = schema.getFactoryParam().newServerMethodIdxKey();
		keyServerMethodIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyServerMethodIdx.setRequiredServerMethodId( existing.getRequiredServerMethodId() );

		YCFBamParamByDefSchemaIdxKey keyDefSchemaIdx = schema.getFactoryParam().newDefSchemaIdxKey();
		keyDefSchemaIdx.setOptionalDefSchemaTenantId( existing.getOptionalDefSchemaTenantId() );
		keyDefSchemaIdx.setOptionalDefSchemaId( existing.getOptionalDefSchemaId() );

		YCFBamParamByServerTypeIdxKey keyServerTypeIdx = schema.getFactoryParam().newServerTypeIdxKey();
		keyServerTypeIdx.setOptionalTypeTenantId( existing.getOptionalTypeTenantId() );
		keyServerTypeIdx.setOptionalTypeId( existing.getOptionalTypeId() );

		YCFBamParamByPrevIdxKey keyPrevIdx = schema.getFactoryParam().newPrevIdxKey();
		keyPrevIdx.setOptionalPrevTenantId( existing.getOptionalPrevTenantId() );
		keyPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamParamByNextIdxKey keyNextIdx = schema.getFactoryParam().newNextIdxKey();
		keyNextIdx.setOptionalNextTenantId( existing.getOptionalNextTenantId() );
		keyNextIdx.setOptionalNextId( existing.getOptionalNextId() );

		YCFBamParamByContPrevIdxKey keyContPrevIdx = schema.getFactoryParam().newContPrevIdxKey();
		keyContPrevIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyContPrevIdx.setRequiredServerMethodId( existing.getRequiredServerMethodId() );
		keyContPrevIdx.setOptionalPrevId( existing.getOptionalPrevId() );

		YCFBamParamByContNextIdxKey keyContNextIdx = schema.getFactoryParam().newContNextIdxKey();
		keyContNextIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyContNextIdx.setRequiredServerMethodId( existing.getRequiredServerMethodId() );
		keyContNextIdx.setOptionalNextId( existing.getOptionalNextId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFBamParamPKey, YCFBamParamBuff > subdict;

		dictByPKey.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

		subdict = dictByValTentIdx.get( keyValTentIdx );
		subdict.remove( pkey );

		subdict = dictByServerMethodIdx.get( keyServerMethodIdx );
		subdict.remove( pkey );

		subdict = dictByDefSchemaIdx.get( keyDefSchemaIdx );
		subdict.remove( pkey );

		subdict = dictByServerTypeIdx.get( keyServerTypeIdx );
		subdict.remove( pkey );

		subdict = dictByPrevIdx.get( keyPrevIdx );
		subdict.remove( pkey );

		subdict = dictByNextIdx.get( keyNextIdx );
		subdict.remove( pkey );

		subdict = dictByContPrevIdx.get( keyContPrevIdx );
		subdict.remove( pkey );

		subdict = dictByContNextIdx.get( keyContNextIdx );
		subdict.remove( pkey );

	}
	public void deleteParamByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamParamPKey key = schema.getFactoryParam().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteParamByIdIdx( Authorization, key );
	}

	public void deleteParamByIdIdx( YCFSecAuthorization Authorization,
		YCFBamParamPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamParamBuff cur;
		LinkedList<YCFBamParamBuff> matchSet = new LinkedList<YCFBamParamBuff>();
		Iterator<YCFBamParamBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamParamBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableParam().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteParam( Authorization, cur );
		}
	}

	public void deleteParamByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argServerMethodId,
		String argName )
	{
		YCFBamParamByUNameIdxKey key = schema.getFactoryParam().newUNameIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredServerMethodId( argServerMethodId );
		key.setRequiredName( argName );
		deleteParamByUNameIdx( Authorization, key );
	}

	public void deleteParamByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamParamByUNameIdxKey argKey )
	{
		YCFBamParamBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamParamBuff> matchSet = new LinkedList<YCFBamParamBuff>();
		Iterator<YCFBamParamBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamParamBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableParam().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteParam( Authorization, cur );
		}
	}

	public void deleteParamByValTentIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamParamByValTentIdxKey key = schema.getFactoryParam().newValTentIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteParamByValTentIdx( Authorization, key );
	}

	public void deleteParamByValTentIdx( YCFSecAuthorization Authorization,
		YCFBamParamByValTentIdxKey argKey )
	{
		YCFBamParamBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamParamBuff> matchSet = new LinkedList<YCFBamParamBuff>();
		Iterator<YCFBamParamBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamParamBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableParam().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteParam( Authorization, cur );
		}
	}

	public void deleteParamByServerMethodIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argServerMethodId )
	{
		YCFBamParamByServerMethodIdxKey key = schema.getFactoryParam().newServerMethodIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredServerMethodId( argServerMethodId );
		deleteParamByServerMethodIdx( Authorization, key );
	}

	public void deleteParamByServerMethodIdx( YCFSecAuthorization Authorization,
		YCFBamParamByServerMethodIdxKey argKey )
	{
		YCFBamParamBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamParamBuff> matchSet = new LinkedList<YCFBamParamBuff>();
		Iterator<YCFBamParamBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamParamBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableParam().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteParam( Authorization, cur );
		}
	}

	public void deleteParamByDefSchemaIdx( YCFSecAuthorization Authorization,
		Long argDefSchemaTenantId,
		Long argDefSchemaId )
	{
		YCFBamParamByDefSchemaIdxKey key = schema.getFactoryParam().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( argDefSchemaTenantId );
		key.setOptionalDefSchemaId( argDefSchemaId );
		deleteParamByDefSchemaIdx( Authorization, key );
	}

	public void deleteParamByDefSchemaIdx( YCFSecAuthorization Authorization,
		YCFBamParamByDefSchemaIdxKey argKey )
	{
		YCFBamParamBuff cur;
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
		LinkedList<YCFBamParamBuff> matchSet = new LinkedList<YCFBamParamBuff>();
		Iterator<YCFBamParamBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamParamBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableParam().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteParam( Authorization, cur );
		}
	}

	public void deleteParamByServerTypeIdx( YCFSecAuthorization Authorization,
		Long argTypeTenantId,
		Long argTypeId )
	{
		YCFBamParamByServerTypeIdxKey key = schema.getFactoryParam().newServerTypeIdxKey();
		key.setOptionalTypeTenantId( argTypeTenantId );
		key.setOptionalTypeId( argTypeId );
		deleteParamByServerTypeIdx( Authorization, key );
	}

	public void deleteParamByServerTypeIdx( YCFSecAuthorization Authorization,
		YCFBamParamByServerTypeIdxKey argKey )
	{
		YCFBamParamBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalTypeTenantId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalTypeId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamParamBuff> matchSet = new LinkedList<YCFBamParamBuff>();
		Iterator<YCFBamParamBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamParamBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableParam().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteParam( Authorization, cur );
		}
	}

	public void deleteParamByPrevIdx( YCFSecAuthorization Authorization,
		Long argPrevTenantId,
		Long argPrevId )
	{
		YCFBamParamByPrevIdxKey key = schema.getFactoryParam().newPrevIdxKey();
		key.setOptionalPrevTenantId( argPrevTenantId );
		key.setOptionalPrevId( argPrevId );
		deleteParamByPrevIdx( Authorization, key );
	}

	public void deleteParamByPrevIdx( YCFSecAuthorization Authorization,
		YCFBamParamByPrevIdxKey argKey )
	{
		YCFBamParamBuff cur;
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
		LinkedList<YCFBamParamBuff> matchSet = new LinkedList<YCFBamParamBuff>();
		Iterator<YCFBamParamBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamParamBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableParam().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteParam( Authorization, cur );
		}
	}

	public void deleteParamByNextIdx( YCFSecAuthorization Authorization,
		Long argNextTenantId,
		Long argNextId )
	{
		YCFBamParamByNextIdxKey key = schema.getFactoryParam().newNextIdxKey();
		key.setOptionalNextTenantId( argNextTenantId );
		key.setOptionalNextId( argNextId );
		deleteParamByNextIdx( Authorization, key );
	}

	public void deleteParamByNextIdx( YCFSecAuthorization Authorization,
		YCFBamParamByNextIdxKey argKey )
	{
		YCFBamParamBuff cur;
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
		LinkedList<YCFBamParamBuff> matchSet = new LinkedList<YCFBamParamBuff>();
		Iterator<YCFBamParamBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamParamBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableParam().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteParam( Authorization, cur );
		}
	}

	public void deleteParamByContPrevIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argServerMethodId,
		Long argPrevId )
	{
		YCFBamParamByContPrevIdxKey key = schema.getFactoryParam().newContPrevIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredServerMethodId( argServerMethodId );
		key.setOptionalPrevId( argPrevId );
		deleteParamByContPrevIdx( Authorization, key );
	}

	public void deleteParamByContPrevIdx( YCFSecAuthorization Authorization,
		YCFBamParamByContPrevIdxKey argKey )
	{
		YCFBamParamBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( argKey.getOptionalPrevId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamParamBuff> matchSet = new LinkedList<YCFBamParamBuff>();
		Iterator<YCFBamParamBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamParamBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableParam().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteParam( Authorization, cur );
		}
	}

	public void deleteParamByContNextIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argServerMethodId,
		Long argNextId )
	{
		YCFBamParamByContNextIdxKey key = schema.getFactoryParam().newContNextIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredServerMethodId( argServerMethodId );
		key.setOptionalNextId( argNextId );
		deleteParamByContNextIdx( Authorization, key );
	}

	public void deleteParamByContNextIdx( YCFSecAuthorization Authorization,
		YCFBamParamByContNextIdxKey argKey )
	{
		YCFBamParamBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( argKey.getOptionalNextId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamParamBuff> matchSet = new LinkedList<YCFBamParamBuff>();
		Iterator<YCFBamParamBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamParamBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableParam().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteParam( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
