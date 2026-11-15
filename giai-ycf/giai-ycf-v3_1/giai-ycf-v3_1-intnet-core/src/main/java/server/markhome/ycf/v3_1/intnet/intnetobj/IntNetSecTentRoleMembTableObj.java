// Description: Java 25 Table Object implementation for SecTentRoleMemb.

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

public class IntNetSecTentRoleMembTableObj
	implements IIntNetSecTentRoleMembTableObj
{
	protected IBusModelSchemaObj schema;
	private Map<ISecureSecTentRoleMembPKey, ISecureSecTentRoleMembObj> members;
	private Map<ISecureSecTentRoleMembPKey, ISecureSecTentRoleMembObj> allSecTentRoleMemb;
	private Map< ISecureSecTentRoleMembByTentRoleIdxKey,
		Map<ISecureSecTentRoleMembPKey, ISecureSecTentRoleMembObj > > indexByTentRoleIdx;
	private Map< ISecureSecTentRoleMembByUserIdxKey,
		Map<ISecureSecTentRoleMembPKey, ISecureSecTentRoleMembObj > > indexByUserIdx;
	public static String TABLE_NAME = "SecTentRoleMemb";
	public static String TABLE_DBNAME = "sectentrolememb";

	public IntNetSecTentRoleMembTableObj() {
		schema = null;
		members = new HashMap<ISecureSecTentRoleMembPKey, ISecureSecTentRoleMembObj>();
		allSecTentRoleMemb = null;
		indexByTentRoleIdx = null;
		indexByUserIdx = null;
	}

	public IntNetSecTentRoleMembTableObj( ISecureSchemaObj argSchema ) {
		schema = (IBusModelSchemaObj)argSchema;
		members = new HashMap<ISecureSecTentRoleMembPKey, ISecureSecTentRoleMembObj>();
		allSecTentRoleMemb = null;
		indexByTentRoleIdx = null;
		indexByUserIdx = null;
	}
	
	/**
	 *	Get class code always returns the runtime class code for the objects, which is not stable until the application is done initializing and registering its objects.
	 *
	 *	@return runtime classcode
	 */ 
	@Override
	public int getClassCode() {
		return SecureSecTentRoleMembTableObj.getRuntimeClassCode();
	}	

	/**
	 *	Get the backing store schema's class code, which is hard-coded into the object hierarchy.
	 *
	 *	@return The hardcoded backing store class code for this object, which is only valid in that schema.
	 */
	public static int getBackingClassCode() {
		return( SecureSecTentRoleMembTableObj.getBackingClassCode() );
	}

	/**
	 *	Get the runtime class code for this table; this value is only stable after the application is fully initialized.
	 *
	 *	@return runtimeClassCode
	 */
	public static int getRuntimeClassCode() {
		return( SecureSecTentRoleMembTableObj.getRuntimeClassCode() );
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
		allSecTentRoleMemb = null;
		indexByTentRoleIdx = null;
		indexByUserIdx = null;
		List<ISecureSecTentRoleMembObj> toForget = new LinkedList<ISecureSecTentRoleMembObj>();
		ISecureSecTentRoleMembObj cur = null;
		Iterator<ISecureSecTentRoleMembObj> iter = members.values().iterator();
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
	 *	IntNetSecTentRoleMembObj.
	 */
	@Override
	public ISecureSecTentRoleMembObj newInstance() {
		ISecureSecTentRoleMembObj inst = new IntNetSecTentRoleMembObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	IntNetSecTentRoleMembObj.
	 */
	@Override
	public ISecureSecTentRoleMembEditObj newEditInstance( ISecureSecTentRoleMembObj orig ) {
		ISecureSecTentRoleMembEditObj edit = new IntNetSecTentRoleMembEditObj( orig );
		return( edit );
	}

	@Override
	public ISecureSecTentRoleMembObj constructByClassCode( int backingClassCode ) {
		ISecureSecTentRoleMembObj obj = null;
		if( backingClassCode == ISecureSecTentRoleMemb.CLASS_CODE) {
			obj = ((IIntNetSchemaObj)schema).getSecTentRoleMembTableObj().newInstance();
		}
		return( obj );
	}

	@Override
	public ISecureSecTentRoleMembObj realiseSecTentRoleMemb( ISecureSecTentRoleMembObj Obj ) {
		ISecureSecTentRoleMembObj obj = Obj;
		ISecureSecTentRoleMembPKey pkey = obj.getPKey();
		ISecureSecTentRoleMembObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ISecureSecTentRoleMembObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTentRoleIdx != null ) {
				ISecureSecTentRoleMembByTentRoleIdxKey keyTentRoleIdx =
					schema.getSecureBackingStore().getSecureFactory().getFactorySecTentRoleMemb().newByTentRoleIdxKey();
				keyTentRoleIdx.setRequiredSecTentRoleId( keepObj.getRequiredSecTentRoleId() );
				Map<ISecureSecTentRoleMembPKey, ISecureSecTentRoleMembObj > mapTentRoleIdx = indexByTentRoleIdx.get( keyTentRoleIdx );
				if( mapTentRoleIdx != null ) {
					mapTentRoleIdx.remove( keepObj.getPKey() );
					if( mapTentRoleIdx.size() <= 0 ) {
						indexByTentRoleIdx.remove( keyTentRoleIdx );
					}
				}
			}

			if( indexByUserIdx != null ) {
				ISecureSecTentRoleMembByUserIdxKey keyUserIdx =
					schema.getSecureBackingStore().getSecureFactory().getFactorySecTentRoleMemb().newByUserIdxKey();
				keyUserIdx.setRequiredLoginId( keepObj.getRequiredLoginId() );
				Map<ISecureSecTentRoleMembPKey, ISecureSecTentRoleMembObj > mapUserIdx = indexByUserIdx.get( keyUserIdx );
				if( mapUserIdx != null ) {
					mapUserIdx.remove( keepObj.getPKey() );
					if( mapUserIdx.size() <= 0 ) {
						indexByUserIdx.remove( keyUserIdx );
					}
				}
			}

			keepObj.setRec( Obj.getRec() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTentRoleIdx != null ) {
				ISecureSecTentRoleMembByTentRoleIdxKey keyTentRoleIdx =
					schema.getSecureBackingStore().getSecureFactory().getFactorySecTentRoleMemb().newByTentRoleIdxKey();
				keyTentRoleIdx.setRequiredSecTentRoleId( keepObj.getRequiredSecTentRoleId() );
				Map<ISecureSecTentRoleMembPKey, ISecureSecTentRoleMembObj > mapTentRoleIdx = indexByTentRoleIdx.get( keyTentRoleIdx );
				if( mapTentRoleIdx != null ) {
					mapTentRoleIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUserIdx != null ) {
				ISecureSecTentRoleMembByUserIdxKey keyUserIdx =
					schema.getSecureBackingStore().getSecureFactory().getFactorySecTentRoleMemb().newByUserIdxKey();
				keyUserIdx.setRequiredLoginId( keepObj.getRequiredLoginId() );
				Map<ISecureSecTentRoleMembPKey, ISecureSecTentRoleMembObj > mapUserIdx = indexByUserIdx.get( keyUserIdx );
				if( mapUserIdx != null ) {
					mapUserIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allSecTentRoleMemb != null ) {
				allSecTentRoleMemb.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allSecTentRoleMemb != null ) {
				allSecTentRoleMemb.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTentRoleIdx != null ) {
				ISecureSecTentRoleMembByTentRoleIdxKey keyTentRoleIdx =
					schema.getSecureBackingStore().getSecureFactory().getFactorySecTentRoleMemb().newByTentRoleIdxKey();
				keyTentRoleIdx.setRequiredSecTentRoleId( keepObj.getRequiredSecTentRoleId() );
				Map<ISecureSecTentRoleMembPKey, ISecureSecTentRoleMembObj > mapTentRoleIdx = indexByTentRoleIdx.get( keyTentRoleIdx );
				if( mapTentRoleIdx != null ) {
					mapTentRoleIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUserIdx != null ) {
				ISecureSecTentRoleMembByUserIdxKey keyUserIdx =
					schema.getSecureBackingStore().getSecureFactory().getFactorySecTentRoleMemb().newByUserIdxKey();
				keyUserIdx.setRequiredLoginId( keepObj.getRequiredLoginId() );
				Map<ISecureSecTentRoleMembPKey, ISecureSecTentRoleMembObj > mapUserIdx = indexByUserIdx.get( keyUserIdx );
				if( mapUserIdx != null ) {
					mapUserIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	@Override
	public ISecureSecTentRoleMembObj createSecTentRoleMemb( ISecureSecTentRoleMembObj Obj ) {
		ISecureSecTentRoleMembObj obj = Obj;
		ISecureSecTentRoleMemb rec = obj.getSecTentRoleMembRec();
		schema.getSecureBackingStore().getTableSecTentRoleMemb().createSecTentRoleMemb(
			null,
			rec );
		obj.copyRecToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	@Override
	public ISecureSecTentRoleMembObj readSecTentRoleMemb( ISecureSecTentRoleMembPKey pkey ) {
		return( readSecTentRoleMemb( pkey, false ) );
	}

	@Override
	public ISecureSecTentRoleMembObj readSecTentRoleMemb( ISecureSecTentRoleMembPKey pkey, boolean forceRead ) {
		ISecureSecTentRoleMembObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			ISecureSecTentRoleMemb readRec = schema.getSecureBackingStore().getTableSecTentRoleMemb().readDerivedByIdIdx( null,
						pkey.getRequiredSecTentRoleId(),
						pkey.getRequiredLoginId() );
			if( readRec != null ) {
				obj = schema.getSecTentRoleMembTableObj().newInstance();
				obj.setPKey( readRec.getPKey() );
				obj.setRec( readRec );
				obj = (ISecureSecTentRoleMembObj)obj.realise();
			}
		}
		return( obj );
	}

	@Override
	public ISecureSecTentRoleMembObj readSecTentRoleMemb( ICFKeyHash256 SecTentRoleId,
		String LoginId ) {
		return( readSecTentRoleMemb( SecTentRoleId,
			LoginId, false ) );
	}

	@Override
	public ISecureSecTentRoleMembObj readSecTentRoleMemb( ICFKeyHash256 SecTentRoleId,
		String LoginId, boolean forceRead ) {
		ISecureSecTentRoleMembObj obj = null;
		ISecureSecTentRoleMemb readRec = schema.getSecureBackingStore().getTableSecTentRoleMemb().readDerivedByIdIdx( null,
			SecTentRoleId,
			LoginId );
		if( readRec != null ) {
				obj = schema.getSecTentRoleMembTableObj().newInstance();
			obj.setPKey( readRec.getPKey() );
			obj.setRec( readRec );
			obj = (ISecureSecTentRoleMembObj)obj.realise();
		}
		return( obj );
	}

	@Override
	public ISecureSecTentRoleMembObj readCachedSecTentRoleMemb( ISecureSecTentRoleMembPKey pkey ) {
		ISecureSecTentRoleMembObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	@Override
	public void reallyDeepDisposeSecTentRoleMemb( ISecureSecTentRoleMembObj obj )
	{
		final String S_ProcName = "IntNetSecTentRoleMembTableObj.reallyDeepDisposeSecTentRoleMemb() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		ISecureSecTentRoleMembPKey pkey = obj.getPKey();
		ISecureSecTentRoleMembObj existing = readCachedSecTentRoleMemb( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		ISecureSecTentRoleMembByTentRoleIdxKey keyTentRoleIdx = schema.getSecureBackingStore().getSecureFactory().getFactorySecTentRoleMemb().newByTentRoleIdxKey();
		keyTentRoleIdx.setRequiredSecTentRoleId( existing.getRequiredSecTentRoleId() );

		ISecureSecTentRoleMembByUserIdxKey keyUserIdx = schema.getSecureBackingStore().getSecureFactory().getFactorySecTentRoleMemb().newByUserIdxKey();
		keyUserIdx.setRequiredLoginId( existing.getRequiredLoginId() );



		if( indexByTentRoleIdx != null ) {
			if( indexByTentRoleIdx.containsKey( keyTentRoleIdx ) ) {
				indexByTentRoleIdx.get( keyTentRoleIdx ).remove( pkey );
				if( indexByTentRoleIdx.get( keyTentRoleIdx ).size() <= 0 ) {
					indexByTentRoleIdx.remove( keyTentRoleIdx );
				}
			}
		}

		if( indexByUserIdx != null ) {
			if( indexByUserIdx.containsKey( keyUserIdx ) ) {
				indexByUserIdx.get( keyUserIdx ).remove( pkey );
				if( indexByUserIdx.get( keyUserIdx ).size() <= 0 ) {
					indexByUserIdx.remove( keyUserIdx );
				}
			}
		}


	}
	@Override
	public void deepDisposeSecTentRoleMemb( ISecureSecTentRoleMembPKey pkey ) {
		ISecureSecTentRoleMembObj obj = readCachedSecTentRoleMemb( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	@Override
	public ISecureSecTentRoleMembObj lockSecTentRoleMemb( ISecureSecTentRoleMembPKey pkey ) {
		ISecureSecTentRoleMembObj locked = null;
		ISecureSecTentRoleMemb lockRec = schema.getSecureBackingStore().getTableSecTentRoleMemb().lockDerived( null, pkey );
		if( lockRec != null ) {
				locked = schema.getSecTentRoleMembTableObj().newInstance();
			locked.setRec( lockRec );
			locked.setPKey( lockRec.getPKey() );
			locked = (ISecureSecTentRoleMembObj)locked.realise();
		}
		else {
			throw new CFCollisionDetectedException( getClass(), "lockSecTentRoleMemb", pkey );
		}
		return( locked );
	}

	@Override
	public List<ISecureSecTentRoleMembObj> readAllSecTentRoleMemb() {
		return( readAllSecTentRoleMemb( false ) );
	}

	@Override
	public List<ISecureSecTentRoleMembObj> readAllSecTentRoleMemb( boolean forceRead ) {
		final String S_ProcName = "readAllSecTentRoleMemb";
		if( ( allSecTentRoleMemb == null ) || forceRead ) {
			Map<ISecureSecTentRoleMembPKey, ISecureSecTentRoleMembObj> map = new HashMap<ISecureSecTentRoleMembPKey,ISecureSecTentRoleMembObj>();
			allSecTentRoleMemb = map;
			ISecureSecTentRoleMemb[] recList = schema.getSecureBackingStore().getTableSecTentRoleMemb().readAllDerived( null );
			ISecureSecTentRoleMemb rec;
			ISecureSecTentRoleMembObj obj;
			for( int idx = 0; idx < recList.length; idx ++ ) {
				rec = recList[ idx ];
				obj = newInstance();
				obj.setPKey( rec.getPKey() );
				obj.setRec( rec );
				ISecureSecTentRoleMembObj realised = (ISecureSecTentRoleMembObj)obj.realise();
			}
		}
		int len = allSecTentRoleMemb.size();
		ISecureSecTentRoleMembObj arr[] = new ISecureSecTentRoleMembObj[len];
		Iterator<ISecureSecTentRoleMembObj> valIter = allSecTentRoleMemb.values().iterator();
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
		ArrayList<ISecureSecTentRoleMembObj> arrayList = new ArrayList<ISecureSecTentRoleMembObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ISecureSecTentRoleMembObj> cmp = new Comparator<ISecureSecTentRoleMembObj>() {
			@Override
			public int compare( ISecureSecTentRoleMembObj lhs, ISecureSecTentRoleMembObj rhs ) {
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
					ISecureSecTentRoleMembPKey lhsPKey = lhs.getPKey();
					ISecureSecTentRoleMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ISecureSecTentRoleMembObj> sortedList = arrayList;
		return( sortedList );
	}

	@Override
	public List<ISecureSecTentRoleMembObj> readCachedAllSecTentRoleMemb() {
		final String S_ProcName = "readCachedAllSecTentRoleMemb";
		ArrayList<ISecureSecTentRoleMembObj> arrayList = new ArrayList<ISecureSecTentRoleMembObj>();
		if( allSecTentRoleMemb != null ) {
			int len = allSecTentRoleMemb.size();
			ISecureSecTentRoleMembObj arr[] = new ISecureSecTentRoleMembObj[len];
			Iterator<ISecureSecTentRoleMembObj> valIter = allSecTentRoleMemb.values().iterator();
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
		Comparator<ISecureSecTentRoleMembObj> cmp = new Comparator<ISecureSecTentRoleMembObj>() {
			public int compare( ISecureSecTentRoleMembObj lhs, ISecureSecTentRoleMembObj rhs ) {
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
					ISecureSecTentRoleMembPKey lhsPKey = lhs.getPKey();
					ISecureSecTentRoleMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	@Override
	public ISecureSecTentRoleMembObj readSecTentRoleMembByIdIdx( ICFKeyHash256 SecTentRoleId,
		String LoginId )
	{
		return( readSecTentRoleMembByIdIdx( SecTentRoleId,
			LoginId,
			false ) );
	}

	@Override
	public ISecureSecTentRoleMembObj readSecTentRoleMembByIdIdx( ICFKeyHash256 SecTentRoleId,
		String LoginId, boolean forceRead )
	{
		ISecureSecTentRoleMembPKey pkey = schema.getSecureBackingStore().getSecureFactory().getFactorySecTentRoleMemb().newPKey();
		pkey.setRequiredSecTentRoleId( SecTentRoleId );
		pkey.setRequiredLoginId( LoginId );
		ISecureSecTentRoleMembObj obj = readSecTentRoleMemb( pkey, forceRead );
		return( obj );
	}

	@Override
	public List<ISecureSecTentRoleMembObj> readSecTentRoleMembByTentRoleIdx( ICFKeyHash256 SecTentRoleId )
	{
		return( readSecTentRoleMembByTentRoleIdx( SecTentRoleId,
			false ) );
	}

	@Override
	public List<ISecureSecTentRoleMembObj> readSecTentRoleMembByTentRoleIdx( ICFKeyHash256 SecTentRoleId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecTentRoleMembByTentRoleIdx";
		ISecureSecTentRoleMembByTentRoleIdxKey key = schema.getSecureBackingStore().getSecureFactory().getFactorySecTentRoleMemb().newByTentRoleIdxKey();
		key.setRequiredSecTentRoleId( SecTentRoleId );
		Map<ISecureSecTentRoleMembPKey, ISecureSecTentRoleMembObj> dict;
		if( indexByTentRoleIdx == null ) {
			indexByTentRoleIdx = new HashMap< ISecureSecTentRoleMembByTentRoleIdxKey,
				Map< ISecureSecTentRoleMembPKey, ISecureSecTentRoleMembObj > >();
		}
		if( ( ! forceRead ) && indexByTentRoleIdx.containsKey( key ) ) {
			dict = indexByTentRoleIdx.get( key );
		}
		else {
			dict = new HashMap<ISecureSecTentRoleMembPKey, ISecureSecTentRoleMembObj>();
			ISecureSecTentRoleMembObj obj;
			ISecureSecTentRoleMemb[] recList = schema.getSecureBackingStore().getTableSecTentRoleMemb().readDerivedByTentRoleIdx( null,
				SecTentRoleId );
			ISecureSecTentRoleMemb rec;
			for( int idx = 0; idx < recList.length; idx ++ ) {
				rec = recList[ idx ];
				obj = schema.getSecTentRoleMembTableObj().newInstance();
				obj.setPKey( rec.getPKey() );
				obj.setRec( rec );
				ISecureSecTentRoleMembObj realised = (ISecureSecTentRoleMembObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTentRoleIdx.put( key, dict );
		}
		int len = dict.size();
		ISecureSecTentRoleMembObj arr[] = new ISecureSecTentRoleMembObj[len];
		Iterator<ISecureSecTentRoleMembObj> valIter = dict.values().iterator();
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
		ArrayList<ISecureSecTentRoleMembObj> arrayList = new ArrayList<ISecureSecTentRoleMembObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ISecureSecTentRoleMembObj> cmp = new Comparator<ISecureSecTentRoleMembObj>() {
			@Override
			public int compare( ISecureSecTentRoleMembObj lhs, ISecureSecTentRoleMembObj rhs ) {
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
					ISecureSecTentRoleMembPKey lhsPKey = lhs.getPKey();
					ISecureSecTentRoleMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ISecureSecTentRoleMembObj> sortedList = arrayList;
		return( sortedList );
	}

	@Override
	public List<ISecureSecTentRoleMembObj> readSecTentRoleMembByUserIdx( String LoginId )
	{
		return( readSecTentRoleMembByUserIdx( LoginId,
			false ) );
	}

	@Override
	public List<ISecureSecTentRoleMembObj> readSecTentRoleMembByUserIdx( String LoginId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecTentRoleMembByUserIdx";
		ISecureSecTentRoleMembByUserIdxKey key = schema.getSecureBackingStore().getSecureFactory().getFactorySecTentRoleMemb().newByUserIdxKey();
		key.setRequiredLoginId( LoginId );
		Map<ISecureSecTentRoleMembPKey, ISecureSecTentRoleMembObj> dict;
		if( indexByUserIdx == null ) {
			indexByUserIdx = new HashMap< ISecureSecTentRoleMembByUserIdxKey,
				Map< ISecureSecTentRoleMembPKey, ISecureSecTentRoleMembObj > >();
		}
		if( ( ! forceRead ) && indexByUserIdx.containsKey( key ) ) {
			dict = indexByUserIdx.get( key );
		}
		else {
			dict = new HashMap<ISecureSecTentRoleMembPKey, ISecureSecTentRoleMembObj>();
			ISecureSecTentRoleMembObj obj;
			ISecureSecTentRoleMemb[] recList = schema.getSecureBackingStore().getTableSecTentRoleMemb().readDerivedByUserIdx( null,
				LoginId );
			ISecureSecTentRoleMemb rec;
			for( int idx = 0; idx < recList.length; idx ++ ) {
				rec = recList[ idx ];
				obj = schema.getSecTentRoleMembTableObj().newInstance();
				obj.setPKey( rec.getPKey() );
				obj.setRec( rec );
				ISecureSecTentRoleMembObj realised = (ISecureSecTentRoleMembObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByUserIdx.put( key, dict );
		}
		int len = dict.size();
		ISecureSecTentRoleMembObj arr[] = new ISecureSecTentRoleMembObj[len];
		Iterator<ISecureSecTentRoleMembObj> valIter = dict.values().iterator();
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
		ArrayList<ISecureSecTentRoleMembObj> arrayList = new ArrayList<ISecureSecTentRoleMembObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ISecureSecTentRoleMembObj> cmp = new Comparator<ISecureSecTentRoleMembObj>() {
			@Override
			public int compare( ISecureSecTentRoleMembObj lhs, ISecureSecTentRoleMembObj rhs ) {
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
					ISecureSecTentRoleMembPKey lhsPKey = lhs.getPKey();
					ISecureSecTentRoleMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ISecureSecTentRoleMembObj> sortedList = arrayList;
		return( sortedList );
	}

	@Override
	public ISecureSecTentRoleMembObj readCachedSecTentRoleMembByIdIdx( ICFKeyHash256 SecTentRoleId,
		String LoginId )
	{
		ISecureSecTentRoleMembObj obj = null;
		ISecureSecTentRoleMembPKey pkey = schema.getSecureBackingStore().getSecureFactory().getFactorySecTentRoleMemb().newPKey();
		pkey.setRequiredSecTentRoleId( SecTentRoleId );
		pkey.setRequiredLoginId( LoginId );
		pkey.setRequiredSecTentRoleId( SecTentRoleId );
		pkey.setRequiredLoginId( LoginId );
		obj = readCachedSecTentRoleMemb( pkey );
		return( obj );
	}

	@Override
	public List<ISecureSecTentRoleMembObj> readCachedSecTentRoleMembByTentRoleIdx( ICFKeyHash256 SecTentRoleId )
	{
		final String S_ProcName = "readCachedSecTentRoleMembByTentRoleIdx";
		ISecureSecTentRoleMembByTentRoleIdxKey key = schema.getSecureBackingStore().getSecureFactory().getFactorySecTentRoleMemb().newByTentRoleIdxKey();
		key.setRequiredSecTentRoleId( SecTentRoleId );
		ArrayList<ISecureSecTentRoleMembObj> arrayList = new ArrayList<ISecureSecTentRoleMembObj>();
		if( indexByTentRoleIdx != null ) {
			Map<ISecureSecTentRoleMembPKey, ISecureSecTentRoleMembObj> dict;
			if( indexByTentRoleIdx.containsKey( key ) ) {
				dict = indexByTentRoleIdx.get( key );
				int len = dict.size();
				ISecureSecTentRoleMembObj arr[] = new ISecureSecTentRoleMembObj[len];
				Iterator<ISecureSecTentRoleMembObj> valIter = dict.values().iterator();
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
			ISecureSecTentRoleMembObj obj;
			Iterator<ISecureSecTentRoleMembObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getRec().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ISecureSecTentRoleMembObj> cmp = new Comparator<ISecureSecTentRoleMembObj>() {
			@Override
			public int compare( ISecureSecTentRoleMembObj lhs, ISecureSecTentRoleMembObj rhs ) {
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
					ISecureSecTentRoleMembPKey lhsPKey = lhs.getPKey();
					ISecureSecTentRoleMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	@Override
	public List<ISecureSecTentRoleMembObj> readCachedSecTentRoleMembByUserIdx( String LoginId )
	{
		final String S_ProcName = "readCachedSecTentRoleMembByUserIdx";
		ISecureSecTentRoleMembByUserIdxKey key = schema.getSecureBackingStore().getSecureFactory().getFactorySecTentRoleMemb().newByUserIdxKey();
		key.setRequiredLoginId( LoginId );
		ArrayList<ISecureSecTentRoleMembObj> arrayList = new ArrayList<ISecureSecTentRoleMembObj>();
		if( indexByUserIdx != null ) {
			Map<ISecureSecTentRoleMembPKey, ISecureSecTentRoleMembObj> dict;
			if( indexByUserIdx.containsKey( key ) ) {
				dict = indexByUserIdx.get( key );
				int len = dict.size();
				ISecureSecTentRoleMembObj arr[] = new ISecureSecTentRoleMembObj[len];
				Iterator<ISecureSecTentRoleMembObj> valIter = dict.values().iterator();
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
			ISecureSecTentRoleMembObj obj;
			Iterator<ISecureSecTentRoleMembObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getRec().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ISecureSecTentRoleMembObj> cmp = new Comparator<ISecureSecTentRoleMembObj>() {
			@Override
			public int compare( ISecureSecTentRoleMembObj lhs, ISecureSecTentRoleMembObj rhs ) {
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
					ISecureSecTentRoleMembPKey lhsPKey = lhs.getPKey();
					ISecureSecTentRoleMembPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	@Override
	public void deepDisposeSecTentRoleMembByIdIdx( ICFKeyHash256 SecTentRoleId,
		String LoginId )
	{
		ISecureSecTentRoleMembObj obj = readCachedSecTentRoleMembByIdIdx( SecTentRoleId,
				LoginId );
		if( obj != null ) {
			obj.forget();
		}
	}

	@Override
	public void deepDisposeSecTentRoleMembByTentRoleIdx( ICFKeyHash256 SecTentRoleId )
	{
		final String S_ProcName = "deepDisposeSecTentRoleMembByTentRoleIdx";
		ISecureSecTentRoleMembObj obj;
		List<ISecureSecTentRoleMembObj> arrayList = readCachedSecTentRoleMembByTentRoleIdx( SecTentRoleId );
		if( arrayList != null )  {
			Iterator<ISecureSecTentRoleMembObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	@Override
	public void deepDisposeSecTentRoleMembByUserIdx( String LoginId )
	{
		final String S_ProcName = "deepDisposeSecTentRoleMembByUserIdx";
		ISecureSecTentRoleMembObj obj;
		List<ISecureSecTentRoleMembObj> arrayList = readCachedSecTentRoleMembByUserIdx( LoginId );
		if( arrayList != null )  {
			Iterator<ISecureSecTentRoleMembObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	@Override
	public ISecureSecTentRoleMembObj updateSecTentRoleMemb( ISecureSecTentRoleMembObj Obj ) {
		ISecureSecTentRoleMembObj obj = Obj;
		schema.getSecureBackingStore().getTableSecTentRoleMemb().updateSecTentRoleMemb( null,
			Obj.getSecTentRoleMembRec() );
		obj = (ISecureSecTentRoleMembObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	@Override
	public void deleteSecTentRoleMemb( ISecureSecTentRoleMembObj Obj ) {
		ISecureSecTentRoleMembObj obj = Obj;
		schema.getSecureBackingStore().getTableSecTentRoleMemb().deleteSecTentRoleMemb( null,
			obj.getSecTentRoleMembRec() );
		Obj.forget();
	}

	@Override
	public void deleteSecTentRoleMembByIdIdx( ICFKeyHash256 SecTentRoleId,
		String LoginId )
	{
		ISecureSecTentRoleMembObj obj = readSecTentRoleMemb(SecTentRoleId,
				LoginId);
		if( obj != null ) {
			ISecureSecTentRoleMembEditObj editObj = (ISecureSecTentRoleMembEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ISecureSecTentRoleMembEditObj)obj.beginEdit();
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
		deepDisposeSecTentRoleMembByIdIdx( SecTentRoleId,
				LoginId );
	}

	@Override
	public void deleteSecTentRoleMembByTentRoleIdx( ICFKeyHash256 SecTentRoleId )
	{
		ISecureSecTentRoleMembByTentRoleIdxKey key = schema.getSecureBackingStore().getSecureFactory().getFactorySecTentRoleMemb().newByTentRoleIdxKey();
		key.setRequiredSecTentRoleId( SecTentRoleId );
		if( indexByTentRoleIdx == null ) {
			indexByTentRoleIdx = new HashMap< ISecureSecTentRoleMembByTentRoleIdxKey,
				Map< ISecureSecTentRoleMembPKey, ISecureSecTentRoleMembObj > >();
		}
		if( indexByTentRoleIdx.containsKey( key ) ) {
			Map<ISecureSecTentRoleMembPKey, ISecureSecTentRoleMembObj> dict = indexByTentRoleIdx.get( key );
			schema.getSecureBackingStore().getTableSecTentRoleMemb().deleteSecTentRoleMembByTentRoleIdx( null,
				SecTentRoleId );
			Iterator<ISecureSecTentRoleMembObj> iter = dict.values().iterator();
			ISecureSecTentRoleMembObj obj;
			List<ISecureSecTentRoleMembObj> toForget = new LinkedList<ISecureSecTentRoleMembObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTentRoleIdx.remove( key );
		}
		else {
			schema.getSecureBackingStore().getTableSecTentRoleMemb().deleteSecTentRoleMembByTentRoleIdx( null,
				SecTentRoleId );
		}
		deepDisposeSecTentRoleMembByTentRoleIdx( SecTentRoleId );
	}

	@Override
	public void deleteSecTentRoleMembByUserIdx( String LoginId )
	{
		ISecureSecTentRoleMembByUserIdxKey key = schema.getSecureBackingStore().getSecureFactory().getFactorySecTentRoleMemb().newByUserIdxKey();
		key.setRequiredLoginId( LoginId );
		if( indexByUserIdx == null ) {
			indexByUserIdx = new HashMap< ISecureSecTentRoleMembByUserIdxKey,
				Map< ISecureSecTentRoleMembPKey, ISecureSecTentRoleMembObj > >();
		}
		if( indexByUserIdx.containsKey( key ) ) {
			Map<ISecureSecTentRoleMembPKey, ISecureSecTentRoleMembObj> dict = indexByUserIdx.get( key );
			schema.getSecureBackingStore().getTableSecTentRoleMemb().deleteSecTentRoleMembByUserIdx( null,
				LoginId );
			Iterator<ISecureSecTentRoleMembObj> iter = dict.values().iterator();
			ISecureSecTentRoleMembObj obj;
			List<ISecureSecTentRoleMembObj> toForget = new LinkedList<ISecureSecTentRoleMembObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByUserIdx.remove( key );
		}
		else {
			schema.getSecureBackingStore().getTableSecTentRoleMemb().deleteSecTentRoleMembByUserIdx( null,
				LoginId );
		}
		deepDisposeSecTentRoleMembByUserIdx( LoginId );
	}
}