
// Description: Java 25 in-memory RAM DbIO implementation for Cluster.

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
 *	SecureRamClusterTable in-memory RAM DbIO implementation
 *	for Cluster.
 */
public class SecureRamClusterTable
	implements ISecureClusterTable
{
	private ISecureSchema schema;
	private Map< $implCommaIJavaOptAtomType$,
				SecureBuffCluster > dictByPKey
		= new HashMap< $implCommaIJavaOptAtomType$,
				SecureBuffCluster >();
	private Map< SecureBuffClusterByUDomNameIdxKey,
			SecureBuffCluster > dictByUDomNameIdx
		= new HashMap< SecureBuffClusterByUDomNameIdxKey,
			SecureBuffCluster >();
	private Map< SecureBuffClusterByUDescrIdxKey,
			SecureBuffCluster > dictByUDescrIdx
		= new HashMap< SecureBuffClusterByUDescrIdxKey,
			SecureBuffCluster >();

	public SecureRamClusterTable( ISecureSchema argSchema ) {
		schema = argSchema;
	}

	public SecureBuffCluster ensureRec(ISecureCluster rec) {
		return (((SecureBuffClusterFactoryService)(schema.getSecureBuffFactory().getFactoryCluster())).ensureRec(rec));
	}

	@Override
	public ISecureCluster createCluster( ISecureAuthorization Authorization,
		ISecureCluster iBuff )
	{
		final String S_ProcName = "createCluster";
		
		SecureBuffCluster Buff = (SecureBuffCluster)ensureRec(iBuff);
		$implCommaIJavaOptAtomType$ pkey;
		pkey = schema.nextClusterIdGen();
		Buff.setRequiredId( pkey );
		SecureBuffClusterByUDomNameIdxKey keyUDomNameIdx = (SecureBuffClusterByUDomNameIdxKey)schema.getSecureBuffFactory().getFactoryCluster().newByUDomNameIdxKey();
		keyUDomNameIdx.setRequiredFullDomName( Buff.getRequiredFullDomName() );

		SecureBuffClusterByUDescrIdxKey keyUDescrIdx = (SecureBuffClusterByUDescrIdxKey)schema.getSecureBuffFactory().getFactoryCluster().newByUDescrIdxKey();
		keyUDescrIdx.setRequiredDescription( Buff.getRequiredDescription() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new CFPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
		}

		if( dictByUDomNameIdx.containsKey( keyUDomNameIdx ) ) {
			throw new CFUniqueIndexViolationException( getClass(),
				S_ProcName,
				"ClusterUDomNameIdx",
				"ClusterUDomNameIdx",
				keyUDomNameIdx );
		}

		if( dictByUDescrIdx.containsKey( keyUDescrIdx ) ) {
			throw new CFUniqueIndexViolationException( getClass(),
				S_ProcName,
				"ClusterUDescrNameIdx",
				"ClusterUDescrNameIdx",
				keyUDescrIdx );
		}

		// Validate foreign keys

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		dictByUDomNameIdx.put( keyUDomNameIdx, Buff );

		dictByUDescrIdx.put( keyUDescrIdx, Buff );

		if (Buff == null) {
			return( null );
		}
		else {
			int classCode = Buff.getClassCode();
			if (classCode == ISecureCluster.CLASS_CODE) {
				SecureBuffCluster retbuff = ((SecureBuffCluster)(schema.getSecureBuffFactory().getFactoryCluster().newRec()));
				retbuff.set(Buff);
				return( retbuff );
			}
			else {
				throw new CFUnsupportedClassException(getClass(), S_ProcName, "-create-buff-cloning-", (Integer)classCode, "Classcode not recognized: " + Integer.toString(classCode));
			}
		}
	}

	@Override
	public ISecureCluster readDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "SecureRamCluster.readDerived";
		ISecureCluster buff;
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
	public ISecureCluster lockDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "SecureRamCluster.lockDerived";
		ISecureCluster buff;
		if( dictByPKey.containsKey( PKey ) ) {
			buff = dictByPKey.get( PKey );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	@Override
	public ISecureCluster[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "SecureRamCluster.readAllDerived";
		ISecureCluster[] retList = new ISecureCluster[ dictByPKey.values().size() ];
		Iterator< SecureBuffCluster > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	@Override
	public ISecureCluster readDerivedByUDomNameIdx( ISecureAuthorization Authorization,
		String FullDomName )
	{
		final String S_ProcName = "SecureRamCluster.readDerivedByUDomNameIdx";
		SecureBuffClusterByUDomNameIdxKey key = (SecureBuffClusterByUDomNameIdxKey)schema.getSecureBuffFactory().getFactoryCluster().newByUDomNameIdxKey();

		key.setRequiredFullDomName( FullDomName );
		ISecureCluster buff;
		if( dictByUDomNameIdx.containsKey( key ) ) {
			buff = dictByUDomNameIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	@Override
	public ISecureCluster readDerivedByUDescrIdx( ISecureAuthorization Authorization,
		String Description )
	{
		final String S_ProcName = "SecureRamCluster.readDerivedByUDescrIdx";
		SecureBuffClusterByUDescrIdxKey key = (SecureBuffClusterByUDescrIdxKey)schema.getSecureBuffFactory().getFactoryCluster().newByUDescrIdxKey();

		key.setRequiredDescription( Description );
		ISecureCluster buff;
		if( dictByUDescrIdx.containsKey( key ) ) {
			buff = dictByUDescrIdx.get( key );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	@Override
	public ISecureCluster readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 Id )
	{
		final String S_ProcName = "SecureRamCluster.readDerivedByIdIdx() ";
		ISecureCluster buff;
		if( dictByPKey.containsKey( Id ) ) {
			buff = dictByPKey.get( Id );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	@Override
	public ISecureCluster readRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "SecureRamCluster.readRec";
		ISecureCluster buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( buff.getClassCode() != ISecureCluster.CLASS_CODE ) ) {
			buff = null;
		}
		return( buff );
	}

	@Override
	public ISecureCluster lockRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockRec";
		ISecureCluster buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( buff.getClassCode() != ISecureCluster.CLASS_CODE ) ) {
			buff = null;
		}
		return( buff );
	}

	@Override
	public ISecureCluster[] readAllRec( ISecureAuthorization Authorization )
	{
		final String S_ProcName = "SecureRamCluster.readAllRec";
		ISecureCluster buff;
		ArrayList<ISecureCluster> filteredList = new ArrayList<ISecureCluster>();
		ISecureCluster[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && ( buff.getClassCode() == ISecureCluster.CLASS_CODE ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new ISecureCluster[0] ) );
	}

	@Override
	public ISecureCluster readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 Id )
	{
		final String S_ProcName = "SecureRamCluster.readRecByIdIdx() ";
		ISecureCluster buff = readDerivedByIdIdx( Authorization,
			Id );
		if( ( buff != null ) && ( buff.getClassCode() == ISecureCluster.CLASS_CODE ) ) {
			return( (ISecureCluster)buff );
		}
		else {
			return( null );
		}
	}

	@Override
	public ISecureCluster readRecByUDomNameIdx( ISecureAuthorization Authorization,
		String FullDomName )
	{
		final String S_ProcName = "SecureRamCluster.readRecByUDomNameIdx() ";
		ISecureCluster buff = readDerivedByUDomNameIdx( Authorization,
			FullDomName );
		if( ( buff != null ) && ( buff.getClassCode() == ISecureCluster.CLASS_CODE ) ) {
			return( (ISecureCluster)buff );
		}
		else {
			return( null );
		}
	}

	@Override
	public ISecureCluster readRecByUDescrIdx( ISecureAuthorization Authorization,
		String Description )
	{
		final String S_ProcName = "SecureRamCluster.readRecByUDescrIdx() ";
		ISecureCluster buff = readDerivedByUDescrIdx( Authorization,
			Description );
		if( ( buff != null ) && ( buff.getClassCode() == ISecureCluster.CLASS_CODE ) ) {
			return( (ISecureCluster)buff );
		}
		else {
			return( null );
		}
	}

	public ISecureCluster updateCluster( ISecureAuthorization Authorization,
		ISecureCluster iBuff )
	{
		SecureBuffCluster Buff = (SecureBuffCluster)ensureRec(iBuff);
		$implCommaIJavaOptAtomType$ pkey = ($implCommaIJavaOptAtomType$)Buff.getPKey();
		SecureBuffCluster existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new CFStaleCacheDetectedException( getClass(),
				"updateCluster",
				"Existing record not found",
				"Existing record not found",
				"Cluster",
				"Cluster",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new CFCollisionDetectedException( getClass(),
				"updateCluster",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		SecureBuffClusterByUDomNameIdxKey existingKeyUDomNameIdx = (SecureBuffClusterByUDomNameIdxKey)schema.getSecureBuffFactory().getFactoryCluster().newByUDomNameIdxKey();
		existingKeyUDomNameIdx.setRequiredFullDomName( existing.getRequiredFullDomName() );

		SecureBuffClusterByUDomNameIdxKey newKeyUDomNameIdx = (SecureBuffClusterByUDomNameIdxKey)schema.getSecureBuffFactory().getFactoryCluster().newByUDomNameIdxKey();
		newKeyUDomNameIdx.setRequiredFullDomName( Buff.getRequiredFullDomName() );

		SecureBuffClusterByUDescrIdxKey existingKeyUDescrIdx = (SecureBuffClusterByUDescrIdxKey)schema.getSecureBuffFactory().getFactoryCluster().newByUDescrIdxKey();
		existingKeyUDescrIdx.setRequiredDescription( existing.getRequiredDescription() );

		SecureBuffClusterByUDescrIdxKey newKeyUDescrIdx = (SecureBuffClusterByUDescrIdxKey)schema.getSecureBuffFactory().getFactoryCluster().newByUDescrIdxKey();
		newKeyUDescrIdx.setRequiredDescription( Buff.getRequiredDescription() );

		// Check unique indexes

		if( ! existingKeyUDomNameIdx.equals( newKeyUDomNameIdx ) ) {
			if( dictByUDomNameIdx.containsKey( newKeyUDomNameIdx ) ) {
				throw new CFUniqueIndexViolationException( getClass(),
					"updateCluster",
					"ClusterUDomNameIdx",
					"ClusterUDomNameIdx",
					newKeyUDomNameIdx );
			}
		}

		if( ! existingKeyUDescrIdx.equals( newKeyUDescrIdx ) ) {
			if( dictByUDescrIdx.containsKey( newKeyUDescrIdx ) ) {
				throw new CFUniqueIndexViolationException( getClass(),
					"updateCluster",
					"ClusterUDescrNameIdx",
					"ClusterUDescrNameIdx",
					newKeyUDescrIdx );
			}
		}

		// Validate foreign keys

		// Update is valid

		Map< $implCommaIJavaOptAtomType$, SecureBuffCluster > subdict;

		dictByPKey.remove( pkey );
		dictByPKey.put( pkey, Buff );

		dictByUDomNameIdx.remove( existingKeyUDomNameIdx );
		dictByUDomNameIdx.put( newKeyUDomNameIdx, Buff );

		dictByUDescrIdx.remove( existingKeyUDescrIdx );
		dictByUDescrIdx.put( newKeyUDescrIdx, Buff );

		return(Buff);
	}

	@Override
	public void deleteCluster( ISecureAuthorization Authorization,
		ISecureCluster iBuff )
	{
		final String S_ProcName = "SecureRamClusterTable.deleteCluster() ";
		SecureBuffCluster Buff = (SecureBuffCluster)ensureRec(iBuff);
		int classCode;
		$implCommaIJavaOptAtomType$ pkey = ($implCommaIJavaOptAtomType$)(Buff.getPKey());
		SecureBuffCluster existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new CFCollisionDetectedException( getClass(),
				"deleteCluster",
				pkey );
		}
					schema.getTableSecClusRole().deleteSecClusRoleByClusterIdx( Authorization,
						existing.getRequiredId() );
					schema.getTableSecClusGrp().deleteSecClusGrpByClusterIdx( Authorization,
						existing.getRequiredId() );
					schema.getTableTenant().deleteTenantByClusterIdx( Authorization,
						existing.getRequiredId() );
		SecureBuffClusterByUDomNameIdxKey keyUDomNameIdx = (SecureBuffClusterByUDomNameIdxKey)schema.getSecureBuffFactory().getFactoryCluster().newByUDomNameIdxKey();
		keyUDomNameIdx.setRequiredFullDomName( existing.getRequiredFullDomName() );

		SecureBuffClusterByUDescrIdxKey keyUDescrIdx = (SecureBuffClusterByUDescrIdxKey)schema.getSecureBuffFactory().getFactoryCluster().newByUDescrIdxKey();
		keyUDescrIdx.setRequiredDescription( existing.getRequiredDescription() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< $implCommaIJavaOptAtomType$, SecureBuffCluster > subdict;

		dictByPKey.remove( pkey );

		dictByUDomNameIdx.remove( keyUDomNameIdx );

		dictByUDescrIdx.remove( keyUDescrIdx );

	}
	@Override
	public void deleteClusterByIdIdx( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		SecureBuffCluster cur;
		LinkedList<SecureBuffCluster> matchSet = new LinkedList<SecureBuffCluster>();
		Iterator<SecureBuffCluster> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<SecureBuffCluster> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = (SecureBuffCluster)(schema.getTableCluster().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() ));
			deleteCluster( Authorization, cur );
		}
	}

	@Override
	public void deleteClusterByUDomNameIdx( ISecureAuthorization Authorization,
		String argFullDomName )
	{
		SecureBuffClusterByUDomNameIdxKey key = (SecureBuffClusterByUDomNameIdxKey)schema.getSecureBuffFactory().getFactoryCluster().newByUDomNameIdxKey();
		key.setRequiredFullDomName( argFullDomName );
		deleteClusterByUDomNameIdx( Authorization, key );
	}

	@Override
	public void deleteClusterByUDomNameIdx( ISecureAuthorization Authorization,
		ISecureClusterByUDomNameIdxKey argKey )
	{
		SecureBuffCluster cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<SecureBuffCluster> matchSet = new LinkedList<SecureBuffCluster>();
		Iterator<SecureBuffCluster> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<SecureBuffCluster> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = (SecureBuffCluster)(schema.getTableCluster().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() ));
			deleteCluster( Authorization, cur );
		}
	}

	@Override
	public void deleteClusterByUDescrIdx( ISecureAuthorization Authorization,
		String argDescription )
	{
		SecureBuffClusterByUDescrIdxKey key = (SecureBuffClusterByUDescrIdxKey)schema.getSecureBuffFactory().getFactoryCluster().newByUDescrIdxKey();
		key.setRequiredDescription( argDescription );
		deleteClusterByUDescrIdx( Authorization, key );
	}

	@Override
	public void deleteClusterByUDescrIdx( ISecureAuthorization Authorization,
		ISecureClusterByUDescrIdxKey argKey )
	{
		SecureBuffCluster cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<SecureBuffCluster> matchSet = new LinkedList<SecureBuffCluster>();
		Iterator<SecureBuffCluster> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<SecureBuffCluster> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = (SecureBuffCluster)(schema.getTableCluster().readDerivedByIdIdx( Authorization,
				cur.getRequiredId() ));
			deleteCluster( Authorization, cur );
		}
	}
}
