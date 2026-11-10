
// Description: Java 11 in-memory RAM DbIO implementation for RuleType.

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
 *	YCFGenKbRamRuleTypeTable in-memory RAM DbIO implementation
 *	for RuleType.
 */
public class YCFGenKbRamRuleTypeTable
	implements IYCFGenKbRuleTypeTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbRuleTypePKey,
				YCFGenKbRuleTypeBuff > dictByPKey
		= new HashMap< YCFGenKbRuleTypePKey,
				YCFGenKbRuleTypeBuff >();
	private Map< YCFGenKbRuleTypeByNameIdxKey,
			YCFGenKbRuleTypeBuff > dictByNameIdx
		= new HashMap< YCFGenKbRuleTypeByNameIdxKey,
			YCFGenKbRuleTypeBuff >();

	public YCFGenKbRamRuleTypeTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createRuleType( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleTypeBuff Buff )
	{
		final String S_ProcName = "createRuleType";
		YCFGenKbRuleTypePKey pkey = schema.getFactoryRuleType().newPKey();
		pkey.setRequiredId( schema.nextRuleTypeIdGen() );
		Buff.setRequiredId( pkey.getRequiredId() );
		YCFGenKbRuleTypeByNameIdxKey keyNameIdx = schema.getFactoryRuleType().newNameIdxKey();
		keyNameIdx.setRequiredName( Buff.getRequiredName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByNameIdx.containsKey( keyNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"RuleTypeName",
				keyNameIdx );
		}

		// Validate foreign keys

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		dictByNameIdx.put( keyNameIdx, Buff );

	}

	public YCFGenKbRuleTypeBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleTypePKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamRuleType.readDerived";
		YCFGenKbRuleTypePKey key = schema.getFactoryRuleType().newPKey();
		key.setRequiredId( PKey.getRequiredId() );
		YCFGenKbRuleTypeBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbRuleTypeBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleTypePKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamRuleType.readDerived";
		YCFGenKbRuleTypePKey key = schema.getFactoryRuleType().newPKey();
		key.setRequiredId( PKey.getRequiredId() );
		YCFGenKbRuleTypeBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbRuleTypeBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamRuleType.readAllDerived";
		YCFGenKbRuleTypeBuff[] retList = new YCFGenKbRuleTypeBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbRuleTypeBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbRuleTypeBuff readDerivedByNameIdx( YCFGenKbAuthorization Authorization,
		String Name )
	{
		final String S_ProcName = "YCFGenKbRamRuleType.readDerivedByNameIdx";
		YCFGenKbRuleTypeByNameIdxKey key = schema.getFactoryRuleType().newNameIdxKey();
		key.setRequiredName( Name );

		YCFGenKbRuleTypeBuff buff;
		if( dictByNameIdx.containsKey( key ) ) {
			buff = dictByNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbRuleTypeBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
		short Id )
	{
		final String S_ProcName = "YCFGenKbRamRuleType.readDerivedByIdIdx() ";
		YCFGenKbRuleTypePKey key = schema.getFactoryRuleType().newPKey();
		key.setRequiredId( Id );

		YCFGenKbRuleTypeBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbRuleTypeBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleTypePKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamRuleType.readBuff";
		YCFGenKbRuleTypeBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a926" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbRuleTypeBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleTypePKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbRuleTypeBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a926" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbRuleTypeBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamRuleType.readAllBuff";
		YCFGenKbRuleTypeBuff buff;
		ArrayList<YCFGenKbRuleTypeBuff> filteredList = new ArrayList<YCFGenKbRuleTypeBuff>();
		YCFGenKbRuleTypeBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a926" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbRuleTypeBuff[0] ) );
	}

	public YCFGenKbRuleTypeBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
		short Id )
	{
		final String S_ProcName = "YCFGenKbRamRuleType.readBuffByIdIdx() ";
		YCFGenKbRuleTypeBuff buff = readDerivedByIdIdx( Authorization,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a926" ) ) {
			return( (YCFGenKbRuleTypeBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbRuleTypeBuff readBuffByNameIdx( YCFGenKbAuthorization Authorization,
		String Name )
	{
		final String S_ProcName = "YCFGenKbRamRuleType.readBuffByNameIdx() ";
		YCFGenKbRuleTypeBuff buff = readDerivedByNameIdx( Authorization,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a926" ) ) {
			return( (YCFGenKbRuleTypeBuff)buff );
		}
		else {
			return( null );
		}
	}

	public void updateRuleType( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleTypeBuff Buff )
	{
		YCFGenKbRuleTypePKey pkey = schema.getFactoryRuleType().newPKey();
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFGenKbRuleTypeBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateRuleType",
				"Existing record not found",
				"RuleType",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateRuleType",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFGenKbRuleTypeByNameIdxKey existingKeyNameIdx = schema.getFactoryRuleType().newNameIdxKey();
		existingKeyNameIdx.setRequiredName( existing.getRequiredName() );

		YCFGenKbRuleTypeByNameIdxKey newKeyNameIdx = schema.getFactoryRuleType().newNameIdxKey();
		newKeyNameIdx.setRequiredName( Buff.getRequiredName() );

		// Check unique indexes

		if( ! existingKeyNameIdx.equals( newKeyNameIdx ) ) {
			if( dictByNameIdx.containsKey( newKeyNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateRuleType",
					"RuleTypeName",
					newKeyNameIdx );
			}
		}

		// Validate foreign keys

		// Update is valid

		Map< YCFGenKbRuleTypePKey, YCFGenKbRuleTypeBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		dictByNameIdx.remove( existingKeyNameIdx );
		dictByNameIdx.put( newKeyNameIdx, Buff );

	}

	public void deleteRuleType( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleTypeBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamRuleTypeTable.deleteRuleType() ";
		String classCode;
		YCFGenKbRuleTypePKey pkey = schema.getFactoryRuleType().newPKey();
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFGenKbRuleTypeBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteRuleType",
				pkey );
		}
		YCFGenKbRuleTypeByNameIdxKey keyNameIdx = schema.getFactoryRuleType().newNameIdxKey();
		keyNameIdx.setRequiredName( existing.getRequiredName() );

		// Validate reverse foreign keys

		if( schema.getTableGenItem().readDerivedByRuleTypeIdx( Authorization,
					existing.getRequiredId() ).length > 0 )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteRuleType",
				"Lookup",
				"RuleType",
				"GenItem",
				pkey );
		}

		// Delete is valid
		Map< YCFGenKbRuleTypePKey, YCFGenKbRuleTypeBuff > subdict;

		dictByPKey.remove( pkey );

		dictByNameIdx.remove( keyNameIdx );

	}
	public void deleteRuleTypeByIdIdx( YCFGenKbAuthorization Authorization,
		short argId )
	{
		YCFGenKbRuleTypePKey key = schema.getFactoryRuleType().newPKey();
		key.setRequiredId( argId );
		deleteRuleTypeByIdIdx( Authorization, key );
	}

	public void deleteRuleTypeByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleTypePKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbRuleTypeBuff cur;
		LinkedList<YCFGenKbRuleTypeBuff> matchSet = new LinkedList<YCFGenKbRuleTypeBuff>();
		Iterator<YCFGenKbRuleTypeBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbRuleTypeBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRuleType().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() );
			deleteRuleType( Authorization, cur );
		}
	}

	public void deleteRuleTypeByNameIdx( YCFGenKbAuthorization Authorization,
		String argName )
	{
		YCFGenKbRuleTypeByNameIdxKey key = schema.getFactoryRuleType().newNameIdxKey();
		key.setRequiredName( argName );
		deleteRuleTypeByNameIdx( Authorization, key );
	}

	public void deleteRuleTypeByNameIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbRuleTypeByNameIdxKey argKey )
	{
		YCFGenKbRuleTypeBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbRuleTypeBuff> matchSet = new LinkedList<YCFGenKbRuleTypeBuff>();
		Iterator<YCFGenKbRuleTypeBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbRuleTypeBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableRuleType().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() );
			deleteRuleType( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
