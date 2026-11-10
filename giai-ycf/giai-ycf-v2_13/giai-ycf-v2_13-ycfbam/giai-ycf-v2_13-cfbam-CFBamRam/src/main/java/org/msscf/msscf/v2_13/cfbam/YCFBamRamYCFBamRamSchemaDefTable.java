
// Description: Java 11 in-memory RAM DbIO implementation for SchemaDef.

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
 *	YCFBamRamSchemaDefTable in-memory RAM DbIO implementation
 *	for SchemaDef.
 */
public class YCFBamRamSchemaDefTable
	implements IYCFBamSchemaDefTable
{
	private IYCFBamSchema schema;
	private Map< YCFBamScopePKey,
				YCFBamSchemaDefBuff > dictByPKey
		= new HashMap< YCFBamScopePKey,
				YCFBamSchemaDefBuff >();
	private Map< YCFBamSchemaDefByCTenantIdxKey,
				Map< YCFBamScopePKey,
					YCFBamSchemaDefBuff >> dictByCTenantIdx
		= new HashMap< YCFBamSchemaDefByCTenantIdxKey,
				Map< YCFBamScopePKey,
					YCFBamSchemaDefBuff >>();
	private Map< YCFBamSchemaDefByMinorVersionIdxKey,
				Map< YCFBamScopePKey,
					YCFBamSchemaDefBuff >> dictByMinorVersionIdx
		= new HashMap< YCFBamSchemaDefByMinorVersionIdxKey,
				Map< YCFBamScopePKey,
					YCFBamSchemaDefBuff >>();
	private Map< YCFBamSchemaDefByUNameIdxKey,
			YCFBamSchemaDefBuff > dictByUNameIdx
		= new HashMap< YCFBamSchemaDefByUNameIdxKey,
			YCFBamSchemaDefBuff >();
	private Map< YCFBamSchemaDefByAuthEMailIdxKey,
				Map< YCFBamScopePKey,
					YCFBamSchemaDefBuff >> dictByAuthEMailIdx
		= new HashMap< YCFBamSchemaDefByAuthEMailIdxKey,
				Map< YCFBamScopePKey,
					YCFBamSchemaDefBuff >>();
	private Map< YCFBamSchemaDefByProjectURLIdxKey,
				Map< YCFBamScopePKey,
					YCFBamSchemaDefBuff >> dictByProjectURLIdx
		= new HashMap< YCFBamSchemaDefByProjectURLIdxKey,
				Map< YCFBamScopePKey,
					YCFBamSchemaDefBuff >>();
	private Map< YCFBamSchemaDefByPubURIIdxKey,
			YCFBamSchemaDefBuff > dictByPubURIIdx
		= new HashMap< YCFBamSchemaDefByPubURIIdxKey,
			YCFBamSchemaDefBuff >();

	public YCFBamRamSchemaDefTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createSchemaDef( YCFSecAuthorization Authorization,
		YCFBamSchemaDefBuff Buff )
	{
		final String S_ProcName = "createSchemaDef";
		schema.getTableScope().createScope( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setClassCode( Buff.getClassCode() );
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamSchemaDefByCTenantIdxKey keyCTenantIdx = schema.getFactorySchemaDef().newCTenantIdxKey();
		keyCTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFBamSchemaDefByMinorVersionIdxKey keyMinorVersionIdx = schema.getFactorySchemaDef().newMinorVersionIdxKey();
		keyMinorVersionIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyMinorVersionIdx.setRequiredMinorVersionId( Buff.getRequiredMinorVersionId() );

		YCFBamSchemaDefByUNameIdxKey keyUNameIdx = schema.getFactorySchemaDef().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyUNameIdx.setRequiredMinorVersionId( Buff.getRequiredMinorVersionId() );
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamSchemaDefByAuthEMailIdxKey keyAuthEMailIdx = schema.getFactorySchemaDef().newAuthEMailIdxKey();
		keyAuthEMailIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyAuthEMailIdx.setRequiredAuthorEMail( Buff.getRequiredAuthorEMail() );

		YCFBamSchemaDefByProjectURLIdxKey keyProjectURLIdx = schema.getFactorySchemaDef().newProjectURLIdxKey();
		keyProjectURLIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyProjectURLIdx.setRequiredProjectURL( Buff.getRequiredProjectURL() );

		YCFBamSchemaDefByPubURIIdxKey keyPubURIIdx = schema.getFactorySchemaDef().newPubURIIdxKey();
		keyPubURIIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyPubURIIdx.setRequiredPublishURI( Buff.getRequiredPublishURI() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"SchemaDefUNameIdx",
				keyUNameIdx );
		}

		if( dictByPubURIIdx.containsKey( keyPubURIIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"SchemaPublishURIIdx",
				keyPubURIIdx );
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
				if( null == schema.getTableMinorVersion().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredMinorVersionId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"MinorVersion",
						"MinorVersion",
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
						"CTenant",
						"Tenant",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamSchemaDefBuff > subdictCTenantIdx;
		if( dictByCTenantIdx.containsKey( keyCTenantIdx ) ) {
			subdictCTenantIdx = dictByCTenantIdx.get( keyCTenantIdx );
		}
		else {
			subdictCTenantIdx = new HashMap< YCFBamScopePKey, YCFBamSchemaDefBuff >();
			dictByCTenantIdx.put( keyCTenantIdx, subdictCTenantIdx );
		}
		subdictCTenantIdx.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamSchemaDefBuff > subdictMinorVersionIdx;
		if( dictByMinorVersionIdx.containsKey( keyMinorVersionIdx ) ) {
			subdictMinorVersionIdx = dictByMinorVersionIdx.get( keyMinorVersionIdx );
		}
		else {
			subdictMinorVersionIdx = new HashMap< YCFBamScopePKey, YCFBamSchemaDefBuff >();
			dictByMinorVersionIdx.put( keyMinorVersionIdx, subdictMinorVersionIdx );
		}
		subdictMinorVersionIdx.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

		Map< YCFBamScopePKey, YCFBamSchemaDefBuff > subdictAuthEMailIdx;
		if( dictByAuthEMailIdx.containsKey( keyAuthEMailIdx ) ) {
			subdictAuthEMailIdx = dictByAuthEMailIdx.get( keyAuthEMailIdx );
		}
		else {
			subdictAuthEMailIdx = new HashMap< YCFBamScopePKey, YCFBamSchemaDefBuff >();
			dictByAuthEMailIdx.put( keyAuthEMailIdx, subdictAuthEMailIdx );
		}
		subdictAuthEMailIdx.put( pkey, Buff );

		Map< YCFBamScopePKey, YCFBamSchemaDefBuff > subdictProjectURLIdx;
		if( dictByProjectURLIdx.containsKey( keyProjectURLIdx ) ) {
			subdictProjectURLIdx = dictByProjectURLIdx.get( keyProjectURLIdx );
		}
		else {
			subdictProjectURLIdx = new HashMap< YCFBamScopePKey, YCFBamSchemaDefBuff >();
			dictByProjectURLIdx.put( keyProjectURLIdx, subdictProjectURLIdx );
		}
		subdictProjectURLIdx.put( pkey, Buff );

		dictByPubURIIdx.put( keyPubURIIdx, Buff );

	}

	public YCFBamSchemaDefBuff readDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamSchemaDef.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamSchemaDefBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamSchemaDefBuff lockDerived( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamSchemaDef.readDerived";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFBamSchemaDefBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamSchemaDefBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamSchemaDef.readAllDerived";
		YCFBamSchemaDefBuff[] retList = new YCFBamSchemaDefBuff[ dictByPKey.values().size() ];
		Iterator< YCFBamSchemaDefBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFBamSchemaDefBuff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
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
			ArrayList<YCFBamSchemaDefBuff> filteredList = new ArrayList<YCFBamSchemaDefBuff>();
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[idx];
				if( ( buff != null ) && ( buff instanceof YCFBamSchemaDefBuff ) ) {
					filteredList.add( (YCFBamSchemaDefBuff)buff );
				}
			}
			return( filteredList.toArray( new YCFBamSchemaDefBuff[0] ) );
		}
	}

	public YCFBamSchemaDefBuff[] readDerivedByCTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamSchemaDef.readDerivedByCTenantIdx";
		YCFBamSchemaDefByCTenantIdxKey key = schema.getFactorySchemaDef().newCTenantIdxKey();
		key.setRequiredTenantId( TenantId );

		YCFBamSchemaDefBuff[] recArray;
		if( dictByCTenantIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamSchemaDefBuff > subdictCTenantIdx
				= dictByCTenantIdx.get( key );
			recArray = new YCFBamSchemaDefBuff[ subdictCTenantIdx.size() ];
			Iterator< YCFBamSchemaDefBuff > iter = subdictCTenantIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamSchemaDefBuff > subdictCTenantIdx
				= new HashMap< YCFBamScopePKey, YCFBamSchemaDefBuff >();
			dictByCTenantIdx.put( key, subdictCTenantIdx );
			recArray = new YCFBamSchemaDefBuff[0];
		}
		return( recArray );
	}

	public YCFBamSchemaDefBuff[] readDerivedByMinorVersionIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long MinorVersionId )
	{
		final String S_ProcName = "YCFBamRamSchemaDef.readDerivedByMinorVersionIdx";
		YCFBamSchemaDefByMinorVersionIdxKey key = schema.getFactorySchemaDef().newMinorVersionIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredMinorVersionId( MinorVersionId );

		YCFBamSchemaDefBuff[] recArray;
		if( dictByMinorVersionIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamSchemaDefBuff > subdictMinorVersionIdx
				= dictByMinorVersionIdx.get( key );
			recArray = new YCFBamSchemaDefBuff[ subdictMinorVersionIdx.size() ];
			Iterator< YCFBamSchemaDefBuff > iter = subdictMinorVersionIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamSchemaDefBuff > subdictMinorVersionIdx
				= new HashMap< YCFBamScopePKey, YCFBamSchemaDefBuff >();
			dictByMinorVersionIdx.put( key, subdictMinorVersionIdx );
			recArray = new YCFBamSchemaDefBuff[0];
		}
		return( recArray );
	}

	public YCFBamSchemaDefBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long MinorVersionId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamSchemaDef.readDerivedByUNameIdx";
		YCFBamSchemaDefByUNameIdxKey key = schema.getFactorySchemaDef().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredMinorVersionId( MinorVersionId );
		key.setRequiredName( Name );

		YCFBamSchemaDefBuff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamSchemaDefBuff[] readDerivedByAuthEMailIdx( YCFSecAuthorization Authorization,
		long TenantId,
		String AuthorEMail )
	{
		final String S_ProcName = "YCFBamRamSchemaDef.readDerivedByAuthEMailIdx";
		YCFBamSchemaDefByAuthEMailIdxKey key = schema.getFactorySchemaDef().newAuthEMailIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredAuthorEMail( AuthorEMail );

		YCFBamSchemaDefBuff[] recArray;
		if( dictByAuthEMailIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamSchemaDefBuff > subdictAuthEMailIdx
				= dictByAuthEMailIdx.get( key );
			recArray = new YCFBamSchemaDefBuff[ subdictAuthEMailIdx.size() ];
			Iterator< YCFBamSchemaDefBuff > iter = subdictAuthEMailIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamSchemaDefBuff > subdictAuthEMailIdx
				= new HashMap< YCFBamScopePKey, YCFBamSchemaDefBuff >();
			dictByAuthEMailIdx.put( key, subdictAuthEMailIdx );
			recArray = new YCFBamSchemaDefBuff[0];
		}
		return( recArray );
	}

	public YCFBamSchemaDefBuff[] readDerivedByProjectURLIdx( YCFSecAuthorization Authorization,
		long TenantId,
		String ProjectURL )
	{
		final String S_ProcName = "YCFBamRamSchemaDef.readDerivedByProjectURLIdx";
		YCFBamSchemaDefByProjectURLIdxKey key = schema.getFactorySchemaDef().newProjectURLIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredProjectURL( ProjectURL );

		YCFBamSchemaDefBuff[] recArray;
		if( dictByProjectURLIdx.containsKey( key ) ) {
			Map< YCFBamScopePKey, YCFBamSchemaDefBuff > subdictProjectURLIdx
				= dictByProjectURLIdx.get( key );
			recArray = new YCFBamSchemaDefBuff[ subdictProjectURLIdx.size() ];
			Iterator< YCFBamSchemaDefBuff > iter = subdictProjectURLIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFBamScopePKey, YCFBamSchemaDefBuff > subdictProjectURLIdx
				= new HashMap< YCFBamScopePKey, YCFBamSchemaDefBuff >();
			dictByProjectURLIdx.put( key, subdictProjectURLIdx );
			recArray = new YCFBamSchemaDefBuff[0];
		}
		return( recArray );
	}

	public YCFBamSchemaDefBuff readDerivedByPubURIIdx( YCFSecAuthorization Authorization,
		long TenantId,
		String PublishURI )
	{
		final String S_ProcName = "YCFBamRamSchemaDef.readDerivedByPubURIIdx";
		YCFBamSchemaDefByPubURIIdxKey key = schema.getFactorySchemaDef().newPubURIIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredPublishURI( PublishURI );

		YCFBamSchemaDefBuff buff;
		if( dictByPubURIIdx.containsKey( key ) ) {
			buff = dictByPubURIIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamSchemaDefBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readDerivedByIdIdx() ";
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFBamSchemaDefBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFBamSchemaDefBuff readBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "YCFBamRamSchemaDef.readBuff";
		YCFBamSchemaDefBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a802" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamSchemaDefBuff lockBuff( YCFSecAuthorization Authorization,
		YCFBamScopePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFBamSchemaDefBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a802" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFBamSchemaDefBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamSchemaDef.readAllBuff";
		YCFBamSchemaDefBuff buff;
		ArrayList<YCFBamSchemaDefBuff> filteredList = new ArrayList<YCFBamSchemaDefBuff>();
		YCFBamSchemaDefBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a802" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFBamSchemaDefBuff[0] ) );
	}

	public YCFBamSchemaDefBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByIdIdx() ";
		YCFBamSchemaDefBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
			return( (YCFBamSchemaDefBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamSchemaDefBuff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamScope.readBuffByTenantIdx() ";
		YCFBamSchemaDefBuff buff;
		ArrayList<YCFBamSchemaDefBuff> filteredList = new ArrayList<YCFBamSchemaDefBuff>();
		YCFBamSchemaDefBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a801" ) ) {
				filteredList.add( (YCFBamSchemaDefBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamSchemaDefBuff[0] ) );
	}

	public YCFBamSchemaDefBuff[] readBuffByCTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamSchemaDef.readBuffByCTenantIdx() ";
		YCFBamSchemaDefBuff buff;
		ArrayList<YCFBamSchemaDefBuff> filteredList = new ArrayList<YCFBamSchemaDefBuff>();
		YCFBamSchemaDefBuff[] buffList = readDerivedByCTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a802" ) ) {
				filteredList.add( (YCFBamSchemaDefBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamSchemaDefBuff[0] ) );
	}

	public YCFBamSchemaDefBuff[] readBuffByMinorVersionIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long MinorVersionId )
	{
		final String S_ProcName = "YCFBamRamSchemaDef.readBuffByMinorVersionIdx() ";
		YCFBamSchemaDefBuff buff;
		ArrayList<YCFBamSchemaDefBuff> filteredList = new ArrayList<YCFBamSchemaDefBuff>();
		YCFBamSchemaDefBuff[] buffList = readDerivedByMinorVersionIdx( Authorization,
			TenantId,
			MinorVersionId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a802" ) ) {
				filteredList.add( (YCFBamSchemaDefBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamSchemaDefBuff[0] ) );
	}

	public YCFBamSchemaDefBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long MinorVersionId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamSchemaDef.readBuffByUNameIdx() ";
		YCFBamSchemaDefBuff buff = readDerivedByUNameIdx( Authorization,
			TenantId,
			MinorVersionId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a802" ) ) {
			return( (YCFBamSchemaDefBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFBamSchemaDefBuff[] readBuffByAuthEMailIdx( YCFSecAuthorization Authorization,
		long TenantId,
		String AuthorEMail )
	{
		final String S_ProcName = "YCFBamRamSchemaDef.readBuffByAuthEMailIdx() ";
		YCFBamSchemaDefBuff buff;
		ArrayList<YCFBamSchemaDefBuff> filteredList = new ArrayList<YCFBamSchemaDefBuff>();
		YCFBamSchemaDefBuff[] buffList = readDerivedByAuthEMailIdx( Authorization,
			TenantId,
			AuthorEMail );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a802" ) ) {
				filteredList.add( (YCFBamSchemaDefBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamSchemaDefBuff[0] ) );
	}

	public YCFBamSchemaDefBuff[] readBuffByProjectURLIdx( YCFSecAuthorization Authorization,
		long TenantId,
		String ProjectURL )
	{
		final String S_ProcName = "YCFBamRamSchemaDef.readBuffByProjectURLIdx() ";
		YCFBamSchemaDefBuff buff;
		ArrayList<YCFBamSchemaDefBuff> filteredList = new ArrayList<YCFBamSchemaDefBuff>();
		YCFBamSchemaDefBuff[] buffList = readDerivedByProjectURLIdx( Authorization,
			TenantId,
			ProjectURL );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a802" ) ) {
				filteredList.add( (YCFBamSchemaDefBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFBamSchemaDefBuff[0] ) );
	}

	public YCFBamSchemaDefBuff readBuffByPubURIIdx( YCFSecAuthorization Authorization,
		long TenantId,
		String PublishURI )
	{
		final String S_ProcName = "YCFBamRamSchemaDef.readBuffByPubURIIdx() ";
		YCFBamSchemaDefBuff buff = readDerivedByPubURIIdx( Authorization,
			TenantId,
			PublishURI );
		if( ( buff != null ) && buff.getClassCode().equals( "a802" ) ) {
			return( (YCFBamSchemaDefBuff)buff );
		}
		else {
			return( null );
		}
	}

	/**
	 *	Read a page array of the specific SchemaDef buffer instances identified by the duplicate key CTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamSchemaDefBuff[] pageBuffByCTenantIdx( YCFSecAuthorization Authorization,
		long TenantId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByCTenantIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific SchemaDef buffer instances identified by the duplicate key MinorVersionIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argMinorVersionId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamSchemaDefBuff[] pageBuffByMinorVersionIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long MinorVersionId,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByMinorVersionIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific SchemaDef buffer instances identified by the duplicate key AuthEMailIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argAuthorEMail	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamSchemaDefBuff[] pageBuffByAuthEMailIdx( YCFSecAuthorization Authorization,
		long TenantId,
		String AuthorEMail,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByAuthEMailIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific SchemaDef buffer instances identified by the duplicate key ProjectURLIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	argProjectURL	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFBamSchemaDefBuff[] pageBuffByProjectURLIdx( YCFSecAuthorization Authorization,
		long TenantId,
		String ProjectURL,
		Long priorTenantId,
		Long priorId )
	{
		final String S_ProcName = "pageBuffByProjectURLIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateSchemaDef( YCFSecAuthorization Authorization,
		YCFBamSchemaDefBuff Buff )
	{
		schema.getTableScope().updateScope( Authorization,
			Buff );
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamSchemaDefBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateSchemaDef",
				"Existing record not found",
				"SchemaDef",
				pkey );
		}
		YCFBamSchemaDefByCTenantIdxKey existingKeyCTenantIdx = schema.getFactorySchemaDef().newCTenantIdxKey();
		existingKeyCTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFBamSchemaDefByCTenantIdxKey newKeyCTenantIdx = schema.getFactorySchemaDef().newCTenantIdxKey();
		newKeyCTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFBamSchemaDefByMinorVersionIdxKey existingKeyMinorVersionIdx = schema.getFactorySchemaDef().newMinorVersionIdxKey();
		existingKeyMinorVersionIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyMinorVersionIdx.setRequiredMinorVersionId( existing.getRequiredMinorVersionId() );

		YCFBamSchemaDefByMinorVersionIdxKey newKeyMinorVersionIdx = schema.getFactorySchemaDef().newMinorVersionIdxKey();
		newKeyMinorVersionIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyMinorVersionIdx.setRequiredMinorVersionId( Buff.getRequiredMinorVersionId() );

		YCFBamSchemaDefByUNameIdxKey existingKeyUNameIdx = schema.getFactorySchemaDef().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyUNameIdx.setRequiredMinorVersionId( existing.getRequiredMinorVersionId() );
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamSchemaDefByUNameIdxKey newKeyUNameIdx = schema.getFactorySchemaDef().newUNameIdxKey();
		newKeyUNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyUNameIdx.setRequiredMinorVersionId( Buff.getRequiredMinorVersionId() );
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFBamSchemaDefByAuthEMailIdxKey existingKeyAuthEMailIdx = schema.getFactorySchemaDef().newAuthEMailIdxKey();
		existingKeyAuthEMailIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyAuthEMailIdx.setRequiredAuthorEMail( existing.getRequiredAuthorEMail() );

		YCFBamSchemaDefByAuthEMailIdxKey newKeyAuthEMailIdx = schema.getFactorySchemaDef().newAuthEMailIdxKey();
		newKeyAuthEMailIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyAuthEMailIdx.setRequiredAuthorEMail( Buff.getRequiredAuthorEMail() );

		YCFBamSchemaDefByProjectURLIdxKey existingKeyProjectURLIdx = schema.getFactorySchemaDef().newProjectURLIdxKey();
		existingKeyProjectURLIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyProjectURLIdx.setRequiredProjectURL( existing.getRequiredProjectURL() );

		YCFBamSchemaDefByProjectURLIdxKey newKeyProjectURLIdx = schema.getFactorySchemaDef().newProjectURLIdxKey();
		newKeyProjectURLIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyProjectURLIdx.setRequiredProjectURL( Buff.getRequiredProjectURL() );

		YCFBamSchemaDefByPubURIIdxKey existingKeyPubURIIdx = schema.getFactorySchemaDef().newPubURIIdxKey();
		existingKeyPubURIIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyPubURIIdx.setRequiredPublishURI( existing.getRequiredPublishURI() );

		YCFBamSchemaDefByPubURIIdxKey newKeyPubURIIdx = schema.getFactorySchemaDef().newPubURIIdxKey();
		newKeyPubURIIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyPubURIIdx.setRequiredPublishURI( Buff.getRequiredPublishURI() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateSchemaDef",
					"SchemaDefUNameIdx",
					newKeyUNameIdx );
			}
		}

		if( ! existingKeyPubURIIdx.equals( newKeyPubURIIdx ) ) {
			if( dictByPubURIIdx.containsKey( newKeyPubURIIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateSchemaDef",
					"SchemaPublishURIIdx",
					newKeyPubURIIdx );
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
						"updateSchemaDef",
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
				if( null == schema.getTableMinorVersion().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredMinorVersionId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateSchemaDef",
						"Container",
						"MinorVersion",
						"MinorVersion",
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
						"updateSchemaDef",
						"Owner",
						"CTenant",
						"Tenant",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFBamScopePKey, YCFBamSchemaDefBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByCTenantIdx.get( existingKeyCTenantIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByCTenantIdx.containsKey( newKeyCTenantIdx ) ) {
			subdict = dictByCTenantIdx.get( newKeyCTenantIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamSchemaDefBuff >();
			dictByCTenantIdx.put( newKeyCTenantIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByMinorVersionIdx.get( existingKeyMinorVersionIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByMinorVersionIdx.containsKey( newKeyMinorVersionIdx ) ) {
			subdict = dictByMinorVersionIdx.get( newKeyMinorVersionIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamSchemaDefBuff >();
			dictByMinorVersionIdx.put( newKeyMinorVersionIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

		subdict = dictByAuthEMailIdx.get( existingKeyAuthEMailIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByAuthEMailIdx.containsKey( newKeyAuthEMailIdx ) ) {
			subdict = dictByAuthEMailIdx.get( newKeyAuthEMailIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamSchemaDefBuff >();
			dictByAuthEMailIdx.put( newKeyAuthEMailIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByProjectURLIdx.get( existingKeyProjectURLIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByProjectURLIdx.containsKey( newKeyProjectURLIdx ) ) {
			subdict = dictByProjectURLIdx.get( newKeyProjectURLIdx );
		}
		else {
			subdict = new HashMap< YCFBamScopePKey, YCFBamSchemaDefBuff >();
			dictByProjectURLIdx.put( newKeyProjectURLIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByPubURIIdx.remove( existingKeyPubURIIdx );
		dictByPubURIIdx.put( newKeyPubURIIdx, Buff );

	}

	public void deleteSchemaDef( YCFSecAuthorization Authorization,
		YCFBamSchemaDefBuff Buff )
	{
		final String S_ProcName = "YCFBamRamSchemaDefTable.deleteSchemaDef() ";
		String classCode;
		YCFBamScopePKey pkey = schema.getFactoryScope().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFBamSchemaDefBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteSchemaDef",
				pkey );
		}
			YCFBamValueBuff buffClearTypeReferences;
			YCFBamValueBuff arrClearTypeReferences[] = schema.getTableValue().readDerivedByScopeIdx( Authorization,
			existing.getRequiredTenantId(),
			existing.getRequiredId() );
			for( int idxClearTypeReferences = 0; idxClearTypeReferences < arrClearTypeReferences.length; idxClearTypeReferences++ ) {
				buffClearTypeReferences = arrClearTypeReferences[idxClearTypeReferences];
				YCFBamTableColBuff buffReferencingTableCols;
				YCFBamTableColBuff arrReferencingTableCols[] = schema.getTableTableCol().readDerivedByDataIdx( Authorization,
				buffClearTypeReferences.getRequiredTenantId(),
				buffClearTypeReferences.getRequiredId() );
				for( int idxReferencingTableCols = 0; idxReferencingTableCols < arrReferencingTableCols.length; idxReferencingTableCols++ ) {
					buffReferencingTableCols = arrReferencingTableCols[idxReferencingTableCols];
					{
						YCFBamTableColBuff editBuff = schema.getTableTableCol().readDerivedByIdIdx( Authorization,
							buffReferencingTableCols.getRequiredTenantId(),
							buffReferencingTableCols.getRequiredId() );
						editBuff.setOptionalDataTenantId( null );
						editBuff.setOptionalDataId( null );
						classCode = editBuff.getClassCode();
						if( classCode.equals( "a85b" ) ) {
							schema.getTableTableCol().updateTableCol( Authorization, editBuff );
						}
						else {
							new YCFLibUnsupportedClassException( getClass(),
								S_ProcName,
								"Unrecognized ClassCode \"" + classCode + "\"" );
						}
					}
				}
			}
			YCFBamTableBuff buffClearTableRelationNarrowed;
			YCFBamTableBuff arrClearTableRelationNarrowed[] = schema.getTableTable().readDerivedBySchemaDefIdx( Authorization,
			existing.getRequiredTenantId(),
			existing.getRequiredId() );
			for( int idxClearTableRelationNarrowed = 0; idxClearTableRelationNarrowed < arrClearTableRelationNarrowed.length; idxClearTableRelationNarrowed++ ) {
				buffClearTableRelationNarrowed = arrClearTableRelationNarrowed[idxClearTableRelationNarrowed];
				YCFBamRelationBuff buffTableRelation;
				YCFBamRelationBuff arrTableRelation[] = schema.getTableRelation().readDerivedByRelTableIdx( Authorization,
				buffClearTableRelationNarrowed.getRequiredTenantId(),
				buffClearTableRelationNarrowed.getRequiredId() );
				for( int idxTableRelation = 0; idxTableRelation < arrTableRelation.length; idxTableRelation++ ) {
					buffTableRelation = arrTableRelation[idxTableRelation];
					{
						YCFBamRelationBuff editBuff = schema.getTableRelation().readDerivedByIdIdx( Authorization,
							buffTableRelation.getRequiredTenantId(),
							buffTableRelation.getRequiredId() );
						editBuff.setOptionalNarrowedTenantId( null );
						editBuff.setOptionalNarrowedId( null );
						classCode = editBuff.getClassCode();
						if( classCode.equals( "a838" ) ) {
							schema.getTableRelation().updateRelation( Authorization, editBuff );
						}
						else {
							new YCFLibUnsupportedClassException( getClass(),
								S_ProcName,
								"Unrecognized ClassCode \"" + classCode + "\"" );
						}
					}
				}
			}
		YCFBamTableBuff buffDelTableMethods;
		YCFBamTableBuff arrDelTableMethods[] = schema.getTableTable().readDerivedBySchemaDefIdx( Authorization,
			existing.getRequiredTenantId(),
			existing.getRequiredId() );
		for( int idxDelTableMethods = 0; idxDelTableMethods < arrDelTableMethods.length; idxDelTableMethods++ ) {
			buffDelTableMethods = arrDelTableMethods[idxDelTableMethods];
					schema.getTableServerMethod().deleteServerMethodByMethTableIdx( Authorization,
						buffDelTableMethods.getRequiredTenantId(),
						buffDelTableMethods.getRequiredId() );
		}
		YCFBamTableBuff buffDelTableDelDep;
		YCFBamTableBuff arrDelTableDelDep[] = schema.getTableTable().readDerivedBySchemaDefIdx( Authorization,
			existing.getRequiredTenantId(),
			existing.getRequiredId() );
		for( int idxDelTableDelDep = 0; idxDelTableDelDep < arrDelTableDelDep.length; idxDelTableDelDep++ ) {
			buffDelTableDelDep = arrDelTableDelDep[idxDelTableDelDep];
					schema.getTableDelTopDep().deleteDelTopDepByDelTopDepTblIdx( Authorization,
						buffDelTableDelDep.getRequiredTenantId(),
						buffDelTableDelDep.getRequiredId() );
		}
		YCFBamTableBuff buffDelTableClearDep;
		YCFBamTableBuff arrDelTableClearDep[] = schema.getTableTable().readDerivedBySchemaDefIdx( Authorization,
			existing.getRequiredTenantId(),
			existing.getRequiredId() );
		for( int idxDelTableClearDep = 0; idxDelTableClearDep < arrDelTableClearDep.length; idxDelTableClearDep++ ) {
			buffDelTableClearDep = arrDelTableClearDep[idxDelTableClearDep];
					schema.getTableClearTopDep().deleteClearTopDepByClrTopDepTblIdx( Authorization,
						buffDelTableClearDep.getRequiredTenantId(),
						buffDelTableClearDep.getRequiredId() );
		}
		YCFBamTableBuff buffDelTableChain;
		YCFBamTableBuff arrDelTableChain[] = schema.getTableTable().readDerivedBySchemaDefIdx( Authorization,
			existing.getRequiredTenantId(),
			existing.getRequiredId() );
		for( int idxDelTableChain = 0; idxDelTableChain < arrDelTableChain.length; idxDelTableChain++ ) {
			buffDelTableChain = arrDelTableChain[idxDelTableChain];
					schema.getTableChain().deleteChainByChainTableIdx( Authorization,
						buffDelTableChain.getRequiredTenantId(),
						buffDelTableChain.getRequiredId() );
		}
		YCFBamTableBuff buffDelTableRelationPopDep;
		YCFBamTableBuff arrDelTableRelationPopDep[] = schema.getTableTable().readDerivedBySchemaDefIdx( Authorization,
			existing.getRequiredTenantId(),
			existing.getRequiredId() );
		for( int idxDelTableRelationPopDep = 0; idxDelTableRelationPopDep < arrDelTableRelationPopDep.length; idxDelTableRelationPopDep++ ) {
			buffDelTableRelationPopDep = arrDelTableRelationPopDep[idxDelTableRelationPopDep];
			YCFBamRelationBuff buffTableRelation;
			YCFBamRelationBuff arrTableRelation[] = schema.getTableRelation().readDerivedByRelTableIdx( Authorization,
				buffDelTableRelationPopDep.getRequiredTenantId(),
				buffDelTableRelationPopDep.getRequiredId() );
			for( int idxTableRelation = 0; idxTableRelation < arrTableRelation.length; idxTableRelation++ ) {
				buffTableRelation = arrTableRelation[idxTableRelation];
					schema.getTablePopTopDep().deletePopTopDepByContRelIdx( Authorization,
						buffTableRelation.getRequiredTenantId(),
						buffTableRelation.getRequiredId() );
			}
		}
		YCFBamTableBuff buffDelTableRelationCol;
		YCFBamTableBuff arrDelTableRelationCol[] = schema.getTableTable().readDerivedBySchemaDefIdx( Authorization,
			existing.getRequiredTenantId(),
			existing.getRequiredId() );
		for( int idxDelTableRelationCol = 0; idxDelTableRelationCol < arrDelTableRelationCol.length; idxDelTableRelationCol++ ) {
			buffDelTableRelationCol = arrDelTableRelationCol[idxDelTableRelationCol];
			YCFBamRelationBuff buffTableRelation;
			YCFBamRelationBuff arrTableRelation[] = schema.getTableRelation().readDerivedByRelTableIdx( Authorization,
				buffDelTableRelationCol.getRequiredTenantId(),
				buffDelTableRelationCol.getRequiredId() );
			for( int idxTableRelation = 0; idxTableRelation < arrTableRelation.length; idxTableRelation++ ) {
				buffTableRelation = arrTableRelation[idxTableRelation];
					schema.getTableRelationCol().deleteRelationColByRelationIdx( Authorization,
						buffTableRelation.getRequiredTenantId(),
						buffTableRelation.getRequiredId() );
			}
		}
		YCFBamTableBuff buffDelTableRelation;
		YCFBamTableBuff arrDelTableRelation[] = schema.getTableTable().readDerivedBySchemaDefIdx( Authorization,
			existing.getRequiredTenantId(),
			existing.getRequiredId() );
		for( int idxDelTableRelation = 0; idxDelTableRelation < arrDelTableRelation.length; idxDelTableRelation++ ) {
			buffDelTableRelation = arrDelTableRelation[idxDelTableRelation];
					schema.getTableRelation().deleteRelationByRelTableIdx( Authorization,
						buffDelTableRelation.getRequiredTenantId(),
						buffDelTableRelation.getRequiredId() );
		}
		YCFBamTableBuff buffDelTableIndexRefRelFmCol;
		YCFBamTableBuff arrDelTableIndexRefRelFmCol[] = schema.getTableTable().readDerivedBySchemaDefIdx( Authorization,
			existing.getRequiredTenantId(),
			existing.getRequiredId() );
		for( int idxDelTableIndexRefRelFmCol = 0; idxDelTableIndexRefRelFmCol < arrDelTableIndexRefRelFmCol.length; idxDelTableIndexRefRelFmCol++ ) {
			buffDelTableIndexRefRelFmCol = arrDelTableIndexRefRelFmCol[idxDelTableIndexRefRelFmCol];
			YCFBamIndexBuff buffTableIndex;
			YCFBamIndexBuff arrTableIndex[] = schema.getTableIndex().readDerivedByIdxTableIdx( Authorization,
				buffDelTableIndexRefRelFmCol.getRequiredTenantId(),
				buffDelTableIndexRefRelFmCol.getRequiredId() );
			for( int idxTableIndex = 0; idxTableIndex < arrTableIndex.length; idxTableIndex++ ) {
				buffTableIndex = arrTableIndex[idxTableIndex];
			YCFBamIndexColBuff buffColumns;
			YCFBamIndexColBuff arrColumns[] = schema.getTableIndexCol().readDerivedByIndexIdx( Authorization,
					buffTableIndex.getRequiredTenantId(),
					buffTableIndex.getRequiredId() );
			for( int idxColumns = 0; idxColumns < arrColumns.length; idxColumns++ ) {
				buffColumns = arrColumns[idxColumns];
					schema.getTableRelationCol().deleteRelationColByFromColIdx( Authorization,
						buffColumns.getRequiredTenantId(),
						buffColumns.getRequiredId() );
			}
			}
		}
		YCFBamTableBuff buffDelTableIndexRefRelToCol;
		YCFBamTableBuff arrDelTableIndexRefRelToCol[] = schema.getTableTable().readDerivedBySchemaDefIdx( Authorization,
			existing.getRequiredTenantId(),
			existing.getRequiredId() );
		for( int idxDelTableIndexRefRelToCol = 0; idxDelTableIndexRefRelToCol < arrDelTableIndexRefRelToCol.length; idxDelTableIndexRefRelToCol++ ) {
			buffDelTableIndexRefRelToCol = arrDelTableIndexRefRelToCol[idxDelTableIndexRefRelToCol];
			YCFBamIndexBuff buffTableIndex;
			YCFBamIndexBuff arrTableIndex[] = schema.getTableIndex().readDerivedByIdxTableIdx( Authorization,
				buffDelTableIndexRefRelToCol.getRequiredTenantId(),
				buffDelTableIndexRefRelToCol.getRequiredId() );
			for( int idxTableIndex = 0; idxTableIndex < arrTableIndex.length; idxTableIndex++ ) {
				buffTableIndex = arrTableIndex[idxTableIndex];
			YCFBamIndexColBuff buffColumns;
			YCFBamIndexColBuff arrColumns[] = schema.getTableIndexCol().readDerivedByIndexIdx( Authorization,
					buffTableIndex.getRequiredTenantId(),
					buffTableIndex.getRequiredId() );
			for( int idxColumns = 0; idxColumns < arrColumns.length; idxColumns++ ) {
				buffColumns = arrColumns[idxColumns];
					schema.getTableRelationCol().deleteRelationColByToColIdx( Authorization,
						buffColumns.getRequiredTenantId(),
						buffColumns.getRequiredId() );
			}
			}
		}
		YCFBamTableBuff buffDelTableIndexCols;
		YCFBamTableBuff arrDelTableIndexCols[] = schema.getTableTable().readDerivedBySchemaDefIdx( Authorization,
			existing.getRequiredTenantId(),
			existing.getRequiredId() );
		for( int idxDelTableIndexCols = 0; idxDelTableIndexCols < arrDelTableIndexCols.length; idxDelTableIndexCols++ ) {
			buffDelTableIndexCols = arrDelTableIndexCols[idxDelTableIndexCols];
			YCFBamIndexBuff buffTableIndex;
			YCFBamIndexBuff arrTableIndex[] = schema.getTableIndex().readDerivedByIdxTableIdx( Authorization,
				buffDelTableIndexCols.getRequiredTenantId(),
				buffDelTableIndexCols.getRequiredId() );
			for( int idxTableIndex = 0; idxTableIndex < arrTableIndex.length; idxTableIndex++ ) {
				buffTableIndex = arrTableIndex[idxTableIndex];
					schema.getTableIndexCol().deleteIndexColByIndexIdx( Authorization,
						buffTableIndex.getRequiredTenantId(),
						buffTableIndex.getRequiredId() );
			}
		}
		YCFBamTableBuff buffDelTableIndexes;
		YCFBamTableBuff arrDelTableIndexes[] = schema.getTableTable().readDerivedBySchemaDefIdx( Authorization,
			existing.getRequiredTenantId(),
			existing.getRequiredId() );
		for( int idxDelTableIndexes = 0; idxDelTableIndexes < arrDelTableIndexes.length; idxDelTableIndexes++ ) {
			buffDelTableIndexes = arrDelTableIndexes[idxDelTableIndexes];
					schema.getTableIndex().deleteIndexByIdxTableIdx( Authorization,
						buffDelTableIndexes.getRequiredTenantId(),
						buffDelTableIndexes.getRequiredId() );
		}
		YCFBamTableBuff buffDelTableRefIndexColumns;
		YCFBamTableBuff arrDelTableRefIndexColumns[] = schema.getTableTable().readDerivedBySchemaDefIdx( Authorization,
			existing.getRequiredTenantId(),
			existing.getRequiredId() );
		for( int idxDelTableRefIndexColumns = 0; idxDelTableRefIndexColumns < arrDelTableRefIndexColumns.length; idxDelTableRefIndexColumns++ ) {
			buffDelTableRefIndexColumns = arrDelTableRefIndexColumns[idxDelTableRefIndexColumns];
			YCFBamValueBuff buffColumns;
			YCFBamValueBuff arrColumns[] = schema.getTableValue().readDerivedByScopeIdx( Authorization,
				buffDelTableRefIndexColumns.getRequiredTenantId(),
				buffDelTableRefIndexColumns.getRequiredId() );
			for( int idxColumns = 0; idxColumns < arrColumns.length; idxColumns++ ) {
				buffColumns = arrColumns[idxColumns];
					schema.getTableIndexCol().deleteIndexColByColIdx( Authorization,
						buffColumns.getRequiredTenantId(),
						buffColumns.getRequiredId() );
			}
		}
		YCFBamTableBuff buffDelTableColumns;
		YCFBamTableBuff arrDelTableColumns[] = schema.getTableTable().readDerivedBySchemaDefIdx( Authorization,
			existing.getRequiredTenantId(),
			existing.getRequiredId() );
		for( int idxDelTableColumns = 0; idxDelTableColumns < arrDelTableColumns.length; idxDelTableColumns++ ) {
			buffDelTableColumns = arrDelTableColumns[idxDelTableColumns];
					schema.getTableValue().deleteValueByScopeIdx( Authorization,
						buffDelTableColumns.getRequiredTenantId(),
						buffDelTableColumns.getRequiredId() );
		}
		YCFBamTableBuff buffDelTableDispensedId64Gen;
		YCFBamTableBuff arrDelTableDispensedId64Gen[] = schema.getTableTable().readDerivedBySchemaDefIdx( Authorization,
			existing.getRequiredTenantId(),
			existing.getRequiredId() );
		for( int idxDelTableDispensedId64Gen = 0; idxDelTableDispensedId64Gen < arrDelTableDispensedId64Gen.length; idxDelTableDispensedId64Gen++ ) {
			buffDelTableDispensedId64Gen = arrDelTableDispensedId64Gen[idxDelTableDispensedId64Gen];
					schema.getTableId64Gen().deleteId64GenByDispIdx( Authorization,
						buffDelTableDispensedId64Gen.getRequiredTenantId(),
						buffDelTableDispensedId64Gen.getRequiredId() );
		}
		YCFBamTableBuff buffDelTableDispensedId32Gen;
		YCFBamTableBuff arrDelTableDispensedId32Gen[] = schema.getTableTable().readDerivedBySchemaDefIdx( Authorization,
			existing.getRequiredTenantId(),
			existing.getRequiredId() );
		for( int idxDelTableDispensedId32Gen = 0; idxDelTableDispensedId32Gen < arrDelTableDispensedId32Gen.length; idxDelTableDispensedId32Gen++ ) {
			buffDelTableDispensedId32Gen = arrDelTableDispensedId32Gen[idxDelTableDispensedId32Gen];
					schema.getTableId32Gen().deleteId32GenByDispIdx( Authorization,
						buffDelTableDispensedId32Gen.getRequiredTenantId(),
						buffDelTableDispensedId32Gen.getRequiredId() );
		}
		YCFBamTableBuff buffDelTableDispensedId16Gen;
		YCFBamTableBuff arrDelTableDispensedId16Gen[] = schema.getTableTable().readDerivedBySchemaDefIdx( Authorization,
			existing.getRequiredTenantId(),
			existing.getRequiredId() );
		for( int idxDelTableDispensedId16Gen = 0; idxDelTableDispensedId16Gen < arrDelTableDispensedId16Gen.length; idxDelTableDispensedId16Gen++ ) {
			buffDelTableDispensedId16Gen = arrDelTableDispensedId16Gen[idxDelTableDispensedId16Gen];
					schema.getTableId16Gen().deleteId16GenByDispIdx( Authorization,
						buffDelTableDispensedId16Gen.getRequiredTenantId(),
						buffDelTableDispensedId16Gen.getRequiredId() );
		}
					schema.getTableTable().deleteTableBySchemaDefIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		YCFBamValueBuff buffDelTypeRefs;
		YCFBamValueBuff arrDelTypeRefs[] = schema.getTableValue().readDerivedByScopeIdx( Authorization,
			existing.getRequiredTenantId(),
			existing.getRequiredId() );
		for( int idxDelTypeRefs = 0; idxDelTypeRefs < arrDelTypeRefs.length; idxDelTypeRefs++ ) {
			buffDelTypeRefs = arrDelTypeRefs[idxDelTypeRefs];
					schema.getTableTableCol().deleteTableColByDataIdx( Authorization,
						buffDelTypeRefs.getRequiredTenantId(),
						buffDelTypeRefs.getRequiredId() );
		}
					schema.getTableValue().deleteValueByScopeIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		YCFBamSchemaDefByCTenantIdxKey keyCTenantIdx = schema.getFactorySchemaDef().newCTenantIdxKey();
		keyCTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFBamSchemaDefByMinorVersionIdxKey keyMinorVersionIdx = schema.getFactorySchemaDef().newMinorVersionIdxKey();
		keyMinorVersionIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyMinorVersionIdx.setRequiredMinorVersionId( existing.getRequiredMinorVersionId() );

		YCFBamSchemaDefByUNameIdxKey keyUNameIdx = schema.getFactorySchemaDef().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredMinorVersionId( existing.getRequiredMinorVersionId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFBamSchemaDefByAuthEMailIdxKey keyAuthEMailIdx = schema.getFactorySchemaDef().newAuthEMailIdxKey();
		keyAuthEMailIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyAuthEMailIdx.setRequiredAuthorEMail( existing.getRequiredAuthorEMail() );

		YCFBamSchemaDefByProjectURLIdxKey keyProjectURLIdx = schema.getFactorySchemaDef().newProjectURLIdxKey();
		keyProjectURLIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyProjectURLIdx.setRequiredProjectURL( existing.getRequiredProjectURL() );

		YCFBamSchemaDefByPubURIIdxKey keyPubURIIdx = schema.getFactorySchemaDef().newPubURIIdxKey();
		keyPubURIIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyPubURIIdx.setRequiredPublishURI( existing.getRequiredPublishURI() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFBamScopePKey, YCFBamSchemaDefBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByCTenantIdx.get( keyCTenantIdx );
		subdict.remove( pkey );

		subdict = dictByMinorVersionIdx.get( keyMinorVersionIdx );
		subdict.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

		subdict = dictByAuthEMailIdx.get( keyAuthEMailIdx );
		subdict.remove( pkey );

		subdict = dictByProjectURLIdx.get( keyProjectURLIdx );
		subdict.remove( pkey );

		dictByPubURIIdx.remove( keyPubURIIdx );

		schema.getTableScope().deleteScope( Authorization,
			Buff );
	}
	public void deleteSchemaDefByCTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamSchemaDefByCTenantIdxKey key = schema.getFactorySchemaDef().newCTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteSchemaDefByCTenantIdx( Authorization, key );
	}

	public void deleteSchemaDefByCTenantIdx( YCFSecAuthorization Authorization,
		YCFBamSchemaDefByCTenantIdxKey argKey )
	{
		YCFBamSchemaDefBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamSchemaDefBuff> matchSet = new LinkedList<YCFBamSchemaDefBuff>();
		Iterator<YCFBamSchemaDefBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamSchemaDefBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSchemaDef().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSchemaDef( Authorization, cur );
		}
	}

	public void deleteSchemaDefByMinorVersionIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argMinorVersionId )
	{
		YCFBamSchemaDefByMinorVersionIdxKey key = schema.getFactorySchemaDef().newMinorVersionIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredMinorVersionId( argMinorVersionId );
		deleteSchemaDefByMinorVersionIdx( Authorization, key );
	}

	public void deleteSchemaDefByMinorVersionIdx( YCFSecAuthorization Authorization,
		YCFBamSchemaDefByMinorVersionIdxKey argKey )
	{
		YCFBamSchemaDefBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamSchemaDefBuff> matchSet = new LinkedList<YCFBamSchemaDefBuff>();
		Iterator<YCFBamSchemaDefBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamSchemaDefBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSchemaDef().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSchemaDef( Authorization, cur );
		}
	}

	public void deleteSchemaDefByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argMinorVersionId,
		String argName )
	{
		YCFBamSchemaDefByUNameIdxKey key = schema.getFactorySchemaDef().newUNameIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredMinorVersionId( argMinorVersionId );
		key.setRequiredName( argName );
		deleteSchemaDefByUNameIdx( Authorization, key );
	}

	public void deleteSchemaDefByUNameIdx( YCFSecAuthorization Authorization,
		YCFBamSchemaDefByUNameIdxKey argKey )
	{
		YCFBamSchemaDefBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamSchemaDefBuff> matchSet = new LinkedList<YCFBamSchemaDefBuff>();
		Iterator<YCFBamSchemaDefBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamSchemaDefBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSchemaDef().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSchemaDef( Authorization, cur );
		}
	}

	public void deleteSchemaDefByAuthEMailIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		String argAuthorEMail )
	{
		YCFBamSchemaDefByAuthEMailIdxKey key = schema.getFactorySchemaDef().newAuthEMailIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredAuthorEMail( argAuthorEMail );
		deleteSchemaDefByAuthEMailIdx( Authorization, key );
	}

	public void deleteSchemaDefByAuthEMailIdx( YCFSecAuthorization Authorization,
		YCFBamSchemaDefByAuthEMailIdxKey argKey )
	{
		YCFBamSchemaDefBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamSchemaDefBuff> matchSet = new LinkedList<YCFBamSchemaDefBuff>();
		Iterator<YCFBamSchemaDefBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamSchemaDefBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSchemaDef().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSchemaDef( Authorization, cur );
		}
	}

	public void deleteSchemaDefByProjectURLIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		String argProjectURL )
	{
		YCFBamSchemaDefByProjectURLIdxKey key = schema.getFactorySchemaDef().newProjectURLIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredProjectURL( argProjectURL );
		deleteSchemaDefByProjectURLIdx( Authorization, key );
	}

	public void deleteSchemaDefByProjectURLIdx( YCFSecAuthorization Authorization,
		YCFBamSchemaDefByProjectURLIdxKey argKey )
	{
		YCFBamSchemaDefBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamSchemaDefBuff> matchSet = new LinkedList<YCFBamSchemaDefBuff>();
		Iterator<YCFBamSchemaDefBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamSchemaDefBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSchemaDef().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSchemaDef( Authorization, cur );
		}
	}

	public void deleteSchemaDefByPubURIIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		String argPublishURI )
	{
		YCFBamSchemaDefByPubURIIdxKey key = schema.getFactorySchemaDef().newPubURIIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredPublishURI( argPublishURI );
		deleteSchemaDefByPubURIIdx( Authorization, key );
	}

	public void deleteSchemaDefByPubURIIdx( YCFSecAuthorization Authorization,
		YCFBamSchemaDefByPubURIIdxKey argKey )
	{
		YCFBamSchemaDefBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamSchemaDefBuff> matchSet = new LinkedList<YCFBamSchemaDefBuff>();
		Iterator<YCFBamSchemaDefBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamSchemaDefBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSchemaDef().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSchemaDef( Authorization, cur );
		}
	}

	public void deleteSchemaDefByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFBamScopePKey key = schema.getFactoryScope().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteSchemaDefByIdIdx( Authorization, key );
	}

	public void deleteSchemaDefByIdIdx( YCFSecAuthorization Authorization,
		YCFBamScopePKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFBamSchemaDefBuff cur;
		LinkedList<YCFBamSchemaDefBuff> matchSet = new LinkedList<YCFBamSchemaDefBuff>();
		Iterator<YCFBamSchemaDefBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamSchemaDefBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSchemaDef().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSchemaDef( Authorization, cur );
		}
	}

	public void deleteSchemaDefByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFBamScopeByTenantIdxKey key = schema.getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteSchemaDefByTenantIdx( Authorization, key );
	}

	public void deleteSchemaDefByTenantIdx( YCFSecAuthorization Authorization,
		YCFBamScopeByTenantIdxKey argKey )
	{
		YCFBamSchemaDefBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFBamSchemaDefBuff> matchSet = new LinkedList<YCFBamSchemaDefBuff>();
		Iterator<YCFBamSchemaDefBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFBamSchemaDefBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSchemaDef().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteSchemaDef( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
