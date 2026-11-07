
// Description: Java 25 in-memory RAM DbIO implementation for URLProtocol.

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

package server.markhome.ycf.v3_1.intnet.intnetram;

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
 *	IntNetRamURLProtocolTable in-memory RAM DbIO implementation
 *	for URLProtocol.
 */
public class IntNetRamURLProtocolTable
	implements IIntNetURLProtocolTable
{
	private IIntNetSchema schema;
	private Map< $implCommaIJavaOptAtomType$,
				IntNetBuffURLProtocol > dictByPKey
		= new HashMap< $implCommaIJavaOptAtomType$,
				IntNetBuffURLProtocol >();
	private Map< IntNetBuffURLProtocolByUNameIdxKey,
			IntNetBuffURLProtocol > dictByUNameIdx
		= new HashMap< IntNetBuffURLProtocolByUNameIdxKey,
			IntNetBuffURLProtocol >();
	private Map< IntNetBuffURLProtocolByIsSecureIdxKey,
				Map< $implCommaIJavaOptAtomType$,
					IntNetBuffURLProtocol >> dictByIsSecureIdx
		= new HashMap< IntNetBuffURLProtocolByIsSecureIdxKey,
				Map< $implCommaIJavaOptAtomType$,
					IntNetBuffURLProtocol >>();

	public IntNetRamURLProtocolTable( IIntNetSchema argSchema ) {
		schema = argSchema;
	}

	public IntNetBuffURLProtocol ensureRec(IIntNetURLProtocol rec) {
		return (((IntNetBuffURLProtocolFactoryService)(schema.getIntNetBuffFactory().getFactoryURLProtocol())).ensureRec(rec));
	}

	@Override
	public IIntNetURLProtocol createURLProtocol( ISecureAuthorization Authorization,
		IIntNetURLProtocol iBuff )
	{
		final String S_ProcName = "createURLProtocol";
		
		IntNetBuffURLProtocol Buff = (IntNetBuffURLProtocol)ensureRec(iBuff);
		$implCommaIJavaOptAtomType$ pkey;
		pkey = schema.nextURLProtocolIdGen();
		Buff.setRequiredURLProtocolId( pkey );
		IntNetBuffURLProtocolByUNameIdxKey keyUNameIdx = (IntNetBuffURLProtocolByUNameIdxKey)schema.getIntNetBuffFactory().getFactoryURLProtocol().newByUNameIdxKey();
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		IntNetBuffURLProtocolByIsSecureIdxKey keyIsSecureIdx = (IntNetBuffURLProtocolByIsSecureIdxKey)schema.getIntNetBuffFactory().getFactoryURLProtocol().newByIsSecureIdxKey();
		keyIsSecureIdx.setRequiredIsSecure( Buff.getRequiredIsSecure() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new CFPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new CFUniqueIndexViolationException( getClass(),
				S_ProcName,
				"URLProtocolUNameIdx",
				"URLProtocolUNameIdx",
				keyUNameIdx );
		}

		// Validate foreign keys

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

		Map< $implCommaIJavaOptAtomType$, IntNetBuffURLProtocol > subdictIsSecureIdx;
		if( dictByIsSecureIdx.containsKey( keyIsSecureIdx ) ) {
			subdictIsSecureIdx = dictByIsSecureIdx.get( keyIsSecureIdx );
		}
		else {
			subdictIsSecureIdx = new HashMap< $implCommaIJavaOptAtomType$, IntNetBuffURLProtocol >();
			dictByIsSecureIdx.put( keyIsSecureIdx, subdictIsSecureIdx );
		}
		subdictIsSecureIdx.put( pkey, Buff );

		if (Buff == null) {
			return( null );
		}
		else {
			int classCode = Buff.getClassCode();
			if (classCode == IIntNetURLProtocol.CLASS_CODE) {
				IntNetBuffURLProtocol retbuff = ((IntNetBuffURLProtocol)(schema.getIntNetBuffFactory().getFactoryURLProtocol().newRec()));
				retbuff.set(Buff);
				return( retbuff );
			}
			else {
				throw new CFUnsupportedClassException(getClass(), S_ProcName, "-create-buff-cloning-", (Integer)classCode, "Classcode not recognized: " + Integer.toString(classCode));
			}
		}
	}

	@Override
	public IIntNetURLProtocol readDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "IntNetRamURLProtocol.readDerived";
		IIntNetURLProtocol buff;
		if( PKey == null ) {
			return( null );
		}
		if( dictByPKey.containsKey( PKey ) ) {
			buff = dictByPKey.get( PKey );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	@Override
	public IIntNetURLProtocol lockDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "IntNetRamURLProtocol.lockDerived";
		IIntNetURLProtocol buff;
		if( dictByPKey.containsKey( PKey ) ) {
			buff = dictByPKey.get( PKey );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	@Override
	public IIntNetURLProtocol[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "IntNetRamURLProtocol.readAllDerived";
		IIntNetURLProtocol[] retList = new IIntNetURLProtocol[ dictByPKey.values().size() ];
		Iterator< IntNetBuffURLProtocol > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	@Override
	public IIntNetURLProtocol readDerivedByUNameIdx( ISecureAuthorization Authorization,
		String Name )
	{
		final String S_ProcName = "IntNetRamURLProtocol.readDerivedByUNameIdx";
		IntNetBuffURLProtocolByUNameIdxKey key = (IntNetBuffURLProtocolByUNameIdxKey)schema.getIntNetBuffFactory().getFactoryURLProtocol().newByUNameIdxKey();

		key.setRequiredName( Name );
		IIntNetURLProtocol buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	@Override
	public IIntNetURLProtocol[] readDerivedByIsSecureIdx( ISecureAuthorization Authorization,
		boolean IsSecure )
	{
		final String S_ProcName = "IntNetRamURLProtocol.readDerivedByIsSecureIdx";
		IntNetBuffURLProtocolByIsSecureIdxKey key = (IntNetBuffURLProtocolByIsSecureIdxKey)schema.getIntNetBuffFactory().getFactoryURLProtocol().newByIsSecureIdxKey();

		key.setRequiredIsSecure( IsSecure );
		IIntNetURLProtocol[] recArray;
		if( dictByIsSecureIdx.containsKey( key ) ) {
			Map< $implCommaIJavaOptAtomType$, IntNetBuffURLProtocol > subdictIsSecureIdx
				= dictByIsSecureIdx.get( key );
			recArray = new IIntNetURLProtocol[ subdictIsSecureIdx.size() ];
			Iterator< IntNetBuffURLProtocol > iter = subdictIsSecureIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< $implCommaIJavaOptAtomType$, IntNetBuffURLProtocol > subdictIsSecureIdx
				= new HashMap< $implCommaIJavaOptAtomType$, IntNetBuffURLProtocol >();
			dictByIsSecureIdx.put( key, subdictIsSecureIdx );
			recArray = new IIntNetURLProtocol[0];
		}
		return( recArray );
	}

	@Override
	public IIntNetURLProtocol readDerivedByIdIdx( ISecureAuthorization Authorization,
		int URLProtocolId )
	{
		final String S_ProcName = "IntNetRamURLProtocol.readDerivedByIdIdx() ";
		IIntNetURLProtocol buff;
		if( dictByPKey.containsKey( URLProtocolId ) ) {
			buff = dictByPKey.get( URLProtocolId );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	@Override
	public IIntNetURLProtocol readRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "IntNetRamURLProtocol.readRec";
		IIntNetURLProtocol buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( buff.getClassCode() != IIntNetURLProtocol.CLASS_CODE ) ) {
			buff = null;
		}
		return( buff );
	}

	@Override
	public IIntNetURLProtocol lockRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockRec";
		IIntNetURLProtocol buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( buff.getClassCode() != IIntNetURLProtocol.CLASS_CODE ) ) {
			buff = null;
		}
		return( buff );
	}

	@Override
	public IIntNetURLProtocol[] readAllRec( ISecureAuthorization Authorization )
	{
		final String S_ProcName = "IntNetRamURLProtocol.readAllRec";
		IIntNetURLProtocol buff;
		ArrayList<IIntNetURLProtocol> filteredList = new ArrayList<IIntNetURLProtocol>();
		IIntNetURLProtocol[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && ( buff.getClassCode() == IIntNetURLProtocol.CLASS_CODE ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new IIntNetURLProtocol[0] ) );
	}

	@Override
	public IIntNetURLProtocol readRecByIdIdx( ISecureAuthorization Authorization,
		int URLProtocolId )
	{
		final String S_ProcName = "IntNetRamURLProtocol.readRecByIdIdx() ";
		IIntNetURLProtocol buff = readDerivedByIdIdx( Authorization,
			URLProtocolId );
		if( ( buff != null ) && ( buff.getClassCode() == IIntNetURLProtocol.CLASS_CODE ) ) {
			return( (IIntNetURLProtocol)buff );
		}
		else {
			return( null );
		}
	}

	@Override
	public IIntNetURLProtocol readRecByUNameIdx( ISecureAuthorization Authorization,
		String Name )
	{
		final String S_ProcName = "IntNetRamURLProtocol.readRecByUNameIdx() ";
		IIntNetURLProtocol buff = readDerivedByUNameIdx( Authorization,
			Name );
		if( ( buff != null ) && ( buff.getClassCode() == IIntNetURLProtocol.CLASS_CODE ) ) {
			return( (IIntNetURLProtocol)buff );
		}
		else {
			return( null );
		}
	}

	@Override
	public IIntNetURLProtocol[] readRecByIsSecureIdx( ISecureAuthorization Authorization,
		boolean IsSecure )
	{
		final String S_ProcName = "IntNetRamURLProtocol.readRecByIsSecureIdx() ";
		IIntNetURLProtocol buff;
		ArrayList<IIntNetURLProtocol> filteredList = new ArrayList<IIntNetURLProtocol>();
		IIntNetURLProtocol[] buffList = readDerivedByIsSecureIdx( Authorization,
			IsSecure );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && ( buff.getClassCode() == IIntNetURLProtocol.CLASS_CODE ) ) {
				filteredList.add( (IIntNetURLProtocol)buff );
			}
		}
		return( filteredList.toArray( new IIntNetURLProtocol[0] ) );
	}

	public IIntNetURLProtocol updateURLProtocol( ISecureAuthorization Authorization,
		IIntNetURLProtocol iBuff )
	{
		IntNetBuffURLProtocol Buff = (IntNetBuffURLProtocol)ensureRec(iBuff);
		$implCommaIJavaOptAtomType$ pkey = ($implCommaIJavaOptAtomType$)Buff.getPKey();
		IntNetBuffURLProtocol existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new CFStaleCacheDetectedException( getClass(),
				"updateURLProtocol",
				"Existing record not found",
				"Existing record not found",
				"URLProtocol",
				"URLProtocol",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new CFCollisionDetectedException( getClass(),
				"updateURLProtocol",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		IntNetBuffURLProtocolByUNameIdxKey existingKeyUNameIdx = (IntNetBuffURLProtocolByUNameIdxKey)schema.getIntNetBuffFactory().getFactoryURLProtocol().newByUNameIdxKey();
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		IntNetBuffURLProtocolByUNameIdxKey newKeyUNameIdx = (IntNetBuffURLProtocolByUNameIdxKey)schema.getIntNetBuffFactory().getFactoryURLProtocol().newByUNameIdxKey();
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		IntNetBuffURLProtocolByIsSecureIdxKey existingKeyIsSecureIdx = (IntNetBuffURLProtocolByIsSecureIdxKey)schema.getIntNetBuffFactory().getFactoryURLProtocol().newByIsSecureIdxKey();
		existingKeyIsSecureIdx.setRequiredIsSecure( existing.getRequiredIsSecure() );

		IntNetBuffURLProtocolByIsSecureIdxKey newKeyIsSecureIdx = (IntNetBuffURLProtocolByIsSecureIdxKey)schema.getIntNetBuffFactory().getFactoryURLProtocol().newByIsSecureIdxKey();
		newKeyIsSecureIdx.setRequiredIsSecure( Buff.getRequiredIsSecure() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new CFUniqueIndexViolationException( getClass(),
					"updateURLProtocol",
					"URLProtocolUNameIdx",
					"URLProtocolUNameIdx",
					newKeyUNameIdx );
			}
		}

		// Validate foreign keys

		// Update is valid

		Map< $implCommaIJavaOptAtomType$, IntNetBuffURLProtocol > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

		subdict = dictByIsSecureIdx.get( existingKeyIsSecureIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByIsSecureIdx.containsKey( newKeyIsSecureIdx ) ) {
			subdict = dictByIsSecureIdx.get( newKeyIsSecureIdx );
		}
		else {
			subdict = new HashMap< $implCommaIJavaOptAtomType$, IntNetBuffURLProtocol >();
			dictByIsSecureIdx.put( newKeyIsSecureIdx, subdict );
		}
		subdict.put( pkey, Buff );

		return(Buff);
	}

	@Override
	public void deleteURLProtocol( ISecureAuthorization Authorization,
		IIntNetURLProtocol iBuff )
	{
		final String S_ProcName = "IntNetRamURLProtocolTable.deleteURLProtocol() ";
		IntNetBuffURLProtocol Buff = (IntNetBuffURLProtocol)ensureRec(iBuff);
		int classCode;
		$implCommaIJavaOptAtomType$ pkey = ($implCommaIJavaOptAtomType$)(Buff.getPKey());
		IntNetBuffURLProtocol existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new CFCollisionDetectedException( getClass(),
				"deleteURLProtocol",
				pkey );
		}
		IntNetBuffURLProtocolByUNameIdxKey keyUNameIdx = (IntNetBuffURLProtocolByUNameIdxKey)schema.getIntNetBuffFactory().getFactoryURLProtocol().newByUNameIdxKey();
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		IntNetBuffURLProtocolByIsSecureIdxKey keyIsSecureIdx = (IntNetBuffURLProtocolByIsSecureIdxKey)schema.getIntNetBuffFactory().getFactoryURLProtocol().newByIsSecureIdxKey();
		keyIsSecureIdx.setRequiredIsSecure( existing.getRequiredIsSecure() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< $implCommaIJavaOptAtomType$, IntNetBuffURLProtocol > subdict;

		dictByPKey.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

		subdict = dictByIsSecureIdx.get( keyIsSecureIdx );
		subdict.remove( pkey );

	}
	@Override
	public void deleteURLProtocolByIdIdx( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		IntNetBuffURLProtocol cur;
		LinkedList<IntNetBuffURLProtocol> matchSet = new LinkedList<IntNetBuffURLProtocol>();
		Iterator<IntNetBuffURLProtocol> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<IntNetBuffURLProtocol> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = (IntNetBuffURLProtocol)(schema.getTableURLProtocol().readDerivedByIdIdx( Authorization,
				cur.getRequiredURLProtocolId() ));
			deleteURLProtocol( Authorization, cur );
		}
	}

	@Override
	public void deleteURLProtocolByUNameIdx( ISecureAuthorization Authorization,
		String argName )
	{
		IntNetBuffURLProtocolByUNameIdxKey key = (IntNetBuffURLProtocolByUNameIdxKey)schema.getIntNetBuffFactory().getFactoryURLProtocol().newByUNameIdxKey();
		key.setRequiredName( argName );
		deleteURLProtocolByUNameIdx( Authorization, key );
	}

	@Override
	public void deleteURLProtocolByUNameIdx( ISecureAuthorization Authorization,
		IIntNetURLProtocolByUNameIdxKey argKey )
	{
		IntNetBuffURLProtocol cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<IntNetBuffURLProtocol> matchSet = new LinkedList<IntNetBuffURLProtocol>();
		Iterator<IntNetBuffURLProtocol> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<IntNetBuffURLProtocol> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = (IntNetBuffURLProtocol)(schema.getTableURLProtocol().readDerivedByIdIdx( Authorization,
				cur.getRequiredURLProtocolId() ));
			deleteURLProtocol( Authorization, cur );
		}
	}

	@Override
	public void deleteURLProtocolByIsSecureIdx( ISecureAuthorization Authorization,
		boolean argIsSecure )
	{
		IntNetBuffURLProtocolByIsSecureIdxKey key = (IntNetBuffURLProtocolByIsSecureIdxKey)schema.getIntNetBuffFactory().getFactoryURLProtocol().newByIsSecureIdxKey();
		key.setRequiredIsSecure( argIsSecure );
		deleteURLProtocolByIsSecureIdx( Authorization, key );
	}

	@Override
	public void deleteURLProtocolByIsSecureIdx( ISecureAuthorization Authorization,
		IIntNetURLProtocolByIsSecureIdxKey argKey )
	{
		IntNetBuffURLProtocol cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<IntNetBuffURLProtocol> matchSet = new LinkedList<IntNetBuffURLProtocol>();
		Iterator<IntNetBuffURLProtocol> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<IntNetBuffURLProtocol> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = (IntNetBuffURLProtocol)(schema.getTableURLProtocol().readDerivedByIdIdx( Authorization,
				cur.getRequiredURLProtocolId() ));
			deleteURLProtocol( Authorization, cur );
		}
	}
}
