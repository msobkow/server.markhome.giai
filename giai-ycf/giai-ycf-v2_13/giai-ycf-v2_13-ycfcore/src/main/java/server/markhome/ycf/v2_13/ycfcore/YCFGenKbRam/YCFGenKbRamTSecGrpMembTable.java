
// Description: Java 11 in-memory RAM DbIO implementation for TSecGrpMemb.

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
 *	YCFGenKbRamTSecGrpMembTable in-memory RAM DbIO implementation
 *	for TSecGrpMemb.
 */
public class YCFGenKbRamTSecGrpMembTable
	implements IYCFGenKbTSecGrpMembTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbTSecGrpMembPKey,
				YCFGenKbTSecGrpMembBuff > dictByPKey
		= new HashMap< YCFGenKbTSecGrpMembPKey,
				YCFGenKbTSecGrpMembBuff >();
	private Map< YCFGenKbTSecGrpMembByTenantIdxKey,
				Map< YCFGenKbTSecGrpMembPKey,
					YCFGenKbTSecGrpMembBuff >> dictByTenantIdx
		= new HashMap< YCFGenKbTSecGrpMembByTenantIdxKey,
				Map< YCFGenKbTSecGrpMembPKey,
					YCFGenKbTSecGrpMembBuff >>();
	private Map< YCFGenKbTSecGrpMembByGroupIdxKey,
				Map< YCFGenKbTSecGrpMembPKey,
					YCFGenKbTSecGrpMembBuff >> dictByGroupIdx
		= new HashMap< YCFGenKbTSecGrpMembByGroupIdxKey,
				Map< YCFGenKbTSecGrpMembPKey,
					YCFGenKbTSecGrpMembBuff >>();
	private Map< YCFGenKbTSecGrpMembByUserIdxKey,
				Map< YCFGenKbTSecGrpMembPKey,
					YCFGenKbTSecGrpMembBuff >> dictByUserIdx
		= new HashMap< YCFGenKbTSecGrpMembByUserIdxKey,
				Map< YCFGenKbTSecGrpMembPKey,
					YCFGenKbTSecGrpMembBuff >>();
	private Map< YCFGenKbTSecGrpMembByUUserIdxKey,
			YCFGenKbTSecGrpMembBuff > dictByUUserIdx
		= new HashMap< YCFGenKbTSecGrpMembByUUserIdxKey,
			YCFGenKbTSecGrpMembBuff >();

	public YCFGenKbRamTSecGrpMembTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createTSecGrpMemb( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGrpMembBuff Buff )
	{
		final String S_ProcName = "createTSecGrpMemb";
		YCFGenKbTSecGrpMembPKey pkey = schema.getFactoryTSecGrpMemb().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredTSecGrpMembId( ((YCFGenKbRamTenantTable)schema.getTableTenant()).nextTSecGrpMembIdGen( Authorization,
			Buff.getRequiredTenantId() ) );
		Buff.setRequiredTenantId( pkey.getRequiredTenantId() );
		Buff.setRequiredTSecGrpMembId( pkey.getRequiredTSecGrpMembId() );
		YCFGenKbTSecGrpMembByTenantIdxKey keyTenantIdx = schema.getFactoryTSecGrpMemb().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFGenKbTSecGrpMembByGroupIdxKey keyGroupIdx = schema.getFactoryTSecGrpMemb().newGroupIdxKey();
		keyGroupIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyGroupIdx.setRequiredTSecGroupId( Buff.getRequiredTSecGroupId() );

		YCFGenKbTSecGrpMembByUserIdxKey keyUserIdx = schema.getFactoryTSecGrpMemb().newUserIdxKey();
		keyUserIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );

		YCFGenKbTSecGrpMembByUUserIdxKey keyUUserIdx = schema.getFactoryTSecGrpMemb().newUUserIdxKey();
		keyUUserIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyUUserIdx.setRequiredTSecGroupId( Buff.getRequiredTSecGroupId() );
		keyUUserIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUUserIdx.containsKey( keyUUserIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"TSecGrpMembUUserIdx",
				keyUUserIdx );
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
						"TSecGrpMembTenant",
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
				if( null == schema.getTableTSecGroup().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredTSecGroupId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"TSecGrpMembGroup",
						"TSecGroup",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFGenKbTSecGrpMembPKey, YCFGenKbTSecGrpMembBuff > subdictTenantIdx;
		if( dictByTenantIdx.containsKey( keyTenantIdx ) ) {
			subdictTenantIdx = dictByTenantIdx.get( keyTenantIdx );
		}
		else {
			subdictTenantIdx = new HashMap< YCFGenKbTSecGrpMembPKey, YCFGenKbTSecGrpMembBuff >();
			dictByTenantIdx.put( keyTenantIdx, subdictTenantIdx );
		}
		subdictTenantIdx.put( pkey, Buff );

		Map< YCFGenKbTSecGrpMembPKey, YCFGenKbTSecGrpMembBuff > subdictGroupIdx;
		if( dictByGroupIdx.containsKey( keyGroupIdx ) ) {
			subdictGroupIdx = dictByGroupIdx.get( keyGroupIdx );
		}
		else {
			subdictGroupIdx = new HashMap< YCFGenKbTSecGrpMembPKey, YCFGenKbTSecGrpMembBuff >();
			dictByGroupIdx.put( keyGroupIdx, subdictGroupIdx );
		}
		subdictGroupIdx.put( pkey, Buff );

		Map< YCFGenKbTSecGrpMembPKey, YCFGenKbTSecGrpMembBuff > subdictUserIdx;
		if( dictByUserIdx.containsKey( keyUserIdx ) ) {
			subdictUserIdx = dictByUserIdx.get( keyUserIdx );
		}
		else {
			subdictUserIdx = new HashMap< YCFGenKbTSecGrpMembPKey, YCFGenKbTSecGrpMembBuff >();
			dictByUserIdx.put( keyUserIdx, subdictUserIdx );
		}
		subdictUserIdx.put( pkey, Buff );

		dictByUUserIdx.put( keyUUserIdx, Buff );

	}

	public YCFGenKbTSecGrpMembBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGrpMembPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamTSecGrpMemb.readDerived";
		YCFGenKbTSecGrpMembPKey key = schema.getFactoryTSecGrpMemb().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredTSecGrpMembId( PKey.getRequiredTSecGrpMembId() );
		YCFGenKbTSecGrpMembBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbTSecGrpMembBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGrpMembPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamTSecGrpMemb.readDerived";
		YCFGenKbTSecGrpMembPKey key = schema.getFactoryTSecGrpMemb().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredTSecGrpMembId( PKey.getRequiredTSecGrpMembId() );
		YCFGenKbTSecGrpMembBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbTSecGrpMembBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamTSecGrpMemb.readAllDerived";
		YCFGenKbTSecGrpMembBuff[] retList = new YCFGenKbTSecGrpMembBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbTSecGrpMembBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbTSecGrpMembBuff[] readDerivedByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFGenKbRamTSecGrpMemb.readDerivedByTenantIdx";
		YCFGenKbTSecGrpMembByTenantIdxKey key = schema.getFactoryTSecGrpMemb().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );

		YCFGenKbTSecGrpMembBuff[] recArray;
		if( dictByTenantIdx.containsKey( key ) ) {
			Map< YCFGenKbTSecGrpMembPKey, YCFGenKbTSecGrpMembBuff > subdictTenantIdx
				= dictByTenantIdx.get( key );
			recArray = new YCFGenKbTSecGrpMembBuff[ subdictTenantIdx.size() ];
			Iterator< YCFGenKbTSecGrpMembBuff > iter = subdictTenantIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbTSecGrpMembPKey, YCFGenKbTSecGrpMembBuff > subdictTenantIdx
				= new HashMap< YCFGenKbTSecGrpMembPKey, YCFGenKbTSecGrpMembBuff >();
			dictByTenantIdx.put( key, subdictTenantIdx );
			recArray = new YCFGenKbTSecGrpMembBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbTSecGrpMembBuff[] readDerivedByGroupIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		int TSecGroupId )
	{
		final String S_ProcName = "YCFGenKbRamTSecGrpMemb.readDerivedByGroupIdx";
		YCFGenKbTSecGrpMembByGroupIdxKey key = schema.getFactoryTSecGrpMemb().newGroupIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );

		YCFGenKbTSecGrpMembBuff[] recArray;
		if( dictByGroupIdx.containsKey( key ) ) {
			Map< YCFGenKbTSecGrpMembPKey, YCFGenKbTSecGrpMembBuff > subdictGroupIdx
				= dictByGroupIdx.get( key );
			recArray = new YCFGenKbTSecGrpMembBuff[ subdictGroupIdx.size() ];
			Iterator< YCFGenKbTSecGrpMembBuff > iter = subdictGroupIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbTSecGrpMembPKey, YCFGenKbTSecGrpMembBuff > subdictGroupIdx
				= new HashMap< YCFGenKbTSecGrpMembPKey, YCFGenKbTSecGrpMembBuff >();
			dictByGroupIdx.put( key, subdictGroupIdx );
			recArray = new YCFGenKbTSecGrpMembBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbTSecGrpMembBuff[] readDerivedByUserIdx( YCFGenKbAuthorization Authorization,
		UUID SecUserId )
	{
		final String S_ProcName = "YCFGenKbRamTSecGrpMemb.readDerivedByUserIdx";
		YCFGenKbTSecGrpMembByUserIdxKey key = schema.getFactoryTSecGrpMemb().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );

		YCFGenKbTSecGrpMembBuff[] recArray;
		if( dictByUserIdx.containsKey( key ) ) {
			Map< YCFGenKbTSecGrpMembPKey, YCFGenKbTSecGrpMembBuff > subdictUserIdx
				= dictByUserIdx.get( key );
			recArray = new YCFGenKbTSecGrpMembBuff[ subdictUserIdx.size() ];
			Iterator< YCFGenKbTSecGrpMembBuff > iter = subdictUserIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbTSecGrpMembPKey, YCFGenKbTSecGrpMembBuff > subdictUserIdx
				= new HashMap< YCFGenKbTSecGrpMembPKey, YCFGenKbTSecGrpMembBuff >();
			dictByUserIdx.put( key, subdictUserIdx );
			recArray = new YCFGenKbTSecGrpMembBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbTSecGrpMembBuff readDerivedByUUserIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		int TSecGroupId,
		UUID SecUserId )
	{
		final String S_ProcName = "YCFGenKbRamTSecGrpMemb.readDerivedByUUserIdx";
		YCFGenKbTSecGrpMembByUUserIdxKey key = schema.getFactoryTSecGrpMemb().newUUserIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		key.setRequiredSecUserId( SecUserId );

		YCFGenKbTSecGrpMembBuff buff;
		if( dictByUUserIdx.containsKey( key ) ) {
			buff = dictByUUserIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbTSecGrpMembBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long TSecGrpMembId )
	{
		final String S_ProcName = "YCFGenKbRamTSecGrpMemb.readDerivedByIdIdx() ";
		YCFGenKbTSecGrpMembPKey key = schema.getFactoryTSecGrpMemb().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGrpMembId( TSecGrpMembId );

		YCFGenKbTSecGrpMembBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbTSecGrpMembBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGrpMembPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamTSecGrpMemb.readBuff";
		YCFGenKbTSecGrpMembBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a913" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbTSecGrpMembBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGrpMembPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbTSecGrpMembBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a913" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbTSecGrpMembBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamTSecGrpMemb.readAllBuff";
		YCFGenKbTSecGrpMembBuff buff;
		ArrayList<YCFGenKbTSecGrpMembBuff> filteredList = new ArrayList<YCFGenKbTSecGrpMembBuff>();
		YCFGenKbTSecGrpMembBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a913" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbTSecGrpMembBuff[0] ) );
	}

	/**
	 *	Read a page of all the specific TSecGrpMemb buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific TSecGrpMemb instances in the database accessible for the Authorization.
	 */
	public YCFGenKbTSecGrpMembBuff[] pageAllBuff( YCFGenKbAuthorization Authorization,
		Long priorTenantId,
		Long priorTSecGrpMembId )
	{
		final String S_ProcName = "pageAllBuff";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public YCFGenKbTSecGrpMembBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long TSecGrpMembId )
	{
		final String S_ProcName = "YCFGenKbRamTSecGrpMemb.readBuffByIdIdx() ";
		YCFGenKbTSecGrpMembBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			TSecGrpMembId );
		if( ( buff != null ) && buff.getClassCode().equals( "a913" ) ) {
			return( (YCFGenKbTSecGrpMembBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbTSecGrpMembBuff[] readBuffByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFGenKbRamTSecGrpMemb.readBuffByTenantIdx() ";
		YCFGenKbTSecGrpMembBuff buff;
		ArrayList<YCFGenKbTSecGrpMembBuff> filteredList = new ArrayList<YCFGenKbTSecGrpMembBuff>();
		YCFGenKbTSecGrpMembBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a913" ) ) {
				filteredList.add( (YCFGenKbTSecGrpMembBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbTSecGrpMembBuff[0] ) );
	}

	public YCFGenKbTSecGrpMembBuff[] readBuffByGroupIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		int TSecGroupId )
	{
		final String S_ProcName = "YCFGenKbRamTSecGrpMemb.readBuffByGroupIdx() ";
		YCFGenKbTSecGrpMembBuff buff;
		ArrayList<YCFGenKbTSecGrpMembBuff> filteredList = new ArrayList<YCFGenKbTSecGrpMembBuff>();
		YCFGenKbTSecGrpMembBuff[] buffList = readDerivedByGroupIdx( Authorization,
			TenantId,
			TSecGroupId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a913" ) ) {
				filteredList.add( (YCFGenKbTSecGrpMembBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbTSecGrpMembBuff[0] ) );
	}

	public YCFGenKbTSecGrpMembBuff[] readBuffByUserIdx( YCFGenKbAuthorization Authorization,
		UUID SecUserId )
	{
		final String S_ProcName = "YCFGenKbRamTSecGrpMemb.readBuffByUserIdx() ";
		YCFGenKbTSecGrpMembBuff buff;
		ArrayList<YCFGenKbTSecGrpMembBuff> filteredList = new ArrayList<YCFGenKbTSecGrpMembBuff>();
		YCFGenKbTSecGrpMembBuff[] buffList = readDerivedByUserIdx( Authorization,
			SecUserId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a913" ) ) {
				filteredList.add( (YCFGenKbTSecGrpMembBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbTSecGrpMembBuff[0] ) );
	}

	public YCFGenKbTSecGrpMembBuff readBuffByUUserIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		int TSecGroupId,
		UUID SecUserId )
	{
		final String S_ProcName = "YCFGenKbRamTSecGrpMemb.readBuffByUUserIdx() ";
		YCFGenKbTSecGrpMembBuff buff = readDerivedByUUserIdx( Authorization,
			TenantId,
			TSecGroupId,
			SecUserId );
		if( ( buff != null ) && buff.getClassCode().equals( "a913" ) ) {
			return( (YCFGenKbTSecGrpMembBuff)buff );
		}
		else {
			return( null );
		}
	}

	/**
	 *	Read a page array of the specific TSecGrpMemb buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbTSecGrpMembBuff[] pageBuffByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		Long priorTenantId,
		Long priorTSecGrpMembId )
	{
		final String S_ProcName = "pageBuffByTenantIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific TSecGrpMemb buffer instances identified by the duplicate key GroupIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbTSecGrpMembBuff[] pageBuffByGroupIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		int TSecGroupId,
		Long priorTenantId,
		Long priorTSecGrpMembId )
	{
		final String S_ProcName = "pageBuffByGroupIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific TSecGrpMemb buffer instances identified by the duplicate key UserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The TSecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbTSecGrpMembBuff[] pageBuffByUserIdx( YCFGenKbAuthorization Authorization,
		UUID SecUserId,
		Long priorTenantId,
		Long priorTSecGrpMembId )
	{
		final String S_ProcName = "pageBuffByUserIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateTSecGrpMemb( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGrpMembBuff Buff )
	{
		YCFGenKbTSecGrpMembPKey pkey = schema.getFactoryTSecGrpMemb().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredTSecGrpMembId( Buff.getRequiredTSecGrpMembId() );
		YCFGenKbTSecGrpMembBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateTSecGrpMemb",
				"Existing record not found",
				"TSecGrpMemb",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateTSecGrpMemb",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFGenKbTSecGrpMembByTenantIdxKey existingKeyTenantIdx = schema.getFactoryTSecGrpMemb().newTenantIdxKey();
		existingKeyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFGenKbTSecGrpMembByTenantIdxKey newKeyTenantIdx = schema.getFactoryTSecGrpMemb().newTenantIdxKey();
		newKeyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFGenKbTSecGrpMembByGroupIdxKey existingKeyGroupIdx = schema.getFactoryTSecGrpMemb().newGroupIdxKey();
		existingKeyGroupIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyGroupIdx.setRequiredTSecGroupId( existing.getRequiredTSecGroupId() );

		YCFGenKbTSecGrpMembByGroupIdxKey newKeyGroupIdx = schema.getFactoryTSecGrpMemb().newGroupIdxKey();
		newKeyGroupIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyGroupIdx.setRequiredTSecGroupId( Buff.getRequiredTSecGroupId() );

		YCFGenKbTSecGrpMembByUserIdxKey existingKeyUserIdx = schema.getFactoryTSecGrpMemb().newUserIdxKey();
		existingKeyUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );

		YCFGenKbTSecGrpMembByUserIdxKey newKeyUserIdx = schema.getFactoryTSecGrpMemb().newUserIdxKey();
		newKeyUserIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );

		YCFGenKbTSecGrpMembByUUserIdxKey existingKeyUUserIdx = schema.getFactoryTSecGrpMemb().newUUserIdxKey();
		existingKeyUUserIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyUUserIdx.setRequiredTSecGroupId( existing.getRequiredTSecGroupId() );
		existingKeyUUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );

		YCFGenKbTSecGrpMembByUUserIdxKey newKeyUUserIdx = schema.getFactoryTSecGrpMemb().newUUserIdxKey();
		newKeyUUserIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyUUserIdx.setRequiredTSecGroupId( Buff.getRequiredTSecGroupId() );
		newKeyUUserIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );

		// Check unique indexes

		if( ! existingKeyUUserIdx.equals( newKeyUUserIdx ) ) {
			if( dictByUUserIdx.containsKey( newKeyUUserIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateTSecGrpMemb",
					"TSecGrpMembUUserIdx",
					newKeyUUserIdx );
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
						"updateTSecGrpMemb",
						"Owner",
						"TSecGrpMembTenant",
						"Tenant",
						null );
				}
			}
		}

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableTSecGroup().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId(),
						Buff.getRequiredTSecGroupId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateTSecGrpMemb",
						"Container",
						"TSecGrpMembGroup",
						"TSecGroup",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFGenKbTSecGrpMembPKey, YCFGenKbTSecGrpMembBuff > subdict;

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
			subdict = new HashMap< YCFGenKbTSecGrpMembPKey, YCFGenKbTSecGrpMembBuff >();
			dictByTenantIdx.put( newKeyTenantIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByGroupIdx.get( existingKeyGroupIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByGroupIdx.containsKey( newKeyGroupIdx ) ) {
			subdict = dictByGroupIdx.get( newKeyGroupIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbTSecGrpMembPKey, YCFGenKbTSecGrpMembBuff >();
			dictByGroupIdx.put( newKeyGroupIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByUserIdx.get( existingKeyUserIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByUserIdx.containsKey( newKeyUserIdx ) ) {
			subdict = dictByUserIdx.get( newKeyUserIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbTSecGrpMembPKey, YCFGenKbTSecGrpMembBuff >();
			dictByUserIdx.put( newKeyUserIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUUserIdx.remove( existingKeyUUserIdx );
		dictByUUserIdx.put( newKeyUUserIdx, Buff );

	}

	public void deleteTSecGrpMemb( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGrpMembBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamTSecGrpMembTable.deleteTSecGrpMemb() ";
		String classCode;
		YCFGenKbTSecGrpMembPKey pkey = schema.getFactoryTSecGrpMemb().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredTSecGrpMembId( Buff.getRequiredTSecGrpMembId() );
		YCFGenKbTSecGrpMembBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteTSecGrpMemb",
				pkey );
		}
		YCFGenKbTSecGrpMembByTenantIdxKey keyTenantIdx = schema.getFactoryTSecGrpMemb().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFGenKbTSecGrpMembByGroupIdxKey keyGroupIdx = schema.getFactoryTSecGrpMemb().newGroupIdxKey();
		keyGroupIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyGroupIdx.setRequiredTSecGroupId( existing.getRequiredTSecGroupId() );

		YCFGenKbTSecGrpMembByUserIdxKey keyUserIdx = schema.getFactoryTSecGrpMemb().newUserIdxKey();
		keyUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );

		YCFGenKbTSecGrpMembByUUserIdxKey keyUUserIdx = schema.getFactoryTSecGrpMemb().newUUserIdxKey();
		keyUUserIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUUserIdx.setRequiredTSecGroupId( existing.getRequiredTSecGroupId() );
		keyUUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFGenKbTSecGrpMembPKey, YCFGenKbTSecGrpMembBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByTenantIdx.get( keyTenantIdx );
		subdict.remove( pkey );

		subdict = dictByGroupIdx.get( keyGroupIdx );
		subdict.remove( pkey );

		subdict = dictByUserIdx.get( keyUserIdx );
		subdict.remove( pkey );

		dictByUUserIdx.remove( keyUUserIdx );

	}
	public void deleteTSecGrpMembByIdIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argTSecGrpMembId )
	{
		YCFGenKbTSecGrpMembPKey key = schema.getFactoryTSecGrpMemb().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTSecGrpMembId( argTSecGrpMembId );
		deleteTSecGrpMembByIdIdx( Authorization, key );
	}

	public void deleteTSecGrpMembByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGrpMembPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbTSecGrpMembBuff cur;
		LinkedList<YCFGenKbTSecGrpMembBuff> matchSet = new LinkedList<YCFGenKbTSecGrpMembBuff>();
		Iterator<YCFGenKbTSecGrpMembBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbTSecGrpMembBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTSecGrpMemb().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredTSecGrpMembId() );
			deleteTSecGrpMemb( Authorization, cur );
		}
	}

	public void deleteTSecGrpMembByTenantIdx( YCFGenKbAuthorization Authorization,
		long argTenantId )
	{
		YCFGenKbTSecGrpMembByTenantIdxKey key = schema.getFactoryTSecGrpMemb().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteTSecGrpMembByTenantIdx( Authorization, key );
	}

	public void deleteTSecGrpMembByTenantIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGrpMembByTenantIdxKey argKey )
	{
		YCFGenKbTSecGrpMembBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbTSecGrpMembBuff> matchSet = new LinkedList<YCFGenKbTSecGrpMembBuff>();
		Iterator<YCFGenKbTSecGrpMembBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbTSecGrpMembBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTSecGrpMemb().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredTSecGrpMembId() );
			deleteTSecGrpMemb( Authorization, cur );
		}
	}

	public void deleteTSecGrpMembByGroupIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		int argTSecGroupId )
	{
		YCFGenKbTSecGrpMembByGroupIdxKey key = schema.getFactoryTSecGrpMemb().newGroupIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTSecGroupId( argTSecGroupId );
		deleteTSecGrpMembByGroupIdx( Authorization, key );
	}

	public void deleteTSecGrpMembByGroupIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGrpMembByGroupIdxKey argKey )
	{
		YCFGenKbTSecGrpMembBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbTSecGrpMembBuff> matchSet = new LinkedList<YCFGenKbTSecGrpMembBuff>();
		Iterator<YCFGenKbTSecGrpMembBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbTSecGrpMembBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTSecGrpMemb().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredTSecGrpMembId() );
			deleteTSecGrpMemb( Authorization, cur );
		}
	}

	public void deleteTSecGrpMembByUserIdx( YCFGenKbAuthorization Authorization,
		UUID argSecUserId )
	{
		YCFGenKbTSecGrpMembByUserIdxKey key = schema.getFactoryTSecGrpMemb().newUserIdxKey();
		key.setRequiredSecUserId( argSecUserId );
		deleteTSecGrpMembByUserIdx( Authorization, key );
	}

	public void deleteTSecGrpMembByUserIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGrpMembByUserIdxKey argKey )
	{
		YCFGenKbTSecGrpMembBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbTSecGrpMembBuff> matchSet = new LinkedList<YCFGenKbTSecGrpMembBuff>();
		Iterator<YCFGenKbTSecGrpMembBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbTSecGrpMembBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTSecGrpMemb().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredTSecGrpMembId() );
			deleteTSecGrpMemb( Authorization, cur );
		}
	}

	public void deleteTSecGrpMembByUUserIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		int argTSecGroupId,
		UUID argSecUserId )
	{
		YCFGenKbTSecGrpMembByUUserIdxKey key = schema.getFactoryTSecGrpMemb().newUUserIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTSecGroupId( argTSecGroupId );
		key.setRequiredSecUserId( argSecUserId );
		deleteTSecGrpMembByUUserIdx( Authorization, key );
	}

	public void deleteTSecGrpMembByUUserIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGrpMembByUUserIdxKey argKey )
	{
		YCFGenKbTSecGrpMembBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbTSecGrpMembBuff> matchSet = new LinkedList<YCFGenKbTSecGrpMembBuff>();
		Iterator<YCFGenKbTSecGrpMembBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbTSecGrpMembBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTSecGrpMemb().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredTSecGrpMembId() );
			deleteTSecGrpMemb( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
