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

public class YCFSecISOCtryCcyTableObj
	implements IYCFSecISOCtryCcyTableObj
{
	protected IYCFSecSchemaObj schema;
	private Map<YCFSecISOCtryCcyPKey, IYCFSecISOCtryCcyObj> members;
	private Map<YCFSecISOCtryCcyPKey, IYCFSecISOCtryCcyObj> allISOCtryCcy;
	private Map< YCFSecISOCtryCcyByCtryIdxKey,
		Map<YCFSecISOCtryCcyPKey, IYCFSecISOCtryCcyObj > > indexByCtryIdx;
	private Map< YCFSecISOCtryCcyByCcyIdxKey,
		Map<YCFSecISOCtryCcyPKey, IYCFSecISOCtryCcyObj > > indexByCcyIdx;
	public static String TABLE_NAME = "ISOCtryCcy";
	public static String TABLE_DBNAME = "iso_cntryccy";

	public YCFSecISOCtryCcyTableObj() {
		schema = null;
		members = new HashMap<YCFSecISOCtryCcyPKey, IYCFSecISOCtryCcyObj>();
		allISOCtryCcy = null;
		indexByCtryIdx = null;
		indexByCcyIdx = null;
	}

	public YCFSecISOCtryCcyTableObj( IYCFSecSchemaObj argSchema ) {
		schema = (IYCFSecSchemaObj)argSchema;
		members = new HashMap<YCFSecISOCtryCcyPKey, IYCFSecISOCtryCcyObj>();
		allISOCtryCcy = null;
		indexByCtryIdx = null;
		indexByCcyIdx = null;
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
		allISOCtryCcy = null;
		indexByCtryIdx = null;
		indexByCcyIdx = null;
		List<IYCFSecISOCtryCcyObj> toForget = new LinkedList<IYCFSecISOCtryCcyObj>();
		IYCFSecISOCtryCcyObj cur = null;
		Iterator<IYCFSecISOCtryCcyObj> iter = members.values().iterator();
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
	 *	YCFSecISOCtryCcyObj.
	 */
	public IYCFSecISOCtryCcyObj newInstance() {
		IYCFSecISOCtryCcyObj inst = new YCFSecISOCtryCcyObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFSecISOCtryCcyObj.
	 */
	public IYCFSecISOCtryCcyEditObj newEditInstance( IYCFSecISOCtryCcyObj orig ) {
		IYCFSecISOCtryCcyEditObj edit = new YCFSecISOCtryCcyEditObj( orig );
		return( edit );
	}

	public IYCFSecISOCtryCcyObj realiseISOCtryCcy( IYCFSecISOCtryCcyObj Obj ) {
		IYCFSecISOCtryCcyObj obj = Obj;
		YCFSecISOCtryCcyPKey pkey = obj.getPKey();
		IYCFSecISOCtryCcyObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFSecISOCtryCcyObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByCtryIdx != null ) {
				YCFSecISOCtryCcyByCtryIdxKey keyCtryIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryCcy().newCtryIdxKey();
				keyCtryIdx.setRequiredISOCtryId( keepObj.getRequiredISOCtryId() );
				Map<YCFSecISOCtryCcyPKey, IYCFSecISOCtryCcyObj > mapCtryIdx = indexByCtryIdx.get( keyCtryIdx );
				if( mapCtryIdx != null ) {
					mapCtryIdx.remove( keepObj.getPKey() );
					if( mapCtryIdx.size() <= 0 ) {
						indexByCtryIdx.remove( keyCtryIdx );
					}
				}
			}

			if( indexByCcyIdx != null ) {
				YCFSecISOCtryCcyByCcyIdxKey keyCcyIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryCcy().newCcyIdxKey();
				keyCcyIdx.setRequiredISOCcyId( keepObj.getRequiredISOCcyId() );
				Map<YCFSecISOCtryCcyPKey, IYCFSecISOCtryCcyObj > mapCcyIdx = indexByCcyIdx.get( keyCcyIdx );
				if( mapCcyIdx != null ) {
					mapCcyIdx.remove( keepObj.getPKey() );
					if( mapCcyIdx.size() <= 0 ) {
						indexByCcyIdx.remove( keyCcyIdx );
					}
				}
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByCtryIdx != null ) {
				YCFSecISOCtryCcyByCtryIdxKey keyCtryIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryCcy().newCtryIdxKey();
				keyCtryIdx.setRequiredISOCtryId( keepObj.getRequiredISOCtryId() );
				Map<YCFSecISOCtryCcyPKey, IYCFSecISOCtryCcyObj > mapCtryIdx = indexByCtryIdx.get( keyCtryIdx );
				if( mapCtryIdx != null ) {
					mapCtryIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCcyIdx != null ) {
				YCFSecISOCtryCcyByCcyIdxKey keyCcyIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryCcy().newCcyIdxKey();
				keyCcyIdx.setRequiredISOCcyId( keepObj.getRequiredISOCcyId() );
				Map<YCFSecISOCtryCcyPKey, IYCFSecISOCtryCcyObj > mapCcyIdx = indexByCcyIdx.get( keyCcyIdx );
				if( mapCcyIdx != null ) {
					mapCcyIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allISOCtryCcy != null ) {
				allISOCtryCcy.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allISOCtryCcy != null ) {
				allISOCtryCcy.put( keepObj.getPKey(), keepObj );
			}

			if( indexByCtryIdx != null ) {
				YCFSecISOCtryCcyByCtryIdxKey keyCtryIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryCcy().newCtryIdxKey();
				keyCtryIdx.setRequiredISOCtryId( keepObj.getRequiredISOCtryId() );
				Map<YCFSecISOCtryCcyPKey, IYCFSecISOCtryCcyObj > mapCtryIdx = indexByCtryIdx.get( keyCtryIdx );
				if( mapCtryIdx != null ) {
					mapCtryIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByCcyIdx != null ) {
				YCFSecISOCtryCcyByCcyIdxKey keyCcyIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryCcy().newCcyIdxKey();
				keyCcyIdx.setRequiredISOCcyId( keepObj.getRequiredISOCcyId() );
				Map<YCFSecISOCtryCcyPKey, IYCFSecISOCtryCcyObj > mapCcyIdx = indexByCcyIdx.get( keyCcyIdx );
				if( mapCcyIdx != null ) {
					mapCcyIdx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFSecISOCtryCcyObj createISOCtryCcy( IYCFSecISOCtryCcyObj Obj ) {
		IYCFSecISOCtryCcyObj obj = Obj;
		YCFSecISOCtryCcyBuff buff = obj.getISOCtryCcyBuff();
		((IYCFSecSchema)schema.getBackingStore()).getTableISOCtryCcy().createISOCtryCcy(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFSecISOCtryCcyObj readISOCtryCcy( YCFSecISOCtryCcyPKey pkey ) {
		return( readISOCtryCcy( pkey, false ) );
	}

	public IYCFSecISOCtryCcyObj readISOCtryCcy( YCFSecISOCtryCcyPKey pkey, boolean forceRead ) {
		IYCFSecISOCtryCcyObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFSecISOCtryCcyBuff readBuff = ((IYCFSecSchema)schema.getBackingStore()).getTableISOCtryCcy().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredISOCtryId(),
				pkey.getRequiredISOCcyId() );
			if( readBuff != null ) {
				obj = schema.getISOCtryCcyTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryCcy().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFSecISOCtryCcyObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecISOCtryCcyObj readCachedISOCtryCcy( YCFSecISOCtryCcyPKey pkey ) {
		IYCFSecISOCtryCcyObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeISOCtryCcy( IYCFSecISOCtryCcyObj obj )
	{
		final String S_ProcName = "YCFSecISOCtryCcyTableObj.reallyDeepDisposeISOCtryCcy() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFSecISOCtryCcyPKey pkey = obj.getPKey();
		IYCFSecISOCtryCcyObj existing = readCachedISOCtryCcy( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFSecISOCtryCcyByCtryIdxKey keyCtryIdx = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryCcy().newCtryIdxKey();
		keyCtryIdx.setRequiredISOCtryId( existing.getRequiredISOCtryId() );

		YCFSecISOCtryCcyByCcyIdxKey keyCcyIdx = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryCcy().newCcyIdxKey();
		keyCcyIdx.setRequiredISOCcyId( existing.getRequiredISOCcyId() );



		if( indexByCtryIdx != null ) {
			if( indexByCtryIdx.containsKey( keyCtryIdx ) ) {
				indexByCtryIdx.get( keyCtryIdx ).remove( pkey );
				if( indexByCtryIdx.get( keyCtryIdx ).size() <= 0 ) {
					indexByCtryIdx.remove( keyCtryIdx );
				}
			}
		}

		if( indexByCcyIdx != null ) {
			if( indexByCcyIdx.containsKey( keyCcyIdx ) ) {
				indexByCcyIdx.get( keyCcyIdx ).remove( pkey );
				if( indexByCcyIdx.get( keyCcyIdx ).size() <= 0 ) {
					indexByCcyIdx.remove( keyCcyIdx );
				}
			}
		}


	}
	public void deepDisposeISOCtryCcy( YCFSecISOCtryCcyPKey pkey ) {
		IYCFSecISOCtryCcyObj obj = readCachedISOCtryCcy( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFSecISOCtryCcyObj lockISOCtryCcy( YCFSecISOCtryCcyPKey pkey ) {
		IYCFSecISOCtryCcyObj locked = null;
		YCFSecISOCtryCcyBuff lockBuff = ((IYCFSecSchema)schema.getBackingStore()).getTableISOCtryCcy().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getISOCtryCcyTableObj().newInstance();
			locked.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryCcy().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFSecISOCtryCcyObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockISOCtryCcy", pkey );
		}
		return( locked );
	}

	public List<IYCFSecISOCtryCcyObj> readAllISOCtryCcy() {
		return( readAllISOCtryCcy( false ) );
	}

	public List<IYCFSecISOCtryCcyObj> readAllISOCtryCcy( boolean forceRead ) {
		final String S_ProcName = "readAllISOCtryCcy";
		if( ( allISOCtryCcy == null ) || forceRead ) {
			Map<YCFSecISOCtryCcyPKey, IYCFSecISOCtryCcyObj> map = new HashMap<YCFSecISOCtryCcyPKey,IYCFSecISOCtryCcyObj>();
			allISOCtryCcy = map;
			YCFSecISOCtryCcyBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableISOCtryCcy().readAllDerived( schema.getAuthorization() );
			YCFSecISOCtryCcyBuff buff;
			IYCFSecISOCtryCcyObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryCcy().newPKey() );
				obj.setBuff( buff );
				IYCFSecISOCtryCcyObj realised = (IYCFSecISOCtryCcyObj)obj.realise();
			}
		}
		int len = allISOCtryCcy.size();
		IYCFSecISOCtryCcyObj arr[] = new IYCFSecISOCtryCcyObj[len];
		Iterator<IYCFSecISOCtryCcyObj> valIter = allISOCtryCcy.values().iterator();
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
		ArrayList<IYCFSecISOCtryCcyObj> arrayList = new ArrayList<IYCFSecISOCtryCcyObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecISOCtryCcyObj> cmp = new Comparator<IYCFSecISOCtryCcyObj>() {
			public int compare( IYCFSecISOCtryCcyObj lhs, IYCFSecISOCtryCcyObj rhs ) {
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
					YCFSecISOCtryCcyPKey lhsPKey = lhs.getPKey();
					YCFSecISOCtryCcyPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecISOCtryCcyObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecISOCtryCcyObj> readCachedAllISOCtryCcy() {
		final String S_ProcName = "readCachedAllISOCtryCcy";
		ArrayList<IYCFSecISOCtryCcyObj> arrayList = new ArrayList<IYCFSecISOCtryCcyObj>();
		if( allISOCtryCcy != null ) {
			int len = allISOCtryCcy.size();
			IYCFSecISOCtryCcyObj arr[] = new IYCFSecISOCtryCcyObj[len];
			Iterator<IYCFSecISOCtryCcyObj> valIter = allISOCtryCcy.values().iterator();
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
		Comparator<IYCFSecISOCtryCcyObj> cmp = new Comparator<IYCFSecISOCtryCcyObj>() {
			public int compare( IYCFSecISOCtryCcyObj lhs, IYCFSecISOCtryCcyObj rhs ) {
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
					YCFSecISOCtryCcyPKey lhsPKey = lhs.getPKey();
					YCFSecISOCtryCcyPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFSecISOCtryCcyObj readISOCtryCcyByIdIdx( short ISOCtryId,
		short ISOCcyId )
	{
		return( readISOCtryCcyByIdIdx( ISOCtryId,
			ISOCcyId,
			false ) );
	}

	public IYCFSecISOCtryCcyObj readISOCtryCcyByIdIdx( short ISOCtryId,
		short ISOCcyId, boolean forceRead )
	{
		YCFSecISOCtryCcyPKey pkey = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryCcy().newPKey();
		pkey.setRequiredISOCtryId( ISOCtryId );
		pkey.setRequiredISOCcyId( ISOCcyId );
		IYCFSecISOCtryCcyObj obj = readISOCtryCcy( pkey, forceRead );
		return( obj );
	}

	public List<IYCFSecISOCtryCcyObj> readISOCtryCcyByCtryIdx( short ISOCtryId )
	{
		return( readISOCtryCcyByCtryIdx( ISOCtryId,
			false ) );
	}

	public List<IYCFSecISOCtryCcyObj> readISOCtryCcyByCtryIdx( short ISOCtryId,
		boolean forceRead )
	{
		final String S_ProcName = "readISOCtryCcyByCtryIdx";
		YCFSecISOCtryCcyByCtryIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryCcy().newCtryIdxKey();
		key.setRequiredISOCtryId( ISOCtryId );
		Map<YCFSecISOCtryCcyPKey, IYCFSecISOCtryCcyObj> dict;
		if( indexByCtryIdx == null ) {
			indexByCtryIdx = new HashMap< YCFSecISOCtryCcyByCtryIdxKey,
				Map< YCFSecISOCtryCcyPKey, IYCFSecISOCtryCcyObj > >();
		}
		if( ( ! forceRead ) && indexByCtryIdx.containsKey( key ) ) {
			dict = indexByCtryIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecISOCtryCcyPKey, IYCFSecISOCtryCcyObj>();
			IYCFSecISOCtryCcyObj obj;
			YCFSecISOCtryCcyBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableISOCtryCcy().readDerivedByCtryIdx( schema.getAuthorization(),
				ISOCtryId );
			YCFSecISOCtryCcyBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getISOCtryCcyTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryCcy().newPKey() );
				obj.setBuff( buff );
				IYCFSecISOCtryCcyObj realised = (IYCFSecISOCtryCcyObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByCtryIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecISOCtryCcyObj arr[] = new IYCFSecISOCtryCcyObj[len];
		Iterator<IYCFSecISOCtryCcyObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecISOCtryCcyObj> arrayList = new ArrayList<IYCFSecISOCtryCcyObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecISOCtryCcyObj> cmp = new Comparator<IYCFSecISOCtryCcyObj>() {
			public int compare( IYCFSecISOCtryCcyObj lhs, IYCFSecISOCtryCcyObj rhs ) {
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
					YCFSecISOCtryCcyPKey lhsPKey = lhs.getPKey();
					YCFSecISOCtryCcyPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecISOCtryCcyObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecISOCtryCcyObj> readISOCtryCcyByCcyIdx( short ISOCcyId )
	{
		return( readISOCtryCcyByCcyIdx( ISOCcyId,
			false ) );
	}

	public List<IYCFSecISOCtryCcyObj> readISOCtryCcyByCcyIdx( short ISOCcyId,
		boolean forceRead )
	{
		final String S_ProcName = "readISOCtryCcyByCcyIdx";
		YCFSecISOCtryCcyByCcyIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryCcy().newCcyIdxKey();
		key.setRequiredISOCcyId( ISOCcyId );
		Map<YCFSecISOCtryCcyPKey, IYCFSecISOCtryCcyObj> dict;
		if( indexByCcyIdx == null ) {
			indexByCcyIdx = new HashMap< YCFSecISOCtryCcyByCcyIdxKey,
				Map< YCFSecISOCtryCcyPKey, IYCFSecISOCtryCcyObj > >();
		}
		if( ( ! forceRead ) && indexByCcyIdx.containsKey( key ) ) {
			dict = indexByCcyIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecISOCtryCcyPKey, IYCFSecISOCtryCcyObj>();
			IYCFSecISOCtryCcyObj obj;
			YCFSecISOCtryCcyBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableISOCtryCcy().readDerivedByCcyIdx( schema.getAuthorization(),
				ISOCcyId );
			YCFSecISOCtryCcyBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getISOCtryCcyTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryCcy().newPKey() );
				obj.setBuff( buff );
				IYCFSecISOCtryCcyObj realised = (IYCFSecISOCtryCcyObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByCcyIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecISOCtryCcyObj arr[] = new IYCFSecISOCtryCcyObj[len];
		Iterator<IYCFSecISOCtryCcyObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecISOCtryCcyObj> arrayList = new ArrayList<IYCFSecISOCtryCcyObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecISOCtryCcyObj> cmp = new Comparator<IYCFSecISOCtryCcyObj>() {
			public int compare( IYCFSecISOCtryCcyObj lhs, IYCFSecISOCtryCcyObj rhs ) {
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
					YCFSecISOCtryCcyPKey lhsPKey = lhs.getPKey();
					YCFSecISOCtryCcyPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecISOCtryCcyObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFSecISOCtryCcyObj readCachedISOCtryCcyByIdIdx( short ISOCtryId,
		short ISOCcyId )
	{
		IYCFSecISOCtryCcyObj obj = null;
		YCFSecISOCtryCcyPKey pkey = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryCcy().newPKey();
		pkey.setRequiredISOCtryId( ISOCtryId );
		pkey.setRequiredISOCcyId( ISOCcyId );
		obj = readCachedISOCtryCcy( pkey );
		return( obj );
	}

	public List<IYCFSecISOCtryCcyObj> readCachedISOCtryCcyByCtryIdx( short ISOCtryId )
	{
		final String S_ProcName = "readCachedISOCtryCcyByCtryIdx";
		YCFSecISOCtryCcyByCtryIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryCcy().newCtryIdxKey();
		key.setRequiredISOCtryId( ISOCtryId );
		ArrayList<IYCFSecISOCtryCcyObj> arrayList = new ArrayList<IYCFSecISOCtryCcyObj>();
		if( indexByCtryIdx != null ) {
			Map<YCFSecISOCtryCcyPKey, IYCFSecISOCtryCcyObj> dict;
			if( indexByCtryIdx.containsKey( key ) ) {
				dict = indexByCtryIdx.get( key );
				int len = dict.size();
				IYCFSecISOCtryCcyObj arr[] = new IYCFSecISOCtryCcyObj[len];
				Iterator<IYCFSecISOCtryCcyObj> valIter = dict.values().iterator();
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
			IYCFSecISOCtryCcyObj obj;
			Iterator<IYCFSecISOCtryCcyObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecISOCtryCcyObj> cmp = new Comparator<IYCFSecISOCtryCcyObj>() {
			public int compare( IYCFSecISOCtryCcyObj lhs, IYCFSecISOCtryCcyObj rhs ) {
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
					YCFSecISOCtryCcyPKey lhsPKey = lhs.getPKey();
					YCFSecISOCtryCcyPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<IYCFSecISOCtryCcyObj> readCachedISOCtryCcyByCcyIdx( short ISOCcyId )
	{
		final String S_ProcName = "readCachedISOCtryCcyByCcyIdx";
		YCFSecISOCtryCcyByCcyIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryCcy().newCcyIdxKey();
		key.setRequiredISOCcyId( ISOCcyId );
		ArrayList<IYCFSecISOCtryCcyObj> arrayList = new ArrayList<IYCFSecISOCtryCcyObj>();
		if( indexByCcyIdx != null ) {
			Map<YCFSecISOCtryCcyPKey, IYCFSecISOCtryCcyObj> dict;
			if( indexByCcyIdx.containsKey( key ) ) {
				dict = indexByCcyIdx.get( key );
				int len = dict.size();
				IYCFSecISOCtryCcyObj arr[] = new IYCFSecISOCtryCcyObj[len];
				Iterator<IYCFSecISOCtryCcyObj> valIter = dict.values().iterator();
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
			IYCFSecISOCtryCcyObj obj;
			Iterator<IYCFSecISOCtryCcyObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecISOCtryCcyObj> cmp = new Comparator<IYCFSecISOCtryCcyObj>() {
			public int compare( IYCFSecISOCtryCcyObj lhs, IYCFSecISOCtryCcyObj rhs ) {
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
					YCFSecISOCtryCcyPKey lhsPKey = lhs.getPKey();
					YCFSecISOCtryCcyPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeISOCtryCcyByIdIdx( short ISOCtryId,
		short ISOCcyId )
	{
		IYCFSecISOCtryCcyObj obj = readCachedISOCtryCcyByIdIdx( ISOCtryId,
				ISOCcyId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeISOCtryCcyByCtryIdx( short ISOCtryId )
	{
		final String S_ProcName = "deepDisposeISOCtryCcyByCtryIdx";
		IYCFSecISOCtryCcyObj obj;
		List<IYCFSecISOCtryCcyObj> arrayList = readCachedISOCtryCcyByCtryIdx( ISOCtryId );
		if( arrayList != null )  {
			Iterator<IYCFSecISOCtryCcyObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeISOCtryCcyByCcyIdx( short ISOCcyId )
	{
		final String S_ProcName = "deepDisposeISOCtryCcyByCcyIdx";
		IYCFSecISOCtryCcyObj obj;
		List<IYCFSecISOCtryCcyObj> arrayList = readCachedISOCtryCcyByCcyIdx( ISOCcyId );
		if( arrayList != null )  {
			Iterator<IYCFSecISOCtryCcyObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFSecISOCtryCcyObj updateISOCtryCcy( IYCFSecISOCtryCcyObj Obj ) {
		IYCFSecISOCtryCcyObj obj = Obj;
		((IYCFSecSchema)schema.getBackingStore()).getTableISOCtryCcy().updateISOCtryCcy( schema.getAuthorization(),
			Obj.getISOCtryCcyBuff() );
		obj = (IYCFSecISOCtryCcyObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteISOCtryCcy( IYCFSecISOCtryCcyObj Obj ) {
		IYCFSecISOCtryCcyObj obj = Obj;
		((IYCFSecSchema)schema.getBackingStore()).getTableISOCtryCcy().deleteISOCtryCcy( schema.getAuthorization(),
			obj.getISOCtryCcyBuff() );
		Obj.forget();
	}

	public void deleteISOCtryCcyByIdIdx( short ISOCtryId,
		short ISOCcyId )
	{
		YCFSecISOCtryCcyPKey pkey = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryCcy().newPKey();
		pkey.setRequiredISOCtryId( ISOCtryId );
		pkey.setRequiredISOCcyId( ISOCcyId );
		IYCFSecISOCtryCcyObj obj = readISOCtryCcy( pkey );
		if( obj != null ) {
			IYCFSecISOCtryCcyEditObj editObj = (IYCFSecISOCtryCcyEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFSecISOCtryCcyEditObj)obj.beginEdit();
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
		deepDisposeISOCtryCcyByIdIdx( ISOCtryId,
				ISOCcyId );
	}

	public void deleteISOCtryCcyByCtryIdx( short ISOCtryId )
	{
		YCFSecISOCtryCcyByCtryIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryCcy().newCtryIdxKey();
		key.setRequiredISOCtryId( ISOCtryId );
		if( indexByCtryIdx == null ) {
			indexByCtryIdx = new HashMap< YCFSecISOCtryCcyByCtryIdxKey,
				Map< YCFSecISOCtryCcyPKey, IYCFSecISOCtryCcyObj > >();
		}
		if( indexByCtryIdx.containsKey( key ) ) {
			Map<YCFSecISOCtryCcyPKey, IYCFSecISOCtryCcyObj> dict = indexByCtryIdx.get( key );
			((IYCFSecSchema)schema.getBackingStore()).getTableISOCtryCcy().deleteISOCtryCcyByCtryIdx( schema.getAuthorization(),
				ISOCtryId );
			Iterator<IYCFSecISOCtryCcyObj> iter = dict.values().iterator();
			IYCFSecISOCtryCcyObj obj;
			List<IYCFSecISOCtryCcyObj> toForget = new LinkedList<IYCFSecISOCtryCcyObj>();
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
			((IYCFSecSchema)schema.getBackingStore()).getTableISOCtryCcy().deleteISOCtryCcyByCtryIdx( schema.getAuthorization(),
				ISOCtryId );
		}
		deepDisposeISOCtryCcyByCtryIdx( ISOCtryId );
	}

	public void deleteISOCtryCcyByCcyIdx( short ISOCcyId )
	{
		YCFSecISOCtryCcyByCcyIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtryCcy().newCcyIdxKey();
		key.setRequiredISOCcyId( ISOCcyId );
		if( indexByCcyIdx == null ) {
			indexByCcyIdx = new HashMap< YCFSecISOCtryCcyByCcyIdxKey,
				Map< YCFSecISOCtryCcyPKey, IYCFSecISOCtryCcyObj > >();
		}
		if( indexByCcyIdx.containsKey( key ) ) {
			Map<YCFSecISOCtryCcyPKey, IYCFSecISOCtryCcyObj> dict = indexByCcyIdx.get( key );
			((IYCFSecSchema)schema.getBackingStore()).getTableISOCtryCcy().deleteISOCtryCcyByCcyIdx( schema.getAuthorization(),
				ISOCcyId );
			Iterator<IYCFSecISOCtryCcyObj> iter = dict.values().iterator();
			IYCFSecISOCtryCcyObj obj;
			List<IYCFSecISOCtryCcyObj> toForget = new LinkedList<IYCFSecISOCtryCcyObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByCcyIdx.remove( key );
		}
		else {
			((IYCFSecSchema)schema.getBackingStore()).getTableISOCtryCcy().deleteISOCtryCcyByCcyIdx( schema.getAuthorization(),
				ISOCcyId );
		}
		deepDisposeISOCtryCcyByCcyIdx( ISOCcyId );
	}
}
