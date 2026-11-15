
// Description: Java 25 in-memory RAM DbIO implementation for TopDomain.

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
 *	IntNetRamTopDomainTable in-memory RAM DbIO implementation
 *	for TopDomain.
 */
public class IntNetRamTopDomainTable
	implements IIntNetTopDomainTable
{
	private IIntNetSchema schema;
	private Map< $implCommaIJavaOptAtomType$,
				IntNetBuffTopDomain > dictByPKey
		= new HashMap< $implCommaIJavaOptAtomType$,
				IntNetBuffTopDomain >();
	private Map< IntNetBuffTopDomainByTenantIdxKey,
				Map< $implCommaIJavaOptAtomType$,
					IntNetBuffTopDomain >> dictByTenantIdx
		= new HashMap< IntNetBuffTopDomainByTenantIdxKey,
				Map< $implCommaIJavaOptAtomType$,
					IntNetBuffTopDomain >>();
	private Map< IntNetBuffTopDomainByTldIdxKey,
				Map< $implCommaIJavaOptAtomType$,
					IntNetBuffTopDomain >> dictByTldIdx
		= new HashMap< IntNetBuffTopDomainByTldIdxKey,
				Map< $implCommaIJavaOptAtomType$,
					IntNetBuffTopDomain >>();
	private Map< IntNetBuffTopDomainByNameIdxKey,
			IntNetBuffTopDomain > dictByNameIdx
		= new HashMap< IntNetBuffTopDomainByNameIdxKey,
			IntNetBuffTopDomain >();

	public IntNetRamTopDomainTable( IIntNetSchema argSchema ) {
		schema = argSchema;
	}

	public IntNetBuffTopDomain ensureRec(IIntNetTopDomain rec) {
		return (((IntNetBuffTopDomainFactoryService)(schema.getIntNetBuffFactory().getFactoryTopDomain())).ensureRec(rec));
	}

	@Override
	public IIntNetTopDomain createTopDomain( ISecureAuthorization Authorization,
		IIntNetTopDomain iBuff )
	{
		final String S_ProcName = "createTopDomain";
		
		IntNetBuffTopDomain Buff = (IntNetBuffTopDomain)ensureRec(iBuff);
		$implCommaIJavaOptAtomType$ pkey;
		pkey = schema.nextTopDomainIdGen();
		Buff.setRequiredId( pkey );
		IntNetBuffTopDomainByTenantIdxKey keyTenantIdx = (IntNetBuffTopDomainByTenantIdxKey)schema.getIntNetBuffFactory().getFactoryTopDomain().newByTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		IntNetBuffTopDomainByTldIdxKey keyTldIdx = (IntNetBuffTopDomainByTldIdxKey)schema.getIntNetBuffFactory().getFactoryTopDomain().newByTldIdxKey();
		keyTldIdx.setRequiredTldId( Buff.getRequiredTldId() );

		IntNetBuffTopDomainByNameIdxKey keyNameIdx = (IntNetBuffTopDomainByNameIdxKey)schema.getIntNetBuffFactory().getFactoryTopDomain().newByNameIdxKey();
		keyNameIdx.setRequiredTldId( Buff.getRequiredTldId() );
		keyNameIdx.setRequiredName( Buff.getRequiredName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new CFPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByNameIdx.containsKey( keyNameIdx ) ) {
			throw new CFUniqueIndexViolationException( getClass(),
				S_ProcName,
				"TopDomNameIdx",
				"TopDomNameIdx",
				keyNameIdx );
		}

		// Validate foreign keys

		{
			boolean allNull = true;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableTenant().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId() ) )
				{
					throw new CFUnresolvedRelationException( getClass(),
						S_ProcName,
						"Owner",
						"Owner",
						"Tenant",
						"Tenant",
						"Tenant",
						"Tenant",
						null );
				}
			}
		}

		{
			boolean allNull = true;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableTld().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTldId() ) )
				{
					throw new CFUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"Container",
						"ParentTld",
						"ParentTld",
						"Tld",
						"Tld",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< $implCommaIJavaOptAtomType$, IntNetBuffTopDomain > subdictTenantIdx;
		if( dictByTenantIdx.containsKey( keyTenantIdx ) ) {
			subdictTenantIdx = dictByTenantIdx.get( keyTenantIdx );
		}
		else {
			subdictTenantIdx = new HashMap< $implCommaIJavaOptAtomType$, IntNetBuffTopDomain >();
			dictByTenantIdx.put( keyTenantIdx, subdictTenantIdx );
		}
		subdictTenantIdx.put( pkey, Buff );

		Map< $implCommaIJavaOptAtomType$, IntNetBuffTopDomain > subdictTldIdx;
		if( dictByTldIdx.containsKey( keyTldIdx ) ) {
			subdictTldIdx = dictByTldIdx.get( keyTldIdx );
		}
		else {
			subdictTldIdx = new HashMap< $implCommaIJavaOptAtomType$, IntNetBuffTopDomain >();
			dictByTldIdx.put( keyTldIdx, subdictTldIdx );
		}
		subdictTldIdx.put( pkey, Buff );

		dictByNameIdx.put( keyNameIdx, Buff );

		if (Buff == null) {
			return( null );
		}
		else {
			int classCode = Buff.getClassCode();
			if (classCode == IIntNetTopDomain.CLASS_CODE) {
				IntNetBuffTopDomain retbuff = ((IntNetBuffTopDomain)(schema.getIntNetBuffFactory().getFactoryTopDomain().newRec()));
				retbuff.set(Buff);
				return( retbuff );
			}
			else {
				throw new CFUnsupportedClassException(getClass(), S_ProcName, "-create-buff-cloning-", (Integer)classCode, "Classcode not recognized: " + Integer.toString(classCode));
			}
		}
	}

	@Override
	public IIntNetTopDomain readDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "IntNetRamTopDomain.readDerived";
		IIntNetTopDomain buff;
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
	public IIntNetTopDomain lockDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "IntNetRamTopDomain.lockDerived";
		IIntNetTopDomain buff;
		if( dictByPKey.containsKey( PKey ) ) {
			buff = dictByPKey.get( PKey );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	@Override
	public IIntNetTopDomain[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "IntNetRamTopDomain.readAllDerived";
		IIntNetTopDomain[] retList = new IIntNetTopDomain[ dictByPKey.values().size() ];
		Iterator< IntNetBuffTopDomain > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	@Override
	public IIntNetTopDomain[] readDerivedByTenantIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 TenantId )
	{
		final String S_ProcName = "IntNetRamTopDomain.readDerivedByTenantIdx";
		IntNetBuffTopDomainByTenantIdxKey key = (IntNetBuffTopDomainByTenantIdxKey)schema.getIntNetBuffFactory().getFactoryTopDomain().newByTenantIdxKey();

		key.setRequiredTenantId( TenantId );
		IIntNetTopDomain[] recArray;
		if( dictByTenantIdx.containsKey( key ) ) {
			Map< $implCommaIJavaOptAtomType$, IntNetBuffTopDomain > subdictTenantIdx
				= dictByTenantIdx.get( key );
			recArray = new IIntNetTopDomain[ subdictTenantIdx.size() ];
			Iterator< IntNetBuffTopDomain > iter = subdictTenantIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< $implCommaIJavaOptAtomType$, IntNetBuffTopDomain > subdictTenantIdx
				= new HashMap< $implCommaIJavaOptAtomType$, IntNetBuffTopDomain >();
			dictByTenantIdx.put( key, subdictTenantIdx );
			recArray = new IIntNetTopDomain[0];
		}
		return( recArray );
	}

	@Override
	public IIntNetTopDomain[] readDerivedByTldIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 TldId )
	{
		final String S_ProcName = "IntNetRamTopDomain.readDerivedByTldIdx";
		IntNetBuffTopDomainByTldIdxKey key = (IntNetBuffTopDomainByTldIdxKey)schema.getIntNetBuffFactory().getFactoryTopDomain().newByTldIdxKey();

		key.setRequiredTldId( TldId );
		IIntNetTopDomain[] recArray;
		if( dictByTldIdx.containsKey( key ) ) {
			Map< $implCommaIJavaOptAtomType$, IntNetBuffTopDomain > subdictTldIdx
				= dictByTldIdx.get( key );
			recArray = new IIntNetTopDomain[ subdictTldIdx.size() ];
			Iterator< IntNetBuffTopDomain > iter = subdictTldIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< $implCommaIJavaOptAtomType$, IntNetBuffTopDomain > subdictTldIdx
				= new HashMap< $implCommaIJavaOptAtomType$, IntNetBuffTopDomain >();
			dictByTldIdx.put( key, subdictTldIdx );
			recArray = new IIntNetTopDomain[0];
		}
		return( recArray );
	}

	@Override
	public IIntNetTopDomain readDerivedByNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 TldId,
		String Name )
	{
		final String S_ProcName = "IntNetRamTopDomain.readDerivedByNameIdx";
		IntNetBuffTopDomainByNameIdxKey key = (IntNetBuffTopDomainByNameIdxKey)schema.getIntNetBuffFactory().getFactoryTopDomain().newByNameIdxKey();

		key.setRequiredTldId( TldId );
		key.setRequiredName( Name );
		IIntNetTopDomain buff;
		if( dictByNameIdx.containsKey( key ) ) {
			buff = dictByNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	@Override
	public IIntNetTopDomain readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 Id )
	{
		final String S_ProcName = "IntNetRamTopDomain.readDerivedByIdIdx() ";
		IIntNetTopDomain buff;
		if( dictByPKey.containsKey( Id ) ) {
			buff = dictByPKey.get( Id );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	@Override
	public IIntNetTopDomain readRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "IntNetRamTopDomain.readRec";
		IIntNetTopDomain buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( buff.getClassCode() != IIntNetTopDomain.CLASS_CODE ) ) {
			buff = null;
		}
		return( buff );
	}

	@Override
	public IIntNetTopDomain lockRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockRec";
		IIntNetTopDomain buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( buff.getClassCode() != IIntNetTopDomain.CLASS_CODE ) ) {
			buff = null;
		}
		return( buff );
	}

	@Override
	public IIntNetTopDomain[] readAllRec( ISecureAuthorization Authorization )
	{
		final String S_ProcName = "IntNetRamTopDomain.readAllRec";
		IIntNetTopDomain buff;
		ArrayList<IIntNetTopDomain> filteredList = new ArrayList<IIntNetTopDomain>();
		IIntNetTopDomain[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && ( buff.getClassCode() == IIntNetTopDomain.CLASS_CODE ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new IIntNetTopDomain[0] ) );
	}

	@Override
	public IIntNetTopDomain readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 Id )
	{
		final String S_ProcName = "IntNetRamTopDomain.readRecByIdIdx() ";
		IIntNetTopDomain buff = readDerivedByIdIdx( Authorization,
			Id );
		if( ( buff != null ) && ( buff.getClassCode() == IIntNetTopDomain.CLASS_CODE ) ) {
			return( (IIntNetTopDomain)buff );
		}
		else {
			return( null );
		}
	}

	@Override
	public IIntNetTopDomain[] readRecByTenantIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 TenantId )
	{
		final String S_ProcName = "IntNetRamTopDomain.readRecByTenantIdx() ";
		IIntNetTopDomain buff;
		ArrayList<IIntNetTopDomain> filteredList = new ArrayList<IIntNetTopDomain>();
		IIntNetTopDomain[] buffList = readDerivedByTenantIdx( Authorization,
			TenantId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && ( buff.getClassCode() == IIntNetTopDomain.CLASS_CODE ) ) {
				filteredList.add( (IIntNetTopDomain)buff );
			}
		}
		return( filteredList.toArray( new IIntNetTopDomain[0] ) );
	}

	@Override
	public IIntNetTopDomain[] readRecByTldIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 TldId )
	{
		final String S_ProcName = "IntNetRamTopDomain.readRecByTldIdx() ";
		IIntNetTopDomain buff;
		ArrayList<IIntNetTopDomain> filteredList = new ArrayList<IIntNetTopDomain>();
		IIntNetTopDomain[] buffList = readDerivedByTldIdx( Authorization,
			TldId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && ( buff.getClassCode() == IIntNetTopDomain.CLASS_CODE ) ) {
				filteredList.add( (IIntNetTopDomain)buff );
			}
		}
		return( filteredList.toArray( new IIntNetTopDomain[0] ) );
	}

	@Override
	public IIntNetTopDomain readRecByNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 TldId,
		String Name )
	{
		final String S_ProcName = "IntNetRamTopDomain.readRecByNameIdx() ";
		IIntNetTopDomain buff = readDerivedByNameIdx( Authorization,
			TldId,
			Name );
		if( ( buff != null ) && ( buff.getClassCode() == IIntNetTopDomain.CLASS_CODE ) ) {
			return( (IIntNetTopDomain)buff );
		}
		else {
			return( null );
		}
	}

	public IIntNetTopDomain updateTopDomain( ISecureAuthorization Authorization,
		IIntNetTopDomain iBuff )
	{
		IntNetBuffTopDomain Buff = (IntNetBuffTopDomain)ensureRec(iBuff);
		$implCommaIJavaOptAtomType$ pkey = ($implCommaIJavaOptAtomType$)Buff.getPKey();
		IntNetBuffTopDomain existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new CFStaleCacheDetectedException( getClass(),
				"updateTopDomain",
				"Existing record not found",
				"Existing record not found",
				"TopDomain",
				"TopDomain",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new CFCollisionDetectedException( getClass(),
				"updateTopDomain",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		IntNetBuffTopDomainByTenantIdxKey existingKeyTenantIdx = (IntNetBuffTopDomainByTenantIdxKey)schema.getIntNetBuffFactory().getFactoryTopDomain().newByTenantIdxKey();
		existingKeyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		IntNetBuffTopDomainByTenantIdxKey newKeyTenantIdx = (IntNetBuffTopDomainByTenantIdxKey)schema.getIntNetBuffFactory().getFactoryTopDomain().newByTenantIdxKey();
		newKeyTenantIdx.setRequiredTenantId( Buff.getRequiredTenantId() );

		IntNetBuffTopDomainByTldIdxKey existingKeyTldIdx = (IntNetBuffTopDomainByTldIdxKey)schema.getIntNetBuffFactory().getFactoryTopDomain().newByTldIdxKey();
		existingKeyTldIdx.setRequiredTldId( existing.getRequiredTldId() );

		IntNetBuffTopDomainByTldIdxKey newKeyTldIdx = (IntNetBuffTopDomainByTldIdxKey)schema.getIntNetBuffFactory().getFactoryTopDomain().newByTldIdxKey();
		newKeyTldIdx.setRequiredTldId( Buff.getRequiredTldId() );

		IntNetBuffTopDomainByNameIdxKey existingKeyNameIdx = (IntNetBuffTopDomainByNameIdxKey)schema.getIntNetBuffFactory().getFactoryTopDomain().newByNameIdxKey();
		existingKeyNameIdx.setRequiredTldId( existing.getRequiredTldId() );
		existingKeyNameIdx.setRequiredName( existing.getRequiredName() );

		IntNetBuffTopDomainByNameIdxKey newKeyNameIdx = (IntNetBuffTopDomainByNameIdxKey)schema.getIntNetBuffFactory().getFactoryTopDomain().newByNameIdxKey();
		newKeyNameIdx.setRequiredTldId( Buff.getRequiredTldId() );
		newKeyNameIdx.setRequiredName( Buff.getRequiredName() );

		// Check unique indexes

		if( ! existingKeyNameIdx.equals( newKeyNameIdx ) ) {
			if( dictByNameIdx.containsKey( newKeyNameIdx ) ) {
				throw new CFUniqueIndexViolationException( getClass(),
					"updateTopDomain",
					"TopDomNameIdx",
					"TopDomNameIdx",
					newKeyNameIdx );
			}
		}

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableTenant().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTenantId() ) )
				{
					throw new CFUnresolvedRelationException( getClass(),
						"updateTopDomain",
						"Owner",
						"Owner",
						"Tenant",
						"Tenant",
						"Tenant",
						"Tenant",
						null );
				}
			}
		}

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableTld().readDerivedByIdIdx( Authorization,
						Buff.getRequiredTldId() ) )
				{
					throw new CFUnresolvedRelationException( getClass(),
						"updateTopDomain",
						"Container",
						"Container",
						"ParentTld",
						"ParentTld",
						"Tld",
						"Tld",
						null );
				}
			}
		}

		// Update is valid

		Map< $implCommaIJavaOptAtomType$, IntNetBuffTopDomain > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		subdict = dictByTenantIdx.get( existingKeyTenantIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByTenantIdx.containsKey( newKeyTenantIdx ) ) {
			subdict = dictByTenantIdx.get( newKeyTenantIdx );
		}
		else {
			subdict = new HashMap< $implCommaIJavaOptAtomType$, IntNetBuffTopDomain >();
			dictByTenantIdx.put( newKeyTenantIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByTldIdx.get( existingKeyTldIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByTldIdx.containsKey( newKeyTldIdx ) ) {
			subdict = dictByTldIdx.get( newKeyTldIdx );
		}
		else {
			subdict = new HashMap< $implCommaIJavaOptAtomType$, IntNetBuffTopDomain >();
			dictByTldIdx.put( newKeyTldIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByNameIdx.remove( existingKeyNameIdx );
		dictByNameIdx.put( newKeyNameIdx, Buff );

		return(Buff);
	}

	@Override
	public void deleteTopDomain( ISecureAuthorization Authorization,
		IIntNetTopDomain iBuff )
	{
		final String S_ProcName = "IntNetRamTopDomainTable.deleteTopDomain() ";
		IntNetBuffTopDomain Buff = (IntNetBuffTopDomain)ensureRec(iBuff);
		int classCode;
		$implCommaIJavaOptAtomType$ pkey = ($implCommaIJavaOptAtomType$)(Buff.getPKey());
		IntNetBuffTopDomain existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new CFCollisionDetectedException( getClass(),
				"deleteTopDomain",
				pkey );
		}
					schema.getTableTopProject().deleteTopProjectByTopDomainIdx( Authorization,
						existing.getRequiredId() );
		IntNetBuffTopDomainByTenantIdxKey keyTenantIdx = (IntNetBuffTopDomainByTenantIdxKey)schema.getIntNetBuffFactory().getFactoryTopDomain().newByTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		IntNetBuffTopDomainByTldIdxKey keyTldIdx = (IntNetBuffTopDomainByTldIdxKey)schema.getIntNetBuffFactory().getFactoryTopDomain().newByTldIdxKey();
		keyTldIdx.setRequiredTldId( existing.getRequiredTldId() );

		IntNetBuffTopDomainByNameIdxKey keyNameIdx = (IntNetBuffTopDomainByNameIdxKey)schema.getIntNetBuffFactory().getFactoryTopDomain().newByNameIdxKey();
		keyNameIdx.setRequiredTldId( existing.getRequiredTldId() );
		keyNameIdx.setRequiredName( existing.getRequiredName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< $implCommaIJavaOptAtomType$, IntNetBuffTopDomain > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByTenantIdx.get( keyTenantIdx );
		subdict.remove( pkey );

		subdict = dictByTldIdx.get( keyTldIdx );
		subdict.remove( pkey );

		dictByNameIdx.remove( keyNameIdx );

	}
	@Override
	public void deleteTopDomainByIdIdx( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		IntNetBuffTopDomain cur;
		LinkedList<IntNetBuffTopDomain> matchSet = new LinkedList<IntNetBuffTopDomain>();
		Iterator<IntNetBuffTopDomain> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<IntNetBuffTopDomain> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = (IntNetBuffTopDomain)(schema.getTableTopDomain().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() ));
			deleteTopDomain( Authorization, cur );
		}
	}

	@Override
	public void deleteTopDomainByTenantIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTenantId )
	{
		IntNetBuffTopDomainByTenantIdxKey key = (IntNetBuffTopDomainByTenantIdxKey)schema.getIntNetBuffFactory().getFactoryTopDomain().newByTenantIdxKey();
		key.setRequiredTenantId( argTenantId );
		deleteTopDomainByTenantIdx( Authorization, key );
	}

	@Override
	public void deleteTopDomainByTenantIdx( ISecureAuthorization Authorization,
		IIntNetTopDomainByTenantIdxKey argKey )
	{
		IntNetBuffTopDomain cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<IntNetBuffTopDomain> matchSet = new LinkedList<IntNetBuffTopDomain>();
		Iterator<IntNetBuffTopDomain> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<IntNetBuffTopDomain> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = (IntNetBuffTopDomain)(schema.getTableTopDomain().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() ));
			deleteTopDomain( Authorization, cur );
		}
	}

	@Override
	public void deleteTopDomainByTldIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTldId )
	{
		IntNetBuffTopDomainByTldIdxKey key = (IntNetBuffTopDomainByTldIdxKey)schema.getIntNetBuffFactory().getFactoryTopDomain().newByTldIdxKey();
		key.setRequiredTldId( argTldId );
		deleteTopDomainByTldIdx( Authorization, key );
	}

	@Override
	public void deleteTopDomainByTldIdx( ISecureAuthorization Authorization,
		IIntNetTopDomainByTldIdxKey argKey )
	{
		IntNetBuffTopDomain cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<IntNetBuffTopDomain> matchSet = new LinkedList<IntNetBuffTopDomain>();
		Iterator<IntNetBuffTopDomain> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<IntNetBuffTopDomain> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = (IntNetBuffTopDomain)(schema.getTableTopDomain().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() ));
			deleteTopDomain( Authorization, cur );
		}
	}

	@Override
	public void deleteTopDomainByNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTldId,
		String argName )
	{
		IntNetBuffTopDomainByNameIdxKey key = (IntNetBuffTopDomainByNameIdxKey)schema.getIntNetBuffFactory().getFactoryTopDomain().newByNameIdxKey();
		key.setRequiredTldId( argTldId );
		key.setRequiredName( argName );
		deleteTopDomainByNameIdx( Authorization, key );
	}

	@Override
	public void deleteTopDomainByNameIdx( ISecureAuthorization Authorization,
		IIntNetTopDomainByNameIdxKey argKey )
	{
		IntNetBuffTopDomain cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<IntNetBuffTopDomain> matchSet = new LinkedList<IntNetBuffTopDomain>();
		Iterator<IntNetBuffTopDomain> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<IntNetBuffTopDomain> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = (IntNetBuffTopDomain)(schema.getTableTopDomain().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() ));
			deleteTopDomain( Authorization, cur );
		}
	}
}
