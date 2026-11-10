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

public class YCFIntSecAppTableObj
	implements IYCFIntSecAppTableObj
{
	protected IYCFIntSchemaObj schema;
	private Map<YCFSecSecAppPKey, IYCFSecSecAppObj> members;
	private Map<YCFSecSecAppPKey, IYCFSecSecAppObj> allSecApp;
	private Map< YCFSecSecAppByClusterIdxKey,
		Map<YCFSecSecAppPKey, IYCFSecSecAppObj > > indexByClusterIdx;
	private Map< YCFSecSecAppByUJEEMountIdxKey,
		IYCFSecSecAppObj > indexByUJEEMountIdx;
	public static String TABLE_NAME = "SecApp";
	public static String TABLE_DBNAME = "secapp";

	public YCFIntSecAppTableObj() {
		schema = null;
		members = new HashMap<YCFSecSecAppPKey, IYCFSecSecAppObj>();
		allSecApp = null;
		indexByClusterIdx = null;
		indexByUJEEMountIdx = null;
	}

	public YCFIntSecAppTableObj( IYCFSecSchemaObj argSchema ) {
		schema = (IYCFIntSchemaObj)argSchema;
		members = new HashMap<YCFSecSecAppPKey, IYCFSecSecAppObj>();
		allSecApp = null;
		indexByClusterIdx = null;
		indexByUJEEMountIdx = null;
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
		allSecApp = null;
		indexByClusterIdx = null;
		indexByUJEEMountIdx = null;
		List<IYCFSecSecAppObj> toForget = new LinkedList<IYCFSecSecAppObj>();
		IYCFSecSecAppObj cur = null;
		Iterator<IYCFSecSecAppObj> iter = members.values().iterator();
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
	 *	YCFIntSecAppObj.
	 */
	public IYCFSecSecAppObj newInstance() {
		IYCFSecSecAppObj inst = new YCFIntSecAppObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFIntSecAppObj.
	 */
	public IYCFSecSecAppEditObj newEditInstance( IYCFSecSecAppObj orig ) {
		IYCFSecSecAppEditObj edit = new YCFIntSecAppEditObj( orig );
		return( edit );
	}

	public IYCFSecSecAppObj realiseSecApp( IYCFSecSecAppObj Obj ) {
		IYCFSecSecAppObj obj = Obj;
		YCFSecSecAppPKey pkey = obj.getPKey();
		IYCFSecSecAppObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFSecSecAppObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByClusterIdx != null ) {
				YCFSecSecAppByClusterIdxKey keyClusterIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactorySecApp().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFSecSecAppPKey, IYCFSecSecAppObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.remove( keepObj.getPKey() );
					if( mapClusterIdx.size() <= 0 ) {
						indexByClusterIdx.remove( keyClusterIdx );
					}
				}
			}

			if( indexByUJEEMountIdx != null ) {
				YCFSecSecAppByUJEEMountIdxKey keyUJEEMountIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactorySecApp().newUJEEMountIdxKey();
				keyUJEEMountIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUJEEMountIdx.setRequiredJEEMountName( keepObj.getRequiredJEEMountName() );
				indexByUJEEMountIdx.remove( keyUJEEMountIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByClusterIdx != null ) {
				YCFSecSecAppByClusterIdxKey keyClusterIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactorySecApp().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFSecSecAppPKey, IYCFSecSecAppObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUJEEMountIdx != null ) {
				YCFSecSecAppByUJEEMountIdxKey keyUJEEMountIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactorySecApp().newUJEEMountIdxKey();
				keyUJEEMountIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUJEEMountIdx.setRequiredJEEMountName( keepObj.getRequiredJEEMountName() );
				indexByUJEEMountIdx.put( keyUJEEMountIdx, keepObj );
			}

			if( allSecApp != null ) {
				allSecApp.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allSecApp != null ) {
				allSecApp.put( keepObj.getPKey(), keepObj );
			}

			if( indexByClusterIdx != null ) {
				YCFSecSecAppByClusterIdxKey keyClusterIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactorySecApp().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFSecSecAppPKey, IYCFSecSecAppObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUJEEMountIdx != null ) {
				YCFSecSecAppByUJEEMountIdxKey keyUJEEMountIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactorySecApp().newUJEEMountIdxKey();
				keyUJEEMountIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUJEEMountIdx.setRequiredJEEMountName( keepObj.getRequiredJEEMountName() );
				indexByUJEEMountIdx.put( keyUJEEMountIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFSecSecAppObj createSecApp( IYCFSecSecAppObj Obj ) {
		IYCFSecSecAppObj obj = Obj;
		YCFSecSecAppBuff buff = obj.getSecAppBuff();
		((IYCFIntSchema)schema.getBackingStore()).getTableSecApp().createSecApp(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFSecSecAppObj readSecApp( YCFSecSecAppPKey pkey ) {
		return( readSecApp( pkey, false ) );
	}

	public IYCFSecSecAppObj readSecApp( YCFSecSecAppPKey pkey, boolean forceRead ) {
		IYCFSecSecAppObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFSecSecAppBuff readBuff = ((IYCFIntSchema)schema.getBackingStore()).getTableSecApp().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredClusterId(),
				pkey.getRequiredSecAppId() );
			if( readBuff != null ) {
				obj = schema.getSecAppTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactorySecApp().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFSecSecAppObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecSecAppObj readCachedSecApp( YCFSecSecAppPKey pkey ) {
		IYCFSecSecAppObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSecApp( IYCFSecSecAppObj obj )
	{
		final String S_ProcName = "YCFIntSecAppTableObj.reallyDeepDisposeSecApp() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFSecSecAppPKey pkey = obj.getPKey();
		IYCFSecSecAppObj existing = readCachedSecApp( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFSecSecAppByClusterIdxKey keyClusterIdx = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecApp().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFSecSecAppByUJEEMountIdxKey keyUJEEMountIdx = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecApp().newUJEEMountIdxKey();
		keyUJEEMountIdx.setRequiredClusterId( existing.getRequiredClusterId() );
		keyUJEEMountIdx.setRequiredJEEMountName( existing.getRequiredJEEMountName() );


					schema.getSecFormTableObj().deepDisposeSecFormBySecAppIdx( existing.getRequiredClusterId(),
						existing.getRequiredSecAppId() );

		if( indexByClusterIdx != null ) {
			if( indexByClusterIdx.containsKey( keyClusterIdx ) ) {
				indexByClusterIdx.get( keyClusterIdx ).remove( pkey );
				if( indexByClusterIdx.get( keyClusterIdx ).size() <= 0 ) {
					indexByClusterIdx.remove( keyClusterIdx );
				}
			}
		}

		if( indexByUJEEMountIdx != null ) {
			indexByUJEEMountIdx.remove( keyUJEEMountIdx );
		}


	}
	public void deepDisposeSecApp( YCFSecSecAppPKey pkey ) {
		IYCFSecSecAppObj obj = readCachedSecApp( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFSecSecAppObj lockSecApp( YCFSecSecAppPKey pkey ) {
		IYCFSecSecAppObj locked = null;
		YCFSecSecAppBuff lockBuff = ((IYCFIntSchema)schema.getBackingStore()).getTableSecApp().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getSecAppTableObj().newInstance();
			locked.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactorySecApp().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFSecSecAppObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockSecApp", pkey );
		}
		return( locked );
	}

	public List<IYCFSecSecAppObj> readAllSecApp() {
		return( readAllSecApp( false ) );
	}

	public List<IYCFSecSecAppObj> readAllSecApp( boolean forceRead ) {
		final String S_ProcName = "readAllSecApp";
		if( ( allSecApp == null ) || forceRead ) {
			Map<YCFSecSecAppPKey, IYCFSecSecAppObj> map = new HashMap<YCFSecSecAppPKey,IYCFSecSecAppObj>();
			allSecApp = map;
			YCFSecSecAppBuff[] buffList = ((IYCFIntSchema)schema.getBackingStore()).getTableSecApp().readAllDerived( schema.getAuthorization() );
			YCFSecSecAppBuff buff;
			IYCFSecSecAppObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactorySecApp().newPKey() );
				obj.setBuff( buff );
				IYCFSecSecAppObj realised = (IYCFSecSecAppObj)obj.realise();
			}
		}
		int len = allSecApp.size();
		IYCFSecSecAppObj arr[] = new IYCFSecSecAppObj[len];
		Iterator<IYCFSecSecAppObj> valIter = allSecApp.values().iterator();
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
		ArrayList<IYCFSecSecAppObj> arrayList = new ArrayList<IYCFSecSecAppObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSecAppObj> cmp = new Comparator<IYCFSecSecAppObj>() {
			public int compare( IYCFSecSecAppObj lhs, IYCFSecSecAppObj rhs ) {
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
					YCFSecSecAppPKey lhsPKey = lhs.getPKey();
					YCFSecSecAppPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSecAppObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecSecAppObj> readCachedAllSecApp() {
		final String S_ProcName = "readCachedAllSecApp";
		ArrayList<IYCFSecSecAppObj> arrayList = new ArrayList<IYCFSecSecAppObj>();
		if( allSecApp != null ) {
			int len = allSecApp.size();
			IYCFSecSecAppObj arr[] = new IYCFSecSecAppObj[len];
			Iterator<IYCFSecSecAppObj> valIter = allSecApp.values().iterator();
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
		Comparator<IYCFSecSecAppObj> cmp = new Comparator<IYCFSecSecAppObj>() {
			public int compare( IYCFSecSecAppObj lhs, IYCFSecSecAppObj rhs ) {
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
					YCFSecSecAppPKey lhsPKey = lhs.getPKey();
					YCFSecSecAppPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	/**
	 *	Return a sorted map of a page of the SecApp-derived instances in the database.
	 *
	 *	@return	List of IYCFSecSecAppObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<IYCFSecSecAppObj> pageAllSecApp(Long priorClusterId,
		Integer priorSecAppId )
	{
		final String S_ProcName = "pageAllSecApp";
		Map<YCFSecSecAppPKey, IYCFSecSecAppObj> map = new HashMap<YCFSecSecAppPKey,IYCFSecSecAppObj>();
		YCFSecSecAppBuff[] buffList = ((IYCFIntSchema)schema.getBackingStore()).getTableSecApp().pageAllBuff( schema.getAuthorization(),
			priorClusterId,
			priorSecAppId );
		YCFSecSecAppBuff buff;
		IYCFSecSecAppObj obj;
		IYCFSecSecAppObj realised;
		ArrayList<IYCFSecSecAppObj> arrayList = new ArrayList<IYCFSecSecAppObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactorySecApp().newPKey() );
			obj.setBuff( buff );
			realised = (IYCFSecSecAppObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public IYCFSecSecAppObj readSecAppByIdIdx( long ClusterId,
		int SecAppId )
	{
		return( readSecAppByIdIdx( ClusterId,
			SecAppId,
			false ) );
	}

	public IYCFSecSecAppObj readSecAppByIdIdx( long ClusterId,
		int SecAppId, boolean forceRead )
	{
		YCFSecSecAppPKey pkey = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecApp().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecAppId( SecAppId );
		IYCFSecSecAppObj obj = readSecApp( pkey, forceRead );
		return( obj );
	}

	public List<IYCFSecSecAppObj> readSecAppByClusterIdx( long ClusterId )
	{
		return( readSecAppByClusterIdx( ClusterId,
			false ) );
	}

	public List<IYCFSecSecAppObj> readSecAppByClusterIdx( long ClusterId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecAppByClusterIdx";
		YCFSecSecAppByClusterIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecApp().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		Map<YCFSecSecAppPKey, IYCFSecSecAppObj> dict;
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFSecSecAppByClusterIdxKey,
				Map< YCFSecSecAppPKey, IYCFSecSecAppObj > >();
		}
		if( ( ! forceRead ) && indexByClusterIdx.containsKey( key ) ) {
			dict = indexByClusterIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecSecAppPKey, IYCFSecSecAppObj>();
			IYCFSecSecAppObj obj;
			YCFSecSecAppBuff[] buffList = ((IYCFIntSchema)schema.getBackingStore()).getTableSecApp().readDerivedByClusterIdx( schema.getAuthorization(),
				ClusterId );
			YCFSecSecAppBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecAppTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactorySecApp().newPKey() );
				obj.setBuff( buff );
				IYCFSecSecAppObj realised = (IYCFSecSecAppObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClusterIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecSecAppObj arr[] = new IYCFSecSecAppObj[len];
		Iterator<IYCFSecSecAppObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecSecAppObj> arrayList = new ArrayList<IYCFSecSecAppObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecSecAppObj> cmp = new Comparator<IYCFSecSecAppObj>() {
			public int compare( IYCFSecSecAppObj lhs, IYCFSecSecAppObj rhs ) {
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
					YCFSecSecAppPKey lhsPKey = lhs.getPKey();
					YCFSecSecAppPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecSecAppObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFSecSecAppObj readSecAppByUJEEMountIdx( long ClusterId,
		String JEEMountName )
	{
		return( readSecAppByUJEEMountIdx( ClusterId,
			JEEMountName,
			false ) );
	}

	public IYCFSecSecAppObj readSecAppByUJEEMountIdx( long ClusterId,
		String JEEMountName, boolean forceRead )
	{
		if( indexByUJEEMountIdx == null ) {
			indexByUJEEMountIdx = new HashMap< YCFSecSecAppByUJEEMountIdxKey,
				IYCFSecSecAppObj >();
		}
		YCFSecSecAppByUJEEMountIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecApp().newUJEEMountIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredJEEMountName( JEEMountName );
		IYCFSecSecAppObj obj = null;
		if( ( ! forceRead ) && indexByUJEEMountIdx.containsKey( key ) ) {
			obj = indexByUJEEMountIdx.get( key );
		}
		else {
			YCFSecSecAppBuff buff = ((IYCFIntSchema)schema.getBackingStore()).getTableSecApp().readDerivedByUJEEMountIdx( schema.getAuthorization(),
				ClusterId,
				JEEMountName );
			if( buff != null ) {
				obj = schema.getSecAppTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactorySecApp().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFSecSecAppObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecSecAppObj readCachedSecAppByIdIdx( long ClusterId,
		int SecAppId )
	{
		IYCFSecSecAppObj obj = null;
		YCFSecSecAppPKey pkey = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecApp().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecAppId( SecAppId );
		obj = readCachedSecApp( pkey );
		return( obj );
	}

	public List<IYCFSecSecAppObj> readCachedSecAppByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "readCachedSecAppByClusterIdx";
		YCFSecSecAppByClusterIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecApp().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		ArrayList<IYCFSecSecAppObj> arrayList = new ArrayList<IYCFSecSecAppObj>();
		if( indexByClusterIdx != null ) {
			Map<YCFSecSecAppPKey, IYCFSecSecAppObj> dict;
			if( indexByClusterIdx.containsKey( key ) ) {
				dict = indexByClusterIdx.get( key );
				int len = dict.size();
				IYCFSecSecAppObj arr[] = new IYCFSecSecAppObj[len];
				Iterator<IYCFSecSecAppObj> valIter = dict.values().iterator();
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
			IYCFSecSecAppObj obj;
			Iterator<IYCFSecSecAppObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecSecAppObj> cmp = new Comparator<IYCFSecSecAppObj>() {
			public int compare( IYCFSecSecAppObj lhs, IYCFSecSecAppObj rhs ) {
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
					YCFSecSecAppPKey lhsPKey = lhs.getPKey();
					YCFSecSecAppPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFSecSecAppObj readCachedSecAppByUJEEMountIdx( long ClusterId,
		String JEEMountName )
	{
		IYCFSecSecAppObj obj = null;
		YCFSecSecAppByUJEEMountIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecApp().newUJEEMountIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredJEEMountName( JEEMountName );
		if( indexByUJEEMountIdx != null ) {
			if( indexByUJEEMountIdx.containsKey( key ) ) {
				obj = indexByUJEEMountIdx.get( key );
			}
			else {
				Iterator<IYCFSecSecAppObj> valIter = members.values().iterator();
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
			Iterator<IYCFSecSecAppObj> valIter = members.values().iterator();
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

	public void deepDisposeSecAppByIdIdx( long ClusterId,
		int SecAppId )
	{
		IYCFSecSecAppObj obj = readCachedSecAppByIdIdx( ClusterId,
				SecAppId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSecAppByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "deepDisposeSecAppByClusterIdx";
		IYCFSecSecAppObj obj;
		List<IYCFSecSecAppObj> arrayList = readCachedSecAppByClusterIdx( ClusterId );
		if( arrayList != null )  {
			Iterator<IYCFSecSecAppObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeSecAppByUJEEMountIdx( long ClusterId,
		String JEEMountName )
	{
		IYCFSecSecAppObj obj = readCachedSecAppByUJEEMountIdx( ClusterId,
				JEEMountName );
		if( obj != null ) {
			obj.forget();
		}
	}

	/**
	 *	Read a page of data as a List of SecApp-derived instances sorted by their primary keys,
	 *	as identified by the duplicate ClusterIdx key attributes.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecApp-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	public List<IYCFSecSecAppObj> pageSecAppByClusterIdx( long ClusterId,
		Long priorClusterId,
		Integer priorSecAppId )
	{
		final String S_ProcName = "pageSecAppByClusterIdx";
		YCFSecSecAppByClusterIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecApp().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		List<IYCFSecSecAppObj> retList = new LinkedList<IYCFSecSecAppObj>();
		IYCFSecSecAppObj obj;
		YCFSecSecAppBuff[] buffList = ((IYCFIntSchema)schema.getBackingStore()).getTableSecApp().pageBuffByClusterIdx( schema.getAuthorization(),
				ClusterId,
			priorClusterId,
			priorSecAppId );
		YCFSecSecAppBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecAppTableObj().newInstance();
			obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactorySecApp().newPKey() );
			obj.setBuff( buff );
			IYCFSecSecAppObj realised = (IYCFSecSecAppObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	public IYCFSecSecAppObj updateSecApp( IYCFSecSecAppObj Obj ) {
		IYCFSecSecAppObj obj = Obj;
		((IYCFIntSchema)schema.getBackingStore()).getTableSecApp().updateSecApp( schema.getAuthorization(),
			Obj.getSecAppBuff() );
		obj = (IYCFSecSecAppObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteSecApp( IYCFSecSecAppObj Obj ) {
		IYCFSecSecAppObj obj = Obj;
		((IYCFIntSchema)schema.getBackingStore()).getTableSecApp().deleteSecApp( schema.getAuthorization(),
			obj.getSecAppBuff() );
		Obj.forget();
	}

	public void deleteSecAppByIdIdx( long ClusterId,
		int SecAppId )
	{
		YCFSecSecAppPKey pkey = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecApp().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecAppId( SecAppId );
		IYCFSecSecAppObj obj = readSecApp( pkey );
		if( obj != null ) {
			IYCFSecSecAppEditObj editObj = (IYCFSecSecAppEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFSecSecAppEditObj)obj.beginEdit();
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
		deepDisposeSecAppByIdIdx( ClusterId,
				SecAppId );
	}

	public void deleteSecAppByClusterIdx( long ClusterId )
	{
		YCFSecSecAppByClusterIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecApp().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFSecSecAppByClusterIdxKey,
				Map< YCFSecSecAppPKey, IYCFSecSecAppObj > >();
		}
		if( indexByClusterIdx.containsKey( key ) ) {
			Map<YCFSecSecAppPKey, IYCFSecSecAppObj> dict = indexByClusterIdx.get( key );
			((IYCFIntSchema)schema.getBackingStore()).getTableSecApp().deleteSecAppByClusterIdx( schema.getAuthorization(),
				ClusterId );
			Iterator<IYCFSecSecAppObj> iter = dict.values().iterator();
			IYCFSecSecAppObj obj;
			List<IYCFSecSecAppObj> toForget = new LinkedList<IYCFSecSecAppObj>();
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
			((IYCFIntSchema)schema.getBackingStore()).getTableSecApp().deleteSecAppByClusterIdx( schema.getAuthorization(),
				ClusterId );
		}
		deepDisposeSecAppByClusterIdx( ClusterId );
	}

	public void deleteSecAppByUJEEMountIdx( long ClusterId,
		String JEEMountName )
	{
		if( indexByUJEEMountIdx == null ) {
			indexByUJEEMountIdx = new HashMap< YCFSecSecAppByUJEEMountIdxKey,
				IYCFSecSecAppObj >();
		}
		YCFSecSecAppByUJEEMountIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactorySecApp().newUJEEMountIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredJEEMountName( JEEMountName );
		IYCFSecSecAppObj obj = null;
		if( indexByUJEEMountIdx.containsKey( key ) ) {
			obj = indexByUJEEMountIdx.get( key );
			((IYCFIntSchema)schema.getBackingStore()).getTableSecApp().deleteSecAppByUJEEMountIdx( schema.getAuthorization(),
				ClusterId,
				JEEMountName );
			obj.forget();
		}
		else {
			((IYCFIntSchema)schema.getBackingStore()).getTableSecApp().deleteSecAppByUJEEMountIdx( schema.getAuthorization(),
				ClusterId,
				JEEMountName );
		}
		deepDisposeSecAppByUJEEMountIdx( ClusterId,
				JEEMountName );
	}
}
