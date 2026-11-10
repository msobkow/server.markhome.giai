
// Description: Java 11 in-memory RAM DbIO implementation for Tool.

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
 *	YCFGenKbRamToolTable in-memory RAM DbIO implementation
 *	for Tool.
 */
public class YCFGenKbRamToolTable
	implements IYCFGenKbToolTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbToolPKey,
				YCFGenKbToolBuff > dictByPKey
		= new HashMap< YCFGenKbToolPKey,
				YCFGenKbToolBuff >();
	private Map< YCFGenKbToolByNameIdxKey,
			YCFGenKbToolBuff > dictByNameIdx
		= new HashMap< YCFGenKbToolByNameIdxKey,
			YCFGenKbToolBuff >();
	private Map< YCFGenKbToolByReplacesIdxKey,
				Map< YCFGenKbToolPKey,
					YCFGenKbToolBuff >> dictByReplacesIdx
		= new HashMap< YCFGenKbToolByReplacesIdxKey,
				Map< YCFGenKbToolPKey,
					YCFGenKbToolBuff >>();

	public YCFGenKbRamToolTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createTool( YCFGenKbAuthorization Authorization,
		YCFGenKbToolBuff Buff )
	{
		final String S_ProcName = "createTool";
		YCFGenKbToolPKey pkey = schema.getFactoryTool().newPKey();
		pkey.setRequiredId( schema.nextToolIdGen() );
		Buff.setRequiredId( pkey.getRequiredId() );
		YCFGenKbToolByNameIdxKey keyNameIdx = schema.getFactoryTool().newNameIdxKey();
		keyNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFGenKbToolByReplacesIdxKey keyReplacesIdx = schema.getFactoryTool().newReplacesIdxKey();
		keyReplacesIdx.setOptionalReplacesId( Buff.getOptionalReplacesId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByNameIdx.containsKey( keyNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"ToolName",
				keyNameIdx );
		}

		// Validate foreign keys

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		dictByNameIdx.put( keyNameIdx, Buff );

		Map< YCFGenKbToolPKey, YCFGenKbToolBuff > subdictReplacesIdx;
		if( dictByReplacesIdx.containsKey( keyReplacesIdx ) ) {
			subdictReplacesIdx = dictByReplacesIdx.get( keyReplacesIdx );
		}
		else {
			subdictReplacesIdx = new HashMap< YCFGenKbToolPKey, YCFGenKbToolBuff >();
			dictByReplacesIdx.put( keyReplacesIdx, subdictReplacesIdx );
		}
		subdictReplacesIdx.put( pkey, Buff );

	}

	public YCFGenKbToolBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbToolPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamTool.readDerived";
		YCFGenKbToolPKey key = schema.getFactoryTool().newPKey();
		key.setRequiredId( PKey.getRequiredId() );
		YCFGenKbToolBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbToolBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbToolPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamTool.readDerived";
		YCFGenKbToolPKey key = schema.getFactoryTool().newPKey();
		key.setRequiredId( PKey.getRequiredId() );
		YCFGenKbToolBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbToolBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamTool.readAllDerived";
		YCFGenKbToolBuff[] retList = new YCFGenKbToolBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbToolBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbToolBuff readDerivedByNameIdx( YCFGenKbAuthorization Authorization,
		String Name )
	{
		final String S_ProcName = "YCFGenKbRamTool.readDerivedByNameIdx";
		YCFGenKbToolByNameIdxKey key = schema.getFactoryTool().newNameIdxKey();
		key.setRequiredName( Name );

		YCFGenKbToolBuff buff;
		if( dictByNameIdx.containsKey( key ) ) {
			buff = dictByNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbToolBuff[] readDerivedByReplacesIdx( YCFGenKbAuthorization Authorization,
		Short ReplacesId )
	{
		final String S_ProcName = "YCFGenKbRamTool.readDerivedByReplacesIdx";
		YCFGenKbToolByReplacesIdxKey key = schema.getFactoryTool().newReplacesIdxKey();
		key.setOptionalReplacesId( ReplacesId );

		YCFGenKbToolBuff[] recArray;
		if( dictByReplacesIdx.containsKey( key ) ) {
			Map< YCFGenKbToolPKey, YCFGenKbToolBuff > subdictReplacesIdx
				= dictByReplacesIdx.get( key );
			recArray = new YCFGenKbToolBuff[ subdictReplacesIdx.size() ];
			Iterator< YCFGenKbToolBuff > iter = subdictReplacesIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbToolPKey, YCFGenKbToolBuff > subdictReplacesIdx
				= new HashMap< YCFGenKbToolPKey, YCFGenKbToolBuff >();
			dictByReplacesIdx.put( key, subdictReplacesIdx );
			recArray = new YCFGenKbToolBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbToolBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
		short Id )
	{
		final String S_ProcName = "YCFGenKbRamTool.readDerivedByIdIdx() ";
		YCFGenKbToolPKey key = schema.getFactoryTool().newPKey();
		key.setRequiredId( Id );

		YCFGenKbToolBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbToolBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbToolPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamTool.readBuff";
		YCFGenKbToolBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a927" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbToolBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbToolPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbToolBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a927" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbToolBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamTool.readAllBuff";
		YCFGenKbToolBuff buff;
		ArrayList<YCFGenKbToolBuff> filteredList = new ArrayList<YCFGenKbToolBuff>();
		YCFGenKbToolBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a927" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbToolBuff[0] ) );
	}

	public YCFGenKbToolBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
		short Id )
	{
		final String S_ProcName = "YCFGenKbRamTool.readBuffByIdIdx() ";
		YCFGenKbToolBuff buff = readDerivedByIdIdx( Authorization,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a927" ) ) {
			return( (YCFGenKbToolBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbToolBuff readBuffByNameIdx( YCFGenKbAuthorization Authorization,
		String Name )
	{
		final String S_ProcName = "YCFGenKbRamTool.readBuffByNameIdx() ";
		YCFGenKbToolBuff buff = readDerivedByNameIdx( Authorization,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a927" ) ) {
			return( (YCFGenKbToolBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbToolBuff[] readBuffByReplacesIdx( YCFGenKbAuthorization Authorization,
		Short ReplacesId )
	{
		final String S_ProcName = "YCFGenKbRamTool.readBuffByReplacesIdx() ";
		YCFGenKbToolBuff buff;
		ArrayList<YCFGenKbToolBuff> filteredList = new ArrayList<YCFGenKbToolBuff>();
		YCFGenKbToolBuff[] buffList = readDerivedByReplacesIdx( Authorization,
			ReplacesId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a927" ) ) {
				filteredList.add( (YCFGenKbToolBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbToolBuff[0] ) );
	}

	public void updateTool( YCFGenKbAuthorization Authorization,
		YCFGenKbToolBuff Buff )
	{
		YCFGenKbToolPKey pkey = schema.getFactoryTool().newPKey();
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFGenKbToolBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateTool",
				"Existing record not found",
				"Tool",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateTool",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFGenKbToolByNameIdxKey existingKeyNameIdx = schema.getFactoryTool().newNameIdxKey();
		existingKeyNameIdx.setRequiredName( existing.getRequiredName() );

		YCFGenKbToolByNameIdxKey newKeyNameIdx = schema.getFactoryTool().newNameIdxKey();
		newKeyNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFGenKbToolByReplacesIdxKey existingKeyReplacesIdx = schema.getFactoryTool().newReplacesIdxKey();
		existingKeyReplacesIdx.setOptionalReplacesId( existing.getOptionalReplacesId() );

		YCFGenKbToolByReplacesIdxKey newKeyReplacesIdx = schema.getFactoryTool().newReplacesIdxKey();
		newKeyReplacesIdx.setOptionalReplacesId( Buff.getOptionalReplacesId() );

		// Check unique indexes

		if( ! existingKeyNameIdx.equals( newKeyNameIdx ) ) {
			if( dictByNameIdx.containsKey( newKeyNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateTool",
					"ToolName",
					newKeyNameIdx );
			}
		}

		// Validate foreign keys

		// Update is valid

		Map< YCFGenKbToolPKey, YCFGenKbToolBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		dictByNameIdx.remove( existingKeyNameIdx );
		dictByNameIdx.put( newKeyNameIdx, Buff );

		subdict = dictByReplacesIdx.get( existingKeyReplacesIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByReplacesIdx.containsKey( newKeyReplacesIdx ) ) {
			subdict = dictByReplacesIdx.get( newKeyReplacesIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbToolPKey, YCFGenKbToolBuff >();
			dictByReplacesIdx.put( newKeyReplacesIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteTool( YCFGenKbAuthorization Authorization,
		YCFGenKbToolBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamToolTable.deleteTool() ";
		String classCode;
		YCFGenKbToolPKey pkey = schema.getFactoryTool().newPKey();
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFGenKbToolBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteTool",
				pkey );
		}
		YCFGenKbToolByNameIdxKey keyNameIdx = schema.getFactoryTool().newNameIdxKey();
		keyNameIdx.setRequiredName( existing.getRequiredName() );

		YCFGenKbToolByReplacesIdxKey keyReplacesIdx = schema.getFactoryTool().newReplacesIdxKey();
		keyReplacesIdx.setOptionalReplacesId( existing.getOptionalReplacesId() );

		// Validate reverse foreign keys

		if( schema.getTableToolSet().readDerivedByTool0Idx( Authorization,
					existing.getRequiredId() ).length > 0 )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteTool",
				"Lookup",
				"Tool0",
				"ToolSet",
				pkey );
		}

		// Delete is valid
		Map< YCFGenKbToolPKey, YCFGenKbToolBuff > subdict;

		dictByPKey.remove( pkey );

		dictByNameIdx.remove( keyNameIdx );

		subdict = dictByReplacesIdx.get( keyReplacesIdx );
		subdict.remove( pkey );

	}
	public void deleteToolByIdIdx( YCFGenKbAuthorization Authorization,
		short argId )
	{
		YCFGenKbToolPKey key = schema.getFactoryTool().newPKey();
		key.setRequiredId( argId );
		deleteToolByIdIdx( Authorization, key );
	}

	public void deleteToolByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbToolPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbToolBuff cur;
		LinkedList<YCFGenKbToolBuff> matchSet = new LinkedList<YCFGenKbToolBuff>();
		Iterator<YCFGenKbToolBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbToolBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTool().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() );
			deleteTool( Authorization, cur );
		}
	}

	public void deleteToolByNameIdx( YCFGenKbAuthorization Authorization,
		String argName )
	{
		YCFGenKbToolByNameIdxKey key = schema.getFactoryTool().newNameIdxKey();
		key.setRequiredName( argName );
		deleteToolByNameIdx( Authorization, key );
	}

	public void deleteToolByNameIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbToolByNameIdxKey argKey )
	{
		YCFGenKbToolBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbToolBuff> matchSet = new LinkedList<YCFGenKbToolBuff>();
		Iterator<YCFGenKbToolBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbToolBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTool().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() );
			deleteTool( Authorization, cur );
		}
	}

	public void deleteToolByReplacesIdx( YCFGenKbAuthorization Authorization,
		Short argReplacesId )
	{
		YCFGenKbToolByReplacesIdxKey key = schema.getFactoryTool().newReplacesIdxKey();
		key.setOptionalReplacesId( argReplacesId );
		deleteToolByReplacesIdx( Authorization, key );
	}

	public void deleteToolByReplacesIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbToolByReplacesIdxKey argKey )
	{
		YCFGenKbToolBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalReplacesId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbToolBuff> matchSet = new LinkedList<YCFGenKbToolBuff>();
		Iterator<YCFGenKbToolBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbToolBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTool().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() );
			deleteTool( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
