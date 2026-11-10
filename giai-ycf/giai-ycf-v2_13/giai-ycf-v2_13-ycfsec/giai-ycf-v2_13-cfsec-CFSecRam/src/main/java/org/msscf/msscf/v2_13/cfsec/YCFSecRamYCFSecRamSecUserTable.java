
// Description: Java 11 in-memory RAM DbIO implementation for SecUser.

/*
 *	org.mssycf.mssycf.YCFSec
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFSec 2.13 Security Services
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFSec.
 *	
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	
 *	http://www.apache.org/licenses/LICENSE-2.0
 *	
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfsec.YCFSecRam;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;

/*
 *	YCFSecRamSecUserTable in-memory RAM DbIO implementation
 *	for SecUser.
 */
public class YCFSecRamSecUserTable
	implements IYCFSecSecUserTable
{
	private IYCFSecSchema schema;
	private Map< YCFSecSecUserPKey,
				YCFSecSecUserBuff > dictByPKey
		= new HashMap< YCFSecSecUserPKey,
				YCFSecSecUserBuff >();
	private Map< YCFSecSecUserByULoginIdxKey,
			YCFSecSecUserBuff > dictByULoginIdx
		= new HashMap< YCFSecSecUserByULoginIdxKey,
			YCFSecSecUserBuff >();
	private Map< YCFSecSecUserByEMConfIdxKey,
				Map< YCFSecSecUserPKey,
					YCFSecSecUserBuff >> dictByEMConfIdx
		= new HashMap< YCFSecSecUserByEMConfIdxKey,
				Map< YCFSecSecUserPKey,
					YCFSecSecUserBuff >>();
	private Map< YCFSecSecUserByPwdResetIdxKey,
				Map< YCFSecSecUserPKey,
					YCFSecSecUserBuff >> dictByPwdResetIdx
		= new HashMap< YCFSecSecUserByPwdResetIdxKey,
				Map< YCFSecSecUserPKey,
					YCFSecSecUserBuff >>();
	private Map< YCFSecSecUserByDefDevIdxKey,
				Map< YCFSecSecUserPKey,
					YCFSecSecUserBuff >> dictByDefDevIdx
		= new HashMap< YCFSecSecUserByDefDevIdxKey,
				Map< YCFSecSecUserPKey,
					YCFSecSecUserBuff >>();

	public YCFSecRamSecUserTable( IYCFSecSchema argSchema ) {
		schema = argSchema;
	}

	public void createSecUser( YCFSecAuthorization Authorization,
		YCFSecSecUserBuff Buff )
	{
		final String S_ProcName = "createSecUser";
		YCFSecSecUserPKey pkey = schema.getFactorySecUser().newPKey();
		pkey.setRequiredSecUserId( schema.nextSecUserIdGen() );
		Buff.setRequiredSecUserId( pkey.getRequiredSecUserId() );
		YCFSecSecUserByULoginIdxKey keyULoginIdx = schema.getFactorySecUser().newULoginIdxKey();
		keyULoginIdx.setRequiredLoginId( Buff.getRequiredLoginId() );

		YCFSecSecUserByEMConfIdxKey keyEMConfIdx = schema.getFactorySecUser().newEMConfIdxKey();
		keyEMConfIdx.setOptionalEMailConfirmUuid( Buff.getOptionalEMailConfirmUuid() );

		YCFSecSecUserByPwdResetIdxKey keyPwdResetIdx = schema.getFactorySecUser().newPwdResetIdxKey();
		keyPwdResetIdx.setOptionalPasswordResetUuid( Buff.getOptionalPasswordResetUuid() );

		YCFSecSecUserByDefDevIdxKey keyDefDevIdx = schema.getFactorySecUser().newDefDevIdxKey();
		keyDefDevIdx.setOptionalDfltDevUserId( Buff.getOptionalDfltDevUserId() );
		keyDefDevIdx.setOptionalDfltDevName( Buff.getOptionalDfltDevName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByULoginIdx.containsKey( keyULoginIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"SecUserLoginIdx",
				keyULoginIdx );
		}

		// Validate foreign keys

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		dictByULoginIdx.put( keyULoginIdx, Buff );

		Map< YCFSecSecUserPKey, YCFSecSecUserBuff > subdictEMConfIdx;
		if( dictByEMConfIdx.containsKey( keyEMConfIdx ) ) {
			subdictEMConfIdx = dictByEMConfIdx.get( keyEMConfIdx );
		}
		else {
			subdictEMConfIdx = new HashMap< YCFSecSecUserPKey, YCFSecSecUserBuff >();
			dictByEMConfIdx.put( keyEMConfIdx, subdictEMConfIdx );
		}
		subdictEMConfIdx.put( pkey, Buff );

		Map< YCFSecSecUserPKey, YCFSecSecUserBuff > subdictPwdResetIdx;
		if( dictByPwdResetIdx.containsKey( keyPwdResetIdx ) ) {
			subdictPwdResetIdx = dictByPwdResetIdx.get( keyPwdResetIdx );
		}
		else {
			subdictPwdResetIdx = new HashMap< YCFSecSecUserPKey, YCFSecSecUserBuff >();
			dictByPwdResetIdx.put( keyPwdResetIdx, subdictPwdResetIdx );
		}
		subdictPwdResetIdx.put( pkey, Buff );

		Map< YCFSecSecUserPKey, YCFSecSecUserBuff > subdictDefDevIdx;
		if( dictByDefDevIdx.containsKey( keyDefDevIdx ) ) {
			subdictDefDevIdx = dictByDefDevIdx.get( keyDefDevIdx );
		}
		else {
			subdictDefDevIdx = new HashMap< YCFSecSecUserPKey, YCFSecSecUserBuff >();
			dictByDefDevIdx.put( keyDefDevIdx, subdictDefDevIdx );
		}
		subdictDefDevIdx.put( pkey, Buff );

	}

	public YCFSecSecUserBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecSecUserPKey PKey )
	{
		final String S_ProcName = "YCFSecRamSecUser.readDerived";
		YCFSecSecUserPKey key = schema.getFactorySecUser().newPKey();
		key.setRequiredSecUserId( PKey.getRequiredSecUserId() );
		YCFSecSecUserBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecUserBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecSecUserPKey PKey )
	{
		final String S_ProcName = "YCFSecRamSecUser.readDerived";
		YCFSecSecUserPKey key = schema.getFactorySecUser().newPKey();
		key.setRequiredSecUserId( PKey.getRequiredSecUserId() );
		YCFSecSecUserBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecUserBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFSecRamSecUser.readAllDerived";
		YCFSecSecUserBuff[] retList = new YCFSecSecUserBuff[ dictByPKey.values().size() ];
		Iterator< YCFSecSecUserBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFSecSecUserBuff readDerivedByULoginIdx( YCFSecAuthorization Authorization,
		String LoginId )
	{
		final String S_ProcName = "YCFSecRamSecUser.readDerivedByULoginIdx";
		YCFSecSecUserByULoginIdxKey key = schema.getFactorySecUser().newULoginIdxKey();
		key.setRequiredLoginId( LoginId );

		YCFSecSecUserBuff buff;
		if( dictByULoginIdx.containsKey( key ) ) {
			buff = dictByULoginIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecUserBuff[] readDerivedByEMConfIdx( YCFSecAuthorization Authorization,
		UUID EMailConfirmUuid )
	{
		final String S_ProcName = "YCFSecRamSecUser.readDerivedByEMConfIdx";
		YCFSecSecUserByEMConfIdxKey key = schema.getFactorySecUser().newEMConfIdxKey();
		key.setOptionalEMailConfirmUuid( EMailConfirmUuid );

		YCFSecSecUserBuff[] recArray;
		if( dictByEMConfIdx.containsKey( key ) ) {
			Map< YCFSecSecUserPKey, YCFSecSecUserBuff > subdictEMConfIdx
				= dictByEMConfIdx.get( key );
			recArray = new YCFSecSecUserBuff[ subdictEMConfIdx.size() ];
			Iterator< YCFSecSecUserBuff > iter = subdictEMConfIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecSecUserPKey, YCFSecSecUserBuff > subdictEMConfIdx
				= new HashMap< YCFSecSecUserPKey, YCFSecSecUserBuff >();
			dictByEMConfIdx.put( key, subdictEMConfIdx );
			recArray = new YCFSecSecUserBuff[0];
		}
		return( recArray );
	}

	public YCFSecSecUserBuff[] readDerivedByPwdResetIdx( YCFSecAuthorization Authorization,
		UUID PasswordResetUuid )
	{
		final String S_ProcName = "YCFSecRamSecUser.readDerivedByPwdResetIdx";
		YCFSecSecUserByPwdResetIdxKey key = schema.getFactorySecUser().newPwdResetIdxKey();
		key.setOptionalPasswordResetUuid( PasswordResetUuid );

		YCFSecSecUserBuff[] recArray;
		if( dictByPwdResetIdx.containsKey( key ) ) {
			Map< YCFSecSecUserPKey, YCFSecSecUserBuff > subdictPwdResetIdx
				= dictByPwdResetIdx.get( key );
			recArray = new YCFSecSecUserBuff[ subdictPwdResetIdx.size() ];
			Iterator< YCFSecSecUserBuff > iter = subdictPwdResetIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecSecUserPKey, YCFSecSecUserBuff > subdictPwdResetIdx
				= new HashMap< YCFSecSecUserPKey, YCFSecSecUserBuff >();
			dictByPwdResetIdx.put( key, subdictPwdResetIdx );
			recArray = new YCFSecSecUserBuff[0];
		}
		return( recArray );
	}

	public YCFSecSecUserBuff[] readDerivedByDefDevIdx( YCFSecAuthorization Authorization,
		UUID DfltDevUserId,
		String DfltDevName )
	{
		final String S_ProcName = "YCFSecRamSecUser.readDerivedByDefDevIdx";
		YCFSecSecUserByDefDevIdxKey key = schema.getFactorySecUser().newDefDevIdxKey();
		key.setOptionalDfltDevUserId( DfltDevUserId );
		key.setOptionalDfltDevName( DfltDevName );

		YCFSecSecUserBuff[] recArray;
		if( dictByDefDevIdx.containsKey( key ) ) {
			Map< YCFSecSecUserPKey, YCFSecSecUserBuff > subdictDefDevIdx
				= dictByDefDevIdx.get( key );
			recArray = new YCFSecSecUserBuff[ subdictDefDevIdx.size() ];
			Iterator< YCFSecSecUserBuff > iter = subdictDefDevIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecSecUserPKey, YCFSecSecUserBuff > subdictDefDevIdx
				= new HashMap< YCFSecSecUserPKey, YCFSecSecUserBuff >();
			dictByDefDevIdx.put( key, subdictDefDevIdx );
			recArray = new YCFSecSecUserBuff[0];
		}
		return( recArray );
	}

	public YCFSecSecUserBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		UUID SecUserId )
	{
		final String S_ProcName = "YCFSecRamSecUser.readDerivedByIdIdx() ";
		YCFSecSecUserPKey key = schema.getFactorySecUser().newPKey();
		key.setRequiredSecUserId( SecUserId );

		YCFSecSecUserBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecUserBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecSecUserPKey PKey )
	{
		final String S_ProcName = "YCFSecRamSecUser.readBuff";
		YCFSecSecUserBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a011" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecUserBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecSecUserPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFSecSecUserBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a011" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecUserBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFSecRamSecUser.readAllBuff";
		YCFSecSecUserBuff buff;
		ArrayList<YCFSecSecUserBuff> filteredList = new ArrayList<YCFSecSecUserBuff>();
		YCFSecSecUserBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a011" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFSecSecUserBuff[0] ) );
	}

	/**
	 *	Read a page of all the specific SecUser buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecUser instances in the database accessible for the Authorization.
	 */
	public YCFSecSecUserBuff[] pageAllBuff( YCFSecAuthorization Authorization,
		UUID priorSecUserId )
	{
		final String S_ProcName = "pageAllBuff";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public YCFSecSecUserBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		UUID SecUserId )
	{
		final String S_ProcName = "YCFSecRamSecUser.readBuffByIdIdx() ";
		YCFSecSecUserBuff buff = readDerivedByIdIdx( Authorization,
			SecUserId );
		if( ( buff != null ) && buff.getClassCode().equals( "a011" ) ) {
			return( (YCFSecSecUserBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecSecUserBuff readBuffByULoginIdx( YCFSecAuthorization Authorization,
		String LoginId )
	{
		final String S_ProcName = "YCFSecRamSecUser.readBuffByULoginIdx() ";
		YCFSecSecUserBuff buff = readDerivedByULoginIdx( Authorization,
			LoginId );
		if( ( buff != null ) && buff.getClassCode().equals( "a011" ) ) {
			return( (YCFSecSecUserBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecSecUserBuff[] readBuffByEMConfIdx( YCFSecAuthorization Authorization,
		UUID EMailConfirmUuid )
	{
		final String S_ProcName = "YCFSecRamSecUser.readBuffByEMConfIdx() ";
		YCFSecSecUserBuff buff;
		ArrayList<YCFSecSecUserBuff> filteredList = new ArrayList<YCFSecSecUserBuff>();
		YCFSecSecUserBuff[] buffList = readDerivedByEMConfIdx( Authorization,
			EMailConfirmUuid );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a011" ) ) {
				filteredList.add( (YCFSecSecUserBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecSecUserBuff[0] ) );
	}

	public YCFSecSecUserBuff[] readBuffByPwdResetIdx( YCFSecAuthorization Authorization,
		UUID PasswordResetUuid )
	{
		final String S_ProcName = "YCFSecRamSecUser.readBuffByPwdResetIdx() ";
		YCFSecSecUserBuff buff;
		ArrayList<YCFSecSecUserBuff> filteredList = new ArrayList<YCFSecSecUserBuff>();
		YCFSecSecUserBuff[] buffList = readDerivedByPwdResetIdx( Authorization,
			PasswordResetUuid );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a011" ) ) {
				filteredList.add( (YCFSecSecUserBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecSecUserBuff[0] ) );
	}

	public YCFSecSecUserBuff[] readBuffByDefDevIdx( YCFSecAuthorization Authorization,
		UUID DfltDevUserId,
		String DfltDevName )
	{
		final String S_ProcName = "YCFSecRamSecUser.readBuffByDefDevIdx() ";
		YCFSecSecUserBuff buff;
		ArrayList<YCFSecSecUserBuff> filteredList = new ArrayList<YCFSecSecUserBuff>();
		YCFSecSecUserBuff[] buffList = readDerivedByDefDevIdx( Authorization,
			DfltDevUserId,
			DfltDevName );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a011" ) ) {
				filteredList.add( (YCFSecSecUserBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecSecUserBuff[0] ) );
	}

	/**
	 *	Read a page array of the specific SecUser buffer instances identified by the duplicate key EMConfIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argEMailConfirmUuid	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFSecSecUserBuff[] pageBuffByEMConfIdx( YCFSecAuthorization Authorization,
		UUID EMailConfirmUuid,
		UUID priorSecUserId )
	{
		final String S_ProcName = "pageBuffByEMConfIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific SecUser buffer instances identified by the duplicate key PwdResetIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPasswordResetUuid	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFSecSecUserBuff[] pageBuffByPwdResetIdx( YCFSecAuthorization Authorization,
		UUID PasswordResetUuid,
		UUID priorSecUserId )
	{
		final String S_ProcName = "pageBuffByPwdResetIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific SecUser buffer instances identified by the duplicate key DefDevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDfltDevUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@param	argDfltDevName	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFSecSecUserBuff[] pageBuffByDefDevIdx( YCFSecAuthorization Authorization,
		UUID DfltDevUserId,
		String DfltDevName,
		UUID priorSecUserId )
	{
		final String S_ProcName = "pageBuffByDefDevIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateSecUser( YCFSecAuthorization Authorization,
		YCFSecSecUserBuff Buff )
	{
		YCFSecSecUserPKey pkey = schema.getFactorySecUser().newPKey();
		pkey.setRequiredSecUserId( Buff.getRequiredSecUserId() );
		YCFSecSecUserBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateSecUser",
				"Existing record not found",
				"SecUser",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateSecUser",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFSecSecUserByULoginIdxKey existingKeyULoginIdx = schema.getFactorySecUser().newULoginIdxKey();
		existingKeyULoginIdx.setRequiredLoginId( existing.getRequiredLoginId() );

		YCFSecSecUserByULoginIdxKey newKeyULoginIdx = schema.getFactorySecUser().newULoginIdxKey();
		newKeyULoginIdx.setRequiredLoginId( Buff.getRequiredLoginId() );

		YCFSecSecUserByEMConfIdxKey existingKeyEMConfIdx = schema.getFactorySecUser().newEMConfIdxKey();
		existingKeyEMConfIdx.setOptionalEMailConfirmUuid( existing.getOptionalEMailConfirmUuid() );

		YCFSecSecUserByEMConfIdxKey newKeyEMConfIdx = schema.getFactorySecUser().newEMConfIdxKey();
		newKeyEMConfIdx.setOptionalEMailConfirmUuid( Buff.getOptionalEMailConfirmUuid() );

		YCFSecSecUserByPwdResetIdxKey existingKeyPwdResetIdx = schema.getFactorySecUser().newPwdResetIdxKey();
		existingKeyPwdResetIdx.setOptionalPasswordResetUuid( existing.getOptionalPasswordResetUuid() );

		YCFSecSecUserByPwdResetIdxKey newKeyPwdResetIdx = schema.getFactorySecUser().newPwdResetIdxKey();
		newKeyPwdResetIdx.setOptionalPasswordResetUuid( Buff.getOptionalPasswordResetUuid() );

		YCFSecSecUserByDefDevIdxKey existingKeyDefDevIdx = schema.getFactorySecUser().newDefDevIdxKey();
		existingKeyDefDevIdx.setOptionalDfltDevUserId( existing.getOptionalDfltDevUserId() );
		existingKeyDefDevIdx.setOptionalDfltDevName( existing.getOptionalDfltDevName() );

		YCFSecSecUserByDefDevIdxKey newKeyDefDevIdx = schema.getFactorySecUser().newDefDevIdxKey();
		newKeyDefDevIdx.setOptionalDfltDevUserId( Buff.getOptionalDfltDevUserId() );
		newKeyDefDevIdx.setOptionalDfltDevName( Buff.getOptionalDfltDevName() );

		// Check unique indexes

		if( ! existingKeyULoginIdx.equals( newKeyULoginIdx ) ) {
			if( dictByULoginIdx.containsKey( newKeyULoginIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateSecUser",
					"SecUserLoginIdx",
					newKeyULoginIdx );
			}
		}

		// Validate foreign keys

		// Update is valid

		Map< YCFSecSecUserPKey, YCFSecSecUserBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		dictByULoginIdx.remove( existingKeyULoginIdx );
		dictByULoginIdx.put( newKeyULoginIdx, Buff );

		subdict = dictByEMConfIdx.get( existingKeyEMConfIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByEMConfIdx.containsKey( newKeyEMConfIdx ) ) {
			subdict = dictByEMConfIdx.get( newKeyEMConfIdx );
		}
		else {
			subdict = new HashMap< YCFSecSecUserPKey, YCFSecSecUserBuff >();
			dictByEMConfIdx.put( newKeyEMConfIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByPwdResetIdx.get( existingKeyPwdResetIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByPwdResetIdx.containsKey( newKeyPwdResetIdx ) ) {
			subdict = dictByPwdResetIdx.get( newKeyPwdResetIdx );
		}
		else {
			subdict = new HashMap< YCFSecSecUserPKey, YCFSecSecUserBuff >();
			dictByPwdResetIdx.put( newKeyPwdResetIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByDefDevIdx.get( existingKeyDefDevIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByDefDevIdx.containsKey( newKeyDefDevIdx ) ) {
			subdict = dictByDefDevIdx.get( newKeyDefDevIdx );
		}
		else {
			subdict = new HashMap< YCFSecSecUserPKey, YCFSecSecUserBuff >();
			dictByDefDevIdx.put( newKeyDefDevIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteSecUser( YCFSecAuthorization Authorization,
		YCFSecSecUserBuff Buff )
	{
		final String S_ProcName = "YCFSecRamSecUserTable.deleteSecUser() ";
		String classCode;
		YCFSecSecUserPKey pkey = schema.getFactorySecUser().newPKey();
		pkey.setRequiredSecUserId( Buff.getRequiredSecUserId() );
		YCFSecSecUserBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteSecUser",
				pkey );
		}
					{
						YCFSecSecUserBuff editBuff = schema.getTableSecUser().readDerivedByIdIdx( Authorization,
						existing.getRequiredSecUserId() );
						editBuff.setOptionalDfltDevUserId( null );
						editBuff.setOptionalDfltDevName( null );
						classCode = editBuff.getClassCode();
						if( classCode.equals( "a011" ) ) {
							schema.getTableSecUser().updateSecUser( Authorization, editBuff );
						}
						else {
							new YCFLibUnsupportedClassException( getClass(),
								S_ProcName,
								"Unrecognized ClassCode \"" + classCode + "\"" );
						}
					}
		YCFSecSecUserBuff editSubobj = schema.getTableSecUser().readDerivedByIdIdx( Authorization,
			existing.getRequiredSecUserId() );
			editSubobj.setOptionalDfltDevUserId( null );
			editSubobj.setOptionalDfltDevName( null );
		classCode = editSubobj.getClassCode();
		if( classCode.equals( "a011" ) ) {
			schema.getTableSecUser().updateSecUser( Authorization, editSubobj );
		}
		else {
			new YCFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"Unrecognized ClassCode \"" + classCode + "\"" );
		}
		existing = editSubobj;
					schema.getTableTSecGrpMemb().deleteTSecGrpMembByUserIdx( Authorization,
						existing.getRequiredSecUserId() );
					schema.getTableSecGrpMemb().deleteSecGrpMembByUserIdx( Authorization,
						existing.getRequiredSecUserId() );
					schema.getTableSecSession().deleteSecSessionBySecUserIdx( Authorization,
						existing.getRequiredSecUserId() );
					schema.getTableSecSession().deleteSecSessionBySecProxyIdx( Authorization,
						existing.getRequiredSecUserId() );
					schema.getTableSecDevice().deleteSecDeviceByUserIdx( Authorization,
						existing.getRequiredSecUserId() );
		YCFSecSecUserByULoginIdxKey keyULoginIdx = schema.getFactorySecUser().newULoginIdxKey();
		keyULoginIdx.setRequiredLoginId( existing.getRequiredLoginId() );

		YCFSecSecUserByEMConfIdxKey keyEMConfIdx = schema.getFactorySecUser().newEMConfIdxKey();
		keyEMConfIdx.setOptionalEMailConfirmUuid( existing.getOptionalEMailConfirmUuid() );

		YCFSecSecUserByPwdResetIdxKey keyPwdResetIdx = schema.getFactorySecUser().newPwdResetIdxKey();
		keyPwdResetIdx.setOptionalPasswordResetUuid( existing.getOptionalPasswordResetUuid() );

		YCFSecSecUserByDefDevIdxKey keyDefDevIdx = schema.getFactorySecUser().newDefDevIdxKey();
		keyDefDevIdx.setOptionalDfltDevUserId( existing.getOptionalDfltDevUserId() );
		keyDefDevIdx.setOptionalDfltDevName( existing.getOptionalDfltDevName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFSecSecUserPKey, YCFSecSecUserBuff > subdict;

		dictByPKey.remove( pkey );

		dictByULoginIdx.remove( keyULoginIdx );

		subdict = dictByEMConfIdx.get( keyEMConfIdx );
		subdict.remove( pkey );

		subdict = dictByPwdResetIdx.get( keyPwdResetIdx );
		subdict.remove( pkey );

		subdict = dictByDefDevIdx.get( keyDefDevIdx );
		subdict.remove( pkey );

	}
	public void deleteSecUserByIdIdx( YCFSecAuthorization Authorization,
		UUID argSecUserId )
	{
		YCFSecSecUserPKey key = schema.getFactorySecUser().newPKey();
		key.setRequiredSecUserId( argSecUserId );
		deleteSecUserByIdIdx( Authorization, key );
	}

	public void deleteSecUserByIdIdx( YCFSecAuthorization Authorization,
		YCFSecSecUserPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFSecSecUserBuff cur;
		LinkedList<YCFSecSecUserBuff> matchSet = new LinkedList<YCFSecSecUserBuff>();
		Iterator<YCFSecSecUserBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecUserBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecUser().readDerivedByIdIdx( Authorization,
				cur.getRequiredSecUserId() );
			deleteSecUser( Authorization, cur );
		}
	}

	public void deleteSecUserByULoginIdx( YCFSecAuthorization Authorization,
		String argLoginId )
	{
		YCFSecSecUserByULoginIdxKey key = schema.getFactorySecUser().newULoginIdxKey();
		key.setRequiredLoginId( argLoginId );
		deleteSecUserByULoginIdx( Authorization, key );
	}

	public void deleteSecUserByULoginIdx( YCFSecAuthorization Authorization,
		YCFSecSecUserByULoginIdxKey argKey )
	{
		YCFSecSecUserBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecSecUserBuff> matchSet = new LinkedList<YCFSecSecUserBuff>();
		Iterator<YCFSecSecUserBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecUserBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecUser().readDerivedByIdIdx( Authorization,
				cur.getRequiredSecUserId() );
			deleteSecUser( Authorization, cur );
		}
	}

	public void deleteSecUserByEMConfIdx( YCFSecAuthorization Authorization,
		UUID argEMailConfirmUuid )
	{
		YCFSecSecUserByEMConfIdxKey key = schema.getFactorySecUser().newEMConfIdxKey();
		key.setOptionalEMailConfirmUuid( argEMailConfirmUuid );
		deleteSecUserByEMConfIdx( Authorization, key );
	}

	public void deleteSecUserByEMConfIdx( YCFSecAuthorization Authorization,
		YCFSecSecUserByEMConfIdxKey argKey )
	{
		YCFSecSecUserBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalEMailConfirmUuid() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecSecUserBuff> matchSet = new LinkedList<YCFSecSecUserBuff>();
		Iterator<YCFSecSecUserBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecUserBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecUser().readDerivedByIdIdx( Authorization,
				cur.getRequiredSecUserId() );
			deleteSecUser( Authorization, cur );
		}
	}

	public void deleteSecUserByPwdResetIdx( YCFSecAuthorization Authorization,
		UUID argPasswordResetUuid )
	{
		YCFSecSecUserByPwdResetIdxKey key = schema.getFactorySecUser().newPwdResetIdxKey();
		key.setOptionalPasswordResetUuid( argPasswordResetUuid );
		deleteSecUserByPwdResetIdx( Authorization, key );
	}

	public void deleteSecUserByPwdResetIdx( YCFSecAuthorization Authorization,
		YCFSecSecUserByPwdResetIdxKey argKey )
	{
		YCFSecSecUserBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalPasswordResetUuid() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecSecUserBuff> matchSet = new LinkedList<YCFSecSecUserBuff>();
		Iterator<YCFSecSecUserBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecUserBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecUser().readDerivedByIdIdx( Authorization,
				cur.getRequiredSecUserId() );
			deleteSecUser( Authorization, cur );
		}
	}

	public void deleteSecUserByDefDevIdx( YCFSecAuthorization Authorization,
		UUID argDfltDevUserId,
		String argDfltDevName )
	{
		YCFSecSecUserByDefDevIdxKey key = schema.getFactorySecUser().newDefDevIdxKey();
		key.setOptionalDfltDevUserId( argDfltDevUserId );
		key.setOptionalDfltDevName( argDfltDevName );
		deleteSecUserByDefDevIdx( Authorization, key );
	}

	public void deleteSecUserByDefDevIdx( YCFSecAuthorization Authorization,
		YCFSecSecUserByDefDevIdxKey argKey )
	{
		YCFSecSecUserBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalDfltDevUserId() != null ) {
			anyNotNull = true;
		}
		if( argKey.getOptionalDfltDevName() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecSecUserBuff> matchSet = new LinkedList<YCFSecSecUserBuff>();
		Iterator<YCFSecSecUserBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecUserBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecUser().readDerivedByIdIdx( Authorization,
				cur.getRequiredSecUserId() );
			deleteSecUser( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
