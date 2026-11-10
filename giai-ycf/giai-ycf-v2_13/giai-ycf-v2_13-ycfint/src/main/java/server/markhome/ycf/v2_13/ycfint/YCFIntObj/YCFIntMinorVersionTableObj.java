// Description: Java 11 Table Object implementation for YCFInt.

/*
 *	org.mssycf.mssycf.YCFInt
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFInt 2.13 Internet Essentials
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFInt.
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

public class YCFIntMinorVersionTableObj
	implements IYCFIntMinorVersionTableObj
{
	protected IYCFIntSchemaObj schema;
	private Map<YCFIntMinorVersionPKey, IYCFIntMinorVersionObj> members;
	private Map<YCFIntMinorVersionPKey, IYCFIntMinorVersionObj> allMinorVersion;
	private Map< YCFIntMinorVersionByTenantIdxKey,
		Map<YCFIntMinorVersionPKey, IYCFIntMinorVersionObj > > indexByTenantIdx;
	private Map< YCFIntMinorVersionByMajorVerIdxKey,
		Map<YCFIntMinorVersionPKey, IYCFIntMinorVersionObj > > indexByMajorVerIdx;
	private Map< YCFIntMinorVersionByNameIdxKey,
		IYCFIntMinorVersionObj > indexByNameIdx;
	public static String TABLE_NAME = "MinorVersion";
	public static String TABLE_DBNAME = "mnvrdef";

	public YCFIntMinorVersionTableObj() {
		schema = null;
		members = new HashMap<YCFIntMinorVersionPKey, IYCFIntMinorVersionObj>();
		allMinorVersion = null;
		indexByTenantIdx = null;
		indexByMajorVerIdx = null;
		indexByNameIdx = null;
	}

	public YCFIntMinorVersionTableObj( IYCFIntSchemaObj argSchema ) {
		schema = (IYCFIntSchemaObj)argSchema;
		members = new HashMap<YCFIntMinorVersionPKey, IYCFIntMinorVersionObj>();
		allMinorVersion = null;
		indexByTenantIdx = null;
		indexByMajorVerIdx = null;
		indexByNameIdx = null;
	}

	public IYCFIntSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( IYCFIntSchemaObj value ) {
		schema = (IYCFIntSchemaObj)value;
	}

	public String getTableName() {
		return( TABLE_NAME );
	}

	public String getTableDbName() {
		return( TABLE_DBNAME );
	}

	public Class getObjQualifyingClass() {
		return( IYCFIntTenantObj.class );
	}


	public void minimizeMemory() {
		allMinorVersion = null;
		indexByTenantIdx = null;
		indexByMajorVerIdx = null;
		indexByNameIdx = null;
		List<IYCFIntMinorVersionObj> toForget = new LinkedList<IYCFIntMinorVersionObj>();
		IYCFIntMinorVersionObj cur = null;
		Iterator<IYCFIntMinorVersionObj> iter = members.values().iterator();
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
	 *	YCFIntMinorVersionObj.
	 */
	public IYCFIntMinorVersionObj newInstance() {
		IYCFIntMinorVersionObj inst = new YCFIntMinorVersionObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFIntMinorVersionObj.
	 */
	public IYCFIntMinorVersionEditObj newEditInstance( IYCFIntMinorVersionObj orig ) {
		IYCFIntMinorVersionEditObj edit = new YCFIntMinorVersionEditObj( orig );
		return( edit );
	}

	public IYCFIntMinorVersionObj realiseMinorVersion( IYCFIntMinorVersionObj Obj ) {
		IYCFIntMinorVersionObj obj = Obj;
		YCFIntMinorVersionPKey pkey = obj.getPKey();
		IYCFIntMinorVersionObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFIntMinorVersionObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				YCFIntMinorVersionByTenantIdxKey keyTenantIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryMinorVersion().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFIntMinorVersionPKey, IYCFIntMinorVersionObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.remove( keepObj.getPKey() );
					if( mapTenantIdx.size() <= 0 ) {
						indexByTenantIdx.remove( keyTenantIdx );
					}
				}
			}

			if( indexByMajorVerIdx != null ) {
				YCFIntMinorVersionByMajorVerIdxKey keyMajorVerIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryMinorVersion().newMajorVerIdxKey();
				keyMajorVerIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMajorVerIdx.setRequiredMajorVersionId( keepObj.getRequiredMajorVersionId() );
				Map<YCFIntMinorVersionPKey, IYCFIntMinorVersionObj > mapMajorVerIdx = indexByMajorVerIdx.get( keyMajorVerIdx );
				if( mapMajorVerIdx != null ) {
					mapMajorVerIdx.remove( keepObj.getPKey() );
					if( mapMajorVerIdx.size() <= 0 ) {
						indexByMajorVerIdx.remove( keyMajorVerIdx );
					}
				}
			}

			if( indexByNameIdx != null ) {
				YCFIntMinorVersionByNameIdxKey keyNameIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryMinorVersion().newNameIdxKey();
				keyNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyNameIdx.setRequiredMajorVersionId( keepObj.getRequiredMajorVersionId() );
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.remove( keyNameIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				YCFIntMinorVersionByTenantIdxKey keyTenantIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryMinorVersion().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFIntMinorVersionPKey, IYCFIntMinorVersionObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByMajorVerIdx != null ) {
				YCFIntMinorVersionByMajorVerIdxKey keyMajorVerIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryMinorVersion().newMajorVerIdxKey();
				keyMajorVerIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMajorVerIdx.setRequiredMajorVersionId( keepObj.getRequiredMajorVersionId() );
				Map<YCFIntMinorVersionPKey, IYCFIntMinorVersionObj > mapMajorVerIdx = indexByMajorVerIdx.get( keyMajorVerIdx );
				if( mapMajorVerIdx != null ) {
					mapMajorVerIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNameIdx != null ) {
				YCFIntMinorVersionByNameIdxKey keyNameIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryMinorVersion().newNameIdxKey();
				keyNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyNameIdx.setRequiredMajorVersionId( keepObj.getRequiredMajorVersionId() );
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

			if( allMinorVersion != null ) {
				allMinorVersion.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allMinorVersion != null ) {
				allMinorVersion.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				YCFIntMinorVersionByTenantIdxKey keyTenantIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryMinorVersion().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<YCFIntMinorVersionPKey, IYCFIntMinorVersionObj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByMajorVerIdx != null ) {
				YCFIntMinorVersionByMajorVerIdxKey keyMajorVerIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryMinorVersion().newMajorVerIdxKey();
				keyMajorVerIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyMajorVerIdx.setRequiredMajorVersionId( keepObj.getRequiredMajorVersionId() );
				Map<YCFIntMinorVersionPKey, IYCFIntMinorVersionObj > mapMajorVerIdx = indexByMajorVerIdx.get( keyMajorVerIdx );
				if( mapMajorVerIdx != null ) {
					mapMajorVerIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByNameIdx != null ) {
				YCFIntMinorVersionByNameIdxKey keyNameIdx =
					((IYCFIntSchema)schema.getBackingStore()).getFactoryMinorVersion().newNameIdxKey();
				keyNameIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				keyNameIdx.setRequiredMajorVersionId( keepObj.getRequiredMajorVersionId() );
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFIntMinorVersionObj createMinorVersion( IYCFIntMinorVersionObj Obj ) {
		IYCFIntMinorVersionObj obj = Obj;
		YCFIntMinorVersionBuff buff = obj.getMinorVersionBuff();
		((IYCFIntSchema)schema.getBackingStore()).getTableMinorVersion().createMinorVersion(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFIntMinorVersionObj readMinorVersion( YCFIntMinorVersionPKey pkey ) {
		return( readMinorVersion( pkey, false ) );
	}

	public IYCFIntMinorVersionObj readMinorVersion( YCFIntMinorVersionPKey pkey, boolean forceRead ) {
		IYCFIntMinorVersionObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFIntMinorVersionBuff readBuff = ((IYCFIntSchema)schema.getBackingStore()).getTableMinorVersion().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = schema.getMinorVersionTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryMinorVersion().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFIntMinorVersionObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFIntMinorVersionObj readCachedMinorVersion( YCFIntMinorVersionPKey pkey ) {
		IYCFIntMinorVersionObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeMinorVersion( IYCFIntMinorVersionObj obj )
	{
		final String S_ProcName = "YCFIntMinorVersionTableObj.reallyDeepDisposeMinorVersion() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFIntMinorVersionPKey pkey = obj.getPKey();
		IYCFIntMinorVersionObj existing = readCachedMinorVersion( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFIntMinorVersionByTenantIdxKey keyTenantIdx = ((IYCFIntSchema)schema.getBackingStore()).getFactoryMinorVersion().newTenantIdxKey();
		keyTenantIdx.setRequiredTenantId( existing.getRequiredTenantId() );

		YCFIntMinorVersionByMajorVerIdxKey keyMajorVerIdx = ((IYCFIntSchema)schema.getBackingStore()).getFactoryMinorVersion().newMajorVerIdxKey();
		keyMajorVerIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyMajorVerIdx.setRequiredMajorVersionId( existing.getRequiredMajorVersionId() );

		YCFIntMinorVersionByNameIdxKey keyNameIdx = ((IYCFIntSchema)schema.getBackingStore()).getFactoryMinorVersion().newNameIdxKey();
		keyNameIdx.setRequiredTenantId( existing.getRequiredTenantId() );
		keyNameIdx.setRequiredMajorVersionId( existing.getRequiredMajorVersionId() );
		keyNameIdx.setRequiredName( existing.getRequiredName() );



		if( indexByTenantIdx != null ) {
			if( indexByTenantIdx.containsKey( keyTenantIdx ) ) {
				indexByTenantIdx.get( keyTenantIdx ).remove( pkey );
				if( indexByTenantIdx.get( keyTenantIdx ).size() <= 0 ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}
		}

		if( indexByMajorVerIdx != null ) {
			if( indexByMajorVerIdx.containsKey( keyMajorVerIdx ) ) {
				indexByMajorVerIdx.get( keyMajorVerIdx ).remove( pkey );
				if( indexByMajorVerIdx.get( keyMajorVerIdx ).size() <= 0 ) {
					indexByMajorVerIdx.remove( keyMajorVerIdx );
				}
			}
		}

		if( indexByNameIdx != null ) {
			indexByNameIdx.remove( keyNameIdx );
		}


	}
	public void deepDisposeMinorVersion( YCFIntMinorVersionPKey pkey ) {
		IYCFIntMinorVersionObj obj = readCachedMinorVersion( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFIntMinorVersionObj lockMinorVersion( YCFIntMinorVersionPKey pkey ) {
		IYCFIntMinorVersionObj locked = null;
		YCFIntMinorVersionBuff lockBuff = ((IYCFIntSchema)schema.getBackingStore()).getTableMinorVersion().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getMinorVersionTableObj().newInstance();
			locked.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryMinorVersion().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFIntMinorVersionObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockMinorVersion", pkey );
		}
		return( locked );
	}

	public List<IYCFIntMinorVersionObj> readAllMinorVersion() {
		return( readAllMinorVersion( false ) );
	}

	public List<IYCFIntMinorVersionObj> readAllMinorVersion( boolean forceRead ) {
		final String S_ProcName = "readAllMinorVersion";
		if( ( allMinorVersion == null ) || forceRead ) {
			Map<YCFIntMinorVersionPKey, IYCFIntMinorVersionObj> map = new HashMap<YCFIntMinorVersionPKey,IYCFIntMinorVersionObj>();
			allMinorVersion = map;
			YCFIntMinorVersionBuff[] buffList = ((IYCFIntSchema)schema.getBackingStore()).getTableMinorVersion().readAllDerived( schema.getAuthorization() );
			YCFIntMinorVersionBuff buff;
			IYCFIntMinorVersionObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryMinorVersion().newPKey() );
				obj.setBuff( buff );
				IYCFIntMinorVersionObj realised = (IYCFIntMinorVersionObj)obj.realise();
			}
		}
		int len = allMinorVersion.size();
		IYCFIntMinorVersionObj arr[] = new IYCFIntMinorVersionObj[len];
		Iterator<IYCFIntMinorVersionObj> valIter = allMinorVersion.values().iterator();
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
		ArrayList<IYCFIntMinorVersionObj> arrayList = new ArrayList<IYCFIntMinorVersionObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFIntMinorVersionObj> cmp = new Comparator<IYCFIntMinorVersionObj>() {
			public int compare( IYCFIntMinorVersionObj lhs, IYCFIntMinorVersionObj rhs ) {
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
					YCFIntMinorVersionPKey lhsPKey = lhs.getPKey();
					YCFIntMinorVersionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFIntMinorVersionObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFIntMinorVersionObj> readCachedAllMinorVersion() {
		final String S_ProcName = "readCachedAllMinorVersion";
		ArrayList<IYCFIntMinorVersionObj> arrayList = new ArrayList<IYCFIntMinorVersionObj>();
		if( allMinorVersion != null ) {
			int len = allMinorVersion.size();
			IYCFIntMinorVersionObj arr[] = new IYCFIntMinorVersionObj[len];
			Iterator<IYCFIntMinorVersionObj> valIter = allMinorVersion.values().iterator();
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
		Comparator<IYCFIntMinorVersionObj> cmp = new Comparator<IYCFIntMinorVersionObj>() {
			public int compare( IYCFIntMinorVersionObj lhs, IYCFIntMinorVersionObj rhs ) {
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
					YCFIntMinorVersionPKey lhsPKey = lhs.getPKey();
					YCFIntMinorVersionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFIntMinorVersionObj readMinorVersionByIdIdx( long TenantId,
		long Id )
	{
		return( readMinorVersionByIdIdx( TenantId,
			Id,
			false ) );
	}

	public IYCFIntMinorVersionObj readMinorVersionByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		YCFIntMinorVersionPKey pkey = ((IYCFIntSchema)schema.getBackingStore()).getFactoryMinorVersion().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFIntMinorVersionObj obj = readMinorVersion( pkey, forceRead );
		return( obj );
	}

	public List<IYCFIntMinorVersionObj> readMinorVersionByTenantIdx( long TenantId )
	{
		return( readMinorVersionByTenantIdx( TenantId,
			false ) );
	}

	public List<IYCFIntMinorVersionObj> readMinorVersionByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readMinorVersionByTenantIdx";
		YCFIntMinorVersionByTenantIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryMinorVersion().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<YCFIntMinorVersionPKey, IYCFIntMinorVersionObj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFIntMinorVersionByTenantIdxKey,
				Map< YCFIntMinorVersionPKey, IYCFIntMinorVersionObj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<YCFIntMinorVersionPKey, IYCFIntMinorVersionObj>();
			IYCFIntMinorVersionObj obj;
			YCFIntMinorVersionBuff[] buffList = ((IYCFIntSchema)schema.getBackingStore()).getTableMinorVersion().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			YCFIntMinorVersionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getMinorVersionTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryMinorVersion().newPKey() );
				obj.setBuff( buff );
				IYCFIntMinorVersionObj realised = (IYCFIntMinorVersionObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFIntMinorVersionObj arr[] = new IYCFIntMinorVersionObj[len];
		Iterator<IYCFIntMinorVersionObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFIntMinorVersionObj> arrayList = new ArrayList<IYCFIntMinorVersionObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFIntMinorVersionObj> cmp = new Comparator<IYCFIntMinorVersionObj>() {
			public int compare( IYCFIntMinorVersionObj lhs, IYCFIntMinorVersionObj rhs ) {
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
					YCFIntMinorVersionPKey lhsPKey = lhs.getPKey();
					YCFIntMinorVersionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFIntMinorVersionObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFIntMinorVersionObj> readMinorVersionByMajorVerIdx( long TenantId,
		long MajorVersionId )
	{
		return( readMinorVersionByMajorVerIdx( TenantId,
			MajorVersionId,
			false ) );
	}

	public List<IYCFIntMinorVersionObj> readMinorVersionByMajorVerIdx( long TenantId,
		long MajorVersionId,
		boolean forceRead )
	{
		final String S_ProcName = "readMinorVersionByMajorVerIdx";
		YCFIntMinorVersionByMajorVerIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryMinorVersion().newMajorVerIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredMajorVersionId( MajorVersionId );
		Map<YCFIntMinorVersionPKey, IYCFIntMinorVersionObj> dict;
		if( indexByMajorVerIdx == null ) {
			indexByMajorVerIdx = new HashMap< YCFIntMinorVersionByMajorVerIdxKey,
				Map< YCFIntMinorVersionPKey, IYCFIntMinorVersionObj > >();
		}
		if( ( ! forceRead ) && indexByMajorVerIdx.containsKey( key ) ) {
			dict = indexByMajorVerIdx.get( key );
		}
		else {
			dict = new HashMap<YCFIntMinorVersionPKey, IYCFIntMinorVersionObj>();
			IYCFIntMinorVersionObj obj;
			YCFIntMinorVersionBuff[] buffList = ((IYCFIntSchema)schema.getBackingStore()).getTableMinorVersion().readDerivedByMajorVerIdx( schema.getAuthorization(),
				TenantId,
				MajorVersionId );
			YCFIntMinorVersionBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getMinorVersionTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryMinorVersion().newPKey() );
				obj.setBuff( buff );
				IYCFIntMinorVersionObj realised = (IYCFIntMinorVersionObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByMajorVerIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFIntMinorVersionObj arr[] = new IYCFIntMinorVersionObj[len];
		Iterator<IYCFIntMinorVersionObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFIntMinorVersionObj> arrayList = new ArrayList<IYCFIntMinorVersionObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFIntMinorVersionObj> cmp = new Comparator<IYCFIntMinorVersionObj>() {
			public int compare( IYCFIntMinorVersionObj lhs, IYCFIntMinorVersionObj rhs ) {
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
					YCFIntMinorVersionPKey lhsPKey = lhs.getPKey();
					YCFIntMinorVersionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFIntMinorVersionObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFIntMinorVersionObj readMinorVersionByNameIdx( long TenantId,
		long MajorVersionId,
		String Name )
	{
		return( readMinorVersionByNameIdx( TenantId,
			MajorVersionId,
			Name,
			false ) );
	}

	public IYCFIntMinorVersionObj readMinorVersionByNameIdx( long TenantId,
		long MajorVersionId,
		String Name, boolean forceRead )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< YCFIntMinorVersionByNameIdxKey,
				IYCFIntMinorVersionObj >();
		}
		YCFIntMinorVersionByNameIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryMinorVersion().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredMajorVersionId( MajorVersionId );
		key.setRequiredName( Name );
		IYCFIntMinorVersionObj obj = null;
		if( ( ! forceRead ) && indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
		}
		else {
			YCFIntMinorVersionBuff buff = ((IYCFIntSchema)schema.getBackingStore()).getTableMinorVersion().readDerivedByNameIdx( schema.getAuthorization(),
				TenantId,
				MajorVersionId,
				Name );
			if( buff != null ) {
				obj = schema.getMinorVersionTableObj().newInstance();
				obj.setPKey( ((IYCFIntSchema)schema.getBackingStore()).getFactoryMinorVersion().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFIntMinorVersionObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFIntMinorVersionObj readCachedMinorVersionByIdIdx( long TenantId,
		long Id )
	{
		IYCFIntMinorVersionObj obj = null;
		YCFIntMinorVersionPKey pkey = ((IYCFIntSchema)schema.getBackingStore()).getFactoryMinorVersion().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedMinorVersion( pkey );
		return( obj );
	}

	public List<IYCFIntMinorVersionObj> readCachedMinorVersionByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedMinorVersionByTenantIdx";
		YCFIntMinorVersionByTenantIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryMinorVersion().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<IYCFIntMinorVersionObj> arrayList = new ArrayList<IYCFIntMinorVersionObj>();
		if( indexByTenantIdx != null ) {
			Map<YCFIntMinorVersionPKey, IYCFIntMinorVersionObj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				IYCFIntMinorVersionObj arr[] = new IYCFIntMinorVersionObj[len];
				Iterator<IYCFIntMinorVersionObj> valIter = dict.values().iterator();
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
			IYCFIntMinorVersionObj obj;
			Iterator<IYCFIntMinorVersionObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFIntMinorVersionObj> cmp = new Comparator<IYCFIntMinorVersionObj>() {
			public int compare( IYCFIntMinorVersionObj lhs, IYCFIntMinorVersionObj rhs ) {
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
					YCFIntMinorVersionPKey lhsPKey = lhs.getPKey();
					YCFIntMinorVersionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFIntMinorVersionObj> readCachedMinorVersionByMajorVerIdx( long TenantId,
		long MajorVersionId )
	{
		final String S_ProcName = "readCachedMinorVersionByMajorVerIdx";
		YCFIntMinorVersionByMajorVerIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryMinorVersion().newMajorVerIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredMajorVersionId( MajorVersionId );
		ArrayList<IYCFIntMinorVersionObj> arrayList = new ArrayList<IYCFIntMinorVersionObj>();
		if( indexByMajorVerIdx != null ) {
			Map<YCFIntMinorVersionPKey, IYCFIntMinorVersionObj> dict;
			if( indexByMajorVerIdx.containsKey( key ) ) {
				dict = indexByMajorVerIdx.get( key );
				int len = dict.size();
				IYCFIntMinorVersionObj arr[] = new IYCFIntMinorVersionObj[len];
				Iterator<IYCFIntMinorVersionObj> valIter = dict.values().iterator();
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
			IYCFIntMinorVersionObj obj;
			Iterator<IYCFIntMinorVersionObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFIntMinorVersionObj> cmp = new Comparator<IYCFIntMinorVersionObj>() {
			public int compare( IYCFIntMinorVersionObj lhs, IYCFIntMinorVersionObj rhs ) {
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
					YCFIntMinorVersionPKey lhsPKey = lhs.getPKey();
					YCFIntMinorVersionPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFIntMinorVersionObj readCachedMinorVersionByNameIdx( long TenantId,
		long MajorVersionId,
		String Name )
	{
		IYCFIntMinorVersionObj obj = null;
		YCFIntMinorVersionByNameIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryMinorVersion().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredMajorVersionId( MajorVersionId );
		key.setRequiredName( Name );
		if( indexByNameIdx != null ) {
			if( indexByNameIdx.containsKey( key ) ) {
				obj = indexByNameIdx.get( key );
			}
			else {
				Iterator<IYCFIntMinorVersionObj> valIter = members.values().iterator();
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
			Iterator<IYCFIntMinorVersionObj> valIter = members.values().iterator();
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

	public void deepDisposeMinorVersionByIdIdx( long TenantId,
		long Id )
	{
		IYCFIntMinorVersionObj obj = readCachedMinorVersionByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeMinorVersionByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposeMinorVersionByTenantIdx";
		IYCFIntMinorVersionObj obj;
		List<IYCFIntMinorVersionObj> arrayList = readCachedMinorVersionByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<IYCFIntMinorVersionObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeMinorVersionByMajorVerIdx( long TenantId,
		long MajorVersionId )
	{
		final String S_ProcName = "deepDisposeMinorVersionByMajorVerIdx";
		IYCFIntMinorVersionObj obj;
		List<IYCFIntMinorVersionObj> arrayList = readCachedMinorVersionByMajorVerIdx( TenantId,
				MajorVersionId );
		if( arrayList != null )  {
			Iterator<IYCFIntMinorVersionObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeMinorVersionByNameIdx( long TenantId,
		long MajorVersionId,
		String Name )
	{
		IYCFIntMinorVersionObj obj = readCachedMinorVersionByNameIdx( TenantId,
				MajorVersionId,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFIntMinorVersionObj updateMinorVersion( IYCFIntMinorVersionObj Obj ) {
		IYCFIntMinorVersionObj obj = Obj;
		((IYCFIntSchema)schema.getBackingStore()).getTableMinorVersion().updateMinorVersion( schema.getAuthorization(),
			Obj.getMinorVersionBuff() );
		obj = (IYCFIntMinorVersionObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteMinorVersion( IYCFIntMinorVersionObj Obj ) {
		IYCFIntMinorVersionObj obj = Obj;
		((IYCFIntSchema)schema.getBackingStore()).getTableMinorVersion().deleteMinorVersion( schema.getAuthorization(),
			obj.getMinorVersionBuff() );
		Obj.forget();
	}

	public void deleteMinorVersionByIdIdx( long TenantId,
		long Id )
	{
		YCFIntMinorVersionPKey pkey = ((IYCFIntSchema)schema.getBackingStore()).getFactoryMinorVersion().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		IYCFIntMinorVersionObj obj = readMinorVersion( pkey );
		if( obj != null ) {
			IYCFIntMinorVersionEditObj editObj = (IYCFIntMinorVersionEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFIntMinorVersionEditObj)obj.beginEdit();
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
		deepDisposeMinorVersionByIdIdx( TenantId,
				Id );
	}

	public void deleteMinorVersionByTenantIdx( long TenantId )
	{
		YCFIntMinorVersionByTenantIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryMinorVersion().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< YCFIntMinorVersionByTenantIdxKey,
				Map< YCFIntMinorVersionPKey, IYCFIntMinorVersionObj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<YCFIntMinorVersionPKey, IYCFIntMinorVersionObj> dict = indexByTenantIdx.get( key );
			((IYCFIntSchema)schema.getBackingStore()).getTableMinorVersion().deleteMinorVersionByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<IYCFIntMinorVersionObj> iter = dict.values().iterator();
			IYCFIntMinorVersionObj obj;
			List<IYCFIntMinorVersionObj> toForget = new LinkedList<IYCFIntMinorVersionObj>();
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
			((IYCFIntSchema)schema.getBackingStore()).getTableMinorVersion().deleteMinorVersionByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposeMinorVersionByTenantIdx( TenantId );
	}

	public void deleteMinorVersionByMajorVerIdx( long TenantId,
		long MajorVersionId )
	{
		YCFIntMinorVersionByMajorVerIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryMinorVersion().newMajorVerIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredMajorVersionId( MajorVersionId );
		if( indexByMajorVerIdx == null ) {
			indexByMajorVerIdx = new HashMap< YCFIntMinorVersionByMajorVerIdxKey,
				Map< YCFIntMinorVersionPKey, IYCFIntMinorVersionObj > >();
		}
		if( indexByMajorVerIdx.containsKey( key ) ) {
			Map<YCFIntMinorVersionPKey, IYCFIntMinorVersionObj> dict = indexByMajorVerIdx.get( key );
			((IYCFIntSchema)schema.getBackingStore()).getTableMinorVersion().deleteMinorVersionByMajorVerIdx( schema.getAuthorization(),
				TenantId,
				MajorVersionId );
			Iterator<IYCFIntMinorVersionObj> iter = dict.values().iterator();
			IYCFIntMinorVersionObj obj;
			List<IYCFIntMinorVersionObj> toForget = new LinkedList<IYCFIntMinorVersionObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByMajorVerIdx.remove( key );
		}
		else {
			((IYCFIntSchema)schema.getBackingStore()).getTableMinorVersion().deleteMinorVersionByMajorVerIdx( schema.getAuthorization(),
				TenantId,
				MajorVersionId );
		}
		deepDisposeMinorVersionByMajorVerIdx( TenantId,
				MajorVersionId );
	}

	public void deleteMinorVersionByNameIdx( long TenantId,
		long MajorVersionId,
		String Name )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< YCFIntMinorVersionByNameIdxKey,
				IYCFIntMinorVersionObj >();
		}
		YCFIntMinorVersionByNameIdxKey key = ((IYCFIntSchema)schema.getBackingStore()).getFactoryMinorVersion().newNameIdxKey();
		key.setRequiredTenantId( TenantId );
		key.setRequiredMajorVersionId( MajorVersionId );
		key.setRequiredName( Name );
		IYCFIntMinorVersionObj obj = null;
		if( indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
			((IYCFIntSchema)schema.getBackingStore()).getTableMinorVersion().deleteMinorVersionByNameIdx( schema.getAuthorization(),
				TenantId,
				MajorVersionId,
				Name );
			obj.forget();
		}
		else {
			((IYCFIntSchema)schema.getBackingStore()).getTableMinorVersion().deleteMinorVersionByNameIdx( schema.getAuthorization(),
				TenantId,
				MajorVersionId,
				Name );
		}
		deepDisposeMinorVersionByNameIdx( TenantId,
				MajorVersionId,
				Name );
	}
}
