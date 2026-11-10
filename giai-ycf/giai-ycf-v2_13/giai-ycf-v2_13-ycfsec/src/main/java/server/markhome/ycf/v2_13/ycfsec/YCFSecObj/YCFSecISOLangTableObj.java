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

public class YCFSecISOLangTableObj
	implements IYCFSecISOLangTableObj
{
	protected IYCFSecSchemaObj schema;
	private Map<YCFSecISOLangPKey, IYCFSecISOLangObj> members;
	private Map<YCFSecISOLangPKey, IYCFSecISOLangObj> allISOLang;
	private Map< YCFSecISOLangByCode3IdxKey,
		IYCFSecISOLangObj > indexByCode3Idx;
	private Map< YCFSecISOLangByCode2IdxKey,
		Map<YCFSecISOLangPKey, IYCFSecISOLangObj > > indexByCode2Idx;
	public static String TABLE_NAME = "ISOLang";
	public static String TABLE_DBNAME = "iso_lang";

	public YCFSecISOLangTableObj() {
		schema = null;
		members = new HashMap<YCFSecISOLangPKey, IYCFSecISOLangObj>();
		allISOLang = null;
		indexByCode3Idx = null;
		indexByCode2Idx = null;
	}

	public YCFSecISOLangTableObj( IYCFSecSchemaObj argSchema ) {
		schema = (IYCFSecSchemaObj)argSchema;
		members = new HashMap<YCFSecISOLangPKey, IYCFSecISOLangObj>();
		allISOLang = null;
		indexByCode3Idx = null;
		indexByCode2Idx = null;
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
		allISOLang = null;
		indexByCode3Idx = null;
		indexByCode2Idx = null;
		List<IYCFSecISOLangObj> toForget = new LinkedList<IYCFSecISOLangObj>();
		IYCFSecISOLangObj cur = null;
		Iterator<IYCFSecISOLangObj> iter = members.values().iterator();
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
	 *	YCFSecISOLangObj.
	 */
	public IYCFSecISOLangObj newInstance() {
		IYCFSecISOLangObj inst = new YCFSecISOLangObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFSecISOLangObj.
	 */
	public IYCFSecISOLangEditObj newEditInstance( IYCFSecISOLangObj orig ) {
		IYCFSecISOLangEditObj edit = new YCFSecISOLangEditObj( orig );
		return( edit );
	}

	public IYCFSecISOLangObj realiseISOLang( IYCFSecISOLangObj Obj ) {
		IYCFSecISOLangObj obj = Obj;
		YCFSecISOLangPKey pkey = obj.getPKey();
		IYCFSecISOLangObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFSecISOLangObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByCode3Idx != null ) {
				YCFSecISOLangByCode3IdxKey keyCode3Idx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOLang().newCode3IdxKey();
				keyCode3Idx.setRequiredISO6392Code( keepObj.getRequiredISO6392Code() );
				indexByCode3Idx.remove( keyCode3Idx );
			}

			if( indexByCode2Idx != null ) {
				YCFSecISOLangByCode2IdxKey keyCode2Idx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOLang().newCode2IdxKey();
				keyCode2Idx.setOptionalISO6391Code( keepObj.getOptionalISO6391Code() );
				Map<YCFSecISOLangPKey, IYCFSecISOLangObj > mapCode2Idx = indexByCode2Idx.get( keyCode2Idx );
				if( mapCode2Idx != null ) {
					mapCode2Idx.remove( keepObj.getPKey() );
					if( mapCode2Idx.size() <= 0 ) {
						indexByCode2Idx.remove( keyCode2Idx );
					}
				}
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByCode3Idx != null ) {
				YCFSecISOLangByCode3IdxKey keyCode3Idx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOLang().newCode3IdxKey();
				keyCode3Idx.setRequiredISO6392Code( keepObj.getRequiredISO6392Code() );
				indexByCode3Idx.put( keyCode3Idx, keepObj );
			}

			if( indexByCode2Idx != null ) {
				YCFSecISOLangByCode2IdxKey keyCode2Idx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOLang().newCode2IdxKey();
				keyCode2Idx.setOptionalISO6391Code( keepObj.getOptionalISO6391Code() );
				Map<YCFSecISOLangPKey, IYCFSecISOLangObj > mapCode2Idx = indexByCode2Idx.get( keyCode2Idx );
				if( mapCode2Idx != null ) {
					mapCode2Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allISOLang != null ) {
				allISOLang.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allISOLang != null ) {
				allISOLang.put( keepObj.getPKey(), keepObj );
			}

			if( indexByCode3Idx != null ) {
				YCFSecISOLangByCode3IdxKey keyCode3Idx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOLang().newCode3IdxKey();
				keyCode3Idx.setRequiredISO6392Code( keepObj.getRequiredISO6392Code() );
				indexByCode3Idx.put( keyCode3Idx, keepObj );
			}

			if( indexByCode2Idx != null ) {
				YCFSecISOLangByCode2IdxKey keyCode2Idx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOLang().newCode2IdxKey();
				keyCode2Idx.setOptionalISO6391Code( keepObj.getOptionalISO6391Code() );
				Map<YCFSecISOLangPKey, IYCFSecISOLangObj > mapCode2Idx = indexByCode2Idx.get( keyCode2Idx );
				if( mapCode2Idx != null ) {
					mapCode2Idx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFSecISOLangObj createISOLang( IYCFSecISOLangObj Obj ) {
		IYCFSecISOLangObj obj = Obj;
		YCFSecISOLangBuff buff = obj.getISOLangBuff();
		((IYCFSecSchema)schema.getBackingStore()).getTableISOLang().createISOLang(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFSecISOLangObj readISOLang( YCFSecISOLangPKey pkey ) {
		return( readISOLang( pkey, false ) );
	}

	public IYCFSecISOLangObj readISOLang( YCFSecISOLangPKey pkey, boolean forceRead ) {
		IYCFSecISOLangObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFSecISOLangBuff readBuff = ((IYCFSecSchema)schema.getBackingStore()).getTableISOLang().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredISOLangId() );
			if( readBuff != null ) {
				obj = schema.getISOLangTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOLang().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFSecISOLangObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecISOLangObj readCachedISOLang( YCFSecISOLangPKey pkey ) {
		IYCFSecISOLangObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeISOLang( IYCFSecISOLangObj obj )
	{
		final String S_ProcName = "YCFSecISOLangTableObj.reallyDeepDisposeISOLang() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFSecISOLangPKey pkey = obj.getPKey();
		IYCFSecISOLangObj existing = readCachedISOLang( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFSecISOLangByCode3IdxKey keyCode3Idx = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOLang().newCode3IdxKey();
		keyCode3Idx.setRequiredISO6392Code( existing.getRequiredISO6392Code() );

		YCFSecISOLangByCode2IdxKey keyCode2Idx = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOLang().newCode2IdxKey();
		keyCode2Idx.setOptionalISO6391Code( existing.getOptionalISO6391Code() );


		schema.getISOCtryLangTableObj().deepDisposeISOCtryLangByLangIdx( existing.getRequiredISOLangId() );

		if( indexByCode3Idx != null ) {
			indexByCode3Idx.remove( keyCode3Idx );
		}

		if( indexByCode2Idx != null ) {
			if( indexByCode2Idx.containsKey( keyCode2Idx ) ) {
				indexByCode2Idx.get( keyCode2Idx ).remove( pkey );
				if( indexByCode2Idx.get( keyCode2Idx ).size() <= 0 ) {
					indexByCode2Idx.remove( keyCode2Idx );
				}
			}
		}


	}
	public void deepDisposeISOLang( YCFSecISOLangPKey pkey ) {
		IYCFSecISOLangObj obj = readCachedISOLang( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFSecISOLangObj lockISOLang( YCFSecISOLangPKey pkey ) {
		IYCFSecISOLangObj locked = null;
		YCFSecISOLangBuff lockBuff = ((IYCFSecSchema)schema.getBackingStore()).getTableISOLang().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getISOLangTableObj().newInstance();
			locked.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOLang().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFSecISOLangObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockISOLang", pkey );
		}
		return( locked );
	}

	public List<IYCFSecISOLangObj> readAllISOLang() {
		return( readAllISOLang( false ) );
	}

	public List<IYCFSecISOLangObj> readAllISOLang( boolean forceRead ) {
		final String S_ProcName = "readAllISOLang";
		if( ( allISOLang == null ) || forceRead ) {
			Map<YCFSecISOLangPKey, IYCFSecISOLangObj> map = new HashMap<YCFSecISOLangPKey,IYCFSecISOLangObj>();
			allISOLang = map;
			YCFSecISOLangBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableISOLang().readAllDerived( schema.getAuthorization() );
			YCFSecISOLangBuff buff;
			IYCFSecISOLangObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOLang().newPKey() );
				obj.setBuff( buff );
				IYCFSecISOLangObj realised = (IYCFSecISOLangObj)obj.realise();
			}
		}
		int len = allISOLang.size();
		IYCFSecISOLangObj arr[] = new IYCFSecISOLangObj[len];
		Iterator<IYCFSecISOLangObj> valIter = allISOLang.values().iterator();
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
		ArrayList<IYCFSecISOLangObj> arrayList = new ArrayList<IYCFSecISOLangObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecISOLangObj> cmp = new Comparator<IYCFSecISOLangObj>() {
			public int compare( IYCFSecISOLangObj lhs, IYCFSecISOLangObj rhs ) {
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
					YCFSecISOLangPKey lhsPKey = lhs.getPKey();
					YCFSecISOLangPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecISOLangObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecISOLangObj> readCachedAllISOLang() {
		final String S_ProcName = "readCachedAllISOLang";
		ArrayList<IYCFSecISOLangObj> arrayList = new ArrayList<IYCFSecISOLangObj>();
		if( allISOLang != null ) {
			int len = allISOLang.size();
			IYCFSecISOLangObj arr[] = new IYCFSecISOLangObj[len];
			Iterator<IYCFSecISOLangObj> valIter = allISOLang.values().iterator();
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
		Comparator<IYCFSecISOLangObj> cmp = new Comparator<IYCFSecISOLangObj>() {
			public int compare( IYCFSecISOLangObj lhs, IYCFSecISOLangObj rhs ) {
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
					YCFSecISOLangPKey lhsPKey = lhs.getPKey();
					YCFSecISOLangPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFSecISOLangObj readISOLangByIdIdx( short ISOLangId )
	{
		return( readISOLangByIdIdx( ISOLangId,
			false ) );
	}

	public IYCFSecISOLangObj readISOLangByIdIdx( short ISOLangId, boolean forceRead )
	{
		YCFSecISOLangPKey pkey = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOLang().newPKey();
		pkey.setRequiredISOLangId( ISOLangId );
		IYCFSecISOLangObj obj = readISOLang( pkey, forceRead );
		return( obj );
	}

	public IYCFSecISOLangObj readISOLangByCode3Idx( String ISO6392Code )
	{
		return( readISOLangByCode3Idx( ISO6392Code,
			false ) );
	}

	public IYCFSecISOLangObj readISOLangByCode3Idx( String ISO6392Code, boolean forceRead )
	{
		if( indexByCode3Idx == null ) {
			indexByCode3Idx = new HashMap< YCFSecISOLangByCode3IdxKey,
				IYCFSecISOLangObj >();
		}
		YCFSecISOLangByCode3IdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOLang().newCode3IdxKey();
		key.setRequiredISO6392Code( ISO6392Code );
		IYCFSecISOLangObj obj = null;
		if( ( ! forceRead ) && indexByCode3Idx.containsKey( key ) ) {
			obj = indexByCode3Idx.get( key );
		}
		else {
			YCFSecISOLangBuff buff = ((IYCFSecSchema)schema.getBackingStore()).getTableISOLang().readDerivedByCode3Idx( schema.getAuthorization(),
				ISO6392Code );
			if( buff != null ) {
				obj = schema.getISOLangTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOLang().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFSecISOLangObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFSecISOLangObj> readISOLangByCode2Idx( String ISO6391Code )
	{
		return( readISOLangByCode2Idx( ISO6391Code,
			false ) );
	}

	public List<IYCFSecISOLangObj> readISOLangByCode2Idx( String ISO6391Code,
		boolean forceRead )
	{
		final String S_ProcName = "readISOLangByCode2Idx";
		YCFSecISOLangByCode2IdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOLang().newCode2IdxKey();
		key.setOptionalISO6391Code( ISO6391Code );
		Map<YCFSecISOLangPKey, IYCFSecISOLangObj> dict;
		if( indexByCode2Idx == null ) {
			indexByCode2Idx = new HashMap< YCFSecISOLangByCode2IdxKey,
				Map< YCFSecISOLangPKey, IYCFSecISOLangObj > >();
		}
		if( ( ! forceRead ) && indexByCode2Idx.containsKey( key ) ) {
			dict = indexByCode2Idx.get( key );
		}
		else {
			dict = new HashMap<YCFSecISOLangPKey, IYCFSecISOLangObj>();
			IYCFSecISOLangObj obj;
			YCFSecISOLangBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableISOLang().readDerivedByCode2Idx( schema.getAuthorization(),
				ISO6391Code );
			YCFSecISOLangBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getISOLangTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOLang().newPKey() );
				obj.setBuff( buff );
				IYCFSecISOLangObj realised = (IYCFSecISOLangObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByCode2Idx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecISOLangObj arr[] = new IYCFSecISOLangObj[len];
		Iterator<IYCFSecISOLangObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecISOLangObj> arrayList = new ArrayList<IYCFSecISOLangObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecISOLangObj> cmp = new Comparator<IYCFSecISOLangObj>() {
			public int compare( IYCFSecISOLangObj lhs, IYCFSecISOLangObj rhs ) {
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
					YCFSecISOLangPKey lhsPKey = lhs.getPKey();
					YCFSecISOLangPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecISOLangObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFSecISOLangObj readCachedISOLangByIdIdx( short ISOLangId )
	{
		IYCFSecISOLangObj obj = null;
		YCFSecISOLangPKey pkey = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOLang().newPKey();
		pkey.setRequiredISOLangId( ISOLangId );
		obj = readCachedISOLang( pkey );
		return( obj );
	}

	public IYCFSecISOLangObj readCachedISOLangByCode3Idx( String ISO6392Code )
	{
		IYCFSecISOLangObj obj = null;
		YCFSecISOLangByCode3IdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOLang().newCode3IdxKey();
		key.setRequiredISO6392Code( ISO6392Code );
		if( indexByCode3Idx != null ) {
			if( indexByCode3Idx.containsKey( key ) ) {
				obj = indexByCode3Idx.get( key );
			}
			else {
				Iterator<IYCFSecISOLangObj> valIter = members.values().iterator();
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
			Iterator<IYCFSecISOLangObj> valIter = members.values().iterator();
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

	public List<IYCFSecISOLangObj> readCachedISOLangByCode2Idx( String ISO6391Code )
	{
		final String S_ProcName = "readCachedISOLangByCode2Idx";
		YCFSecISOLangByCode2IdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOLang().newCode2IdxKey();
		key.setOptionalISO6391Code( ISO6391Code );
		ArrayList<IYCFSecISOLangObj> arrayList = new ArrayList<IYCFSecISOLangObj>();
		if( indexByCode2Idx != null ) {
			Map<YCFSecISOLangPKey, IYCFSecISOLangObj> dict;
			if( indexByCode2Idx.containsKey( key ) ) {
				dict = indexByCode2Idx.get( key );
				int len = dict.size();
				IYCFSecISOLangObj arr[] = new IYCFSecISOLangObj[len];
				Iterator<IYCFSecISOLangObj> valIter = dict.values().iterator();
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
			IYCFSecISOLangObj obj;
			Iterator<IYCFSecISOLangObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecISOLangObj> cmp = new Comparator<IYCFSecISOLangObj>() {
			public int compare( IYCFSecISOLangObj lhs, IYCFSecISOLangObj rhs ) {
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
					YCFSecISOLangPKey lhsPKey = lhs.getPKey();
					YCFSecISOLangPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeISOLangByIdIdx( short ISOLangId )
	{
		IYCFSecISOLangObj obj = readCachedISOLangByIdIdx( ISOLangId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeISOLangByCode3Idx( String ISO6392Code )
	{
		IYCFSecISOLangObj obj = readCachedISOLangByCode3Idx( ISO6392Code );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeISOLangByCode2Idx( String ISO6391Code )
	{
		final String S_ProcName = "deepDisposeISOLangByCode2Idx";
		IYCFSecISOLangObj obj;
		List<IYCFSecISOLangObj> arrayList = readCachedISOLangByCode2Idx( ISO6391Code );
		if( arrayList != null )  {
			Iterator<IYCFSecISOLangObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFSecISOLangObj updateISOLang( IYCFSecISOLangObj Obj ) {
		IYCFSecISOLangObj obj = Obj;
		((IYCFSecSchema)schema.getBackingStore()).getTableISOLang().updateISOLang( schema.getAuthorization(),
			Obj.getISOLangBuff() );
		obj = (IYCFSecISOLangObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteISOLang( IYCFSecISOLangObj Obj ) {
		IYCFSecISOLangObj obj = Obj;
		((IYCFSecSchema)schema.getBackingStore()).getTableISOLang().deleteISOLang( schema.getAuthorization(),
			obj.getISOLangBuff() );
		Obj.forget();
	}

	public void deleteISOLangByIdIdx( short ISOLangId )
	{
		YCFSecISOLangPKey pkey = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOLang().newPKey();
		pkey.setRequiredISOLangId( ISOLangId );
		IYCFSecISOLangObj obj = readISOLang( pkey );
		if( obj != null ) {
			IYCFSecISOLangEditObj editObj = (IYCFSecISOLangEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFSecISOLangEditObj)obj.beginEdit();
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
		deepDisposeISOLangByIdIdx( ISOLangId );
	}

	public void deleteISOLangByCode3Idx( String ISO6392Code )
	{
		if( indexByCode3Idx == null ) {
			indexByCode3Idx = new HashMap< YCFSecISOLangByCode3IdxKey,
				IYCFSecISOLangObj >();
		}
		YCFSecISOLangByCode3IdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOLang().newCode3IdxKey();
		key.setRequiredISO6392Code( ISO6392Code );
		IYCFSecISOLangObj obj = null;
		if( indexByCode3Idx.containsKey( key ) ) {
			obj = indexByCode3Idx.get( key );
			((IYCFSecSchema)schema.getBackingStore()).getTableISOLang().deleteISOLangByCode3Idx( schema.getAuthorization(),
				ISO6392Code );
			obj.forget();
		}
		else {
			((IYCFSecSchema)schema.getBackingStore()).getTableISOLang().deleteISOLangByCode3Idx( schema.getAuthorization(),
				ISO6392Code );
		}
		deepDisposeISOLangByCode3Idx( ISO6392Code );
	}

	public void deleteISOLangByCode2Idx( String ISO6391Code )
	{
		YCFSecISOLangByCode2IdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOLang().newCode2IdxKey();
		key.setOptionalISO6391Code( ISO6391Code );
		if( indexByCode2Idx == null ) {
			indexByCode2Idx = new HashMap< YCFSecISOLangByCode2IdxKey,
				Map< YCFSecISOLangPKey, IYCFSecISOLangObj > >();
		}
		if( indexByCode2Idx.containsKey( key ) ) {
			Map<YCFSecISOLangPKey, IYCFSecISOLangObj> dict = indexByCode2Idx.get( key );
			((IYCFSecSchema)schema.getBackingStore()).getTableISOLang().deleteISOLangByCode2Idx( schema.getAuthorization(),
				ISO6391Code );
			Iterator<IYCFSecISOLangObj> iter = dict.values().iterator();
			IYCFSecISOLangObj obj;
			List<IYCFSecISOLangObj> toForget = new LinkedList<IYCFSecISOLangObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByCode2Idx.remove( key );
		}
		else {
			((IYCFSecSchema)schema.getBackingStore()).getTableISOLang().deleteISOLangByCode2Idx( schema.getAuthorization(),
				ISO6391Code );
		}
		deepDisposeISOLangByCode2Idx( ISO6391Code );
	}
}
