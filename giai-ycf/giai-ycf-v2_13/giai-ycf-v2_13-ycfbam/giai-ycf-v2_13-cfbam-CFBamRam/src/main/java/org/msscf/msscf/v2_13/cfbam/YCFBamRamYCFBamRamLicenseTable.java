
// Description: Java 11 in-memory RAM DbIO implementation for License.

/*
 *	org.mssycf.mssycf.YCFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFInt 2.13 Internet Essentials
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFInt.
 *	
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	
 *	http://www.apache.org/licenses/LICENSE-2.0
 *	
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
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
 *	YCFBamRamLicenseTable in-memory RAM DbIO implementation
 *	for License.
 */
public class YCFBamRamLicenseTable
	implements IYCFBamLicenseTable
{
	private IYCFBamSchema schema;
	private Map< YCFIntLicensePKey,
				YCFIntLicenseBuff > dictByPKey
		= new HashMap< YCFIntLicensePKey,
				YCFIntLicenseBuff >();
	private Map< YCFIntLicenseByLicnTenantIdxKey,
				Map< YCFIntLicensePKey,
					YCFIntLicenseBuff >> dictByLicnTenantIdx
		= new HashMap< YCFIntLicenseByLicnTenantIdxKey,
				Map< YCFIntLicensePKey,
					YCFIntLicenseBuff >>();
	private Map< YCFIntLicenseByDomainIdxKey,
				Map< YCFIntLicensePKey,
					YCFIntLicenseBuff >> dictByDomainIdx
		= new HashMap< YCFIntLicenseByDomainIdxKey,
				Map< YCFIntLicensePKey,
					YCFIntLicenseBuff >>();
	private Map< YCFIntLicenseByUNameIdxKey,
			YCFIntLicenseBuff > dictByUNameIdx
		= new HashMap< YCFIntLicenseByUNameIdxKey,
			YCFIntLicenseBuff >();

	public YCFBamRamLicenseTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createLicense( YCFSecAuthorization Authorization,
		YCFIntLicenseBuff Buff )
	{
		final String S_ProcName = "createLicense";
		YCFIntLicensePKey pkey = schema.getFactoryLicense().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( ((YCFBamRamTenantTable)schema.getTableTenant()).nextLicenseIdGen( Authorization,
			Buff.getRequiredTenantId() ) );
		Buff.setRequiredTenantId( pkey.getRequiredTenantId() );
		Buff.setRequiredId( pkey.getRequiredId() );
		YCFIntLicenseByLicnTenantIdxKey keyLicnTenantIdx = schema.getFactoryLicense().newLicnTenantIdxKey();
		keyLicnTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFIntLicenseByDomainIdxKey keyDomainIdx = schema.getFactoryLicense().newDomainIdxKey();
		keyDomainIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyDomainIdx.setRequiredTopDomainId( Buff.getRequiredTopDomainId() );

		YCFIntLicenseByUNameIdxKey keyUNameIdx = schema.getFactoryLicense().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyUNameIdx.setRequiredTopDomainId( Buff.getRequiredTopDomainId() );
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"LicenseUNameIdx",
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
						"Owner",
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
				if( null == schema.getTableTopDomain().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredTopDomainId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"TopDomain",
						"TopDomain",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFIntLicensePKey, YCFIntLicenseBuff > subdictLicnTenantIdx;
		if( dictByLicnTenantIdx.containsKey( keyLicnTenantIdx ) ) {
			subdictLicnTenantIdx = dictByLicnTenantIdx.get( keyLicnTenantIdx );
		}
		else {
			subdictLicnTenantIdx = new HashMap< YCFIntLicensePKey, YCFIntLicenseBuff >();
			dictByLicnTenantIdx.put( keyLicnTenantIdx, subdictLicnTenantIdx );
		}
		subdictLicnTenantIdx.put( pkey, Buff );

		Map< YCFIntLicensePKey, YCFIntLicenseBuff > subdictDomainIdx;
		if( dictByDomainIdx.containsKey( keyDomainIdx ) ) {
			subdictDomainIdx = dictByDomainIdx.get( keyDomainIdx );
		}
		else {
			subdictDomainIdx = new HashMap< YCFIntLicensePKey, YCFIntLicenseBuff >();
			dictByDomainIdx.put( keyDomainIdx, subdictDomainIdx );
		}
		subdictDomainIdx.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

	}

	public YCFIntLicenseBuff readDerived( YCFSecAuthorization Authorization,
		YCFIntLicensePKey PKey )
	{
		final String S_ProcName = "YCFBamRamLicense.readDerived";
		YCFIntLicensePKey key = schema.getFactoryLicense().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFIntLicenseBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntLicenseBuff lockDerived( YCFSecAuthorization Authorization,
		YCFIntLicensePKey PKey )
	{
		final String S_ProcName = "YCFBamRamLicense.readDerived";
		YCFIntLicensePKey key = schema.getFactoryLicense().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFIntLicenseBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntLicenseBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamLicense.readAllDerived";
		YCFIntLicenseBuff[] retList = new YCFIntLicenseBuff[ dictByPKey.values().size() ];
		Iterator< YCFIntLicenseBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFIntLicenseBuff[] readDerivedByLicnTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamLicense.readDerivedByLicnTenantIdx";
		YCFIntLicenseByLicnTenantIdxKey key = schema.getFactoryLicense().newLicnTenantIdxKey();
		key.setRequiredTenantId( TenantId );

		YCFIntLicenseBuff[] recArray;
		if( dictByLicnTenantIdx.containsKey( key ) ) {
			Map< YCFIntLicensePKey, YCFIntLicenseBuff > subdictLicnTenantIdx
				= dictByLicnTenantIdx.get( key );
			recArray = new YCFIntLicenseBuff[ subdictLicnTenantIdx.size() ];
			Iterator< YCFIntLicenseBuff > iter = subdictLicnTenantIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFIntLicensePKey, YCFIntLicenseBuff > subdictLicnTenantIdx
				= new HashMap< YCFIntLicensePKey, YCFIntLicenseBuff >();
			dictByLicnTenantIdx.put( key, subdictLicnTenantIdx );
			recArray = new YCFIntLicenseBuff[0];
		}
		return( recArray );
	}

	public YCFIntLicenseBuff[] readDerivedByDomainIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TopDomainId )
	{
		final String S_ProcName = "YCFBamRamLicense.readDerivedByDomainIdx";
		YCFIntLicenseByDomainIdxKey key = schema.getFactoryLicense().newDomainIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTopDomainId( TopDomainId );

		YCFIntLicenseBuff[] recArray;
		if( dictByDomainIdx.containsKey( key ) ) {
			Map< YCFIntLicensePKey, YCFIntLicenseBuff > subdictDomainIdx
				= dictByDomainIdx.get( key );
			recArray = new YCFIntLicenseBuff[ subdictDomainIdx.size() ];
			Iterator< YCFIntLicenseBuff > iter = subdictDomainIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFIntLicensePKey, YCFIntLicenseBuff > subdictDomainIdx
				= new HashMap< YCFIntLicensePKey, YCFIntLicenseBuff >();
			dictByDomainIdx.put( key, subdictDomainIdx );
			recArray = new YCFIntLicenseBuff[0];
		}
		return( recArray );
	}

	public YCFIntLicenseBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TopDomainId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamLicense.readDerivedByUNameIdx";
		YCFIntLicenseByUNameIdxKey key = schema.getFactoryLicense().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTopDomainId( TopDomainId );
		key.setRequiredName( Name );

		YCFIntLicenseBuff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntLicenseBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamLicense.readDerivedByIdIdx() ";
		YCFIntLicensePKey key = schema.getFactoryLicense().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFIntLicenseBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFIntLicenseBuff readBuff( YCFSecAuthorization Authorization,
		YCFIntLicensePKey PKey )
	{
		final String S_ProcName = "YCFBamRamLicense.readBuff";
		YCFIntLicenseBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a101" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFIntLicenseBuff lockBuff( YCFSecAuthorization Authorization,
		YCFIntLicensePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFIntLicenseBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a101" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFIntLicenseBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamLicense.readAllBuff";
		YCFIntLicenseBuff buff;
		ArrayList<YCFIntLicenseBuff> filteredList = new ArrayList<YCFIntLicenseBuff>();
		YCFIntLicenseBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a101" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFIntLicenseBuff[0] ) );
	}

	public YCFIntLicenseBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFBamRamLicense.readBuffByIdIdx() ";
		YCFIntLicenseBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a101" ) ) {
			return( (YCFIntLicenseBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFIntLicenseBuff[] readBuffByLicnTenantIdx( YCFSecAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFBamRamLicense.readBuffByLicnTenantIdx() ";
		YCFIntLicenseBuff buff;
		ArrayList<YCFIntLicenseBuff> filteredList = new ArrayList<YCFIntLicenseBuff>();
		YCFIntLicenseBuff[] buffList = readDerivedByLicnTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a101" ) ) {
				filteredList.add( (YCFIntLicenseBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFIntLicenseBuff[0] ) );
	}

	public YCFIntLicenseBuff[] readBuffByDomainIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TopDomainId )
	{
		final String S_ProcName = "YCFBamRamLicense.readBuffByDomainIdx() ";
		YCFIntLicenseBuff buff;
		ArrayList<YCFIntLicenseBuff> filteredList = new ArrayList<YCFIntLicenseBuff>();
		YCFIntLicenseBuff[] buffList = readDerivedByDomainIdx( Authorization,
			TenantId,
			TopDomainId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a101" ) ) {
				filteredList.add( (YCFIntLicenseBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFIntLicenseBuff[0] ) );
	}

	public YCFIntLicenseBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TopDomainId,
		String Name )
	{
		final String S_ProcName = "YCFBamRamLicense.readBuffByUNameIdx() ";
		YCFIntLicenseBuff buff = readDerivedByUNameIdx( Authorization,
			TenantId,
			TopDomainId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a101" ) ) {
			return( (YCFIntLicenseBuff)buff );
		}
		else {
			return( null );
		}
	}

	public void updateLicense( YCFSecAuthorization Authorization,
		YCFIntLicenseBuff Buff )
	{
		YCFIntLicensePKey pkey = schema.getFactoryLicense().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFIntLicenseBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateLicense",
				"Existing record not found",
				"License",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateLicense",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFIntLicenseByLicnTenantIdxKey existingKeyLicnTenantIdx = schema.getFactoryLicense().newLicnTenantIdxKey();
		existingKeyLicnTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFIntLicenseByLicnTenantIdxKey newKeyLicnTenantIdx = schema.getFactoryLicense().newLicnTenantIdxKey();
		newKeyLicnTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFIntLicenseByDomainIdxKey existingKeyDomainIdx = schema.getFactoryLicense().newDomainIdxKey();
		existingKeyDomainIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyDomainIdx.setRequiredTopDomainId( existing.getRequiredTopDomainId() );

		YCFIntLicenseByDomainIdxKey newKeyDomainIdx = schema.getFactoryLicense().newDomainIdxKey();
		newKeyDomainIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyDomainIdx.setRequiredTopDomainId( Buff.getRequiredTopDomainId() );

		YCFIntLicenseByUNameIdxKey existingKeyUNameIdx = schema.getFactoryLicense().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyUNameIdx.setRequiredTopDomainId( existing.getRequiredTopDomainId() );
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFIntLicenseByUNameIdxKey newKeyUNameIdx = schema.getFactoryLicense().newUNameIdxKey();
		newKeyUNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyUNameIdx.setRequiredTopDomainId( Buff.getRequiredTopDomainId() );
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateLicense",
					"LicenseUNameIdx",
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
						"updateLicense",
						"Owner",
						"Owner",
						"Tenant",
						null );
				}
			}
		}

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableTopDomain().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredTopDomainId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateLicense",
						"Container",
						"TopDomain",
						"TopDomain",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFIntLicensePKey, YCFIntLicenseBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByLicnTenantIdx.get( existingKeyLicnTenantIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByLicnTenantIdx.containsKey( newKeyLicnTenantIdx ) ) {
			subdict = dictByLicnTenantIdx.get( newKeyLicnTenantIdx );
		}
		else {
			subdict = new HashMap< YCFIntLicensePKey, YCFIntLicenseBuff >();
			dictByLicnTenantIdx.put( newKeyLicnTenantIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByDomainIdx.get( existingKeyDomainIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByDomainIdx.containsKey( newKeyDomainIdx ) ) {
			subdict = dictByDomainIdx.get( newKeyDomainIdx );
		}
		else {
			subdict = new HashMap< YCFIntLicensePKey, YCFIntLicenseBuff >();
			dictByDomainIdx.put( newKeyDomainIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

	}

	public void deleteLicense( YCFSecAuthorization Authorization,
		YCFIntLicenseBuff Buff )
	{
		final String S_ProcName = "YCFBamRamLicenseTable.deleteLicense() ";
		String classCode;
		YCFIntLicensePKey pkey = schema.getFactoryLicense().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFIntLicenseBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteLicense",
				pkey );
		}
		YCFIntLicenseByLicnTenantIdxKey keyLicnTenantIdx = schema.getFactoryLicense().newLicnTenantIdxKey();
		keyLicnTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFIntLicenseByDomainIdxKey keyDomainIdx = schema.getFactoryLicense().newDomainIdxKey();
		keyDomainIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyDomainIdx.setRequiredTopDomainId( existing.getRequiredTopDomainId() );

		YCFIntLicenseByUNameIdxKey keyUNameIdx = schema.getFactoryLicense().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredTopDomainId( existing.getRequiredTopDomainId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFIntLicensePKey, YCFIntLicenseBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByLicnTenantIdx.get( keyLicnTenantIdx );
		subdict.remove( pkey );

		subdict = dictByDomainIdx.get( keyDomainIdx );
		subdict.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

	}
	public void deleteLicenseByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFIntLicensePKey key = schema.getFactoryLicense().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteLicenseByIdIdx( Authorization, key );
	}

	public void deleteLicenseByIdIdx( YCFSecAuthorization Authorization,
		YCFIntLicensePKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFIntLicenseBuff cur;
		LinkedList<YCFIntLicenseBuff> matchSet = new LinkedList<YCFIntLicenseBuff>();
		Iterator<YCFIntLicenseBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFIntLicenseBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableLicense().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteLicense( Authorization, cur );
		}
	}

	public void deleteLicenseByLicnTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId )
	{
		YCFIntLicenseByLicnTenantIdxKey key = schema.getFactoryLicense().newLicnTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteLicenseByLicnTenantIdx( Authorization, key );
	}

	public void deleteLicenseByLicnTenantIdx( YCFSecAuthorization Authorization,
		YCFIntLicenseByLicnTenantIdxKey argKey )
	{
		YCFIntLicenseBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFIntLicenseBuff> matchSet = new LinkedList<YCFIntLicenseBuff>();
		Iterator<YCFIntLicenseBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFIntLicenseBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableLicense().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteLicense( Authorization, cur );
		}
	}

	public void deleteLicenseByDomainIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTopDomainId )
	{
		YCFIntLicenseByDomainIdxKey key = schema.getFactoryLicense().newDomainIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTopDomainId( argTopDomainId );
		deleteLicenseByDomainIdx( Authorization, key );
	}

	public void deleteLicenseByDomainIdx( YCFSecAuthorization Authorization,
		YCFIntLicenseByDomainIdxKey argKey )
	{
		YCFIntLicenseBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFIntLicenseBuff> matchSet = new LinkedList<YCFIntLicenseBuff>();
		Iterator<YCFIntLicenseBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFIntLicenseBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableLicense().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteLicense( Authorization, cur );
		}
	}

	public void deleteLicenseByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTopDomainId,
		String argName )
	{
		YCFIntLicenseByUNameIdxKey key = schema.getFactoryLicense().newUNameIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTopDomainId( argTopDomainId );
		key.setRequiredName( argName );
		deleteLicenseByUNameIdx( Authorization, key );
	}

	public void deleteLicenseByUNameIdx( YCFSecAuthorization Authorization,
		YCFIntLicenseByUNameIdxKey argKey )
	{
		YCFIntLicenseBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFIntLicenseBuff> matchSet = new LinkedList<YCFIntLicenseBuff>();
		Iterator<YCFIntLicenseBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFIntLicenseBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableLicense().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteLicense( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
