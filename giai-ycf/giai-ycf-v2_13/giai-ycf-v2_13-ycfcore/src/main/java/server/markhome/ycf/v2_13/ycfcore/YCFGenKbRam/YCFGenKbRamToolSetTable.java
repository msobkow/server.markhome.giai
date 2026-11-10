
// Description: Java 11 in-memory RAM DbIO implementation for ToolSet.

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
 *	YCFGenKbRamToolSetTable in-memory RAM DbIO implementation
 *	for ToolSet.
 */
public class YCFGenKbRamToolSetTable
	implements IYCFGenKbToolSetTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbToolSetPKey,
				YCFGenKbToolSetBuff > dictByPKey
		= new HashMap< YCFGenKbToolSetPKey,
				YCFGenKbToolSetBuff >();
	private Map< YCFGenKbToolSetByNameIdxKey,
			YCFGenKbToolSetBuff > dictByNameIdx
		= new HashMap< YCFGenKbToolSetByNameIdxKey,
			YCFGenKbToolSetBuff >();
	private Map< YCFGenKbToolSetByTool0IdxKey,
				Map< YCFGenKbToolSetPKey,
					YCFGenKbToolSetBuff >> dictByTool0Idx
		= new HashMap< YCFGenKbToolSetByTool0IdxKey,
				Map< YCFGenKbToolSetPKey,
					YCFGenKbToolSetBuff >>();
	private Map< YCFGenKbToolSetByTool1IdxKey,
				Map< YCFGenKbToolSetPKey,
					YCFGenKbToolSetBuff >> dictByTool1Idx
		= new HashMap< YCFGenKbToolSetByTool1IdxKey,
				Map< YCFGenKbToolSetPKey,
					YCFGenKbToolSetBuff >>();
	private Map< YCFGenKbToolSetByTool2IdxKey,
				Map< YCFGenKbToolSetPKey,
					YCFGenKbToolSetBuff >> dictByTool2Idx
		= new HashMap< YCFGenKbToolSetByTool2IdxKey,
				Map< YCFGenKbToolSetPKey,
					YCFGenKbToolSetBuff >>();
	private Map< YCFGenKbToolSetByTool3IdxKey,
				Map< YCFGenKbToolSetPKey,
					YCFGenKbToolSetBuff >> dictByTool3Idx
		= new HashMap< YCFGenKbToolSetByTool3IdxKey,
				Map< YCFGenKbToolSetPKey,
					YCFGenKbToolSetBuff >>();
	private Map< YCFGenKbToolSetByTool4IdxKey,
				Map< YCFGenKbToolSetPKey,
					YCFGenKbToolSetBuff >> dictByTool4Idx
		= new HashMap< YCFGenKbToolSetByTool4IdxKey,
				Map< YCFGenKbToolSetPKey,
					YCFGenKbToolSetBuff >>();
	private Map< YCFGenKbToolSetByTool5IdxKey,
				Map< YCFGenKbToolSetPKey,
					YCFGenKbToolSetBuff >> dictByTool5Idx
		= new HashMap< YCFGenKbToolSetByTool5IdxKey,
				Map< YCFGenKbToolSetPKey,
					YCFGenKbToolSetBuff >>();
	private Map< YCFGenKbToolSetByTool6IdxKey,
				Map< YCFGenKbToolSetPKey,
					YCFGenKbToolSetBuff >> dictByTool6Idx
		= new HashMap< YCFGenKbToolSetByTool6IdxKey,
				Map< YCFGenKbToolSetPKey,
					YCFGenKbToolSetBuff >>();
	private Map< YCFGenKbToolSetByTool7IdxKey,
				Map< YCFGenKbToolSetPKey,
					YCFGenKbToolSetBuff >> dictByTool7Idx
		= new HashMap< YCFGenKbToolSetByTool7IdxKey,
				Map< YCFGenKbToolSetPKey,
					YCFGenKbToolSetBuff >>();

	public YCFGenKbRamToolSetTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createToolSet( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetBuff Buff )
	{
		final String S_ProcName = "createToolSet";
		YCFGenKbToolSetPKey pkey = schema.getFactoryToolSet().newPKey();
		pkey.setRequiredId( schema.nextToolSetIdGen() );
		Buff.setRequiredId( pkey.getRequiredId() );
		YCFGenKbToolSetByNameIdxKey keyNameIdx = schema.getFactoryToolSet().newNameIdxKey();
		keyNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFGenKbToolSetByTool0IdxKey keyTool0Idx = schema.getFactoryToolSet().newTool0IdxKey();
		keyTool0Idx.setRequiredToolId0( Buff.getRequiredToolId0() );

		YCFGenKbToolSetByTool1IdxKey keyTool1Idx = schema.getFactoryToolSet().newTool1IdxKey();
		keyTool1Idx.setOptionalToolId1( Buff.getOptionalToolId1() );

		YCFGenKbToolSetByTool2IdxKey keyTool2Idx = schema.getFactoryToolSet().newTool2IdxKey();
		keyTool2Idx.setOptionalToolId2( Buff.getOptionalToolId2() );

		YCFGenKbToolSetByTool3IdxKey keyTool3Idx = schema.getFactoryToolSet().newTool3IdxKey();
		keyTool3Idx.setOptionalToolId3( Buff.getOptionalToolId3() );

		YCFGenKbToolSetByTool4IdxKey keyTool4Idx = schema.getFactoryToolSet().newTool4IdxKey();
		keyTool4Idx.setOptionalToolId4( Buff.getOptionalToolId4() );

		YCFGenKbToolSetByTool5IdxKey keyTool5Idx = schema.getFactoryToolSet().newTool5IdxKey();
		keyTool5Idx.setOptionalToolId5( Buff.getOptionalToolId5() );

		YCFGenKbToolSetByTool6IdxKey keyTool6Idx = schema.getFactoryToolSet().newTool6IdxKey();
		keyTool6Idx.setOptionalToolId6( Buff.getOptionalToolId6() );

		YCFGenKbToolSetByTool7IdxKey keyTool7Idx = schema.getFactoryToolSet().newTool7IdxKey();
		keyTool7Idx.setOptionalToolId7( Buff.getOptionalToolId7() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByNameIdx.containsKey( keyNameIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"ToolSetName",
				keyNameIdx );
		}

		// Validate foreign keys

		{
			boolean allNull = true;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableTool().readDerivedByIdIdx( Authorization,
						Buff.getRequiredToolId0() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Lookup",
						"Tool0",
						"Tool",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		dictByNameIdx.put( keyNameIdx, Buff );

		Map< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff > subdictTool0Idx;
		if( dictByTool0Idx.containsKey( keyTool0Idx ) ) {
			subdictTool0Idx = dictByTool0Idx.get( keyTool0Idx );
		}
		else {
			subdictTool0Idx = new HashMap< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff >();
			dictByTool0Idx.put( keyTool0Idx, subdictTool0Idx );
		}
		subdictTool0Idx.put( pkey, Buff );

		Map< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff > subdictTool1Idx;
		if( dictByTool1Idx.containsKey( keyTool1Idx ) ) {
			subdictTool1Idx = dictByTool1Idx.get( keyTool1Idx );
		}
		else {
			subdictTool1Idx = new HashMap< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff >();
			dictByTool1Idx.put( keyTool1Idx, subdictTool1Idx );
		}
		subdictTool1Idx.put( pkey, Buff );

		Map< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff > subdictTool2Idx;
		if( dictByTool2Idx.containsKey( keyTool2Idx ) ) {
			subdictTool2Idx = dictByTool2Idx.get( keyTool2Idx );
		}
		else {
			subdictTool2Idx = new HashMap< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff >();
			dictByTool2Idx.put( keyTool2Idx, subdictTool2Idx );
		}
		subdictTool2Idx.put( pkey, Buff );

		Map< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff > subdictTool3Idx;
		if( dictByTool3Idx.containsKey( keyTool3Idx ) ) {
			subdictTool3Idx = dictByTool3Idx.get( keyTool3Idx );
		}
		else {
			subdictTool3Idx = new HashMap< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff >();
			dictByTool3Idx.put( keyTool3Idx, subdictTool3Idx );
		}
		subdictTool3Idx.put( pkey, Buff );

		Map< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff > subdictTool4Idx;
		if( dictByTool4Idx.containsKey( keyTool4Idx ) ) {
			subdictTool4Idx = dictByTool4Idx.get( keyTool4Idx );
		}
		else {
			subdictTool4Idx = new HashMap< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff >();
			dictByTool4Idx.put( keyTool4Idx, subdictTool4Idx );
		}
		subdictTool4Idx.put( pkey, Buff );

		Map< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff > subdictTool5Idx;
		if( dictByTool5Idx.containsKey( keyTool5Idx ) ) {
			subdictTool5Idx = dictByTool5Idx.get( keyTool5Idx );
		}
		else {
			subdictTool5Idx = new HashMap< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff >();
			dictByTool5Idx.put( keyTool5Idx, subdictTool5Idx );
		}
		subdictTool5Idx.put( pkey, Buff );

		Map< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff > subdictTool6Idx;
		if( dictByTool6Idx.containsKey( keyTool6Idx ) ) {
			subdictTool6Idx = dictByTool6Idx.get( keyTool6Idx );
		}
		else {
			subdictTool6Idx = new HashMap< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff >();
			dictByTool6Idx.put( keyTool6Idx, subdictTool6Idx );
		}
		subdictTool6Idx.put( pkey, Buff );

		Map< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff > subdictTool7Idx;
		if( dictByTool7Idx.containsKey( keyTool7Idx ) ) {
			subdictTool7Idx = dictByTool7Idx.get( keyTool7Idx );
		}
		else {
			subdictTool7Idx = new HashMap< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff >();
			dictByTool7Idx.put( keyTool7Idx, subdictTool7Idx );
		}
		subdictTool7Idx.put( pkey, Buff );

	}

	public YCFGenKbToolSetBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamToolSet.readDerived";
		YCFGenKbToolSetPKey key = schema.getFactoryToolSet().newPKey();
		key.setRequiredId( PKey.getRequiredId() );
		YCFGenKbToolSetBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbToolSetBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamToolSet.readDerived";
		YCFGenKbToolSetPKey key = schema.getFactoryToolSet().newPKey();
		key.setRequiredId( PKey.getRequiredId() );
		YCFGenKbToolSetBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbToolSetBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamToolSet.readAllDerived";
		YCFGenKbToolSetBuff[] retList = new YCFGenKbToolSetBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbToolSetBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbToolSetBuff readDerivedByNameIdx( YCFGenKbAuthorization Authorization,
		String Name )
	{
		final String S_ProcName = "YCFGenKbRamToolSet.readDerivedByNameIdx";
		YCFGenKbToolSetByNameIdxKey key = schema.getFactoryToolSet().newNameIdxKey();
		key.setRequiredName( Name );

		YCFGenKbToolSetBuff buff;
		if( dictByNameIdx.containsKey( key ) ) {
			buff = dictByNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbToolSetBuff[] readDerivedByTool0Idx( YCFGenKbAuthorization Authorization,
		short ToolId0 )
	{
		final String S_ProcName = "YCFGenKbRamToolSet.readDerivedByTool0Idx";
		YCFGenKbToolSetByTool0IdxKey key = schema.getFactoryToolSet().newTool0IdxKey();
		key.setRequiredToolId0( ToolId0 );

		YCFGenKbToolSetBuff[] recArray;
		if( dictByTool0Idx.containsKey( key ) ) {
			Map< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff > subdictTool0Idx
				= dictByTool0Idx.get( key );
			recArray = new YCFGenKbToolSetBuff[ subdictTool0Idx.size() ];
			Iterator< YCFGenKbToolSetBuff > iter = subdictTool0Idx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff > subdictTool0Idx
				= new HashMap< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff >();
			dictByTool0Idx.put( key, subdictTool0Idx );
			recArray = new YCFGenKbToolSetBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbToolSetBuff[] readDerivedByTool1Idx( YCFGenKbAuthorization Authorization,
		Short ToolId1 )
	{
		final String S_ProcName = "YCFGenKbRamToolSet.readDerivedByTool1Idx";
		YCFGenKbToolSetByTool1IdxKey key = schema.getFactoryToolSet().newTool1IdxKey();
		key.setOptionalToolId1( ToolId1 );

		YCFGenKbToolSetBuff[] recArray;
		if( dictByTool1Idx.containsKey( key ) ) {
			Map< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff > subdictTool1Idx
				= dictByTool1Idx.get( key );
			recArray = new YCFGenKbToolSetBuff[ subdictTool1Idx.size() ];
			Iterator< YCFGenKbToolSetBuff > iter = subdictTool1Idx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff > subdictTool1Idx
				= new HashMap< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff >();
			dictByTool1Idx.put( key, subdictTool1Idx );
			recArray = new YCFGenKbToolSetBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbToolSetBuff[] readDerivedByTool2Idx( YCFGenKbAuthorization Authorization,
		Short ToolId2 )
	{
		final String S_ProcName = "YCFGenKbRamToolSet.readDerivedByTool2Idx";
		YCFGenKbToolSetByTool2IdxKey key = schema.getFactoryToolSet().newTool2IdxKey();
		key.setOptionalToolId2( ToolId2 );

		YCFGenKbToolSetBuff[] recArray;
		if( dictByTool2Idx.containsKey( key ) ) {
			Map< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff > subdictTool2Idx
				= dictByTool2Idx.get( key );
			recArray = new YCFGenKbToolSetBuff[ subdictTool2Idx.size() ];
			Iterator< YCFGenKbToolSetBuff > iter = subdictTool2Idx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff > subdictTool2Idx
				= new HashMap< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff >();
			dictByTool2Idx.put( key, subdictTool2Idx );
			recArray = new YCFGenKbToolSetBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbToolSetBuff[] readDerivedByTool3Idx( YCFGenKbAuthorization Authorization,
		Short ToolId3 )
	{
		final String S_ProcName = "YCFGenKbRamToolSet.readDerivedByTool3Idx";
		YCFGenKbToolSetByTool3IdxKey key = schema.getFactoryToolSet().newTool3IdxKey();
		key.setOptionalToolId3( ToolId3 );

		YCFGenKbToolSetBuff[] recArray;
		if( dictByTool3Idx.containsKey( key ) ) {
			Map< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff > subdictTool3Idx
				= dictByTool3Idx.get( key );
			recArray = new YCFGenKbToolSetBuff[ subdictTool3Idx.size() ];
			Iterator< YCFGenKbToolSetBuff > iter = subdictTool3Idx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff > subdictTool3Idx
				= new HashMap< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff >();
			dictByTool3Idx.put( key, subdictTool3Idx );
			recArray = new YCFGenKbToolSetBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbToolSetBuff[] readDerivedByTool4Idx( YCFGenKbAuthorization Authorization,
		Short ToolId4 )
	{
		final String S_ProcName = "YCFGenKbRamToolSet.readDerivedByTool4Idx";
		YCFGenKbToolSetByTool4IdxKey key = schema.getFactoryToolSet().newTool4IdxKey();
		key.setOptionalToolId4( ToolId4 );

		YCFGenKbToolSetBuff[] recArray;
		if( dictByTool4Idx.containsKey( key ) ) {
			Map< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff > subdictTool4Idx
				= dictByTool4Idx.get( key );
			recArray = new YCFGenKbToolSetBuff[ subdictTool4Idx.size() ];
			Iterator< YCFGenKbToolSetBuff > iter = subdictTool4Idx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff > subdictTool4Idx
				= new HashMap< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff >();
			dictByTool4Idx.put( key, subdictTool4Idx );
			recArray = new YCFGenKbToolSetBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbToolSetBuff[] readDerivedByTool5Idx( YCFGenKbAuthorization Authorization,
		Short ToolId5 )
	{
		final String S_ProcName = "YCFGenKbRamToolSet.readDerivedByTool5Idx";
		YCFGenKbToolSetByTool5IdxKey key = schema.getFactoryToolSet().newTool5IdxKey();
		key.setOptionalToolId5( ToolId5 );

		YCFGenKbToolSetBuff[] recArray;
		if( dictByTool5Idx.containsKey( key ) ) {
			Map< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff > subdictTool5Idx
				= dictByTool5Idx.get( key );
			recArray = new YCFGenKbToolSetBuff[ subdictTool5Idx.size() ];
			Iterator< YCFGenKbToolSetBuff > iter = subdictTool5Idx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff > subdictTool5Idx
				= new HashMap< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff >();
			dictByTool5Idx.put( key, subdictTool5Idx );
			recArray = new YCFGenKbToolSetBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbToolSetBuff[] readDerivedByTool6Idx( YCFGenKbAuthorization Authorization,
		Short ToolId6 )
	{
		final String S_ProcName = "YCFGenKbRamToolSet.readDerivedByTool6Idx";
		YCFGenKbToolSetByTool6IdxKey key = schema.getFactoryToolSet().newTool6IdxKey();
		key.setOptionalToolId6( ToolId6 );

		YCFGenKbToolSetBuff[] recArray;
		if( dictByTool6Idx.containsKey( key ) ) {
			Map< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff > subdictTool6Idx
				= dictByTool6Idx.get( key );
			recArray = new YCFGenKbToolSetBuff[ subdictTool6Idx.size() ];
			Iterator< YCFGenKbToolSetBuff > iter = subdictTool6Idx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff > subdictTool6Idx
				= new HashMap< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff >();
			dictByTool6Idx.put( key, subdictTool6Idx );
			recArray = new YCFGenKbToolSetBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbToolSetBuff[] readDerivedByTool7Idx( YCFGenKbAuthorization Authorization,
		Short ToolId7 )
	{
		final String S_ProcName = "YCFGenKbRamToolSet.readDerivedByTool7Idx";
		YCFGenKbToolSetByTool7IdxKey key = schema.getFactoryToolSet().newTool7IdxKey();
		key.setOptionalToolId7( ToolId7 );

		YCFGenKbToolSetBuff[] recArray;
		if( dictByTool7Idx.containsKey( key ) ) {
			Map< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff > subdictTool7Idx
				= dictByTool7Idx.get( key );
			recArray = new YCFGenKbToolSetBuff[ subdictTool7Idx.size() ];
			Iterator< YCFGenKbToolSetBuff > iter = subdictTool7Idx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff > subdictTool7Idx
				= new HashMap< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff >();
			dictByTool7Idx.put( key, subdictTool7Idx );
			recArray = new YCFGenKbToolSetBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbToolSetBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
		short Id )
	{
		final String S_ProcName = "YCFGenKbRamToolSet.readDerivedByIdIdx() ";
		YCFGenKbToolSetPKey key = schema.getFactoryToolSet().newPKey();
		key.setRequiredId( Id );

		YCFGenKbToolSetBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbToolSetBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamToolSet.readBuff";
		YCFGenKbToolSetBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a928" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbToolSetBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbToolSetBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a928" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbToolSetBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamToolSet.readAllBuff";
		YCFGenKbToolSetBuff buff;
		ArrayList<YCFGenKbToolSetBuff> filteredList = new ArrayList<YCFGenKbToolSetBuff>();
		YCFGenKbToolSetBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a928" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbToolSetBuff[0] ) );
	}

	public YCFGenKbToolSetBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
		short Id )
	{
		final String S_ProcName = "YCFGenKbRamToolSet.readBuffByIdIdx() ";
		YCFGenKbToolSetBuff buff = readDerivedByIdIdx( Authorization,
			Id );
		if( ( buff != null ) && buff.getClassCode().equals( "a928" ) ) {
			return( (YCFGenKbToolSetBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbToolSetBuff readBuffByNameIdx( YCFGenKbAuthorization Authorization,
		String Name )
	{
		final String S_ProcName = "YCFGenKbRamToolSet.readBuffByNameIdx() ";
		YCFGenKbToolSetBuff buff = readDerivedByNameIdx( Authorization,
			Name );
		if( ( buff != null ) && buff.getClassCode().equals( "a928" ) ) {
			return( (YCFGenKbToolSetBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbToolSetBuff[] readBuffByTool0Idx( YCFGenKbAuthorization Authorization,
		short ToolId0 )
	{
		final String S_ProcName = "YCFGenKbRamToolSet.readBuffByTool0Idx() ";
		YCFGenKbToolSetBuff buff;
		ArrayList<YCFGenKbToolSetBuff> filteredList = new ArrayList<YCFGenKbToolSetBuff>();
		YCFGenKbToolSetBuff[] buffList = readDerivedByTool0Idx( Authorization,
			ToolId0 );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a928" ) ) {
				filteredList.add( (YCFGenKbToolSetBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbToolSetBuff[0] ) );
	}

	public YCFGenKbToolSetBuff[] readBuffByTool1Idx( YCFGenKbAuthorization Authorization,
		Short ToolId1 )
	{
		final String S_ProcName = "YCFGenKbRamToolSet.readBuffByTool1Idx() ";
		YCFGenKbToolSetBuff buff;
		ArrayList<YCFGenKbToolSetBuff> filteredList = new ArrayList<YCFGenKbToolSetBuff>();
		YCFGenKbToolSetBuff[] buffList = readDerivedByTool1Idx( Authorization,
			ToolId1 );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a928" ) ) {
				filteredList.add( (YCFGenKbToolSetBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbToolSetBuff[0] ) );
	}

	public YCFGenKbToolSetBuff[] readBuffByTool2Idx( YCFGenKbAuthorization Authorization,
		Short ToolId2 )
	{
		final String S_ProcName = "YCFGenKbRamToolSet.readBuffByTool2Idx() ";
		YCFGenKbToolSetBuff buff;
		ArrayList<YCFGenKbToolSetBuff> filteredList = new ArrayList<YCFGenKbToolSetBuff>();
		YCFGenKbToolSetBuff[] buffList = readDerivedByTool2Idx( Authorization,
			ToolId2 );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a928" ) ) {
				filteredList.add( (YCFGenKbToolSetBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbToolSetBuff[0] ) );
	}

	public YCFGenKbToolSetBuff[] readBuffByTool3Idx( YCFGenKbAuthorization Authorization,
		Short ToolId3 )
	{
		final String S_ProcName = "YCFGenKbRamToolSet.readBuffByTool3Idx() ";
		YCFGenKbToolSetBuff buff;
		ArrayList<YCFGenKbToolSetBuff> filteredList = new ArrayList<YCFGenKbToolSetBuff>();
		YCFGenKbToolSetBuff[] buffList = readDerivedByTool3Idx( Authorization,
			ToolId3 );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a928" ) ) {
				filteredList.add( (YCFGenKbToolSetBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbToolSetBuff[0] ) );
	}

	public YCFGenKbToolSetBuff[] readBuffByTool4Idx( YCFGenKbAuthorization Authorization,
		Short ToolId4 )
	{
		final String S_ProcName = "YCFGenKbRamToolSet.readBuffByTool4Idx() ";
		YCFGenKbToolSetBuff buff;
		ArrayList<YCFGenKbToolSetBuff> filteredList = new ArrayList<YCFGenKbToolSetBuff>();
		YCFGenKbToolSetBuff[] buffList = readDerivedByTool4Idx( Authorization,
			ToolId4 );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a928" ) ) {
				filteredList.add( (YCFGenKbToolSetBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbToolSetBuff[0] ) );
	}

	public YCFGenKbToolSetBuff[] readBuffByTool5Idx( YCFGenKbAuthorization Authorization,
		Short ToolId5 )
	{
		final String S_ProcName = "YCFGenKbRamToolSet.readBuffByTool5Idx() ";
		YCFGenKbToolSetBuff buff;
		ArrayList<YCFGenKbToolSetBuff> filteredList = new ArrayList<YCFGenKbToolSetBuff>();
		YCFGenKbToolSetBuff[] buffList = readDerivedByTool5Idx( Authorization,
			ToolId5 );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a928" ) ) {
				filteredList.add( (YCFGenKbToolSetBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbToolSetBuff[0] ) );
	}

	public YCFGenKbToolSetBuff[] readBuffByTool6Idx( YCFGenKbAuthorization Authorization,
		Short ToolId6 )
	{
		final String S_ProcName = "YCFGenKbRamToolSet.readBuffByTool6Idx() ";
		YCFGenKbToolSetBuff buff;
		ArrayList<YCFGenKbToolSetBuff> filteredList = new ArrayList<YCFGenKbToolSetBuff>();
		YCFGenKbToolSetBuff[] buffList = readDerivedByTool6Idx( Authorization,
			ToolId6 );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a928" ) ) {
				filteredList.add( (YCFGenKbToolSetBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbToolSetBuff[0] ) );
	}

	public YCFGenKbToolSetBuff[] readBuffByTool7Idx( YCFGenKbAuthorization Authorization,
		Short ToolId7 )
	{
		final String S_ProcName = "YCFGenKbRamToolSet.readBuffByTool7Idx() ";
		YCFGenKbToolSetBuff buff;
		ArrayList<YCFGenKbToolSetBuff> filteredList = new ArrayList<YCFGenKbToolSetBuff>();
		YCFGenKbToolSetBuff[] buffList = readDerivedByTool7Idx( Authorization,
			ToolId7 );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a928" ) ) {
				filteredList.add( (YCFGenKbToolSetBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbToolSetBuff[0] ) );
	}

	public void updateToolSet( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetBuff Buff )
	{
		YCFGenKbToolSetPKey pkey = schema.getFactoryToolSet().newPKey();
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFGenKbToolSetBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateToolSet",
				"Existing record not found",
				"ToolSet",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateToolSet",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFGenKbToolSetByNameIdxKey existingKeyNameIdx = schema.getFactoryToolSet().newNameIdxKey();
		existingKeyNameIdx.setRequiredName( existing.getRequiredName() );

		YCFGenKbToolSetByNameIdxKey newKeyNameIdx = schema.getFactoryToolSet().newNameIdxKey();
		newKeyNameIdx.setRequiredName( Buff.getRequiredName() );

		YCFGenKbToolSetByTool0IdxKey existingKeyTool0Idx = schema.getFactoryToolSet().newTool0IdxKey();
		existingKeyTool0Idx.setRequiredToolId0( existing.getRequiredToolId0() );

		YCFGenKbToolSetByTool0IdxKey newKeyTool0Idx = schema.getFactoryToolSet().newTool0IdxKey();
		newKeyTool0Idx.setRequiredToolId0( Buff.getRequiredToolId0() );

		YCFGenKbToolSetByTool1IdxKey existingKeyTool1Idx = schema.getFactoryToolSet().newTool1IdxKey();
		existingKeyTool1Idx.setOptionalToolId1( existing.getOptionalToolId1() );

		YCFGenKbToolSetByTool1IdxKey newKeyTool1Idx = schema.getFactoryToolSet().newTool1IdxKey();
		newKeyTool1Idx.setOptionalToolId1( Buff.getOptionalToolId1() );

		YCFGenKbToolSetByTool2IdxKey existingKeyTool2Idx = schema.getFactoryToolSet().newTool2IdxKey();
		existingKeyTool2Idx.setOptionalToolId2( existing.getOptionalToolId2() );

		YCFGenKbToolSetByTool2IdxKey newKeyTool2Idx = schema.getFactoryToolSet().newTool2IdxKey();
		newKeyTool2Idx.setOptionalToolId2( Buff.getOptionalToolId2() );

		YCFGenKbToolSetByTool3IdxKey existingKeyTool3Idx = schema.getFactoryToolSet().newTool3IdxKey();
		existingKeyTool3Idx.setOptionalToolId3( existing.getOptionalToolId3() );

		YCFGenKbToolSetByTool3IdxKey newKeyTool3Idx = schema.getFactoryToolSet().newTool3IdxKey();
		newKeyTool3Idx.setOptionalToolId3( Buff.getOptionalToolId3() );

		YCFGenKbToolSetByTool4IdxKey existingKeyTool4Idx = schema.getFactoryToolSet().newTool4IdxKey();
		existingKeyTool4Idx.setOptionalToolId4( existing.getOptionalToolId4() );

		YCFGenKbToolSetByTool4IdxKey newKeyTool4Idx = schema.getFactoryToolSet().newTool4IdxKey();
		newKeyTool4Idx.setOptionalToolId4( Buff.getOptionalToolId4() );

		YCFGenKbToolSetByTool5IdxKey existingKeyTool5Idx = schema.getFactoryToolSet().newTool5IdxKey();
		existingKeyTool5Idx.setOptionalToolId5( existing.getOptionalToolId5() );

		YCFGenKbToolSetByTool5IdxKey newKeyTool5Idx = schema.getFactoryToolSet().newTool5IdxKey();
		newKeyTool5Idx.setOptionalToolId5( Buff.getOptionalToolId5() );

		YCFGenKbToolSetByTool6IdxKey existingKeyTool6Idx = schema.getFactoryToolSet().newTool6IdxKey();
		existingKeyTool6Idx.setOptionalToolId6( existing.getOptionalToolId6() );

		YCFGenKbToolSetByTool6IdxKey newKeyTool6Idx = schema.getFactoryToolSet().newTool6IdxKey();
		newKeyTool6Idx.setOptionalToolId6( Buff.getOptionalToolId6() );

		YCFGenKbToolSetByTool7IdxKey existingKeyTool7Idx = schema.getFactoryToolSet().newTool7IdxKey();
		existingKeyTool7Idx.setOptionalToolId7( existing.getOptionalToolId7() );

		YCFGenKbToolSetByTool7IdxKey newKeyTool7Idx = schema.getFactoryToolSet().newTool7IdxKey();
		newKeyTool7Idx.setOptionalToolId7( Buff.getOptionalToolId7() );

		// Check unique indexes

		if( ! existingKeyNameIdx.equals( newKeyNameIdx ) ) {
			if( dictByNameIdx.containsKey( newKeyNameIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateToolSet",
					"ToolSetName",
					newKeyNameIdx );
			}
		}

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableTool().readDerivedByIdIdx( Authorization,
						Buff.getRequiredToolId0() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateToolSet",
						"Lookup",
						"Tool0",
						"Tool",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		dictByNameIdx.remove( existingKeyNameIdx );
		dictByNameIdx.put( newKeyNameIdx, Buff );

		subdict = dictByTool0Idx.get( existingKeyTool0Idx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByTool0Idx.containsKey( newKeyTool0Idx ) ) {
			subdict = dictByTool0Idx.get( newKeyTool0Idx );
		}
		else {
			subdict = new HashMap< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff >();
			dictByTool0Idx.put( newKeyTool0Idx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByTool1Idx.get( existingKeyTool1Idx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByTool1Idx.containsKey( newKeyTool1Idx ) ) {
			subdict = dictByTool1Idx.get( newKeyTool1Idx );
		}
		else {
			subdict = new HashMap< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff >();
			dictByTool1Idx.put( newKeyTool1Idx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByTool2Idx.get( existingKeyTool2Idx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByTool2Idx.containsKey( newKeyTool2Idx ) ) {
			subdict = dictByTool2Idx.get( newKeyTool2Idx );
		}
		else {
			subdict = new HashMap< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff >();
			dictByTool2Idx.put( newKeyTool2Idx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByTool3Idx.get( existingKeyTool3Idx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByTool3Idx.containsKey( newKeyTool3Idx ) ) {
			subdict = dictByTool3Idx.get( newKeyTool3Idx );
		}
		else {
			subdict = new HashMap< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff >();
			dictByTool3Idx.put( newKeyTool3Idx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByTool4Idx.get( existingKeyTool4Idx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByTool4Idx.containsKey( newKeyTool4Idx ) ) {
			subdict = dictByTool4Idx.get( newKeyTool4Idx );
		}
		else {
			subdict = new HashMap< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff >();
			dictByTool4Idx.put( newKeyTool4Idx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByTool5Idx.get( existingKeyTool5Idx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByTool5Idx.containsKey( newKeyTool5Idx ) ) {
			subdict = dictByTool5Idx.get( newKeyTool5Idx );
		}
		else {
			subdict = new HashMap< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff >();
			dictByTool5Idx.put( newKeyTool5Idx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByTool6Idx.get( existingKeyTool6Idx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByTool6Idx.containsKey( newKeyTool6Idx ) ) {
			subdict = dictByTool6Idx.get( newKeyTool6Idx );
		}
		else {
			subdict = new HashMap< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff >();
			dictByTool6Idx.put( newKeyTool6Idx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByTool7Idx.get( existingKeyTool7Idx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByTool7Idx.containsKey( newKeyTool7Idx ) ) {
			subdict = dictByTool7Idx.get( newKeyTool7Idx );
		}
		else {
			subdict = new HashMap< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff >();
			dictByTool7Idx.put( newKeyTool7Idx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteToolSet( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamToolSetTable.deleteToolSet() ";
		String classCode;
		YCFGenKbToolSetPKey pkey = schema.getFactoryToolSet().newPKey();
		pkey.setRequiredId( Buff.getRequiredId() );
		YCFGenKbToolSetBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteToolSet",
				pkey );
		}
		YCFGenKbToolSetByNameIdxKey keyNameIdx = schema.getFactoryToolSet().newNameIdxKey();
		keyNameIdx.setRequiredName( existing.getRequiredName() );

		YCFGenKbToolSetByTool0IdxKey keyTool0Idx = schema.getFactoryToolSet().newTool0IdxKey();
		keyTool0Idx.setRequiredToolId0( existing.getRequiredToolId0() );

		YCFGenKbToolSetByTool1IdxKey keyTool1Idx = schema.getFactoryToolSet().newTool1IdxKey();
		keyTool1Idx.setOptionalToolId1( existing.getOptionalToolId1() );

		YCFGenKbToolSetByTool2IdxKey keyTool2Idx = schema.getFactoryToolSet().newTool2IdxKey();
		keyTool2Idx.setOptionalToolId2( existing.getOptionalToolId2() );

		YCFGenKbToolSetByTool3IdxKey keyTool3Idx = schema.getFactoryToolSet().newTool3IdxKey();
		keyTool3Idx.setOptionalToolId3( existing.getOptionalToolId3() );

		YCFGenKbToolSetByTool4IdxKey keyTool4Idx = schema.getFactoryToolSet().newTool4IdxKey();
		keyTool4Idx.setOptionalToolId4( existing.getOptionalToolId4() );

		YCFGenKbToolSetByTool5IdxKey keyTool5Idx = schema.getFactoryToolSet().newTool5IdxKey();
		keyTool5Idx.setOptionalToolId5( existing.getOptionalToolId5() );

		YCFGenKbToolSetByTool6IdxKey keyTool6Idx = schema.getFactoryToolSet().newTool6IdxKey();
		keyTool6Idx.setOptionalToolId6( existing.getOptionalToolId6() );

		YCFGenKbToolSetByTool7IdxKey keyTool7Idx = schema.getFactoryToolSet().newTool7IdxKey();
		keyTool7Idx.setOptionalToolId7( existing.getOptionalToolId7() );

		// Validate reverse foreign keys

		if( schema.getTableGenItem().readDerivedByToolSetIdx( Authorization,
					existing.getRequiredId() ).length > 0 )
		{
			throw new YCFLibDependentsDetectedException( getClass(),
				"deleteToolSet",
				"Lookup",
				"ToolSet",
				"GenItem",
				pkey );
		}

		// Delete is valid
		Map< YCFGenKbToolSetPKey, YCFGenKbToolSetBuff > subdict;

		dictByPKey.remove( pkey );

		dictByNameIdx.remove( keyNameIdx );

		subdict = dictByTool0Idx.get( keyTool0Idx );
		subdict.remove( pkey );

		subdict = dictByTool1Idx.get( keyTool1Idx );
		subdict.remove( pkey );

		subdict = dictByTool2Idx.get( keyTool2Idx );
		subdict.remove( pkey );

		subdict = dictByTool3Idx.get( keyTool3Idx );
		subdict.remove( pkey );

		subdict = dictByTool4Idx.get( keyTool4Idx );
		subdict.remove( pkey );

		subdict = dictByTool5Idx.get( keyTool5Idx );
		subdict.remove( pkey );

		subdict = dictByTool6Idx.get( keyTool6Idx );
		subdict.remove( pkey );

		subdict = dictByTool7Idx.get( keyTool7Idx );
		subdict.remove( pkey );

	}
	public void deleteToolSetByIdIdx( YCFGenKbAuthorization Authorization,
		short argId )
	{
		YCFGenKbToolSetPKey key = schema.getFactoryToolSet().newPKey();
		key.setRequiredId( argId );
		deleteToolSetByIdIdx( Authorization, key );
	}

	public void deleteToolSetByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbToolSetBuff cur;
		LinkedList<YCFGenKbToolSetBuff> matchSet = new LinkedList<YCFGenKbToolSetBuff>();
		Iterator<YCFGenKbToolSetBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbToolSetBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableToolSet().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() );
			deleteToolSet( Authorization, cur );
		}
	}

	public void deleteToolSetByNameIdx( YCFGenKbAuthorization Authorization,
		String argName )
	{
		YCFGenKbToolSetByNameIdxKey key = schema.getFactoryToolSet().newNameIdxKey();
		key.setRequiredName( argName );
		deleteToolSetByNameIdx( Authorization, key );
	}

	public void deleteToolSetByNameIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetByNameIdxKey argKey )
	{
		YCFGenKbToolSetBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbToolSetBuff> matchSet = new LinkedList<YCFGenKbToolSetBuff>();
		Iterator<YCFGenKbToolSetBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbToolSetBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableToolSet().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() );
			deleteToolSet( Authorization, cur );
		}
	}

	public void deleteToolSetByTool0Idx( YCFGenKbAuthorization Authorization,
		short argToolId0 )
	{
		YCFGenKbToolSetByTool0IdxKey key = schema.getFactoryToolSet().newTool0IdxKey();
		key.setRequiredToolId0( argToolId0 );
		deleteToolSetByTool0Idx( Authorization, key );
	}

	public void deleteToolSetByTool0Idx( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetByTool0IdxKey argKey )
	{
		YCFGenKbToolSetBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbToolSetBuff> matchSet = new LinkedList<YCFGenKbToolSetBuff>();
		Iterator<YCFGenKbToolSetBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbToolSetBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableToolSet().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() );
			deleteToolSet( Authorization, cur );
		}
	}

	public void deleteToolSetByTool1Idx( YCFGenKbAuthorization Authorization,
		Short argToolId1 )
	{
		YCFGenKbToolSetByTool1IdxKey key = schema.getFactoryToolSet().newTool1IdxKey();
		key.setOptionalToolId1( argToolId1 );
		deleteToolSetByTool1Idx( Authorization, key );
	}

	public void deleteToolSetByTool1Idx( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetByTool1IdxKey argKey )
	{
		YCFGenKbToolSetBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalToolId1() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbToolSetBuff> matchSet = new LinkedList<YCFGenKbToolSetBuff>();
		Iterator<YCFGenKbToolSetBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbToolSetBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableToolSet().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() );
			deleteToolSet( Authorization, cur );
		}
	}

	public void deleteToolSetByTool2Idx( YCFGenKbAuthorization Authorization,
		Short argToolId2 )
	{
		YCFGenKbToolSetByTool2IdxKey key = schema.getFactoryToolSet().newTool2IdxKey();
		key.setOptionalToolId2( argToolId2 );
		deleteToolSetByTool2Idx( Authorization, key );
	}

	public void deleteToolSetByTool2Idx( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetByTool2IdxKey argKey )
	{
		YCFGenKbToolSetBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalToolId2() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbToolSetBuff> matchSet = new LinkedList<YCFGenKbToolSetBuff>();
		Iterator<YCFGenKbToolSetBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbToolSetBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableToolSet().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() );
			deleteToolSet( Authorization, cur );
		}
	}

	public void deleteToolSetByTool3Idx( YCFGenKbAuthorization Authorization,
		Short argToolId3 )
	{
		YCFGenKbToolSetByTool3IdxKey key = schema.getFactoryToolSet().newTool3IdxKey();
		key.setOptionalToolId3( argToolId3 );
		deleteToolSetByTool3Idx( Authorization, key );
	}

	public void deleteToolSetByTool3Idx( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetByTool3IdxKey argKey )
	{
		YCFGenKbToolSetBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalToolId3() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbToolSetBuff> matchSet = new LinkedList<YCFGenKbToolSetBuff>();
		Iterator<YCFGenKbToolSetBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbToolSetBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableToolSet().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() );
			deleteToolSet( Authorization, cur );
		}
	}

	public void deleteToolSetByTool4Idx( YCFGenKbAuthorization Authorization,
		Short argToolId4 )
	{
		YCFGenKbToolSetByTool4IdxKey key = schema.getFactoryToolSet().newTool4IdxKey();
		key.setOptionalToolId4( argToolId4 );
		deleteToolSetByTool4Idx( Authorization, key );
	}

	public void deleteToolSetByTool4Idx( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetByTool4IdxKey argKey )
	{
		YCFGenKbToolSetBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalToolId4() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbToolSetBuff> matchSet = new LinkedList<YCFGenKbToolSetBuff>();
		Iterator<YCFGenKbToolSetBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbToolSetBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableToolSet().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() );
			deleteToolSet( Authorization, cur );
		}
	}

	public void deleteToolSetByTool5Idx( YCFGenKbAuthorization Authorization,
		Short argToolId5 )
	{
		YCFGenKbToolSetByTool5IdxKey key = schema.getFactoryToolSet().newTool5IdxKey();
		key.setOptionalToolId5( argToolId5 );
		deleteToolSetByTool5Idx( Authorization, key );
	}

	public void deleteToolSetByTool5Idx( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetByTool5IdxKey argKey )
	{
		YCFGenKbToolSetBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalToolId5() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbToolSetBuff> matchSet = new LinkedList<YCFGenKbToolSetBuff>();
		Iterator<YCFGenKbToolSetBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbToolSetBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableToolSet().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() );
			deleteToolSet( Authorization, cur );
		}
	}

	public void deleteToolSetByTool6Idx( YCFGenKbAuthorization Authorization,
		Short argToolId6 )
	{
		YCFGenKbToolSetByTool6IdxKey key = schema.getFactoryToolSet().newTool6IdxKey();
		key.setOptionalToolId6( argToolId6 );
		deleteToolSetByTool6Idx( Authorization, key );
	}

	public void deleteToolSetByTool6Idx( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetByTool6IdxKey argKey )
	{
		YCFGenKbToolSetBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalToolId6() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbToolSetBuff> matchSet = new LinkedList<YCFGenKbToolSetBuff>();
		Iterator<YCFGenKbToolSetBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbToolSetBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableToolSet().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() );
			deleteToolSet( Authorization, cur );
		}
	}

	public void deleteToolSetByTool7Idx( YCFGenKbAuthorization Authorization,
		Short argToolId7 )
	{
		YCFGenKbToolSetByTool7IdxKey key = schema.getFactoryToolSet().newTool7IdxKey();
		key.setOptionalToolId7( argToolId7 );
		deleteToolSetByTool7Idx( Authorization, key );
	}

	public void deleteToolSetByTool7Idx( YCFGenKbAuthorization Authorization,
		YCFGenKbToolSetByTool7IdxKey argKey )
	{
		YCFGenKbToolSetBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalToolId7() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbToolSetBuff> matchSet = new LinkedList<YCFGenKbToolSetBuff>();
		Iterator<YCFGenKbToolSetBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbToolSetBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableToolSet().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() );
			deleteToolSet( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
