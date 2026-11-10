
// Description: Java 11 in-memory RAM DbIO implementation for ServiceType.

/*
 *	org.mssycf.mssycf.YCFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFSec 2.13 Security Services
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFSec.
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
 *	YCFBamRamServiceTypeTable in-memory RAM DbIO implementation
 *	for ServiceType.
 */
public class YCFBamRamServiceTypeTable
	implements IYCFBamServiceTypeTable
{
	private IYCFBamSchema schema;
	private Map< YCFSecServiceTypePKey,
				YCFSecServiceTypeBuff > dictByPKey
		= new HashMap< YCFSecServiceTypePKey,
				YCFSecServiceTypeBuff >();
	private Map< YCFSecServiceTypeByUDescrIdxKey,
			YCFSecServiceTypeBuff > dictByUDescrIdx
		= new HashMap< YCFSecServiceTypeByUDescrIdxKey,
			YCFSecServiceTypeBuff >();

	public YCFBamRamServiceTypeTable( IYCFBamSchema argSchema ) {
		schema = argSchema;
	}

	public void createServiceType( YCFSecAuthorization Authorization,
		YCFSecServiceTypeBuff Buff )
	{
		final String S_ProcName = "createServiceType";
		YCFSecServiceTypePKey pkey = schema.getFactoryServiceType().newPKey();
		pkey.setRequiredServiceTypeId( schema.nextServiceTypeIdGen() );
		Buff.setRequiredServiceTypeId( pkey.getRequiredServiceTypeId() );
		YCFSecServiceTypeByUDescrIdxKey keyUDescrIdx = schema.getFactoryServiceType().newUDescrIdxKey();
		keyUDescrIdx.setRequiredDescription( Buff.getRequiredDescription() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUDescrIdx.containsKey( keyUDescrIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"ServiceTypeUDescrIdx",
				keyUDescrIdx );
		}

		// Validate foreign keys

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		dictByUDescrIdx.put( keyUDescrIdx, Buff );

	}

	public YCFSecServiceTypeBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecServiceTypePKey PKey )
	{
		final String S_ProcName = "YCFBamRamServiceType.readDerived";
		YCFSecServiceTypePKey key = schema.getFactoryServiceType().newPKey();
		key.setRequiredServiceTypeId( PKey.getRequiredServiceTypeId() );
		YCFSecServiceTypeBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecServiceTypeBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecServiceTypePKey PKey )
	{
		final String S_ProcName = "YCFBamRamServiceType.readDerived";
		YCFSecServiceTypePKey key = schema.getFactoryServiceType().newPKey();
		key.setRequiredServiceTypeId( PKey.getRequiredServiceTypeId() );
		YCFSecServiceTypeBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecServiceTypeBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFBamRamServiceType.readAllDerived";
		YCFSecServiceTypeBuff[] retList = new YCFSecServiceTypeBuff[ dictByPKey.values().size() ];
		Iterator< YCFSecServiceTypeBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFSecServiceTypeBuff readDerivedByUDescrIdx( YCFSecAuthorization Authorization,
		String Description )
	{
		final String S_ProcName = "YCFBamRamServiceType.readDerivedByUDescrIdx";
		YCFSecServiceTypeByUDescrIdxKey key = schema.getFactoryServiceType().newUDescrIdxKey();
		key.setRequiredDescription( Description );

		YCFSecServiceTypeBuff buff;
		if( dictByUDescrIdx.containsKey( key ) ) {
			buff = dictByUDescrIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecServiceTypeBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		int ServiceTypeId )
	{
		final String S_ProcName = "YCFBamRamServiceType.readDerivedByIdIdx() ";
		YCFSecServiceTypePKey key = schema.getFactoryServiceType().newPKey();
		key.setRequiredServiceTypeId( ServiceTypeId );

		YCFSecServiceTypeBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecServiceTypeBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecServiceTypePKey PKey )
	{
		final String S_ProcName = "YCFBamRamServiceType.readBuff";
		YCFSecServiceTypeBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a013" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecServiceTypeBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecServiceTypePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFSecServiceTypeBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a013" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecServiceTypeBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFBamRamServiceType.readAllBuff";
		YCFSecServiceTypeBuff buff;
		ArrayList<YCFSecServiceTypeBuff> filteredList = new ArrayList<YCFSecServiceTypeBuff>();
		YCFSecServiceTypeBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a013" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFSecServiceTypeBuff[0] ) );
	}

	public YCFSecServiceTypeBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		int ServiceTypeId )
	{
		final String S_ProcName = "YCFBamRamServiceType.readBuffByIdIdx() ";
		YCFSecServiceTypeBuff buff = readDerivedByIdIdx( Authorization,
			ServiceTypeId );
		if( ( buff != null ) && buff.getClassCode().equals( "a013" ) ) {
			return( (YCFSecServiceTypeBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecServiceTypeBuff readBuffByUDescrIdx( YCFSecAuthorization Authorization,
		String Description )
	{
		final String S_ProcName = "YCFBamRamServiceType.readBuffByUDescrIdx() ";
		YCFSecServiceTypeBuff buff = readDerivedByUDescrIdx( Authorization,
			Description );
		if( ( buff != null ) && buff.getClassCode().equals( "a013" ) ) {
			return( (YCFSecServiceTypeBuff)buff );
		}
		else {
			return( null );
		}
	}

	public void updateServiceType( YCFSecAuthorization Authorization,
		YCFSecServiceTypeBuff Buff )
	{
		YCFSecServiceTypePKey pkey = schema.getFactoryServiceType().newPKey();
		pkey.setRequiredServiceTypeId( Buff.getRequiredServiceTypeId() );
		YCFSecServiceTypeBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateServiceType",
				"Existing record not found",
				"ServiceType",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateServiceType",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFSecServiceTypeByUDescrIdxKey existingKeyUDescrIdx = schema.getFactoryServiceType().newUDescrIdxKey();
		existingKeyUDescrIdx.setRequiredDescription( existing.getRequiredDescription() );

		YCFSecServiceTypeByUDescrIdxKey newKeyUDescrIdx = schema.getFactoryServiceType().newUDescrIdxKey();
		newKeyUDescrIdx.setRequiredDescription( Buff.getRequiredDescription() );

		// Check unique indexes

		if( ! existingKeyUDescrIdx.equals( newKeyUDescrIdx ) ) {
			if( dictByUDescrIdx.containsKey( newKeyUDescrIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateServiceType",
					"ServiceTypeUDescrIdx",
					newKeyUDescrIdx );
			}
		}

		// Validate foreign keys

		// Update is valid

		Map< YCFSecServiceTypePKey, YCFSecServiceTypeBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		dictByUDescrIdx.remove( existingKeyUDescrIdx );
		dictByUDescrIdx.put( newKeyUDescrIdx, Buff );

	}

	public void deleteServiceType( YCFSecAuthorization Authorization,
		YCFSecServiceTypeBuff Buff )
	{
		final String S_ProcName = "YCFBamRamServiceTypeTable.deleteServiceType() ";
		String classCode;
		YCFSecServiceTypePKey pkey = schema.getFactoryServiceType().newPKey();
		pkey.setRequiredServiceTypeId( Buff.getRequiredServiceTypeId() );
		YCFSecServiceTypeBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteServiceType",
				pkey );
		}
		// Short circuit self-referential code to prevent stack overflows
		Object arrCheckServiceTypeDeployed[] = schema.getTableService().readDerivedByTypeIdx( Authorization,
						existing.getRequiredServiceTypeId() );
		if( arrCheckServiceTypeDeployed.length > 0 ) {
			schema.getTableService().deleteServiceByTypeIdx( Authorization,
						existing.getRequiredServiceTypeId() );
		}
		YCFSecServiceTypeByUDescrIdxKey keyUDescrIdx = schema.getFactoryServiceType().newUDescrIdxKey();
		keyUDescrIdx.setRequiredDescription( existing.getRequiredDescription() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFSecServiceTypePKey, YCFSecServiceTypeBuff > subdict;

		dictByPKey.remove( pkey );

		dictByUDescrIdx.remove( keyUDescrIdx );

	}
	public void deleteServiceTypeByIdIdx( YCFSecAuthorization Authorization,
		int argServiceTypeId )
	{
		YCFSecServiceTypePKey key = schema.getFactoryServiceType().newPKey();
		key.setRequiredServiceTypeId( argServiceTypeId );
		deleteServiceTypeByIdIdx( Authorization, key );
	}

	public void deleteServiceTypeByIdIdx( YCFSecAuthorization Authorization,
		YCFSecServiceTypePKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFSecServiceTypeBuff cur;
		LinkedList<YCFSecServiceTypeBuff> matchSet = new LinkedList<YCFSecServiceTypeBuff>();
		Iterator<YCFSecServiceTypeBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecServiceTypeBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableServiceType().readDerivedByIdIdx( Authorization,
				cur.getRequiredServiceTypeId() );
			deleteServiceType( Authorization, cur );
		}
	}

	public void deleteServiceTypeByUDescrIdx( YCFSecAuthorization Authorization,
		String argDescription )
	{
		YCFSecServiceTypeByUDescrIdxKey key = schema.getFactoryServiceType().newUDescrIdxKey();
		key.setRequiredDescription( argDescription );
		deleteServiceTypeByUDescrIdx( Authorization, key );
	}

	public void deleteServiceTypeByUDescrIdx( YCFSecAuthorization Authorization,
		YCFSecServiceTypeByUDescrIdxKey argKey )
	{
		YCFSecServiceTypeBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecServiceTypeBuff> matchSet = new LinkedList<YCFSecServiceTypeBuff>();
		Iterator<YCFSecServiceTypeBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecServiceTypeBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableServiceType().readDerivedByIdIdx( Authorization,
				cur.getRequiredServiceTypeId() );
			deleteServiceType( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
