// Description: Java 11 Table Object implementation for YCFInt.

/*
 *	org.mssycf.mssycf.YCFInt
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFSec 2.13 Security Services
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFSec.
 *	
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	
 *	http://www.apache.org/licenses/LICENSE-2.0
 *	
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfint.YCFIntObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;

public class YCFIntServiceTypeTableObj
	implements IYCFIntServiceTypeTableObj
{
	protected IYCFIntSchemaObj schema;
	private Map<YCFSecServiceTypePKey, IYCFSecServiceTypeObj> members;
	private Map<YCFSecServiceTypePKey, IYCFSecServiceTypeObj> allServiceType;
	private Map< YCFSecServiceTypeByUDescrIdxKey,
		IYCFSecServiceTypeObj > indexByUDescrIdx;
	public static String TABLE_NAME = "ServiceType";
	public static String TABLE_DBNAME = "svctype";

	public YCFIntServiceTypeTableObj() {
		schema = null;
		members = new HashMap<YCFSecServiceTypePKey, IYCFSecServiceTypeObj>();
		allServiceType = null;
		indexByUDescrIdx = null;
	}

	public YCFIntServiceTypeTableObj( IYCFSecSchemaObj argSchema ) {
		schema = (IYCFIntSchemaObj)argSchema;
		members = new HashMap<YCFSecServiceTypePKey, IYCFSecServiceTypeObj>();
		allServiceType = null;
		indexByUDescrIdx = null;
	}

	public IYCFSecSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFSecSchemaObj value ) {
		schema = (IYCFIntSchemaObj)value;
	}

	public String getTableName() {
		return( TABLE_NAME );
	}

	public String getTableDbName() {
		return( TABLE_DBNAME );
	}

	public Class getObjQualifyingClass() {
		return( null );
	}


	public void minimizeMemory() {
		allServiceType = null;
		indexByUDescrIdx = null;
		List<IYCFSecServiceTypeObj> toForget = new LinkedList<IYCFSecServiceTypeObj>();
		IYCFSecServiceTypeObj cur = null;
		Iterator<IYCFSecServiceTypeObj> iter = members.values().iterator();
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
	 *	YCFIntServiceTypeObj.
	 */
	public IYCFSecServiceTypeObj newInstance() {
		IYCFSecServiceTypeObj inst = new YCFIntServiceTypeObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFIntServiceTypeObj.
	 */
	public IYCFSecServiceTypeEditObj newEditInstance( IYCFSecServiceTypeObj orig ) {
		IYCFSecServiceTypeEditObj edit = new YCFIntServiceTypeEditObj( orig );
		return( edit );
	}

	public IYCFSecServiceTypeObj realiseServiceType( IYCFSecServiceTypeObj Obj ) {
		IYCFSecServiceTypeObj obj = Obj;
		YCFSecServiceTypePKey pkey = obj.getPKey();
		IYCFSecServiceTypeObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFSecServiceTypeObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByUDescrIdx != null ) {
				YCFSecServiceTypeByUDescrIdxKey keyUDescrIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryServiceType().newUDescrIdxKey();
				keyUDescrIdx.setRequiredDescription( keepObj.getRequiredDescription() );
				indexByUDescrIdx.remove( keyUDescrIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByUDescrIdx != null ) {
				YCFSecServiceTypeByUDescrIdxKey keyUDescrIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryServiceType().newUDescrIdxKey();
				keyUDescrIdx.setRequiredDescription( keepObj.getRequiredDescription() );
				indexByUDescrIdx.put( keyUDescrIdx, keepObj );
			}

			if( allServiceType != null ) {
				allServiceType.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allServiceType != null ) {
				allServiceType.put( keepObj.getPKey(), keepObj );
			}

			if( indexByUDescrIdx != null ) {
				YCFSecServiceTypeByUDescrIdxKey keyUDescrIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryServiceType().newUDescrIdxKey();
				keyUDescrIdx.setRequiredDescription( keepObj.getRequiredDescription() );
				indexByUDescrIdx.put( keyUDescrIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFSecServiceTypeObj createServiceType( IYCFSecServiceTypeObj Obj ) {
		IYCFSecServiceTypeObj obj = Obj;
		YCFSecServiceTypeBuff buff = obj.getServiceTypeBuff();
		((IYCFIntSchema)schema.getBackingStore()).getTableServiceType().createServiceType(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFSecServiceTypeObj readServiceType( YCFSecServiceTypePKey pkey ) {
		return( readServiceType( pkey, false ) );
	}

	public IYCFSecServiceTypeObj readServiceType( YCFSecServiceTypePKey pkey, boolean forceRead ) {
		IYCFSecServiceTypeObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFSecServiceTypeBuff readBuff = ((IYCFIntSchema)schema.getBackingStore()).getTableServiceType().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredServiceTypeId() );
			if( readBuff != null ) {
				obj = schema.getServiceTypeTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryServiceType().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFSecServiceTypeObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecServiceTypeObj readCachedServiceType( YCFSecServiceTypePKey pkey ) {
		IYCFSecServiceTypeObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeServiceType( IYCFSecServiceTypeObj obj )
	{
		final String S_ProcName = "YCFIntServiceTypeTableObj.reallyDeepDisposeServiceType() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFSecServiceTypePKey pkey = obj.getPKey();
		IYCFSecServiceTypeObj existing = readCachedServiceType( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFSecServiceTypeByUDescrIdxKey keyUDescrIdx = ((IYCFIntSchema)schema.getBackingStore()).getFactoryServiceType().newUDescrIdxKey();
		keyUDescrIdx.setRequiredDescription( existing.getRequiredDescription() );


		schema.getServiceTableObj().deepDisposeServiceByTypeIdx( existing.getRequiredServiceTypeId() );

		if( indexByUDescrIdx != null ) {
			indexByUDescrIdx.remove( keyUDescrIdx );
		}


	}
	public void deepDisposeServiceType( YCFSecServiceTypePKey pkey ) {
		IYCFSecServiceTypeObj obj = readCachedServiceType( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFSecServiceTypeObj lockServiceType( YCFSecServiceTypePKey pkey ) {
		IYCFSecServiceTypeObj locked = null;
		YCFSecServiceTypeBuff lockBuff = ((IYCFIntSchema)schema.getBackingStore()).getTableServiceType().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getServiceTypeTableObj().newInstance();
			locked.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryServiceType().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFSecServiceTypeObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockServiceType", pkey );
		}
		return( locked );
	}

	public List<IYCFSecServiceTypeObj> readAllServiceType() {
		return( readAllServiceType( false ) );
	}

	public List<IYCFSecServiceTypeObj> readAllServiceType( boolean forceRead ) {
		final String S_ProcName = "readAllServiceType";
		if( ( allServiceType == null ) || forceRead ) {
			Map<YCFSecServiceTypePKey, IYCFSecServiceTypeObj> map = new HashMap<YCFSecServiceTypePKey,IYCFSecServiceTypeObj>();
			allServiceType = map;
			YCFSecServiceTypeBuff[] buffList = ((IYCFIntSchema)schema.getBackingStore()).getTableServiceType().readAllDerived( schema.getAuthorization() );
			YCFSecServiceTypeBuff buff;
			IYCFSecServiceTypeObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryServiceType().newPKey() );
				obj.setBuff( buff );
				IYCFSecServiceTypeObj realised = (IYCFSecServiceTypeObj)obj.realise();
			}
		}
		int len = allServiceType.size();
		IYCFSecServiceTypeObj arr[] = new IYCFSecServiceTypeObj[len];
		Iterator<IYCFSecServiceTypeObj> valIter = allServiceType.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new YCFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new YCFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<IYCFSecServiceTypeObj> arrayList = new ArrayList<IYCFSecServiceTypeObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecServiceTypeObj> cmp = new Comparator<IYCFSecServiceTypeObj>() {
			public int compare( IYCFSecServiceTypeObj lhs, IYCFSecServiceTypeObj rhs ) {
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
					YCFSecServiceTypePKey lhsPKey = lhs.getPKey();
					YCFSecServiceTypePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecServiceTypeObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecServiceTypeObj> readCachedAllServiceType() {
		final String S_ProcName = "readCachedAllServiceType";
		ArrayList<IYCFSecServiceTypeObj> arrayList = new ArrayList<IYCFSecServiceTypeObj>();
		if( allServiceType != null ) {
			int len = allServiceType.size();
			IYCFSecServiceTypeObj arr[] = new IYCFSecServiceTypeObj[len];
			Iterator<IYCFSecServiceTypeObj> valIter = allServiceType.values().iterator();
			int idx = 0;
			while( ( idx < len ) && valIter.hasNext() ) {
				arr[idx++] = valIter.next();
			}
			if( idx < len ) {
				throw new YCFLibArgumentUnderflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
			}
			else if( valIter.hasNext() ) {
				throw new YCFLibArgumentOverflowException( getClass(),
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
		Comparator<IYCFSecServiceTypeObj> cmp = new Comparator<IYCFSecServiceTypeObj>() {
			public int compare( IYCFSecServiceTypeObj lhs, IYCFSecServiceTypeObj rhs ) {
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
					YCFSecServiceTypePKey lhsPKey = lhs.getPKey();
					YCFSecServiceTypePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFSecServiceTypeObj readServiceTypeByIdIdx( int ServiceTypeId )
	{
		return( readServiceTypeByIdIdx( ServiceTypeId,
			false ) );
	}

	public IYCFSecServiceTypeObj readServiceTypeByIdIdx( int ServiceTypeId, boolean forceRead )
	{
		YCFSecServiceTypePKey pkey = ((IYCFIntSchema)schema.getBackingStore()).getFactoryServiceType().newPKey();
		pkey.setRequiredServiceTypeId( ServiceTypeId );
		IYCFSecServiceTypeObj obj = readServiceType( pkey, forceRead );
		return( obj );
	}

	public IYCFSecServiceTypeObj readServiceTypeByUDescrIdx( String Description )
	{
		return( readServiceTypeByUDescrIdx( Description,
			false ) );
	}

	public IYCFSecServiceTypeObj readServiceTypeByUDescrIdx( String Description, boolean forceRead )
	{
		if( indexByUDescrIdx == null ) {
			indexByUDescrIdx = new HashMap< YCFSecServiceTypeByUDescrIdxKey,
				IYCFSecServiceTypeObj >();
		}
		YCFSecServiceTypeByUDescrIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryServiceType().newUDescrIdxKey();
		key.setRequiredDescription( Description );
		IYCFSecServiceTypeObj obj = null;
		if( ( ! forceRead ) && indexByUDescrIdx.containsKey( key ) ) {
			obj = indexByUDescrIdx.get( key );
		}
		else {
			YCFSecServiceTypeBuff buff = ((IYCFIntSchema)schema.getBackingStore()).getTableServiceType().readDerivedByUDescrIdx( schema.getAuthorization(),
				Description );
			if( buff != null ) {
				obj = schema.getServiceTypeTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryServiceType().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFSecServiceTypeObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecServiceTypeObj readCachedServiceTypeByIdIdx( int ServiceTypeId )
	{
		IYCFSecServiceTypeObj obj = null;
		YCFSecServiceTypePKey pkey = ((IYCFIntSchema)schema.getBackingStore()).getFactoryServiceType().newPKey();
		pkey.setRequiredServiceTypeId( ServiceTypeId );
		obj = readCachedServiceType( pkey );
		return( obj );
	}

	public IYCFSecServiceTypeObj readCachedServiceTypeByUDescrIdx( String Description )
	{
		IYCFSecServiceTypeObj obj = null;
		YCFSecServiceTypeByUDescrIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryServiceType().newUDescrIdxKey();
		key.setRequiredDescription( Description );
		if( indexByUDescrIdx != null ) {
			if( indexByUDescrIdx.containsKey( key ) ) {
				obj = indexByUDescrIdx.get( key );
			}
			else {
				Iterator<IYCFSecServiceTypeObj> valIter = members.values().iterator();
				while( ( obj == null ) && valIter.hasNext() ) {
					obj = valIter.next();
					if( obj != null ) {
						if( obj.getBuff().compareTo( key ) != 0 ) {
							obj = null;
						}
					}
				}
			}
		}
		else {
			Iterator<IYCFSecServiceTypeObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) != 0 ) {
						obj = null;
					}
				}
			}
		}
		return( obj );
	}

	public void deepDisposeServiceTypeByIdIdx( int ServiceTypeId )
	{
		IYCFSecServiceTypeObj obj = readCachedServiceTypeByIdIdx( ServiceTypeId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeServiceTypeByUDescrIdx( String Description )
	{
		IYCFSecServiceTypeObj obj = readCachedServiceTypeByUDescrIdx( Description );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFSecServiceTypeObj updateServiceType( IYCFSecServiceTypeObj Obj ) {
		IYCFSecServiceTypeObj obj = Obj;
		((IYCFIntSchema)schema.getBackingStore()).getTableServiceType().updateServiceType( schema.getAuthorization(),
			Obj.getServiceTypeBuff() );
		obj = (IYCFSecServiceTypeObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteServiceType( IYCFSecServiceTypeObj Obj ) {
		IYCFSecServiceTypeObj obj = Obj;
		((IYCFIntSchema)schema.getBackingStore()).getTableServiceType().deleteServiceType( schema.getAuthorization(),
			obj.getServiceTypeBuff() );
		Obj.forget();
	}

	public void deleteServiceTypeByIdIdx( int ServiceTypeId )
	{
		YCFSecServiceTypePKey pkey = ((IYCFIntSchema)schema.getBackingStore()).getFactoryServiceType().newPKey();
		pkey.setRequiredServiceTypeId( ServiceTypeId );
		IYCFSecServiceTypeObj obj = readServiceType( pkey );
		if( obj != null ) {
			IYCFSecServiceTypeEditObj editObj = (IYCFSecServiceTypeEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFSecServiceTypeEditObj)obj.beginEdit();
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
		deepDisposeServiceTypeByIdIdx( ServiceTypeId );
	}

	public void deleteServiceTypeByUDescrIdx( String Description )
	{
		if( indexByUDescrIdx == null ) {
			indexByUDescrIdx = new HashMap< YCFSecServiceTypeByUDescrIdxKey,
				IYCFSecServiceTypeObj >();
		}
		YCFSecServiceTypeByUDescrIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryServiceType().newUDescrIdxKey();
		key.setRequiredDescription( Description );
		IYCFSecServiceTypeObj obj = null;
		if( indexByUDescrIdx.containsKey( key ) ) {
			obj = indexByUDescrIdx.get( key );
			((IYCFIntSchema)schema.getBackingStore()).getTableServiceType().deleteServiceTypeByUDescrIdx( schema.getAuthorization(),
				Description );
			obj.forget();
		}
		else {
			((IYCFIntSchema)schema.getBackingStore()).getTableServiceType().deleteServiceTypeByUDescrIdx( schema.getAuthorization(),
				Description );
		}
		deepDisposeServiceTypeByUDescrIdx( Description );
	}
}
