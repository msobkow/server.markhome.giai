
// Description: Java 11 in-memory RAM DbIO implementation for SecGroupForm.

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
 *	YCFGenKbRamSecGroupFormTable in-memory RAM DbIO implementation
 *	for SecGroupForm.
 */
public class YCFGenKbRamSecGroupFormTable
	implements IYCFGenKbSecGroupFormTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbSecGroupFormPKey,
				YCFGenKbSecGroupFormBuff > dictByPKey
		= new HashMap< YCFGenKbSecGroupFormPKey,
				YCFGenKbSecGroupFormBuff >();
	private Map< YCFGenKbSecGroupFormByClusterIdxKey,
				Map< YCFGenKbSecGroupFormPKey,
					YCFGenKbSecGroupFormBuff >> dictByClusterIdx
		= new HashMap< YCFGenKbSecGroupFormByClusterIdxKey,
				Map< YCFGenKbSecGroupFormPKey,
					YCFGenKbSecGroupFormBuff >>();
	private Map< YCFGenKbSecGroupFormByGroupIdxKey,
				Map< YCFGenKbSecGroupFormPKey,
					YCFGenKbSecGroupFormBuff >> dictByGroupIdx
		= new HashMap< YCFGenKbSecGroupFormByGroupIdxKey,
				Map< YCFGenKbSecGroupFormPKey,
					YCFGenKbSecGroupFormBuff >>();
	private Map< YCFGenKbSecGroupFormByAppIdxKey,
				Map< YCFGenKbSecGroupFormPKey,
					YCFGenKbSecGroupFormBuff >> dictByAppIdx
		= new HashMap< YCFGenKbSecGroupFormByAppIdxKey,
				Map< YCFGenKbSecGroupFormPKey,
					YCFGenKbSecGroupFormBuff >>();
	private Map< YCFGenKbSecGroupFormByFormIdxKey,
				Map< YCFGenKbSecGroupFormPKey,
					YCFGenKbSecGroupFormBuff >> dictByFormIdx
		= new HashMap< YCFGenKbSecGroupFormByFormIdxKey,
				Map< YCFGenKbSecGroupFormPKey,
					YCFGenKbSecGroupFormBuff >>();
	private Map< YCFGenKbSecGroupFormByUFormIdxKey,
			YCFGenKbSecGroupFormBuff > dictByUFormIdx
		= new HashMap< YCFGenKbSecGroupFormByUFormIdxKey,
			YCFGenKbSecGroupFormBuff >();

	public YCFGenKbRamSecGroupFormTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createSecGroupForm( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupFormBuff Buff )
	{
		final String S_ProcName = "createSecGroupForm";
		YCFGenKbSecGroupFormPKey pkey = schema.getFactorySecGroupForm().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecGroupFormId( ((YCFGenKbRamClusterTable)schema.getTableCluster()).nextSecGroupFormIdGen( Authorization,
			Buff.getRequiredClusterId() ) );
		Buff.setRequiredClusterId( pkey.getRequiredClusterId() );
		Buff.setRequiredSecGroupFormId( pkey.getRequiredSecGroupFormId() );
		YCFGenKbSecGroupFormByClusterIdxKey keyClusterIdx = schema.getFactorySecGroupForm().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFGenKbSecGroupFormByGroupIdxKey keyGroupIdx = schema.getFactorySecGroupForm().newGroupIdxKey();
		keyGroupIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyGroupIdx.setRequiredSecGroupId( Buff.getRequiredSecGroupId() );

		YCFGenKbSecGroupFormByAppIdxKey keyAppIdx = schema.getFactorySecGroupForm().newAppIdxKey();
		keyAppIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyAppIdx.setRequiredSecAppId( Buff.getRequiredSecAppId() );

		YCFGenKbSecGroupFormByFormIdxKey keyFormIdx = schema.getFactorySecGroupForm().newFormIdxKey();
		keyFormIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyFormIdx.setRequiredSecFormId( Buff.getRequiredSecFormId() );

		YCFGenKbSecGroupFormByUFormIdxKey keyUFormIdx = schema.getFactorySecGroupForm().newUFormIdxKey();
		keyUFormIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyUFormIdx.setRequiredSecGroupId( Buff.getRequiredSecGroupId() );
		keyUFormIdx.setRequiredSecFormId( Buff.getRequiredSecFormId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUFormIdx.containsKey( keyUFormIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"SecGroupFormUFormIdx",
				keyUFormIdx );
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
						"Owner",
						"SecGroupFormCluster",
						"Cluster",
						null );
				}
			}
		}

		{
			boolean allNull = true;
			allNull = false;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableSecGroup().readDerivedByIdIdx( Authorization,
						Buff.getRequiredClusterId(),
						Buff.getRequiredSecGroupId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"SecGroupFormGroup",
						"SecGroup",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFGenKbSecGroupFormPKey, YCFGenKbSecGroupFormBuff > subdictClusterIdx;
		if( dictByClusterIdx.containsKey( keyClusterIdx ) ) {
			subdictClusterIdx = dictByClusterIdx.get( keyClusterIdx );
		}
		else {
			subdictClusterIdx = new HashMap< YCFGenKbSecGroupFormPKey, YCFGenKbSecGroupFormBuff >();
			dictByClusterIdx.put( keyClusterIdx, subdictClusterIdx );
		}
		subdictClusterIdx.put( pkey, Buff );

		Map< YCFGenKbSecGroupFormPKey, YCFGenKbSecGroupFormBuff > subdictGroupIdx;
		if( dictByGroupIdx.containsKey( keyGroupIdx ) ) {
			subdictGroupIdx = dictByGroupIdx.get( keyGroupIdx );
		}
		else {
			subdictGroupIdx = new HashMap< YCFGenKbSecGroupFormPKey, YCFGenKbSecGroupFormBuff >();
			dictByGroupIdx.put( keyGroupIdx, subdictGroupIdx );
		}
		subdictGroupIdx.put( pkey, Buff );

		Map< YCFGenKbSecGroupFormPKey, YCFGenKbSecGroupFormBuff > subdictAppIdx;
		if( dictByAppIdx.containsKey( keyAppIdx ) ) {
			subdictAppIdx = dictByAppIdx.get( keyAppIdx );
		}
		else {
			subdictAppIdx = new HashMap< YCFGenKbSecGroupFormPKey, YCFGenKbSecGroupFormBuff >();
			dictByAppIdx.put( keyAppIdx, subdictAppIdx );
		}
		subdictAppIdx.put( pkey, Buff );

		Map< YCFGenKbSecGroupFormPKey, YCFGenKbSecGroupFormBuff > subdictFormIdx;
		if( dictByFormIdx.containsKey( keyFormIdx ) ) {
			subdictFormIdx = dictByFormIdx.get( keyFormIdx );
		}
		else {
			subdictFormIdx = new HashMap< YCFGenKbSecGroupFormPKey, YCFGenKbSecGroupFormBuff >();
			dictByFormIdx.put( keyFormIdx, subdictFormIdx );
		}
		subdictFormIdx.put( pkey, Buff );

		dictByUFormIdx.put( keyUFormIdx, Buff );

	}

	public YCFGenKbSecGroupFormBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupFormPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamSecGroupForm.readDerived";
		YCFGenKbSecGroupFormPKey key = schema.getFactorySecGroupForm().newPKey();
		key.setRequiredClusterId( PKey.getRequiredClusterId() );
		key.setRequiredSecGroupFormId( PKey.getRequiredSecGroupFormId() );
		YCFGenKbSecGroupFormBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecGroupFormBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupFormPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamSecGroupForm.readDerived";
		YCFGenKbSecGroupFormPKey key = schema.getFactorySecGroupForm().newPKey();
		key.setRequiredClusterId( PKey.getRequiredClusterId() );
		key.setRequiredSecGroupFormId( PKey.getRequiredSecGroupFormId() );
		YCFGenKbSecGroupFormBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecGroupFormBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamSecGroupForm.readAllDerived";
		YCFGenKbSecGroupFormBuff[] retList = new YCFGenKbSecGroupFormBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbSecGroupFormBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbSecGroupFormBuff[] readDerivedByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFGenKbRamSecGroupForm.readDerivedByClusterIdx";
		YCFGenKbSecGroupFormByClusterIdxKey key = schema.getFactorySecGroupForm().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );

		YCFGenKbSecGroupFormBuff[] recArray;
		if( dictByClusterIdx.containsKey( key ) ) {
			Map< YCFGenKbSecGroupFormPKey, YCFGenKbSecGroupFormBuff > subdictClusterIdx
				= dictByClusterIdx.get( key );
			recArray = new YCFGenKbSecGroupFormBuff[ subdictClusterIdx.size() ];
			Iterator< YCFGenKbSecGroupFormBuff > iter = subdictClusterIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbSecGroupFormPKey, YCFGenKbSecGroupFormBuff > subdictClusterIdx
				= new HashMap< YCFGenKbSecGroupFormPKey, YCFGenKbSecGroupFormBuff >();
			dictByClusterIdx.put( key, subdictClusterIdx );
			recArray = new YCFGenKbSecGroupFormBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbSecGroupFormBuff[] readDerivedByGroupIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecGroupId )
	{
		final String S_ProcName = "YCFGenKbRamSecGroupForm.readDerivedByGroupIdx";
		YCFGenKbSecGroupFormByGroupIdxKey key = schema.getFactorySecGroupForm().newGroupIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );

		YCFGenKbSecGroupFormBuff[] recArray;
		if( dictByGroupIdx.containsKey( key ) ) {
			Map< YCFGenKbSecGroupFormPKey, YCFGenKbSecGroupFormBuff > subdictGroupIdx
				= dictByGroupIdx.get( key );
			recArray = new YCFGenKbSecGroupFormBuff[ subdictGroupIdx.size() ];
			Iterator< YCFGenKbSecGroupFormBuff > iter = subdictGroupIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbSecGroupFormPKey, YCFGenKbSecGroupFormBuff > subdictGroupIdx
				= new HashMap< YCFGenKbSecGroupFormPKey, YCFGenKbSecGroupFormBuff >();
			dictByGroupIdx.put( key, subdictGroupIdx );
			recArray = new YCFGenKbSecGroupFormBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbSecGroupFormBuff[] readDerivedByAppIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecAppId )
	{
		final String S_ProcName = "YCFGenKbRamSecGroupForm.readDerivedByAppIdx";
		YCFGenKbSecGroupFormByAppIdxKey key = schema.getFactorySecGroupForm().newAppIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );

		YCFGenKbSecGroupFormBuff[] recArray;
		if( dictByAppIdx.containsKey( key ) ) {
			Map< YCFGenKbSecGroupFormPKey, YCFGenKbSecGroupFormBuff > subdictAppIdx
				= dictByAppIdx.get( key );
			recArray = new YCFGenKbSecGroupFormBuff[ subdictAppIdx.size() ];
			Iterator< YCFGenKbSecGroupFormBuff > iter = subdictAppIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbSecGroupFormPKey, YCFGenKbSecGroupFormBuff > subdictAppIdx
				= new HashMap< YCFGenKbSecGroupFormPKey, YCFGenKbSecGroupFormBuff >();
			dictByAppIdx.put( key, subdictAppIdx );
			recArray = new YCFGenKbSecGroupFormBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbSecGroupFormBuff[] readDerivedByFormIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecFormId )
	{
		final String S_ProcName = "YCFGenKbRamSecGroupForm.readDerivedByFormIdx";
		YCFGenKbSecGroupFormByFormIdxKey key = schema.getFactorySecGroupForm().newFormIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecFormId( SecFormId );

		YCFGenKbSecGroupFormBuff[] recArray;
		if( dictByFormIdx.containsKey( key ) ) {
			Map< YCFGenKbSecGroupFormPKey, YCFGenKbSecGroupFormBuff > subdictFormIdx
				= dictByFormIdx.get( key );
			recArray = new YCFGenKbSecGroupFormBuff[ subdictFormIdx.size() ];
			Iterator< YCFGenKbSecGroupFormBuff > iter = subdictFormIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbSecGroupFormPKey, YCFGenKbSecGroupFormBuff > subdictFormIdx
				= new HashMap< YCFGenKbSecGroupFormPKey, YCFGenKbSecGroupFormBuff >();
			dictByFormIdx.put( key, subdictFormIdx );
			recArray = new YCFGenKbSecGroupFormBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbSecGroupFormBuff readDerivedByUFormIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecGroupId,
		int SecFormId )
	{
		final String S_ProcName = "YCFGenKbRamSecGroupForm.readDerivedByUFormIdx";
		YCFGenKbSecGroupFormByUFormIdxKey key = schema.getFactorySecGroupForm().newUFormIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupId( SecGroupId );
		key.setRequiredSecFormId( SecFormId );

		YCFGenKbSecGroupFormBuff buff;
		if( dictByUFormIdx.containsKey( key ) ) {
			buff = dictByUFormIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecGroupFormBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		long SecGroupFormId )
	{
		final String S_ProcName = "YCFGenKbRamSecGroupForm.readDerivedByIdIdx() ";
		YCFGenKbSecGroupFormPKey key = schema.getFactorySecGroupForm().newPKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecGroupFormId( SecGroupFormId );

		YCFGenKbSecGroupFormBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecGroupFormBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupFormPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamSecGroupForm.readBuff";
		YCFGenKbSecGroupFormBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a90a" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecGroupFormBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupFormPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbSecGroupFormBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a90a" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecGroupFormBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamSecGroupForm.readAllBuff";
		YCFGenKbSecGroupFormBuff buff;
		ArrayList<YCFGenKbSecGroupFormBuff> filteredList = new ArrayList<YCFGenKbSecGroupFormBuff>();
		YCFGenKbSecGroupFormBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a90a" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSecGroupFormBuff[0] ) );
	}

	/**
	 *	Read a page of all the specific SecGroupForm buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecGroupForm instances in the database accessible for the Authorization.
	 */
	public YCFGenKbSecGroupFormBuff[] pageAllBuff( YCFGenKbAuthorization Authorization,
		Long priorClusterId,
		Long priorSecGroupFormId )
	{
		final String S_ProcName = "pageAllBuff";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public YCFGenKbSecGroupFormBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		long SecGroupFormId )
	{
		final String S_ProcName = "YCFGenKbRamSecGroupForm.readBuffByIdIdx() ";
		YCFGenKbSecGroupFormBuff buff = readDerivedByIdIdx( Authorization,
			ClusterId,
			SecGroupFormId );
		if( ( buff != null ) && buff.getClassCode().equals( "a90a" ) ) {
			return( (YCFGenKbSecGroupFormBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbSecGroupFormBuff[] readBuffByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFGenKbRamSecGroupForm.readBuffByClusterIdx() ";
		YCFGenKbSecGroupFormBuff buff;
		ArrayList<YCFGenKbSecGroupFormBuff> filteredList = new ArrayList<YCFGenKbSecGroupFormBuff>();
		YCFGenKbSecGroupFormBuff[] buffList = readDerivedByClusterIdx( Authorization,
			ClusterId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a90a" ) ) {
				filteredList.add( (YCFGenKbSecGroupFormBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSecGroupFormBuff[0] ) );
	}

	public YCFGenKbSecGroupFormBuff[] readBuffByGroupIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecGroupId )
	{
		final String S_ProcName = "YCFGenKbRamSecGroupForm.readBuffByGroupIdx() ";
		YCFGenKbSecGroupFormBuff buff;
		ArrayList<YCFGenKbSecGroupFormBuff> filteredList = new ArrayList<YCFGenKbSecGroupFormBuff>();
		YCFGenKbSecGroupFormBuff[] buffList = readDerivedByGroupIdx( Authorization,
			ClusterId,
			SecGroupId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a90a" ) ) {
				filteredList.add( (YCFGenKbSecGroupFormBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSecGroupFormBuff[0] ) );
	}

	public YCFGenKbSecGroupFormBuff[] readBuffByAppIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecAppId )
	{
		final String S_ProcName = "YCFGenKbRamSecGroupForm.readBuffByAppIdx() ";
		YCFGenKbSecGroupFormBuff buff;
		ArrayList<YCFGenKbSecGroupFormBuff> filteredList = new ArrayList<YCFGenKbSecGroupFormBuff>();
		YCFGenKbSecGroupFormBuff[] buffList = readDerivedByAppIdx( Authorization,
			ClusterId,
			SecAppId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a90a" ) ) {
				filteredList.add( (YCFGenKbSecGroupFormBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSecGroupFormBuff[0] ) );
	}

	public YCFGenKbSecGroupFormBuff[] readBuffByFormIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecFormId )
	{
		final String S_ProcName = "YCFGenKbRamSecGroupForm.readBuffByFormIdx() ";
		YCFGenKbSecGroupFormBuff buff;
		ArrayList<YCFGenKbSecGroupFormBuff> filteredList = new ArrayList<YCFGenKbSecGroupFormBuff>();
		YCFGenKbSecGroupFormBuff[] buffList = readDerivedByFormIdx( Authorization,
			ClusterId,
			SecFormId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a90a" ) ) {
				filteredList.add( (YCFGenKbSecGroupFormBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSecGroupFormBuff[0] ) );
	}

	public YCFGenKbSecGroupFormBuff readBuffByUFormIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecGroupId,
		int SecFormId )
	{
		final String S_ProcName = "YCFGenKbRamSecGroupForm.readBuffByUFormIdx() ";
		YCFGenKbSecGroupFormBuff buff = readDerivedByUFormIdx( Authorization,
			ClusterId,
			SecGroupId,
			SecFormId );
		if( ( buff != null ) && buff.getClassCode().equals( "a90a" ) ) {
			return( (YCFGenKbSecGroupFormBuff)buff );
		}
		else {
			return( null );
		}
	}

	/**
	 *	Read a page array of the specific SecGroupForm buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbSecGroupFormBuff[] pageBuffByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		Long priorClusterId,
		Long priorSecGroupFormId )
	{
		final String S_ProcName = "pageBuffByClusterIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific SecGroupForm buffer instances identified by the duplicate key GroupIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbSecGroupFormBuff[] pageBuffByGroupIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecGroupId,
		Long priorClusterId,
		Long priorSecGroupFormId )
	{
		final String S_ProcName = "pageBuffByGroupIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific SecGroupForm buffer instances identified by the duplicate key AppIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbSecGroupFormBuff[] pageBuffByAppIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecAppId,
		Long priorClusterId,
		Long priorSecGroupFormId )
	{
		final String S_ProcName = "pageBuffByAppIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific SecGroupForm buffer instances identified by the duplicate key FormIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbSecGroupFormBuff[] pageBuffByFormIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecFormId,
		Long priorClusterId,
		Long priorSecGroupFormId )
	{
		final String S_ProcName = "pageBuffByFormIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateSecGroupForm( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupFormBuff Buff )
	{
		YCFGenKbSecGroupFormPKey pkey = schema.getFactorySecGroupForm().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecGroupFormId( Buff.getRequiredSecGroupFormId() );
		YCFGenKbSecGroupFormBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateSecGroupForm",
				"Existing record not found",
				"SecGroupForm",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateSecGroupForm",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFGenKbSecGroupFormByClusterIdxKey existingKeyClusterIdx = schema.getFactorySecGroupForm().newClusterIdxKey();
		existingKeyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFGenKbSecGroupFormByClusterIdxKey newKeyClusterIdx = schema.getFactorySecGroupForm().newClusterIdxKey();
		newKeyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFGenKbSecGroupFormByGroupIdxKey existingKeyGroupIdx = schema.getFactorySecGroupForm().newGroupIdxKey();
		existingKeyGroupIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyGroupIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );

		YCFGenKbSecGroupFormByGroupIdxKey newKeyGroupIdx = schema.getFactorySecGroupForm().newGroupIdxKey();
		newKeyGroupIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyGroupIdx.setRequiredSecGroupId( Buff.getRequiredSecGroupId() );

		YCFGenKbSecGroupFormByAppIdxKey existingKeyAppIdx = schema.getFactorySecGroupForm().newAppIdxKey();
		existingKeyAppIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyAppIdx.setRequiredSecAppId( existing.getRequiredSecAppId() );

		YCFGenKbSecGroupFormByAppIdxKey newKeyAppIdx = schema.getFactorySecGroupForm().newAppIdxKey();
		newKeyAppIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyAppIdx.setRequiredSecAppId( Buff.getRequiredSecAppId() );

		YCFGenKbSecGroupFormByFormIdxKey existingKeyFormIdx = schema.getFactorySecGroupForm().newFormIdxKey();
		existingKeyFormIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyFormIdx.setRequiredSecFormId( existing.getRequiredSecFormId() );

		YCFGenKbSecGroupFormByFormIdxKey newKeyFormIdx = schema.getFactorySecGroupForm().newFormIdxKey();
		newKeyFormIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyFormIdx.setRequiredSecFormId( Buff.getRequiredSecFormId() );

		YCFGenKbSecGroupFormByUFormIdxKey existingKeyUFormIdx = schema.getFactorySecGroupForm().newUFormIdxKey();
		existingKeyUFormIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyUFormIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );
		existingKeyUFormIdx.setRequiredSecFormId( existing.getRequiredSecFormId() );

		YCFGenKbSecGroupFormByUFormIdxKey newKeyUFormIdx = schema.getFactorySecGroupForm().newUFormIdxKey();
		newKeyUFormIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyUFormIdx.setRequiredSecGroupId( Buff.getRequiredSecGroupId() );
		newKeyUFormIdx.setRequiredSecFormId( Buff.getRequiredSecFormId() );

		// Check unique indexes

		if( ! existingKeyUFormIdx.equals( newKeyUFormIdx ) ) {
			if( dictByUFormIdx.containsKey( newKeyUFormIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateSecGroupForm",
					"SecGroupFormUFormIdx",
					newKeyUFormIdx );
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
						"updateSecGroupForm",
						"Owner",
						"SecGroupFormCluster",
						"Cluster",
						null );
				}
			}
		}

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableSecGroup().readDerivedByIdIdx( Authorization,
						Buff.getRequiredClusterId(),
						Buff.getRequiredSecGroupId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateSecGroupForm",
						"Container",
						"SecGroupFormGroup",
						"SecGroup",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFGenKbSecGroupFormPKey, YCFGenKbSecGroupFormBuff > subdict;

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
			subdict = new HashMap< YCFGenKbSecGroupFormPKey, YCFGenKbSecGroupFormBuff >();
			dictByClusterIdx.put( newKeyClusterIdx, subdict );
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
			subdict = new HashMap< YCFGenKbSecGroupFormPKey, YCFGenKbSecGroupFormBuff >();
			dictByGroupIdx.put( newKeyGroupIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByAppIdx.get( existingKeyAppIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByAppIdx.containsKey( newKeyAppIdx ) ) {
			subdict = dictByAppIdx.get( newKeyAppIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbSecGroupFormPKey, YCFGenKbSecGroupFormBuff >();
			dictByAppIdx.put( newKeyAppIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByFormIdx.get( existingKeyFormIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByFormIdx.containsKey( newKeyFormIdx ) ) {
			subdict = dictByFormIdx.get( newKeyFormIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbSecGroupFormPKey, YCFGenKbSecGroupFormBuff >();
			dictByFormIdx.put( newKeyFormIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUFormIdx.remove( existingKeyUFormIdx );
		dictByUFormIdx.put( newKeyUFormIdx, Buff );

	}

	public void deleteSecGroupForm( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupFormBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamSecGroupFormTable.deleteSecGroupForm() ";
		String classCode;
		YCFGenKbSecGroupFormPKey pkey = schema.getFactorySecGroupForm().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecGroupFormId( Buff.getRequiredSecGroupFormId() );
		YCFGenKbSecGroupFormBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteSecGroupForm",
				pkey );
		}
		YCFGenKbSecGroupFormByClusterIdxKey keyClusterIdx = schema.getFactorySecGroupForm().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFGenKbSecGroupFormByGroupIdxKey keyGroupIdx = schema.getFactorySecGroupForm().newGroupIdxKey();
		keyGroupIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyGroupIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );

		YCFGenKbSecGroupFormByAppIdxKey keyAppIdx = schema.getFactorySecGroupForm().newAppIdxKey();
		keyAppIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyAppIdx.setRequiredSecAppId( existing.getRequiredSecAppId() );

		YCFGenKbSecGroupFormByFormIdxKey keyFormIdx = schema.getFactorySecGroupForm().newFormIdxKey();
		keyFormIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyFormIdx.setRequiredSecFormId( existing.getRequiredSecFormId() );

		YCFGenKbSecGroupFormByUFormIdxKey keyUFormIdx = schema.getFactorySecGroupForm().newUFormIdxKey();
		keyUFormIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUFormIdx.setRequiredSecGroupId( existing.getRequiredSecGroupId() );
		keyUFormIdx.setRequiredSecFormId( existing.getRequiredSecFormId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFGenKbSecGroupFormPKey, YCFGenKbSecGroupFormBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByClusterIdx.get( keyClusterIdx );
		subdict.remove( pkey );

		subdict = dictByGroupIdx.get( keyGroupIdx );
		subdict.remove( pkey );

		subdict = dictByAppIdx.get( keyAppIdx );
		subdict.remove( pkey );

		subdict = dictByFormIdx.get( keyFormIdx );
		subdict.remove( pkey );

		dictByUFormIdx.remove( keyUFormIdx );

	}
	public void deleteSecGroupFormByIdIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		long argSecGroupFormId )
	{
		YCFGenKbSecGroupFormPKey key = schema.getFactorySecGroupForm().newPKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredSecGroupFormId( argSecGroupFormId );
		deleteSecGroupFormByIdIdx( Authorization, key );
	}

	public void deleteSecGroupFormByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupFormPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbSecGroupFormBuff cur;
		LinkedList<YCFGenKbSecGroupFormBuff> matchSet = new LinkedList<YCFGenKbSecGroupFormBuff>();
		Iterator<YCFGenKbSecGroupFormBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecGroupFormBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGroupForm().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGroupFormId() );
			deleteSecGroupForm( Authorization, cur );
		}
	}

	public void deleteSecGroupFormByClusterIdx( YCFGenKbAuthorization Authorization,
		long argClusterId )
	{
		YCFGenKbSecGroupFormByClusterIdxKey key = schema.getFactorySecGroupForm().newClusterIdxKey();
		key.setRequiredClusterId( argClusterId );
		deleteSecGroupFormByClusterIdx( Authorization, key );
	}

	public void deleteSecGroupFormByClusterIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupFormByClusterIdxKey argKey )
	{
		YCFGenKbSecGroupFormBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbSecGroupFormBuff> matchSet = new LinkedList<YCFGenKbSecGroupFormBuff>();
		Iterator<YCFGenKbSecGroupFormBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecGroupFormBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGroupForm().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGroupFormId() );
			deleteSecGroupForm( Authorization, cur );
		}
	}

	public void deleteSecGroupFormByGroupIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		int argSecGroupId )
	{
		YCFGenKbSecGroupFormByGroupIdxKey key = schema.getFactorySecGroupForm().newGroupIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredSecGroupId( argSecGroupId );
		deleteSecGroupFormByGroupIdx( Authorization, key );
	}

	public void deleteSecGroupFormByGroupIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupFormByGroupIdxKey argKey )
	{
		YCFGenKbSecGroupFormBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbSecGroupFormBuff> matchSet = new LinkedList<YCFGenKbSecGroupFormBuff>();
		Iterator<YCFGenKbSecGroupFormBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecGroupFormBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGroupForm().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGroupFormId() );
			deleteSecGroupForm( Authorization, cur );
		}
	}

	public void deleteSecGroupFormByAppIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		int argSecAppId )
	{
		YCFGenKbSecGroupFormByAppIdxKey key = schema.getFactorySecGroupForm().newAppIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredSecAppId( argSecAppId );
		deleteSecGroupFormByAppIdx( Authorization, key );
	}

	public void deleteSecGroupFormByAppIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupFormByAppIdxKey argKey )
	{
		YCFGenKbSecGroupFormBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbSecGroupFormBuff> matchSet = new LinkedList<YCFGenKbSecGroupFormBuff>();
		Iterator<YCFGenKbSecGroupFormBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecGroupFormBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGroupForm().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGroupFormId() );
			deleteSecGroupForm( Authorization, cur );
		}
	}

	public void deleteSecGroupFormByFormIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		int argSecFormId )
	{
		YCFGenKbSecGroupFormByFormIdxKey key = schema.getFactorySecGroupForm().newFormIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredSecFormId( argSecFormId );
		deleteSecGroupFormByFormIdx( Authorization, key );
	}

	public void deleteSecGroupFormByFormIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupFormByFormIdxKey argKey )
	{
		YCFGenKbSecGroupFormBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbSecGroupFormBuff> matchSet = new LinkedList<YCFGenKbSecGroupFormBuff>();
		Iterator<YCFGenKbSecGroupFormBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecGroupFormBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGroupForm().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGroupFormId() );
			deleteSecGroupForm( Authorization, cur );
		}
	}

	public void deleteSecGroupFormByUFormIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		int argSecGroupId,
		int argSecFormId )
	{
		YCFGenKbSecGroupFormByUFormIdxKey key = schema.getFactorySecGroupForm().newUFormIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredSecGroupId( argSecGroupId );
		key.setRequiredSecFormId( argSecFormId );
		deleteSecGroupFormByUFormIdx( Authorization, key );
	}

	public void deleteSecGroupFormByUFormIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupFormByUFormIdxKey argKey )
	{
		YCFGenKbSecGroupFormBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbSecGroupFormBuff> matchSet = new LinkedList<YCFGenKbSecGroupFormBuff>();
		Iterator<YCFGenKbSecGroupFormBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecGroupFormBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecGroupForm().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecGroupFormId() );
			deleteSecGroupForm( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
