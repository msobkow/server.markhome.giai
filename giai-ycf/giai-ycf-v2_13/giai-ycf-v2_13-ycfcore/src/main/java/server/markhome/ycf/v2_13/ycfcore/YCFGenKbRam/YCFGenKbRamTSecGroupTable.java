
// Description: Java 11 in-memory RAM DbIO implementation for TSecGroup.

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
 *	YCFGenKbRamTSecGroupTable in-memory RAM DbIO implementation
 *	for TSecGroup.
 */
public class YCFGenKbRamTSecGroupTable
	implements IYCFGenKbTSecGroupTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbTSecGroupPKey,
				YCFGenKbTSecGroupBuff > dictByPKey
		= new HashMap< YCFGenKbTSecGroupPKey,
				YCFGenKbTSecGroupBuff >();
	private Map< YCFGenKbTSecGroupByTenantIdxKey,
				Map< YCFGenKbTSecGroupPKey,
					YCFGenKbTSecGroupBuff >> dictByTenantIdx
		= new HashMap< YCFGenKbTSecGroupByTenantIdxKey,
				Map< YCFGenKbTSecGroupPKey,
					YCFGenKbTSecGroupBuff >>();
	private Map< YCFGenKbTSecGroupByTenantVisIdxKey,
				Map< YCFGenKbTSecGroupPKey,
					YCFGenKbTSecGroupBuff >> dictByTenantVisIdx
		= new HashMap< YCFGenKbTSecGroupByTenantVisIdxKey,
				Map< YCFGenKbTSecGroupPKey,
					YCFGenKbTSecGroupBuff >>();
	private Map< YCFGenKbTSecGroupByUNameIdxKey,
			YCFGenKbTSecGroupBuff > dictByUNameIdx
		= new HashMap< YCFGenKbTSecGroupByUNameIdxKey,
			YCFGenKbTSecGroupBuff >();

	public YCFGenKbRamTSecGroupTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createTSecGroup( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGroupBuff Buff )
	{
		final String S_ProcName = "createTSecGroup";
		YCFGenKbTSecGroupPKey pkey = schema.getFactoryTSecGroup().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredTSecGroupId( ((YCFGenKbRamTenantTable)schema.getTableTenant()).nextTSecGroupIdGen( Authorization,
			Buff.getRequiredTenantId() ) );
		Buff.setRequiredTenantId( pkey.getRequiredTenantId() );
		Buff.setRequiredTSecGroupId( pkey.getRequiredTSecGroupId() );
		YCFGenKbTSecGroupByTenantIdxKey keyTenantIdx = schema.getFactoryTSecGroup().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFGenKbTSecGroupByTenantVisIdxKey keyTenantVisIdx = schema.getFactoryTSecGroup().newTenantVisIdxKey();
		keyTenantVisIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyTenantVisIdx.setRequiredIsVisible( Buff.getRequiredIsVisible() );

		YCFGenKbTSecGroupByUNameIdxKey keyUNameIdx = schema.getFactoryTSecGroup().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"TSecGroupUNameIdx",
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
						"Container",
						"TSecGroupTenant",
						"Tenant",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFGenKbTSecGroupPKey, YCFGenKbTSecGroupBuff > subdictTenantIdx;
		if( dictByTenantIdx.containsKey( keyTenantIdx ) ) {
			subdictTenantIdx = dictByTenantIdx.get( keyTenantIdx );
		}
		else {
			subdictTenantIdx = new HashMap< YCFGenKbTSecGroupPKey, YCFGenKbTSecGroupBuff >();
			dictByTenantIdx.put( keyTenantIdx, subdictTenantIdx );
		}
		subdictTenantIdx.put( pkey, Buff );

		Map< YCFGenKbTSecGroupPKey, YCFGenKbTSecGroupBuff > subdictTenantVisIdx;
		if( dictByTenantVisIdx.containsKey( keyTenantVisIdx ) ) {
			subdictTenantVisIdx = dictByTenantVisIdx.get( keyTenantVisIdx );
		}
		else {
			subdictTenantVisIdx = new HashMap< YCFGenKbTSecGroupPKey, YCFGenKbTSecGroupBuff >();
			dictByTenantVisIdx.put( keyTenantVisIdx, subdictTenantVisIdx );
		}
		subdictTenantVisIdx.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

	}

	public YCFGenKbTSecGroupBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGroupPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamTSecGroup.readDerived";
		YCFGenKbTSecGroupPKey key = schema.getFactoryTSecGroup().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredTSecGroupId( PKey.getRequiredTSecGroupId() );
		YCFGenKbTSecGroupBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbTSecGroupBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGroupPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamTSecGroup.readDerived";
		YCFGenKbTSecGroupPKey key = schema.getFactoryTSecGroup().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredTSecGroupId( PKey.getRequiredTSecGroupId() );
		YCFGenKbTSecGroupBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbTSecGroupBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamTSecGroup.readAllDerived";
		YCFGenKbTSecGroupBuff[] retList = new YCFGenKbTSecGroupBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbTSecGroupBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbTSecGroupBuff[] readDerivedByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFGenKbRamTSecGroup.readDerivedByTenantIdx";
		YCFGenKbTSecGroupByTenantIdxKey key = schema.getFactoryTSecGroup().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );

		YCFGenKbTSecGroupBuff[] recArray;
		if( dictByTenantIdx.containsKey( key ) ) {
			Map< YCFGenKbTSecGroupPKey, YCFGenKbTSecGroupBuff > subdictTenantIdx
				= dictByTenantIdx.get( key );
			recArray = new YCFGenKbTSecGroupBuff[ subdictTenantIdx.size() ];
			Iterator< YCFGenKbTSecGroupBuff > iter = subdictTenantIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbTSecGroupPKey, YCFGenKbTSecGroupBuff > subdictTenantIdx
				= new HashMap< YCFGenKbTSecGroupPKey, YCFGenKbTSecGroupBuff >();
			dictByTenantIdx.put( key, subdictTenantIdx );
			recArray = new YCFGenKbTSecGroupBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbTSecGroupBuff[] readDerivedByTenantVisIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		boolean IsVisible )
	{
		final String S_ProcName = "YCFGenKbRamTSecGroup.readDerivedByTenantVisIdx";
		YCFGenKbTSecGroupByTenantVisIdxKey key = schema.getFactoryTSecGroup().newTenantVisIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIsVisible( IsVisible );

		YCFGenKbTSecGroupBuff[] recArray;
		if( dictByTenantVisIdx.containsKey( key ) ) {
			Map< YCFGenKbTSecGroupPKey, YCFGenKbTSecGroupBuff > subdictTenantVisIdx
				= dictByTenantVisIdx.get( key );
			recArray = new YCFGenKbTSecGroupBuff[ subdictTenantVisIdx.size() ];
			Iterator< YCFGenKbTSecGroupBuff > iter = subdictTenantVisIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbTSecGroupPKey, YCFGenKbTSecGroupBuff > subdictTenantVisIdx
				= new HashMap< YCFGenKbTSecGroupPKey, YCFGenKbTSecGroupBuff >();
			dictByTenantVisIdx.put( key, subdictTenantVisIdx );
			recArray = new YCFGenKbTSecGroupBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbTSecGroupBuff readDerivedByUNameIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		String Name )
	{
		final String S_ProcName = "YCFGenKbRamTSecGroup.readDerivedByUNameIdx";
		YCFGenKbTSecGroupByUNameIdxKey key = schema.getFactoryTSecGroup().newUNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredName( Name );

		YCFGenKbTSecGroupBuff buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbTSecGroupBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		int TSecGroupId )
	{
		final String S_ProcName = "YCFGenKbRamTSecGroup.readDerivedByIdIdx() ";
		YCFGenKbTSecGroupPKey key = schema.getFactoryTSecGroup().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );

		YCFGenKbTSecGroupBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbTSecGroupBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGroupPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamTSecGroup.readBuff";
		YCFGenKbTSecGroupBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a911" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbTSecGroupBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGroupPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbTSecGroupBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a911" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbTSecGroupBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamTSecGroup.readAllBuff";
		YCFGenKbTSecGroupBuff buff;
		ArrayList<YCFGenKbTSecGroupBuff> filteredList = new ArrayList<YCFGenKbTSecGroupBuff>();
		YCFGenKbTSecGroupBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a911" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbTSecGroupBuff[0] ) );
	}

	public YCFGenKbTSecGroupBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		int TSecGroupId )
	{
		final String S_ProcName = "YCFGenKbRamTSecGroup.readBuffByIdIdx() ";
		YCFGenKbTSecGroupBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			TSecGroupId );
		if( ( buff != null ) && buff.getClassCode().equals( "a911" ) ) {
			return( (YCFGenKbTSecGroupBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbTSecGroupBuff[] readBuffByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFGenKbRamTSecGroup.readBuffByTenantIdx() ";
		YCFGenKbTSecGroupBuff buff;
		ArrayList<YCFGenKbTSecGroupBuff> filteredList = new ArrayList<YCFGenKbTSecGroupBuff>();
		YCFGenKbTSecGroupBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a911" ) ) {
				filteredList.add( (YCFGenKbTSecGroupBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbTSecGroupBuff[0] ) );
	}

	public YCFGenKbTSecGroupBuff[] readBuffByTenantVisIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		boolean IsVisible )
	{
		final String S_ProcName = "YCFGenKbRamTSecGroup.readBuffByTenantVisIdx() ";
		YCFGenKbTSecGroupBuff buff;
		ArrayList<YCFGenKbTSecGroupBuff> filteredList = new ArrayList<YCFGenKbTSecGroupBuff>();
		YCFGenKbTSecGroupBuff[] buffList = readDerivedByTenantVisIdx( Authorization,
			TenantId,
			IsVisible );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a911" ) ) {
				filteredList.add( (YCFGenKbTSecGroupBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbTSecGroupBuff[0] ) );
	}

	public YCFGenKbTSecGroupBuff readBuffByUNameIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		String Name )
	{
		final String S_ProcName = "YCFGenKbRamTSecGroup.readBuffByUNameIdx() ";
		YCFGenKbTSecGroupBuff buff = readDerivedByUNameIdx( Authorization,
			TenantId,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a911" ) ) {
			return( (YCFGenKbTSecGroupBuff)buff );
		}
		else {
			return( null );
		}
	}

	public void updateTSecGroup( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGroupBuff Buff )
	{
		YCFGenKbTSecGroupPKey pkey = schema.getFactoryTSecGroup().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredTSecGroupId( Buff.getRequiredTSecGroupId() );
		YCFGenKbTSecGroupBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateTSecGroup",
				"Existing record not found",
				"TSecGroup",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateTSecGroup",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFGenKbTSecGroupByTenantIdxKey existingKeyTenantIdx = schema.getFactoryTSecGroup().newTenantIdxKey();
		existingKeyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFGenKbTSecGroupByTenantIdxKey newKeyTenantIdx = schema.getFactoryTSecGroup().newTenantIdxKey();
		newKeyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFGenKbTSecGroupByTenantVisIdxKey existingKeyTenantVisIdx = schema.getFactoryTSecGroup().newTenantVisIdxKey();
		existingKeyTenantVisIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyTenantVisIdx.setRequiredIsVisible( existing.getRequiredIsVisible() );

		YCFGenKbTSecGroupByTenantVisIdxKey newKeyTenantVisIdx = schema.getFactoryTSecGroup().newTenantVisIdxKey();
		newKeyTenantVisIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyTenantVisIdx.setRequiredIsVisible( Buff.getRequiredIsVisible() );

		YCFGenKbTSecGroupByUNameIdxKey existingKeyUNameIdx = schema.getFactoryTSecGroup().newUNameIdxKey();
		existingKeyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		YCFGenKbTSecGroupByUNameIdxKey newKeyUNameIdx = schema.getFactoryTSecGroup().newUNameIdxKey();
		newKeyUNameIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateTSecGroup",
					"TSecGroupUNameIdx",
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
						"updateTSecGroup",
						"Container",
						"TSecGroupTenant",
						"Tenant",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFGenKbTSecGroupPKey, YCFGenKbTSecGroupBuff > subdict;

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
			subdict = new HashMap< YCFGenKbTSecGroupPKey, YCFGenKbTSecGroupBuff >();
			dictByTenantIdx.put( newKeyTenantIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByTenantVisIdx.get( existingKeyTenantVisIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByTenantVisIdx.containsKey( newKeyTenantVisIdx ) ) {
			subdict = dictByTenantVisIdx.get( newKeyTenantVisIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbTSecGroupPKey, YCFGenKbTSecGroupBuff >();
			dictByTenantVisIdx.put( newKeyTenantVisIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

	}

	public void deleteTSecGroup( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGroupBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamTSecGroupTable.deleteTSecGroup() ";
		String classCode;
		YCFGenKbTSecGroupPKey pkey = schema.getFactoryTSecGroup().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredTSecGroupId( Buff.getRequiredTSecGroupId() );
		YCFGenKbTSecGroupBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteTSecGroup",
				pkey );
		}
					schema.getTableTSecGrpInc().deleteTSecGrpIncByIncludeIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredTSecGroupId() );
					schema.getTableTSecGrpMemb().deleteTSecGrpMembByGroupIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredTSecGroupId() );
					schema.getTableTSecGrpInc().deleteTSecGrpIncByGroupIdx( Authorization,
						existing.getRequiredTenantId(),
						existing.getRequiredTSecGroupId() );
		YCFGenKbTSecGroupByTenantIdxKey keyTenantIdx = schema.getFactoryTSecGroup().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFGenKbTSecGroupByTenantVisIdxKey keyTenantVisIdx = schema.getFactoryTSecGroup().newTenantVisIdxKey();
		keyTenantVisIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyTenantVisIdx.setRequiredIsVisible( existing.getRequiredIsVisible() );

		YCFGenKbTSecGroupByUNameIdxKey keyUNameIdx = schema.getFactoryTSecGroup().newUNameIdxKey();
		keyUNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFGenKbTSecGroupPKey, YCFGenKbTSecGroupBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByTenantIdx.get( keyTenantIdx );
		subdict.remove( pkey );

		subdict = dictByTenantVisIdx.get( keyTenantVisIdx );
		subdict.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

	}
	public void deleteTSecGroupByIdIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		int argTSecGroupId )
	{
		YCFGenKbTSecGroupPKey key = schema.getFactoryTSecGroup().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTSecGroupId( argTSecGroupId );
		deleteTSecGroupByIdIdx( Authorization, key );
	}

	public void deleteTSecGroupByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGroupPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbTSecGroupBuff cur;
		LinkedList<YCFGenKbTSecGroupBuff> matchSet = new LinkedList<YCFGenKbTSecGroupBuff>();
		Iterator<YCFGenKbTSecGroupBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbTSecGroupBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTSecGroup().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredTSecGroupId() );
			deleteTSecGroup( Authorization, cur );
		}
	}

	public void deleteTSecGroupByTenantIdx( YCFGenKbAuthorization Authorization,
		long argTenantId )
	{
		YCFGenKbTSecGroupByTenantIdxKey key = schema.getFactoryTSecGroup().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteTSecGroupByTenantIdx( Authorization, key );
	}

	public void deleteTSecGroupByTenantIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGroupByTenantIdxKey argKey )
	{
		YCFGenKbTSecGroupBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbTSecGroupBuff> matchSet = new LinkedList<YCFGenKbTSecGroupBuff>();
		Iterator<YCFGenKbTSecGroupBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbTSecGroupBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTSecGroup().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredTSecGroupId() );
			deleteTSecGroup( Authorization, cur );
		}
	}

	public void deleteTSecGroupByTenantVisIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		boolean argIsVisible )
	{
		YCFGenKbTSecGroupByTenantVisIdxKey key = schema.getFactoryTSecGroup().newTenantVisIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredIsVisible( argIsVisible );
		deleteTSecGroupByTenantVisIdx( Authorization, key );
	}

	public void deleteTSecGroupByTenantVisIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGroupByTenantVisIdxKey argKey )
	{
		YCFGenKbTSecGroupBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbTSecGroupBuff> matchSet = new LinkedList<YCFGenKbTSecGroupBuff>();
		Iterator<YCFGenKbTSecGroupBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbTSecGroupBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTSecGroup().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredTSecGroupId() );
			deleteTSecGroup( Authorization, cur );
		}
	}

	public void deleteTSecGroupByUNameIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		String argName )
	{
		YCFGenKbTSecGroupByUNameIdxKey key = schema.getFactoryTSecGroup().newUNameIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredName( argName );
		deleteTSecGroupByUNameIdx( Authorization, key );
	}

	public void deleteTSecGroupByUNameIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGroupByUNameIdxKey argKey )
	{
		YCFGenKbTSecGroupBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbTSecGroupBuff> matchSet = new LinkedList<YCFGenKbTSecGroupBuff>();
		Iterator<YCFGenKbTSecGroupBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbTSecGroupBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTSecGroup().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredTSecGroupId() );
			deleteTSecGroup( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
