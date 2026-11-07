// Description: Java 25 Table Object implementation for Tenant.

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

package server.markhome.ycf.v3_1.intnet.intnetobj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.time.*;
import java.util.*;
import org.apache.commons.codec.binaryCFCore64;
import org.apache.commons.text.StringEscapeUtils;
import server.markhome.cf.*;
import server.markhome.cf.dbutil.*;

import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;

public class IntNetTenantTableObj
	implements IIntNetTenantTableObj
{
	protected IBusModelSchemaObj schema;
	private Map<$implCommaIJavaOptAtomType$, ISecureTenantObj> members;
	private Map<$implCommaIJavaOptAtomType$, ISecureTenantObj> allTenant;
	private Map< ISecureTenantByClusterIdxKey,
		Map<$implCommaIJavaOptAtomType$, ISecureTenantObj > > indexByClusterIdx;
	private Map< ISecureTenantByUNameIdxKey,
		ISecureTenantObj > indexByUNameIdx;
	public static String TABLE_NAME = "Tenant";
	public static String TABLE_DBNAME = "tenant";

	public IntNetTenantTableObj() {
		schema = null;
		members = new HashMap<$implCommaIJavaOptAtomType$, ISecureTenantObj>();
		allTenant = null;
		indexByClusterIdx = null;
		indexByUNameIdx = null;
	}

	public IntNetTenantTableObj( ISecureSchemaObj argSchema ) {
		schema = (IBusModelSchemaObj)argSchema;
		members = new HashMap<$implCommaIJavaOptAtomType$, ISecureTenantObj>();
		allTenant = null;
		indexByClusterIdx = null;
		indexByUNameIdx = null;
	}
	
	/**
	 *	Get class code always returns the runtime class code for the objects, which is not stable until the application is done initializing and registering its objects.
	 *
	 *	@return runtime classcode
	 */ 
	@Override
	public int getClassCode() {
		return SecureTenantTableObj.getRuntimeClassCode();
	}	

	/**
	 *	Get the backing store schema's class code, which is hard-coded into the object hierarchy.
	 *
	 *	@return The hardcoded backing store class code for this object, which is only valid in that schema.
	 */
	public static int getBackingClassCode() {
		return( SecureTenantTableObj.getBackingClassCode() );
	}

	/**
	 *	Get the runtime class code for this table; this value is only stable after the application is fully initialized.
	 *
	 *	@return runtimeClassCode
	 */
	public static int getRuntimeClassCode() {
		return( SecureTenantTableObj.getRuntimeClassCode() );
	}

	@Override
	public ISecureSchemaObj getSchema() {
		return( schema );
	}

	@Override
	public void setSchema( ISecureSchemaObj value ) {
		schema = (IBusModelSchemaObj)value;
	}

	@Override
	public String getTableName() {
		return( TABLE_NAME );
	}

	@Override
	public String getTableDbName() {
		return( TABLE_DBNAME );
	}

	@Override
	public Class getObjQualifyingClass() {
		return( null );
	}


	@Override
	public void minimizeMemory() {
		allTenant = null;
		indexByClusterIdx = null;
		indexByUNameIdx = null;
		List<ISecureTenantObj> toForget = new LinkedList<ISecureTenantObj>();
		ISecureTenantObj cur = null;
		Iterator<ISecureTenantObj> iter = members.values().iterator();
		while( iter.hasNext() ) {
			cur = iter.next();
			toForget.add( cur );
		}
		iter = toForget.iterator();
		while( iter.hasNext() ) {
			cur = iter.next();
			cur.forget();
		}
	}
	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	IntNetTenantObj.
	 */
	@Override
	public ISecureTenantObj newInstance() {
		ISecureTenantObj inst = new IntNetTenantObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	IntNetTenantObj.
	 */
	@Override
	public ISecureTenantEditObj newEditInstance( ISecureTenantObj orig ) {
		ISecureTenantEditObj edit = new IntNetTenantEditObj( orig );
		return( edit );
	}

	@Override
	public ISecureTenantObj constructByClassCode( int backingClassCode ) {
		ISecureTenantObj obj = null;
		if( backingClassCode == ISecureTenant.CLASS_CODE) {
			obj = ((IIntNetSchemaObj)schema).getTenantTableObj().newInstance();
		}
		return( obj );
	}

	@Override
	public ISecureTenantObj realiseTenant( ISecureTenantObj Obj ) {
		ISecureTenantObj obj = Obj;
		$implCommaIJavaOptAtomType$ pkey = obj.getPKey();
		ISecureTenantObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ISecureTenantObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByClusterIdx != null ) {
				ISecureTenantByClusterIdxKey keyClusterIdx =
					schema.getSecureBackingStore().getSecureFactory().getFactoryTenant().newByClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<$implCommaIJavaOptAtomType$, ISecureTenantObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.remove( keepObj.getPKey() );
					if( mapClusterIdx.size() <= 0 ) {
						indexByClusterIdx.remove( keyClusterIdx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				ISecureTenantByUNameIdxKey keyUNameIdx =
					schema.getSecureBackingStore().getSecureFactory().getFactoryTenant().newByUNameIdxKey();
				keyUNameIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUNameIdx.setRequiredTenantName( keepObj.getRequiredTenantName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}

			keepObj.setRec( Obj.getRec() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByClusterIdx != null ) {
				ISecureTenantByClusterIdxKey keyClusterIdx =
					schema.getSecureBackingStore().getSecureFactory().getFactoryTenant().newByClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<$implCommaIJavaOptAtomType$, ISecureTenantObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				ISecureTenantByUNameIdxKey keyUNameIdx =
					schema.getSecureBackingStore().getSecureFactory().getFactoryTenant().newByUNameIdxKey();
				keyUNameIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUNameIdx.setRequiredTenantName( keepObj.getRequiredTenantName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( allTenant != null ) {
				allTenant.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allTenant != null ) {
				allTenant.put( keepObj.getPKey(), keepObj );
			}

			if( indexByClusterIdx != null ) {
				ISecureTenantByClusterIdxKey keyClusterIdx =
					schema.getSecureBackingStore().getSecureFactory().getFactoryTenant().newByClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<$implCommaIJavaOptAtomType$, ISecureTenantObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				ISecureTenantByUNameIdxKey keyUNameIdx =
					schema.getSecureBackingStore().getSecureFactory().getFactoryTenant().newByUNameIdxKey();
				keyUNameIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUNameIdx.setRequiredTenantName( keepObj.getRequiredTenantName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	@Override
	public ISecureTenantObj createTenant( ISecureTenantObj Obj ) {
		ISecureTenantObj obj = Obj;
		ISecureTenant rec = obj.getTenantRec();
		schema.getSecureBackingStore().getTableTenant().createTenant(
			null,
			rec );
		obj.copyRecToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	@Override
	public ISecureTenantObj readTenant( $implCommaIJavaOptAtomType$ pkey ) {
		return( readTenant( pkey, false ) );
	}

	@Override
	public ISecureTenantObj readTenant( $implCommaIJavaOptAtomType$ pkey, boolean forceRead ) {
		ISecureTenantObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			ISecureTenant readRec = schema.getSecureBackingStore().getTableTenant().readDerivedByIdIdx( null,
						pkey );
			if( readRec != null ) {
				obj = schema.getTenantTableObj().newInstance();
				obj.setPKey( readRec.getPKey() );
				obj.setRec( readRec );
				obj = (ISecureTenantObj)obj.realise();
			}
		}
		return( obj );
	}

	@Override
	public ISecureTenantObj readCachedTenant( $implCommaIJavaOptAtomType$ pkey ) {
		ISecureTenantObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	@Override
	public void reallyDeepDisposeTenant( ISecureTenantObj obj )
	{
		final String S_ProcName = "IntNetTenantTableObj.reallyDeepDisposeTenant() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		$implCommaIJavaOptAtomType$ pkey = obj.getPKey();
		ISecureTenantObj existing = readCachedTenant( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		ISecureTenantByClusterIdxKey keyClusterIdx = schema.getSecureBackingStore().getSecureFactory().getFactoryTenant().newByClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		ISecureTenantByUNameIdxKey keyUNameIdx = schema.getSecureBackingStore().getSecureFactory().getFactoryTenant().newByUNameIdxKey();
		keyUNameIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUNameIdx.setRequiredTenantName( existing.getRequiredTenantName() );


					schema.getTldTableObj().deepDisposeTldByTenantIdx( existing.getRequiredId() );
					schema.getSecTentRoleTableObj().deepDisposeSecTentRoleByTenantIdx( existing.getRequiredId() );
		ISecureSecTentGrpObj objDelTentGrpMembs;
		List<ISecureSecTentGrpObj> arrDelTentGrpMembs = schema.getSecTentGrpTableObj().readCachedSecTentGrpByTenantIdx( existing.getRequiredId() );
		Iterator<ISecureSecTentGrpObj> iterDelTentGrpMembs = arrDelTentGrpMembs.iterator();
		while( iterDelTentGrpMembs.hasNext() ) {
			objDelTentGrpMembs = iterDelTentGrpMembs.next();
			if( objDelTentGrpMembs != null ) {
						schema.getSecTentGrpMembTableObj().deepDisposeSecTentGrpMembByTentGrpIdx( objDelTentGrpMembs.getRequiredSecTentGrpId() );
			}
		}
					schema.getSecTentGrpTableObj().deepDisposeSecTentGrpByTenantIdx( existing.getRequiredId() );

		if( indexByClusterIdx != null ) {
			if( indexByClusterIdx.containsKey( keyClusterIdx ) ) {
				indexByClusterIdx.get( keyClusterIdx ).remove( pkey );
				if( indexByClusterIdx.get( keyClusterIdx ).size() <= 0 ) {
					indexByClusterIdx.remove( keyClusterIdx );
				}
			}
		}

		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}


	}
	@Override
	public void deepDisposeTenant( $implCommaIJavaOptAtomType$ pkey ) {
		ISecureTenantObj obj = readCachedTenant( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	@Override
	public ISecureTenantObj lockTenant( $implCommaIJavaOptAtomType$ pkey ) {
		ISecureTenantObj locked = null;
		ISecureTenant lockRec = schema.getSecureBackingStore().getTableTenant().lockDerived( null, pkey );
		if( lockRec != null ) {
				locked = schema.getTenantTableObj().newInstance();
			locked.setRec( lockRec );
			locked.setPKey( lockRec.getPKey() );
			locked = (ISecureTenantObj)locked.realise();
		}
		else {
			throw new CFCollisionDetectedException( getClass(), "lockTenant", pkey );
		}
		return( locked );
	}

	@Override
	public List<ISecureTenantObj> readAllTenant() {
		return( readAllTenant( false ) );
	}

	@Override
	public List<ISecureTenantObj> readAllTenant( boolean forceRead ) {
		final String S_ProcName = "readAllTenant";
		if( ( allTenant == null ) || forceRead ) {
			Map<$implCommaIJavaOptAtomType$, ISecureTenantObj> map = new HashMap<$implCommaIJavaOptAtomType$,ISecureTenantObj>();
			allTenant = map;
			ISecureTenant[] recList = schema.getSecureBackingStore().getTableTenant().readAllDerived( null );
			ISecureTenant rec;
			ISecureTenantObj obj;
			for( int idx = 0; idx < recList.length; idx ++ ) {
				rec = recList[ idx ];
				obj = newInstance();
				obj.setPKey( rec.getPKey() );
				obj.setRec( rec );
				ISecureTenantObj realised = (ISecureTenantObj)obj.realise();
			}
		}
		int len = allTenant.size();
		ISecureTenantObj arr[] = new ISecureTenantObj[len];
		Iterator<ISecureTenantObj> valIter = allTenant.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ISecureTenantObj> arrayList = new ArrayList<ISecureTenantObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ISecureTenantObj> cmp = new Comparator<ISecureTenantObj>() {
			@Override
			public int compare( ISecureTenantObj lhs, ISecureTenantObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					$implCommaIJavaOptAtomType$ lhsPKey = lhs.getPKey();
					$implCommaIJavaOptAtomType$ rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ISecureTenantObj> sortedList = arrayList;
		return( sortedList );
	}

	@Override
	public List<ISecureTenantObj> readCachedAllTenant() {
		final String S_ProcName = "readCachedAllTenant";
		ArrayList<ISecureTenantObj> arrayList = new ArrayList<ISecureTenantObj>();
		if( allTenant != null ) {
			int len = allTenant.size();
			ISecureTenantObj arr[] = new ISecureTenantObj[len];
			Iterator<ISecureTenantObj> valIter = allTenant.values().iterator();
			int idx = 0;
			while( ( idx < len ) && valIter.hasNext() ) {
				arr[idx++] = valIter.next();
			}
			if( idx < len ) {
				throw new CFArgumentUnderflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
			}
			else if( valIter.hasNext() ) {
				throw new CFArgumentOverflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
			}
			for( idx = 0; idx < len; idx ++ ) {
				arrayList.add( arr[idx] );
			}
		}
		Comparator<ISecureTenantObj> cmp = new Comparator<ISecureTenantObj>() {
			public int compare( ISecureTenantObj lhs, ISecureTenantObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					$implCommaIJavaOptAtomType$ lhsPKey = lhs.getPKey();
					$implCommaIJavaOptAtomType$ rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	@Override
	public ISecureTenantObj readTenantByIdIdx( ICFKeyHash256 Id )
	{
		return( readTenantByIdIdx( Id,
			false ) );
	}

	@Override
	public ISecureTenantObj readTenantByIdIdx( ICFKeyHash256 Id, boolean forceRead )
	{
		ISecureTenantObj obj = readTenant( Id, forceRead );
		return( obj );
	}

	@Override
	public List<ISecureTenantObj> readTenantByClusterIdx( ICFKeyHash256 ClusterId )
	{
		return( readTenantByClusterIdx( ClusterId,
			false ) );
	}

	@Override
	public List<ISecureTenantObj> readTenantByClusterIdx( ICFKeyHash256 ClusterId,
		boolean forceRead )
	{
		final String S_ProcName = "readTenantByClusterIdx";
		ISecureTenantByClusterIdxKey key = schema.getSecureBackingStore().getSecureFactory().getFactoryTenant().newByClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		Map<$implCommaIJavaOptAtomType$, ISecureTenantObj> dict;
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< ISecureTenantByClusterIdxKey,
				Map< $implCommaIJavaOptAtomType$, ISecureTenantObj > >();
		}
		if( ( ! forceRead ) && indexByClusterIdx.containsKey( key ) ) {
			dict = indexByClusterIdx.get( key );
		}
		else {
			dict = new HashMap<$implCommaIJavaOptAtomType$, ISecureTenantObj>();
			ISecureTenantObj obj;
			ISecureTenant[] recList = schema.getSecureBackingStore().getTableTenant().readDerivedByClusterIdx( null,
				ClusterId );
			ISecureTenant rec;
			for( int idx = 0; idx < recList.length; idx ++ ) {
				rec = recList[ idx ];
				obj = schema.getTenantTableObj().newInstance();
				obj.setPKey( rec.getPKey() );
				obj.setRec( rec );
				ISecureTenantObj realised = (ISecureTenantObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClusterIdx.put( key, dict );
		}
		int len = dict.size();
		ISecureTenantObj arr[] = new ISecureTenantObj[len];
		Iterator<ISecureTenantObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ISecureTenantObj> arrayList = new ArrayList<ISecureTenantObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ISecureTenantObj> cmp = new Comparator<ISecureTenantObj>() {
			@Override
			public int compare( ISecureTenantObj lhs, ISecureTenantObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					$implCommaIJavaOptAtomType$ lhsPKey = lhs.getPKey();
					$implCommaIJavaOptAtomType$ rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ISecureTenantObj> sortedList = arrayList;
		return( sortedList );
	}

	@Override
	public ISecureTenantObj readTenantByUNameIdx( ICFKeyHash256 ClusterId,
		String TenantName )
	{
		return( readTenantByUNameIdx( ClusterId,
			TenantName,
			false ) );
	}

	@Override
	public ISecureTenantObj readTenantByUNameIdx( ICFKeyHash256 ClusterId,
		String TenantName, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< ISecureTenantByUNameIdxKey,
				ISecureTenantObj >();
		}
		ISecureTenantByUNameIdxKey key = schema.getSecureBackingStore().getSecureFactory().getFactoryTenant().newByUNameIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredTenantName( TenantName );
		ISecureTenantObj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			ISecureTenant rec = schema.getSecureBackingStore().getTableTenant().readDerivedByUNameIdx( null,
				ClusterId,
				TenantName );
			if( rec != null ) {
				obj = schema.getTenantTableObj().newInstance();
				obj.setRec( rec );
				obj.setPKey( rec.getPKey() );
				obj = (ISecureTenantObj)obj.realise();
			}
		}
		return( obj );
	}

	@Override
	public ISecureTenantObj readCachedTenantByIdIdx( ICFKeyHash256 Id )
	{
		ISecureTenantObj obj = null;
		obj = readCachedTenant( Id );
		return( obj );
	}

	@Override
	public List<ISecureTenantObj> readCachedTenantByClusterIdx( ICFKeyHash256 ClusterId )
	{
		final String S_ProcName = "readCachedTenantByClusterIdx";
		ISecureTenantByClusterIdxKey key = schema.getSecureBackingStore().getSecureFactory().getFactoryTenant().newByClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		ArrayList<ISecureTenantObj> arrayList = new ArrayList<ISecureTenantObj>();
		if( indexByClusterIdx != null ) {
			Map<$implCommaIJavaOptAtomType$, ISecureTenantObj> dict;
			if( indexByClusterIdx.containsKey( key ) ) {
				dict = indexByClusterIdx.get( key );
				int len = dict.size();
				ISecureTenantObj arr[] = new ISecureTenantObj[len];
				Iterator<ISecureTenantObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			ISecureTenantObj obj;
			Iterator<ISecureTenantObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getRec().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ISecureTenantObj> cmp = new Comparator<ISecureTenantObj>() {
			@Override
			public int compare( ISecureTenantObj lhs, ISecureTenantObj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					$implCommaIJavaOptAtomType$ lhsPKey = lhs.getPKey();
					$implCommaIJavaOptAtomType$ rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	@Override
	public ISecureTenantObj readCachedTenantByUNameIdx( ICFKeyHash256 ClusterId,
		String TenantName )
	{
		ISecureTenantObj obj = null;
		ISecureTenantByUNameIdxKey key = schema.getSecureBackingStore().getSecureFactory().getFactoryTenant().newByUNameIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredTenantName( TenantName );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<ISecureTenantObj> valIter = members.values().iterator();
				while( ( obj == null ) && valIter.hasNext() ) {
					obj = valIter.next();
					if( obj != null ) {
						if( obj.getRec().compareTo( key ) != 0 ) {
							obj = null;
						}
					}
				}
			}
		}
		else {
			Iterator<ISecureTenantObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getRec().compareTo( key ) != 0 ) {
						obj = null;
					}
				}
			}
		}
		return( obj );
	}

	@Override
	public void deepDisposeTenantByIdIdx( ICFKeyHash256 Id )
	{
		ISecureTenantObj obj = readCachedTenantByIdIdx( Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	@Override
	public void deepDisposeTenantByClusterIdx( ICFKeyHash256 ClusterId )
	{
		final String S_ProcName = "deepDisposeTenantByClusterIdx";
		ISecureTenantObj obj;
		List<ISecureTenantObj> arrayList = readCachedTenantByClusterIdx( ClusterId );
		if( arrayList != null )  {
			Iterator<ISecureTenantObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	@Override
	public void deepDisposeTenantByUNameIdx( ICFKeyHash256 ClusterId,
		String TenantName )
	{
		ISecureTenantObj obj = readCachedTenantByUNameIdx( ClusterId,
				TenantName );
		if( obj != null ) {
			obj.forget();
		}
	}

	@Override
	public ISecureTenantObj updateTenant( ISecureTenantObj Obj ) {
		ISecureTenantObj obj = Obj;
		schema.getSecureBackingStore().getTableTenant().updateTenant( null,
			Obj.getTenantRec() );
		obj = (ISecureTenantObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	@Override
	public void deleteTenant( ISecureTenantObj Obj ) {
		ISecureTenantObj obj = Obj;
		schema.getSecureBackingStore().getTableTenant().deleteTenant( null,
			obj.getTenantRec() );
		Obj.forget();
	}

	@Override
	public void deleteTenantByIdIdx( ICFKeyHash256 Id )
	{
		ISecureTenantObj obj = readTenant(Id);
		if( obj != null ) {
			ISecureTenantEditObj editObj = (ISecureTenantEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ISecureTenantEditObj)obj.beginEdit();
				if( editObj != null ) {
					editStarted = true;
				}
				else {
					editStarted = false;
				}
			}
			else {
				editStarted = false;
			}
			if( editObj != null ) {
				editObj.deleteInstance();
				if( editStarted ) {
					editObj.endEdit();
				}
			}
			obj.forget();
		}
		deepDisposeTenantByIdIdx( Id );
	}

	@Override
	public void deleteTenantByClusterIdx( ICFKeyHash256 ClusterId )
	{
		ISecureTenantByClusterIdxKey key = schema.getSecureBackingStore().getSecureFactory().getFactoryTenant().newByClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< ISecureTenantByClusterIdxKey,
				Map< $implCommaIJavaOptAtomType$, ISecureTenantObj > >();
		}
		if( indexByClusterIdx.containsKey( key ) ) {
			Map<$implCommaIJavaOptAtomType$, ISecureTenantObj> dict = indexByClusterIdx.get( key );
			schema.getSecureBackingStore().getTableTenant().deleteTenantByClusterIdx( null,
				ClusterId );
			Iterator<ISecureTenantObj> iter = dict.values().iterator();
			ISecureTenantObj obj;
			List<ISecureTenantObj> toForget = new LinkedList<ISecureTenantObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByClusterIdx.remove( key );
		}
		else {
			schema.getSecureBackingStore().getTableTenant().deleteTenantByClusterIdx( null,
				ClusterId );
		}
		deepDisposeTenantByClusterIdx( ClusterId );
	}

	@Override
	public void deleteTenantByUNameIdx( ICFKeyHash256 ClusterId,
		String TenantName )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< ISecureTenantByUNameIdxKey,
				ISecureTenantObj >();
		}
		ISecureTenantByUNameIdxKey key = schema.getSecureBackingStore().getSecureFactory().getFactoryTenant().newByUNameIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredTenantName( TenantName );
		ISecureTenantObj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			schema.getSecureBackingStore().getTableTenant().deleteTenantByUNameIdx( null,
				ClusterId,
				TenantName );
			obj.forget();
		}
		else {
			schema.getSecureBackingStore().getTableTenant().deleteTenantByUNameIdx( null,
				ClusterId,
				TenantName );
		}
		deepDisposeTenantByUNameIdx( ClusterId,
				TenantName );
	}
}