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

public class YCFGenKbSysClusterTableObj
	implements IYCFGenKbSysClusterTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbSysClusterPKey, IYCFGenKbSysClusterObj> members;
	private Map<YCFGenKbSysClusterPKey, IYCFGenKbSysClusterObj> allSysCluster;
	private Map< YCFGenKbSysClusterByClusterIdxKey,
		Map<YCFGenKbSysClusterPKey, IYCFGenKbSysClusterObj > > indexByClusterIdx;
	public static String TABLE_NAME = "SysCluster";
	public static String TABLE_DBNAME = "sysclus";

	public YCFGenKbSysClusterTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbSysClusterPKey, IYCFGenKbSysClusterObj>();
		allSysCluster = null;
		indexByClusterIdx = null;
	}

	public YCFGenKbSysClusterTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbSysClusterPKey, IYCFGenKbSysClusterObj>();
		allSysCluster = null;
		indexByClusterIdx = null;
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
		allSysCluster = null;
		indexByClusterIdx = null;
		List<IYCFGenKbSysClusterObj> toForget = new LinkedList<IYCFGenKbSysClusterObj>();
		IYCFGenKbSysClusterObj cur = null;
		Iterator<IYCFGenKbSysClusterObj> iter = members.values().iterator();
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
	 *	YCFGenKbSysClusterObj.
	 */
	public IYCFGenKbSysClusterObj newInstance() {
		IYCFGenKbSysClusterObj inst = new YCFGenKbSysClusterObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbSysClusterObj.
	 */
	public IYCFGenKbSysClusterEditObj newEditInstance( IYCFGenKbSysClusterObj orig ) {
		IYCFGenKbSysClusterEditObj edit = new YCFGenKbSysClusterEditObj( orig );
		return( edit );
	}

	public IYCFGenKbSysClusterObj realiseSysCluster( IYCFGenKbSysClusterObj Obj ) {
		IYCFGenKbSysClusterObj obj = Obj;
		YCFGenKbSysClusterPKey pkey = obj.getPKey();
		IYCFGenKbSysClusterObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbSysClusterObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByClusterIdx != null ) {
				YCFGenKbSysClusterByClusterIdxKey keyClusterIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySysCluster().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFGenKbSysClusterPKey, IYCFGenKbSysClusterObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
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
				YCFGenKbSysClusterByClusterIdxKey keyClusterIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySysCluster().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFGenKbSysClusterPKey, IYCFGenKbSysClusterObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
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
				YCFGenKbSysClusterByClusterIdxKey keyClusterIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactorySysCluster().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<YCFGenKbSysClusterPKey, IYCFGenKbSysClusterObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFGenKbSysClusterObj createSysCluster( IYCFGenKbSysClusterObj Obj ) {
		IYCFGenKbSysClusterObj obj = Obj;
		YCFGenKbSysClusterBuff buff = obj.getSysClusterBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableSysCluster().createSysCluster(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbSysClusterObj readSysCluster( YCFGenKbSysClusterPKey pkey ) {
		return( readSysCluster( pkey, false ) );
	}

	public IYCFGenKbSysClusterObj readSysCluster( YCFGenKbSysClusterPKey pkey, boolean forceRead ) {
		IYCFGenKbSysClusterObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbSysClusterBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSysCluster().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredSingletonId() );
			if( readBuff != null ) {
				obj = schema.getSysClusterTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySysCluster().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbSysClusterObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbSysClusterObj readCachedSysCluster( YCFGenKbSysClusterPKey pkey ) {
		IYCFGenKbSysClusterObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSysCluster( IYCFGenKbSysClusterObj obj )
	{
		final String S_ProcName = "YCFGenKbSysClusterTableObj.reallyDeepDisposeSysCluster() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbSysClusterPKey pkey = obj.getPKey();
		IYCFGenKbSysClusterObj existing = readCachedSysCluster( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFGenKbSysClusterByClusterIdxKey keyClusterIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySysCluster().newClusterIdxKey();
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
	public void deepDisposeSysCluster( YCFGenKbSysClusterPKey pkey ) {
		IYCFGenKbSysClusterObj obj = readCachedSysCluster( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbSysClusterObj lockSysCluster( YCFGenKbSysClusterPKey pkey ) {
		IYCFGenKbSysClusterObj locked = null;
		YCFGenKbSysClusterBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSysCluster().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getSysClusterTableObj().newInstance();
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySysCluster().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbSysClusterObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockSysCluster", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbSysClusterObj> readAllSysCluster() {
		return( readAllSysCluster( false ) );
	}

	public List<IYCFGenKbSysClusterObj> readAllSysCluster( boolean forceRead ) {
		final String S_ProcName = "readAllSysCluster";
		if( ( allSysCluster == null ) || forceRead ) {
			Map<YCFGenKbSysClusterPKey, IYCFGenKbSysClusterObj> map = new HashMap<YCFGenKbSysClusterPKey,IYCFGenKbSysClusterObj>();
			allSysCluster = map;
			YCFGenKbSysClusterBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSysCluster().readAllDerived( schema.getAuthorization() );
			YCFGenKbSysClusterBuff buff;
			IYCFGenKbSysClusterObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySysCluster().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSysClusterObj realised = (IYCFGenKbSysClusterObj)obj.realise();
			}
		}
		int len = allSysCluster.size();
		IYCFGenKbSysClusterObj arr[] = new IYCFGenKbSysClusterObj[len];
		Iterator<IYCFGenKbSysClusterObj> valIter = allSysCluster.values().iterator();
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
		ArrayList<IYCFGenKbSysClusterObj> arrayList = new ArrayList<IYCFGenKbSysClusterObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSysClusterObj> cmp = new Comparator<IYCFGenKbSysClusterObj>() {
			public int compare( IYCFGenKbSysClusterObj lhs, IYCFGenKbSysClusterObj rhs ) {
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
					YCFGenKbSysClusterPKey lhsPKey = lhs.getPKey();
					YCFGenKbSysClusterPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSysClusterObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbSysClusterObj> readCachedAllSysCluster() {
		final String S_ProcName = "readCachedAllSysCluster";
		ArrayList<IYCFGenKbSysClusterObj> arrayList = new ArrayList<IYCFGenKbSysClusterObj>();
		if( allSysCluster != null ) {
			int len = allSysCluster.size();
			IYCFGenKbSysClusterObj arr[] = new IYCFGenKbSysClusterObj[len];
			Iterator<IYCFGenKbSysClusterObj> valIter = allSysCluster.values().iterator();
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
		Comparator<IYCFGenKbSysClusterObj> cmp = new Comparator<IYCFGenKbSysClusterObj>() {
			public int compare( IYCFGenKbSysClusterObj lhs, IYCFGenKbSysClusterObj rhs ) {
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
					YCFGenKbSysClusterPKey lhsPKey = lhs.getPKey();
					YCFGenKbSysClusterPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFGenKbSysClusterObj readSysClusterByIdIdx( int SingletonId )
	{
		return( readSysClusterByIdIdx( SingletonId,
			false ) );
	}

	public IYCFGenKbSysClusterObj readSysClusterByIdIdx( int SingletonId, boolean forceRead )
	{
		YCFGenKbSysClusterPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySysCluster().newPKey();
		pkey.setRequiredSingletonId( SingletonId );
		IYCFGenKbSysClusterObj obj = readSysCluster( pkey, forceRead );
		return( obj );
	}

	public List<IYCFGenKbSysClusterObj> readSysClusterByClusterIdx( long ClusterId )
	{
		return( readSysClusterByClusterIdx( ClusterId,
			false ) );
	}

	public List<IYCFGenKbSysClusterObj> readSysClusterByClusterIdx( long ClusterId,
		boolean forceRead )
	{
		final String S_ProcName = "readSysClusterByClusterIdx";
		YCFGenKbSysClusterByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySysCluster().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		Map<YCFGenKbSysClusterPKey, IYCFGenKbSysClusterObj> dict;
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFGenKbSysClusterByClusterIdxKey,
				Map< YCFGenKbSysClusterPKey, IYCFGenKbSysClusterObj > >();
		}
		if( ( ! forceRead ) && indexByClusterIdx.containsKey( key ) ) {
			dict = indexByClusterIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbSysClusterPKey, IYCFGenKbSysClusterObj>();
			IYCFGenKbSysClusterObj obj;
			YCFGenKbSysClusterBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableSysCluster().readDerivedByClusterIdx( schema.getAuthorization(),
				ClusterId );
			YCFGenKbSysClusterBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSysClusterTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySysCluster().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbSysClusterObj realised = (IYCFGenKbSysClusterObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClusterIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbSysClusterObj arr[] = new IYCFGenKbSysClusterObj[len];
		Iterator<IYCFGenKbSysClusterObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbSysClusterObj> arrayList = new ArrayList<IYCFGenKbSysClusterObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbSysClusterObj> cmp = new Comparator<IYCFGenKbSysClusterObj>() {
			public int compare( IYCFGenKbSysClusterObj lhs, IYCFGenKbSysClusterObj rhs ) {
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
					YCFGenKbSysClusterPKey lhsPKey = lhs.getPKey();
					YCFGenKbSysClusterPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbSysClusterObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbSysClusterObj readCachedSysClusterByIdIdx( int SingletonId )
	{
		IYCFGenKbSysClusterObj obj = null;
		YCFGenKbSysClusterPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySysCluster().newPKey();
		pkey.setRequiredSingletonId( SingletonId );
		obj = readCachedSysCluster( pkey );
		return( obj );
	}

	public List<IYCFGenKbSysClusterObj> readCachedSysClusterByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "readCachedSysClusterByClusterIdx";
		YCFGenKbSysClusterByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySysCluster().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		ArrayList<IYCFGenKbSysClusterObj> arrayList = new ArrayList<IYCFGenKbSysClusterObj>();
		if( indexByClusterIdx != null ) {
			Map<YCFGenKbSysClusterPKey, IYCFGenKbSysClusterObj> dict;
			if( indexByClusterIdx.containsKey( key ) ) {
				dict = indexByClusterIdx.get( key );
				int len = dict.size();
				IYCFGenKbSysClusterObj arr[] = new IYCFGenKbSysClusterObj[len];
				Iterator<IYCFGenKbSysClusterObj> valIter = dict.values().iterator();
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
			IYCFGenKbSysClusterObj obj;
			Iterator<IYCFGenKbSysClusterObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbSysClusterObj> cmp = new Comparator<IYCFGenKbSysClusterObj>() {
			public int compare( IYCFGenKbSysClusterObj lhs, IYCFGenKbSysClusterObj rhs ) {
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
					YCFGenKbSysClusterPKey lhsPKey = lhs.getPKey();
					YCFGenKbSysClusterPKey rhsPKey = rhs.getPKey();
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
		IYCFGenKbSysClusterObj obj = readCachedSysClusterByIdIdx( SingletonId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSysClusterByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "deepDisposeSysClusterByClusterIdx";
		IYCFGenKbSysClusterObj obj;
		List<IYCFGenKbSysClusterObj> arrayList = readCachedSysClusterByClusterIdx( ClusterId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbSysClusterObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFGenKbSysClusterObj updateSysCluster( IYCFGenKbSysClusterObj Obj ) {
		IYCFGenKbSysClusterObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableSysCluster().updateSysCluster( schema.getAuthorization(),
			Obj.getSysClusterBuff() );
		obj = (IYCFGenKbSysClusterObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteSysCluster( IYCFGenKbSysClusterObj Obj ) {
		IYCFGenKbSysClusterObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableSysCluster().deleteSysCluster( schema.getAuthorization(),
			obj.getSysClusterBuff() );
		Obj.forget();
	}

	public void deleteSysClusterByIdIdx( int SingletonId )
	{
		YCFGenKbSysClusterPKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySysCluster().newPKey();
		pkey.setRequiredSingletonId( SingletonId );
		IYCFGenKbSysClusterObj obj = readSysCluster( pkey );
		if( obj != null ) {
			IYCFGenKbSysClusterEditObj editObj = (IYCFGenKbSysClusterEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbSysClusterEditObj)obj.beginEdit();
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
		YCFGenKbSysClusterByClusterIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactorySysCluster().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< YCFGenKbSysClusterByClusterIdxKey,
				Map< YCFGenKbSysClusterPKey, IYCFGenKbSysClusterObj > >();
		}
		if( indexByClusterIdx.containsKey( key ) ) {
			Map<YCFGenKbSysClusterPKey, IYCFGenKbSysClusterObj> dict = indexByClusterIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSysCluster().deleteSysClusterByClusterIdx( schema.getAuthorization(),
				ClusterId );
			Iterator<IYCFGenKbSysClusterObj> iter = dict.values().iterator();
			IYCFGenKbSysClusterObj obj;
			List<IYCFGenKbSysClusterObj> toForget = new LinkedList<IYCFGenKbSysClusterObj>();
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
			((IYCFGenKbSchema)schema.getBackingStore()).getTableSysCluster().deleteSysClusterByClusterIdx( schema.getAuthorization(),
				ClusterId );
		}
		deepDisposeSysClusterByClusterIdx( ClusterId );
	}
}
