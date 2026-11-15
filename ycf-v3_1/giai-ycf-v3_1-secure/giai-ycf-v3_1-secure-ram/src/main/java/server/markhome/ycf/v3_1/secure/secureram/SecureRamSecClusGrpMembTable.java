
// Description: Java 25 in-memory RAM DbIO implementation for SecClusGrpMemb.

/*
 *	server.markhome.ycf.BusModel
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Yorkton Code Fractal BusModel 3.1 Business Application Model
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of the Yorkton Code Fractal Business Model.
 *	
 *	Yorkton Code Fractal BusModel is available under dual commercial license from
 *	Mark Stephen Sobkow, or under the terms of the GNU General Public License,
 *	Version 3 or later with classpath and static linking exceptions.
 *	
 *	Yorkton Code Fractal BusModel is free software: you can redistribute it and/or
 *	modify it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	Yorkton Code Fractal BusModel is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with Yorkton Code Fractal BusModel.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 */

package server.markhome.ycf.v3_1.secure.secureram;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;

import server.markhome.ycf.v3_1.secure.secure.*;
import server.markhome.ycf.v3_1.intnet.intnet.*;
import server.markhome.ycf.v3_1.busmodel.busmodel.*;
import server.markhome.ycf.v3_1.secure.secure.buff.*;
import server.markhome.ycf.v3_1.intnet.intnet.buff.*;
import server.markhome.ycf.v3_1.busmodel.busmodel.buff.*;
import server.markhome.ycf.v3_1.secure.secureobj.*;
import server.markhome.ycf.v3_1.intnet.intnetobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelobj.*;

/*
 *	SecureRamSecClusGrpMembTable in-memory RAM DbIO implementation
 *	for SecClusGrpMemb.
 */
public class SecureRamSecClusGrpMembTable
	implements ISecureSecClusGrpMembTable
{
	private ISecureSchema schema;
	private Map< ISecureSecClusGrpMembPKey,
				SecureBuffSecClusGrpMemb > dictByPKey
		= new HashMap< ISecureSecClusGrpMembPKey,
				SecureBuffSecClusGrpMemb >();
	private Map< SecureBuffSecClusGrpMembByClusGrpIdxKey,
				Map< SecureBuffSecClusGrpMembPKey,
					SecureBuffSecClusGrpMemb >> dictByClusGrpIdx
		= new HashMap< SecureBuffSecClusGrpMembByClusGrpIdxKey,
				Map< SecureBuffSecClusGrpMembPKey,
					SecureBuffSecClusGrpMemb >>();
	private Map< SecureBuffSecClusGrpMembByLoginIdxKey,
				Map< SecureBuffSecClusGrpMembPKey,
					SecureBuffSecClusGrpMemb >> dictByLoginIdx
		= new HashMap< SecureBuffSecClusGrpMembByLoginIdxKey,
				Map< SecureBuffSecClusGrpMembPKey,
					SecureBuffSecClusGrpMemb >>();

	public SecureRamSecClusGrpMembTable( ISecureSchema argSchema ) {
		schema = argSchema;
	}

	public SecureBuffSecClusGrpMemb ensureRec(ISecureSecClusGrpMemb rec) {
		return (((SecureBuffSecClusGrpMembFactoryService)(schema.getSecureBuffFactory().getFactorySecClusGrpMemb())).ensureRec(rec));
	}

	@Override
	public ISecureSecClusGrpMemb createSecClusGrpMemb( ISecureAuthorization Authorization,
		ISecureSecClusGrpMemb iBuff )
	{
		final String S_ProcName = "createSecClusGrpMemb";
		
		SecureBuffSecClusGrpMemb Buff = (SecureBuffSecClusGrpMemb)ensureRec(iBuff);
		SecureBuffSecClusGrpMembPKey pkey = (SecureBuffSecClusGrpMembPKey)(schema.getSecureBuffFactory().getFactorySecClusGrpMemb().newPKey());
		pkey.setRequiredSecClusGrpId(Buff.getRequiredSecClusGrpId());
		pkey.setRequiredLoginId(Buff.getRequiredLoginId());
		pkey.setRequiredSecClusGrpId( Buff.getRequiredSecClusGrpId() );
		pkey.setRequiredLoginId( Buff.getRequiredLoginId() );
		Buff.setRequiredContainerGroup( pkey.getRequiredSecClusGrpId() );
		Buff.setRequiredParentUser( pkey.getRequiredLoginId() );
		Buff.setRequiredSecClusGrpId( pkey.getRequiredSecClusGrpId() );
		Buff.setRequiredLoginId( pkey.getRequiredLoginId() );
		SecureBuffSecClusGrpMembByClusGrpIdxKey keyClusGrpIdx = (SecureBuffSecClusGrpMembByClusGrpIdxKey)schema.getSecureBuffFactory().getFactorySecClusGrpMemb().newByClusGrpIdxKey();
		keyClusGrpIdx.setRequiredSecClusGrpId( Buff.getRequiredSecClusGrpId() );

		SecureBuffSecClusGrpMembByLoginIdxKey keyLoginIdx = (SecureBuffSecClusGrpMembByLoginIdxKey)schema.getSecureBuffFactory().getFactorySecClusGrpMemb().newByLoginIdxKey();
		keyLoginIdx.setRequiredLoginId( Buff.getRequiredLoginId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new CFPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		// Validate foreign keys

		{
			boolean allNull = true;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableSecClusGrp().readDerivedByIdIdx( Authorization,
						Buff.getRequiredSecClusGrpId() ) )
				{
					throw new CFUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"Container",
						"SecClusGrpMembGroup",
						"SecClusGrpMembGroup",
						"SecClusGrp",
						"SecClusGrp",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< SecureBuffSecClusGrpMembPKey, SecureBuffSecClusGrpMemb > subdictClusGrpIdx;
		if( dictByClusGrpIdx.containsKey( keyClusGrpIdx ) ) {
			subdictClusGrpIdx = dictByClusGrpIdx.get( keyClusGrpIdx );
		}
		else {
			subdictClusGrpIdx = new HashMap< SecureBuffSecClusGrpMembPKey, SecureBuffSecClusGrpMemb >();
			dictByClusGrpIdx.put( keyClusGrpIdx, subdictClusGrpIdx );
		}
		subdictClusGrpIdx.put( pkey, Buff );

		Map< SecureBuffSecClusGrpMembPKey, SecureBuffSecClusGrpMemb > subdictLoginIdx;
		if( dictByLoginIdx.containsKey( keyLoginIdx ) ) {
			subdictLoginIdx = dictByLoginIdx.get( keyLoginIdx );
		}
		else {
			subdictLoginIdx = new HashMap< SecureBuffSecClusGrpMembPKey, SecureBuffSecClusGrpMemb >();
			dictByLoginIdx.put( keyLoginIdx, subdictLoginIdx );
		}
		subdictLoginIdx.put( pkey, Buff );

		if (Buff == null) {
			return( null );
		}
		else {
			int classCode = Buff.getClassCode();
			if (classCode == ISecureSecClusGrpMemb.CLASS_CODE) {
				SecureBuffSecClusGrpMemb retbuff = ((SecureBuffSecClusGrpMemb)(schema.getSecureBuffFactory().getFactorySecClusGrpMemb().newRec()));
				retbuff.set(Buff);
				return( retbuff );
			}
			else {
				throw new CFUnsupportedClassException(getClass(), S_ProcName, "-create-buff-cloning-", (Integer)classCode, "Classcode not recognized: " + Integer.toString(classCode));
			}
		}
	}

	@Override
	public ISecureSecClusGrpMemb readDerived( ISecureAuthorization Authorization,
		ICFKeyHash256 SecClusGrpId,
		String LoginId )
	{
		{	$implCommaIJavaOptAtomType$ testSecClusGrpId = SecClusGrpId;
			if (testSecClusGrpId == null) {
				return( null );
			}
		}
		{	$implCommaIJavaOptAtomType$ testLoginId = LoginId;
			if (testLoginId == null) {
				return( null );
			}
		}
		SecureBuffSecClusGrpMembPKey key = (SecureBuffSecClusGrpMembPKey)(schema.getSecureBuffFactory().getFactorySecClusGrpMemb().newPKey());
		key.setRequiredSecClusGrpId( SecClusGrpId );
		key.setRequiredLoginId( LoginId );
		return( readDerived( Authorization, key ) );
	}

	public ISecureSecClusGrpMemb readDerived( ISecureAuthorization Authorization,
		ISecureSecClusGrpMembPKey PKey )
	{
		final String S_ProcName = "SecureRamSecClusGrpMemb.readDerived";
		SecureBuffSecClusGrpMembPKey key = (SecureBuffSecClusGrpMembPKey)(schema.getSecureBuffFactory().getFactorySecClusGrpMemb().newPKey());
		key.setRequiredSecClusGrpId( PKey.getRequiredSecClusGrpId() );
		key.setRequiredLoginId( PKey.getRequiredLoginId() );
		ISecureSecClusGrpMemb buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	@Override
	public ISecureSecClusGrpMemb lockDerived( ISecureAuthorization Authorization,
		ISecureSecClusGrpMembPKey PKey )
	{
		final String S_ProcName = "SecureRamSecClusGrpMemb.lockDerived";
		SecureBuffSecClusGrpMembPKey key = (SecureBuffSecClusGrpMembPKey)(schema.getSecureBuffFactory().getFactorySecClusGrpMemb().newPKey());
		key.setRequiredSecClusGrpId( PKey.getRequiredSecClusGrpId() );
		key.setRequiredLoginId( PKey.getRequiredLoginId() );
		ISecureSecClusGrpMemb buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	@Override
	public ISecureSecClusGrpMemb[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "SecureRamSecClusGrpMemb.readAllDerived";
		ISecureSecClusGrpMemb[] retList = new ISecureSecClusGrpMemb[ dictByPKey.values().size() ];
		Iterator< SecureBuffSecClusGrpMemb > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	@Override
	public ISecureSecClusGrpMemb[] readDerivedByClusGrpIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 SecClusGrpId )
	{
		final String S_ProcName = "SecureRamSecClusGrpMemb.readDerivedByClusGrpIdx";
		SecureBuffSecClusGrpMembByClusGrpIdxKey key = (SecureBuffSecClusGrpMembByClusGrpIdxKey)schema.getSecureBuffFactory().getFactorySecClusGrpMemb().newByClusGrpIdxKey();

		key.setRequiredSecClusGrpId( SecClusGrpId );
		ISecureSecClusGrpMemb[] recArray;
		if( dictByClusGrpIdx.containsKey( key ) ) {
			Map< SecureBuffSecClusGrpMembPKey, SecureBuffSecClusGrpMemb > subdictClusGrpIdx
				= dictByClusGrpIdx.get( key );
			recArray = new ISecureSecClusGrpMemb[ subdictClusGrpIdx.size() ];
			Iterator< SecureBuffSecClusGrpMemb > iter = subdictClusGrpIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< SecureBuffSecClusGrpMembPKey, SecureBuffSecClusGrpMemb > subdictClusGrpIdx
				= new HashMap< SecureBuffSecClusGrpMembPKey, SecureBuffSecClusGrpMemb >();
			dictByClusGrpIdx.put( key, subdictClusGrpIdx );
			recArray = new ISecureSecClusGrpMemb[0];
		}
		return( recArray );
	}

	@Override
	public ISecureSecClusGrpMemb[] readDerivedByLoginIdx( ISecureAuthorization Authorization,
		String LoginId )
	{
		final String S_ProcName = "SecureRamSecClusGrpMemb.readDerivedByLoginIdx";
		SecureBuffSecClusGrpMembByLoginIdxKey key = (SecureBuffSecClusGrpMembByLoginIdxKey)schema.getSecureBuffFactory().getFactorySecClusGrpMemb().newByLoginIdxKey();

		key.setRequiredLoginId( LoginId );
		ISecureSecClusGrpMemb[] recArray;
		if( dictByLoginIdx.containsKey( key ) ) {
			Map< SecureBuffSecClusGrpMembPKey, SecureBuffSecClusGrpMemb > subdictLoginIdx
				= dictByLoginIdx.get( key );
			recArray = new ISecureSecClusGrpMemb[ subdictLoginIdx.size() ];
			Iterator< SecureBuffSecClusGrpMemb > iter = subdictLoginIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< SecureBuffSecClusGrpMembPKey, SecureBuffSecClusGrpMemb > subdictLoginIdx
				= new HashMap< SecureBuffSecClusGrpMembPKey, SecureBuffSecClusGrpMemb >();
			dictByLoginIdx.put( key, subdictLoginIdx );
			recArray = new ISecureSecClusGrpMemb[0];
		}
		return( recArray );
	}

	@Override
	public ISecureSecClusGrpMemb readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 SecClusGrpId,
		String LoginId )
	{
		final String S_ProcName = "SecureRamSecClusGrpMemb.readDerivedByIdIdx() ";
		SecureBuffSecClusGrpMembPKey key = (SecureBuffSecClusGrpMembPKey)(schema.getSecureBuffFactory().getFactorySecClusGrpMemb().newPKey());
		key.setRequiredSecClusGrpId( SecClusGrpId );
		key.setRequiredLoginId( LoginId );
		ISecureSecClusGrpMemb buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	@Override
	public ISecureSecClusGrpMemb readRec( ISecureAuthorization Authorization,
		ICFKeyHash256 SecClusGrpId,
		String LoginId )
	{
		SecureBuffSecClusGrpMembPKey key = (SecureBuffSecClusGrpMembPKey)(schema.getSecureBuffFactory().getFactorySecClusGrpMemb().newPKey());
		key.setRequiredSecClusGrpId( SecClusGrpId );
		key.setRequiredLoginId( LoginId );
		return( readRec( Authorization, key ) );
	}

	@Override
	public ISecureSecClusGrpMemb readRec( ISecureAuthorization Authorization,
		ISecureSecClusGrpMembPKey PKey )
	{
		final String S_ProcName = "SecureRamSecClusGrpMemb.readRec";
		ISecureSecClusGrpMemb buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( buff.getClassCode() != ISecureSecClusGrpMemb.CLASS_CODE ) ) {
			buff = null;
		}
		return( buff );
	}

	@Override
	public ISecureSecClusGrpMemb lockRec( ISecureAuthorization Authorization,
		ISecureSecClusGrpMembPKey PKey )
	{
		final String S_ProcName = "lockRec";
		ISecureSecClusGrpMemb buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( buff.getClassCode() != ISecureSecClusGrpMemb.CLASS_CODE ) ) {
			buff = null;
		}
		return( buff );
	}

	@Override
	public ISecureSecClusGrpMemb[] readAllRec( ISecureAuthorization Authorization )
	{
		final String S_ProcName = "SecureRamSecClusGrpMemb.readAllRec";
		ISecureSecClusGrpMemb buff;
		ArrayList<ISecureSecClusGrpMemb> filteredList = new ArrayList<ISecureSecClusGrpMemb>();
		ISecureSecClusGrpMemb[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && ( buff.getClassCode() == ISecureSecClusGrpMemb.CLASS_CODE ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new ISecureSecClusGrpMemb[0] ) );
	}

	@Override
	public ISecureSecClusGrpMemb readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 SecClusGrpId,
		String LoginId )
	{
		final String S_ProcName = "SecureRamSecClusGrpMemb.readRecByIdIdx() ";
		ISecureSecClusGrpMemb buff = readDerivedByIdIdx( Authorization,
			SecClusGrpId,
			LoginId );
		if( ( buff != null ) && ( buff.getClassCode() == ISecureSecClusGrpMemb.CLASS_CODE ) ) {
			return( (ISecureSecClusGrpMemb)buff );
		}
		else {
			return( null );
		}
	}

	@Override
	public ISecureSecClusGrpMemb[] readRecByClusGrpIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 SecClusGrpId )
	{
		final String S_ProcName = "SecureRamSecClusGrpMemb.readRecByClusGrpIdx() ";
		ISecureSecClusGrpMemb buff;
		ArrayList<ISecureSecClusGrpMemb> filteredList = new ArrayList<ISecureSecClusGrpMemb>();
		ISecureSecClusGrpMemb[] buffList = readDerivedByClusGrpIdx( Authorization,
			SecClusGrpId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && ( buff.getClassCode() == ISecureSecClusGrpMemb.CLASS_CODE ) ) {
				filteredList.add( (ISecureSecClusGrpMemb)buff );
			}
		}
		return( filteredList.toArray( new ISecureSecClusGrpMemb[0] ) );
	}

	@Override
	public ISecureSecClusGrpMemb[] readRecByLoginIdx( ISecureAuthorization Authorization,
		String LoginId )
	{
		final String S_ProcName = "SecureRamSecClusGrpMemb.readRecByLoginIdx() ";
		ISecureSecClusGrpMemb buff;
		ArrayList<ISecureSecClusGrpMemb> filteredList = new ArrayList<ISecureSecClusGrpMemb>();
		ISecureSecClusGrpMemb[] buffList = readDerivedByLoginIdx( Authorization,
			LoginId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && ( buff.getClassCode() == ISecureSecClusGrpMemb.CLASS_CODE ) ) {
				filteredList.add( (ISecureSecClusGrpMemb)buff );
			}
		}
		return( filteredList.toArray( new ISecureSecClusGrpMemb[0] ) );
	}

	@Override
	public ISecureSecClusGrpMemb updateSecClusGrpMemb( ISecureAuthorization Authorization,
		ISecureSecClusGrpMemb iBuff )
	{
		SecureBuffSecClusGrpMemb Buff = (SecureBuffSecClusGrpMemb)ensureRec(iBuff);
		SecureBuffSecClusGrpMembPKey pkey = (SecureBuffSecClusGrpMembPKey)(schema.getSecureBuffFactory().getFactorySecClusGrpMemb().newPKey());
		pkey = (SecureBuffSecClusGrpMembPKey)Buff.getPKey();
		SecureBuffSecClusGrpMemb existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new CFStaleCacheDetectedException( getClass(),
				"updateSecClusGrpMemb",
				"Existing record not found",
				"Existing record not found",
				"SecClusGrpMemb",
				"SecClusGrpMemb",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new CFCollisionDetectedException( getClass(),
				"updateSecClusGrpMemb",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		SecureBuffSecClusGrpMembByClusGrpIdxKey existingKeyClusGrpIdx = (SecureBuffSecClusGrpMembByClusGrpIdxKey)schema.getSecureBuffFactory().getFactorySecClusGrpMemb().newByClusGrpIdxKey();
		existingKeyClusGrpIdx.setRequiredSecClusGrpId( existing.getRequiredSecClusGrpId() );

		SecureBuffSecClusGrpMembByClusGrpIdxKey newKeyClusGrpIdx = (SecureBuffSecClusGrpMembByClusGrpIdxKey)schema.getSecureBuffFactory().getFactorySecClusGrpMemb().newByClusGrpIdxKey();
		newKeyClusGrpIdx.setRequiredSecClusGrpId( Buff.getRequiredSecClusGrpId() );

		SecureBuffSecClusGrpMembByLoginIdxKey existingKeyLoginIdx = (SecureBuffSecClusGrpMembByLoginIdxKey)schema.getSecureBuffFactory().getFactorySecClusGrpMemb().newByLoginIdxKey();
		existingKeyLoginIdx.setRequiredLoginId( existing.getRequiredLoginId() );

		SecureBuffSecClusGrpMembByLoginIdxKey newKeyLoginIdx = (SecureBuffSecClusGrpMembByLoginIdxKey)schema.getSecureBuffFactory().getFactorySecClusGrpMemb().newByLoginIdxKey();
		newKeyLoginIdx.setRequiredLoginId( Buff.getRequiredLoginId() );

		// Check unique indexes

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableSecClusGrp().readDerivedByIdIdx( Authorization,
						Buff.getRequiredSecClusGrpId() ) )
				{
					throw new CFUnresolvedRelationException( getClass(),
						"updateSecClusGrpMemb",
						"Container",
						"Container",
						"SecClusGrpMembGroup",
						"SecClusGrpMembGroup",
						"SecClusGrp",
						"SecClusGrp",
						null );
				}
			}
		}

		// Update is valid

		Map< SecureBuffSecClusGrpMembPKey, SecureBuffSecClusGrpMemb > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByClusGrpIdx.get( existingKeyClusGrpIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByClusGrpIdx.containsKey( newKeyClusGrpIdx ) ) {
			subdict = dictByClusGrpIdx.get( newKeyClusGrpIdx );
		}
		else {
			subdict = new HashMap< SecureBuffSecClusGrpMembPKey, SecureBuffSecClusGrpMemb >();
			dictByClusGrpIdx.put( newKeyClusGrpIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByLoginIdx.get( existingKeyLoginIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByLoginIdx.containsKey( newKeyLoginIdx ) ) {
			subdict = dictByLoginIdx.get( newKeyLoginIdx );
		}
		else {
			subdict = new HashMap< SecureBuffSecClusGrpMembPKey, SecureBuffSecClusGrpMemb >();
			dictByLoginIdx.put( newKeyLoginIdx, subdict );
		}
		subdict.put( pkey, Buff );

		return(Buff);
	}

	@Override
	public void deleteSecClusGrpMemb( ISecureAuthorization Authorization,
		ISecureSecClusGrpMemb iBuff )
	{
		final String S_ProcName = "SecureRamSecClusGrpMembTable.deleteSecClusGrpMemb() ";
		SecureBuffSecClusGrpMemb Buff = (SecureBuffSecClusGrpMemb)ensureRec(iBuff);
		int classCode;
		SecureBuffSecClusGrpMembPKey pkey = (SecureBuffSecClusGrpMembPKey)(Buff.getPKey());
		SecureBuffSecClusGrpMemb existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new CFCollisionDetectedException( getClass(),
				"deleteSecClusGrpMemb",
				pkey );
		}
		SecureBuffSecClusGrpMembByClusGrpIdxKey keyClusGrpIdx = (SecureBuffSecClusGrpMembByClusGrpIdxKey)schema.getSecureBuffFactory().getFactorySecClusGrpMemb().newByClusGrpIdxKey();
		keyClusGrpIdx.setRequiredSecClusGrpId( existing.getRequiredSecClusGrpId() );

		SecureBuffSecClusGrpMembByLoginIdxKey keyLoginIdx = (SecureBuffSecClusGrpMembByLoginIdxKey)schema.getSecureBuffFactory().getFactorySecClusGrpMemb().newByLoginIdxKey();
		keyLoginIdx.setRequiredLoginId( existing.getRequiredLoginId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< SecureBuffSecClusGrpMembPKey, SecureBuffSecClusGrpMemb > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByClusGrpIdx.get( keyClusGrpIdx );
		subdict.remove( pkey );

		subdict = dictByLoginIdx.get( keyLoginIdx );
		subdict.remove( pkey );

	}
	@Override
	public void deleteSecClusGrpMembByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 SecClusGrpId,
		String LoginId )
	{
		SecureBuffSecClusGrpMembPKey key = (SecureBuffSecClusGrpMembPKey)(schema.getSecureBuffFactory().getFactorySecClusGrpMemb().newPKey());
		key.setRequiredSecClusGrpId( SecClusGrpId );
		key.setRequiredLoginId( LoginId );
		deleteSecClusGrpMembByIdIdx( Authorization, key );
	}

	@Override
	public void deleteSecClusGrpMembByIdIdx( ISecureAuthorization Authorization,
		ISecureSecClusGrpMembPKey PKey )
	{
		SecureBuffSecClusGrpMembPKey key = (SecureBuffSecClusGrpMembPKey)(schema.getSecureBuffFactory().getFactorySecClusGrpMemb().newPKey());
		key.setRequiredSecClusGrpId( PKey.getRequiredSecClusGrpId() );
		key.setRequiredLoginId( PKey.getRequiredLoginId() );
		SecureBuffSecClusGrpMembPKey argKey = key;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		SecureBuffSecClusGrpMemb cur;
		LinkedList<SecureBuffSecClusGrpMemb> matchSet = new LinkedList<SecureBuffSecClusGrpMemb>();
		Iterator<SecureBuffSecClusGrpMemb> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<SecureBuffSecClusGrpMemb> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = (SecureBuffSecClusGrpMemb)(schema.getTableSecClusGrpMemb().readDerivedByIdIdx( Authorization,
				cur.getRequiredSecClusGrpId(),
				cur.getRequiredLoginId() ));
			deleteSecClusGrpMemb( Authorization, cur );
		}
	}

	@Override
	public void deleteSecClusGrpMembByClusGrpIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecClusGrpId )
	{
		SecureBuffSecClusGrpMembByClusGrpIdxKey key = (SecureBuffSecClusGrpMembByClusGrpIdxKey)schema.getSecureBuffFactory().getFactorySecClusGrpMemb().newByClusGrpIdxKey();
		key.setRequiredSecClusGrpId( argSecClusGrpId );
		deleteSecClusGrpMembByClusGrpIdx( Authorization, key );
	}

	@Override
	public void deleteSecClusGrpMembByClusGrpIdx( ISecureAuthorization Authorization,
		ISecureSecClusGrpMembByClusGrpIdxKey argKey )
	{
		SecureBuffSecClusGrpMemb cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<SecureBuffSecClusGrpMemb> matchSet = new LinkedList<SecureBuffSecClusGrpMemb>();
		Iterator<SecureBuffSecClusGrpMemb> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<SecureBuffSecClusGrpMemb> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = (SecureBuffSecClusGrpMemb)(schema.getTableSecClusGrpMemb().readDerivedByIdIdx( Authorization,
				cur.getRequiredSecClusGrpId(),
				cur.getRequiredLoginId() ));
			deleteSecClusGrpMemb( Authorization, cur );
		}
	}

	@Override
	public void deleteSecClusGrpMembByLoginIdx( ISecureAuthorization Authorization,
		String argLoginId )
	{
		SecureBuffSecClusGrpMembByLoginIdxKey key = (SecureBuffSecClusGrpMembByLoginIdxKey)schema.getSecureBuffFactory().getFactorySecClusGrpMemb().newByLoginIdxKey();
		key.setRequiredLoginId( argLoginId );
		deleteSecClusGrpMembByLoginIdx( Authorization, key );
	}

	@Override
	public void deleteSecClusGrpMembByLoginIdx( ISecureAuthorization Authorization,
		ISecureSecClusGrpMembByLoginIdxKey argKey )
	{
		SecureBuffSecClusGrpMemb cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<SecureBuffSecClusGrpMemb> matchSet = new LinkedList<SecureBuffSecClusGrpMemb>();
		Iterator<SecureBuffSecClusGrpMemb> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<SecureBuffSecClusGrpMemb> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = (SecureBuffSecClusGrpMemb)(schema.getTableSecClusGrpMemb().readDerivedByIdIdx( Authorization,
				cur.getRequiredSecClusGrpId(),
				cur.getRequiredLoginId() ));
			deleteSecClusGrpMemb( Authorization, cur );
		}
	}
}
