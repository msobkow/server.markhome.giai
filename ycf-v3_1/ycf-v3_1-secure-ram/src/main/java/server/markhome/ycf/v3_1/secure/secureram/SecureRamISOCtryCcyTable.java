
// Description: Java 25 in-memory RAM DbIO implementation for ISOCtryCcy.

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
 *	SecureRamISOCtryCcyTable in-memory RAM DbIO implementation
 *	for ISOCtryCcy.
 */
public class SecureRamISOCtryCcyTable
	implements ISecureISOCtryCcyTable
{
	private ISecureSchema schema;
	private Map< ISecureISOCtryCcyPKey,
				SecureBuffISOCtryCcy > dictByPKey
		= new HashMap< ISecureISOCtryCcyPKey,
				SecureBuffISOCtryCcy >();
	private Map< SecureBuffISOCtryCcyByCtryIdxKey,
				Map< SecureBuffISOCtryCcyPKey,
					SecureBuffISOCtryCcy >> dictByCtryIdx
		= new HashMap< SecureBuffISOCtryCcyByCtryIdxKey,
				Map< SecureBuffISOCtryCcyPKey,
					SecureBuffISOCtryCcy >>();
	private Map< SecureBuffISOCtryCcyByCcyIdxKey,
				Map< SecureBuffISOCtryCcyPKey,
					SecureBuffISOCtryCcy >> dictByCcyIdx
		= new HashMap< SecureBuffISOCtryCcyByCcyIdxKey,
				Map< SecureBuffISOCtryCcyPKey,
					SecureBuffISOCtryCcy >>();

	public SecureRamISOCtryCcyTable( ISecureSchema argSchema ) {
		schema = argSchema;
	}

	public SecureBuffISOCtryCcy ensureRec(ISecureISOCtryCcy rec) {
		return (((SecureBuffISOCtryCcyFactoryService)(schema.getSecureBuffFactory().getFactoryISOCtryCcy())).ensureRec(rec));
	}

	@Override
	public ISecureISOCtryCcy createISOCtryCcy( ISecureAuthorization Authorization,
		ISecureISOCtryCcy iBuff )
	{
		final String S_ProcName = "createISOCtryCcy";
		
		SecureBuffISOCtryCcy Buff = (SecureBuffISOCtryCcy)ensureRec(iBuff);
		SecureBuffISOCtryCcyPKey pkey = (SecureBuffISOCtryCcyPKey)(schema.getSecureBuffFactory().getFactoryISOCtryCcy().newPKey());
		pkey.setRequiredISOCtryId(Buff.getRequiredISOCtryId());
		pkey.setRequiredISOCcyId(Buff.getRequiredISOCcyId());
		pkey.setRequiredISOCtryId( Buff.getRequiredISOCtryId() );
		pkey.setRequiredISOCcyId( Buff.getRequiredISOCcyId() );
		Buff.setRequiredContainerCtry( pkey.getRequiredISOCtryId() );
		Buff.setRequiredParentCcy( pkey.getRequiredISOCcyId() );
		Buff.setRequiredISOCtryId( pkey.getRequiredISOCtryId() );
		Buff.setRequiredISOCcyId( pkey.getRequiredISOCcyId() );
		SecureBuffISOCtryCcyByCtryIdxKey keyCtryIdx = (SecureBuffISOCtryCcyByCtryIdxKey)schema.getSecureBuffFactory().getFactoryISOCtryCcy().newByCtryIdxKey();
		keyCtryIdx.setRequiredISOCtryId( Buff.getRequiredISOCtryId() );

		SecureBuffISOCtryCcyByCcyIdxKey keyCcyIdx = (SecureBuffISOCtryCcyByCcyIdxKey)schema.getSecureBuffFactory().getFactoryISOCtryCcy().newByCcyIdxKey();
		keyCcyIdx.setRequiredISOCcyId( Buff.getRequiredISOCcyId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new CFPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		// Validate foreign keys

		{
			boolean allNull = true;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableISOCtry().readDerivedByIdIdx( Authorization,
						Buff.getRequiredISOCtryId() ) )
				{
					throw new CFUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"Container",
						"ISOCtryCcyCtry",
						"ISOCtryCcyCtry",
						"ISOCtry",
						"ISOCtry",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< SecureBuffISOCtryCcyPKey, SecureBuffISOCtryCcy > subdictCtryIdx;
		if( dictByCtryIdx.containsKey( keyCtryIdx ) ) {
			subdictCtryIdx = dictByCtryIdx.get( keyCtryIdx );
		}
		else {
			subdictCtryIdx = new HashMap< SecureBuffISOCtryCcyPKey, SecureBuffISOCtryCcy >();
			dictByCtryIdx.put( keyCtryIdx, subdictCtryIdx );
		}
		subdictCtryIdx.put( pkey, Buff );

		Map< SecureBuffISOCtryCcyPKey, SecureBuffISOCtryCcy > subdictCcyIdx;
		if( dictByCcyIdx.containsKey( keyCcyIdx ) ) {
			subdictCcyIdx = dictByCcyIdx.get( keyCcyIdx );
		}
		else {
			subdictCcyIdx = new HashMap< SecureBuffISOCtryCcyPKey, SecureBuffISOCtryCcy >();
			dictByCcyIdx.put( keyCcyIdx, subdictCcyIdx );
		}
		subdictCcyIdx.put( pkey, Buff );

		if (Buff == null) {
			return( null );
		}
		else {
			int classCode = Buff.getClassCode();
			if (classCode == ISecureISOCtryCcy.CLASS_CODE) {
				SecureBuffISOCtryCcy retbuff = ((SecureBuffISOCtryCcy)(schema.getSecureBuffFactory().getFactoryISOCtryCcy().newRec()));
				retbuff.set(Buff);
				return( retbuff );
			}
			else {
				throw new CFUnsupportedClassException(getClass(), S_ProcName, "-create-buff-cloning-", (Integer)classCode, "Classcode not recognized: " + Integer.toString(classCode));
			}
		}
	}

	@Override
	public ISecureISOCtryCcy readDerived( ISecureAuthorization Authorization,
		short ISOCtryId,
		short ISOCcyId )
	{
		{	$implCommaIJavaOptAtomType$ testISOCtryId = ISOCtryId;
			if (testISOCtryId == null) {
				return( null );
			}
		}
		{	$implCommaIJavaOptAtomType$ testISOCcyId = ISOCcyId;
			if (testISOCcyId == null) {
				return( null );
			}
		}
		SecureBuffISOCtryCcyPKey key = (SecureBuffISOCtryCcyPKey)(schema.getSecureBuffFactory().getFactoryISOCtryCcy().newPKey());
		key.setRequiredISOCtryId( ISOCtryId );
		key.setRequiredISOCcyId( ISOCcyId );
		return( readDerived( Authorization, key ) );
	}

	public ISecureISOCtryCcy readDerived( ISecureAuthorization Authorization,
		ISecureISOCtryCcyPKey PKey )
	{
		final String S_ProcName = "SecureRamISOCtryCcy.readDerived";
		SecureBuffISOCtryCcyPKey key = (SecureBuffISOCtryCcyPKey)(schema.getSecureBuffFactory().getFactoryISOCtryCcy().newPKey());
		key.setRequiredISOCtryId( PKey.getRequiredISOCtryId() );
		key.setRequiredISOCcyId( PKey.getRequiredISOCcyId() );
		ISecureISOCtryCcy buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	@Override
	public ISecureISOCtryCcy lockDerived( ISecureAuthorization Authorization,
		ISecureISOCtryCcyPKey PKey )
	{
		final String S_ProcName = "SecureRamISOCtryCcy.lockDerived";
		SecureBuffISOCtryCcyPKey key = (SecureBuffISOCtryCcyPKey)(schema.getSecureBuffFactory().getFactoryISOCtryCcy().newPKey());
		key.setRequiredISOCtryId( PKey.getRequiredISOCtryId() );
		key.setRequiredISOCcyId( PKey.getRequiredISOCcyId() );
		ISecureISOCtryCcy buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	@Override
	public ISecureISOCtryCcy[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "SecureRamISOCtryCcy.readAllDerived";
		ISecureISOCtryCcy[] retList = new ISecureISOCtryCcy[ dictByPKey.values().size() ];
		Iterator< SecureBuffISOCtryCcy > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	@Override
	public ISecureISOCtryCcy[] readDerivedByCtryIdx( ISecureAuthorization Authorization,
		short ISOCtryId )
	{
		final String S_ProcName = "SecureRamISOCtryCcy.readDerivedByCtryIdx";
		SecureBuffISOCtryCcyByCtryIdxKey key = (SecureBuffISOCtryCcyByCtryIdxKey)schema.getSecureBuffFactory().getFactoryISOCtryCcy().newByCtryIdxKey();

		key.setRequiredISOCtryId( ISOCtryId );
		ISecureISOCtryCcy[] recArray;
		if( dictByCtryIdx.containsKey( key ) ) {
			Map< SecureBuffISOCtryCcyPKey, SecureBuffISOCtryCcy > subdictCtryIdx
				= dictByCtryIdx.get( key );
			recArray = new ISecureISOCtryCcy[ subdictCtryIdx.size() ];
			Iterator< SecureBuffISOCtryCcy > iter = subdictCtryIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< SecureBuffISOCtryCcyPKey, SecureBuffISOCtryCcy > subdictCtryIdx
				= new HashMap< SecureBuffISOCtryCcyPKey, SecureBuffISOCtryCcy >();
			dictByCtryIdx.put( key, subdictCtryIdx );
			recArray = new ISecureISOCtryCcy[0];
		}
		return( recArray );
	}

	@Override
	public ISecureISOCtryCcy[] readDerivedByCcyIdx( ISecureAuthorization Authorization,
		short ISOCcyId )
	{
		final String S_ProcName = "SecureRamISOCtryCcy.readDerivedByCcyIdx";
		SecureBuffISOCtryCcyByCcyIdxKey key = (SecureBuffISOCtryCcyByCcyIdxKey)schema.getSecureBuffFactory().getFactoryISOCtryCcy().newByCcyIdxKey();

		key.setRequiredISOCcyId( ISOCcyId );
		ISecureISOCtryCcy[] recArray;
		if( dictByCcyIdx.containsKey( key ) ) {
			Map< SecureBuffISOCtryCcyPKey, SecureBuffISOCtryCcy > subdictCcyIdx
				= dictByCcyIdx.get( key );
			recArray = new ISecureISOCtryCcy[ subdictCcyIdx.size() ];
			Iterator< SecureBuffISOCtryCcy > iter = subdictCcyIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< SecureBuffISOCtryCcyPKey, SecureBuffISOCtryCcy > subdictCcyIdx
				= new HashMap< SecureBuffISOCtryCcyPKey, SecureBuffISOCtryCcy >();
			dictByCcyIdx.put( key, subdictCcyIdx );
			recArray = new ISecureISOCtryCcy[0];
		}
		return( recArray );
	}

	@Override
	public ISecureISOCtryCcy readDerivedByIdIdx( ISecureAuthorization Authorization,
		short ISOCtryId,
		short ISOCcyId )
	{
		final String S_ProcName = "SecureRamISOCtryCcy.readDerivedByIdIdx() ";
		SecureBuffISOCtryCcyPKey key = (SecureBuffISOCtryCcyPKey)(schema.getSecureBuffFactory().getFactoryISOCtryCcy().newPKey());
		key.setRequiredISOCtryId( ISOCtryId );
		key.setRequiredISOCcyId( ISOCcyId );
		ISecureISOCtryCcy buff;
		if( dictByPKey.containsKey( key ) ) {
			buff = dictByPKey.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	@Override
	public ISecureISOCtryCcy readRec( ISecureAuthorization Authorization,
		short ISOCtryId,
		short ISOCcyId )
	{
		SecureBuffISOCtryCcyPKey key = (SecureBuffISOCtryCcyPKey)(schema.getSecureBuffFactory().getFactoryISOCtryCcy().newPKey());
		key.setRequiredISOCtryId( ISOCtryId );
		key.setRequiredISOCcyId( ISOCcyId );
		return( readRec( Authorization, key ) );
	}

	@Override
	public ISecureISOCtryCcy readRec( ISecureAuthorization Authorization,
		ISecureISOCtryCcyPKey PKey )
	{
		final String S_ProcName = "SecureRamISOCtryCcy.readRec";
		ISecureISOCtryCcy buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( buff.getClassCode() != ISecureISOCtryCcy.CLASS_CODE ) ) {
			buff = null;
		}
		return( buff );
	}

	@Override
	public ISecureISOCtryCcy lockRec( ISecureAuthorization Authorization,
		ISecureISOCtryCcyPKey PKey )
	{
		final String S_ProcName = "lockRec";
		ISecureISOCtryCcy buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( buff.getClassCode() != ISecureISOCtryCcy.CLASS_CODE ) ) {
			buff = null;
		}
		return( buff );
	}

	@Override
	public ISecureISOCtryCcy[] readAllRec( ISecureAuthorization Authorization )
	{
		final String S_ProcName = "SecureRamISOCtryCcy.readAllRec";
		ISecureISOCtryCcy buff;
		ArrayList<ISecureISOCtryCcy> filteredList = new ArrayList<ISecureISOCtryCcy>();
		ISecureISOCtryCcy[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && ( buff.getClassCode() == ISecureISOCtryCcy.CLASS_CODE ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new ISecureISOCtryCcy[0] ) );
	}

	@Override
	public ISecureISOCtryCcy readRecByIdIdx( ISecureAuthorization Authorization,
		short ISOCtryId,
		short ISOCcyId )
	{
		final String S_ProcName = "SecureRamISOCtryCcy.readRecByIdIdx() ";
		ISecureISOCtryCcy buff = readDerivedByIdIdx( Authorization,
			ISOCtryId,
			ISOCcyId );
		if( ( buff != null ) && ( buff.getClassCode() == ISecureISOCtryCcy.CLASS_CODE ) ) {
			return( (ISecureISOCtryCcy)buff );
		}
		else {
			return( null );
		}
	}

	@Override
	public ISecureISOCtryCcy[] readRecByCtryIdx( ISecureAuthorization Authorization,
		short ISOCtryId )
	{
		final String S_ProcName = "SecureRamISOCtryCcy.readRecByCtryIdx() ";
		ISecureISOCtryCcy buff;
		ArrayList<ISecureISOCtryCcy> filteredList = new ArrayList<ISecureISOCtryCcy>();
		ISecureISOCtryCcy[] buffList = readDerivedByCtryIdx( Authorization,
			ISOCtryId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && ( buff.getClassCode() == ISecureISOCtryCcy.CLASS_CODE ) ) {
				filteredList.add( (ISecureISOCtryCcy)buff );
			}
		}
		return( filteredList.toArray( new ISecureISOCtryCcy[0] ) );
	}

	@Override
	public ISecureISOCtryCcy[] readRecByCcyIdx( ISecureAuthorization Authorization,
		short ISOCcyId )
	{
		final String S_ProcName = "SecureRamISOCtryCcy.readRecByCcyIdx() ";
		ISecureISOCtryCcy buff;
		ArrayList<ISecureISOCtryCcy> filteredList = new ArrayList<ISecureISOCtryCcy>();
		ISecureISOCtryCcy[] buffList = readDerivedByCcyIdx( Authorization,
			ISOCcyId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && ( buff.getClassCode() == ISecureISOCtryCcy.CLASS_CODE ) ) {
				filteredList.add( (ISecureISOCtryCcy)buff );
			}
		}
		return( filteredList.toArray( new ISecureISOCtryCcy[0] ) );
	}

	@Override
	public ISecureISOCtryCcy updateISOCtryCcy( ISecureAuthorization Authorization,
		ISecureISOCtryCcy iBuff )
	{
		SecureBuffISOCtryCcy Buff = (SecureBuffISOCtryCcy)ensureRec(iBuff);
		SecureBuffISOCtryCcyPKey pkey = (SecureBuffISOCtryCcyPKey)(schema.getSecureBuffFactory().getFactoryISOCtryCcy().newPKey());
		pkey = (SecureBuffISOCtryCcyPKey)Buff.getPKey();
		SecureBuffISOCtryCcy existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new CFStaleCacheDetectedException( getClass(),
				"updateISOCtryCcy",
				"Existing record not found",
				"Existing record not found",
				"ISOCtryCcy",
				"ISOCtryCcy",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new CFCollisionDetectedException( getClass(),
				"updateISOCtryCcy",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		SecureBuffISOCtryCcyByCtryIdxKey existingKeyCtryIdx = (SecureBuffISOCtryCcyByCtryIdxKey)schema.getSecureBuffFactory().getFactoryISOCtryCcy().newByCtryIdxKey();
		existingKeyCtryIdx.setRequiredISOCtryId( existing.getRequiredISOCtryId() );

		SecureBuffISOCtryCcyByCtryIdxKey newKeyCtryIdx = (SecureBuffISOCtryCcyByCtryIdxKey)schema.getSecureBuffFactory().getFactoryISOCtryCcy().newByCtryIdxKey();
		newKeyCtryIdx.setRequiredISOCtryId( Buff.getRequiredISOCtryId() );

		SecureBuffISOCtryCcyByCcyIdxKey existingKeyCcyIdx = (SecureBuffISOCtryCcyByCcyIdxKey)schema.getSecureBuffFactory().getFactoryISOCtryCcy().newByCcyIdxKey();
		existingKeyCcyIdx.setRequiredISOCcyId( existing.getRequiredISOCcyId() );

		SecureBuffISOCtryCcyByCcyIdxKey newKeyCcyIdx = (SecureBuffISOCtryCcyByCcyIdxKey)schema.getSecureBuffFactory().getFactoryISOCtryCcy().newByCcyIdxKey();
		newKeyCcyIdx.setRequiredISOCcyId( Buff.getRequiredISOCcyId() );

		// Check unique indexes

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableISOCtry().readDerivedByIdIdx( Authorization,
						Buff.getRequiredISOCtryId() ) )
				{
					throw new CFUnresolvedRelationException( getClass(),
						"updateISOCtryCcy",
						"Container",
						"Container",
						"ISOCtryCcyCtry",
						"ISOCtryCcyCtry",
						"ISOCtry",
						"ISOCtry",
						null );
				}
			}
		}

		// Update is valid

		Map< SecureBuffISOCtryCcyPKey, SecureBuffISOCtryCcy > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByCtryIdx.get( existingKeyCtryIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByCtryIdx.containsKey( newKeyCtryIdx ) ) {
			subdict = dictByCtryIdx.get( newKeyCtryIdx );
		}
		else {
			subdict = new HashMap< SecureBuffISOCtryCcyPKey, SecureBuffISOCtryCcy >();
			dictByCtryIdx.put( newKeyCtryIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByCcyIdx.get( existingKeyCcyIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByCcyIdx.containsKey( newKeyCcyIdx ) ) {
			subdict = dictByCcyIdx.get( newKeyCcyIdx );
		}
		else {
			subdict = new HashMap< SecureBuffISOCtryCcyPKey, SecureBuffISOCtryCcy >();
			dictByCcyIdx.put( newKeyCcyIdx, subdict );
		}
		subdict.put( pkey, Buff );

		return(Buff);
	}

	@Override
	public void deleteISOCtryCcy( ISecureAuthorization Authorization,
		ISecureISOCtryCcy iBuff )
	{
		final String S_ProcName = "SecureRamISOCtryCcyTable.deleteISOCtryCcy() ";
		SecureBuffISOCtryCcy Buff = (SecureBuffISOCtryCcy)ensureRec(iBuff);
		int classCode;
		SecureBuffISOCtryCcyPKey pkey = (SecureBuffISOCtryCcyPKey)(Buff.getPKey());
		SecureBuffISOCtryCcy existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new CFCollisionDetectedException( getClass(),
				"deleteISOCtryCcy",
				pkey );
		}
		SecureBuffISOCtryCcyByCtryIdxKey keyCtryIdx = (SecureBuffISOCtryCcyByCtryIdxKey)schema.getSecureBuffFactory().getFactoryISOCtryCcy().newByCtryIdxKey();
		keyCtryIdx.setRequiredISOCtryId( existing.getRequiredISOCtryId() );

		SecureBuffISOCtryCcyByCcyIdxKey keyCcyIdx = (SecureBuffISOCtryCcyByCcyIdxKey)schema.getSecureBuffFactory().getFactoryISOCtryCcy().newByCcyIdxKey();
		keyCcyIdx.setRequiredISOCcyId( existing.getRequiredISOCcyId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< SecureBuffISOCtryCcyPKey, SecureBuffISOCtryCcy > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByCtryIdx.get( keyCtryIdx );
		subdict.remove( pkey );

		subdict = dictByCcyIdx.get( keyCcyIdx );
		subdict.remove( pkey );

	}
	@Override
	public void deleteISOCtryCcyByIdIdx( ISecureAuthorization Authorization,
		short ISOCtryId,
		short ISOCcyId )
	{
		SecureBuffISOCtryCcyPKey key = (SecureBuffISOCtryCcyPKey)(schema.getSecureBuffFactory().getFactoryISOCtryCcy().newPKey());
		key.setRequiredISOCtryId( ISOCtryId );
		key.setRequiredISOCcyId( ISOCcyId );
		deleteISOCtryCcyByIdIdx( Authorization, key );
	}

	@Override
	public void deleteISOCtryCcyByIdIdx( ISecureAuthorization Authorization,
		ISecureISOCtryCcyPKey PKey )
	{
		SecureBuffISOCtryCcyPKey key = (SecureBuffISOCtryCcyPKey)(schema.getSecureBuffFactory().getFactoryISOCtryCcy().newPKey());
		key.setRequiredISOCtryId( PKey.getRequiredISOCtryId() );
		key.setRequiredISOCcyId( PKey.getRequiredISOCcyId() );
		SecureBuffISOCtryCcyPKey argKey = key;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		SecureBuffISOCtryCcy cur;
		LinkedList<SecureBuffISOCtryCcy> matchSet = new LinkedList<SecureBuffISOCtryCcy>();
		Iterator<SecureBuffISOCtryCcy> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<SecureBuffISOCtryCcy> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = (SecureBuffISOCtryCcy)(schema.getTableISOCtryCcy().readDerivedByIdIdx( Authorization,
				cur.getRequiredISOCtryId(),
				cur.getRequiredISOCcyId() ));
			deleteISOCtryCcy( Authorization, cur );
		}
	}

	@Override
	public void deleteISOCtryCcyByCtryIdx( ISecureAuthorization Authorization,
		short argISOCtryId )
	{
		SecureBuffISOCtryCcyByCtryIdxKey key = (SecureBuffISOCtryCcyByCtryIdxKey)schema.getSecureBuffFactory().getFactoryISOCtryCcy().newByCtryIdxKey();
		key.setRequiredISOCtryId( argISOCtryId );
		deleteISOCtryCcyByCtryIdx( Authorization, key );
	}

	@Override
	public void deleteISOCtryCcyByCtryIdx( ISecureAuthorization Authorization,
		ISecureISOCtryCcyByCtryIdxKey argKey )
	{
		SecureBuffISOCtryCcy cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<SecureBuffISOCtryCcy> matchSet = new LinkedList<SecureBuffISOCtryCcy>();
		Iterator<SecureBuffISOCtryCcy> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<SecureBuffISOCtryCcy> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = (SecureBuffISOCtryCcy)(schema.getTableISOCtryCcy().readDerivedByIdIdx( Authorization,
				cur.getRequiredISOCtryId(),
				cur.getRequiredISOCcyId() ));
			deleteISOCtryCcy( Authorization, cur );
		}
	}

	@Override
	public void deleteISOCtryCcyByCcyIdx( ISecureAuthorization Authorization,
		short argISOCcyId )
	{
		SecureBuffISOCtryCcyByCcyIdxKey key = (SecureBuffISOCtryCcyByCcyIdxKey)schema.getSecureBuffFactory().getFactoryISOCtryCcy().newByCcyIdxKey();
		key.setRequiredISOCcyId( argISOCcyId );
		deleteISOCtryCcyByCcyIdx( Authorization, key );
	}

	@Override
	public void deleteISOCtryCcyByCcyIdx( ISecureAuthorization Authorization,
		ISecureISOCtryCcyByCcyIdxKey argKey )
	{
		SecureBuffISOCtryCcy cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<SecureBuffISOCtryCcy> matchSet = new LinkedList<SecureBuffISOCtryCcy>();
		Iterator<SecureBuffISOCtryCcy> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<SecureBuffISOCtryCcy> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = (SecureBuffISOCtryCcy)(schema.getTableISOCtryCcy().readDerivedByIdIdx( Authorization,
				cur.getRequiredISOCtryId(),
				cur.getRequiredISOCcyId() ));
			deleteISOCtryCcy( Authorization, cur );
		}
	}
}
