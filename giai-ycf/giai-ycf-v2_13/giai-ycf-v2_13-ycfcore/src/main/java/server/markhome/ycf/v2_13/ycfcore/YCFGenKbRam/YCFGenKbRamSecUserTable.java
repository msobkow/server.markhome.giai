
// Description: Java 11 in-memory RAM DbIO implementation for SecUser.

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
 *	YCFGenKbRamSecUserTable in-memory RAM DbIO implementation
 *	for SecUser.
 */
public class YCFGenKbRamSecUserTable
	implements IYCFGenKbSecUserTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbSecUserPKey,
				YCFGenKbSecUserBuff > dictByPKey
		= new HashMap< YCFGenKbSecUserPKey,
				YCFGenKbSecUserBuff >();
	private Map< YCFGenKbSecUserByULoginIdxKey,
			YCFGenKbSecUserBuff > dictByULoginIdx
		= new HashMap< YCFGenKbSecUserByULoginIdxKey,
			YCFGenKbSecUserBuff >();
	private Map< YCFGenKbSecUserByEMConfIdxKey,
				Map< YCFGenKbSecUserPKey,
					YCFGenKbSecUserBuff >> dictByEMConfIdx
		= new HashMap< YCFGenKbSecUserByEMConfIdxKey,
				Map< YCFGenKbSecUserPKey,
					YCFGenKbSecUserBuff >>();
	private Map< YCFGenKbSecUserByPwdResetIdxKey,
				Map< YCFGenKbSecUserPKey,
					YCFGenKbSecUserBuff >> dictByPwdResetIdx
		= new HashMap< YCFGenKbSecUserByPwdResetIdxKey,
				Map< YCFGenKbSecUserPKey,
					YCFGenKbSecUserBuff >>();
	private Map< YCFGenKbSecUserByDefDevIdxKey,
				Map< YCFGenKbSecUserPKey,
					YCFGenKbSecUserBuff >> dictByDefDevIdx
		= new HashMap< YCFGenKbSecUserByDefDevIdxKey,
				Map< YCFGenKbSecUserPKey,
					YCFGenKbSecUserBuff >>();

	public YCFGenKbRamSecUserTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createSecUser( YCFGenKbAuthorization Authorization,
		YCFGenKbSecUserBuff Buff )
	{
		final String S_ProcName = "createSecUser";
		YCFGenKbSecUserPKey pkey = schema.getFactorySecUser().newPKey();
		pkey.setRequiredSecUserId( schema.nextSecUserIdGen() );
		Buff.setRequiredSecUserId( pkey.getRequiredSecUserId() );
		YCFGenKbSecUserByULoginIdxKey keyULoginIdx = schema.getFactorySecUser().newULoginIdxKey();
		keyULoginIdx.setRequiredLoginId( Buff.getRequiredLoginId() );

		YCFGenKbSecUserByEMConfIdxKey keyEMConfIdx = schema.getFactorySecUser().newEMConfIdxKey();
		keyEMConfIdx.setOptionalEMailConfirmUuid( Buff.getOptionalEMailConfirmUuid() );

		YCFGenKbSecUserByPwdResetIdxKey keyPwdResetIdx = schema.getFactorySecUser().newPwdResetIdxKey();
		keyPwdResetIdx.setOptionalPasswordResetUuid( Buff.getOptionalPasswordResetUuid() );

		YCFGenKbSecUserByDefDevIdxKey keyDefDevIdx = schema.getFactorySecUser().newDefDevIdxKey();
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

		Map< YCFGenKbSecUserPKey, YCFGenKbSecUserBuff > subdictEMConfIdx;
		if( dictByEMConfIdx.containsKey( keyEMConfIdx ) ) {
			subdictEMConfIdx = dictByEMConfIdx.get( keyEMConfIdx );
		}
		else {
			subdictEMConfIdx = new HashMap< YCFGenKbSecUserPKey, YCFGenKbSecUserBuff >();
			dictByEMConfIdx.put( keyEMConfIdx, subdictEMConfIdx );
		}
		subdictEMConfIdx.put( pkey, Buff );

		Map< YCFGenKbSecUserPKey, YCFGenKbSecUserBuff > subdictPwdResetIdx;
		if( dictByPwdResetIdx.containsKey( keyPwdResetIdx ) ) {
			subdictPwdResetIdx = dictByPwdResetIdx.get( keyPwdResetIdx );
		}
		else {
			subdictPwdResetIdx = new HashMap< YCFGenKbSecUserPKey, YCFGenKbSecUserBuff >();
			dictByPwdResetIdx.put( keyPwdResetIdx, subdictPwdResetIdx );
		}
		subdictPwdResetIdx.put( pkey, Buff );

		Map< YCFGenKbSecUserPKey, YCFGenKbSecUserBuff > subdictDefDevIdx;
		if( dictByDefDevIdx.containsKey( keyDefDevIdx ) ) {
			subdictDefDevIdx = dictByDefDevIdx.get( keyDefDevIdx );
		}
		else {
			subdictDefDevIdx = new HashMap< YCFGenKbSecUserPKey, YCFGenKbSecUserBuff >();
			dictByDefDevIdx.put( keyDefDevIdx, subdictDefDevIdx );
		}
		subdictDefDevIdx.put( pkey, Buff );

	}

	public YCFGenKbSecUserBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSecUserPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamSecUser.readDerived";
		YCFGenKbSecUserPKey key = schema.getFactorySecUser().newPKey();
		key.setRequiredSecUserId( PKey.getRequiredSecUserId() );
		YCFGenKbSecUserBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecUserBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSecUserPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamSecUser.readDerived";
		YCFGenKbSecUserPKey key = schema.getFactorySecUser().newPKey();
		key.setRequiredSecUserId( PKey.getRequiredSecUserId() );
		YCFGenKbSecUserBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecUserBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamSecUser.readAllDerived";
		YCFGenKbSecUserBuff[] retList = new YCFGenKbSecUserBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbSecUserBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbSecUserBuff readDerivedByULoginIdx( YCFGenKbAuthorization Authorization,
		String LoginId )
	{
		final String S_ProcName = "YCFGenKbRamSecUser.readDerivedByULoginIdx";
		YCFGenKbSecUserByULoginIdxKey key = schema.getFactorySecUser().newULoginIdxKey();
		key.setRequiredLoginId( LoginId );

		YCFGenKbSecUserBuff buff;
		if( dictByULoginIdx.containsKey( key ) ) {
			buff = dictByULoginIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecUserBuff[] readDerivedByEMConfIdx( YCFGenKbAuthorization Authorization,
		UUID EMailConfirmUuid )
	{
		final String S_ProcName = "YCFGenKbRamSecUser.readDerivedByEMConfIdx";
		YCFGenKbSecUserByEMConfIdxKey key = schema.getFactorySecUser().newEMConfIdxKey();
		key.setOptionalEMailConfirmUuid( EMailConfirmUuid );

		YCFGenKbSecUserBuff[] recArray;
		if( dictByEMConfIdx.containsKey( key ) ) {
			Map< YCFGenKbSecUserPKey, YCFGenKbSecUserBuff > subdictEMConfIdx
				= dictByEMConfIdx.get( key );
			recArray = new YCFGenKbSecUserBuff[ subdictEMConfIdx.size() ];
			Iterator< YCFGenKbSecUserBuff > iter = subdictEMConfIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbSecUserPKey, YCFGenKbSecUserBuff > subdictEMConfIdx
				= new HashMap< YCFGenKbSecUserPKey, YCFGenKbSecUserBuff >();
			dictByEMConfIdx.put( key, subdictEMConfIdx );
			recArray = new YCFGenKbSecUserBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbSecUserBuff[] readDerivedByPwdResetIdx( YCFGenKbAuthorization Authorization,
		UUID PasswordResetUuid )
	{
		final String S_ProcName = "YCFGenKbRamSecUser.readDerivedByPwdResetIdx";
		YCFGenKbSecUserByPwdResetIdxKey key = schema.getFactorySecUser().newPwdResetIdxKey();
		key.setOptionalPasswordResetUuid( PasswordResetUuid );

		YCFGenKbSecUserBuff[] recArray;
		if( dictByPwdResetIdx.containsKey( key ) ) {
			Map< YCFGenKbSecUserPKey, YCFGenKbSecUserBuff > subdictPwdResetIdx
				= dictByPwdResetIdx.get( key );
			recArray = new YCFGenKbSecUserBuff[ subdictPwdResetIdx.size() ];
			Iterator< YCFGenKbSecUserBuff > iter = subdictPwdResetIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbSecUserPKey, YCFGenKbSecUserBuff > subdictPwdResetIdx
				= new HashMap< YCFGenKbSecUserPKey, YCFGenKbSecUserBuff >();
			dictByPwdResetIdx.put( key, subdictPwdResetIdx );
			recArray = new YCFGenKbSecUserBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbSecUserBuff[] readDerivedByDefDevIdx( YCFGenKbAuthorization Authorization,
		UUID DfltDevUserId,
		String DfltDevName )
	{
		final String S_ProcName = "YCFGenKbRamSecUser.readDerivedByDefDevIdx";
		YCFGenKbSecUserByDefDevIdxKey key = schema.getFactorySecUser().newDefDevIdxKey();
		key.setOptionalDfltDevUserId( DfltDevUserId );
		key.setOptionalDfltDevName( DfltDevName );

		YCFGenKbSecUserBuff[] recArray;
		if( dictByDefDevIdx.containsKey( key ) ) {
			Map< YCFGenKbSecUserPKey, YCFGenKbSecUserBuff > subdictDefDevIdx
				= dictByDefDevIdx.get( key );
			recArray = new YCFGenKbSecUserBuff[ subdictDefDevIdx.size() ];
			Iterator< YCFGenKbSecUserBuff > iter = subdictDefDevIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbSecUserPKey, YCFGenKbSecUserBuff > subdictDefDevIdx
				= new HashMap< YCFGenKbSecUserPKey, YCFGenKbSecUserBuff >();
			dictByDefDevIdx.put( key, subdictDefDevIdx );
			recArray = new YCFGenKbSecUserBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbSecUserBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
		UUID SecUserId )
	{
		final String S_ProcName = "YCFGenKbRamSecUser.readDerivedByIdIdx() ";
		YCFGenKbSecUserPKey key = schema.getFactorySecUser().newPKey();
		key.setRequiredSecUserId( SecUserId );

		YCFGenKbSecUserBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecUserBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSecUserPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamSecUser.readBuff";
		YCFGenKbSecUserBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a90e" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecUserBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSecUserPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbSecUserBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a90e" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecUserBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamSecUser.readAllBuff";
		YCFGenKbSecUserBuff buff;
		ArrayList<YCFGenKbSecUserBuff> filteredList = new ArrayList<YCFGenKbSecUserBuff>();
		YCFGenKbSecUserBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a90e" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSecUserBuff[0] ) );
	}

	/**
	 *	Read a page of all the specific SecUser buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecUser instances in the database accessible for the Authorization.
	 */
	public YCFGenKbSecUserBuff[] pageAllBuff( YCFGenKbAuthorization Authorization,
		UUID priorSecUserId )
	{
		final String S_ProcName = "pageAllBuff";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public YCFGenKbSecUserBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
		UUID SecUserId )
	{
		final String S_ProcName = "YCFGenKbRamSecUser.readBuffByIdIdx() ";
		YCFGenKbSecUserBuff buff = readDerivedByIdIdx( Authorization,
			SecUserId );
		if( ( buff != null ) && buff.getClassCode().equals( "a90e" ) ) {
			return( (YCFGenKbSecUserBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbSecUserBuff readBuffByULoginIdx( YCFGenKbAuthorization Authorization,
		String LoginId )
	{
		final String S_ProcName = "YCFGenKbRamSecUser.readBuffByULoginIdx() ";
		YCFGenKbSecUserBuff buff = readDerivedByULoginIdx( Authorization,
			LoginId );
		if( ( buff != null ) && buff.getClassCode().equals( "a90e" ) ) {
			return( (YCFGenKbSecUserBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbSecUserBuff[] readBuffByEMConfIdx( YCFGenKbAuthorization Authorization,
		UUID EMailConfirmUuid )
	{
		final String S_ProcName = "YCFGenKbRamSecUser.readBuffByEMConfIdx() ";
		YCFGenKbSecUserBuff buff;
		ArrayList<YCFGenKbSecUserBuff> filteredList = new ArrayList<YCFGenKbSecUserBuff>();
		YCFGenKbSecUserBuff[] buffList = readDerivedByEMConfIdx( Authorization,
			EMailConfirmUuid );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a90e" ) ) {
				filteredList.add( (YCFGenKbSecUserBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSecUserBuff[0] ) );
	}

	public YCFGenKbSecUserBuff[] readBuffByPwdResetIdx( YCFGenKbAuthorization Authorization,
		UUID PasswordResetUuid )
	{
		final String S_ProcName = "YCFGenKbRamSecUser.readBuffByPwdResetIdx() ";
		YCFGenKbSecUserBuff buff;
		ArrayList<YCFGenKbSecUserBuff> filteredList = new ArrayList<YCFGenKbSecUserBuff>();
		YCFGenKbSecUserBuff[] buffList = readDerivedByPwdResetIdx( Authorization,
			PasswordResetUuid );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a90e" ) ) {
				filteredList.add( (YCFGenKbSecUserBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSecUserBuff[0] ) );
	}

	public YCFGenKbSecUserBuff[] readBuffByDefDevIdx( YCFGenKbAuthorization Authorization,
		UUID DfltDevUserId,
		String DfltDevName )
	{
		final String S_ProcName = "YCFGenKbRamSecUser.readBuffByDefDevIdx() ";
		YCFGenKbSecUserBuff buff;
		ArrayList<YCFGenKbSecUserBuff> filteredList = new ArrayList<YCFGenKbSecUserBuff>();
		YCFGenKbSecUserBuff[] buffList = readDerivedByDefDevIdx( Authorization,
			DfltDevUserId,
			DfltDevName );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a90e" ) ) {
				filteredList.add( (YCFGenKbSecUserBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSecUserBuff[0] ) );
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
	public YCFGenKbSecUserBuff[] pageBuffByEMConfIdx( YCFGenKbAuthorization Authorization,
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
	public YCFGenKbSecUserBuff[] pageBuffByPwdResetIdx( YCFGenKbAuthorization Authorization,
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
	public YCFGenKbSecUserBuff[] pageBuffByDefDevIdx( YCFGenKbAuthorization Authorization,
		UUID DfltDevUserId,
		String DfltDevName,
		UUID priorSecUserId )
	{
		final String S_ProcName = "pageBuffByDefDevIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateSecUser( YCFGenKbAuthorization Authorization,
		YCFGenKbSecUserBuff Buff )
	{
		YCFGenKbSecUserPKey pkey = schema.getFactorySecUser().newPKey();
		pkey.setRequiredSecUserId( Buff.getRequiredSecUserId() );
		YCFGenKbSecUserBuff existing = dictByPKey.get( pkey );
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
		YCFGenKbSecUserByULoginIdxKey existingKeyULoginIdx = schema.getFactorySecUser().newULoginIdxKey();
		existingKeyULoginIdx.setRequiredLoginId( existing.getRequiredLoginId() );

		YCFGenKbSecUserByULoginIdxKey newKeyULoginIdx = schema.getFactorySecUser().newULoginIdxKey();
		newKeyULoginIdx.setRequiredLoginId( Buff.getRequiredLoginId() );

		YCFGenKbSecUserByEMConfIdxKey existingKeyEMConfIdx = schema.getFactorySecUser().newEMConfIdxKey();
		existingKeyEMConfIdx.setOptionalEMailConfirmUuid( existing.getOptionalEMailConfirmUuid() );

		YCFGenKbSecUserByEMConfIdxKey newKeyEMConfIdx = schema.getFactorySecUser().newEMConfIdxKey();
		newKeyEMConfIdx.setOptionalEMailConfirmUuid( Buff.getOptionalEMailConfirmUuid() );

		YCFGenKbSecUserByPwdResetIdxKey existingKeyPwdResetIdx = schema.getFactorySecUser().newPwdResetIdxKey();
		existingKeyPwdResetIdx.setOptionalPasswordResetUuid( existing.getOptionalPasswordResetUuid() );

		YCFGenKbSecUserByPwdResetIdxKey newKeyPwdResetIdx = schema.getFactorySecUser().newPwdResetIdxKey();
		newKeyPwdResetIdx.setOptionalPasswordResetUuid( Buff.getOptionalPasswordResetUuid() );

		YCFGenKbSecUserByDefDevIdxKey existingKeyDefDevIdx = schema.getFactorySecUser().newDefDevIdxKey();
		existingKeyDefDevIdx.setOptionalDfltDevUserId( existing.getOptionalDfltDevUserId() );
		existingKeyDefDevIdx.setOptionalDfltDevName( existing.getOptionalDfltDevName() );

		YCFGenKbSecUserByDefDevIdxKey newKeyDefDevIdx = schema.getFactorySecUser().newDefDevIdxKey();
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

		Map< YCFGenKbSecUserPKey, YCFGenKbSecUserBuff > subdict;

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
			subdict = new HashMap< YCFGenKbSecUserPKey, YCFGenKbSecUserBuff >();
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
			subdict = new HashMap< YCFGenKbSecUserPKey, YCFGenKbSecUserBuff >();
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
			subdict = new HashMap< YCFGenKbSecUserPKey, YCFGenKbSecUserBuff >();
			dictByDefDevIdx.put( newKeyDefDevIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteSecUser( YCFGenKbAuthorization Authorization,
		YCFGenKbSecUserBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamSecUserTable.deleteSecUser() ";
		String classCode;
		YCFGenKbSecUserPKey pkey = schema.getFactorySecUser().newPKey();
		pkey.setRequiredSecUserId( Buff.getRequiredSecUserId() );
		YCFGenKbSecUserBuff existing = dictByPKey.get( pkey );
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
						YCFGenKbSecUserBuff editBuff = schema.getTableSecUser().readDerivedByIdIdx( Authorization,
						existing.getRequiredSecUserId() );
						editBuff.setOptionalDfltDevUserId( null );
						editBuff.setOptionalDfltDevName( null );
						classCode = editBuff.getClassCode();
						if( classCode.equals( "a90e" ) ) {
							schema.getTableSecUser().updateSecUser( Authorization, editBuff );
						}
						else {
							new YCFLibUnsupportedClassException( getClass(),
								S_ProcName,
								"Unrecognized ClassCode \"" + classCode + "\"" );
						}
					}
		YCFGenKbSecUserBuff editSubobj = schema.getTableSecUser().readDerivedByIdIdx( Authorization,
			existing.getRequiredSecUserId() );
			editSubobj.setOptionalDfltDevUserId( null );
			editSubobj.setOptionalDfltDevName( null );
		classCode = editSubobj.getClassCode();
		if( classCode.equals( "a90e" ) ) {
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
		YCFGenKbSecUserByULoginIdxKey keyULoginIdx = schema.getFactorySecUser().newULoginIdxKey();
		keyULoginIdx.setRequiredLoginId( existing.getRequiredLoginId() );

		YCFGenKbSecUserByEMConfIdxKey keyEMConfIdx = schema.getFactorySecUser().newEMConfIdxKey();
		keyEMConfIdx.setOptionalEMailConfirmUuid( existing.getOptionalEMailConfirmUuid() );

		YCFGenKbSecUserByPwdResetIdxKey keyPwdResetIdx = schema.getFactorySecUser().newPwdResetIdxKey();
		keyPwdResetIdx.setOptionalPasswordResetUuid( existing.getOptionalPasswordResetUuid() );

		YCFGenKbSecUserByDefDevIdxKey keyDefDevIdx = schema.getFactorySecUser().newDefDevIdxKey();
		keyDefDevIdx.setOptionalDfltDevUserId( existing.getOptionalDfltDevUserId() );
		keyDefDevIdx.setOptionalDfltDevName( existing.getOptionalDfltDevName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFGenKbSecUserPKey, YCFGenKbSecUserBuff > subdict;

		dictByPKey.remove( pkey );

		dictByULoginIdx.remove( keyULoginIdx );

		subdict = dictByEMConfIdx.get( keyEMConfIdx );
		subdict.remove( pkey );

		subdict = dictByPwdResetIdx.get( keyPwdResetIdx );
		subdict.remove( pkey );

		subdict = dictByDefDevIdx.get( keyDefDevIdx );
		subdict.remove( pkey );

	}
	public void deleteSecUserByIdIdx( YCFGenKbAuthorization Authorization,
		UUID argSecUserId )
	{
		YCFGenKbSecUserPKey key = schema.getFactorySecUser().newPKey();
		key.setRequiredSecUserId( argSecUserId );
		deleteSecUserByIdIdx( Authorization, key );
	}

	public void deleteSecUserByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecUserPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbSecUserBuff cur;
		LinkedList<YCFGenKbSecUserBuff> matchSet = new LinkedList<YCFGenKbSecUserBuff>();
		Iterator<YCFGenKbSecUserBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecUserBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecUser().readDerivedByIdIdx( Authorization,
				cur.getRequiredSecUserId() );
			deleteSecUser( Authorization, cur );
		}
	}

	public void deleteSecUserByULoginIdx( YCFGenKbAuthorization Authorization,
		String argLoginId )
	{
		YCFGenKbSecUserByULoginIdxKey key = schema.getFactorySecUser().newULoginIdxKey();
		key.setRequiredLoginId( argLoginId );
		deleteSecUserByULoginIdx( Authorization, key );
	}

	public void deleteSecUserByULoginIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecUserByULoginIdxKey argKey )
	{
		YCFGenKbSecUserBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbSecUserBuff> matchSet = new LinkedList<YCFGenKbSecUserBuff>();
		Iterator<YCFGenKbSecUserBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecUserBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecUser().readDerivedByIdIdx( Authorization,
				cur.getRequiredSecUserId() );
			deleteSecUser( Authorization, cur );
		}
	}

	public void deleteSecUserByEMConfIdx( YCFGenKbAuthorization Authorization,
		UUID argEMailConfirmUuid )
	{
		YCFGenKbSecUserByEMConfIdxKey key = schema.getFactorySecUser().newEMConfIdxKey();
		key.setOptionalEMailConfirmUuid( argEMailConfirmUuid );
		deleteSecUserByEMConfIdx( Authorization, key );
	}

	public void deleteSecUserByEMConfIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecUserByEMConfIdxKey argKey )
	{
		YCFGenKbSecUserBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalEMailConfirmUuid() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbSecUserBuff> matchSet = new LinkedList<YCFGenKbSecUserBuff>();
		Iterator<YCFGenKbSecUserBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecUserBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecUser().readDerivedByIdIdx( Authorization,
				cur.getRequiredSecUserId() );
			deleteSecUser( Authorization, cur );
		}
	}

	public void deleteSecUserByPwdResetIdx( YCFGenKbAuthorization Authorization,
		UUID argPasswordResetUuid )
	{
		YCFGenKbSecUserByPwdResetIdxKey key = schema.getFactorySecUser().newPwdResetIdxKey();
		key.setOptionalPasswordResetUuid( argPasswordResetUuid );
		deleteSecUserByPwdResetIdx( Authorization, key );
	}

	public void deleteSecUserByPwdResetIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecUserByPwdResetIdxKey argKey )
	{
		YCFGenKbSecUserBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalPasswordResetUuid() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbSecUserBuff> matchSet = new LinkedList<YCFGenKbSecUserBuff>();
		Iterator<YCFGenKbSecUserBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecUserBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecUser().readDerivedByIdIdx( Authorization,
				cur.getRequiredSecUserId() );
			deleteSecUser( Authorization, cur );
		}
	}

	public void deleteSecUserByDefDevIdx( YCFGenKbAuthorization Authorization,
		UUID argDfltDevUserId,
		String argDfltDevName )
	{
		YCFGenKbSecUserByDefDevIdxKey key = schema.getFactorySecUser().newDefDevIdxKey();
		key.setOptionalDfltDevUserId( argDfltDevUserId );
		key.setOptionalDfltDevName( argDfltDevName );
		deleteSecUserByDefDevIdx( Authorization, key );
	}

	public void deleteSecUserByDefDevIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecUserByDefDevIdxKey argKey )
	{
		YCFGenKbSecUserBuff cur;
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
		LinkedList<YCFGenKbSecUserBuff> matchSet = new LinkedList<YCFGenKbSecUserBuff>();
		Iterator<YCFGenKbSecUserBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecUserBuff> iterMatch = matchSet.iterator();
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
