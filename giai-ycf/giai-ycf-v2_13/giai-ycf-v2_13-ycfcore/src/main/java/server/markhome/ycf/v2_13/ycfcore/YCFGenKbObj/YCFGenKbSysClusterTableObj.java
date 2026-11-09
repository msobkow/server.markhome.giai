// Description: Java 11 Table Object implementation for CFGenKb.

/*
 *	org.msscf.msscf.CFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory CFCore 2.13 Generation Knowledgebase
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

package org.msscf.msscf.v2_13.cfcore.CFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfcore.CFGenKb.*;

public class CFGenKbSysClusterTableObj
	implements ICFGenKbSysClusterTableObj
{
	protected ICFGenKbSchemaObj schema;
	private Map<CFGenKbSysClusterPKey, ICFGenKbSysClusterObj> members;
	private Map<CFGenKbSysClusterPKey, ICFGenKbSysClusterObj> allSysCluster;
	private Map< CFGenKbSysClusterByClusterIdxKey,
		Map<CFGenKbSysClusterPKey, ICFGenKbSysClusterObj > > indexByClusterIdx;
	public static String TABLE_NAME = "SysCluster";
	public static String TABLE_DBNAME = "sysclus";

	public CFGenKbSysClusterTableObj() {
		schema = null;
		members = new HashMap<CFGenKbSysClusterPKey, ICFGenKbSysClusterObj>();
		allSysCluster = null;
		indexByClusterIdx = null;
	}

	public CFGenKbSysClusterTableObj( ICFGenKbSchemaObj argSchema ) {
		schema = (ICFGenKbSchemaObj)argSchema;
		members = new HashMap<CFGenKbSysClusterPKey, ICFGenKbSysClusterObj>();
		allSysCluster = null;
		indexByClusterIdx = null;
	}

	public ICFGenKbSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( ICFGenKbSchemaObj value ) {
		schema = (ICFGenKbSchemaObj)value;
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
		List<ICFGenKbSysClusterObj> toForget = new LinkedList<ICFGenKbSysClusterObj>();
		ICFGenKbSysClusterObj cur = null;
		Iterator<ICFGenKbSysClusterObj> iter = members.values().iterator();
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
	 *	CFGenKbSysClusterObj.
	 */
	public ICFGenKbSysClusterObj newInstance() {
		ICFGenKbSysClusterObj inst = new CFGenKbSysClusterObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFGenKbSysClusterObj.
	 */
	public ICFGenKbSysClusterEditObj newEditInstance( ICFGenKbSysClusterObj orig ) {
		ICFGenKbSysClusterEditObj edit = new CFGenKbSysClusterEditObj( orig );
		return( edit );
	}

	public ICFGenKbSysClusterObj realiseSysCluster( ICFGenKbSysClusterObj Obj ) {
		ICFGenKbSysClusterObj obj = Obj;
		CFGenKbSysClusterPKey pkey = obj.getPKey();
		ICFGenKbSysClusterObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFGenKbSysClusterObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByClusterIdx != null ) {
				CFGenKbSysClusterByClusterIdxKey keyClusterIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySysCluster().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<CFGenKbSysClusterPKey, ICFGenKbSysClusterObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
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
				CFGenKbSysClusterByClusterIdxKey keyClusterIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySysCluster().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<CFGenKbSysClusterPKey, ICFGenKbSysClusterObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
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
				CFGenKbSysClusterByClusterIdxKey keyClusterIdx =
					((ICFGenKbSchema)schema.getBackingStore()).getFactorySysCluster().newClusterIdxKey();
				keyClusterIdx.setRequiredClusterId( keepObj.getRequiredClusterId() );
				Map<CFGenKbSysClusterPKey, ICFGenKbSysClusterObj > mapClusterIdx = indexByClusterIdx.get( keyClusterIdx );
				if( mapClusterIdx != null ) {
					mapClusterIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public ICFGenKbSysClusterObj createSysCluster( ICFGenKbSysClusterObj Obj ) {
		ICFGenKbSysClusterObj obj = Obj;
		CFGenKbSysClusterBuff buff = obj.getSysClusterBuff();
		((ICFGenKbSchema)schema.getBackingStore()).getTableSysCluster().createSysCluster(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public ICFGenKbSysClusterObj readSysCluster( CFGenKbSysClusterPKey pkey ) {
		return( readSysCluster( pkey, false ) );
	}

	public ICFGenKbSysClusterObj readSysCluster( CFGenKbSysClusterPKey pkey, boolean forceRead ) {
		ICFGenKbSysClusterObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFGenKbSysClusterBuff readBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableSysCluster().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredSingletonId() );
			if( readBuff != null ) {
				obj = schema.getSysClusterTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySysCluster().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFGenKbSysClusterObj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFGenKbSysClusterObj readCachedSysCluster( CFGenKbSysClusterPKey pkey ) {
		ICFGenKbSysClusterObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeSysCluster( ICFGenKbSysClusterObj obj )
	{
		final String S_ProcName = "CFGenKbSysClusterTableObj.reallyDeepDisposeSysCluster() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFGenKbSysClusterPKey pkey = obj.getPKey();
		ICFGenKbSysClusterObj existing = readCachedSysCluster( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFGenKbSysClusterByClusterIdxKey keyClusterIdx = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySysCluster().newClusterIdxKey();
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
	public void deepDisposeSysCluster( CFGenKbSysClusterPKey pkey ) {
		ICFGenKbSysClusterObj obj = readCachedSysCluster( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFGenKbSysClusterObj lockSysCluster( CFGenKbSysClusterPKey pkey ) {
		ICFGenKbSysClusterObj locked = null;
		CFGenKbSysClusterBuff lockBuff = ((ICFGenKbSchema)schema.getBackingStore()).getTableSysCluster().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getSysClusterTableObj().newInstance();
			locked.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySysCluster().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFGenKbSysClusterObj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockSysCluster", pkey );
		}
		return( locked );
	}

	public List<ICFGenKbSysClusterObj> readAllSysCluster() {
		return( readAllSysCluster( false ) );
	}

	public List<ICFGenKbSysClusterObj> readAllSysCluster( boolean forceRead ) {
		final String S_ProcName = "readAllSysCluster";
		if( ( allSysCluster == null ) || forceRead ) {
			Map<CFGenKbSysClusterPKey, ICFGenKbSysClusterObj> map = new HashMap<CFGenKbSysClusterPKey,ICFGenKbSysClusterObj>();
			allSysCluster = map;
			CFGenKbSysClusterBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSysCluster().readAllDerived( schema.getAuthorization() );
			CFGenKbSysClusterBuff buff;
			ICFGenKbSysClusterObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySysCluster().newPKey() );
				obj.setBuff( buff );
				ICFGenKbSysClusterObj realised = (ICFGenKbSysClusterObj)obj.realise();
			}
		}
		int len = allSysCluster.size();
		ICFGenKbSysClusterObj arr[] = new ICFGenKbSysClusterObj[len];
		Iterator<ICFGenKbSysClusterObj> valIter = allSysCluster.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFGenKbSysClusterObj> arrayList = new ArrayList<ICFGenKbSysClusterObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbSysClusterObj> cmp = new Comparator<ICFGenKbSysClusterObj>() {
			public int compare( ICFGenKbSysClusterObj lhs, ICFGenKbSysClusterObj rhs ) {
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
					CFGenKbSysClusterPKey lhsPKey = lhs.getPKey();
					CFGenKbSysClusterPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbSysClusterObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFGenKbSysClusterObj> readCachedAllSysCluster() {
		final String S_ProcName = "readCachedAllSysCluster";
		ArrayList<ICFGenKbSysClusterObj> arrayList = new ArrayList<ICFGenKbSysClusterObj>();
		if( allSysCluster != null ) {
			int len = allSysCluster.size();
			ICFGenKbSysClusterObj arr[] = new ICFGenKbSysClusterObj[len];
			Iterator<ICFGenKbSysClusterObj> valIter = allSysCluster.values().iterator();
			int idx = 0;
			while( ( idx < len ) && valIter.hasNext() ) {
				arr[idx++] = valIter.next();
			}
			if( idx < len ) {
				throw new CFLibArgumentUnderflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
			}
			else if( valIter.hasNext() ) {
				throw new CFLibArgumentOverflowException( getClass(),
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
		Comparator<ICFGenKbSysClusterObj> cmp = new Comparator<ICFGenKbSysClusterObj>() {
			public int compare( ICFGenKbSysClusterObj lhs, ICFGenKbSysClusterObj rhs ) {
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
					CFGenKbSysClusterPKey lhsPKey = lhs.getPKey();
					CFGenKbSysClusterPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFGenKbSysClusterObj readSysClusterByIdIdx( int SingletonId )
	{
		return( readSysClusterByIdIdx( SingletonId,
			false ) );
	}

	public ICFGenKbSysClusterObj readSysClusterByIdIdx( int SingletonId, boolean forceRead )
	{
		CFGenKbSysClusterPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySysCluster().newPKey();
		pkey.setRequiredSingletonId( SingletonId );
		ICFGenKbSysClusterObj obj = readSysCluster( pkey, forceRead );
		return( obj );
	}

	public List<ICFGenKbSysClusterObj> readSysClusterByClusterIdx( long ClusterId )
	{
		return( readSysClusterByClusterIdx( ClusterId,
			false ) );
	}

	public List<ICFGenKbSysClusterObj> readSysClusterByClusterIdx( long ClusterId,
		boolean forceRead )
	{
		final String S_ProcName = "readSysClusterByClusterIdx";
		CFGenKbSysClusterByClusterIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySysCluster().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		Map<CFGenKbSysClusterPKey, ICFGenKbSysClusterObj> dict;
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< CFGenKbSysClusterByClusterIdxKey,
				Map< CFGenKbSysClusterPKey, ICFGenKbSysClusterObj > >();
		}
		if( ( ! forceRead ) && indexByClusterIdx.containsKey( key ) ) {
			dict = indexByClusterIdx.get( key );
		}
		else {
			dict = new HashMap<CFGenKbSysClusterPKey, ICFGenKbSysClusterObj>();
			ICFGenKbSysClusterObj obj;
			CFGenKbSysClusterBuff[] buffList = ((ICFGenKbSchema)schema.getBackingStore()).getTableSysCluster().readDerivedByClusterIdx( schema.getAuthorization(),
				ClusterId );
			CFGenKbSysClusterBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getSysClusterTableObj().newInstance();
				obj.setPKey( ((ICFGenKbSchema)schema.getBackingStore()).getFactorySysCluster().newPKey() );
				obj.setBuff( buff );
				ICFGenKbSysClusterObj realised = (ICFGenKbSysClusterObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByClusterIdx.put( key, dict );
		}
		int len = dict.size();
		ICFGenKbSysClusterObj arr[] = new ICFGenKbSysClusterObj[len];
		Iterator<ICFGenKbSysClusterObj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFGenKbSysClusterObj> arrayList = new ArrayList<ICFGenKbSysClusterObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFGenKbSysClusterObj> cmp = new Comparator<ICFGenKbSysClusterObj>() {
			public int compare( ICFGenKbSysClusterObj lhs, ICFGenKbSysClusterObj rhs ) {
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
					CFGenKbSysClusterPKey lhsPKey = lhs.getPKey();
					CFGenKbSysClusterPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFGenKbSysClusterObj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFGenKbSysClusterObj readCachedSysClusterByIdIdx( int SingletonId )
	{
		ICFGenKbSysClusterObj obj = null;
		CFGenKbSysClusterPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySysCluster().newPKey();
		pkey.setRequiredSingletonId( SingletonId );
		obj = readCachedSysCluster( pkey );
		return( obj );
	}

	public List<ICFGenKbSysClusterObj> readCachedSysClusterByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "readCachedSysClusterByClusterIdx";
		CFGenKbSysClusterByClusterIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySysCluster().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		ArrayList<ICFGenKbSysClusterObj> arrayList = new ArrayList<ICFGenKbSysClusterObj>();
		if( indexByClusterIdx != null ) {
			Map<CFGenKbSysClusterPKey, ICFGenKbSysClusterObj> dict;
			if( indexByClusterIdx.containsKey( key ) ) {
				dict = indexByClusterIdx.get( key );
				int len = dict.size();
				ICFGenKbSysClusterObj arr[] = new ICFGenKbSysClusterObj[len];
				Iterator<ICFGenKbSysClusterObj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
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
			ICFGenKbSysClusterObj obj;
			Iterator<ICFGenKbSysClusterObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFGenKbSysClusterObj> cmp = new Comparator<ICFGenKbSysClusterObj>() {
			public int compare( ICFGenKbSysClusterObj lhs, ICFGenKbSysClusterObj rhs ) {
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
					CFGenKbSysClusterPKey lhsPKey = lhs.getPKey();
					CFGenKbSysClusterPKey rhsPKey = rhs.getPKey();
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
		ICFGenKbSysClusterObj obj = readCachedSysClusterByIdIdx( SingletonId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeSysClusterByClusterIdx( long ClusterId )
	{
		final String S_ProcName = "deepDisposeSysClusterByClusterIdx";
		ICFGenKbSysClusterObj obj;
		List<ICFGenKbSysClusterObj> arrayList = readCachedSysClusterByClusterIdx( ClusterId );
		if( arrayList != null )  {
			Iterator<ICFGenKbSysClusterObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public ICFGenKbSysClusterObj updateSysCluster( ICFGenKbSysClusterObj Obj ) {
		ICFGenKbSysClusterObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableSysCluster().updateSysCluster( schema.getAuthorization(),
			Obj.getSysClusterBuff() );
		obj = (ICFGenKbSysClusterObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteSysCluster( ICFGenKbSysClusterObj Obj ) {
		ICFGenKbSysClusterObj obj = Obj;
		((ICFGenKbSchema)schema.getBackingStore()).getTableSysCluster().deleteSysCluster( schema.getAuthorization(),
			obj.getSysClusterBuff() );
		Obj.forget();
	}

	public void deleteSysClusterByIdIdx( int SingletonId )
	{
		CFGenKbSysClusterPKey pkey = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySysCluster().newPKey();
		pkey.setRequiredSingletonId( SingletonId );
		ICFGenKbSysClusterObj obj = readSysCluster( pkey );
		if( obj != null ) {
			ICFGenKbSysClusterEditObj editObj = (ICFGenKbSysClusterEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFGenKbSysClusterEditObj)obj.beginEdit();
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
		CFGenKbSysClusterByClusterIdxKey key = ((ICFGenKbSchema)schema.getBackingStore()).getFactorySysCluster().newClusterIdxKey();
		key.setRequiredClusterId( ClusterId );
		if( indexByClusterIdx == null ) {
			indexByClusterIdx = new HashMap< CFGenKbSysClusterByClusterIdxKey,
				Map< CFGenKbSysClusterPKey, ICFGenKbSysClusterObj > >();
		}
		if( indexByClusterIdx.containsKey( key ) ) {
			Map<CFGenKbSysClusterPKey, ICFGenKbSysClusterObj> dict = indexByClusterIdx.get( key );
			((ICFGenKbSchema)schema.getBackingStore()).getTableSysCluster().deleteSysClusterByClusterIdx( schema.getAuthorization(),
				ClusterId );
			Iterator<ICFGenKbSysClusterObj> iter = dict.values().iterator();
			ICFGenKbSysClusterObj obj;
			List<ICFGenKbSysClusterObj> toForget = new LinkedList<ICFGenKbSysClusterObj>();
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
			((ICFGenKbSchema)schema.getBackingStore()).getTableSysCluster().deleteSysClusterByClusterIdx( schema.getAuthorization(),
				ClusterId );
		}
		deepDisposeSysClusterByClusterIdx( ClusterId );
	}
}