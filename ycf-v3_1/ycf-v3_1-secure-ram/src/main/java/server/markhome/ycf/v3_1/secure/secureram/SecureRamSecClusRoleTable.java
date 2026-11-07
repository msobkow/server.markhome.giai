
// Description: Java 25 in-memory RAM DbIO implementation for SecClusRole.

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
 *	SecureRamSecClusRoleTable in-memory RAM DbIO implementation
 *	for SecClusRole.
 */
public class SecureRamSecClusRoleTable
	implements ISecureSecClusRoleTable
{
	private ISecureSchema schema;
	private Map< $implCommaIJavaOptAtomType$,
				SecureBuffSecClusRole > dictByPKey
		= new HashMap< $implCommaIJavaOptAtomType$,
				SecureBuffSecClusRole >();
	private Map< SecureBuffSecClusRoleByClusterIdxKey,
				Map< $implCommaIJavaOptAtomType$,
					SecureBuffSecClusRole >> dictByClusterIdx
		= new HashMap< SecureBuffSecClusRoleByClusterIdxKey,
				Map< $implCommaIJavaOptAtomType$,
					SecureBuffSecClusRole >>();
	private Map< SecureBuffSecClusRoleByNameIdxKey,
				Map< $implCommaIJavaOptAtomType$,
					SecureBuffSecClusRole >> dictByNameIdx
		= new HashMap< SecureBuffSecClusRoleByNameIdxKey,
				Map< $implCommaIJavaOptAtomType$,
					SecureBuffSecClusRole >>();
	private Map< SecureBuffSecClusRoleByUNameIdxKey,
			SecureBuffSecClusRole > dictByUNameIdx
		= new HashMap< SecureBuffSecClusRoleByUNameIdxKey,
			SecureBuffSecClusRole >();

	public SecureRamSecClusRoleTable( ISecureSchema argSchema ) {
		schema = argSchema;
	}

	public SecureBuffSecClusRole ensureRec(ISecureSecClusRole rec) {
		return (((SecureBuffSecClusRoleFactoryService)(schema.getSecureBuffFactory().getFactorySecClusRole())).ensureRec(rec));
	}

	@Override
	public ISecureSecClusRole createSecClusRole( ISecureAuthorization Authorization,
		ISecureSecClusRole iBuff )
	{
		final String S_ProcName = "createSecClusRole";
		
		SecureBuffSecClusRole Buff = (SecureBuffSecClusRole)ensureRec(iBuff);
		$implCommaIJavaOptAtomType$ pkey;
		pkey = schema.nextSecClusRoleIdGen();
		Buff.setRequiredSecClusRoleId( pkey );
		SecureBuffSecClusRoleByClusterIdxKey keyClusterIdx = (SecureBuffSecClusRoleByClusterIdxKey)schema.getSecureBuffFactory().getFactorySecClusRole().newByClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		SecureBuffSecClusRoleByNameIdxKey keyNameIdx = (SecureBuffSecClusRoleByNameIdxKey)schema.getSecureBuffFactory().getFactorySecClusRole().newByNameIdxKey();
		keyNameIdx.setRequiredName( Buff.getRequiredName() );

		SecureBuffSecClusRoleByUNameIdxKey keyUNameIdx = (SecureBuffSecClusRoleByUNameIdxKey)schema.getSecureBuffFactory().getFactorySecClusRole().newByUNameIdxKey();
		keyUNameIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		keyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new CFPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUNameIdx.containsKey( keyUNameIdx ) ) {
			throw new CFUniqueIndexViolationException( getClass(),
				S_ProcName,
				"SecClusRoleUNameIdx",
				"SecClusRoleUNameIdx",
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
						"Owner",
						"Owner",
						"SecClusRoleCluster",
						"SecClusRoleCluster",
						"Cluster",
						"Cluster",
						null );
				}
			}
		}

		{
			boolean allNull = true;
			allNull = false;
			if( ! allNull ) {
				if( null == schema.getTableSecSysGrp().readDerivedByUNameIdx( Authorization,
						Buff.getRequiredName() ) )
				{
					throw new CFUnresolvedRelationException( getClass(),
						S_ProcName,
						"Container",
						"Container",
						"SecClusRoleMembSysRol",
						"SecClusRoleMembSysRol",
						"SecSysGrp",
						"SecSysGrp",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< $implCommaIJavaOptAtomType$, SecureBuffSecClusRole > subdictClusterIdx;
		if( dictByClusterIdx.containsKey( keyClusterIdx ) ) {
			subdictClusterIdx = dictByClusterIdx.get( keyClusterIdx );
		}
		else {
			subdictClusterIdx = new HashMap< $implCommaIJavaOptAtomType$, SecureBuffSecClusRole >();
			dictByClusterIdx.put( keyClusterIdx, subdictClusterIdx );
		}
		subdictClusterIdx.put( pkey, Buff );

		Map< $implCommaIJavaOptAtomType$, SecureBuffSecClusRole > subdictNameIdx;
		if( dictByNameIdx.containsKey( keyNameIdx ) ) {
			subdictNameIdx = dictByNameIdx.get( keyNameIdx );
		}
		else {
			subdictNameIdx = new HashMap< $implCommaIJavaOptAtomType$, SecureBuffSecClusRole >();
			dictByNameIdx.put( keyNameIdx, subdictNameIdx );
		}
		subdictNameIdx.put( pkey, Buff );

		dictByUNameIdx.put( keyUNameIdx, Buff );

		if (Buff == null) {
			return( null );
		}
		else {
			int classCode = Buff.getClassCode();
			if (classCode == ISecureSecClusRole.CLASS_CODE) {
				SecureBuffSecClusRole retbuff = ((SecureBuffSecClusRole)(schema.getSecureBuffFactory().getFactorySecClusRole().newRec()));
				retbuff.set(Buff);
				return( retbuff );
			}
			else {
				throw new CFUnsupportedClassException(getClass(), S_ProcName, "-create-buff-cloning-", (Integer)classCode, "Classcode not recognized: " + Integer.toString(classCode));
			}
		}
	}

	@Override
	public ISecureSecClusRole readDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "SecureRamSecClusRole.readDerived";
		ISecureSecClusRole buff;
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
	public ISecureSecClusRole lockDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "SecureRamSecClusRole.lockDerived";
		ISecureSecClusRole buff;
		if( dictByPKey.containsKey( PKey ) ) {
			buff = dictByPKey.get( PKey );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	@Override
	public ISecureSecClusRole[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "SecureRamSecClusRole.readAllDerived";
		ISecureSecClusRole[] retList = new ISecureSecClusRole[ dictByPKey.values().size() ];
		Iterator< SecureBuffSecClusRole > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	@Override
	public ISecureSecClusRole[] readDerivedByClusterIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ClusterId )
	{
		final String S_ProcName = "SecureRamSecClusRole.readDerivedByClusterIdx";
		SecureBuffSecClusRoleByClusterIdxKey key = (SecureBuffSecClusRoleByClusterIdxKey)schema.getSecureBuffFactory().getFactorySecClusRole().newByClusterIdxKey();

		key.setRequiredClusterId( ClusterId );
		ISecureSecClusRole[] recArray;
		if( dictByClusterIdx.containsKey( key ) ) {
			Map< $implCommaIJavaOptAtomType$, SecureBuffSecClusRole > subdictClusterIdx
				= dictByClusterIdx.get( key );
			recArray = new ISecureSecClusRole[ subdictClusterIdx.size() ];
			Iterator< SecureBuffSecClusRole > iter = subdictClusterIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< $implCommaIJavaOptAtomType$, SecureBuffSecClusRole > subdictClusterIdx
				= new HashMap< $implCommaIJavaOptAtomType$, SecureBuffSecClusRole >();
			dictByClusterIdx.put( key, subdictClusterIdx );
			recArray = new ISecureSecClusRole[0];
		}
		return( recArray );
	}

	@Override
	public ISecureSecClusRole[] readDerivedByNameIdx( ISecureAuthorization Authorization,
		String Name )
	{
		final String S_ProcName = "SecureRamSecClusRole.readDerivedByNameIdx";
		SecureBuffSecClusRoleByNameIdxKey key = (SecureBuffSecClusRoleByNameIdxKey)schema.getSecureBuffFactory().getFactorySecClusRole().newByNameIdxKey();

		key.setRequiredName( Name );
		ISecureSecClusRole[] recArray;
		if( dictByNameIdx.containsKey( key ) ) {
			Map< $implCommaIJavaOptAtomType$, SecureBuffSecClusRole > subdictNameIdx
				= dictByNameIdx.get( key );
			recArray = new ISecureSecClusRole[ subdictNameIdx.size() ];
			Iterator< SecureBuffSecClusRole > iter = subdictNameIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< $implCommaIJavaOptAtomType$, SecureBuffSecClusRole > subdictNameIdx
				= new HashMap< $implCommaIJavaOptAtomType$, SecureBuffSecClusRole >();
			dictByNameIdx.put( key, subdictNameIdx );
			recArray = new ISecureSecClusRole[0];
		}
		return( recArray );
	}

	@Override
	public ISecureSecClusRole readDerivedByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ClusterId,
		String Name )
	{
		final String S_ProcName = "SecureRamSecClusRole.readDerivedByUNameIdx";
		SecureBuffSecClusRoleByUNameIdxKey key = (SecureBuffSecClusRoleByUNameIdxKey)schema.getSecureBuffFactory().getFactorySecClusRole().newByUNameIdxKey();

		key.setRequiredClusterId( ClusterId );
		key.setRequiredName( Name );
		ISecureSecClusRole buff;
		if( dictByUNameIdx.containsKey( key ) ) {
			buff = dictByUNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	@Override
	public ISecureSecClusRole readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 SecClusRoleId )
	{
		final String S_ProcName = "SecureRamSecClusRole.readDerivedByIdIdx() ";
		ISecureSecClusRole buff;
		if( dictByPKey.containsKey( SecClusRoleId ) ) {
			buff = dictByPKey.get( SecClusRoleId );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	@Override
	public ISecureSecClusRole readRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "SecureRamSecClusRole.readRec";
		ISecureSecClusRole buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( buff.getClassCode() != ISecureSecClusRole.CLASS_CODE ) ) {
			buff = null;
		}
		return( buff );
	}

	@Override
	public ISecureSecClusRole lockRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockRec";
		ISecureSecClusRole buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( buff.getClassCode() != ISecureSecClusRole.CLASS_CODE ) ) {
			buff = null;
		}
		return( buff );
	}

	@Override
	public ISecureSecClusRole[] readAllRec( ISecureAuthorization Authorization )
	{
		final String S_ProcName = "SecureRamSecClusRole.readAllRec";
		ISecureSecClusRole buff;
		ArrayList<ISecureSecClusRole> filteredList = new ArrayList<ISecureSecClusRole>();
		ISecureSecClusRole[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && ( buff.getClassCode() == ISecureSecClusRole.CLASS_CODE ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new ISecureSecClusRole[0] ) );
	}

	@Override
	public ISecureSecClusRole readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 SecClusRoleId )
	{
		final String S_ProcName = "SecureRamSecClusRole.readRecByIdIdx() ";
		ISecureSecClusRole buff = readDerivedByIdIdx( Authorization,
			SecClusRoleId );
		if( ( buff != null ) && ( buff.getClassCode() == ISecureSecClusRole.CLASS_CODE ) ) {
			return( (ISecureSecClusRole)buff );
		}
		else {
			return( null );
		}
	}

	@Override
	public ISecureSecClusRole[] readRecByClusterIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ClusterId )
	{
		final String S_ProcName = "SecureRamSecClusRole.readRecByClusterIdx() ";
		ISecureSecClusRole buff;
		ArrayList<ISecureSecClusRole> filteredList = new ArrayList<ISecureSecClusRole>();
		ISecureSecClusRole[] buffList = readDerivedByClusterIdx( Authorization,
			ClusterId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && ( buff.getClassCode() == ISecureSecClusRole.CLASS_CODE ) ) {
				filteredList.add( (ISecureSecClusRole)buff );
			}
		}
		return( filteredList.toArray( new ISecureSecClusRole[0] ) );
	}

	@Override
	public ISecureSecClusRole[] readRecByNameIdx( ISecureAuthorization Authorization,
		String Name )
	{
		final String S_ProcName = "SecureRamSecClusRole.readRecByNameIdx() ";
		ISecureSecClusRole buff;
		ArrayList<ISecureSecClusRole> filteredList = new ArrayList<ISecureSecClusRole>();
		ISecureSecClusRole[] buffList = readDerivedByNameIdx( Authorization,
			Name );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && ( buff.getClassCode() == ISecureSecClusRole.CLASS_CODE ) ) {
				filteredList.add( (ISecureSecClusRole)buff );
			}
		}
		return( filteredList.toArray( new ISecureSecClusRole[0] ) );
	}

	@Override
	public ISecureSecClusRole readRecByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ClusterId,
		String Name )
	{
		final String S_ProcName = "SecureRamSecClusRole.readRecByUNameIdx() ";
		ISecureSecClusRole buff = readDerivedByUNameIdx( Authorization,
			ClusterId,
			Name );
		if( ( buff != null ) && ( buff.getClassCode() == ISecureSecClusRole.CLASS_CODE ) ) {
			return( (ISecureSecClusRole)buff );
		}
		else {
			return( null );
		}
	}

	public ISecureSecClusRole updateSecClusRole( ISecureAuthorization Authorization,
		ISecureSecClusRole iBuff )
	{
		SecureBuffSecClusRole Buff = (SecureBuffSecClusRole)ensureRec(iBuff);
		$implCommaIJavaOptAtomType$ pkey = ($implCommaIJavaOptAtomType$)Buff.getPKey();
		SecureBuffSecClusRole existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new CFStaleCacheDetectedException( getClass(),
				"updateSecClusRole",
				"Existing record not found",
				"Existing record not found",
				"SecClusRole",
				"SecClusRole",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new CFCollisionDetectedException( getClass(),
				"updateSecClusRole",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		SecureBuffSecClusRoleByClusterIdxKey existingKeyClusterIdx = (SecureBuffSecClusRoleByClusterIdxKey)schema.getSecureBuffFactory().getFactorySecClusRole().newByClusterIdxKey();
		existingKeyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		SecureBuffSecClusRoleByClusterIdxKey newKeyClusterIdx = (SecureBuffSecClusRoleByClusterIdxKey)schema.getSecureBuffFactory().getFactorySecClusRole().newByClusterIdxKey();
		newKeyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		SecureBuffSecClusRoleByNameIdxKey existingKeyNameIdx = (SecureBuffSecClusRoleByNameIdxKey)schema.getSecureBuffFactory().getFactorySecClusRole().newByNameIdxKey();
		existingKeyNameIdx.setRequiredName( existing.getRequiredName() );

		SecureBuffSecClusRoleByNameIdxKey newKeyNameIdx = (SecureBuffSecClusRoleByNameIdxKey)schema.getSecureBuffFactory().getFactorySecClusRole().newByNameIdxKey();
		newKeyNameIdx.setRequiredName( Buff.getRequiredName() );

		SecureBuffSecClusRoleByUNameIdxKey existingKeyUNameIdx = (SecureBuffSecClusRoleByUNameIdxKey)schema.getSecureBuffFactory().getFactorySecClusRole().newByUNameIdxKey();
		existingKeyUNameIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		existingKeyUNameIdx.setRequiredName( existing.getRequiredName() );

		SecureBuffSecClusRoleByUNameIdxKey newKeyUNameIdx = (SecureBuffSecClusRoleByUNameIdxKey)schema.getSecureBuffFactory().getFactorySecClusRole().newByUNameIdxKey();
		newKeyUNameIdx.setRequiredClusterId( Buff.getRequiredClusterId() );
		newKeyUNameIdx.setRequiredName( Buff.getRequiredName() );

		// Check unique indexes

		if( ! existingKeyUNameIdx.equals( newKeyUNameIdx ) ) {
			if( dictByUNameIdx.containsKey( newKeyUNameIdx ) ) {
				throw new CFUniqueIndexViolationException( getClass(),
					"updateSecClusRole",
					"SecClusRoleUNameIdx",
					"SecClusRoleUNameIdx",
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
						"updateSecClusRole",
						"Owner",
						"Owner",
						"SecClusRoleCluster",
						"SecClusRoleCluster",
						"Cluster",
						"Cluster",
						null );
				}
			}
		}

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableSecSysGrp().readDerivedByUNameIdx( Authorization,
						Buff.getRequiredName() ) )
				{
					throw new CFUnresolvedRelationException( getClass(),
						"updateSecClusRole",
						"Container",
						"Container",
						"SecClusRoleMembSysRol",
						"SecClusRoleMembSysRol",
						"SecSysGrp",
						"SecSysGrp",
						null );
				}
			}
		}

		// Update is valid

		Map< $implCommaIJavaOptAtomType$, SecureBuffSecClusRole > subdict;

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
			subdict = new HashMap< $implCommaIJavaOptAtomType$, SecureBuffSecClusRole >();
			dictByClusterIdx.put( newKeyClusterIdx, subdict );
		}
		subdict.put( pkey, Buff );

		subdict = dictByNameIdx.get( existingKeyNameIdx );
		if( subdict != null ) {
			subdict.remove( pkey );
		}
		if( dictByNameIdx.containsKey( newKeyNameIdx ) ) {
			subdict = dictByNameIdx.get( newKeyNameIdx );
		}
		else {
			subdict = new HashMap< $implCommaIJavaOptAtomType$, SecureBuffSecClusRole >();
			dictByNameIdx.put( newKeyNameIdx, subdict );
		}
		subdict.put( pkey, Buff );

		dictByUNameIdx.remove( existingKeyUNameIdx );
		dictByUNameIdx.put( newKeyUNameIdx, Buff );

		return(Buff);
	}

	@Override
	public void deleteSecClusRole( ISecureAuthorization Authorization,
		ISecureSecClusRole iBuff )
	{
		final String S_ProcName = "SecureRamSecClusRoleTable.deleteSecClusRole() ";
		SecureBuffSecClusRole Buff = (SecureBuffSecClusRole)ensureRec(iBuff);
		int classCode;
		$implCommaIJavaOptAtomType$ pkey = ($implCommaIJavaOptAtomType$)(Buff.getPKey());
		SecureBuffSecClusRole existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new CFCollisionDetectedException( getClass(),
				"deleteSecClusRole",
				pkey );
		}
		// Short circuit self-referential code to prevent stack overflows
		Object arrCheckSecClusRoleMembByGrp[] = schema.getTableSecClusRoleMemb().readDerivedByClusRoleIdx( Authorization,
						existing.getRequiredSecClusRoleId() );
		if( arrCheckSecClusRoleMembByGrp.length > 0 ) {
			schema.getTableSecClusRoleMemb().deleteSecClusRoleMembByClusRoleIdx( Authorization,
						existing.getRequiredSecClusRoleId() );
		}
		SecureBuffSecClusRoleByClusterIdxKey keyClusterIdx = (SecureBuffSecClusRoleByClusterIdxKey)schema.getSecureBuffFactory().getFactorySecClusRole().newByClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		SecureBuffSecClusRoleByNameIdxKey keyNameIdx = (SecureBuffSecClusRoleByNameIdxKey)schema.getSecureBuffFactory().getFactorySecClusRole().newByNameIdxKey();
		keyNameIdx.setRequiredName( existing.getRequiredName() );

		SecureBuffSecClusRoleByUNameIdxKey keyUNameIdx = (SecureBuffSecClusRoleByUNameIdxKey)schema.getSecureBuffFactory().getFactorySecClusRole().newByUNameIdxKey();
		keyUNameIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< $implCommaIJavaOptAtomType$, SecureBuffSecClusRole > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByClusterIdx.get( keyClusterIdx );
		subdict.remove( pkey );

		subdict = dictByNameIdx.get( keyNameIdx );
		subdict.remove( pkey );

		dictByUNameIdx.remove( keyUNameIdx );

	}
	@Override
	public void deleteSecClusRoleByIdIdx( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		SecureBuffSecClusRole cur;
		LinkedList<SecureBuffSecClusRole> matchSet = new LinkedList<SecureBuffSecClusRole>();
		Iterator<SecureBuffSecClusRole> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<SecureBuffSecClusRole> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = (SecureBuffSecClusRole)(schema.getTableSecClusRole().readDerivedByIdIdx( Authorization,
				cur.getRequiredSecClusRoleId() ));
			deleteSecClusRole( Authorization, cur );
		}
	}

	@Override
	public void deleteSecClusRoleByClusterIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argClusterId )
	{
		SecureBuffSecClusRoleByClusterIdxKey key = (SecureBuffSecClusRoleByClusterIdxKey)schema.getSecureBuffFactory().getFactorySecClusRole().newByClusterIdxKey();
		key.setRequiredClusterId( argClusterId );
		deleteSecClusRoleByClusterIdx( Authorization, key );
	}

	@Override
	public void deleteSecClusRoleByClusterIdx( ISecureAuthorization Authorization,
		ISecureSecClusRoleByClusterIdxKey argKey )
	{
		SecureBuffSecClusRole cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<SecureBuffSecClusRole> matchSet = new LinkedList<SecureBuffSecClusRole>();
		Iterator<SecureBuffSecClusRole> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<SecureBuffSecClusRole> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = (SecureBuffSecClusRole)(schema.getTableSecClusRole().readDerivedByIdIdx( Authorization,
				cur.getRequiredSecClusRoleId() ));
			deleteSecClusRole( Authorization, cur );
		}
	}

	@Override
	public void deleteSecClusRoleByNameIdx( ISecureAuthorization Authorization,
		String argName )
	{
		SecureBuffSecClusRoleByNameIdxKey key = (SecureBuffSecClusRoleByNameIdxKey)schema.getSecureBuffFactory().getFactorySecClusRole().newByNameIdxKey();
		key.setRequiredName( argName );
		deleteSecClusRoleByNameIdx( Authorization, key );
	}

	@Override
	public void deleteSecClusRoleByNameIdx( ISecureAuthorization Authorization,
		ISecureSecClusRoleByNameIdxKey argKey )
	{
		SecureBuffSecClusRole cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<SecureBuffSecClusRole> matchSet = new LinkedList<SecureBuffSecClusRole>();
		Iterator<SecureBuffSecClusRole> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<SecureBuffSecClusRole> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = (SecureBuffSecClusRole)(schema.getTableSecClusRole().readDerivedByIdIdx( Authorization,
				cur.getRequiredSecClusRoleId() ));
			deleteSecClusRole( Authorization, cur );
		}
	}

	@Override
	public void deleteSecClusRoleByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argClusterId,
		String argName )
	{
		SecureBuffSecClusRoleByUNameIdxKey key = (SecureBuffSecClusRoleByUNameIdxKey)schema.getSecureBuffFactory().getFactorySecClusRole().newByUNameIdxKey();
		key.setRequiredClusterId( argClusterId );
		key.setRequiredName( argName );
		deleteSecClusRoleByUNameIdx( Authorization, key );
	}

	@Override
	public void deleteSecClusRoleByUNameIdx( ISecureAuthorization Authorization,
		ISecureSecClusRoleByUNameIdxKey argKey )
	{
		SecureBuffSecClusRole cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<SecureBuffSecClusRole> matchSet = new LinkedList<SecureBuffSecClusRole>();
		Iterator<SecureBuffSecClusRole> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<SecureBuffSecClusRole> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = (SecureBuffSecClusRole)(schema.getTableSecClusRole().readDerivedByIdIdx( Authorization,
				cur.getRequiredSecClusRoleId() ));
			deleteSecClusRole( Authorization, cur );
		}
	}
}
