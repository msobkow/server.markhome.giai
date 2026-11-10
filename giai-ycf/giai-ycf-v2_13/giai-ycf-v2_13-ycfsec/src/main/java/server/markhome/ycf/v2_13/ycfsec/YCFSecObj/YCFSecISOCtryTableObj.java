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

public class YCFSecISOCtryTableObj
	implements IYCFSecISOCtryTableObj
{
	protected IYCFSecSchemaObj schema;
	private Map<YCFSecISOCtryPKey, IYCFSecISOCtryObj> members;
	private Map<YCFSecISOCtryPKey, IYCFSecISOCtryObj> allISOCtry;
	private Map< YCFSecISOCtryByISOCodeIdxKey,
		IYCFSecISOCtryObj > indexByISOCodeIdx;
	private Map< YCFSecISOCtryByNameIdxKey,
		IYCFSecISOCtryObj > indexByNameIdx;
	public static String TABLE_NAME = "ISOCtry";
	public static String TABLE_DBNAME = "iso_cntry";

	public YCFSecISOCtryTableObj() {
		schema = null;
		members = new HashMap<YCFSecISOCtryPKey, IYCFSecISOCtryObj>();
		allISOCtry = null;
		indexByISOCodeIdx = null;
		indexByNameIdx = null;
	}

	public YCFSecISOCtryTableObj( IYCFSecSchemaObj argSchema ) {
		schema = (IYCFSecSchemaObj)argSchema;
		members = new HashMap<YCFSecISOCtryPKey, IYCFSecISOCtryObj>();
		allISOCtry = null;
		indexByISOCodeIdx = null;
		indexByNameIdx = null;
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
		allISOCtry = null;
		indexByISOCodeIdx = null;
		indexByNameIdx = null;
		List<IYCFSecISOCtryObj> toForget = new LinkedList<IYCFSecISOCtryObj>();
		IYCFSecISOCtryObj cur = null;
		Iterator<IYCFSecISOCtryObj> iter = members.values().iterator();
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
	 *	YCFSecISOCtryObj.
	 */
	public IYCFSecISOCtryObj newInstance() {
		IYCFSecISOCtryObj inst = new YCFSecISOCtryObj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	YCFSecISOCtryObj.
	 */
	public IYCFSecISOCtryEditObj newEditInstance( IYCFSecISOCtryObj orig ) {
		IYCFSecISOCtryEditObj edit = new YCFSecISOCtryEditObj( orig );
		return( edit );
	}

	public IYCFSecISOCtryObj realiseISOCtry( IYCFSecISOCtryObj Obj ) {
		IYCFSecISOCtryObj obj = Obj;
		YCFSecISOCtryPKey pkey = obj.getPKey();
		IYCFSecISOCtryObj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			IYCFSecISOCtryObj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByISOCodeIdx != null ) {
				YCFSecISOCtryByISOCodeIdxKey keyISOCodeIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtry().newISOCodeIdxKey();
				keyISOCodeIdx.setRequiredISOCode( keepObj.getRequiredISOCode() );
				indexByISOCodeIdx.remove( keyISOCodeIdx );
			}

			if( indexByNameIdx != null ) {
				YCFSecISOCtryByNameIdxKey keyNameIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtry().newNameIdxKey();
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.remove( keyNameIdx );
			}

			keepObj.setBuff( Obj.getBuff() );
			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByISOCodeIdx != null ) {
				YCFSecISOCtryByISOCodeIdxKey keyISOCodeIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtry().newISOCodeIdxKey();
				keyISOCodeIdx.setRequiredISOCode( keepObj.getRequiredISOCode() );
				indexByISOCodeIdx.put( keyISOCodeIdx, keepObj );
			}

			if( indexByNameIdx != null ) {
				YCFSecISOCtryByNameIdxKey keyNameIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtry().newNameIdxKey();
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

			if( allISOCtry != null ) {
				allISOCtry.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj.setIsNew( false );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allISOCtry != null ) {
				allISOCtry.put( keepObj.getPKey(), keepObj );
			}

			if( indexByISOCodeIdx != null ) {
				YCFSecISOCtryByISOCodeIdxKey keyISOCodeIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtry().newISOCodeIdxKey();
				keyISOCodeIdx.setRequiredISOCode( keepObj.getRequiredISOCode() );
				indexByISOCodeIdx.put( keyISOCodeIdx, keepObj );
			}

			if( indexByNameIdx != null ) {
				YCFSecISOCtryByNameIdxKey keyNameIdx =
					((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtry().newNameIdxKey();
				keyNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByNameIdx.put( keyNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public IYCFSecISOCtryObj createISOCtry( IYCFSecISOCtryObj Obj ) {
		IYCFSecISOCtryObj obj = Obj;
		YCFSecISOCtryBuff buff = obj.getISOCtryBuff();
		((IYCFSecSchema)schema.getBackingStore()).getTableISOCtry().createISOCtry(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		obj = obj.realise();
		obj.endEdit();
		return( obj );
	}

	public IYCFSecISOCtryObj readISOCtry( YCFSecISOCtryPKey pkey ) {
		return( readISOCtry( pkey, false ) );
	}

	public IYCFSecISOCtryObj readISOCtry( YCFSecISOCtryPKey pkey, boolean forceRead ) {
		IYCFSecISOCtryObj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			YCFSecISOCtryBuff readBuff = ((IYCFSecSchema)schema.getBackingStore()).getTableISOCtry().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredISOCtryId() );
			if( readBuff != null ) {
				obj = schema.getISOCtryTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtry().newPKey() );
				obj.setBuff( readBuff );
				obj = (IYCFSecISOCtryObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecISOCtryObj readCachedISOCtry( YCFSecISOCtryPKey pkey ) {
		IYCFSecISOCtryObj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposeISOCtry( IYCFSecISOCtryObj obj )
	{
		final String S_ProcName = "YCFSecISOCtryTableObj.reallyDeepDisposeISOCtry() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		YCFSecISOCtryPKey pkey = obj.getPKey();
		IYCFSecISOCtryObj existing = readCachedISOCtry( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		YCFSecISOCtryByISOCodeIdxKey keyISOCodeIdx = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtry().newISOCodeIdxKey();
		keyISOCodeIdx.setRequiredISOCode( existing.getRequiredISOCode() );

		YCFSecISOCtryByNameIdxKey keyNameIdx = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtry().newNameIdxKey();
		keyNameIdx.setRequiredName( existing.getRequiredName() );


					schema.getISOCtryLangTableObj().deepDisposeISOCtryLangByCtryIdx( existing.getRequiredISOCtryId() );
					schema.getISOCtryCcyTableObj().deepDisposeISOCtryCcyByCtryIdx( existing.getRequiredISOCtryId() );

		if( indexByISOCodeIdx != null ) {
			indexByISOCodeIdx.remove( keyISOCodeIdx );
		}

		if( indexByNameIdx != null ) {
			indexByNameIdx.remove( keyNameIdx );
		}


	}
	public void deepDisposeISOCtry( YCFSecISOCtryPKey pkey ) {
		IYCFSecISOCtryObj obj = readCachedISOCtry( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFSecISOCtryObj lockISOCtry( YCFSecISOCtryPKey pkey ) {
		IYCFSecISOCtryObj locked = null;
		YCFSecISOCtryBuff lockBuff = ((IYCFSecSchema)schema.getBackingStore()).getTableISOCtry().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = schema.getISOCtryTableObj().newInstance();
			locked.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtry().newPKey() );
			locked.setBuff( lockBuff );
			locked = (IYCFSecISOCtryObj)locked.realise();
		}
		else {
			throw new YCFLibCollisionDetectedException( getClass(), "lockISOCtry", pkey );
		}
		return( locked );
	}

	public List<IYCFSecISOCtryObj> readAllISOCtry() {
		return( readAllISOCtry( false ) );
	}

	public List<IYCFSecISOCtryObj> readAllISOCtry( boolean forceRead ) {
		final String S_ProcName = "readAllISOCtry";
		if( ( allISOCtry == null ) || forceRead ) {
			Map<YCFSecISOCtryPKey, IYCFSecISOCtryObj> map = new HashMap<YCFSecISOCtryPKey,IYCFSecISOCtryObj>();
			allISOCtry = map;
			YCFSecISOCtryBuff[] buffList = ((IYCFSecSchema)schema.getBackingStore()).getTableISOCtry().readAllDerived( schema.getAuthorization() );
			YCFSecISOCtryBuff buff;
			IYCFSecISOCtryObj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtry().newPKey() );
				obj.setBuff( buff );
				IYCFSecISOCtryObj realised = (IYCFSecISOCtryObj)obj.realise();
			}
		}
		int len = allISOCtry.size();
		IYCFSecISOCtryObj arr[] = new IYCFSecISOCtryObj[len];
		Iterator<IYCFSecISOCtryObj> valIter = allISOCtry.values().iterator();
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
		ArrayList<IYCFSecISOCtryObj> arrayList = new ArrayList<IYCFSecISOCtryObj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<IYCFSecISOCtryObj> cmp = new Comparator<IYCFSecISOCtryObj>() {
			public int compare( IYCFSecISOCtryObj lhs, IYCFSecISOCtryObj rhs ) {
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
					YCFSecISOCtryPKey lhsPKey = lhs.getPKey();
					YCFSecISOCtryPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<IYCFSecISOCtryObj> sortedList = arrayList;
		return( sortedList );
	}

	public List<IYCFSecISOCtryObj> readCachedAllISOCtry() {
		final String S_ProcName = "readCachedAllISOCtry";
		ArrayList<IYCFSecISOCtryObj> arrayList = new ArrayList<IYCFSecISOCtryObj>();
		if( allISOCtry != null ) {
			int len = allISOCtry.size();
			IYCFSecISOCtryObj arr[] = new IYCFSecISOCtryObj[len];
			Iterator<IYCFSecISOCtryObj> valIter = allISOCtry.values().iterator();
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
		Comparator<IYCFSecISOCtryObj> cmp = new Comparator<IYCFSecISOCtryObj>() {
			public int compare( IYCFSecISOCtryObj lhs, IYCFSecISOCtryObj rhs ) {
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
					YCFSecISOCtryPKey lhsPKey = lhs.getPKey();
					YCFSecISOCtryPKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public IYCFSecISOCtryObj readISOCtryByIdIdx( short ISOCtryId )
	{
		return( readISOCtryByIdIdx( ISOCtryId,
			false ) );
	}

	public IYCFSecISOCtryObj readISOCtryByIdIdx( short ISOCtryId, boolean forceRead )
	{
		YCFSecISOCtryPKey pkey = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtry().newPKey();
		pkey.setRequiredISOCtryId( ISOCtryId );
		IYCFSecISOCtryObj obj = readISOCtry( pkey, forceRead );
		return( obj );
	}

	public IYCFSecISOCtryObj readISOCtryByISOCodeIdx( String ISOCode )
	{
		return( readISOCtryByISOCodeIdx( ISOCode,
			false ) );
	}

	public IYCFSecISOCtryObj readISOCtryByISOCodeIdx( String ISOCode, boolean forceRead )
	{
		if( indexByISOCodeIdx == null ) {
			indexByISOCodeIdx = new HashMap< YCFSecISOCtryByISOCodeIdxKey,
				IYCFSecISOCtryObj >();
		}
		YCFSecISOCtryByISOCodeIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtry().newISOCodeIdxKey();
		key.setRequiredISOCode( ISOCode );
		IYCFSecISOCtryObj obj = null;
		if( ( ! forceRead ) && indexByISOCodeIdx.containsKey( key ) ) {
			obj = indexByISOCodeIdx.get( key );
		}
		else {
			YCFSecISOCtryBuff buff = ((IYCFSecSchema)schema.getBackingStore()).getTableISOCtry().readDerivedByISOCodeIdx( schema.getAuthorization(),
				ISOCode );
			if( buff != null ) {
				obj = schema.getISOCtryTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtry().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFSecISOCtryObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecISOCtryObj readISOCtryByNameIdx( String Name )
	{
		return( readISOCtryByNameIdx( Name,
			false ) );
	}

	public IYCFSecISOCtryObj readISOCtryByNameIdx( String Name, boolean forceRead )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< YCFSecISOCtryByNameIdxKey,
				IYCFSecISOCtryObj >();
		}
		YCFSecISOCtryByNameIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtry().newNameIdxKey();
		key.setRequiredName( Name );
		IYCFSecISOCtryObj obj = null;
		if( ( ! forceRead ) && indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
		}
		else {
			YCFSecISOCtryBuff buff = ((IYCFSecSchema)schema.getBackingStore()).getTableISOCtry().readDerivedByNameIdx( schema.getAuthorization(),
				Name );
			if( buff != null ) {
				obj = schema.getISOCtryTableObj().newInstance();
				obj.setPKey( ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtry().newPKey() );
				obj.setBuff( buff );
				obj = (IYCFSecISOCtryObj)obj.realise();
			}
		}
		return( obj );
	}

	public IYCFSecISOCtryObj readCachedISOCtryByIdIdx( short ISOCtryId )
	{
		IYCFSecISOCtryObj obj = null;
		YCFSecISOCtryPKey pkey = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtry().newPKey();
		pkey.setRequiredISOCtryId( ISOCtryId );
		obj = readCachedISOCtry( pkey );
		return( obj );
	}

	public IYCFSecISOCtryObj readCachedISOCtryByISOCodeIdx( String ISOCode )
	{
		IYCFSecISOCtryObj obj = null;
		YCFSecISOCtryByISOCodeIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtry().newISOCodeIdxKey();
		key.setRequiredISOCode( ISOCode );
		if( indexByISOCodeIdx != null ) {
			if( indexByISOCodeIdx.containsKey( key ) ) {
				obj = indexByISOCodeIdx.get( key );
			}
			else {
				Iterator<IYCFSecISOCtryObj> valIter = members.values().iterator();
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
			Iterator<IYCFSecISOCtryObj> valIter = members.values().iterator();
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

	public IYCFSecISOCtryObj readCachedISOCtryByNameIdx( String Name )
	{
		IYCFSecISOCtryObj obj = null;
		YCFSecISOCtryByNameIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtry().newNameIdxKey();
		key.setRequiredName( Name );
		if( indexByNameIdx != null ) {
			if( indexByNameIdx.containsKey( key ) ) {
				obj = indexByNameIdx.get( key );
			}
			else {
				Iterator<IYCFSecISOCtryObj> valIter = members.values().iterator();
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
			Iterator<IYCFSecISOCtryObj> valIter = members.values().iterator();
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

	public void deepDisposeISOCtryByIdIdx( short ISOCtryId )
	{
		IYCFSecISOCtryObj obj = readCachedISOCtryByIdIdx( ISOCtryId );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeISOCtryByISOCodeIdx( String ISOCode )
	{
		IYCFSecISOCtryObj obj = readCachedISOCtryByISOCodeIdx( ISOCode );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposeISOCtryByNameIdx( String Name )
	{
		IYCFSecISOCtryObj obj = readCachedISOCtryByNameIdx( Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public IYCFSecISOCtryObj updateISOCtry( IYCFSecISOCtryObj Obj ) {
		IYCFSecISOCtryObj obj = Obj;
		((IYCFSecSchema)schema.getBackingStore()).getTableISOCtry().updateISOCtry( schema.getAuthorization(),
			Obj.getISOCtryBuff() );
		obj = (IYCFSecISOCtryObj)Obj.realise();
		obj.endEdit();
		return( obj );
	}

	public void deleteISOCtry( IYCFSecISOCtryObj Obj ) {
		IYCFSecISOCtryObj obj = Obj;
		((IYCFSecSchema)schema.getBackingStore()).getTableISOCtry().deleteISOCtry( schema.getAuthorization(),
			obj.getISOCtryBuff() );
		Obj.forget();
	}

	public void deleteISOCtryByIdIdx( short ISOCtryId )
	{
		YCFSecISOCtryPKey pkey = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtry().newPKey();
		pkey.setRequiredISOCtryId( ISOCtryId );
		IYCFSecISOCtryObj obj = readISOCtry( pkey );
		if( obj != null ) {
			IYCFSecISOCtryEditObj editObj = (IYCFSecISOCtryEditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (IYCFSecISOCtryEditObj)obj.beginEdit();
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
		deepDisposeISOCtryByIdIdx( ISOCtryId );
	}

	public void deleteISOCtryByISOCodeIdx( String ISOCode )
	{
		if( indexByISOCodeIdx == null ) {
			indexByISOCodeIdx = new HashMap< YCFSecISOCtryByISOCodeIdxKey,
				IYCFSecISOCtryObj >();
		}
		YCFSecISOCtryByISOCodeIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtry().newISOCodeIdxKey();
		key.setRequiredISOCode( ISOCode );
		IYCFSecISOCtryObj obj = null;
		if( indexByISOCodeIdx.containsKey( key ) ) {
			obj = indexByISOCodeIdx.get( key );
			((IYCFSecSchema)schema.getBackingStore()).getTableISOCtry().deleteISOCtryByISOCodeIdx( schema.getAuthorization(),
				ISOCode );
			obj.forget();
		}
		else {
			((IYCFSecSchema)schema.getBackingStore()).getTableISOCtry().deleteISOCtryByISOCodeIdx( schema.getAuthorization(),
				ISOCode );
		}
		deepDisposeISOCtryByISOCodeIdx( ISOCode );
	}

	public void deleteISOCtryByNameIdx( String Name )
	{
		if( indexByNameIdx == null ) {
			indexByNameIdx = new HashMap< YCFSecISOCtryByNameIdxKey,
				IYCFSecISOCtryObj >();
		}
		YCFSecISOCtryByNameIdxKey key = ((IYCFSecSchema)schema.getBackingStore()).getFactoryISOCtry().newNameIdxKey();
		key.setRequiredName( Name );
		IYCFSecISOCtryObj obj = null;
		if( indexByNameIdx.containsKey( key ) ) {
			obj = indexByNameIdx.get( key );
			((IYCFSecSchema)schema.getBackingStore()).getTableISOCtry().deleteISOCtryByNameIdx( schema.getAuthorization(),
				Name );
			obj.forget();
		}
		else {
			((IYCFSecSchema)schema.getBackingStore()).getTableISOCtry().deleteISOCtryByNameIdx( schema.getAuthorization(),
				Name );
		}
		deepDisposeISOCtryByNameIdx( Name );
	}
}
