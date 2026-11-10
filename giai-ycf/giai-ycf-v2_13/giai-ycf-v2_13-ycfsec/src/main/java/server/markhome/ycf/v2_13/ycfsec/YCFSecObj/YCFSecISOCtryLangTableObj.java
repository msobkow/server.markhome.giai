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

public class YCFSecISOCtryLangTableObj
	implements IYCFSecISOCtryLangTableObj
{
	protected IYCFSecSchemaObj schema;
	private Map<YCFSecISOCtryLangPKey, IYCFSecISOCtryLangObj> members;
	private Map<YCFSecISOCtryLangPKey, IYCFSecISOCtryLangObj> allISOCtryLang;
	private Map< YCFSecISOCtryLangByCtryIdxKey,
		Map<YCFSecISOCtryLangPKey, IYCFSecISOCtryLangObj > > indexByCtryIdx;
	private Map< YCFSecISOCtryLangByLangIdxKey,
		Map<YCFSecISOCtryLangPKey, IYCFSecISOCtryLangObj > > indexByLangIdx;
	public static String TABLE_NAME = "ISOCtryLang";
	public static String TABLE_DBNAME = "iso_cntrylng";

	public YCFSecISOCtryLangTableObj() {
		schema = null;
		members = new HashMap<YCFSecISOCtryLangPKey, IYCFSecISOCtryLangObj>();
		allISOCtryLang = null;
		indexByCtryIdx = null;
		indexByLangIdx = null;
	}

	public YCFSecISOCtryLangTableObj( IYCFSecSchemaObj argSchema ) {
		schema = (IYCFSecSchemaObj)argSchema;
		members = new HashMap<YCFSecISOCtryLangPKey, IYCFSecISOCtryLangObj>();
		allISOCtryLang = null;
		indexByCtryIdx = null;
		indexByLangIdx = null;
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
		allISOCtryLang = null;
		indexByCtryIdx = null;
		indexByLangIdx = null;
		List<IYCFSecISOCtryLangObj> toForget = new LinkedList<IYCFSecISOCtryLangObj>();
		IYCFSecISOCtryLangObj cur = null;
		Iterator<IYCFSecISOCtryLangObj> iter = members.values().iterator();
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
	 *	YCFSecISOCtryLangObj.
	 */
	public IYCFSecISOCtryLangObj newInstance() {
		IYCFSecISOCtryLangObj inst = new YCFSecISOCtryLangObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFSecISOCtryLangObj.
	 */
	public IYCFSecISOCtryLangEditObj newEditInstance( IYCFSecISOCtryLangObj orig ) {
		IYCFSecISOCtryLangEditObj edit = new YCFSecISOCtryLangEditObj( orig );
		return( edit );
	}

	public IYCFSecISOCtryLangObj realiseISOCtryLang( IYCFSecISOCtryLangObj Obj ) {
		IYCFSecISOCtryLangObj obj = Obj;
		YCFSecISOCtryLangPKey pkey = obj.getPKey();
		IYCFSecISOCtryLangObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFSecISOCtryLangObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByCtryIdx != null ) {
				YCFSecISOCtryLangByCtryIdxKey keyCtryIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryLang().newCtryIdxKey();
				keyCtryIdx.setRequiredISOCtryId( keepObj.getRequiredISOCtryId() );
				Map<YCFSecISOCtryLangPKey, IYCFSecISOCtryLangObj > mapCtryIdx = indexByCtryIdx.get( keyCtryIdx );
				if( mapCtryIdx != null ) {
					mapCtryIdx.remove( keepObj.getPKey() );
					if( mapCtryIdx.size() <= 0 ) {
						indexByCtryIdx.remove( keyCtryIdx );
					}
				}
			}

			if( indexByLangIdx != null ) {
				YCFSecISOCtryLangByLangIdxKey keyLangIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryLang().newLangIdxKey();
				keyLangIdx.setRequiredISOLangId( keepObj.getRequiredISOLangId() );
				Map<YCFSecISOCtryLangPKey, IYCFSecISOCtryLangObj > mapLangIdx = indexByLangIdx.get( keyLangIdx );
				if( mapLangIdx != null ) {
					mapLangIdx.remove( keepObj.getPKey() );
					if( mapLangIdx.size() <= 0 ) {
						indexByLangIdx.remove( keyLangIdx );
					}
				}
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByCtryIdx != null ) {
				YCFSecISOCtryLangByCtryIdxKey keyCtryIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryLang().newCtryIdxKey();
				keyCtryIdx.setRequiredISOCtryId( keepObj.getRequiredISOCtryId() );
				Map<YCFSecISOCtryLangPKey, IYCFSecISOCtryLangObj > mapCtryIdx = indexByCtryIdx.get( keyCtryIdx );
				if( mapCtryIdx != null ) {
					mapCtryIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByLangIdx != null ) {
				YCFSecISOCtryLangByLangIdxKey keyLangIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryLang().newLangIdxKey();
				keyLangIdx.setRequiredISOLangId( keepObj.getRequiredISOLangId() );
				Map<YCFSecISOCtryLangPKey, IYCFSecISOCtryLangObj > mapLangIdx = indexByLangIdx.get( keyLangIdx );
				if( mapLangIdx != null ) {
					mapLangIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allISOCtryLang != null ) {
				allISOCtryLang.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allISOCtryLang != null ) {
				allISOCtryLang.put( keepObj.getPKey(), keepObj );
			}

			if( indexByCtryIdx != null ) {
				YCFSecISOCtryLangByCtryIdxKey keyCtryIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryLang().newCtryIdxKey();
				keyCtryIdx.setRequiredISOCtryId( keepObj.getRequiredISOCtryId() );
				Map<YCFSecISOCtryLangPKey, IYCFSecISOCtryLangObj > mapCtryIdx = indexByCtryIdx.get( keyCtryIdx );
				if( mapCtryIdx != null ) {
					mapCtryIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByLangIdx != null ) {
				YCFSecISOCtryLangByLangIdxKey keyLangIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryLang().newLangIdxKey();
				keyLangIdx.setRequiredISOLangId( keepObj.getRequiredISOLangId() );
				Map<YCFSecISOCtryLangPKey, IYCFSecISOCtryLangObj > mapLangIdx = indexByLangIdx.get( keyLangIdx );
				if( mapLangIdx != null ) {
					mapLangIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFSecISOCtryLangObj createISOCtryLang( IYCFSecISOCtryLangObj Obj ) {
		IYCFSecISOCtryLangObj obj = Obj;
		YCFSecISOCtryLangBuff buff = obj.getISOCtryLangBuff();
		((IYCFSecSchema)schema.getBackingStore()).getTableISOCtryLang().createISOCtryLang(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFSecISOCtryLangObj readISOCtryLang( YCFSecISOCtryLangPKey pkey ) {
		return( readISOCtryLang( pkey, false ) );
	}

	public IYCFSecISOCtryLangObj readISOCtryLang( YCFSecISOCtryLangPKey pkey, boolean forceRead ) {
		IYCFSecISOCtryLangObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFSecISOCtryLangBuff readBuff = ((IYCFSecSchema)schema.getBackingStore()).getTableISOCtryLang().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredISOCtryId(),
				pkey.getRequiredISOLangId() );
			if( readBuff != null ) {
				obj = schema.getISOCtryLangTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryLang().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFSecISOCtryLangObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecISOCtryLangObj readCachedISOCtryLang( YCFSecISOCtryLangPKey pkey ) {
		IYCFSecISOCtryLangObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeISOCtryLang( IYCFSecISOCtryLangObj obj )
	{
		final String S_ProcName = "YCFSecISOCtryLangTableObj.reallyDeepDisposeISOCtryLang() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFSecISOCtryLangPKey pkey = obj.getPKey();
		IYCFSecISOCtryLangObj existing = readCachedISOCtryLang( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFSecISOCtryLangByCtryIdxKey keyCtryIdx = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryLang().newCtryIdxKey();
		keyCtryIdx.setRequiredISOCtryId( existing.getRequiredISOCtryId() );

		YCFSecISOCtryLangByLangIdxKey keyLangIdx = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryLang().newLangIdxKey();
		keyLangIdx.setRequiredISOLangId( existing.getRequiredISOLangId() );



		if( indexByCtryIdx != null ) {
			if( indexByCtryIdx.containsKey( keyCtryIdx ) ) {
				indexByCtryIdx.get( keyCtryIdx ).remove( pkey );
				if( indexByCtryIdx.get( keyCtryIdx ).size() <= 0 ) {
					indexByCtryIdx.remove( keyCtryIdx );
				}
			}
		}

		if( indexByLangIdx != null ) {
			if( indexByLangIdx.containsKey( keyLangIdx ) ) {
				indexByLangIdx.get( keyLangIdx ).remove( pkey );
				if( indexByLangIdx.get( keyLangIdx ).size() <= 0 ) {
					indexByLangIdx.remove( keyLangIdx );
				}
			}
		}


	}
	public void deepDisposeISOCtryLang( YCFSecISOCtryLangPKey pkey ) {
		IYCFSecISOCtryLangObj obj = readCachedISOCtryLang( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFSecISOCtryLangObj lockISOCtryLang( YCFSecISOCtryLangPKey pkey ) {
		IYCFSecISOCtryLangObj locked = null;
		YCFSecISOCtryLangBuff lockBuff = ((IYCFSecSchema)schema.getBackingStore()).getTableISOCtryLang().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getISOCtryLangTableObj().newInstance();
			locked.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryLang().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFSecISOCtryLangObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockISOCtryLang", pkey );
		}
		return( locked );
	}

	public List<IYCFSecISOCtryLangObj> readAllISOCtryLang() {
		return( readAllISOCtryLang( false ) );
	}

	public List<IYCFSecISOCtryLangObj> readAllISOCtryLang( boolean forceRead ) {
		final String S_ProcName = "readAllISOCtryLang";
		if( ( allISOCtryLang == null ) || forceRead ) {
			Map<YCFSecISOCtryLangPKey, IYCFSecISOCtryLangObj> map = new HashMap<YCFSecISOCtryLangPKey,IYCFSecISOCtryLangObj>();
			allISOCtryLang = map;
			YCFSecISOCtryLangBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableISOCtryLang().readAllDerived( schema.getAuthorization() );
			YCFSecISOCtryLangBuff buff;
			IYCFSecISOCtryLangObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryLang().newPKey() );
				obj.setBuff( buff );
				IYCFSecISOCtryLangObj realised = (IYCFSecISOCtryLangObj)obj.realise();
			}
		}
		int len = allISOCtryLang.size();
		IYCFSecISOCtryLangObj arr[] = new IYCFSecISOCtryLangObj[len];
		Iterator<IYCFSecISOCtryLangObj> valIter = allISOCtryLang.values().iterator();
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
		ArrayList<IYCFSecISOCtryLangObj> arrayList = new ArrayList<IYCFSecISOCtryLangObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecISOCtryLangObj> cmp = new Comparator<IYCFSecISOCtryLangObj>() {
			public int compare( IYCFSecISOCtryLangObj lhs, IYCFSecISOCtryLangObj rhs ) {
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
					YCFSecISOCtryLangPKey lhsPKey = lhs.getPKey();
					YCFSecISOCtryLangPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecISOCtryLangObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecISOCtryLangObj> readCachedAllISOCtryLang() {
		final String S_ProcName = "readCachedAllISOCtryLang";
		ArrayList<IYCFSecISOCtryLangObj> arrayList = new ArrayList<IYCFSecISOCtryLangObj>();
		if( allISOCtryLang != null ) {
			int len = allISOCtryLang.size();
			IYCFSecISOCtryLangObj arr[] = new IYCFSecISOCtryLangObj[len];
			Iterator<IYCFSecISOCtryLangObj> valIter = allISOCtryLang.values().iterator();
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
		Comparator<IYCFSecISOCtryLangObj> cmp = new Comparator<IYCFSecISOCtryLangObj>() {
			public int compare( IYCFSecISOCtryLangObj lhs, IYCFSecISOCtryLangObj rhs ) {
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
					YCFSecISOCtryLangPKey lhsPKey = lhs.getPKey();
					YCFSecISOCtryLangPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFSecISOCtryLangObj readISOCtryLangByIdIdx( short ISOCtryId,
		short ISOLangId )
	{
		return( readISOCtryLangByIdIdx( ISOCtryId,
			ISOLangId,
			false ) );
	}

	public IYCFSecISOCtryLangObj readISOCtryLangByIdIdx( short ISOCtryId,
		short ISOLangId, boolean forceRead )
	{
		YCFSecISOCtryLangPKey pkey = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryLang().newPKey();
		pkey.setRequiredISOCtryId( ISOCtryId );
		pkey.setRequiredISOLangId( ISOLangId );
		IYCFSecISOCtryLangObj obj = readISOCtryLang( pkey, forceRead );
		return( obj );
	}

	public List<IYCFSecISOCtryLangObj> readISOCtryLangByCtryIdx( short ISOCtryId )
	{
		return( readISOCtryLangByCtryIdx( ISOCtryId,
			false ) );
	}

	public List<IYCFSecISOCtryLangObj> readISOCtryLangByCtryIdx( short ISOCtryId,
		boolean forceRead )
	{
		final String S_ProcName = "readISOCtryLangByCtryIdx";
		YCFSecISOCtryLangByCtryIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryLang().newCtryIdxKey();
		key.setRequiredISOCtryId( ISOCtryId );
		Map<YCFSecISOCtryLangPKey, IYCFSecISOCtryLangObj> dict;
		if( indexByCtryIdx == null ) {
			indexByCtryIdx = new HashMap< YCFSecISOCtryLangByCtryIdxKey,
				Map< YCFSecISOCtryLangPKey, IYCFSecISOCtryLangObj > >();
		}
		if( ( ! forceRead ) && indexByCtryIdx.containsKey( key ) ) {
			dict = indexByCtryIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecISOCtryLangPKey, IYCFSecISOCtryLangObj>();
			IYCFSecISOCtryLangObj obj;
			YCFSecISOCtryLangBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableISOCtryLang().readDerivedByCtryIdx( schema.getAuthorization(),
				ISOCtryId );
			YCFSecISOCtryLangBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getISOCtryLangTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryLang().newPKey() );
				obj.setBuff( buff );
				IYCFSecISOCtryLangObj realised = (IYCFSecISOCtryLangObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByCtryIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecISOCtryLangObj arr[] = new IYCFSecISOCtryLangObj[len];
		Iterator<IYCFSecISOCtryLangObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecISOCtryLangObj> arrayList = new ArrayList<IYCFSecISOCtryLangObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecISOCtryLangObj> cmp = new Comparator<IYCFSecISOCtryLangObj>() {
			public int compare( IYCFSecISOCtryLangObj lhs, IYCFSecISOCtryLangObj rhs ) {
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
					YCFSecISOCtryLangPKey lhsPKey = lhs.getPKey();
					YCFSecISOCtryLangPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecISOCtryLangObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecISOCtryLangObj> readISOCtryLangByLangIdx( short ISOLangId )
	{
		return( readISOCtryLangByLangIdx( ISOLangId,
			false ) );
	}

	public List<IYCFSecISOCtryLangObj> readISOCtryLangByLangIdx( short ISOLangId,
		boolean forceRead )
	{
		final String S_ProcName = "readISOCtryLangByLangIdx";
		YCFSecISOCtryLangByLangIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryLang().newLangIdxKey();
		key.setRequiredISOLangId( ISOLangId );
		Map<YCFSecISOCtryLangPKey, IYCFSecISOCtryLangObj> dict;
		if( indexByLangIdx == null ) {
			indexByLangIdx = new HashMap< YCFSecISOCtryLangByLangIdxKey,
				Map< YCFSecISOCtryLangPKey, IYCFSecISOCtryLangObj > >();
		}
		if( ( ! forceRead ) && indexByLangIdx.containsKey( key ) ) {
			dict = indexByLangIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecISOCtryLangPKey, IYCFSecISOCtryLangObj>();
			IYCFSecISOCtryLangObj obj;
			YCFSecISOCtryLangBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableISOCtryLang().readDerivedByLangIdx( schema.getAuthorization(),
				ISOLangId );
			YCFSecISOCtryLangBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getISOCtryLangTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryLang().newPKey() );
				obj.setBuff( buff );
				IYCFSecISOCtryLangObj realised = (IYCFSecISOCtryLangObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByLangIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecISOCtryLangObj arr[] = new IYCFSecISOCtryLangObj[len];
		Iterator<IYCFSecISOCtryLangObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecISOCtryLangObj> arrayList = new ArrayList<IYCFSecISOCtryLangObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecISOCtryLangObj> cmp = new Comparator<IYCFSecISOCtryLangObj>() {
			public int compare( IYCFSecISOCtryLangObj lhs, IYCFSecISOCtryLangObj rhs ) {
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
					YCFSecISOCtryLangPKey lhsPKey = lhs.getPKey();
					YCFSecISOCtryLangPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecISOCtryLangObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFSecISOCtryLangObj readCachedISOCtryLangByIdIdx( short ISOCtryId,
		short ISOLangId )
	{
		IYCFSecISOCtryLangObj obj = null;
		YCFSecISOCtryLangPKey pkey = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryLang().newPKey();
		pkey.setRequiredISOCtryId( ISOCtryId );
		pkey.setRequiredISOLangId( ISOLangId );
		obj = readCachedISOCtryLang( pkey );
		return( obj );
	}

	public List<IYCFSecISOCtryLangObj> readCachedISOCtryLangByCtryIdx( short ISOCtryId )
	{
		final String S_ProcName = "readCachedISOCtryLangByCtryIdx";
		YCFSecISOCtryLangByCtryIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryLang().newCtryIdxKey();
		key.setRequiredISOCtryId( ISOCtryId );
		ArrayList<IYCFSecISOCtryLangObj> arrayList = new ArrayList<IYCFSecISOCtryLangObj>();
		if( indexByCtryIdx != null ) {
			Map<YCFSecISOCtryLangPKey, IYCFSecISOCtryLangObj> dict;
			if( indexByCtryIdx.containsKey( key ) ) {
				dict = indexByCtryIdx.get( key );
				int len = dict.size();
				IYCFSecISOCtryLangObj arr[] = new IYCFSecISOCtryLangObj[len];
				Iterator<IYCFSecISOCtryLangObj> valIter = dict.values().iterator();
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
			IYCFSecISOCtryLangObj obj;
			Iterator<IYCFSecISOCtryLangObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecISOCtryLangObj> cmp = new Comparator<IYCFSecISOCtryLangObj>() {
			public int compare( IYCFSecISOCtryLangObj lhs, IYCFSecISOCtryLangObj rhs ) {
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
					YCFSecISOCtryLangPKey lhsPKey = lhs.getPKey();
					YCFSecISOCtryLangPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFSecISOCtryLangObj> readCachedISOCtryLangByLangIdx( short ISOLangId )
	{
		final String S_ProcName = "readCachedISOCtryLangByLangIdx";
		YCFSecISOCtryLangByLangIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryLang().newLangIdxKey();
		key.setRequiredISOLangId( ISOLangId );
		ArrayList<IYCFSecISOCtryLangObj> arrayList = new ArrayList<IYCFSecISOCtryLangObj>();
		if( indexByLangIdx != null ) {
			Map<YCFSecISOCtryLangPKey, IYCFSecISOCtryLangObj> dict;
			if( indexByLangIdx.containsKey( key ) ) {
				dict = indexByLangIdx.get( key );
				int len = dict.size();
				IYCFSecISOCtryLangObj arr[] = new IYCFSecISOCtryLangObj[len];
				Iterator<IYCFSecISOCtryLangObj> valIter = dict.values().iterator();
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
			IYCFSecISOCtryLangObj obj;
			Iterator<IYCFSecISOCtryLangObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecISOCtryLangObj> cmp = new Comparator<IYCFSecISOCtryLangObj>() {
			public int compare( IYCFSecISOCtryLangObj lhs, IYCFSecISOCtryLangObj rhs ) {
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
					YCFSecISOCtryLangPKey lhsPKey = lhs.getPKey();
					YCFSecISOCtryLangPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeISOCtryLangByIdIdx( short ISOCtryId,
		short ISOLangId )
	{
		IYCFSecISOCtryLangObj obj = readCachedISOCtryLangByIdIdx( ISOCtryId,
				ISOLangId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeISOCtryLangByCtryIdx( short ISOCtryId )
	{
		final String S_ProcName = "deepDisposeISOCtryLangByCtryIdx";
		IYCFSecISOCtryLangObj obj;
		List<IYCFSecISOCtryLangObj> arrayList = readCachedISOCtryLangByCtryIdx( ISOCtryId );
		if( arrayList != null )  {
			Iterator<IYCFSecISOCtryLangObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeISOCtryLangByLangIdx( short ISOLangId )
	{
		final String S_ProcName = "deepDisposeISOCtryLangByLangIdx";
		IYCFSecISOCtryLangObj obj;
		List<IYCFSecISOCtryLangObj> arrayList = readCachedISOCtryLangByLangIdx( ISOLangId );
		if( arrayList != null )  {
			Iterator<IYCFSecISOCtryLangObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFSecISOCtryLangObj updateISOCtryLang( IYCFSecISOCtryLangObj Obj ) {
		IYCFSecISOCtryLangObj obj = Obj;
		((IYCFSecSchema)schema.getBackingStore()).getTableISOCtryLang().updateISOCtryLang( schema.getAuthorization(),
			Obj.getISOCtryLangBuff() );
		obj = (IYCFSecISOCtryLangObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteISOCtryLang( IYCFSecISOCtryLangObj Obj ) {
		IYCFSecISOCtryLangObj obj = Obj;
		((IYCFSecSchema)schema.getBackingStore()).getTableISOCtryLang().deleteISOCtryLang( schema.getAuthorization(),
			obj.getISOCtryLangBuff() );
		Obj.forget();
	}

	public void deleteISOCtryLangByIdIdx( short ISOCtryId,
		short ISOLangId )
	{
		YCFSecISOCtryLangPKey pkey = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryLang().newPKey();
		pkey.setRequiredISOCtryId( ISOCtryId );
		pkey.setRequiredISOLangId( ISOLangId );
		IYCFSecISOCtryLangObj obj = readISOCtryLang( pkey );
		if( obj != null ) {
			IYCFSecISOCtryLangEditObj editObj = (IYCFSecISOCtryLangEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFSecISOCtryLangEditObj)obj.beginEdit();
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
		deepDisposeISOCtryLangByIdIdx( ISOCtryId,
				ISOLangId );
	}

	public void deleteISOCtryLangByCtryIdx( short ISOCtryId )
	{
		YCFSecISOCtryLangByCtryIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryLang().newCtryIdxKey();
		key.setRequiredISOCtryId( ISOCtryId );
		if( indexByCtryIdx == null ) {
			indexByCtryIdx = new HashMap< YCFSecISOCtryLangByCtryIdxKey,
				Map< YCFSecISOCtryLangPKey, IYCFSecISOCtryLangObj > >();
		}
		if( indexByCtryIdx.containsKey( key ) ) {
			Map<YCFSecISOCtryLangPKey, IYCFSecISOCtryLangObj> dict = indexByCtryIdx.get( key );
			((IYCFSecSchema)schema.getBackingStore()).getTableISOCtryLang().deleteISOCtryLangByCtryIdx( schema.getAuthorization(),
				ISOCtryId );
			Iterator<IYCFSecISOCtryLangObj> iter = dict.values().iterator();
			IYCFSecISOCtryLangObj obj;
			List<IYCFSecISOCtryLangObj> toForget = new LinkedList<IYCFSecISOCtryLangObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByCtryIdx.remove( key );
		}
		else {
			((IYCFSecSchema)schema.getBackingStore()).getTableISOCtryLang().deleteISOCtryLangByCtryIdx( schema.getAuthorization(),
				ISOCtryId );
		}
		deepDisposeISOCtryLangByCtryIdx( ISOCtryId );
	}

	public void deleteISOCtryLangByLangIdx( short ISOLangId )
	{
		YCFSecISOCtryLangByLangIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryLang().newLangIdxKey();
		key.setRequiredISOLangId( ISOLangId );
		if( indexByLangIdx == null ) {
			indexByLangIdx = new HashMap< YCFSecISOCtryLangByLangIdxKey,
				Map< YCFSecISOCtryLangPKey, IYCFSecISOCtryLangObj > >();
		}
		if( indexByLangIdx.containsKey( key ) ) {
			Map<YCFSecISOCtryLangPKey, IYCFSecISOCtryLangObj> dict = indexByLangIdx.get( key );
			((IYCFSecSchema)schema.getBackingStore()).getTableISOCtryLang().deleteISOCtryLangByLangIdx( schema.getAuthorization(),
				ISOLangId );
			Iterator<IYCFSecISOCtryLangObj> iter = dict.values().iterator();
			IYCFSecISOCtryLangObj obj;
			List<IYCFSecISOCtryLangObj> toForget = new LinkedList<IYCFSecISOCtryLangObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByLangIdx.remove( key );
		}
		else {
			((IYCFSecSchema)schema.getBackingStore()).getTableISOCtryLang().deleteISOCtryLangByLangIdx( schema.getAuthorization(),
				ISOLangId );
		}
		deepDisposeISOCtryLangByLangIdx( ISOLangId );
	}
}
