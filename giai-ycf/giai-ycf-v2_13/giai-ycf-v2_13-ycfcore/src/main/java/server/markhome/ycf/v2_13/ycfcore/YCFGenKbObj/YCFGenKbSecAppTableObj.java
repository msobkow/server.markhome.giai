// Description: Java 11 Table Object implementation for YCFGenKb.

/*
 *	org.mssycf.mssycf.YCFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory YCFCore 2.13 Generation Knowledgebase
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;

public class YCFGenKbSecAppTableObj
	implements IYCFGenKbSecAppTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbSecAppPKey, IYCFGenKbSecAppObj> members;
	private Map<YCFGenKbSecAppPKey, IYCFGenKbSecAppObj> allSecApp;
	private Map< YCFGenKbSecAppByClusterIdxKey,
		Map<YCFGenKbSecAppPKey, IYCFGenKbSecAppObj > > indexByClusterIdx;
	private Map< YCFGenKbSecAppByUJEEMountIdxKey,
		IYCFGenKbSecAppObj > indexByUJEEMountIdx;
	public static String TABLE_NAME = "SecApp";
	public static String TABLE_DBNAME = "secapp";

	public YCFGenKbSecAppTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbSecAppPKey, IYCFGenKbSecAppObj>();
		allSecApp = null;
		indexByClusterIdx = null;
		indexByUJEEMountIdx = null;
	}

	public YCFGenKbSecAppTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbSecAppPKey, IYCFGenKbSecAppObj>();
		allSecApp = null;
		indexByClusterIdx = null;
		indexByUJEEMountIdx = null;
	}

	public IYCFGenKbSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFGenKbSchemaObj value ) {
		schema = (IYCFGenKbSchemaObj)value;
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
		List<IYCFGenKbSecAppObj> toForget = new LinkedList<IYCFGenKbSecAppObj>();
		IYCFGenKbSecAppObj cur = null;
		Iterator<IYCFGenKbSecAppObj> iter = members.values().iterator();
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
	 *	YCFGenKbSecAppObj.
	 */
	public IYCFGenKbSecAppObj newInstance() {
		IYCFGenKbSecAppObj inst = new YCFGenKbSecAppObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbSecAppObj.
	 */
	public IYCFGenKbSecAppEditObj newEditInstance( IYCFGenKbSecAppObj orig ) {
		IYCFGenKbSecAppEditObj edit = new YCFGenKbSecAppEditObj( orig );
		return( edit );
	}

	public IYCFGenKbSecAppObj realiseSecApp( IYCFGenKbSecAppObj Obj ) {
		IYCFGenKbSecAppObj obj = Obj;
		YCFGenKbSecAppPKey pkey = obj.getPKey();
		IYCFGenKbSecAppObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbSecAppObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByClusterIdx != null ) {
				YCFGenKbSecAppByClusterIdxKey keyClusterIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecApp().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFGenKbSecAppPKey, IYCFGenKbSecAppObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.remove( keepObj.getPKey() );
					if( mapClusterIdx.size() <= 0 ) {
						indexByClusterIdx.remove( keyClusterIdx );
					}
				}
			}

			if( indexByUJEEMountIdx != null ) {
				YCFGenKbSecAppByUJEEMountIdxKey keyUJEEMountIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecApp().newUJEEMountIdxKey();
				keyUJEEMountIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUJEEMountIdx.setRequiredJEEMountName( keepObj.getRequiredJEEMountName() );
				indexByUJEEMountIdx.remove( keyUJEEMountIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByClusterIdx != null ) {
				YCFGenKbSecAppByClusterIdxKey keyClusterIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecApp().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFGenKbSecAppPKey, IYCFGenKbSecAppObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUJEEMountIdx != null ) {
				YCFGenKbSecAppByUJEEMountIdxKey keyUJEEMountIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecApp().newUJEEMountIdxKey();
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
				YCFGenKbSecAppByClusterIdxKey keyClusterIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecApp().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFGenKbSecAppPKey, IYCFGenKbSecAppObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUJEEMountIdx != null ) {
				YCFGenKbSecAppByUJEEMountIdxKey keyUJEEMountIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecApp().newUJEEMountIdxKey();
				keyUJEEMountIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				keyUJEEMountIdx.setRequiredJEEMountName( keepObj.getRequiredJEEMountName() );
				indexByUJEEMountIdx.put( keyUJEEMountIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFGenKbSecAppObj createSecApp( IYCFGenKbSecAppObj Obj ) {
		IYCFGenKbSecAppObj obj = Obj;
		YCFGenKbSecAppBuff buff = obj.getSecAppBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableSecApp().createSecApp(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbSecAppObj readSecApp( YCFGenKbSecAppPKey pkey ) {
		return( readSecApp( pkey, false ) );
	}

	public IYCFGenKbSecAppObj readSecApp( YCFGenKbSecAppPKey pkey, boolean forceRead ) {
		IYCFGenKbSecAppObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbSecAppBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecApp().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredClusterId(),
				pkey.getRequiredSecAppId() );
			if( readBuff != null ) {
				obj = schema.getSecAppTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecApp().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbSecAppObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbSecAppObj readCachedSecApp( YCFGenKbSecAppPKey pkey ) {
		IYCFGenKbSecAppObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSecApp( IYCFGenKbSecAppObj obj )
	{
		final String S_ProcName = "YCFGenKbSecAppTableObj.reallyDeepDisposeSecApp() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbSecAppPKey pkey = obj.getPKey();
		IYCFGenKbSecAppObj existing = readCachedSecApp( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFGenKbSecAppByClusterIdxKey keyClusterIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecApp().newClusterIdxKey();
		keyClusterIdx.setRequiredClusterId( existing.getRequiredClusterId() );

		YCFGenKbSecAppByUJEEMountIdxKey keyUJEEMountIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecApp().newUJEEMountIdxKey();
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
	public void deepDisposeSecApp( YCFGenKbSecAppPKey pkey ) {
		IYCFGenKbSecAppObj obj = readCachedSecApp( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbSecAppObj lockSecApp( YCFGenKbSecAppPKey pkey ) {
		IYCFGenKbSecAppObj locked = null;
		YCFGenKbSecAppBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecApp().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getSecAppTableObj().newInstance();
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecApp().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbSecAppObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockSecApp", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbSecAppObj> readAllSecApp() {
		return( readAllSecApp( false ) );
	}

	public List<IYCFGenKbSecAppObj> readAllSecApp( boolean forceRead ) {
		final String S_ProcName = "readAllSecApp";
		if( ( allSecApp == null ) || forceRead ) {
			Map<YCFGenKbSecAppPKey, IYCFGenKbSecAppObj> map = new HashMap<YCFGenKbSecAppPKey,IYCFGenKbSecAppObj>();
			allSecApp = map;
			YCFGenKbSecAppBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecApp().readAllDerived( schema.getAuthorization() );
			YCFGenKbSecAppBuff buff;
			IYCFGenKbSecAppObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecApp().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSecAppObj realised = (IYCFGenKbSecAppObj)obj.realise();
			}
		}
		int len = allSecApp.size();
		IYCFGenKbSecAppObj arr[] = new IYCFGenKbSecAppObj[len];
		Iterator<IYCFGenKbSecAppObj> valIter = allSecApp.values().iterator();
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
		ArrayList<IYCFGenKbSecAppObj> arrayList = new ArrayList<IYCFGenKbSecAppObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSecAppObj> cmp = new Comparator<IYCFGenKbSecAppObj>() {
			public int compare( IYCFGenKbSecAppObj lhs, IYCFGenKbSecAppObj rhs ) {
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
					YCFGenKbSecAppPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecAppPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSecAppObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbSecAppObj> readCachedAllSecApp() {
		final String S_ProcName = "readCachedAllSecApp";
		ArrayList<IYCFGenKbSecAppObj> arrayList = new ArrayList<IYCFGenKbSecAppObj>();
		if( allSecApp != null ) {
			int len = allSecApp.size();
			IYCFGenKbSecAppObj arr[] = new IYCFGenKbSecAppObj[len];
			Iterator<IYCFGenKbSecAppObj> valIter = allSecApp.values().iterator();
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
		Comparator<IYCFGenKbSecAppObj> cmp = new Comparator<IYCFGenKbSecAppObj>() {
			public int compare( IYCFGenKbSecAppObj lhs, IYCFGenKbSecAppObj rhs ) {
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
					YCFGenKbSecAppPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecAppPKey rhsPKey = rhs.getPKey();
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
	 *	@return	List of IYCFGenKbSecAppObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	public List<IYCFGenKbSecAppObj> pageAllSecApp(Long priorClusterId,
		Integer priorSecAppId )
	{
		final String S_ProcName = "pageAllSecApp";
		Map<YCFGenKbSecAppPKey, IYCFGenKbSecAppObj> map = new HashMap<YCFGenKbSecAppPKey,IYCFGenKbSecAppObj>();
		YCFGenKbSecAppBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecApp().pageAllBuff( schema.getAuthorization(),
			priorClusterId,
			priorSecAppId );
		YCFGenKbSecAppBuff buff;
		IYCFGenKbSecAppObj obj;
		IYCFGenKbSecAppObj realised;
		ArrayList<IYCFGenKbSecAppObj> arrayList = new ArrayList<IYCFGenKbSecAppObj>( buffList.length );
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecApp().newPKey() );
			obj.setBuff( buff );
			realised = (IYCFGenKbSecAppObj)obj.realise();
			arrayList.add( realised );
		}
		return( arrayList );
	}

	public IYCFGenKbSecAppObj readSecAppByIdIdx( long ClusterId,
		int SecAppId )
	{
		return( readSecAppByIdIdx( ClusterId,
			SecAppId,
			false ) );
	}

	public IYCFGenKbSecAppObj readSecAppByIdIdx( long ClusterId,
		int SecAppId, boolean forceRead )
	{
		YCFGenKbSecAppPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecApp().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecAppId( SecAppId );
		IYCFGenKbSecAppObj obj = readSecApp( pkey, forceRead );
		return( obj );
	}

	public List<IYCFGenKbSecAppObj> readSecAppByClusterIdx( long ClusterId )
	{
		return( readSecAppByClusterIdx( ClusterId,
			false ) );
	}

	public List<IYCFGenKbSecAppObj> readSecAppByClusterIdx( long ClusterId,
		boolean forceRead )
	{
		final String S_ProcName = "readSecAppByClusterIdx";
		YCFGenKbSecAppByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecApp().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		Map<YCFGenKbSecAppPKey, IYCFGenKbSecAppObj> dict;
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFGenKbSecAppByClusterIdxKey,
				Map< YCFGenKbSecAppPKey, IYCFGenKbSecAppObj > >();
		}
		if( ( ! forceRead ) && indexByClusterIdx.containsKey( key ) ) {
			dict = indexByClusterIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbSecAppPKey, IYCFGenKbSecAppObj>();
			IYCFGenKbSecAppObj obj;
			YCFGenKbSecAppBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecApp().readDerivedByClusterIdx( schema.getAuthorization(),
				ClusterId );
			YCFGenKbSecAppBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSecAppTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecApp().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSecAppObj realised = (IYCFGenKbSecAppObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClusterIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbSecAppObj arr[] = new IYCFGenKbSecAppObj[len];
		Iterator<IYCFGenKbSecAppObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbSecAppObj> arrayList = new ArrayList<IYCFGenKbSecAppObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSecAppObj> cmp = new Comparator<IYCFGenKbSecAppObj>() {
			public int compare( IYCFGenKbSecAppObj lhs, IYCFGenKbSecAppObj rhs ) {
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
					YCFGenKbSecAppPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecAppPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSecAppObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbSecAppObj readSecAppByUJEEMountIdx( long ClusterId,
		String JEEMountName )
	{
		return( readSecAppByUJEEMountIdx( ClusterId,
			JEEMountName,
			false ) );
	}

	public IYCFGenKbSecAppObj readSecAppByUJEEMountIdx( long ClusterId,
		String JEEMountName, boolean forceRead )
	{
		if( indexByUJEEMountIdx == null ) {
			indexByUJEEMountIdx = new HashMap< YCFGenKbSecAppByUJEEMountIdxKey,
				IYCFGenKbSecAppObj >();
		}
		YCFGenKbSecAppByUJEEMountIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecApp().newUJEEMountIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredJEEMountName( JEEMountName );
		IYCFGenKbSecAppObj obj = null;
		if( ( ! forceRead ) && indexByUJEEMountIdx.containsKey( key ) ) {
			obj = indexByUJEEMountIdx.get( key );
		}
		else {
			YCFGenKbSecAppBuff buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecApp().readDerivedByUJEEMountIdx( schema.getAuthorization(),
				ClusterId,
				JEEMountName );
			if( buff != null ) {
				obj = schema.getSecAppTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecApp().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFGenKbSecAppObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbSecAppObj readCachedSecAppByIdIdx( long ClusterId,
		int SecAppId )
	{
		IYCFGenKbSecAppObj obj = null;
		YCFGenKbSecAppPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecApp().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecAppId( SecAppId );
		obj = readCachedSecApp( pkey );
		return( obj );
	}

	public List<IYCFGenKbSecAppObj> readCachedSecAppByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "readCachedSecAppByClusterIdx";
		YCFGenKbSecAppByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecApp().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		ArrayList<IYCFGenKbSecAppObj> arrayList = new ArrayList<IYCFGenKbSecAppObj>();
		if( indexByClusterIdx != null ) {
			Map<YCFGenKbSecAppPKey, IYCFGenKbSecAppObj> dict;
			if( indexByClusterIdx.containsKey( key ) ) {
				dict = indexByClusterIdx.get( key );
				int len = dict.size();
				IYCFGenKbSecAppObj arr[] = new IYCFGenKbSecAppObj[len];
				Iterator<IYCFGenKbSecAppObj> valIter = dict.values().iterator();
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
			IYCFGenKbSecAppObj obj;
			Iterator<IYCFGenKbSecAppObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbSecAppObj> cmp = new Comparator<IYCFGenKbSecAppObj>() {
			public int compare( IYCFGenKbSecAppObj lhs, IYCFGenKbSecAppObj rhs ) {
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
					YCFGenKbSecAppPKey lhsPKey = lhs.getPKey();
					YCFGenKbSecAppPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFGenKbSecAppObj readCachedSecAppByUJEEMountIdx( long ClusterId,
		String JEEMountName )
	{
		IYCFGenKbSecAppObj obj = null;
		YCFGenKbSecAppByUJEEMountIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecApp().newUJEEMountIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredJEEMountName( JEEMountName );
		if( indexByUJEEMountIdx != null ) {
			if( indexByUJEEMountIdx.containsKey( key ) ) {
				obj = indexByUJEEMountIdx.get( key );
			}
			else {
				Iterator<IYCFGenKbSecAppObj> valIter = members.values().iterator();
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
			Iterator<IYCFGenKbSecAppObj> valIter = members.values().iterator();
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
		IYCFGenKbSecAppObj obj = readCachedSecAppByIdIdx( ClusterId,
				SecAppId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSecAppByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "deepDisposeSecAppByClusterIdx";
		IYCFGenKbSecAppObj obj;
		List<IYCFGenKbSecAppObj> arrayList = readCachedSecAppByClusterIdx( ClusterId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbSecAppObj> arrayIter = arrayList.iterator();
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
		IYCFGenKbSecAppObj obj = readCachedSecAppByUJEEMountIdx( ClusterId,
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
	public List<IYCFGenKbSecAppObj> pageSecAppByClusterIdx( long ClusterId,
		Long priorClusterId,
		Integer priorSecAppId )
	{
		final String S_ProcName = "pageSecAppByClusterIdx";
		YCFGenKbSecAppByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecApp().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		List<IYCFGenKbSecAppObj> retList = new LinkedList<IYCFGenKbSecAppObj>();
		IYCFGenKbSecAppObj obj;
		YCFGenKbSecAppBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSecApp().pageBuffByClusterIdx( schema.getAuthorization(),
				ClusterId,
			priorClusterId,
			priorSecAppId );
		YCFGenKbSecAppBuff buff;
		for( int idx = 0; idx < buffList.length; idx ++ ) {
			buff = buffList[ idx ];
				obj = schema.getSecAppTableObj().newInstance();
			obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecApp().newPKey() );
			obj.setBuff( buff );
			IYCFGenKbSecAppObj realised = (IYCFGenKbSecAppObj)obj.realise();
			retList.add( realised );
		}
		return( retList );
	}

	public IYCFGenKbSecAppObj updateSecApp( IYCFGenKbSecAppObj Obj ) {
		IYCFGenKbSecAppObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableSecApp().updateSecApp( schema.getAuthorization(),
			Obj.getSecAppBuff() );
		obj = (IYCFGenKbSecAppObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteSecApp( IYCFGenKbSecAppObj Obj ) {
		IYCFGenKbSecAppObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableSecApp().deleteSecApp( schema.getAuthorization(),
			obj.getSecAppBuff() );
		Obj.forget();
	}

	public void deleteSecAppByIdIdx( long ClusterId,
		int SecAppId )
	{
		YCFGenKbSecAppPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecApp().newPKey();
		pkey.setRequiredClusterId( ClusterId );
		pkey.setRequiredSecAppId( SecAppId );
		IYCFGenKbSecAppObj obj = readSecApp( pkey );
		if( obj != null ) {
			IYCFGenKbSecAppEditObj editObj = (IYCFGenKbSecAppEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbSecAppEditObj)obj.beginEdit();
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
		YCFGenKbSecAppByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecApp().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFGenKbSecAppByClusterIdxKey,
				Map< YCFGenKbSecAppPKey, IYCFGenKbSecAppObj > >();
		}
		if( indexByClusterIdx.containsKey( key ) ) {
			Map<YCFGenKbSecAppPKey, IYCFGenKbSecAppObj> dict = indexByClusterIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecApp().deleteSecAppByClusterIdx( schema.getAuthorization(),
				ClusterId );
			Iterator<IYCFGenKbSecAppObj> iter = dict.values().iterator();
			IYCFGenKbSecAppObj obj;
			List<IYCFGenKbSecAppObj> toForget = new LinkedList<IYCFGenKbSecAppObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecApp().deleteSecAppByClusterIdx( schema.getAuthorization(),
				ClusterId );
		}
		deepDisposeSecAppByClusterIdx( ClusterId );
	}

	public void deleteSecAppByUJEEMountIdx( long ClusterId,
		String JEEMountName )
	{
		if( indexByUJEEMountIdx == null ) {
			indexByUJEEMountIdx = new HashMap< YCFGenKbSecAppByUJEEMountIdxKey,
				IYCFGenKbSecAppObj >();
		}
		YCFGenKbSecAppByUJEEMountIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySecApp().newUJEEMountIdxKey();
		key.setRequiredClusterId( ClusterId );
		key.setRequiredJEEMountName( JEEMountName );
		IYCFGenKbSecAppObj obj = null;
		if( indexByUJEEMountIdx.containsKey( key ) ) {
			obj = indexByUJEEMountIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecApp().deleteSecAppByUJEEMountIdx( schema.getAuthorization(),
				ClusterId,
				JEEMountName );
			obj.forget();
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSecApp().deleteSecAppByUJEEMountIdx( schema.getAuthorization(),
				ClusterId,
				JEEMountName );
		}
		deepDisposeSecAppByUJEEMountIdx( ClusterId,
				JEEMountName );
	}
}
