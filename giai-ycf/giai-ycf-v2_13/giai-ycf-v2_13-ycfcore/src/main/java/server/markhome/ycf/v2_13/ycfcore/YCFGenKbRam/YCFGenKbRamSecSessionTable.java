
// Description: Java 11 in-memory RAM DbIO implementation for SecSession.

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
 *	YCFGenKbRamSecSessionTable in-memory RAM DbIO implementation
 *	for SecSession.
 */
public class YCFGenKbRamSecSessionTable
	implements IYCFGenKbSecSessionTable
{
	private IYCFGenKbSchema schema;
	private Map< YCFGenKbSecSessionPKey,
				YCFGenKbSecSessionBuff > dictByPKey
		= new HashMap< YCFGenKbSecSessionPKey,
				YCFGenKbSecSessionBuff >();
	private Map< YCFGenKbSecSessionBySecUserIdxKey,
				Map< YCFGenKbSecSessionPKey,
					YCFGenKbSecSessionBuff >> dictBySecUserIdx
		= new HashMap< YCFGenKbSecSessionBySecUserIdxKey,
				Map< YCFGenKbSecSessionPKey,
					YCFGenKbSecSessionBuff >>();
	private Map< YCFGenKbSecSessionBySecDevIdxKey,
				Map< YCFGenKbSecSessionPKey,
					YCFGenKbSecSessionBuff >> dictBySecDevIdx
		= new HashMap< YCFGenKbSecSessionBySecDevIdxKey,
				Map< YCFGenKbSecSessionPKey,
					YCFGenKbSecSessionBuff >>();
	private Map< YCFGenKbSecSessionByStartIdxKey,
			YCFGenKbSecSessionBuff > dictByStartIdx
		= new HashMap< YCFGenKbSecSessionByStartIdxKey,
			YCFGenKbSecSessionBuff >();
	private Map< YCFGenKbSecSessionByFinishIdxKey,
				Map< YCFGenKbSecSessionPKey,
					YCFGenKbSecSessionBuff >> dictByFinishIdx
		= new HashMap< YCFGenKbSecSessionByFinishIdxKey,
				Map< YCFGenKbSecSessionPKey,
					YCFGenKbSecSessionBuff >>();
	private Map< YCFGenKbSecSessionBySecProxyIdxKey,
				Map< YCFGenKbSecSessionPKey,
					YCFGenKbSecSessionBuff >> dictBySecProxyIdx
		= new HashMap< YCFGenKbSecSessionBySecProxyIdxKey,
				Map< YCFGenKbSecSessionPKey,
					YCFGenKbSecSessionBuff >>();

	public YCFGenKbRamSecSessionTable( IYCFGenKbSchema argSchema ) {
		schema = argSchema;
	}

	public void createSecSession( YCFGenKbAuthorization Authorization,
		YCFGenKbSecSessionBuff Buff )
	{
		final String S_ProcName = "createSecSession";
		YCFGenKbSecSessionPKey pkey = schema.getFactorySecSession().newPKey();
		pkey.setRequiredSecSessionId( schema.nextSecSessionIdGen() );
		Buff.setRequiredSecSessionId( pkey.getRequiredSecSessionId() );
		YCFGenKbSecSessionBySecUserIdxKey keySecUserIdx = schema.getFactorySecSession().newSecUserIdxKey();
		keySecUserIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );

		YCFGenKbSecSessionBySecDevIdxKey keySecDevIdx = schema.getFactorySecSession().newSecDevIdxKey();
		keySecDevIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );
		keySecDevIdx.setOptionalSecDevName( Buff.getOptionalSecDevName() );

		YCFGenKbSecSessionByStartIdxKey keyStartIdx = schema.getFactorySecSession().newStartIdxKey();
		keyStartIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );
		keyStartIdx.setRequiredStart( Buff.getRequiredStart() );

		YCFGenKbSecSessionByFinishIdxKey keyFinishIdx = schema.getFactorySecSession().newFinishIdxKey();
		keyFinishIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );
		keyFinishIdx.setOptionalFinish( Buff.getOptionalFinish() );

		YCFGenKbSecSessionBySecProxyIdxKey keySecProxyIdx = schema.getFactorySecSession().newSecProxyIdxKey();
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

		Map< YCFGenKbSecSessionPKey, YCFGenKbSecSessionBuff > subdictSecUserIdx;
		if( dictBySecUserIdx.containsKey( keySecUserIdx ) ) {
			subdictSecUserIdx = dictBySecUserIdx.get( keySecUserIdx );
		}
		else {
			subdictSecUserIdx = new HashMap< YCFGenKbSecSessionPKey, YCFGenKbSecSessionBuff >();
			dictBySecUserIdx.put( keySecUserIdx, subdictSecUserIdx );
		}
		subdictSecUserIdx.put( pkey, Buff );

		Map< YCFGenKbSecSessionPKey, YCFGenKbSecSessionBuff > subdictSecDevIdx;
		if( dictBySecDevIdx.containsKey( keySecDevIdx ) ) {
			subdictSecDevIdx = dictBySecDevIdx.get( keySecDevIdx );
		}
		else {
			subdictSecDevIdx = new HashMap< YCFGenKbSecSessionPKey, YCFGenKbSecSessionBuff >();
			dictBySecDevIdx.put( keySecDevIdx, subdictSecDevIdx );
		}
		subdictSecDevIdx.put( pkey, Buff );

		dictByStartIdx.put( keyStartIdx, Buff );

		Map< YCFGenKbSecSessionPKey, YCFGenKbSecSessionBuff > subdictFinishIdx;
		if( dictByFinishIdx.containsKey( keyFinishIdx ) ) {
			subdictFinishIdx = dictByFinishIdx.get( keyFinishIdx );
		}
		else {
			subdictFinishIdx = new HashMap< YCFGenKbSecSessionPKey, YCFGenKbSecSessionBuff >();
			dictByFinishIdx.put( keyFinishIdx, subdictFinishIdx );
		}
		subdictFinishIdx.put( pkey, Buff );

		Map< YCFGenKbSecSessionPKey, YCFGenKbSecSessionBuff > subdictSecProxyIdx;
		if( dictBySecProxyIdx.containsKey( keySecProxyIdx ) ) {
			subdictSecProxyIdx = dictBySecProxyIdx.get( keySecProxyIdx );
		}
		else {
			subdictSecProxyIdx = new HashMap< YCFGenKbSecSessionPKey, YCFGenKbSecSessionBuff >();
			dictBySecProxyIdx.put( keySecProxyIdx, subdictSecProxyIdx );
		}
		subdictSecProxyIdx.put( pkey, Buff );

	}

	public YCFGenKbSecSessionBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSecSessionPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamSecSession.readDerived";
		YCFGenKbSecSessionPKey key = schema.getFactorySecSession().newPKey();
		key.setRequiredSecSessionId( PKey.getRequiredSecSessionId() );
		YCFGenKbSecSessionBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecSessionBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSecSessionPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamSecSession.readDerived";
		YCFGenKbSecSessionPKey key = schema.getFactorySecSession().newPKey();
		key.setRequiredSecSessionId( PKey.getRequiredSecSessionId() );
		YCFGenKbSecSessionBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecSessionBuff[] readAllDerived( YCFGenKbAuthorization Authorization ) {
		final String S_ProcName = "YCFGenKbRamSecSession.readAllDerived";
		YCFGenKbSecSessionBuff[] retList = new YCFGenKbSecSessionBuff[ dictByPKey.values().size() ];
		Iterator< YCFGenKbSecSessionBuff > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	public YCFGenKbSecSessionBuff[] readDerivedBySecUserIdx( YCFGenKbAuthorization Authorization,
		UUID SecUserId )
	{
		final String S_ProcName = "YCFGenKbRamSecSession.readDerivedBySecUserIdx";
		YCFGenKbSecSessionBySecUserIdxKey key = schema.getFactorySecSession().newSecUserIdxKey();
		key.setRequiredSecUserId( SecUserId );

		YCFGenKbSecSessionBuff[] recArray;
		if( dictBySecUserIdx.containsKey( key ) ) {
			Map< YCFGenKbSecSessionPKey, YCFGenKbSecSessionBuff > subdictSecUserIdx
				= dictBySecUserIdx.get( key );
			recArray = new YCFGenKbSecSessionBuff[ subdictSecUserIdx.size() ];
			Iterator< YCFGenKbSecSessionBuff > iter = subdictSecUserIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbSecSessionPKey, YCFGenKbSecSessionBuff > subdictSecUserIdx
				= new HashMap< YCFGenKbSecSessionPKey, YCFGenKbSecSessionBuff >();
			dictBySecUserIdx.put( key, subdictSecUserIdx );
			recArray = new YCFGenKbSecSessionBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbSecSessionBuff[] readDerivedBySecDevIdx( YCFGenKbAuthorization Authorization,
		UUID SecUserId,
		String SecDevName )
	{
		final String S_ProcName = "YCFGenKbRamSecSession.readDerivedBySecDevIdx";
		YCFGenKbSecSessionBySecDevIdxKey key = schema.getFactorySecSession().newSecDevIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setOptionalSecDevName( SecDevName );

		YCFGenKbSecSessionBuff[] recArray;
		if( dictBySecDevIdx.containsKey( key ) ) {
			Map< YCFGenKbSecSessionPKey, YCFGenKbSecSessionBuff > subdictSecDevIdx
				= dictBySecDevIdx.get( key );
			recArray = new YCFGenKbSecSessionBuff[ subdictSecDevIdx.size() ];
			Iterator< YCFGenKbSecSessionBuff > iter = subdictSecDevIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbSecSessionPKey, YCFGenKbSecSessionBuff > subdictSecDevIdx
				= new HashMap< YCFGenKbSecSessionPKey, YCFGenKbSecSessionBuff >();
			dictBySecDevIdx.put( key, subdictSecDevIdx );
			recArray = new YCFGenKbSecSessionBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbSecSessionBuff readDerivedByStartIdx( YCFGenKbAuthorization Authorization,
		UUID SecUserId,
		Calendar Start )
	{
		final String S_ProcName = "YCFGenKbRamSecSession.readDerivedByStartIdx";
		YCFGenKbSecSessionByStartIdxKey key = schema.getFactorySecSession().newStartIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setRequiredStart( Start );

		YCFGenKbSecSessionBuff buff;
		if( dictByStartIdx.containsKey( key ) ) {
			buff = dictByStartIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecSessionBuff[] readDerivedByFinishIdx( YCFGenKbAuthorization Authorization,
		UUID SecUserId,
		Calendar Finish )
	{
		final String S_ProcName = "YCFGenKbRamSecSession.readDerivedByFinishIdx";
		YCFGenKbSecSessionByFinishIdxKey key = schema.getFactorySecSession().newFinishIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setOptionalFinish( Finish );

		YCFGenKbSecSessionBuff[] recArray;
		if( dictByFinishIdx.containsKey( key ) ) {
			Map< YCFGenKbSecSessionPKey, YCFGenKbSecSessionBuff > subdictFinishIdx
				= dictByFinishIdx.get( key );
			recArray = new YCFGenKbSecSessionBuff[ subdictFinishIdx.size() ];
			Iterator< YCFGenKbSecSessionBuff > iter = subdictFinishIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbSecSessionPKey, YCFGenKbSecSessionBuff > subdictFinishIdx
				= new HashMap< YCFGenKbSecSessionPKey, YCFGenKbSecSessionBuff >();
			dictByFinishIdx.put( key, subdictFinishIdx );
			recArray = new YCFGenKbSecSessionBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbSecSessionBuff[] readDerivedBySecProxyIdx( YCFGenKbAuthorization Authorization,
		UUID SecProxyId )
	{
		final String S_ProcName = "YCFGenKbRamSecSession.readDerivedBySecProxyIdx";
		YCFGenKbSecSessionBySecProxyIdxKey key = schema.getFactorySecSession().newSecProxyIdxKey();
		key.setOptionalSecProxyId( SecProxyId );

		YCFGenKbSecSessionBuff[] recArray;
		if( dictBySecProxyIdx.containsKey( key ) ) {
			Map< YCFGenKbSecSessionPKey, YCFGenKbSecSessionBuff > subdictSecProxyIdx
				= dictBySecProxyIdx.get( key );
			recArray = new YCFGenKbSecSessionBuff[ subdictSecProxyIdx.size() ];
			Iterator< YCFGenKbSecSessionBuff > iter = subdictSecProxyIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< YCFGenKbSecSessionPKey, YCFGenKbSecSessionBuff > subdictSecProxyIdx
				= new HashMap< YCFGenKbSecSessionPKey, YCFGenKbSecSessionBuff >();
			dictBySecProxyIdx.put( key, subdictSecProxyIdx );
			recArray = new YCFGenKbSecSessionBuff[0];
		}
		return( recArray );
	}

	public YCFGenKbSecSessionBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
		UUID SecSessionId )
	{
		final String S_ProcName = "YCFGenKbRamSecSession.readDerivedByIdIdx() ";
		YCFGenKbSecSessionPKey key = schema.getFactorySecSession().newPKey();
		key.setRequiredSecSessionId( SecSessionId );

		YCFGenKbSecSessionBuff buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecSessionBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSecSessionPKey PKey )
	{
		final String S_ProcName = "YCFGenKbRamSecSession.readBuff";
		YCFGenKbSecSessionBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a90d" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecSessionBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSecSessionPKey PKey )
	{
		final String S_ProcName = "lockBuff";
		YCFGenKbSecSessionBuff buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( ! buff.getClassCode().equals( "a90d" ) ) ) {
			buff = null;
		}
		return( buff );
	}

	public YCFGenKbSecSessionBuff[] readAllBuff( YCFGenKbAuthorization Authorization )
	{
		final String S_ProcName = "YCFGenKbRamSecSession.readAllBuff";
		YCFGenKbSecSessionBuff buff;
		ArrayList<YCFGenKbSecSessionBuff> filteredList = new ArrayList<YCFGenKbSecSessionBuff>();
		YCFGenKbSecSessionBuff[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a90d" ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSecSessionBuff[0] ) );
	}

	/**
	 *	Read a page of all the specific SecSession buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecSession instances in the database accessible for the Authorization.
	 */
	public YCFGenKbSecSessionBuff[] pageAllBuff( YCFGenKbAuthorization Authorization,
		UUID priorSecSessionId )
	{
		final String S_ProcName = "pageAllBuff";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public YCFGenKbSecSessionBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
		UUID SecSessionId )
	{
		final String S_ProcName = "YCFGenKbRamSecSession.readBuffByIdIdx() ";
		YCFGenKbSecSessionBuff buff = readDerivedByIdIdx( Authorization,
			SecSessionId );
		if( ( buff != null ) && buff.getClassCode().equals( "a90d" ) ) {
			return( (YCFGenKbSecSessionBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbSecSessionBuff[] readBuffBySecUserIdx( YCFGenKbAuthorization Authorization,
		UUID SecUserId )
	{
		final String S_ProcName = "YCFGenKbRamSecSession.readBuffBySecUserIdx() ";
		YCFGenKbSecSessionBuff buff;
		ArrayList<YCFGenKbSecSessionBuff> filteredList = new ArrayList<YCFGenKbSecSessionBuff>();
		YCFGenKbSecSessionBuff[] buffList = readDerivedBySecUserIdx( Authorization,
			SecUserId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a90d" ) ) {
				filteredList.add( (YCFGenKbSecSessionBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSecSessionBuff[0] ) );
	}

	public YCFGenKbSecSessionBuff[] readBuffBySecDevIdx( YCFGenKbAuthorization Authorization,
		UUID SecUserId,
		String SecDevName )
	{
		final String S_ProcName = "YCFGenKbRamSecSession.readBuffBySecDevIdx() ";
		YCFGenKbSecSessionBuff buff;
		ArrayList<YCFGenKbSecSessionBuff> filteredList = new ArrayList<YCFGenKbSecSessionBuff>();
		YCFGenKbSecSessionBuff[] buffList = readDerivedBySecDevIdx( Authorization,
			SecUserId,
			SecDevName );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a90d" ) ) {
				filteredList.add( (YCFGenKbSecSessionBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSecSessionBuff[0] ) );
	}

	public YCFGenKbSecSessionBuff readBuffByStartIdx( YCFGenKbAuthorization Authorization,
		UUID SecUserId,
		Calendar Start )
	{
		final String S_ProcName = "YCFGenKbRamSecSession.readBuffByStartIdx() ";
		YCFGenKbSecSessionBuff buff = readDerivedByStartIdx( Authorization,
			SecUserId,
			Start );
		if( ( buff != null ) && buff.getClassCode().equals( "a90d" ) ) {
			return( (YCFGenKbSecSessionBuff)buff );
		}
		else {
			return( null );
		}
	}

	public YCFGenKbSecSessionBuff[] readBuffByFinishIdx( YCFGenKbAuthorization Authorization,
		UUID SecUserId,
		Calendar Finish )
	{
		final String S_ProcName = "YCFGenKbRamSecSession.readBuffByFinishIdx() ";
		YCFGenKbSecSessionBuff buff;
		ArrayList<YCFGenKbSecSessionBuff> filteredList = new ArrayList<YCFGenKbSecSessionBuff>();
		YCFGenKbSecSessionBuff[] buffList = readDerivedByFinishIdx( Authorization,
			SecUserId,
			Finish );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a90d" ) ) {
				filteredList.add( (YCFGenKbSecSessionBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSecSessionBuff[0] ) );
	}

	public YCFGenKbSecSessionBuff[] readBuffBySecProxyIdx( YCFGenKbAuthorization Authorization,
		UUID SecProxyId )
	{
		final String S_ProcName = "YCFGenKbRamSecSession.readBuffBySecProxyIdx() ";
		YCFGenKbSecSessionBuff buff;
		ArrayList<YCFGenKbSecSessionBuff> filteredList = new ArrayList<YCFGenKbSecSessionBuff>();
		YCFGenKbSecSessionBuff[] buffList = readDerivedBySecProxyIdx( Authorization,
			SecProxyId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && buff.getClassCode().equals( "a90d" ) ) {
				filteredList.add( (YCFGenKbSecSessionBuff)buff );
			}
		}
		return( filteredList.toArray( new YCFGenKbSecSessionBuff[0] ) );
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
	public YCFGenKbSecSessionBuff[] pageBuffBySecUserIdx( YCFGenKbAuthorization Authorization,
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
	public YCFGenKbSecSessionBuff[] pageBuffBySecDevIdx( YCFGenKbAuthorization Authorization,
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
	public YCFGenKbSecSessionBuff[] pageBuffByFinishIdx( YCFGenKbAuthorization Authorization,
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
	public YCFGenKbSecSessionBuff[] pageBuffBySecProxyIdx( YCFGenKbAuthorization Authorization,
		UUID SecProxyId,
		UUID priorSecSessionId )
	{
		final String S_ProcName = "pageBuffBySecProxyIdx";
		throw new YCFLibNotImplementedYetException( getClass(), S_ProcName );
	}

	public void updateSecSession( YCFGenKbAuthorization Authorization,
		YCFGenKbSecSessionBuff Buff )
	{
		YCFGenKbSecSessionPKey pkey = schema.getFactorySecSession().newPKey();
		pkey.setRequiredSecSessionId( Buff.getRequiredSecSessionId() );
		YCFGenKbSecSessionBuff existing = dictByPKey.get( pkey );
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
		YCFGenKbSecSessionBySecUserIdxKey existingKeySecUserIdx = schema.getFactorySecSession().newSecUserIdxKey();
		existingKeySecUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );

		YCFGenKbSecSessionBySecUserIdxKey newKeySecUserIdx = schema.getFactorySecSession().newSecUserIdxKey();
		newKeySecUserIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );

		YCFGenKbSecSessionBySecDevIdxKey existingKeySecDevIdx = schema.getFactorySecSession().newSecDevIdxKey();
		existingKeySecDevIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );
		existingKeySecDevIdx.setOptionalSecDevName( existing.getOptionalSecDevName() );

		YCFGenKbSecSessionBySecDevIdxKey newKeySecDevIdx = schema.getFactorySecSession().newSecDevIdxKey();
		newKeySecDevIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );
		newKeySecDevIdx.setOptionalSecDevName( Buff.getOptionalSecDevName() );

		YCFGenKbSecSessionByStartIdxKey existingKeyStartIdx = schema.getFactorySecSession().newStartIdxKey();
		existingKeyStartIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );
		existingKeyStartIdx.setRequiredStart( existing.getRequiredStart() );

		YCFGenKbSecSessionByStartIdxKey newKeyStartIdx = schema.getFactorySecSession().newStartIdxKey();
		newKeyStartIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );
		newKeyStartIdx.setRequiredStart( Buff.getRequiredStart() );

		YCFGenKbSecSessionByFinishIdxKey existingKeyFinishIdx = schema.getFactorySecSession().newFinishIdxKey();
		existingKeyFinishIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );
		existingKeyFinishIdx.setOptionalFinish( existing.getOptionalFinish() );

		YCFGenKbSecSessionByFinishIdxKey newKeyFinishIdx = schema.getFactorySecSession().newFinishIdxKey();
		newKeyFinishIdx.setRequiredSecUserId( Buff.getRequiredSecUserId() );
		newKeyFinishIdx.setOptionalFinish( Buff.getOptionalFinish() );

		YCFGenKbSecSessionBySecProxyIdxKey existingKeySecProxyIdx = schema.getFactorySecSession().newSecProxyIdxKey();
		existingKeySecProxyIdx.setOptionalSecProxyId( existing.getOptionalSecProxyId() );

		YCFGenKbSecSessionBySecProxyIdxKey newKeySecProxyIdx = schema.getFactorySecSession().newSecProxyIdxKey();
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

		Map< YCFGenKbSecSessionPKey, YCFGenKbSecSessionBuff > subdict;

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
			subdict = new HashMap< YCFGenKbSecSessionPKey, YCFGenKbSecSessionBuff >();
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
			subdict = new HashMap< YCFGenKbSecSessionPKey, YCFGenKbSecSessionBuff >();
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
			subdict = new HashMap< YCFGenKbSecSessionPKey, YCFGenKbSecSessionBuff >();
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
			subdict = new HashMap< YCFGenKbSecSessionPKey, YCFGenKbSecSessionBuff >();
			dictBySecProxyIdx.put( newKeySecProxyIdx, subdict );
		}
		subdict.put( pkey, Buff );

	}

	public void deleteSecSession( YCFGenKbAuthorization Authorization,
		YCFGenKbSecSessionBuff Buff )
	{
		final String S_ProcName = "YCFGenKbRamSecSessionTable.deleteSecSession() ";
		String classCode;
		YCFGenKbSecSessionPKey pkey = schema.getFactorySecSession().newPKey();
		pkey.setRequiredSecSessionId( Buff.getRequiredSecSessionId() );
		YCFGenKbSecSessionBuff existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new YCFLibCollisionDetectedException( getClass(),
				"deleteSecSession",
				pkey );
		}
		YCFGenKbSecSessionBySecUserIdxKey keySecUserIdx = schema.getFactorySecSession().newSecUserIdxKey();
		keySecUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );

		YCFGenKbSecSessionBySecDevIdxKey keySecDevIdx = schema.getFactorySecSession().newSecDevIdxKey();
		keySecDevIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );
		keySecDevIdx.setOptionalSecDevName( existing.getOptionalSecDevName() );

		YCFGenKbSecSessionByStartIdxKey keyStartIdx = schema.getFactorySecSession().newStartIdxKey();
		keyStartIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );
		keyStartIdx.setRequiredStart( existing.getRequiredStart() );

		YCFGenKbSecSessionByFinishIdxKey keyFinishIdx = schema.getFactorySecSession().newFinishIdxKey();
		keyFinishIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );
		keyFinishIdx.setOptionalFinish( existing.getOptionalFinish() );

		YCFGenKbSecSessionBySecProxyIdxKey keySecProxyIdx = schema.getFactorySecSession().newSecProxyIdxKey();
		keySecProxyIdx.setOptionalSecProxyId( existing.getOptionalSecProxyId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< YCFGenKbSecSessionPKey, YCFGenKbSecSessionBuff > subdict;

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
	public void deleteSecSessionByIdIdx( YCFGenKbAuthorization Authorization,
		UUID argSecSessionId )
	{
		YCFGenKbSecSessionPKey key = schema.getFactorySecSession().newPKey();
		key.setRequiredSecSessionId( argSecSessionId );
		deleteSecSessionByIdIdx( Authorization, key );
	}

	public void deleteSecSessionByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecSessionPKey argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		YCFGenKbSecSessionBuff cur;
		LinkedList<YCFGenKbSecSessionBuff> matchSet = new LinkedList<YCFGenKbSecSessionBuff>();
		Iterator<YCFGenKbSecSessionBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecSessionBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecSession().readDerivedByIdIdx( Authorization,
				cur.getRequiredSecSessionId() );
			deleteSecSession( Authorization, cur );
		}
	}

	public void deleteSecSessionBySecUserIdx( YCFGenKbAuthorization Authorization,
		UUID argSecUserId )
	{
		YCFGenKbSecSessionBySecUserIdxKey key = schema.getFactorySecSession().newSecUserIdxKey();
		key.setRequiredSecUserId( argSecUserId );
		deleteSecSessionBySecUserIdx( Authorization, key );
	}

	public void deleteSecSessionBySecUserIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecSessionBySecUserIdxKey argKey )
	{
		YCFGenKbSecSessionBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbSecSessionBuff> matchSet = new LinkedList<YCFGenKbSecSessionBuff>();
		Iterator<YCFGenKbSecSessionBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecSessionBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecSession().readDerivedByIdIdx( Authorization,
				cur.getRequiredSecSessionId() );
			deleteSecSession( Authorization, cur );
		}
	}

	public void deleteSecSessionBySecDevIdx( YCFGenKbAuthorization Authorization,
		UUID argSecUserId,
		String argSecDevName )
	{
		YCFGenKbSecSessionBySecDevIdxKey key = schema.getFactorySecSession().newSecDevIdxKey();
		key.setRequiredSecUserId( argSecUserId );
		key.setOptionalSecDevName( argSecDevName );
		deleteSecSessionBySecDevIdx( Authorization, key );
	}

	public void deleteSecSessionBySecDevIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecSessionBySecDevIdxKey argKey )
	{
		YCFGenKbSecSessionBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( argKey.getOptionalSecDevName() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbSecSessionBuff> matchSet = new LinkedList<YCFGenKbSecSessionBuff>();
		Iterator<YCFGenKbSecSessionBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecSessionBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecSession().readDerivedByIdIdx( Authorization,
				cur.getRequiredSecSessionId() );
			deleteSecSession( Authorization, cur );
		}
	}

	public void deleteSecSessionByStartIdx( YCFGenKbAuthorization Authorization,
		UUID argSecUserId,
		Calendar argStart )
	{
		YCFGenKbSecSessionByStartIdxKey key = schema.getFactorySecSession().newStartIdxKey();
		key.setRequiredSecUserId( argSecUserId );
		key.setRequiredStart( argStart );
		deleteSecSessionByStartIdx( Authorization, key );
	}

	public void deleteSecSessionByStartIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecSessionByStartIdxKey argKey )
	{
		YCFGenKbSecSessionBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbSecSessionBuff> matchSet = new LinkedList<YCFGenKbSecSessionBuff>();
		Iterator<YCFGenKbSecSessionBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecSessionBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecSession().readDerivedByIdIdx( Authorization,
				cur.getRequiredSecSessionId() );
			deleteSecSession( Authorization, cur );
		}
	}

	public void deleteSecSessionByFinishIdx( YCFGenKbAuthorization Authorization,
		UUID argSecUserId,
		Calendar argFinish )
	{
		YCFGenKbSecSessionByFinishIdxKey key = schema.getFactorySecSession().newFinishIdxKey();
		key.setRequiredSecUserId( argSecUserId );
		key.setOptionalFinish( argFinish );
		deleteSecSessionByFinishIdx( Authorization, key );
	}

	public void deleteSecSessionByFinishIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecSessionByFinishIdxKey argKey )
	{
		YCFGenKbSecSessionBuff cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( argKey.getOptionalFinish() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbSecSessionBuff> matchSet = new LinkedList<YCFGenKbSecSessionBuff>();
		Iterator<YCFGenKbSecSessionBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecSessionBuff> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = schema.getTableSecSession().readDerivedByIdIdx( Authorization,
				cur.getRequiredSecSessionId() );
			deleteSecSession( Authorization, cur );
		}
	}

	public void deleteSecSessionBySecProxyIdx( YCFGenKbAuthorization Authorization,
		UUID argSecProxyId )
	{
		YCFGenKbSecSessionBySecProxyIdxKey key = schema.getFactorySecSession().newSecProxyIdxKey();
		key.setOptionalSecProxyId( argSecProxyId );
		deleteSecSessionBySecProxyIdx( Authorization, key );
	}

	public void deleteSecSessionBySecProxyIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecSessionBySecProxyIdxKey argKey )
	{
		YCFGenKbSecSessionBuff cur;
		boolean anyNotNull = false;
		if( argKey.getOptionalSecProxyId() != null ) {
			anyNotNull = true;
		}
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<YCFGenKbSecSessionBuff> matchSet = new LinkedList<YCFGenKbSecSessionBuff>();
		Iterator<YCFGenKbSecSessionBuff> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<YCFGenKbSecSessionBuff> iterMatch = matchSet.iterator();
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
