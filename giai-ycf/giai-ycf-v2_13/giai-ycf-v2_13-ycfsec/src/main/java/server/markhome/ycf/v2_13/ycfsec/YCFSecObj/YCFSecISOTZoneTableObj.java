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

public class YCFSecISOTZoneTableObj
	implements IYCFSecISOTZoneTableObj
{
	protected IYCFSecSchemaObj schema;
	private Map<YCFSecISOTZonePKey, IYCFSecISOTZoneObj> members;
	private Map<YCFSecISOTZonePKey, IYCFSecISOTZoneObj> allISOTZone;
	private Map< YCFSecISOTZoneByOffsetIdxKey,
		Map<YCFSecISOTZonePKey, IYCFSecISOTZoneObj > > indexByOffsetIdx;
	private Map< YCFSecISOTZoneByUTZNameIdxKey,
		IYCFSecISOTZoneObj > indexByUTZNameIdx;
	private Map< YCFSecISOTZoneByIso8601IdxKey,
		Map<YCFSecISOTZonePKey, IYCFSecISOTZoneObj > > indexByIso8601Idx;
	public static String TABLE_NAME = "ISOTZone";
	public static String TABLE_DBNAME = "isotz";

	public YCFSecISOTZoneTableObj() {
		schema = null;
		members = new HashMap<YCFSecISOTZonePKey, IYCFSecISOTZoneObj>();
		allISOTZone = null;
		indexByOffsetIdx = null;
		indexByUTZNameIdx = null;
		indexByIso8601Idx = null;
	}

	public YCFSecISOTZoneTableObj( IYCFSecSchemaObj argSchema ) {
		schema = (IYCFSecSchemaObj)argSchema;
		members = new HashMap<YCFSecISOTZonePKey, IYCFSecISOTZoneObj>();
		allISOTZone = null;
		indexByOffsetIdx = null;
		indexByUTZNameIdx = null;
		indexByIso8601Idx = null;
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
		allISOTZone = null;
		indexByOffsetIdx = null;
		indexByUTZNameIdx = null;
		indexByIso8601Idx = null;
		List<IYCFSecISOTZoneObj> toForget = new LinkedList<IYCFSecISOTZoneObj>();
		IYCFSecISOTZoneObj cur = null;
		Iterator<IYCFSecISOTZoneObj> iter = members.values().iterator();
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
	 *	YCFSecISOTZoneObj.
	 */
	public IYCFSecISOTZoneObj newInstance() {
		IYCFSecISOTZoneObj inst = new YCFSecISOTZoneObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFSecISOTZoneObj.
	 */
	public IYCFSecISOTZoneEditObj newEditInstance( IYCFSecISOTZoneObj orig ) {
		IYCFSecISOTZoneEditObj edit = new YCFSecISOTZoneEditObj( orig );
		return( edit );
	}

	public IYCFSecISOTZoneObj realiseISOTZone( IYCFSecISOTZoneObj Obj ) {
		IYCFSecISOTZoneObj obj = Obj;
		YCFSecISOTZonePKey pkey = obj.getPKey();
		IYCFSecISOTZoneObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFSecISOTZoneObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByOffsetIdx != null ) {
				YCFSecISOTZoneByOffsetIdxKey keyOffsetIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOTZone().newOffsetIdxKey();
				keyOffsetIdx.setRequiredTZHourOffset( keepObj.getRequiredTZHourOffset() );
				keyOffsetIdx.setRequiredTZMinOffset( keepObj.getRequiredTZMinOffset() );
				Map<YCFSecISOTZonePKey, IYCFSecISOTZoneObj > mapOffsetIdx = indexByOffsetIdx.get( keyOffsetIdx );
				if( mapOffsetIdx != null ) {
					mapOffsetIdx.remove( keepObj.getPKey() );
					if( mapOffsetIdx.size() <= 0 ) {
						indexByOffsetIdx.remove( keyOffsetIdx );
					}
				}
			}

			if( indexByUTZNameIdx != null ) {
				YCFSecISOTZoneByUTZNameIdxKey keyUTZNameIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOTZone().newUTZNameIdxKey();
				keyUTZNameIdx.setRequiredTZName( keepObj.getRequiredTZName() );
				indexByUTZNameIdx.remove( keyUTZNameIdx );
			}

			if( indexByIso8601Idx != null ) {
				YCFSecISOTZoneByIso8601IdxKey keyIso8601Idx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOTZone().newIso8601IdxKey();
				keyIso8601Idx.setRequiredIso8601( keepObj.getRequiredIso8601() );
				Map<YCFSecISOTZonePKey, IYCFSecISOTZoneObj > mapIso8601Idx = indexByIso8601Idx.get( keyIso8601Idx );
				if( mapIso8601Idx != null ) {
					mapIso8601Idx.remove( keepObj.getPKey() );
					if( mapIso8601Idx.size() <= 0 ) {
						indexByIso8601Idx.remove( keyIso8601Idx );
					}
				}
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByOffsetIdx != null ) {
				YCFSecISOTZoneByOffsetIdxKey keyOffsetIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOTZone().newOffsetIdxKey();
				keyOffsetIdx.setRequiredTZHourOffset( keepObj.getRequiredTZHourOffset() );
				keyOffsetIdx.setRequiredTZMinOffset( keepObj.getRequiredTZMinOffset() );
				Map<YCFSecISOTZonePKey, IYCFSecISOTZoneObj > mapOffsetIdx = indexByOffsetIdx.get( keyOffsetIdx );
				if( mapOffsetIdx != null ) {
					mapOffsetIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUTZNameIdx != null ) {
				YCFSecISOTZoneByUTZNameIdxKey keyUTZNameIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOTZone().newUTZNameIdxKey();
				keyUTZNameIdx.setRequiredTZName( keepObj.getRequiredTZName() );
				indexByUTZNameIdx.put( keyUTZNameIdx, keepObj );
			}

			if( indexByIso8601Idx != null ) {
				YCFSecISOTZoneByIso8601IdxKey keyIso8601Idx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOTZone().newIso8601IdxKey();
				keyIso8601Idx.setRequiredIso8601( keepObj.getRequiredIso8601() );
				Map<YCFSecISOTZonePKey, IYCFSecISOTZoneObj > mapIso8601Idx = indexByIso8601Idx.get( keyIso8601Idx );
				if( mapIso8601Idx != null ) {
					mapIso8601Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( allISOTZone != null ) {
				allISOTZone.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allISOTZone != null ) {
				allISOTZone.put( keepObj.getPKey(), keepObj );
			}

			if( indexByOffsetIdx != null ) {
				YCFSecISOTZoneByOffsetIdxKey keyOffsetIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOTZone().newOffsetIdxKey();
				keyOffsetIdx.setRequiredTZHourOffset( keepObj.getRequiredTZHourOffset() );
				keyOffsetIdx.setRequiredTZMinOffset( keepObj.getRequiredTZMinOffset() );
				Map<YCFSecISOTZonePKey, IYCFSecISOTZoneObj > mapOffsetIdx = indexByOffsetIdx.get( keyOffsetIdx );
				if( mapOffsetIdx != null ) {
					mapOffsetIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUTZNameIdx != null ) {
				YCFSecISOTZoneByUTZNameIdxKey keyUTZNameIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOTZone().newUTZNameIdxKey();
				keyUTZNameIdx.setRequiredTZName( keepObj.getRequiredTZName() );
				indexByUTZNameIdx.put( keyUTZNameIdx, keepObj );
			}

			if( indexByIso8601Idx != null ) {
				YCFSecISOTZoneByIso8601IdxKey keyIso8601Idx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOTZone().newIso8601IdxKey();
				keyIso8601Idx.setRequiredIso8601( keepObj.getRequiredIso8601() );
				Map<YCFSecISOTZonePKey, IYCFSecISOTZoneObj > mapIso8601Idx = indexByIso8601Idx.get( keyIso8601Idx );
				if( mapIso8601Idx != null ) {
					mapIso8601Idx.put( keepObj.getPKey(), keepObj );
				}
			}

		}
		return( keepObj );
	}

	public IYCFSecISOTZoneObj createISOTZone( IYCFSecISOTZoneObj Obj ) {
		IYCFSecISOTZoneObj obj = Obj;
		YCFSecISOTZoneBuff buff = obj.getISOTZoneBuff();
		((IYCFSecSchema)schema.getBackingStore()).getTableISOTZone().createISOTZone(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFSecISOTZoneObj readISOTZone( YCFSecISOTZonePKey pkey ) {
		return( readISOTZone( pkey, false ) );
	}

	public IYCFSecISOTZoneObj readISOTZone( YCFSecISOTZonePKey pkey, boolean forceRead ) {
		IYCFSecISOTZoneObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFSecISOTZoneBuff readBuff = ((IYCFSecSchema)schema.getBackingStore()).getTableISOTZone().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredISOTZoneId() );
			if( readBuff != null ) {
				obj = schema.getISOTZoneTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOTZone().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFSecISOTZoneObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecISOTZoneObj readCachedISOTZone( YCFSecISOTZonePKey pkey ) {
		IYCFSecISOTZoneObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeISOTZone( IYCFSecISOTZoneObj obj )
	{
		final String S_ProcName = "YCFSecISOTZoneTableObj.reallyDeepDisposeISOTZone() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFSecISOTZonePKey pkey = obj.getPKey();
		IYCFSecISOTZoneObj existing = readCachedISOTZone( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFSecISOTZoneByOffsetIdxKey keyOffsetIdx = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOTZone().newOffsetIdxKey();
		keyOffsetIdx.setRequiredTZHourOffset( existing.getRequiredTZHourOffset() );
		keyOffsetIdx.setRequiredTZMinOffset( existing.getRequiredTZMinOffset() );

		YCFSecISOTZoneByUTZNameIdxKey keyUTZNameIdx = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOTZone().newUTZNameIdxKey();
		keyUTZNameIdx.setRequiredTZName( existing.getRequiredTZName() );

		YCFSecISOTZoneByIso8601IdxKey keyIso8601Idx = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOTZone().newIso8601IdxKey();
		keyIso8601Idx.setRequiredIso8601( existing.getRequiredIso8601() );



		if( indexByOffsetIdx != null ) {
			if( indexByOffsetIdx.containsKey( keyOffsetIdx ) ) {
				indexByOffsetIdx.get( keyOffsetIdx ).remove( pkey );
				if( indexByOffsetIdx.get( keyOffsetIdx ).size() <= 0 ) {
					indexByOffsetIdx.remove( keyOffsetIdx );
				}
			}
		}

		if( indexByUTZNameIdx != null ) {
			indexByUTZNameIdx.remove( keyUTZNameIdx );
		}

		if( indexByIso8601Idx != null ) {
			if( indexByIso8601Idx.containsKey( keyIso8601Idx ) ) {
				indexByIso8601Idx.get( keyIso8601Idx ).remove( pkey );
				if( indexByIso8601Idx.get( keyIso8601Idx ).size() <= 0 ) {
					indexByIso8601Idx.remove( keyIso8601Idx );
				}
			}
		}


	}
	public void deepDisposeISOTZone( YCFSecISOTZonePKey pkey ) {
		IYCFSecISOTZoneObj obj = readCachedISOTZone( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFSecISOTZoneObj lockISOTZone( YCFSecISOTZonePKey pkey ) {
		IYCFSecISOTZoneObj locked = null;
		YCFSecISOTZoneBuff lockBuff = ((IYCFSecSchema)schema.getBackingStore()).getTableISOTZone().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getISOTZoneTableObj().newInstance();
			locked.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOTZone().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFSecISOTZoneObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockISOTZone", pkey );
		}
		return( locked );
	}

	public List<IYCFSecISOTZoneObj> readAllISOTZone() {
		return( readAllISOTZone( false ) );
	}

	public List<IYCFSecISOTZoneObj> readAllISOTZone( boolean forceRead ) {
		final String S_ProcName = "readAllISOTZone";
		if( ( allISOTZone == null ) || forceRead ) {
			Map<YCFSecISOTZonePKey, IYCFSecISOTZoneObj> map = new HashMap<YCFSecISOTZonePKey,IYCFSecISOTZoneObj>();
			allISOTZone = map;
			YCFSecISOTZoneBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableISOTZone().readAllDerived( schema.getAuthorization() );
			YCFSecISOTZoneBuff buff;
			IYCFSecISOTZoneObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOTZone().newPKey() );
				obj.setBuff( buff );
				IYCFSecISOTZoneObj realised = (IYCFSecISOTZoneObj)obj.realise();
			}
		}
		int len = allISOTZone.size();
		IYCFSecISOTZoneObj arr[] = new IYCFSecISOTZoneObj[len];
		Iterator<IYCFSecISOTZoneObj> valIter = allISOTZone.values().iterator();
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
		ArrayList<IYCFSecISOTZoneObj> arrayList = new ArrayList<IYCFSecISOTZoneObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecISOTZoneObj> cmp = new Comparator<IYCFSecISOTZoneObj>() {
			public int compare( IYCFSecISOTZoneObj lhs, IYCFSecISOTZoneObj rhs ) {
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
					YCFSecISOTZonePKey lhsPKey = lhs.getPKey();
					YCFSecISOTZonePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecISOTZoneObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecISOTZoneObj> readCachedAllISOTZone() {
		final String S_ProcName = "readCachedAllISOTZone";
		ArrayList<IYCFSecISOTZoneObj> arrayList = new ArrayList<IYCFSecISOTZoneObj>();
		if( allISOTZone != null ) {
			int len = allISOTZone.size();
			IYCFSecISOTZoneObj arr[] = new IYCFSecISOTZoneObj[len];
			Iterator<IYCFSecISOTZoneObj> valIter = allISOTZone.values().iterator();
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
		Comparator<IYCFSecISOTZoneObj> cmp = new Comparator<IYCFSecISOTZoneObj>() {
			public int compare( IYCFSecISOTZoneObj lhs, IYCFSecISOTZoneObj rhs ) {
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
					YCFSecISOTZonePKey lhsPKey = lhs.getPKey();
					YCFSecISOTZonePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFSecISOTZoneObj readISOTZoneByIdIdx( short ISOTZoneId )
	{
		return( readISOTZoneByIdIdx( ISOTZoneId,
			false ) );
	}

	public IYCFSecISOTZoneObj readISOTZoneByIdIdx( short ISOTZoneId, boolean forceRead )
	{
		YCFSecISOTZonePKey pkey = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOTZone().newPKey();
		pkey.setRequiredISOTZoneId( ISOTZoneId );
		IYCFSecISOTZoneObj obj = readISOTZone( pkey, forceRead );
		return( obj );
	}

	public List<IYCFSecISOTZoneObj> readISOTZoneByOffsetIdx( short TZHourOffset,
		short TZMinOffset )
	{
		return( readISOTZoneByOffsetIdx( TZHourOffset,
			TZMinOffset,
			false ) );
	}

	public List<IYCFSecISOTZoneObj> readISOTZoneByOffsetIdx( short TZHourOffset,
		short TZMinOffset,
		boolean forceRead )
	{
		final String S_ProcName = "readISOTZoneByOffsetIdx";
		YCFSecISOTZoneByOffsetIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOTZone().newOffsetIdxKey();
		key.setRequiredTZHourOffset( TZHourOffset );
		key.setRequiredTZMinOffset( TZMinOffset );
		Map<YCFSecISOTZonePKey, IYCFSecISOTZoneObj> dict;
		if( indexByOffsetIdx == null ) {
			indexByOffsetIdx = new HashMap< YCFSecISOTZoneByOffsetIdxKey,
				Map< YCFSecISOTZonePKey, IYCFSecISOTZoneObj > >();
		}
		if( ( ! forceRead ) && indexByOffsetIdx.containsKey( key ) ) {
			dict = indexByOffsetIdx.get( key );
		}
		else {
			dict = new HashMap<YCFSecISOTZonePKey, IYCFSecISOTZoneObj>();
			IYCFSecISOTZoneObj obj;
			YCFSecISOTZoneBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableISOTZone().readDerivedByOffsetIdx( schema.getAuthorization(),
				TZHourOffset,
				TZMinOffset );
			YCFSecISOTZoneBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getISOTZoneTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOTZone().newPKey() );
				obj.setBuff( buff );
				IYCFSecISOTZoneObj realised = (IYCFSecISOTZoneObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByOffsetIdx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecISOTZoneObj arr[] = new IYCFSecISOTZoneObj[len];
		Iterator<IYCFSecISOTZoneObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecISOTZoneObj> arrayList = new ArrayList<IYCFSecISOTZoneObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecISOTZoneObj> cmp = new Comparator<IYCFSecISOTZoneObj>() {
			public int compare( IYCFSecISOTZoneObj lhs, IYCFSecISOTZoneObj rhs ) {
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
					YCFSecISOTZonePKey lhsPKey = lhs.getPKey();
					YCFSecISOTZonePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecISOTZoneObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFSecISOTZoneObj readISOTZoneByUTZNameIdx( String TZName )
	{
		return( readISOTZoneByUTZNameIdx( TZName,
			false ) );
	}

	public IYCFSecISOTZoneObj readISOTZoneByUTZNameIdx( String TZName, boolean forceRead )
	{
		if( indexByUTZNameIdx == null ) {
			indexByUTZNameIdx = new HashMap< YCFSecISOTZoneByUTZNameIdxKey,
				IYCFSecISOTZoneObj >();
		}
		YCFSecISOTZoneByUTZNameIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOTZone().newUTZNameIdxKey();
		key.setRequiredTZName( TZName );
		IYCFSecISOTZoneObj obj = null;
		if( ( ! forceRead ) && indexByUTZNameIdx.containsKey( key ) ) {
			obj = indexByUTZNameIdx.get( key );
		}
		else {
			YCFSecISOTZoneBuff buff = ((IYCFSecSchema)schema.getBackingStore()).getTableISOTZone().readDerivedByUTZNameIdx( schema.getAuthorization(),
				TZName );
			if( buff != null ) {
				obj = schema.getISOTZoneTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOTZone().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFSecISOTZoneObj)obj.realise();
			}
		}
		return( obj );
	}

	public List<IYCFSecISOTZoneObj> readISOTZoneByIso8601Idx( String Iso8601 )
	{
		return( readISOTZoneByIso8601Idx( Iso8601,
			false ) );
	}

	public List<IYCFSecISOTZoneObj> readISOTZoneByIso8601Idx( String Iso8601,
		boolean forceRead )
	{
		final String S_ProcName = "readISOTZoneByIso8601Idx";
		YCFSecISOTZoneByIso8601IdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOTZone().newIso8601IdxKey();
		key.setRequiredIso8601( Iso8601 );
		Map<YCFSecISOTZonePKey, IYCFSecISOTZoneObj> dict;
		if( indexByIso8601Idx == null ) {
			indexByIso8601Idx = new HashMap< YCFSecISOTZoneByIso8601IdxKey,
				Map< YCFSecISOTZonePKey, IYCFSecISOTZoneObj > >();
		}
		if( ( ! forceRead ) && indexByIso8601Idx.containsKey( key ) ) {
			dict = indexByIso8601Idx.get( key );
		}
		else {
			dict = new HashMap<YCFSecISOTZonePKey, IYCFSecISOTZoneObj>();
			IYCFSecISOTZoneObj obj;
			YCFSecISOTZoneBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableISOTZone().readDerivedByIso8601Idx( schema.getAuthorization(),
				Iso8601 );
			YCFSecISOTZoneBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = schema.getISOTZoneTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOTZone().newPKey() );
				obj.setBuff( buff );
				IYCFSecISOTZoneObj realised = (IYCFSecISOTZoneObj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByIso8601Idx.put( key, dict );
		}
		int len = dict.size();
		IYCFSecISOTZoneObj arr[] = new IYCFSecISOTZoneObj[len];
		Iterator<IYCFSecISOTZoneObj> valIter = dict.values().iterator();
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
		ArrayList<IYCFSecISOTZoneObj> arrayList = new ArrayList<IYCFSecISOTZoneObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecISOTZoneObj> cmp = new Comparator<IYCFSecISOTZoneObj>() {
			public int compare( IYCFSecISOTZoneObj lhs, IYCFSecISOTZoneObj rhs ) {
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
					YCFSecISOTZonePKey lhsPKey = lhs.getPKey();
					YCFSecISOTZonePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecISOTZoneObj> sortedList = arrayList;
		return( sortedList );
	}

	public IYCFSecISOTZoneObj readCachedISOTZoneByIdIdx( short ISOTZoneId )
	{
		IYCFSecISOTZoneObj obj = null;
		YCFSecISOTZonePKey pkey = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOTZone().newPKey();
		pkey.setRequiredISOTZoneId( ISOTZoneId );
		obj = readCachedISOTZone( pkey );
		return( obj );
	}

	public List<IYCFSecISOTZoneObj> readCachedISOTZoneByOffsetIdx( short TZHourOffset,
		short TZMinOffset )
	{
		final String S_ProcName = "readCachedISOTZoneByOffsetIdx";
		YCFSecISOTZoneByOffsetIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOTZone().newOffsetIdxKey();
		key.setRequiredTZHourOffset( TZHourOffset );
		key.setRequiredTZMinOffset( TZMinOffset );
		ArrayList<IYCFSecISOTZoneObj> arrayList = new ArrayList<IYCFSecISOTZoneObj>();
		if( indexByOffsetIdx != null ) {
			Map<YCFSecISOTZonePKey, IYCFSecISOTZoneObj> dict;
			if( indexByOffsetIdx.containsKey( key ) ) {
				dict = indexByOffsetIdx.get( key );
				int len = dict.size();
				IYCFSecISOTZoneObj arr[] = new IYCFSecISOTZoneObj[len];
				Iterator<IYCFSecISOTZoneObj> valIter = dict.values().iterator();
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
			IYCFSecISOTZoneObj obj;
			Iterator<IYCFSecISOTZoneObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecISOTZoneObj> cmp = new Comparator<IYCFSecISOTZoneObj>() {
			public int compare( IYCFSecISOTZoneObj lhs, IYCFSecISOTZoneObj rhs ) {
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
					YCFSecISOTZonePKey lhsPKey = lhs.getPKey();
					YCFSecISOTZonePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFSecISOTZoneObj readCachedISOTZoneByUTZNameIdx( String TZName )
	{
		IYCFSecISOTZoneObj obj = null;
		YCFSecISOTZoneByUTZNameIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOTZone().newUTZNameIdxKey();
		key.setRequiredTZName( TZName );
		if( indexByUTZNameIdx != null ) {
			if( indexByUTZNameIdx.containsKey( key ) ) {
				obj = indexByUTZNameIdx.get( key );
			}
			else {
				Iterator<IYCFSecISOTZoneObj> valIter = members.values().iterator();
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
			Iterator<IYCFSecISOTZoneObj> valIter = members.values().iterator();
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

	public List<IYCFSecISOTZoneObj> readCachedISOTZoneByIso8601Idx( String Iso8601 )
	{
		final String S_ProcName = "readCachedISOTZoneByIso8601Idx";
		YCFSecISOTZoneByIso8601IdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOTZone().newIso8601IdxKey();
		key.setRequiredIso8601( Iso8601 );
		ArrayList<IYCFSecISOTZoneObj> arrayList = new ArrayList<IYCFSecISOTZoneObj>();
		if( indexByIso8601Idx != null ) {
			Map<YCFSecISOTZonePKey, IYCFSecISOTZoneObj> dict;
			if( indexByIso8601Idx.containsKey( key ) ) {
				dict = indexByIso8601Idx.get( key );
				int len = dict.size();
				IYCFSecISOTZoneObj arr[] = new IYCFSecISOTZoneObj[len];
				Iterator<IYCFSecISOTZoneObj> valIter = dict.values().iterator();
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
			IYCFSecISOTZoneObj obj;
			Iterator<IYCFSecISOTZoneObj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<IYCFSecISOTZoneObj> cmp = new Comparator<IYCFSecISOTZoneObj>() {
			public int compare( IYCFSecISOTZoneObj lhs, IYCFSecISOTZoneObj rhs ) {
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
					YCFSecISOTZonePKey lhsPKey = lhs.getPKey();
					YCFSecISOTZonePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public void deepDisposeISOTZoneByIdIdx( short ISOTZoneId )
	{
		IYCFSecISOTZoneObj obj = readCachedISOTZoneByIdIdx( ISOTZoneId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeISOTZoneByOffsetIdx( short TZHourOffset,
		short TZMinOffset )
	{
		final String S_ProcName = "deepDisposeISOTZoneByOffsetIdx";
		IYCFSecISOTZoneObj obj;
		List<IYCFSecISOTZoneObj> arrayList = readCachedISOTZoneByOffsetIdx( TZHourOffset,
				TZMinOffset );
		if( arrayList != null )  {
			Iterator<IYCFSecISOTZoneObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposeISOTZoneByUTZNameIdx( String TZName )
	{
		IYCFSecISOTZoneObj obj = readCachedISOTZoneByUTZNameIdx( TZName );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeISOTZoneByIso8601Idx( String Iso8601 )
	{
		final String S_ProcName = "deepDisposeISOTZoneByIso8601Idx";
		IYCFSecISOTZoneObj obj;
		List<IYCFSecISOTZoneObj> arrayList = readCachedISOTZoneByIso8601Idx( Iso8601 );
		if( arrayList != null )  {
			Iterator<IYCFSecISOTZoneObj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public IYCFSecISOTZoneObj updateISOTZone( IYCFSecISOTZoneObj Obj ) {
		IYCFSecISOTZoneObj obj = Obj;
		((IYCFSecSchema)schema.getBackingStore()).getTableISOTZone().updateISOTZone( schema.getAuthorization(),
			Obj.getISOTZoneBuff() );
		obj = (IYCFSecISOTZoneObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteISOTZone( IYCFSecISOTZoneObj Obj ) {
		IYCFSecISOTZoneObj obj = Obj;
		((IYCFSecSchema)schema.getBackingStore()).getTableISOTZone().deleteISOTZone( schema.getAuthorization(),
			obj.getISOTZoneBuff() );
		Obj.forget();
	}

	public void deleteISOTZoneByIdIdx( short ISOTZoneId )
	{
		YCFSecISOTZonePKey pkey = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOTZone().newPKey();
		pkey.setRequiredISOTZoneId( ISOTZoneId );
		IYCFSecISOTZoneObj obj = readISOTZone( pkey );
		if( obj != null ) {
			IYCFSecISOTZoneEditObj editObj = (IYCFSecISOTZoneEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFSecISOTZoneEditObj)obj.beginEdit();
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
		deepDisposeISOTZoneByIdIdx( ISOTZoneId );
	}

	public void deleteISOTZoneByOffsetIdx( short TZHourOffset,
		short TZMinOffset )
	{
		YCFSecISOTZoneByOffsetIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOTZone().newOffsetIdxKey();
		key.setRequiredTZHourOffset( TZHourOffset );
		key.setRequiredTZMinOffset( TZMinOffset );
		if( indexByOffsetIdx == null ) {
			indexByOffsetIdx = new HashMap< YCFSecISOTZoneByOffsetIdxKey,
				Map< YCFSecISOTZonePKey, IYCFSecISOTZoneObj > >();
		}
		if( indexByOffsetIdx.containsKey( key ) ) {
			Map<YCFSecISOTZonePKey, IYCFSecISOTZoneObj> dict = indexByOffsetIdx.get( key );
			((IYCFSecSchema)schema.getBackingStore()).getTableISOTZone().deleteISOTZoneByOffsetIdx( schema.getAuthorization(),
				TZHourOffset,
				TZMinOffset );
			Iterator<IYCFSecISOTZoneObj> iter = dict.values().iterator();
			IYCFSecISOTZoneObj obj;
			List<IYCFSecISOTZoneObj> toForget = new LinkedList<IYCFSecISOTZoneObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByOffsetIdx.remove( key );
		}
		else {
			((IYCFSecSchema)schema.getBackingStore()).getTableISOTZone().deleteISOTZoneByOffsetIdx( schema.getAuthorization(),
				TZHourOffset,
				TZMinOffset );
		}
		deepDisposeISOTZoneByOffsetIdx( TZHourOffset,
				TZMinOffset );
	}

	public void deleteISOTZoneByUTZNameIdx( String TZName )
	{
		if( indexByUTZNameIdx == null ) {
			indexByUTZNameIdx = new HashMap< YCFSecISOTZoneByUTZNameIdxKey,
				IYCFSecISOTZoneObj >();
		}
		YCFSecISOTZoneByUTZNameIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOTZone().newUTZNameIdxKey();
		key.setRequiredTZName( TZName );
		IYCFSecISOTZoneObj obj = null;
		if( indexByUTZNameIdx.containsKey( key ) ) {
			obj = indexByUTZNameIdx.get( key );
			((IYCFSecSchema)schema.getBackingStore()).getTableISOTZone().deleteISOTZoneByUTZNameIdx( schema.getAuthorization(),
				TZName );
			obj.forget();
		}
		else {
			((IYCFSecSchema)schema.getBackingStore()).getTableISOTZone().deleteISOTZoneByUTZNameIdx( schema.getAuthorization(),
				TZName );
		}
		deepDisposeISOTZoneByUTZNameIdx( TZName );
	}

	public void deleteISOTZoneByIso8601Idx( String Iso8601 )
	{
		YCFSecISOTZoneByIso8601IdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOTZone().newIso8601IdxKey();
		key.setRequiredIso8601( Iso8601 );
		if( indexByIso8601Idx == null ) {
			indexByIso8601Idx = new HashMap< YCFSecISOTZoneByIso8601IdxKey,
				Map< YCFSecISOTZonePKey, IYCFSecISOTZoneObj > >();
		}
		if( indexByIso8601Idx.containsKey( key ) ) {
			Map<YCFSecISOTZonePKey, IYCFSecISOTZoneObj> dict = indexByIso8601Idx.get( key );
			((IYCFSecSchema)schema.getBackingStore()).getTableISOTZone().deleteISOTZoneByIso8601Idx( schema.getAuthorization(),
				Iso8601 );
			Iterator<IYCFSecISOTZoneObj> iter = dict.values().iterator();
			IYCFSecISOTZoneObj obj;
			List<IYCFSecISOTZoneObj> toForget = new LinkedList<IYCFSecISOTZoneObj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByIso8601Idx.remove( key );
		}
		else {
			((IYCFSecSchema)schema.getBackingStore()).getTableISOTZone().deleteISOTZoneByIso8601Idx( schema.getAuthorization(),
				Iso8601 );
		}
		deepDisposeISOTZoneByIso8601Idx( Iso8601 );
	}
}
