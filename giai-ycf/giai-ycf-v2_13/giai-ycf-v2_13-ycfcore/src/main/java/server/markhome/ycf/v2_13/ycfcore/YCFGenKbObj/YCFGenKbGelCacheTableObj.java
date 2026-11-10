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

public class YCFGenKbGelCacheTableObj
	implements IYCFGenKbGelCacheTableObj
{
	protected IYCFGenKbSchemaObj schema;
	private Map<YCFGenKbGelCachePKey, IYCFGenKbGelCacheObj> members;
	private Map<YCFGenKbGelCachePKey, IYCFGenKbGelCacheObj> allGelCache;
	private Map< YCFGenKbGelCacheByTenantIdxKey,
		Map<YCFGenKbGelCachePKey, IYCFGenKbGelCacheObj > > indexByTenantIdx;
	private Map< YCFGenKbGelCacheByAltIdxKey,
		IYCFGenKbGelCacheObj > indexByAltIdx;
	public static String TABLE_NAME = "GelCache";
	public static String TABLE_DBNAME = "gelcache";

	public YCFGenKbGelCacheTableObj() {
		schema = null;
		members = new HashMap<YCFGenKbGelCachePKey, IYCFGenKbGelCacheObj>();
		allGelCache = null;
		indexByTenantIdx = null;
		indexByAltIdx = null;
	}

	public YCFGenKbGelCacheTableObj( IYCFGenKbSchemaObj argSchema ) {
		schema = (IYCFGenKbSchemaObj)argSchema;
		members = new HashMap<YCFGenKbGelCachePKey, IYCFGenKbGelCacheObj>();
		allGelCache = null;
		indexByTenantIdx = null;
		indexByAltIdx = null;
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
		allGelCache = null;
		indexByTenantIdx = null;
		indexByAltIdx = null;
		List<IYCFGenKbGelCacheObj> toForget = new LinkedList<IYCFGenKbGelCacheObj>();
		IYCFGenKbGelCacheObj cur = null;
		Iterator<IYCFGenKbGelCacheObj> iter = members.values().iterator();
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
	 *	YCFGenKbGelCacheObj.
	 */
	public IYCFGenKbGelCacheObj newInstance() {
		IYCFGenKbGelCacheObj inst = new YCFGenKbGelCacheObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFGenKbGelCacheObj.
	 */
	public IYCFGenKbGelCacheEditObj newEditInstance( IYCFGenKbGelCacheObj orig ) {
		IYCFGenKbGelCacheEditObj edit = new YCFGenKbGelCacheEditObj( orig );
		return( edit );
	}

	public IYCFGenKbGelCacheObj realiseGelCache( IYCFGenKbGelCacheObj Obj ) {
		IYCFGenKbGelCacheObj obj = Obj;
		YCFGenKbGelCachePKey pkey = obj.getPKey();
		IYCFGenKbGelCacheObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFGenKbGelCacheObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				YCFGenKbGelCacheByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGelCachePKey, IYCFGenKbGelCacheObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.remove( keepObj.getPKey() );
					if( mapTenantIdx.size() <= 0 ) {
						indexByTenantIdx.remove( keyTenantIdx );
					}
				}
			}

			if( indexByAltIdx != null ) {
				YCFGenKbGelCacheByAltIdxKey keyAltIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newAltIdxKey();
				keyAltIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyAltIdx.setRequiredCacheName( keepObj.getRequiredCacheName() );
				indexByAltIdx.remove( keyAltIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFGenKbGelCacheByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGelCachePKey, IYCFGenKbGelCacheObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByAltIdx != null ) {
				YCFGenKbGelCacheByAltIdxKey keyAltIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newAltIdxKey();
				keyAltIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyAltIdx.setRequiredCacheName( keepObj.getRequiredCacheName() );
				indexByAltIdx.put( keyAltIdx, keepObj );
			}

			if( allGelCache != null ) {
				allGelCache.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allGelCache != null ) {
				allGelCache.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFGenKbGelCacheByTenantIdxKey keyTenantIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFGenKbGelCachePKey, IYCFGenKbGelCacheObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByAltIdx != null ) {
				YCFGenKbGelCacheByAltIdxKey keyAltIdx =
					((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newAltIdxKey();
				keyAltIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyAltIdx.setRequiredCacheName( keepObj.getRequiredCacheName() );
				indexByAltIdx.put( keyAltIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFGenKbGelCacheObj createGelCache( IYCFGenKbGelCacheObj Obj ) {
		IYCFGenKbGelCacheObj obj = Obj;
		YCFGenKbGelCacheBuff buff = obj.getGelCacheBuff();
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCache().createGelCache(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFGenKbGelCacheObj readGelCache( YCFGenKbGelCachePKey pkey ) {
		return( readGelCache( pkey, false ) );
	}

	public IYCFGenKbGelCacheObj readGelCache( YCFGenKbGelCachePKey pkey, boolean forceRead ) {
		IYCFGenKbGelCacheObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFGenKbGelCacheBuff readBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCache().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredGelCacheId() );
			if( readBuff != null ) {
				obj = schema.getGelCacheTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFGenKbGelCacheObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbGelCacheObj readCachedGelCache( YCFGenKbGelCachePKey pkey ) {
		IYCFGenKbGelCacheObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeGelCache( IYCFGenKbGelCacheObj obj )
	{
		final String S_ProcName = "YCFGenKbGelCacheTableObj.reallyDeepDisposeGelCache() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFGenKbGelCachePKey pkey = obj.getPKey();
		IYCFGenKbGelCacheObj existing = readCachedGelCache( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFGenKbGelCacheByTenantIdxKey keyTenantIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFGenKbGelCacheByAltIdxKey keyAltIdx = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newAltIdxKey();
		keyAltIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyAltIdx.setRequiredCacheName( existing.getRequiredCacheName() );



		if( indexByTenantIdx != null ) {
			if( indexByTenantIdx.containsKey( keyTenantIdx ) ) {
				indexByTenantIdx.get( keyTenantIdx ).remove( pkey );
				if( indexByTenantIdx.get( keyTenantIdx ).size() <= 0 ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}
		}

		if( indexByAltIdx != null ) {
			indexByAltIdx.remove( keyAltIdx );
		}


	}
	public void deepDisposeGelCache( YCFGenKbGelCachePKey pkey ) {
		IYCFGenKbGelCacheObj obj = readCachedGelCache( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbGelCacheObj lockGelCache( YCFGenKbGelCachePKey pkey ) {
		IYCFGenKbGelCacheObj locked = null;
		YCFGenKbGelCacheBuff lockBuff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCache().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getGelCacheTableObj().newInstance();
			locked.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFGenKbGelCacheObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockGelCache", pkey );
		}
		return( locked );
	}

	public List<IYCFGenKbGelCacheObj> readAllGelCache() {
		return( readAllGelCache( false ) );
	}

	public List<IYCFGenKbGelCacheObj> readAllGelCache( boolean forceRead ) {
		final String S_ProcName = "readAllGelCache";
		if( ( allGelCache == null ) || forceRead ) {
			Map<YCFGenKbGelCachePKey, IYCFGenKbGelCacheObj> map = new HashMap<YCFGenKbGelCachePKey,IYCFGenKbGelCacheObj>();
			allGelCache = map;
			YCFGenKbGelCacheBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCache().readAllDerived( schema.getAuthorization() );
			YCFGenKbGelCacheBuff buff;
			IYCFGenKbGelCacheObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelCacheObj realised = (IYCFGenKbGelCacheObj)obj.realise();
			}
		}
		int len = allGelCache.size();
		IYCFGenKbGelCacheObj arr[] = new IYCFGenKbGelCacheObj[len];
		Iterator<IYCFGenKbGelCacheObj> valIter = allGelCache.values().iterator();
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
		ArrayList<IYCFGenKbGelCacheObj> arrayList = new ArrayList<IYCFGenKbGelCacheObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelCacheObj> cmp = new Comparator<IYCFGenKbGelCacheObj>() {
			public int compare( IYCFGenKbGelCacheObj lhs, IYCFGenKbGelCacheObj rhs ) {
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
					YCFGenKbGelCachePKey lhsPKey = lhs.getPKey();
					YCFGenKbGelCachePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbGelCacheObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFGenKbGelCacheObj> readCachedAllGelCache() {
		final String S_ProcName = "readCachedAllGelCache";
		ArrayList<IYCFGenKbGelCacheObj> arrayList = new ArrayList<IYCFGenKbGelCacheObj>();
		if( allGelCache != null ) {
			int len = allGelCache.size();
			IYCFGenKbGelCacheObj arr[] = new IYCFGenKbGelCacheObj[len];
			Iterator<IYCFGenKbGelCacheObj> valIter = allGelCache.values().iterator();
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
		Comparator<IYCFGenKbGelCacheObj> cmp = new Comparator<IYCFGenKbGelCacheObj>() {
			public int compare( IYCFGenKbGelCacheObj lhs, IYCFGenKbGelCacheObj rhs ) {
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
					YCFGenKbGelCachePKey lhsPKey = lhs.getPKey();
					YCFGenKbGelCachePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFGenKbGelCacheObj readGelCacheByIdIdx( long TenantId,
		long GelCacheId )
	{
		return( readGelCacheByIdIdx( TenantId,
			GelCacheId,
			false ) );
	}

	public IYCFGenKbGelCacheObj readGelCacheByIdIdx( long TenantId,
		long GelCacheId, boolean forceRead )
	{
		YCFGenKbGelCachePKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		IYCFGenKbGelCacheObj obj = readGelCache( pkey, forceRead );
		return( obj );
	}

	public List<IYCFGenKbGelCacheObj> readGelCacheByTenantIdx( long TenantId )
	{
		return( readGelCacheByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFGenKbGelCacheObj> readGelCacheByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readGelCacheByTenantIdx";
		YCFGenKbGelCacheByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFGenKbGelCachePKey, IYCFGenKbGelCacheObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbGelCacheByTenantIdxKey,
				Map< YCFGenKbGelCachePKey, IYCFGenKbGelCacheObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFGenKbGelCachePKey, IYCFGenKbGelCacheObj>();
			IYCFGenKbGelCacheObj obj;
			YCFGenKbGelCacheBuff[] buffList = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCache().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFGenKbGelCacheBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getGelCacheTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newPKey() );
				obj.setBuff( buff );
				IYCFGenKbGelCacheObj realised = (IYCFGenKbGelCacheObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFGenKbGelCacheObj arr[] = new IYCFGenKbGelCacheObj[len];
		Iterator<IYCFGenKbGelCacheObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFGenKbGelCacheObj> arrayList = new ArrayList<IYCFGenKbGelCacheObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFGenKbGelCacheObj> cmp = new Comparator<IYCFGenKbGelCacheObj>() {
			public int compare( IYCFGenKbGelCacheObj lhs, IYCFGenKbGelCacheObj rhs ) {
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
					YCFGenKbGelCachePKey lhsPKey = lhs.getPKey();
					YCFGenKbGelCachePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFGenKbGelCacheObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFGenKbGelCacheObj readGelCacheByAltIdx( long TenantId,
		String CacheName )
	{
		return( readGelCacheByAltIdx( TenantId,
			CacheName,
			false ) );
	}

	public IYCFGenKbGelCacheObj readGelCacheByAltIdx( long TenantId,
		String CacheName, boolean forceRead )
	{
		if( indexByAltIdx == null ) {
			indexByAltIdx = new HashMap< YCFGenKbGelCacheByAltIdxKey,
				IYCFGenKbGelCacheObj >();
		}
		YCFGenKbGelCacheByAltIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newAltIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCacheName( CacheName );
		IYCFGenKbGelCacheObj obj = null;
		if( ( ! forceRead ) && indexByAltIdx.containsKey( key ) ) {
			obj = indexByAltIdx.get( key );
		}
		else {
			YCFGenKbGelCacheBuff buff = ((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCache().readDerivedByAltIdx( schema.getAuthorization(),
				TenantId,
				CacheName );
			if( buff != null ) {
				obj = schema.getGelCacheTableObj().newInstance();
				obj.setPKey( ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFGenKbGelCacheObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFGenKbGelCacheObj readCachedGelCacheByIdIdx( long TenantId,
		long GelCacheId )
	{
		IYCFGenKbGelCacheObj obj = null;
		YCFGenKbGelCachePKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		obj = readCachedGelCache( pkey );
		return( obj );
	}

	public List<IYCFGenKbGelCacheObj> readCachedGelCacheByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedGelCacheByTenantIdx";
		YCFGenKbGelCacheByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFGenKbGelCacheObj> arrayList = new ArrayList<IYCFGenKbGelCacheObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFGenKbGelCachePKey, IYCFGenKbGelCacheObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFGenKbGelCacheObj arr[] = new IYCFGenKbGelCacheObj[len];
				Iterator<IYCFGenKbGelCacheObj> valIter = dict.values().iterator();
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
			IYCFGenKbGelCacheObj obj;
			Iterator<IYCFGenKbGelCacheObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFGenKbGelCacheObj> cmp = new Comparator<IYCFGenKbGelCacheObj>() {
			public int compare( IYCFGenKbGelCacheObj lhs, IYCFGenKbGelCacheObj rhs ) {
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
					YCFGenKbGelCachePKey lhsPKey = lhs.getPKey();
					YCFGenKbGelCachePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFGenKbGelCacheObj readCachedGelCacheByAltIdx( long TenantId,
		String CacheName )
	{
		IYCFGenKbGelCacheObj obj = null;
		YCFGenKbGelCacheByAltIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newAltIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCacheName( CacheName );
		if( indexByAltIdx != null ) {
			if( indexByAltIdx.containsKey( key ) ) {
				obj = indexByAltIdx.get( key );
			}
			else {
				Iterator<IYCFGenKbGelCacheObj> valIter = members.values().iterator();
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
			Iterator<IYCFGenKbGelCacheObj> valIter = members.values().iterator();
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

	public void deepDisposeGelCacheByIdIdx( long TenantId,
		long GelCacheId )
	{
		IYCFGenKbGelCacheObj obj = readCachedGelCacheByIdIdx( TenantId,
				GelCacheId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeGelCacheByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeGelCacheByTenantIdx";
		IYCFGenKbGelCacheObj obj;
		List<IYCFGenKbGelCacheObj> arrayList = readCachedGelCacheByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFGenKbGelCacheObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeGelCacheByAltIdx( long TenantId,
		String CacheName )
	{
		IYCFGenKbGelCacheObj obj = readCachedGelCacheByAltIdx( TenantId,
				CacheName );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFGenKbGelCacheObj updateGelCache( IYCFGenKbGelCacheObj Obj ) {
		IYCFGenKbGelCacheObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCache().updateGelCache( schema.getAuthorization(),
			Obj.getGelCacheBuff() );
		obj = (IYCFGenKbGelCacheObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteGelCache( IYCFGenKbGelCacheObj Obj ) {
		IYCFGenKbGelCacheObj obj = Obj;
		((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCache().deleteGelCache( schema.getAuthorization(),
			obj.getGelCacheBuff() );
		Obj.forget();
	}

	public void deleteGelCacheByIdIdx( long TenantId,
		long GelCacheId )
	{
		YCFGenKbGelCachePKey pkey = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredGelCacheId( GelCacheId );
		IYCFGenKbGelCacheObj obj = readGelCache( pkey );
		if( obj != null ) {
			IYCFGenKbGelCacheEditObj editObj = (IYCFGenKbGelCacheEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFGenKbGelCacheEditObj)obj.beginEdit();
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
		deepDisposeGelCacheByIdIdx( TenantId,
				GelCacheId );
	}

	public void deleteGelCacheByTenantIdx( long TenantId )
	{
		YCFGenKbGelCacheByTenantIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFGenKbGelCacheByTenantIdxKey,
				Map< YCFGenKbGelCachePKey, IYCFGenKbGelCacheObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFGenKbGelCachePKey, IYCFGenKbGelCacheObj> dict = indexByTenantIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCache().deleteGelCacheByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFGenKbGelCacheObj> iter = dict.values().iterator();
			IYCFGenKbGelCacheObj obj;
			List<IYCFGenKbGelCacheObj> toForget = new LinkedList<IYCFGenKbGelCacheObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTenantIdx.remove( key );
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCache().deleteGelCacheByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeGelCacheByTenantIdx( TenantId );
	}

	public void deleteGelCacheByAltIdx( long TenantId,
		String CacheName )
	{
		if( indexByAltIdx == null ) {
			indexByAltIdx = new HashMap< YCFGenKbGelCacheByAltIdxKey,
				IYCFGenKbGelCacheObj >();
		}
		YCFGenKbGelCacheByAltIdxKey key = ((IYCFGenKbSchema)schema.getBackingStore()).getFactoryGelCache().newAltIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredCacheName( CacheName );
		IYCFGenKbGelCacheObj obj = null;
		if( indexByAltIdx.containsKey( key ) ) {
			obj = indexByAltIdx.get( key );
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCache().deleteGelCacheByAltIdx( schema.getAuthorization(),
				TenantId,
				CacheName );
			obj.forget();
		}
		else {
			((IYCFGenKbSchema)schema.getBackingStore()).getTableGelCache().deleteGelCacheByAltIdx( schema.getAuthorization(),
				TenantId,
				CacheName );
		}
		deepDisposeGelCacheByAltIdx( TenantId,
				CacheName );
	}
}
