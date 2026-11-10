// Description: Java 11 Table Object implementation for YCFBam.

/*
 *	org.mssycf.mssycf.YCFBam
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

package org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBam.*;

public class YCFBamSecDeviceTableObj
	implements IYCFBamSecDeviceTableObj
{
	protected IYCFBamSchemaObj schema;
	private Map<YCFSecSecDevicePKey, IYCFSecSecDeviceObj> members;
	private Map<YCFSecSecDevicePKey, IYCFSecSecDeviceObj> allSecDevice;
	private Map< YCFSecSecDeviceByNameIdxKey,
		IYCFSecSecDeviceObj > indexByNameIdx;
	private Map< YCFSecSecDeviceByUserIdxKey,
		Map<YCFSecSecDevicePKey, IYCFSecSecDeviceObj > > indexByUserIdx;
	public static String TABLE_NAME = "SecDevice";
	public static String TABLE_DBNAME = "secdev";

	public YCFBamSecDeviceTableObj() {
		schema = null;
		members = new HashMap<YCFSecSecDevicePKey, IYCFSecSecDeviceObj>();
		allSecDevice = null;
		indexByNameIdx = null;
		indexByUserIdx = null;
	}

	public YCFBamSecDeviceTableObj( IYCFSecSchemaObj argSchema ) {
		schema = (IYCFBamSchemaObj)argSchema;
		members = new HashMap<YCFSecSecDevicePKey, IYCFSecSecDeviceObj>();
		allSecDevice = null;
		indexByNameIdx = null;
		indexByUserIdx = null;
	}

	public IYCFSecSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFSecSchemaObj value ) {
		schema = (IYCFBamSchemaObj)value;
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
		allSecDevice = null;
		indexByNameIdx = null;
		indexByUserIdx = null;
		List<IYCFSecSecDeviceObj> toForget = new LinkedList<IYCFSecSecDeviceObj>();
		IYCFSecSecDeviceObj cur = null;
		Iterator<IYCFSecSecDeviceObj> iter = members.values().iterator();
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
	 *	YCFBamSecDeviceObj.
	 */
	public IYCFSecSecDeviceObj newInstance() {
		IYCFSecSecDeviceObj inst = new YCFBamSecDeviceObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFBamSecDeviceObj.
	 */
	public IYCFSecSecDeviceEditObj newEditInstance( IYCFSecSecDeviceObj orig ) {
		IYCFSecSecDeviceEditObj edit = new YCFBamSecDeviceEditObj( orig );
		return( edit );
	}

	public IYCFSecSecDeviceObj realiseSecDevice( IYCFSecSecDeviceObj Obj ) {
		IYCFSecSecDeviceObj obj = Obj;
		YCFSecSecDevicePKey pkey = obj.getPKey();
		IYCFSecSecDeviceObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFSecSecDeviceObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByNameIdx != null ) {
				YCFSecSecDeviceByNameIdxKey keyNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecDevice().newNameIdxKey();
				keyNameIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keyNameIdx.setRequiredDevName( keepObj.getRequiredDevName() );
				indexByNameIdx.remove( keyNameIdx );
			}

			if( indexByUserIdx != null ) {
				YCFSecSecDeviceByUserIdxKey keyUserIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecDevice().newUserIdxKey();
				keyUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				Map<YCFSecSecDevicePKey, IYCFSecSecDeviceObj > mapUserIdx = indexByUserIdx.get( keyUserIdx );
				if( mapUserIdx != null ) {
					mapUserIdx.remove( keepObj.getPKey() );
					if( mapUserIdx.size() <= 0 ) {
						indexByUserIdx.remove( keyUserIdx );
					}
				}
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByNameIdx != null ) {
				YCFSecSecDeviceByNameIdxKey keyNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecDevice().newNameIdxKey();
				keyNameIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keyNameIdx.setRequiredDevName( keepObj.getRequiredDevName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

			if( indexByUserIdx != null ) {
				YCFSecSecDeviceByUserIdxKey keyUserIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecDevice().newUserIdxKey();
				keyUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				Map<YCFSecSecDevicePKey, IYCFSecSecDeviceObj > mapUserIdx = indexByUserIdx.get( keyUserIdx );
				if( mapUserIdx != null ) {
					mapUserIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allSecDevice != null ) {
				allSecDevice.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allSecDevice != null ) {
				allSecDevice.put( keepObj.getPKey(), keepObj );
			}

			if( indexByNameIdx != null ) {
				YCFSecSecDeviceByNameIdxKey keyNameIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecDevice().newNameIdxKey();
				keyNameIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				keyNameIdx.setRequiredDevName( keepObj.getRequiredDevName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

			if( indexByUserIdx != null ) {
				YCFSecSecDeviceByUserIdxKey keyUserIdx =
					((IYCFBamSchema)schema.getBackingStore()).getFactorySecDevice().newUserIdxKey();
				keyUserIdx.setRequiredSecUserId( keepObj.getRequiredSecUserId() );
				Map<YCFSecSecDevicePKey, IYCFSecSecDeviceObj > mapUserIdx = indexByUserIdx.get( keyUserIdx );
				if( mapUserIdx != null ) {
					mapUserIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFSecSecDeviceObj createSecDevice( IYCFSecSecDeviceObj Obj ) {
		IYCFSecSecDeviceObj obj = Obj;
		YCFSecSecDeviceBuff buff = obj.getSecDeviceBuff();
		((IYCFBamSchema)schema.getBackingStore()).getTableSecDevice().createSecDevice(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFSecSecDeviceObj readSecDevice( YCFSecSecDevicePKey pkey ) {
		return( readSecDevice( pkey, false ) );
	}

	public IYCFSecSecDeviceObj readSecDevice( YCFSecSecDevicePKey pkey, boolean forceRead ) {
		IYCFSecSecDeviceObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFSecSecDeviceBuff readBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableSecDevice().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredSecUserId(),
				pkey.getRequiredDevName() );
			if( readBuff != null ) {
				obj = schema.getSecDeviceTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecDevice().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFSecSecDeviceObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecSecDeviceObj readCachedSecDevice( YCFSecSecDevicePKey pkey ) {
		IYCFSecSecDeviceObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSecDevice( IYCFSecSecDeviceObj obj )
	{
		final String S_ProcName = "YCFBamSecDeviceTableObj.reallyDeepDisposeSecDevice() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFSecSecDevicePKey pkey = obj.getPKey();
		IYCFSecSecDeviceObj existing = readCachedSecDevice( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFSecSecDeviceByNameIdxKey keyNameIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecDevice().newNameIdxKey();
		keyNameIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );
		keyNameIdx.setRequiredDevName( existing.getRequiredDevName() );

		YCFSecSecDeviceByUserIdxKey keyUserIdx = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecDevice().newUserIdxKey();
		keyUserIdx.setRequiredSecUserId( existing.getRequiredSecUserId() );



		if( indexByNameIdx != null ) {
			indexByNameIdx.remove( keyNameIdx );
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
	public void deepDisposeSecDevice( YCFSecSecDevicePKey pkey ) {
		IYCFSecSecDeviceObj obj = readCachedSecDevice( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFSecSecDeviceObj lockSecDevice( YCFSecSecDevicePKey pkey ) {
		IYCFSecSecDeviceObj locked = null;
		YCFSecSecDeviceBuff lockBuff = ((IYCFBamSchema)schema.getBackingStore()).getTableSecDevice().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getSecDeviceTableObj().newInstance();
			locked.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecDevice().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFSecSecDeviceObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockSecDevice", pkey );
		}
		return( locked );
	}

	public List<IYCFSecSecDeviceObj> readAllSecDevice() {
		return( readAllSecDevice( false ) );
	}

	public List<IYCFSecSecDeviceObj> readAllSecDevice( boolean forceRead ) {
		final String S_ProcName = "readAllSecDevice";
		if( ( allSecDevice == null ) || forceRead ) {
			Map<YCFSecSecDevicePKey, IYCFSecSecDeviceObj> map = new HashMap<YCFSecSecDevicePKey,IYCFSecSecDeviceObj>();
			allSecDevice = map;
			YCFSecSecDeviceBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSecDevice().readAllDerived( schema.getAuthorization() );
			YCFSecSecDeviceBuff buff;
			IYCFSecSecDeviceObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecDevice().newPKey() );
				obj.setBuff( buff );
				IYCFSecSecDeviceObj realised = (IYCFSecSecDeviceObj)obj.realise();
			}
		}
		int len = allSecDevice.size();
		IYCFSecSecDeviceObj arr[] = new IYCFSecSecDeviceObj[len];
		Iterator<IYCFSecSecDeviceObj> valIter = allSecDevice.values().iterator();
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
		ArrayList<IYCFSecSecDeviceObj> arrayList = new ArrayList<IYCFSecSecDeviceObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSecDeviceObj> cmp = new Comparator<IYCFSecSecDeviceObj>() {
			public int compare( IYCFSecSecDeviceObj lhs, IYCFSecSecDeviceObj rhs ) {
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
					YCFSecSecDevicePKey lhsPKey = lhs.getPKey();
					YCFSecSecDevicePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSecDeviceObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecSecDeviceObj> readCachedAllSecDevice() {
		final String S_ProcName = "readCachedAllSecDevice";
		ArrayList<IYCFSecSecDeviceObj> arrayList = new ArrayList<IYCFSecSecDeviceObj>();
		if( allSecDevice != null ) {
			int len = allSecDevice.size();
			IYCFSecSecDeviceObj arr[] = new IYCFSecSecDeviceObj[len];
			Iterator<IYCFSecSecDeviceObj> valIter = allSecDevice.values().iterator();
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
		Comparator<IYCFSecSecDeviceObj> cmp = new Comparator<IYCFSecSecDeviceObj>() {
			public int compare( IYCFSecSecDeviceObj lhs, IYCFSecSecDeviceObj rhs ) {
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
					YCFSecSecDevicePKey lhsPKey = lhs.getPKey();
					YCFSecSecDevicePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	/**
	 *	Return a sorted map of a page of the SecDevice-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSecDeviceObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<IYCFSecSecDeviceObj> pageAllSecDevice(UUID priorSecUserId,
		String priorDevName )
	{
		final String S_ProcName = "pageAllSecDevice";
		Map<YCFSecSecDevicePKey, IYCFSecSecDeviceObj> map = new HashMap<YCFSecSecDevicePKey,IYCFSecSecDeviceObj>();
		YCFSecSecDeviceBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSecDevice().pageAllBuff( schema.getAuthorization(),
			priorSecUserId,
			priorDevName );
		YCFSecSecDeviceBuff buff;
		IYCFSecSecDeviceObj obj;
		IYCFSecSecDeviceObj realised;
		ArrayList<IYCFSecSecDeviceObj> arrayList = new ArrayList<IYCFSecSecDeviceObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecDevice().newPKey() );
			obj.setBuff( buff );
			realised = (IYCFSecSecDeviceObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public IYCFSecSecDeviceObj readSecDeviceByIdIdx( UUID SecUserId,
		String DevName )
	{
		return( readSecDeviceByIdIdx( SecUserId,
			DevName,
			false ) );
	}

	public IYCFSecSecDeviceObj readSecDeviceByIdIdx( UUID SecUserId,
		String DevName, boolean forceRead )
	{
		YCFSecSecDevicePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecDevice().newPKey();
		pkey.setRequiredSecUserId( SecUserId );
		pkey.setRequiredDevName( DevName );
		IYCFSecSecDeviceObj obj = readSecDevice( pkey, forceRead );
		return( obj );
	}

	public IYCFSecSecDeviceObj readSecDeviceByNameIdx( UUID SecUserId,
		String DevName )
	{
		return( readSecDeviceByNameIdx( SecUserId,
			DevName,
			false ) );
	}

	public IYCFSecSecDeviceObj readSecDeviceByNameIdx( UUID SecUserId,
		String DevName, boolean forceRead )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< YCFSecSecDeviceByNameIdxKey,
				IYCFSecSecDeviceObj >();
		}
		YCFSecSecDeviceByNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecDevice().newNameIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setRequiredDevName( DevName );
		IYCFSecSecDeviceObj obj = null;
		if( ( ! forceRead ) && indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
		}
		else {
			YCFSecSecDeviceBuff buff = ((IYCFBamSchema)schema.getBackingStore()).getTableSecDevice().readDerivedByNameIdx( schema.getAuthorization(),
				SecUserId,
				DevName );
			if( buff != null ) {
				obj = schema.getSecDeviceTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecDevice().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFSecSecDeviceObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFSecSecDeviceObj> readSecDeviceByUserIdx( UUID SecUserId )
	{
		return( readSecDeviceByUserIdx( SecUserId,
			false ) );
	}

	public List<IYCFSecSecDeviceObj> readSecDeviceByUserIdx( UUID SecUserId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecDeviceByUserIdx";
		YCFSecSecDeviceByUserIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecDevice().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		Map<YCFSecSecDevicePKey, IYCFSecSecDeviceObj> dict;
		if( indexByUserIdx == null ) {
			indexByUserIdx = new HashMap< YCFSecSecDeviceByUserIdxKey,
				Map< YCFSecSecDevicePKey, IYCFSecSecDeviceObj > >();
		}
		if( ( ! forceRead ) && indexByUserIdx.containsKey( key ) ) {
			dict = indexByUserIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecSecDevicePKey, IYCFSecSecDeviceObj>();
			IYCFSecSecDeviceObj obj;
			YCFSecSecDeviceBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSecDevice().readDerivedByUserIdx( schema.getAuthorization(),
				SecUserId );
			YCFSecSecDeviceBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecDeviceTableObj().newInstance();
				obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecDevice().newPKey() );
				obj.setBuff( buff );
				IYCFSecSecDeviceObj realised = (IYCFSecSecDeviceObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByUserIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecSecDeviceObj arr[] = new IYCFSecSecDeviceObj[len];
		Iterator<IYCFSecSecDeviceObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecSecDeviceObj> arrayList = new ArrayList<IYCFSecSecDeviceObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSecDeviceObj> cmp = new Comparator<IYCFSecSecDeviceObj>() {
			public int compare( IYCFSecSecDeviceObj lhs, IYCFSecSecDeviceObj rhs ) {
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
					YCFSecSecDevicePKey lhsPKey = lhs.getPKey();
					YCFSecSecDevicePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSecDeviceObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFSecSecDeviceObj readCachedSecDeviceByIdIdx( UUID SecUserId,
		String DevName )
	{
		IYCFSecSecDeviceObj obj = null;
		YCFSecSecDevicePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecDevice().newPKey();
		pkey.setRequiredSecUserId( SecUserId );
		pkey.setRequiredDevName( DevName );
		obj = readCachedSecDevice( pkey );
		return( obj );
	}

	public IYCFSecSecDeviceObj readCachedSecDeviceByNameIdx( UUID SecUserId,
		String DevName )
	{
		IYCFSecSecDeviceObj obj = null;
		YCFSecSecDeviceByNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecDevice().newNameIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setRequiredDevName( DevName );
		if( indexByNameIdx != null ) {
			if( indexByNameIdx.containsKey( key ) ) {
				obj = indexByNameIdx.get( key );
			}
			else {
				Iterator<IYCFSecSecDeviceObj> valIter = members.values().iterator();
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
			Iterator<IYCFSecSecDeviceObj> valIter = members.values().iterator();
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

	public List<IYCFSecSecDeviceObj> readCachedSecDeviceByUserIdx( UUID SecUserId )
	{
		final String S_ProcName = "readCachedSecDeviceByUserIdx";
		YCFSecSecDeviceByUserIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecDevice().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		ArrayList<IYCFSecSecDeviceObj> arrayList = new ArrayList<IYCFSecSecDeviceObj>();
		if( indexByUserIdx != null ) {
			Map<YCFSecSecDevicePKey, IYCFSecSecDeviceObj> dict;
			if( indexByUserIdx.containsKey( key ) ) {
				dict = indexByUserIdx.get( key );
				int len = dict.size();
				IYCFSecSecDeviceObj arr[] = new IYCFSecSecDeviceObj[len];
				Iterator<IYCFSecSecDeviceObj> valIter = dict.values().iterator();
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
		}
		else {
			IYCFSecSecDeviceObj obj;
			Iterator<IYCFSecSecDeviceObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecSecDeviceObj> cmp = new Comparator<IYCFSecSecDeviceObj>() {
			public int compare( IYCFSecSecDeviceObj lhs, IYCFSecSecDeviceObj rhs ) {
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
					YCFSecSecDevicePKey lhsPKey = lhs.getPKey();
					YCFSecSecDevicePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeSecDeviceByIdIdx( UUID SecUserId,
		String DevName )
	{
		IYCFSecSecDeviceObj obj = readCachedSecDeviceByIdIdx( SecUserId,
				DevName );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSecDeviceByNameIdx( UUID SecUserId,
		String DevName )
	{
		IYCFSecSecDeviceObj obj = readCachedSecDeviceByNameIdx( SecUserId,
				DevName );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSecDeviceByUserIdx( UUID SecUserId )
	{
		final String S_ProcName = "deepDisposeSecDeviceByUserIdx";
		IYCFSecSecDeviceObj obj;
		List<IYCFSecSecDeviceObj> arrayList = readCachedSecDeviceByUserIdx( SecUserId );
		if( arrayList != null )  {
			Iterator<IYCFSecSecDeviceObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	/**
	 *	Read a page of data as a List of SecDevice-derived instances sorted by their primary keys,
	 *	as identified by the duplicate UserIdx key attributes.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecDevice-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<IYCFSecSecDeviceObj> pageSecDeviceByUserIdx( UUID SecUserId,
		UUID priorSecUserId,
		String priorDevName )
	{
		final String S_ProcName = "pageSecDeviceByUserIdx";
		YCFSecSecDeviceByUserIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecDevice().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		List<IYCFSecSecDeviceObj> retList = new LinkedList<IYCFSecSecDeviceObj>();
		IYCFSecSecDeviceObj obj;
		YCFSecSecDeviceBuff[] buffList = ((IYCFBamSchema)schema.getBackingStore()).getTableSecDevice().pageBuffByUserIdx( schema.getAuthorization(),
				SecUserId,
			priorSecUserId,
			priorDevName );
		YCFSecSecDeviceBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecDeviceTableObj().newInstance();
			obj.setPKey( ((IYCFBamSchema)schema.getBackingStore()).getFactorySecDevice().newPKey() );
			obj.setBuff( buff );
			IYCFSecSecDeviceObj realised = (IYCFSecSecDeviceObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	public IYCFSecSecDeviceObj updateSecDevice( IYCFSecSecDeviceObj Obj ) {
		IYCFSecSecDeviceObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableSecDevice().updateSecDevice( schema.getAuthorization(),
			Obj.getSecDeviceBuff() );
		obj = (IYCFSecSecDeviceObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteSecDevice( IYCFSecSecDeviceObj Obj ) {
		IYCFSecSecDeviceObj obj = Obj;
		((IYCFBamSchema)schema.getBackingStore()).getTableSecDevice().deleteSecDevice( schema.getAuthorization(),
			obj.getSecDeviceBuff() );
		Obj.forget();
	}

	public void deleteSecDeviceByIdIdx( UUID SecUserId,
		String DevName )
	{
		YCFSecSecDevicePKey pkey = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecDevice().newPKey();
		pkey.setRequiredSecUserId( SecUserId );
		pkey.setRequiredDevName( DevName );
		IYCFSecSecDeviceObj obj = readSecDevice( pkey );
		if( obj != null ) {
			IYCFSecSecDeviceEditObj editObj = (IYCFSecSecDeviceEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFSecSecDeviceEditObj)obj.beginEdit();
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
		deepDisposeSecDeviceByIdIdx( SecUserId,
				DevName );
	}

	public void deleteSecDeviceByNameIdx( UUID SecUserId,
		String DevName )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< YCFSecSecDeviceByNameIdxKey,
				IYCFSecSecDeviceObj >();
		}
		YCFSecSecDeviceByNameIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecDevice().newNameIdxKey();
		key.setRequiredSecUserId( SecUserId );
		key.setRequiredDevName( DevName );
		IYCFSecSecDeviceObj obj = null;
		if( indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSecDevice().deleteSecDeviceByNameIdx( schema.getAuthorization(),
				SecUserId,
				DevName );
			obj.forget();
		}
		else {
			((IYCFBamSchema)schema.getBackingStore()).getTableSecDevice().deleteSecDeviceByNameIdx( schema.getAuthorization(),
				SecUserId,
				DevName );
		}
		deepDisposeSecDeviceByNameIdx( SecUserId,
				DevName );
	}

	public void deleteSecDeviceByUserIdx( UUID SecUserId )
	{
		YCFSecSecDeviceByUserIdxKey key = ((IYCFBamSchema)schema.getBackingStore()).getFactorySecDevice().newUserIdxKey();
		key.setRequiredSecUserId( SecUserId );
		if( indexByUserIdx == null ) {
			indexByUserIdx = new HashMap< YCFSecSecDeviceByUserIdxKey,
				Map< YCFSecSecDevicePKey, IYCFSecSecDeviceObj > >();
		}
		if( indexByUserIdx.containsKey( key ) ) {
			Map<YCFSecSecDevicePKey, IYCFSecSecDeviceObj> dict = indexByUserIdx.get( key );
			((IYCFBamSchema)schema.getBackingStore()).getTableSecDevice().deleteSecDeviceByUserIdx( schema.getAuthorization(),
				SecUserId );
			Iterator<IYCFSecSecDeviceObj> iter = dict.values().iterator();
			IYCFSecSecDeviceObj obj;
			List<IYCFSecSecDeviceObj> toForget = new LinkedList<IYCFSecSecDeviceObj>();
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
			((IYCFBamSchema)schema.getBackingStore()).getTableSecDevice().deleteSecDeviceByUserIdx( schema.getAuthorization(),
				SecUserId );
		}
		deepDisposeSecDeviceByUserIdx( SecUserId );
	}
}
