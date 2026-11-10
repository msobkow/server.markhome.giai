
// Description: Java 11 in-memory RAM DbIO implementation for SecGroup.

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
 *	YCFGenKbRamSecGroupTable in-memory RAM DbIO implementation
 *	for SecGroup.
 */
public class YCFGenKbRamSecGroupTable
	implements IYCFGenKbSecGroupTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbSecGroupPKey,
				YCFGenKbSecGroupBuff > dictByPKey
		= new HashMap< YCFGenKbSecGroupPKey,
				YCFGenKbSecGroupBuff >();
	private Map< YCFGenKbSecGroupByClusterIdxKey,
				Map< YCFGenKbSecGroupPKey,
					YCFGenKbSecGroupBuff >> dictByClusterIdx
		= new HashMap< YCFGenKbSecGroupByClusterIdxKey,
				Map< YCFGenKbSecGroupPKey,
					YCFGenKbSecGroupBuff >>();
	private Map< YCFGenKbSecGroupByClusterVisIdxKey,
				Map< YCFGenKbSecGroupPKey,
					YCFGenKbSecGroupBuff >> dictByClusterVisIdx
		= new HashMap< YCFGenKbSecGroupByClusterVisIdxKey,
				Map< YCFGenKbSecGroupPKey,
					YCFGenKbSecGroupBuff >>();
	private Map< YCFGenKbSecGroupByUNameIdxKey,
			YCFGenKbSecGroupBuff > dictByUNameIdx
		= new HashMap< YCFGenKbSecGroupByUNameIdxKey,
			YCFGenKbSecGroupBuff >();

	public YCFGenKbRamSecGroupTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createSecGroup( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupBuff Buff )
	{
		final String S_ProcName = "createSecGroup";
		YCFGenKbSecGroupPKey pkey = schema.getFactorySecGroup().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecGroupId( ((YCFGenKbRamClusterTable)schema.getTableCluster()).nextSecGroupIdGen( Authorization,
			Buff.getRequiredClusterId() ) );
		Buff.setRequiredClusterId( pkey.getRequiredClusterId() );
		Buff.setRequiredSecGroupId( pkey.getRequiredSecGroupId() );
		YCFGenKbSecGroupByClusterIdxKey keyClusterIdx = schema.getFactorySecGroup().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFGenKbSecGroupByClusterVisIdxKey keyClusterVisIdx = schema.getFactorySecGroup().newClusterVisIdxKey();
		keyClusterVisIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyClusterVisIdx.setRequiredIsVisible( Buff.getRequiredIsVisible() );

		YCFGenKbSecGroupByUNameIdxKey keyUNameIdx = schema.getFactorySecGroup().newUNameIdxKey();
		keyUNameIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"SecGroupUNameIdx",
				keyUNameIdx );
		}

		// Validate foreign keys

		{
			boolean allNull = true;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableCluster().readDerivedByIdIdx( Authorization,
						Buff.getRequiredClusterId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"SecGroupCluster",
						"Cluster",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFGenKbSecGroupPKey, YCFGenKbSecGroupBuff > subdictClusterIdx;
		if( dictByClusterIdx.containsKey( keyClusterIdx ) ) {
			subdictClusterIdx = dictByClusterIdx.get( keyClusterIdx );
		}
		else {
			subdictClusterIdx = new HashMap< YCFGenKbSecGroupPKey, YCFGenKbSecGroupBuff >();
			dictByClusterIdx.put( keyClusterIdx, subdictClusterIdx );
		}
		subdictClusterIdx.put( pkey, Buff );

		Map< YCFGenKbSecGroupPKey, YCFGenKbSecGroupBuff > subdictClusterVisIdx;
		if( dictByClusterVisIdx.containsKey( keyClusterVisIdx ) ) {
			subdictClusterVisIdx = dictByClusterVisIdx.get( keyClusterVisIdx );
		}
		else {
			subdictClusterVisIdx = new HashMap< YCFGenKbSecGroupPKey, YCFGenKbSecGroupBuff >();
			dictByClusterVisIdx.put( keyClusterVisIdx, subdictClusterVisIdx );
		}
		subdictClusterVisIdx.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

	}

	public YCFGenKbSecGroupBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamSecGroup.readDerived";
		YCFGenKbSecGroupPKey key = schema.getFactorySecGroup().newPKey();
		key.setRequiredClusterId( PKey.getRequiredClusterId() );
		key.setRequiredSecGroupId( PKey.getRequiredSecGroupId() );
		YCFGenKbSecGroupBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecGroupBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamSecGroup.readDerived";
		YCFGenKbSecGroupPKey key = schema.getFactorySecGroup().newPKey();
		key.setRequiredClusterId( PKey.getRequiredClusterId() );
		key.setRequiredSecGroupId( PKey.getRequiredSecGroupId() );
		YCFGenKbSecGroupBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecGroupBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamSecGroup.readAllDerived";
		YCFGenKbSecGroupBuff[] retList = new YCFGenKbSecGroupBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbSecGroupBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbSecGroupBuff[] readDerivedByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFGenKbRamSecGroup.readDerivedByClusterIdx";
		YCFGenKbSecGroupByClusterIdxKey key = schema.getFactorySecGroup().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );

		YCFGenKbSecGroupBuff[] recArray;
		if( dictByClusterIdx.containsKey( key ) ) {
			Map< YCFGenKbSecGroupPKey, YCFGenKbSecGroupBuff > subdictClusterIdx
				= dictByClusterIdx.get( key );
			recArray = new YCFGenKbSecGroupBuff[ subdictClusterIdx.size() ];
			Iterator< YCFGenKbSecGroupBuff > iter = subdictClusterIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbSecGroupPKey, YCFGenKbSecGroupBuff > subdictClusterIdx
				= new HashMap< YCFGenKbSecGroupPKey, YCFGenKbSecGroupBuff >();
			dictByClusterIdx.put( key, subdictClusterIdx );
			recArray = new YCFGenKbSecGroupBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbSecGroupBuff[] readDerivedByClusterVisIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		boolean IsVisible )
	{
		final String S_ProcName = "YCFGenKbRamSecGroup.readDerivedByClusterVisIdx";
		YCFGenKbSecGroupByClusterVisIdxKey key = schema.getFactorySecGroup().newClusterVisIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredIsVisible( IsVisible );

		YCFGenKbSecGroupBuff[] recArray;
		if( dictByClusterVisIdx.containsKey( key ) ) {
			Map< YCFGenKbSecGroupPKey, YCFGenKbSecGroupBuff > subdictClusterVisIdx
				= dictByClusterVisIdx.get( key );
			recArray = new YCFGenKbSecGroupBuff[ subdictClusterVisIdx.size() ];
			Iterator< YCFGenKbSecGroupBuff > iter = subdictClusterVisIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbSecGroupPKey, YCFGenKbSecGroupBuff > subdictClusterVisIdx
				= new HashMap< YCFGenKbSecGroupPKey, YCFGenKbSecGroupBuff >();
			dictByClusterVisIdx.put( key, subdictClusterVisIdx );
			recArray = new YCFGenKbSecGroupBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbSecGroupBuff readDerivedByUNameIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		String Name )
	{
		final String S_ProcName = "YCFGenKbRamSecGroup.readDerivedByUNameIdx";
		YCFGenKbSecGroupByUNameIdxKey key = schema.getFactorySecGroup().newUNameIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredName( Name );

		YCFGenKbSecGroupBuff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecGroupBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecGroupId )
	{
		final String S_ProcName = "YCFGenKbRamSecGroup.readDerivedByIdIdx() ";
		YCFGenKbSecGroupPKey key = schema.getFactorySecGroup().newPKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );

		YCFGenKbSecGroupBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecGroupBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamSecGroup.readBuff";
		YCFGenKbSecGroupBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a909" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecGroupBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbSecGroupBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a909" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecGroupBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamSecGroup.readAllBuff";
		YCFGenKbSecGroupBuff buff;
		ArrayList<YCFGenKbSecGroupBuff> filteredList = new ArrayList<YCFGenKbSecGroupBuff>();
		YCFGenKbSecGroupBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a909" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSecGroupBuff[0] ) );
	}

	public YCFGenKbSecGroupBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecGroupId )
	{
		final String S_ProcName = "YCFGenKbRamSecGroup.readBuffByIdIdx() ";
		YCFGenKbSecGroupBuff buff = readDerivedByIdIdx( Authorization,
			ClusterId,
			SecGroupId );
		if( ( buff != null ) && buff.getClassCode().equals( "a909" ) ) {
			return( (YCFGenKbSecGroupBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbSecGroupBuff[] readBuffByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFGenKbRamSecGroup.readBuffByClusterIdx() ";
		YCFGenKbSecGroupBuff buff;
		ArrayList<YCFGenKbSecGroupBuff> filteredList = new ArrayList<YCFGenKbSecGroupBuff>();
		YCFGenKbSecGroupBuff[] buffList = readDerivedByClusterIdx( Authorization,
			ClusterId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a909" ) ) {
				filteredList.add( (YCFGenKbSecGroupBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSecGroupBuff[0] ) );
	}

	public YCFGenKbSecGroupBuff[] readBuffByClusterVisIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		boolean IsVisible )
	{
		final String S_ProcName = "YCFGenKbRamSecGroup.readBuffByClusterVisIdx() ";
		YCFGenKbSecGroupBuff buff;
		ArrayList<YCFGenKbSecGroupBuff> filteredList = new ArrayList<YCFGenKbSecGroupBuff>();
		YCFGenKbSecGroupBuff[] buffList = readDerivedByClusterVisIdx( Authorization,
			ClusterId,
			IsVisible );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a909" ) ) {
				filteredList.add( (YCFGenKbSecGroupBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSecGroupBuff[0] ) );
	}

	public YCFGenKbSecGroupBuff readBuffByUNameIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		String Name )
	{
		final String S_ProcName = "YCFGenKbRamSecGroup.readBuffByUNameIdx() ";
		YCFGenKbSecGroupBuff buff = readDerivedByUNameIdx( Authorization,
			ClusterId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a909" ) ) {
			return( (YCFGenKbSecGroupBuff)buff );
		}
		else {
			return( null );
		}
	}

	public void updateSecGroup( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupBuff Buff )
	{
		YCFGenKbSecGroupPKey pkey = schema.getFactorySecGroup().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecGroupId( Buff.getRequiredSecGroupId() );
		YCFGenKbSecGroupBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateSecGroup",
				"Existing record not found",
				"SecGroup",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateSecGroup",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFGenKbSecGroupByClusterIdxKey existingKeyClusterIdx = schema.getFactorySecGroup().newClusterIdxKey();
		existingKeyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFGenKbSecGroupByClusterIdxKey newKeyClusterIdx = schema.getFactorySecGroup().newClusterIdxKey();
		newKeyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFGenKbSecGroupByClusterVisIdxKey existingKeyClusterVisIdx = schema.getFactorySecGroup().newClusterVisIdxKey();
		existingKeyClusterVisIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyClusterVisIdx.setRequiredIsVisible( existing.getRequiredIsVisible() );

		YCFGenKbSecGroupByClusterVisIdxKey newKeyClusterVisIdx = schema.getFactorySecGroup().newClusterVisIdxKey();
		newKeyClusterVisIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyClusterVisIdx.setRequiredIsVisible( Buff.getRequiredIsVisible() );

		YCFGenKbSecGroupByUNameIdxKey existingKeyUNameIdx = schema.getFactorySecGroup().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFGenKbSecGroupByUNameIdxKey newKeyUNameIdx = schema.getFactorySecGroup().newUNameIdxKey();
		newKeyUNameIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateSecGroup",
					"SecGroupUNameIdx",
					newKeyUNameIdx );
			}
		}

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableCluster().readDerivedByIdIdx( Authorization,
						Buff.getRequiredClusterId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateSecGroup",
						"Container",
						"SecGroupCluster",
						"Cluster",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFGenKbSecGroupPKey, YCFGenKbSecGroupBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByClusterIdx.get( existingKeyClusterIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByClusterIdx.containsKey( newKeyClusterIdx ) ) {
			subdict = dictByClusterIdx.get( newKeyClusterIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbSecGroupPKey, YCFGenKbSecGroupBuff >();
			dictByClusterIdx.put( newKeyClusterIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByClusterVisIdx.get( existingKeyClusterVisIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByClusterVisIdx.containsKey( newKeyClusterVisIdx ) ) {
			subdict = dictByClusterVisIdx.get( newKeyClusterVisIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbSecGroupPKey, YCFGenKbSecGroupBuff >();
			dictByClusterVisIdx.put( newKeyClusterVisIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

	}

	public void deleteSecGroup( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamSecGroupTable.deleteSecGroup() ";
		String classCode;
		YCFGenKbSecGroupPKey pkey = schema.getFactorySecGroup().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecGroupId( Buff.getRequiredSecGroupId() );
		YCFGenKbSecGroupBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteSecGroup",
				pkey );
		}
					schema.getTableSecGroupForm().deleteSecGroupFormByGroupIdx( Authorization,
						existing.getRequiredClusterId(),
						existing.getRequiredSecGroupId() );
					schema.getTableSecGrpInc().deleteSecGrpIncByIncludeIdx( Authorization,
						existing.getRequiredClusterId(),
						existing.getRequiredSecGroupId() );
					schema.getTableSecGrpMemb().deleteSecGrpMembByGroupIdx( Authorization,
						existing.getRequiredClusterId(),
						existing.getRequiredSecGroupId() );
					schema.getTableSecGrpInc().deleteSecGrpIncByGroupIdx( Authorization,
						existing.getRequiredClusterId(),
						existing.getRequiredSecGroupId() );
		YCFGenKbSecGroupByClusterIdxKey keyClusterIdx = schema.getFactorySecGroup().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFGenKbSecGroupByClusterVisIdxKey keyClusterVisIdx = schema.getFactorySecGroup().newClusterVisIdxKey();
		keyClusterVisIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyClusterVisIdx.setRequiredIsVisible( existing.getRequiredIsVisible() );

		YCFGenKbSecGroupByUNameIdxKey keyUNameIdx = schema.getFactorySecGroup().newUNameIdxKey();
		keyUNameIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFGenKbSecGroupPKey, YCFGenKbSecGroupBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByClusterIdx.get( keyClusterIdx );
		subdict.remove( pkey );

		subdict = dictByClusterVisIdx.get( keyClusterVisIdx );
		subdict.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

	}
	public void deleteSecGroupByIdIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		int argSecGroupId )
	{
		YCFGenKbSecGroupPKey key = schema.getFactorySecGroup().newPKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredSecGroupId( argSecGroupId );
		deleteSecGroupByIdIdx( Authorization, key );
	}

	public void deleteSecGroupByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbSecGroupBuff cur;
		LinkedList<YCFGenKbSecGroupBuff> matchSet = new LinkedList<YCFGenKbSecGroupBuff>();
		Iterator<YCFGenKbSecGroupBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecGroupBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGroup().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGroupId() );
			deleteSecGroup( Authorization, cur );
		}
	}

	public void deleteSecGroupByClusterIdx( YCFGenKbAuthorization Authorization,
		long argClusterId )
	{
		YCFGenKbSecGroupByClusterIdxKey key = schema.getFactorySecGroup().newClusterIdxKey();
		key.setRequiredClusterId( argClusterId );
		deleteSecGroupByClusterIdx( Authorization, key );
	}

	public void deleteSecGroupByClusterIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupByClusterIdxKey argKey )
	{
		YCFGenKbSecGroupBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbSecGroupBuff> matchSet = new LinkedList<YCFGenKbSecGroupBuff>();
		Iterator<YCFGenKbSecGroupBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecGroupBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGroup().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGroupId() );
			deleteSecGroup( Authorization, cur );
		}
	}

	public void deleteSecGroupByClusterVisIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		boolean argIsVisible )
	{
		YCFGenKbSecGroupByClusterVisIdxKey key = schema.getFactorySecGroup().newClusterVisIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredIsVisible( argIsVisible );
		deleteSecGroupByClusterVisIdx( Authorization, key );
	}

	public void deleteSecGroupByClusterVisIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupByClusterVisIdxKey argKey )
	{
		YCFGenKbSecGroupBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbSecGroupBuff> matchSet = new LinkedList<YCFGenKbSecGroupBuff>();
		Iterator<YCFGenKbSecGroupBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecGroupBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGroup().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGroupId() );
			deleteSecGroup( Authorization, cur );
		}
	}

	public void deleteSecGroupByUNameIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		String argName )
	{
		YCFGenKbSecGroupByUNameIdxKey key = schema.getFactorySecGroup().newUNameIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredName( argName );
		deleteSecGroupByUNameIdx( Authorization, key );
	}

	public void deleteSecGroupByUNameIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupByUNameIdxKey argKey )
	{
		YCFGenKbSecGroupBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbSecGroupBuff> matchSet = new LinkedList<YCFGenKbSecGroupBuff>();
		Iterator<YCFGenKbSecGroupBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecGroupBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGroup().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGroupId() );
			deleteSecGroup( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
