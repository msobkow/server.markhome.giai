
// Description: Java 11 in-memory RAM DbIO implementation for SecForm.

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
 *	YCFGenKbRamSecFormTable in-memory RAM DbIO implementation
 *	for SecForm.
 */
public class YCFGenKbRamSecFormTable
	implements IYCFGenKbSecFormTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbSecFormPKey,
				YCFGenKbSecFormBuff > dictByPKey
		= new HashMap< YCFGenKbSecFormPKey,
				YCFGenKbSecFormBuff >();
	private Map< YCFGenKbSecFormByClusterIdxKey,
				Map< YCFGenKbSecFormPKey,
					YCFGenKbSecFormBuff >> dictByClusterIdx
		= new HashMap< YCFGenKbSecFormByClusterIdxKey,
				Map< YCFGenKbSecFormPKey,
					YCFGenKbSecFormBuff >>();
	private Map< YCFGenKbSecFormBySecAppIdxKey,
				Map< YCFGenKbSecFormPKey,
					YCFGenKbSecFormBuff >> dictBySecAppIdx
		= new HashMap< YCFGenKbSecFormBySecAppIdxKey,
				Map< YCFGenKbSecFormPKey,
					YCFGenKbSecFormBuff >>();
	private Map< YCFGenKbSecFormByUJEEServletIdxKey,
			YCFGenKbSecFormBuff > dictByUJEEServletIdx
		= new HashMap< YCFGenKbSecFormByUJEEServletIdxKey,
			YCFGenKbSecFormBuff >();

	public YCFGenKbRamSecFormTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createSecForm( YCFGenKbAuthorization Authorization,
		YCFGenKbSecFormBuff Buff )
	{
		final String S_ProcName = "createSecForm";
		YCFGenKbSecFormPKey pkey = schema.getFactorySecForm().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecFormId( ((YCFGenKbRamClusterTable)schema.getTableCluster()).nextSecFormIdGen( Authorization,
			Buff.getRequiredClusterId() ) );
		Buff.setRequiredClusterId( pkey.getRequiredClusterId() );
		Buff.setRequiredSecFormId( pkey.getRequiredSecFormId() );
		YCFGenKbSecFormByClusterIdxKey keyClusterIdx = schema.getFactorySecForm().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFGenKbSecFormBySecAppIdxKey keySecAppIdx = schema.getFactorySecForm().newSecAppIdxKey();
		keySecAppIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keySecAppIdx.setRequiredSecAppId( Buff.getRequiredSecAppId() );

		YCFGenKbSecFormByUJEEServletIdxKey keyUJEEServletIdx = schema.getFactorySecForm().newUJEEServletIdxKey();
		keyUJEEServletIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyUJEEServletIdx.setRequiredSecAppId( Buff.getRequiredSecAppId() );
		keyUJEEServletIdx.setRequiredJEEServletMapName( Buff.getRequiredJEEServletMapName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUJEEServletIdx.containsKey( keyUJEEServletIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"SecFormUJEEServletIdx",
				keyUJEEServletIdx );
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
						"SecFormCluster",
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
				if( null == schema.getTableSecApp().readDerivedByIdIdx( Authorization,
						Buff.getRequiredClusterId(),
						Buff.getRequiredSecAppId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"SecFormApplication",
						"SecApp",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFGenKbSecFormPKey, YCFGenKbSecFormBuff > subdictClusterIdx;
		if( dictByClusterIdx.containsKey( keyClusterIdx ) ) {
			subdictClusterIdx = dictByClusterIdx.get( keyClusterIdx );
		}
		else {
			subdictClusterIdx = new HashMap< YCFGenKbSecFormPKey, YCFGenKbSecFormBuff >();
			dictByClusterIdx.put( keyClusterIdx, subdictClusterIdx );
		}
		subdictClusterIdx.put( pkey, Buff );

		Map< YCFGenKbSecFormPKey, YCFGenKbSecFormBuff > subdictSecAppIdx;
		if( dictBySecAppIdx.containsKey( keySecAppIdx ) ) {
			subdictSecAppIdx = dictBySecAppIdx.get( keySecAppIdx );
		}
		else {
			subdictSecAppIdx = new HashMap< YCFGenKbSecFormPKey, YCFGenKbSecFormBuff >();
			dictBySecAppIdx.put( keySecAppIdx, subdictSecAppIdx );
		}
		subdictSecAppIdx.put( pkey, Buff );

		dictByUJEEServletIdx.put( keyUJEEServletIdx, Buff );

	}

	public YCFGenKbSecFormBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSecFormPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamSecForm.readDerived";
		YCFGenKbSecFormPKey key = schema.getFactorySecForm().newPKey();
		key.setRequiredClusterId( PKey.getRequiredClusterId() );
		key.setRequiredSecFormId( PKey.getRequiredSecFormId() );
		YCFGenKbSecFormBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecFormBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSecFormPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamSecForm.readDerived";
		YCFGenKbSecFormPKey key = schema.getFactorySecForm().newPKey();
		key.setRequiredClusterId( PKey.getRequiredClusterId() );
		key.setRequiredSecFormId( PKey.getRequiredSecFormId() );
		YCFGenKbSecFormBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecFormBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamSecForm.readAllDerived";
		YCFGenKbSecFormBuff[] retList = new YCFGenKbSecFormBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbSecFormBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbSecFormBuff[] readDerivedByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFGenKbRamSecForm.readDerivedByClusterIdx";
		YCFGenKbSecFormByClusterIdxKey key = schema.getFactorySecForm().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );

		YCFGenKbSecFormBuff[] recArray;
		if( dictByClusterIdx.containsKey( key ) ) {
			Map< YCFGenKbSecFormPKey, YCFGenKbSecFormBuff > subdictClusterIdx
				= dictByClusterIdx.get( key );
			recArray = new YCFGenKbSecFormBuff[ subdictClusterIdx.size() ];
			Iterator< YCFGenKbSecFormBuff > iter = subdictClusterIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbSecFormPKey, YCFGenKbSecFormBuff > subdictClusterIdx
				= new HashMap< YCFGenKbSecFormPKey, YCFGenKbSecFormBuff >();
			dictByClusterIdx.put( key, subdictClusterIdx );
			recArray = new YCFGenKbSecFormBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbSecFormBuff[] readDerivedBySecAppIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecAppId )
	{
		final String S_ProcName = "YCFGenKbRamSecForm.readDerivedBySecAppIdx";
		YCFGenKbSecFormBySecAppIdxKey key = schema.getFactorySecForm().newSecAppIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );

		YCFGenKbSecFormBuff[] recArray;
		if( dictBySecAppIdx.containsKey( key ) ) {
			Map< YCFGenKbSecFormPKey, YCFGenKbSecFormBuff > subdictSecAppIdx
				= dictBySecAppIdx.get( key );
			recArray = new YCFGenKbSecFormBuff[ subdictSecAppIdx.size() ];
			Iterator< YCFGenKbSecFormBuff > iter = subdictSecAppIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbSecFormPKey, YCFGenKbSecFormBuff > subdictSecAppIdx
				= new HashMap< YCFGenKbSecFormPKey, YCFGenKbSecFormBuff >();
			dictBySecAppIdx.put( key, subdictSecAppIdx );
			recArray = new YCFGenKbSecFormBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbSecFormBuff readDerivedByUJEEServletIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecAppId,
		String JEEServletMapName )
	{
		final String S_ProcName = "YCFGenKbRamSecForm.readDerivedByUJEEServletIdx";
		YCFGenKbSecFormByUJEEServletIdxKey key = schema.getFactorySecForm().newUJEEServletIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecAppId( SecAppId );
		key.setRequiredJEEServletMapName( JEEServletMapName );

		YCFGenKbSecFormBuff buff;
		if( dictByUJEEServletIdx.containsKey( key ) ) {
			buff = dictByUJEEServletIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecFormBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecFormId )
	{
		final String S_ProcName = "YCFGenKbRamSecForm.readDerivedByIdIdx() ";
		YCFGenKbSecFormPKey key = schema.getFactorySecForm().newPKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredSecFormId( SecFormId );

		YCFGenKbSecFormBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecFormBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSecFormPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamSecForm.readBuff";
		YCFGenKbSecFormBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a906" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecFormBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSecFormPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbSecFormBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a906" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecFormBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamSecForm.readAllBuff";
		YCFGenKbSecFormBuff buff;
		ArrayList<YCFGenKbSecFormBuff> filteredList = new ArrayList<YCFGenKbSecFormBuff>();
		YCFGenKbSecFormBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a906" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSecFormBuff[0] ) );
	}

	/**
	 *	Read a page of all the specific SecForm buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecForm instances in the database accessible for the Authorization.
	 */
	public YCFGenKbSecFormBuff[] pageAllBuff( YCFGenKbAuthorization Authorization,
		Long priorClusterId,
		Integer priorSecFormId )
	{
		final String S_ProcName = "pageAllBuff";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public YCFGenKbSecFormBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecFormId )
	{
		final String S_ProcName = "YCFGenKbRamSecForm.readBuffByIdIdx() ";
		YCFGenKbSecFormBuff buff = readDerivedByIdIdx( Authorization,
			ClusterId,
			SecFormId );
		if( ( buff != null ) && buff.getClassCode().equals( "a906" ) ) {
			return( (YCFGenKbSecFormBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbSecFormBuff[] readBuffByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId )
	{
		final String S_ProcName = "YCFGenKbRamSecForm.readBuffByClusterIdx() ";
		YCFGenKbSecFormBuff buff;
		ArrayList<YCFGenKbSecFormBuff> filteredList = new ArrayList<YCFGenKbSecFormBuff>();
		YCFGenKbSecFormBuff[] buffList = readDerivedByClusterIdx( Authorization,
			ClusterId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a906" ) ) {
				filteredList.add( (YCFGenKbSecFormBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSecFormBuff[0] ) );
	}

	public YCFGenKbSecFormBuff[] readBuffBySecAppIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecAppId )
	{
		final String S_ProcName = "YCFGenKbRamSecForm.readBuffBySecAppIdx() ";
		YCFGenKbSecFormBuff buff;
		ArrayList<YCFGenKbSecFormBuff> filteredList = new ArrayList<YCFGenKbSecFormBuff>();
		YCFGenKbSecFormBuff[] buffList = readDerivedBySecAppIdx( Authorization,
			ClusterId,
			SecAppId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a906" ) ) {
				filteredList.add( (YCFGenKbSecFormBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSecFormBuff[0] ) );
	}

	public YCFGenKbSecFormBuff readBuffByUJEEServletIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecAppId,
		String JEEServletMapName )
	{
		final String S_ProcName = "YCFGenKbRamSecForm.readBuffByUJEEServletIdx() ";
		YCFGenKbSecFormBuff buff = readDerivedByUJEEServletIdx( Authorization,
			ClusterId,
			SecAppId,
			JEEServletMapName );
		if( ( buff != null ) && buff.getClassCode().equals( "a906" ) ) {
			return( (YCFGenKbSecFormBuff)buff );
		}
		else {
			return( null );
		}
	}

	/**
	 *	Read a page array of the specific SecForm buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbSecFormBuff[] pageBuffByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		Long priorClusterId,
		Integer priorSecFormId )
	{
		final String S_ProcName = "pageBuffByClusterIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific SecForm buffer instances identified by the duplicate key SecAppIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFGenKbSecFormBuff[] pageBuffBySecAppIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecAppId,
		Long priorClusterId,
		Integer priorSecFormId )
	{
		final String S_ProcName = "pageBuffBySecAppIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateSecForm( YCFGenKbAuthorization Authorization,
		YCFGenKbSecFormBuff Buff )
	{
		YCFGenKbSecFormPKey pkey = schema.getFactorySecForm().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecFormId( Buff.getRequiredSecFormId() );
		YCFGenKbSecFormBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateSecForm",
				"Existing record not found",
				"SecForm",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateSecForm",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFGenKbSecFormByClusterIdxKey existingKeyClusterIdx = schema.getFactorySecForm().newClusterIdxKey();
		existingKeyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFGenKbSecFormByClusterIdxKey newKeyClusterIdx = schema.getFactorySecForm().newClusterIdxKey();
		newKeyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		YCFGenKbSecFormBySecAppIdxKey existingKeySecAppIdx = schema.getFactorySecForm().newSecAppIdxKey();
		existingKeySecAppIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeySecAppIdx.setRequiredSecAppId( existing.getRequiredSecAppId() );

		YCFGenKbSecFormBySecAppIdxKey newKeySecAppIdx = schema.getFactorySecForm().newSecAppIdxKey();
		newKeySecAppIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeySecAppIdx.setRequiredSecAppId( Buff.getRequiredSecAppId() );

		YCFGenKbSecFormByUJEEServletIdxKey existingKeyUJEEServletIdx = schema.getFactorySecForm().newUJEEServletIdxKey();
		existingKeyUJEEServletIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyUJEEServletIdx.setRequiredSecAppId( existing.getRequiredSecAppId() );
		existingKeyUJEEServletIdx.setRequiredJEEServletMapName( existing.getRequiredJEEServletMapName() );

		YCFGenKbSecFormByUJEEServletIdxKey newKeyUJEEServletIdx = schema.getFactorySecForm().newUJEEServletIdxKey();
		newKeyUJEEServletIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyUJEEServletIdx.setRequiredSecAppId( Buff.getRequiredSecAppId() );
		newKeyUJEEServletIdx.setRequiredJEEServletMapName( Buff.getRequiredJEEServletMapName() );

		// Check unique indexes

		if( ! existingKeyUJEEServletIdx.equals( newKeyUJEEServletIdx ) ) {
			if( dictByUJEEServletIdx.containsKey( newKeyUJEEServletIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateSecForm",
					"SecFormUJEEServletIdx",
					newKeyUJEEServletIdx );
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
						"updateSecForm",
						"Owner",
						"SecFormCluster",
						"Cluster",
						null );
				}
			}
		}

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableSecApp().readDerivedByIdIdx( Authorization,
						Buff.getRequiredClusterId(),
						Buff.getRequiredSecAppId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateSecForm",
						"Container",
						"SecFormApplication",
						"SecApp",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFGenKbSecFormPKey, YCFGenKbSecFormBuff > subdict;

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
			subdict = new HashMap< YCFGenKbSecFormPKey, YCFGenKbSecFormBuff >();
			dictByClusterIdx.put( newKeyClusterIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictBySecAppIdx.get( existingKeySecAppIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictBySecAppIdx.containsKey( newKeySecAppIdx ) ) {
			subdict = dictBySecAppIdx.get( newKeySecAppIdx );
		}
		else {
			subdict = new HashMap< YCFGenKbSecFormPKey, YCFGenKbSecFormBuff >();
			dictBySecAppIdx.put( newKeySecAppIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUJEEServletIdx.remove( existingKeyUJEEServletIdx );
		dictByUJEEServletIdx.put( newKeyUJEEServletIdx, Buff );

	}

	public void deleteSecForm( YCFGenKbAuthorization Authorization,
		YCFGenKbSecFormBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamSecFormTable.deleteSecForm() ";
		String classCode;
		YCFGenKbSecFormPKey pkey = schema.getFactorySecForm().newPKey();
		pkey.setRequiredClusterId( Buff.getRequiredClusterId() );
		pkey.setRequiredSecFormId( Buff.getRequiredSecFormId() );
		YCFGenKbSecFormBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteSecForm",
				pkey );
		}
		YCFGenKbSecFormByClusterIdxKey keyClusterIdx = schema.getFactorySecForm().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFGenKbSecFormBySecAppIdxKey keySecAppIdx = schema.getFactorySecForm().newSecAppIdxKey();
		keySecAppIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keySecAppIdx.setRequiredSecAppId( existing.getRequiredSecAppId() );

		YCFGenKbSecFormByUJEEServletIdxKey keyUJEEServletIdx = schema.getFactorySecForm().newUJEEServletIdxKey();
		keyUJEEServletIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUJEEServletIdx.setRequiredSecAppId( existing.getRequiredSecAppId() );
		keyUJEEServletIdx.setRequiredJEEServletMapName( existing.getRequiredJEEServletMapName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFGenKbSecFormPKey, YCFGenKbSecFormBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByClusterIdx.get( keyClusterIdx );
		subdict.remove( pkey );

		subdict = dictBySecAppIdx.get( keySecAppIdx );
		subdict.remove( pkey );

		dictByUJEEServletIdx.remove( keyUJEEServletIdx );

	}
	public void deleteSecFormByIdIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		int argSecFormId )
	{
		YCFGenKbSecFormPKey key = schema.getFactorySecForm().newPKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredSecFormId( argSecFormId );
		deleteSecFormByIdIdx( Authorization, key );
	}

	public void deleteSecFormByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecFormPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbSecFormBuff cur;
		LinkedList<YCFGenKbSecFormBuff> matchSet = new LinkedList<YCFGenKbSecFormBuff>();
		Iterator<YCFGenKbSecFormBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecFormBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecForm().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecFormId() );
			deleteSecForm( Authorization, cur );
		}
	}

	public void deleteSecFormByClusterIdx( YCFGenKbAuthorization Authorization,
		long argClusterId )
	{
		YCFGenKbSecFormByClusterIdxKey key = schema.getFactorySecForm().newClusterIdxKey();
		key.setRequiredClusterId( argClusterId );
		deleteSecFormByClusterIdx( Authorization, key );
	}

	public void deleteSecFormByClusterIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecFormByClusterIdxKey argKey )
	{
		YCFGenKbSecFormBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbSecFormBuff> matchSet = new LinkedList<YCFGenKbSecFormBuff>();
		Iterator<YCFGenKbSecFormBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecFormBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecForm().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecFormId() );
			deleteSecForm( Authorization, cur );
		}
	}

	public void deleteSecFormBySecAppIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		int argSecAppId )
	{
		YCFGenKbSecFormBySecAppIdxKey key = schema.getFactorySecForm().newSecAppIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredSecAppId( argSecAppId );
		deleteSecFormBySecAppIdx( Authorization, key );
	}

	public void deleteSecFormBySecAppIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecFormBySecAppIdxKey argKey )
	{
		YCFGenKbSecFormBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbSecFormBuff> matchSet = new LinkedList<YCFGenKbSecFormBuff>();
		Iterator<YCFGenKbSecFormBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecFormBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecForm().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecFormId() );
			deleteSecForm( Authorization, cur );
		}
	}

	public void deleteSecFormByUJEEServletIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		int argSecAppId,
		String argJEEServletMapName )
	{
		YCFGenKbSecFormByUJEEServletIdxKey key = schema.getFactorySecForm().newUJEEServletIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredSecAppId( argSecAppId );
		key.setRequiredJEEServletMapName( argJEEServletMapName );
		deleteSecFormByUJEEServletIdx( Authorization, key );
	}

	public void deleteSecFormByUJEEServletIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecFormByUJEEServletIdxKey argKey )
	{
		YCFGenKbSecFormBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbSecFormBuff> matchSet = new LinkedList<YCFGenKbSecFormBuff>();
		Iterator<YCFGenKbSecFormBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecFormBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecForm().readDerivedByIdIdx( Authorization,
				cur.getRequiredClusterId(),
				cur.getRequiredSecFormId() );
			deleteSecForm( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
