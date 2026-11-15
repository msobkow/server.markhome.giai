
// Description: Java 25 in-memory RAM DbIO implementation for SysCluster.

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
 *	SecureRamSysClusterTable in-memory RAM DbIO implementation
 *	for SysCluster.
 */
public class SecureRamSysClusterTable
	implements ISecureSysClusterTable
{
	private ISecureSchema schema;
	private Map< $implCommaIJavaOptAtomType$,
				SecureBuffSysCluster > dictByPKey
		= new HashMap< $implCommaIJavaOptAtomType$,
				SecureBuffSysCluster >();
	private Map< SecureBuffSysClusterByClusterIdxKey,
				Map< $implCommaIJavaOptAtomType$,
					SecureBuffSysCluster >> dictByClusterIdx
		= new HashMap< SecureBuffSysClusterByClusterIdxKey,
				Map< $implCommaIJavaOptAtomType$,
					SecureBuffSysCluster >>();

	public SecureRamSysClusterTable( ISecureSchema argSchema ) {
		schema = argSchema;
	}

	public SecureBuffSysCluster ensureRec(ISecureSysCluster rec) {
		return (((SecureBuffSysClusterFactoryService)(schema.getSecureBuffFactory().getFactorySysCluster())).ensureRec(rec));
	}

	@Override
	public ISecureSysCluster createSysCluster( ISecureAuthorization Authorization,
		ISecureSysCluster iBuff )
	{
		final String S_ProcName = "createSysCluster";
		
		SecureBuffSysCluster Buff = (SecureBuffSysCluster)ensureRec(iBuff);
		$implCommaIJavaOptAtomType$ pkey;
		pkey = Buff.getRequiredSingletonId();
		Buff.setRequiredSingletonId( pkey );
		SecureBuffSysClusterByClusterIdxKey keyClusterIdx = (SecureBuffSysClusterByClusterIdxKey)schema.getSecureBuffFactory().getFactorySysCluster().newByClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		// Validate unique indexes

		if( dictByPKey.containsKey( pkey ) ) {
			throw new CFPrimaryKeyNotNewException( getClass(), S_ProcName, pkey );
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
						"SysClusterCluster",
						"SysClusterCluster",
						"Cluster",
						"Cluster",
						null );
				}
			}
		}

		// Proceed with adding the new record

		dictByPKey.put( pkey, Buff );

		Map< $implCommaIJavaOptAtomType$, SecureBuffSysCluster > subdictClusterIdx;
		if( dictByClusterIdx.containsKey( keyClusterIdx ) ) {
			subdictClusterIdx = dictByClusterIdx.get( keyClusterIdx );
		}
		else {
			subdictClusterIdx = new HashMap< $implCommaIJavaOptAtomType$, SecureBuffSysCluster >();
			dictByClusterIdx.put( keyClusterIdx, subdictClusterIdx );
		}
		subdictClusterIdx.put( pkey, Buff );

		if (Buff == null) {
			return( null );
		}
		else {
			int classCode = Buff.getClassCode();
			if (classCode == ISecureSysCluster.CLASS_CODE) {
				SecureBuffSysCluster retbuff = ((SecureBuffSysCluster)(schema.getSecureBuffFactory().getFactorySysCluster().newRec()));
				retbuff.set(Buff);
				return( retbuff );
			}
			else {
				throw new CFUnsupportedClassException(getClass(), S_ProcName, "-create-buff-cloning-", (Integer)classCode, "Classcode not recognized: " + Integer.toString(classCode));
			}
		}
	}

	@Override
	public ISecureSysCluster readDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "SecureRamSysCluster.readDerived";
		ISecureSysCluster buff;
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
	public ISecureSysCluster lockDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "SecureRamSysCluster.lockDerived";
		ISecureSysCluster buff;
		if( dictByPKey.containsKey( PKey ) ) {
			buff = dictByPKey.get( PKey );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	@Override
	public ISecureSysCluster[] readAllDerived( ISecureAuthorization Authorization ) {
		final String S_ProcName = "SecureRamSysCluster.readAllDerived";
		ISecureSysCluster[] retList = new ISecureSysCluster[ dictByPKey.values().size() ];
		Iterator< SecureBuffSysCluster > iter = dictByPKey.values().iterator();
		int idx = 0;
		while( iter.hasNext() ) {
			retList[ idx++ ] = iter.next();
		}
		return( retList );
	}

	@Override
	public ISecureSysCluster[] readDerivedByClusterIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ClusterId )
	{
		final String S_ProcName = "SecureRamSysCluster.readDerivedByClusterIdx";
		SecureBuffSysClusterByClusterIdxKey key = (SecureBuffSysClusterByClusterIdxKey)schema.getSecureBuffFactory().getFactorySysCluster().newByClusterIdxKey();

		key.setRequiredClusterId( ClusterId );
		ISecureSysCluster[] recArray;
		if( dictByClusterIdx.containsKey( key ) ) {
			Map< $implCommaIJavaOptAtomType$, SecureBuffSysCluster > subdictClusterIdx
				= dictByClusterIdx.get( key );
			recArray = new ISecureSysCluster[ subdictClusterIdx.size() ];
			Iterator< SecureBuffSysCluster > iter = subdictClusterIdx.values().iterator();
			int idx = 0;
			while( iter.hasNext() ) {
				recArray[ idx++ ] = iter.next();
			}
		}
		else {
			Map< $implCommaIJavaOptAtomType$, SecureBuffSysCluster > subdictClusterIdx
				= new HashMap< $implCommaIJavaOptAtomType$, SecureBuffSysCluster >();
			dictByClusterIdx.put( key, subdictClusterIdx );
			recArray = new ISecureSysCluster[0];
		}
		return( recArray );
	}

	@Override
	public ISecureSysCluster readDerivedByIdIdx( ISecureAuthorization Authorization,
		int SingletonId )
	{
		final String S_ProcName = "SecureRamSysCluster.readDerivedByIdIdx() ";
		ISecureSysCluster buff;
		if( dictByPKey.containsKey( SingletonId ) ) {
			buff = dictByPKey.get( SingletonId );
		}
		else {
			buff = null;
		}
		return( buff );
	}

	@Override
	public ISecureSysCluster readRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "SecureRamSysCluster.readRec";
		ISecureSysCluster buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( buff.getClassCode() != ISecureSysCluster.CLASS_CODE ) ) {
			buff = null;
		}
		return( buff );
	}

	@Override
	public ISecureSysCluster lockRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey )
	{
		final String S_ProcName = "lockRec";
		ISecureSysCluster buff = readDerived( Authorization, PKey );
		if( ( buff != null ) && ( buff.getClassCode() != ISecureSysCluster.CLASS_CODE ) ) {
			buff = null;
		}
		return( buff );
	}

	@Override
	public ISecureSysCluster[] readAllRec( ISecureAuthorization Authorization )
	{
		final String S_ProcName = "SecureRamSysCluster.readAllRec";
		ISecureSysCluster buff;
		ArrayList<ISecureSysCluster> filteredList = new ArrayList<ISecureSysCluster>();
		ISecureSysCluster[] buffList = readAllDerived( Authorization );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && ( buff.getClassCode() == ISecureSysCluster.CLASS_CODE ) ) {
				filteredList.add( buff );
			}
		}
		return( filteredList.toArray( new ISecureSysCluster[0] ) );
	}

	@Override
	public ISecureSysCluster readRecByIdIdx( ISecureAuthorization Authorization,
		int SingletonId )
	{
		final String S_ProcName = "SecureRamSysCluster.readRecByIdIdx() ";
		ISecureSysCluster buff = readDerivedByIdIdx( Authorization,
			SingletonId );
		if( ( buff != null ) && ( buff.getClassCode() == ISecureSysCluster.CLASS_CODE ) ) {
			return( (ISecureSysCluster)buff );
		}
		else {
			return( null );
		}
	}

	@Override
	public ISecureSysCluster[] readRecByClusterIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ClusterId )
	{
		final String S_ProcName = "SecureRamSysCluster.readRecByClusterIdx() ";
		ISecureSysCluster buff;
		ArrayList<ISecureSysCluster> filteredList = new ArrayList<ISecureSysCluster>();
		ISecureSysCluster[] buffList = readDerivedByClusterIdx( Authorization,
			ClusterId );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[idx];
			if( ( buff != null ) && ( buff.getClassCode() == ISecureSysCluster.CLASS_CODE ) ) {
				filteredList.add( (ISecureSysCluster)buff );
			}
		}
		return( filteredList.toArray( new ISecureSysCluster[0] ) );
	}

	public ISecureSysCluster updateSysCluster( ISecureAuthorization Authorization,
		ISecureSysCluster iBuff )
	{
		SecureBuffSysCluster Buff = (SecureBuffSysCluster)ensureRec(iBuff);
		$implCommaIJavaOptAtomType$ pkey = ($implCommaIJavaOptAtomType$)Buff.getPKey();
		SecureBuffSysCluster existing = dictByPKey.get( pkey );
		if( existing == null ) {
			throw new CFStaleCacheDetectedException( getClass(),
				"updateSysCluster",
				"Existing record not found",
				"Existing record not found",
				"SysCluster",
				"SysCluster",
				pkey );
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() ) {
			throw new CFCollisionDetectedException( getClass(),
				"updateSysCluster",
				pkey );
		}
		Buff.setRequiredRevision( Buff.getRequiredRevision() + 1 );
		SecureBuffSysClusterByClusterIdxKey existingKeyClusterIdx = (SecureBuffSysClusterByClusterIdxKey)schema.getSecureBuffFactory().getFactorySysCluster().newByClusterIdxKey();
		existingKeyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		SecureBuffSysClusterByClusterIdxKey newKeyClusterIdx = (SecureBuffSysClusterByClusterIdxKey)schema.getSecureBuffFactory().getFactorySysCluster().newByClusterIdxKey();
		newKeyClusterIdx.setRequiredClusterId( Buff.getRequiredClusterId() );

		// Check unique indexes

		// Validate foreign keys

		{
			boolean allNull = true;

			if( allNull ) {
				if( null == schema.getTableCluster().readDerivedByIdIdx( Authorization,
						Buff.getRequiredClusterId() ) )
				{
					throw new CFUnresolvedRelationException( getClass(),
						"updateSysCluster",
						"Container",
						"Container",
						"SysClusterCluster",
						"SysClusterCluster",
						"Cluster",
						"Cluster",
						null );
				}
			}
		}

		// Update is valid

		Map< $implCommaIJavaOptAtomType$, SecureBuffSysCluster > subdict;

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
			subdict = new HashMap< $implCommaIJavaOptAtomType$, SecureBuffSysCluster >();
			dictByClusterIdx.put( newKeyClusterIdx, subdict );
		}
		subdict.put( pkey, Buff );

		return(Buff);
	}

	@Override
	public void deleteSysCluster( ISecureAuthorization Authorization,
		ISecureSysCluster iBuff )
	{
		final String S_ProcName = "SecureRamSysClusterTable.deleteSysCluster() ";
		SecureBuffSysCluster Buff = (SecureBuffSysCluster)ensureRec(iBuff);
		int classCode;
		$implCommaIJavaOptAtomType$ pkey = ($implCommaIJavaOptAtomType$)(Buff.getPKey());
		SecureBuffSysCluster existing = dictByPKey.get( pkey );
		if( existing == null ) {
			return;
		}
		if( existing.getRequiredRevision() != Buff.getRequiredRevision() )
		{
			throw new CFCollisionDetectedException( getClass(),
				"deleteSysCluster",
				pkey );
		}
		SecureBuffSysClusterByClusterIdxKey keyClusterIdx = (SecureBuffSysClusterByClusterIdxKey)schema.getSecureBuffFactory().getFactorySysCluster().newByClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		// Validate reverse foreign keys

		// Delete is valid
		Map< $implCommaIJavaOptAtomType$, SecureBuffSysCluster > subdict;

		dictByPKey.remove( pkey );

		subdict = dictByClusterIdx.get( keyClusterIdx );
		subdict.remove( pkey );

	}
	@Override
	public void deleteSysClusterByIdIdx( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ argKey )
	{
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		SecureBuffSysCluster cur;
		LinkedList<SecureBuffSysCluster> matchSet = new LinkedList<SecureBuffSysCluster>();
		Iterator<SecureBuffSysCluster> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<SecureBuffSysCluster> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = (SecureBuffSysCluster)(schema.getTableSysCluster().readDerivedByIdIdx( Authorization,
				cur.getRequiredSingletonId() ));
			deleteSysCluster( Authorization, cur );
		}
	}

	@Override
	public void deleteSysClusterByClusterIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argClusterId )
	{
		SecureBuffSysClusterByClusterIdxKey key = (SecureBuffSysClusterByClusterIdxKey)schema.getSecureBuffFactory().getFactorySysCluster().newByClusterIdxKey();
		key.setRequiredClusterId( argClusterId );
		deleteSysClusterByClusterIdx( Authorization, key );
	}

	@Override
	public void deleteSysClusterByClusterIdx( ISecureAuthorization Authorization,
		ISecureSysClusterByClusterIdxKey argKey )
	{
		SecureBuffSysCluster cur;
		boolean anyNotNull = false;
		anyNotNull = true;
		if( ! anyNotNull ) {
			return;
		}
		LinkedList<SecureBuffSysCluster> matchSet = new LinkedList<SecureBuffSysCluster>();
		Iterator<SecureBuffSysCluster> values = dictByPKey.values().iterator();
		while( values.hasNext() ) {
			cur = values.next();
			if( argKey.equals( cur ) ) {
				matchSet.add( cur );
			}
		}
		Iterator<SecureBuffSysCluster> iterMatch = matchSet.iterator();
		while( iterMatch.hasNext() ) {
			cur = iterMatch.next();
			cur = (SecureBuffSysCluster)(schema.getTableSysCluster().readDerivedByIdIdx( Authorization,
				cur.getRequiredSingletonId() ));
			deleteSysCluster( Authorization, cur );
		}
	}
}
