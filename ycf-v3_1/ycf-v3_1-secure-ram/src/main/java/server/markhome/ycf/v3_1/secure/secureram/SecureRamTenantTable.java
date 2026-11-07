
// Description: Java 25 in-memory RAM DbIO implementation for Tenant.

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
 *	SecureRamTenantTable in-memory RAM DbIO implementation
 *	for Tenant.
 */
public class SecureRamTenantTable
	implements ISecureTenantTable
{
	private ISecureSchema schema;
	private Map< $implCommaIJavaOptAtomType$,
				SecureBuffTenant > dictByPKey
		= new HashMap< $implCommaIJavaOptAtomType$,
				SecureBuffTenant >();
	private Map< SecureBuffTenantByClusterIdxKey,
				Map< $implCommaIJavaOptAtomType$,
					SecureBuffTenant >> dictByClusterIdx
		= new HashMap< SecureBuffTenantByClusterIdxKey,
				Map< $implCommaIJavaOptAtomType$,
					SecureBuffTenant >>();
	private Map< SecureBuffTenantByUNameIdxKey,
			SecureBuffTenant > dictByUNameIdx
		= new HashMap< SecureBuffTenantByUNameIdxKey,
			SecureBuffTenant >();

	public SecureRamTenantTable( ISecureSchema argSchema ) {
		schema = argSchema;
	}

	public SecureBuffTenant ensureRec(ISecureTenant rec) {
		return (((SecureBuffTenantFactoryService)(schema.getSecureBuffFactory().getFactoryTenant())).ensureRec(rec));
	}

	@Override
	public ISecureTenant createTenant( ISecureAuthorization Authorization,
		ISecureTenant iBuff )
	{
		final String S_ProcName = "createTenant";
		
		SecureBuffTenant Buff = (SecureBuffTenant)ensureRec(iBuff);
		$implCommaIJavaOptAtomType$ pkey;
		pkey = schema.nextTenantIdGen();
		Buff.setRequiredId( pkey );
		SecureBuffTenantByClusterIdxKey keyClusterIdx = (SecureBuffTenantByClusterIdxKey)schema.getSecureBuffFactory().getFactoryTenant().newByClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		SecureBuffTenantByUNameIdxKey keyUNameIdx = (SecureBuffTenantByUNameIdxKey)schema.getSecureBuffFactory().getFactoryTenant().newByUNameIdxKey();
		keyUNameIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyUNameIdx.setRequiredTenantName( Buff.getRequiredTenantName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new CFPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new CFUniqueIndexViolationException( getClass(),
				S_ProcName,
				"TenantUNameIdx",
				"TenantUNameIdx",
				keyUNameIdx );
		}

		// Validate foreign keys

		{
			boolean allNull = true;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableCluster().readDerivedByIdIdx( Authorization,
						Buff.getRequiredClusterId() ) )
				{
					throw new CFUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"Container",
						"TenantCluster",
						"TenantCluster",
						"Cluster",
						"Cluster",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< $implCommaIJavaOptAtomType$, SecureBuffTenant > subdictClusterIdx;
		if( dictByClusterIdx.containsKey( keyClusterIdx ) ) {
			subdictClusterIdx = dictByClusterIdx.get( keyClusterIdx );
		}
		else {
			subdictClusterIdx = new HashMap< $implCommaIJavaOptAtomType$, SecureBuffTenant >();
			dictByClusterIdx.put( keyClusterIdx, subdictClusterIdx );
		}
		subdictClusterIdx.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

		if (Buff == null) {
			return( null );
		}
		else {
			int classCode = Buff.getClassCode();
			if (classCode == ISecureTenant.CLASS_CODE) {
				SecureBuffTenant retbuff = ((SecureBuffTenant)(schema.getSecureBuffFactory().getFactoryTenant().newRec()));
				retbuff.set(Buff);
				return( retbuff );
			}
			else {
				throw new CFUnsupportedClassException(getClass(), S_ProcName, "-create-buff-cloning-", (Integer)classCode, "Classcode not recognized: " + Integer.toString(classCode));
			}
		}
	}

	@Override
	public ISecureTenant readDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "SecureRamTenant.readDerived";
		ISecureTenant buff;
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
	public ISecureTenant lockDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "SecureRamTenant.lockDerived";
		ISecureTenant buff;
		if( dictByPKey.containsKey( PKey ) ) {
			buff = dictByPKey.get( PKey );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	@Override
	public ISecureTenant[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "SecureRamTenant.readAllDerived";
		ISecureTenant[] retList = new ISecureTenant[ dictByPKey.values().size() ];
		Iterator< SecureBuffTenant > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	@Override
	public ISecureTenant[] readDerivedByClusterIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ClusterId )
	{
		final String S_ProcName = "SecureRamTenant.readDerivedByClusterIdx";
		SecureBuffTenantByClusterIdxKey key = (SecureBuffTenantByClusterIdxKey)schema.getSecureBuffFactory().getFactoryTenant().newByClusterIdxKey();

		key.setRequiredClusterId( ClusterId );
		ISecureTenant[] recArray;
		if( dictByClusterIdx.containsKey( key ) ) {
			Map< $implCommaIJavaOptAtomType$, SecureBuffTenant > subdictClusterIdx
				= dictByClusterIdx.get( key );
			recArray = new ISecureTenant[ subdictClusterIdx.size() ];
			Iterator< SecureBuffTenant > iter = subdictClusterIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< $implCommaIJavaOptAtomType$, SecureBuffTenant > subdictClusterIdx
				= new HashMap< $implCommaIJavaOptAtomType$, SecureBuffTenant >();
			dictByClusterIdx.put( key, subdictClusterIdx );
			recArray = new ISecureTenant[0];
		}
		return( recArray );
	}

	@Override
	public ISecureTenant readDerivedByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ClusterId,
		String TenantName )
	{
		final String S_ProcName = "SecureRamTenant.readDerivedByUNameIdx";
		SecureBuffTenantByUNameIdxKey key = (SecureBuffTenantByUNameIdxKey)schema.getSecureBuffFactory().getFactoryTenant().newByUNameIdxKey();

		key.setRequiredClusterId( ClusterId );
		key.setRequiredTenantName( TenantName );
		ISecureTenant buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	@Override
	public ISecureTenant readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 Id )
	{
		final String S_ProcName = "SecureRamTenant.readDerivedByIdIdx() ";
		ISecureTenant buff;
		if( dictByPKey.containsKey( Id ) ) {
			buff = dictByPKey.get( Id );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	@Override
	public ISecureTenant readRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "SecureRamTenant.readRec";
		ISecureTenant buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( buff.getClassCode() != ISecureTenant.CLASS_CODE ) ) {
			buff = null;
		}
		return( buff );
	}

	@Override
	public ISecureTenant lockRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockRec";
		ISecureTenant buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( buff.getClassCode() != ISecureTenant.CLASS_CODE ) ) {
			buff = null;
		}
		return( buff );
	}

	@Override
	public ISecureTenant[] readAllRec( ISecureAuthorization Authorization )
	{
		final String S_ProcName = "SecureRamTenant.readAllRec";
		ISecureTenant buff;
		ArrayList<ISecureTenant> filteredList = new ArrayList<ISecureTenant>();
		ISecureTenant[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && ( buff.getClassCode() == ISecureTenant.CLASS_CODE ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new ISecureTenant[0] ) );
	}

	@Override
	public ISecureTenant readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 Id )
	{
		final String S_ProcName = "SecureRamTenant.readRecByIdIdx() ";
		ISecureTenant buff = readDerivedByIdIdx( Authorization,
			Id );
		if( ( buff != null ) && ( buff.getClassCode() == ISecureTenant.CLASS_CODE ) ) {
			return( (ISecureTenant)buff );
		}
		else {
			return( null );
		}
	}

	@Override
	public ISecureTenant[] readRecByClusterIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ClusterId )
	{
		final String S_ProcName = "SecureRamTenant.readRecByClusterIdx() ";
		ISecureTenant buff;
		ArrayList<ISecureTenant> filteredList = new ArrayList<ISecureTenant>();
		ISecureTenant[] buffList = readDerivedByClusterIdx( Authorization,
			ClusterId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && ( buff.getClassCode() == ISecureTenant.CLASS_CODE ) ) {
				filteredList.add( (ISecureTenant)buff );
			}
		}
		return( filteredList.toArray( new ISecureTenant[0] ) );
	}

	@Override
	public ISecureTenant readRecByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ClusterId,
		String TenantName )
	{
		final String S_ProcName = "SecureRamTenant.readRecByUNameIdx() ";
		ISecureTenant buff = readDerivedByUNameIdx( Authorization,
			ClusterId,
			TenantName );
		if( ( buff != null ) && ( buff.getClassCode() == ISecureTenant.CLASS_CODE ) ) {
			return( (ISecureTenant)buff );
		}
		else {
			return( null );
		}
	}

	public ISecureTenant updateTenant( ISecureAuthorization Authorization,
		ISecureTenant iBuff )
	{
		SecureBuffTenant Buff = (SecureBuffTenant)ensureRec(iBuff);
		$implCommaIJavaOptAtomType$ pkey = ($implCommaIJavaOptAtomType$)Buff.getPKey();
		SecureBuffTenant existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new CFStaleCacheDetectedException( getClass(),
				"updateTenant",
				"Existing record not found",
				"Existing record not found",
				"Tenant",
				"Tenant",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new CFCollisionDetectedException( getClass(),
				"updateTenant",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		SecureBuffTenantByClusterIdxKey existingKeyClusterIdx = (SecureBuffTenantByClusterIdxKey)schema.getSecureBuffFactory().getFactoryTenant().newByClusterIdxKey();
		existingKeyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		SecureBuffTenantByClusterIdxKey newKeyClusterIdx = (SecureBuffTenantByClusterIdxKey)schema.getSecureBuffFactory().getFactoryTenant().newByClusterIdxKey();
		newKeyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		SecureBuffTenantByUNameIdxKey existingKeyUNameIdx = (SecureBuffTenantByUNameIdxKey)schema.getSecureBuffFactory().getFactoryTenant().newByUNameIdxKey();
		existingKeyUNameIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyUNameIdx.setRequiredTenantName( existing.getRequiredTenantName() );

		SecureBuffTenantByUNameIdxKey newKeyUNameIdx = (SecureBuffTenantByUNameIdxKey)schema.getSecureBuffFactory().getFactoryTenant().newByUNameIdxKey();
		newKeyUNameIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyUNameIdx.setRequiredTenantName( Buff.getRequiredTenantName() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new CFUniqueIndexViolationException( getClass(),
					"updateTenant",
					"TenantUNameIdx",
					"TenantUNameIdx",
					newKeyUNameIdx );
			}
		}

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableCluster().readDerivedByIdIdx( Authorization,
						Buff.getRequiredClusterId() ) )
				{
					throw new CFUnresolvedRelationException( getClass(),
						"updateTenant",
						"Container",
						"Container",
						"TenantCluster",
						"TenantCluster",
						"Cluster",
						"Cluster",
						null );
				}
			}
		}

		// Update is valid

		Map< $implCommaIJavaOptAtomType$, SecureBuffTenant > subdict;

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
			subdict = new HashMap< $implCommaIJavaOptAtomType$, SecureBuffTenant >();
			dictByClusterIdx.put( newKeyClusterIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

		return(Buff);
	}

	@Override
	public void deleteTenant( ISecureAuthorization Authorization,
		ISecureTenant iBuff )
	{
		final String S_ProcName = "SecureRamTenantTable.deleteTenant() ";
		SecureBuffTenant Buff = (SecureBuffTenant)ensureRec(iBuff);
		int classCode;
		$implCommaIJavaOptAtomType$ pkey = ($implCommaIJavaOptAtomType$)(Buff.getPKey());
		SecureBuffTenant existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new CFCollisionDetectedException( getClass(),
				"deleteTenant",
				pkey );
		}
					schema.getTableSecTentRole().deleteSecTentRoleByTenantIdx( Authorization,
						existing.getRequiredId() );
		SecureBuffSecTentGrp buffDelTentGrpMembs;
		ISecureSecTentGrp arrDelTentGrpMembs[] = schema.getTableSecTentGrp().readDerivedByTenantIdx( Authorization,
			existing.getRequiredId() );
		for( int idxDelTentGrpMembs = 0; idxDelTentGrpMembs < arrDelTentGrpMembs.length; idxDelTentGrpMembs++ ) {
			buffDelTentGrpMembs = (SecureBuffSecTentGrp)(arrDelTentGrpMembs[idxDelTentGrpMembs]);
					schema.getTableSecTentGrpMemb().deleteSecTentGrpMembByTentGrpIdx( Authorization,
						buffDelTentGrpMembs.getRequiredSecTentGrpId() );
		}
					schema.getTableSecTentGrp().deleteSecTentGrpByTenantIdx( Authorization,
						existing.getRequiredId() );
		SecureBuffTenantByClusterIdxKey keyClusterIdx = (SecureBuffTenantByClusterIdxKey)schema.getSecureBuffFactory().getFactoryTenant().newByClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		SecureBuffTenantByUNameIdxKey keyUNameIdx = (SecureBuffTenantByUNameIdxKey)schema.getSecureBuffFactory().getFactoryTenant().newByUNameIdxKey();
		keyUNameIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUNameIdx.setRequiredTenantName( existing.getRequiredTenantName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< $implCommaIJavaOptAtomType$, SecureBuffTenant > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByClusterIdx.get( keyClusterIdx );
		subdict.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

	}
	@Override
	public void deleteTenantByIdIdx( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		SecureBuffTenant cur;
		LinkedList<SecureBuffTenant> matchSet = new LinkedList<SecureBuffTenant>();
		Iterator<SecureBuffTenant> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<SecureBuffTenant> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = (SecureBuffTenant)(schema.getTableTenant().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() ));
			deleteTenant( Authorization, cur );
		}
	}

	@Override
	public void deleteTenantByClusterIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argClusterId )
	{
		SecureBuffTenantByClusterIdxKey key = (SecureBuffTenantByClusterIdxKey)schema.getSecureBuffFactory().getFactoryTenant().newByClusterIdxKey();
		key.setRequiredClusterId( argClusterId );
		deleteTenantByClusterIdx( Authorization, key );
	}

	@Override
	public void deleteTenantByClusterIdx( ISecureAuthorization Authorization,
		ISecureTenantByClusterIdxKey argKey )
	{
		SecureBuffTenant cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<SecureBuffTenant> matchSet = new LinkedList<SecureBuffTenant>();
		Iterator<SecureBuffTenant> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<SecureBuffTenant> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = (SecureBuffTenant)(schema.getTableTenant().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() ));
			deleteTenant( Authorization, cur );
		}
	}

	@Override
	public void deleteTenantByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argClusterId,
		String argTenantName )
	{
		SecureBuffTenantByUNameIdxKey key = (SecureBuffTenantByUNameIdxKey)schema.getSecureBuffFactory().getFactoryTenant().newByUNameIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredTenantName( argTenantName );
		deleteTenantByUNameIdx( Authorization, key );
	}

	@Override
	public void deleteTenantByUNameIdx( ISecureAuthorization Authorization,
		ISecureTenantByUNameIdxKey argKey )
	{
		SecureBuffTenant cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<SecureBuffTenant> matchSet = new LinkedList<SecureBuffTenant>();
		Iterator<SecureBuffTenant> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<SecureBuffTenant> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = (SecureBuffTenant)(schema.getTableTenant().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() ));
			deleteTenant( Authorization, cur );
		}
	}
}
