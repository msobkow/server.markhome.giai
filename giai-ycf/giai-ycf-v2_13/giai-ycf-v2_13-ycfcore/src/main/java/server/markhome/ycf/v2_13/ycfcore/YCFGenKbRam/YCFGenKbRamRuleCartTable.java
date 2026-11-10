
// Description: Java 11 in-memory RAM DbIO implementation for RuleCart.

/*
 *	org.mssycf.mssycf.YCFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory YCFCore 2.13 Generation Knowledgebase
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbRam;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj.*;

/*
 *	YCFGenKbRamRuleCartTable in-memory RAM DbIO implementation
 *	for RuleCart.
 */
public class YCFGenKbRamRuleCartTable
	implements IYCFGenKbRuleCartTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbRuleCartPKey,
				YCFGenKbRuleCartBuff > dictByPKey
		= new HashMap< YCFGenKbRuleCartPKey,
				YCFGenKbRuleCartBuff >();
	private Map< YCFGenKbRuleCartByTenantIdxKey,
				Map< YCFGenKbRuleCartPKey,
					YCFGenKbRuleCartBuff >> dictByTenantIdx
		= new HashMap< YCFGenKbRuleCartByTenantIdxKey,
				Map< YCFGenKbRuleCartPKey,
					YCFGenKbRuleCartBuff >>();
	private Map< YCFGenKbRuleCartByNameIdxKey,
			YCFGenKbRuleCartBuff > dictByNameIdx
		= new HashMap< YCFGenKbRuleCartByNameIdxKey,
			YCFGenKbRuleCartBuff >();

	public YCFGenKbRamRuleCartTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createRuleCart( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleCartBuff Buff )
	{
		final String S_ProcName = "createRuleCart";
		YCFGenKbRuleCartPKey pkey = schema.getFactoryRuleCart().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( ((YCFGenKbRamTenantTable)schema.getTableTenant()).nextRuleCartIdGen( Authorization,
			Buff.getRequiredTenantId() ) );
		Buff.setRequiredTenantId( pkey.getRequiredTenantId() );
		Buff.setRequiredId( pkey.getRequiredId() );
		YCFGenKbRuleCartByTenantIdxKey keyTenantIdx = schema.getFactoryRuleCart().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFGenKbRuleCartByNameIdxKey keyNameIdx = schema.getFactoryRuleCart().newNameIdxKey();
		keyNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyNameIdx.setRequiredName( Buff.getRequiredName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByNameIdx.containsKey( keyNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"RuleCartName",
				keyNameIdx );
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
						"Container",
						"Tenant",
						"Tenant",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFGenKbRuleCartPKey, YCFGenKbRuleCartBuff > subdictTenantIdx;
		if( dictByTenantIdx.containsKey( keyTenantIdx ) ) {
			subdictTenantIdx = dictByTenantIdx.get( keyTenantIdx );
		}
		else {
			subdictTenantIdx = new HashMap< YCFGenKbRuleCartPKey, YCFGenKbRuleCartBuff >();
			dictByTenantIdx.put( keyTenantIdx, subdictTenantIdx );
		}
		subdictTenantIdx.put( pkey, Buff );

		dictByNameIdx.put( keyNameIdx, Buff );

	}

	public YCFGenKbRuleCartBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleCartPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamRuleCart.readDerived";
		YCFGenKbRuleCartPKey key = schema.getFactoryRuleCart().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFGenKbRuleCartBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbRuleCartBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleCartPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamRuleCart.readDerived";
		YCFGenKbRuleCartPKey key = schema.getFactoryRuleCart().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredId( PKey.getRequiredId() );
		YCFGenKbRuleCartBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbRuleCartBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamRuleCart.readAllDerived";
		YCFGenKbRuleCartBuff[] retList = new YCFGenKbRuleCartBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbRuleCartBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbRuleCartBuff[] readDerivedByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFGenKbRamRuleCart.readDerivedByTenantIdx";
		YCFGenKbRuleCartByTenantIdxKey key = schema.getFactoryRuleCart().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );

		YCFGenKbRuleCartBuff[] recArray;
		if( dictByTenantIdx.containsKey( key ) ) {
			Map< YCFGenKbRuleCartPKey, YCFGenKbRuleCartBuff > subdictTenantIdx
				= dictByTenantIdx.get( key );
			recArray = new YCFGenKbRuleCartBuff[ subdictTenantIdx.size() ];
			Iterator< YCFGenKbRuleCartBuff > iter = subdictTenantIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbRuleCartPKey, YCFGenKbRuleCartBuff > subdictTenantIdx
				= new HashMap< YCFGenKbRuleCartPKey, YCFGenKbRuleCartBuff >();
			dictByTenantIdx.put( key, subdictTenantIdx );
			recArray = new YCFGenKbRuleCartBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbRuleCartBuff readDerivedByNameIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		String Name )
	{
		final String S_ProcName = "YCFGenKbRamRuleCart.readDerivedByNameIdx";
		YCFGenKbRuleCartByNameIdxKey key = schema.getFactoryRuleCart().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredName( Name );

		YCFGenKbRuleCartBuff buff;
		if( dictByNameIdx.containsKey( key ) ) {
			buff = dictByNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbRuleCartBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFGenKbRamRuleCart.readDerivedByIdIdx() ";
		YCFGenKbRuleCartPKey key = schema.getFactoryRuleCart().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredId( Id );

		YCFGenKbRuleCartBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbRuleCartBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleCartPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamRuleCart.readBuff";
		YCFGenKbRuleCartBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a925" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbRuleCartBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleCartPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbRuleCartBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a925" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbRuleCartBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamRuleCart.readAllBuff";
		YCFGenKbRuleCartBuff buff;
		ArrayList<YCFGenKbRuleCartBuff> filteredList = new ArrayList<YCFGenKbRuleCartBuff>();
		YCFGenKbRuleCartBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a925" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbRuleCartBuff[0] ) );
	}

	public YCFGenKbRuleCartBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long Id )
	{
		final String S_ProcName = "YCFGenKbRamRuleCart.readBuffByIdIdx() ";
		YCFGenKbRuleCartBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a925" ) ) {
			return( (YCFGenKbRuleCartBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbRuleCartBuff[] readBuffByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFGenKbRamRuleCart.readBuffByTenantIdx() ";
		YCFGenKbRuleCartBuff buff;
		ArrayList<YCFGenKbRuleCartBuff> filteredList = new ArrayList<YCFGenKbRuleCartBuff>();
		YCFGenKbRuleCartBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a925" ) ) {
				filteredList.add( (YCFGenKbRuleCartBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbRuleCartBuff[0] ) );
	}

	public YCFGenKbRuleCartBuff readBuffByNameIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		String Name )
	{
		final String S_ProcName = "YCFGenKbRamRuleCart.readBuffByNameIdx() ";
		YCFGenKbRuleCartBuff buff = readDerivedByNameIdx( Authorization,
			TenantId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a925" ) ) {
			return( (YCFGenKbRuleCartBuff)buff );
		}
		else {
			return( null );
		}
	}

	public void updateRuleCart( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleCartBuff Buff )
	{
		YCFGenKbRuleCartPKey pkey = schema.getFactoryRuleCart().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFGenKbRuleCartBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateRuleCart",
				"Existing record not found",
				"RuleCart",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateRuleCart",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFGenKbRuleCartByTenantIdxKey existingKeyTenantIdx = schema.getFactoryRuleCart().newTenantIdxKey();
		existingKeyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFGenKbRuleCartByTenantIdxKey newKeyTenantIdx = schema.getFactoryRuleCart().newTenantIdxKey();
		newKeyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFGenKbRuleCartByNameIdxKey existingKeyNameIdx = schema.getFactoryRuleCart().newNameIdxKey();
		existingKeyNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyNameIdx.setRequiredName( existing.getRequiredName() );

		YCFGenKbRuleCartByNameIdxKey newKeyNameIdx = schema.getFactoryRuleCart().newNameIdxKey();
		newKeyNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyNameIdx.setRequiredName( Buff.getRequiredName() );

		// Check unique indexes

		if( ! existingKeyNameIdx.equals( newKeyNameIdx ) ) {
			if( dictByNameIdx.containsKey( newKeyNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateRuleCart",
					"RuleCartName",
					newKeyNameIdx );
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
						"updateRuleCart",
						"Container",
						"Tenant",
						"Tenant",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFGenKbRuleCartPKey, YCFGenKbRuleCartBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByTenantIdx.get( existingKeyTenantIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByTenantIdx.containsKey( newKeyTenantIdx ) ) {
			subdict = dictByTenantIdx.get( newKeyTenantIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbRuleCartPKey, YCFGenKbRuleCartBuff >();
			dictByTenantIdx.put( newKeyTenantIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByNameIdx.remove( existingKeyNameIdx );
		dictByNameIdx.put( newKeyNameIdx, Buff );

	}

	public void deleteRuleCart( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleCartBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamRuleCartTable.deleteRuleCart() ";
		String classCode;
		YCFGenKbRuleCartPKey pkey = schema.getFactoryRuleCart().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFGenKbRuleCartBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteRuleCart",
				pkey );
		}
					schema.getTableGenItem().deleteGenItemByCartIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredId() );
		YCFGenKbRuleCartByTenantIdxKey keyTenantIdx = schema.getFactoryRuleCart().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFGenKbRuleCartByNameIdxKey keyNameIdx = schema.getFactoryRuleCart().newNameIdxKey();
		keyNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyNameIdx.setRequiredName( existing.getRequiredName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFGenKbRuleCartPKey, YCFGenKbRuleCartBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByTenantIdx.get( keyTenantIdx );
		subdict.remove( pkey );

		dictByNameIdx.remove( keyNameIdx );

	}
	public void deleteRuleCartByIdIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argId )
	{
		YCFGenKbRuleCartPKey key = schema.getFactoryRuleCart().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredId( argId );
		deleteRuleCartByIdIdx( Authorization, key );
	}

	public void deleteRuleCartByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleCartPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbRuleCartBuff cur;
		LinkedList<YCFGenKbRuleCartBuff> matchSet = new LinkedList<YCFGenKbRuleCartBuff>();
		Iterator<YCFGenKbRuleCartBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbRuleCartBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRuleCart().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteRuleCart( Authorization, cur );
		}
	}

	public void deleteRuleCartByTenantIdx( YCFGenKbAuthorization Authorization,
		long argTenantId )
	{
		YCFGenKbRuleCartByTenantIdxKey key = schema.getFactoryRuleCart().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteRuleCartByTenantIdx( Authorization, key );
	}

	public void deleteRuleCartByTenantIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleCartByTenantIdxKey argKey )
	{
		YCFGenKbRuleCartBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbRuleCartBuff> matchSet = new LinkedList<YCFGenKbRuleCartBuff>();
		Iterator<YCFGenKbRuleCartBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbRuleCartBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRuleCart().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteRuleCart( Authorization, cur );
		}
	}

	public void deleteRuleCartByNameIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		String argName )
	{
		YCFGenKbRuleCartByNameIdxKey key = schema.getFactoryRuleCart().newNameIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredName( argName );
		deleteRuleCartByNameIdx( Authorization, key );
	}

	public void deleteRuleCartByNameIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleCartByNameIdxKey argKey )
	{
		YCFGenKbRuleCartBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbRuleCartBuff> matchSet = new LinkedList<YCFGenKbRuleCartBuff>();
		Iterator<YCFGenKbRuleCartBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbRuleCartBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRuleCart().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredId() );
			deleteRuleCart( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
