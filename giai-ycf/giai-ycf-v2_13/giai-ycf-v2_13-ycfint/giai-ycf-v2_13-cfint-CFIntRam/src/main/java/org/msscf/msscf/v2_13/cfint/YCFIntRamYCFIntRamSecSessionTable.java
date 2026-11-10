
// Description: Java 11 in-memory RAM DbIO implementation for SecSession.

/*
 *	org.mssycf.mssycf.YCFInt
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

package org.mssycf.mssycf.v2_13.ycfint.YCFIntRam;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.apache.commons.codec.binary.Base64;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;

/*
 *	YCFIntRamSecSessionTable in-memory RAM DbIO implementation
 *	for SecSession.
 */
public class YCFIntRamSecSessionTable
	implements IYCFIntSecSessionTable
{
	private IYCFIntSchema schema;
	private Map< YCFSecSecSessionPKey,
				YCFSecSecSessionBuff > dictByPKey
		= new HashMap< YCFSecSecSessionPKey,
				YCFSecSecSessionBuff >();
	private Map< YCFSecSecSessionBySecUserIdxKey,
				Map< YCFSecSecSessionPKey,
					YCFSecSecSessionBuff >> dictBySecUserIdx
		= new HashMap< YCFSecSecSessionBySecUserIdxKey,
				Map< YCFSecSecSessionPKey,
					YCFSecSecSessionBuff >>();
	private Map< YCFSecSecSessionBySecDevIdxKey,
				Map< YCFSecSecSessionPKey,
					YCFSecSecSessionBuff >> dictBySecDevIdx
		= new HashMap< YCFSecSecSessionBySecDevIdxKey,
				Map< YCFSecSecSessionPKey,
					YCFSecSecSessionBuff >>();
	private Map< YCFSecSecSessionByStartIdxKey,
			YCFSecSecSessionBuff > dictByStartIdx
		= new HashMap< YCFSecSecSessionByStartIdxKey,
			YCFSecSecSessionBuff >();
	private Map< YCFSecSecSessionByFinishIdxKey,
				Map< YCFSecSecSessionPKey,
					YCFSecSecSessionBuff >> dictByFinishIdx
		= new HashMap< YCFSecSecSessionByFinishIdxKey,
				Map< YCFSecSecSessionPKey,
					YCFSecSecSessionBuff >>();
	private Map< YCFSecSecSessionBySecProxyIdxKey,
				Map< YCFSecSecSessionPKey,
					YCFSecSecSessionBuff >> dictBySecProxyIdx
		= new HashMap< YCFSecSecSessionBySecProxyIdxKey,
				Map< YCFSecSecSessionPKey,
					YCFSecSecSessionBuff >>();

	public YCFIntRamSecSessionTable( IYCFIntSchema argSchema ) {
		schema = argSchema;
	}

	public void createSecSession( YCFSecAuthorization Authorization,
		YCFSecSecSessionBuff Buff )
	{
		final String S_ProcName = "createSecSession";
		YCFSecSecSessionPKey pkey = schema.getFactorySecSession().newPKey();
		pkey.setRequiredSecSessionId( schema.nextSecSessionIdGen() );
		Buff.setRequiredSecSessionId( pkey.getRequiredSecSessionId() );
		YCFSecSecSessionBySecUserIdxKey keySecUserIdx = schema.getFactorySecSession().newSecUserIdxKey();
		keySecUserIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );

		YCFSecSecSessionBySecDevIdxKey keySecDevIdx = schema.getFactorySecSession().newSecDevIdxKey();
		keySecDevIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );
		keySecDevIdx.setOptionalSecDevName( Buff.getOptionalSecDevName() );

		YCFSecSecSessionByStartIdxKey keyStartIdx = schema.getFactorySecSession().newStartIdxKey();
		keyStartIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );
		keyStartIdx.setRequiredStart( Buff.getRequiredStart() );

		YCFSecSecSessionByFinishIdxKey keyFinishIdx = schema.getFactorySecSession().newFinishIdxKey();
		keyFinishIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );
		keyFinishIdx.setOptionalFinish( Buff.getOptionalFinish() );

		YCFSecSecSessionBySecProxyIdxKey keySecProxyIdx = schema.getFactorySecSession().newSecProxyIdxKey();
		keySecProxyIdx.setOptionalSecProxyId( Buff.getOptionalSecProxyId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new YCFLibPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByStartIdx.containsKey( keyStartIdx ) ) {
			throw new YCFLibUniqueIndexViolationException( getClass(),
				S_ProcName,
				"SessionStartIdx",
				keyStartIdx );
		}

		// Validate foreign keys

		{
			boolean allNull = true;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableSecUser().readDerivedByIdIdx( Authorization,
						Buff.getRequiredSecUserId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"SecSessionUser",
						"SecUser",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< YCFSecSecSessionPKey, YCFSecSecSessionBuff > subdictSecUserIdx;
		if( dictBySecUserIdx.containsKey( keySecUserIdx ) ) {
			subdictSecUserIdx = dictBySecUserIdx.get( keySecUserIdx );
		}
		else {
			subdictSecUserIdx = new HashMap< YCFSecSecSessionPKey, YCFSecSecSessionBuff >();
			dictBySecUserIdx.put( keySecUserIdx, subdictSecUserIdx );
		}
		subdictSecUserIdx.put( pkey, Buff );

		Map< YCFSecSecSessionPKey, YCFSecSecSessionBuff > subdictSecDevIdx;
		if( dictBySecDevIdx.containsKey( keySecDevIdx ) ) {
			subdictSecDevIdx = dictBySecDevIdx.get( keySecDevIdx );
		}
		else {
			subdictSecDevIdx = new HashMap< YCFSecSecSessionPKey, YCFSecSecSessionBuff >();
			dictBySecDevIdx.put( keySecDevIdx, subdictSecDevIdx );
		}
		subdictSecDevIdx.put( pkey, Buff );

		dictByStartIdx.put( keyStartIdx, Buff );

		Map< YCFSecSecSessionPKey, YCFSecSecSessionBuff > subdictFinishIdx;
		if( dictByFinishIdx.containsKey( keyFinishIdx ) ) {
			subdictFinishIdx = dictByFinishIdx.get( keyFinishIdx );
		}
		else {
			subdictFinishIdx = new HashMap< YCFSecSecSessionPKey, YCFSecSecSessionBuff >();
			dictByFinishIdx.put( keyFinishIdx, subdictFinishIdx );
		}
		subdictFinishIdx.put( pkey, Buff );

		Map< YCFSecSecSessionPKey, YCFSecSecSessionBuff > subdictSecProxyIdx;
		if( dictBySecProxyIdx.containsKey( keySecProxyIdx ) ) {
			subdictSecProxyIdx = dictBySecProxyIdx.get( keySecProxyIdx );
		}
		else {
			subdictSecProxyIdx = new HashMap< YCFSecSecSessionPKey, YCFSecSecSessionBuff >();
			dictBySecProxyIdx.put( keySecProxyIdx, subdictSecProxyIdx );
		}
		subdictSecProxyIdx.put( pkey, Buff );

	}

	public YCFSecSecSessionBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecSecSessionPKey PKey )
	{
		final String S_ProcName = "YCFIntRamSecSession.readDerived";
		YCFSecSecSessionPKey key = schema.getFactorySecSession().newPKey();
		key.setRequiredSecSessionId( PKey.getRequiredSecSessionId() );
		YCFSecSecSessionBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecSessionBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecSecSessionPKey PKey )
	{
		final String S_ProcName = "YCFIntRamSecSession.readDerived";
		YCFSecSecSessionPKey key = schema.getFactorySecSession().newPKey();
		key.setRequiredSecSessionId( PKey.getRequiredSecSessionId() );
		YCFSecSecSessionBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecSessionBuff[] readAllDerived( YCFSecAuthorization Authorization ) {
		final String S_ProcName = "YCFIntRamSecSession.readAllDerived";
		YCFSecSecSessionBuff[] retList = new YCFSecSecSessionBuff[ dictByPKey.values().size() ];
		Iterator< YCFSecSecSessionBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFSecSecSessionBuff[] readDerivedBySecUserIdx( YCFSecAuthorization Authorization,
		UUID SecUserId )
	{
		final String S_ProcName = "YCFIntRamSecSession.readDerivedBySecUserIdx";
		YCFSecSecSessionBySecUserIdxKey key = schema.getFactorySecSession().newSecUserIdxKey();
		key.setRequiredSecUserId( SecUserId );

		YCFSecSecSessionBuff[] recArray;
		if( dictBySecUserIdx.containsKey( key ) ) {
			Map< YCFSecSecSessionPKey, YCFSecSecSessionBuff > subdictSecUserIdx
				= dictBySecUserIdx.get( key );
			recArray = new YCFSecSecSessionBuff[ subdictSecUserIdx.size() ];
			Iterator< YCFSecSecSessionBuff > iter = subdictSecUserIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecSecSessionPKey, YCFSecSecSessionBuff > subdictSecUserIdx
				= new HashMap< YCFSecSecSessionPKey, YCFSecSecSessionBuff >();
			dictBySecUserIdx.put( key, subdictSecUserIdx );
			recArray = new YCFSecSecSessionBuff[0];
		}
		return( recArray );
	}

	public YCFSecSecSessionBuff[] readDerivedBySecDevIdx( YCFSecAuthorization Authorization,
		UUID SecUserId,
		String SecDevName )
	{
		final String S_ProcName = "YCFIntRamSecSession.readDerivedBySecDevIdx";
		YCFSecSecSessionBySecDevIdxKey key = schema.getFactorySecSession().newSecDevIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setOptionalSecDevName( SecDevName );

		YCFSecSecSessionBuff[] recArray;
		if( dictBySecDevIdx.containsKey( key ) ) {
			Map< YCFSecSecSessionPKey, YCFSecSecSessionBuff > subdictSecDevIdx
				= dictBySecDevIdx.get( key );
			recArray = new YCFSecSecSessionBuff[ subdictSecDevIdx.size() ];
			Iterator< YCFSecSecSessionBuff > iter = subdictSecDevIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecSecSessionPKey, YCFSecSecSessionBuff > subdictSecDevIdx
				= new HashMap< YCFSecSecSessionPKey, YCFSecSecSessionBuff >();
			dictBySecDevIdx.put( key, subdictSecDevIdx );
			recArray = new YCFSecSecSessionBuff[0];
		}
		return( recArray );
	}

	public YCFSecSecSessionBuff readDerivedByStartIdx( YCFSecAuthorization Authorization,
		UUID SecUserId,
		Calendar Start )
	{
		final String S_ProcName = "YCFIntRamSecSession.readDerivedByStartIdx";
		YCFSecSecSessionByStartIdxKey key = schema.getFactorySecSession().newStartIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setRequiredStart( Start );

		YCFSecSecSessionBuff buff;
		if( dictByStartIdx.containsKey( key ) ) {
			buff = dictByStartIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecSessionBuff[] readDerivedByFinishIdx( YCFSecAuthorization Authorization,
		UUID SecUserId,
		Calendar Finish )
	{
		final String S_ProcName = "YCFIntRamSecSession.readDerivedByFinishIdx";
		YCFSecSecSessionByFinishIdxKey key = schema.getFactorySecSession().newFinishIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setOptionalFinish( Finish );

		YCFSecSecSessionBuff[] recArray;
		if( dictByFinishIdx.containsKey( key ) ) {
			Map< YCFSecSecSessionPKey, YCFSecSecSessionBuff > subdictFinishIdx
				= dictByFinishIdx.get( key );
			recArray = new YCFSecSecSessionBuff[ subdictFinishIdx.size() ];
			Iterator< YCFSecSecSessionBuff > iter = subdictFinishIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecSecSessionPKey, YCFSecSecSessionBuff > subdictFinishIdx
				= new HashMap< YCFSecSecSessionPKey, YCFSecSecSessionBuff >();
			dictByFinishIdx.put( key, subdictFinishIdx );
			recArray = new YCFSecSecSessionBuff[0];
		}
		return( recArray );
	}

	public YCFSecSecSessionBuff[] readDerivedBySecProxyIdx( YCFSecAuthorization Authorization,
		UUID SecProxyId )
	{
		final String S_ProcName = "YCFIntRamSecSession.readDerivedBySecProxyIdx";
		YCFSecSecSessionBySecProxyIdxKey key = schema.getFactorySecSession().newSecProxyIdxKey();
		key.setOptionalSecProxyId( SecProxyId );

		YCFSecSecSessionBuff[] recArray;
		if( dictBySecProxyIdx.containsKey( key ) ) {
			Map< YCFSecSecSessionPKey, YCFSecSecSessionBuff > subdictSecProxyIdx
				= dictBySecProxyIdx.get( key );
			recArray = new YCFSecSecSessionBuff[ subdictSecProxyIdx.size() ];
			Iterator< YCFSecSecSessionBuff > iter = subdictSecProxyIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFSecSecSessionPKey, YCFSecSecSessionBuff > subdictSecProxyIdx
				= new HashMap< YCFSecSecSessionPKey, YCFSecSecSessionBuff >();
			dictBySecProxyIdx.put( key, subdictSecProxyIdx );
			recArray = new YCFSecSecSessionBuff[0];
		}
		return( recArray );
	}

	public YCFSecSecSessionBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		UUID SecSessionId )
	{
		final String S_ProcName = "YCFIntRamSecSession.readDerivedByIdIdx() ";
		YCFSecSecSessionPKey key = schema.getFactorySecSession().newPKey();
		key.setRequiredSecSessionId( SecSessionId );

		YCFSecSecSessionBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecSessionBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecSecSessionPKey PKey )
	{
		final String S_ProcName = "YCFIntRamSecSession.readBuff";
		YCFSecSecSessionBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a010" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecSessionBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecSecSessionPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFSecSecSessionBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a010" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFSecSecSessionBuff[] readAllBuff( YCFSecAuthorization Authorization )
	{
		final String S_ProcName = "YCFIntRamSecSession.readAllBuff";
		YCFSecSecSessionBuff buff;
		ArrayList<YCFSecSecSessionBuff> filteredList = new ArrayList<YCFSecSecSessionBuff>();
		YCFSecSecSessionBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a010" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFSecSecSessionBuff[0] ) );
	}

	/**
	 *	Read a page of all the specific SecSession buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecSession instances in the database accessible for the Authorization.
	 */
	public YCFSecSecSessionBuff[] pageAllBuff( YCFSecAuthorization Authorization,
		UUID priorSecSessionId )
	{
		final String S_ProcName = "pageAllBuff";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public YCFSecSecSessionBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		UUID SecSessionId )
	{
		final String S_ProcName = "YCFIntRamSecSession.readBuffByIdIdx() ";
		YCFSecSecSessionBuff buff = readDerivedByIdIdx( Authorization,
			SecSessionId );
		if( ( buff != null ) && buff.getClassCode().equals( "a010" ) ) {
			return( (YCFSecSecSessionBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecSecSessionBuff[] readBuffBySecUserIdx( YCFSecAuthorization Authorization,
		UUID SecUserId )
	{
		final String S_ProcName = "YCFIntRamSecSession.readBuffBySecUserIdx() ";
		YCFSecSecSessionBuff buff;
		ArrayList<YCFSecSecSessionBuff> filteredList = new ArrayList<YCFSecSecSessionBuff>();
		YCFSecSecSessionBuff[] buffList = readDerivedBySecUserIdx( Authorization,
			SecUserId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a010" ) ) {
				filteredList.add( (YCFSecSecSessionBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecSecSessionBuff[0] ) );
	}

	public YCFSecSecSessionBuff[] readBuffBySecDevIdx( YCFSecAuthorization Authorization,
		UUID SecUserId,
		String SecDevName )
	{
		final String S_ProcName = "YCFIntRamSecSession.readBuffBySecDevIdx() ";
		YCFSecSecSessionBuff buff;
		ArrayList<YCFSecSecSessionBuff> filteredList = new ArrayList<YCFSecSecSessionBuff>();
		YCFSecSecSessionBuff[] buffList = readDerivedBySecDevIdx( Authorization,
			SecUserId,
			SecDevName );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a010" ) ) {
				filteredList.add( (YCFSecSecSessionBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecSecSessionBuff[0] ) );
	}

	public YCFSecSecSessionBuff readBuffByStartIdx( YCFSecAuthorization Authorization,
		UUID SecUserId,
		Calendar Start )
	{
		final String S_ProcName = "YCFIntRamSecSession.readBuffByStartIdx() ";
		YCFSecSecSessionBuff buff = readDerivedByStartIdx( Authorization,
			SecUserId,
			Start );
		if( ( buff != null ) && buff.getClassCode().equals( "a010" ) ) {
			return( (YCFSecSecSessionBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFSecSecSessionBuff[] readBuffByFinishIdx( YCFSecAuthorization Authorization,
		UUID SecUserId,
		Calendar Finish )
	{
		final String S_ProcName = "YCFIntRamSecSession.readBuffByFinishIdx() ";
		YCFSecSecSessionBuff buff;
		ArrayList<YCFSecSecSessionBuff> filteredList = new ArrayList<YCFSecSecSessionBuff>();
		YCFSecSecSessionBuff[] buffList = readDerivedByFinishIdx( Authorization,
			SecUserId,
			Finish );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a010" ) ) {
				filteredList.add( (YCFSecSecSessionBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecSecSessionBuff[0] ) );
	}

	public YCFSecSecSessionBuff[] readBuffBySecProxyIdx( YCFSecAuthorization Authorization,
		UUID SecProxyId )
	{
		final String S_ProcName = "YCFIntRamSecSession.readBuffBySecProxyIdx() ";
		YCFSecSecSessionBuff buff;
		ArrayList<YCFSecSecSessionBuff> filteredList = new ArrayList<YCFSecSecSessionBuff>();
		YCFSecSecSessionBuff[] buffList = readDerivedBySecProxyIdx( Authorization,
			SecProxyId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a010" ) ) {
				filteredList.add( (YCFSecSecSessionBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFSecSecSessionBuff[0] ) );
	}

	/**
	 *	Read a page array of the specific SecSession buffer instances identified by the duplicate key SecUserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFSecSecSessionBuff[] pageBuffBySecUserIdx( YCFSecAuthorization Authorization,
		UUID SecUserId,
		UUID priorSecSessionId )
	{
		final String S_ProcName = "pageBuffBySecUserIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific SecSession buffer instances identified by the duplicate key SecDevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argSecDevName	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFSecSecSessionBuff[] pageBuffBySecDevIdx( YCFSecAuthorization Authorization,
		UUID SecUserId,
		String SecDevName,
		UUID priorSecSessionId )
	{
		final String S_ProcName = "pageBuffBySecDevIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific SecSession buffer instances identified by the duplicate key FinishIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argFinish	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFSecSecSessionBuff[] pageBuffByFinishIdx( YCFSecAuthorization Authorization,
		UUID SecUserId,
		Calendar Finish,
		UUID priorSecSessionId )
	{
		final String S_ProcName = "pageBuffByFinishIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	/**
	 *	Read a page array of the specific SecSession buffer instances identified by the duplicate key SecProxyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecProxyId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	public YCFSecSecSessionBuff[] pageBuffBySecProxyIdx( YCFSecAuthorization Authorization,
		UUID SecProxyId,
		UUID priorSecSessionId )
	{
		final String S_ProcName = "pageBuffBySecProxyIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateSecSession( YCFSecAuthorization Authorization,
		YCFSecSecSessionBuff Buff )
	{
		YCFSecSecSessionPKey pkey = schema.getFactorySecSession().newPKey();
		pkey.setRequiredSecSessionId( Buff.getRequiredSecSessionId() );
		YCFSecSecSessionBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new YCFLibStaleCacheDetectedException( getClass(),
				"updateSecSession",
				"Existing record not found",
				"SecSession",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new YCFLibCollisionDetectedException( getClass(),
				"updateSecSession",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		YCFSecSecSessionBySecUserIdxKey existingKeySecUserIdx = schema.getFactorySecSession().newSecUserIdxKey();
		existingKeySecUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );

		YCFSecSecSessionBySecUserIdxKey newKeySecUserIdx = schema.getFactorySecSession().newSecUserIdxKey();
		newKeySecUserIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );

		YCFSecSecSessionBySecDevIdxKey existingKeySecDevIdx = schema.getFactorySecSession().newSecDevIdxKey();
		existingKeySecDevIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );
		existingKeySecDevIdx.setOptionalSecDevName( existing.getOptionalSecDevName() );

		YCFSecSecSessionBySecDevIdxKey newKeySecDevIdx = schema.getFactorySecSession().newSecDevIdxKey();
		newKeySecDevIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );
		newKeySecDevIdx.setOptionalSecDevName( Buff.getOptionalSecDevName() );

		YCFSecSecSessionByStartIdxKey existingKeyStartIdx = schema.getFactorySecSession().newStartIdxKey();
		existingKeyStartIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );
		existingKeyStartIdx.setRequiredStart( existing.getRequiredStart() );

		YCFSecSecSessionByStartIdxKey newKeyStartIdx = schema.getFactorySecSession().newStartIdxKey();
		newKeyStartIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );
		newKeyStartIdx.setRequiredStart( Buff.getRequiredStart() );

		YCFSecSecSessionByFinishIdxKey existingKeyFinishIdx = schema.getFactorySecSession().newFinishIdxKey();
		existingKeyFinishIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );
		existingKeyFinishIdx.setOptionalFinish( existing.getOptionalFinish() );

		YCFSecSecSessionByFinishIdxKey newKeyFinishIdx = schema.getFactorySecSession().newFinishIdxKey();
		newKeyFinishIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );
		newKeyFinishIdx.setOptionalFinish( Buff.getOptionalFinish() );

		YCFSecSecSessionBySecProxyIdxKey existingKeySecProxyIdx = schema.getFactorySecSession().newSecProxyIdxKey();
		existingKeySecProxyIdx.setOptionalSecProxyId( existing.getOptionalSecProxyId() );

		YCFSecSecSessionBySecProxyIdxKey newKeySecProxyIdx = schema.getFactorySecSession().newSecProxyIdxKey();
		newKeySecProxyIdx.setOptionalSecProxyId( Buff.getOptionalSecProxyId() );

		// Check unique indexes

		if( ! existingKeyStartIdx.equals( newKeyStartIdx ) ) {
			if( dictByStartIdx.containsKey( newKeyStartIdx ) ) {
				throw new YCFLibUniqueIndexViolationException( getClass(),
					"updateSecSession",
					"SessionStartIdx",
					newKeyStartIdx );
			}
		}

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableSecUser().readDerivedByIdIdx( Authorization,
						Buff.getRequiredSecUserId() ) )
				{
					throw new YCFLibUnresolvedRelationException( getClass(),
						"updateSecSession",
						"Container",
						"SecSessionUser",
						"SecUser",
						null );
				}
			}
		}

		// Update is valid

		Map< YCFSecSecSessionPKey, YCFSecSecSessionBuff > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictBySecUserIdx.get( existingKeySecUserIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictBySecUserIdx.containsKey( newKeySecUserIdx ) ) {
			subdict = dictBySecUserIdx.get( newKeySecUserIdx );
		}
		else {
			subdict = new HashMap< YCFSecSecSessionPKey, YCFSecSecSessionBuff >();
			dictBySecUserIdx.put( newKeySecUserIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictBySecDevIdx.get( existingKeySecDevIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictBySecDevIdx.containsKey( newKeySecDevIdx ) ) {
			subdict = dictBySecDevIdx.get( newKeySecDevIdx );
		}
		else {
			subdict = new HashMap< YCFSecSecSessionPKey, YCFSecSecSessionBuff >();
			dictBySecDevIdx.put( newKeySecDevIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByStartIdx.remove( existingKeyStartIdx );
		dictByStartIdx.put( newKeyStartIdx, Buff );

		subdict = dictByFinishIdx.get( existingKeyFinishIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByFinishIdx.containsKey( newKeyFinishIdx ) ) {
			subdict = dictByFinishIdx.get( newKeyFinishIdx );
		}
		else {
			subdict = new HashMap< YCFSecSecSessionPKey, YCFSecSecSessionBuff >();
			dictByFinishIdx.put( newKeyFinishIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictBySecProxyIdx.get( existingKeySecProxyIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictBySecProxyIdx.containsKey( newKeySecProxyIdx ) ) {
			subdict = dictBySecProxyIdx.get( newKeySecProxyIdx );
		}
		else {
			subdict = new HashMap< YCFSecSecSessionPKey, YCFSecSecSessionBuff >();
			dictBySecProxyIdx.put( newKeySecProxyIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteSecSession( YCFSecAuthorization Authorization,
		YCFSecSecSessionBuff Buff )
	{
		final String S_ProcName = "YCFIntRamSecSessionTable.deleteSecSession() ";
		String classCode;
		YCFSecSecSessionPKey pkey = schema.getFactorySecSession().newPKey();
		pkey.setRequiredSecSessionId( Buff.getRequiredSecSessionId() );
		YCFSecSecSessionBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteSecSession",
				pkey );
		}
		YCFSecSecSessionBySecUserIdxKey keySecUserIdx = schema.getFactorySecSession().newSecUserIdxKey();
		keySecUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );

		YCFSecSecSessionBySecDevIdxKey keySecDevIdx = schema.getFactorySecSession().newSecDevIdxKey();
		keySecDevIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );
		keySecDevIdx.setOptionalSecDevName( existing.getOptionalSecDevName() );

		YCFSecSecSessionByStartIdxKey keyStartIdx = schema.getFactorySecSession().newStartIdxKey();
		keyStartIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );
		keyStartIdx.setRequiredStart( existing.getRequiredStart() );

		YCFSecSecSessionByFinishIdxKey keyFinishIdx = schema.getFactorySecSession().newFinishIdxKey();
		keyFinishIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );
		keyFinishIdx.setOptionalFinish( existing.getOptionalFinish() );

		YCFSecSecSessionBySecProxyIdxKey keySecProxyIdx = schema.getFactorySecSession().newSecProxyIdxKey();
		keySecProxyIdx.setOptionalSecProxyId( existing.getOptionalSecProxyId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFSecSecSessionPKey, YCFSecSecSessionBuff > subdict;

		dictByPKey.remove( pkey );

		subdict = dictBySecUserIdx.get( keySecUserIdx );
		subdict.remove( pkey );

		subdict = dictBySecDevIdx.get( keySecDevIdx );
		subdict.remove( pkey );

		dictByStartIdx.remove( keyStartIdx );

		subdict = dictByFinishIdx.get( keyFinishIdx );
		subdict.remove( pkey );

		subdict = dictBySecProxyIdx.get( keySecProxyIdx );
		subdict.remove( pkey );

	}
	public void deleteSecSessionByIdIdx( YCFSecAuthorization Authorization,
		UUID argSecSessionId )
	{
		YCFSecSecSessionPKey key = schema.getFactorySecSession().newPKey();
		key.setRequiredSecSessionId( argSecSessionId );
		deleteSecSessionByIdIdx( Authorization, key );
	}

	public void deleteSecSessionByIdIdx( YCFSecAuthorization Authorization,
		YCFSecSecSessionPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFSecSecSessionBuff cur;
		LinkedList<YCFSecSecSessionBuff> matchSet = new LinkedList<YCFSecSecSessionBuff>();
		Iterator<YCFSecSecSessionBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecSessionBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecSession().readDerivedByIdIdx( Authorization,
				cur.getRequiredSecSessionId() );
			deleteSecSession( Authorization, cur );
		}
	}

	public void deleteSecSessionBySecUserIdx( YCFSecAuthorization Authorization,
		UUID argSecUserId )
	{
		YCFSecSecSessionBySecUserIdxKey key = schema.getFactorySecSession().newSecUserIdxKey();
		key.setRequiredSecUserId( argSecUserId );
		deleteSecSessionBySecUserIdx( Authorization, key );
	}

	public void deleteSecSessionBySecUserIdx( YCFSecAuthorization Authorization,
		YCFSecSecSessionBySecUserIdxKey argKey )
	{
		YCFSecSecSessionBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecSecSessionBuff> matchSet = new LinkedList<YCFSecSecSessionBuff>();
		Iterator<YCFSecSecSessionBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecSessionBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecSession().readDerivedByIdIdx( Authorization,
				cur.getRequiredSecSessionId() );
			deleteSecSession( Authorization, cur );
		}
	}

	public void deleteSecSessionBySecDevIdx( YCFSecAuthorization Authorization,
		UUID argSecUserId,
		String argSecDevName )
	{
		YCFSecSecSessionBySecDevIdxKey key = schema.getFactorySecSession().newSecDevIdxKey();
		key.setRequiredSecUserId( argSecUserId );
		key.setOptionalSecDevName( argSecDevName );
		deleteSecSessionBySecDevIdx( Authorization, key );
	}

	public void deleteSecSessionBySecDevIdx( YCFSecAuthorization Authorization,
		YCFSecSecSessionBySecDevIdxKey argKey )
	{
		YCFSecSecSessionBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( argKey.getOptionalSecDevName() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecSecSessionBuff> matchSet = new LinkedList<YCFSecSecSessionBuff>();
		Iterator<YCFSecSecSessionBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecSessionBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecSession().readDerivedByIdIdx( Authorization,
				cur.getRequiredSecSessionId() );
			deleteSecSession( Authorization, cur );
		}
	}

	public void deleteSecSessionByStartIdx( YCFSecAuthorization Authorization,
		UUID argSecUserId,
		Calendar argStart )
	{
		YCFSecSecSessionByStartIdxKey key = schema.getFactorySecSession().newStartIdxKey();
		key.setRequiredSecUserId( argSecUserId );
		key.setRequiredStart( argStart );
		deleteSecSessionByStartIdx( Authorization, key );
	}

	public void deleteSecSessionByStartIdx( YCFSecAuthorization Authorization,
		YCFSecSecSessionByStartIdxKey argKey )
	{
		YCFSecSecSessionBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecSecSessionBuff> matchSet = new LinkedList<YCFSecSecSessionBuff>();
		Iterator<YCFSecSecSessionBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecSessionBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecSession().readDerivedByIdIdx( Authorization,
				cur.getRequiredSecSessionId() );
			deleteSecSession( Authorization, cur );
		}
	}

	public void deleteSecSessionByFinishIdx( YCFSecAuthorization Authorization,
		UUID argSecUserId,
		Calendar argFinish )
	{
		YCFSecSecSessionByFinishIdxKey key = schema.getFactorySecSession().newFinishIdxKey();
		key.setRequiredSecUserId( argSecUserId );
		key.setOptionalFinish( argFinish );
		deleteSecSessionByFinishIdx( Authorization, key );
	}

	public void deleteSecSessionByFinishIdx( YCFSecAuthorization Authorization,
		YCFSecSecSessionByFinishIdxKey argKey )
	{
		YCFSecSecSessionBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( argKey.getOptionalFinish() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecSecSessionBuff> matchSet = new LinkedList<YCFSecSecSessionBuff>();
		Iterator<YCFSecSecSessionBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecSessionBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecSession().readDerivedByIdIdx( Authorization,
				cur.getRequiredSecSessionId() );
			deleteSecSession( Authorization, cur );
		}
	}

	public void deleteSecSessionBySecProxyIdx( YCFSecAuthorization Authorization,
		UUID argSecProxyId )
	{
		YCFSecSecSessionBySecProxyIdxKey key = schema.getFactorySecSession().newSecProxyIdxKey();
		key.setOptionalSecProxyId( argSecProxyId );
		deleteSecSessionBySecProxyIdx( Authorization, key );
	}

	public void deleteSecSessionBySecProxyIdx( YCFSecAuthorization Authorization,
		YCFSecSecSessionBySecProxyIdxKey argKey )
	{
		YCFSecSecSessionBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalSecProxyId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFSecSecSessionBuff> matchSet = new LinkedList<YCFSecSecSessionBuff>();
		Iterator<YCFSecSecSessionBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFSecSecSessionBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecSession().readDerivedByIdIdx( Authorization,
				cur.getRequiredSecSessionId() );
			deleteSecSession( Authorization, cur );
		}
	}

	public void releasePreparedStatements() {
	}
}
