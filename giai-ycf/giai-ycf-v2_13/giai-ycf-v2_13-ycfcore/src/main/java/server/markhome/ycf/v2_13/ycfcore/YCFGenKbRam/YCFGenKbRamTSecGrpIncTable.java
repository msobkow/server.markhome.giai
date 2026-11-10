
// Description: Java 11 in-memory RAM DbIO implementation for TSecGrpInc.

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
 *	YCFGenKbRamTSecGrpIncTable in-memory RAM DbIO implementation
 *	for TSecGrpInc.
 */
public class YCFGenKbRamTSecGrpIncTable
	implements IYCFGenKbTSecGrpIncTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbTSecGrpIncPKey,
				YCFGenKbTSecGrpIncBuff > dictByPKey
		= new HashMap< YCFGenKbTSecGrpIncPKey,
				YCFGenKbTSecGrpIncBuff >();
	private Map< YCFGenKbTSecGrpIncByTenantIdxKey,
				Map< YCFGenKbTSecGrpIncPKey,
					YCFGenKbTSecGrpIncBuff >> dictByTenantIdx
		= new HashMap< YCFGenKbTSecGrpIncByTenantIdxKey,
				Map< YCFGenKbTSecGrpIncPKey,
					YCFGenKbTSecGrpIncBuff >>();
	private Map< YCFGenKbTSecGrpIncByGroupIdxKey,
				Map< YCFGenKbTSecGrpIncPKey,
					YCFGenKbTSecGrpIncBuff >> dictByGroupIdx
		= new HashMap< YCFGenKbTSecGrpIncByGroupIdxKey,
				Map< YCFGenKbTSecGrpIncPKey,
					YCFGenKbTSecGrpIncBuff >>();
	private Map< YCFGenKbTSecGrpIncByIncludeIdxKey,
				Map< YCFGenKbTSecGrpIncPKey,
					YCFGenKbTSecGrpIncBuff >> dictByIncludeIdx
		= new HashMap< YCFGenKbTSecGrpIncByIncludeIdxKey,
				Map< YCFGenKbTSecGrpIncPKey,
					YCFGenKbTSecGrpIncBuff >>();
	private Map< YCFGenKbTSecGrpIncByUIncludeIdxKey,
			YCFGenKbTSecGrpIncBuff > dictByUIncludeIdx
		= new HashMap< YCFGenKbTSecGrpIncByUIncludeIdxKey,
			YCFGenKbTSecGrpIncBuff >();

	public YCFGenKbRamTSecGrpIncTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createTSecGrpInc( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGrpIncBuff Buff )
	{
		final String S_ProcName = "createTSecGrpInc";
		YCFGenKbTSecGrpIncPKey pkey = schema.getFactoryTSecGrpInc().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredTSecGrpIncId( ((YCFGenKbRamTenantTable)schema.getTableTenant()).nextTSecGrpIncIdGen( Authorization,
			Buff.getRequiredTenantId() ) );
		Buff.setRequiredTenantId( pkey.getRequiredTenantId() );
		Buff.setRequiredTSecGrpIncId( pkey.getRequiredTSecGrpIncId() );
		YCFGenKbTSecGrpIncByTenantIdxKey keyTenantIdx = schema.getFactoryTSecGrpInc().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFGenKbTSecGrpIncByGroupIdxKey keyGroupIdx = schema.getFactoryTSecGrpInc().newGroupIdxKey();
		keyGroupIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyGroupIdx.setRequiredTSecGroupId( Buff.getRequiredTSecGroupId() );

		YCFGenKbTSecGrpIncByIncludeIdxKey keyIncludeIdx = schema.getFactoryTSecGrpInc().newIncludeIdxKey();
		keyIncludeIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyIncludeIdx.setRequiredIncludeGroupId( Buff.getRequiredIncludeGroupId() );

		YCFGenKbTSecGrpIncByUIncludeIdxKey keyUIncludeIdx = schema.getFactoryTSecGrpInc().newUIncludeIdxKey();
		keyUIncludeIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		keyUIncludeIdx.setRequiredTSecGroupId( Buff.getRequiredTSecGroupId() );
		keyUIncludeIdx.setRequiredIncludeGroupId( Buff.getRequiredIncludeGroupId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUIncludeIdx.containsKey( keyUIncludeIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"TSecGrpIncUIncludeIdx",
				keyUIncludeIdx );
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
						"TSecGrpIncTenant",
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
						"TSecGrpIncGroup",
						"TSecGroup",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFGenKbTSecGrpIncPKey, YCFGenKbTSecGrpIncBuff > subdictTenantIdx;
		if( dictByTenantIdx.containsKey( keyTenantIdx ) ) {
			subdictTenantIdx = dictByTenantIdx.get( keyTenantIdx );
		}
		else {
			subdictTenantIdx = new HashMap< YCFGenKbTSecGrpIncPKey, YCFGenKbTSecGrpIncBuff >();
			dictByTenantIdx.put( keyTenantIdx, subdictTenantIdx );
		}
		subdictTenantIdx.put( pkey, Buff );

		Map< YCFGenKbTSecGrpIncPKey, YCFGenKbTSecGrpIncBuff > subdictGroupIdx;
		if( dictByGroupIdx.containsKey( keyGroupIdx ) ) {
			subdictGroupIdx = dictByGroupIdx.get( keyGroupIdx );
		}
		else {
			subdictGroupIdx = new HashMap< YCFGenKbTSecGrpIncPKey, YCFGenKbTSecGrpIncBuff >();
			dictByGroupIdx.put( keyGroupIdx, subdictGroupIdx );
		}
		subdictGroupIdx.put( pkey, Buff );

		Map< YCFGenKbTSecGrpIncPKey, YCFGenKbTSecGrpIncBuff > subdictIncludeIdx;
		if( dictByIncludeIdx.containsKey( keyIncludeIdx ) ) {
			subdictIncludeIdx = dictByIncludeIdx.get( keyIncludeIdx );
		}
		else {
			subdictIncludeIdx = new HashMap< YCFGenKbTSecGrpIncPKey, YCFGenKbTSecGrpIncBuff >();
			dictByIncludeIdx.put( keyIncludeIdx, subdictIncludeIdx );
		}
		subdictIncludeIdx.put( pkey, Buff );

		dictByUIncludeIdx.put( keyUIncludeIdx, Buff );

	}

	public YCFGenKbTSecGrpIncBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGrpIncPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamTSecGrpInc.readDerived";
		YCFGenKbTSecGrpIncPKey key = schema.getFactoryTSecGrpInc().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredTSecGrpIncId( PKey.getRequiredTSecGrpIncId() );
		YCFGenKbTSecGrpIncBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbTSecGrpIncBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGrpIncPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamTSecGrpInc.readDerived";
		YCFGenKbTSecGrpIncPKey key = schema.getFactoryTSecGrpInc().newPKey();
		key.setRequiredTenantId( PKey.getRequiredTenantId() );
		key.setRequiredTSecGrpIncId( PKey.getRequiredTSecGrpIncId() );
		YCFGenKbTSecGrpIncBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbTSecGrpIncBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamTSecGrpInc.readAllDerived";
		YCFGenKbTSecGrpIncBuff[] retList = new YCFGenKbTSecGrpIncBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbTSecGrpIncBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbTSecGrpIncBuff[] readDerivedByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFGenKbRamTSecGrpInc.readDerivedByTenantIdx";
		YCFGenKbTSecGrpIncByTenantIdxKey key = schema.getFactoryTSecGrpInc().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );

		YCFGenKbTSecGrpIncBuff[] recArray;
		if( dictByTenantIdx.containsKey( key ) ) {
			Map< YCFGenKbTSecGrpIncPKey, YCFGenKbTSecGrpIncBuff > subdictTenantIdx
				= dictByTenantIdx.get( key );
			recArray = new YCFGenKbTSecGrpIncBuff[ subdictTenantIdx.size() ];
			Iterator< YCFGenKbTSecGrpIncBuff > iter = subdictTenantIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbTSecGrpIncPKey, YCFGenKbTSecGrpIncBuff > subdictTenantIdx
				= new HashMap< YCFGenKbTSecGrpIncPKey, YCFGenKbTSecGrpIncBuff >();
			dictByTenantIdx.put( key, subdictTenantIdx );
			recArray = new YCFGenKbTSecGrpIncBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbTSecGrpIncBuff[] readDerivedByGroupIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		int TSecGroupId )
	{
		final String S_ProcName = "YCFGenKbRamTSecGrpInc.readDerivedByGroupIdx";
		YCFGenKbTSecGrpIncByGroupIdxKey key = schema.getFactoryTSecGrpInc().newGroupIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );

		YCFGenKbTSecGrpIncBuff[] recArray;
		if( dictByGroupIdx.containsKey( key ) ) {
			Map< YCFGenKbTSecGrpIncPKey, YCFGenKbTSecGrpIncBuff > subdictGroupIdx
				= dictByGroupIdx.get( key );
			recArray = new YCFGenKbTSecGrpIncBuff[ subdictGroupIdx.size() ];
			Iterator< YCFGenKbTSecGrpIncBuff > iter = subdictGroupIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbTSecGrpIncPKey, YCFGenKbTSecGrpIncBuff > subdictGroupIdx
				= new HashMap< YCFGenKbTSecGrpIncPKey, YCFGenKbTSecGrpIncBuff >();
			dictByGroupIdx.put( key, subdictGroupIdx );
			recArray = new YCFGenKbTSecGrpIncBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbTSecGrpIncBuff[] readDerivedByIncludeIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		int IncludeGroupId )
	{
		final String S_ProcName = "YCFGenKbRamTSecGrpInc.readDerivedByIncludeIdx";
		YCFGenKbTSecGrpIncByIncludeIdxKey key = schema.getFactoryTSecGrpInc().newIncludeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredIncludeGroupId( IncludeGroupId );

		YCFGenKbTSecGrpIncBuff[] recArray;
		if( dictByIncludeIdx.containsKey( key ) ) {
			Map< YCFGenKbTSecGrpIncPKey, YCFGenKbTSecGrpIncBuff > subdictIncludeIdx
				= dictByIncludeIdx.get( key );
			recArray = new YCFGenKbTSecGrpIncBuff[ subdictIncludeIdx.size() ];
			Iterator< YCFGenKbTSecGrpIncBuff > iter = subdictIncludeIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbTSecGrpIncPKey, YCFGenKbTSecGrpIncBuff > subdictIncludeIdx
				= new HashMap< YCFGenKbTSecGrpIncPKey, YCFGenKbTSecGrpIncBuff >();
			dictByIncludeIdx.put( key, subdictIncludeIdx );
			recArray = new YCFGenKbTSecGrpIncBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbTSecGrpIncBuff readDerivedByUIncludeIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		int TSecGroupId,
		int IncludeGroupId )
	{
		final String S_ProcName = "YCFGenKbRamTSecGrpInc.readDerivedByUIncludeIdx";
		YCFGenKbTSecGrpIncByUIncludeIdxKey key = schema.getFactoryTSecGrpInc().newUIncludeIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGroupId( TSecGroupId );
		key.setRequiredIncludeGroupId( IncludeGroupId );

		YCFGenKbTSecGrpIncBuff buff;
		if( dictByUIncludeIdx.containsKey( key ) ) {
			buff = dictByUIncludeIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbTSecGrpIncBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long TSecGrpIncId )
	{
		final String S_ProcName = "YCFGenKbRamTSecGrpInc.readDerivedByIdIdx() ";
		YCFGenKbTSecGrpIncPKey key = schema.getFactoryTSecGrpInc().newPKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredTSecGrpIncId( TSecGrpIncId );

		YCFGenKbTSecGrpIncBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbTSecGrpIncBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGrpIncPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamTSecGrpInc.readBuff";
		YCFGenKbTSecGrpIncBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a912" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbTSecGrpIncBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGrpIncPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbTSecGrpIncBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a912" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbTSecGrpIncBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamTSecGrpInc.readAllBuff";
		YCFGenKbTSecGrpIncBuff buff;
		ArrayList<YCFGenKbTSecGrpIncBuff> filteredList = new ArrayList<YCFGenKbTSecGrpIncBuff>();
		YCFGenKbTSecGrpIncBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a912" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbTSecGrpIncBuff[0] ) );
	}

	/**
	 *	Read a page of all the specific TSecGrpInc buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific TSecGrpInc instances in the database accessible for the Authorization.
	 */
	public YCFGenKbTSecGrpIncBuff[] pageAllBuff( YCFGenKbAuthorization Authorization,
		Long priorTenantId,
		Long priorTSecGrpIncId )
	{
		final String S_ProcName = "pageAllBuff";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public YCFGenKbTSecGrpIncBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long TSecGrpIncId )
	{
		final String S_ProcName = "YCFGenKbRamTSecGrpInc.readBuffByIdIdx() ";
		YCFGenKbTSecGrpIncBuff buff = readDerivedByIdIdx( Authorization,
			TenantId,
			TSecGrpIncId );
		if( ( buff != null ) && buff.getClassCode().equals( "a912" ) ) {
			return( (YCFGenKbTSecGrpIncBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbTSecGrpIncBuff[] readBuffByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId )
	{
		final String S_ProcName = "YCFGenKbRamTSecGrpInc.readBuffByTenantIdx() ";
		YCFGenKbTSecGrpIncBuff buff;
		ArrayList<YCFGenKbTSecGrpIncBuff> filteredList = new ArrayList<YCFGenKbTSecGrpIncBuff>();
		YCFGenKbTSecGrpIncBuff[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a912" ) ) {
				filteredList.add( (YCFGenKbTSecGrpIncBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbTSecGrpIncBuff[0] ) );
	}

	public YCFGenKbTSecGrpIncBuff[] readBuffByGroupIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		int TSecGroupId )
	{
		final String S_ProcName = "YCFGenKbRamTSecGrpInc.readBuffByGroupIdx() ";
		YCFGenKbTSecGrpIncBuff buff;
		ArrayList<YCFGenKbTSecGrpIncBuff> filteredList = new ArrayList<YCFGenKbTSecGrpIncBuff>();
		YCFGenKbTSecGrpIncBuff[] buffList = readDerivedByGroupIdx( Authorization,
			TenantId,
			TSecGroupId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a912" ) ) {
				filteredList.add( (YCFGenKbTSecGrpIncBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbTSecGrpIncBuff[0] ) );
	}

	public YCFGenKbTSecGrpIncBuff[] readBuffByIncludeIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		int IncludeGroupId )
	{
		final String S_ProcName = "YCFGenKbRamTSecGrpInc.readBuffByIncludeIdx() ";
		YCFGenKbTSecGrpIncBuff buff;
		ArrayList<YCFGenKbTSecGrpIncBuff> filteredList = new ArrayList<YCFGenKbTSecGrpIncBuff>();
		YCFGenKbTSecGrpIncBuff[] buffList = readDerivedByIncludeIdx( Authorization,
			TenantId,
			IncludeGroupId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a912" ) ) {
				filteredList.add( (YCFGenKbTSecGrpIncBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbTSecGrpIncBuff[0] ) );
	}

	public YCFGenKbTSecGrpIncBuff readBuffByUIncludeIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		int TSecGroupId,
		int IncludeGroupId )
	{
		final String S_ProcName = "YCFGenKbRamTSecGrpInc.readBuffByUIncludeIdx() ";
		YCFGenKbTSecGrpIncBuff buff = readDerivedByUIncludeIdx( Authorization,
			TenantId,
			TSecGroupId,
			IncludeGroupId );
		if( ( buff != null ) && buff.getClassCode().equals( "a912" ) ) {
			return( (YCFGenKbTSecGrpIncBuff)buff );
		}
		else {
			return( null );
		}
	}

	/**
	 *	Read a page array of the specific TSecGrpInc buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbTSecGrpIncBuff[] pageBuffByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		Long priorTenantId,
		Long priorTSecGrpIncId )
	{
		final String S_ProcName = "pageBuffByTenantIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific TSecGrpInc buffer instances identified by the duplicate key GroupIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbTSecGrpIncBuff[] pageBuffByGroupIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		int TSecGroupId,
		Long priorTenantId,
		Long priorTSecGrpIncId )
	{
		final String S_ProcName = "pageBuffByGroupIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific TSecGrpInc buffer instances identified by the duplicate key IncludeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The TSecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbTSecGrpIncBuff[] pageBuffByIncludeIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		int IncludeGroupId,
		Long priorTenantId,
		Long priorTSecGrpIncId )
	{
		final String S_ProcName = "pageBuffByIncludeIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateTSecGrpInc( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGrpIncBuff Buff )
	{
		YCFGenKbTSecGrpIncPKey pkey = schema.getFactoryTSecGrpInc().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredTSecGrpIncId( Buff.getRequiredTSecGrpIncId() );
		YCFGenKbTSecGrpIncBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateTSecGrpInc",
				"Existing record not found",
				"TSecGrpInc",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateTSecGrpInc",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFGenKbTSecGrpIncByTenantIdxKey existingKeyTenantIdx = schema.getFactoryTSecGrpInc().newTenantIdxKey();
		existingKeyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFGenKbTSecGrpIncByTenantIdxKey newKeyTenantIdx = schema.getFactoryTSecGrpInc().newTenantIdxKey();
		newKeyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		YCFGenKbTSecGrpIncByGroupIdxKey existingKeyGroupIdx = schema.getFactoryTSecGrpInc().newGroupIdxKey();
		existingKeyGroupIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyGroupIdx.setRequiredTSecGroupId( existing.getRequiredTSecGroupId() );

		YCFGenKbTSecGrpIncByGroupIdxKey newKeyGroupIdx = schema.getFactoryTSecGrpInc().newGroupIdxKey();
		newKeyGroupIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyGroupIdx.setRequiredTSecGroupId( Buff.getRequiredTSecGroupId() );

		YCFGenKbTSecGrpIncByIncludeIdxKey existingKeyIncludeIdx = schema.getFactoryTSecGrpInc().newIncludeIdxKey();
		existingKeyIncludeIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyIncludeIdx.setRequiredIncludeGroupId( existing.getRequiredIncludeGroupId() );

		YCFGenKbTSecGrpIncByIncludeIdxKey newKeyIncludeIdx = schema.getFactoryTSecGrpInc().newIncludeIdxKey();
		newKeyIncludeIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyIncludeIdx.setRequiredIncludeGroupId( Buff.getRequiredIncludeGroupId() );

		YCFGenKbTSecGrpIncByUIncludeIdxKey existingKeyUIncludeIdx = schema.getFactoryTSecGrpInc().newUIncludeIdxKey();
		existingKeyUIncludeIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		existingKeyUIncludeIdx.setRequiredTSecGroupId( existing.getRequiredTSecGroupId() );
		existingKeyUIncludeIdx.setRequiredIncludeGroupId( existing.getRequiredIncludeGroupId() );

		YCFGenKbTSecGrpIncByUIncludeIdxKey newKeyUIncludeIdx = schema.getFactoryTSecGrpInc().newUIncludeIdxKey();
		newKeyUIncludeIdx.setRequiredTenantId( Buff.getRequiredTenantId() );
		newKeyUIncludeIdx.setRequiredTSecGroupId( Buff.getRequiredTSecGroupId() );
		newKeyUIncludeIdx.setRequiredIncludeGroupId( Buff.getRequiredIncludeGroupId() );

		// Check unique indexes

		if( ! existingKeyUIncludeIdx.equals( newKeyUIncludeIdx ) ) {
			if( dictByUIncludeIdx.containsKey( newKeyUIncludeIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateTSecGrpInc",
					"TSecGrpIncUIncludeIdx",
					newKeyUIncludeIdx );
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
						"updateTSecGrpInc",
						"Owner",
						"TSecGrpIncTenant",
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
						"updateTSecGrpInc",
						"Container",
						"TSecGrpIncGroup",
						"TSecGroup",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFGenKbTSecGrpIncPKey, YCFGenKbTSecGrpIncBuff > subdict;

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
			subdict = new HashMap< YCFGenKbTSecGrpIncPKey, YCFGenKbTSecGrpIncBuff >();
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
			subdict = new HashMap< YCFGenKbTSecGrpIncPKey, YCFGenKbTSecGrpIncBuff >();
			dictByGroupIdx.put( newKeyGroupIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByIncludeIdx.get( existingKeyIncludeIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByIncludeIdx.containsKey( newKeyIncludeIdx ) ) {
			subdict = dictByIncludeIdx.get( newKeyIncludeIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbTSecGrpIncPKey, YCFGenKbTSecGrpIncBuff >();
			dictByIncludeIdx.put( newKeyIncludeIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUIncludeIdx.remove( existingKeyUIncludeIdx );
		dictByUIncludeIdx.put( newKeyUIncludeIdx, Buff );

	}

	public void deleteTSecGrpInc( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGrpIncBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamTSecGrpIncTable.deleteTSecGrpInc() ";
		String classCode;
		YCFGenKbTSecGrpIncPKey pkey = schema.getFactoryTSecGrpInc().newPKey();
		pkey.setRequiredTenantId( Buff.getRequiredTenantId() );
		pkey.setRequiredTSecGrpIncId( Buff.getRequiredTSecGrpIncId() );
		YCFGenKbTSecGrpIncBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteTSecGrpInc",
				pkey );
		}
		YCFGenKbTSecGrpIncByTenantIdxKey keyTenantIdx = schema.getFactoryTSecGrpInc().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFGenKbTSecGrpIncByGroupIdxKey keyGroupIdx = schema.getFactoryTSecGrpInc().newGroupIdxKey();
		keyGroupIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyGroupIdx.setRequiredTSecGroupId( existing.getRequiredTSecGroupId() );

		YCFGenKbTSecGrpIncByIncludeIdxKey keyIncludeIdx = schema.getFactoryTSecGrpInc().newIncludeIdxKey();
		keyIncludeIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyIncludeIdx.setRequiredIncludeGroupId( existing.getRequiredIncludeGroupId() );

		YCFGenKbTSecGrpIncByUIncludeIdxKey keyUIncludeIdx = schema.getFactoryTSecGrpInc().newUIncludeIdxKey();
		keyUIncludeIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyUIncludeIdx.setRequiredTSecGroupId( existing.getRequiredTSecGroupId() );
		keyUIncludeIdx.setRequiredIncludeGroupId( existing.getRequiredIncludeGroupId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFGenKbTSecGrpIncPKey, YCFGenKbTSecGrpIncBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByTenantIdx.get( keyTenantIdx );
		subdict.remove( pkey );

		subdict = dictByGroupIdx.get( keyGroupIdx );
		subdict.remove( pkey );

		subdict = dictByIncludeIdx.get( keyIncludeIdx );
		subdict.remove( pkey );

		dictByUIncludeIdx.remove( keyUIncludeIdx );

	}
	public void deleteTSecGrpIncByIdIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argTSecGrpIncId )
	{
		YCFGenKbTSecGrpIncPKey key = schema.getFactoryTSecGrpInc().newPKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTSecGrpIncId( argTSecGrpIncId );
		deleteTSecGrpIncByIdIdx( Authorization, key );
	}

	public void deleteTSecGrpIncByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGrpIncPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbTSecGrpIncBuff cur;
		LinkedList<YCFGenKbTSecGrpIncBuff> matchSet = new LinkedList<YCFGenKbTSecGrpIncBuff>();
		Iterator<YCFGenKbTSecGrpIncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbTSecGrpIncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTSecGrpInc().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredTSecGrpIncId() );
			deleteTSecGrpInc( Authorization, cur );
		}
	}

	public void deleteTSecGrpIncByTenantIdx( YCFGenKbAuthorization Authorization,
		long argTenantId )
	{
		YCFGenKbTSecGrpIncByTenantIdxKey key = schema.getFactoryTSecGrpInc().newTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteTSecGrpIncByTenantIdx( Authorization, key );
	}

	public void deleteTSecGrpIncByTenantIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGrpIncByTenantIdxKey argKey )
	{
		YCFGenKbTSecGrpIncBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbTSecGrpIncBuff> matchSet = new LinkedList<YCFGenKbTSecGrpIncBuff>();
		Iterator<YCFGenKbTSecGrpIncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbTSecGrpIncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTSecGrpInc().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredTSecGrpIncId() );
			deleteTSecGrpInc( Authorization, cur );
		}
	}

	public void deleteTSecGrpIncByGroupIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		int argTSecGroupId )
	{
		YCFGenKbTSecGrpIncByGroupIdxKey key = schema.getFactoryTSecGrpInc().newGroupIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTSecGroupId( argTSecGroupId );
		deleteTSecGrpIncByGroupIdx( Authorization, key );
	}

	public void deleteTSecGrpIncByGroupIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGrpIncByGroupIdxKey argKey )
	{
		YCFGenKbTSecGrpIncBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbTSecGrpIncBuff> matchSet = new LinkedList<YCFGenKbTSecGrpIncBuff>();
		Iterator<YCFGenKbTSecGrpIncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbTSecGrpIncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTSecGrpInc().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredTSecGrpIncId() );
			deleteTSecGrpInc( Authorization, cur );
		}
	}

	public void deleteTSecGrpIncByIncludeIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		int argIncludeGroupId )
	{
		YCFGenKbTSecGrpIncByIncludeIdxKey key = schema.getFactoryTSecGrpInc().newIncludeIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredIncludeGroupId( argIncludeGroupId );
		deleteTSecGrpIncByIncludeIdx( Authorization, key );
	}

	public void deleteTSecGrpIncByIncludeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGrpIncByIncludeIdxKey argKey )
	{
		YCFGenKbTSecGrpIncBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbTSecGrpIncBuff> matchSet = new LinkedList<YCFGenKbTSecGrpIncBuff>();
		Iterator<YCFGenKbTSecGrpIncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbTSecGrpIncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTSecGrpInc().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredTSecGrpIncId() );
			deleteTSecGrpInc( Authorization, cur );
		}
	}

	public void deleteTSecGrpIncByUIncludeIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		int argTSecGroupId,
		int argIncludeGroupId )
	{
		YCFGenKbTSecGrpIncByUIncludeIdxKey key = schema.getFactoryTSecGrpInc().newUIncludeIdxKey();
		key.setRequiredTenantId( argTenantId );
		key.setRequiredTSecGroupId( argTSecGroupId );
		key.setRequiredIncludeGroupId( argIncludeGroupId );
		deleteTSecGrpIncByUIncludeIdx( Authorization, key );
	}

	public void deleteTSecGrpIncByUIncludeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbTSecGrpIncByUIncludeIdxKey argKey )
	{
		YCFGenKbTSecGrpIncBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbTSecGrpIncBuff> matchSet = new LinkedList<YCFGenKbTSecGrpIncBuff>();
		Iterator<YCFGenKbTSecGrpIncBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbTSecGrpIncBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableTSecGrpInc().readDerivedByIdIdx( Authorization,
				cur.getRequiredTenantId(),
				cur.getRequiredTSecGrpIncId() );
			deleteTSecGrpInc( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
