// Description: Java 11 Table Object implementation for YCFSec.

/*
 *	org.mssycf.mssycf.YCFSec
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

package org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;

public class YCFSecSysClusterTableObj
	implements IYCFSecSysClusterTableObj
{
	protected IYCFSecSchemaObj schema;
	private Map<YCFSecSysClusterPKey, IYCFSecSysClusterObj> members;
	private Map<YCFSecSysClusterPKey, IYCFSecSysClusterObj> allSysCluster;
	private Map< YCFSecSysClusterByClusterIdxKey,
		Map<YCFSecSysClusterPKey, IYCFSecSysClusterObj > > indexByClusterIdx;
	public static String TABLE_NAME = "SysCluster";
	public static String TABLE_DBNAME = "sysclus";

	public YCFSecSysClusterTableObj() {
		schema = null;
		members = new HashMap<YCFSecSysClusterPKey, IYCFSecSysClusterObj>();
		allSysCluster = null;
		indexByClusterIdx = null;
	}

	public YCFSecSysClusterTableObj( IYCFSecSchemaObj argSchema ) {
		schema = (IYCFSecSchemaObj)argSchema;
		members = new HashMap<YCFSecSysClusterPKey, IYCFSecSysClusterObj>();
		allSysCluster = null;
		indexByClusterIdx = null;
	}

	public IYCFSecSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFSecSchemaObj value ) {
		schema = (IYCFSecSchemaObj)value;
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
		allSysCluster = null;
		indexByClusterIdx = null;
		List<IYCFSecSysClusterObj> toForget = new LinkedList<IYCFSecSysClusterObj>();
		IYCFSecSysClusterObj cur = null;
		Iterator<IYCFSecSysClusterObj> iter = members.values().iterator();
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
	 *	YCFSecSysClusterObj.
	 */
	public IYCFSecSysClusterObj newInstance() {
		IYCFSecSysClusterObj inst = new YCFSecSysClusterObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFSecSysClusterObj.
	 */
	public IYCFSecSysClusterEditObj newEditInstance( IYCFSecSysClusterObj orig ) {
		IYCFSecSysClusterEditObj edit = new YCFSecSysClusterEditObj( orig );
		return( edit );
	}

	public IYCFSecSysClusterObj realiseSysCluster( IYCFSecSysClusterObj Obj ) {
		IYCFSecSysClusterObj obj = Obj;
		YCFSecSysClusterPKey pkey = obj.getPKey();
		IYCFSecSysClusterObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFSecSysClusterObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByClusterIdx != null ) {
				YCFSecSysClusterByClusterIdxKey keyClusterIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySysCluster().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFSecSysClusterPKey, IYCFSecSysClusterObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.remove( keepObj.getPKey() );
					if( mapClusterIdx.size() <= 0 ) {
						indexByClusterIdx.remove( keyClusterIdx );
					}
				}
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByClusterIdx != null ) {
				YCFSecSysClusterByClusterIdxKey keyClusterIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySysCluster().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFSecSysClusterPKey, IYCFSecSysClusterObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allSysCluster != null ) {
				allSysCluster.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allSysCluster != null ) {
				allSysCluster.put( keepObj.getPKey(), keepObj );
			}

			if( indexByClusterIdx != null ) {
				YCFSecSysClusterByClusterIdxKey keyClusterIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactorySysCluster().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFSecSysClusterPKey, IYCFSecSysClusterObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFSecSysClusterObj createSysCluster( IYCFSecSysClusterObj Obj ) {
		IYCFSecSysClusterObj obj = Obj;
		YCFSecSysClusterBuff buff = obj.getSysClusterBuff();
		((IYCFSecSchema)schema.getBackingStore()).getTableSysCluster().createSysCluster(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFSecSysClusterObj readSysCluster( YCFSecSysClusterPKey pkey ) {
		return( readSysCluster( pkey, false ) );
	}

	public IYCFSecSysClusterObj readSysCluster( YCFSecSysClusterPKey pkey, boolean forceRead ) {
		IYCFSecSysClusterObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFSecSysClusterBuff readBuff = ((IYCFSecSchema)schema.getBackingStore()).getTableSysCluster().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredSingletonId() );
			if( readBuff != null ) {
				obj = schema.getSysClusterTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySysCluster().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFSecSysClusterObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecSysClusterObj readCachedSysCluster( YCFSecSysClusterPKey pkey ) {
		IYCFSecSysClusterObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSysCluster( IYCFSecSysClusterObj obj )
	{
		final String S_ProcName = "YCFSecSysClusterTableObj.reallyDeepDisposeSysCluster() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFSecSysClusterPKey pkey = obj.getPKey();
		IYCFSecSysClusterObj existing = readCachedSysCluster( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFSecSysClusterByClusterIdxKey keyClusterIdx = ((IYCFSecSchema)schema.getBackingStore()).getFactorySysCluster().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );



		if( indexByClusterIdx != null ) {
			if( indexByClusterIdx.containsKey( keyClusterIdx ) ) {
				indexByClusterIdx.get( keyClusterIdx ).remove( pkey );
				if( indexByClusterIdx.get( keyClusterIdx ).size() <= 0 ) {
					indexByClusterIdx.remove( keyClusterIdx );
				}
			}
		}


	}
	public void deepDisposeSysCluster( YCFSecSysClusterPKey pkey ) {
		IYCFSecSysClusterObj obj = readCachedSysCluster( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFSecSysClusterObj lockSysCluster( YCFSecSysClusterPKey pkey ) {
		IYCFSecSysClusterObj locked = null;
		YCFSecSysClusterBuff lockBuff = ((IYCFSecSchema)schema.getBackingStore()).getTableSysCluster().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getSysClusterTableObj().newInstance();
			locked.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySysCluster().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFSecSysClusterObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockSysCluster", pkey );
		}
		return( locked );
	}

	public List<IYCFSecSysClusterObj> readAllSysCluster() {
		return( readAllSysCluster( false ) );
	}

	public List<IYCFSecSysClusterObj> readAllSysCluster( boolean forceRead ) {
		final String S_ProcName = "readAllSysCluster";
		if( ( allSysCluster == null ) || forceRead ) {
			Map<YCFSecSysClusterPKey, IYCFSecSysClusterObj> map = new HashMap<YCFSecSysClusterPKey,IYCFSecSysClusterObj>();
			allSysCluster = map;
			YCFSecSysClusterBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableSysCluster().readAllDerived( schema.getAuthorization() );
			YCFSecSysClusterBuff buff;
			IYCFSecSysClusterObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySysCluster().newPKey() );
				obj.setBuff( buff );
				IYCFSecSysClusterObj realised = (IYCFSecSysClusterObj)obj.realise();
			}
		}
		int len = allSysCluster.size();
		IYCFSecSysClusterObj arr[] = new IYCFSecSysClusterObj[len];
		Iterator<IYCFSecSysClusterObj> valIter = allSysCluster.values().iterator();
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
		ArrayList<IYCFSecSysClusterObj> arrayList = new ArrayList<IYCFSecSysClusterObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSysClusterObj> cmp = new Comparator<IYCFSecSysClusterObj>() {
			public int compare( IYCFSecSysClusterObj lhs, IYCFSecSysClusterObj rhs ) {
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
					YCFSecSysClusterPKey lhsPKey = lhs.getPKey();
					YCFSecSysClusterPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSysClusterObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecSysClusterObj> readCachedAllSysCluster() {
		final String S_ProcName = "readCachedAllSysCluster";
		ArrayList<IYCFSecSysClusterObj> arrayList = new ArrayList<IYCFSecSysClusterObj>();
		if( allSysCluster != null ) {
			int len = allSysCluster.size();
			IYCFSecSysClusterObj arr[] = new IYCFSecSysClusterObj[len];
			Iterator<IYCFSecSysClusterObj> valIter = allSysCluster.values().iterator();
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
		Comparator<IYCFSecSysClusterObj> cmp = new Comparator<IYCFSecSysClusterObj>() {
			public int compare( IYCFSecSysClusterObj lhs, IYCFSecSysClusterObj rhs ) {
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
					YCFSecSysClusterPKey lhsPKey = lhs.getPKey();
					YCFSecSysClusterPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFSecSysClusterObj readSysClusterByIdIdx( int SingletonId )
	{
		return( readSysClusterByIdIdx( SingletonId,
			false ) );
	}

	public IYCFSecSysClusterObj readSysClusterByIdIdx( int SingletonId, boolean forceRead )
	{
		YCFSecSysClusterPKey pkey = ((IYCFSecSchema)schema.getBackingStore()).getFactorySysCluster().newPKey();
		pkey.setRequiredSingletonId( SingletonId );
		IYCFSecSysClusterObj obj = readSysCluster( pkey, forceRead );
		return( obj );
	}

	public List<IYCFSecSysClusterObj> readSysClusterByClusterIdx( long ClusterId )
	{
		return( readSysClusterByClusterIdx( ClusterId,
			false ) );
	}

	public List<IYCFSecSysClusterObj> readSysClusterByClusterIdx( long ClusterId,
		boolean forceRead )
	{
		final String S_ProcName = "readSysClusterByClusterIdx";
		YCFSecSysClusterByClusterIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySysCluster().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		Map<YCFSecSysClusterPKey, IYCFSecSysClusterObj> dict;
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFSecSysClusterByClusterIdxKey,
				Map< YCFSecSysClusterPKey, IYCFSecSysClusterObj > >();
		}
		if( ( ! forceRead ) && indexByClusterIdx.containsKey( key ) ) {
			dict = indexByClusterIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecSysClusterPKey, IYCFSecSysClusterObj>();
			IYCFSecSysClusterObj obj;
			YCFSecSysClusterBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableSysCluster().readDerivedByClusterIdx( schema.getAuthorization(),
				ClusterId );
			YCFSecSysClusterBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSysClusterTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactorySysCluster().newPKey() );
				obj.setBuff( buff );
				IYCFSecSysClusterObj realised = (IYCFSecSysClusterObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClusterIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecSysClusterObj arr[] = new IYCFSecSysClusterObj[len];
		Iterator<IYCFSecSysClusterObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecSysClusterObj> arrayList = new ArrayList<IYCFSecSysClusterObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSysClusterObj> cmp = new Comparator<IYCFSecSysClusterObj>() {
			public int compare( IYCFSecSysClusterObj lhs, IYCFSecSysClusterObj rhs ) {
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
					YCFSecSysClusterPKey lhsPKey = lhs.getPKey();
					YCFSecSysClusterPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSysClusterObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFSecSysClusterObj readCachedSysClusterByIdIdx( int SingletonId )
	{
		IYCFSecSysClusterObj obj = null;
		YCFSecSysClusterPKey pkey = ((IYCFSecSchema)schema.getBackingStore()).getFactorySysCluster().newPKey();
		pkey.setRequiredSingletonId( SingletonId );
		obj = readCachedSysCluster( pkey );
		return( obj );
	}

	public List<IYCFSecSysClusterObj> readCachedSysClusterByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "readCachedSysClusterByClusterIdx";
		YCFSecSysClusterByClusterIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySysCluster().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		ArrayList<IYCFSecSysClusterObj> arrayList = new ArrayList<IYCFSecSysClusterObj>();
		if( indexByClusterIdx != null ) {
			Map<YCFSecSysClusterPKey, IYCFSecSysClusterObj> dict;
			if( indexByClusterIdx.containsKey( key ) ) {
				dict = indexByClusterIdx.get( key );
				int len = dict.size();
				IYCFSecSysClusterObj arr[] = new IYCFSecSysClusterObj[len];
				Iterator<IYCFSecSysClusterObj> valIter = dict.values().iterator();
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
			IYCFSecSysClusterObj obj;
			Iterator<IYCFSecSysClusterObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecSysClusterObj> cmp = new Comparator<IYCFSecSysClusterObj>() {
			public int compare( IYCFSecSysClusterObj lhs, IYCFSecSysClusterObj rhs ) {
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
					YCFSecSysClusterPKey lhsPKey = lhs.getPKey();
					YCFSecSysClusterPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeSysClusterByIdIdx( int SingletonId )
	{
		IYCFSecSysClusterObj obj = readCachedSysClusterByIdIdx( SingletonId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSysClusterByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "deepDisposeSysClusterByClusterIdx";
		IYCFSecSysClusterObj obj;
		List<IYCFSecSysClusterObj> arrayList = readCachedSysClusterByClusterIdx( ClusterId );
		if( arrayList != null )  {
			Iterator<IYCFSecSysClusterObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFSecSysClusterObj updateSysCluster( IYCFSecSysClusterObj Obj ) {
		IYCFSecSysClusterObj obj = Obj;
		((IYCFSecSchema)schema.getBackingStore()).getTableSysCluster().updateSysCluster( schema.getAuthorization(),
			Obj.getSysClusterBuff() );
		obj = (IYCFSecSysClusterObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteSysCluster( IYCFSecSysClusterObj Obj ) {
		IYCFSecSysClusterObj obj = Obj;
		((IYCFSecSchema)schema.getBackingStore()).getTableSysCluster().deleteSysCluster( schema.getAuthorization(),
			obj.getSysClusterBuff() );
		Obj.forget();
	}

	public void deleteSysClusterByIdIdx( int SingletonId )
	{
		YCFSecSysClusterPKey pkey = ((IYCFSecSchema)schema.getBackingStore()).getFactorySysCluster().newPKey();
		pkey.setRequiredSingletonId( SingletonId );
		IYCFSecSysClusterObj obj = readSysCluster( pkey );
		if( obj != null ) {
			IYCFSecSysClusterEditObj editObj = (IYCFSecSysClusterEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFSecSysClusterEditObj)obj.beginEdit();
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
		deepDisposeSysClusterByIdIdx( SingletonId );
	}

	public void deleteSysClusterByClusterIdx( long ClusterId )
	{
		YCFSecSysClusterByClusterIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactorySysCluster().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFSecSysClusterByClusterIdxKey,
				Map< YCFSecSysClusterPKey, IYCFSecSysClusterObj > >();
		}
		if( indexByClusterIdx.containsKey( key ) ) {
			Map<YCFSecSysClusterPKey, IYCFSecSysClusterObj> dict = indexByClusterIdx.get( key );
			((IYCFSecSchema)schema.getBackingStore()).getTableSysCluster().deleteSysClusterByClusterIdx( schema.getAuthorization(),
				ClusterId );
			Iterator<IYCFSecSysClusterObj> iter = dict.values().iterator();
			IYCFSecSysClusterObj obj;
			List<IYCFSecSysClusterObj> toForget = new LinkedList<IYCFSecSysClusterObj>();
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
			((IYCFSecSchema)schema.getBackingStore()).getTableSysCluster().deleteSysClusterByClusterIdx( schema.getAuthorization(),
				ClusterId );
		}
		deepDisposeSysClusterByClusterIdx( ClusterId );
	}
}
