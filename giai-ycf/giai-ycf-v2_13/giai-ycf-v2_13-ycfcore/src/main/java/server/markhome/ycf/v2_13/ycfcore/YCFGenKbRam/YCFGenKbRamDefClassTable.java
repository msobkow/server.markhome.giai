
// Description: Java 11 in-memory RAM DbIO implementation for DefClass.

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
 *	YCFGenKbRamDefClassTable in-memory RAM DbIO implementation
 *	for DefClass.
 */
public class YCFGenKbRamDefClassTable
	implements IYCFGenKbDefClassTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbDefClassPKey,
				YCFGenKbDefClassBuff > dictByPKey
		= new HashMap< YCFGenKbDefClassPKey,
				YCFGenKbDefClassBuff >();
	private Map< YCFGenKbDefClassByNameIdxKey,
			YCFGenKbDefClassBuff > dictByNameIdx
		= new HashMap< YCFGenKbDefClassByNameIdxKey,
			YCFGenKbDefClassBuff >();
	private Map< YCFGenKbDefClassByBaseIdxKey,
				Map< YCFGenKbDefClassPKey,
					YCFGenKbDefClassBuff >> dictByBaseIdx
		= new HashMap< YCFGenKbDefClassByBaseIdxKey,
				Map< YCFGenKbDefClassPKey,
					YCFGenKbDefClassBuff >>();

	public YCFGenKbRamDefClassTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createDefClass( YCFGenKbAuthorization Authorization,
		YCFGenKbDefClassBuff Buff )
	{
		final String S_ProcName = "createDefClass";
		YCFGenKbDefClassPKey pkey = schema.getFactoryDefClass().newPKey();
		pkey.setRequiredId( schema.nextDefClassIdGen() );
		Buff.setRequiredId( pkey.getRequiredId() );
		YCFGenKbDefClassByNameIdxKey keyNameIdx = schema.getFactoryDefClass().newNameIdxKey();
		keyNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFGenKbDefClassByBaseIdxKey keyBaseIdx = schema.getFactoryDefClass().newBaseIdxKey();
		keyBaseIdx.setOptionalBaseId( Buff.getOptionalBaseId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByNameIdx.containsKey( keyNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"DefClassName",
				keyNameIdx );
		}

		// Validate foreign keys

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		dictByNameIdx.put( keyNameIdx, Buff );

		Map< YCFGenKbDefClassPKey, YCFGenKbDefClassBuff > subdictBaseIdx;
		if( dictByBaseIdx.containsKey( keyBaseIdx ) ) {
			subdictBaseIdx = dictByBaseIdx.get( keyBaseIdx );
		}
		else {
			subdictBaseIdx = new HashMap< YCFGenKbDefClassPKey, YCFGenKbDefClassBuff >();
			dictByBaseIdx.put( keyBaseIdx, subdictBaseIdx );
		}
		subdictBaseIdx.put( pkey, Buff );

	}

	public YCFGenKbDefClassBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbDefClassPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamDefClass.readDerived";
		YCFGenKbDefClassPKey key = schema.getFactoryDefClass().newPKey();
		key.setRequiredId( PKey.getRequiredId() );
		YCFGenKbDefClassBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbDefClassBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbDefClassPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamDefClass.readDerived";
		YCFGenKbDefClassPKey key = schema.getFactoryDefClass().newPKey();
		key.setRequiredId( PKey.getRequiredId() );
		YCFGenKbDefClassBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbDefClassBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamDefClass.readAllDerived";
		YCFGenKbDefClassBuff[] retList = new YCFGenKbDefClassBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbDefClassBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbDefClassBuff readDerivedByNameIdx( YCFGenKbAuthorization Authorization,
		String Name )
	{
		final String S_ProcName = "YCFGenKbRamDefClass.readDerivedByNameIdx";
		YCFGenKbDefClassByNameIdxKey key = schema.getFactoryDefClass().newNameIdxKey();
		key.setRequiredName( Name );

		YCFGenKbDefClassBuff buff;
		if( dictByNameIdx.containsKey( key ) ) {
			buff = dictByNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbDefClassBuff[] readDerivedByBaseIdx( YCFGenKbAuthorization Authorization,
		Short BaseId )
	{
		final String S_ProcName = "YCFGenKbRamDefClass.readDerivedByBaseIdx";
		YCFGenKbDefClassByBaseIdxKey key = schema.getFactoryDefClass().newBaseIdxKey();
		key.setOptionalBaseId( BaseId );

		YCFGenKbDefClassBuff[] recArray;
		if( dictByBaseIdx.containsKey( key ) ) {
			Map< YCFGenKbDefClassPKey, YCFGenKbDefClassBuff > subdictBaseIdx
				= dictByBaseIdx.get( key );
			recArray = new YCFGenKbDefClassBuff[ subdictBaseIdx.size() ];
			Iterator< YCFGenKbDefClassBuff > iter = subdictBaseIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbDefClassPKey, YCFGenKbDefClassBuff > subdictBaseIdx
				= new HashMap< YCFGenKbDefClassPKey, YCFGenKbDefClassBuff >();
			dictByBaseIdx.put( key, subdictBaseIdx );
			recArray = new YCFGenKbDefClassBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbDefClassBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
		short Id )
	{
		final String S_ProcName = "YCFGenKbRamDefClass.readDerivedByIdIdx() ";
		YCFGenKbDefClassPKey key = schema.getFactoryDefClass().newPKey();
		key.setRequiredId( Id );

		YCFGenKbDefClassBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbDefClassBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbDefClassPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamDefClass.readBuff";
		YCFGenKbDefClassBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a914" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbDefClassBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbDefClassPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbDefClassBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a914" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbDefClassBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamDefClass.readAllBuff";
		YCFGenKbDefClassBuff buff;
		ArrayList<YCFGenKbDefClassBuff> filteredList = new ArrayList<YCFGenKbDefClassBuff>();
		YCFGenKbDefClassBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a914" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbDefClassBuff[0] ) );
	}

	public YCFGenKbDefClassBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
		short Id )
	{
		final String S_ProcName = "YCFGenKbRamDefClass.readBuffByIdIdx() ";
		YCFGenKbDefClassBuff buff = readDerivedByIdIdx( Authorization,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a914" ) ) {
			return( (YCFGenKbDefClassBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbDefClassBuff readBuffByNameIdx( YCFGenKbAuthorization Authorization,
		String Name )
	{
		final String S_ProcName = "YCFGenKbRamDefClass.readBuffByNameIdx() ";
		YCFGenKbDefClassBuff buff = readDerivedByNameIdx( Authorization,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a914" ) ) {
			return( (YCFGenKbDefClassBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbDefClassBuff[] readBuffByBaseIdx( YCFGenKbAuthorization Authorization,
		Short BaseId )
	{
		final String S_ProcName = "YCFGenKbRamDefClass.readBuffByBaseIdx() ";
		YCFGenKbDefClassBuff buff;
		ArrayList<YCFGenKbDefClassBuff> filteredList = new ArrayList<YCFGenKbDefClassBuff>();
		YCFGenKbDefClassBuff[] buffList = readDerivedByBaseIdx( Authorization,
			BaseId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a914" ) ) {
				filteredList.add( (YCFGenKbDefClassBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbDefClassBuff[0] ) );
	}

	public void updateDefClass( YCFGenKbAuthorization Authorization,
		YCFGenKbDefClassBuff Buff )
	{
		YCFGenKbDefClassPKey pkey = schema.getFactoryDefClass().newPKey();
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFGenKbDefClassBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateDefClass",
				"Existing record not found",
				"DefClass",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateDefClass",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFGenKbDefClassByNameIdxKey existingKeyNameIdx = schema.getFactoryDefClass().newNameIdxKey();
		existingKeyNameIdx.setRequiredName( existing.getRequiredName() );

		YCFGenKbDefClassByNameIdxKey newKeyNameIdx = schema.getFactoryDefClass().newNameIdxKey();
		newKeyNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFGenKbDefClassByBaseIdxKey existingKeyBaseIdx = schema.getFactoryDefClass().newBaseIdxKey();
		existingKeyBaseIdx.setOptionalBaseId( existing.getOptionalBaseId() );

		YCFGenKbDefClassByBaseIdxKey newKeyBaseIdx = schema.getFactoryDefClass().newBaseIdxKey();
		newKeyBaseIdx.setOptionalBaseId( Buff.getOptionalBaseId() );

		// Check unique indexes

		if( ! existingKeyNameIdx.equals( newKeyNameIdx ) ) {
			if( dictByNameIdx.containsKey( newKeyNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateDefClass",
					"DefClassName",
					newKeyNameIdx );
			}
		}

		// Validate foreign keys

		// Update is valid

		Map< YCFGenKbDefClassPKey, YCFGenKbDefClassBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		dictByNameIdx.remove( existingKeyNameIdx );
		dictByNameIdx.put( newKeyNameIdx, Buff );

		subdict = dictByBaseIdx.get( existingKeyBaseIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByBaseIdx.containsKey( newKeyBaseIdx ) ) {
			subdict = dictByBaseIdx.get( newKeyBaseIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbDefClassPKey, YCFGenKbDefClassBuff >();
			dictByBaseIdx.put( newKeyBaseIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteDefClass( YCFGenKbAuthorization Authorization,
		YCFGenKbDefClassBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamDefClassTable.deleteDefClass() ";
		String classCode;
		YCFGenKbDefClassPKey pkey = schema.getFactoryDefClass().newPKey();
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFGenKbDefClassBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteDefClass",
				pkey );
		}
		YCFGenKbDefClassByNameIdxKey keyNameIdx = schema.getFactoryDefClass().newNameIdxKey();
		keyNameIdx.setRequiredName( existing.getRequiredName() );

		YCFGenKbDefClassByBaseIdxKey keyBaseIdx = schema.getFactoryDefClass().newBaseIdxKey();
		keyBaseIdx.setOptionalBaseId( existing.getOptionalBaseId() );

		// Validate reverse foreign keys

		if( schema.getTableGenItem().readDerivedByGenDefIdx( Authorization,
					existing.getRequiredId() ).length > 0 )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteDefClass",
				"Lookup",
				"GenDef",
				"GenItem",
				pkey );
		}

		// Delete is valid
		Map< YCFGenKbDefClassPKey, YCFGenKbDefClassBuff > subdict;

		dictByPKey.remove( pkey );

		dictByNameIdx.remove( keyNameIdx );

		subdict = dictByBaseIdx.get( keyBaseIdx );
		subdict.remove( pkey );

	}
	public void deleteDefClassByIdIdx( YCFGenKbAuthorization Authorization,
		short argId )
	{
		YCFGenKbDefClassPKey key = schema.getFactoryDefClass().newPKey();
		key.setRequiredId( argId );
		deleteDefClassByIdIdx( Authorization, key );
	}

	public void deleteDefClassByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbDefClassPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbDefClassBuff cur;
		LinkedList<YCFGenKbDefClassBuff> matchSet = new LinkedList<YCFGenKbDefClassBuff>();
		Iterator<YCFGenKbDefClassBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbDefClassBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableDefClass().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() );
			deleteDefClass( Authorization, cur );
		}
	}

	public void deleteDefClassByNameIdx( YCFGenKbAuthorization Authorization,
		String argName )
	{
		YCFGenKbDefClassByNameIdxKey key = schema.getFactoryDefClass().newNameIdxKey();
		key.setRequiredName( argName );
		deleteDefClassByNameIdx( Authorization, key );
	}

	public void deleteDefClassByNameIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbDefClassByNameIdxKey argKey )
	{
		YCFGenKbDefClassBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbDefClassBuff> matchSet = new LinkedList<YCFGenKbDefClassBuff>();
		Iterator<YCFGenKbDefClassBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbDefClassBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableDefClass().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() );
			deleteDefClass( Authorization, cur );
		}
	}

	public void deleteDefClassByBaseIdx( YCFGenKbAuthorization Authorization,
		Short argBaseId )
	{
		YCFGenKbDefClassByBaseIdxKey key = schema.getFactoryDefClass().newBaseIdxKey();
		key.setOptionalBaseId( argBaseId );
		deleteDefClassByBaseIdx( Authorization, key );
	}

	public void deleteDefClassByBaseIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbDefClassByBaseIdxKey argKey )
	{
		YCFGenKbDefClassBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalBaseId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbDefClassBuff> matchSet = new LinkedList<YCFGenKbDefClassBuff>();
		Iterator<YCFGenKbDefClassBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbDefClassBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableDefClass().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() );
			deleteDefClass( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
